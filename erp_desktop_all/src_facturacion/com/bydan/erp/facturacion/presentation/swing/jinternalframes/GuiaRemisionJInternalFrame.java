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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.facturacion.util.GuiaRemisionConstantesFunciones;

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
public class GuiaRemisionJInternalFrame extends GuiaRemisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGuiaRemision;
	
	protected JMenuBar jmenuBarGuiaRemision;
	
	protected JMenu jmenuGuiaRemision;
	protected JMenu jmenuDatosGuiaRemision;
	protected JMenu jmenuArchivoGuiaRemision;
	protected JMenu jmenuAccionesGuiaRemision;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuiaRemision;	
	protected GridBagConstraints gridBagConstraintsGuiaRemision;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GuiaRemisionDetalleFormJInternalFrame jInternalFrameDetalleFormGuiaRemision;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGuiaRemision;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGuiaRemision;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CiudadBeanSwingJInternalFrame ciudadorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudadorigen="";

	protected CiudadBeanSwingJInternalFrame ciudaddestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudaddestino="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public GuiaRemisionSessionBean guiaremisionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CiudadSessionBean ciudadorigenSessionBean;
	public CiudadSessionBean ciudaddestinoSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GuiaRemision> guiaremisions;		
	public List<GuiaRemision> guiaremisionsEliminados;	
	public List<GuiaRemision> guiaremisionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGuiaRemision;		
	protected JButton jButtonAbrirOrderByGuiaRemision;
	
	
	//protected JPanel jPanelOrderByGuiaRemision;
	//public JScrollPane jScrollPanelOrderByGuiaRemision;	
	//protected JButton jButtonCerrarOrderByGuiaRemision;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GuiaRemisionLogic guiaremisionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGuiaRemision;
	public JScrollPane jScrollPanelDatosEdicionGuiaRemision;
	public JScrollPane jScrollPanelDatosGeneralGuiaRemision;
    
	
	
	//public JScrollPane jScrollPanelDatosGuiaRemisionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGuiaRemision;
	//public JScrollPane jScrollPanelImportacionGuiaRemision;
	
	
	
	protected JPanel jPanelAccionesGuiaRemision;
	
    protected JPanel jPanelPaginacionGuiaRemision;
    protected JPanel jPanelParametrosReportesGuiaRemision;
	protected JPanel jPanelParametrosReportesAccionesGuiaRemision;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalGuiaRemision;
	protected Integer iXPanelCamposFintotalGuiaRemision=0;
	protected Integer iYPanelCamposFintotalGuiaRemision=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GuiaRemision;
	protected JPanel jPanelParametrosAuxiliar2GuiaRemision;
	protected JPanel jPanelParametrosAuxiliar3GuiaRemision;
	protected JPanel jPanelParametrosAuxiliar4GuiaRemision;
	//protected JPanel jPanelParametrosAuxiliar5GuiaRemision;
	
	
	
	//protected JPanel jPanelReporteDinamicoGuiaRemision;
	//protected JPanel jPanelImportacionGuiaRemision;
	
	
	public JTable jTableDatosGuiaRemision;
	
	
	
	//public JTable jTableDatosGuiaRemisionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGuiaRemision;
	protected JButton jButtonDuplicarGuiaRemision;
	protected JButton jButtonCopiarGuiaRemision;
	protected JButton jButtonVerFormGuiaRemision;
	protected JButton jButtonNuevoRelacionesGuiaRemision;
	protected JButton jButtonModificarGuiaRemision;
	
    protected JButton jButtonGuardarCambiosTablaGuiaRemision;
	protected JButton jButtonCerrarGuiaRemision;
	
	
	protected JButton jButtonRecargarInformacionGuiaRemision;
	protected JButton jButtonProcesarInformacionGuiaRemision;
	
	
	protected JButton jButtonAnterioresGuiaRemision;
	protected JButton jButtonSiguientesGuiaRemision;
	protected JButton jButtonNuevoGuardarCambiosGuiaRemision;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGuiaRemision;
	//protected JButton jButtonCerrarReporteDinamicoGuiaRemision;
	//protected JButton jButtonGenerarExcelReporteDinamicoGuiaRemision;	
	
	
	
	//protected JButton jButtonAbrirImportacionGuiaRemision;
	//protected JButton jButtonGenerarImportacionGuiaRemision;
	//protected JButton jButtonCerrarImportacionGuiaRemision;
	//protected JFileChooser jFileChooserImportacionGuiaRemision;
	//protected File fileImportacionGuiaRemision;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuiaRemision;
	protected JButton jButtonDuplicarToolBarGuiaRemision;
	protected JButton jButtonNuevoRelacionesToolBarGuiaRemision;
	
	
	public JButton jButtonGuardarCambiosToolBarGuiaRemision;
	protected JButton jButtonCopiarToolBarGuiaRemision;
	protected JButton jButtonVerFormToolBarGuiaRemision;
	public JButton jButtonGuardarCambiosTablaToolBarGuiaRemision;
	protected JButton jButtonMostrarOcultarTablaToolBarGuiaRemision;
	protected JButton jButtonCerrarToolBarGuiaRemision;
	
	protected JButton jButtonRecargarInformacionToolBarGuiaRemision;
	protected JButton jButtonProcesarInformacionToolBarGuiaRemision;
	protected JButton jButtonAnterioresToolBarGuiaRemision;
	protected JButton jButtonSiguientesToolBarGuiaRemision;
	protected JButton jButtonNuevoGuardarCambiosToolBarGuiaRemision;
	protected JButton jButtonAbrirOrderByToolBarGuiaRemision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuiaRemision;
	protected JMenuItem jMenuItemDuplicarGuiaRemision;
	protected JMenuItem jMenuItemNuevoRelacionesGuiaRemision;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGuiaRemision;
	protected JMenuItem jMenuItemCopiarGuiaRemision;
	protected JMenuItem jMenuItemVerFormGuiaRemision;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuiaRemision;
	protected JMenuItem jMenuItemCerrarGuiaRemision;
	protected JMenuItem jMenuItemDetalleCerrarGuiaRemision;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGuiaRemision;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuiaRemision;
	
	protected JMenuItem jMenuItemRecargarInformacionGuiaRemision;
	protected JMenuItem jMenuItemProcesarInformacionGuiaRemision;
	protected JMenuItem jMenuItemAnterioresGuiaRemision;
	protected JMenuItem jMenuItemSiguientesGuiaRemision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuiaRemision;
	protected JMenuItem jMenuItemAbrirOrderByGuiaRemision;
	protected JMenuItem jMenuItemMostrarOcultarGuiaRemision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuiaRemision;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGuiaRemision;
	protected JCheckBox jCheckBoxSeleccionadosGuiaRemision;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGuiaRemision;
	protected JCheckBox jCheckBoxConGraficoReporteGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGuiaRemision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGuiaRemision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGuiaRemision;
	protected JTextField jTextFieldValorCampoGeneralGuiaRemision;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGuiaRemision;
	//public JList<Reporte> jListColumnasSelectReporteGuiaRemision;
	//public JScrollPane jScrollColumnasSelectReporteGuiaRemision;
	
	//public JLabel jLabelRelacionesSelectReporteGuiaRemision;
	//public JList<Reporte> jListRelacionesSelectReporteGuiaRemision;
	//public JScrollPane jScrollRelacionesSelectReporteGuiaRemision;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGuiaRemision;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGuiaRemision;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGuiaRemision;
	//public JLabel jLabelTiposArchivoReporteDinamicoGuiaRemision;
	
		
	//public JLabel jLabelArchivoImportacionGuiaRemision;	
	//public JLabel jLabelPathArchivoImportacionGuiaRemision;
	//protected JTextField jTextFieldPathArchivoImportacionGuiaRemision;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGuiaRemision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGuiaRemision;
	
	//public JLabel jLabelColumnaCategoriaValorGuiaRemision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGuiaRemision;
	
	//public JLabel jLabelColumnasValoresGraficoGuiaRemision;
	//public JList<Reporte> jListColumnasValoresGraficoGuiaRemision;
	//public JScrollPane jScrollColumnasValoresGraficoGuiaRemision;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGuiaRemision;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGuiaRemision;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGuiaRemision;
	public JPanel jPanelFK_IdCiudadDestinoGuiaRemision;
	public JButton jButtonFK_IdCiudadDestinoGuiaRemision;
	public JPanel jPanelFK_IdCiudadOrigenGuiaRemision;
	public JButton jButtonFK_IdCiudadOrigenGuiaRemision;
	public JPanel jPanelFK_IdClienteGuiaRemision;
	public JButton jButtonFK_IdClienteGuiaRemision;
	public JPanel jPanelFK_IdConsultorGuiaRemision;
	public JButton jButtonFK_IdConsultorGuiaRemision;
	public JPanel jPanelFK_IdEmpleadoGuiaRemision;
	public JButton jButtonFK_IdEmpleadoGuiaRemision;
	public JPanel jPanelFK_IdFacturaGuiaRemision;
	public JButton jButtonFK_IdFacturaGuiaRemision;
	public JPanel jPanelFK_IdFormatoGuiaRemision;
	public JButton jButtonFK_IdFormatoGuiaRemision;
	public JPanel jPanelFK_IdSubClienteGuiaRemision;
	public JButton jButtonFK_IdSubClienteGuiaRemision;
	public JPanel jPanelFK_IdTipoCambioGuiaRemision;
	public JButton jButtonFK_IdTipoCambioGuiaRemision;
	public JPanel jPanelFK_IdTipoLlamadaGuiaRemision;
	public JButton jButtonFK_IdTipoLlamadaGuiaRemision;
	public JPanel jPanelFK_IdTipoPrecioGuiaRemision;
	public JButton jButtonFK_IdTipoPrecioGuiaRemision;
	public JPanel jPanelFK_IdTransporteGuiaRemision;
	public JButton jButtonFK_IdTransporteGuiaRemision;
	public JPanel jPanelFK_IdTransportistaGuiaRemision;
	public JButton jButtonFK_IdTransportistaGuiaRemision;
	public JPanel jPanelFK_IdVendedorGuiaRemision;
	public JButton jButtonFK_IdVendedorGuiaRemision;
	
	public JPanel jPanelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision;
	public JLabel jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision;
	public JButton jButtonid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision= new JButtonMe();
	public JButton jButtonid_ciudad_destinoFK_IdCiudadDestinoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ciudad_destinoFK_IdCiudadDestinoGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision;
	public JLabel jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision;
	public JButton jButtonid_ciudad_origenFK_IdCiudadOrigenGuiaRemision= new JButtonMe();
	public JButton jButtonid_ciudad_origenFK_IdCiudadOrigenGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ciudad_origenFK_IdCiudadOrigenGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteGuiaRemision;
	public JLabel jLabelid_clienteFK_IdClienteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteGuiaRemision;
	public JButton jButtonid_clienteFK_IdClienteGuiaRemision= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteGuiaRemisionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteGuiaRemision;
	
	public JPanel jPanelid_consultorFK_IdConsultorGuiaRemision;
	public JLabel jLabelid_consultorFK_IdConsultorGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorFK_IdConsultorGuiaRemision;
	public JButton jButtonid_consultorFK_IdConsultorGuiaRemision= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoGuiaRemision;
	public JLabel jLabelid_empleadoFK_IdEmpleadoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision;
	public JButton jButtonid_empleadoFK_IdEmpleadoGuiaRemision= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaGuiaRemision;
	public JLabel jLabelid_facturaFK_IdFacturaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaGuiaRemision;
	public JButton jButtonid_facturaFK_IdFacturaGuiaRemision= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaGuiaRemisionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaGuiaRemision;
	
	public JPanel jPanelid_formatoFK_IdFormatoGuiaRemision;
	public JLabel jLabelid_formatoFK_IdFormatoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoGuiaRemision;
	public JButton jButtonid_formatoFK_IdFormatoGuiaRemision= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClienteGuiaRemision;
	public JLabel jLabelid_sub_clienteFK_IdSubClienteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision;
	public JButton jButtonid_sub_clienteFK_IdSubClienteGuiaRemision= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioGuiaRemision;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioGuiaRemisionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision;
	
	public JPanel jPanelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision;
	public JLabel jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision;
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioGuiaRemision;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransporteGuiaRemision;
	public JLabel jLabelid_transporteFK_IdTransporteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransporteGuiaRemision;
	public JButton jButtonid_transporteFK_IdTransporteGuiaRemision= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaGuiaRemision;
	public JLabel jLabelid_transportistaFK_IdTransportistaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaGuiaRemision;
	public JButton jButtonid_transportistaFK_IdTransportistaGuiaRemision= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorGuiaRemision;
	public JLabel jLabelid_vendedorFK_IdVendedorGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorGuiaRemision;
	public JButton jButtonid_vendedorFK_IdVendedorGuiaRemision= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorGuiaRemisionBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorGuiaRemisionArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=1415;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GuiaRemisionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGuiaRemision)	{
		this.jButtonRecargarInformacionGuiaRemision = jButtonRecargarInformacionGuiaRemision;
	}
	
	public JButton getjButtonProcesarInformacionGuiaRemision() {
		return this.jButtonProcesarInformacionGuiaRemision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuiaRemision)	{
		this.jButtonProcesarInformacionGuiaRemision = jButtonProcesarInformacionGuiaRemision;
	}
	
	
	public JButton getjButtonRecargarInformacionGuiaRemision() {
		return this.jButtonRecargarInformacionGuiaRemision;
	}
	
	
	public List<GuiaRemision> getguiaremisions() {
		return this.guiaremisions;
	}

	public void setguiaremisions(List<GuiaRemision> guiaremisions) {
		this.guiaremisions = guiaremisions;
	}
	
	public List<GuiaRemision> getguiaremisionsAux() {
		return this.guiaremisionsAux;
	}

	public void setguiaremisionsAux(List<GuiaRemision> guiaremisionsAux) {
		this.guiaremisionsAux = guiaremisionsAux;
	}
	
	public List<GuiaRemision> getguiaremisionsEliminados() {
		return this.guiaremisionsEliminados;
	}

	public void setGuiaRemisionsEliminados(List<GuiaRemision> guiaremisionsEliminados) {
		this.guiaremisionsEliminados = guiaremisionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGuiaRemision() {
		return jComboBoxTiposSeleccionarGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGuiaRemision(
			JComboBox jComboBoxTiposSeleccionarGuiaRemision) {
		this.jComboBoxTiposSeleccionarGuiaRemision = jComboBoxTiposSeleccionarGuiaRemision;
	}
	
	public void setBorderResaltarTiposSeleccionarGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGuiaRemision .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGuiaRemision() {
		return jTextFieldValorCampoGeneralGuiaRemision;
	}

	public void setjTextFieldValorCampoGeneralGuiaRemision(
			JTextField jTextFieldValorCampoGeneralGuiaRemision) {
		this.jTextFieldValorCampoGeneralGuiaRemision = jTextFieldValorCampoGeneralGuiaRemision;
	}

	public void setBorderResaltarValorCampoGeneralGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGuiaRemision .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGuiaRemision() {
		return this.jCheckBoxSeleccionarTodosGuiaRemision;
	}

	public void setjCheckBoxSeleccionarTodosGuiaRemision(
			JCheckBox jCheckBoxSeleccionarTodosGuiaRemision) {
		this.jCheckBoxSeleccionarTodosGuiaRemision = jCheckBoxSeleccionarTodosGuiaRemision;
	}

	public void setBorderResaltarSeleccionarTodosGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGuiaRemision .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGuiaRemision() {
		return this.jCheckBoxSeleccionadosGuiaRemision;
	}

	public void setjCheckBoxSeleccionadosGuiaRemision(
			JCheckBox jCheckBoxSeleccionadosGuiaRemision) {
		this.jCheckBoxSeleccionadosGuiaRemision = jCheckBoxSeleccionadosGuiaRemision;
	}
	
	public void setBorderResaltarSeleccionadosGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGuiaRemision .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGuiaRemision() {
		return this.jComboBoxTiposArchivosReportesGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGuiaRemision(
			JComboBox jComboBoxTiposArchivosReportesGuiaRemision) {
		this.jComboBoxTiposArchivosReportesGuiaRemision = jComboBoxTiposArchivosReportesGuiaRemision;
	}

	public void setBorderResaltarTiposArchivosReportesGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGuiaRemision() {
		return this.jComboBoxTiposReportesGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGuiaRemision(
			JComboBox jComboBoxTiposReportesGuiaRemision) {
		this.jComboBoxTiposReportesGuiaRemision = jComboBoxTiposReportesGuiaRemision;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGuiaRemision() {
	//	return jComboBoxTiposReportesDinamicoGuiaRemision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGuiaRemision(
	//		JComboBox jComboBoxTiposReportesDinamicoGuiaRemision) {
	//	this.jComboBoxTiposReportesDinamicoGuiaRemision = jComboBoxTiposReportesDinamicoGuiaRemision;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGuiaRemision() {
	//	return jComboBoxTiposArchivosReportesDinamicoGuiaRemision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGuiaRemision(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGuiaRemision) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision = jComboBoxTiposArchivosReportesDinamicoGuiaRemision;
	//}
	
	public void setBorderResaltarTiposReportesGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGuiaRemision() {
		return this.jComboBoxTiposGraficosReportesGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGuiaRemision(
			JComboBox jComboBoxTiposGraficosReportesGuiaRemision) {
		this.jComboBoxTiposGraficosReportesGuiaRemision = jComboBoxTiposGraficosReportesGuiaRemision;
	}
	
	public void setBorderResaltarTiposGraficosReportesGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGuiaRemision() {
		return this.jComboBoxTiposPaginacionGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGuiaRemision(
			JComboBox jComboBoxTiposPaginacionGuiaRemision) {
		this.jComboBoxTiposPaginacionGuiaRemision = jComboBoxTiposPaginacionGuiaRemision;
	}
	
	public void setBorderResaltarTiposPaginacionGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGuiaRemision() {
		return this.jComboBoxTiposRelacionesGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuiaRemision() {
		return this.jComboBoxTiposAccionesGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuiaRemision(
			JComboBox jComboBoxTiposRelacionesGuiaRemision) {
		this.jComboBoxTiposRelacionesGuiaRemision = jComboBoxTiposRelacionesGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuiaRemision(
			JComboBox jComboBoxTiposAccionesGuiaRemision) {
		this.jComboBoxTiposAccionesGuiaRemision = jComboBoxTiposAccionesGuiaRemision;
	}
	
	public void setBorderResaltarTiposRelacionesGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGuiaRemision .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGuiaRemision .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGuiaRemision() {
	//	return jCheckBoxConGraficoDinamicoGuiaRemision;
	//}

	//public void setjCheckBoxConGraficoDinamicoGuiaRemision(
	//		JCheckBox jCheckBoxConGraficoDinamicoGuiaRemision) {
	//	this.jCheckBoxConGraficoDinamicoGuiaRemision = jCheckBoxConGraficoDinamicoGuiaRemision;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGuiaRemision() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGuiaRemision.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGuiaRemision .setBorder(borderResaltar);		
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
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		
		this.guiaremisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guiaremisionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuiaRemisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guia Remision MANTENIMIENTO"));
		
		
		if(iWidth > 3950) {
			iWidth=3950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
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
		
		GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGuiaRemision= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"nuevo","nuevo","Nuevo"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"duplicar","duplicar","Duplicar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"copiar","copiar","Copiar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"ver_form","ver_form","Ver"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"recargar","recargar","Recargar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGuiaRemision,this.jTtoolBarGuiaRemision,
							"cerrar","cerrar","Salir"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGuiaRemision=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGuiaRemision;
			
				this.jButtonProcesarInformacionToolBarGuiaRemision=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGuiaRemision;
				
		//protected JButton jButtonModificarToolBarGuiaRemision;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGuiaRemision=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGuiaRemision=new JMenuMe("General");
		this.jmenuArchivoGuiaRemision=new JMenuMe("Archivo");
		this.jmenuAccionesGuiaRemision=new JMenuMe("Acciones");
		this.jmenuDatosGuiaRemision=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuiaRemision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuiaRemision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuiaRemision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGuiaRemision= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGuiaRemision.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGuiaRemision,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGuiaRemision= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGuiaRemision.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGuiaRemision,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGuiaRemision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuiaRemision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuiaRemision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGuiaRemision= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGuiaRemision.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGuiaRemision,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGuiaRemision= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGuiaRemision.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGuiaRemision,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGuiaRemision= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGuiaRemision.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGuiaRemision,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGuiaRemision= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGuiaRemision.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGuiaRemision,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGuiaRemision= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGuiaRemision.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGuiaRemision,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGuiaRemision= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGuiaRemision.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGuiaRemision,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGuiaRemision= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGuiaRemision.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGuiaRemision,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGuiaRemision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGuiaRemision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGuiaRemision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGuiaRemision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGuiaRemision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGuiaRemision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGuiaRemision= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGuiaRemision.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGuiaRemision,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGuiaRemision.add(this.jMenuItemCerrarGuiaRemision);
			
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemNuevoGuiaRemision);
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemNuevoGuardarCambiosGuiaRemision);
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemNuevoRelacionesGuiaRemision);
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemGuardarCambiosTablaGuiaRemision);		
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemDuplicarGuiaRemision);		
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemCopiarGuiaRemision);		
			this.jmenuAccionesGuiaRemision.add(this.jMenuItemVerFormGuiaRemision);		
			
			this.jmenuDatosGuiaRemision.add(this.jMenuItemRecargarInformacionGuiaRemision);				
			this.jmenuDatosGuiaRemision.add(this.jMenuItemAnterioresGuiaRemision);				
			this.jmenuDatosGuiaRemision.add(this.jMenuItemSiguientesGuiaRemision);				
			this.jmenuDatosGuiaRemision.add(this.jMenuItemAbrirOrderByGuiaRemision);				
			this.jmenuDatosGuiaRemision.add(this.jMenuItemMostrarOcultarGuiaRemision);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGuiaRemision.add(this.jMenuItemGuardarCambiosGuiaRemision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGuiaRemision.add(this.jmenuArchivoGuiaRemision);		
			this.jmenuBarGuiaRemision.add(this.jmenuAccionesGuiaRemision);		
			this.jmenuBarGuiaRemision.add(this.jmenuDatosGuiaRemision);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGuiaRemision);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGuiaRemision() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadDestinoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadDestinoGuiaRemision.setToolTipText("Buscar Por Ciudad Destino ");
		this.jButtonFK_IdCiudadDestinoGuiaRemision= new JButtonMe();
		this.jButtonFK_IdCiudadDestinoGuiaRemision.setText("Buscar");
		this.jButtonFK_IdCiudadDestinoGuiaRemision.setToolTipText("Buscar Por Ciudad Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadDestinoGuiaRemision,"buscar_button","Buscar Por Ciudad Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadDestinoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision = new JLabelMe();
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setText("Ciudad Destino :");
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setToolTipText("Ciudad Destino");
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision= new JComboBoxMe();
		jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCiudadOrigenGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadOrigenGuiaRemision.setToolTipText("Buscar Por Ciudad Origen ");
		this.jButtonFK_IdCiudadOrigenGuiaRemision= new JButtonMe();
		this.jButtonFK_IdCiudadOrigenGuiaRemision.setText("Buscar");
		this.jButtonFK_IdCiudadOrigenGuiaRemision.setToolTipText("Buscar Por Ciudad Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadOrigenGuiaRemision,"buscar_button","Buscar Por Ciudad Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadOrigenGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision = new JLabelMe();
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setText("Ciudad Origen :");
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setToolTipText("Ciudad Origen");
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision= new JComboBoxMe();
		jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteGuiaRemision.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteGuiaRemision= new JButtonMe();
		this.jButtonFK_IdClienteGuiaRemision.setText("Buscar");
		this.jButtonFK_IdClienteGuiaRemision.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteGuiaRemision,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteGuiaRemision = new JLabelMe();
		jLabelid_clienteFK_IdClienteGuiaRemision.setText("Cliente :");
		jLabelid_clienteFK_IdClienteGuiaRemision.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteGuiaRemision= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision.setFocusable(false);

		this.jPanelFK_IdConsultorGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsultorGuiaRemision.setToolTipText("Buscar Por Consultor ");
		this.jButtonFK_IdConsultorGuiaRemision= new JButtonMe();
		this.jButtonFK_IdConsultorGuiaRemision.setText("Buscar");
		this.jButtonFK_IdConsultorGuiaRemision.setToolTipText("Buscar Por Consultor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsultorGuiaRemision,"buscar_button","Buscar Por Consultor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsultorGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consultorFK_IdConsultorGuiaRemision = new JLabelMe();
		jLabelid_consultorFK_IdConsultorGuiaRemision.setText("Consultor :");
		jLabelid_consultorFK_IdConsultorGuiaRemision.setToolTipText("Consultor");
		jLabelid_consultorFK_IdConsultorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consultorFK_IdConsultorGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consultorFK_IdConsultorGuiaRemision= new JComboBoxMe();
		jComboBoxid_consultorFK_IdConsultorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorFK_IdConsultorGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoGuiaRemision.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoGuiaRemision= new JButtonMe();
		this.jButtonFK_IdEmpleadoGuiaRemision.setText("Buscar");
		this.jButtonFK_IdEmpleadoGuiaRemision.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoGuiaRemision,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaGuiaRemision.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaGuiaRemision= new JButtonMe();
		this.jButtonFK_IdFacturaGuiaRemision.setText("Buscar");
		this.jButtonFK_IdFacturaGuiaRemision.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaGuiaRemision,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaGuiaRemision = new JLabelMe();
		jLabelid_facturaFK_IdFacturaGuiaRemision.setText("Factura :");
		jLabelid_facturaFK_IdFacturaGuiaRemision.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaGuiaRemision= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision.setFocusable(false);

		this.jPanelFK_IdFormatoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoGuiaRemision.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoGuiaRemision= new JButtonMe();
		this.jButtonFK_IdFormatoGuiaRemision.setText("Buscar");
		this.jButtonFK_IdFormatoGuiaRemision.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoGuiaRemision,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoGuiaRemision = new JLabelMe();
		jLabelid_formatoFK_IdFormatoGuiaRemision.setText("Formato :");
		jLabelid_formatoFK_IdFormatoGuiaRemision.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoGuiaRemision= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClienteGuiaRemision.setToolTipText("Buscar Por Sub Cliente ");
		this.jButtonFK_IdSubClienteGuiaRemision= new JButtonMe();
		this.jButtonFK_IdSubClienteGuiaRemision.setText("Buscar");
		this.jButtonFK_IdSubClienteGuiaRemision.setToolTipText("Buscar Por Sub Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClienteGuiaRemision,"buscar_button","Buscar Por Sub Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClienteGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision.setText("Sub Cliente :");
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision.setToolTipText("Sub Cliente");
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioGuiaRemision.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioGuiaRemision= new JButtonMe();
		this.jButtonFK_IdTipoCambioGuiaRemision.setText("Buscar");
		this.jButtonFK_IdTipoCambioGuiaRemision.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioGuiaRemision,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision.setFocusable(false);

		this.jPanelFK_IdTipoLlamadaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoLlamadaGuiaRemision.setToolTipText("Buscar Por Tipo Llamada ");
		this.jButtonFK_IdTipoLlamadaGuiaRemision= new JButtonMe();
		this.jButtonFK_IdTipoLlamadaGuiaRemision.setText("Buscar");
		this.jButtonFK_IdTipoLlamadaGuiaRemision.setToolTipText("Buscar Por Tipo Llamada ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoLlamadaGuiaRemision,"buscar_button","Buscar Por Tipo Llamada ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoLlamadaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision = new JLabelMe();
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setText("Tipo Llamada :");
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setToolTipText("Tipo Llamada");
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioGuiaRemision.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioGuiaRemision= new JButtonMe();
		this.jButtonFK_IdTipoPrecioGuiaRemision.setText("Buscar");
		this.jButtonFK_IdTipoPrecioGuiaRemision.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioGuiaRemision,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransporteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransporteGuiaRemision.setToolTipText("Buscar Por Transporte ");
		this.jButtonFK_IdTransporteGuiaRemision= new JButtonMe();
		this.jButtonFK_IdTransporteGuiaRemision.setText("Buscar");
		this.jButtonFK_IdTransporteGuiaRemision.setToolTipText("Buscar Por Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransporteGuiaRemision,"buscar_button","Buscar Por Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransporteGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransporteGuiaRemision = new JLabelMe();
		jLabelid_transporteFK_IdTransporteGuiaRemision.setText("Transporte :");
		jLabelid_transporteFK_IdTransporteGuiaRemision.setToolTipText("Transporte");
		jLabelid_transporteFK_IdTransporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransporteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransporteGuiaRemision= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransporteGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaGuiaRemision.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaGuiaRemision= new JButtonMe();
		this.jButtonFK_IdTransportistaGuiaRemision.setText("Buscar");
		this.jButtonFK_IdTransportistaGuiaRemision.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaGuiaRemision,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaGuiaRemision = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaGuiaRemision.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaGuiaRemision.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaGuiaRemision= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorGuiaRemision.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorGuiaRemision= new JButtonMe();
		this.jButtonFK_IdVendedorGuiaRemision.setText("Buscar");
		this.jButtonFK_IdVendedorGuiaRemision.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorGuiaRemision,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorGuiaRemision = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorGuiaRemision.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorGuiaRemision.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorGuiaRemision= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGuiaRemision=new JTabbedPane();


		this.jTabbedPaneBusquedasGuiaRemision.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasGuiaRemision.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasGuiaRemision.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGuiaRemision = new GuiaRemisionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Guia Remision DATOS");
			this.jInternalFrameDetalleFormGuiaRemision = new GuiaRemisionDetalleFormJInternalFrame(jDesktopPane,this.guiaremisionSessionBean.getConGuardarRelaciones(),this.guiaremisionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGuiaRemision = null;//new GuiaRemisionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuiaRemision= new GridBagLayout();
		
		
		this.jTableDatosGuiaRemision = new JTableMe();      
		
		String sToolTipGuiaRemision="";
		sToolTipGuiaRemision=GuiaRemisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuiaRemision+="(Facturacion.GuiaRemision)";
		}
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuiaRemision+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGuiaRemision.setToolTipText(sToolTipGuiaRemision);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGuiaRemision);
		this.jTableDatosGuiaRemision.setAutoCreateRowSorter(true);
		this.jTableDatosGuiaRemision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGuiaRemision.setRowSelectionAllowed(true);
		this.jTableDatosGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGuiaRemision = new JButtonMe();
		this.jButtonDuplicarGuiaRemision = new JButtonMe();
		this.jButtonCopiarGuiaRemision = new JButtonMe();
		this.jButtonVerFormGuiaRemision = new JButtonMe();
		this.jButtonNuevoRelacionesGuiaRemision = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGuiaRemision = new JButtonMe();
		this.jButtonCerrarGuiaRemision = new JButtonMe();
		
		this.jScrollPanelDatosGuiaRemision = new JScrollPane();   
        this.jScrollPanelDatosGeneralGuiaRemision = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Guia Remision";
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesGuiaRemision.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalGuiaRemision.setName("jPanelCamposFintotalGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoGuiaRemision=new ReporteDinamicoJInternalFrame(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGuiaRemision();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGuiaRemision=new ImportacionJInternalFrame(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGuiaRemision();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGuiaRemision = new JButtonMe();
		
		this.jButtonAbrirOrderByGuiaRemision.setText("Orden");
		this.jButtonAbrirOrderByGuiaRemision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuiaRemision,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuiaRemision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiaRemision,false,this);
			
			//this.cargarOrderByGuiaRemision(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuiaRemision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiaRemision,true,this);
			
			//this.cargarOrderByGuiaRemision(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGuiaRemision.setMinimumSize(new Dimension(400,50));//3930
		this.jTableDatosGuiaRemision.setMaximumSize(new Dimension(400,50));//3930
		this.jTableDatosGuiaRemision.setPreferredSize(new Dimension(400,50));//3930
		
		this.jScrollPanelDatosGuiaRemision.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuiaRemision.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuiaRemision.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGuiaRemision.setText("Nuevo");
		this.jButtonDuplicarGuiaRemision.setText("Duplicar");
		this.jButtonCopiarGuiaRemision.setText("Copiar");
		this.jButtonVerFormGuiaRemision.setText("Ver");
		this.jButtonNuevoRelacionesGuiaRemision.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGuiaRemision.setText("Guardar");
		this.jButtonCerrarGuiaRemision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuiaRemision,"nuevo_button","Nuevo",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGuiaRemision,"duplicar_button","Duplicar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGuiaRemision,"copiar_button","Copiar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGuiaRemision,"ver_form","Ver",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGuiaRemision,"nuevorelaciones_button","Nuevo Rel",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuiaRemision,"guardarcambiostabla_button","Guardar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuiaRemision,"cerrar_button","Salir",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGuiaRemision.setToolTipText("Nuevo"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGuiaRemision.setToolTipText("Duplicar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGuiaRemision.setToolTipText("Copiar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGuiaRemision.setToolTipText("Ver"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGuiaRemision.setToolTipText("Nuevo Rel"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGuiaRemision.setToolTipText("Guardar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuiaRemision.setToolTipText("Salir"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuiaRemision";
		inputMap = this.jButtonNuevoGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuiaRemision"));
		
		//DUPLICAR
		sMapKey = "DuplicarGuiaRemision";
		inputMap = this.jButtonDuplicarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGuiaRemision"));
		
		//COPIAR
		sMapKey = "CopiarGuiaRemision";
		inputMap = this.jButtonCopiarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGuiaRemision"));
		
		//VEr FORM
		sMapKey = "VerFormGuiaRemision";
		inputMap = this.jButtonVerFormGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGuiaRemision"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGuiaRemision";
		inputMap = this.jButtonNuevoRelacionesGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGuiaRemision"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGuiaRemision";
		inputMap = this.jButtonModificarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGuiaRemision"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGuiaRemision";
		inputMap = this.jButtonCerrarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuiaRemision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuiaRemision";
		inputMap = this.jButtonGuardarCambiosTablaGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuiaRemision"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGuiaRemision.setName("jPanelParametrosReportesGuiaRemision"); 
		
		this.jPanelParametrosReportesAccionesGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGuiaRemision.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGuiaRemision.setName("jPanelParametrosReportesAccionesGuiaRemision"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGuiaRemision = new JButtonMe();
		this.jButtonRecargarInformacionGuiaRemision.setText("Recargar");
		this.jButtonRecargarInformacionGuiaRemision.setToolTipText("Recargar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGuiaRemision,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGuiaRemision = new JButtonMe();
		this.jButtonProcesarInformacionGuiaRemision.setText("Procesar");
		this.jButtonProcesarInformacionGuiaRemision.setToolTipText("Procesar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGuiaRemision.setVisible(false);
			
		this.jButtonProcesarInformacionGuiaRemision.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuiaRemision.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuiaRemision.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGuiaRemision.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposReportesGuiaRemision.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGuiaRemision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGuiaRemision.setText("Paginacion");
		this.jComboBoxTiposPaginacionGuiaRemision.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGuiaRemision.setText("Accion");
		this.jComboBoxTiposRelacionesGuiaRemision.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuiaRemision.setText("Accion");
		this.jComboBoxTiposAccionesGuiaRemision.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGuiaRemision.setText("Accion");
		this.jComboBoxTiposSeleccionarGuiaRemision.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGuiaRemision=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGuiaRemision.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuiaRemision.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuiaRemision.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGuiaRemision = new JLabelMe();
		
		this.jLabelAccionesGuiaRemision.setText("Acciones");		
		this.jLabelAccionesGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGuiaRemision.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGuiaRemision.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGuiaRemision = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGuiaRemision.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGuiaRemision.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGuiaRemision = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGuiaRemision.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGuiaRemision.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGuiaRemision.setText("Graf.");
		this.jCheckBoxConGraficoReporteGuiaRemision.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGuiaRemision = new JButtonMe();
		//this.jButtonAnterioresGuiaRemision.setText("<<");
        this.jButtonAnterioresGuiaRemision.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGuiaRemision,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGuiaRemision = new JButtonMe();
		//this.jButtonSiguientesGuiaRemision.setText(">>");
        this.jButtonSiguientesGuiaRemision.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGuiaRemision,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGuiaRemision = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGuiaRemision.setText("Nue");
        this.jButtonNuevoGuardarCambiosGuiaRemision.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGuiaRemision,"nuevoguardarcambios_button","Nue",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGuiaRemision";
		inputMap = this.jButtonNuevoGuardarCambiosGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGuiaRemision"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGuiaRemision";
		inputMap = this.jButtonRecargarInformacionGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGuiaRemision"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGuiaRemision";
		inputMap = this.jButtonSiguientesGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGuiaRemision"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGuiaRemision";
		inputMap = this.jButtonAnterioresGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGuiaRemision"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGuiaRemision();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGuiaRemision.setMinimumSize(new Dimension(this.getWidth(),GuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuiaRemision.setMaximumSize(new Dimension(this.getWidth(),GuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuiaRemision.setPreferredSize(new Dimension(this.getWidth(),GuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGuiaRemision = new GridBagLayout();

			this.jPanelPaginacionGuiaRemision.setLayout(gridaBagLayoutPaginacionGuiaRemision);						
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = 0;
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGuiaRemision.add(this.jButtonAnterioresGuiaRemision, this.gridBagConstraintsGuiaRemision);
					
						
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsGuiaRemision.gridy = 0;//
			
			this.jPanelPaginacionGuiaRemision.add(this.jButtonNuevoGuardarCambiosGuiaRemision, this.gridBagConstraintsGuiaRemision);//
						
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGuiaRemision.gridy = 0;
			this.jPanelPaginacionGuiaRemision.add(this.jButtonSiguientesGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsGuiaRemision.gridy = 1;//
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionGuiaRemision.add(this.jButtonNuevoGuiaRemision, this.gridBagConstraintsGuiaRemision);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
				this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGuiaRemision.gridy = 1;
				this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGuiaRemision.add(this.jButtonNuevoRelacionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
			}
			
			
			if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
				this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsGuiaRemision.gridy = 1;//
				this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionGuiaRemision.add(this.jButtonGuardarCambiosTablaGuiaRemision, this.gridBagConstraintsGuiaRemision);//
			}
			
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsGuiaRemision.gridy = 1;//
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionGuiaRemision.add(this.jButtonDuplicarGuiaRemision, this.gridBagConstraintsGuiaRemision);//
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsGuiaRemision.gridy = 1;//
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionGuiaRemision.add(this.jButtonCopiarGuiaRemision, this.gridBagConstraintsGuiaRemision);//
		
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();//
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsGuiaRemision.gridy = 1;//
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionGuiaRemision.add(this.jButtonVerFormGuiaRemision, this.gridBagConstraintsGuiaRemision);//
		
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = 1;
			this.gridBagConstraintsGuiaRemision.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGuiaRemision.add(this.jButtonCerrarGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		
		this.jButtonRecargarInformacionGuiaRemision.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuiaRemision.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuiaRemision.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGuiaRemision.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuiaRemision.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuiaRemision.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGuiaRemision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuiaRemision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuiaRemision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGuiaRemision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuiaRemision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuiaRemision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGuiaRemision.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuiaRemision.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuiaRemision.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGuiaRemision.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuiaRemision.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuiaRemision.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGuiaRemision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuiaRemision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuiaRemision.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGuiaRemision.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuiaRemision.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuiaRemision.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGuiaRemision = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GuiaRemision = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGuiaRemision.setLayout(gridaBagParametrosReportesGuiaRemision);
			this.jPanelParametrosReportesAccionesGuiaRemision.setLayout(gridaBagParametrosReportesAccionesGuiaRemision);
			
			
			this.jPanelParametrosAuxiliar1GuiaRemision.setLayout(gridaBagParametrosAuxiliar1GuiaRemision);
			this.jPanelParametrosAuxiliar2GuiaRemision.setLayout(gridaBagParametrosAuxiliar2GuiaRemision);
			this.jPanelParametrosAuxiliar3GuiaRemision.setLayout(gridaBagParametrosAuxiliar3GuiaRemision);
			this.jPanelParametrosAuxiliar4GuiaRemision.setLayout(gridaBagParametrosAuxiliar4GuiaRemision);
			//this.jPanelParametrosAuxiliar5GuiaRemision.setLayout(gridaBagParametrosAuxiliar2GuiaRemision);			
			
			
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiaRemision.add(this.jButtonRecargarInformacionGuiaRemision, this.gridBagConstraintsGuiaRemision);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiaRemision.add(this.jComboBoxTiposPaginacionGuiaRemision, this.gridBagConstraintsGuiaRemision);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiaRemision.add(this.jCheckBoxConAltoMaximoTablaGuiaRemision, this.gridBagConstraintsGuiaRemision);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiaRemision.add(this.jComboBoxTiposArchivosReportesGuiaRemision, this.gridBagConstraintsGuiaRemision);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiaRemision.add(this.jPanelParametrosAuxiliar1GuiaRemision, this.gridBagConstraintsGuiaRemision);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GuiaRemision.add(this.jComboBoxTiposReportesGuiaRemision, this.gridBagConstraintsGuiaRemision);																		
			
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GuiaRemision.add(this.jComboBoxTiposGraficosReportesGuiaRemision, this.gridBagConstraintsGuiaRemision);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiaRemision.add(this.jPanelParametrosAuxiliar4GuiaRemision, this.gridBagConstraintsGuiaRemision);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiaRemision.add(this.jComboBoxTiposReportesGuiaRemision, this.gridBagConstraintsGuiaRemision);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiaRemision.add(this.jCheckBoxGenerarReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiaRemision.add(this.jPanelParametrosAuxiliar2GuiaRemision, this.gridBagConstraintsGuiaRemision);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiaRemision.add(this.jLabelAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
				this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGuiaRemision.add(this.jButtonAbrirOrderByGuiaRemision, this.gridBagConstraintsGuiaRemision);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiaRemision.add(this.jComboBoxTiposSeleccionarGuiaRemision, this.gridBagConstraintsGuiaRemision);			
			
			
			/*
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiaRemision.add(this.jCheckBoxSeleccionarTodosGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiaRemision.add(this.jCheckBoxConGraficoReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiaRemision.add(this.jCheckBoxSeleccionarTodosGuiaRemision, this.gridBagConstraintsGuiaRemision);															
				
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiaRemision.add(this.jCheckBoxSeleccionadosGuiaRemision, this.gridBagConstraintsGuiaRemision);															
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiaRemision.add(this.jCheckBoxConGraficoReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiaRemision.add(this.jPanelParametrosAuxiliar3GuiaRemision, this.gridBagConstraintsGuiaRemision);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiaRemision.add(this.jComboBoxTiposRelacionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
				
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiaRemision.add(this.jComboBoxTiposAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
	
				
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiaRemision.add(this.jTextFieldValorCampoGeneralGuiaRemision, this.gridBagConstraintsGuiaRemision);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalGuiaRemision= new GridBagLayout();
		this.jPanelCamposFintotalGuiaRemision.setLayout(gridaBagLayoutCamposFintotalGuiaRemision);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGuiaRemision = new GridBagLayout();

			this.jScrollPanelDatosGuiaRemision.setLayout(gridaBagLayoutDatosGuiaRemision);
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = 0;
			this.gridBagConstraintsGuiaRemision.gridx = 0;
			
			this.jScrollPanelDatosGuiaRemision.add(this.jTableDatosGuiaRemision, this.gridBagConstraintsGuiaRemision);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGuiaRemision.setViewportView(this.jTableDatosGuiaRemision);
		this.jTableDatosGuiaRemision.setFillsViewportHeight(true);
		this.jTableDatosGuiaRemision.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGuiaRemision= new GridBagLayout();
		this.jPanelAccionesGuiaRemision.setLayout(gridaBagLayoutAccionesGuiaRemision);
		
		
		/*	
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 0;
			
		this.jPanelAccionesGuiaRemision.add(this.jButtonNuevoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadDestinoGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadDestinoGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadDestinoGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadDestinoGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadDestinoGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadDestinoGuiaRemision.setLayout(gridaBagLayoutFK_IdCiudadDestinoGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdCiudadDestinoGuiaRemision.add(jLabelid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdCiudadDestinoGuiaRemision.add(jComboBoxid_ciudad_destinoFK_IdCiudadDestinoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdCiudadDestinoGuiaRemision.add(jButtonFK_IdCiudadDestinoGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("1.-Por Ciudad Destino ", jPanelFK_IdCiudadDestinoGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCiudadOrigenGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadOrigenGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadOrigenGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadOrigenGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadOrigenGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadOrigenGuiaRemision.setLayout(gridaBagLayoutFK_IdCiudadOrigenGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdCiudadOrigenGuiaRemision.add(jLabelid_ciudad_origenFK_IdCiudadOrigenGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdCiudadOrigenGuiaRemision.add(jComboBoxid_ciudad_origenFK_IdCiudadOrigenGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdCiudadOrigenGuiaRemision.add(jButtonFK_IdCiudadOrigenGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("2.-Por Ciudad Origen ", jPanelFK_IdCiudadOrigenGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClienteGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdClienteGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteGuiaRemision.setLayout(gridaBagLayoutFK_IdClienteGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdClienteGuiaRemision.add(jLabelid_clienteFK_IdClienteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdClienteGuiaRemision.add(jComboBoxid_clienteFK_IdClienteGuiaRemision, gridBagConstraintsGuiaRemision);


		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdClienteGuiaRemision.add(this.jButtonBuscarFK_IdClienteid_clienteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdClienteGuiaRemision.add(jButtonFK_IdClienteGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("3.-Por Cliente ", jPanelFK_IdClienteGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdConsultorGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdConsultorGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsultorGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsultorGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsultorGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsultorGuiaRemision.setLayout(gridaBagLayoutFK_IdConsultorGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdConsultorGuiaRemision.add(jLabelid_consultorFK_IdConsultorGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdConsultorGuiaRemision.add(jComboBoxid_consultorFK_IdConsultorGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdConsultorGuiaRemision.add(jButtonFK_IdConsultorGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("4.-Por Consultor ", jPanelFK_IdConsultorGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoGuiaRemision.setLayout(gridaBagLayoutFK_IdEmpleadoGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdEmpleadoGuiaRemision.add(jLabelid_empleadoFK_IdEmpleadoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdEmpleadoGuiaRemision.add(jComboBoxid_empleadoFK_IdEmpleadoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdEmpleadoGuiaRemision.add(jButtonFK_IdEmpleadoGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("5.-Por Empleado ", jPanelFK_IdEmpleadoGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFacturaGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaGuiaRemision.setLayout(gridaBagLayoutFK_IdFacturaGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdFacturaGuiaRemision.add(jLabelid_facturaFK_IdFacturaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdFacturaGuiaRemision.add(jComboBoxid_facturaFK_IdFacturaGuiaRemision, gridBagConstraintsGuiaRemision);


		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdFacturaGuiaRemision.add(this.jButtonBuscarFK_IdFacturaid_facturaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdFacturaGuiaRemision.add(jButtonFK_IdFacturaGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("6.-Por Factura ", jPanelFK_IdFacturaGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormatoGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoGuiaRemision.setLayout(gridaBagLayoutFK_IdFormatoGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdFormatoGuiaRemision.add(jLabelid_formatoFK_IdFormatoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdFormatoGuiaRemision.add(jComboBoxid_formatoFK_IdFormatoGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdFormatoGuiaRemision.add(jButtonFK_IdFormatoGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("7.-Por Formato ", jPanelFK_IdFormatoGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdSubClienteGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdSubClienteGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClienteGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClienteGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClienteGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClienteGuiaRemision.setLayout(gridaBagLayoutFK_IdSubClienteGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdSubClienteGuiaRemision.add(jLabelid_sub_clienteFK_IdSubClienteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdSubClienteGuiaRemision.add(jComboBoxid_sub_clienteFK_IdSubClienteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdSubClienteGuiaRemision.add(jButtonFK_IdSubClienteGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("8.-Por Sub Cliente ", jPanelFK_IdSubClienteGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioGuiaRemision.setLayout(gridaBagLayoutFK_IdTipoCambioGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTipoCambioGuiaRemision.add(jLabelid_tipo_cambioFK_IdTipoCambioGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdTipoCambioGuiaRemision.add(jComboBoxid_tipo_cambioFK_IdTipoCambioGuiaRemision, gridBagConstraintsGuiaRemision);


		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTipoCambioGuiaRemision.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdTipoCambioGuiaRemision.add(jButtonFK_IdTipoCambioGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("9.-Por Tipo Cambio ", jPanelFK_IdTipoCambioGuiaRemision);
		jTabbedPaneBusquedasGuiaRemision.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoLlamadaGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdTipoLlamadaGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoLlamadaGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoLlamadaGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoLlamadaGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoLlamadaGuiaRemision.setLayout(gridaBagLayoutFK_IdTipoLlamadaGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTipoLlamadaGuiaRemision.add(jLabelid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdTipoLlamadaGuiaRemision.add(jComboBoxid_tipo_llamadaFK_IdTipoLlamadaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdTipoLlamadaGuiaRemision.add(jButtonFK_IdTipoLlamadaGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("10.-Por Tipo Llamada ", jPanelFK_IdTipoLlamadaGuiaRemision);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioGuiaRemision.setLayout(gridaBagLayoutFK_IdTipoPrecioGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTipoPrecioGuiaRemision.add(jLabelid_tipo_precioFK_IdTipoPrecioGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdTipoPrecioGuiaRemision.add(jComboBoxid_tipo_precioFK_IdTipoPrecioGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdTipoPrecioGuiaRemision.add(jButtonFK_IdTipoPrecioGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("11.-Por Tipo Precio ", jPanelFK_IdTipoPrecioGuiaRemision);

		GridBagLayout gridaBagLayoutFK_IdTransporteGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdTransporteGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransporteGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransporteGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransporteGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransporteGuiaRemision.setLayout(gridaBagLayoutFK_IdTransporteGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTransporteGuiaRemision.add(jLabelid_transporteFK_IdTransporteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdTransporteGuiaRemision.add(jComboBoxid_transporteFK_IdTransporteGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdTransporteGuiaRemision.add(jButtonFK_IdTransporteGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("12.-Por Transporte ", jPanelFK_IdTransporteGuiaRemision);

		GridBagLayout gridaBagLayoutFK_IdTransportistaGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaGuiaRemision.setLayout(gridaBagLayoutFK_IdTransportistaGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdTransportistaGuiaRemision.add(jLabelid_transportistaFK_IdTransportistaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdTransportistaGuiaRemision.add(jComboBoxid_transportistaFK_IdTransportistaGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdTransportistaGuiaRemision.add(jButtonFK_IdTransportistaGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("13.-Por Transportista ", jPanelFK_IdTransportistaGuiaRemision);

		GridBagLayout gridaBagLayoutFK_IdVendedorGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorGuiaRemision.setLayout(gridaBagLayoutFK_IdVendedorGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 0;
		jPanelFK_IdVendedorGuiaRemision.add(jLabelid_vendedorFK_IdVendedorGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 0;
		gridBagConstraintsGuiaRemision.gridx = 1;
		jPanelFK_IdVendedorGuiaRemision.add(jComboBoxid_vendedorFK_IdVendedorGuiaRemision, gridBagConstraintsGuiaRemision);

		gridBagConstraintsGuiaRemision = new GridBagConstraints();
		gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiaRemision.gridy = 1;
		gridBagConstraintsGuiaRemision.gridx =1;
		jPanelFK_IdVendedorGuiaRemision.add(jButtonFK_IdVendedorGuiaRemision, gridBagConstraintsGuiaRemision);

		jTabbedPaneBusquedasGuiaRemision.addTab("14.-Por Vendedor ", jPanelFK_IdVendedorGuiaRemision);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuiaRemision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuiaRemision);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guiaremisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();						
			this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiaRemision.gridx = 0;		
			//this.gridBagConstraintsGuiaRemision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuiaRemision.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGuiaRemision, this.gridBagConstraintsGuiaRemision);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGuiaRemision.gridx = 0;		
		//this.gridBagConstraintsGuiaRemision.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGuiaRemision.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGuiaRemision);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiaRemision.gridx = 0;		
			this.gridBagConstraintsGuiaRemision.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGuiaRemision.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGuiaRemision, this.gridBagConstraintsGuiaRemision);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGuiaRemision, this.gridBagConstraintsGuiaRemision);								
		
		
		/*
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
		*/		
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuiaRemision.gridx =0;
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuiaRemision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuiaRemision, this.gridBagConstraintsGuiaRemision);
				
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGuiaRemision, this.gridBagConstraintsGuiaRemision);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GuiaRemisionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuiaRemision = new GridBagLayout();
			this.jPanelBusquedasParametrosGuiaRemision.setLayout(gridaBagLayoutBusquedasParametrosGuiaRemision);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGuiaRemision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGuiaRemision;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGuiaRemision() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGuiaRemision = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGuiaRemision.setName("jPanelReporteDinamicoGuiaRemision"); 
		
		this.jPanelReporteDinamicoGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGuiaRemision.setLayout(gridaBagLayoutReporteDinamicoGuiaRemision);
		
		
		this.jInternalFrameReporteDinamicoGuiaRemision= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGuiaRemision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuiaRemision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGuiaRemision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGuiaRemision.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGuiaRemision.setResizable(true);
	    this.jInternalFrameReporteDinamicoGuiaRemision.setClosable(true);
	    this.jInternalFrameReporteDinamicoGuiaRemision.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGuiaRemision = new JLabelMe();

		this.jLabelColumnasSelectReporteGuiaRemision.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelColumnasSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGuiaRemision = new JList<Reporte>();
		this.jListColumnasSelectReporteGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGuiaRemision.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGuiaRemision=new JScrollPane(this.jListColumnasSelectReporteGuiaRemision);
			
			this.jScrollColumnasSelectReporteGuiaRemision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuiaRemision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuiaRemision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGuiaRemision.add(this.jListColumnasSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		this.jPanelReporteDinamicoGuiaRemision.add(this.jScrollColumnasSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGuiaRemision = new JLabelMe();

		this.jLabelRelacionesSelectReporteGuiaRemision.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelRelacionesSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGuiaRemision = new JList<Reporte>();
		this.jListRelacionesSelectReporteGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGuiaRemision.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGuiaRemision=new JScrollPane(this.jListRelacionesSelectReporteGuiaRemision);
			
			this.jScrollRelacionesSelectReporteGuiaRemision.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuiaRemision.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuiaRemision.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGuiaRemision.add(this.jListRelacionesSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		this.jPanelReporteDinamicoGuiaRemision.add(this.jScrollRelacionesSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGuiaRemision = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGuiaRemision = new JComboBoxMe();
		this.jListColumnasValoresGraficoGuiaRemision = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGuiaRemision = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGuiaRemision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGuiaRemision = new JLabelMe();

		this.jLabelConGraficoDinamicoGuiaRemision.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelConGraficoDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGuiaRemision.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGuiaRemision.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGuiaRemision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuiaRemision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuiaRemision.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jCheckBoxConGraficoDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGuiaRemision = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGuiaRemision.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelColumnaCategoriaGraficoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGuiaRemision.add(this.jComboBoxColumnaCategoriaGraficoGuiaRemision, this.gridBagConstraintsGuiaRemision);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGuiaRemision = new JLabelMe();

		this.jLabelColumnaCategoriaValorGuiaRemision.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelColumnaCategoriaValorGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGuiaRemision.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGuiaRemision.add(this.jComboBoxColumnaCategoriaValorGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGuiaRemision = new JLabelMe();

		this.jLabelColumnasValoresGraficoGuiaRemision.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelColumnasValoresGraficoGuiaRemision, this.gridBagConstraintsGuiaRemision);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGuiaRemision = new JList<Reporte>();
		this.jListColumnasValoresGraficoGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGuiaRemision.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGuiaRemision=new JScrollPane(this.jListColumnasValoresGraficoGuiaRemision);
			
			this.jScrollColumnasValoresGraficoGuiaRemision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuiaRemision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuiaRemision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGuiaRemision.add(this.jListColumnasSelectReporteGuiaRemision, this.gridBagConstraintsGuiaRemision);
		this.jPanelReporteDinamicoGuiaRemision.add(this.jScrollColumnasValoresGraficoGuiaRemision, this.gridBagConstraintsGuiaRemision);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGuiaRemision = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGuiaRemision.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelTiposGraficosReportesDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuiaRemision.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jComboBoxTiposGraficosReportesDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGuiaRemision = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGuiaRemision.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelGenerarExcelReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGuiaRemision = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGuiaRemision.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGuiaRemision,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGuiaRemision.setToolTipText("Generar EXCEL"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGuiaRemision.add(this.jButtonGenerarExcelReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiaRemision.add(this.jComboBoxTiposReportesDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGuiaRemision = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGuiaRemision.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiaRemision.add(this.jLabelTiposArchivoReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiaRemision.add(this.jComboBoxTiposArchivosReportesDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGuiaRemision = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGuiaRemision.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGuiaRemision,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGuiaRemision.setToolTipText("Generar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiaRemision.add(this.jButtonGenerarReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGuiaRemision = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGuiaRemision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGuiaRemision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGuiaRemision.setToolTipText("Cancelar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiaRemision.add(this.jButtonCerrarReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGuiaRemision = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGuiaRemision= new JScrollPane(jPanelReporteDinamicoGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGuiaRemision.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGuiaRemision.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGuiaRemision);
		this.jInternalFrameReporteDinamicoGuiaRemision.getContentPane().add(this.jScrollPanelReporteDinamicoGuiaRemision, this.gridBagConstraintsGuiaRemision);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGuiaRemision() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGuiaRemision = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGuiaRemision.setName("jPanelImportacionGuiaRemision"); 
		
		this.jPanelImportacionGuiaRemision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuiaRemision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuiaRemision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGuiaRemision.setLayout(gridaBagLayoutImportacionGuiaRemision);
		
		
		this.jInternalFrameImportacionGuiaRemision= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGuiaRemision= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGuiaRemision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuiaRemision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuiaRemision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGuiaRemision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuiaRemision.setResizable(true);
	    this.jInternalFrameImportacionGuiaRemision.setClosable(true);
	    this.jInternalFrameImportacionGuiaRemision.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuiaRemision.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGuiaRemision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuiaRemision.setResizable(true);
	    this.jInternalFrameImportacionGuiaRemision.setClosable(true);
	    this.jInternalFrameImportacionGuiaRemision.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGuiaRemision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuiaRemision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuiaRemision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGuiaRemision = new JLabelMe();

		this.jLabelArchivoImportacionGuiaRemision.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuiaRemision.add(this.jLabelArchivoImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGuiaRemision = new JFileChooser();		
		this.jFileChooserImportacionGuiaRemision.setToolTipText("ESCOGER ARCHIVO"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGuiaRemision = new JButtonMe();
		this.jButtonAbrirImportacionGuiaRemision.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGuiaRemision,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGuiaRemision.setToolTipText("Generar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiaRemision.add(this.jButtonAbrirImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGuiaRemision = new JLabelMe();

		this.jLabelPathArchivoImportacionGuiaRemision.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuiaRemision.add(this.jLabelPathArchivoImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGuiaRemision=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGuiaRemision.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuiaRemision.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuiaRemision.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiaRemision.add(this.jTextFieldPathArchivoImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGuiaRemision = new JButtonMe();
		this.jButtonGenerarImportacionGuiaRemision.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGuiaRemision,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGuiaRemision.setToolTipText("Generar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiaRemision.add(this.jButtonGenerarImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGuiaRemision = new JButtonMe();
		this.jButtonCerrarImportacionGuiaRemision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGuiaRemision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGuiaRemision.setToolTipText("Cancelar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiaRemision.add(this.jButtonCerrarImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGuiaRemision = new GridBagLayout();
		
		this.jScrollPanelImportacionGuiaRemision= new JScrollPane(jPanelImportacionGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iPosYImportacion;
		this.gridBagConstraintsGuiaRemision.gridx =iPosXImportacion;
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGuiaRemision.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGuiaRemision);
		this.jInternalFrameImportacionGuiaRemision.getContentPane().add(this.jScrollPanelImportacionGuiaRemision, this.gridBagConstraintsGuiaRemision);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGuiaRemision(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGuiaRemision = new JButtonMe();
			this.jButtonAbrirOrderByGuiaRemision.setText("Orden");
			this.jButtonAbrirOrderByGuiaRemision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuiaRemision,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGuiaRemision";
			inputMap = this.jButtonAbrirOrderByGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGuiaRemision"));
		
		
			GridBagLayout gridaBagLayoutOrderByGuiaRemision = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGuiaRemision.setName("jPanelOrderByGuiaRemision"); 
			
			this.jPanelOrderByGuiaRemision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuiaRemision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuiaRemision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGuiaRemision.setLayout(gridaBagLayoutOrderByGuiaRemision);
			
			
			this.jTableDatosGuiaRemisionOrderBy = new JTableMe();        
			this.jTableDatosGuiaRemisionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGuiaRemisionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGuiaRemisionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGuiaRemisionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGuiaRemisionOrderBy.setViewportView(this.jTableDatosGuiaRemisionOrderBy);
			this.jTableDatosGuiaRemisionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGuiaRemisionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGuiaRemision= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGuiaRemision= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGuiaRemision = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGuiaRemision= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGuiaRemision.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGuiaRemision.setTitle("Orden");
			this.jInternalFrameOrderByGuiaRemision.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGuiaRemision.setResizable(true);
			this.jInternalFrameOrderByGuiaRemision.setClosable(true);
			this.jInternalFrameOrderByGuiaRemision.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGuiaRemision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuiaRemision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuiaRemision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGuiaRemision.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGuiaRemision.ipady =150;
				
			this.jPanelOrderByGuiaRemision.add(jScrollPanelDatosGuiaRemisionOrderBy, this.gridBagConstraintsGuiaRemision);//this.jTableDatosGuiaRemisionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGuiaRemision = new JButtonMe();
			this.jButtonCerrarOrderByGuiaRemision.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGuiaRemision,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGuiaRemision.setToolTipText("Cancelar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGuiaRemision.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGuiaRemision.add(this.jButtonCerrarOrderByGuiaRemision, this.gridBagConstraintsGuiaRemision);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGuiaRemision = new GridBagLayout();
			
			this.jScrollPanelOrderByGuiaRemision= new JScrollPane(jPanelOrderByGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy =iPosYOrderBy;
			this.gridBagConstraintsGuiaRemision.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGuiaRemision.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGuiaRemision);
			
			this.jInternalFrameOrderByGuiaRemision.getContentPane().add(this.jScrollPanelOrderByGuiaRemision, this.gridBagConstraintsGuiaRemision);			
		
		} else {
			this.jButtonAbrirOrderByGuiaRemision = new JButtonMe();
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
		int iWidthTableCalculado=0;//9430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.guiaremisionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGuiaRemision.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGuiaRemision.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGuiaRemision.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGuiaRemision.getRowHeight();//GuiaRemisionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuiaRemision.isSelected()) {
					iHeightTable=GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuiaRemision.isSelected()) {
					iHeightTable=GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGuiaRemision.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuiaRemision.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuiaRemision.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGuiaRemision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuiaRemision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuiaRemision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGuiaRemision!=null && this.jInternalFrameOrderByGuiaRemision.getjTableDatosOrderBy()!=null) {
			//if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGuiaRemision.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGuiaRemision.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGuiaRemision.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGuiaRemision.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGuiaRemision.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGuiaRemision.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGuiaRemision.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGuiaRemision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuiaRemision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuiaRemision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=guiaremisionLogic.getGuiaRemisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guiaremisions.size();
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
	public static List<GuiaRemision> TraerGuiaRemisionBeans(List<GuiaRemision> guiaremisions,ArrayList<Classe> classes)throws Exception {
		try {
			for(GuiaRemision guiaremision:guiaremisions) {
					
				if(!(GuiaRemisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GuiaRemisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					guiaremision.setsDetalleGeneralEntityReporte(GuiaRemisionConstantesFunciones.getGuiaRemisionDescripcion(guiaremision));
										
						
					
					

					if(guiaremision.getDetalleGuiaRemisions()!=null && Funciones.existeClass(classes,DetalleGuiaRemision.class)) {
						try{guiaremision.setdetalleguiaremisionsDescripcionReporte(new JRBeanCollectionDataSource(DetalleGuiaRemisionJInternalFrame.TraerDetalleGuiaRemisionBeans(guiaremision.getDetalleGuiaRemisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//guiaremision.setsDetalleGeneralEntityReporte(guiaremision.getsDetalleGeneralEntityReporte());
										
				}
				
				//guiaremisionbeans.add(guiaremisionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return guiaremisions;
    }
	//PARA REPORTES FIN
}
