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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.inventario.util.BodegaConstantesFunciones;

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
public class BodegaJInternalFrame extends BodegaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBodega;
	
	protected JMenuBar jmenuBarBodega;
	
	protected JMenu jmenuBodega;
	protected JMenu jmenuDatosBodega;
	protected JMenu jmenuArchivoBodega;
	protected JMenu jmenuAccionesBodega;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodega;	
	protected GridBagConstraints gridBagConstraintsBodega;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BodegaDetalleFormJInternalFrame jInternalFrameDetalleFormBodega;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBodega;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBodega;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoBodegaBeanSwingJInternalFrame grupobodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupobodega="";

	protected CalidadProductoBeanSwingJInternalFrame calidadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_calidadproducto="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public BodegaSessionBean bodegaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoBodegaSessionBean grupobodegaSessionBean;
	public CalidadProductoSessionBean calidadproductoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Bodega> bodegas;		
	public List<Bodega> bodegasEliminados;	
	public List<Bodega> bodegasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBodega;		
	protected JButton jButtonAbrirOrderByBodega;
	
	
	//protected JPanel jPanelOrderByBodega;
	//public JScrollPane jScrollPanelOrderByBodega;	
	//protected JButton jButtonCerrarOrderByBodega;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BodegaLogic bodegaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBodega;
	public JScrollPane jScrollPanelDatosEdicionBodega;
	public JScrollPane jScrollPanelDatosGeneralBodega;
    
	
	
	//public JScrollPane jScrollPanelDatosBodegaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBodega;
	//public JScrollPane jScrollPanelImportacionBodega;
	
	
	
	protected JPanel jPanelAccionesBodega;
	
    protected JPanel jPanelPaginacionBodega;
    protected JPanel jPanelParametrosReportesBodega;
	protected JPanel jPanelParametrosReportesAccionesBodega;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralBodega;
	protected Integer iXPanelCamposIniciogeneralBodega=0;
	protected Integer iYPanelCamposIniciogeneralBodega=0;

	protected JPanel jPanelCamposIniciodatoBodega;
	protected Integer iXPanelCamposIniciodatoBodega=0;
	protected Integer iYPanelCamposIniciodatoBodega=0;

	protected JPanel jPanelCamposIniciocuenta_contableBodega;
	protected Integer iXPanelCamposIniciocuenta_contableBodega=0;
	protected Integer iYPanelCamposIniciocuenta_contableBodega=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Bodega;
	protected JPanel jPanelParametrosAuxiliar2Bodega;
	protected JPanel jPanelParametrosAuxiliar3Bodega;
	protected JPanel jPanelParametrosAuxiliar4Bodega;
	//protected JPanel jPanelParametrosAuxiliar5Bodega;
	
	
	
	//protected JPanel jPanelReporteDinamicoBodega;
	//protected JPanel jPanelImportacionBodega;
	
	
	public JTable jTableDatosBodega;
	
	
	
	//public JTable jTableDatosBodegaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBodega;
	protected JButton jButtonDuplicarBodega;
	protected JButton jButtonCopiarBodega;
	protected JButton jButtonVerFormBodega;
	protected JButton jButtonNuevoRelacionesBodega;
	protected JButton jButtonModificarBodega;
	
    protected JButton jButtonGuardarCambiosTablaBodega;
	protected JButton jButtonCerrarBodega;
	
	
	protected JButton jButtonRecargarInformacionBodega;
	protected JButton jButtonProcesarInformacionBodega;
	
	
	protected JButton jButtonAnterioresBodega;
	protected JButton jButtonSiguientesBodega;
	protected JButton jButtonNuevoGuardarCambiosBodega;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBodega;
	//protected JButton jButtonCerrarReporteDinamicoBodega;
	//protected JButton jButtonGenerarExcelReporteDinamicoBodega;	
	
	
	
	//protected JButton jButtonAbrirImportacionBodega;
	//protected JButton jButtonGenerarImportacionBodega;
	//protected JButton jButtonCerrarImportacionBodega;
	//protected JFileChooser jFileChooserImportacionBodega;
	//protected File fileImportacionBodega;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodega;
	protected JButton jButtonDuplicarToolBarBodega;
	protected JButton jButtonNuevoRelacionesToolBarBodega;
	
	
	public JButton jButtonGuardarCambiosToolBarBodega;
	protected JButton jButtonCopiarToolBarBodega;
	protected JButton jButtonVerFormToolBarBodega;
	public JButton jButtonGuardarCambiosTablaToolBarBodega;
	protected JButton jButtonMostrarOcultarTablaToolBarBodega;
	protected JButton jButtonCerrarToolBarBodega;
	
	protected JButton jButtonRecargarInformacionToolBarBodega;
	protected JButton jButtonProcesarInformacionToolBarBodega;
	protected JButton jButtonAnterioresToolBarBodega;
	protected JButton jButtonSiguientesToolBarBodega;
	protected JButton jButtonNuevoGuardarCambiosToolBarBodega;
	protected JButton jButtonAbrirOrderByToolBarBodega;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodega;
	protected JMenuItem jMenuItemDuplicarBodega;
	protected JMenuItem jMenuItemNuevoRelacionesBodega;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBodega;
	protected JMenuItem jMenuItemCopiarBodega;
	protected JMenuItem jMenuItemVerFormBodega;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodega;
	protected JMenuItem jMenuItemCerrarBodega;
	protected JMenuItem jMenuItemDetalleCerrarBodega;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBodega;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodega;
	
	protected JMenuItem jMenuItemRecargarInformacionBodega;
	protected JMenuItem jMenuItemProcesarInformacionBodega;
	protected JMenuItem jMenuItemAnterioresBodega;
	protected JMenuItem jMenuItemSiguientesBodega;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodega;
	protected JMenuItem jMenuItemAbrirOrderByBodega;
	protected JMenuItem jMenuItemMostrarOcultarBodega;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodega;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBodega;
	protected JCheckBox jCheckBoxSeleccionadosBodega;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBodega;
	protected JCheckBox jCheckBoxConGraficoReporteBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBodega;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBodega;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBodega;
	protected JTextField jTextFieldValorCampoGeneralBodega;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBodega;
	//public JList<Reporte> jListColumnasSelectReporteBodega;
	//public JScrollPane jScrollColumnasSelectReporteBodega;
	
	//public JLabel jLabelRelacionesSelectReporteBodega;
	//public JList<Reporte> jListRelacionesSelectReporteBodega;
	//public JScrollPane jScrollRelacionesSelectReporteBodega;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBodega;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBodega;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBodega;
	//public JLabel jLabelTiposArchivoReporteDinamicoBodega;
	
		
	//public JLabel jLabelArchivoImportacionBodega;	
	//public JLabel jLabelPathArchivoImportacionBodega;
	//protected JTextField jTextFieldPathArchivoImportacionBodega;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBodega;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBodega;
	
	//public JLabel jLabelColumnaCategoriaValorBodega;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBodega;
	
	//public JLabel jLabelColumnasValoresGraficoBodega;
	//public JList<Reporte> jListColumnasValoresGraficoBodega;
	//public JScrollPane jScrollColumnasValoresGraficoBodega;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBodega;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBodega;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBodega;
	public JPanel jPanelBusquedaPorCodigoBodega;
	public JButton jButtonBusquedaPorCodigoBodega;
	public JPanel jPanelBusquedaPorNombreBodega;
	public JButton jButtonBusquedaPorNombreBodega;
	public JPanel jPanelBusquedaPorResponsableNombreBodega;
	public JButton jButtonBusquedaPorResponsableNombreBodega;
	public JPanel jPanelFK_IdCalidadProductoBodega;
	public JButton jButtonFK_IdCalidadProductoBodega;
	public JPanel jPanelFK_IdCentroCostoBodega;
	public JButton jButtonFK_IdCentroCostoBodega;
	public JPanel jPanelFK_IdEmpleadoBodega;
	public JButton jButtonFK_IdEmpleadoBodega;
	public JPanel jPanelFK_IdGrupoBodegaBodega;
	public JButton jButtonFK_IdGrupoBodegaBodega;
	
	public JPanel jPanelcodigoBusquedaPorCodigoBodega;
	public JLabel jLabelcodigoBusquedaPorCodigoBodega;
	public JTextArea jTextAreacodigoBusquedaPorCodigoBodega;
	public JButton jButtoncodigoBusquedaPorCodigoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreBodega;
	public JLabel jLabelnombreBusquedaPorNombreBodega;
	public JTextArea jTextAreanombreBusquedaPorNombreBodega;
	public JButton jButtonnombreBusquedaPorNombreBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelresponsable_nombreBusquedaPorResponsableNombreBodega;
	public JLabel jLabelresponsable_nombreBusquedaPorResponsableNombreBodega;
	public JTextArea jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega;
	public JButton jButtonresponsable_nombreBusquedaPorResponsableNombreBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_calidad_productoFK_IdCalidadProductoBodega;
	public JLabel jLabelid_calidad_productoFK_IdCalidadProductoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_calidad_productoFK_IdCalidadProductoBodega;
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoBodega= new JButtonMe();
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoBodega;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoBodega;
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodega= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoBodega;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoBodega;
	public JLabel jLabelid_empleadoFK_IdEmpleadoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoBodega;
	public JButton jButtonid_empleadoFK_IdEmpleadoBodega= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoBodegaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoBodega;
	
	public JPanel jPanelid_grupo_bodegaFK_IdGrupoBodegaBodega;
	public JLabel jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega;
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaBodega= new JButtonMe();
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaBodegaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1100;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BodegaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBodega)	{
		this.jButtonRecargarInformacionBodega = jButtonRecargarInformacionBodega;
	}
	
	public JButton getjButtonProcesarInformacionBodega() {
		return this.jButtonProcesarInformacionBodega;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodega)	{
		this.jButtonProcesarInformacionBodega = jButtonProcesarInformacionBodega;
	}
	
	
	public JButton getjButtonRecargarInformacionBodega() {
		return this.jButtonRecargarInformacionBodega;
	}
	
	
	public List<Bodega> getbodegas() {
		return this.bodegas;
	}

	public void setbodegas(List<Bodega> bodegas) {
		this.bodegas = bodegas;
	}
	
	public List<Bodega> getbodegasAux() {
		return this.bodegasAux;
	}

	public void setbodegasAux(List<Bodega> bodegasAux) {
		this.bodegasAux = bodegasAux;
	}
	
	public List<Bodega> getbodegasEliminados() {
		return this.bodegasEliminados;
	}

	public void setBodegasEliminados(List<Bodega> bodegasEliminados) {
		this.bodegasEliminados = bodegasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBodega() {
		return jComboBoxTiposSeleccionarBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBodega(
			JComboBox jComboBoxTiposSeleccionarBodega) {
		this.jComboBoxTiposSeleccionarBodega = jComboBoxTiposSeleccionarBodega;
	}
	
	public void setBorderResaltarTiposSeleccionarBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBodega .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBodega() {
		return jTextFieldValorCampoGeneralBodega;
	}

	public void setjTextFieldValorCampoGeneralBodega(
			JTextField jTextFieldValorCampoGeneralBodega) {
		this.jTextFieldValorCampoGeneralBodega = jTextFieldValorCampoGeneralBodega;
	}

	public void setBorderResaltarValorCampoGeneralBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBodega .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBodega() {
		return this.jCheckBoxSeleccionarTodosBodega;
	}

	public void setjCheckBoxSeleccionarTodosBodega(
			JCheckBox jCheckBoxSeleccionarTodosBodega) {
		this.jCheckBoxSeleccionarTodosBodega = jCheckBoxSeleccionarTodosBodega;
	}

	public void setBorderResaltarSeleccionarTodosBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBodega .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBodega() {
		return this.jCheckBoxSeleccionadosBodega;
	}

	public void setjCheckBoxSeleccionadosBodega(
			JCheckBox jCheckBoxSeleccionadosBodega) {
		this.jCheckBoxSeleccionadosBodega = jCheckBoxSeleccionadosBodega;
	}
	
	public void setBorderResaltarSeleccionadosBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBodega .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBodega() {
		return this.jComboBoxTiposArchivosReportesBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBodega(
			JComboBox jComboBoxTiposArchivosReportesBodega) {
		this.jComboBoxTiposArchivosReportesBodega = jComboBoxTiposArchivosReportesBodega;
	}

	public void setBorderResaltarTiposArchivosReportesBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBodega() {
		return this.jComboBoxTiposReportesBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBodega(
			JComboBox jComboBoxTiposReportesBodega) {
		this.jComboBoxTiposReportesBodega = jComboBoxTiposReportesBodega;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBodega() {
	//	return jComboBoxTiposReportesDinamicoBodega;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBodega(
	//		JComboBox jComboBoxTiposReportesDinamicoBodega) {
	//	this.jComboBoxTiposReportesDinamicoBodega = jComboBoxTiposReportesDinamicoBodega;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBodega() {
	//	return jComboBoxTiposArchivosReportesDinamicoBodega;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBodega(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBodega) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBodega = jComboBoxTiposArchivosReportesDinamicoBodega;
	//}
	
	public void setBorderResaltarTiposReportesBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBodega() {
		return this.jComboBoxTiposGraficosReportesBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBodega(
			JComboBox jComboBoxTiposGraficosReportesBodega) {
		this.jComboBoxTiposGraficosReportesBodega = jComboBoxTiposGraficosReportesBodega;
	}
	
	public void setBorderResaltarTiposGraficosReportesBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBodega() {
		return this.jComboBoxTiposPaginacionBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBodega(
			JComboBox jComboBoxTiposPaginacionBodega) {
		this.jComboBoxTiposPaginacionBodega = jComboBoxTiposPaginacionBodega;
	}
	
	public void setBorderResaltarTiposPaginacionBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBodega() {
		return this.jComboBoxTiposRelacionesBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBodega() {
		return this.jComboBoxTiposAccionesBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBodega(
			JComboBox jComboBoxTiposRelacionesBodega) {
		this.jComboBoxTiposRelacionesBodega = jComboBoxTiposRelacionesBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBodega(
			JComboBox jComboBoxTiposAccionesBodega) {
		this.jComboBoxTiposAccionesBodega = jComboBoxTiposAccionesBodega;
	}
	
	public void setBorderResaltarTiposRelacionesBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBodega .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBodega .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBodega() {
	//	return jCheckBoxConGraficoDinamicoBodega;
	//}

	//public void setjCheckBoxConGraficoDinamicoBodega(
	//		JCheckBox jCheckBoxConGraficoDinamicoBodega) {
	//	this.jCheckBoxConGraficoDinamicoBodega = jCheckBoxConGraficoDinamicoBodega;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBodega() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBodega.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBodega .setBorder(borderResaltar);		
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
		this.bodegaSessionBean=new BodegaSessionBean();
		
		this.bodegaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BodegaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BodegaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BodegaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bodega MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
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
		
		BodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBodega= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBodega,this.jTtoolBarBodega,
							"nuevo","nuevo","Nuevo"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBodega,this.jTtoolBarBodega,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBodega,this.jTtoolBarBodega,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBodega,this.jTtoolBarBodega,
							"duplicar","duplicar","Duplicar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBodega,this.jTtoolBarBodega,
							"copiar","copiar","Copiar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBodega,this.jTtoolBarBodega,
							"ver_form","ver_form","Ver"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodega,this.jTtoolBarBodega,
							"recargar","recargar","Recargar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodega,this.jTtoolBarBodega,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodega,this.jTtoolBarBodega,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBodega,this.jTtoolBarBodega,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBodega,this.jTtoolBarBodega,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBodega,this.jTtoolBarBodega,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBodega,this.jTtoolBarBodega,
							"cerrar","cerrar","Salir"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBodega=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBodega;
			
				this.jButtonProcesarInformacionToolBarBodega=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBodega;
				
		//protected JButton jButtonModificarToolBarBodega;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBodega=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBodega=new JMenuMe("General");
		this.jmenuArchivoBodega=new JMenuMe("Archivo");
		this.jmenuAccionesBodega=new JMenuMe("Acciones");
		this.jmenuDatosBodega=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodega= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodega.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodega,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBodega= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBodega.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBodega,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBodega= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBodega.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBodega,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBodega= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodega.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodega,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBodega= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBodega.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBodega,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBodega= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBodega.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBodega,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBodega= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBodega.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBodega,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBodega= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBodega.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBodega,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBodega= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBodega.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBodega,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBodega= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBodega.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBodega,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBodega= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBodega.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBodega,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBodega= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBodega.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBodega,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodega,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBodega= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBodega.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBodega,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodega,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBodega= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBodega.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBodega,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBodega.add(this.jMenuItemCerrarBodega);
			
			this.jmenuAccionesBodega.add(this.jMenuItemNuevoBodega);
			this.jmenuAccionesBodega.add(this.jMenuItemNuevoGuardarCambiosBodega);
			this.jmenuAccionesBodega.add(this.jMenuItemNuevoRelacionesBodega);
			this.jmenuAccionesBodega.add(this.jMenuItemGuardarCambiosTablaBodega);		
			this.jmenuAccionesBodega.add(this.jMenuItemDuplicarBodega);		
			this.jmenuAccionesBodega.add(this.jMenuItemCopiarBodega);		
			this.jmenuAccionesBodega.add(this.jMenuItemVerFormBodega);		
			
			this.jmenuDatosBodega.add(this.jMenuItemRecargarInformacionBodega);				
			this.jmenuDatosBodega.add(this.jMenuItemAnterioresBodega);				
			this.jmenuDatosBodega.add(this.jMenuItemSiguientesBodega);				
			this.jmenuDatosBodega.add(this.jMenuItemAbrirOrderByBodega);				
			this.jmenuDatosBodega.add(this.jMenuItemMostrarOcultarBodega);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBodega.add(this.jMenuItemGuardarCambiosBodega);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBodega.add(this.jmenuArchivoBodega);		
			this.jmenuBarBodega.add(this.jmenuAccionesBodega);		
			this.jmenuBarBodega.add(this.jmenuDatosBodega);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBodega);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBodega() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoBodega.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoBodega= new JButtonMe();
		this.jButtonBusquedaPorCodigoBodega.setText("Buscar");
		this.jButtonBusquedaPorCodigoBodega.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoBodega,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoBodega = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoBodega.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoBodega.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoBodega= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreBodega.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreBodega= new JButtonMe();
		this.jButtonBusquedaPorNombreBodega.setText("Buscar");
		this.jButtonBusquedaPorNombreBodega.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreBodega,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreBodega = new JLabelMe();
		jLabelnombreBusquedaPorNombreBodega.setText("Nombre :");
		jLabelnombreBusquedaPorNombreBodega.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreBodega= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorResponsableNombreBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorResponsableNombreBodega.setToolTipText("Buscar Por Responsable Nombre ");
		this.jButtonBusquedaPorResponsableNombreBodega= new JButtonMe();
		this.jButtonBusquedaPorResponsableNombreBodega.setText("Buscar");
		this.jButtonBusquedaPorResponsableNombreBodega.setToolTipText("Buscar Por Responsable Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorResponsableNombreBodega,"buscar_button","Buscar Por Responsable Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorResponsableNombreBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega = new JLabelMe();
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega.setText("Responsable Nombre :");
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega.setToolTipText("Responsable Nombre");
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelresponsable_nombreBusquedaPorResponsableNombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelresponsable_nombreBusquedaPorResponsableNombreBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega= new JTextAreaMe();
		jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCalidadProductoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCalidadProductoBodega.setToolTipText("Buscar Por Calidad Producto ");
		this.jButtonFK_IdCalidadProductoBodega= new JButtonMe();
		this.jButtonFK_IdCalidadProductoBodega.setText("Buscar");
		this.jButtonFK_IdCalidadProductoBodega.setToolTipText("Buscar Por Calidad Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCalidadProductoBodega,"buscar_button","Buscar Por Calidad Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCalidadProductoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_calidad_productoFK_IdCalidadProductoBodega = new JLabelMe();
		jLabelid_calidad_productoFK_IdCalidadProductoBodega.setText("Calidad Producto :");
		jLabelid_calidad_productoFK_IdCalidadProductoBodega.setToolTipText("Calidad Producto");
		jLabelid_calidad_productoFK_IdCalidadProductoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_calidad_productoFK_IdCalidadProductoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_calidad_productoFK_IdCalidadProductoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_calidad_productoFK_IdCalidadProductoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_calidad_productoFK_IdCalidadProductoBodega= new JComboBoxMe();
		jComboBoxid_calidad_productoFK_IdCalidadProductoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoFK_IdCalidadProductoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoFK_IdCalidadProductoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_calidad_productoFK_IdCalidadProductoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoBodega.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoBodega= new JButtonMe();
		this.jButtonFK_IdCentroCostoBodega.setText("Buscar");
		this.jButtonFK_IdCentroCostoBodega.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoBodega,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoBodega = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoBodega.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoBodega.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoBodega= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega.setFocusable(false);

		this.jPanelFK_IdEmpleadoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoBodega.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoBodega= new JButtonMe();
		this.jButtonFK_IdEmpleadoBodega.setText("Buscar");
		this.jButtonFK_IdEmpleadoBodega.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoBodega,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoBodega = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoBodega.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoBodega.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoBodega= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega.setFocusable(false);

		this.jPanelFK_IdGrupoBodegaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoBodegaBodega.setToolTipText("Buscar Por Grupo Bodega ");
		this.jButtonFK_IdGrupoBodegaBodega= new JButtonMe();
		this.jButtonFK_IdGrupoBodegaBodega.setText("Buscar");
		this.jButtonFK_IdGrupoBodegaBodega.setToolTipText("Buscar Por Grupo Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoBodegaBodega,"buscar_button","Buscar Por Grupo Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoBodegaBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega = new JLabelMe();
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega.setText("Grupo Bodega :");
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega.setToolTipText("Grupo Bodega");
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega= new JComboBoxMe();
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBodega=new JTabbedPane();


		this.jTabbedPaneBusquedasBodega.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBodega.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBodega.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBodega,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBodega = new BodegaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bodega DATOS");
			this.jInternalFrameDetalleFormBodega = new BodegaDetalleFormJInternalFrame(jDesktopPane,this.bodegaSessionBean.getConGuardarRelaciones(),this.bodegaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBodega = null;//new BodegaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodega= new GridBagLayout();
		
		
		this.jTableDatosBodega = new JTableMe();      
		
		String sToolTipBodega="";
		sToolTipBodega=BodegaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodega+="(Inventario.Bodega)";
		}
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodega+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBodega.setToolTipText(sToolTipBodega);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBodega);
		this.jTableDatosBodega.setAutoCreateRowSorter(true);
		this.jTableDatosBodega.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBodega.setRowSelectionAllowed(true);
		this.jTableDatosBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBodega,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBodega = new JButtonMe();
		this.jButtonDuplicarBodega = new JButtonMe();
		this.jButtonCopiarBodega = new JButtonMe();
		this.jButtonVerFormBodega = new JButtonMe();
		this.jButtonNuevoRelacionesBodega = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBodega = new JButtonMe();
		this.jButtonCerrarBodega = new JButtonMe();
		
		this.jScrollPanelDatosBodega = new JScrollPane();   
        this.jScrollPanelDatosGeneralBodega = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Bodega";
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas" + this.sPath));
		} else {
			this.jScrollPanelDatosBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodega.setToolTipText("Acciones");
        this.jPanelAccionesBodega.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodega, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralBodega.setName("jPanelCamposFingeneralBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));
		this.jPanelCamposIniciodatoBodega.setName("jPanelCamposFindatoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatoBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableBodega.setName("jPanelCamposFincuenta_contableBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableBodega, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoBodega=new ReporteDinamicoJInternalFrame(BodegaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBodega();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBodega=new ImportacionJInternalFrame(BodegaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBodega();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBodega = new JButtonMe();
		
		this.jButtonAbrirOrderByBodega.setText("Orden");
		this.jButtonAbrirOrderByBodega.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodega,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodega=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodega,false,this);
			
			//this.cargarOrderByBodega(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodega=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodega,true,this);
			
			//this.cargarOrderByBodega(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBodega.setMinimumSize(new Dimension(400,50));//3030
		this.jTableDatosBodega.setMaximumSize(new Dimension(400,50));//3030
		this.jTableDatosBodega.setPreferredSize(new Dimension(400,50));//3030
		
		this.jScrollPanelDatosBodega.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodega.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodega.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBodega.setText("Nuevo");
		this.jButtonDuplicarBodega.setText("Duplicar");
		this.jButtonCopiarBodega.setText("Copiar");
		this.jButtonVerFormBodega.setText("Ver");
		this.jButtonNuevoRelacionesBodega.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBodega.setText("Guardar");
		this.jButtonCerrarBodega.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodega,"nuevo_button","Nuevo",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBodega,"duplicar_button","Duplicar",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBodega,"copiar_button","Copiar",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBodega,"ver_form","Ver",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBodega,"nuevorelaciones_button","Nuevo Rel",this.bodegaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodega,"guardarcambiostabla_button","Guardar",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodega,"cerrar_button","Salir",this.bodegaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBodega.setToolTipText("Nuevo"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBodega.setToolTipText("Duplicar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBodega.setToolTipText("Copiar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBodega.setToolTipText("Ver"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBodega.setToolTipText("Nuevo Rel"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBodega.setToolTipText("Guardar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBodega.setToolTipText("Salir"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBodega";
		inputMap = this.jButtonNuevoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodega"));
		
		//DUPLICAR
		sMapKey = "DuplicarBodega";
		inputMap = this.jButtonDuplicarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBodega"));
		
		//COPIAR
		sMapKey = "CopiarBodega";
		inputMap = this.jButtonCopiarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBodega"));
		
		//VEr FORM
		sMapKey = "VerFormBodega";
		inputMap = this.jButtonVerFormBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBodega"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBodega";
		inputMap = this.jButtonNuevoRelacionesBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBodega"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBodega";
		inputMap = this.jButtonModificarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBodega"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBodega";
		inputMap = this.jButtonCerrarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBodega"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBodega";
		inputMap = this.jButtonGuardarCambiosTablaBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBodega"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Bodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Bodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Bodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Bodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Bodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBodega.setName("jPanelParametrosReportesBodega"); 
		
		this.jPanelParametrosReportesAccionesBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBodega.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBodega.setName("jPanelParametrosReportesAccionesBodega"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBodega, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBodega, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBodega = new JButtonMe();
		this.jButtonRecargarInformacionBodega.setText("Recargar");
		this.jButtonRecargarInformacionBodega.setToolTipText("Recargar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBodega,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBodega = new JButtonMe();
		this.jButtonProcesarInformacionBodega.setText("Procesar");
		this.jButtonProcesarInformacionBodega.setToolTipText("Procesar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBodega.setVisible(false);
			
		this.jButtonProcesarInformacionBodega.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodega.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodega.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodega.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBodega.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodega.setText("TIPO");       
		this.jComboBoxTiposReportesBodega.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodega.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBodega.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBodega = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBodega.setText("Paginacion");
		this.jComboBoxTiposPaginacionBodega.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBodega = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBodega.setText("Accion");
		this.jComboBoxTiposRelacionesBodega.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodega.setText("Accion");
		this.jComboBoxTiposAccionesBodega.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBodega = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBodega.setText("Accion");
		this.jComboBoxTiposSeleccionarBodega.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBodega=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBodega.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodega.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodega.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBodega = new JLabelMe();
		
		this.jLabelAccionesBodega.setText("Acciones");		
		this.jLabelAccionesBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBodega = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBodega.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBodega.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBodega = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBodega.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBodega.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBodega = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBodega.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBodega.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBodega = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBodega.setText("Graf.");
		this.jCheckBoxConGraficoReporteBodega.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBodega = new JButtonMe();
		//this.jButtonAnterioresBodega.setText("<<");
        this.jButtonAnterioresBodega.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBodega,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBodega = new JButtonMe();
		//this.jButtonSiguientesBodega.setText(">>");
        this.jButtonSiguientesBodega.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBodega,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBodega = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBodega.setText("Nue");
        this.jButtonNuevoGuardarCambiosBodega.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBodega,"nuevoguardarcambios_button","Nue",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBodega";
		inputMap = this.jButtonNuevoGuardarCambiosBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBodega"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBodega";
		inputMap = this.jButtonRecargarInformacionBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBodega"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBodega";
		inputMap = this.jButtonSiguientesBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBodega"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBodega";
		inputMap = this.jButtonAnterioresBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBodega"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBodega();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBodega.setMinimumSize(new Dimension(this.getWidth(),BodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodega.setMaximumSize(new Dimension(this.getWidth(),BodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodega.setPreferredSize(new Dimension(this.getWidth(),BodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBodega = new GridBagLayout();

			this.jPanelPaginacionBodega.setLayout(gridaBagLayoutPaginacionBodega);						
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 0;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBodega.add(this.jButtonAnterioresBodega, this.gridBagConstraintsBodega);
					
						
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodega.gridy = 0;
			
			this.jPanelPaginacionBodega.add(this.jButtonNuevoGuardarCambiosBodega, this.gridBagConstraintsBodega);
						
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodega.gridy = 0;
			this.jPanelPaginacionBodega.add(this.jButtonSiguientesBodega, this.gridBagConstraintsBodega);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 1;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodega.add(this.jButtonNuevoBodega, this.gridBagConstraintsBodega);
						
			
			
			if(!this.bodegaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBodega = new GridBagConstraints();
				this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBodega.gridy = 1;
				this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBodega.add(this.jButtonGuardarCambiosTablaBodega, this.gridBagConstraintsBodega);
			}
			
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 1;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodega.add(this.jButtonDuplicarBodega, this.gridBagConstraintsBodega);
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 1;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodega.add(this.jButtonCopiarBodega, this.gridBagConstraintsBodega);
		
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 1;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodega.add(this.jButtonVerFormBodega, this.gridBagConstraintsBodega);
		
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 1;
			this.gridBagConstraintsBodega.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBodega.add(this.jButtonCerrarBodega, this.gridBagConstraintsBodega);
		
		
		
		this.jButtonRecargarInformacionBodega.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodega.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodega.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBodega.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodega.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodega.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBodega.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodega.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodega.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBodega.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodega.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodega.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBodega.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodega.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodega.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBodega.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodega.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodega.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBodega.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodega.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodega.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBodega.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodega.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodega.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBodega = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Bodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Bodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Bodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Bodega = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBodega.setLayout(gridaBagParametrosReportesBodega);
			this.jPanelParametrosReportesAccionesBodega.setLayout(gridaBagParametrosReportesAccionesBodega);
			
			
			this.jPanelParametrosAuxiliar1Bodega.setLayout(gridaBagParametrosAuxiliar1Bodega);
			this.jPanelParametrosAuxiliar2Bodega.setLayout(gridaBagParametrosAuxiliar2Bodega);
			this.jPanelParametrosAuxiliar3Bodega.setLayout(gridaBagParametrosAuxiliar3Bodega);
			this.jPanelParametrosAuxiliar4Bodega.setLayout(gridaBagParametrosAuxiliar4Bodega);
			//this.jPanelParametrosAuxiliar5Bodega.setLayout(gridaBagParametrosAuxiliar2Bodega);			
			
			
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodega.add(this.jButtonRecargarInformacionBodega, this.gridBagConstraintsBodega);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bodega.add(this.jComboBoxTiposPaginacionBodega, this.gridBagConstraintsBodega);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bodega.add(this.jCheckBoxConAltoMaximoTablaBodega, this.gridBagConstraintsBodega);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bodega.add(this.jComboBoxTiposArchivosReportesBodega, this.gridBagConstraintsBodega);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodega.add(this.jPanelParametrosAuxiliar1Bodega, this.gridBagConstraintsBodega);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Bodega.add(this.jComboBoxTiposReportesBodega, this.gridBagConstraintsBodega);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodega.add(this.jPanelParametrosAuxiliar4Bodega, this.gridBagConstraintsBodega);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodega.add(this.jComboBoxTiposReportesBodega, this.gridBagConstraintsBodega);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodega.add(this.jCheckBoxGenerarReporteBodega, this.gridBagConstraintsBodega);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodega.add(this.jPanelParametrosAuxiliar2Bodega, this.gridBagConstraintsBodega);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodega.add(this.jLabelAccionesBodega, this.gridBagConstraintsBodega);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBodega = new GridBagConstraints();
				this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBodega.add(this.jButtonAbrirOrderByBodega, this.gridBagConstraintsBodega);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodega.add(this.jComboBoxTiposSeleccionarBodega, this.gridBagConstraintsBodega);			
			
			
			/*
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodega.add(this.jCheckBoxSeleccionarTodosBodega, this.gridBagConstraintsBodega);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bodega.add(this.jCheckBoxSeleccionarTodosBodega, this.gridBagConstraintsBodega);															
				
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bodega.add(this.jCheckBoxSeleccionadosBodega, this.gridBagConstraintsBodega);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodega.add(this.jPanelParametrosAuxiliar3Bodega, this.gridBagConstraintsBodega);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodega.add(this.jComboBoxTiposAccionesBodega, this.gridBagConstraintsBodega);
	
				
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodega.add(this.jTextFieldValorCampoGeneralBodega, this.gridBagConstraintsBodega);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralBodega= new GridBagLayout();
		this.jPanelCamposIniciogeneralBodega.setLayout(gridaBagLayoutCamposIniciogeneralBodega);

		GridBagLayout gridaBagLayoutCamposIniciodatoBodega= new GridBagLayout();
		this.jPanelCamposIniciodatoBodega.setLayout(gridaBagLayoutCamposIniciodatoBodega);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableBodega= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableBodega.setLayout(gridaBagLayoutCamposIniciocuenta_contableBodega);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBodega = new GridBagLayout();

			this.jScrollPanelDatosBodega.setLayout(gridaBagLayoutDatosBodega);
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = 0;
			this.gridBagConstraintsBodega.gridx = 0;
			
			this.jScrollPanelDatosBodega.add(this.jTableDatosBodega, this.gridBagConstraintsBodega);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBodega.setViewportView(this.jTableDatosBodega);
		this.jTableDatosBodega.setFillsViewportHeight(true);
		this.jTableDatosBodega.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBodega= new GridBagLayout();
		this.jPanelAccionesBodega.setLayout(gridaBagLayoutAccionesBodega);
		
		
		/*	
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 0;
			
		this.jPanelAccionesBodega.add(this.jButtonNuevoBodega, this.gridBagConstraintsBodega);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoBodega.setLayout(gridaBagLayoutBusquedaPorCodigoBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelBusquedaPorCodigoBodega.add(jLabelcodigoBusquedaPorCodigoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelBusquedaPorCodigoBodega.add(jTextAreacodigoBusquedaPorCodigoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelBusquedaPorCodigoBodega.add(jButtonBusquedaPorCodigoBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreBodega.setLayout(gridaBagLayoutBusquedaPorNombreBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelBusquedaPorNombreBodega.add(jLabelnombreBusquedaPorNombreBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelBusquedaPorNombreBodega.add(jTextAreanombreBusquedaPorNombreBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelBusquedaPorNombreBodega.add(jButtonBusquedaPorNombreBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorResponsableNombreBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorResponsableNombreBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorResponsableNombreBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorResponsableNombreBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorResponsableNombreBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorResponsableNombreBodega.setLayout(gridaBagLayoutBusquedaPorResponsableNombreBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelBusquedaPorResponsableNombreBodega.add(jLabelresponsable_nombreBusquedaPorResponsableNombreBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelBusquedaPorResponsableNombreBodega.add(jTextArearesponsable_nombreBusquedaPorResponsableNombreBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelBusquedaPorResponsableNombreBodega.add(jButtonBusquedaPorResponsableNombreBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("3.-Por Responsable Nombre ", jPanelBusquedaPorResponsableNombreBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCalidadProductoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdCalidadProductoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCalidadProductoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCalidadProductoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCalidadProductoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCalidadProductoBodega.setLayout(gridaBagLayoutFK_IdCalidadProductoBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdCalidadProductoBodega.add(jLabelid_calidad_productoFK_IdCalidadProductoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelFK_IdCalidadProductoBodega.add(jComboBoxid_calidad_productoFK_IdCalidadProductoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelFK_IdCalidadProductoBodega.add(jButtonFK_IdCalidadProductoBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("4.-Por Calidad Producto ", jPanelFK_IdCalidadProductoBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoBodega.setLayout(gridaBagLayoutFK_IdCentroCostoBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdCentroCostoBodega.add(jLabelid_centro_costoFK_IdCentroCostoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelFK_IdCentroCostoBodega.add(jComboBoxid_centro_costoFK_IdCentroCostoBodega, gridBagConstraintsBodega);


		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdCentroCostoBodega.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelFK_IdCentroCostoBodega.add(jButtonFK_IdCentroCostoBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("5.-Por Centro Costo ", jPanelFK_IdCentroCostoBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoBodega.setLayout(gridaBagLayoutFK_IdEmpleadoBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdEmpleadoBodega.add(jLabelid_empleadoFK_IdEmpleadoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelFK_IdEmpleadoBodega.add(jComboBoxid_empleadoFK_IdEmpleadoBodega, gridBagConstraintsBodega);


		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdEmpleadoBodega.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelFK_IdEmpleadoBodega.add(jButtonFK_IdEmpleadoBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("6.-Por Empleado ", jPanelFK_IdEmpleadoBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdGrupoBodegaBodega= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoBodegaBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoBodegaBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoBodegaBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoBodegaBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoBodegaBodega.setLayout(gridaBagLayoutFK_IdGrupoBodegaBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 0;
		jPanelFK_IdGrupoBodegaBodega.add(jLabelid_grupo_bodegaFK_IdGrupoBodegaBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 0;
		gridBagConstraintsBodega.gridx = 1;
		jPanelFK_IdGrupoBodegaBodega.add(jComboBoxid_grupo_bodegaFK_IdGrupoBodegaBodega, gridBagConstraintsBodega);

		gridBagConstraintsBodega = new GridBagConstraints();
		gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodega.gridy = 1;
		gridBagConstraintsBodega.gridx =1;
		jPanelFK_IdGrupoBodegaBodega.add(jButtonFK_IdGrupoBodegaBodega, gridBagConstraintsBodega);

		jTabbedPaneBusquedasBodega.addTab("7.-Por Grupo Bodega ", jPanelFK_IdGrupoBodegaBodega);
		jTabbedPaneBusquedasBodega.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBodega = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBodega);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bodegaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBodega = new GridBagConstraints();						
			this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodega.gridx = 0;		
			//this.gridBagConstraintsBodega.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBodega.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBodega, this.gridBagConstraintsBodega);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBodega.gridx = 0;		
		//this.gridBagConstraintsBodega.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBodega.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBodega);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodega.gridx = 0;		
			this.gridBagConstraintsBodega.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBodega.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBodega, this.gridBagConstraintsBodega);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBodega, this.gridBagConstraintsBodega);								
		
		
		/*
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBodega, this.gridBagConstraintsBodega);
		*/		
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodega.gridx =0;
		this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodega.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodega, this.gridBagConstraintsBodega);
				
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBodega, this.gridBagConstraintsBodega);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BodegaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodega = new GridBagLayout();
			this.jPanelBusquedasParametrosBodega.setLayout(gridaBagLayoutBusquedasParametrosBodega);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBodega=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			
			
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBodega, this.gridBagConstraintsBodega);
			
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBodega, this.gridBagConstraintsBodega);
		
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBodega, this.gridBagConstraintsBodega);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBodega;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBodega() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBodega = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBodega.setName("jPanelReporteDinamicoBodega"); 
		
		this.jPanelReporteDinamicoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBodega.setLayout(gridaBagLayoutReporteDinamicoBodega);
		
		
		this.jInternalFrameReporteDinamicoBodega= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBodega = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodega= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBodega.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBodega.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBodega.setResizable(true);
	    this.jInternalFrameReporteDinamicoBodega.setClosable(true);
	    this.jInternalFrameReporteDinamicoBodega.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBodega = new JLabelMe();

		this.jLabelColumnasSelectReporteBodega.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBodega.add(this.jLabelColumnasSelectReporteBodega, this.gridBagConstraintsBodega);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBodega = new JList<Reporte>();
		this.jListColumnasSelectReporteBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBodega.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBodega.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodega.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodega.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBodega=new JScrollPane(this.jListColumnasSelectReporteBodega);
			
			this.jScrollColumnasSelectReporteBodega.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodega.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodega.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBodega.add(this.jListColumnasSelectReporteBodega, this.gridBagConstraintsBodega);
		this.jPanelReporteDinamicoBodega.add(this.jScrollColumnasSelectReporteBodega, this.gridBagConstraintsBodega);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBodega = new JLabelMe();

		this.jLabelRelacionesSelectReporteBodega.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBodega = new JList<Reporte>();
		this.jListRelacionesSelectReporteBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBodega.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBodega.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodega.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodega.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBodega=new JScrollPane(this.jListRelacionesSelectReporteBodega);
			
			this.jScrollRelacionesSelectReporteBodega.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodega.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodega.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBodega = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBodega = new JComboBoxMe();
		this.jListColumnasValoresGraficoBodega = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBodega = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBodega.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBodega = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBodega.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBodega = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBodega.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodega.add(this.jLabelGenerarExcelReporteDinamicoBodega, this.gridBagConstraintsBodega);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBodega = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBodega.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBodega,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBodega.setToolTipText("Generar EXCEL"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBodega.add(this.jButtonGenerarExcelReporteDinamicoBodega, this.gridBagConstraintsBodega);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodega.add(this.jComboBoxTiposReportesDinamicoBodega, this.gridBagConstraintsBodega);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBodega = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBodega.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodega.add(this.jLabelTiposArchivoReporteDinamicoBodega, this.gridBagConstraintsBodega);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodega.add(this.jComboBoxTiposArchivosReportesDinamicoBodega, this.gridBagConstraintsBodega);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBodega = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBodega.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBodega,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBodega.setToolTipText("Generar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodega.add(this.jButtonGenerarReporteDinamicoBodega, this.gridBagConstraintsBodega);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBodega = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBodega.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBodega,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBodega.setToolTipText("Cancelar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodega.add(this.jButtonCerrarReporteDinamicoBodega, this.gridBagConstraintsBodega);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBodega = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBodega= new JScrollPane(jPanelReporteDinamicoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBodega.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBodega.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBodega);
		this.jInternalFrameReporteDinamicoBodega.getContentPane().add(this.jScrollPanelReporteDinamicoBodega, this.gridBagConstraintsBodega);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBodega() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBodega = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBodega.setName("jPanelImportacionBodega"); 
		
		this.jPanelImportacionBodega.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodega.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodega.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBodega.setLayout(gridaBagLayoutImportacionBodega);
		
		
		this.jInternalFrameImportacionBodega= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBodega= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBodega = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodega= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodega.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBodega.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodega.setResizable(true);
	    this.jInternalFrameImportacionBodega.setClosable(true);
	    this.jInternalFrameImportacionBodega.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodega.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBodega.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodega.setResizable(true);
	    this.jInternalFrameImportacionBodega.setClosable(true);
	    this.jInternalFrameImportacionBodega.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBodega.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodega.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodega.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBodega = new JLabelMe();

		this.jLabelArchivoImportacionBodega.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodega.add(this.jLabelArchivoImportacionBodega, this.gridBagConstraintsBodega);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBodega = new JFileChooser();		
		this.jFileChooserImportacionBodega.setToolTipText("ESCOGER ARCHIVO"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBodega = new JButtonMe();
		this.jButtonAbrirImportacionBodega.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBodega,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBodega.setToolTipText("Generar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodega.add(this.jButtonAbrirImportacionBodega, this.gridBagConstraintsBodega);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBodega = new JLabelMe();

		this.jLabelPathArchivoImportacionBodega.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodega.add(this.jLabelPathArchivoImportacionBodega, this.gridBagConstraintsBodega);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBodega=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBodega.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodega.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodega.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodega.add(this.jTextFieldPathArchivoImportacionBodega, this.gridBagConstraintsBodega);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBodega = new JButtonMe();
		this.jButtonGenerarImportacionBodega.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBodega,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBodega.setToolTipText("Generar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodega.add(this.jButtonGenerarImportacionBodega, this.gridBagConstraintsBodega);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBodega = new JButtonMe();
		this.jButtonCerrarImportacionBodega.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBodega,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBodega.setToolTipText("Cancelar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodega.add(this.jButtonCerrarImportacionBodega, this.gridBagConstraintsBodega);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBodega = new GridBagLayout();
		
		this.jScrollPanelImportacionBodega= new JScrollPane(jPanelImportacionBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iPosYImportacion;
		this.gridBagConstraintsBodega.gridx =iPosXImportacion;
		this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBodega.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBodega);
		this.jInternalFrameImportacionBodega.getContentPane().add(this.jScrollPanelImportacionBodega, this.gridBagConstraintsBodega);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBodega(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBodega = new JButtonMe();
			this.jButtonAbrirOrderByBodega.setText("Orden");
			this.jButtonAbrirOrderByBodega.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodega,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBodega";
			inputMap = this.jButtonAbrirOrderByBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBodega"));
		
		
			GridBagLayout gridaBagLayoutOrderByBodega = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBodega.setName("jPanelOrderByBodega"); 
			
			this.jPanelOrderByBodega.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodega.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodega.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBodega.setLayout(gridaBagLayoutOrderByBodega);
			
			
			this.jTableDatosBodegaOrderBy = new JTableMe();        
			this.jTableDatosBodegaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBodegaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBodegaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBodegaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBodegaOrderBy.setViewportView(this.jTableDatosBodegaOrderBy);
			this.jTableDatosBodegaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBodegaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBodega= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBodega= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBodega = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBodega= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBodega.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBodega.setTitle("Orden");
			this.jInternalFrameOrderByBodega.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBodega.setResizable(true);
			this.jInternalFrameOrderByBodega.setClosable(true);
			this.jInternalFrameOrderByBodega.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBodega.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodega.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodega.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBodega.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBodega.ipady =150;
				
			this.jPanelOrderByBodega.add(jScrollPanelDatosBodegaOrderBy, this.gridBagConstraintsBodega);//this.jTableDatosBodegaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBodega = new JButtonMe();
			this.jButtonCerrarOrderByBodega.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBodega,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBodega.setToolTipText("Cancelar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBodega.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBodega.add(this.jButtonCerrarOrderByBodega, this.gridBagConstraintsBodega);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBodega = new GridBagLayout();
			
			this.jScrollPanelOrderByBodega= new JScrollPane(jPanelOrderByBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy =iPosYOrderBy;
			this.gridBagConstraintsBodega.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBodega.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBodega);
			
			this.jInternalFrameOrderByBodega.getContentPane().add(this.jScrollPanelOrderByBodega, this.gridBagConstraintsBodega);			
		
		} else {
			this.jButtonAbrirOrderByBodega = new JButtonMe();
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
		iWidthTableCalculado+=3030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bodegaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBodega.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBodega.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBodega.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBodega.getRowHeight();//BodegaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodega.isSelected()) {
					iHeightTable=BodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodega.isSelected()) {
					iHeightTable=BodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBodega.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodega.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodega.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBodega.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodega.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodega.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBodega!=null && this.jInternalFrameOrderByBodega.getjTableDatosOrderBy()!=null) {
			//if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBodega.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBodega.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBodega.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBodega.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBodega.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBodega.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBodega.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBodega.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodega.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodega.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bodegaLogic.getBodegas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bodegas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Bodega> TraerBodegaBeans(List<Bodega> bodegas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Bodega bodega:bodegas) {
					
				if(!(BodegaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BodegaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bodega.setsDetalleGeneralEntityReporte(BodegaConstantesFunciones.getBodegaDescripcion(bodega));
										
					bodega.setes_multi_empresa_descripcion(BodegaConstantesFunciones.getes_multi_empresaDescripcion(bodega));bodega.setcon_mostrar_stock_descripcion(BodegaConstantesFunciones.getcon_mostrar_stockDescripcion(bodega));bodega.setes_bodega_transito_descripcion(BodegaConstantesFunciones.getes_bodega_transitoDescripcion(bodega));bodega.setcon_stock_negativo_descripcion(BodegaConstantesFunciones.getcon_stock_negativoDescripcion(bodega));	
					
						
					
				} else  {
							
					//bodega.setsDetalleGeneralEntityReporte(bodega.getsDetalleGeneralEntityReporte());
										
				}
				
				//bodegabeans.add(bodegabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bodegas;
    }
	//PARA REPORTES FIN
}
