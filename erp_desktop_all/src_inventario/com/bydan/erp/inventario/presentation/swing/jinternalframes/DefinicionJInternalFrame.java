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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
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
import com.bydan.erp.inventario.util.DefinicionConstantesFunciones;

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
public class DefinicionJInternalFrame extends DefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDefinicion;
	
	protected JMenuBar jmenuBarDefinicion;
	
	protected JMenu jmenuDefinicion;
	protected JMenu jmenuDatosDefinicion;
	protected JMenu jmenuArchivoDefinicion;
	protected JMenu jmenuAccionesDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDefinicion;	
	protected GridBagConstraints gridBagConstraintsDefinicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DefinicionDetalleFormJInternalFrame jInternalFrameDetalleFormDefinicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDefinicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDefinicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoDefinicionBeanSwingJInternalFrame tipodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodefinicion="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIvaItemBeanSwingJInternalFrame tipoivaitemBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoivaitem="";

	protected TipoGlobalClienteBeanSwingJInternalFrame tipoglobalclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoglobalcliente="";

	protected TipoCosteoDefinicionBeanSwingJInternalFrame tipocosteodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosteodefinicion="";

	protected TipoCostoDefinicionBeanSwingJInternalFrame tipocostodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocostodefinicion="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected LibroContableBeanSwingJInternalFrame librocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_librocontable="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public DefinicionSessionBean definicionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoDefinicionSessionBean tipodefinicionSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIvaItemSessionBean tipoivaitemSessionBean;
	public TipoGlobalClienteSessionBean tipoglobalclienteSessionBean;
	public TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean;
	public TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public LibroContableSessionBean librocontableSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Definicion> definicions;		
	public List<Definicion> definicionsEliminados;	
	public List<Definicion> definicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDefinicion;		
	protected JButton jButtonAbrirOrderByDefinicion;
	
	
	//protected JPanel jPanelOrderByDefinicion;
	//public JScrollPane jScrollPanelOrderByDefinicion;	
	//protected JButton jButtonCerrarOrderByDefinicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DefinicionLogic definicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDefinicion;
	public JScrollPane jScrollPanelDatosEdicionDefinicion;
	public JScrollPane jScrollPanelDatosGeneralDefinicion;
    
	
	
	//public JScrollPane jScrollPanelDatosDefinicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDefinicion;
	//public JScrollPane jScrollPanelImportacionDefinicion;
	
	
	
	protected JPanel jPanelAccionesDefinicion;
	
    protected JPanel jPanelPaginacionDefinicion;
    protected JPanel jPanelParametrosReportesDefinicion;
	protected JPanel jPanelParametrosReportesAccionesDefinicion;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciobasicoDefinicion;
	protected Integer iXPanelCamposIniciobasicoDefinicion=0;
	protected Integer iYPanelCamposIniciobasicoDefinicion=0;

	protected JPanel jPanelCamposIniciorecargosDefinicion;
	protected Integer iXPanelCamposIniciorecargosDefinicion=0;
	protected Integer iYPanelCamposIniciorecargosDefinicion=0;

	protected JPanel jPanelCamposIniciogeneralDefinicion;
	protected Integer iXPanelCamposIniciogeneralDefinicion=0;
	protected Integer iYPanelCamposIniciogeneralDefinicion=0;

	protected JPanel jPanelCamposIniciotipo_documentoDefinicion;
	protected Integer iXPanelCamposIniciotipo_documentoDefinicion=0;
	protected Integer iYPanelCamposIniciotipo_documentoDefinicion=0;

	protected JPanel jPanelCamposInicioanticipos_otrosDefinicion;
	protected Integer iXPanelCamposInicioanticipos_otrosDefinicion=0;
	protected Integer iYPanelCamposInicioanticipos_otrosDefinicion=0;

	protected JPanel jPanelCamposIniciolistas_preciosDefinicion;
	protected Integer iXPanelCamposIniciolistas_preciosDefinicion=0;
	protected Integer iYPanelCamposIniciolistas_preciosDefinicion=0;

	protected JPanel jPanelCamposInicioseries_archivosDefinicion;
	protected Integer iXPanelCamposInicioseries_archivosDefinicion=0;
	protected Integer iYPanelCamposInicioseries_archivosDefinicion=0;

	protected JPanel jPanelCamposIniciootrosDefinicion;
	protected Integer iXPanelCamposIniciootrosDefinicion=0;
	protected Integer iYPanelCamposIniciootrosDefinicion=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Definicion;
	protected JPanel jPanelParametrosAuxiliar2Definicion;
	protected JPanel jPanelParametrosAuxiliar3Definicion;
	protected JPanel jPanelParametrosAuxiliar4Definicion;
	//protected JPanel jPanelParametrosAuxiliar5Definicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDefinicion;
	//protected JPanel jPanelImportacionDefinicion;
	
	
	public JTable jTableDatosDefinicion;
	
	
	
	//public JTable jTableDatosDefinicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDefinicion;
	protected JButton jButtonDuplicarDefinicion;
	protected JButton jButtonCopiarDefinicion;
	protected JButton jButtonVerFormDefinicion;
	protected JButton jButtonNuevoRelacionesDefinicion;
	protected JButton jButtonModificarDefinicion;
	
    protected JButton jButtonGuardarCambiosTablaDefinicion;
	protected JButton jButtonCerrarDefinicion;
	
	
	protected JButton jButtonRecargarInformacionDefinicion;
	protected JButton jButtonProcesarInformacionDefinicion;
	
	
	protected JButton jButtonAnterioresDefinicion;
	protected JButton jButtonSiguientesDefinicion;
	protected JButton jButtonNuevoGuardarCambiosDefinicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDefinicion;
	//protected JButton jButtonCerrarReporteDinamicoDefinicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDefinicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDefinicion;
	//protected JButton jButtonGenerarImportacionDefinicion;
	//protected JButton jButtonCerrarImportacionDefinicion;
	//protected JFileChooser jFileChooserImportacionDefinicion;
	//protected File fileImportacionDefinicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDefinicion;
	protected JButton jButtonDuplicarToolBarDefinicion;
	protected JButton jButtonNuevoRelacionesToolBarDefinicion;
	
	
	public JButton jButtonGuardarCambiosToolBarDefinicion;
	protected JButton jButtonCopiarToolBarDefinicion;
	protected JButton jButtonVerFormToolBarDefinicion;
	public JButton jButtonGuardarCambiosTablaToolBarDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarDefinicion;
	protected JButton jButtonCerrarToolBarDefinicion;
	
	protected JButton jButtonRecargarInformacionToolBarDefinicion;
	protected JButton jButtonProcesarInformacionToolBarDefinicion;
	protected JButton jButtonAnterioresToolBarDefinicion;
	protected JButton jButtonSiguientesToolBarDefinicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDefinicion;
	protected JButton jButtonAbrirOrderByToolBarDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDefinicion;
	protected JMenuItem jMenuItemDuplicarDefinicion;
	protected JMenuItem jMenuItemNuevoRelacionesDefinicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDefinicion;
	protected JMenuItem jMenuItemCopiarDefinicion;
	protected JMenuItem jMenuItemVerFormDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDefinicion;
	protected JMenuItem jMenuItemCerrarDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarDefinicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDefinicion;
	
	protected JMenuItem jMenuItemRecargarInformacionDefinicion;
	protected JMenuItem jMenuItemProcesarInformacionDefinicion;
	protected JMenuItem jMenuItemAnterioresDefinicion;
	protected JMenuItem jMenuItemSiguientesDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDefinicion;
	protected JMenuItem jMenuItemAbrirOrderByDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDefinicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDefinicion;
	protected JCheckBox jCheckBoxSeleccionadosDefinicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDefinicion;
	protected JCheckBox jCheckBoxConGraficoReporteDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDefinicion;
	protected JTextField jTextFieldValorCampoGeneralDefinicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDefinicion;
	//public JList<Reporte> jListColumnasSelectReporteDefinicion;
	//public JScrollPane jScrollColumnasSelectReporteDefinicion;
	
	//public JLabel jLabelRelacionesSelectReporteDefinicion;
	//public JList<Reporte> jListRelacionesSelectReporteDefinicion;
	//public JScrollPane jScrollRelacionesSelectReporteDefinicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDefinicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDefinicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDefinicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDefinicion;
	
		
	//public JLabel jLabelArchivoImportacionDefinicion;	
	//public JLabel jLabelPathArchivoImportacionDefinicion;
	//protected JTextField jTextFieldPathArchivoImportacionDefinicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDefinicion;
	
	//public JLabel jLabelColumnaCategoriaValorDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDefinicion;
	
	//public JLabel jLabelColumnasValoresGraficoDefinicion;
	//public JList<Reporte> jListColumnasValoresGraficoDefinicion;
	//public JScrollPane jScrollColumnasValoresGraficoDefinicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDefinicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDefinicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDefinicion;
	public JPanel jPanelFK_IdCuentaContableDefinicion;
	public JButton jButtonFK_IdCuentaContableDefinicion;
	public JPanel jPanelFK_IdLibroContableDefinicion;
	public JButton jButtonFK_IdLibroContableDefinicion;
	public JPanel jPanelFK_IdSucursalDefinicion;
	public JButton jButtonFK_IdSucursalDefinicion;
	public JPanel jPanelFK_IdTipoCosteoDefinicionDefinicion;
	public JButton jButtonFK_IdTipoCosteoDefinicionDefinicion;
	public JPanel jPanelFK_IdTipoCostoDefinicionDefinicion;
	public JButton jButtonFK_IdTipoCostoDefinicionDefinicion;
	public JPanel jPanelFK_IdTipoDefinicionDefinicion;
	public JButton jButtonFK_IdTipoDefinicionDefinicion;
	public JPanel jPanelFK_IdTipoDocumentoDefinicion;
	public JButton jButtonFK_IdTipoDocumentoDefinicion;
	public JPanel jPanelFK_IdTipoGlobalClienteDefinicion;
	public JButton jButtonFK_IdTipoGlobalClienteDefinicion;
	public JPanel jPanelFK_IdTipoIvaItemDefinicion;
	public JButton jButtonFK_IdTipoIvaItemDefinicion;
	public JPanel jPanelFK_IdTipoRetencionDefinicion;
	public JButton jButtonFK_IdTipoRetencionDefinicion;
	public JPanel jPanelFK_IdTipoTransaccionModuloDefinicion;
	public JButton jButtonFK_IdTipoTransaccionModuloDefinicion;
	public JPanel jPanelFK_IdTipoTributarioDefinicion;
	public JButton jButtonFK_IdTipoTributarioDefinicion;
	public JPanel jPanelFK_IdTransaccionDefinicion;
	public JButton jButtonFK_IdTransaccionDefinicion;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableDefinicion;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDefinicion= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDefinicionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDefinicionArbol= new JButtonMe();

	
	public JPanel jPanelid_libro_contableFK_IdLibroContableDefinicion;
	public JLabel jLabelid_libro_contableFK_IdLibroContableDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_libro_contableFK_IdLibroContableDefinicion;
	public JButton jButtonid_libro_contableFK_IdLibroContableDefinicion= new JButtonMe();
	public JButton jButtonid_libro_contableFK_IdLibroContableDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_libro_contableFK_IdLibroContableDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursalFK_IdSucursalDefinicion;
	public JLabel jLabelid_sucursalFK_IdSucursalDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFK_IdSucursalDefinicion;
	public JButton jButtonid_sucursalFK_IdSucursalDefinicion= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion;
	public JLabel jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion;
	public JButton jButtonid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion;
	public JLabel jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion;
	public JButton jButtonid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_definicionFK_IdTipoDefinicionDefinicion;
	public JLabel jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion;
	public JButton jButtonid_tipo_definicionFK_IdTipoDefinicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_definicionFK_IdTipoDefinicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_definicionFK_IdTipoDefinicionDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoDefinicion;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion;
	public JLabel jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion;
	public JButton jButtonid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion;
	public JLabel jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion;
	public JButton jButtonid_tipo_iva_itemFK_IdTipoIvaItemDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_iva_itemFK_IdTipoIvaItemDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_iva_itemFK_IdTipoIvaItemDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionDefinicion;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tributarioFK_IdTipoTributarioDefinicion;
	public JLabel jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion;
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionDefinicion;
	public JLabel jLabelid_transaccionFK_IdTransaccionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionDefinicion;
	public JButton jButtonid_transaccionFK_IdTransaccionDefinicion= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDefinicionBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=2442;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DefinicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDefinicion)	{
		this.jButtonRecargarInformacionDefinicion = jButtonRecargarInformacionDefinicion;
	}
	
	public JButton getjButtonProcesarInformacionDefinicion() {
		return this.jButtonProcesarInformacionDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDefinicion)	{
		this.jButtonProcesarInformacionDefinicion = jButtonProcesarInformacionDefinicion;
	}
	
	
	public JButton getjButtonRecargarInformacionDefinicion() {
		return this.jButtonRecargarInformacionDefinicion;
	}
	
	
	public List<Definicion> getdefinicions() {
		return this.definicions;
	}

	public void setdefinicions(List<Definicion> definicions) {
		this.definicions = definicions;
	}
	
	public List<Definicion> getdefinicionsAux() {
		return this.definicionsAux;
	}

	public void setdefinicionsAux(List<Definicion> definicionsAux) {
		this.definicionsAux = definicionsAux;
	}
	
	public List<Definicion> getdefinicionsEliminados() {
		return this.definicionsEliminados;
	}

	public void setDefinicionsEliminados(List<Definicion> definicionsEliminados) {
		this.definicionsEliminados = definicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDefinicion() {
		return jComboBoxTiposSeleccionarDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDefinicion(
			JComboBox jComboBoxTiposSeleccionarDefinicion) {
		this.jComboBoxTiposSeleccionarDefinicion = jComboBoxTiposSeleccionarDefinicion;
	}
	
	public void setBorderResaltarTiposSeleccionarDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDefinicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDefinicion() {
		return jTextFieldValorCampoGeneralDefinicion;
	}

	public void setjTextFieldValorCampoGeneralDefinicion(
			JTextField jTextFieldValorCampoGeneralDefinicion) {
		this.jTextFieldValorCampoGeneralDefinicion = jTextFieldValorCampoGeneralDefinicion;
	}

	public void setBorderResaltarValorCampoGeneralDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDefinicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDefinicion() {
		return this.jCheckBoxSeleccionarTodosDefinicion;
	}

	public void setjCheckBoxSeleccionarTodosDefinicion(
			JCheckBox jCheckBoxSeleccionarTodosDefinicion) {
		this.jCheckBoxSeleccionarTodosDefinicion = jCheckBoxSeleccionarTodosDefinicion;
	}

	public void setBorderResaltarSeleccionarTodosDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDefinicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDefinicion() {
		return this.jCheckBoxSeleccionadosDefinicion;
	}

	public void setjCheckBoxSeleccionadosDefinicion(
			JCheckBox jCheckBoxSeleccionadosDefinicion) {
		this.jCheckBoxSeleccionadosDefinicion = jCheckBoxSeleccionadosDefinicion;
	}
	
	public void setBorderResaltarSeleccionadosDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDefinicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDefinicion() {
		return this.jComboBoxTiposArchivosReportesDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDefinicion(
			JComboBox jComboBoxTiposArchivosReportesDefinicion) {
		this.jComboBoxTiposArchivosReportesDefinicion = jComboBoxTiposArchivosReportesDefinicion;
	}

	public void setBorderResaltarTiposArchivosReportesDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDefinicion() {
		return this.jComboBoxTiposReportesDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDefinicion(
			JComboBox jComboBoxTiposReportesDefinicion) {
		this.jComboBoxTiposReportesDefinicion = jComboBoxTiposReportesDefinicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDefinicion() {
	//	return jComboBoxTiposReportesDinamicoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDefinicion(
	//		JComboBox jComboBoxTiposReportesDinamicoDefinicion) {
	//	this.jComboBoxTiposReportesDinamicoDefinicion = jComboBoxTiposReportesDinamicoDefinicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDefinicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDefinicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDefinicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDefinicion = jComboBoxTiposArchivosReportesDinamicoDefinicion;
	//}
	
	public void setBorderResaltarTiposReportesDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDefinicion() {
		return this.jComboBoxTiposGraficosReportesDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDefinicion(
			JComboBox jComboBoxTiposGraficosReportesDefinicion) {
		this.jComboBoxTiposGraficosReportesDefinicion = jComboBoxTiposGraficosReportesDefinicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDefinicion() {
		return this.jComboBoxTiposPaginacionDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDefinicion(
			JComboBox jComboBoxTiposPaginacionDefinicion) {
		this.jComboBoxTiposPaginacionDefinicion = jComboBoxTiposPaginacionDefinicion;
	}
	
	public void setBorderResaltarTiposPaginacionDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDefinicion() {
		return this.jComboBoxTiposRelacionesDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDefinicion() {
		return this.jComboBoxTiposAccionesDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDefinicion(
			JComboBox jComboBoxTiposRelacionesDefinicion) {
		this.jComboBoxTiposRelacionesDefinicion = jComboBoxTiposRelacionesDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDefinicion(
			JComboBox jComboBoxTiposAccionesDefinicion) {
		this.jComboBoxTiposAccionesDefinicion = jComboBoxTiposAccionesDefinicion;
	}
	
	public void setBorderResaltarTiposRelacionesDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDefinicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDefinicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDefinicion() {
	//	return jCheckBoxConGraficoDinamicoDefinicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDefinicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDefinicion) {
	//	this.jCheckBoxConGraficoDinamicoDefinicion = jCheckBoxConGraficoDinamicoDefinicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDefinicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDefinicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDefinicion .setBorder(borderResaltar);		
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
		this.definicionSessionBean=new DefinicionSessionBean();
		
		this.definicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.definicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.definicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 5250) {
			iWidth=5250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
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
		
		DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDefinicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDefinicion,this.jTtoolBarDefinicion,
							"nuevo","nuevo","Nuevo"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDefinicion,this.jTtoolBarDefinicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDefinicion,this.jTtoolBarDefinicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDefinicion,this.jTtoolBarDefinicion,
							"duplicar","duplicar","Duplicar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDefinicion,this.jTtoolBarDefinicion,
							"copiar","copiar","Copiar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDefinicion,this.jTtoolBarDefinicion,
							"ver_form","ver_form","Ver"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefinicion,this.jTtoolBarDefinicion,
							"recargar","recargar","Recargar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefinicion,this.jTtoolBarDefinicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefinicion,this.jTtoolBarDefinicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDefinicion,this.jTtoolBarDefinicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDefinicion,this.jTtoolBarDefinicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDefinicion,this.jTtoolBarDefinicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDefinicion,this.jTtoolBarDefinicion,
							"cerrar","cerrar","Salir"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDefinicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDefinicion;
			
				this.jButtonProcesarInformacionToolBarDefinicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDefinicion;
				
		//protected JButton jButtonModificarToolBarDefinicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDefinicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDefinicion=new JMenuMe("General");
		this.jmenuArchivoDefinicion=new JMenuMe("Archivo");
		this.jmenuAccionesDefinicion=new JMenuMe("Acciones");
		this.jmenuDatosDefinicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDefinicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDefinicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDefinicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDefinicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDefinicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDefinicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDefinicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDefinicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDefinicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDefinicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDefinicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDefinicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDefinicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDefinicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDefinicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDefinicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDefinicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDefinicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDefinicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDefinicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDefinicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDefinicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDefinicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDefinicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDefinicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDefinicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDefinicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDefinicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDefinicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDefinicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDefinicion.add(this.jMenuItemCerrarDefinicion);
			
			this.jmenuAccionesDefinicion.add(this.jMenuItemNuevoDefinicion);
			this.jmenuAccionesDefinicion.add(this.jMenuItemNuevoGuardarCambiosDefinicion);
			this.jmenuAccionesDefinicion.add(this.jMenuItemNuevoRelacionesDefinicion);
			this.jmenuAccionesDefinicion.add(this.jMenuItemGuardarCambiosTablaDefinicion);		
			this.jmenuAccionesDefinicion.add(this.jMenuItemDuplicarDefinicion);		
			this.jmenuAccionesDefinicion.add(this.jMenuItemCopiarDefinicion);		
			this.jmenuAccionesDefinicion.add(this.jMenuItemVerFormDefinicion);		
			
			this.jmenuDatosDefinicion.add(this.jMenuItemRecargarInformacionDefinicion);				
			this.jmenuDatosDefinicion.add(this.jMenuItemAnterioresDefinicion);				
			this.jmenuDatosDefinicion.add(this.jMenuItemSiguientesDefinicion);				
			this.jmenuDatosDefinicion.add(this.jMenuItemAbrirOrderByDefinicion);				
			this.jmenuDatosDefinicion.add(this.jMenuItemMostrarOcultarDefinicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDefinicion.add(this.jMenuItemGuardarCambiosDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDefinicion.add(this.jmenuArchivoDefinicion);		
			this.jmenuBarDefinicion.add(this.jmenuAccionesDefinicion);		
			this.jmenuBarDefinicion.add(this.jmenuDatosDefinicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDefinicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDefinicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDefinicion.setToolTipText("Buscar Por Cuenta Contable. ");
		this.jButtonFK_IdCuentaContableDefinicion= new JButtonMe();
		this.jButtonFK_IdCuentaContableDefinicion.setText("Buscar");
		this.jButtonFK_IdCuentaContableDefinicion.setToolTipText("Buscar Por Cuenta Contable. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDefinicion,"buscar_button","Buscar Por Cuenta Contable. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion.setText("Cuenta Contable. :");
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion.setToolTipText("Cuenta Contable.");
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLibroContableDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLibroContableDefinicion.setToolTipText("Buscar Por Libro ");
		this.jButtonFK_IdLibroContableDefinicion= new JButtonMe();
		this.jButtonFK_IdLibroContableDefinicion.setText("Buscar");
		this.jButtonFK_IdLibroContableDefinicion.setToolTipText("Buscar Por Libro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLibroContableDefinicion,"buscar_button","Buscar Por Libro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLibroContableDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_libro_contableFK_IdLibroContableDefinicion = new JLabelMe();
		jLabelid_libro_contableFK_IdLibroContableDefinicion.setText("Libro :");
		jLabelid_libro_contableFK_IdLibroContableDefinicion.setToolTipText("Libro");
		jLabelid_libro_contableFK_IdLibroContableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_libro_contableFK_IdLibroContableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_libro_contableFK_IdLibroContableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_libro_contableFK_IdLibroContableDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_libro_contableFK_IdLibroContableDefinicion= new JComboBoxMe();
		jComboBoxid_libro_contableFK_IdLibroContableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableFK_IdLibroContableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableFK_IdLibroContableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_libro_contableFK_IdLibroContableDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalDefinicion.setToolTipText("Buscar Por Sucursal ");
		this.jButtonFK_IdSucursalDefinicion= new JButtonMe();
		this.jButtonFK_IdSucursalDefinicion.setText("Buscar");
		this.jButtonFK_IdSucursalDefinicion.setToolTipText("Buscar Por Sucursal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalDefinicion,"buscar_button","Buscar Por Sucursal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursalFK_IdSucursalDefinicion = new JLabelMe();
		jLabelid_sucursalFK_IdSucursalDefinicion.setText("Sucursal :");
		jLabelid_sucursalFK_IdSucursalDefinicion.setToolTipText("Sucursal");
		jLabelid_sucursalFK_IdSucursalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFK_IdSucursalDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursalFK_IdSucursalDefinicion= new JComboBoxMe();
		jComboBoxid_sucursalFK_IdSucursalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFK_IdSucursalDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCosteoDefinicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCosteoDefinicionDefinicion.setToolTipText("Buscar Por T. Costeo ");
		this.jButtonFK_IdTipoCosteoDefinicionDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoCosteoDefinicionDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoCosteoDefinicionDefinicion.setToolTipText("Buscar Por T. Costeo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCosteoDefinicionDefinicion,"buscar_button","Buscar Por T. Costeo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCosteoDefinicionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion = new JLabelMe();
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setText("T. Costeo :");
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setToolTipText("T. Costeo");
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCostoDefinicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCostoDefinicionDefinicion.setToolTipText("Buscar Por T. Costo ");
		this.jButtonFK_IdTipoCostoDefinicionDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoCostoDefinicionDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoCostoDefinicionDefinicion.setToolTipText("Buscar Por T. Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCostoDefinicionDefinicion,"buscar_button","Buscar Por T. Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCostoDefinicionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion = new JLabelMe();
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setText("T. Costo :");
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setToolTipText("T. Costo");
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDefinicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDefinicionDefinicion.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoDefinicionDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoDefinicionDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoDefinicionDefinicion.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDefinicionDefinicion,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDefinicionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion = new JLabelMe();
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion.setText("Tipo :");
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion.setToolTipText("Tipo");
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoDefinicion.setToolTipText("Buscar Por Tipo Documento ");
		this.jButtonFK_IdTipoDocumentoDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoDefinicion.setToolTipText("Buscar Por Tipo Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoDefinicion,"buscar_button","Buscar Por Tipo Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion.setText("Tipo Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGlobalClienteDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGlobalClienteDefinicion.setToolTipText("Buscar Por T. Cliente ");
		this.jButtonFK_IdTipoGlobalClienteDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoGlobalClienteDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoGlobalClienteDefinicion.setToolTipText("Buscar Por T. Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGlobalClienteDefinicion,"buscar_button","Buscar Por T. Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGlobalClienteDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion = new JLabelMe();
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setText("T. Cliente :");
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setToolTipText("T. Cliente");
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIvaItemDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIvaItemDefinicion.setToolTipText("Buscar Por Iva Item ");
		this.jButtonFK_IdTipoIvaItemDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoIvaItemDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoIvaItemDefinicion.setToolTipText("Buscar Por Iva Item ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIvaItemDefinicion,"buscar_button","Buscar Por Iva Item ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIvaItemDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion = new JLabelMe();
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setText("Iva Item :");
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setToolTipText("Iva Item");
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionDefinicion.setToolTipText("Buscar Por Cod Ret. ");
		this.jButtonFK_IdTipoRetencionDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoRetencionDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoRetencionDefinicion.setToolTipText("Buscar Por Cod Ret. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionDefinicion,"buscar_button","Buscar Por Cod Ret. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion.setText("Cod Ret. :");
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion.setToolTipText("Cod Ret.");
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloDefinicion.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloDefinicion.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloDefinicion,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioDefinicion.setToolTipText("Buscar Por Sustento Trib. ");
		this.jButtonFK_IdTipoTributarioDefinicion= new JButtonMe();
		this.jButtonFK_IdTipoTributarioDefinicion.setText("Buscar");
		this.jButtonFK_IdTipoTributarioDefinicion.setToolTipText("Buscar Por Sustento Trib. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioDefinicion,"buscar_button","Buscar Por Sustento Trib. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion = new JLabelMe();
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion.setText("Sustento Trib. :");
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion.setToolTipText("Sustento Trib.");
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDefinicion.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionDefinicion= new JButtonMe();
		this.jButtonFK_IdTransaccionDefinicion.setText("Buscar");
		this.jButtonFK_IdTransaccionDefinicion.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDefinicion,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionDefinicion = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionDefinicion.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionDefinicion.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionDefinicion= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDefinicion=new JTabbedPane();


		this.jTabbedPaneBusquedasDefinicion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDefinicion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDefinicion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDefinicion = new DefinicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Definicion DATOS");
			this.jInternalFrameDetalleFormDefinicion = new DefinicionDetalleFormJInternalFrame(jDesktopPane,this.definicionSessionBean.getConGuardarRelaciones(),this.definicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDefinicion = null;//new DefinicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDefinicion= new GridBagLayout();
		
		
		this.jTableDatosDefinicion = new JTableMe();      
		
		String sToolTipDefinicion="";
		sToolTipDefinicion=DefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDefinicion+="(Inventario.Definicion)";
		}
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDefinicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDefinicion.setToolTipText(sToolTipDefinicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDefinicion);
		this.jTableDatosDefinicion.setAutoCreateRowSorter(true);
		this.jTableDatosDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDefinicion.setRowSelectionAllowed(true);
		this.jTableDatosDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDefinicion = new JButtonMe();
		this.jButtonDuplicarDefinicion = new JButtonMe();
		this.jButtonCopiarDefinicion = new JButtonMe();
		this.jButtonVerFormDefinicion = new JButtonMe();
		this.jButtonNuevoRelacionesDefinicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDefinicion = new JButtonMe();
		this.jButtonCerrarDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosDefinicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDefinicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciobasicoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorecargosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_documentoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanticipos_otrosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciolistas_preciosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioseries_archivosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciootrosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Definicion";
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesDefinicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciobasicoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Basico"));
		this.jPanelCamposIniciobasicoDefinicion.setName("jPanelCamposFinbasicoDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobasicoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorecargosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargos"));
		this.jPanelCamposIniciorecargosDefinicion.setName("jPanelCamposFinrecargosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorecargosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneralDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDefinicion.setName("jPanelCamposFingeneralDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_documentoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Documento"));
		this.jPanelCamposIniciotipo_documentoDefinicion.setName("jPanelCamposFintipo_documentoDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_documentoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanticipos_otrosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Anticipos Otros"));
		this.jPanelCamposInicioanticipos_otrosDefinicion.setName("jPanelCamposFinanticipos_otrosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanticipos_otrosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciolistas_preciosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas Precios"));
		this.jPanelCamposIniciolistas_preciosDefinicion.setName("jPanelCamposFinlistas_preciosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciolistas_preciosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioseries_archivosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Series Archivos"));
		this.jPanelCamposInicioseries_archivosDefinicion.setName("jPanelCamposFinseries_archivosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioseries_archivosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciootrosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros"));
		this.jPanelCamposIniciootrosDefinicion.setName("jPanelCamposFinotrosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciootrosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDefinicion=new ReporteDinamicoJInternalFrame(DefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDefinicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDefinicion=new ImportacionJInternalFrame(DefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDefinicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDefinicion = new JButtonMe();
		
		this.jButtonAbrirOrderByDefinicion.setText("Orden");
		this.jButtonAbrirOrderByDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDefinicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefinicion,false,this);
			
			//this.cargarOrderByDefinicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefinicion,true,this);
			
			//this.cargarOrderByDefinicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDefinicion.setMinimumSize(new Dimension(400,50));//5230
		this.jTableDatosDefinicion.setMaximumSize(new Dimension(400,50));//5230
		this.jTableDatosDefinicion.setPreferredSize(new Dimension(400,50));//5230
		
		this.jScrollPanelDatosDefinicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDefinicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDefinicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDefinicion.setText("Nuevo");
		this.jButtonDuplicarDefinicion.setText("Duplicar");
		this.jButtonCopiarDefinicion.setText("Copiar");
		this.jButtonVerFormDefinicion.setText("Ver");
		this.jButtonNuevoRelacionesDefinicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDefinicion.setText("Guardar");
		this.jButtonCerrarDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDefinicion,"nuevo_button","Nuevo",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDefinicion,"duplicar_button","Duplicar",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDefinicion,"copiar_button","Copiar",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDefinicion,"ver_form","Ver",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDefinicion,"nuevorelaciones_button","Nuevo Rel",this.definicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDefinicion,"guardarcambiostabla_button","Guardar",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDefinicion,"cerrar_button","Salir",this.definicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDefinicion.setToolTipText("Nuevo"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDefinicion.setToolTipText("Duplicar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDefinicion.setToolTipText("Copiar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDefinicion.setToolTipText("Ver"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDefinicion.setToolTipText("Nuevo Rel"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDefinicion.setToolTipText("Guardar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDefinicion.setToolTipText("Salir"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDefinicion";
		inputMap = this.jButtonNuevoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDefinicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDefinicion";
		inputMap = this.jButtonDuplicarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDefinicion"));
		
		//COPIAR
		sMapKey = "CopiarDefinicion";
		inputMap = this.jButtonCopiarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDefinicion"));
		
		//VEr FORM
		sMapKey = "VerFormDefinicion";
		inputMap = this.jButtonVerFormDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDefinicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDefinicion";
		inputMap = this.jButtonNuevoRelacionesDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDefinicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDefinicion";
		inputMap = this.jButtonModificarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDefinicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDefinicion";
		inputMap = this.jButtonCerrarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDefinicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Definicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Definicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Definicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Definicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Definicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDefinicion.setName("jPanelParametrosReportesDefinicion"); 
		
		this.jPanelParametrosReportesAccionesDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDefinicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDefinicion.setName("jPanelParametrosReportesAccionesDefinicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDefinicion = new JButtonMe();
		this.jButtonRecargarInformacionDefinicion.setText("Recargar");
		this.jButtonRecargarInformacionDefinicion.setToolTipText("Recargar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDefinicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDefinicion = new JButtonMe();
		this.jButtonProcesarInformacionDefinicion.setText("Procesar");
		this.jButtonProcesarInformacionDefinicion.setToolTipText("Procesar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDefinicion.setVisible(false);
			
		this.jButtonProcesarInformacionDefinicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDefinicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDefinicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefinicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDefinicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefinicion.setText("TIPO");       
		this.jComboBoxTiposReportesDefinicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefinicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDefinicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDefinicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDefinicion.setText("Accion");
		this.jComboBoxTiposRelacionesDefinicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesDefinicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDefinicion.setText("Accion");
		this.jComboBoxTiposSeleccionarDefinicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDefinicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDefinicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDefinicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDefinicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDefinicion = new JLabelMe();
		
		this.jLabelAccionesDefinicion.setText("Acciones");		
		this.jLabelAccionesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDefinicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDefinicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDefinicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDefinicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDefinicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDefinicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDefinicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDefinicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDefinicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDefinicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDefinicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDefinicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDefinicion = new JButtonMe();
		//this.jButtonAnterioresDefinicion.setText("<<");
        this.jButtonAnterioresDefinicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDefinicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDefinicion = new JButtonMe();
		//this.jButtonSiguientesDefinicion.setText(">>");
        this.jButtonSiguientesDefinicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDefinicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDefinicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDefinicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDefinicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDefinicion,"nuevoguardarcambios_button","Nue",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDefinicion";
		inputMap = this.jButtonNuevoGuardarCambiosDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDefinicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDefinicion";
		inputMap = this.jButtonRecargarInformacionDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDefinicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDefinicion";
		inputMap = this.jButtonSiguientesDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDefinicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDefinicion";
		inputMap = this.jButtonAnterioresDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDefinicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDefinicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDefinicion.setMinimumSize(new Dimension(this.getWidth(),DefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDefinicion.setMaximumSize(new Dimension(this.getWidth(),DefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDefinicion.setPreferredSize(new Dimension(this.getWidth(),DefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDefinicion = new GridBagLayout();

			this.jPanelPaginacionDefinicion.setLayout(gridaBagLayoutPaginacionDefinicion);						
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 0;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDefinicion.add(this.jButtonAnterioresDefinicion, this.gridBagConstraintsDefinicion);
					
						
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDefinicion.gridy = 0;
			
			this.jPanelPaginacionDefinicion.add(this.jButtonNuevoGuardarCambiosDefinicion, this.gridBagConstraintsDefinicion);
						
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDefinicion.gridy = 0;
			this.jPanelPaginacionDefinicion.add(this.jButtonSiguientesDefinicion, this.gridBagConstraintsDefinicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 1;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefinicion.add(this.jButtonNuevoDefinicion, this.gridBagConstraintsDefinicion);
						
			
			
			if(!this.definicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDefinicion = new GridBagConstraints();
				this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDefinicion.gridy = 1;
				this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDefinicion.add(this.jButtonGuardarCambiosTablaDefinicion, this.gridBagConstraintsDefinicion);
			}
			
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 1;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefinicion.add(this.jButtonDuplicarDefinicion, this.gridBagConstraintsDefinicion);
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 1;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefinicion.add(this.jButtonCopiarDefinicion, this.gridBagConstraintsDefinicion);
		
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 1;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefinicion.add(this.jButtonVerFormDefinicion, this.gridBagConstraintsDefinicion);
		
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 1;
			this.gridBagConstraintsDefinicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDefinicion.add(this.jButtonCerrarDefinicion, this.gridBagConstraintsDefinicion);
		
		
		
		this.jButtonRecargarInformacionDefinicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDefinicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDefinicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDefinicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDefinicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDefinicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDefinicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDefinicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDefinicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDefinicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDefinicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDefinicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDefinicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDefinicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDefinicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDefinicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDefinicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDefinicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDefinicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Definicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Definicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Definicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Definicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDefinicion.setLayout(gridaBagParametrosReportesDefinicion);
			this.jPanelParametrosReportesAccionesDefinicion.setLayout(gridaBagParametrosReportesAccionesDefinicion);
			
			
			this.jPanelParametrosAuxiliar1Definicion.setLayout(gridaBagParametrosAuxiliar1Definicion);
			this.jPanelParametrosAuxiliar2Definicion.setLayout(gridaBagParametrosAuxiliar2Definicion);
			this.jPanelParametrosAuxiliar3Definicion.setLayout(gridaBagParametrosAuxiliar3Definicion);
			this.jPanelParametrosAuxiliar4Definicion.setLayout(gridaBagParametrosAuxiliar4Definicion);
			//this.jPanelParametrosAuxiliar5Definicion.setLayout(gridaBagParametrosAuxiliar2Definicion);			
			
			
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefinicion.add(this.jButtonRecargarInformacionDefinicion, this.gridBagConstraintsDefinicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Definicion.add(this.jComboBoxTiposPaginacionDefinicion, this.gridBagConstraintsDefinicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Definicion.add(this.jCheckBoxConAltoMaximoTablaDefinicion, this.gridBagConstraintsDefinicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Definicion.add(this.jComboBoxTiposArchivosReportesDefinicion, this.gridBagConstraintsDefinicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefinicion.add(this.jPanelParametrosAuxiliar1Definicion, this.gridBagConstraintsDefinicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Definicion.add(this.jComboBoxTiposReportesDefinicion, this.gridBagConstraintsDefinicion);																		
			
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Definicion.add(this.jComboBoxTiposGraficosReportesDefinicion, this.gridBagConstraintsDefinicion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefinicion.add(this.jPanelParametrosAuxiliar4Definicion, this.gridBagConstraintsDefinicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefinicion.add(this.jComboBoxTiposReportesDefinicion, this.gridBagConstraintsDefinicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefinicion.add(this.jCheckBoxGenerarReporteDefinicion, this.gridBagConstraintsDefinicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefinicion.add(this.jPanelParametrosAuxiliar2Definicion, this.gridBagConstraintsDefinicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefinicion.add(this.jLabelAccionesDefinicion, this.gridBagConstraintsDefinicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDefinicion = new GridBagConstraints();
				this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDefinicion.add(this.jButtonAbrirOrderByDefinicion, this.gridBagConstraintsDefinicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefinicion.add(this.jComboBoxTiposSeleccionarDefinicion, this.gridBagConstraintsDefinicion);			
			
			
			/*
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefinicion.add(this.jCheckBoxSeleccionarTodosDefinicion, this.gridBagConstraintsDefinicion);
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefinicion.add(this.jCheckBoxConGraficoReporteDefinicion, this.gridBagConstraintsDefinicion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Definicion.add(this.jCheckBoxSeleccionarTodosDefinicion, this.gridBagConstraintsDefinicion);															
				
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Definicion.add(this.jCheckBoxSeleccionadosDefinicion, this.gridBagConstraintsDefinicion);															
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Definicion.add(this.jCheckBoxConGraficoReporteDefinicion, this.gridBagConstraintsDefinicion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefinicion.add(this.jPanelParametrosAuxiliar3Definicion, this.gridBagConstraintsDefinicion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefinicion.add(this.jComboBoxTiposAccionesDefinicion, this.gridBagConstraintsDefinicion);
	
				
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefinicion.add(this.jTextFieldValorCampoGeneralDefinicion, this.gridBagConstraintsDefinicion);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciobasicoDefinicion= new GridBagLayout();
		this.jPanelCamposIniciobasicoDefinicion.setLayout(gridaBagLayoutCamposIniciobasicoDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciorecargosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciorecargosDefinicion.setLayout(gridaBagLayoutCamposIniciorecargosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciogeneralDefinicion= new GridBagLayout();
		this.jPanelCamposIniciogeneralDefinicion.setLayout(gridaBagLayoutCamposIniciogeneralDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciotipo_documentoDefinicion= new GridBagLayout();
		this.jPanelCamposIniciotipo_documentoDefinicion.setLayout(gridaBagLayoutCamposIniciotipo_documentoDefinicion);

		GridBagLayout gridaBagLayoutCamposInicioanticipos_otrosDefinicion= new GridBagLayout();
		this.jPanelCamposInicioanticipos_otrosDefinicion.setLayout(gridaBagLayoutCamposInicioanticipos_otrosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciolistas_preciosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciolistas_preciosDefinicion.setLayout(gridaBagLayoutCamposIniciolistas_preciosDefinicion);

		GridBagLayout gridaBagLayoutCamposInicioseries_archivosDefinicion= new GridBagLayout();
		this.jPanelCamposInicioseries_archivosDefinicion.setLayout(gridaBagLayoutCamposInicioseries_archivosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciootrosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciootrosDefinicion.setLayout(gridaBagLayoutCamposIniciootrosDefinicion);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDefinicion = new GridBagLayout();

			this.jScrollPanelDatosDefinicion.setLayout(gridaBagLayoutDatosDefinicion);
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = 0;
			this.gridBagConstraintsDefinicion.gridx = 0;
			
			this.jScrollPanelDatosDefinicion.add(this.jTableDatosDefinicion, this.gridBagConstraintsDefinicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDefinicion.setViewportView(this.jTableDatosDefinicion);
		this.jTableDatosDefinicion.setFillsViewportHeight(true);
		this.jTableDatosDefinicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDefinicion= new GridBagLayout();
		this.jPanelAccionesDefinicion.setLayout(gridaBagLayoutAccionesDefinicion);
		
		
		/*	
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 0;
			
		this.jPanelAccionesDefinicion.add(this.jButtonNuevoDefinicion, this.gridBagConstraintsDefinicion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDefinicion.setLayout(gridaBagLayoutFK_IdCuentaContableDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdCuentaContableDefinicion.add(jLabelid_cuenta_contableFK_IdCuentaContableDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdCuentaContableDefinicion.add(jComboBoxid_cuenta_contableFK_IdCuentaContableDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdCuentaContableDefinicion.add(jButtonFK_IdCuentaContableDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("1.-Por Cuenta Contable. ", jPanelFK_IdCuentaContableDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdLibroContableDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdLibroContableDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLibroContableDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLibroContableDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLibroContableDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLibroContableDefinicion.setLayout(gridaBagLayoutFK_IdLibroContableDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdLibroContableDefinicion.add(jLabelid_libro_contableFK_IdLibroContableDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdLibroContableDefinicion.add(jComboBoxid_libro_contableFK_IdLibroContableDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdLibroContableDefinicion.add(jButtonFK_IdLibroContableDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("2.-Por Libro ", jPanelFK_IdLibroContableDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdSucursalDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdSucursalDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSucursalDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSucursalDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSucursalDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSucursalDefinicion.setLayout(gridaBagLayoutFK_IdSucursalDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdSucursalDefinicion.add(jLabelid_sucursalFK_IdSucursalDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdSucursalDefinicion.add(jComboBoxid_sucursalFK_IdSucursalDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdSucursalDefinicion.add(jButtonFK_IdSucursalDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("3.-Por Sucursal ", jPanelFK_IdSucursalDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCosteoDefinicionDefinicion.setLayout(gridaBagLayoutFK_IdTipoCosteoDefinicionDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoCosteoDefinicionDefinicion.add(jLabelid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoCosteoDefinicionDefinicion.add(jComboBoxid_tipo_costeo_definicionFK_IdTipoCosteoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoCosteoDefinicionDefinicion.add(jButtonFK_IdTipoCosteoDefinicionDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("4.-Por T. Costeo ", jPanelFK_IdTipoCosteoDefinicionDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCostoDefinicionDefinicion.setLayout(gridaBagLayoutFK_IdTipoCostoDefinicionDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoCostoDefinicionDefinicion.add(jLabelid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoCostoDefinicionDefinicion.add(jComboBoxid_tipo_costo_definicionFK_IdTipoCostoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoCostoDefinicionDefinicion.add(jButtonFK_IdTipoCostoDefinicionDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("5.-Por T. Costo ", jPanelFK_IdTipoCostoDefinicionDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoDefinicionDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDefinicionDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDefinicionDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDefinicionDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDefinicionDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDefinicionDefinicion.setLayout(gridaBagLayoutFK_IdTipoDefinicionDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoDefinicionDefinicion.add(jLabelid_tipo_definicionFK_IdTipoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoDefinicionDefinicion.add(jComboBoxid_tipo_definicionFK_IdTipoDefinicionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoDefinicionDefinicion.add(jButtonFK_IdTipoDefinicionDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("6.-Por Tipo ", jPanelFK_IdTipoDefinicionDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoDefinicion.setLayout(gridaBagLayoutFK_IdTipoDocumentoDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoDocumentoDefinicion.add(jLabelid_tipo_documentoFK_IdTipoDocumentoDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoDocumentoDefinicion.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoDocumentoDefinicion.add(jButtonFK_IdTipoDocumentoDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("7.-Por Tipo Documento ", jPanelFK_IdTipoDocumentoDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoGlobalClienteDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGlobalClienteDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGlobalClienteDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGlobalClienteDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGlobalClienteDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGlobalClienteDefinicion.setLayout(gridaBagLayoutFK_IdTipoGlobalClienteDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoGlobalClienteDefinicion.add(jLabelid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoGlobalClienteDefinicion.add(jComboBoxid_tipo_global_clienteFK_IdTipoGlobalClienteDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoGlobalClienteDefinicion.add(jButtonFK_IdTipoGlobalClienteDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("8.-Por T. Cliente ", jPanelFK_IdTipoGlobalClienteDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoIvaItemDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIvaItemDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaItemDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaItemDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIvaItemDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIvaItemDefinicion.setLayout(gridaBagLayoutFK_IdTipoIvaItemDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoIvaItemDefinicion.add(jLabelid_tipo_iva_itemFK_IdTipoIvaItemDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoIvaItemDefinicion.add(jComboBoxid_tipo_iva_itemFK_IdTipoIvaItemDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoIvaItemDefinicion.add(jButtonFK_IdTipoIvaItemDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("9.-Por Iva Item ", jPanelFK_IdTipoIvaItemDefinicion);
		jTabbedPaneBusquedasDefinicion.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionDefinicion.setLayout(gridaBagLayoutFK_IdTipoRetencionDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoRetencionDefinicion.add(jLabelid_tipo_retencionFK_IdTipoRetencionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoRetencionDefinicion.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoRetencionDefinicion.add(jButtonFK_IdTipoRetencionDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("10.-Por Cod Ret. ", jPanelFK_IdTipoRetencionDefinicion);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloDefinicion.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloDefinicion.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloDefinicion.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoTransaccionModuloDefinicion.add(jButtonFK_IdTipoTransaccionModuloDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("11.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloDefinicion);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioDefinicion.setLayout(gridaBagLayoutFK_IdTipoTributarioDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTipoTributarioDefinicion.add(jLabelid_tipo_tributarioFK_IdTipoTributarioDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTipoTributarioDefinicion.add(jComboBoxid_tipo_tributarioFK_IdTipoTributarioDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTipoTributarioDefinicion.add(jButtonFK_IdTipoTributarioDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("12.-Por Sustento Trib. ", jPanelFK_IdTipoTributarioDefinicion);

		GridBagLayout gridaBagLayoutFK_IdTransaccionDefinicion= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionDefinicion.setLayout(gridaBagLayoutFK_IdTransaccionDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 0;
		jPanelFK_IdTransaccionDefinicion.add(jLabelid_transaccionFK_IdTransaccionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 0;
		gridBagConstraintsDefinicion.gridx = 1;
		jPanelFK_IdTransaccionDefinicion.add(jComboBoxid_transaccionFK_IdTransaccionDefinicion, gridBagConstraintsDefinicion);

		gridBagConstraintsDefinicion = new GridBagConstraints();
		gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefinicion.gridy = 1;
		gridBagConstraintsDefinicion.gridx =1;
		jPanelFK_IdTransaccionDefinicion.add(jButtonFK_IdTransaccionDefinicion, gridBagConstraintsDefinicion);

		jTabbedPaneBusquedasDefinicion.addTab("13.-Por Transaccion ", jPanelFK_IdTransaccionDefinicion);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDefinicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.definicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefinicion.gridx = 0;		
			//this.gridBagConstraintsDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDefinicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDefinicion, this.gridBagConstraintsDefinicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDefinicion.gridx = 0;		
		//this.gridBagConstraintsDefinicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDefinicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDefinicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefinicion.gridx = 0;		
			this.gridBagConstraintsDefinicion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDefinicion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDefinicion, this.gridBagConstraintsDefinicion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDefinicion, this.gridBagConstraintsDefinicion);								
		
		
		/*
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDefinicion, this.gridBagConstraintsDefinicion);
		*/		
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDefinicion.gridx =0;
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDefinicion, this.gridBagConstraintsDefinicion);
				
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDefinicion, this.gridBagConstraintsDefinicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DefinicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDefinicion = new GridBagLayout();
			this.jPanelBusquedasParametrosDefinicion.setLayout(gridaBagLayoutBusquedasParametrosDefinicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDefinicion, this.gridBagConstraintsDefinicion);
			
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDefinicion, this.gridBagConstraintsDefinicion);
		
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDefinicion, this.gridBagConstraintsDefinicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDefinicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDefinicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDefinicion.setName("jPanelReporteDinamicoDefinicion"); 
		
		this.jPanelReporteDinamicoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDefinicion.setLayout(gridaBagLayoutReporteDinamicoDefinicion);
		
		
		this.jInternalFrameReporteDinamicoDefinicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDefinicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDefinicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDefinicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDefinicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDefinicion = new JLabelMe();

		this.jLabelColumnasSelectReporteDefinicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelColumnasSelectReporteDefinicion, this.gridBagConstraintsDefinicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDefinicion = new JList<Reporte>();
		this.jListColumnasSelectReporteDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDefinicion=new JScrollPane(this.jListColumnasSelectReporteDefinicion);
			
			this.jScrollColumnasSelectReporteDefinicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDefinicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDefinicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDefinicion.add(this.jListColumnasSelectReporteDefinicion, this.gridBagConstraintsDefinicion);
		this.jPanelReporteDinamicoDefinicion.add(this.jScrollColumnasSelectReporteDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDefinicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDefinicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDefinicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDefinicion=new JScrollPane(this.jListRelacionesSelectReporteDefinicion);
			
			this.jScrollRelacionesSelectReporteDefinicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDefinicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDefinicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDefinicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDefinicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDefinicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDefinicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDefinicion = new JLabelMe();

		this.jLabelConGraficoDinamicoDefinicion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelConGraficoDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDefinicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDefinicion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDefinicion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDefinicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDefinicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDefinicion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jCheckBoxConGraficoDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDefinicion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDefinicion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelColumnaCategoriaGraficoDefinicion, this.gridBagConstraintsDefinicion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDefinicion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDefinicion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDefinicion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDefinicion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDefinicion.add(this.jComboBoxColumnaCategoriaGraficoDefinicion, this.gridBagConstraintsDefinicion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDefinicion = new JLabelMe();

		this.jLabelColumnaCategoriaValorDefinicion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelColumnaCategoriaValorDefinicion, this.gridBagConstraintsDefinicion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDefinicion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDefinicion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDefinicion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDefinicion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDefinicion.add(this.jComboBoxColumnaCategoriaValorDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDefinicion = new JLabelMe();

		this.jLabelColumnasValoresGraficoDefinicion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelColumnasValoresGraficoDefinicion, this.gridBagConstraintsDefinicion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDefinicion = new JList<Reporte>();
		this.jListColumnasValoresGraficoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDefinicion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDefinicion=new JScrollPane(this.jListColumnasValoresGraficoDefinicion);
			
			this.jScrollColumnasValoresGraficoDefinicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDefinicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDefinicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDefinicion.add(this.jListColumnasSelectReporteDefinicion, this.gridBagConstraintsDefinicion);
		this.jPanelReporteDinamicoDefinicion.add(this.jScrollColumnasValoresGraficoDefinicion, this.gridBagConstraintsDefinicion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDefinicion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDefinicion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelTiposGraficosReportesDinamicoDefinicion, this.gridBagConstraintsDefinicion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDefinicion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDefinicion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDefinicion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDefinicion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jComboBoxTiposGraficosReportesDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDefinicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDefinicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelGenerarExcelReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDefinicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDefinicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDefinicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDefinicion.setToolTipText("Generar EXCEL"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDefinicion.add(this.jButtonGenerarExcelReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefinicion.add(this.jComboBoxTiposReportesDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDefinicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDefinicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefinicion.add(this.jLabelTiposArchivoReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefinicion.add(this.jComboBoxTiposArchivosReportesDinamicoDefinicion, this.gridBagConstraintsDefinicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDefinicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDefinicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDefinicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDefinicion.setToolTipText("Generar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefinicion.add(this.jButtonGenerarReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDefinicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDefinicion.setToolTipText("Cancelar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefinicion.add(this.jButtonCerrarReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDefinicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDefinicion= new JScrollPane(jPanelReporteDinamicoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDefinicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDefinicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDefinicion);
		this.jInternalFrameReporteDinamicoDefinicion.getContentPane().add(this.jScrollPanelReporteDinamicoDefinicion, this.gridBagConstraintsDefinicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDefinicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDefinicion.setName("jPanelImportacionDefinicion"); 
		
		this.jPanelImportacionDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDefinicion.setLayout(gridaBagLayoutImportacionDefinicion);
		
		
		this.jInternalFrameImportacionDefinicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDefinicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDefinicion.setResizable(true);
	    this.jInternalFrameImportacionDefinicion.setClosable(true);
	    this.jInternalFrameImportacionDefinicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDefinicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDefinicion.setResizable(true);
	    this.jInternalFrameImportacionDefinicion.setClosable(true);
	    this.jInternalFrameImportacionDefinicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDefinicion = new JLabelMe();

		this.jLabelArchivoImportacionDefinicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDefinicion.add(this.jLabelArchivoImportacionDefinicion, this.gridBagConstraintsDefinicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDefinicion = new JFileChooser();		
		this.jFileChooserImportacionDefinicion.setToolTipText("ESCOGER ARCHIVO"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDefinicion = new JButtonMe();
		this.jButtonAbrirImportacionDefinicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDefinicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDefinicion.setToolTipText("Generar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefinicion.add(this.jButtonAbrirImportacionDefinicion, this.gridBagConstraintsDefinicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDefinicion = new JLabelMe();

		this.jLabelPathArchivoImportacionDefinicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDefinicion.add(this.jLabelPathArchivoImportacionDefinicion, this.gridBagConstraintsDefinicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDefinicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDefinicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDefinicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDefinicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefinicion.add(this.jTextFieldPathArchivoImportacionDefinicion, this.gridBagConstraintsDefinicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDefinicion = new JButtonMe();
		this.jButtonGenerarImportacionDefinicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDefinicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDefinicion.setToolTipText("Generar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefinicion.add(this.jButtonGenerarImportacionDefinicion, this.gridBagConstraintsDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDefinicion = new JButtonMe();
		this.jButtonCerrarImportacionDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDefinicion.setToolTipText("Cancelar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefinicion.add(this.jButtonCerrarImportacionDefinicion, this.gridBagConstraintsDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDefinicion = new GridBagLayout();
		
		this.jScrollPanelImportacionDefinicion= new JScrollPane(jPanelImportacionDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iPosYImportacion;
		this.gridBagConstraintsDefinicion.gridx =iPosXImportacion;
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDefinicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDefinicion);
		this.jInternalFrameImportacionDefinicion.getContentPane().add(this.jScrollPanelImportacionDefinicion, this.gridBagConstraintsDefinicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDefinicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDefinicion = new JButtonMe();
			this.jButtonAbrirOrderByDefinicion.setText("Orden");
			this.jButtonAbrirOrderByDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDefinicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDefinicion";
			inputMap = this.jButtonAbrirOrderByDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDefinicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDefinicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDefinicion.setName("jPanelOrderByDefinicion"); 
			
			this.jPanelOrderByDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDefinicion.setLayout(gridaBagLayoutOrderByDefinicion);
			
			
			this.jTableDatosDefinicionOrderBy = new JTableMe();        
			this.jTableDatosDefinicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDefinicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDefinicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDefinicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDefinicionOrderBy.setViewportView(this.jTableDatosDefinicionOrderBy);
			this.jTableDatosDefinicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDefinicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDefinicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDefinicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDefinicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDefinicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDefinicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDefinicion.setTitle("Orden");
			this.jInternalFrameOrderByDefinicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDefinicion.setResizable(true);
			this.jInternalFrameOrderByDefinicion.setClosable(true);
			this.jInternalFrameOrderByDefinicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDefinicion.ipady =150;
				
			this.jPanelOrderByDefinicion.add(jScrollPanelDatosDefinicionOrderBy, this.gridBagConstraintsDefinicion);//this.jTableDatosDefinicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDefinicion = new JButtonMe();
			this.jButtonCerrarOrderByDefinicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDefinicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDefinicion.setToolTipText("Cancelar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDefinicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDefinicion.add(this.jButtonCerrarOrderByDefinicion, this.gridBagConstraintsDefinicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDefinicion = new GridBagLayout();
			
			this.jScrollPanelOrderByDefinicion= new JScrollPane(jPanelOrderByDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDefinicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDefinicion);
			
			this.jInternalFrameOrderByDefinicion.getContentPane().add(this.jScrollPanelOrderByDefinicion, this.gridBagConstraintsDefinicion);			
		
		} else {
			this.jButtonAbrirOrderByDefinicion = new JButtonMe();
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
		int iWidthTableCalculado=0;//10730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=5230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.definicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDefinicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDefinicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDefinicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDefinicion.getRowHeight();//DefinicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDefinicion.isSelected()) {
					iHeightTable=DefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDefinicion.isSelected()) {
					iHeightTable=DefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDefinicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDefinicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDefinicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDefinicion!=null && this.jInternalFrameOrderByDefinicion.getjTableDatosOrderBy()!=null) {
			//if(!this.definicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDefinicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDefinicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDefinicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDefinicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDefinicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDefinicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDefinicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=definicionLogic.getDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=definicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Definicion> TraerDefinicionBeans(List<Definicion> definicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Definicion definicion:definicions) {
					
				if(!(DefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					definicion.setsDetalleGeneralEntityReporte(DefinicionConstantesFunciones.getDefinicionDescripcion(definicion));
										
					definicion.setcon_mostrar_bodega_descripcion(DefinicionConstantesFunciones.getcon_mostrar_bodegaDescripcion(definicion));definicion.setcon_otro_recargo_descripcion(DefinicionConstantesFunciones.getcon_otro_recargoDescripcion(definicion));definicion.setcon_coa_descripcion(DefinicionConstantesFunciones.getcon_coaDescripcion(definicion));definicion.setcon_retencion_descripcion(DefinicionConstantesFunciones.getcon_retencionDescripcion(definicion));definicion.setcon_novedad_producto_descripcion(DefinicionConstantesFunciones.getcon_novedad_productoDescripcion(definicion));definicion.setcon_ice_descripcion(DefinicionConstantesFunciones.getcon_iceDescripcion(definicion));definicion.setcon_cantidad_descripcion(DefinicionConstantesFunciones.getcon_cantidadDescripcion(definicion));definicion.setcon_producto_por_proveedor_descripcion(DefinicionConstantesFunciones.getcon_producto_por_proveedorDescripcion(definicion));definicion.setcon_lote_cliente_descripcion(DefinicionConstantesFunciones.getcon_lote_clienteDescripcion(definicion));definicion.setcon_cuenta_contable_descripcion(DefinicionConstantesFunciones.getcon_cuenta_contableDescripcion(definicion));definicion.setcon_detalle_descripcion(DefinicionConstantesFunciones.getcon_detalleDescripcion(definicion));definicion.setcon_iva_incluido_descripcion(DefinicionConstantesFunciones.getcon_iva_incluidoDescripcion(definicion));definicion.setcon_lotes_descripcion(DefinicionConstantesFunciones.getcon_lotesDescripcion(definicion));definicion.setcon_precio_descripcion(DefinicionConstantesFunciones.getcon_precioDescripcion(definicion));definicion.setcon_centro_costo_descripcion(DefinicionConstantesFunciones.getcon_centro_costoDescripcion(definicion));definicion.setcon_orden_iva_descripcion(DefinicionConstantesFunciones.getcon_orden_ivaDescripcion(definicion));definicion.setcon_multi_empresa_descripcion(DefinicionConstantesFunciones.getcon_multi_empresaDescripcion(definicion));definicion.setcon_en_linea_descripcion(DefinicionConstantesFunciones.getcon_en_lineaDescripcion(definicion));definicion.setcon_evaluacion_descripcion(DefinicionConstantesFunciones.getcon_evaluacionDescripcion(definicion));definicion.setcon_ot_descripcion(DefinicionConstantesFunciones.getcon_otDescripcion(definicion));definicion.setcon_anticipo_descripcion(DefinicionConstantesFunciones.getcon_anticipoDescripcion(definicion));definicion.setcon_cierre_descripcion(DefinicionConstantesFunciones.getcon_cierreDescripcion(definicion));definicion.setcon_general_descripcion(DefinicionConstantesFunciones.getcon_generalDescripcion(definicion));definicion.setcon_por_producto_descripcion(DefinicionConstantesFunciones.getcon_por_productoDescripcion(definicion));definicion.setcon_descuento_descripcion(DefinicionConstantesFunciones.getcon_descuentoDescripcion(definicion));definicion.setcon_series_descripcion(DefinicionConstantesFunciones.getcon_seriesDescripcion(definicion));definicion.setcon_interno_descripcion(DefinicionConstantesFunciones.getcon_internoDescripcion(definicion));definicion.setcon_reserva_descripcion(DefinicionConstantesFunciones.getcon_reservaDescripcion(definicion));definicion.setcon_precio_proveedor_descripcion(DefinicionConstantesFunciones.getcon_precio_proveedorDescripcion(definicion));definicion.setcon_produccion_descripcion(DefinicionConstantesFunciones.getcon_produccionDescripcion(definicion));definicion.setcon_codigo_barra_descripcion(DefinicionConstantesFunciones.getcon_codigo_barraDescripcion(definicion));definicion.setcon_romaneos_descripcion(DefinicionConstantesFunciones.getcon_romaneosDescripcion(definicion));	
					
						
					
				} else  {
							
					//definicion.setsDetalleGeneralEntityReporte(definicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//definicionbeans.add(definicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return definicions;
    }
	//PARA REPORTES FIN
}
