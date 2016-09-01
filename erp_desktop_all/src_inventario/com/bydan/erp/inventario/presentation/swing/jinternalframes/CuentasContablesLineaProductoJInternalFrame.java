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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.inventario.util.CuentasContablesLineaProductoConstantesFunciones;

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
public class CuentasContablesLineaProductoJInternalFrame extends CuentasContablesLineaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentasContablesLineaProducto;
	
	protected JMenuBar jmenuBarCuentasContablesLineaProducto;
	
	protected JMenu jmenuCuentasContablesLineaProducto;
	protected JMenu jmenuDatosCuentasContablesLineaProducto;
	protected JMenu jmenuArchivoCuentasContablesLineaProducto;
	protected JMenu jmenuAccionesCuentasContablesLineaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentasContablesLineaProducto;	
	protected GridBagConstraints gridBagConstraintsCuentasContablesLineaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormCuentasContablesLineaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentasContablesLineaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentasContablesLineaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostoventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivadebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivadebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivacredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public CuentasContablesLineaProductoSessionBean cuentascontableslineaproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoventaSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontableivadebitoSessionBean;
	public CuentaContableSessionBean cuentacontableivacreditoSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentasContablesLineaProducto> cuentascontableslineaproductos;		
	public List<CuentasContablesLineaProducto> cuentascontableslineaproductosEliminados;	
	public List<CuentasContablesLineaProducto> cuentascontableslineaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentasContablesLineaProducto;		
	protected JButton jButtonAbrirOrderByCuentasContablesLineaProducto;
	
	
	//protected JPanel jPanelOrderByCuentasContablesLineaProducto;
	//public JScrollPane jScrollPanelOrderByCuentasContablesLineaProducto;	
	//protected JButton jButtonCerrarOrderByCuentasContablesLineaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentasContablesLineaProductoLogic cuentascontableslineaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentasContablesLineaProducto;
	public JScrollPane jScrollPanelDatosEdicionCuentasContablesLineaProducto;
	public JScrollPane jScrollPanelDatosGeneralCuentasContablesLineaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentasContablesLineaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentasContablesLineaProducto;
	//public JScrollPane jScrollPanelImportacionCuentasContablesLineaProducto;
	
	
	
	protected JPanel jPanelAccionesCuentasContablesLineaProducto;
	
    protected JPanel jPanelPaginacionCuentasContablesLineaProducto;
    protected JPanel jPanelParametrosReportesCuentasContablesLineaProducto;
	protected JPanel jPanelParametrosReportesAccionesCuentasContablesLineaProducto;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralCuentasContablesLineaProducto;
	protected Integer iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposIniciogeneralCuentasContablesLineaProducto=0;

	protected JPanel jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	protected Integer iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentasContablesLineaProducto;
	protected JPanel jPanelParametrosAuxiliar2CuentasContablesLineaProducto;
	protected JPanel jPanelParametrosAuxiliar3CuentasContablesLineaProducto;
	protected JPanel jPanelParametrosAuxiliar4CuentasContablesLineaProducto;
	//protected JPanel jPanelParametrosAuxiliar5CuentasContablesLineaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentasContablesLineaProducto;
	//protected JPanel jPanelImportacionCuentasContablesLineaProducto;
	
	
	public JTable jTableDatosCuentasContablesLineaProducto;
	
	
	
	//public JTable jTableDatosCuentasContablesLineaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentasContablesLineaProducto;
	protected JButton jButtonDuplicarCuentasContablesLineaProducto;
	protected JButton jButtonCopiarCuentasContablesLineaProducto;
	protected JButton jButtonVerFormCuentasContablesLineaProducto;
	protected JButton jButtonNuevoRelacionesCuentasContablesLineaProducto;
	protected JButton jButtonModificarCuentasContablesLineaProducto;
	
    protected JButton jButtonGuardarCambiosTablaCuentasContablesLineaProducto;
	protected JButton jButtonCerrarCuentasContablesLineaProducto;
	
	
	protected JButton jButtonRecargarInformacionCuentasContablesLineaProducto;
	protected JButton jButtonProcesarInformacionCuentasContablesLineaProducto;
	
	
	protected JButton jButtonAnterioresCuentasContablesLineaProducto;
	protected JButton jButtonSiguientesCuentasContablesLineaProducto;
	protected JButton jButtonNuevoGuardarCambiosCuentasContablesLineaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentasContablesLineaProducto;
	//protected JButton jButtonCerrarReporteDinamicoCuentasContablesLineaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentasContablesLineaProducto;
	//protected JButton jButtonGenerarImportacionCuentasContablesLineaProducto;
	//protected JButton jButtonCerrarImportacionCuentasContablesLineaProducto;
	//protected JFileChooser jFileChooserImportacionCuentasContablesLineaProducto;
	//protected File fileImportacionCuentasContablesLineaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentasContablesLineaProducto;
	protected JButton jButtonDuplicarToolBarCuentasContablesLineaProducto;
	protected JButton jButtonNuevoRelacionesToolBarCuentasContablesLineaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentasContablesLineaProducto;
	protected JButton jButtonCopiarToolBarCuentasContablesLineaProducto;
	protected JButton jButtonVerFormToolBarCuentasContablesLineaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarCuentasContablesLineaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentasContablesLineaProducto;
	protected JButton jButtonCerrarToolBarCuentasContablesLineaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarCuentasContablesLineaProducto;
	protected JButton jButtonProcesarInformacionToolBarCuentasContablesLineaProducto;
	protected JButton jButtonAnterioresToolBarCuentasContablesLineaProducto;
	protected JButton jButtonSiguientesToolBarCuentasContablesLineaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentasContablesLineaProducto;
	protected JButton jButtonAbrirOrderByToolBarCuentasContablesLineaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDuplicarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesCuentasContablesLineaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemCopiarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemVerFormCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemCerrarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDetalleCerrarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemProcesarInformacionCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemAnterioresCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemSiguientesCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemAbrirOrderByCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemMostrarOcultarCuentasContablesLineaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentasContablesLineaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentasContablesLineaProducto;
	protected JCheckBox jCheckBoxSeleccionadosCuentasContablesLineaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentasContablesLineaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentasContablesLineaProducto;
	protected JTextField jTextFieldValorCampoGeneralCuentasContablesLineaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentasContablesLineaProducto;
	//public JList<Reporte> jListColumnasSelectReporteCuentasContablesLineaProducto;
	//public JScrollPane jScrollColumnasSelectReporteCuentasContablesLineaProducto;
	
	//public JLabel jLabelRelacionesSelectReporteCuentasContablesLineaProducto;
	//public JList<Reporte> jListRelacionesSelectReporteCuentasContablesLineaProducto;
	//public JScrollPane jScrollRelacionesSelectReporteCuentasContablesLineaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentasContablesLineaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto;
	
		
	//public JLabel jLabelArchivoImportacionCuentasContablesLineaProducto;	
	//public JLabel jLabelPathArchivoImportacionCuentasContablesLineaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionCuentasContablesLineaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentasContablesLineaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentasContablesLineaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorCuentasContablesLineaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentasContablesLineaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoCuentasContablesLineaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoCuentasContablesLineaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoCuentasContablesLineaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentasContablesLineaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentasContablesLineaProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentasContablesLineaProducto;
	public JPanel jPanelFK_IdBodegaCuentasContablesLineaProducto;
	public JButton jButtonFK_IdBodegaCuentasContablesLineaProducto;
	public JPanel jPanelFK_IdCentroCostoCuentasContablesLineaProducto;
	public JButton jButtonFK_IdCentroCostoCuentasContablesLineaProducto;
	public JPanel jPanelFK_IdLineaCuentasContablesLineaProducto;
	public JButton jButtonFK_IdLineaCuentasContablesLineaProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaCuentasContablesLineaProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto;
	public JButton jButtonid_bodegaFK_IdBodegaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCuentasContablesLineaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto;
	
	public JPanel jPanelid_lineaFK_IdLineaCuentasContablesLineaProducto;
	public JLabel jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto;
	public JButton jButtonid_lineaFK_IdLineaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCuentasContablesLineaProductoArbol= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentasContablesLineaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentasContablesLineaProducto)	{
		this.jButtonRecargarInformacionCuentasContablesLineaProducto = jButtonRecargarInformacionCuentasContablesLineaProducto;
	}
	
	public JButton getjButtonProcesarInformacionCuentasContablesLineaProducto() {
		return this.jButtonProcesarInformacionCuentasContablesLineaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentasContablesLineaProducto)	{
		this.jButtonProcesarInformacionCuentasContablesLineaProducto = jButtonProcesarInformacionCuentasContablesLineaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentasContablesLineaProducto() {
		return this.jButtonRecargarInformacionCuentasContablesLineaProducto;
	}
	
	
	public List<CuentasContablesLineaProducto> getcuentascontableslineaproductos() {
		return this.cuentascontableslineaproductos;
	}

	public void setcuentascontableslineaproductos(List<CuentasContablesLineaProducto> cuentascontableslineaproductos) {
		this.cuentascontableslineaproductos = cuentascontableslineaproductos;
	}
	
	public List<CuentasContablesLineaProducto> getcuentascontableslineaproductosAux() {
		return this.cuentascontableslineaproductosAux;
	}

	public void setcuentascontableslineaproductosAux(List<CuentasContablesLineaProducto> cuentascontableslineaproductosAux) {
		this.cuentascontableslineaproductosAux = cuentascontableslineaproductosAux;
	}
	
	public List<CuentasContablesLineaProducto> getcuentascontableslineaproductosEliminados() {
		return this.cuentascontableslineaproductosEliminados;
	}

	public void setCuentasContablesLineaProductosEliminados(List<CuentasContablesLineaProducto> cuentascontableslineaproductosEliminados) {
		this.cuentascontableslineaproductosEliminados = cuentascontableslineaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentasContablesLineaProducto() {
		return jComboBoxTiposSeleccionarCuentasContablesLineaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposSeleccionarCuentasContablesLineaProducto) {
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto = jComboBoxTiposSeleccionarCuentasContablesLineaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentasContablesLineaProducto() {
		return jTextFieldValorCampoGeneralCuentasContablesLineaProducto;
	}

	public void setjTextFieldValorCampoGeneralCuentasContablesLineaProducto(
			JTextField jTextFieldValorCampoGeneralCuentasContablesLineaProducto) {
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto = jTextFieldValorCampoGeneralCuentasContablesLineaProducto;
	}

	public void setBorderResaltarValorCampoGeneralCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentasContablesLineaProducto() {
		return this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto;
	}

	public void setjCheckBoxSeleccionarTodosCuentasContablesLineaProducto(
			JCheckBox jCheckBoxSeleccionarTodosCuentasContablesLineaProducto) {
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto = jCheckBoxSeleccionarTodosCuentasContablesLineaProducto;
	}

	public void setBorderResaltarSeleccionarTodosCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentasContablesLineaProducto() {
		return this.jCheckBoxSeleccionadosCuentasContablesLineaProducto;
	}

	public void setjCheckBoxSeleccionadosCuentasContablesLineaProducto(
			JCheckBox jCheckBoxSeleccionadosCuentasContablesLineaProducto) {
		this.jCheckBoxSeleccionadosCuentasContablesLineaProducto = jCheckBoxSeleccionadosCuentasContablesLineaProducto;
	}
	
	public void setBorderResaltarSeleccionadosCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposArchivosReportesCuentasContablesLineaProducto) {
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto = jComboBoxTiposArchivosReportesCuentasContablesLineaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposReportesCuentasContablesLineaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposReportesCuentasContablesLineaProducto) {
		this.jComboBoxTiposReportesCuentasContablesLineaProducto = jComboBoxTiposReportesCuentasContablesLineaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentasContablesLineaProducto() {
	//	return jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentasContablesLineaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto) {
	//	this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto = jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto = jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto;
	//}
	
	public void setBorderResaltarTiposReportesCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposGraficosReportesCuentasContablesLineaProducto) {
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto = jComboBoxTiposGraficosReportesCuentasContablesLineaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentasContablesLineaProducto() {
		return this.jComboBoxTiposPaginacionCuentasContablesLineaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposPaginacionCuentasContablesLineaProducto) {
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto = jComboBoxTiposPaginacionCuentasContablesLineaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposRelacionesCuentasContablesLineaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposAccionesCuentasContablesLineaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposRelacionesCuentasContablesLineaProducto) {
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto = jComboBoxTiposRelacionesCuentasContablesLineaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposAccionesCuentasContablesLineaProducto) {
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto = jComboBoxTiposAccionesCuentasContablesLineaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentasContablesLineaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentasContablesLineaProducto() {
	//	return jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentasContablesLineaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto) {
	//	this.jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto = jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentasContablesLineaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentasContablesLineaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto .setBorder(borderResaltar);		
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
		this.cuentascontableslineaproductoSessionBean=new CuentasContablesLineaProductoSessionBean();
		
		this.cuentascontableslineaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentasContablesLineaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuentas Contables Linea Producto MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentasContablesLineaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"nuevo","nuevo","Nuevo"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"duplicar","duplicar","Duplicar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"copiar","copiar","Copiar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"ver_form","ver_form","Ver"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"recargar","recargar","Recargar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentasContablesLineaProducto,this.jTtoolBarCuentasContablesLineaProducto,
							"cerrar","cerrar","Salir"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentasContablesLineaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentasContablesLineaProducto;
			
				this.jButtonProcesarInformacionToolBarCuentasContablesLineaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentasContablesLineaProducto;
				
		//protected JButton jButtonModificarToolBarCuentasContablesLineaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentasContablesLineaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentasContablesLineaProducto=new JMenuMe("General");
		this.jmenuArchivoCuentasContablesLineaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesCuentasContablesLineaProducto=new JMenuMe("Acciones");
		this.jmenuDatosCuentasContablesLineaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentasContablesLineaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentasContablesLineaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentasContablesLineaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentasContablesLineaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentasContablesLineaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentasContablesLineaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentasContablesLineaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentasContablesLineaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentasContablesLineaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentasContablesLineaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentasContablesLineaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentasContablesLineaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentasContablesLineaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentasContablesLineaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentasContablesLineaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentasContablesLineaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentasContablesLineaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentasContablesLineaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentasContablesLineaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentasContablesLineaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentasContablesLineaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentasContablesLineaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentasContablesLineaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentasContablesLineaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentasContablesLineaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentasContablesLineaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentasContablesLineaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentasContablesLineaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentasContablesLineaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentasContablesLineaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentasContablesLineaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentasContablesLineaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentasContablesLineaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentasContablesLineaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentasContablesLineaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentasContablesLineaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentasContablesLineaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentasContablesLineaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentasContablesLineaProducto.add(this.jMenuItemCerrarCuentasContablesLineaProducto);
			
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemNuevoCuentasContablesLineaProducto);
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto);
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemNuevoRelacionesCuentasContablesLineaProducto);
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto);		
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemDuplicarCuentasContablesLineaProducto);		
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemCopiarCuentasContablesLineaProducto);		
			this.jmenuAccionesCuentasContablesLineaProducto.add(this.jMenuItemVerFormCuentasContablesLineaProducto);		
			
			this.jmenuDatosCuentasContablesLineaProducto.add(this.jMenuItemRecargarInformacionCuentasContablesLineaProducto);				
			this.jmenuDatosCuentasContablesLineaProducto.add(this.jMenuItemAnterioresCuentasContablesLineaProducto);				
			this.jmenuDatosCuentasContablesLineaProducto.add(this.jMenuItemSiguientesCuentasContablesLineaProducto);				
			this.jmenuDatosCuentasContablesLineaProducto.add(this.jMenuItemAbrirOrderByCuentasContablesLineaProducto);				
			this.jmenuDatosCuentasContablesLineaProducto.add(this.jMenuItemMostrarOcultarCuentasContablesLineaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentasContablesLineaProducto.add(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentasContablesLineaProducto.add(this.jmenuArchivoCuentasContablesLineaProducto);		
			this.jmenuBarCuentasContablesLineaProducto.add(this.jmenuAccionesCuentasContablesLineaProducto);		
			this.jmenuBarCuentasContablesLineaProducto.add(this.jmenuDatosCuentasContablesLineaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentasContablesLineaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentasContablesLineaProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaCuentasContablesLineaProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonFK_IdBodegaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonFK_IdBodegaCuentasContablesLineaProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaCuentasContablesLineaProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCuentasContablesLineaProducto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonFK_IdCentroCostoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonFK_IdCentroCostoCuentasContablesLineaProducto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCuentasContablesLineaProducto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto.setFocusable(false);

		this.jPanelFK_IdLineaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCuentasContablesLineaProducto.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonFK_IdLineaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonFK_IdLineaCuentasContablesLineaProducto.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCuentasContablesLineaProducto,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto = new JLabelMe();
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto.setText("Linea :");
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentasContablesLineaProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentasContablesLineaProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentasContablesLineaProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentasContablesLineaProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentasContablesLineaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentasContablesLineaProducto = new CuentasContablesLineaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuentas Contables Linea Producto DATOS");
			this.jInternalFrameDetalleFormCuentasContablesLineaProducto = new CuentasContablesLineaProductoDetalleFormJInternalFrame(jDesktopPane,this.cuentascontableslineaproductoSessionBean.getConGuardarRelaciones(),this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentasContablesLineaProducto = null;//new CuentasContablesLineaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentasContablesLineaProducto= new GridBagLayout();
		
		
		this.jTableDatosCuentasContablesLineaProducto = new JTableMe();      
		
		String sToolTipCuentasContablesLineaProducto="";
		sToolTipCuentasContablesLineaProducto=CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentasContablesLineaProducto+="(Inventario.CuentasContablesLineaProducto)";
		}
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentasContablesLineaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentasContablesLineaProducto.setToolTipText(sToolTipCuentasContablesLineaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentasContablesLineaProducto);
		this.jTableDatosCuentasContablesLineaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosCuentasContablesLineaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentasContablesLineaProducto.setRowSelectionAllowed(true);
		this.jTableDatosCuentasContablesLineaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonDuplicarCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonCopiarCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonVerFormCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesCuentasContablesLineaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonCerrarCuentasContablesLineaProducto = new JButtonMe();
		
		this.jScrollPanelDatosCuentasContablesLineaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentasContablesLineaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Cuentas Contables Linea Producto";
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentasContablesLineaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentasContablesLineaProducto.setToolTipText("Acciones");
        this.jPanelAccionesCuentasContablesLineaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setName("jPanelCamposFingeneralCuentasContablesLineaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setName("jPanelCamposFincuenta_contableCuentasContablesLineaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto=new ReporteDinamicoJInternalFrame(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentasContablesLineaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentasContablesLineaProducto=new ImportacionJInternalFrame(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentasContablesLineaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentasContablesLineaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentasContablesLineaProducto.setText("Orden");
		this.jButtonAbrirOrderByCuentasContablesLineaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentasContablesLineaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentasContablesLineaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentasContablesLineaProducto,false,this);
			
			//this.cargarOrderByCuentasContablesLineaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentasContablesLineaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentasContablesLineaProducto,true,this);
			
			//this.cargarOrderByCuentasContablesLineaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentasContablesLineaProducto.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosCuentasContablesLineaProducto.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosCuentasContablesLineaProducto.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosCuentasContablesLineaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentasContablesLineaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentasContablesLineaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentasContablesLineaProducto.setText("Nuevo");
		this.jButtonDuplicarCuentasContablesLineaProducto.setText("Duplicar");
		this.jButtonCopiarCuentasContablesLineaProducto.setText("Copiar");
		this.jButtonVerFormCuentasContablesLineaProducto.setText("Ver");
		this.jButtonNuevoRelacionesCuentasContablesLineaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.setText("Guardar");
		this.jButtonCerrarCuentasContablesLineaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentasContablesLineaProducto,"nuevo_button","Nuevo",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentasContablesLineaProducto,"duplicar_button","Duplicar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentasContablesLineaProducto,"copiar_button","Copiar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentasContablesLineaProducto,"ver_form","Ver",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentasContablesLineaProducto,"nuevorelaciones_button","Nuevo Rel",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto,"guardarcambiostabla_button","Guardar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentasContablesLineaProducto,"cerrar_button","Salir",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentasContablesLineaProducto.setToolTipText("Nuevo"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentasContablesLineaProducto.setToolTipText("Duplicar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentasContablesLineaProducto.setToolTipText("Copiar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentasContablesLineaProducto.setToolTipText("Ver"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentasContablesLineaProducto.setToolTipText("Nuevo Rel"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.setToolTipText("Guardar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentasContablesLineaProducto.setToolTipText("Salir"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentasContablesLineaProducto";
		inputMap = this.jButtonNuevoCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentasContablesLineaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentasContablesLineaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentasContablesLineaProducto";
		inputMap = this.jButtonDuplicarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentasContablesLineaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentasContablesLineaProducto"));
		
		//COPIAR
		sMapKey = "CopiarCuentasContablesLineaProducto";
		inputMap = this.jButtonCopiarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentasContablesLineaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentasContablesLineaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormCuentasContablesLineaProducto";
		inputMap = this.jButtonVerFormCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentasContablesLineaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentasContablesLineaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentasContablesLineaProducto";
		inputMap = this.jButtonNuevoRelacionesCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentasContablesLineaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentasContablesLineaProducto";
		inputMap = this.jButtonModificarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentasContablesLineaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentasContablesLineaProducto";
		inputMap = this.jButtonCerrarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentasContablesLineaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentasContablesLineaProducto";
		inputMap = this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentasContablesLineaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentasContablesLineaProducto.setName("jPanelParametrosReportesCuentasContablesLineaProducto"); 
		
		this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto.setName("jPanelParametrosReportesAccionesCuentasContablesLineaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.setText("Recargar");
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.setToolTipText("Recargar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentasContablesLineaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setText("Procesar");
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setToolTipText("Procesar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesCuentasContablesLineaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentasContablesLineaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentasContablesLineaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setText("Accion");
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentasContablesLineaProducto = new JLabelMe();
		
		this.jLabelAccionesCuentasContablesLineaProducto.setText("Acciones");		
		this.jLabelAccionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentasContablesLineaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentasContablesLineaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentasContablesLineaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentasContablesLineaProducto = new JButtonMe();
		//this.jButtonAnterioresCuentasContablesLineaProducto.setText("<<");
        this.jButtonAnterioresCuentasContablesLineaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentasContablesLineaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentasContablesLineaProducto = new JButtonMe();
		//this.jButtonSiguientesCuentasContablesLineaProducto.setText(">>");
        this.jButtonSiguientesCuentasContablesLineaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentasContablesLineaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto,"nuevoguardarcambios_button","Nue",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentasContablesLineaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentasContablesLineaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentasContablesLineaProducto";
		inputMap = this.jButtonRecargarInformacionCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentasContablesLineaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentasContablesLineaProducto";
		inputMap = this.jButtonSiguientesCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentasContablesLineaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentasContablesLineaProducto";
		inputMap = this.jButtonAnterioresCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentasContablesLineaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentasContablesLineaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(this.getWidth(),CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(this.getWidth(),CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(this.getWidth(),CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentasContablesLineaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentasContablesLineaProducto = new GridBagLayout();

			this.jPanelPaginacionCuentasContablesLineaProducto.setLayout(gridaBagLayoutPaginacionCuentasContablesLineaProducto);						
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonAnterioresCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					
						
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
			
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonNuevoGuardarCambiosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
						
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonSiguientesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonNuevoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
						
			
			
			if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
				this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
				this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			}
			
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonDuplicarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonCopiarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonVerFormCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentasContablesLineaProducto.add(this.jButtonCerrarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
		
		
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentasContablesLineaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentasContablesLineaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentasContablesLineaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentasContablesLineaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentasContablesLineaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentasContablesLineaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentasContablesLineaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentasContablesLineaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentasContablesLineaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentasContablesLineaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentasContablesLineaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentasContablesLineaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentasContablesLineaProducto.setLayout(gridaBagParametrosReportesCuentasContablesLineaProducto);
			this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto.setLayout(gridaBagParametrosReportesAccionesCuentasContablesLineaProducto);
			
			
			this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto.setLayout(gridaBagParametrosAuxiliar1CuentasContablesLineaProducto);
			this.jPanelParametrosAuxiliar2CuentasContablesLineaProducto.setLayout(gridaBagParametrosAuxiliar2CuentasContablesLineaProducto);
			this.jPanelParametrosAuxiliar3CuentasContablesLineaProducto.setLayout(gridaBagParametrosAuxiliar3CuentasContablesLineaProducto);
			this.jPanelParametrosAuxiliar4CuentasContablesLineaProducto.setLayout(gridaBagParametrosAuxiliar4CuentasContablesLineaProducto);
			//this.jPanelParametrosAuxiliar5CuentasContablesLineaProducto.setLayout(gridaBagParametrosAuxiliar2CuentasContablesLineaProducto);			
			
			
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jButtonRecargarInformacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto.add(this.jComboBoxTiposPaginacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto.add(this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto.add(this.jComboBoxTiposArchivosReportesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jPanelParametrosAuxiliar1CuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentasContablesLineaProducto.add(this.jComboBoxTiposReportesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jPanelParametrosAuxiliar4CuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jComboBoxTiposReportesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jCheckBoxGenerarReporteCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jPanelParametrosAuxiliar2CuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jLabelAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
				this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jButtonAbrirOrderByCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jComboBoxTiposSeleccionarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			
			
			/*
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentasContablesLineaProducto.add(this.jCheckBoxSeleccionarTodosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);															
				
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentasContablesLineaProducto.add(this.jCheckBoxSeleccionadosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jPanelParametrosAuxiliar3CuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jComboBoxTiposAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	
				
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentasContablesLineaProducto.add(this.jTextFieldValorCampoGeneralCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposIniciogeneralCuentasContablesLineaProducto);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposIniciocuenta_contableCuentasContablesLineaProducto);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentasContablesLineaProducto = new GridBagLayout();

			this.jScrollPanelDatosCuentasContablesLineaProducto.setLayout(gridaBagLayoutDatosCuentasContablesLineaProducto);
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
			
			this.jScrollPanelDatosCuentasContablesLineaProducto.add(this.jTableDatosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentasContablesLineaProducto.setViewportView(this.jTableDatosCuentasContablesLineaProducto);
		this.jTableDatosCuentasContablesLineaProducto.setFillsViewportHeight(true);
		this.jTableDatosCuentasContablesLineaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelAccionesCuentasContablesLineaProducto.setLayout(gridaBagLayoutAccionesCuentasContablesLineaProducto);
		
		
		/*	
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
			
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonNuevoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaCuentasContablesLineaProducto.setLayout(gridaBagLayoutFK_IdBodegaCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		jPanelFK_IdBodegaCuentasContablesLineaProducto.add(jLabelid_bodegaFK_IdBodegaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
		jPanelFK_IdBodegaCuentasContablesLineaProducto.add(jComboBoxid_bodegaFK_IdBodegaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
		gridBagConstraintsCuentasContablesLineaProducto.gridx =1;
		jPanelFK_IdBodegaCuentasContablesLineaProducto.add(jButtonFK_IdBodegaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		jTabbedPaneBusquedasCuentasContablesLineaProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaCuentasContablesLineaProducto);
		jTabbedPaneBusquedasCuentasContablesLineaProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCuentasContablesLineaProducto.setLayout(gridaBagLayoutFK_IdCentroCostoCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		jPanelFK_IdCentroCostoCuentasContablesLineaProducto.add(jLabelid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
		jPanelFK_IdCentroCostoCuentasContablesLineaProducto.add(jComboBoxid_centro_costoFK_IdCentroCostoCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);


		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		jPanelFK_IdCentroCostoCuentasContablesLineaProducto.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
		gridBagConstraintsCuentasContablesLineaProducto.gridx =1;
		jPanelFK_IdCentroCostoCuentasContablesLineaProducto.add(jButtonFK_IdCentroCostoCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		jTabbedPaneBusquedasCuentasContablesLineaProducto.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoCuentasContablesLineaProducto);
		jTabbedPaneBusquedasCuentasContablesLineaProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCuentasContablesLineaProducto.setLayout(gridaBagLayoutFK_IdLineaCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		jPanelFK_IdLineaCuentasContablesLineaProducto.add(jLabelid_lineaFK_IdLineaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
		jPanelFK_IdLineaCuentasContablesLineaProducto.add(jComboBoxid_lineaFK_IdLineaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentasContablesLineaProducto.gridy = 1;
		gridBagConstraintsCuentasContablesLineaProducto.gridx =1;
		jPanelFK_IdLineaCuentasContablesLineaProducto.add(jButtonFK_IdLineaCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);

		jTabbedPaneBusquedasCuentasContablesLineaProducto.addTab("3.-Por Linea ", jPanelFK_IdLineaCuentasContablesLineaProducto);
		jTabbedPaneBusquedasCuentasContablesLineaProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentasContablesLineaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();						
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;		
			//this.gridBagConstraintsCuentasContablesLineaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;		
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;		
			this.gridBagConstraintsCuentasContablesLineaProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);								
		
		
		/*
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/		
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =0;
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentasContablesLineaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
				
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentasContablesLineaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentasContablesLineaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentasContablesLineaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentasContablesLineaProducto.setLayout(gridaBagLayoutBusquedasParametrosCuentasContablesLineaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentasContablesLineaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentasContablesLineaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentasContablesLineaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setName("jPanelReporteDinamicoCuentasContablesLineaProducto"); 
		
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.setLayout(gridaBagLayoutReporteDinamicoCuentasContablesLineaProducto);
		
		
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentasContablesLineaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentasContablesLineaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jLabelColumnasSelectReporteCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentasContablesLineaProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentasContablesLineaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentasContablesLineaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentasContablesLineaProducto=new JScrollPane(this.jListColumnasSelectReporteCuentasContablesLineaProducto);
			
			this.jScrollColumnasSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jListColumnasSelectReporteCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jScrollColumnasSelectReporteCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentasContablesLineaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentasContablesLineaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentasContablesLineaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentasContablesLineaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentasContablesLineaProducto=new JScrollPane(this.jListRelacionesSelectReporteCuentasContablesLineaProducto);
			
			this.jScrollRelacionesSelectReporteCuentasContablesLineaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentasContablesLineaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentasContablesLineaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentasContablesLineaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentasContablesLineaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jLabelGenerarExcelReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto.setToolTipText("Generar EXCEL"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jButtonGenerarExcelReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jComboBoxTiposReportesDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jLabelTiposArchivoReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentasContablesLineaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentasContablesLineaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentasContablesLineaProducto.setToolTipText("Generar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jButtonGenerarReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentasContablesLineaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentasContablesLineaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentasContablesLineaProducto.setToolTipText("Cancelar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentasContablesLineaProducto.add(this.jButtonCerrarReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentasContablesLineaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto= new JScrollPane(jPanelReporteDinamicoCuentasContablesLineaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentasContablesLineaProducto);
		this.jInternalFrameReporteDinamicoCuentasContablesLineaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentasContablesLineaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentasContablesLineaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentasContablesLineaProducto.setName("jPanelImportacionCuentasContablesLineaProducto"); 
		
		this.jPanelImportacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentasContablesLineaProducto.setLayout(gridaBagLayoutImportacionCuentasContablesLineaProducto);
		
		
		this.jInternalFrameImportacionCuentasContablesLineaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentasContablesLineaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentasContablesLineaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentasContablesLineaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setResizable(true);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setClosable(true);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setResizable(true);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setClosable(true);
	    this.jInternalFrameImportacionCuentasContablesLineaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelArchivoImportacionCuentasContablesLineaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jLabelArchivoImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentasContablesLineaProducto = new JFileChooser();		
		this.jFileChooserImportacionCuentasContablesLineaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonAbrirImportacionCuentasContablesLineaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentasContablesLineaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentasContablesLineaProducto.setToolTipText("Generar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jButtonAbrirImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentasContablesLineaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentasContablesLineaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jLabelPathArchivoImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentasContablesLineaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentasContablesLineaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentasContablesLineaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentasContablesLineaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jTextFieldPathArchivoImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonGenerarImportacionCuentasContablesLineaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentasContablesLineaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentasContablesLineaProducto.setToolTipText("Generar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jButtonGenerarImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonCerrarImportacionCuentasContablesLineaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentasContablesLineaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentasContablesLineaProducto.setToolTipText("Cancelar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentasContablesLineaProducto.add(this.jButtonCerrarImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentasContablesLineaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentasContablesLineaProducto= new JScrollPane(jPanelImportacionCuentasContablesLineaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentasContablesLineaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentasContablesLineaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentasContablesLineaProducto);
		this.jInternalFrameImportacionCuentasContablesLineaProducto.getContentPane().add(this.jScrollPanelImportacionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentasContablesLineaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentasContablesLineaProducto = new JButtonMe();
			this.jButtonAbrirOrderByCuentasContablesLineaProducto.setText("Orden");
			this.jButtonAbrirOrderByCuentasContablesLineaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentasContablesLineaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentasContablesLineaProducto";
			inputMap = this.jButtonAbrirOrderByCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentasContablesLineaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentasContablesLineaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentasContablesLineaProducto.setName("jPanelOrderByCuentasContablesLineaProducto"); 
			
			this.jPanelOrderByCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentasContablesLineaProducto.setLayout(gridaBagLayoutOrderByCuentasContablesLineaProducto);
			
			
			this.jTableDatosCuentasContablesLineaProductoOrderBy = new JTableMe();        
			this.jTableDatosCuentasContablesLineaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentasContablesLineaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentasContablesLineaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentasContablesLineaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentasContablesLineaProductoOrderBy.setViewportView(this.jTableDatosCuentasContablesLineaProductoOrderBy);
			this.jTableDatosCuentasContablesLineaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentasContablesLineaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentasContablesLineaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentasContablesLineaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentasContablesLineaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentasContablesLineaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setTitle("Orden");
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setResizable(true);
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setClosable(true);
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentasContablesLineaProducto.ipady =150;
				
			this.jPanelOrderByCuentasContablesLineaProducto.add(jScrollPanelDatosCuentasContablesLineaProductoOrderBy, this.gridBagConstraintsCuentasContablesLineaProducto);//this.jTableDatosCuentasContablesLineaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentasContablesLineaProducto = new JButtonMe();
			this.jButtonCerrarOrderByCuentasContablesLineaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentasContablesLineaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentasContablesLineaProducto.setToolTipText("Cancelar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentasContablesLineaProducto.add(this.jButtonCerrarOrderByCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentasContablesLineaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentasContablesLineaProducto= new JScrollPane(jPanelOrderByCuentasContablesLineaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentasContablesLineaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentasContablesLineaProducto);
			
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getContentPane().add(this.jScrollPanelOrderByCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
		
		} else {
			this.jButtonAbrirOrderByCuentasContablesLineaProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentascontableslineaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentasContablesLineaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentasContablesLineaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentasContablesLineaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentasContablesLineaProducto.getRowHeight();//CuentasContablesLineaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.isSelected()) {
					iHeightTable=CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentasContablesLineaProducto.isSelected()) {
					iHeightTable=CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentasContablesLineaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentasContablesLineaProducto!=null && this.jInternalFrameOrderByCuentasContablesLineaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentasContablesLineaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentasContablesLineaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentascontableslineaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentasContablesLineaProducto> TraerCuentasContablesLineaProductoBeans(List<CuentasContablesLineaProducto> cuentascontableslineaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentasContablesLineaProducto cuentascontableslineaproducto:cuentascontableslineaproductos) {
					
				if(!(CuentasContablesLineaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentasContablesLineaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentascontableslineaproducto.setsDetalleGeneralEntityReporte(CuentasContablesLineaProductoConstantesFunciones.getCuentasContablesLineaProductoDescripcion(cuentascontableslineaproducto));
										
						
					
						
					
				} else  {
							
					//cuentascontableslineaproducto.setsDetalleGeneralEntityReporte(cuentascontableslineaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentascontableslineaproductobeans.add(cuentascontableslineaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentascontableslineaproductos;
    }
	//PARA REPORTES FIN
}
