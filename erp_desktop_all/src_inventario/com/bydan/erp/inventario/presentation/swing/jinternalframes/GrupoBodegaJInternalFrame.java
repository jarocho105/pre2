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
import com.bydan.erp.inventario.util.GrupoBodegaConstantesFunciones;

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
public class GrupoBodegaJInternalFrame extends GrupoBodegaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoBodega;
	
	protected JMenuBar jmenuBarGrupoBodega;
	
	protected JMenu jmenuGrupoBodega;
	protected JMenu jmenuDatosGrupoBodega;
	protected JMenu jmenuArchivoGrupoBodega;
	protected JMenu jmenuAccionesGrupoBodega;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoBodega;	
	protected GridBagConstraints gridBagConstraintsGrupoBodega;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoBodegaDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoBodega;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoBodega;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoBodega;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

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

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public GrupoBodegaSessionBean grupobodegaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
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
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoBodega> grupobodegas;		
	public List<GrupoBodega> grupobodegasEliminados;	
	public List<GrupoBodega> grupobodegasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoBodega;		
	protected JButton jButtonAbrirOrderByGrupoBodega;
	
	
	//protected JPanel jPanelOrderByGrupoBodega;
	//public JScrollPane jScrollPanelOrderByGrupoBodega;	
	//protected JButton jButtonCerrarOrderByGrupoBodega;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoBodegaLogic grupobodegaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoBodega;
	public JScrollPane jScrollPanelDatosEdicionGrupoBodega;
	public JScrollPane jScrollPanelDatosGeneralGrupoBodega;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoBodegaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoBodega;
	//public JScrollPane jScrollPanelImportacionGrupoBodega;
	
	
	
	protected JPanel jPanelAccionesGrupoBodega;
	
    protected JPanel jPanelPaginacionGrupoBodega;
    protected JPanel jPanelParametrosReportesGrupoBodega;
	protected JPanel jPanelParametrosReportesAccionesGrupoBodega;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralGrupoBodega;
	protected Integer iXPanelCamposIniciogeneralGrupoBodega=0;
	protected Integer iYPanelCamposIniciogeneralGrupoBodega=0;

	protected JPanel jPanelCamposIniciocuenta_contableGrupoBodega;
	protected Integer iXPanelCamposIniciocuenta_contableGrupoBodega=0;
	protected Integer iYPanelCamposIniciocuenta_contableGrupoBodega=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoBodega;
	protected JPanel jPanelParametrosAuxiliar2GrupoBodega;
	protected JPanel jPanelParametrosAuxiliar3GrupoBodega;
	protected JPanel jPanelParametrosAuxiliar4GrupoBodega;
	//protected JPanel jPanelParametrosAuxiliar5GrupoBodega;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoBodega;
	//protected JPanel jPanelImportacionGrupoBodega;
	
	
	public JTable jTableDatosGrupoBodega;
	
	
	
	//public JTable jTableDatosGrupoBodegaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoBodega;
	protected JButton jButtonDuplicarGrupoBodega;
	protected JButton jButtonCopiarGrupoBodega;
	protected JButton jButtonVerFormGrupoBodega;
	protected JButton jButtonNuevoRelacionesGrupoBodega;
	protected JButton jButtonModificarGrupoBodega;
	
    protected JButton jButtonGuardarCambiosTablaGrupoBodega;
	protected JButton jButtonCerrarGrupoBodega;
	
	
	protected JButton jButtonRecargarInformacionGrupoBodega;
	protected JButton jButtonProcesarInformacionGrupoBodega;
	
	
	protected JButton jButtonAnterioresGrupoBodega;
	protected JButton jButtonSiguientesGrupoBodega;
	protected JButton jButtonNuevoGuardarCambiosGrupoBodega;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoBodega;
	//protected JButton jButtonCerrarReporteDinamicoGrupoBodega;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoBodega;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoBodega;
	//protected JButton jButtonGenerarImportacionGrupoBodega;
	//protected JButton jButtonCerrarImportacionGrupoBodega;
	//protected JFileChooser jFileChooserImportacionGrupoBodega;
	//protected File fileImportacionGrupoBodega;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoBodega;
	protected JButton jButtonDuplicarToolBarGrupoBodega;
	protected JButton jButtonNuevoRelacionesToolBarGrupoBodega;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoBodega;
	protected JButton jButtonCopiarToolBarGrupoBodega;
	protected JButton jButtonVerFormToolBarGrupoBodega;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoBodega;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoBodega;
	protected JButton jButtonCerrarToolBarGrupoBodega;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoBodega;
	protected JButton jButtonProcesarInformacionToolBarGrupoBodega;
	protected JButton jButtonAnterioresToolBarGrupoBodega;
	protected JButton jButtonSiguientesToolBarGrupoBodega;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoBodega;
	protected JButton jButtonAbrirOrderByToolBarGrupoBodega;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoBodega;
	protected JMenuItem jMenuItemDuplicarGrupoBodega;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoBodega;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoBodega;
	protected JMenuItem jMenuItemCopiarGrupoBodega;
	protected JMenuItem jMenuItemVerFormGrupoBodega;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoBodega;
	protected JMenuItem jMenuItemCerrarGrupoBodega;
	protected JMenuItem jMenuItemDetalleCerrarGrupoBodega;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoBodega;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoBodega;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoBodega;
	protected JMenuItem jMenuItemProcesarInformacionGrupoBodega;
	protected JMenuItem jMenuItemAnterioresGrupoBodega;
	protected JMenuItem jMenuItemSiguientesGrupoBodega;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoBodega;
	protected JMenuItem jMenuItemAbrirOrderByGrupoBodega;
	protected JMenuItem jMenuItemMostrarOcultarGrupoBodega;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoBodega;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoBodega;
	protected JCheckBox jCheckBoxSeleccionadosGrupoBodega;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoBodega;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoBodega;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoBodega;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoBodega;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoBodega;
	protected JTextField jTextFieldValorCampoGeneralGrupoBodega;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoBodega;
	//public JList<Reporte> jListColumnasSelectReporteGrupoBodega;
	//public JScrollPane jScrollColumnasSelectReporteGrupoBodega;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoBodega;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoBodega;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoBodega;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoBodega;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoBodega;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoBodega;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoBodega;
	
		
	//public JLabel jLabelArchivoImportacionGrupoBodega;	
	//public JLabel jLabelPathArchivoImportacionGrupoBodega;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoBodega;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoBodega;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoBodega;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoBodega;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoBodega;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoBodega;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoBodega;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoBodega;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoBodega;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoBodega;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoBodega;
	public JPanel jPanelBusquedaPorCodigoGrupoBodega;
	public JButton jButtonBusquedaPorCodigoGrupoBodega;
	public JPanel jPanelBusquedaPorNombreGrupoBodega;
	public JButton jButtonBusquedaPorNombreGrupoBodega;
	public JPanel jPanelBusquedaPorRucGrupoBodega;
	public JButton jButtonBusquedaPorRucGrupoBodega;
	public JPanel jPanelBusquedaPorTelefonoGrupoBodega;
	public JButton jButtonBusquedaPorTelefonoGrupoBodega;
	public JPanel jPanelFK_IdCentroCostoGrupoBodega;
	public JButton jButtonFK_IdCentroCostoGrupoBodega;
	public JPanel jPanelFK_IdEmpleadoGrupoBodega;
	public JButton jButtonFK_IdEmpleadoGrupoBodega;
	public JPanel jPanelFK_IdPaisGrupoBodega;
	public JButton jButtonFK_IdPaisGrupoBodega;
	
	public JPanel jPanelcodigoBusquedaPorCodigoGrupoBodega;
	public JLabel jLabelcodigoBusquedaPorCodigoGrupoBodega;
	public JTextField jTextFieldcodigoBusquedaPorCodigoGrupoBodega;
	public JButton jButtoncodigoBusquedaPorCodigoGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreGrupoBodega;
	public JLabel jLabelnombreBusquedaPorNombreGrupoBodega;
	public JTextArea jTextAreanombreBusquedaPorNombreGrupoBodega;
	public JButton jButtonnombreBusquedaPorNombreGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucGrupoBodega;
	public JLabel jLabelrucBusquedaPorRucGrupoBodega;
	public JTextField jTextFieldrucBusquedaPorRucGrupoBodega;
	public JButton jButtonrucBusquedaPorRucGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPaneltelefonoBusquedaPorTelefonoGrupoBodega;
	public JLabel jLabeltelefonoBusquedaPorTelefonoGrupoBodega;
	public JTextField jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega;
	public JButton jButtontelefonoBusquedaPorTelefonoGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoGrupoBodega;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega;
	public JButton jButtonid_centro_costoFK_IdCentroCostoGrupoBodega= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGrupoBodegaArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoGrupoBodega;
	public JLabel jLabelid_empleadoFK_IdEmpleadoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega;
	public JButton jButtonid_empleadoFK_IdEmpleadoGrupoBodega= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisGrupoBodega;
	public JLabel jLabelid_paisFK_IdPaisGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisGrupoBodega;
	public JButton jButtonid_paisFK_IdPaisGrupoBodega= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisGrupoBodegaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1562;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GrupoBodegaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoBodega)	{
		this.jButtonRecargarInformacionGrupoBodega = jButtonRecargarInformacionGrupoBodega;
	}
	
	public JButton getjButtonProcesarInformacionGrupoBodega() {
		return this.jButtonProcesarInformacionGrupoBodega;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoBodega)	{
		this.jButtonProcesarInformacionGrupoBodega = jButtonProcesarInformacionGrupoBodega;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoBodega() {
		return this.jButtonRecargarInformacionGrupoBodega;
	}
	
	
	public List<GrupoBodega> getgrupobodegas() {
		return this.grupobodegas;
	}

	public void setgrupobodegas(List<GrupoBodega> grupobodegas) {
		this.grupobodegas = grupobodegas;
	}
	
	public List<GrupoBodega> getgrupobodegasAux() {
		return this.grupobodegasAux;
	}

	public void setgrupobodegasAux(List<GrupoBodega> grupobodegasAux) {
		this.grupobodegasAux = grupobodegasAux;
	}
	
	public List<GrupoBodega> getgrupobodegasEliminados() {
		return this.grupobodegasEliminados;
	}

	public void setGrupoBodegasEliminados(List<GrupoBodega> grupobodegasEliminados) {
		this.grupobodegasEliminados = grupobodegasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoBodega() {
		return jComboBoxTiposSeleccionarGrupoBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoBodega(
			JComboBox jComboBoxTiposSeleccionarGrupoBodega) {
		this.jComboBoxTiposSeleccionarGrupoBodega = jComboBoxTiposSeleccionarGrupoBodega;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoBodega .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoBodega() {
		return jTextFieldValorCampoGeneralGrupoBodega;
	}

	public void setjTextFieldValorCampoGeneralGrupoBodega(
			JTextField jTextFieldValorCampoGeneralGrupoBodega) {
		this.jTextFieldValorCampoGeneralGrupoBodega = jTextFieldValorCampoGeneralGrupoBodega;
	}

	public void setBorderResaltarValorCampoGeneralGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoBodega .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoBodega() {
		return this.jCheckBoxSeleccionarTodosGrupoBodega;
	}

	public void setjCheckBoxSeleccionarTodosGrupoBodega(
			JCheckBox jCheckBoxSeleccionarTodosGrupoBodega) {
		this.jCheckBoxSeleccionarTodosGrupoBodega = jCheckBoxSeleccionarTodosGrupoBodega;
	}

	public void setBorderResaltarSeleccionarTodosGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoBodega .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoBodega() {
		return this.jCheckBoxSeleccionadosGrupoBodega;
	}

	public void setjCheckBoxSeleccionadosGrupoBodega(
			JCheckBox jCheckBoxSeleccionadosGrupoBodega) {
		this.jCheckBoxSeleccionadosGrupoBodega = jCheckBoxSeleccionadosGrupoBodega;
	}
	
	public void setBorderResaltarSeleccionadosGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoBodega .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoBodega() {
		return this.jComboBoxTiposArchivosReportesGrupoBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoBodega(
			JComboBox jComboBoxTiposArchivosReportesGrupoBodega) {
		this.jComboBoxTiposArchivosReportesGrupoBodega = jComboBoxTiposArchivosReportesGrupoBodega;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoBodega() {
		return this.jComboBoxTiposReportesGrupoBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoBodega(
			JComboBox jComboBoxTiposReportesGrupoBodega) {
		this.jComboBoxTiposReportesGrupoBodega = jComboBoxTiposReportesGrupoBodega;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoBodega() {
	//	return jComboBoxTiposReportesDinamicoGrupoBodega;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoBodega(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoBodega) {
	//	this.jComboBoxTiposReportesDinamicoGrupoBodega = jComboBoxTiposReportesDinamicoGrupoBodega;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoBodega() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoBodega;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoBodega(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoBodega) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega = jComboBoxTiposArchivosReportesDinamicoGrupoBodega;
	//}
	
	public void setBorderResaltarTiposReportesGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoBodega() {
		return this.jComboBoxTiposGraficosReportesGrupoBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoBodega(
			JComboBox jComboBoxTiposGraficosReportesGrupoBodega) {
		this.jComboBoxTiposGraficosReportesGrupoBodega = jComboBoxTiposGraficosReportesGrupoBodega;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoBodega() {
		return this.jComboBoxTiposPaginacionGrupoBodega;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoBodega(
			JComboBox jComboBoxTiposPaginacionGrupoBodega) {
		this.jComboBoxTiposPaginacionGrupoBodega = jComboBoxTiposPaginacionGrupoBodega;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoBodega .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoBodega() {
		return this.jComboBoxTiposRelacionesGrupoBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoBodega() {
		return this.jComboBoxTiposAccionesGrupoBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoBodega(
			JComboBox jComboBoxTiposRelacionesGrupoBodega) {
		this.jComboBoxTiposRelacionesGrupoBodega = jComboBoxTiposRelacionesGrupoBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoBodega(
			JComboBox jComboBoxTiposAccionesGrupoBodega) {
		this.jComboBoxTiposAccionesGrupoBodega = jComboBoxTiposAccionesGrupoBodega;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoBodega .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoBodega() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoBodega .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoBodega() {
	//	return jCheckBoxConGraficoDinamicoGrupoBodega;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoBodega(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoBodega) {
	//	this.jCheckBoxConGraficoDinamicoGrupoBodega = jCheckBoxConGraficoDinamicoGrupoBodega;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoBodega() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoBodega.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoBodega .setBorder(borderResaltar);		
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
		this.grupobodegaSessionBean=new GrupoBodegaSessionBean();
		
		this.grupobodegaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupobodegaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupobodegaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoBodegaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Bodega MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoBodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoBodega= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"nuevo","nuevo","Nuevo"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"duplicar","duplicar","Duplicar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"copiar","copiar","Copiar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"ver_form","ver_form","Ver"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"recargar","recargar","Recargar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoBodega,this.jTtoolBarGrupoBodega,
							"cerrar","cerrar","Salir"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoBodega=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoBodega;
			
				this.jButtonProcesarInformacionToolBarGrupoBodega=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoBodega;
				
		//protected JButton jButtonModificarToolBarGrupoBodega;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoBodega=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoBodega=new JMenuMe("General");
		this.jmenuArchivoGrupoBodega=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoBodega=new JMenuMe("Acciones");
		this.jmenuDatosGrupoBodega=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoBodega= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoBodega.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoBodega,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoBodega= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoBodega.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoBodega,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoBodega= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoBodega.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoBodega,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoBodega= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoBodega.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoBodega,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoBodega= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoBodega.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoBodega,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoBodega= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoBodega.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoBodega,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoBodega= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoBodega.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoBodega,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoBodega= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoBodega.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoBodega,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoBodega= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoBodega.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoBodega,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoBodega= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoBodega.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoBodega,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoBodega= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoBodega.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoBodega,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoBodega= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoBodega.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoBodega,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoBodega,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoBodega= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoBodega.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoBodega,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoBodega,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoBodega= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoBodega.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoBodega,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoBodega.add(this.jMenuItemCerrarGrupoBodega);
			
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemNuevoGrupoBodega);
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemNuevoGuardarCambiosGrupoBodega);
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemNuevoRelacionesGrupoBodega);
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemGuardarCambiosTablaGrupoBodega);		
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemDuplicarGrupoBodega);		
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemCopiarGrupoBodega);		
			this.jmenuAccionesGrupoBodega.add(this.jMenuItemVerFormGrupoBodega);		
			
			this.jmenuDatosGrupoBodega.add(this.jMenuItemRecargarInformacionGrupoBodega);				
			this.jmenuDatosGrupoBodega.add(this.jMenuItemAnterioresGrupoBodega);				
			this.jmenuDatosGrupoBodega.add(this.jMenuItemSiguientesGrupoBodega);				
			this.jmenuDatosGrupoBodega.add(this.jMenuItemAbrirOrderByGrupoBodega);				
			this.jmenuDatosGrupoBodega.add(this.jMenuItemMostrarOcultarGrupoBodega);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoBodega.add(this.jMenuItemGuardarCambiosGrupoBodega);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoBodega.add(this.jmenuArchivoGrupoBodega);		
			this.jmenuBarGrupoBodega.add(this.jmenuAccionesGrupoBodega);		
			this.jmenuBarGrupoBodega.add(this.jmenuDatosGrupoBodega);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoBodega);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoBodega() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoGrupoBodega.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoGrupoBodega= new JButtonMe();
		this.jButtonBusquedaPorCodigoGrupoBodega.setText("Buscar");
		this.jButtonBusquedaPorCodigoGrupoBodega.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoGrupoBodega,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoGrupoBodega = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoGrupoBodega.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoGrupoBodega.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoGrupoBodega= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreGrupoBodega.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreGrupoBodega= new JButtonMe();
		this.jButtonBusquedaPorNombreGrupoBodega.setText("Buscar");
		this.jButtonBusquedaPorNombreGrupoBodega.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreGrupoBodega,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreGrupoBodega = new JLabelMe();
		jLabelnombreBusquedaPorNombreGrupoBodega.setText("Nombre :");
		jLabelnombreBusquedaPorNombreGrupoBodega.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreGrupoBodega= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucGrupoBodega.setToolTipText("Buscar Por Ruc ");
		this.jButtonBusquedaPorRucGrupoBodega= new JButtonMe();
		this.jButtonBusquedaPorRucGrupoBodega.setText("Buscar");
		this.jButtonBusquedaPorRucGrupoBodega.setToolTipText("Buscar Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucGrupoBodega,"buscar_button","Buscar Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucGrupoBodega = new JLabelMe();
		jLabelrucBusquedaPorRucGrupoBodega.setText("Ruc :");
		jLabelrucBusquedaPorRucGrupoBodega.setToolTipText("Ruc");
		jLabelrucBusquedaPorRucGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucGrupoBodega= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorTelefonoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorTelefonoGrupoBodega.setToolTipText("Buscar Por Telefono ");
		this.jButtonBusquedaPorTelefonoGrupoBodega= new JButtonMe();
		this.jButtonBusquedaPorTelefonoGrupoBodega.setText("Buscar");
		this.jButtonBusquedaPorTelefonoGrupoBodega.setToolTipText("Buscar Por Telefono ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorTelefonoGrupoBodega,"buscar_button","Buscar Por Telefono ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorTelefonoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega = new JLabelMe();
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega.setText("Telefono :");
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega.setToolTipText("Telefono");
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltelefonoBusquedaPorTelefonoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega= new JTextFieldMe();
		jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoGrupoBodega.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoGrupoBodega= new JButtonMe();
		this.jButtonFK_IdCentroCostoGrupoBodega.setText("Buscar");
		this.jButtonFK_IdCentroCostoGrupoBodega.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoGrupoBodega,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoGrupoBodega.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoGrupoBodega= new JButtonMe();
		this.jButtonFK_IdEmpleadoGrupoBodega.setText("Buscar");
		this.jButtonFK_IdEmpleadoGrupoBodega.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoGrupoBodega,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisGrupoBodega.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisGrupoBodega= new JButtonMe();
		this.jButtonFK_IdPaisGrupoBodega.setText("Buscar");
		this.jButtonFK_IdPaisGrupoBodega.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisGrupoBodega,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisGrupoBodega = new JLabelMe();
		jLabelid_paisFK_IdPaisGrupoBodega.setText("Pais :");
		jLabelid_paisFK_IdPaisGrupoBodega.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisGrupoBodega= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoBodega=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoBodega.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasGrupoBodega.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasGrupoBodega.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoBodega = new GrupoBodegaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Bodega DATOS");
			this.jInternalFrameDetalleFormGrupoBodega = new GrupoBodegaDetalleFormJInternalFrame(jDesktopPane,this.grupobodegaSessionBean.getConGuardarRelaciones(),this.grupobodegaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoBodega = null;//new GrupoBodegaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoBodega= new GridBagLayout();
		
		
		this.jTableDatosGrupoBodega = new JTableMe();      
		
		String sToolTipGrupoBodega="";
		sToolTipGrupoBodega=GrupoBodegaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoBodega+="(Inventario.GrupoBodega)";
		}
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoBodega+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoBodega.setToolTipText(sToolTipGrupoBodega);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoBodega);
		this.jTableDatosGrupoBodega.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoBodega.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoBodega.setRowSelectionAllowed(true);
		this.jTableDatosGrupoBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoBodega,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoBodega = new JButtonMe();
		this.jButtonDuplicarGrupoBodega = new JButtonMe();
		this.jButtonCopiarGrupoBodega = new JButtonMe();
		this.jButtonVerFormGrupoBodega = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoBodega = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoBodega = new JButtonMe();
		this.jButtonCerrarGrupoBodega = new JButtonMe();
		
		this.jScrollPanelDatosGrupoBodega = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoBodega = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Grupo Bodega";
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoBodega.setToolTipText("Acciones");
        this.jPanelAccionesGrupoBodega.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralGrupoBodega.setName("jPanelCamposFingeneralGrupoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableGrupoBodega.setName("jPanelCamposFincuenta_contableGrupoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoGrupoBodega=new ReporteDinamicoJInternalFrame(GrupoBodegaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoBodega();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoBodega=new ImportacionJInternalFrame(GrupoBodegaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoBodega();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoBodega = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoBodega.setText("Orden");
		this.jButtonAbrirOrderByGrupoBodega.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoBodega,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoBodega=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoBodega,false,this);
			
			//this.cargarOrderByGrupoBodega(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoBodega=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoBodega,true,this);
			
			//this.cargarOrderByGrupoBodega(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoBodega.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosGrupoBodega.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosGrupoBodega.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosGrupoBodega.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoBodega.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoBodega.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoBodega.setText("Nuevo");
		this.jButtonDuplicarGrupoBodega.setText("Duplicar");
		this.jButtonCopiarGrupoBodega.setText("Copiar");
		this.jButtonVerFormGrupoBodega.setText("Ver");
		this.jButtonNuevoRelacionesGrupoBodega.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoBodega.setText("Guardar");
		this.jButtonCerrarGrupoBodega.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoBodega,"nuevo_button","Nuevo",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoBodega,"duplicar_button","Duplicar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoBodega,"copiar_button","Copiar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoBodega,"ver_form","Ver",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoBodega,"nuevorelaciones_button","Nuevo Rel",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoBodega,"guardarcambiostabla_button","Guardar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoBodega,"cerrar_button","Salir",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoBodega.setToolTipText("Nuevo"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoBodega.setToolTipText("Duplicar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoBodega.setToolTipText("Copiar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoBodega.setToolTipText("Ver"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoBodega.setToolTipText("Nuevo Rel"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoBodega.setToolTipText("Guardar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoBodega.setToolTipText("Salir"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoBodega";
		inputMap = this.jButtonNuevoGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoBodega"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoBodega";
		inputMap = this.jButtonDuplicarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoBodega"));
		
		//COPIAR
		sMapKey = "CopiarGrupoBodega";
		inputMap = this.jButtonCopiarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoBodega"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoBodega";
		inputMap = this.jButtonVerFormGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoBodega"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoBodega";
		inputMap = this.jButtonNuevoRelacionesGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoBodega"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoBodega";
		inputMap = this.jButtonModificarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoBodega"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoBodega";
		inputMap = this.jButtonCerrarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoBodega"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoBodega";
		inputMap = this.jButtonGuardarCambiosTablaGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoBodega"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoBodega.setName("jPanelParametrosReportesGrupoBodega"); 
		
		this.jPanelParametrosReportesAccionesGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoBodega.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoBodega.setName("jPanelParametrosReportesAccionesGrupoBodega"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoBodega = new JButtonMe();
		this.jButtonRecargarInformacionGrupoBodega.setText("Recargar");
		this.jButtonRecargarInformacionGrupoBodega.setToolTipText("Recargar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoBodega,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoBodega = new JButtonMe();
		this.jButtonProcesarInformacionGrupoBodega.setText("Procesar");
		this.jButtonProcesarInformacionGrupoBodega.setToolTipText("Procesar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoBodega.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoBodega.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoBodega.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoBodega.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoBodega.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoBodega.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoBodega.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoBodega.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoBodega.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoBodega.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoBodega.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoBodega.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoBodega.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoBodega.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoBodega.setText("Accion");
		this.jComboBoxTiposAccionesGrupoBodega.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoBodega.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoBodega.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoBodega=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoBodega.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoBodega.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoBodega.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoBodega = new JLabelMe();
		
		this.jLabelAccionesGrupoBodega.setText("Acciones");		
		this.jLabelAccionesGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoBodega = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoBodega.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoBodega.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoBodega = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoBodega.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoBodega.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoBodega = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoBodega.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoBodega.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoBodega = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoBodega.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoBodega.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoBodega = new JButtonMe();
		//this.jButtonAnterioresGrupoBodega.setText("<<");
        this.jButtonAnterioresGrupoBodega.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoBodega,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoBodega = new JButtonMe();
		//this.jButtonSiguientesGrupoBodega.setText(">>");
        this.jButtonSiguientesGrupoBodega.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoBodega,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoBodega = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoBodega.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoBodega.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoBodega,"nuevoguardarcambios_button","Nue",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoBodega";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoBodega"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoBodega";
		inputMap = this.jButtonRecargarInformacionGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoBodega"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoBodega";
		inputMap = this.jButtonSiguientesGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoBodega"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoBodega";
		inputMap = this.jButtonAnterioresGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoBodega"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoBodega();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoBodega.setMinimumSize(new Dimension(this.getWidth(),GrupoBodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoBodegaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoBodega.setMaximumSize(new Dimension(this.getWidth(),GrupoBodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoBodegaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoBodega.setPreferredSize(new Dimension(this.getWidth(),GrupoBodegaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoBodegaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoBodega = new GridBagLayout();

			this.jPanelPaginacionGrupoBodega.setLayout(gridaBagLayoutPaginacionGrupoBodega);						
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 0;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoBodega.add(this.jButtonAnterioresGrupoBodega, this.gridBagConstraintsGrupoBodega);
					
						
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoBodega.gridy = 0;
			
			this.jPanelPaginacionGrupoBodega.add(this.jButtonNuevoGuardarCambiosGrupoBodega, this.gridBagConstraintsGrupoBodega);
						
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoBodega.gridy = 0;
			this.jPanelPaginacionGrupoBodega.add(this.jButtonSiguientesGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 1;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoBodega.add(this.jButtonNuevoGrupoBodega, this.gridBagConstraintsGrupoBodega);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoBodega.gridy = 1;
				this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGrupoBodega.add(this.jButtonNuevoRelacionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
			}
			
			
			if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoBodega.gridy = 1;
				this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoBodega.add(this.jButtonGuardarCambiosTablaGrupoBodega, this.gridBagConstraintsGrupoBodega);
			}
			
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 1;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoBodega.add(this.jButtonDuplicarGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 1;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoBodega.add(this.jButtonCopiarGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 1;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoBodega.add(this.jButtonVerFormGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 1;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoBodega.add(this.jButtonCerrarGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
		
		
		this.jButtonRecargarInformacionGrupoBodega.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoBodega.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoBodega.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoBodega.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoBodega.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoBodega.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoBodega.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoBodega.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoBodega.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoBodega.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoBodega.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoBodega.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoBodega.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoBodega.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoBodega.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoBodega.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoBodega.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoBodega.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoBodega.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoBodega.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoBodega.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoBodega.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoBodega.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoBodega.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoBodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoBodega = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoBodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoBodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoBodega = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoBodega = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoBodega.setLayout(gridaBagParametrosReportesGrupoBodega);
			this.jPanelParametrosReportesAccionesGrupoBodega.setLayout(gridaBagParametrosReportesAccionesGrupoBodega);
			
			
			this.jPanelParametrosAuxiliar1GrupoBodega.setLayout(gridaBagParametrosAuxiliar1GrupoBodega);
			this.jPanelParametrosAuxiliar2GrupoBodega.setLayout(gridaBagParametrosAuxiliar2GrupoBodega);
			this.jPanelParametrosAuxiliar3GrupoBodega.setLayout(gridaBagParametrosAuxiliar3GrupoBodega);
			this.jPanelParametrosAuxiliar4GrupoBodega.setLayout(gridaBagParametrosAuxiliar4GrupoBodega);
			//this.jPanelParametrosAuxiliar5GrupoBodega.setLayout(gridaBagParametrosAuxiliar2GrupoBodega);			
			
			
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoBodega.add(this.jButtonRecargarInformacionGrupoBodega, this.gridBagConstraintsGrupoBodega);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoBodega.add(this.jComboBoxTiposPaginacionGrupoBodega, this.gridBagConstraintsGrupoBodega);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoBodega.add(this.jCheckBoxConAltoMaximoTablaGrupoBodega, this.gridBagConstraintsGrupoBodega);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoBodega.add(this.jComboBoxTiposArchivosReportesGrupoBodega, this.gridBagConstraintsGrupoBodega);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoBodega.add(this.jPanelParametrosAuxiliar1GrupoBodega, this.gridBagConstraintsGrupoBodega);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoBodega.add(this.jComboBoxTiposReportesGrupoBodega, this.gridBagConstraintsGrupoBodega);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoBodega.add(this.jPanelParametrosAuxiliar4GrupoBodega, this.gridBagConstraintsGrupoBodega);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoBodega.add(this.jComboBoxTiposReportesGrupoBodega, this.gridBagConstraintsGrupoBodega);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoBodega.add(this.jCheckBoxGenerarReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoBodega.add(this.jPanelParametrosAuxiliar2GrupoBodega, this.gridBagConstraintsGrupoBodega);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoBodega.add(this.jLabelAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoBodega.add(this.jButtonAbrirOrderByGrupoBodega, this.gridBagConstraintsGrupoBodega);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoBodega.add(this.jComboBoxTiposSeleccionarGrupoBodega, this.gridBagConstraintsGrupoBodega);			
			
			
			/*
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoBodega.add(this.jCheckBoxSeleccionarTodosGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoBodega.add(this.jCheckBoxSeleccionarTodosGrupoBodega, this.gridBagConstraintsGrupoBodega);															
				
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoBodega.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoBodega.add(this.jCheckBoxSeleccionadosGrupoBodega, this.gridBagConstraintsGrupoBodega);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoBodega.add(this.jPanelParametrosAuxiliar3GrupoBodega, this.gridBagConstraintsGrupoBodega);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoBodega.add(this.jComboBoxTiposRelacionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
				
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoBodega.add(this.jComboBoxTiposAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
	
				
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoBodega.add(this.jTextFieldValorCampoGeneralGrupoBodega, this.gridBagConstraintsGrupoBodega);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralGrupoBodega= new GridBagLayout();
		this.jPanelCamposIniciogeneralGrupoBodega.setLayout(gridaBagLayoutCamposIniciogeneralGrupoBodega);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableGrupoBodega= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableGrupoBodega.setLayout(gridaBagLayoutCamposIniciocuenta_contableGrupoBodega);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoBodega = new GridBagLayout();

			this.jScrollPanelDatosGrupoBodega.setLayout(gridaBagLayoutDatosGrupoBodega);
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = 0;
			this.gridBagConstraintsGrupoBodega.gridx = 0;
			
			this.jScrollPanelDatosGrupoBodega.add(this.jTableDatosGrupoBodega, this.gridBagConstraintsGrupoBodega);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoBodega.setViewportView(this.jTableDatosGrupoBodega);
		this.jTableDatosGrupoBodega.setFillsViewportHeight(true);
		this.jTableDatosGrupoBodega.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoBodega= new GridBagLayout();
		this.jPanelAccionesGrupoBodega.setLayout(gridaBagLayoutAccionesGrupoBodega);
		
		
		/*	
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 0;
			
		this.jPanelAccionesGrupoBodega.add(this.jButtonNuevoGrupoBodega, this.gridBagConstraintsGrupoBodega);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoGrupoBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoGrupoBodega.setLayout(gridaBagLayoutBusquedaPorCodigoGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelBusquedaPorCodigoGrupoBodega.add(jLabelcodigoBusquedaPorCodigoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelBusquedaPorCodigoGrupoBodega.add(jTextFieldcodigoBusquedaPorCodigoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelBusquedaPorCodigoGrupoBodega.add(jButtonBusquedaPorCodigoGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreGrupoBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreGrupoBodega.setLayout(gridaBagLayoutBusquedaPorNombreGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelBusquedaPorNombreGrupoBodega.add(jLabelnombreBusquedaPorNombreGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelBusquedaPorNombreGrupoBodega.add(jTextAreanombreBusquedaPorNombreGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelBusquedaPorNombreGrupoBodega.add(jButtonBusquedaPorNombreGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorRucGrupoBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucGrupoBodega.setLayout(gridaBagLayoutBusquedaPorRucGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelBusquedaPorRucGrupoBodega.add(jLabelrucBusquedaPorRucGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelBusquedaPorRucGrupoBodega.add(jTextFieldrucBusquedaPorRucGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelBusquedaPorRucGrupoBodega.add(jButtonBusquedaPorRucGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("3.-Por Ruc ", jPanelBusquedaPorRucGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorTelefonoGrupoBodega= new GridBagLayout();
		gridaBagLayoutBusquedaPorTelefonoGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorTelefonoGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorTelefonoGrupoBodega.setLayout(gridaBagLayoutBusquedaPorTelefonoGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelBusquedaPorTelefonoGrupoBodega.add(jLabeltelefonoBusquedaPorTelefonoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelBusquedaPorTelefonoGrupoBodega.add(jTextFieldtelefonoBusquedaPorTelefonoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelBusquedaPorTelefonoGrupoBodega.add(jButtonBusquedaPorTelefonoGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("4.-Por Telefono ", jPanelBusquedaPorTelefonoGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoGrupoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoGrupoBodega.setLayout(gridaBagLayoutFK_IdCentroCostoGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelFK_IdCentroCostoGrupoBodega.add(jLabelid_centro_costoFK_IdCentroCostoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelFK_IdCentroCostoGrupoBodega.add(jComboBoxid_centro_costoFK_IdCentroCostoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelFK_IdCentroCostoGrupoBodega.add(jButtonFK_IdCentroCostoGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("5.-Por Centro Costo ", jPanelFK_IdCentroCostoGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoGrupoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoGrupoBodega.setLayout(gridaBagLayoutFK_IdEmpleadoGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelFK_IdEmpleadoGrupoBodega.add(jLabelid_empleadoFK_IdEmpleadoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelFK_IdEmpleadoGrupoBodega.add(jComboBoxid_empleadoFK_IdEmpleadoGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelFK_IdEmpleadoGrupoBodega.add(jButtonFK_IdEmpleadoGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("6.-Por Empleado ", jPanelFK_IdEmpleadoGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdPaisGrupoBodega= new GridBagLayout();
		gridaBagLayoutFK_IdPaisGrupoBodega.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisGrupoBodega.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisGrupoBodega.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisGrupoBodega.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisGrupoBodega.setLayout(gridaBagLayoutFK_IdPaisGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 0;
		jPanelFK_IdPaisGrupoBodega.add(jLabelid_paisFK_IdPaisGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 0;
		gridBagConstraintsGrupoBodega.gridx = 1;
		jPanelFK_IdPaisGrupoBodega.add(jComboBoxid_paisFK_IdPaisGrupoBodega, gridBagConstraintsGrupoBodega);

		gridBagConstraintsGrupoBodega = new GridBagConstraints();
		gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoBodega.gridy = 1;
		gridBagConstraintsGrupoBodega.gridx =1;
		jPanelFK_IdPaisGrupoBodega.add(jButtonFK_IdPaisGrupoBodega, gridBagConstraintsGrupoBodega);

		jTabbedPaneBusquedasGrupoBodega.addTab("7.-Por Pais ", jPanelFK_IdPaisGrupoBodega);
		jTabbedPaneBusquedasGrupoBodega.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoBodega = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoBodega);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupobodegaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();						
			this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoBodega.gridx = 0;		
			//this.gridBagConstraintsGrupoBodega.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoBodega.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoBodega, this.gridBagConstraintsGrupoBodega);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoBodega.gridx = 0;		
		//this.gridBagConstraintsGrupoBodega.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoBodega.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoBodega);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoBodega.gridx = 0;		
			this.gridBagConstraintsGrupoBodega.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoBodega.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoBodega, this.gridBagConstraintsGrupoBodega);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoBodega, this.gridBagConstraintsGrupoBodega);								
		
		
		/*
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
		*/		
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoBodega.gridx =0;
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoBodega.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoBodega, this.gridBagConstraintsGrupoBodega);
				
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoBodega, this.gridBagConstraintsGrupoBodega);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GrupoBodegaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoBodega= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoBodega = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoBodega.setLayout(gridaBagLayoutBusquedasParametrosGrupoBodega);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoBodega=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoBodega;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoBodega() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoBodega = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoBodega.setName("jPanelReporteDinamicoGrupoBodega"); 
		
		this.jPanelReporteDinamicoGrupoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoBodega.setLayout(gridaBagLayoutReporteDinamicoGrupoBodega);
		
		
		this.jInternalFrameReporteDinamicoGrupoBodega= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoBodega = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoBodega= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoBodega.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoBodega.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoBodega.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoBodega.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoBodega.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoBodega = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoBodega.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoBodega.add(this.jLabelColumnasSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoBodega = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoBodega.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoBodega.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoBodega.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoBodega.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoBodega=new JScrollPane(this.jListColumnasSelectReporteGrupoBodega);
			
			this.jScrollColumnasSelectReporteGrupoBodega.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoBodega.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoBodega.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoBodega.add(this.jListColumnasSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		this.jPanelReporteDinamicoGrupoBodega.add(this.jScrollColumnasSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoBodega = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoBodega.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoBodega.add(this.jLabelRelacionesSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoBodega = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoBodega.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoBodega.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoBodega.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoBodega.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoBodega.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoBodega=new JScrollPane(this.jListRelacionesSelectReporteGrupoBodega);
			
			this.jScrollRelacionesSelectReporteGrupoBodega.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoBodega.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoBodega.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoBodega.add(this.jListRelacionesSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		this.jPanelReporteDinamicoGrupoBodega.add(this.jScrollRelacionesSelectReporteGrupoBodega, this.gridBagConstraintsGrupoBodega);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGrupoBodega = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoBodega = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoBodega = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoBodega = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoBodega.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoBodega = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoBodega.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoBodega.add(this.jLabelGenerarExcelReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoBodega = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoBodega.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoBodega,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoBodega.setToolTipText("Generar EXCEL"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoBodega.add(this.jButtonGenerarExcelReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoBodega.add(this.jComboBoxTiposReportesDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoBodega = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoBodega.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoBodega.add(this.jLabelTiposArchivoReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoBodega.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoBodega = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoBodega.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoBodega,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoBodega.setToolTipText("Generar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoBodega.add(this.jButtonGenerarReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoBodega = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoBodega.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoBodega,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoBodega.setToolTipText("Cancelar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoBodega.add(this.jButtonCerrarReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoBodega = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoBodega= new JScrollPane(jPanelReporteDinamicoGrupoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoBodega.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoBodega.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoBodega.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoBodega.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoBodega.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoBodega);
		this.jInternalFrameReporteDinamicoGrupoBodega.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoBodega, this.gridBagConstraintsGrupoBodega);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoBodega() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoBodega = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoBodega.setName("jPanelImportacionGrupoBodega"); 
		
		this.jPanelImportacionGrupoBodega.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoBodega.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoBodega.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoBodega.setLayout(gridaBagLayoutImportacionGrupoBodega);
		
		
		this.jInternalFrameImportacionGrupoBodega= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoBodega= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoBodega = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoBodega= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoBodega.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoBodega.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoBodega.setResizable(true);
	    this.jInternalFrameImportacionGrupoBodega.setClosable(true);
	    this.jInternalFrameImportacionGrupoBodega.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoBodega.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoBodega.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoBodega.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoBodega.setResizable(true);
	    this.jInternalFrameImportacionGrupoBodega.setClosable(true);
	    this.jInternalFrameImportacionGrupoBodega.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoBodega.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoBodega.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoBodega.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoBodega = new JLabelMe();

		this.jLabelArchivoImportacionGrupoBodega.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoBodega.add(this.jLabelArchivoImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoBodega = new JFileChooser();		
		this.jFileChooserImportacionGrupoBodega.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoBodega = new JButtonMe();
		this.jButtonAbrirImportacionGrupoBodega.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoBodega,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoBodega.setToolTipText("Generar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoBodega.add(this.jButtonAbrirImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoBodega = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoBodega.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoBodega.add(this.jLabelPathArchivoImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoBodega=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoBodega.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoBodega.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoBodega.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoBodega.add(this.jTextFieldPathArchivoImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoBodega = new JButtonMe();
		this.jButtonGenerarImportacionGrupoBodega.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoBodega,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoBodega.setToolTipText("Generar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoBodega.add(this.jButtonGenerarImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoBodega = new JButtonMe();
		this.jButtonCerrarImportacionGrupoBodega.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoBodega,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoBodega.setToolTipText("Cancelar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoBodega.add(this.jButtonCerrarImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoBodega = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoBodega= new JScrollPane(jPanelImportacionGrupoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoBodega.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoBodega.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoBodega);
		this.jInternalFrameImportacionGrupoBodega.getContentPane().add(this.jScrollPanelImportacionGrupoBodega, this.gridBagConstraintsGrupoBodega);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoBodega(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoBodega = new JButtonMe();
			this.jButtonAbrirOrderByGrupoBodega.setText("Orden");
			this.jButtonAbrirOrderByGrupoBodega.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoBodega,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoBodega";
			inputMap = this.jButtonAbrirOrderByGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoBodega"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoBodega = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoBodega.setName("jPanelOrderByGrupoBodega"); 
			
			this.jPanelOrderByGrupoBodega.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoBodega.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoBodega.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoBodega.setLayout(gridaBagLayoutOrderByGrupoBodega);
			
			
			this.jTableDatosGrupoBodegaOrderBy = new JTableMe();        
			this.jTableDatosGrupoBodegaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoBodegaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoBodegaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoBodegaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoBodegaOrderBy.setViewportView(this.jTableDatosGrupoBodegaOrderBy);
			this.jTableDatosGrupoBodegaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoBodegaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoBodega= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoBodega= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoBodega = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoBodega= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoBodega.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoBodega.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoBodega.setTitle("Orden");
			this.jInternalFrameOrderByGrupoBodega.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoBodega.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoBodega.setResizable(true);
			this.jInternalFrameOrderByGrupoBodega.setClosable(true);
			this.jInternalFrameOrderByGrupoBodega.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoBodega.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoBodega.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoBodega.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoBodega.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoBodega.ipady =150;
				
			this.jPanelOrderByGrupoBodega.add(jScrollPanelDatosGrupoBodegaOrderBy, this.gridBagConstraintsGrupoBodega);//this.jTableDatosGrupoBodegaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoBodega = new JButtonMe();
			this.jButtonCerrarOrderByGrupoBodega.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoBodega,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoBodega.setToolTipText("Cancelar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoBodega.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoBodega.add(this.jButtonCerrarOrderByGrupoBodega, this.gridBagConstraintsGrupoBodega);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoBodega = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoBodega= new JScrollPane(jPanelOrderByGrupoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoBodega.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoBodega.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoBodega.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoBodega);
			
			this.jInternalFrameOrderByGrupoBodega.getContentPane().add(this.jScrollPanelOrderByGrupoBodega, this.gridBagConstraintsGrupoBodega);			
		
		} else {
			this.jButtonAbrirOrderByGrupoBodega = new JButtonMe();
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
		int iWidthTableCalculado=0;//4630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.grupobodegaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoBodega.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoBodega.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoBodega.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoBodega.getRowHeight();//GrupoBodegaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoBodega.isSelected()) {
					iHeightTable=GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoBodega.isSelected()) {
					iHeightTable=GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoBodegaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoBodega.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoBodega.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoBodega.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoBodega.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoBodega.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoBodega.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoBodega!=null && this.jInternalFrameOrderByGrupoBodega.getjTableDatosOrderBy()!=null) {
			//if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoBodega.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoBodega.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoBodega.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoBodega.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoBodega.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoBodega.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoBodega.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoBodega.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoBodega.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoBodega.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupobodegaLogic.getGrupoBodegas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupobodegas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoBodega> TraerGrupoBodegaBeans(List<GrupoBodega> grupobodegas,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoBodega grupobodega:grupobodegas) {
					
				if(!(GrupoBodegaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoBodegaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupobodega.setsDetalleGeneralEntityReporte(GrupoBodegaConstantesFunciones.getGrupoBodegaDescripcion(grupobodega));
										
						
					
					

					if(grupobodega.getBodegas()!=null && Funciones.existeClass(classes,Bodega.class)) {
						try{grupobodega.setbodegasDescripcionReporte(new JRBeanCollectionDataSource(BodegaJInternalFrame.TraerBodegaBeans(grupobodega.getBodegas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(grupobodega.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{grupobodega.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(grupobodega.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//grupobodega.setsDetalleGeneralEntityReporte(grupobodega.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupobodegabeans.add(grupobodegabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupobodegas;
    }
	//PARA REPORTES FIN
}
