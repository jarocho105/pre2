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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RubroEmpleaCuentaContableConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RubroEmpleaCuentaContableJInternalFrame extends RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRubroEmpleaCuentaContable;
	
	protected JMenuBar jmenuBarRubroEmpleaCuentaContable;
	
	protected JMenu jmenuRubroEmpleaCuentaContable;
	protected JMenu jmenuDatosRubroEmpleaCuentaContable;
	protected JMenu jmenuArchivoRubroEmpleaCuentaContable;
	protected JMenu jmenuAccionesRubroEmpleaCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmpleaCuentaContable;	
	protected GridBagConstraints gridBagConstraintsRubroEmpleaCuentaContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame jInternalFrameDetalleFormRubroEmpleaCuentaContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRubroEmpleaCuentaContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRubroEmpleaCuentaContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RubroEmpleaCuentaContable> rubroempleacuentacontables;		
	public List<RubroEmpleaCuentaContable> rubroempleacuentacontablesEliminados;	
	public List<RubroEmpleaCuentaContable> rubroempleacuentacontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRubroEmpleaCuentaContable;		
	protected JButton jButtonAbrirOrderByRubroEmpleaCuentaContable;
	
	
	//protected JPanel jPanelOrderByRubroEmpleaCuentaContable;
	//public JScrollPane jScrollPanelOrderByRubroEmpleaCuentaContable;	
	//protected JButton jButtonCerrarOrderByRubroEmpleaCuentaContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RubroEmpleaCuentaContableLogic rubroempleacuentacontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRubroEmpleaCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionRubroEmpleaCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralRubroEmpleaCuentaContable;
    
	
	
	//public JScrollPane jScrollPanelDatosRubroEmpleaCuentaContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRubroEmpleaCuentaContable;
	//public JScrollPane jScrollPanelImportacionRubroEmpleaCuentaContable;
	
	
	
	protected JPanel jPanelAccionesRubroEmpleaCuentaContable;
	
    protected JPanel jPanelPaginacionRubroEmpleaCuentaContable;
    protected JPanel jPanelParametrosReportesRubroEmpleaCuentaContable;
	protected JPanel jPanelParametrosReportesAccionesRubroEmpleaCuentaContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RubroEmpleaCuentaContable;
	protected JPanel jPanelParametrosAuxiliar2RubroEmpleaCuentaContable;
	protected JPanel jPanelParametrosAuxiliar3RubroEmpleaCuentaContable;
	protected JPanel jPanelParametrosAuxiliar4RubroEmpleaCuentaContable;
	//protected JPanel jPanelParametrosAuxiliar5RubroEmpleaCuentaContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoRubroEmpleaCuentaContable;
	//protected JPanel jPanelImportacionRubroEmpleaCuentaContable;
	
	
	public JTable jTableDatosRubroEmpleaCuentaContable;
	
	
	
	//public JTable jTableDatosRubroEmpleaCuentaContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRubroEmpleaCuentaContable;
	protected JButton jButtonDuplicarRubroEmpleaCuentaContable;
	protected JButton jButtonCopiarRubroEmpleaCuentaContable;
	protected JButton jButtonVerFormRubroEmpleaCuentaContable;
	protected JButton jButtonNuevoRelacionesRubroEmpleaCuentaContable;
	protected JButton jButtonModificarRubroEmpleaCuentaContable;
	
    protected JButton jButtonGuardarCambiosTablaRubroEmpleaCuentaContable;
	protected JButton jButtonCerrarRubroEmpleaCuentaContable;
	
	
	protected JButton jButtonRecargarInformacionRubroEmpleaCuentaContable;
	protected JButton jButtonProcesarInformacionRubroEmpleaCuentaContable;
	
	
	protected JButton jButtonAnterioresRubroEmpleaCuentaContable;
	protected JButton jButtonSiguientesRubroEmpleaCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable;
	//protected JButton jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionRubroEmpleaCuentaContable;
	//protected JButton jButtonGenerarImportacionRubroEmpleaCuentaContable;
	//protected JButton jButtonCerrarImportacionRubroEmpleaCuentaContable;
	//protected JFileChooser jFileChooserImportacionRubroEmpleaCuentaContable;
	//protected File fileImportacionRubroEmpleaCuentaContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonDuplicarToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable;
	
	
	public JButton jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonCopiarToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonVerFormToolBarRubroEmpleaCuentaContable;
	public JButton jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonCerrarToolBarRubroEmpleaCuentaContable;
	
	protected JButton jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonProcesarInformacionToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonAnterioresToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonSiguientesToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonAbrirOrderByToolBarRubroEmpleaCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDuplicarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemNuevoRelacionesRubroEmpleaCuentaContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemCopiarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemVerFormRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemCerrarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable;
	
	protected JMenuItem jMenuItemRecargarInformacionRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemProcesarInformacionRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemAnterioresRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemSiguientesRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemAbrirOrderByRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmpleaCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmpleaCuentaContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable;
	protected JCheckBox jCheckBoxSeleccionadosRubroEmpleaCuentaContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable;
	protected JCheckBox jCheckBoxConGraficoReporteRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRubroEmpleaCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRubroEmpleaCuentaContable;
	protected JTextField jTextFieldValorCampoGeneralRubroEmpleaCuentaContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRubroEmpleaCuentaContable;
	//public JList<Reporte> jListColumnasSelectReporteRubroEmpleaCuentaContable;
	//public JScrollPane jScrollColumnasSelectReporteRubroEmpleaCuentaContable;
	
	//public JLabel jLabelRelacionesSelectReporteRubroEmpleaCuentaContable;
	//public JList<Reporte> jListRelacionesSelectReporteRubroEmpleaCuentaContable;
	//public JScrollPane jScrollRelacionesSelectReporteRubroEmpleaCuentaContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRubroEmpleaCuentaContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable;
	
		
	//public JLabel jLabelArchivoImportacionRubroEmpleaCuentaContable;	
	//public JLabel jLabelPathArchivoImportacionRubroEmpleaCuentaContable;
	//protected JTextField jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRubroEmpleaCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRubroEmpleaCuentaContable;
	
	//public JLabel jLabelColumnaCategoriaValorRubroEmpleaCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRubroEmpleaCuentaContable;
	
	//public JLabel jLabelColumnasValoresGraficoRubroEmpleaCuentaContable;
	//public JList<Reporte> jListColumnasValoresGraficoRubroEmpleaCuentaContable;
	//public JScrollPane jScrollColumnasValoresGraficoRubroEmpleaCuentaContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRubroEmpleaCuentaContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRubroEmpleaCuentaContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRubroEmpleaCuentaContable;
	public JPanel jPanelFK_IdCuentaContableRubroEmpleaCuentaContable;
	public JButton jButtonFK_IdCuentaContableRubroEmpleaCuentaContable;
	public JPanel jPanelFK_IdEstructuraRubroEmpleaCuentaContable;
	public JButton jButtonFK_IdEstructuraRubroEmpleaCuentaContable;
	public JPanel jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable;
	public JButton jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable;
	public JLabel jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable;
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEmpleaCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraRubroEmpleaCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContableBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RubroEmpleaCuentaContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRubroEmpleaCuentaContable)	{
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable = jButtonRecargarInformacionRubroEmpleaCuentaContable;
	}
	
	public JButton getjButtonProcesarInformacionRubroEmpleaCuentaContable() {
		return this.jButtonProcesarInformacionRubroEmpleaCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmpleaCuentaContable)	{
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable = jButtonProcesarInformacionRubroEmpleaCuentaContable;
	}
	
	
	public JButton getjButtonRecargarInformacionRubroEmpleaCuentaContable() {
		return this.jButtonRecargarInformacionRubroEmpleaCuentaContable;
	}
	
	
	public List<RubroEmpleaCuentaContable> getrubroempleacuentacontables() {
		return this.rubroempleacuentacontables;
	}

	public void setrubroempleacuentacontables(List<RubroEmpleaCuentaContable> rubroempleacuentacontables) {
		this.rubroempleacuentacontables = rubroempleacuentacontables;
	}
	
	public List<RubroEmpleaCuentaContable> getrubroempleacuentacontablesAux() {
		return this.rubroempleacuentacontablesAux;
	}

	public void setrubroempleacuentacontablesAux(List<RubroEmpleaCuentaContable> rubroempleacuentacontablesAux) {
		this.rubroempleacuentacontablesAux = rubroempleacuentacontablesAux;
	}
	
	public List<RubroEmpleaCuentaContable> getrubroempleacuentacontablesEliminados() {
		return this.rubroempleacuentacontablesEliminados;
	}

	public void setRubroEmpleaCuentaContablesEliminados(List<RubroEmpleaCuentaContable> rubroempleacuentacontablesEliminados) {
		this.rubroempleacuentacontablesEliminados = rubroempleacuentacontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRubroEmpleaCuentaContable() {
		return jComboBoxTiposSeleccionarRubroEmpleaCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposSeleccionarRubroEmpleaCuentaContable) {
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable = jComboBoxTiposSeleccionarRubroEmpleaCuentaContable;
	}
	
	public void setBorderResaltarTiposSeleccionarRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRubroEmpleaCuentaContable() {
		return jTextFieldValorCampoGeneralRubroEmpleaCuentaContable;
	}

	public void setjTextFieldValorCampoGeneralRubroEmpleaCuentaContable(
			JTextField jTextFieldValorCampoGeneralRubroEmpleaCuentaContable) {
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable = jTextFieldValorCampoGeneralRubroEmpleaCuentaContable;
	}

	public void setBorderResaltarValorCampoGeneralRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRubroEmpleaCuentaContable() {
		return this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable;
	}

	public void setjCheckBoxSeleccionarTodosRubroEmpleaCuentaContable(
			JCheckBox jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable) {
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable = jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable;
	}

	public void setBorderResaltarSeleccionarTodosRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRubroEmpleaCuentaContable() {
		return this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable;
	}

	public void setjCheckBoxSeleccionadosRubroEmpleaCuentaContable(
			JCheckBox jCheckBoxSeleccionadosRubroEmpleaCuentaContable) {
		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable = jCheckBoxSeleccionadosRubroEmpleaCuentaContable;
	}
	
	public void setBorderResaltarSeleccionadosRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable = jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable;
	}

	public void setBorderResaltarTiposArchivosReportesRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposReportesRubroEmpleaCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposReportesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable = jComboBoxTiposReportesRubroEmpleaCuentaContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable() {
	//	return jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable(
	//		JComboBox jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable) {
	//	this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable = jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable = jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable;
	//}
	
	public void setBorderResaltarTiposReportesRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable = jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposPaginacionRubroEmpleaCuentaContable) {
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable = jComboBoxTiposPaginacionRubroEmpleaCuentaContable;
	}
	
	public void setBorderResaltarTiposPaginacionRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposRelacionesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable = jComboBoxTiposRelacionesRubroEmpleaCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposAccionesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable = jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	}
	
	public void setBorderResaltarTiposRelacionesRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRubroEmpleaCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable() {
	//	return jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable) {
	//	this.jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable = jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRubroEmpleaCuentaContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRubroEmpleaCuentaContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable .setBorder(borderResaltar);		
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
		this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		
		this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleaCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Emplea Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
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
		
		RubroEmpleaCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRubroEmpleaCuentaContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"nuevo","nuevo","Nuevo"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"duplicar","duplicar","Duplicar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"copiar","copiar","Copiar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"ver_form","ver_form","Ver"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"recargar","recargar","Recargar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,
							"cerrar","cerrar","Salir"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable;
			
				this.jButtonProcesarInformacionToolBarRubroEmpleaCuentaContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRubroEmpleaCuentaContable;
				
		//protected JButton jButtonModificarToolBarRubroEmpleaCuentaContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRubroEmpleaCuentaContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRubroEmpleaCuentaContable=new JMenuMe("General");
		this.jmenuArchivoRubroEmpleaCuentaContable=new JMenuMe("Archivo");
		this.jmenuAccionesRubroEmpleaCuentaContable=new JMenuMe("Acciones");
		this.jmenuDatosRubroEmpleaCuentaContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmpleaCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmpleaCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmpleaCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRubroEmpleaCuentaContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRubroEmpleaCuentaContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRubroEmpleaCuentaContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRubroEmpleaCuentaContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRubroEmpleaCuentaContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRubroEmpleaCuentaContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRubroEmpleaCuentaContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRubroEmpleaCuentaContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRubroEmpleaCuentaContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmpleaCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmpleaCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmpleaCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRubroEmpleaCuentaContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRubroEmpleaCuentaContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRubroEmpleaCuentaContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRubroEmpleaCuentaContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRubroEmpleaCuentaContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRubroEmpleaCuentaContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRubroEmpleaCuentaContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRubroEmpleaCuentaContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRubroEmpleaCuentaContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRubroEmpleaCuentaContable.add(this.jMenuItemCerrarRubroEmpleaCuentaContable);
			
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemNuevoRubroEmpleaCuentaContable);
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable);
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable);
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable);		
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemDuplicarRubroEmpleaCuentaContable);		
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemCopiarRubroEmpleaCuentaContable);		
			this.jmenuAccionesRubroEmpleaCuentaContable.add(this.jMenuItemVerFormRubroEmpleaCuentaContable);		
			
			this.jmenuDatosRubroEmpleaCuentaContable.add(this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable);				
			this.jmenuDatosRubroEmpleaCuentaContable.add(this.jMenuItemAnterioresRubroEmpleaCuentaContable);				
			this.jmenuDatosRubroEmpleaCuentaContable.add(this.jMenuItemSiguientesRubroEmpleaCuentaContable);				
			this.jmenuDatosRubroEmpleaCuentaContable.add(this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable);				
			this.jmenuDatosRubroEmpleaCuentaContable.add(this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRubroEmpleaCuentaContable.add(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRubroEmpleaCuentaContable.add(this.jmenuArchivoRubroEmpleaCuentaContable);		
			this.jmenuBarRubroEmpleaCuentaContable.add(this.jmenuAccionesRubroEmpleaCuentaContable);		
			this.jmenuBarRubroEmpleaCuentaContable.add(this.jmenuDatosRubroEmpleaCuentaContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRubroEmpleaCuentaContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRubroEmpleaCuentaContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRubroEmpleaCuentaContable=new JTabbedPane();


		this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRubroEmpleaCuentaContable = new RubroEmpleaCuentaContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rubro Emplea Cuenta Contable DATOS");
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable = new RubroEmpleaCuentaContableDetalleFormJInternalFrame(jDesktopPane,this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones(),this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable = null;//new RubroEmpleaCuentaContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmpleaCuentaContable= new GridBagLayout();
		
		
		this.jTableDatosRubroEmpleaCuentaContable = new JTableMe();      
		
		String sToolTipRubroEmpleaCuentaContable="";
		sToolTipRubroEmpleaCuentaContable=RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmpleaCuentaContable+="(Nomina.RubroEmpleaCuentaContable)";
		}
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmpleaCuentaContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRubroEmpleaCuentaContable.setToolTipText(sToolTipRubroEmpleaCuentaContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRubroEmpleaCuentaContable);
		this.jTableDatosRubroEmpleaCuentaContable.setAutoCreateRowSorter(true);
		this.jTableDatosRubroEmpleaCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionAllowed(true);
		this.jTableDatosRubroEmpleaCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonDuplicarRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonCopiarRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonVerFormRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonCerrarRubroEmpleaCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmpleaCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Emplea Cuenta Contable";
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmpleaCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmpleaCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmpleaCuentaContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable=new ReporteDinamicoJInternalFrame(RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRubroEmpleaCuentaContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRubroEmpleaCuentaContable=new ImportacionJInternalFrame(RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRubroEmpleaCuentaContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRubroEmpleaCuentaContable = new JButtonMe();
		
		this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setText("Orden");
		this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmpleaCuentaContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmpleaCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleaCuentaContable,false,this);
			
			//this.cargarOrderByRubroEmpleaCuentaContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmpleaCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleaCuentaContable,true,this);
			
			//this.cargarOrderByRubroEmpleaCuentaContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRubroEmpleaCuentaContable.setText("Nuevo");
		this.jButtonDuplicarRubroEmpleaCuentaContable.setText("Duplicar");
		this.jButtonCopiarRubroEmpleaCuentaContable.setText("Copiar");
		this.jButtonVerFormRubroEmpleaCuentaContable.setText("Ver");
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setText("Guardar");
		this.jButtonCerrarRubroEmpleaCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmpleaCuentaContable,"nuevo_button","Nuevo",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRubroEmpleaCuentaContable,"duplicar_button","Duplicar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRubroEmpleaCuentaContable,"copiar_button","Copiar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRubroEmpleaCuentaContable,"ver_form","Ver",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRubroEmpleaCuentaContable,"nuevorelaciones_button","Nuevo Rel",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable,"guardarcambiostabla_button","Guardar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmpleaCuentaContable,"cerrar_button","Salir",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRubroEmpleaCuentaContable.setToolTipText("Nuevo"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRubroEmpleaCuentaContable.setToolTipText("Duplicar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRubroEmpleaCuentaContable.setToolTipText("Copiar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRubroEmpleaCuentaContable.setToolTipText("Ver"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.setToolTipText("Nuevo Rel"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setToolTipText("Guardar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmpleaCuentaContable.setToolTipText("Salir"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmpleaCuentaContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarRubroEmpleaCuentaContable";
		inputMap = this.jButtonDuplicarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRubroEmpleaCuentaContable"));
		
		//COPIAR
		sMapKey = "CopiarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCopiarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRubroEmpleaCuentaContable"));
		
		//VEr FORM
		sMapKey = "VerFormRubroEmpleaCuentaContable";
		inputMap = this.jButtonVerFormRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRubroEmpleaCuentaContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRubroEmpleaCuentaContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRubroEmpleaCuentaContable";
		inputMap = this.jButtonModificarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRubroEmpleaCuentaContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCerrarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmpleaCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmpleaCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmpleaCuentaContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRubroEmpleaCuentaContable.setName("jPanelParametrosReportesRubroEmpleaCuentaContable"); 
		
		this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable.setName("jPanelParametrosReportesAccionesRubroEmpleaCuentaContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.setText("Recargar");
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.setToolTipText("Recargar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRubroEmpleaCuentaContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setText("Procesar");
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setToolTipText("Procesar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setVisible(false);
			
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setText("TIPO");       
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.setText("Accion");
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setText("Accion");
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRubroEmpleaCuentaContable = new JLabelMe();
		
		this.jLabelAccionesRubroEmpleaCuentaContable.setText("Acciones");		
		this.jLabelAccionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRubroEmpleaCuentaContable = new JButtonMe();
		//this.jButtonAnterioresRubroEmpleaCuentaContable.setText("<<");
        this.jButtonAnterioresRubroEmpleaCuentaContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRubroEmpleaCuentaContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRubroEmpleaCuentaContable = new JButtonMe();
		//this.jButtonSiguientesRubroEmpleaCuentaContable.setText(">>");
        this.jButtonSiguientesRubroEmpleaCuentaContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRubroEmpleaCuentaContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable,"nuevoguardarcambios_button","Nue",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRubroEmpleaCuentaContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRubroEmpleaCuentaContable";
		inputMap = this.jButtonRecargarInformacionRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRubroEmpleaCuentaContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRubroEmpleaCuentaContable";
		inputMap = this.jButtonSiguientesRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRubroEmpleaCuentaContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRubroEmpleaCuentaContable";
		inputMap = this.jButtonAnterioresRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRubroEmpleaCuentaContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRubroEmpleaCuentaContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(this.getWidth(),RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(this.getWidth(),RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(this.getWidth(),RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRubroEmpleaCuentaContable = new GridBagLayout();

			this.jPanelPaginacionRubroEmpleaCuentaContable.setLayout(gridaBagLayoutPaginacionRubroEmpleaCuentaContable);						
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonAnterioresRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					
						
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
			
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
						
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonSiguientesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonNuevoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
						
			
			
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			}
			
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonDuplicarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonCopiarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonVerFormRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRubroEmpleaCuentaContable.add(this.jButtonCerrarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
		
		
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRubroEmpleaCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRubroEmpleaCuentaContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RubroEmpleaCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RubroEmpleaCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RubroEmpleaCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RubroEmpleaCuentaContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.setLayout(gridaBagParametrosReportesRubroEmpleaCuentaContable);
			this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable.setLayout(gridaBagParametrosReportesAccionesRubroEmpleaCuentaContable);
			
			
			this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable.setLayout(gridaBagParametrosAuxiliar1RubroEmpleaCuentaContable);
			this.jPanelParametrosAuxiliar2RubroEmpleaCuentaContable.setLayout(gridaBagParametrosAuxiliar2RubroEmpleaCuentaContable);
			this.jPanelParametrosAuxiliar3RubroEmpleaCuentaContable.setLayout(gridaBagParametrosAuxiliar3RubroEmpleaCuentaContable);
			this.jPanelParametrosAuxiliar4RubroEmpleaCuentaContable.setLayout(gridaBagParametrosAuxiliar4RubroEmpleaCuentaContable);
			//this.jPanelParametrosAuxiliar5RubroEmpleaCuentaContable.setLayout(gridaBagParametrosAuxiliar2RubroEmpleaCuentaContable);			
			
			
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jButtonRecargarInformacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable.add(this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable.add(this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable.add(this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jPanelParametrosAuxiliar1RubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RubroEmpleaCuentaContable.add(this.jComboBoxTiposReportesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jPanelParametrosAuxiliar4RubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jComboBoxTiposReportesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jCheckBoxGenerarReporteRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jPanelParametrosAuxiliar2RubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jLabelAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jButtonAbrirOrderByRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			
			
			/*
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmpleaCuentaContable.add(this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);															
				
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmpleaCuentaContable.add(this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jPanelParametrosAuxiliar3RubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jComboBoxTiposAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
	
				
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.add(this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRubroEmpleaCuentaContable = new GridBagLayout();

			this.jScrollPanelDatosRubroEmpleaCuentaContable.setLayout(gridaBagLayoutDatosRubroEmpleaCuentaContable);
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
			
			this.jScrollPanelDatosRubroEmpleaCuentaContable.add(this.jTableDatosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setViewportView(this.jTableDatosRubroEmpleaCuentaContable);
		this.jTableDatosRubroEmpleaCuentaContable.setFillsViewportHeight(true);
		this.jTableDatosRubroEmpleaCuentaContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRubroEmpleaCuentaContable= new GridBagLayout();
		this.jPanelAccionesRubroEmpleaCuentaContable.setLayout(gridaBagLayoutAccionesRubroEmpleaCuentaContable);
		
		
		/*	
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
			
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonNuevoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableRubroEmpleaCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableRubroEmpleaCuentaContable.add(jLabelid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableRubroEmpleaCuentaContable.add(jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableRubroEmpleaCuentaContable.add(jButtonFK_IdCuentaContableRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		jTabbedPaneBusquedasRubroEmpleaCuentaContable.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);
		jTabbedPaneBusquedasRubroEmpleaCuentaContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraRubroEmpleaCuentaContable.setLayout(gridaBagLayoutFK_IdEstructuraRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		jPanelFK_IdEstructuraRubroEmpleaCuentaContable.add(jLabelid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
		jPanelFK_IdEstructuraRubroEmpleaCuentaContable.add(jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx =1;
		jPanelFK_IdEstructuraRubroEmpleaCuentaContable.add(jButtonFK_IdEstructuraRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		jTabbedPaneBusquedasRubroEmpleaCuentaContable.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraRubroEmpleaCuentaContable);
		jTabbedPaneBusquedasRubroEmpleaCuentaContable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable.setLayout(gridaBagLayoutFK_IdRubroEmpleaRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable.add(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
		jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleaCuentaContable.gridy = 1;
		gridBagConstraintsRubroEmpleaCuentaContable.gridx =1;
		jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable.add(jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);

		jTabbedPaneBusquedasRubroEmpleaCuentaContable.addTab("3.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);
		jTabbedPaneBusquedasRubroEmpleaCuentaContable.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmpleaCuentaContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;		
			//this.gridBagConstraintsRubroEmpleaCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;		
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);								
		
		
		/*
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/		
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmpleaCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
				
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRubroEmpleaCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmpleaCuentaContable = new GridBagLayout();
			this.jPanelBusquedasParametrosRubroEmpleaCuentaContable.setLayout(gridaBagLayoutBusquedasParametrosRubroEmpleaCuentaContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRubroEmpleaCuentaContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRubroEmpleaCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setName("jPanelReporteDinamicoRubroEmpleaCuentaContable"); 
		
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.setLayout(gridaBagLayoutReporteDinamicoRubroEmpleaCuentaContable);
		
		
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jLabelColumnasSelectReporteRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRubroEmpleaCuentaContable = new JList<Reporte>();
		this.jListColumnasSelectReporteRubroEmpleaCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRubroEmpleaCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable=new JScrollPane(this.jListColumnasSelectReporteRubroEmpleaCuentaContable);
			
			this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jListColumnasSelectReporteRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteRubroEmpleaCuentaContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRubroEmpleaCuentaContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteRubroEmpleaCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRubroEmpleaCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRubroEmpleaCuentaContable=new JScrollPane(this.jListRelacionesSelectReporteRubroEmpleaCuentaContable);
			
			this.jScrollRelacionesSelectReporteRubroEmpleaCuentaContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmpleaCuentaContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmpleaCuentaContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRubroEmpleaCuentaContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoRubroEmpleaCuentaContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jLabelGenerarExcelReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.setToolTipText("Generar EXCEL"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jComboBoxTiposReportesDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jLabelTiposArchivoReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable.setToolTipText("Generar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable.setToolTipText("Cancelar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleaCuentaContable.add(this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRubroEmpleaCuentaContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable= new JScrollPane(jPanelReporteDinamicoRubroEmpleaCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRubroEmpleaCuentaContable);
		this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getContentPane().add(this.jScrollPanelReporteDinamicoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRubroEmpleaCuentaContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRubroEmpleaCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRubroEmpleaCuentaContable.setName("jPanelImportacionRubroEmpleaCuentaContable"); 
		
		this.jPanelImportacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRubroEmpleaCuentaContable.setLayout(gridaBagLayoutImportacionRubroEmpleaCuentaContable);
		
		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRubroEmpleaCuentaContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRubroEmpleaCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionRubroEmpleaCuentaContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelArchivoImportacionRubroEmpleaCuentaContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jLabelArchivoImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRubroEmpleaCuentaContable = new JFileChooser();		
		this.jFileChooserImportacionRubroEmpleaCuentaContable.setToolTipText("ESCOGER ARCHIVO"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonAbrirImportacionRubroEmpleaCuentaContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRubroEmpleaCuentaContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRubroEmpleaCuentaContable.setToolTipText("Generar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jButtonAbrirImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable = new JLabelMe();

		this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jLabelPathArchivoImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jTextFieldPathArchivoImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonGenerarImportacionRubroEmpleaCuentaContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRubroEmpleaCuentaContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRubroEmpleaCuentaContable.setToolTipText("Generar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jButtonGenerarImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonCerrarImportacionRubroEmpleaCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRubroEmpleaCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRubroEmpleaCuentaContable.setToolTipText("Cancelar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleaCuentaContable.add(this.jButtonCerrarImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRubroEmpleaCuentaContable = new GridBagLayout();
		
		this.jScrollPanelImportacionRubroEmpleaCuentaContable= new JScrollPane(jPanelImportacionRubroEmpleaCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iPosYImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXImportacion;
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRubroEmpleaCuentaContable);
		this.jInternalFrameImportacionRubroEmpleaCuentaContable.getContentPane().add(this.jScrollPanelImportacionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRubroEmpleaCuentaContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable = new JButtonMe();
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setText("Orden");
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmpleaCuentaContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRubroEmpleaCuentaContable";
			inputMap = this.jButtonAbrirOrderByRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRubroEmpleaCuentaContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByRubroEmpleaCuentaContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRubroEmpleaCuentaContable.setName("jPanelOrderByRubroEmpleaCuentaContable"); 
			
			this.jPanelOrderByRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRubroEmpleaCuentaContable.setLayout(gridaBagLayoutOrderByRubroEmpleaCuentaContable);
			
			
			this.jTableDatosRubroEmpleaCuentaContableOrderBy = new JTableMe();        
			this.jTableDatosRubroEmpleaCuentaContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRubroEmpleaCuentaContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRubroEmpleaCuentaContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRubroEmpleaCuentaContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRubroEmpleaCuentaContableOrderBy.setViewportView(this.jTableDatosRubroEmpleaCuentaContableOrderBy);
			this.jTableDatosRubroEmpleaCuentaContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRubroEmpleaCuentaContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRubroEmpleaCuentaContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRubroEmpleaCuentaContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRubroEmpleaCuentaContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRubroEmpleaCuentaContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setTitle("Orden");
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setResizable(true);
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setClosable(true);
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRubroEmpleaCuentaContable.ipady =150;
				
			this.jPanelOrderByRubroEmpleaCuentaContable.add(jScrollPanelDatosRubroEmpleaCuentaContableOrderBy, this.gridBagConstraintsRubroEmpleaCuentaContable);//this.jTableDatosRubroEmpleaCuentaContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRubroEmpleaCuentaContable = new JButtonMe();
			this.jButtonCerrarOrderByRubroEmpleaCuentaContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRubroEmpleaCuentaContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRubroEmpleaCuentaContable.setToolTipText("Cancelar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRubroEmpleaCuentaContable.add(this.jButtonCerrarOrderByRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRubroEmpleaCuentaContable = new GridBagLayout();
			
			this.jScrollPanelOrderByRubroEmpleaCuentaContable= new JScrollPane(jPanelOrderByRubroEmpleaCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRubroEmpleaCuentaContable);
			
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getContentPane().add(this.jScrollPanelOrderByRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
		
		} else {
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRubroEmpleaCuentaContable.getRowHeight();//RubroEmpleaCuentaContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.isSelected()) {
					iHeightTable=RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmpleaCuentaContable.isSelected()) {
					iHeightTable=RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleaCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRubroEmpleaCuentaContable!=null && this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy()!=null) {
			//if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleacuentacontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RubroEmpleaCuentaContable> TraerRubroEmpleaCuentaContableBeans(List<RubroEmpleaCuentaContable> rubroempleacuentacontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontables) {
					
				if(!(RubroEmpleaCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RubroEmpleaCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rubroempleacuentacontable.setsDetalleGeneralEntityReporte(RubroEmpleaCuentaContableConstantesFunciones.getRubroEmpleaCuentaContableDescripcion(rubroempleacuentacontable));
										
						
					
						
					
				} else  {
							
					//rubroempleacuentacontable.setsDetalleGeneralEntityReporte(rubroempleacuentacontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//rubroempleacuentacontablebeans.add(rubroempleacuentacontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rubroempleacuentacontables;
    }
	//PARA REPORTES FIN
}
