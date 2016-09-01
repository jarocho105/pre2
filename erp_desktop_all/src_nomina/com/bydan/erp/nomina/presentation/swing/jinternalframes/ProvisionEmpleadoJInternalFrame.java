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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.ProvisionEmpleadoConstantesFunciones;

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
public class ProvisionEmpleadoJInternalFrame extends ProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProvisionEmpleado;
	
	protected JMenuBar jmenuBarProvisionEmpleado;
	
	protected JMenu jmenuProvisionEmpleado;
	protected JMenu jmenuDatosProvisionEmpleado;
	protected JMenu jmenuArchivoProvisionEmpleado;
	protected JMenu jmenuAccionesProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsProvisionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProvisionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormProvisionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProvisionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProvisionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected TipoProvisionEmpleadoBeanSwingJInternalFrame tipoprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprovisionempleado="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public ProvisionEmpleadoSessionBean provisionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProvisionEmpleado> provisionempleados;		
	public List<ProvisionEmpleado> provisionempleadosEliminados;	
	public List<ProvisionEmpleado> provisionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProvisionEmpleado;		
	protected JButton jButtonAbrirOrderByProvisionEmpleado;
	
	
	//protected JPanel jPanelOrderByProvisionEmpleado;
	//public JScrollPane jScrollPanelOrderByProvisionEmpleado;	
	//protected JButton jButtonCerrarOrderByProvisionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProvisionEmpleadoLogic provisionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralProvisionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosProvisionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProvisionEmpleado;
	//public JScrollPane jScrollPanelImportacionProvisionEmpleado;
	
	
	
	protected JPanel jPanelAccionesProvisionEmpleado;
	
    protected JPanel jPanelPaginacionProvisionEmpleado;
    protected JPanel jPanelParametrosReportesProvisionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesProvisionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2ProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3ProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4ProvisionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5ProvisionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoProvisionEmpleado;
	//protected JPanel jPanelImportacionProvisionEmpleado;
	
	
	public JTable jTableDatosProvisionEmpleado;
	
	
	
	//public JTable jTableDatosProvisionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProvisionEmpleado;
	protected JButton jButtonDuplicarProvisionEmpleado;
	protected JButton jButtonCopiarProvisionEmpleado;
	protected JButton jButtonVerFormProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesProvisionEmpleado;
	protected JButton jButtonModificarProvisionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaProvisionEmpleado;
	protected JButton jButtonCerrarProvisionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionProvisionEmpleado;
	protected JButton jButtonProcesarInformacionProvisionEmpleado;
	
	
	protected JButton jButtonAnterioresProvisionEmpleado;
	protected JButton jButtonSiguientesProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosProvisionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProvisionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoProvisionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoProvisionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionProvisionEmpleado;
	//protected JButton jButtonGenerarImportacionProvisionEmpleado;
	//protected JButton jButtonCerrarImportacionProvisionEmpleado;
	//protected JFileChooser jFileChooserImportacionProvisionEmpleado;
	//protected File fileImportacionProvisionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProvisionEmpleado;
	protected JButton jButtonDuplicarToolBarProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarProvisionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarProvisionEmpleado;
	protected JButton jButtonCopiarToolBarProvisionEmpleado;
	protected JButton jButtonVerFormToolBarProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarProvisionEmpleado;
	protected JButton jButtonCerrarToolBarProvisionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarProvisionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarProvisionEmpleado;
	protected JButton jButtonAnterioresToolBarProvisionEmpleado;
	protected JButton jButtonSiguientesToolBarProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarProvisionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProvisionEmpleado;
	protected JMenuItem jMenuItemDuplicarProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesProvisionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProvisionEmpleado;
	protected JMenuItem jMenuItemCopiarProvisionEmpleado;
	protected JMenuItem jMenuItemVerFormProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarProvisionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionProvisionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionProvisionEmpleado;
	protected JMenuItem jMenuItemAnterioresProvisionEmpleado;
	protected JMenuItem jMenuItemSiguientesProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProvisionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProvisionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProvisionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProvisionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProvisionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralProvisionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProvisionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteProvisionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteProvisionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteProvisionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteProvisionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteProvisionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProvisionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProvisionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProvisionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoProvisionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionProvisionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionProvisionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionProvisionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProvisionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProvisionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoProvisionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoProvisionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoProvisionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProvisionEmpleado;
	public JPanel jPanelFK_IdAnioProvisionEmpleado;
	public JButton jButtonFK_IdAnioProvisionEmpleado;
	public JPanel jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado;
	public JButton jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado;
	public JPanel jPanelFK_IdEmpleadoProvisionEmpleado;
	public JButton jButtonFK_IdEmpleadoProvisionEmpleado;
	public JPanel jPanelFK_IdEstructuraProvisionEmpleado;
	public JButton jButtonFK_IdEstructuraProvisionEmpleado;
	public JPanel jPanelFK_IdMesProvisionEmpleado;
	public JButton jButtonFK_IdMesProvisionEmpleado;
	public JPanel jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado;
	public JButton jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado;
	
	public JPanel jPanelid_anioFK_IdAnioProvisionEmpleado;
	public JLabel jLabelid_anioFK_IdAnioProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioProvisionEmpleado;
	public JButton jButtonid_anioFK_IdAnioProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado;
	public JLabel jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado;
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoProvisionEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraProvisionEmpleado;
	public JLabel jLabelid_estructuraFK_IdEstructuraProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado;
	public JButton jButtonid_estructuraFK_IdEstructuraProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraProvisionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraProvisionEmpleadoArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesProvisionEmpleado;
	public JLabel jLabelid_mesFK_IdMesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesProvisionEmpleado;
	public JButton jButtonid_mesFK_IdMesProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado;
	public JLabel jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado;
	public JButton jButtonid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProvisionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProvisionEmpleado)	{
		this.jButtonRecargarInformacionProvisionEmpleado = jButtonRecargarInformacionProvisionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionProvisionEmpleado() {
		return this.jButtonProcesarInformacionProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProvisionEmpleado)	{
		this.jButtonProcesarInformacionProvisionEmpleado = jButtonProcesarInformacionProvisionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionProvisionEmpleado() {
		return this.jButtonRecargarInformacionProvisionEmpleado;
	}
	
	
	public List<ProvisionEmpleado> getprovisionempleados() {
		return this.provisionempleados;
	}

	public void setprovisionempleados(List<ProvisionEmpleado> provisionempleados) {
		this.provisionempleados = provisionempleados;
	}
	
	public List<ProvisionEmpleado> getprovisionempleadosAux() {
		return this.provisionempleadosAux;
	}

	public void setprovisionempleadosAux(List<ProvisionEmpleado> provisionempleadosAux) {
		this.provisionempleadosAux = provisionempleadosAux;
	}
	
	public List<ProvisionEmpleado> getprovisionempleadosEliminados() {
		return this.provisionempleadosEliminados;
	}

	public void setProvisionEmpleadosEliminados(List<ProvisionEmpleado> provisionempleadosEliminados) {
		this.provisionempleadosEliminados = provisionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProvisionEmpleado() {
		return jComboBoxTiposSeleccionarProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProvisionEmpleado(
			JComboBox jComboBoxTiposSeleccionarProvisionEmpleado) {
		this.jComboBoxTiposSeleccionarProvisionEmpleado = jComboBoxTiposSeleccionarProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProvisionEmpleado() {
		return jTextFieldValorCampoGeneralProvisionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralProvisionEmpleado(
			JTextField jTextFieldValorCampoGeneralProvisionEmpleado) {
		this.jTextFieldValorCampoGeneralProvisionEmpleado = jTextFieldValorCampoGeneralProvisionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProvisionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProvisionEmpleado() {
		return this.jCheckBoxSeleccionarTodosProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosProvisionEmpleado) {
		this.jCheckBoxSeleccionarTodosProvisionEmpleado = jCheckBoxSeleccionarTodosProvisionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProvisionEmpleado() {
		return this.jCheckBoxSeleccionadosProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionadosProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionadosProvisionEmpleado) {
		this.jCheckBoxSeleccionadosProvisionEmpleado = jCheckBoxSeleccionadosProvisionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProvisionEmpleado() {
		return this.jComboBoxTiposArchivosReportesProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProvisionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesProvisionEmpleado) {
		this.jComboBoxTiposArchivosReportesProvisionEmpleado = jComboBoxTiposArchivosReportesProvisionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProvisionEmpleado() {
		return this.jComboBoxTiposReportesProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProvisionEmpleado(
			JComboBox jComboBoxTiposReportesProvisionEmpleado) {
		this.jComboBoxTiposReportesProvisionEmpleado = jComboBoxTiposReportesProvisionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProvisionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProvisionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoProvisionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoProvisionEmpleado = jComboBoxTiposReportesDinamicoProvisionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProvisionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProvisionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado = jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProvisionEmpleado() {
		return this.jComboBoxTiposGraficosReportesProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProvisionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesProvisionEmpleado) {
		this.jComboBoxTiposGraficosReportesProvisionEmpleado = jComboBoxTiposGraficosReportesProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProvisionEmpleado() {
		return this.jComboBoxTiposPaginacionProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProvisionEmpleado(
			JComboBox jComboBoxTiposPaginacionProvisionEmpleado) {
		this.jComboBoxTiposPaginacionProvisionEmpleado = jComboBoxTiposPaginacionProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProvisionEmpleado() {
		return this.jComboBoxTiposRelacionesProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProvisionEmpleado() {
		return this.jComboBoxTiposAccionesProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesProvisionEmpleado) {
		this.jComboBoxTiposRelacionesProvisionEmpleado = jComboBoxTiposRelacionesProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesProvisionEmpleado) {
		this.jComboBoxTiposAccionesProvisionEmpleado = jComboBoxTiposAccionesProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProvisionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoProvisionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoProvisionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoProvisionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoProvisionEmpleado = jCheckBoxConGraficoDinamicoProvisionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProvisionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProvisionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProvisionEmpleado .setBorder(borderResaltar);		
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
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		
		this.provisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.provisionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProvisionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"copiar","copiar","Copiar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"ver_form","ver_form","Ver"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"recargar","recargar","Recargar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProvisionEmpleado,this.jTtoolBarProvisionEmpleado,
							"cerrar","cerrar","Salir"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProvisionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProvisionEmpleado;
			
				this.jButtonProcesarInformacionToolBarProvisionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProvisionEmpleado;
				
		//protected JButton jButtonModificarToolBarProvisionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProvisionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProvisionEmpleado=new JMenuMe("General");
		this.jmenuArchivoProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosProvisionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProvisionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProvisionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProvisionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProvisionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProvisionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProvisionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProvisionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProvisionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProvisionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProvisionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProvisionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProvisionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProvisionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProvisionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProvisionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProvisionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProvisionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProvisionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProvisionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProvisionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProvisionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProvisionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProvisionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProvisionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProvisionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProvisionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProvisionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProvisionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProvisionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProvisionEmpleado.add(this.jMenuItemCerrarProvisionEmpleado);
			
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemNuevoProvisionEmpleado);
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemNuevoGuardarCambiosProvisionEmpleado);
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemNuevoRelacionesProvisionEmpleado);
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemGuardarCambiosTablaProvisionEmpleado);		
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemDuplicarProvisionEmpleado);		
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemCopiarProvisionEmpleado);		
			this.jmenuAccionesProvisionEmpleado.add(this.jMenuItemVerFormProvisionEmpleado);		
			
			this.jmenuDatosProvisionEmpleado.add(this.jMenuItemRecargarInformacionProvisionEmpleado);				
			this.jmenuDatosProvisionEmpleado.add(this.jMenuItemAnterioresProvisionEmpleado);				
			this.jmenuDatosProvisionEmpleado.add(this.jMenuItemSiguientesProvisionEmpleado);				
			this.jmenuDatosProvisionEmpleado.add(this.jMenuItemAbrirOrderByProvisionEmpleado);				
			this.jmenuDatosProvisionEmpleado.add(this.jMenuItemMostrarOcultarProvisionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProvisionEmpleado.add(this.jMenuItemGuardarCambiosProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProvisionEmpleado.add(this.jmenuArchivoProvisionEmpleado);		
			this.jmenuBarProvisionEmpleado.add(this.jmenuAccionesProvisionEmpleado);		
			this.jmenuBarProvisionEmpleado.add(this.jmenuDatosProvisionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProvisionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProvisionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioProvisionEmpleado.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioProvisionEmpleado.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioProvisionEmpleado,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioProvisionEmpleado = new JLabelMe();
		jLabelid_anioFK_IdAnioProvisionEmpleado.setText("Anio :");
		jLabelid_anioFK_IdAnioProvisionEmpleado.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Defi Provision Empleado ");
		this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Defi Provision Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado,"buscar_button","Buscar Por Defi Provision Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado = new JLabelMe();
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setText("Defi Provision Empleado :");
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setToolTipText("Defi Provision Empleado");
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoProvisionEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraProvisionEmpleado.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdEstructuraProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdEstructuraProvisionEmpleado.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraProvisionEmpleado,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesProvisionEmpleado.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdMesProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdMesProvisionEmpleado.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesProvisionEmpleado,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesProvisionEmpleado = new JLabelMe();
		jLabelid_mesFK_IdMesProvisionEmpleado.setText("Mes :");
		jLabelid_mesFK_IdMesProvisionEmpleado.setToolTipText("Mes");
		jLabelid_mesFK_IdMesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Tipo Provision Empleado ");
		this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado.setToolTipText("Buscar Por Tipo Provision Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado,"buscar_button","Buscar Por Tipo Provision Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado = new JLabelMe();
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setText("Tipo Provision Empleado :");
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setToolTipText("Tipo Provision Empleado");
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProvisionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasProvisionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProvisionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProvisionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProvisionEmpleado = new ProvisionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Provision Empleado DATOS");
			this.jInternalFrameDetalleFormProvisionEmpleado = new ProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.provisionempleadoSessionBean.getConGuardarRelaciones(),this.provisionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProvisionEmpleado = null;//new ProvisionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProvisionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosProvisionEmpleado = new JTableMe();      
		
		String sToolTipProvisionEmpleado="";
		sToolTipProvisionEmpleado=ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProvisionEmpleado+="(Nomina.ProvisionEmpleado)";
		}
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProvisionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProvisionEmpleado.setToolTipText(sToolTipProvisionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProvisionEmpleado);
		this.jTableDatosProvisionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProvisionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProvisionEmpleado = new JButtonMe();
		this.jButtonDuplicarProvisionEmpleado = new JButtonMe();
		this.jButtonCopiarProvisionEmpleado = new JButtonMe();
		this.jButtonVerFormProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesProvisionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralProvisionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Provision Empleado";
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesProvisionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProvisionEmpleado=new ReporteDinamicoJInternalFrame(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProvisionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProvisionEmpleado=new ImportacionJInternalFrame(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProvisionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProvisionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByProvisionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProvisionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvisionEmpleado,false,this);
			
			//this.cargarOrderByProvisionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvisionEmpleado,true,this);
			
			//this.cargarOrderByProvisionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProvisionEmpleado.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosProvisionEmpleado.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosProvisionEmpleado.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosProvisionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProvisionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProvisionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProvisionEmpleado.setText("Nuevo");
		this.jButtonDuplicarProvisionEmpleado.setText("Duplicar");
		this.jButtonCopiarProvisionEmpleado.setText("Copiar");
		this.jButtonVerFormProvisionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesProvisionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProvisionEmpleado,"nuevo_button","Nuevo",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProvisionEmpleado,"duplicar_button","Duplicar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProvisionEmpleado,"copiar_button","Copiar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProvisionEmpleado,"ver_form","Ver",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProvisionEmpleado,"cerrar_button","Salir",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProvisionEmpleado.setToolTipText("Nuevo"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProvisionEmpleado.setToolTipText("Duplicar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProvisionEmpleado.setToolTipText("Copiar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProvisionEmpleado.setToolTipText("Ver"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProvisionEmpleado.setToolTipText("Nuevo Rel"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.setToolTipText("Guardar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProvisionEmpleado.setToolTipText("Salir"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProvisionEmpleado";
		inputMap = this.jButtonNuevoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProvisionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarProvisionEmpleado";
		inputMap = this.jButtonDuplicarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProvisionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarProvisionEmpleado";
		inputMap = this.jButtonCopiarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProvisionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormProvisionEmpleado";
		inputMap = this.jButtonVerFormProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProvisionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProvisionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProvisionEmpleado";
		inputMap = this.jButtonModificarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProvisionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProvisionEmpleado";
		inputMap = this.jButtonCerrarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProvisionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProvisionEmpleado.setName("jPanelParametrosReportesProvisionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProvisionEmpleado.setName("jPanelParametrosReportesAccionesProvisionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProvisionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionProvisionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionProvisionEmpleado.setToolTipText("Recargar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProvisionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProvisionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionProvisionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionProvisionEmpleado.setToolTipText("Procesar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProvisionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionProvisionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProvisionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProvisionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProvisionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesProvisionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProvisionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionProvisionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesProvisionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesProvisionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarProvisionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProvisionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProvisionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProvisionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProvisionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProvisionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProvisionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProvisionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProvisionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteProvisionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProvisionEmpleado = new JButtonMe();
		//this.jButtonAnterioresProvisionEmpleado.setText("<<");
        this.jButtonAnterioresProvisionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProvisionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProvisionEmpleado = new JButtonMe();
		//this.jButtonSiguientesProvisionEmpleado.setText(">>");
        this.jButtonSiguientesProvisionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProvisionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProvisionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosProvisionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProvisionEmpleado,"nuevoguardarcambios_button","Nue",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProvisionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProvisionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProvisionEmpleado";
		inputMap = this.jButtonRecargarInformacionProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProvisionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProvisionEmpleado";
		inputMap = this.jButtonSiguientesProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProvisionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProvisionEmpleado";
		inputMap = this.jButtonAnterioresProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProvisionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProvisionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProvisionEmpleado.setMinimumSize(new Dimension(this.getWidth(),ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProvisionEmpleado.setMaximumSize(new Dimension(this.getWidth(),ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProvisionEmpleado.setPreferredSize(new Dimension(this.getWidth(),ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProvisionEmpleado = new GridBagLayout();

			this.jPanelPaginacionProvisionEmpleado.setLayout(gridaBagLayoutPaginacionProvisionEmpleado);						
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonAnterioresProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					
						
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProvisionEmpleado.gridy = 0;
			
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonNuevoGuardarCambiosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
						
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProvisionEmpleado.gridy = 0;
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonSiguientesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonNuevoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
						
			
			
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProvisionEmpleado.gridy = 1;
				this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProvisionEmpleado.add(this.jButtonGuardarCambiosTablaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			}
			
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonDuplicarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonCopiarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonVerFormProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProvisionEmpleado.add(this.jButtonCerrarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		
		this.jButtonRecargarInformacionProvisionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProvisionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProvisionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProvisionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProvisionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProvisionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProvisionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProvisionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProvisionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProvisionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProvisionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProvisionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProvisionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProvisionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProvisionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProvisionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProvisionEmpleado.setLayout(gridaBagParametrosReportesProvisionEmpleado);
			this.jPanelParametrosReportesAccionesProvisionEmpleado.setLayout(gridaBagParametrosReportesAccionesProvisionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1ProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar1ProvisionEmpleado);
			this.jPanelParametrosAuxiliar2ProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2ProvisionEmpleado);
			this.jPanelParametrosAuxiliar3ProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar3ProvisionEmpleado);
			this.jPanelParametrosAuxiliar4ProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar4ProvisionEmpleado);
			//this.jPanelParametrosAuxiliar5ProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2ProvisionEmpleado);			
			
			
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jButtonRecargarInformacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProvisionEmpleado.add(this.jComboBoxTiposPaginacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProvisionEmpleado.add(this.jCheckBoxConAltoMaximoTablaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jPanelParametrosAuxiliar1ProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProvisionEmpleado.add(this.jComboBoxTiposReportesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);																		
			
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProvisionEmpleado.add(this.jComboBoxTiposGraficosReportesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jPanelParametrosAuxiliar4ProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jComboBoxTiposReportesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jCheckBoxGenerarReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jPanelParametrosAuxiliar2ProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jLabelAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProvisionEmpleado.add(this.jButtonAbrirOrderByProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jComboBoxTiposSeleccionarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			
			
			/*
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jCheckBoxConGraficoReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);															
				
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProvisionEmpleado.add(this.jCheckBoxSeleccionadosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);															
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProvisionEmpleado.add(this.jCheckBoxConGraficoReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jPanelParametrosAuxiliar3ProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jComboBoxTiposAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
	
				
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvisionEmpleado.add(this.jTextFieldValorCampoGeneralProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProvisionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosProvisionEmpleado.setLayout(gridaBagLayoutDatosProvisionEmpleado);
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosProvisionEmpleado.add(this.jTableDatosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProvisionEmpleado.setViewportView(this.jTableDatosProvisionEmpleado);
		this.jTableDatosProvisionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosProvisionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesProvisionEmpleado.setLayout(gridaBagLayoutAccionesProvisionEmpleado);
		
		
		/*	
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
			
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonNuevoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioProvisionEmpleado.setLayout(gridaBagLayoutFK_IdAnioProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdAnioProvisionEmpleado.add(jLabelid_anioFK_IdAnioProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdAnioProvisionEmpleado.add(jComboBoxid_anioFK_IdAnioProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdAnioProvisionEmpleado.add(jButtonFK_IdAnioProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("1.-Por Anio ", jPanelFK_IdAnioProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado.setLayout(gridaBagLayoutFK_IdDefiProvisionEmpleadoProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado.add(jLabelid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado.add(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado.add(jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("2.-Por Defi Provision Empleado ", jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoProvisionEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoProvisionEmpleado.add(jLabelid_empleadoFK_IdEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoProvisionEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdEmpleadoProvisionEmpleado.add(jButtonFK_IdEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstructuraProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraProvisionEmpleado.setLayout(gridaBagLayoutFK_IdEstructuraProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdEstructuraProvisionEmpleado.add(jLabelid_estructuraFK_IdEstructuraProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdEstructuraProvisionEmpleado.add(jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdEstructuraProvisionEmpleado.add(jButtonFK_IdEstructuraProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("4.-Por Estructura ", jPanelFK_IdEstructuraProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdMesProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdMesProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesProvisionEmpleado.setLayout(gridaBagLayoutFK_IdMesProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdMesProvisionEmpleado.add(jLabelid_mesFK_IdMesProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdMesProvisionEmpleado.add(jComboBoxid_mesFK_IdMesProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdMesProvisionEmpleado.add(jButtonFK_IdMesProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("5.-Por Mes ", jPanelFK_IdMesProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado.setLayout(gridaBagLayoutFK_IdTipoProvisionEmpleadoProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 0;
		jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado.add(jLabelid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 0;
		gridBagConstraintsProvisionEmpleado.gridx = 1;
		jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado.add(jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvisionEmpleado.gridy = 1;
		gridBagConstraintsProvisionEmpleado.gridx =1;
		jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado.add(jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado, gridBagConstraintsProvisionEmpleado);

		jTabbedPaneBusquedasProvisionEmpleado.addTab("6.-Por Tipo Provision Empleado ", jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);
		jTabbedPaneBusquedasProvisionEmpleado.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProvisionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProvisionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;		
		//this.gridBagConstraintsProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProvisionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;		
			this.gridBagConstraintsProvisionEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProvisionEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);								
		
		
		/*
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		*/		
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProvisionEmpleado.gridx =0;
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
				
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProvisionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosProvisionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosProvisionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProvisionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProvisionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProvisionEmpleado.setName("jPanelReporteDinamicoProvisionEmpleado"); 
		
		this.jPanelReporteDinamicoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProvisionEmpleado.setLayout(gridaBagLayoutReporteDinamicoProvisionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoProvisionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProvisionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProvisionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoProvisionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoProvisionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProvisionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteProvisionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelColumnasSelectReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProvisionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProvisionEmpleado=new JScrollPane(this.jListColumnasSelectReporteProvisionEmpleado);
			
			this.jScrollColumnasSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProvisionEmpleado.add(this.jListColumnasSelectReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jScrollColumnasSelectReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProvisionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteProvisionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProvisionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProvisionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteProvisionEmpleado);
			
			this.jScrollRelacionesSelectReporteProvisionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProvisionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProvisionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProvisionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoProvisionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProvisionEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoProvisionEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelConGraficoDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProvisionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProvisionEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProvisionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jCheckBoxConGraficoDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProvisionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProvisionEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelColumnaCategoriaGraficoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProvisionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorProvisionEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelColumnaCategoriaValorProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProvisionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProvisionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jComboBoxColumnaCategoriaValorProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProvisionEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoProvisionEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelColumnasValoresGraficoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProvisionEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProvisionEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProvisionEmpleado=new JScrollPane(this.jListColumnasValoresGraficoProvisionEmpleado);
			
			this.jScrollColumnasValoresGraficoProvisionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProvisionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProvisionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProvisionEmpleado.add(this.jListColumnasSelectReporteProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jScrollColumnasValoresGraficoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelTiposGraficosReportesDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProvisionEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado.setToolTipText("Generar EXCEL"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProvisionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jComboBoxTiposReportesDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProvisionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProvisionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProvisionEmpleado.setToolTipText("Generar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jButtonGenerarReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProvisionEmpleado.setToolTipText("Cancelar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvisionEmpleado.add(this.jButtonCerrarReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProvisionEmpleado= new JScrollPane(jPanelReporteDinamicoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProvisionEmpleado);
		this.jInternalFrameReporteDinamicoProvisionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProvisionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProvisionEmpleado.setName("jPanelImportacionProvisionEmpleado"); 
		
		this.jPanelImportacionProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProvisionEmpleado.setLayout(gridaBagLayoutImportacionProvisionEmpleado);
		
		
		this.jInternalFrameImportacionProvisionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProvisionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionProvisionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProvisionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionProvisionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProvisionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionProvisionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProvisionEmpleado.add(this.jLabelArchivoImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProvisionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionProvisionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProvisionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionProvisionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProvisionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProvisionEmpleado.setToolTipText("Generar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvisionEmpleado.add(this.jButtonAbrirImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProvisionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionProvisionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProvisionEmpleado.add(this.jLabelPathArchivoImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProvisionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProvisionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProvisionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvisionEmpleado.add(this.jTextFieldPathArchivoImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionProvisionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProvisionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProvisionEmpleado.setToolTipText("Generar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvisionEmpleado.add(this.jButtonGenerarImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProvisionEmpleado.setToolTipText("Cancelar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvisionEmpleado.add(this.jButtonCerrarImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionProvisionEmpleado= new JScrollPane(jPanelImportacionProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsProvisionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProvisionEmpleado);
		this.jInternalFrameImportacionProvisionEmpleado.getContentPane().add(this.jScrollPanelImportacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProvisionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProvisionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByProvisionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProvisionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProvisionEmpleado";
			inputMap = this.jButtonAbrirOrderByProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProvisionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByProvisionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProvisionEmpleado.setName("jPanelOrderByProvisionEmpleado"); 
			
			this.jPanelOrderByProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProvisionEmpleado.setLayout(gridaBagLayoutOrderByProvisionEmpleado);
			
			
			this.jTableDatosProvisionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosProvisionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProvisionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProvisionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProvisionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProvisionEmpleadoOrderBy.setViewportView(this.jTableDatosProvisionEmpleadoOrderBy);
			this.jTableDatosProvisionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProvisionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProvisionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProvisionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProvisionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProvisionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProvisionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProvisionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByProvisionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProvisionEmpleado.setResizable(true);
			this.jInternalFrameOrderByProvisionEmpleado.setClosable(true);
			this.jInternalFrameOrderByProvisionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProvisionEmpleado.ipady =150;
				
			this.jPanelOrderByProvisionEmpleado.add(jScrollPanelDatosProvisionEmpleadoOrderBy, this.gridBagConstraintsProvisionEmpleado);//this.jTableDatosProvisionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProvisionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByProvisionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProvisionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProvisionEmpleado.setToolTipText("Cancelar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProvisionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProvisionEmpleado.add(this.jButtonCerrarOrderByProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProvisionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByProvisionEmpleado= new JScrollPane(jPanelOrderByProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProvisionEmpleado);
			
			this.jInternalFrameOrderByProvisionEmpleado.getContentPane().add(this.jScrollPanelOrderByProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByProvisionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.provisionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProvisionEmpleado.getRowHeight();//ProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.isSelected()) {
					iHeightTable=ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProvisionEmpleado.isSelected()) {
					iHeightTable=ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProvisionEmpleado!=null && this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProvisionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProvisionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProvisionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=provisionempleadoLogic.getProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provisionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProvisionEmpleado> TraerProvisionEmpleadoBeans(List<ProvisionEmpleado> provisionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProvisionEmpleado provisionempleado:provisionempleados) {
					
				if(!(ProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					provisionempleado.setsDetalleGeneralEntityReporte(ProvisionEmpleadoConstantesFunciones.getProvisionEmpleadoDescripcion(provisionempleado));
										
						
					
						
					
				} else  {
							
					//provisionempleado.setsDetalleGeneralEntityReporte(provisionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//provisionempleadobeans.add(provisionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return provisionempleados;
    }
	//PARA REPORTES FIN
}
