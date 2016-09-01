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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuPrincipalConstantesFunciones;

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
public class ParametroFactuPrincipalJInternalFrame extends ParametroFactuPrincipalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFactuPrincipal;
	
	protected JMenuBar jmenuBarParametroFactuPrincipal;
	
	protected JMenu jmenuParametroFactuPrincipal;
	protected JMenu jmenuDatosParametroFactuPrincipal;
	protected JMenu jmenuArchivoParametroFactuPrincipal;
	protected JMenu jmenuAccionesParametroFactuPrincipal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuPrincipal;	
	protected GridBagConstraints gridBagConstraintsParametroFactuPrincipal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFactuPrincipal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFactuPrincipal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFactuPrincipal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoParamFactuDescuentoBeanSwingJInternalFrame tipoparamfactudescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactudescuento="";

	protected TipoParamFactuListadoClienteBeanSwingJInternalFrame tipoparamfactulistadoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactulistadocliente="";

	protected TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame tipoparamfactusecuenciatrabajoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactusecuenciatrabajo="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentofactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotacredito="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotadebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotadebito="";

	protected LibroContableBeanSwingJInternalFrame librocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_librocontable="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefleteventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefleteventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotrocargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotrocargo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinan="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableboniBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableboni="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonidevolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonidevol="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableice="";
	
	public ParametroFactuPrincipalSessionBean parametrofactuprincipalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean;
	public TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean;
	public TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean;
	public TipoDocumentoSessionBean tipodocumentofacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotacreditoSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotadebitoSessionBean;
	public LibroContableSessionBean librocontableSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public CuentaContableSessionBean cuentacontablefleteventaSessionBean;
	public CuentaContableSessionBean cuentacontableotrocargoSessionBean;
	public CuentaContableSessionBean cuentacontablefinanSessionBean;
	public CuentaContableSessionBean cuentacontableboniSessionBean;
	public CuentaContableSessionBean cuentacontablebonidevolSessionBean;
	public CuentaContableSessionBean cuentacontableiceSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFactuPrincipal> parametrofactuprincipals;		
	public List<ParametroFactuPrincipal> parametrofactuprincipalsEliminados;	
	public List<ParametroFactuPrincipal> parametrofactuprincipalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFactuPrincipal;		
	protected JButton jButtonAbrirOrderByParametroFactuPrincipal;
	
	
	//protected JPanel jPanelOrderByParametroFactuPrincipal;
	//public JScrollPane jScrollPanelOrderByParametroFactuPrincipal;	
	//protected JButton jButtonCerrarOrderByParametroFactuPrincipal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFactuPrincipalLogic parametrofactuprincipalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFactuPrincipal;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuPrincipal;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuPrincipal;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFactuPrincipalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFactuPrincipal;
	//public JScrollPane jScrollPanelImportacionParametroFactuPrincipal;
	
	
	
	protected JPanel jPanelAccionesParametroFactuPrincipal;
	
    protected JPanel jPanelPaginacionParametroFactuPrincipal;
    protected JPanel jPanelParametrosReportesParametroFactuPrincipal;
	protected JPanel jPanelParametrosReportesAccionesParametroFactuPrincipal;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciogeneralParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciotipo_documentoParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocontableParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocontableParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocontableParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioorden_despachoParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioorden_despachoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioorden_despachoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciosecuencialParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciosecuencialParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciosecuencialParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFactuPrincipal;
	protected JPanel jPanelParametrosAuxiliar2ParametroFactuPrincipal;
	protected JPanel jPanelParametrosAuxiliar3ParametroFactuPrincipal;
	protected JPanel jPanelParametrosAuxiliar4ParametroFactuPrincipal;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFactuPrincipal;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFactuPrincipal;
	//protected JPanel jPanelImportacionParametroFactuPrincipal;
	
	
	public JTable jTableDatosParametroFactuPrincipal;
	
	
	
	//public JTable jTableDatosParametroFactuPrincipalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFactuPrincipal;
	protected JButton jButtonDuplicarParametroFactuPrincipal;
	protected JButton jButtonCopiarParametroFactuPrincipal;
	protected JButton jButtonVerFormParametroFactuPrincipal;
	protected JButton jButtonNuevoRelacionesParametroFactuPrincipal;
	protected JButton jButtonModificarParametroFactuPrincipal;
	
    protected JButton jButtonGuardarCambiosTablaParametroFactuPrincipal;
	protected JButton jButtonCerrarParametroFactuPrincipal;
	
	
	protected JButton jButtonRecargarInformacionParametroFactuPrincipal;
	protected JButton jButtonProcesarInformacionParametroFactuPrincipal;
	
	
	protected JButton jButtonAnterioresParametroFactuPrincipal;
	protected JButton jButtonSiguientesParametroFactuPrincipal;
	protected JButton jButtonNuevoGuardarCambiosParametroFactuPrincipal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFactuPrincipal;
	//protected JButton jButtonCerrarReporteDinamicoParametroFactuPrincipal;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFactuPrincipal;
	//protected JButton jButtonGenerarImportacionParametroFactuPrincipal;
	//protected JButton jButtonCerrarImportacionParametroFactuPrincipal;
	//protected JFileChooser jFileChooserImportacionParametroFactuPrincipal;
	//protected File fileImportacionParametroFactuPrincipal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuPrincipal;
	protected JButton jButtonDuplicarToolBarParametroFactuPrincipal;
	protected JButton jButtonNuevoRelacionesToolBarParametroFactuPrincipal;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFactuPrincipal;
	protected JButton jButtonCopiarToolBarParametroFactuPrincipal;
	protected JButton jButtonVerFormToolBarParametroFactuPrincipal;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFactuPrincipal;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuPrincipal;
	protected JButton jButtonCerrarToolBarParametroFactuPrincipal;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFactuPrincipal;
	protected JButton jButtonProcesarInformacionToolBarParametroFactuPrincipal;
	protected JButton jButtonAnterioresToolBarParametroFactuPrincipal;
	protected JButton jButtonSiguientesToolBarParametroFactuPrincipal;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFactuPrincipal;
	protected JButton jButtonAbrirOrderByToolBarParametroFactuPrincipal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuPrincipal;
	protected JMenuItem jMenuItemDuplicarParametroFactuPrincipal;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFactuPrincipal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFactuPrincipal;
	protected JMenuItem jMenuItemCopiarParametroFactuPrincipal;
	protected JMenuItem jMenuItemVerFormParametroFactuPrincipal;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuPrincipal;
	protected JMenuItem jMenuItemCerrarParametroFactuPrincipal;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuPrincipal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFactuPrincipal;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuPrincipal;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFactuPrincipal;
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuPrincipal;
	protected JMenuItem jMenuItemAnterioresParametroFactuPrincipal;
	protected JMenuItem jMenuItemSiguientesParametroFactuPrincipal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuPrincipal;
	protected JMenuItem jMenuItemAbrirOrderByParametroFactuPrincipal;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuPrincipal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuPrincipal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFactuPrincipal;
	protected JCheckBox jCheckBoxSeleccionadosParametroFactuPrincipal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFactuPrincipal;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFactuPrincipal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFactuPrincipal;
	protected JTextField jTextFieldValorCampoGeneralParametroFactuPrincipal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFactuPrincipal;
	//public JList<Reporte> jListColumnasSelectReporteParametroFactuPrincipal;
	//public JScrollPane jScrollColumnasSelectReporteParametroFactuPrincipal;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFactuPrincipal;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFactuPrincipal;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFactuPrincipal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFactuPrincipal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFactuPrincipal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal;
	
		
	//public JLabel jLabelArchivoImportacionParametroFactuPrincipal;	
	//public JLabel jLabelPathArchivoImportacionParametroFactuPrincipal;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFactuPrincipal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFactuPrincipal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFactuPrincipal;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFactuPrincipal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFactuPrincipal;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFactuPrincipal;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFactuPrincipal;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFactuPrincipal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFactuPrincipal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFactuPrincipal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableBoniParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableBoniParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableBoniDevolParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableFinanParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableFinanParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableFleteVentaParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableIceParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableIceParametroFactuPrincipal;
	public JPanel jPanelFK_IdCuentaContableOtroCargoParametroFactuPrincipal;
	public JButton jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal;
	public JPanel jPanelFK_IdFormatoParametroFactuPrincipal;
	public JButton jButtonFK_IdFormatoParametroFactuPrincipal;
	public JPanel jPanelFK_IdLibroContableParametroFactuPrincipal;
	public JButton jButtonFK_IdLibroContableParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoDocumentoFacturaParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoParamFactuDescuentoParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal;
	public JPanel jPanelFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal;
	public JButton jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal;
	
	public JPanel jPanelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipalArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal;
	
	public JPanel jPanelid_formatoFK_IdFormatoParametroFactuPrincipal;
	public JLabel jLabelid_formatoFK_IdFormatoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal;
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_libro_contableFK_IdLibroContableParametroFactuPrincipal;
	public JLabel jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal;
	public JButton jButtonid_libro_contableFK_IdLibroContableParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_libro_contableFK_IdLibroContableParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_libro_contableFK_IdLibroContableParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipalBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=2134;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFactuPrincipalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFactuPrincipal)	{
		this.jButtonRecargarInformacionParametroFactuPrincipal = jButtonRecargarInformacionParametroFactuPrincipal;
	}
	
	public JButton getjButtonProcesarInformacionParametroFactuPrincipal() {
		return this.jButtonProcesarInformacionParametroFactuPrincipal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuPrincipal)	{
		this.jButtonProcesarInformacionParametroFactuPrincipal = jButtonProcesarInformacionParametroFactuPrincipal;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFactuPrincipal() {
		return this.jButtonRecargarInformacionParametroFactuPrincipal;
	}
	
	
	public List<ParametroFactuPrincipal> getparametrofactuprincipals() {
		return this.parametrofactuprincipals;
	}

	public void setparametrofactuprincipals(List<ParametroFactuPrincipal> parametrofactuprincipals) {
		this.parametrofactuprincipals = parametrofactuprincipals;
	}
	
	public List<ParametroFactuPrincipal> getparametrofactuprincipalsAux() {
		return this.parametrofactuprincipalsAux;
	}

	public void setparametrofactuprincipalsAux(List<ParametroFactuPrincipal> parametrofactuprincipalsAux) {
		this.parametrofactuprincipalsAux = parametrofactuprincipalsAux;
	}
	
	public List<ParametroFactuPrincipal> getparametrofactuprincipalsEliminados() {
		return this.parametrofactuprincipalsEliminados;
	}

	public void setParametroFactuPrincipalsEliminados(List<ParametroFactuPrincipal> parametrofactuprincipalsEliminados) {
		this.parametrofactuprincipalsEliminados = parametrofactuprincipalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFactuPrincipal() {
		return jComboBoxTiposSeleccionarParametroFactuPrincipal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFactuPrincipal(
			JComboBox jComboBoxTiposSeleccionarParametroFactuPrincipal) {
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal = jComboBoxTiposSeleccionarParametroFactuPrincipal;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFactuPrincipal() {
		return jTextFieldValorCampoGeneralParametroFactuPrincipal;
	}

	public void setjTextFieldValorCampoGeneralParametroFactuPrincipal(
			JTextField jTextFieldValorCampoGeneralParametroFactuPrincipal) {
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal = jTextFieldValorCampoGeneralParametroFactuPrincipal;
	}

	public void setBorderResaltarValorCampoGeneralParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFactuPrincipal() {
		return this.jCheckBoxSeleccionarTodosParametroFactuPrincipal;
	}

	public void setjCheckBoxSeleccionarTodosParametroFactuPrincipal(
			JCheckBox jCheckBoxSeleccionarTodosParametroFactuPrincipal) {
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal = jCheckBoxSeleccionarTodosParametroFactuPrincipal;
	}

	public void setBorderResaltarSeleccionarTodosParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFactuPrincipal() {
		return this.jCheckBoxSeleccionadosParametroFactuPrincipal;
	}

	public void setjCheckBoxSeleccionadosParametroFactuPrincipal(
			JCheckBox jCheckBoxSeleccionadosParametroFactuPrincipal) {
		this.jCheckBoxSeleccionadosParametroFactuPrincipal = jCheckBoxSeleccionadosParametroFactuPrincipal;
	}
	
	public void setBorderResaltarSeleccionadosParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFactuPrincipal() {
		return this.jComboBoxTiposArchivosReportesParametroFactuPrincipal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFactuPrincipal(
			JComboBox jComboBoxTiposArchivosReportesParametroFactuPrincipal) {
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal = jComboBoxTiposArchivosReportesParametroFactuPrincipal;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFactuPrincipal() {
		return this.jComboBoxTiposReportesParametroFactuPrincipal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFactuPrincipal(
			JComboBox jComboBoxTiposReportesParametroFactuPrincipal) {
		this.jComboBoxTiposReportesParametroFactuPrincipal = jComboBoxTiposReportesParametroFactuPrincipal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFactuPrincipal() {
	//	return jComboBoxTiposReportesDinamicoParametroFactuPrincipal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFactuPrincipal(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFactuPrincipal) {
	//	this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal = jComboBoxTiposReportesDinamicoParametroFactuPrincipal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal = jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal;
	//}
	
	public void setBorderResaltarTiposReportesParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFactuPrincipal() {
		return this.jComboBoxTiposGraficosReportesParametroFactuPrincipal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFactuPrincipal(
			JComboBox jComboBoxTiposGraficosReportesParametroFactuPrincipal) {
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal = jComboBoxTiposGraficosReportesParametroFactuPrincipal;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFactuPrincipal() {
		return this.jComboBoxTiposPaginacionParametroFactuPrincipal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFactuPrincipal(
			JComboBox jComboBoxTiposPaginacionParametroFactuPrincipal) {
		this.jComboBoxTiposPaginacionParametroFactuPrincipal = jComboBoxTiposPaginacionParametroFactuPrincipal;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFactuPrincipal() {
		return this.jComboBoxTiposRelacionesParametroFactuPrincipal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuPrincipal() {
		return this.jComboBoxTiposAccionesParametroFactuPrincipal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuPrincipal(
			JComboBox jComboBoxTiposRelacionesParametroFactuPrincipal) {
		this.jComboBoxTiposRelacionesParametroFactuPrincipal = jComboBoxTiposRelacionesParametroFactuPrincipal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuPrincipal(
			JComboBox jComboBoxTiposAccionesParametroFactuPrincipal) {
		this.jComboBoxTiposAccionesParametroFactuPrincipal = jComboBoxTiposAccionesParametroFactuPrincipal;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFactuPrincipal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFactuPrincipal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFactuPrincipal() {
	//	return jCheckBoxConGraficoDinamicoParametroFactuPrincipal;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFactuPrincipal(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFactuPrincipal) {
	//	this.jCheckBoxConGraficoDinamicoParametroFactuPrincipal = jCheckBoxConGraficoDinamicoParametroFactuPrincipal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFactuPrincipal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFactuPrincipal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFactuPrincipal .setBorder(borderResaltar);		
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
		this.parametrofactuprincipalSessionBean=new ParametroFactuPrincipalSessionBean();
		
		this.parametrofactuprincipalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuPrincipalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Principal  MANTENIMIENTO"));
		
		
		if(iWidth > 4550) {
			iWidth=4550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFactuPrincipal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"nuevo","nuevo","Nuevo"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"duplicar","duplicar","Duplicar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"copiar","copiar","Copiar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"ver_form","ver_form","Ver"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"recargar","recargar","Recargar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFactuPrincipal,this.jTtoolBarParametroFactuPrincipal,
							"cerrar","cerrar","Salir"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFactuPrincipal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFactuPrincipal;
			
				this.jButtonProcesarInformacionToolBarParametroFactuPrincipal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFactuPrincipal;
				
		//protected JButton jButtonModificarToolBarParametroFactuPrincipal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFactuPrincipal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFactuPrincipal=new JMenuMe("General");
		this.jmenuArchivoParametroFactuPrincipal=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFactuPrincipal=new JMenuMe("Acciones");
		this.jmenuDatosParametroFactuPrincipal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuPrincipal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuPrincipal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuPrincipal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFactuPrincipal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFactuPrincipal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFactuPrincipal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFactuPrincipal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFactuPrincipal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFactuPrincipal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFactuPrincipal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuPrincipal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuPrincipal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFactuPrincipal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFactuPrincipal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFactuPrincipal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFactuPrincipal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFactuPrincipal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFactuPrincipal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFactuPrincipal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFactuPrincipal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFactuPrincipal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuPrincipal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuPrincipal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuPrincipal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFactuPrincipal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFactuPrincipal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFactuPrincipal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFactuPrincipal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFactuPrincipal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFactuPrincipal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFactuPrincipal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFactuPrincipal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFactuPrincipal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFactuPrincipal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFactuPrincipal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFactuPrincipal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFactuPrincipal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFactuPrincipal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFactuPrincipal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuPrincipal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuPrincipal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuPrincipal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFactuPrincipal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFactuPrincipal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFactuPrincipal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFactuPrincipal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFactuPrincipal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFactuPrincipal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFactuPrincipal.add(this.jMenuItemCerrarParametroFactuPrincipal);
			
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemNuevoParametroFactuPrincipal);
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemNuevoGuardarCambiosParametroFactuPrincipal);
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemNuevoRelacionesParametroFactuPrincipal);
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemGuardarCambiosTablaParametroFactuPrincipal);		
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemDuplicarParametroFactuPrincipal);		
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemCopiarParametroFactuPrincipal);		
			this.jmenuAccionesParametroFactuPrincipal.add(this.jMenuItemVerFormParametroFactuPrincipal);		
			
			this.jmenuDatosParametroFactuPrincipal.add(this.jMenuItemRecargarInformacionParametroFactuPrincipal);				
			this.jmenuDatosParametroFactuPrincipal.add(this.jMenuItemAnterioresParametroFactuPrincipal);				
			this.jmenuDatosParametroFactuPrincipal.add(this.jMenuItemSiguientesParametroFactuPrincipal);				
			this.jmenuDatosParametroFactuPrincipal.add(this.jMenuItemAbrirOrderByParametroFactuPrincipal);				
			this.jmenuDatosParametroFactuPrincipal.add(this.jMenuItemMostrarOcultarParametroFactuPrincipal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFactuPrincipal.add(this.jMenuItemGuardarCambiosParametroFactuPrincipal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFactuPrincipal.add(this.jmenuArchivoParametroFactuPrincipal);		
			this.jmenuBarParametroFactuPrincipal.add(this.jmenuAccionesParametroFactuPrincipal);		
			this.jmenuBarParametroFactuPrincipal.add(this.jmenuDatosParametroFactuPrincipal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFactuPrincipal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFactuPrincipal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableBoniParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableBoniParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Bonificaciones ");
		this.jButtonFK_IdCuentaContableBoniParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableBoniParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableBoniParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Bonificaciones ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableBoniParametroFactuPrincipal,"buscar_button","Buscar Por C. C. Bonificaciones ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableBoniParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setText("C. C. Bonificaciones :");
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setToolTipText("C. C. Bonificaciones");
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_boniFK_IdCuentaContableBoniParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableBoniid_cuenta_contable_boniParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdCuentaContableBoniDevolParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Dev. Bonificaciones ");
		this.jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Dev. Bonificaciones ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal,"buscar_button","Buscar Por C. C. Dev. Bonificaciones ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableBoniDevolParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setText("C. C. Dev. Bonificaciones :");
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setToolTipText("C. C. Dev. Bonificaciones");
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_boni_devolFK_IdCuentaContableBoniDevolParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableBoniDevolid_cuenta_contable_boni_devolParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdCuentaContableFinanParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFinanParametroFactuPrincipal.setToolTipText("Buscar Por C.C.Financiamiento ");
		this.jButtonFK_IdCuentaContableFinanParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableFinanParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableFinanParametroFactuPrincipal.setToolTipText("Buscar Por C.C.Financiamiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFinanParametroFactuPrincipal,"buscar_button","Buscar Por C.C.Financiamiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFinanParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setText("C.C.Financiamiento :");
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setToolTipText("C.C.Financiamiento");
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdCuentaContableFleteVentaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Flete En  Venta ");
		this.jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setToolTipText("Buscar Por C. C. Flete En  Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal,"buscar_button","Buscar Por C. C. Flete En  Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFleteVentaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setText("C. C. Flete En  Venta :");
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setToolTipText("C. C. Flete En  Venta");
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_flete_ventaFK_IdCuentaContableFleteVentaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFleteVentaid_cuenta_contable_flete_ventaParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdCuentaContableIceParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIceParametroFactuPrincipal.setToolTipText("Buscar Por C Contable Ice ");
		this.jButtonFK_IdCuentaContableIceParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableIceParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableIceParametroFactuPrincipal.setToolTipText("Buscar Por C Contable Ice ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIceParametroFactuPrincipal,"buscar_button","Buscar Por C Contable Ice ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIceParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setText("C Contable Ice :");
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setToolTipText("C Contable Ice");
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIceid_cuenta_contable_iceParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdCuentaContableOtroCargoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setToolTipText("Buscar Por C C. Otros Cargos ");
		this.jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setToolTipText("Buscar Por C C. Otros Cargos ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal,"buscar_button","Buscar Por C C. Otros Cargos ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableOtroCargoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal = new JLabelMe();
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setText("C C. Otros Cargos :");
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setToolTipText("C C. Otros Cargos");
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otro_cargoFK_IdCuentaContableOtroCargoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableOtroCargoid_cuenta_contable_otro_cargoParametroFactuPrincipal.setFocusable(false);

		this.jPanelFK_IdFormatoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoParametroFactuPrincipal.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdFormatoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdFormatoParametroFactuPrincipal.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoParametroFactuPrincipal,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal = new JLabelMe();
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal.setText("Formato :");
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLibroContableParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLibroContableParametroFactuPrincipal.setToolTipText("Buscar Por Libro Contable ");
		this.jButtonFK_IdLibroContableParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdLibroContableParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdLibroContableParametroFactuPrincipal.setToolTipText("Buscar Por Libro Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLibroContableParametroFactuPrincipal,"buscar_button","Buscar Por Libro Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLibroContableParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal = new JLabelMe();
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setText("Libro Contable :");
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setToolTipText("Libro Contable");
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_libro_contableFK_IdLibroContableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_libro_contableFK_IdLibroContableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoFacturaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setToolTipText("Buscar Por T Documento Factura ");
		this.jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setToolTipText("Buscar Por T Documento Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal,"buscar_button","Buscar Por T Documento Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoFacturaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setText("T Documento Factura :");
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setToolTipText("T Documento Factura");
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setToolTipText("Buscar Por T Doc Nota Credito ");
		this.jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setToolTipText("Buscar Por T Doc Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal,"buscar_button","Buscar Por T Doc Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setText("T Doc Nota Credito :");
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setToolTipText("T Doc Nota Credito");
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setToolTipText("Buscar Por T Doc Nota Debito ");
		this.jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setToolTipText("Buscar Por T Doc Nota Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal,"buscar_button","Buscar Por T Doc Nota Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setText("T Doc Nota Debito :");
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setToolTipText("T Doc Nota Debito");
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_debitoFK_IdTipoDocumentoNotaDebitoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoParamFactuDescuentoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setToolTipText("Buscar Por T  Descuento General ");
		this.jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setToolTipText("Buscar Por T  Descuento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal,"buscar_button","Buscar Por T  Descuento General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoParamFactuDescuentoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setText("T  Descuento General :");
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setToolTipText("T  Descuento General");
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_descuentoFK_IdTipoParamFactuDescuentoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setToolTipText("Buscar Por T  Listado Cliente/Prov ");
		this.jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setToolTipText("Buscar Por T  Listado Cliente/Prov ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal,"buscar_button","Buscar Por T  Listado Cliente/Prov ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setText("T  Listado Cliente/Prov :");
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setToolTipText("T  Listado Cliente/Prov");
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_listado_clienteFK_IdTipoParamFactuListadoClienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setToolTipText("Buscar Por T Secuencia De Trabajo ");
		this.jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal= new JButtonMe();
		this.jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setText("Buscar");
		this.jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setToolTipText("Buscar Por T Secuencia De Trabajo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal,"buscar_button","Buscar Por T Secuencia De Trabajo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal = new JLabelMe();
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setText("T Secuencia De Trabajo :");
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setToolTipText("T Secuencia De Trabajo");
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_secuencia_trabajoFK_IdTipoParamFactuSecuenciaTrabajoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFactuPrincipal=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFactuPrincipal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroFactuPrincipal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroFactuPrincipal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFactuPrincipal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFactuPrincipal = new ParametroFactuPrincipalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Principal  DATOS");
			this.jInternalFrameDetalleFormParametroFactuPrincipal = new ParametroFactuPrincipalDetalleFormJInternalFrame(jDesktopPane,this.parametrofactuprincipalSessionBean.getConGuardarRelaciones(),this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFactuPrincipal = null;//new ParametroFactuPrincipalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuPrincipal= new GridBagLayout();
		
		
		this.jTableDatosParametroFactuPrincipal = new JTableMe();      
		
		String sToolTipParametroFactuPrincipal="";
		sToolTipParametroFactuPrincipal=ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuPrincipal+="(Facturacion.ParametroFactuPrincipal)";
		}
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuPrincipal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFactuPrincipal.setToolTipText(sToolTipParametroFactuPrincipal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFactuPrincipal);
		this.jTableDatosParametroFactuPrincipal.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFactuPrincipal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFactuPrincipal.setRowSelectionAllowed(true);
		this.jTableDatosParametroFactuPrincipal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFactuPrincipal = new JButtonMe();
		this.jButtonDuplicarParametroFactuPrincipal = new JButtonMe();
		this.jButtonCopiarParametroFactuPrincipal = new JButtonMe();
		this.jButtonVerFormParametroFactuPrincipal = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFactuPrincipal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal = new JButtonMe();
		this.jButtonCerrarParametroFactuPrincipal = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuPrincipal = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFactuPrincipal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Principal ";
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuPrincipal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuPrincipal.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuPrincipal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setName("jPanelCamposFingeneralParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Documento"));
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setName("jPanelCamposFintipo_documentoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableParametroFactuPrincipal.setName("jPanelCamposFincontableParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden Despacho"));
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setName("jPanelCamposFinorden_despachoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioorden_despachoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Secuencial"));
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setName("jPanelCamposFinsecuencialParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciosecuencialParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion Producto Detalle"));
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setName("jPanelCamposFinconfiguracion_producto_detalleParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Cartera Pedido"));
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setName("jPanelCamposFincontrol_cartera_pedidoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion Factura"));
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setName("jPanelCamposFinconfiguracion_facturaParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setName("jPanelCamposFincuenta_contableParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroFactuPrincipal=new ReporteDinamicoJInternalFrame(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFactuPrincipal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFactuPrincipal=new ImportacionJInternalFrame(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFactuPrincipal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFactuPrincipal = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFactuPrincipal.setText("Orden");
		this.jButtonAbrirOrderByParametroFactuPrincipal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuPrincipal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuPrincipal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuPrincipal,false,this);
			
			//this.cargarOrderByParametroFactuPrincipal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuPrincipal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuPrincipal,true,this);
			
			//this.cargarOrderByParametroFactuPrincipal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFactuPrincipal.setMinimumSize(new Dimension(400,50));//4530
		this.jTableDatosParametroFactuPrincipal.setMaximumSize(new Dimension(400,50));//4530
		this.jTableDatosParametroFactuPrincipal.setPreferredSize(new Dimension(400,50));//4530
		
		this.jScrollPanelDatosParametroFactuPrincipal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuPrincipal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuPrincipal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFactuPrincipal.setText("Nuevo");
		this.jButtonDuplicarParametroFactuPrincipal.setText("Duplicar");
		this.jButtonCopiarParametroFactuPrincipal.setText("Copiar");
		this.jButtonVerFormParametroFactuPrincipal.setText("Ver");
		this.jButtonNuevoRelacionesParametroFactuPrincipal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.setText("Guardar");
		this.jButtonCerrarParametroFactuPrincipal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuPrincipal,"nuevo_button","Nuevo",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFactuPrincipal,"duplicar_button","Duplicar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFactuPrincipal,"copiar_button","Copiar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFactuPrincipal,"ver_form","Ver",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFactuPrincipal,"nuevorelaciones_button","Nuevo Rel",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuPrincipal,"guardarcambiostabla_button","Guardar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuPrincipal,"cerrar_button","Salir",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFactuPrincipal.setToolTipText("Nuevo"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFactuPrincipal.setToolTipText("Duplicar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFactuPrincipal.setToolTipText("Copiar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFactuPrincipal.setToolTipText("Ver"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFactuPrincipal.setToolTipText("Nuevo Rel"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.setToolTipText("Guardar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuPrincipal.setToolTipText("Salir"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuPrincipal";
		inputMap = this.jButtonNuevoParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuPrincipal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuPrincipal"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFactuPrincipal";
		inputMap = this.jButtonDuplicarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFactuPrincipal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFactuPrincipal"));
		
		//COPIAR
		sMapKey = "CopiarParametroFactuPrincipal";
		inputMap = this.jButtonCopiarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFactuPrincipal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFactuPrincipal"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFactuPrincipal";
		inputMap = this.jButtonVerFormParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFactuPrincipal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFactuPrincipal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFactuPrincipal";
		inputMap = this.jButtonNuevoRelacionesParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFactuPrincipal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFactuPrincipal";
		inputMap = this.jButtonModificarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFactuPrincipal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuPrincipal";
		inputMap = this.jButtonCerrarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuPrincipal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuPrincipal";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuPrincipal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFactuPrincipal.setName("jPanelParametrosReportesParametroFactuPrincipal"); 
		
		this.jPanelParametrosReportesAccionesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFactuPrincipal.setName("jPanelParametrosReportesAccionesParametroFactuPrincipal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFactuPrincipal = new JButtonMe();
		this.jButtonRecargarInformacionParametroFactuPrincipal.setText("Recargar");
		this.jButtonRecargarInformacionParametroFactuPrincipal.setToolTipText("Recargar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFactuPrincipal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFactuPrincipal = new JButtonMe();
		this.jButtonProcesarInformacionParametroFactuPrincipal.setText("Procesar");
		this.jButtonProcesarInformacionParametroFactuPrincipal.setToolTipText("Procesar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFactuPrincipal.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFactuPrincipal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuPrincipal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuPrincipal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFactuPrincipal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFactuPrincipal.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFactuPrincipal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFactuPrincipal.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFactuPrincipal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuPrincipal.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFactuPrincipal.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuPrincipal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFactuPrincipal = new JLabelMe();
		
		this.jLabelAccionesParametroFactuPrincipal.setText("Acciones");		
		this.jLabelAccionesParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFactuPrincipal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFactuPrincipal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFactuPrincipal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFactuPrincipal = new JButtonMe();
		//this.jButtonAnterioresParametroFactuPrincipal.setText("<<");
        this.jButtonAnterioresParametroFactuPrincipal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFactuPrincipal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFactuPrincipal = new JButtonMe();
		//this.jButtonSiguientesParametroFactuPrincipal.setText(">>");
        this.jButtonSiguientesParametroFactuPrincipal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFactuPrincipal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFactuPrincipal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFactuPrincipal.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFactuPrincipal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFactuPrincipal,"nuevoguardarcambios_button","Nue",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFactuPrincipal";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFactuPrincipal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFactuPrincipal";
		inputMap = this.jButtonRecargarInformacionParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFactuPrincipal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFactuPrincipal";
		inputMap = this.jButtonSiguientesParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFactuPrincipal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFactuPrincipal";
		inputMap = this.jButtonAnterioresParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFactuPrincipal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFactuPrincipal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFactuPrincipal.setMinimumSize(new Dimension(this.getWidth(),ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuPrincipal.setMaximumSize(new Dimension(this.getWidth(),ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuPrincipal.setPreferredSize(new Dimension(this.getWidth(),ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuPrincipalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFactuPrincipal = new GridBagLayout();

			this.jPanelPaginacionParametroFactuPrincipal.setLayout(gridaBagLayoutPaginacionParametroFactuPrincipal);						
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonAnterioresParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					
						
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
			
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonNuevoGuardarCambiosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
						
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonSiguientesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonNuevoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
						
			
			
			if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
				this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonGuardarCambiosTablaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			}
			
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonDuplicarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonCopiarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonVerFormParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 1;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFactuPrincipal.add(this.jButtonCerrarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
		
		
		this.jButtonRecargarInformacionParametroFactuPrincipal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuPrincipal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuPrincipal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuPrincipal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFactuPrincipal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuPrincipal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuPrincipal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuPrincipal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFactuPrincipal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuPrincipal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuPrincipal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFactuPrincipal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuPrincipal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuPrincipal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuPrincipal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuPrincipal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFactuPrincipal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuPrincipal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuPrincipal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFactuPrincipal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuPrincipal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuPrincipal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFactuPrincipal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFactuPrincipal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFactuPrincipal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFactuPrincipal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFactuPrincipal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFactuPrincipal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFactuPrincipal.setLayout(gridaBagParametrosReportesParametroFactuPrincipal);
			this.jPanelParametrosReportesAccionesParametroFactuPrincipal.setLayout(gridaBagParametrosReportesAccionesParametroFactuPrincipal);
			
			
			this.jPanelParametrosAuxiliar1ParametroFactuPrincipal.setLayout(gridaBagParametrosAuxiliar1ParametroFactuPrincipal);
			this.jPanelParametrosAuxiliar2ParametroFactuPrincipal.setLayout(gridaBagParametrosAuxiliar2ParametroFactuPrincipal);
			this.jPanelParametrosAuxiliar3ParametroFactuPrincipal.setLayout(gridaBagParametrosAuxiliar3ParametroFactuPrincipal);
			this.jPanelParametrosAuxiliar4ParametroFactuPrincipal.setLayout(gridaBagParametrosAuxiliar4ParametroFactuPrincipal);
			//this.jPanelParametrosAuxiliar5ParametroFactuPrincipal.setLayout(gridaBagParametrosAuxiliar2ParametroFactuPrincipal);			
			
			
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jButtonRecargarInformacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuPrincipal.add(this.jComboBoxTiposPaginacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuPrincipal.add(this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuPrincipal.add(this.jComboBoxTiposArchivosReportesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jPanelParametrosAuxiliar1ParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFactuPrincipal.add(this.jComboBoxTiposReportesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jPanelParametrosAuxiliar4ParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jComboBoxTiposReportesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jCheckBoxGenerarReporteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jPanelParametrosAuxiliar2ParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jLabelAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jButtonAbrirOrderByParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jComboBoxTiposSeleccionarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			
			
			/*
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jCheckBoxSeleccionarTodosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuPrincipal.add(this.jCheckBoxSeleccionarTodosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);															
				
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuPrincipal.add(this.jCheckBoxSeleccionadosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jPanelParametrosAuxiliar3ParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jComboBoxTiposAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	
				
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuPrincipal.add(this.jTextFieldValorCampoGeneralParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciogeneralParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciotipo_documentoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciotipo_documentoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocontableParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocontableParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocontableParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioorden_despachoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioorden_despachoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciosecuencialParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciosecuencialParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioconfiguracion_facturaParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioconfiguracion_facturaParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroFactuPrincipal);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFactuPrincipal = new GridBagLayout();

			this.jScrollPanelDatosParametroFactuPrincipal.setLayout(gridaBagLayoutDatosParametroFactuPrincipal);
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
			
			this.jScrollPanelDatosParametroFactuPrincipal.add(this.jTableDatosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFactuPrincipal.setViewportView(this.jTableDatosParametroFactuPrincipal);
		this.jTableDatosParametroFactuPrincipal.setFillsViewportHeight(true);
		this.jTableDatosParametroFactuPrincipal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuPrincipal= new GridBagLayout();
		this.jPanelAccionesParametroFactuPrincipal.setLayout(gridaBagLayoutAccionesParametroFactuPrincipal);
		
		
		/*	
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
			
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonNuevoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuPrincipal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;		
			//this.gridBagConstraintsParametroFactuPrincipal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuPrincipal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;		
		//this.gridBagConstraintsParametroFactuPrincipal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFactuPrincipal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);								
		
		
		/*
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		*/		
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuPrincipal.gridx =0;
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuPrincipal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
				
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFactuPrincipalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFactuPrincipal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuPrincipal = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFactuPrincipal.setLayout(gridaBagLayoutBusquedasParametrosParametroFactuPrincipal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFactuPrincipal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFactuPrincipal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFactuPrincipal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFactuPrincipal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFactuPrincipal.setName("jPanelReporteDinamicoParametroFactuPrincipal"); 
		
		this.jPanelReporteDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFactuPrincipal.setLayout(gridaBagLayoutReporteDinamicoParametroFactuPrincipal);
		
		
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuPrincipal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFactuPrincipal = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFactuPrincipal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jLabelColumnasSelectReporteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFactuPrincipal = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFactuPrincipal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFactuPrincipal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFactuPrincipal=new JScrollPane(this.jListColumnasSelectReporteParametroFactuPrincipal);
			
			this.jScrollColumnasSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jListColumnasSelectReporteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jScrollColumnasSelectReporteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFactuPrincipal = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFactuPrincipal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFactuPrincipal = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFactuPrincipal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFactuPrincipal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFactuPrincipal=new JScrollPane(this.jListRelacionesSelectReporteParametroFactuPrincipal);
			
			this.jScrollRelacionesSelectReporteParametroFactuPrincipal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuPrincipal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuPrincipal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFactuPrincipal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFactuPrincipal = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFactuPrincipal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jLabelGenerarExcelReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal.setToolTipText("Generar EXCEL"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jButtonGenerarExcelReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jComboBoxTiposReportesDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jLabelTiposArchivoReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFactuPrincipal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFactuPrincipal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFactuPrincipal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFactuPrincipal.setToolTipText("Generar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jButtonGenerarReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFactuPrincipal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFactuPrincipal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFactuPrincipal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFactuPrincipal.setToolTipText("Cancelar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuPrincipal.add(this.jButtonCerrarReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFactuPrincipal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal= new JScrollPane(jPanelReporteDinamicoParametroFactuPrincipal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFactuPrincipal);
		this.jInternalFrameReporteDinamicoParametroFactuPrincipal.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFactuPrincipal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFactuPrincipal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFactuPrincipal.setName("jPanelImportacionParametroFactuPrincipal"); 
		
		this.jPanelImportacionParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFactuPrincipal.setLayout(gridaBagLayoutImportacionParametroFactuPrincipal);
		
		
		this.jInternalFrameImportacionParametroFactuPrincipal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFactuPrincipal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFactuPrincipal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuPrincipal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFactuPrincipal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuPrincipal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFactuPrincipal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuPrincipal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuPrincipal.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFactuPrincipal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuPrincipal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFactuPrincipal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuPrincipal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuPrincipal.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuPrincipal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFactuPrincipal = new JLabelMe();

		this.jLabelArchivoImportacionParametroFactuPrincipal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuPrincipal.add(this.jLabelArchivoImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFactuPrincipal = new JFileChooser();		
		this.jFileChooserImportacionParametroFactuPrincipal.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFactuPrincipal = new JButtonMe();
		this.jButtonAbrirImportacionParametroFactuPrincipal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFactuPrincipal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFactuPrincipal.setToolTipText("Generar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuPrincipal.add(this.jButtonAbrirImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFactuPrincipal = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFactuPrincipal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuPrincipal.add(this.jLabelPathArchivoImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFactuPrincipal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFactuPrincipal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuPrincipal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuPrincipal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuPrincipal.add(this.jTextFieldPathArchivoImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFactuPrincipal = new JButtonMe();
		this.jButtonGenerarImportacionParametroFactuPrincipal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFactuPrincipal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFactuPrincipal.setToolTipText("Generar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuPrincipal.add(this.jButtonGenerarImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFactuPrincipal = new JButtonMe();
		this.jButtonCerrarImportacionParametroFactuPrincipal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFactuPrincipal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFactuPrincipal.setToolTipText("Cancelar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuPrincipal.add(this.jButtonCerrarImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFactuPrincipal = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFactuPrincipal= new JScrollPane(jPanelImportacionParametroFactuPrincipal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFactuPrincipal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFactuPrincipal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFactuPrincipal);
		this.jInternalFrameImportacionParametroFactuPrincipal.getContentPane().add(this.jScrollPanelImportacionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFactuPrincipal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFactuPrincipal = new JButtonMe();
			this.jButtonAbrirOrderByParametroFactuPrincipal.setText("Orden");
			this.jButtonAbrirOrderByParametroFactuPrincipal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuPrincipal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFactuPrincipal";
			inputMap = this.jButtonAbrirOrderByParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFactuPrincipal"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFactuPrincipal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFactuPrincipal.setName("jPanelOrderByParametroFactuPrincipal"); 
			
			this.jPanelOrderByParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFactuPrincipal.setLayout(gridaBagLayoutOrderByParametroFactuPrincipal);
			
			
			this.jTableDatosParametroFactuPrincipalOrderBy = new JTableMe();        
			this.jTableDatosParametroFactuPrincipalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFactuPrincipalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFactuPrincipalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFactuPrincipalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFactuPrincipalOrderBy.setViewportView(this.jTableDatosParametroFactuPrincipalOrderBy);
			this.jTableDatosParametroFactuPrincipalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFactuPrincipalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFactuPrincipal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFactuPrincipal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFactuPrincipal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFactuPrincipal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFactuPrincipal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFactuPrincipal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFactuPrincipal.setTitle("Orden");
			this.jInternalFrameOrderByParametroFactuPrincipal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFactuPrincipal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFactuPrincipal.setResizable(true);
			this.jInternalFrameOrderByParametroFactuPrincipal.setClosable(true);
			this.jInternalFrameOrderByParametroFactuPrincipal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFactuPrincipal.ipady =150;
				
			this.jPanelOrderByParametroFactuPrincipal.add(jScrollPanelDatosParametroFactuPrincipalOrderBy, this.gridBagConstraintsParametroFactuPrincipal);//this.jTableDatosParametroFactuPrincipalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFactuPrincipal = new JButtonMe();
			this.jButtonCerrarOrderByParametroFactuPrincipal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFactuPrincipal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFactuPrincipal.setToolTipText("Cancelar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFactuPrincipal.add(this.jButtonCerrarOrderByParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFactuPrincipal = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFactuPrincipal= new JScrollPane(jPanelOrderByParametroFactuPrincipal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFactuPrincipal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFactuPrincipal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFactuPrincipal);
			
			this.jInternalFrameOrderByParametroFactuPrincipal.getContentPane().add(this.jScrollPanelOrderByParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
		
		} else {
			this.jButtonAbrirOrderByParametroFactuPrincipal = new JButtonMe();
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
		int iWidthTableCalculado=0;//9130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=4530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofactuprincipalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFactuPrincipal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFactuPrincipal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFactuPrincipal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFactuPrincipal.getRowHeight();//ParametroFactuPrincipalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.isSelected()) {
					iHeightTable=ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuPrincipal.isSelected()) {
					iHeightTable=ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuPrincipalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFactuPrincipal!=null && this.jInternalFrameOrderByParametroFactuPrincipal.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFactuPrincipal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFactuPrincipal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFactuPrincipal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFactuPrincipal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFactuPrincipal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFactuPrincipal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFactuPrincipal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofactuprincipalLogic.getParametroFactuPrincipals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofactuprincipals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFactuPrincipal> TraerParametroFactuPrincipalBeans(List<ParametroFactuPrincipal> parametrofactuprincipals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFactuPrincipal parametrofactuprincipal:parametrofactuprincipals) {
					
				if(!(ParametroFactuPrincipalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFactuPrincipalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofactuprincipal.setsDetalleGeneralEntityReporte(ParametroFactuPrincipalConstantesFunciones.getParametroFactuPrincipalDescripcion(parametrofactuprincipal));
										
					parametrofactuprincipal.seten_linea_descripcion(ParametroFactuPrincipalConstantesFunciones.geten_lineaDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_cuenta_tipo_cliente_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_cuenta_tipo_clienteDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_cliente_impuesto_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_cliente_impuestoDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_impresion_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_impresionDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_secuencial_usuario_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_secuencial_usuarioDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_secuencial_editable_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_secuencial_editableDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_precio_por_cliente_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_precio_por_clienteDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_modificar_precio_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_modificar_precioDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_modificar_servicio_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_modificar_servicioDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_cambiar_unidad_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_cambiar_unidadDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_activar_serie_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_activar_serieDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_activar_lote_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_activar_loteDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_activar_multi_empresa_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_activar_multi_empresaDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_centro_costos_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_centro_costosDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_unidades_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_unidadesDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_cupo_disponible_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_cupo_disponibleDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_forma_pago_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_forma_pagoDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_envio_mail_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_envio_mailDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_autorizar_proforma_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_autorizar_proformaDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_bloqueo_pedido_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_bloqueo_pedidoDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_control_anticipo_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_control_anticipoDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_factura_auto_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_factura_autoDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_grabar_valor_cero_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_grabar_valor_ceroDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_agregar_item_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_agregar_itemDescripcion(parametrofactuprincipal));parametrofactuprincipal.setcon_sin_factura_descripcion(ParametroFactuPrincipalConstantesFunciones.getcon_sin_facturaDescripcion(parametrofactuprincipal));	
					
						
					
				} else  {
							
					//parametrofactuprincipal.setsDetalleGeneralEntityReporte(parametrofactuprincipal.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofactuprincipalbeans.add(parametrofactuprincipalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofactuprincipals;
    }
	//PARA REPORTES FIN
}
