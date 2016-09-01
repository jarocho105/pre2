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
import com.bydan.erp.contabilidad.util.CuentaContableConstantesFunciones;

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
public class CuentaContableJInternalFrame extends CuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaContable;
	
	protected JMenuBar jmenuBarCuentaContable;
	
	protected JMenu jmenuCuentaContable;
	protected JMenu jmenuDatosCuentaContable;
	protected JMenu jmenuArchivoCuentaContable;
	protected JMenu jmenuAccionesCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContable;	
	protected GridBagConstraints gridBagConstraintsCuentaContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaContableDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaContable;	
	
	
	public CuentaContableBeanSwingJInternalFrameTree jInternalFrameTreeCuentaContable;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivelcuenta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected TipoFlujoEfectivoBeanSwingJInternalFrame tipoflujoefectivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoflujoefectivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public CuentaContableSessionBean cuentacontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelCuentaSessionBean nivelcuentaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaContable> cuentacontables;		
	public List<CuentaContable> cuentacontablesEliminados;	
	public List<CuentaContable> cuentacontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaContable;		
	protected JButton jButtonAbrirOrderByCuentaContable;
	
	
	//protected JPanel jPanelOrderByCuentaContable;
	//public JScrollPane jScrollPanelOrderByCuentaContable;	
	//protected JButton jButtonCerrarOrderByCuentaContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaContableLogic cuentacontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralCuentaContable;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaContable;
	//public JScrollPane jScrollPanelImportacionCuentaContable;
	
	
	
	protected JPanel jPanelAccionesCuentaContable;
	
    protected JPanel jPanelPaginacionCuentaContable;
    protected JPanel jPanelParametrosReportesCuentaContable;
	protected JPanel jPanelParametrosReportesAccionesCuentaContable;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralCuentaContable;
	protected Integer iXPanelCamposIniciogeneralCuentaContable=0;
	protected Integer iYPanelCamposIniciogeneralCuentaContable=0;

	protected JPanel jPanelCamposIniciotipoCuentaContable;
	protected Integer iXPanelCamposIniciotipoCuentaContable=0;
	protected Integer iYPanelCamposIniciotipoCuentaContable=0;

	protected JPanel jPanelCamposIniciocontableCuentaContable;
	protected Integer iXPanelCamposIniciocontableCuentaContable=0;
	protected Integer iYPanelCamposIniciocontableCuentaContable=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaContable;
	protected JPanel jPanelParametrosAuxiliar2CuentaContable;
	protected JPanel jPanelParametrosAuxiliar3CuentaContable;
	protected JPanel jPanelParametrosAuxiliar4CuentaContable;
	//protected JPanel jPanelParametrosAuxiliar5CuentaContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaContable;
	//protected JPanel jPanelImportacionCuentaContable;
	
	
	public JTable jTableDatosCuentaContable;
	
	
	
	//public JTable jTableDatosCuentaContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaContable;
	protected JButton jButtonDuplicarCuentaContable;
	protected JButton jButtonCopiarCuentaContable;
	protected JButton jButtonVerFormCuentaContable;
	protected JButton jButtonNuevoRelacionesCuentaContable;
	protected JButton jButtonModificarCuentaContable;
	
    protected JButton jButtonGuardarCambiosTablaCuentaContable;
	protected JButton jButtonCerrarCuentaContable;
	
	
	protected JButton jButtonRecargarInformacionCuentaContable;
	protected JButton jButtonProcesarInformacionCuentaContable;
	
	
	protected JButton jButtonAnterioresCuentaContable;
	protected JButton jButtonSiguientesCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosCuentaContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaContable;
	//protected JButton jButtonCerrarReporteDinamicoCuentaContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaContable;
	//protected JButton jButtonGenerarImportacionCuentaContable;
	//protected JButton jButtonCerrarImportacionCuentaContable;
	//protected JFileChooser jFileChooserImportacionCuentaContable;
	//protected File fileImportacionCuentaContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContable;
	protected JButton jButtonDuplicarToolBarCuentaContable;
	protected JButton jButtonNuevoRelacionesToolBarCuentaContable;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaContable;
	protected JButton jButtonCopiarToolBarCuentaContable;
	protected JButton jButtonVerFormToolBarCuentaContable;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContable;
	protected JButton jButtonCerrarToolBarCuentaContable;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaContable;
	protected JButton jButtonProcesarInformacionToolBarCuentaContable;
	protected JButton jButtonAnterioresToolBarCuentaContable;
	protected JButton jButtonSiguientesToolBarCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaContable;
	protected JButton jButtonAbrirOrderByToolBarCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContable;
	protected JMenuItem jMenuItemDuplicarCuentaContable;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaContable;
	protected JMenuItem jMenuItemCopiarCuentaContable;
	protected JMenuItem jMenuItemVerFormCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContable;
	protected JMenuItem jMenuItemCerrarCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContable;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaContable;
	protected JMenuItem jMenuItemProcesarInformacionCuentaContable;
	protected JMenuItem jMenuItemAnterioresCuentaContable;
	protected JMenuItem jMenuItemSiguientesCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContable;
	protected JMenuItem jMenuItemAbrirOrderByCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContable;
	
	
	//MENU
	
	protected JButton jButtonArbolCuentaContable;	
	
	protected JLabel jLabelAccionesCuentaContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaContable;
	protected JCheckBox jCheckBoxSeleccionadosCuentaContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaContable;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaContable;
	protected JTextField jTextFieldValorCampoGeneralCuentaContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaContable;
	//public JList<Reporte> jListColumnasSelectReporteCuentaContable;
	//public JScrollPane jScrollColumnasSelectReporteCuentaContable;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaContable;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaContable;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaContable;
	
		
	//public JLabel jLabelArchivoImportacionCuentaContable;	
	//public JLabel jLabelPathArchivoImportacionCuentaContable;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaContable;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaContable;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaContable;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaContable;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaContable;
	public JPanel jPanelBusquedaPorCodigoCuentaContable;
	public JButton jButtonBusquedaPorCodigoCuentaContable;
	public JPanel jPanelBusquedaPorNombreCuentaContable;
	public JButton jButtonBusquedaPorNombreCuentaContable;
	public JPanel jPanelFK_IdCentroCostoCuentaContable;
	public JButton jButtonFK_IdCentroCostoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableCuentaContable;
	public JButton jButtonFK_IdCuentaContableCuentaContable;
	public JPanel jPanelFK_IdModuloCuentaContable;
	public JButton jButtonFK_IdModuloCuentaContable;
	public JPanel jPanelFK_IdNivelCuentaCuentaContable;
	public JButton jButtonFK_IdNivelCuentaCuentaContable;
	public JPanel jPanelFK_IdTipoFlujoEfectivoCuentaContable;
	public JButton jButtonFK_IdTipoFlujoEfectivoCuentaContable;
	public JPanel jPanelFK_IdTipoIntervaloCuentaContable;
	public JButton jButtonFK_IdTipoIntervaloCuentaContable;
	
	public JPanel jPanelcodigoBusquedaPorCodigoCuentaContable;
	public JLabel jLabelcodigoBusquedaPorCodigoCuentaContable;
	public JTextField jTextFieldcodigoBusquedaPorCodigoCuentaContable;
	public JButton jButtoncodigoBusquedaPorCodigoCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreCuentaContable;
	public JLabel jLabelnombreBusquedaPorNombreCuentaContable;
	public JTextArea jTextAreanombreBusquedaPorNombreCuentaContable;
	public JButton jButtonnombreBusquedaPorNombreCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCuentaContable;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentaContable= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCuentaContableArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaContable;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContableArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable;
	
	public JPanel jPanelid_moduloFK_IdModuloCuentaContable;
	public JLabel jLabelid_moduloFK_IdModuloCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloCuentaContable;
	public JButton jButtonid_moduloFK_IdModuloCuentaContable= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_nivel_cuentaFK_IdNivelCuentaCuentaContable;
	public JLabel jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable;
	public JButton jButtonid_nivel_cuentaFK_IdNivelCuentaCuentaContable= new JButtonMe();
	public JButton jButtonid_nivel_cuentaFK_IdNivelCuentaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_nivel_cuentaFK_IdNivelCuentaCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable;
	public JLabel jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable;
	public JButton jButtonid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable= new JButtonMe();
	public JButton jButtonid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable;
	public JLabel jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable;
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloCuentaContable= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloCuentaContableBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public CuentaContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaContable)	{
		this.jButtonRecargarInformacionCuentaContable = jButtonRecargarInformacionCuentaContable;
	}
	
	public JButton getjButtonProcesarInformacionCuentaContable() {
		return this.jButtonProcesarInformacionCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContable)	{
		this.jButtonProcesarInformacionCuentaContable = jButtonProcesarInformacionCuentaContable;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaContable() {
		return this.jButtonRecargarInformacionCuentaContable;
	}
	
	public JButton getjButtonArbolCuentaContable() {
		return this.jButtonArbolCuentaContable;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCuentaContable)	{
		this.jButtonArbolCuentaContable = jButtonArbolCuentaContable;
	}
	
	public List<CuentaContable> getcuentacontables() {
		return this.cuentacontables;
	}

	public void setcuentacontables(List<CuentaContable> cuentacontables) {
		this.cuentacontables = cuentacontables;
	}
	
	public List<CuentaContable> getcuentacontablesAux() {
		return this.cuentacontablesAux;
	}

	public void setcuentacontablesAux(List<CuentaContable> cuentacontablesAux) {
		this.cuentacontablesAux = cuentacontablesAux;
	}
	
	public List<CuentaContable> getcuentacontablesEliminados() {
		return this.cuentacontablesEliminados;
	}

	public void setCuentaContablesEliminados(List<CuentaContable> cuentacontablesEliminados) {
		this.cuentacontablesEliminados = cuentacontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaContable() {
		return jComboBoxTiposSeleccionarCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaContable(
			JComboBox jComboBoxTiposSeleccionarCuentaContable) {
		this.jComboBoxTiposSeleccionarCuentaContable = jComboBoxTiposSeleccionarCuentaContable;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaContable() {
		return jTextFieldValorCampoGeneralCuentaContable;
	}

	public void setjTextFieldValorCampoGeneralCuentaContable(
			JTextField jTextFieldValorCampoGeneralCuentaContable) {
		this.jTextFieldValorCampoGeneralCuentaContable = jTextFieldValorCampoGeneralCuentaContable;
	}

	public void setBorderResaltarValorCampoGeneralCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaContable() {
		return this.jCheckBoxSeleccionarTodosCuentaContable;
	}

	public void setjCheckBoxSeleccionarTodosCuentaContable(
			JCheckBox jCheckBoxSeleccionarTodosCuentaContable) {
		this.jCheckBoxSeleccionarTodosCuentaContable = jCheckBoxSeleccionarTodosCuentaContable;
	}

	public void setBorderResaltarSeleccionarTodosCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaContable() {
		return this.jCheckBoxSeleccionadosCuentaContable;
	}

	public void setjCheckBoxSeleccionadosCuentaContable(
			JCheckBox jCheckBoxSeleccionadosCuentaContable) {
		this.jCheckBoxSeleccionadosCuentaContable = jCheckBoxSeleccionadosCuentaContable;
	}
	
	public void setBorderResaltarSeleccionadosCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaContable() {
		return this.jComboBoxTiposArchivosReportesCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaContable(
			JComboBox jComboBoxTiposArchivosReportesCuentaContable) {
		this.jComboBoxTiposArchivosReportesCuentaContable = jComboBoxTiposArchivosReportesCuentaContable;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaContable() {
		return this.jComboBoxTiposReportesCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaContable(
			JComboBox jComboBoxTiposReportesCuentaContable) {
		this.jComboBoxTiposReportesCuentaContable = jComboBoxTiposReportesCuentaContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaContable() {
	//	return jComboBoxTiposReportesDinamicoCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaContable(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaContable) {
	//	this.jComboBoxTiposReportesDinamicoCuentaContable = jComboBoxTiposReportesDinamicoCuentaContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaContable = jComboBoxTiposArchivosReportesDinamicoCuentaContable;
	//}
	
	public void setBorderResaltarTiposReportesCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaContable() {
		return this.jComboBoxTiposGraficosReportesCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaContable(
			JComboBox jComboBoxTiposGraficosReportesCuentaContable) {
		this.jComboBoxTiposGraficosReportesCuentaContable = jComboBoxTiposGraficosReportesCuentaContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaContable() {
		return this.jComboBoxTiposPaginacionCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaContable(
			JComboBox jComboBoxTiposPaginacionCuentaContable) {
		this.jComboBoxTiposPaginacionCuentaContable = jComboBoxTiposPaginacionCuentaContable;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaContable() {
		return this.jComboBoxTiposRelacionesCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContable() {
		return this.jComboBoxTiposAccionesCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContable(
			JComboBox jComboBoxTiposRelacionesCuentaContable) {
		this.jComboBoxTiposRelacionesCuentaContable = jComboBoxTiposRelacionesCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContable(
			JComboBox jComboBoxTiposAccionesCuentaContable) {
		this.jComboBoxTiposAccionesCuentaContable = jComboBoxTiposAccionesCuentaContable;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaContable() {
	//	return jCheckBoxConGraficoDinamicoCuentaContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaContable) {
	//	this.jCheckBoxConGraficoDinamicoCuentaContable = jCheckBoxConGraficoDinamicoCuentaContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaContable .setBorder(borderResaltar);		
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
		this.cuentacontableSessionBean=new CuentaContableSessionBean();
		
		this.cuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"nuevo","nuevo","Nuevo"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"duplicar","duplicar","Duplicar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"copiar","copiar","Copiar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"ver_form","ver_form","Ver"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"recargar","recargar","Recargar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaContable,this.jTtoolBarCuentaContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaContable,this.jTtoolBarCuentaContable,
							"cerrar","cerrar","Salir"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaContable;
			
				this.jButtonProcesarInformacionToolBarCuentaContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaContable;
				
		//protected JButton jButtonModificarToolBarCuentaContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaContable=new JMenuMe("General");
		this.jmenuArchivoCuentaContable=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaContable=new JMenuMe("Acciones");
		this.jmenuDatosCuentaContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaContable.add(this.jMenuItemCerrarCuentaContable);
			
			this.jmenuAccionesCuentaContable.add(this.jMenuItemNuevoCuentaContable);
			this.jmenuAccionesCuentaContable.add(this.jMenuItemNuevoGuardarCambiosCuentaContable);
			this.jmenuAccionesCuentaContable.add(this.jMenuItemNuevoRelacionesCuentaContable);
			this.jmenuAccionesCuentaContable.add(this.jMenuItemGuardarCambiosTablaCuentaContable);		
			this.jmenuAccionesCuentaContable.add(this.jMenuItemDuplicarCuentaContable);		
			this.jmenuAccionesCuentaContable.add(this.jMenuItemCopiarCuentaContable);		
			this.jmenuAccionesCuentaContable.add(this.jMenuItemVerFormCuentaContable);		
			
			this.jmenuDatosCuentaContable.add(this.jMenuItemRecargarInformacionCuentaContable);				
			this.jmenuDatosCuentaContable.add(this.jMenuItemAnterioresCuentaContable);				
			this.jmenuDatosCuentaContable.add(this.jMenuItemSiguientesCuentaContable);				
			this.jmenuDatosCuentaContable.add(this.jMenuItemAbrirOrderByCuentaContable);				
			this.jmenuDatosCuentaContable.add(this.jMenuItemMostrarOcultarCuentaContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaContable.add(this.jMenuItemGuardarCambiosCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaContable.add(this.jmenuArchivoCuentaContable);		
			this.jmenuBarCuentaContable.add(this.jmenuAccionesCuentaContable);		
			this.jmenuBarCuentaContable.add(this.jmenuDatosCuentaContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoCuentaContable.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoCuentaContable= new JButtonMe();
		this.jButtonBusquedaPorCodigoCuentaContable.setText("Buscar");
		this.jButtonBusquedaPorCodigoCuentaContable.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoCuentaContable,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoCuentaContable = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoCuentaContable.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoCuentaContable.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoCuentaContable= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCuentaContable.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCuentaContable= new JButtonMe();
		this.jButtonBusquedaPorNombreCuentaContable.setText("Buscar");
		this.jButtonBusquedaPorNombreCuentaContable.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCuentaContable,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCuentaContable = new JLabelMe();
		jLabelnombreBusquedaPorNombreCuentaContable.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCuentaContable.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCuentaContable= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCuentaContable.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCentroCostoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCentroCostoCuentaContable.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCuentaContable,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable.setFocusable(false);

		this.jPanelFK_IdCuentaContableCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaContable.setToolTipText("Buscar Por Cuenta Contable Padre ");
		this.jButtonFK_IdCuentaContableCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaContable.setToolTipText("Buscar Por Cuenta Contable Padre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaContable,"buscar_button","Buscar Por Cuenta Contable Padre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable.setText("Cuenta Contable Padre :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable.setToolTipText("Cuenta Contable Padre");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable.setFocusable(false);

		this.jPanelFK_IdModuloCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloCuentaContable.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloCuentaContable= new JButtonMe();
		this.jButtonFK_IdModuloCuentaContable.setText("Buscar");
		this.jButtonFK_IdModuloCuentaContable.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloCuentaContable,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloCuentaContable = new JLabelMe();
		jLabelid_moduloFK_IdModuloCuentaContable.setText("Modulo :");
		jLabelid_moduloFK_IdModuloCuentaContable.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloCuentaContable= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNivelCuentaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNivelCuentaCuentaContable.setToolTipText("Buscar Por Nivel Cuenta ");
		this.jButtonFK_IdNivelCuentaCuentaContable= new JButtonMe();
		this.jButtonFK_IdNivelCuentaCuentaContable.setText("Buscar");
		this.jButtonFK_IdNivelCuentaCuentaContable.setToolTipText("Buscar Por Nivel Cuenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNivelCuentaCuentaContable,"buscar_button","Buscar Por Nivel Cuenta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNivelCuentaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable = new JLabelMe();
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setText("Nivel Cuenta :");
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setToolTipText("Nivel Cuenta");
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable= new JComboBoxMe();
		jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFlujoEfectivoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFlujoEfectivoCuentaContable.setToolTipText("Buscar Por T Flujo Efectivo ");
		this.jButtonFK_IdTipoFlujoEfectivoCuentaContable= new JButtonMe();
		this.jButtonFK_IdTipoFlujoEfectivoCuentaContable.setText("Buscar");
		this.jButtonFK_IdTipoFlujoEfectivoCuentaContable.setToolTipText("Buscar Por T Flujo Efectivo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFlujoEfectivoCuentaContable,"buscar_button","Buscar Por T Flujo Efectivo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFlujoEfectivoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable = new JLabelMe();
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setText("T Flujo Efectivo :");
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setToolTipText("T Flujo Efectivo");
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable= new JComboBoxMe();
		jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIntervaloCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIntervaloCuentaContable.setToolTipText("Buscar Por Tipo Intervalo ");
		this.jButtonFK_IdTipoIntervaloCuentaContable= new JButtonMe();
		this.jButtonFK_IdTipoIntervaloCuentaContable.setText("Buscar");
		this.jButtonFK_IdTipoIntervaloCuentaContable.setToolTipText("Buscar Por Tipo Intervalo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIntervaloCuentaContable,"buscar_button","Buscar Por Tipo Intervalo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIntervaloCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable = new JLabelMe();
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setText("Tipo Intervalo :");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setToolTipText("Tipo Intervalo");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable= new JComboBoxMe();
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaContable=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaContable = new CuentaContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Contable DATOS");
			this.jInternalFrameDetalleFormCuentaContable = new CuentaContableDetalleFormJInternalFrame(jDesktopPane,this.cuentacontableSessionBean.getConGuardarRelaciones(),this.cuentacontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaContable = null;//new CuentaContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContable= new GridBagLayout();
		
		
		this.jTableDatosCuentaContable = new JTableMe();      
		
		String sToolTipCuentaContable="";
		sToolTipCuentaContable=CuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContable+="(Contabilidad.CuentaContable)";
		}
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaContable.setToolTipText(sToolTipCuentaContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaContable);
		this.jTableDatosCuentaContable.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaContable.setRowSelectionAllowed(true);
		this.jTableDatosCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaContable = new JButtonMe();
		this.jButtonDuplicarCuentaContable = new JButtonMe();
		this.jButtonCopiarCuentaContable = new JButtonMe();
		this.jButtonVerFormCuentaContable = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaContable = new JButtonMe();
		this.jButtonCerrarCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable";
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentaContable.setName("jPanelCamposFingeneralCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
		this.jPanelCamposIniciotipoCuentaContable.setName("jPanelCamposFintipoCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableCuentaContable.setName("jPanelCamposFincontableCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCuentaContable=new ReporteDinamicoJInternalFrame(CuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaContable=new ImportacionJInternalFrame(CuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaContable = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaContable.setText("Orden");
		this.jButtonAbrirOrderByCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContable,false,this);
			
			//this.cargarOrderByCuentaContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContable,true,this);
			
			//this.cargarOrderByCuentaContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaContable.setMinimumSize(new Dimension(400,50));//2330
		this.jTableDatosCuentaContable.setMaximumSize(new Dimension(400,50));//2330
		this.jTableDatosCuentaContable.setPreferredSize(new Dimension(400,50));//2330
		
		this.jScrollPanelDatosCuentaContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaContable.setText("Nuevo");
		this.jButtonDuplicarCuentaContable.setText("Duplicar");
		this.jButtonCopiarCuentaContable.setText("Copiar");
		this.jButtonVerFormCuentaContable.setText("Ver");
		this.jButtonNuevoRelacionesCuentaContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaContable.setText("Guardar");
		this.jButtonCerrarCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContable,"nuevo_button","Nuevo",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaContable,"duplicar_button","Duplicar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaContable,"copiar_button","Copiar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaContable,"ver_form","Ver",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaContable,"nuevorelaciones_button","Nuevo Rel",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContable,"guardarcambiostabla_button","Guardar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContable,"cerrar_button","Salir",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaContable.setToolTipText("Nuevo"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaContable.setToolTipText("Duplicar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaContable.setToolTipText("Copiar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaContable.setToolTipText("Ver"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaContable.setToolTipText("Nuevo Rel"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaContable.setToolTipText("Guardar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContable.setToolTipText("Salir"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContable";
		inputMap = this.jButtonNuevoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaContable";
		inputMap = this.jButtonDuplicarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaContable"));
		
		//COPIAR
		sMapKey = "CopiarCuentaContable";
		inputMap = this.jButtonCopiarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaContable"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaContable";
		inputMap = this.jButtonVerFormCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaContable";
		inputMap = this.jButtonNuevoRelacionesCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaContable";
		inputMap = this.jButtonModificarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaContable";
		inputMap = this.jButtonCerrarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaContable.setName("jPanelParametrosReportesCuentaContable"); 
		
		this.jPanelParametrosReportesAccionesCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaContable.setName("jPanelParametrosReportesAccionesCuentaContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaContable = new JButtonMe();
		this.jButtonRecargarInformacionCuentaContable.setText("Recargar");
		this.jButtonRecargarInformacionCuentaContable.setToolTipText("Recargar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaContable = new JButtonMe();
		this.jButtonProcesarInformacionCuentaContable.setText("Procesar");
		this.jButtonProcesarInformacionCuentaContable.setToolTipText("Procesar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaContable.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolCuentaContable = new JButtonMe();
		this.jButtonArbolCuentaContable.setText("Arbol");		
		this.jButtonArbolCuentaContable.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContable.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaContable.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaContable.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaContable = new JLabelMe();
		
		this.jLabelAccionesCuentaContable.setText("Acciones");		
		this.jLabelAccionesCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaContable = new JButtonMe();
		//this.jButtonAnterioresCuentaContable.setText("<<");
        this.jButtonAnterioresCuentaContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaContable = new JButtonMe();
		//this.jButtonSiguientesCuentaContable.setText(">>");
        this.jButtonSiguientesCuentaContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaContable,"nuevoguardarcambios_button","Nue",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaContable";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaContable";
		inputMap = this.jButtonRecargarInformacionCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaContable";
		inputMap = this.jButtonSiguientesCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaContable";
		inputMap = this.jButtonAnterioresCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaContable.setMinimumSize(new Dimension(this.getWidth(),CuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContable.setMaximumSize(new Dimension(this.getWidth(),CuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContable.setPreferredSize(new Dimension(this.getWidth(),CuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaContable = new GridBagLayout();

			this.jPanelPaginacionCuentaContable.setLayout(gridaBagLayoutPaginacionCuentaContable);						
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 0;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaContable.add(this.jButtonAnterioresCuentaContable, this.gridBagConstraintsCuentaContable);
					
						
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContable.gridy = 0;
			
			this.jPanelPaginacionCuentaContable.add(this.jButtonNuevoGuardarCambiosCuentaContable, this.gridBagConstraintsCuentaContable);
						
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContable.gridy = 0;
			this.jPanelPaginacionCuentaContable.add(this.jButtonSiguientesCuentaContable, this.gridBagConstraintsCuentaContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 1;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContable.add(this.jButtonNuevoCuentaContable, this.gridBagConstraintsCuentaContable);
						
			
			
			if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaContable.gridy = 1;
				this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaContable.add(this.jButtonGuardarCambiosTablaCuentaContable, this.gridBagConstraintsCuentaContable);
			}
			
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 1;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContable.add(this.jButtonDuplicarCuentaContable, this.gridBagConstraintsCuentaContable);
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 1;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContable.add(this.jButtonCopiarCuentaContable, this.gridBagConstraintsCuentaContable);
		
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 1;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContable.add(this.jButtonVerFormCuentaContable, this.gridBagConstraintsCuentaContable);
		
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 1;
			this.gridBagConstraintsCuentaContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaContable.add(this.jButtonCerrarCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		
		this.jButtonRecargarInformacionCuentaContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolCuentaContable.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCuentaContable.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCuentaContable.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaContable.setLayout(gridaBagParametrosReportesCuentaContable);
			this.jPanelParametrosReportesAccionesCuentaContable.setLayout(gridaBagParametrosReportesAccionesCuentaContable);
			
			
			this.jPanelParametrosAuxiliar1CuentaContable.setLayout(gridaBagParametrosAuxiliar1CuentaContable);
			this.jPanelParametrosAuxiliar2CuentaContable.setLayout(gridaBagParametrosAuxiliar2CuentaContable);
			this.jPanelParametrosAuxiliar3CuentaContable.setLayout(gridaBagParametrosAuxiliar3CuentaContable);
			this.jPanelParametrosAuxiliar4CuentaContable.setLayout(gridaBagParametrosAuxiliar4CuentaContable);
			//this.jPanelParametrosAuxiliar5CuentaContable.setLayout(gridaBagParametrosAuxiliar2CuentaContable);			
			
			
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContable.add(this.jButtonRecargarInformacionCuentaContable, this.gridBagConstraintsCuentaContable);			
			
			

			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContable.add(this.jButtonArbolCuentaContable, this.gridBagConstraintsCuentaContable);
			
			
			
			//PAGINACION
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContable.add(this.jComboBoxTiposPaginacionCuentaContable, this.gridBagConstraintsCuentaContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContable.add(this.jCheckBoxConAltoMaximoTablaCuentaContable, this.gridBagConstraintsCuentaContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContable.add(this.jComboBoxTiposArchivosReportesCuentaContable, this.gridBagConstraintsCuentaContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContable.add(this.jPanelParametrosAuxiliar1CuentaContable, this.gridBagConstraintsCuentaContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaContable.add(this.jComboBoxTiposReportesCuentaContable, this.gridBagConstraintsCuentaContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContable.add(this.jPanelParametrosAuxiliar4CuentaContable, this.gridBagConstraintsCuentaContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContable.add(this.jComboBoxTiposReportesCuentaContable, this.gridBagConstraintsCuentaContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContable.add(this.jCheckBoxGenerarReporteCuentaContable, this.gridBagConstraintsCuentaContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContable.add(this.jPanelParametrosAuxiliar2CuentaContable, this.gridBagConstraintsCuentaContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContable.add(this.jLabelAccionesCuentaContable, this.gridBagConstraintsCuentaContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaContable.add(this.jButtonAbrirOrderByCuentaContable, this.gridBagConstraintsCuentaContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContable.add(this.jComboBoxTiposSeleccionarCuentaContable, this.gridBagConstraintsCuentaContable);			
			
			
			/*
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContable.add(this.jCheckBoxSeleccionarTodosCuentaContable, this.gridBagConstraintsCuentaContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContable.add(this.jCheckBoxSeleccionarTodosCuentaContable, this.gridBagConstraintsCuentaContable);															
				
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContable.add(this.jCheckBoxSeleccionadosCuentaContable, this.gridBagConstraintsCuentaContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContable.add(this.jPanelParametrosAuxiliar3CuentaContable, this.gridBagConstraintsCuentaContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContable.add(this.jComboBoxTiposAccionesCuentaContable, this.gridBagConstraintsCuentaContable);
	
				
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContable.add(this.jTextFieldValorCampoGeneralCuentaContable, this.gridBagConstraintsCuentaContable);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentaContable.setLayout(gridaBagLayoutCamposIniciogeneralCuentaContable);

		GridBagLayout gridaBagLayoutCamposIniciotipoCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciotipoCuentaContable.setLayout(gridaBagLayoutCamposIniciotipoCuentaContable);

		GridBagLayout gridaBagLayoutCamposIniciocontableCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciocontableCuentaContable.setLayout(gridaBagLayoutCamposIniciocontableCuentaContable);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaContable = new GridBagLayout();

			this.jScrollPanelDatosCuentaContable.setLayout(gridaBagLayoutDatosCuentaContable);
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = 0;
			this.gridBagConstraintsCuentaContable.gridx = 0;
			
			this.jScrollPanelDatosCuentaContable.add(this.jTableDatosCuentaContable, this.gridBagConstraintsCuentaContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaContable.setViewportView(this.jTableDatosCuentaContable);
		this.jTableDatosCuentaContable.setFillsViewportHeight(true);
		this.jTableDatosCuentaContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaContable= new GridBagLayout();
		this.jPanelAccionesCuentaContable.setLayout(gridaBagLayoutAccionesCuentaContable);
		
		
		/*	
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 0;
			
		this.jPanelAccionesCuentaContable.add(this.jButtonNuevoCuentaContable, this.gridBagConstraintsCuentaContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoCuentaContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoCuentaContable.setLayout(gridaBagLayoutBusquedaPorCodigoCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelBusquedaPorCodigoCuentaContable.add(jLabelcodigoBusquedaPorCodigoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelBusquedaPorCodigoCuentaContable.add(jTextFieldcodigoBusquedaPorCodigoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelBusquedaPorCodigoCuentaContable.add(jButtonBusquedaPorCodigoCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCuentaContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCuentaContable.setLayout(gridaBagLayoutBusquedaPorNombreCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelBusquedaPorNombreCuentaContable.add(jLabelnombreBusquedaPorNombreCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelBusquedaPorNombreCuentaContable.add(jTextAreanombreBusquedaPorNombreCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelBusquedaPorNombreCuentaContable.add(jButtonBusquedaPorNombreCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCuentaContable.setLayout(gridaBagLayoutFK_IdCentroCostoCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdCentroCostoCuentaContable.add(jLabelid_centro_costoFK_IdCentroCostoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdCentroCostoCuentaContable.add(jComboBoxid_centro_costoFK_IdCentroCostoCuentaContable, gridBagConstraintsCuentaContable);


		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdCentroCostoCuentaContable.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdCentroCostoCuentaContable.add(jButtonFK_IdCentroCostoCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContable.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableCuentaContable.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContable, gridBagConstraintsCuentaContable);


		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContable.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableCuentaContable.add(jButtonFK_IdCuentaContableCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("4.-Por Cuenta Contable Padre ", jPanelFK_IdCuentaContableCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdModuloCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdModuloCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloCuentaContable.setLayout(gridaBagLayoutFK_IdModuloCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdModuloCuentaContable.add(jLabelid_moduloFK_IdModuloCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdModuloCuentaContable.add(jComboBoxid_moduloFK_IdModuloCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdModuloCuentaContable.add(jButtonFK_IdModuloCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("5.-Por Modulo ", jPanelFK_IdModuloCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdNivelCuentaCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdNivelCuentaCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNivelCuentaCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNivelCuentaCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNivelCuentaCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNivelCuentaCuentaContable.setLayout(gridaBagLayoutFK_IdNivelCuentaCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdNivelCuentaCuentaContable.add(jLabelid_nivel_cuentaFK_IdNivelCuentaCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdNivelCuentaCuentaContable.add(jComboBoxid_nivel_cuentaFK_IdNivelCuentaCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdNivelCuentaCuentaContable.add(jButtonFK_IdNivelCuentaCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("6.-Por Nivel Cuenta ", jPanelFK_IdNivelCuentaCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFlujoEfectivoCuentaContable.setLayout(gridaBagLayoutFK_IdTipoFlujoEfectivoCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdTipoFlujoEfectivoCuentaContable.add(jLabelid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdTipoFlujoEfectivoCuentaContable.add(jComboBoxid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivoCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdTipoFlujoEfectivoCuentaContable.add(jButtonFK_IdTipoFlujoEfectivoCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("7.-Por T Flujo Efectivo ", jPanelFK_IdTipoFlujoEfectivoCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoIntervaloCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIntervaloCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIntervaloCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIntervaloCuentaContable.setLayout(gridaBagLayoutFK_IdTipoIntervaloCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 0;
		jPanelFK_IdTipoIntervaloCuentaContable.add(jLabelid_tipo_intervaloFK_IdTipoIntervaloCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 0;
		gridBagConstraintsCuentaContable.gridx = 1;
		jPanelFK_IdTipoIntervaloCuentaContable.add(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloCuentaContable, gridBagConstraintsCuentaContable);

		gridBagConstraintsCuentaContable = new GridBagConstraints();
		gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContable.gridy = 1;
		gridBagConstraintsCuentaContable.gridx =1;
		jPanelFK_IdTipoIntervaloCuentaContable.add(jButtonFK_IdTipoIntervaloCuentaContable, gridBagConstraintsCuentaContable);

		jTabbedPaneBusquedasCuentaContable.addTab("8.-Por Tipo Intervalo ", jPanelFK_IdTipoIntervaloCuentaContable);
		jTabbedPaneBusquedasCuentaContable.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContable.gridx = 0;		
			//this.gridBagConstraintsCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaContable, this.gridBagConstraintsCuentaContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaContable.gridx = 0;		
		//this.gridBagConstraintsCuentaContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContable.gridx = 0;		
			this.gridBagConstraintsCuentaContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaContable, this.gridBagConstraintsCuentaContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaContable, this.gridBagConstraintsCuentaContable);								
		
		
		/*
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaContable, this.gridBagConstraintsCuentaContable);
		*/		
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContable.gridx =0;
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContable, this.gridBagConstraintsCuentaContable);
				
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaContable, this.gridBagConstraintsCuentaContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCuentaContable = new CuentaContableBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCuentaContable.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCuentaContable.setTitle("Cuenta Contable ARBOL");
		this.jInternalFrameTreeCuentaContable.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCuentaContable.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCuentaContable.setResizable(true);
	    this.jInternalFrameTreeCuentaContable.setClosable(true);
	    this.jInternalFrameTreeCuentaContable.setMaximizable(true);
			
			
		if(CuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContable = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaContable.setLayout(gridaBagLayoutBusquedasParametrosCuentaContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContable, this.gridBagConstraintsCuentaContable);
			
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContable, this.gridBagConstraintsCuentaContable);
		
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContable, this.gridBagConstraintsCuentaContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaContable.setName("jPanelReporteDinamicoCuentaContable"); 
		
		this.jPanelReporteDinamicoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaContable.setLayout(gridaBagLayoutReporteDinamicoCuentaContable);
		
		
		this.jInternalFrameReporteDinamicoCuentaContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaContable = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaContable.add(this.jLabelColumnasSelectReporteCuentaContable, this.gridBagConstraintsCuentaContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaContable = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaContable=new JScrollPane(this.jListColumnasSelectReporteCuentaContable);
			
			this.jScrollColumnasSelectReporteCuentaContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaContable.add(this.jListColumnasSelectReporteCuentaContable, this.gridBagConstraintsCuentaContable);
		this.jPanelReporteDinamicoCuentaContable.add(this.jScrollColumnasSelectReporteCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaContable=new JScrollPane(this.jListRelacionesSelectReporteCuentaContable);
			
			this.jScrollRelacionesSelectReporteCuentaContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContable.add(this.jLabelGenerarExcelReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaContable.setToolTipText("Generar EXCEL"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaContable.add(this.jButtonGenerarExcelReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContable.add(this.jComboBoxTiposReportesDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContable.add(this.jLabelTiposArchivoReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContable.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaContable.setToolTipText("Generar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContable.add(this.jButtonGenerarReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaContable.setToolTipText("Cancelar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContable.add(this.jButtonCerrarReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaContable= new JScrollPane(jPanelReporteDinamicoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaContable);
		this.jInternalFrameReporteDinamicoCuentaContable.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaContable, this.gridBagConstraintsCuentaContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaContable.setName("jPanelImportacionCuentaContable"); 
		
		this.jPanelImportacionCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaContable.setLayout(gridaBagLayoutImportacionCuentaContable);
		
		
		this.jInternalFrameImportacionCuentaContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionCuentaContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionCuentaContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaContable = new JLabelMe();

		this.jLabelArchivoImportacionCuentaContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContable.add(this.jLabelArchivoImportacionCuentaContable, this.gridBagConstraintsCuentaContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaContable = new JFileChooser();		
		this.jFileChooserImportacionCuentaContable.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaContable = new JButtonMe();
		this.jButtonAbrirImportacionCuentaContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaContable.setToolTipText("Generar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContable.add(this.jButtonAbrirImportacionCuentaContable, this.gridBagConstraintsCuentaContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaContable = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContable.add(this.jLabelPathArchivoImportacionCuentaContable, this.gridBagConstraintsCuentaContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContable.add(this.jTextFieldPathArchivoImportacionCuentaContable, this.gridBagConstraintsCuentaContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaContable = new JButtonMe();
		this.jButtonGenerarImportacionCuentaContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaContable.setToolTipText("Generar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContable.add(this.jButtonGenerarImportacionCuentaContable, this.gridBagConstraintsCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaContable = new JButtonMe();
		this.jButtonCerrarImportacionCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaContable.setToolTipText("Cancelar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContable.add(this.jButtonCerrarImportacionCuentaContable, this.gridBagConstraintsCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaContable = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaContable= new JScrollPane(jPanelImportacionCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaContable.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaContable);
		this.jInternalFrameImportacionCuentaContable.getContentPane().add(this.jScrollPanelImportacionCuentaContable, this.gridBagConstraintsCuentaContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaContable = new JButtonMe();
			this.jButtonAbrirOrderByCuentaContable.setText("Orden");
			this.jButtonAbrirOrderByCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaContable";
			inputMap = this.jButtonAbrirOrderByCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaContable.setName("jPanelOrderByCuentaContable"); 
			
			this.jPanelOrderByCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaContable.setLayout(gridaBagLayoutOrderByCuentaContable);
			
			
			this.jTableDatosCuentaContableOrderBy = new JTableMe();        
			this.jTableDatosCuentaContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaContableOrderBy.setViewportView(this.jTableDatosCuentaContableOrderBy);
			this.jTableDatosCuentaContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaContable.setTitle("Orden");
			this.jInternalFrameOrderByCuentaContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaContable.setResizable(true);
			this.jInternalFrameOrderByCuentaContable.setClosable(true);
			this.jInternalFrameOrderByCuentaContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaContable.ipady =150;
				
			this.jPanelOrderByCuentaContable.add(jScrollPanelDatosCuentaContableOrderBy, this.gridBagConstraintsCuentaContable);//this.jTableDatosCuentaContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaContable = new JButtonMe();
			this.jButtonCerrarOrderByCuentaContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaContable.setToolTipText("Cancelar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaContable.add(this.jButtonCerrarOrderByCuentaContable, this.gridBagConstraintsCuentaContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaContable = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaContable= new JScrollPane(jPanelOrderByCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaContable);
			
			this.jInternalFrameOrderByCuentaContable.getContentPane().add(this.jScrollPanelOrderByCuentaContable, this.gridBagConstraintsCuentaContable);			
		
		} else {
			this.jButtonAbrirOrderByCuentaContable = new JButtonMe();
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
		iWidthTableCalculado+=2330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentacontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaContable.getRowHeight();//CuentaContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContable.isSelected()) {
					iHeightTable=CuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContable.isSelected()) {
					iHeightTable=CuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaContable!=null && this.jInternalFrameOrderByCuentaContable.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentacontableLogic.getCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaContable> TraerCuentaContableBeans(List<CuentaContable> cuentacontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaContable cuentacontable:cuentacontables) {
					
				if(!(CuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentacontable.setsDetalleGeneralEntityReporte(CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontable));
										
					cuentacontable.setes_movimiento_descripcion(CuentaContableConstantesFunciones.getes_movimientoDescripcion(cuentacontable));cuentacontable.setes_centro_costo_descripcion(CuentaContableConstantesFunciones.getes_centro_costoDescripcion(cuentacontable));cuentacontable.setes_centro_actividad_descripcion(CuentaContableConstantesFunciones.getes_centro_actividadDescripcion(cuentacontable));cuentacontable.setes_activo_descripcion(CuentaContableConstantesFunciones.getes_activoDescripcion(cuentacontable));cuentacontable.setes_relacion_descripcion(CuentaContableConstantesFunciones.getes_relacionDescripcion(cuentacontable));cuentacontable.setes_para_f52_descripcion(CuentaContableConstantesFunciones.getes_para_f52Descripcion(cuentacontable));	
					
						
					
				} else  {
							
					//cuentacontable.setsDetalleGeneralEntityReporte(cuentacontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentacontablebeans.add(cuentacontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentacontables;
    }
	//PARA REPORTES FIN
}
