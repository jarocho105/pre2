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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.DetalleAsientoContableConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class DetalleAsientoContableJInternalFrame extends DetalleAsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleAsientoContable;
	
	protected JMenuBar jmenuBarDetalleAsientoContable;
	
	protected JMenu jmenuDetalleAsientoContable;
	protected JMenu jmenuDatosDetalleAsientoContable;
	protected JMenu jmenuArchivoDetalleAsientoContable;
	protected JMenu jmenuAccionesDetalleAsientoContable;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAsientoContable;	
	protected GridBagConstraints gridBagConstraintsDetalleAsientoContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleAsientoContableDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleAsientoContable;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleAsientoContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleAsientoContable;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public DetalleAsientoContableSessionBean detalleasientocontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleAsientoContable> detalleasientocontables;		
	public List<DetalleAsientoContable> detalleasientocontablesEliminados;	
	public List<DetalleAsientoContable> detalleasientocontablesAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleAsientoContable;		
	protected JButton jButtonAbrirTotalesDetalleAsientoContable;		
	
	/*
	protected JPanel jPanelTotalesDetalleAsientoContable;
	public JScrollPane jScrollPanelTotalesDetalleAsientoContable;	
	protected JButton jButtonCerrarTotalesDetalleAsientoContable;
	*/
	
	public List<DetalleAsientoContable> detalleasientocontablesTotal= new ArrayList<DetalleAsientoContable>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleAsientoContable;		
	protected JButton jButtonAbrirOrderByDetalleAsientoContable;
	
	
	//protected JPanel jPanelOrderByDetalleAsientoContable;
	//public JScrollPane jScrollPanelOrderByDetalleAsientoContable;	
	//protected JButton jButtonCerrarOrderByDetalleAsientoContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleAsientoContableLogic detalleasientocontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionDetalleAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralDetalleAsientoContable;
    //public JScrollPane jScrollPanelDatosDetalleAsientoContableTotales;
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleAsientoContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleAsientoContable;
	//public JScrollPane jScrollPanelImportacionDetalleAsientoContable;
	*/
	
	
	protected JPanel jPanelAccionesDetalleAsientoContable;
	
    protected JPanel jPanelPaginacionDetalleAsientoContable;
    protected JPanel jPanelParametrosReportesDetalleAsientoContable;
	protected JPanel jPanelParametrosReportesAccionesDetalleAsientoContable;
	
	
	
	
	
	;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleAsientoContable;
	protected JPanel jPanelParametrosAuxiliar2DetalleAsientoContable;
	protected JPanel jPanelParametrosAuxiliar3DetalleAsientoContable;
	protected JPanel jPanelParametrosAuxiliar4DetalleAsientoContable;
	//protected JPanel jPanelParametrosAuxiliar5DetalleAsientoContable;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleAsientoContable;
	//protected JPanel jPanelImportacionDetalleAsientoContable;
	*/
	
	public JTable jTableDatosDetalleAsientoContable;
	//public JTable jTableDatosDetalleAsientoContableTotales;
	
	/*
	//public JTable jTableDatosDetalleAsientoContableOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleAsientoContable;
	protected JButton jButtonDuplicarDetalleAsientoContable;
	protected JButton jButtonCopiarDetalleAsientoContable;
	protected JButton jButtonVerFormDetalleAsientoContable;
	protected JButton jButtonNuevoRelacionesDetalleAsientoContable;
	protected JButton jButtonModificarDetalleAsientoContable;
	
    protected JButton jButtonGuardarCambiosTablaDetalleAsientoContable;
	protected JButton jButtonCerrarDetalleAsientoContable;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleAsientoContable;
	protected JButton jButtonProcesarInformacionDetalleAsientoContable;
	*/
	
	protected JButton jButtonAnterioresDetalleAsientoContable;
	protected JButton jButtonSiguientesDetalleAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosDetalleAsientoContable;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleAsientoContable;
	//protected JButton jButtonCerrarReporteDinamicoDetalleAsientoContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleAsientoContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleAsientoContable;
	//protected JButton jButtonGenerarImportacionDetalleAsientoContable;
	//protected JButton jButtonCerrarImportacionDetalleAsientoContable;
	//protected JFileChooser jFileChooserImportacionDetalleAsientoContable;
	//protected File fileImportacionDetalleAsientoContable;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleAsientoContable;
	protected JButton jButtonDuplicarToolBarDetalleAsientoContable;
	protected JButton jButtonNuevoRelacionesToolBarDetalleAsientoContable;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleAsientoContable;
	protected JButton jButtonCopiarToolBarDetalleAsientoContable;
	protected JButton jButtonVerFormToolBarDetalleAsientoContable;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAsientoContable;
	protected JButton jButtonCerrarToolBarDetalleAsientoContable;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleAsientoContable;
	protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContable;
	protected JButton jButtonAnterioresToolBarDetalleAsientoContable;
	protected JButton jButtonSiguientesToolBarDetalleAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleAsientoContable;
	protected JButton jButtonAbrirOrderByToolBarDetalleAsientoContable;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleAsientoContable;
	protected JMenuItem jMenuItemDuplicarDetalleAsientoContable;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleAsientoContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleAsientoContable;
	protected JMenuItem jMenuItemCopiarDetalleAsientoContable;
	protected JMenuItem jMenuItemVerFormDetalleAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAsientoContable;
	protected JMenuItem jMenuItemCerrarDetalleAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAsientoContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAsientoContable;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleAsientoContable;
	protected JMenuItem jMenuItemProcesarInformacionDetalleAsientoContable;
	protected JMenuItem jMenuItemAnterioresDetalleAsientoContable;
	protected JMenuItem jMenuItemSiguientesDetalleAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAsientoContable;
	protected JMenuItem jMenuItemAbrirOrderByDetalleAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAsientoContable;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAsientoContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleAsientoContable;
	protected JCheckBox jCheckBoxSeleccionadosDetalleAsientoContable;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleAsientoContable;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleAsientoContable;
	protected JTextField jTextFieldValorCampoGeneralDetalleAsientoContable;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleAsientoContable;
	//public JList<Reporte> jListColumnasSelectReporteDetalleAsientoContable;
	//public JScrollPane jScrollColumnasSelectReporteDetalleAsientoContable;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleAsientoContable;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleAsientoContable;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleAsientoContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleAsientoContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleAsientoContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleAsientoContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleAsientoContable;
	
		
	//public JLabel jLabelArchivoImportacionDetalleAsientoContable;	
	//public JLabel jLabelPathArchivoImportacionDetalleAsientoContable;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleAsientoContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleAsientoContable;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleAsientoContable;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleAsientoContable;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleAsientoContable;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleAsientoContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleAsientoContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasDetalleAsientoContable;
	public JPanel jPanelFK_IdAsientoContableDetalleAsientoContable;
	public JButton jButtonFK_IdAsientoContableDetalleAsientoContable;
	public JPanel jPanelFK_IdCentroActividadDetalleAsientoContable;
	public JButton jButtonFK_IdCentroActividadDetalleAsientoContable;
	public JPanel jPanelFK_IdCentroCostoDetalleAsientoContable;
	public JButton jButtonFK_IdCentroCostoDetalleAsientoContable;
	public JPanel jPanelFK_IdCuentaContableDetalleAsientoContable;
	public JButton jButtonFK_IdCuentaContableDetalleAsientoContable;
	public JPanel jPanelFK_IdTipoCambioDetalleAsientoContable;
	public JButton jButtonFK_IdTipoCambioDetalleAsientoContable;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContableBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable;
	
	public JPanel jPanelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable;
	public JLabel jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable;
	public JButton jButtonid_centro_actividadFK_IdCentroActividadDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadDetalleAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleAsientoContable;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleAsientoContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleAsientoContableArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable;
	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable;
	
	*/
	
	
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
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleAsientoContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleAsientoContable)	{
		this.jButtonRecargarInformacionDetalleAsientoContable = jButtonRecargarInformacionDetalleAsientoContable;
	}
	
	public JButton getjButtonProcesarInformacionDetalleAsientoContable() {
		return this.jButtonProcesarInformacionDetalleAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAsientoContable)	{
		this.jButtonProcesarInformacionDetalleAsientoContable = jButtonProcesarInformacionDetalleAsientoContable;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleAsientoContable() {
		return new JButton();
	}
	
	
	public List<DetalleAsientoContable> getdetalleasientocontables() {
		return this.detalleasientocontables;
	}

	public void setdetalleasientocontables(List<DetalleAsientoContable> detalleasientocontables) {
		this.detalleasientocontables = detalleasientocontables;
	}
	
	public List<DetalleAsientoContable> getdetalleasientocontablesAux() {
		return this.detalleasientocontablesAux;
	}

	public void setdetalleasientocontablesAux(List<DetalleAsientoContable> detalleasientocontablesAux) {
		this.detalleasientocontablesAux = detalleasientocontablesAux;
	}
	
	public List<DetalleAsientoContable> getdetalleasientocontablesEliminados() {
		return this.detalleasientocontablesEliminados;
	}

	public void setDetalleAsientoContablesEliminados(List<DetalleAsientoContable> detalleasientocontablesEliminados) {
		this.detalleasientocontablesEliminados = detalleasientocontablesEliminados;
	}
	
	public List<DetalleAsientoContable> getdetalleasientocontablesTotal() {
		return this.detalleasientocontablesTotal;
	}

	public void setdetalleasientocontablesTotal(List<DetalleAsientoContable> detalleasientocontablesTotal) {
		this.detalleasientocontablesTotal = detalleasientocontablesTotal;
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleAsientoContable() {
		return jComboBoxTiposSeleccionarDetalleAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleAsientoContable(
			JComboBox jComboBoxTiposSeleccionarDetalleAsientoContable) {
		this.jComboBoxTiposSeleccionarDetalleAsientoContable = jComboBoxTiposSeleccionarDetalleAsientoContable;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleAsientoContable() {
		return jTextFieldValorCampoGeneralDetalleAsientoContable;
	}

	public void setjTextFieldValorCampoGeneralDetalleAsientoContable(
			JTextField jTextFieldValorCampoGeneralDetalleAsientoContable) {
		this.jTextFieldValorCampoGeneralDetalleAsientoContable = jTextFieldValorCampoGeneralDetalleAsientoContable;
	}

	public void setBorderResaltarValorCampoGeneralDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleAsientoContable .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleAsientoContable() {
		return this.jCheckBoxSeleccionarTodosDetalleAsientoContable;
	}

	public void setjCheckBoxSeleccionarTodosDetalleAsientoContable(
			JCheckBox jCheckBoxSeleccionarTodosDetalleAsientoContable) {
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable = jCheckBoxSeleccionarTodosDetalleAsientoContable;
	}

	public void setBorderResaltarSeleccionarTodosDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleAsientoContable() {
		return this.jCheckBoxSeleccionadosDetalleAsientoContable;
	}

	public void setjCheckBoxSeleccionadosDetalleAsientoContable(
			JCheckBox jCheckBoxSeleccionadosDetalleAsientoContable) {
		this.jCheckBoxSeleccionadosDetalleAsientoContable = jCheckBoxSeleccionadosDetalleAsientoContable;
	}
	
	public void setBorderResaltarSeleccionadosDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleAsientoContable() {
		return this.jComboBoxTiposArchivosReportesDetalleAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleAsientoContable(
			JComboBox jComboBoxTiposArchivosReportesDetalleAsientoContable) {
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable = jComboBoxTiposArchivosReportesDetalleAsientoContable;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleAsientoContable() {
		return this.jComboBoxTiposReportesDetalleAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleAsientoContable(
			JComboBox jComboBoxTiposReportesDetalleAsientoContable) {
		this.jComboBoxTiposReportesDetalleAsientoContable = jComboBoxTiposReportesDetalleAsientoContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleAsientoContable() {
	//	return jComboBoxTiposReportesDinamicoDetalleAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleAsientoContable(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleAsientoContable) {
	//	this.jComboBoxTiposReportesDinamicoDetalleAsientoContable = jComboBoxTiposReportesDinamicoDetalleAsientoContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable = jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable;
	//}
	
	public void setBorderResaltarTiposReportesDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleAsientoContable() {
		return this.jComboBoxTiposGraficosReportesDetalleAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleAsientoContable(
			JComboBox jComboBoxTiposGraficosReportesDetalleAsientoContable) {
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable = jComboBoxTiposGraficosReportesDetalleAsientoContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleAsientoContable() {
		return this.jComboBoxTiposPaginacionDetalleAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleAsientoContable(
			JComboBox jComboBoxTiposPaginacionDetalleAsientoContable) {
		this.jComboBoxTiposPaginacionDetalleAsientoContable = jComboBoxTiposPaginacionDetalleAsientoContable;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleAsientoContable() {
		return this.jComboBoxTiposRelacionesDetalleAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAsientoContable() {
		return this.jComboBoxTiposAccionesDetalleAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAsientoContable(
			JComboBox jComboBoxTiposRelacionesDetalleAsientoContable) {
		this.jComboBoxTiposRelacionesDetalleAsientoContable = jComboBoxTiposRelacionesDetalleAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAsientoContable(
			JComboBox jComboBoxTiposAccionesDetalleAsientoContable) {
		this.jComboBoxTiposAccionesDetalleAsientoContable = jComboBoxTiposAccionesDetalleAsientoContable;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleAsientoContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleAsientoContable() {
	//	return jCheckBoxConGraficoDinamicoDetalleAsientoContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleAsientoContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleAsientoContable) {
	//	this.jCheckBoxConGraficoDinamicoDetalleAsientoContable = jCheckBoxConGraficoDinamicoDetalleAsientoContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleAsientoContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleAsientoContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleAsientoContable .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleasientocontableSessionBean=new DetalleAsientoContableSessionBean();
		
		this.detalleasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleasientocontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleAsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsientoContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"nuevo","nuevo","Nuevo"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"duplicar","duplicar","Duplicar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"copiar","copiar","Copiar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"ver_form","ver_form","Ver"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"recargar","recargar","Recargar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"cerrar","cerrar","Salir"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleAsientoContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleAsientoContable;
			
				this.jButtonProcesarInformacionToolBarDetalleAsientoContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContable;
				
		//protected JButton jButtonModificarToolBarDetalleAsientoContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleAsientoContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleAsientoContable=new JMenuMe("General");
		this.jmenuArchivoDetalleAsientoContable=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleAsientoContable=new JMenuMe("Acciones");
		this.jmenuDatosDetalleAsientoContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleAsientoContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleAsientoContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleAsientoContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleAsientoContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleAsientoContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleAsientoContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleAsientoContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleAsientoContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleAsientoContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleAsientoContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleAsientoContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleAsientoContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleAsientoContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleAsientoContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleAsientoContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleAsientoContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleAsientoContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleAsientoContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleAsientoContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleAsientoContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleAsientoContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleAsientoContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleAsientoContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleAsientoContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleAsientoContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleAsientoContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleAsientoContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleAsientoContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleAsientoContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleAsientoContable.add(this.jMenuItemCerrarDetalleAsientoContable);
			
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemNuevoDetalleAsientoContable);
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContable);
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemNuevoRelacionesDetalleAsientoContable);
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemGuardarCambiosTablaDetalleAsientoContable);		
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemDuplicarDetalleAsientoContable);		
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemCopiarDetalleAsientoContable);		
			this.jmenuAccionesDetalleAsientoContable.add(this.jMenuItemVerFormDetalleAsientoContable);		
			
			this.jmenuDatosDetalleAsientoContable.add(this.jMenuItemRecargarInformacionDetalleAsientoContable);				
			this.jmenuDatosDetalleAsientoContable.add(this.jMenuItemAnterioresDetalleAsientoContable);				
			this.jmenuDatosDetalleAsientoContable.add(this.jMenuItemSiguientesDetalleAsientoContable);				
			this.jmenuDatosDetalleAsientoContable.add(this.jMenuItemAbrirOrderByDetalleAsientoContable);				
			this.jmenuDatosDetalleAsientoContable.add(this.jMenuItemMostrarOcultarDetalleAsientoContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleAsientoContable.add(this.jMenuItemGuardarCambiosDetalleAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAsientoContable.add(this.jmenuArchivoDetalleAsientoContable);		
			this.jmenuBarDetalleAsientoContable.add(this.jmenuAccionesDetalleAsientoContable);		
			this.jmenuBarDetalleAsientoContable.add(this.jmenuDatosDetalleAsientoContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleAsientoContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleAsientoContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleAsientoContable.setToolTipText("Buscar Por Asiento C. ");
		this.jButtonFK_IdAsientoContableDetalleAsientoContable= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleAsientoContable.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleAsientoContable.setToolTipText("Buscar Por Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleAsientoContable,"buscar_button","Buscar Por Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setText("Asiento C. :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setToolTipText("Asiento C.");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable.setFocusable(false);

		this.jPanelFK_IdCentroActividadDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroActividadDetalleAsientoContable.setToolTipText("Buscar Por Centro Actividad ");
		this.jButtonFK_IdCentroActividadDetalleAsientoContable= new JButtonMe();
		this.jButtonFK_IdCentroActividadDetalleAsientoContable.setText("Buscar");
		this.jButtonFK_IdCentroActividadDetalleAsientoContable.setToolTipText("Buscar Por Centro Actividad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroActividadDetalleAsientoContable,"buscar_button","Buscar Por Centro Actividad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroActividadDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable = new JLabelMe();
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setText("Centro Actividad :");
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setToolTipText("Centro Actividad");
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleAsientoContable.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleAsientoContable= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleAsientoContable.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleAsientoContable.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleAsientoContable,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable.setFocusable(false);

		this.jPanelFK_IdCuentaContableDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDetalleAsientoContable.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableDetalleAsientoContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableDetalleAsientoContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableDetalleAsientoContable.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDetalleAsientoContable,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable.setFocusable(false);

		this.jPanelFK_IdTipoCambioDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioDetalleAsientoContable.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioDetalleAsientoContable= new JButtonMe();
		this.jButtonFK_IdTipoCambioDetalleAsientoContable.setText("Buscar");
		this.jButtonFK_IdTipoCambioDetalleAsientoContable.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioDetalleAsientoContable,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable.setFocusable(false);


		this.jTabbedPaneBusquedasDetalleAsientoContable=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleAsientoContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAsientoContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAsientoContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleDetalleAsientoContable = new DetalleAsientoContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Asiento Contable DATOS");
			this.jInternalFrameDetalleFormDetalleAsientoContable = new DetalleAsientoContableDetalleFormJInternalFrame(jDesktopPane,this.detalleasientocontableSessionBean.getConGuardarRelaciones(),this.detalleasientocontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleAsientoContable = null;//new DetalleAsientoContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleAsientoContable= new GridBagLayout();
		
		
		this.jTableDatosDetalleAsientoContable = new JTableMe();      
		
		String sToolTipDetalleAsientoContable="";
		sToolTipDetalleAsientoContable=DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAsientoContable+="(Contabilidad.DetalleAsientoContable)";
		}
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAsientoContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleAsientoContable.setToolTipText(sToolTipDetalleAsientoContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleAsientoContable);
		this.jTableDatosDetalleAsientoContable.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleAsientoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleAsientoContable.setRowSelectionAllowed(true);
		this.jTableDatosDetalleAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleAsientoContableTotales = new JTableMe();        
		//this.jTableDatosDetalleAsientoContableTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContableTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleAsientoContable = new JButtonMe();
		this.jButtonDuplicarDetalleAsientoContable = new JButtonMe();
		this.jButtonCopiarDetalleAsientoContable = new JButtonMe();
		this.jButtonVerFormDetalleAsientoContable = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleAsientoContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContable = new JButtonMe();
		this.jButtonCerrarDetalleAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleAsientoContable = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleAsientoContableTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Asiento Contable";
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleAsientoContableTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAsientoContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleAsientoContable=new ReporteDinamicoJInternalFrame(DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleAsientoContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleAsientoContable=new ImportacionJInternalFrame(DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleAsientoContable();
			
			*/		
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleAsientoContable = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleAsientoContable.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleAsientoContable,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleAsientoContable=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleAsientoContable,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleAsientoContable();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleAsientoContable = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleAsientoContable.setText("Orden");
		this.jButtonAbrirOrderByDetalleAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAsientoContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAsientoContable,false,this);
			
			//this.cargarOrderByDetalleAsientoContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAsientoContable,true,this);
			
			//this.cargarOrderByDetalleAsientoContable(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleAsientoContable.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosDetalleAsientoContable.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosDetalleAsientoContable.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosDetalleAsientoContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAsientoContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAsientoContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleAsientoContable.setText("Nuevo");
		this.jButtonDuplicarDetalleAsientoContable.setText("Duplicar");
		this.jButtonCopiarDetalleAsientoContable.setText("Copiar");
		this.jButtonVerFormDetalleAsientoContable.setText("Ver");
		this.jButtonNuevoRelacionesDetalleAsientoContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.setText("Guardar");
		this.jButtonCerrarDetalleAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAsientoContable,"nuevo_button","Nuevo",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleAsientoContable,"duplicar_button","Duplicar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleAsientoContable,"copiar_button","Copiar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleAsientoContable,"ver_form","Ver",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleAsientoContable,"nuevorelaciones_button","Nuevo Rel",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAsientoContable,"guardarcambiostabla_button","Guardar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAsientoContable,"cerrar_button","Salir",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleAsientoContable.setToolTipText("Nuevo"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleAsientoContable.setToolTipText("Duplicar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleAsientoContable.setToolTipText("Copiar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleAsientoContable.setToolTipText("Ver"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleAsientoContable.setToolTipText("Nuevo Rel"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.setToolTipText("Guardar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAsientoContable.setToolTipText("Salir"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAsientoContable";
		inputMap = this.jButtonNuevoDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAsientoContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleAsientoContable";
		inputMap = this.jButtonDuplicarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleAsientoContable"));
		
		//COPIAR
		sMapKey = "CopiarDetalleAsientoContable";
		inputMap = this.jButtonCopiarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleAsientoContable"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleAsientoContable";
		inputMap = this.jButtonVerFormDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleAsientoContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleAsientoContable";
		inputMap = this.jButtonNuevoRelacionesDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleAsientoContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleAsientoContable";
		inputMap = this.jButtonModificarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleAsientoContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleAsientoContable";
		inputMap = this.jButtonCerrarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAsientoContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleAsientoContable.setName("jPanelParametrosReportesDetalleAsientoContable"); 
		
		this.jPanelParametrosReportesAccionesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleAsientoContable.setName("jPanelParametrosReportesAccionesDetalleAsientoContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleAsientoContable = new JButtonMe();
		this.jButtonRecargarInformacionDetalleAsientoContable.setText("Recargar");
		this.jButtonRecargarInformacionDetalleAsientoContable.setToolTipText("Recargar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleAsientoContable,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleAsientoContable = new JButtonMe();
		this.jButtonProcesarInformacionDetalleAsientoContable.setText("Procesar");
		this.jButtonProcesarInformacionDetalleAsientoContable.setToolTipText("Procesar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleAsientoContable.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleAsientoContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAsientoContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAsientoContable.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleAsientoContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleAsientoContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleAsientoContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleAsientoContable.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleAsientoContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAsientoContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleAsientoContable.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleAsientoContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleAsientoContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAsientoContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAsientoContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleAsientoContable = new JLabelMe();
		
		this.jLabelAccionesDetalleAsientoContable.setText("Acciones");		
		this.jLabelAccionesDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleAsientoContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleAsientoContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleAsientoContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleAsientoContable.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleAsientoContable = new JButtonMe();
		//this.jButtonAnterioresDetalleAsientoContable.setText("<<");
        this.jButtonAnterioresDetalleAsientoContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleAsientoContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleAsientoContable = new JButtonMe();
		//this.jButtonSiguientesDetalleAsientoContable.setText(">>");
        this.jButtonSiguientesDetalleAsientoContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleAsientoContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleAsientoContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleAsientoContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleAsientoContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleAsientoContable,"nuevoguardarcambios_button","Nue",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleAsientoContable";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleAsientoContable"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleAsientoContable";
		inputMap = this.jButtonRecargarInformacionDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleAsientoContable"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleAsientoContable";
		inputMap = this.jButtonSiguientesDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleAsientoContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleAsientoContable";
		inputMap = this.jButtonAnterioresDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleAsientoContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleAsientoContable();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleAsientoContable.setMinimumSize(new Dimension(this.getWidth(),DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAsientoContable.setMaximumSize(new Dimension(this.getWidth(),DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAsientoContable.setPreferredSize(new Dimension(this.getWidth(),DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleAsientoContable = new GridBagLayout();

			this.jPanelPaginacionDetalleAsientoContable.setLayout(gridaBagLayoutPaginacionDetalleAsientoContable);						
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonAnterioresDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
						
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
			
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonNuevoGuardarCambiosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
						
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonSiguientesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonAbrirTotalesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonNuevoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
						
			
			
			if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
				this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonGuardarCambiosTablaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			}
			
			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonDuplicarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonCopiarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonVerFormDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleAsientoContable.add(this.jButtonCerrarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		/*
		this.jButtonRecargarInformacionDetalleAsientoContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAsientoContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAsientoContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAsientoContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleAsientoContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAsientoContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAsientoContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleAsientoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAsientoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAsientoContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleAsientoContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAsientoContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAsientoContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleAsientoContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleAsientoContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleAsientoContable.setLayout(gridaBagParametrosReportesDetalleAsientoContable);
			this.jPanelParametrosReportesAccionesDetalleAsientoContable.setLayout(gridaBagParametrosReportesAccionesDetalleAsientoContable);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleAsientoContable.setLayout(gridaBagParametrosAuxiliar1DetalleAsientoContable);
			this.jPanelParametrosAuxiliar2DetalleAsientoContable.setLayout(gridaBagParametrosAuxiliar2DetalleAsientoContable);
			this.jPanelParametrosAuxiliar3DetalleAsientoContable.setLayout(gridaBagParametrosAuxiliar3DetalleAsientoContable);
			this.jPanelParametrosAuxiliar4DetalleAsientoContable.setLayout(gridaBagParametrosAuxiliar4DetalleAsientoContable);
			//this.jPanelParametrosAuxiliar5DetalleAsientoContable.setLayout(gridaBagParametrosAuxiliar2DetalleAsientoContable);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jButtonRecargarInformacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContable.add(this.jComboBoxTiposPaginacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContable.add(this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContable.add(this.jComboBoxTiposArchivosReportesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jPanelParametrosAuxiliar1DetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleAsientoContable.add(this.jComboBoxTiposReportesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);																		
			*/
			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleAsientoContable.add(this.jComboBoxTiposGraficosReportesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jPanelParametrosAuxiliar4DetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jComboBoxTiposReportesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jCheckBoxGenerarReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jPanelParametrosAuxiliar2DetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jLabelAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleAsientoContable.add(this.jButtonAbrirOrderByDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jComboBoxTiposSeleccionarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			*/
			
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jCheckBoxSeleccionarTodosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jCheckBoxConGraficoReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContable.add(this.jCheckBoxSeleccionarTodosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);															
				
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContable.add(this.jCheckBoxSeleccionadosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);															
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContable.add(this.jCheckBoxConGraficoReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jPanelParametrosAuxiliar3DetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jComboBoxTiposAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	
				
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContable.add(this.jTextFieldValorCampoGeneralDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			
			*/
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleAsientoContable = new GridBagLayout();

			this.jScrollPanelDatosDetalleAsientoContable.setLayout(gridaBagLayoutDatosDetalleAsientoContable);
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
			
			this.jScrollPanelDatosDetalleAsientoContable.add(this.jTableDatosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleAsientoContable.setViewportView(this.jTableDatosDetalleAsientoContable);
		this.jTableDatosDetalleAsientoContable.setFillsViewportHeight(true);
		this.jTableDatosDetalleAsientoContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleAsientoContableTotales.setViewportView(this.jTableDatosDetalleAsientoContableTotales);
		//this.jTableDatosDetalleAsientoContableTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleAsientoContableTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleAsientoContable= new GridBagLayout();
		this.jPanelAccionesDetalleAsientoContable.setLayout(gridaBagLayoutAccionesDetalleAsientoContable);
		
		
		/*	
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
			
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonNuevoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleAsientoContable.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdAsientoContableDetalleAsientoContable.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 1;
		jPanelFK_IdAsientoContableDetalleAsientoContable.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);


		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdAsientoContableDetalleAsientoContable.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 1;
		gridBagConstraintsDetalleAsientoContable.gridx =1;
		jPanelFK_IdAsientoContableDetalleAsientoContable.add(jButtonFK_IdAsientoContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		jTabbedPaneBusquedasDetalleAsientoContable.addTab("1.-Por Asiento C. ", jPanelFK_IdAsientoContableDetalleAsientoContable);
		jTabbedPaneBusquedasDetalleAsientoContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroActividadDetalleAsientoContable.setLayout(gridaBagLayoutFK_IdCentroActividadDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdCentroActividadDetalleAsientoContable.add(jLabelid_centro_actividadFK_IdCentroActividadDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 1;
		jPanelFK_IdCentroActividadDetalleAsientoContable.add(jComboBoxid_centro_actividadFK_IdCentroActividadDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 1;
		gridBagConstraintsDetalleAsientoContable.gridx =1;
		jPanelFK_IdCentroActividadDetalleAsientoContable.add(jButtonFK_IdCentroActividadDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		jTabbedPaneBusquedasDetalleAsientoContable.addTab("2.-Por Centro Actividad ", jPanelFK_IdCentroActividadDetalleAsientoContable);
		jTabbedPaneBusquedasDetalleAsientoContable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleAsientoContable.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdCentroCostoDetalleAsientoContable.add(jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 1;
		jPanelFK_IdCentroCostoDetalleAsientoContable.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);


		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdCentroCostoDetalleAsientoContable.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 1;
		gridBagConstraintsDetalleAsientoContable.gridx =1;
		jPanelFK_IdCentroCostoDetalleAsientoContable.add(jButtonFK_IdCentroCostoDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		jTabbedPaneBusquedasDetalleAsientoContable.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleAsientoContable);
		jTabbedPaneBusquedasDetalleAsientoContable.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDetalleAsientoContable.setLayout(gridaBagLayoutFK_IdCuentaContableDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdCuentaContableDetalleAsientoContable.add(jLabelid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 1;
		jPanelFK_IdCuentaContableDetalleAsientoContable.add(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);


		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdCuentaContableDetalleAsientoContable.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 1;
		gridBagConstraintsDetalleAsientoContable.gridx =1;
		jPanelFK_IdCuentaContableDetalleAsientoContable.add(jButtonFK_IdCuentaContableDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		jTabbedPaneBusquedasDetalleAsientoContable.addTab("4.-Por Cuenta Contable ", jPanelFK_IdCuentaContableDetalleAsientoContable);
		jTabbedPaneBusquedasDetalleAsientoContable.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioDetalleAsientoContable.setLayout(gridaBagLayoutFK_IdTipoCambioDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdTipoCambioDetalleAsientoContable.add(jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 1;
		jPanelFK_IdTipoCambioDetalleAsientoContable.add(jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);


		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContable.gridy = 0;
		gridBagConstraintsDetalleAsientoContable.gridx = 0;
		jPanelFK_IdTipoCambioDetalleAsientoContable.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContable.gridy = 1;
		gridBagConstraintsDetalleAsientoContable.gridx =1;
		jPanelFK_IdTipoCambioDetalleAsientoContable.add(jButtonFK_IdTipoCambioDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);

		jTabbedPaneBusquedasDetalleAsientoContable.addTab("5.-Por Tipo Cambio ", jPanelFK_IdTipoCambioDetalleAsientoContable);
		jTabbedPaneBusquedasDetalleAsientoContable.setMnemonicAt(4, KeyEvent.VK_5);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAsientoContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;		
			//this.gridBagConstraintsDetalleAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAsientoContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;		
		//this.gridBagConstraintsDetalleAsientoContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleAsientoContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;		
			this.gridBagConstraintsDetalleAsientoContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleAsientoContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);								
		*/
		
		/*
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		*/		
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContable.gridx =0;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
				
		//this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleAsientoContable.gridx =0;
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleAsientoContable.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleAsientoContableTotales/*this.jTableDatosDetalleAsientoContableTotales*/, this.gridBagConstraintsDetalleAsientoContable);				
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleAsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAsientoContable = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleAsientoContable.setLayout(gridaBagLayoutBusquedasParametrosDetalleAsientoContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleAsientoContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleAsientoContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleAsientoContable.setName("jPanelReporteDinamicoDetalleAsientoContable"); 
		
		this.jPanelReporteDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleAsientoContable.setLayout(gridaBagLayoutReporteDinamicoDetalleAsientoContable);
		
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleAsientoContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleAsientoContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleAsientoContable = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleAsientoContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelColumnasSelectReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleAsientoContable = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleAsientoContable=new JScrollPane(this.jListColumnasSelectReporteDetalleAsientoContable);
			
			this.jScrollColumnasSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jListColumnasSelectReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jScrollColumnasSelectReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleAsientoContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleAsientoContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleAsientoContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleAsientoContable=new JScrollPane(this.jListRelacionesSelectReporteDetalleAsientoContable);
			
			this.jScrollRelacionesSelectReporteDetalleAsientoContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAsientoContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAsientoContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleAsientoContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleAsientoContable = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleAsientoContable.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelConGraficoDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContable.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContable.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jCheckBoxConGraficoDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContable = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleAsientoContable.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelColumnaCategoriaGraficoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleAsientoContable = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleAsientoContable.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelColumnaCategoriaValorDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleAsientoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jComboBoxColumnaCategoriaValorDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleAsientoContable = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleAsientoContable.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelColumnasValoresGraficoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleAsientoContable = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleAsientoContable.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleAsientoContable=new JScrollPane(this.jListColumnasValoresGraficoDetalleAsientoContable);
			
			this.jScrollColumnasValoresGraficoDetalleAsientoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAsientoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAsientoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jListColumnasSelectReporteDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jScrollColumnasValoresGraficoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContable.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContable.setToolTipText("Generar EXCEL"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jComboBoxTiposReportesDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleAsientoContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleAsientoContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleAsientoContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleAsientoContable.setToolTipText("Generar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jButtonGenerarReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleAsientoContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleAsientoContable.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContable.add(this.jButtonCerrarReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleAsientoContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleAsientoContable= new JScrollPane(jPanelReporteDinamicoDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleAsientoContable);
		this.jInternalFrameReporteDinamicoDetalleAsientoContable.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleAsientoContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleAsientoContable.setName("jPanelImportacionDetalleAsientoContable"); 
		
		this.jPanelImportacionDetalleAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleAsientoContable.setLayout(gridaBagLayoutImportacionDetalleAsientoContable);
		
		
		this.jInternalFrameImportacionDetalleAsientoContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleAsientoContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionDetalleAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionDetalleAsientoContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAsientoContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionDetalleAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionDetalleAsientoContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleAsientoContable = new JLabelMe();

		this.jLabelArchivoImportacionDetalleAsientoContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAsientoContable.add(this.jLabelArchivoImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleAsientoContable = new JFileChooser();		
		this.jFileChooserImportacionDetalleAsientoContable.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleAsientoContable = new JButtonMe();
		this.jButtonAbrirImportacionDetalleAsientoContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleAsientoContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleAsientoContable.setToolTipText("Generar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContable.add(this.jButtonAbrirImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleAsientoContable = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleAsientoContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAsientoContable.add(this.jLabelPathArchivoImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleAsientoContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleAsientoContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAsientoContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAsientoContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContable.add(this.jTextFieldPathArchivoImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleAsientoContable = new JButtonMe();
		this.jButtonGenerarImportacionDetalleAsientoContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleAsientoContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleAsientoContable.setToolTipText("Generar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContable.add(this.jButtonGenerarImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleAsientoContable = new JButtonMe();
		this.jButtonCerrarImportacionDetalleAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleAsientoContable.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContable.add(this.jButtonCerrarImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleAsientoContable = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleAsientoContable= new JScrollPane(jPanelImportacionDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleAsientoContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleAsientoContable);
		this.jInternalFrameImportacionDetalleAsientoContable.getContentPane().add(this.jScrollPanelImportacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleAsientoContable() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleAsientoContable = new JButtonMe();
		this.jButtonAbrirTotalesDetalleAsientoContable.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleAsientoContable,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleAsientoContable.setName("jPanelTotalesDetalleAsientoContable"); 
		
		this.jPanelTotalesDetalleAsientoContable.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleAsientoContable.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleAsientoContable.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleAsientoContable.setLayout(gridaBagLayoutTotalesDetalleAsientoContable);
		
		
		this.jInternalFrameTotalesDetalleAsientoContable= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleAsientoContable= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleAsientoContable.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleAsientoContable.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleAsientoContable.setResizable(true);
	    this.jInternalFrameTotalesDetalleAsientoContable.setClosable(true);
	    this.jInternalFrameTotalesDetalleAsientoContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleAsientoContable.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleAsientoContable.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleAsientoContable.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleAsientoContable.ipady =150;
		
		this.jPanelTotalesDetalleAsientoContable.add(jScrollPanelDatosDetalleAsientoContableTotales, this.gridBagConstraintsDetalleAsientoContable);//this.jTableDatosDetalleAsientoContableTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleAsientoContable = new JButtonMe();
		this.jButtonCerrarTotalesDetalleAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleAsientoContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleAsientoContable.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleAsientoContable.add(this.jButtonCerrarTotalesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleAsientoContable = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleAsientoContable= new JScrollPane(jPanelTotalesDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleAsientoContable.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleAsientoContable);
		this.jInternalFrameTotalesDetalleAsientoContable.getContentPane().add(this.jScrollPanelTotalesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleAsientoContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleAsientoContable = new JButtonMe();
			this.jButtonAbrirOrderByDetalleAsientoContable.setText("Orden");
			this.jButtonAbrirOrderByDetalleAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAsientoContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleAsientoContable";
			inputMap = this.jButtonAbrirOrderByDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleAsientoContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleAsientoContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleAsientoContable.setName("jPanelOrderByDetalleAsientoContable"); 
			
			this.jPanelOrderByDetalleAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleAsientoContable.setLayout(gridaBagLayoutOrderByDetalleAsientoContable);
			
			
			this.jTableDatosDetalleAsientoContableOrderBy = new JTableMe();        
			this.jTableDatosDetalleAsientoContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleAsientoContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleAsientoContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleAsientoContableOrderBy.setViewportView(this.jTableDatosDetalleAsientoContableOrderBy);
			this.jTableDatosDetalleAsientoContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleAsientoContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleAsientoContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleAsientoContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleAsientoContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleAsientoContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleAsientoContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleAsientoContable.setTitle("Orden");
			this.jInternalFrameOrderByDetalleAsientoContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleAsientoContable.setResizable(true);
			this.jInternalFrameOrderByDetalleAsientoContable.setClosable(true);
			this.jInternalFrameOrderByDetalleAsientoContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleAsientoContable.ipady =150;
				
			this.jPanelOrderByDetalleAsientoContable.add(jScrollPanelDatosDetalleAsientoContableOrderBy, this.gridBagConstraintsDetalleAsientoContable);//this.jTableDatosDetalleAsientoContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleAsientoContable = new JButtonMe();
			this.jButtonCerrarOrderByDetalleAsientoContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleAsientoContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleAsientoContable.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleAsientoContable.add(this.jButtonCerrarOrderByDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleAsientoContable = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleAsientoContable= new JScrollPane(jPanelOrderByDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleAsientoContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleAsientoContable);
			
			this.jInternalFrameOrderByDetalleAsientoContable.getContentPane().add(this.jScrollPanelOrderByDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
		
		} else {
			this.jButtonAbrirOrderByDetalleAsientoContable = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleasientocontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleAsientoContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleAsientoContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleAsientoContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleAsientoContable.getRowHeight();//DetalleAsientoContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.isSelected()) {
					iHeightTable=DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAsientoContable.isSelected()) {
					iHeightTable=DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleAsientoContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAsientoContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAsientoContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleAsientoContable!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleAsientoContable!=null && this.jInternalFrameOrderByDetalleAsientoContable.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleAsientoContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleAsientoContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleAsientoContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleAsientoContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleAsientoContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleAsientoContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleAsientoContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
	
	public void redimensionarTablaTotales() {
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleAsientoContable!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleAsientoContable.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleAsientoContable.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleasientocontableLogic.getDetalleAsientoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleasientocontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleAsientoContable> TraerDetalleAsientoContableBeans(List<DetalleAsientoContable> detalleasientocontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleAsientoContable detalleasientocontable:detalleasientocontables) {
					
				if(!(DetalleAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleasientocontable.setsDetalleGeneralEntityReporte(DetalleAsientoContableConstantesFunciones.getDetalleAsientoContableDescripcion(detalleasientocontable));
										
					detalleasientocontable.setcon_centro_costo_descripcion(DetalleAsientoContableConstantesFunciones.getcon_centro_costoDescripcion(detalleasientocontable));	
					
						
					
				} else  {
							
					//detalleasientocontable.setsDetalleGeneralEntityReporte(detalleasientocontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleasientocontablebeans.add(detalleasientocontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleasientocontables;
    }
	//PARA REPORTES FIN
}
