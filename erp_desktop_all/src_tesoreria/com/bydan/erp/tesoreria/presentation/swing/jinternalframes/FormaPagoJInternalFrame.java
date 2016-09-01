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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.FormaPagoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class FormaPagoJInternalFrame extends FormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormaPago;
	
	protected JMenuBar jmenuBarFormaPago;
	
	protected JMenu jmenuFormaPago;
	protected JMenu jmenuDatosFormaPago;
	protected JMenu jmenuArchivoFormaPago;
	protected JMenu jmenuAccionesFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPago;	
	protected GridBagConstraints gridBagConstraintsFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablereteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablerete="";
	
	public FormaPagoSessionBean formapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablereteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormaPago> formapagos;		
	public List<FormaPago> formapagosEliminados;	
	public List<FormaPago> formapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormaPago;		
	protected JButton jButtonAbrirOrderByFormaPago;
	
	
	//protected JPanel jPanelOrderByFormaPago;
	//public JScrollPane jScrollPanelOrderByFormaPago;	
	//protected JButton jButtonCerrarOrderByFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormaPagoLogic formapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormaPago;
	public JScrollPane jScrollPanelDatosEdicionFormaPago;
	public JScrollPane jScrollPanelDatosGeneralFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormaPago;
	//public JScrollPane jScrollPanelImportacionFormaPago;
	
	
	
	protected JPanel jPanelAccionesFormaPago;
	
    protected JPanel jPanelPaginacionFormaPago;
    protected JPanel jPanelParametrosReportesFormaPago;
	protected JPanel jPanelParametrosReportesAccionesFormaPago;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralFormaPago;
	protected Integer iXPanelCamposIniciogeneralFormaPago=0;
	protected Integer iYPanelCamposIniciogeneralFormaPago=0;

	protected JPanel jPanelCamposInicioretencionFormaPago;
	protected Integer iXPanelCamposInicioretencionFormaPago=0;
	protected Integer iYPanelCamposInicioretencionFormaPago=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormaPago;
	protected JPanel jPanelParametrosAuxiliar2FormaPago;
	protected JPanel jPanelParametrosAuxiliar3FormaPago;
	protected JPanel jPanelParametrosAuxiliar4FormaPago;
	//protected JPanel jPanelParametrosAuxiliar5FormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormaPago;
	//protected JPanel jPanelImportacionFormaPago;
	
	
	public JTable jTableDatosFormaPago;
	
	
	
	//public JTable jTableDatosFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormaPago;
	protected JButton jButtonDuplicarFormaPago;
	protected JButton jButtonCopiarFormaPago;
	protected JButton jButtonVerFormFormaPago;
	protected JButton jButtonNuevoRelacionesFormaPago;
	protected JButton jButtonModificarFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaFormaPago;
	protected JButton jButtonCerrarFormaPago;
	
	
	protected JButton jButtonRecargarInformacionFormaPago;
	protected JButton jButtonProcesarInformacionFormaPago;
	
	
	protected JButton jButtonAnterioresFormaPago;
	protected JButton jButtonSiguientesFormaPago;
	protected JButton jButtonNuevoGuardarCambiosFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormaPago;
	//protected JButton jButtonGenerarImportacionFormaPago;
	//protected JButton jButtonCerrarImportacionFormaPago;
	//protected JFileChooser jFileChooserImportacionFormaPago;
	//protected File fileImportacionFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormaPago;
	protected JButton jButtonDuplicarToolBarFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarFormaPago;
	protected JButton jButtonCopiarToolBarFormaPago;
	protected JButton jButtonVerFormToolBarFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPago;
	protected JButton jButtonCerrarToolBarFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarFormaPago;
	protected JButton jButtonProcesarInformacionToolBarFormaPago;
	protected JButton jButtonAnterioresToolBarFormaPago;
	protected JButton jButtonSiguientesToolBarFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormaPago;
	protected JButton jButtonAbrirOrderByToolBarFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormaPago;
	protected JMenuItem jMenuItemDuplicarFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormaPago;
	protected JMenuItem jMenuItemCopiarFormaPago;
	protected JMenuItem jMenuItemVerFormFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPago;
	protected JMenuItem jMenuItemCerrarFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionFormaPago;
	protected JMenuItem jMenuItemAnterioresFormaPago;
	protected JMenuItem jMenuItemSiguientesFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormaPago;
	protected JTextField jTextFieldValorCampoGeneralFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionFormaPago;	
	//public JLabel jLabelPathArchivoImportacionFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormaPago;
	public JPanel jPanelBusquedaPorNombreFormaPago;
	public JButton jButtonBusquedaPorNombreFormaPago;
	public JPanel jPanelBusquedaPorSiglasFormaPago;
	public JButton jButtonBusquedaPorSiglasFormaPago;
	public JPanel jPanelFK_IdCuentaContableFormaPago;
	public JButton jButtonFK_IdCuentaContableFormaPago;
	public JPanel jPanelFK_IdCuentaContableReteFormaPago;
	public JButton jButtonFK_IdCuentaContableReteFormaPago;
	public JPanel jPanelFK_IdTipoFormaPagoFormaPago;
	public JButton jButtonFK_IdTipoFormaPagoFormaPago;
	public JPanel jPanelFK_IdTipoTransaccionModuloFormaPago;
	public JButton jButtonFK_IdTipoTransaccionModuloFormaPago;
	public JPanel jPanelFK_IdTransaccionFormaPago;
	public JButton jButtonFK_IdTransaccionFormaPago;
	
	public JPanel jPanelnombreBusquedaPorNombreFormaPago;
	public JLabel jLabelnombreBusquedaPorNombreFormaPago;
	public JTextArea jTextAreanombreBusquedaPorNombreFormaPago;
	public JButton jButtonnombreBusquedaPorNombreFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasFormaPago;
	public JLabel jLabelsiglasBusquedaPorSiglasFormaPago;
	public JTextField jTextFieldsiglasBusquedaPorSiglasFormaPago;
	public JButton jButtonsiglasBusquedaPorSiglasFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableFormaPago;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago;
	
	public JPanel jPanelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago;
	public JLabel jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago;
	public JButton jButtonid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFK_IdCuentaContableReteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFK_IdCuentaContableReteFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFK_IdCuentaContableReteFormaPagoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionFormaPago;
	public JLabel jLabelid_transaccionFK_IdTransaccionFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionFormaPago;
	public JButton jButtonid_transaccionFK_IdTransaccionFormaPago= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormaPago)	{
		this.jButtonRecargarInformacionFormaPago = jButtonRecargarInformacionFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionFormaPago() {
		return this.jButtonProcesarInformacionFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPago)	{
		this.jButtonProcesarInformacionFormaPago = jButtonProcesarInformacionFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionFormaPago() {
		return this.jButtonRecargarInformacionFormaPago;
	}
	
	
	public List<FormaPago> getformapagos() {
		return this.formapagos;
	}

	public void setformapagos(List<FormaPago> formapagos) {
		this.formapagos = formapagos;
	}
	
	public List<FormaPago> getformapagosAux() {
		return this.formapagosAux;
	}

	public void setformapagosAux(List<FormaPago> formapagosAux) {
		this.formapagosAux = formapagosAux;
	}
	
	public List<FormaPago> getformapagosEliminados() {
		return this.formapagosEliminados;
	}

	public void setFormaPagosEliminados(List<FormaPago> formapagosEliminados) {
		this.formapagosEliminados = formapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormaPago() {
		return jComboBoxTiposSeleccionarFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormaPago(
			JComboBox jComboBoxTiposSeleccionarFormaPago) {
		this.jComboBoxTiposSeleccionarFormaPago = jComboBoxTiposSeleccionarFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormaPago() {
		return jTextFieldValorCampoGeneralFormaPago;
	}

	public void setjTextFieldValorCampoGeneralFormaPago(
			JTextField jTextFieldValorCampoGeneralFormaPago) {
		this.jTextFieldValorCampoGeneralFormaPago = jTextFieldValorCampoGeneralFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormaPago() {
		return this.jCheckBoxSeleccionarTodosFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosFormaPago) {
		this.jCheckBoxSeleccionarTodosFormaPago = jCheckBoxSeleccionarTodosFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormaPago() {
		return this.jCheckBoxSeleccionadosFormaPago;
	}

	public void setjCheckBoxSeleccionadosFormaPago(
			JCheckBox jCheckBoxSeleccionadosFormaPago) {
		this.jCheckBoxSeleccionadosFormaPago = jCheckBoxSeleccionadosFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormaPago() {
		return this.jComboBoxTiposArchivosReportesFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormaPago(
			JComboBox jComboBoxTiposArchivosReportesFormaPago) {
		this.jComboBoxTiposArchivosReportesFormaPago = jComboBoxTiposArchivosReportesFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormaPago() {
		return this.jComboBoxTiposReportesFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormaPago(
			JComboBox jComboBoxTiposReportesFormaPago) {
		this.jComboBoxTiposReportesFormaPago = jComboBoxTiposReportesFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormaPago() {
	//	return jComboBoxTiposReportesDinamicoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoFormaPago = jComboBoxTiposReportesDinamicoFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormaPago = jComboBoxTiposArchivosReportesDinamicoFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormaPago() {
		return this.jComboBoxTiposGraficosReportesFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormaPago(
			JComboBox jComboBoxTiposGraficosReportesFormaPago) {
		this.jComboBoxTiposGraficosReportesFormaPago = jComboBoxTiposGraficosReportesFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormaPago() {
		return this.jComboBoxTiposPaginacionFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormaPago(
			JComboBox jComboBoxTiposPaginacionFormaPago) {
		this.jComboBoxTiposPaginacionFormaPago = jComboBoxTiposPaginacionFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormaPago() {
		return this.jComboBoxTiposRelacionesFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPago() {
		return this.jComboBoxTiposAccionesFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPago(
			JComboBox jComboBoxTiposRelacionesFormaPago) {
		this.jComboBoxTiposRelacionesFormaPago = jComboBoxTiposRelacionesFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPago(
			JComboBox jComboBoxTiposAccionesFormaPago) {
		this.jComboBoxTiposAccionesFormaPago = jComboBoxTiposAccionesFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormaPago() {
	//	return jCheckBoxConGraficoDinamicoFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoFormaPago = jCheckBoxConGraficoDinamicoFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormaPago .setBorder(borderResaltar);		
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
		this.formapagoSessionBean=new FormaPagoSessionBean();
		
		this.formapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		FormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormaPago,this.jTtoolBarFormaPago,
							"nuevo","nuevo","Nuevo"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormaPago,this.jTtoolBarFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormaPago,this.jTtoolBarFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormaPago,this.jTtoolBarFormaPago,
							"duplicar","duplicar","Duplicar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormaPago,this.jTtoolBarFormaPago,
							"copiar","copiar","Copiar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormaPago,this.jTtoolBarFormaPago,
							"ver_form","ver_form","Ver"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPago,this.jTtoolBarFormaPago,
							"recargar","recargar","Recargar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPago,this.jTtoolBarFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPago,this.jTtoolBarFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormaPago,this.jTtoolBarFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormaPago,this.jTtoolBarFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormaPago,this.jTtoolBarFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormaPago,this.jTtoolBarFormaPago,
							"cerrar","cerrar","Salir"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormaPago;
			
				this.jButtonProcesarInformacionToolBarFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormaPago;
				
		//protected JButton jButtonModificarToolBarFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormaPago=new JMenuMe("General");
		this.jmenuArchivoFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormaPago.add(this.jMenuItemCerrarFormaPago);
			
			this.jmenuAccionesFormaPago.add(this.jMenuItemNuevoFormaPago);
			this.jmenuAccionesFormaPago.add(this.jMenuItemNuevoGuardarCambiosFormaPago);
			this.jmenuAccionesFormaPago.add(this.jMenuItemNuevoRelacionesFormaPago);
			this.jmenuAccionesFormaPago.add(this.jMenuItemGuardarCambiosTablaFormaPago);		
			this.jmenuAccionesFormaPago.add(this.jMenuItemDuplicarFormaPago);		
			this.jmenuAccionesFormaPago.add(this.jMenuItemCopiarFormaPago);		
			this.jmenuAccionesFormaPago.add(this.jMenuItemVerFormFormaPago);		
			
			this.jmenuDatosFormaPago.add(this.jMenuItemRecargarInformacionFormaPago);				
			this.jmenuDatosFormaPago.add(this.jMenuItemAnterioresFormaPago);				
			this.jmenuDatosFormaPago.add(this.jMenuItemSiguientesFormaPago);				
			this.jmenuDatosFormaPago.add(this.jMenuItemAbrirOrderByFormaPago);				
			this.jmenuDatosFormaPago.add(this.jMenuItemMostrarOcultarFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormaPago.add(this.jMenuItemGuardarCambiosFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormaPago.add(this.jmenuArchivoFormaPago);		
			this.jmenuBarFormaPago.add(this.jmenuAccionesFormaPago);		
			this.jmenuBarFormaPago.add(this.jmenuDatosFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreFormaPago.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreFormaPago= new JButtonMe();
		this.jButtonBusquedaPorNombreFormaPago.setText("Buscar");
		this.jButtonBusquedaPorNombreFormaPago.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreFormaPago,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreFormaPago = new JLabelMe();
		jLabelnombreBusquedaPorNombreFormaPago.setText("Nombre :");
		jLabelnombreBusquedaPorNombreFormaPago.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreFormaPago= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasFormaPago.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasFormaPago= new JButtonMe();
		this.jButtonBusquedaPorSiglasFormaPago.setText("Buscar");
		this.jButtonBusquedaPorSiglasFormaPago.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasFormaPago,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasFormaPago = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasFormaPago.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasFormaPago.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasFormaPago= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableFormaPago= new JButtonMe();
		this.jButtonFK_IdCuentaContableFormaPago.setText("Buscar");
		this.jButtonFK_IdCuentaContableFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFormaPago,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago.setFocusable(false);

		this.jPanelFK_IdCuentaContableReteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableReteFormaPago.setToolTipText("Buscar Por Cuenta Contable Retencion ");
		this.jButtonFK_IdCuentaContableReteFormaPago= new JButtonMe();
		this.jButtonFK_IdCuentaContableReteFormaPago.setText("Buscar");
		this.jButtonFK_IdCuentaContableReteFormaPago.setToolTipText("Buscar Por Cuenta Contable Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableReteFormaPago,"buscar_button","Buscar Por Cuenta Contable Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableReteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago = new JLabelMe();
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setText("Cuenta Contable Retencion :");
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setToolTipText("Cuenta Contable Retencion");
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago.setFocusable(false);

		this.jPanelFK_IdTipoFormaPagoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoFormaPago,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloFormaPago.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloFormaPago.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloFormaPago,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionFormaPago.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionFormaPago= new JButtonMe();
		this.jButtonFK_IdTransaccionFormaPago.setText("Buscar");
		this.jButtonFK_IdTransaccionFormaPago.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionFormaPago,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionFormaPago = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionFormaPago.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionFormaPago.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionFormaPago= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormaPago = new FormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
			this.jInternalFrameDetalleFormFormaPago = new FormaPagoDetalleFormJInternalFrame(jDesktopPane,this.formapagoSessionBean.getConGuardarRelaciones(),this.formapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormaPago = null;//new FormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormaPago= new GridBagLayout();
		
		
		this.jTableDatosFormaPago = new JTableMe();      
		
		String sToolTipFormaPago="";
		sToolTipFormaPago=FormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPago+="(Tesoreria.FormaPago)";
		}
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormaPago.setToolTipText(sToolTipFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormaPago);
		this.jTableDatosFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormaPago = new JButtonMe();
		this.jButtonDuplicarFormaPago = new JButtonMe();
		this.jButtonCopiarFormaPago = new JButtonMe();
		this.jButtonVerFormFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormaPago = new JButtonMe();
		this.jButtonCerrarFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioretencionFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFormaPago.setName("jPanelCamposFingeneralFormaPago");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioretencionFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Retencion"));
		this.jPanelCamposInicioretencionFormaPago.setName("jPanelCamposFinretencionFormaPago");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioretencionFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFormaPago=new ReporteDinamicoJInternalFrame(FormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormaPago=new ImportacionJInternalFrame(FormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByFormaPago.setText("Orden");
		this.jButtonAbrirOrderByFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPago,false,this);
			
			//this.cargarOrderByFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPago,true,this);
			
			//this.cargarOrderByFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormaPago.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosFormaPago.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosFormaPago.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormaPago.setText("Nuevo");
		this.jButtonDuplicarFormaPago.setText("Duplicar");
		this.jButtonCopiarFormaPago.setText("Copiar");
		this.jButtonVerFormFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormaPago.setText("Guardar");
		this.jButtonCerrarFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPago,"nuevo_button","Nuevo",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormaPago,"duplicar_button","Duplicar",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormaPago,"copiar_button","Copiar",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormaPago,"ver_form","Ver",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormaPago,"nuevorelaciones_button","Nuevo Rel",this.formapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPago,"guardarcambiostabla_button","Guardar",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPago,"cerrar_button","Salir",this.formapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormaPago.setToolTipText("Nuevo"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormaPago.setToolTipText("Duplicar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormaPago.setToolTipText("Copiar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormaPago.setToolTipText("Ver"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormaPago.setToolTipText("Nuevo Rel"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormaPago.setToolTipText("Guardar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPago.setToolTipText("Salir"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPago";
		inputMap = this.jButtonNuevoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormaPago";
		inputMap = this.jButtonDuplicarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarFormaPago";
		inputMap = this.jButtonCopiarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormFormaPago";
		inputMap = this.jButtonVerFormFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormaPago";
		inputMap = this.jButtonNuevoRelacionesFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormaPago";
		inputMap = this.jButtonModificarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormaPago";
		inputMap = this.jButtonCerrarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormaPago.setName("jPanelParametrosReportesFormaPago"); 
		
		this.jPanelParametrosReportesAccionesFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormaPago.setName("jPanelParametrosReportesAccionesFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionFormaPago.setToolTipText("Recargar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionFormaPago.setToolTipText("Procesar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormaPago = new JLabelMe();
		
		this.jLabelAccionesFormaPago.setText("Acciones");		
		this.jLabelAccionesFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormaPago = new JButtonMe();
		//this.jButtonAnterioresFormaPago.setText("<<");
        this.jButtonAnterioresFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormaPago = new JButtonMe();
		//this.jButtonSiguientesFormaPago.setText(">>");
        this.jButtonSiguientesFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormaPago,"nuevoguardarcambios_button","Nue",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormaPago";
		inputMap = this.jButtonRecargarInformacionFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormaPago";
		inputMap = this.jButtonSiguientesFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormaPago";
		inputMap = this.jButtonAnterioresFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormaPago.setMinimumSize(new Dimension(this.getWidth(),FormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormaPago.setMaximumSize(new Dimension(this.getWidth(),FormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormaPago.setPreferredSize(new Dimension(this.getWidth(),FormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormaPago = new GridBagLayout();

			this.jPanelPaginacionFormaPago.setLayout(gridaBagLayoutPaginacionFormaPago);						
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 0;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormaPago.add(this.jButtonAnterioresFormaPago, this.gridBagConstraintsFormaPago);
					
						
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPago.gridy = 0;
			
			this.jPanelPaginacionFormaPago.add(this.jButtonNuevoGuardarCambiosFormaPago, this.gridBagConstraintsFormaPago);
						
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPago.gridy = 0;
			this.jPanelPaginacionFormaPago.add(this.jButtonSiguientesFormaPago, this.gridBagConstraintsFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 1;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPago.add(this.jButtonNuevoFormaPago, this.gridBagConstraintsFormaPago);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormaPago = new GridBagConstraints();
				this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormaPago.gridy = 1;
				this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormaPago.add(this.jButtonNuevoRelacionesFormaPago, this.gridBagConstraintsFormaPago);
			}
			
			
			if(!this.formapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormaPago = new GridBagConstraints();
				this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormaPago.gridy = 1;
				this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormaPago.add(this.jButtonGuardarCambiosTablaFormaPago, this.gridBagConstraintsFormaPago);
			}
			
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 1;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPago.add(this.jButtonDuplicarFormaPago, this.gridBagConstraintsFormaPago);
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 1;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPago.add(this.jButtonCopiarFormaPago, this.gridBagConstraintsFormaPago);
		
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 1;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPago.add(this.jButtonVerFormFormaPago, this.gridBagConstraintsFormaPago);
		
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 1;
			this.gridBagConstraintsFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormaPago.add(this.jButtonCerrarFormaPago, this.gridBagConstraintsFormaPago);
		
		
		
		this.jButtonRecargarInformacionFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormaPago.setLayout(gridaBagParametrosReportesFormaPago);
			this.jPanelParametrosReportesAccionesFormaPago.setLayout(gridaBagParametrosReportesAccionesFormaPago);
			
			
			this.jPanelParametrosAuxiliar1FormaPago.setLayout(gridaBagParametrosAuxiliar1FormaPago);
			this.jPanelParametrosAuxiliar2FormaPago.setLayout(gridaBagParametrosAuxiliar2FormaPago);
			this.jPanelParametrosAuxiliar3FormaPago.setLayout(gridaBagParametrosAuxiliar3FormaPago);
			this.jPanelParametrosAuxiliar4FormaPago.setLayout(gridaBagParametrosAuxiliar4FormaPago);
			//this.jPanelParametrosAuxiliar5FormaPago.setLayout(gridaBagParametrosAuxiliar2FormaPago);			
			
			
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPago.add(this.jButtonRecargarInformacionFormaPago, this.gridBagConstraintsFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPago.add(this.jComboBoxTiposPaginacionFormaPago, this.gridBagConstraintsFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPago.add(this.jCheckBoxConAltoMaximoTablaFormaPago, this.gridBagConstraintsFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPago.add(this.jComboBoxTiposArchivosReportesFormaPago, this.gridBagConstraintsFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPago.add(this.jPanelParametrosAuxiliar1FormaPago, this.gridBagConstraintsFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormaPago.add(this.jComboBoxTiposReportesFormaPago, this.gridBagConstraintsFormaPago);																		
			
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormaPago.add(this.jComboBoxTiposGraficosReportesFormaPago, this.gridBagConstraintsFormaPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPago.add(this.jPanelParametrosAuxiliar4FormaPago, this.gridBagConstraintsFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPago.add(this.jComboBoxTiposReportesFormaPago, this.gridBagConstraintsFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPago.add(this.jCheckBoxGenerarReporteFormaPago, this.gridBagConstraintsFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPago.add(this.jPanelParametrosAuxiliar2FormaPago, this.gridBagConstraintsFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPago.add(this.jLabelAccionesFormaPago, this.gridBagConstraintsFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormaPago = new GridBagConstraints();
				this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormaPago.add(this.jButtonAbrirOrderByFormaPago, this.gridBagConstraintsFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPago.add(this.jComboBoxTiposSeleccionarFormaPago, this.gridBagConstraintsFormaPago);			
			
			
			/*
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPago.add(this.jCheckBoxSeleccionarTodosFormaPago, this.gridBagConstraintsFormaPago);
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPago.add(this.jCheckBoxConGraficoReporteFormaPago, this.gridBagConstraintsFormaPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPago.add(this.jCheckBoxSeleccionarTodosFormaPago, this.gridBagConstraintsFormaPago);															
				
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPago.add(this.jCheckBoxSeleccionadosFormaPago, this.gridBagConstraintsFormaPago);															
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPago.add(this.jCheckBoxConGraficoReporteFormaPago, this.gridBagConstraintsFormaPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPago.add(this.jPanelParametrosAuxiliar3FormaPago, this.gridBagConstraintsFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPago.add(this.jComboBoxTiposRelacionesFormaPago, this.gridBagConstraintsFormaPago);
				
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPago.add(this.jComboBoxTiposAccionesFormaPago, this.gridBagConstraintsFormaPago);
	
				
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPago.add(this.jTextFieldValorCampoGeneralFormaPago, this.gridBagConstraintsFormaPago);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFormaPago= new GridBagLayout();
		this.jPanelCamposIniciogeneralFormaPago.setLayout(gridaBagLayoutCamposIniciogeneralFormaPago);

		GridBagLayout gridaBagLayoutCamposInicioretencionFormaPago= new GridBagLayout();
		this.jPanelCamposInicioretencionFormaPago.setLayout(gridaBagLayoutCamposInicioretencionFormaPago);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormaPago = new GridBagLayout();

			this.jScrollPanelDatosFormaPago.setLayout(gridaBagLayoutDatosFormaPago);
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = 0;
			this.gridBagConstraintsFormaPago.gridx = 0;
			
			this.jScrollPanelDatosFormaPago.add(this.jTableDatosFormaPago, this.gridBagConstraintsFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormaPago.setViewportView(this.jTableDatosFormaPago);
		this.jTableDatosFormaPago.setFillsViewportHeight(true);
		this.jTableDatosFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormaPago= new GridBagLayout();
		this.jPanelAccionesFormaPago.setLayout(gridaBagLayoutAccionesFormaPago);
		
		
		/*	
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 0;
			
		this.jPanelAccionesFormaPago.add(this.jButtonNuevoFormaPago, this.gridBagConstraintsFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreFormaPago.setLayout(gridaBagLayoutBusquedaPorNombreFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelBusquedaPorNombreFormaPago.add(jLabelnombreBusquedaPorNombreFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelBusquedaPorNombreFormaPago.add(jTextAreanombreBusquedaPorNombreFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelBusquedaPorNombreFormaPago.add(jButtonBusquedaPorNombreFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasFormaPago.setLayout(gridaBagLayoutBusquedaPorSiglasFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelBusquedaPorSiglasFormaPago.add(jLabelsiglasBusquedaPorSiglasFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelBusquedaPorSiglasFormaPago.add(jTextFieldsiglasBusquedaPorSiglasFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelBusquedaPorSiglasFormaPago.add(jButtonBusquedaPorSiglasFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("2.-Por Siglas ", jPanelBusquedaPorSiglasFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFormaPago.setLayout(gridaBagLayoutFK_IdCuentaContableFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableFormaPago.add(jLabelid_cuenta_contableFK_IdCuentaContableFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelFK_IdCuentaContableFormaPago.add(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPago, gridBagConstraintsFormaPago);


		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableFormaPago.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelFK_IdCuentaContableFormaPago.add(jButtonFK_IdCuentaContableFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("3.-Por Cuenta Contable ", jPanelFK_IdCuentaContableFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableReteFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableReteFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableReteFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableReteFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableReteFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableReteFormaPago.setLayout(gridaBagLayoutFK_IdCuentaContableReteFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableReteFormaPago.add(jLabelid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelFK_IdCuentaContableReteFormaPago.add(jComboBoxid_cuenta_contable_reteFK_IdCuentaContableReteFormaPago, gridBagConstraintsFormaPago);


		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableReteFormaPago.add(this.jButtonBuscarFK_IdCuentaContableReteid_cuenta_contable_reteFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelFK_IdCuentaContableReteFormaPago.add(jButtonFK_IdCuentaContableReteFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("4.-Por Cuenta Contable Retencion ", jPanelFK_IdCuentaContableReteFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoFormaPago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoFormaPago.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelFK_IdTipoFormaPagoFormaPago.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelFK_IdTipoFormaPagoFormaPago.add(jButtonFK_IdTipoFormaPagoFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("5.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloFormaPago.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloFormaPago.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloFormaPago.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelFK_IdTipoTransaccionModuloFormaPago.add(jButtonFK_IdTipoTransaccionModuloFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("6.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransaccionFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionFormaPago.setLayout(gridaBagLayoutFK_IdTransaccionFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 0;
		jPanelFK_IdTransaccionFormaPago.add(jLabelid_transaccionFK_IdTransaccionFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 0;
		gridBagConstraintsFormaPago.gridx = 1;
		jPanelFK_IdTransaccionFormaPago.add(jComboBoxid_transaccionFK_IdTransaccionFormaPago, gridBagConstraintsFormaPago);

		gridBagConstraintsFormaPago = new GridBagConstraints();
		gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPago.gridy = 1;
		gridBagConstraintsFormaPago.gridx =1;
		jPanelFK_IdTransaccionFormaPago.add(jButtonFK_IdTransaccionFormaPago, gridBagConstraintsFormaPago);

		jTabbedPaneBusquedasFormaPago.addTab("7.-Por Transaccion ", jPanelFK_IdTransaccionFormaPago);
		jTabbedPaneBusquedasFormaPago.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPago.gridx = 0;		
			//this.gridBagConstraintsFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormaPago, this.gridBagConstraintsFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormaPago.gridx = 0;		
		//this.gridBagConstraintsFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPago.gridx = 0;		
			this.gridBagConstraintsFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormaPago, this.gridBagConstraintsFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormaPago, this.gridBagConstraintsFormaPago);								
		
		
		/*
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormaPago, this.gridBagConstraintsFormaPago);
		*/		
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPago.gridx =0;
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPago, this.gridBagConstraintsFormaPago);
				
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormaPago, this.gridBagConstraintsFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosFormaPago.setLayout(gridaBagLayoutBusquedasParametrosFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPago, this.gridBagConstraintsFormaPago);
			
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPago, this.gridBagConstraintsFormaPago);
		
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPago, this.gridBagConstraintsFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormaPago.setName("jPanelReporteDinamicoFormaPago"); 
		
		this.jPanelReporteDinamicoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormaPago.setLayout(gridaBagLayoutReporteDinamicoFormaPago);
		
		
		this.jInternalFrameReporteDinamicoFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelColumnasSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormaPago=new JScrollPane(this.jListColumnasSelectReporteFormaPago);
			
			this.jScrollColumnasSelectReporteFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormaPago.add(this.jListColumnasSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		this.jPanelReporteDinamicoFormaPago.add(this.jScrollColumnasSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelRelacionesSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormaPago=new JScrollPane(this.jListRelacionesSelectReporteFormaPago);
			
			this.jScrollRelacionesSelectReporteFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormaPago.add(this.jListRelacionesSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		this.jPanelReporteDinamicoFormaPago.add(this.jScrollRelacionesSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormaPago = new JLabelMe();

		this.jLabelConGraficoDinamicoFormaPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelConGraficoDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormaPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jCheckBoxConGraficoDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormaPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelColumnaCategoriaGraficoFormaPago, this.gridBagConstraintsFormaPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormaPago.add(this.jComboBoxColumnaCategoriaGraficoFormaPago, this.gridBagConstraintsFormaPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormaPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelColumnaCategoriaValorFormaPago, this.gridBagConstraintsFormaPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormaPago.add(this.jComboBoxColumnaCategoriaValorFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormaPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormaPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelColumnasValoresGraficoFormaPago, this.gridBagConstraintsFormaPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormaPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormaPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormaPago=new JScrollPane(this.jListColumnasValoresGraficoFormaPago);
			
			this.jScrollColumnasValoresGraficoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormaPago.add(this.jListColumnasSelectReporteFormaPago, this.gridBagConstraintsFormaPago);
		this.jPanelReporteDinamicoFormaPago.add(this.jScrollColumnasValoresGraficoFormaPago, this.gridBagConstraintsFormaPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormaPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormaPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelTiposGraficosReportesDinamicoFormaPago, this.gridBagConstraintsFormaPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jComboBoxTiposGraficosReportesDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelGenerarExcelReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormaPago.setToolTipText("Generar EXCEL"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormaPago.add(this.jButtonGenerarExcelReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPago.add(this.jComboBoxTiposReportesDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPago.add(this.jLabelTiposArchivoReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoFormaPago, this.gridBagConstraintsFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormaPago.setToolTipText("Generar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPago.add(this.jButtonGenerarReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormaPago.setToolTipText("Cancelar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPago.add(this.jButtonCerrarReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormaPago= new JScrollPane(jPanelReporteDinamicoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormaPago);
		this.jInternalFrameReporteDinamicoFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoFormaPago, this.gridBagConstraintsFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormaPago.setName("jPanelImportacionFormaPago"); 
		
		this.jPanelImportacionFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormaPago.setLayout(gridaBagLayoutImportacionFormaPago);
		
		
		this.jInternalFrameImportacionFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPago.setResizable(true);
	    this.jInternalFrameImportacionFormaPago.setClosable(true);
	    this.jInternalFrameImportacionFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPago.setResizable(true);
	    this.jInternalFrameImportacionFormaPago.setClosable(true);
	    this.jInternalFrameImportacionFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPago.add(this.jLabelArchivoImportacionFormaPago, this.gridBagConstraintsFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormaPago = new JFileChooser();		
		this.jFileChooserImportacionFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormaPago.setToolTipText("Generar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPago.add(this.jButtonAbrirImportacionFormaPago, this.gridBagConstraintsFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPago.add(this.jLabelPathArchivoImportacionFormaPago, this.gridBagConstraintsFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPago.add(this.jTextFieldPathArchivoImportacionFormaPago, this.gridBagConstraintsFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormaPago.setToolTipText("Generar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPago.add(this.jButtonGenerarImportacionFormaPago, this.gridBagConstraintsFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormaPago.setToolTipText("Cancelar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPago.add(this.jButtonCerrarImportacionFormaPago, this.gridBagConstraintsFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionFormaPago= new JScrollPane(jPanelImportacionFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormaPago);
		this.jInternalFrameImportacionFormaPago.getContentPane().add(this.jScrollPanelImportacionFormaPago, this.gridBagConstraintsFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByFormaPago.setText("Orden");
			this.jButtonAbrirOrderByFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormaPago";
			inputMap = this.jButtonAbrirOrderByFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormaPago.setName("jPanelOrderByFormaPago"); 
			
			this.jPanelOrderByFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormaPago.setLayout(gridaBagLayoutOrderByFormaPago);
			
			
			this.jTableDatosFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormaPagoOrderBy.setViewportView(this.jTableDatosFormaPagoOrderBy);
			this.jTableDatosFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormaPago.setResizable(true);
			this.jInternalFrameOrderByFormaPago.setClosable(true);
			this.jInternalFrameOrderByFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormaPago.ipady =150;
				
			this.jPanelOrderByFormaPago.add(jScrollPanelDatosFormaPagoOrderBy, this.gridBagConstraintsFormaPago);//this.jTableDatosFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormaPago.setToolTipText("Cancelar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormaPago.add(this.jButtonCerrarOrderByFormaPago, this.gridBagConstraintsFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByFormaPago= new JScrollPane(jPanelOrderByFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormaPago);
			
			this.jInternalFrameOrderByFormaPago.getContentPane().add(this.jScrollPanelOrderByFormaPago, this.gridBagConstraintsFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//5030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormaPago.getRowHeight();//FormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormaPago.isSelected()) {
					iHeightTable=FormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormaPago.isSelected()) {
					iHeightTable=FormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormaPago!=null && this.jInternalFrameOrderByFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formapagoLogic.getFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormaPago> TraerFormaPagoBeans(List<FormaPago> formapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormaPago formapago:formapagos) {
					
				if(!(FormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formapago.setsDetalleGeneralEntityReporte(FormaPagoConstantesFunciones.getFormaPagoDescripcion(formapago));
										
					formapago.setcon_detalle_descripcion(FormaPagoConstantesFunciones.getcon_detalleDescripcion(formapago));formapago.setcon_remesa_descripcion(FormaPagoConstantesFunciones.getcon_remesaDescripcion(formapago));formapago.setcon_maneja_cuotas_descripcion(FormaPagoConstantesFunciones.getcon_maneja_cuotasDescripcion(formapago));	
					
					

					if(formapago.getFormularioRentaExtras()!=null && Funciones.existeClass(classes,FormularioRentaExtra.class)) {
						try{formapago.setformulariorentaextrasDescripcionReporte(new JRBeanCollectionDataSource(FormularioRentaExtraJInternalFrame.TraerFormularioRentaExtraBeans(formapago.getFormularioRentaExtras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formapago.setsDetalleGeneralEntityReporte(formapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//formapagobeans.add(formapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formapagos;
    }
	//PARA REPORTES FIN
}
