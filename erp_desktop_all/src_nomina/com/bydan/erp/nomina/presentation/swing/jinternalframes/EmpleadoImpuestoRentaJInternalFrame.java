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
import com.bydan.erp.nomina.util.EmpleadoImpuestoRentaConstantesFunciones;

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
public class EmpleadoImpuestoRentaJInternalFrame extends EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoImpuestoRenta;
	
	protected JMenuBar jmenuBarEmpleadoImpuestoRenta;
	
	protected JMenu jmenuEmpleadoImpuestoRenta;
	protected JMenu jmenuDatosEmpleadoImpuestoRenta;
	protected JMenu jmenuArchivoEmpleadoImpuestoRenta;
	protected JMenu jmenuAccionesEmpleadoImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsEmpleadoImpuestoRenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoImpuestoRenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoImpuestoRenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoImpuestoRenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoImpuestoRenta> empleadoimpuestorentas;		
	public List<EmpleadoImpuestoRenta> empleadoimpuestorentasEliminados;	
	public List<EmpleadoImpuestoRenta> empleadoimpuestorentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoImpuestoRenta;		
	protected JButton jButtonAbrirOrderByEmpleadoImpuestoRenta;
	
	
	//protected JPanel jPanelOrderByEmpleadoImpuestoRenta;
	//public JScrollPane jScrollPanelOrderByEmpleadoImpuestoRenta;	
	//protected JButton jButtonCerrarOrderByEmpleadoImpuestoRenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoImpuestoRentaLogic empleadoimpuestorentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoImpuestoRenta;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoImpuestoRentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoImpuestoRenta;
	//public JScrollPane jScrollPanelImportacionEmpleadoImpuestoRenta;
	
	
	
	protected JPanel jPanelAccionesEmpleadoImpuestoRenta;
	
    protected JPanel jPanelPaginacionEmpleadoImpuestoRenta;
    protected JPanel jPanelParametrosReportesEmpleadoImpuestoRenta;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoImpuestoRenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoImpuestoRenta;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoImpuestoRenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoImpuestoRenta;
	//protected JPanel jPanelImportacionEmpleadoImpuestoRenta;
	
	
	public JTable jTableDatosEmpleadoImpuestoRenta;
	
	
	
	//public JTable jTableDatosEmpleadoImpuestoRentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoImpuestoRenta;
	protected JButton jButtonDuplicarEmpleadoImpuestoRenta;
	protected JButton jButtonCopiarEmpleadoImpuestoRenta;
	protected JButton jButtonVerFormEmpleadoImpuestoRenta;
	protected JButton jButtonNuevoRelacionesEmpleadoImpuestoRenta;
	protected JButton jButtonModificarEmpleadoImpuestoRenta;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoImpuestoRenta;
	protected JButton jButtonCerrarEmpleadoImpuestoRenta;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoImpuestoRenta;
	protected JButton jButtonProcesarInformacionEmpleadoImpuestoRenta;
	
	
	protected JButton jButtonAnterioresEmpleadoImpuestoRenta;
	protected JButton jButtonSiguientesEmpleadoImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoImpuestoRenta;
	//protected JButton jButtonGenerarImportacionEmpleadoImpuestoRenta;
	//protected JButton jButtonCerrarImportacionEmpleadoImpuestoRenta;
	//protected JFileChooser jFileChooserImportacionEmpleadoImpuestoRenta;
	//protected File fileImportacionEmpleadoImpuestoRenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonDuplicarToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonCopiarToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonVerFormToolBarEmpleadoImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonCerrarToolBarEmpleadoImpuestoRenta;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonAnterioresToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonSiguientesToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDuplicarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoImpuestoRenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemCopiarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemVerFormEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemCerrarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemAnterioresEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemSiguientesEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoImpuestoRenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoImpuestoRenta;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoImpuestoRenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoImpuestoRenta;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoImpuestoRenta;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoImpuestoRenta;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoImpuestoRenta;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoImpuestoRenta;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoImpuestoRenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoImpuestoRenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoImpuestoRenta;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoImpuestoRenta;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoImpuestoRenta;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoImpuestoRenta;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoImpuestoRenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoImpuestoRenta;
	public JPanel jPanelFK_IdAnioEmpleadoImpuestoRenta;
	public JButton jButtonFK_IdAnioEmpleadoImpuestoRenta;
	public JPanel jPanelFK_IdEmpleadoEmpleadoImpuestoRenta;
	public JButton jButtonFK_IdEmpleadoEmpleadoImpuestoRenta;
	public JPanel jPanelFK_IdEstructuraEmpleadoImpuestoRenta;
	public JButton jButtonFK_IdEstructuraEmpleadoImpuestoRenta;
	public JPanel jPanelFK_IdMesEmpleadoImpuestoRenta;
	public JButton jButtonFK_IdMesEmpleadoImpuestoRenta;
	
	public JPanel jPanelid_anioFK_IdAnioEmpleadoImpuestoRenta;
	public JLabel jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta;
	public JButton jButtonid_anioFK_IdAnioEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta;
	public JLabel jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta;
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoImpuestoRentaBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoImpuestoRentaArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesEmpleadoImpuestoRenta;
	public JLabel jLabelid_mesFK_IdMesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta;
	public JButton jButtonid_mesFK_IdMesEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoImpuestoRentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoImpuestoRenta)	{
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta = jButtonRecargarInformacionEmpleadoImpuestoRenta;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoImpuestoRenta() {
		return this.jButtonProcesarInformacionEmpleadoImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoImpuestoRenta)	{
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta = jButtonProcesarInformacionEmpleadoImpuestoRenta;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoImpuestoRenta() {
		return this.jButtonRecargarInformacionEmpleadoImpuestoRenta;
	}
	
	
	public List<EmpleadoImpuestoRenta> getempleadoimpuestorentas() {
		return this.empleadoimpuestorentas;
	}

	public void setempleadoimpuestorentas(List<EmpleadoImpuestoRenta> empleadoimpuestorentas) {
		this.empleadoimpuestorentas = empleadoimpuestorentas;
	}
	
	public List<EmpleadoImpuestoRenta> getempleadoimpuestorentasAux() {
		return this.empleadoimpuestorentasAux;
	}

	public void setempleadoimpuestorentasAux(List<EmpleadoImpuestoRenta> empleadoimpuestorentasAux) {
		this.empleadoimpuestorentasAux = empleadoimpuestorentasAux;
	}
	
	public List<EmpleadoImpuestoRenta> getempleadoimpuestorentasEliminados() {
		return this.empleadoimpuestorentasEliminados;
	}

	public void setEmpleadoImpuestoRentasEliminados(List<EmpleadoImpuestoRenta> empleadoimpuestorentasEliminados) {
		this.empleadoimpuestorentasEliminados = empleadoimpuestorentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoImpuestoRenta() {
		return jComboBoxTiposSeleccionarEmpleadoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposSeleccionarEmpleadoImpuestoRenta) {
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta = jComboBoxTiposSeleccionarEmpleadoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoImpuestoRenta() {
		return jTextFieldValorCampoGeneralEmpleadoImpuestoRenta;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoImpuestoRenta(
			JTextField jTextFieldValorCampoGeneralEmpleadoImpuestoRenta) {
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta = jTextFieldValorCampoGeneralEmpleadoImpuestoRenta;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoImpuestoRenta() {
		return this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoImpuestoRenta(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta) {
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta = jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoImpuestoRenta() {
		return this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta;
	}

	public void setjCheckBoxSeleccionadosEmpleadoImpuestoRenta(
			JCheckBox jCheckBoxSeleccionadosEmpleadoImpuestoRenta) {
		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta = jCheckBoxSeleccionadosEmpleadoImpuestoRenta;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta = jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposReportesEmpleadoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposReportesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta = jComboBoxTiposReportesEmpleadoImpuestoRenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta = jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta = jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta = jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposPaginacionEmpleadoImpuestoRenta) {
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta = jComboBoxTiposPaginacionEmpleadoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta = jComboBoxTiposRelacionesEmpleadoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta = jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta = jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoImpuestoRenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoImpuestoRenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta .setBorder(borderResaltar);		
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
		this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		
		this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoImpuestoRenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"copiar","copiar","Copiar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"ver_form","ver_form","Ver"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"recargar","recargar","Recargar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,
							"cerrar","cerrar","Salir"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta;
			
				this.jButtonProcesarInformacionToolBarEmpleadoImpuestoRenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoImpuestoRenta;
				
		//protected JButton jButtonModificarToolBarEmpleadoImpuestoRenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoImpuestoRenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoImpuestoRenta=new JMenuMe("General");
		this.jmenuArchivoEmpleadoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoImpuestoRenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoImpuestoRenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoImpuestoRenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoImpuestoRenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoImpuestoRenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoImpuestoRenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoImpuestoRenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoImpuestoRenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoImpuestoRenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoImpuestoRenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoImpuestoRenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoImpuestoRenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoImpuestoRenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoImpuestoRenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoImpuestoRenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoImpuestoRenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoImpuestoRenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoImpuestoRenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoImpuestoRenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoImpuestoRenta.add(this.jMenuItemCerrarEmpleadoImpuestoRenta);
			
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemNuevoEmpleadoImpuestoRenta);
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta);
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta);
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta);		
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemDuplicarEmpleadoImpuestoRenta);		
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemCopiarEmpleadoImpuestoRenta);		
			this.jmenuAccionesEmpleadoImpuestoRenta.add(this.jMenuItemVerFormEmpleadoImpuestoRenta);		
			
			this.jmenuDatosEmpleadoImpuestoRenta.add(this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta);				
			this.jmenuDatosEmpleadoImpuestoRenta.add(this.jMenuItemAnterioresEmpleadoImpuestoRenta);				
			this.jmenuDatosEmpleadoImpuestoRenta.add(this.jMenuItemSiguientesEmpleadoImpuestoRenta);				
			this.jmenuDatosEmpleadoImpuestoRenta.add(this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta);				
			this.jmenuDatosEmpleadoImpuestoRenta.add(this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoImpuestoRenta.add(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoImpuestoRenta.add(this.jmenuArchivoEmpleadoImpuestoRenta);		
			this.jmenuBarEmpleadoImpuestoRenta.add(this.jmenuAccionesEmpleadoImpuestoRenta);		
			this.jmenuBarEmpleadoImpuestoRenta.add(this.jmenuDatosEmpleadoImpuestoRenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoImpuestoRenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoImpuestoRenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioEmpleadoImpuestoRenta.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonFK_IdAnioEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonFK_IdAnioEmpleadoImpuestoRenta.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioEmpleadoImpuestoRenta,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta = new JLabelMe();
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta.setText("Anio :");
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesEmpleadoImpuestoRenta.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonFK_IdMesEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonFK_IdMesEmpleadoImpuestoRenta.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesEmpleadoImpuestoRenta,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta = new JLabelMe();
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta.setText("Mes :");
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta.setToolTipText("Mes");
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoImpuestoRenta=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoImpuestoRenta = new EmpleadoImpuestoRentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Impuesto Renta DATOS");
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta = new EmpleadoImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones(),this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta = null;//new EmpleadoImpuestoRentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoImpuestoRenta= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoImpuestoRenta = new JTableMe();      
		
		String sToolTipEmpleadoImpuestoRenta="";
		sToolTipEmpleadoImpuestoRenta=EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoImpuestoRenta+="(Nomina.EmpleadoImpuestoRenta)";
		}
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoImpuestoRenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoImpuestoRenta.setToolTipText(sToolTipEmpleadoImpuestoRenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoImpuestoRenta);
		this.jTableDatosEmpleadoImpuestoRenta.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonDuplicarEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonCopiarEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonVerFormEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarEmpleadoImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Impuesto Renta";
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoImpuestoRenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta=new ReporteDinamicoJInternalFrame(EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoImpuestoRenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoImpuestoRenta=new ImportacionJInternalFrame(EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoImpuestoRenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoImpuestoRenta = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoImpuestoRenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoImpuestoRenta,false,this);
			
			//this.cargarOrderByEmpleadoImpuestoRenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoImpuestoRenta,true,this);
			
			//this.cargarOrderByEmpleadoImpuestoRenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoImpuestoRenta.setText("Nuevo");
		this.jButtonDuplicarEmpleadoImpuestoRenta.setText("Duplicar");
		this.jButtonCopiarEmpleadoImpuestoRenta.setText("Copiar");
		this.jButtonVerFormEmpleadoImpuestoRenta.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setText("Guardar");
		this.jButtonCerrarEmpleadoImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoImpuestoRenta,"nuevo_button","Nuevo",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoImpuestoRenta,"duplicar_button","Duplicar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoImpuestoRenta,"copiar_button","Copiar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoImpuestoRenta,"ver_form","Ver",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoImpuestoRenta,"nuevorelaciones_button","Nuevo Rel",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta,"guardarcambiostabla_button","Guardar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoImpuestoRenta,"cerrar_button","Salir",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoImpuestoRenta.setToolTipText("Nuevo"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoImpuestoRenta.setToolTipText("Duplicar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoImpuestoRenta.setToolTipText("Copiar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoImpuestoRenta.setToolTipText("Ver"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.setToolTipText("Nuevo Rel"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setToolTipText("Guardar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoImpuestoRenta.setToolTipText("Salir"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoImpuestoRenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoImpuestoRenta";
		inputMap = this.jButtonDuplicarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoImpuestoRenta"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCopiarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoImpuestoRenta"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoImpuestoRenta";
		inputMap = this.jButtonVerFormEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoImpuestoRenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoImpuestoRenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoImpuestoRenta";
		inputMap = this.jButtonModificarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoImpuestoRenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCerrarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoImpuestoRenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoImpuestoRenta.setName("jPanelParametrosReportesEmpleadoImpuestoRenta"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta.setName("jPanelParametrosReportesAccionesEmpleadoImpuestoRenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.setToolTipText("Recargar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoImpuestoRenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setToolTipText("Procesar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesEmpleadoImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoImpuestoRenta = new JButtonMe();
		//this.jButtonAnterioresEmpleadoImpuestoRenta.setText("<<");
        this.jButtonAnterioresEmpleadoImpuestoRenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoImpuestoRenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoImpuestoRenta = new JButtonMe();
		//this.jButtonSiguientesEmpleadoImpuestoRenta.setText(">>");
        this.jButtonSiguientesEmpleadoImpuestoRenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoImpuestoRenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta,"nuevoguardarcambios_button","Nue",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoImpuestoRenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoImpuestoRenta";
		inputMap = this.jButtonRecargarInformacionEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoImpuestoRenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoImpuestoRenta";
		inputMap = this.jButtonSiguientesEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoImpuestoRenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoImpuestoRenta";
		inputMap = this.jButtonAnterioresEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoImpuestoRenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoImpuestoRenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoImpuestoRenta = new GridBagLayout();

			this.jPanelPaginacionEmpleadoImpuestoRenta.setLayout(gridaBagLayoutPaginacionEmpleadoImpuestoRenta);						
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonAnterioresEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					
						
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
			
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
						
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonSiguientesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonNuevoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
						
			
			
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			}
			
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonDuplicarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonCopiarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonVerFormEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoImpuestoRenta.add(this.jButtonCerrarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoImpuestoRenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoImpuestoRenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.setLayout(gridaBagParametrosReportesEmpleadoImpuestoRenta);
			this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta.setLayout(gridaBagParametrosReportesAccionesEmpleadoImpuestoRenta);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar1EmpleadoImpuestoRenta);
			this.jPanelParametrosAuxiliar2EmpleadoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2EmpleadoImpuestoRenta);
			this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar3EmpleadoImpuestoRenta);
			this.jPanelParametrosAuxiliar4EmpleadoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar4EmpleadoImpuestoRenta);
			//this.jPanelParametrosAuxiliar5EmpleadoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2EmpleadoImpuestoRenta);			
			
			
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jButtonRecargarInformacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta.add(this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta.add(this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta.add(this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jPanelParametrosAuxiliar1EmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoImpuestoRenta.add(this.jComboBoxTiposReportesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);																		
			
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EmpleadoImpuestoRenta.add(this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jPanelParametrosAuxiliar4EmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jComboBoxTiposReportesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jCheckBoxGenerarReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jPanelParametrosAuxiliar2EmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jLabelAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jButtonAbrirOrderByEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			
			
			/*
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta.add(this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);															
				
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta.add(this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);															
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta.add(this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jPanelParametrosAuxiliar3EmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jComboBoxTiposAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
	
				
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.add(this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoImpuestoRenta = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoImpuestoRenta.setLayout(gridaBagLayoutDatosEmpleadoImpuestoRenta);
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoImpuestoRenta.add(this.jTableDatosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setViewportView(this.jTableDatosEmpleadoImpuestoRenta);
		this.jTableDatosEmpleadoImpuestoRenta.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoImpuestoRenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesEmpleadoImpuestoRenta.setLayout(gridaBagLayoutAccionesEmpleadoImpuestoRenta);
		
		
		/*	
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
			
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonNuevoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta= new GridBagLayout();
		gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioEmpleadoImpuestoRenta.setLayout(gridaBagLayoutFK_IdAnioEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		jPanelFK_IdAnioEmpleadoImpuestoRenta.add(jLabelid_anioFK_IdAnioEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
		jPanelFK_IdAnioEmpleadoImpuestoRenta.add(jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx =1;
		jPanelFK_IdAnioEmpleadoImpuestoRenta.add(jButtonFK_IdAnioEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		jTabbedPaneBusquedasEmpleadoImpuestoRenta.addTab("1.-Por Anio ", jPanelFK_IdAnioEmpleadoImpuestoRenta);
		jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoImpuestoRenta.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoImpuestoRenta.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoImpuestoRenta.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoImpuestoRenta.add(jButtonFK_IdEmpleadoEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		jTabbedPaneBusquedasEmpleadoImpuestoRenta.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);
		jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEmpleadoImpuestoRenta.setLayout(gridaBagLayoutFK_IdEstructuraEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		jPanelFK_IdEstructuraEmpleadoImpuestoRenta.add(jLabelid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
		jPanelFK_IdEstructuraEmpleadoImpuestoRenta.add(jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx =1;
		jPanelFK_IdEstructuraEmpleadoImpuestoRenta.add(jButtonFK_IdEstructuraEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		jTabbedPaneBusquedasEmpleadoImpuestoRenta.addTab("3.-Por Estructura ", jPanelFK_IdEstructuraEmpleadoImpuestoRenta);
		jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta= new GridBagLayout();
		gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesEmpleadoImpuestoRenta.setLayout(gridaBagLayoutFK_IdMesEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		jPanelFK_IdMesEmpleadoImpuestoRenta.add(jLabelid_mesFK_IdMesEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
		jPanelFK_IdMesEmpleadoImpuestoRenta.add(jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoImpuestoRenta.gridy = 1;
		gridBagConstraintsEmpleadoImpuestoRenta.gridx =1;
		jPanelFK_IdMesEmpleadoImpuestoRenta.add(jButtonFK_IdMesEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);

		jTabbedPaneBusquedasEmpleadoImpuestoRenta.addTab("4.-Por Mes ", jPanelFK_IdMesEmpleadoImpuestoRenta);
		jTabbedPaneBusquedasEmpleadoImpuestoRenta.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoImpuestoRenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsEmpleadoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;		
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);								
		
		
		/*
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/		
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
				
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoImpuestoRenta = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoImpuestoRenta.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoImpuestoRenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoImpuestoRenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setName("jPanelReporteDinamicoEmpleadoImpuestoRenta"); 
		
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.setLayout(gridaBagLayoutReporteDinamicoEmpleadoImpuestoRenta);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelColumnasSelectReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoImpuestoRenta = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta=new JScrollPane(this.jListColumnasSelectReporteEmpleadoImpuestoRenta);
			
			this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jListColumnasSelectReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoImpuestoRenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoImpuestoRenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoImpuestoRenta=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoImpuestoRenta);
			
			this.jScrollRelacionesSelectReporteEmpleadoImpuestoRenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoImpuestoRenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoImpuestoRenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoImpuestoRenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelConGraficoDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jCheckBoxConGraficoDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelColumnaCategoriaGraficoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelColumnaCategoriaValorEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jComboBoxColumnaCategoriaValorEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelColumnasValoresGraficoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpleadoImpuestoRenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpleadoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpleadoImpuestoRenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta=new JScrollPane(this.jListColumnasValoresGraficoEmpleadoImpuestoRenta);
			
			this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jListColumnasSelectReporteEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jScrollColumnasValoresGraficoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelTiposGraficosReportesDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoImpuestoRenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jComboBoxTiposGraficosReportesDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.setToolTipText("Generar EXCEL"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jComboBoxTiposReportesDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta.setToolTipText("Generar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta.setToolTipText("Cancelar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoImpuestoRenta.add(this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta= new JScrollPane(jPanelReporteDinamicoEmpleadoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoImpuestoRenta);
		this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoImpuestoRenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoImpuestoRenta.setName("jPanelImportacionEmpleadoImpuestoRenta"); 
		
		this.jPanelImportacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoImpuestoRenta.setLayout(gridaBagLayoutImportacionEmpleadoImpuestoRenta);
		
		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoImpuestoRenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoImpuestoRenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoImpuestoRenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jLabelArchivoImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoImpuestoRenta = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoImpuestoRenta.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoImpuestoRenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoImpuestoRenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoImpuestoRenta.setToolTipText("Generar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jButtonAbrirImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jLabelPathArchivoImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jTextFieldPathArchivoImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoImpuestoRenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoImpuestoRenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoImpuestoRenta.setToolTipText("Generar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jButtonGenerarImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoImpuestoRenta.setToolTipText("Cancelar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoImpuestoRenta.add(this.jButtonCerrarImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoImpuestoRenta= new JScrollPane(jPanelImportacionEmpleadoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoImpuestoRenta);
		this.jInternalFrameImportacionEmpleadoImpuestoRenta.getContentPane().add(this.jScrollPanelImportacionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoImpuestoRenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoImpuestoRenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoImpuestoRenta";
			inputMap = this.jButtonAbrirOrderByEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoImpuestoRenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoImpuestoRenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoImpuestoRenta.setName("jPanelOrderByEmpleadoImpuestoRenta"); 
			
			this.jPanelOrderByEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoImpuestoRenta.setLayout(gridaBagLayoutOrderByEmpleadoImpuestoRenta);
			
			
			this.jTableDatosEmpleadoImpuestoRentaOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoImpuestoRentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoImpuestoRentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoImpuestoRentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoImpuestoRentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoImpuestoRentaOrderBy.setViewportView(this.jTableDatosEmpleadoImpuestoRentaOrderBy);
			this.jTableDatosEmpleadoImpuestoRentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoImpuestoRentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoImpuestoRenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoImpuestoRenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoImpuestoRenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoImpuestoRenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setResizable(true);
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setClosable(true);
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoImpuestoRenta.ipady =150;
				
			this.jPanelOrderByEmpleadoImpuestoRenta.add(jScrollPanelDatosEmpleadoImpuestoRentaOrderBy, this.gridBagConstraintsEmpleadoImpuestoRenta);//this.jTableDatosEmpleadoImpuestoRentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoImpuestoRenta = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoImpuestoRenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoImpuestoRenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoImpuestoRenta.setToolTipText("Cancelar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoImpuestoRenta.add(this.jButtonCerrarOrderByEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoImpuestoRenta = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoImpuestoRenta= new JScrollPane(jPanelOrderByEmpleadoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoImpuestoRenta);
			
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getContentPane().add(this.jScrollPanelOrderByEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoImpuestoRenta.getRowHeight();//EmpleadoImpuestoRentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.isSelected()) {
					iHeightTable=EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoImpuestoRenta.isSelected()) {
					iHeightTable=EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoImpuestoRenta!=null && this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoimpuestorentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoImpuestoRenta> TraerEmpleadoImpuestoRentaBeans(List<EmpleadoImpuestoRenta> empleadoimpuestorentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentas) {
					
				if(!(EmpleadoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoimpuestorenta.setsDetalleGeneralEntityReporte(EmpleadoImpuestoRentaConstantesFunciones.getEmpleadoImpuestoRentaDescripcion(empleadoimpuestorenta));
										
						
					
						
					
				} else  {
							
					//empleadoimpuestorenta.setsDetalleGeneralEntityReporte(empleadoimpuestorenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoimpuestorentabeans.add(empleadoimpuestorentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoimpuestorentas;
    }
	//PARA REPORTES FIN
}
