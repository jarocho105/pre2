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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
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
import com.bydan.erp.inventario.util.ParametroCompraConstantesFunciones;

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
public class ParametroCompraJInternalFrame extends ParametroCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroCompra;
	
	protected JMenuBar jmenuBarParametroCompra;
	
	protected JMenu jmenuParametroCompra;
	protected JMenu jmenuDatosParametroCompra;
	protected JMenu jmenuArchivoParametroCompra;
	protected JMenu jmenuAccionesParametroCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCompra;	
	protected GridBagConstraints gridBagConstraintsParametroCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroCompraDetalleFormJInternalFrame jInternalFrameDetalleFormParametroCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegareservaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegareserva="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_embarcador="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidopendienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidopendiente="";

	protected FormatoBeanSwingJInternalFrame formatocotizacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatocotizacion="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidocotizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocotizado="";

	protected FormatoBeanSwingJInternalFrame formatoautorizacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoautorizacion="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoautorizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoautorizado="";

	protected FormatoBeanSwingJInternalFrame formatoitemBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoitem="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoanuladoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoanulado="";

	protected PrioridadPedidoBeanSwingJInternalFrame prioridadpedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prioridadpedido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidosuspendidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidosuspendido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoregularizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoregularizado="";
	
	public ParametroCompraSessionBean parametrocompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegareservaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmbarcadorSessionBean embarcadorSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public EstadoPedidoSessionBean estadopedidopendienteSessionBean;
	public FormatoSessionBean formatocotizacionSessionBean;
	public EstadoPedidoSessionBean estadopedidocotizadoSessionBean;
	public FormatoSessionBean formatoautorizacionSessionBean;
	public EstadoPedidoSessionBean estadopedidoautorizadoSessionBean;
	public FormatoSessionBean formatoitemSessionBean;
	public EstadoPedidoSessionBean estadopedidoanuladoSessionBean;
	public PrioridadPedidoSessionBean prioridadpedidoSessionBean;
	public EstadoPedidoSessionBean estadopedidosuspendidoSessionBean;
	public EstadoPedidoSessionBean estadopedidoregularizadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroCompra> parametrocompras;		
	public List<ParametroCompra> parametrocomprasEliminados;	
	public List<ParametroCompra> parametrocomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroCompra;		
	protected JButton jButtonAbrirOrderByParametroCompra;
	
	
	//protected JPanel jPanelOrderByParametroCompra;
	//public JScrollPane jScrollPanelOrderByParametroCompra;	
	//protected JButton jButtonCerrarOrderByParametroCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroCompraLogic parametrocompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroCompra;
	public JScrollPane jScrollPanelDatosEdicionParametroCompra;
	public JScrollPane jScrollPanelDatosGeneralParametroCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroCompra;
	//public JScrollPane jScrollPanelImportacionParametroCompra;
	
	
	
	protected JPanel jPanelAccionesParametroCompra;
	
    protected JPanel jPanelPaginacionParametroCompra;
    protected JPanel jPanelParametrosReportesParametroCompra;
	protected JPanel jPanelParametrosReportesAccionesParametroCompra;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroCompra;
	protected Integer iXPanelCamposIniciogeneralParametroCompra=0;
	protected Integer iYPanelCamposIniciogeneralParametroCompra=0;

	protected JPanel jPanelCamposInicioformato_estadoParametroCompra;
	protected Integer iXPanelCamposInicioformato_estadoParametroCompra=0;
	protected Integer iYPanelCamposInicioformato_estadoParametroCompra=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroCompra;
	protected JPanel jPanelParametrosAuxiliar2ParametroCompra;
	protected JPanel jPanelParametrosAuxiliar3ParametroCompra;
	protected JPanel jPanelParametrosAuxiliar4ParametroCompra;
	//protected JPanel jPanelParametrosAuxiliar5ParametroCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroCompra;
	//protected JPanel jPanelImportacionParametroCompra;
	
	
	public JTable jTableDatosParametroCompra;
	
	
	
	//public JTable jTableDatosParametroCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroCompra;
	protected JButton jButtonDuplicarParametroCompra;
	protected JButton jButtonCopiarParametroCompra;
	protected JButton jButtonVerFormParametroCompra;
	protected JButton jButtonNuevoRelacionesParametroCompra;
	protected JButton jButtonModificarParametroCompra;
	
    protected JButton jButtonGuardarCambiosTablaParametroCompra;
	protected JButton jButtonCerrarParametroCompra;
	
	
	protected JButton jButtonRecargarInformacionParametroCompra;
	protected JButton jButtonProcesarInformacionParametroCompra;
	
	
	protected JButton jButtonAnterioresParametroCompra;
	protected JButton jButtonSiguientesParametroCompra;
	protected JButton jButtonNuevoGuardarCambiosParametroCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroCompra;
	//protected JButton jButtonCerrarReporteDinamicoParametroCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroCompra;
	//protected JButton jButtonGenerarImportacionParametroCompra;
	//protected JButton jButtonCerrarImportacionParametroCompra;
	//protected JFileChooser jFileChooserImportacionParametroCompra;
	//protected File fileImportacionParametroCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCompra;
	protected JButton jButtonDuplicarToolBarParametroCompra;
	protected JButton jButtonNuevoRelacionesToolBarParametroCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroCompra;
	protected JButton jButtonCopiarToolBarParametroCompra;
	protected JButton jButtonVerFormToolBarParametroCompra;
	public JButton jButtonGuardarCambiosTablaToolBarParametroCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCompra;
	protected JButton jButtonCerrarToolBarParametroCompra;
	
	protected JButton jButtonRecargarInformacionToolBarParametroCompra;
	protected JButton jButtonProcesarInformacionToolBarParametroCompra;
	protected JButton jButtonAnterioresToolBarParametroCompra;
	protected JButton jButtonSiguientesToolBarParametroCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroCompra;
	protected JButton jButtonAbrirOrderByToolBarParametroCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCompra;
	protected JMenuItem jMenuItemDuplicarParametroCompra;
	protected JMenuItem jMenuItemNuevoRelacionesParametroCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroCompra;
	protected JMenuItem jMenuItemCopiarParametroCompra;
	protected JMenuItem jMenuItemVerFormParametroCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCompra;
	protected JMenuItem jMenuItemCerrarParametroCompra;
	protected JMenuItem jMenuItemDetalleCerrarParametroCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroCompra;
	protected JMenuItem jMenuItemProcesarInformacionParametroCompra;
	protected JMenuItem jMenuItemAnterioresParametroCompra;
	protected JMenuItem jMenuItemSiguientesParametroCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCompra;
	protected JMenuItem jMenuItemAbrirOrderByParametroCompra;
	protected JMenuItem jMenuItemMostrarOcultarParametroCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroCompra;
	protected JCheckBox jCheckBoxSeleccionadosParametroCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroCompra;
	protected JCheckBox jCheckBoxConGraficoReporteParametroCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroCompra;
	protected JTextField jTextFieldValorCampoGeneralParametroCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroCompra;
	//public JList<Reporte> jListColumnasSelectReporteParametroCompra;
	//public JScrollPane jScrollColumnasSelectReporteParametroCompra;
	
	//public JLabel jLabelRelacionesSelectReporteParametroCompra;
	//public JList<Reporte> jListRelacionesSelectReporteParametroCompra;
	//public JScrollPane jScrollRelacionesSelectReporteParametroCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroCompra;
	
		
	//public JLabel jLabelArchivoImportacionParametroCompra;	
	//public JLabel jLabelPathArchivoImportacionParametroCompra;
	//protected JTextField jTextFieldPathArchivoImportacionParametroCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroCompra;
	
	//public JLabel jLabelColumnaCategoriaValorParametroCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroCompra;
	
	//public JLabel jLabelColumnasValoresGraficoParametroCompra;
	//public JList<Reporte> jListColumnasValoresGraficoParametroCompra;
	//public JScrollPane jScrollColumnasValoresGraficoParametroCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroCompra;
	public JPanel jPanelFK_IdBodegaParametroCompra;
	public JButton jButtonFK_IdBodegaParametroCompra;
	public JPanel jPanelFK_IdBodegaReservaParametroCompra;
	public JButton jButtonFK_IdBodegaReservaParametroCompra;
	public JPanel jPanelFK_IdEmbarcadorParametroCompra;
	public JButton jButtonFK_IdEmbarcadorParametroCompra;
	public JPanel jPanelFK_IdEmpleadoParametroCompra;
	public JButton jButtonFK_IdEmpleadoParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoAnuladoParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoAnuladoParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoAutorizadoParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoAutorizadoParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoCotizadoParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoCotizadoParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoPendienteParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoPendienteParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoRegularizadoParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoRegularizadoParametroCompra;
	public JPanel jPanelFK_IdEstadoPedidoSuspendoParametroCompra;
	public JButton jButtonFK_IdEstadoPedidoSuspendoParametroCompra;
	public JPanel jPanelFK_IdFormatoAutorizacionParametroCompra;
	public JButton jButtonFK_IdFormatoAutorizacionParametroCompra;
	public JPanel jPanelFK_IdFormatoCotizacionParametroCompra;
	public JButton jButtonFK_IdFormatoCotizacionParametroCompra;
	public JPanel jPanelFK_IdFormatoItemParametroCompra;
	public JButton jButtonFK_IdFormatoItemParametroCompra;
	public JPanel jPanelFK_IdFormatoPedidoParametroCompra;
	public JButton jButtonFK_IdFormatoPedidoParametroCompra;
	public JPanel jPanelFK_IdPrioridadPedidoParametroCompra;
	public JButton jButtonFK_IdPrioridadPedidoParametroCompra;
	public JPanel jPanelFK_IdTipoDocumentoParametroCompra;
	public JButton jButtonFK_IdTipoDocumentoParametroCompra;
	public JPanel jPanelFK_IdTipoMovimientoParametroCompra;
	public JButton jButtonFK_IdTipoMovimientoParametroCompra;
	public JPanel jPanelFK_IdTipoMovimientoModuloParametroCompra;
	public JButton jButtonFK_IdTipoMovimientoModuloParametroCompra;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroCompra;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroCompra;
	public JButton jButtonid_bodegaFK_IdBodegaParametroCompra= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_reservaFK_IdBodegaReservaParametroCompra;
	public JLabel jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra;
	public JButton jButtonid_bodega_reservaFK_IdBodegaReservaParametroCompra= new JButtonMe();
	public JButton jButtonid_bodega_reservaFK_IdBodegaReservaParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodega_reservaFK_IdBodegaReservaParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_embarcadorFK_IdEmbarcadorParametroCompra;
	public JLabel jLabelid_embarcadorFK_IdEmbarcadorParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra;
	public JButton jButtonid_embarcadorFK_IdEmbarcadorParametroCompra= new JButtonMe();
	public JButton jButtonid_embarcadorFK_IdEmbarcadorParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_embarcadorFK_IdEmbarcadorParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoParametroCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoParametroCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra;
	
	public JPanel jPanelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra;
	public JLabel jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra;
	public JButton jButtonid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra;
	public JButton jButtonid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra;
	public JButton jButtonid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra;
	public JLabel jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra;
	public JButton jButtonid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra;
	public JButton jButtonid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra;
	public JLabel jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra;
	public JButton jButtonid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra;
	public JLabel jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra;
	public JButton jButtonid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra;
	public JLabel jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra;
	public JButton jButtonid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_cotizacionFK_IdFormatoCotizacionParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_cotizacionFK_IdFormatoCotizacionParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_itemFK_IdFormatoItemParametroCompra;
	public JLabel jLabelid_formato_itemFK_IdFormatoItemParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra;
	public JButton jButtonid_formato_itemFK_IdFormatoItemParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_itemFK_IdFormatoItemParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_itemFK_IdFormatoItemParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_pedidoFK_IdFormatoPedidoParametroCompra;
	public JLabel jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra;
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedidoParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedidoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedidoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra;
	public JLabel jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra;
	public JButton jButtonid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra= new JButtonMe();
	public JButton jButtonid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoParametroCompra;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra;
	public JLabel jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra;
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompraBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroCompra)	{
		this.jButtonRecargarInformacionParametroCompra = jButtonRecargarInformacionParametroCompra;
	}
	
	public JButton getjButtonProcesarInformacionParametroCompra() {
		return this.jButtonProcesarInformacionParametroCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCompra)	{
		this.jButtonProcesarInformacionParametroCompra = jButtonProcesarInformacionParametroCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroCompra() {
		return this.jButtonRecargarInformacionParametroCompra;
	}
	
	
	public List<ParametroCompra> getparametrocompras() {
		return this.parametrocompras;
	}

	public void setparametrocompras(List<ParametroCompra> parametrocompras) {
		this.parametrocompras = parametrocompras;
	}
	
	public List<ParametroCompra> getparametrocomprasAux() {
		return this.parametrocomprasAux;
	}

	public void setparametrocomprasAux(List<ParametroCompra> parametrocomprasAux) {
		this.parametrocomprasAux = parametrocomprasAux;
	}
	
	public List<ParametroCompra> getparametrocomprasEliminados() {
		return this.parametrocomprasEliminados;
	}

	public void setParametroComprasEliminados(List<ParametroCompra> parametrocomprasEliminados) {
		this.parametrocomprasEliminados = parametrocomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroCompra() {
		return jComboBoxTiposSeleccionarParametroCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroCompra(
			JComboBox jComboBoxTiposSeleccionarParametroCompra) {
		this.jComboBoxTiposSeleccionarParametroCompra = jComboBoxTiposSeleccionarParametroCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroCompra() {
		return jTextFieldValorCampoGeneralParametroCompra;
	}

	public void setjTextFieldValorCampoGeneralParametroCompra(
			JTextField jTextFieldValorCampoGeneralParametroCompra) {
		this.jTextFieldValorCampoGeneralParametroCompra = jTextFieldValorCampoGeneralParametroCompra;
	}

	public void setBorderResaltarValorCampoGeneralParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroCompra() {
		return this.jCheckBoxSeleccionarTodosParametroCompra;
	}

	public void setjCheckBoxSeleccionarTodosParametroCompra(
			JCheckBox jCheckBoxSeleccionarTodosParametroCompra) {
		this.jCheckBoxSeleccionarTodosParametroCompra = jCheckBoxSeleccionarTodosParametroCompra;
	}

	public void setBorderResaltarSeleccionarTodosParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroCompra() {
		return this.jCheckBoxSeleccionadosParametroCompra;
	}

	public void setjCheckBoxSeleccionadosParametroCompra(
			JCheckBox jCheckBoxSeleccionadosParametroCompra) {
		this.jCheckBoxSeleccionadosParametroCompra = jCheckBoxSeleccionadosParametroCompra;
	}
	
	public void setBorderResaltarSeleccionadosParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroCompra() {
		return this.jComboBoxTiposArchivosReportesParametroCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroCompra(
			JComboBox jComboBoxTiposArchivosReportesParametroCompra) {
		this.jComboBoxTiposArchivosReportesParametroCompra = jComboBoxTiposArchivosReportesParametroCompra;
	}

	public void setBorderResaltarTiposArchivosReportesParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroCompra() {
		return this.jComboBoxTiposReportesParametroCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroCompra(
			JComboBox jComboBoxTiposReportesParametroCompra) {
		this.jComboBoxTiposReportesParametroCompra = jComboBoxTiposReportesParametroCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroCompra() {
	//	return jComboBoxTiposReportesDinamicoParametroCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroCompra) {
	//	this.jComboBoxTiposReportesDinamicoParametroCompra = jComboBoxTiposReportesDinamicoParametroCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroCompra = jComboBoxTiposArchivosReportesDinamicoParametroCompra;
	//}
	
	public void setBorderResaltarTiposReportesParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroCompra() {
		return this.jComboBoxTiposGraficosReportesParametroCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroCompra(
			JComboBox jComboBoxTiposGraficosReportesParametroCompra) {
		this.jComboBoxTiposGraficosReportesParametroCompra = jComboBoxTiposGraficosReportesParametroCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroCompra() {
		return this.jComboBoxTiposPaginacionParametroCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroCompra(
			JComboBox jComboBoxTiposPaginacionParametroCompra) {
		this.jComboBoxTiposPaginacionParametroCompra = jComboBoxTiposPaginacionParametroCompra;
	}
	
	public void setBorderResaltarTiposPaginacionParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroCompra() {
		return this.jComboBoxTiposRelacionesParametroCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCompra() {
		return this.jComboBoxTiposAccionesParametroCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCompra(
			JComboBox jComboBoxTiposRelacionesParametroCompra) {
		this.jComboBoxTiposRelacionesParametroCompra = jComboBoxTiposRelacionesParametroCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCompra(
			JComboBox jComboBoxTiposAccionesParametroCompra) {
		this.jComboBoxTiposAccionesParametroCompra = jComboBoxTiposAccionesParametroCompra;
	}
	
	public void setBorderResaltarTiposRelacionesParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroCompra() {
	//	return jCheckBoxConGraficoDinamicoParametroCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroCompra) {
	//	this.jCheckBoxConGraficoDinamicoParametroCompra = jCheckBoxConGraficoDinamicoParametroCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroCompra .setBorder(borderResaltar);		
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
		this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		
		this.parametrocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Compra MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"nuevo","nuevo","Nuevo"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"duplicar","duplicar","Duplicar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"copiar","copiar","Copiar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"ver_form","ver_form","Ver"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"recargar","recargar","Recargar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroCompra,this.jTtoolBarParametroCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroCompra,this.jTtoolBarParametroCompra,
							"cerrar","cerrar","Salir"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroCompra;
			
				this.jButtonProcesarInformacionToolBarParametroCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroCompra;
				
		//protected JButton jButtonModificarToolBarParametroCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroCompra=new JMenuMe("General");
		this.jmenuArchivoParametroCompra=new JMenuMe("Archivo");
		this.jmenuAccionesParametroCompra=new JMenuMe("Acciones");
		this.jmenuDatosParametroCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroCompra.add(this.jMenuItemCerrarParametroCompra);
			
			this.jmenuAccionesParametroCompra.add(this.jMenuItemNuevoParametroCompra);
			this.jmenuAccionesParametroCompra.add(this.jMenuItemNuevoGuardarCambiosParametroCompra);
			this.jmenuAccionesParametroCompra.add(this.jMenuItemNuevoRelacionesParametroCompra);
			this.jmenuAccionesParametroCompra.add(this.jMenuItemGuardarCambiosTablaParametroCompra);		
			this.jmenuAccionesParametroCompra.add(this.jMenuItemDuplicarParametroCompra);		
			this.jmenuAccionesParametroCompra.add(this.jMenuItemCopiarParametroCompra);		
			this.jmenuAccionesParametroCompra.add(this.jMenuItemVerFormParametroCompra);		
			
			this.jmenuDatosParametroCompra.add(this.jMenuItemRecargarInformacionParametroCompra);				
			this.jmenuDatosParametroCompra.add(this.jMenuItemAnterioresParametroCompra);				
			this.jmenuDatosParametroCompra.add(this.jMenuItemSiguientesParametroCompra);				
			this.jmenuDatosParametroCompra.add(this.jMenuItemAbrirOrderByParametroCompra);				
			this.jmenuDatosParametroCompra.add(this.jMenuItemMostrarOcultarParametroCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroCompra.add(this.jMenuItemGuardarCambiosParametroCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroCompra.add(this.jmenuArchivoParametroCompra);		
			this.jmenuBarParametroCompra.add(this.jmenuAccionesParametroCompra);		
			this.jmenuBarParametroCompra.add(this.jmenuDatosParametroCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroCompra.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaParametroCompra= new JButtonMe();
		this.jButtonFK_IdBodegaParametroCompra.setText("Buscar");
		this.jButtonFK_IdBodegaParametroCompra.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroCompra,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroCompra = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroCompra.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaParametroCompra.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroCompra= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaReservaParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaReservaParametroCompra.setToolTipText("Buscar Por Bodega Reserva ");
		this.jButtonFK_IdBodegaReservaParametroCompra= new JButtonMe();
		this.jButtonFK_IdBodegaReservaParametroCompra.setText("Buscar");
		this.jButtonFK_IdBodegaReservaParametroCompra.setToolTipText("Buscar Por Bodega Reserva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaReservaParametroCompra,"buscar_button","Buscar Por Bodega Reserva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaReservaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra = new JLabelMe();
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra.setText("Bodega Reserva :");
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra.setToolTipText("Bodega Reserva");
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_reservaFK_IdBodegaReservaParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra= new JComboBoxMe();
		jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_reservaFK_IdBodegaReservaParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmbarcadorParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmbarcadorParametroCompra.setToolTipText("Buscar Por Embarcador ");
		this.jButtonFK_IdEmbarcadorParametroCompra= new JButtonMe();
		this.jButtonFK_IdEmbarcadorParametroCompra.setText("Buscar");
		this.jButtonFK_IdEmbarcadorParametroCompra.setToolTipText("Buscar Por Embarcador ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmbarcadorParametroCompra,"buscar_button","Buscar Por Embarcador ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmbarcadorParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra = new JLabelMe();
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra.setText("Embarcador :");
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra.setToolTipText("Embarcador");
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_embarcadorFK_IdEmbarcadorParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_embarcadorFK_IdEmbarcadorParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra= new JComboBoxMe();
		jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_embarcadorFK_IdEmbarcadorParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoParametroCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoParametroCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoParametroCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoParametroCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoParametroCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoParametroCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoParametroCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoParametroCompra.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoAnuladoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoAnuladoParametroCompra.setToolTipText("Buscar Por Estado Pedido Anulado ");
		this.jButtonFK_IdEstadoPedidoAnuladoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoAnuladoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoAnuladoParametroCompra.setToolTipText("Buscar Por Estado Pedido Anulado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoAnuladoParametroCompra,"buscar_button","Buscar Por Estado Pedido Anulado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoAnuladoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setText("Estado Pedido Anulado :");
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setToolTipText("Estado Pedido Anulado");
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_anuladoFK_IdEstadoPedidoAnuladoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPedidoAutorizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoAutorizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Autorizado ");
		this.jButtonFK_IdEstadoPedidoAutorizadoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoAutorizadoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoAutorizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Autorizado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoAutorizadoParametroCompra,"buscar_button","Buscar Por Estado Pedido Autorizado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoAutorizadoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setText("Estado Pedido Autorizado :");
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setToolTipText("Estado Pedido Autorizado");
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_autorizadoFK_IdEstadoPedidoAutorizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPedidoCotizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoCotizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Cotizado ");
		this.jButtonFK_IdEstadoPedidoCotizadoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoCotizadoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoCotizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Cotizado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoCotizadoParametroCompra,"buscar_button","Buscar Por Estado Pedido Cotizado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoCotizadoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setText("Estado Pedido Cotizado :");
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setToolTipText("Estado Pedido Cotizado");
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_cotizadoFK_IdEstadoPedidoCotizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPedidoPendienteParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoPendienteParametroCompra.setToolTipText("Buscar Por Estado Pedido Pendiente ");
		this.jButtonFK_IdEstadoPedidoPendienteParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoPendienteParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoPendienteParametroCompra.setToolTipText("Buscar Por Estado Pedido Pendiente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoPendienteParametroCompra,"buscar_button","Buscar Por Estado Pedido Pendiente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoPendienteParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setText("Estado Pedido Pendiente :");
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setToolTipText("Estado Pedido Pendiente");
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_pendienteFK_IdEstadoPedidoPendienteParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPedidoRegularizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoRegularizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Regularizado ");
		this.jButtonFK_IdEstadoPedidoRegularizadoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoRegularizadoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoRegularizadoParametroCompra.setToolTipText("Buscar Por Estado Pedido Regularizado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoRegularizadoParametroCompra,"buscar_button","Buscar Por Estado Pedido Regularizado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoRegularizadoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setText("Estado Pedido Regularizado :");
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setToolTipText("Estado Pedido Regularizado");
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_regularizadoFK_IdEstadoPedidoRegularizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPedidoSuspendoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoSuspendoParametroCompra.setToolTipText("Buscar Por Estado Pedido Suspendo ");
		this.jButtonFK_IdEstadoPedidoSuspendoParametroCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoSuspendoParametroCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoSuspendoParametroCompra.setToolTipText("Buscar Por Estado Pedido Suspendo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoSuspendoParametroCompra,"buscar_button","Buscar Por Estado Pedido Suspendo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoSuspendoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra = new JLabelMe();
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setText("Estado Pedido Suspendo :");
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setToolTipText("Estado Pedido Suspendo");
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_suspendidoFK_IdEstadoPedidoSuspendoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoAutorizacionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoAutorizacionParametroCompra.setToolTipText("Buscar Por Formato Autorizacion ");
		this.jButtonFK_IdFormatoAutorizacionParametroCompra= new JButtonMe();
		this.jButtonFK_IdFormatoAutorizacionParametroCompra.setText("Buscar");
		this.jButtonFK_IdFormatoAutorizacionParametroCompra.setToolTipText("Buscar Por Formato Autorizacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoAutorizacionParametroCompra,"buscar_button","Buscar Por Formato Autorizacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoAutorizacionParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra = new JLabelMe();
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setText("Formato Autorizacion :");
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setToolTipText("Formato Autorizacion");
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_autorizacionFK_IdFormatoAutorizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoCotizacionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoCotizacionParametroCompra.setToolTipText("Buscar Por Formato Cotizacion ");
		this.jButtonFK_IdFormatoCotizacionParametroCompra= new JButtonMe();
		this.jButtonFK_IdFormatoCotizacionParametroCompra.setText("Buscar");
		this.jButtonFK_IdFormatoCotizacionParametroCompra.setToolTipText("Buscar Por Formato Cotizacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoCotizacionParametroCompra,"buscar_button","Buscar Por Formato Cotizacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoCotizacionParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra = new JLabelMe();
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setText("Formato Cotizacion :");
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setToolTipText("Formato Cotizacion");
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_cotizacionFK_IdFormatoCotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoItemParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoItemParametroCompra.setToolTipText("Buscar Por Formato Item ");
		this.jButtonFK_IdFormatoItemParametroCompra= new JButtonMe();
		this.jButtonFK_IdFormatoItemParametroCompra.setText("Buscar");
		this.jButtonFK_IdFormatoItemParametroCompra.setToolTipText("Buscar Por Formato Item ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoItemParametroCompra,"buscar_button","Buscar Por Formato Item ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoItemParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra = new JLabelMe();
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra.setText("Formato Item :");
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra.setToolTipText("Formato Item");
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_itemFK_IdFormatoItemParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_itemFK_IdFormatoItemParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_itemFK_IdFormatoItemParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedidoParametroCompra.setToolTipText("Buscar Por Formato Pedido ");
		this.jButtonFK_IdFormatoPedidoParametroCompra= new JButtonMe();
		this.jButtonFK_IdFormatoPedidoParametroCompra.setText("Buscar");
		this.jButtonFK_IdFormatoPedidoParametroCompra.setToolTipText("Buscar Por Formato Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedidoParametroCompra,"buscar_button","Buscar Por Formato Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedidoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra = new JLabelMe();
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setText("Formato Pedido :");
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setToolTipText("Formato Pedido");
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoFK_IdFormatoPedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoFK_IdFormatoPedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPrioridadPedidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPrioridadPedidoParametroCompra.setToolTipText("Buscar Por Prioridad Pedido ");
		this.jButtonFK_IdPrioridadPedidoParametroCompra= new JButtonMe();
		this.jButtonFK_IdPrioridadPedidoParametroCompra.setText("Buscar");
		this.jButtonFK_IdPrioridadPedidoParametroCompra.setToolTipText("Buscar Por Prioridad Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPrioridadPedidoParametroCompra,"buscar_button","Buscar Por Prioridad Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPrioridadPedidoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra = new JLabelMe();
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setText("Prioridad Pedido :");
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setToolTipText("Prioridad Pedido");
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra= new JComboBoxMe();
		jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prioridad_pedidoFK_IdPrioridadPedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoParametroCompra.setToolTipText("Buscar Por Tipo Documento ");
		this.jButtonFK_IdTipoDocumentoParametroCompra= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoParametroCompra.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoParametroCompra.setToolTipText("Buscar Por Tipo Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoParametroCompra,"buscar_button","Buscar Por Tipo Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setText("Tipo Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoParametroCompra.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoParametroCompra= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoParametroCompra.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoParametroCompra.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoParametroCompra,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoModuloParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoModuloParametroCompra.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		this.jButtonFK_IdTipoMovimientoModuloParametroCompra= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoModuloParametroCompra.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoModuloParametroCompra.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoModuloParametroCompra,"buscar_button","Buscar Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoModuloParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra = new JLabelMe();
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroCompra = new ParametroCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Compra DATOS");
			this.jInternalFrameDetalleFormParametroCompra = new ParametroCompraDetalleFormJInternalFrame(jDesktopPane,this.parametrocompraSessionBean.getConGuardarRelaciones(),this.parametrocompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroCompra = null;//new ParametroCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCompra= new GridBagLayout();
		
		
		this.jTableDatosParametroCompra = new JTableMe();      
		
		String sToolTipParametroCompra="";
		sToolTipParametroCompra=ParametroCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCompra+="(Inventario.ParametroCompra)";
		}
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroCompra.setToolTipText(sToolTipParametroCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroCompra);
		this.jTableDatosParametroCompra.setAutoCreateRowSorter(true);
		this.jTableDatosParametroCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroCompra.setRowSelectionAllowed(true);
		this.jTableDatosParametroCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroCompra = new JButtonMe();
		this.jButtonDuplicarParametroCompra = new JButtonMe();
		this.jButtonCopiarParametroCompra = new JButtonMe();
		this.jButtonVerFormParametroCompra = new JButtonMe();
		this.jButtonNuevoRelacionesParametroCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroCompra = new JButtonMe();
		this.jButtonCerrarParametroCompra = new JButtonMe();
		
		this.jScrollPanelDatosParametroCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformato_estadoParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Compra";
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCompra.setToolTipText("Acciones");
        this.jPanelAccionesParametroCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroCompra.setName("jPanelCamposFingeneralParametroCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformato_estadoParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato Estado"));
		this.jPanelCamposInicioformato_estadoParametroCompra.setName("jPanelCamposFinformato_estadoParametroCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformato_estadoParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroCompra=new ReporteDinamicoJInternalFrame(ParametroCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroCompra=new ImportacionJInternalFrame(ParametroCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroCompra.setText("Orden");
		this.jButtonAbrirOrderByParametroCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCompra,false,this);
			
			//this.cargarOrderByParametroCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCompra,true,this);
			
			//this.cargarOrderByParametroCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroCompra.setMinimumSize(new Dimension(400,50));//2530
		this.jTableDatosParametroCompra.setMaximumSize(new Dimension(400,50));//2530
		this.jTableDatosParametroCompra.setPreferredSize(new Dimension(400,50));//2530
		
		this.jScrollPanelDatosParametroCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroCompra.setText("Nuevo");
		this.jButtonDuplicarParametroCompra.setText("Duplicar");
		this.jButtonCopiarParametroCompra.setText("Copiar");
		this.jButtonVerFormParametroCompra.setText("Ver");
		this.jButtonNuevoRelacionesParametroCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroCompra.setText("Guardar");
		this.jButtonCerrarParametroCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCompra,"nuevo_button","Nuevo",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroCompra,"duplicar_button","Duplicar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroCompra,"copiar_button","Copiar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroCompra,"ver_form","Ver",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroCompra,"nuevorelaciones_button","Nuevo Rel",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCompra,"guardarcambiostabla_button","Guardar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCompra,"cerrar_button","Salir",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroCompra.setToolTipText("Nuevo"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroCompra.setToolTipText("Duplicar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroCompra.setToolTipText("Copiar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroCompra.setToolTipText("Ver"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroCompra.setToolTipText("Nuevo Rel"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroCompra.setToolTipText("Guardar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCompra.setToolTipText("Salir"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCompra";
		inputMap = this.jButtonNuevoParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroCompra";
		inputMap = this.jButtonDuplicarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroCompra"));
		
		//COPIAR
		sMapKey = "CopiarParametroCompra";
		inputMap = this.jButtonCopiarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroCompra"));
		
		//VEr FORM
		sMapKey = "VerFormParametroCompra";
		inputMap = this.jButtonVerFormParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroCompra";
		inputMap = this.jButtonNuevoRelacionesParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroCompra";
		inputMap = this.jButtonModificarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroCompra";
		inputMap = this.jButtonCerrarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCompra";
		inputMap = this.jButtonGuardarCambiosTablaParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroCompra.setName("jPanelParametrosReportesParametroCompra"); 
		
		this.jPanelParametrosReportesAccionesParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroCompra.setName("jPanelParametrosReportesAccionesParametroCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroCompra = new JButtonMe();
		this.jButtonRecargarInformacionParametroCompra.setText("Recargar");
		this.jButtonRecargarInformacionParametroCompra.setToolTipText("Recargar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroCompra = new JButtonMe();
		this.jButtonProcesarInformacionParametroCompra.setText("Procesar");
		this.jButtonProcesarInformacionParametroCompra.setToolTipText("Procesar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroCompra.setVisible(false);
			
		this.jButtonProcesarInformacionParametroCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCompra.setText("TIPO");       
		this.jComboBoxTiposReportesParametroCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroCompra.setText("Accion");
		this.jComboBoxTiposRelacionesParametroCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCompra.setText("Accion");
		this.jComboBoxTiposAccionesParametroCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroCompra = new JLabelMe();
		
		this.jLabelAccionesParametroCompra.setText("Acciones");		
		this.jLabelAccionesParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroCompra = new JButtonMe();
		//this.jButtonAnterioresParametroCompra.setText("<<");
        this.jButtonAnterioresParametroCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroCompra = new JButtonMe();
		//this.jButtonSiguientesParametroCompra.setText(">>");
        this.jButtonSiguientesParametroCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroCompra,"nuevoguardarcambios_button","Nue",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroCompra";
		inputMap = this.jButtonNuevoGuardarCambiosParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroCompra";
		inputMap = this.jButtonRecargarInformacionParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroCompra";
		inputMap = this.jButtonSiguientesParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroCompra";
		inputMap = this.jButtonAnterioresParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroCompra.setMinimumSize(new Dimension(this.getWidth(),ParametroCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCompra.setMaximumSize(new Dimension(this.getWidth(),ParametroCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCompra.setPreferredSize(new Dimension(this.getWidth(),ParametroCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroCompra = new GridBagLayout();

			this.jPanelPaginacionParametroCompra.setLayout(gridaBagLayoutPaginacionParametroCompra);						
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 0;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroCompra.add(this.jButtonAnterioresParametroCompra, this.gridBagConstraintsParametroCompra);
					
						
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCompra.gridy = 0;
			
			this.jPanelPaginacionParametroCompra.add(this.jButtonNuevoGuardarCambiosParametroCompra, this.gridBagConstraintsParametroCompra);
						
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCompra.gridy = 0;
			this.jPanelPaginacionParametroCompra.add(this.jButtonSiguientesParametroCompra, this.gridBagConstraintsParametroCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 1;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCompra.add(this.jButtonNuevoParametroCompra, this.gridBagConstraintsParametroCompra);
						
			
			
			if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroCompra = new GridBagConstraints();
				this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroCompra.gridy = 1;
				this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroCompra.add(this.jButtonGuardarCambiosTablaParametroCompra, this.gridBagConstraintsParametroCompra);
			}
			
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 1;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCompra.add(this.jButtonDuplicarParametroCompra, this.gridBagConstraintsParametroCompra);
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 1;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCompra.add(this.jButtonCopiarParametroCompra, this.gridBagConstraintsParametroCompra);
		
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 1;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCompra.add(this.jButtonVerFormParametroCompra, this.gridBagConstraintsParametroCompra);
		
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 1;
			this.gridBagConstraintsParametroCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroCompra.add(this.jButtonCerrarParametroCompra, this.gridBagConstraintsParametroCompra);
		
		
		
		this.jButtonRecargarInformacionParametroCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroCompra.setLayout(gridaBagParametrosReportesParametroCompra);
			this.jPanelParametrosReportesAccionesParametroCompra.setLayout(gridaBagParametrosReportesAccionesParametroCompra);
			
			
			this.jPanelParametrosAuxiliar1ParametroCompra.setLayout(gridaBagParametrosAuxiliar1ParametroCompra);
			this.jPanelParametrosAuxiliar2ParametroCompra.setLayout(gridaBagParametrosAuxiliar2ParametroCompra);
			this.jPanelParametrosAuxiliar3ParametroCompra.setLayout(gridaBagParametrosAuxiliar3ParametroCompra);
			this.jPanelParametrosAuxiliar4ParametroCompra.setLayout(gridaBagParametrosAuxiliar4ParametroCompra);
			//this.jPanelParametrosAuxiliar5ParametroCompra.setLayout(gridaBagParametrosAuxiliar2ParametroCompra);			
			
			
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCompra.add(this.jButtonRecargarInformacionParametroCompra, this.gridBagConstraintsParametroCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCompra.add(this.jComboBoxTiposPaginacionParametroCompra, this.gridBagConstraintsParametroCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCompra.add(this.jCheckBoxConAltoMaximoTablaParametroCompra, this.gridBagConstraintsParametroCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCompra.add(this.jComboBoxTiposArchivosReportesParametroCompra, this.gridBagConstraintsParametroCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCompra.add(this.jPanelParametrosAuxiliar1ParametroCompra, this.gridBagConstraintsParametroCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroCompra.add(this.jComboBoxTiposReportesParametroCompra, this.gridBagConstraintsParametroCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCompra.add(this.jPanelParametrosAuxiliar4ParametroCompra, this.gridBagConstraintsParametroCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCompra.add(this.jComboBoxTiposReportesParametroCompra, this.gridBagConstraintsParametroCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCompra.add(this.jCheckBoxGenerarReporteParametroCompra, this.gridBagConstraintsParametroCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCompra.add(this.jPanelParametrosAuxiliar2ParametroCompra, this.gridBagConstraintsParametroCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCompra.add(this.jLabelAccionesParametroCompra, this.gridBagConstraintsParametroCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroCompra = new GridBagConstraints();
				this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroCompra.add(this.jButtonAbrirOrderByParametroCompra, this.gridBagConstraintsParametroCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCompra.add(this.jComboBoxTiposSeleccionarParametroCompra, this.gridBagConstraintsParametroCompra);			
			
			
			/*
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCompra.add(this.jCheckBoxSeleccionarTodosParametroCompra, this.gridBagConstraintsParametroCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCompra.add(this.jCheckBoxSeleccionarTodosParametroCompra, this.gridBagConstraintsParametroCompra);															
				
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCompra.add(this.jCheckBoxSeleccionadosParametroCompra, this.gridBagConstraintsParametroCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCompra.add(this.jPanelParametrosAuxiliar3ParametroCompra, this.gridBagConstraintsParametroCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCompra.add(this.jComboBoxTiposAccionesParametroCompra, this.gridBagConstraintsParametroCompra);
	
				
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCompra.add(this.jTextFieldValorCampoGeneralParametroCompra, this.gridBagConstraintsParametroCompra);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroCompra.setLayout(gridaBagLayoutCamposIniciogeneralParametroCompra);

		GridBagLayout gridaBagLayoutCamposInicioformato_estadoParametroCompra= new GridBagLayout();
		this.jPanelCamposInicioformato_estadoParametroCompra.setLayout(gridaBagLayoutCamposInicioformato_estadoParametroCompra);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroCompra = new GridBagLayout();

			this.jScrollPanelDatosParametroCompra.setLayout(gridaBagLayoutDatosParametroCompra);
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = 0;
			this.gridBagConstraintsParametroCompra.gridx = 0;
			
			this.jScrollPanelDatosParametroCompra.add(this.jTableDatosParametroCompra, this.gridBagConstraintsParametroCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroCompra.setViewportView(this.jTableDatosParametroCompra);
		this.jTableDatosParametroCompra.setFillsViewportHeight(true);
		this.jTableDatosParametroCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroCompra= new GridBagLayout();
		this.jPanelAccionesParametroCompra.setLayout(gridaBagLayoutAccionesParametroCompra);
		
		
		/*	
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 0;
			
		this.jPanelAccionesParametroCompra.add(this.jButtonNuevoParametroCompra, this.gridBagConstraintsParametroCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();						
			this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCompra.gridx = 0;		
			//this.gridBagConstraintsParametroCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroCompra, this.gridBagConstraintsParametroCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroCompra.gridx = 0;		
		//this.gridBagConstraintsParametroCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroCompra, this.gridBagConstraintsParametroCompra);								
		
		
		/*
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroCompra, this.gridBagConstraintsParametroCompra);
		*/		
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCompra.gridx =0;
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCompra, this.gridBagConstraintsParametroCompra);
				
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroCompra, this.gridBagConstraintsParametroCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroCompra.setLayout(gridaBagLayoutBusquedasParametrosParametroCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCompra, this.gridBagConstraintsParametroCompra);
			
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCompra, this.gridBagConstraintsParametroCompra);
		
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCompra, this.gridBagConstraintsParametroCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroCompra.setName("jPanelReporteDinamicoParametroCompra"); 
		
		this.jPanelReporteDinamicoParametroCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroCompra.setLayout(gridaBagLayoutReporteDinamicoParametroCompra);
		
		
		this.jInternalFrameReporteDinamicoParametroCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroCompra.add(this.jLabelColumnasSelectReporteParametroCompra, this.gridBagConstraintsParametroCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroCompra=new JScrollPane(this.jListColumnasSelectReporteParametroCompra);
			
			this.jScrollColumnasSelectReporteParametroCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroCompra.add(this.jListColumnasSelectReporteParametroCompra, this.gridBagConstraintsParametroCompra);
		this.jPanelReporteDinamicoParametroCompra.add(this.jScrollColumnasSelectReporteParametroCompra, this.gridBagConstraintsParametroCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroCompra=new JScrollPane(this.jListRelacionesSelectReporteParametroCompra);
			
			this.jScrollRelacionesSelectReporteParametroCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCompra.add(this.jLabelGenerarExcelReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroCompra.setToolTipText("Generar EXCEL"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroCompra.add(this.jButtonGenerarExcelReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCompra.add(this.jComboBoxTiposReportesDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCompra.add(this.jLabelTiposArchivoReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCompra.add(this.jComboBoxTiposArchivosReportesDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroCompra.setToolTipText("Generar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCompra.add(this.jButtonGenerarReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroCompra.setToolTipText("Cancelar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCompra.add(this.jButtonCerrarReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroCompra= new JScrollPane(jPanelReporteDinamicoParametroCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroCompra);
		this.jInternalFrameReporteDinamicoParametroCompra.getContentPane().add(this.jScrollPanelReporteDinamicoParametroCompra, this.gridBagConstraintsParametroCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroCompra.setName("jPanelImportacionParametroCompra"); 
		
		this.jPanelImportacionParametroCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroCompra.setLayout(gridaBagLayoutImportacionParametroCompra);
		
		
		this.jInternalFrameImportacionParametroCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCompra.setResizable(true);
	    this.jInternalFrameImportacionParametroCompra.setClosable(true);
	    this.jInternalFrameImportacionParametroCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCompra.setResizable(true);
	    this.jInternalFrameImportacionParametroCompra.setClosable(true);
	    this.jInternalFrameImportacionParametroCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroCompra = new JLabelMe();

		this.jLabelArchivoImportacionParametroCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCompra.add(this.jLabelArchivoImportacionParametroCompra, this.gridBagConstraintsParametroCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroCompra = new JFileChooser();		
		this.jFileChooserImportacionParametroCompra.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroCompra = new JButtonMe();
		this.jButtonAbrirImportacionParametroCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroCompra.setToolTipText("Generar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCompra.add(this.jButtonAbrirImportacionParametroCompra, this.gridBagConstraintsParametroCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCompra.add(this.jLabelPathArchivoImportacionParametroCompra, this.gridBagConstraintsParametroCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCompra.add(this.jTextFieldPathArchivoImportacionParametroCompra, this.gridBagConstraintsParametroCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroCompra = new JButtonMe();
		this.jButtonGenerarImportacionParametroCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroCompra.setToolTipText("Generar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCompra.add(this.jButtonGenerarImportacionParametroCompra, this.gridBagConstraintsParametroCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroCompra = new JButtonMe();
		this.jButtonCerrarImportacionParametroCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroCompra.setToolTipText("Cancelar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCompra.add(this.jButtonCerrarImportacionParametroCompra, this.gridBagConstraintsParametroCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroCompra= new JScrollPane(jPanelImportacionParametroCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroCompra);
		this.jInternalFrameImportacionParametroCompra.getContentPane().add(this.jScrollPanelImportacionParametroCompra, this.gridBagConstraintsParametroCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroCompra = new JButtonMe();
			this.jButtonAbrirOrderByParametroCompra.setText("Orden");
			this.jButtonAbrirOrderByParametroCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroCompra";
			inputMap = this.jButtonAbrirOrderByParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroCompra.setName("jPanelOrderByParametroCompra"); 
			
			this.jPanelOrderByParametroCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroCompra.setLayout(gridaBagLayoutOrderByParametroCompra);
			
			
			this.jTableDatosParametroCompraOrderBy = new JTableMe();        
			this.jTableDatosParametroCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroCompraOrderBy.setViewportView(this.jTableDatosParametroCompraOrderBy);
			this.jTableDatosParametroCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroCompra.setTitle("Orden");
			this.jInternalFrameOrderByParametroCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroCompra.setResizable(true);
			this.jInternalFrameOrderByParametroCompra.setClosable(true);
			this.jInternalFrameOrderByParametroCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroCompra.ipady =150;
				
			this.jPanelOrderByParametroCompra.add(jScrollPanelDatosParametroCompraOrderBy, this.gridBagConstraintsParametroCompra);//this.jTableDatosParametroCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroCompra = new JButtonMe();
			this.jButtonCerrarOrderByParametroCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroCompra.setToolTipText("Cancelar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroCompra.add(this.jButtonCerrarOrderByParametroCompra, this.gridBagConstraintsParametroCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroCompra= new JScrollPane(jPanelOrderByParametroCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroCompra);
			
			this.jInternalFrameOrderByParametroCompra.getContentPane().add(this.jScrollPanelOrderByParametroCompra, this.gridBagConstraintsParametroCompra);			
		
		} else {
			this.jButtonAbrirOrderByParametroCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//5230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroCompra.getRowHeight();//ParametroCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCompra.isSelected()) {
					iHeightTable=ParametroCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCompra.isSelected()) {
					iHeightTable=ParametroCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroCompra!=null && this.jInternalFrameOrderByParametroCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrocompraLogic.getParametroCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroCompra> TraerParametroCompraBeans(List<ParametroCompra> parametrocompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroCompra parametrocompra:parametrocompras) {
					
				if(!(ParametroCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrocompra.setsDetalleGeneralEntityReporte(ParametroCompraConstantesFunciones.getParametroCompraDescripcion(parametrocompra));
										
					parametrocompra.setcon_centro_costo_descripcion(ParametroCompraConstantesFunciones.getcon_centro_costoDescripcion(parametrocompra));	
					
						
					
				} else  {
							
					//parametrocompra.setsDetalleGeneralEntityReporte(parametrocompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocomprabeans.add(parametrocomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocompras;
    }
	//PARA REPORTES FIN
}
