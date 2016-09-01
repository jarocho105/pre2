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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.inventario.util.DetalleMensajeCorreoInvenConstantesFunciones;

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
public class DetalleMensajeCorreoInvenJInternalFrame extends DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleMensajeCorreoInven;
	
	protected JMenuBar jmenuBarDetalleMensajeCorreoInven;
	
	protected JMenu jmenuDetalleMensajeCorreoInven;
	protected JMenu jmenuDatosDetalleMensajeCorreoInven;
	protected JMenu jmenuArchivoDetalleMensajeCorreoInven;
	protected JMenu jmenuAccionesDetalleMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsDetalleMensajeCorreoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleMensajeCorreoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleMensajeCorreoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleMensajeCorreoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mensajecorreoinven="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean;
		
	
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleMensajeCorreoInven> detallemensajecorreoinvens;		
	public List<DetalleMensajeCorreoInven> detallemensajecorreoinvensEliminados;	
	public List<DetalleMensajeCorreoInven> detallemensajecorreoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleMensajeCorreoInven;		
	protected JButton jButtonAbrirOrderByDetalleMensajeCorreoInven;
	
	
	//protected JPanel jPanelOrderByDetalleMensajeCorreoInven;
	//public JScrollPane jScrollPanelOrderByDetalleMensajeCorreoInven;	
	//protected JButton jButtonCerrarOrderByDetalleMensajeCorreoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionDetalleMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralDetalleMensajeCorreoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleMensajeCorreoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleMensajeCorreoInven;
	//public JScrollPane jScrollPanelImportacionDetalleMensajeCorreoInven;
	
	
	
	protected JPanel jPanelAccionesDetalleMensajeCorreoInven;
	
    protected JPanel jPanelPaginacionDetalleMensajeCorreoInven;
    protected JPanel jPanelParametrosReportesDetalleMensajeCorreoInven;
	protected JPanel jPanelParametrosReportesAccionesDetalleMensajeCorreoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar2DetalleMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar3DetalleMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar4DetalleMensajeCorreoInven;
	//protected JPanel jPanelParametrosAuxiliar5DetalleMensajeCorreoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleMensajeCorreoInven;
	//protected JPanel jPanelImportacionDetalleMensajeCorreoInven;
	
	
	public JTable jTableDatosDetalleMensajeCorreoInven;
	
	
	
	//public JTable jTableDatosDetalleMensajeCorreoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleMensajeCorreoInven;
	protected JButton jButtonDuplicarDetalleMensajeCorreoInven;
	protected JButton jButtonCopiarDetalleMensajeCorreoInven;
	protected JButton jButtonVerFormDetalleMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesDetalleMensajeCorreoInven;
	protected JButton jButtonModificarDetalleMensajeCorreoInven;
	
    protected JButton jButtonGuardarCambiosTablaDetalleMensajeCorreoInven;
	protected JButton jButtonCerrarDetalleMensajeCorreoInven;
	
	
	protected JButton jButtonRecargarInformacionDetalleMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionDetalleMensajeCorreoInven;
	
	
	protected JButton jButtonAnterioresDetalleMensajeCorreoInven;
	protected JButton jButtonSiguientesDetalleMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven;
	//protected JButton jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleMensajeCorreoInven;
	//protected JButton jButtonGenerarImportacionDetalleMensajeCorreoInven;
	//protected JButton jButtonCerrarImportacionDetalleMensajeCorreoInven;
	//protected JFileChooser jFileChooserImportacionDetalleMensajeCorreoInven;
	//protected File fileImportacionDetalleMensajeCorreoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonDuplicarToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonCopiarToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonVerFormToolBarDetalleMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarDetalleMensajeCorreoInven;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonAnterioresToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonSiguientesToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonAbrirOrderByToolBarDetalleMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDuplicarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleMensajeCorreoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemCopiarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemVerFormDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemProcesarInformacionDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemAnterioresDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemSiguientesDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemAbrirOrderByDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMensajeCorreoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven;
	protected JCheckBox jCheckBoxSeleccionadosDetalleMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleMensajeCorreoInven;
	protected JTextField jTextFieldValorCampoGeneralDetalleMensajeCorreoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleMensajeCorreoInven;
	//public JList<Reporte> jListColumnasSelectReporteDetalleMensajeCorreoInven;
	//public JScrollPane jScrollColumnasSelectReporteDetalleMensajeCorreoInven;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleMensajeCorreoInven;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleMensajeCorreoInven;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleMensajeCorreoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleMensajeCorreoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven;
	
		
	//public JLabel jLabelArchivoImportacionDetalleMensajeCorreoInven;	
	//public JLabel jLabelPathArchivoImportacionDetalleMensajeCorreoInven;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleMensajeCorreoInven;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleMensajeCorreoInven;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleMensajeCorreoInven;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleMensajeCorreoInven;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleMensajeCorreoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleMensajeCorreoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleMensajeCorreoInven;
	public JPanel jPanelFK_IdEmpleadoDetalleMensajeCorreoInven;
	public JButton jButtonFK_IdEmpleadoDetalleMensajeCorreoInven;
	public JPanel jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven;
	public JButton jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven;
	public JPanel jPanelFK_IdUsuarioDetalleMensajeCorreoInven;
	public JButton jButtonFK_IdUsuarioDetalleMensajeCorreoInven;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven;
	public JLabel jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven;
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven;
	public JLabel jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven;
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven;
	public JLabel jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven;
	public JButton jButtonid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleMensajeCorreoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleMensajeCorreoInven)	{
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven = jButtonRecargarInformacionDetalleMensajeCorreoInven;
	}
	
	public JButton getjButtonProcesarInformacionDetalleMensajeCorreoInven() {
		return this.jButtonProcesarInformacionDetalleMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMensajeCorreoInven)	{
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven = jButtonProcesarInformacionDetalleMensajeCorreoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleMensajeCorreoInven() {
		return this.jButtonRecargarInformacionDetalleMensajeCorreoInven;
	}
	
	
	public List<DetalleMensajeCorreoInven> getdetallemensajecorreoinvens() {
		return this.detallemensajecorreoinvens;
	}

	public void setdetallemensajecorreoinvens(List<DetalleMensajeCorreoInven> detallemensajecorreoinvens) {
		this.detallemensajecorreoinvens = detallemensajecorreoinvens;
	}
	
	public List<DetalleMensajeCorreoInven> getdetallemensajecorreoinvensAux() {
		return this.detallemensajecorreoinvensAux;
	}

	public void setdetallemensajecorreoinvensAux(List<DetalleMensajeCorreoInven> detallemensajecorreoinvensAux) {
		this.detallemensajecorreoinvensAux = detallemensajecorreoinvensAux;
	}
	
	public List<DetalleMensajeCorreoInven> getdetallemensajecorreoinvensEliminados() {
		return this.detallemensajecorreoinvensEliminados;
	}

	public void setDetalleMensajeCorreoInvensEliminados(List<DetalleMensajeCorreoInven> detallemensajecorreoinvensEliminados) {
		this.detallemensajecorreoinvensEliminados = detallemensajecorreoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleMensajeCorreoInven() {
		return jComboBoxTiposSeleccionarDetalleMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposSeleccionarDetalleMensajeCorreoInven) {
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven = jComboBoxTiposSeleccionarDetalleMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleMensajeCorreoInven() {
		return jTextFieldValorCampoGeneralDetalleMensajeCorreoInven;
	}

	public void setjTextFieldValorCampoGeneralDetalleMensajeCorreoInven(
			JTextField jTextFieldValorCampoGeneralDetalleMensajeCorreoInven) {
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven = jTextFieldValorCampoGeneralDetalleMensajeCorreoInven;
	}

	public void setBorderResaltarValorCampoGeneralDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleMensajeCorreoInven() {
		return this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionarTodosDetalleMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven) {
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven = jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven;
	}

	public void setBorderResaltarSeleccionarTodosDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleMensajeCorreoInven() {
		return this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionadosDetalleMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionadosDetalleMensajeCorreoInven) {
		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven = jCheckBoxSeleccionadosDetalleMensajeCorreoInven;
	}
	
	public void setBorderResaltarSeleccionadosDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven = jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposReportesDetalleMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposReportesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven = jComboBoxTiposReportesDetalleMensajeCorreoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven() {
	//	return jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven) {
	//	this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven = jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven = jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven;
	//}
	
	public void setBorderResaltarTiposReportesDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven = jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposPaginacionDetalleMensajeCorreoInven) {
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven = jComboBoxTiposPaginacionDetalleMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven = jComboBoxTiposRelacionesDetalleMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven = jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven() {
	//	return jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven) {
	//	this.jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven = jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleMensajeCorreoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleMensajeCorreoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven .setBorder(borderResaltar);		
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
		this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		
		this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Mensaje Correo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMensajeCorreoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"nuevo","nuevo","Nuevo"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"duplicar","duplicar","Duplicar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"copiar","copiar","Copiar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"ver_form","ver_form","Ver"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"recargar","recargar","Recargar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"cerrar","cerrar","Salir"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven;
			
				this.jButtonProcesarInformacionToolBarDetalleMensajeCorreoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleMensajeCorreoInven;
				
		//protected JButton jButtonModificarToolBarDetalleMensajeCorreoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleMensajeCorreoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleMensajeCorreoInven=new JMenuMe("General");
		this.jmenuArchivoDetalleMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDatosDetalleMensajeCorreoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleMensajeCorreoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleMensajeCorreoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleMensajeCorreoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleMensajeCorreoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleMensajeCorreoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleMensajeCorreoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleMensajeCorreoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleMensajeCorreoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleMensajeCorreoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleMensajeCorreoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleMensajeCorreoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleMensajeCorreoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleMensajeCorreoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleMensajeCorreoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleMensajeCorreoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleMensajeCorreoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleMensajeCorreoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleMensajeCorreoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleMensajeCorreoInven.add(this.jMenuItemCerrarDetalleMensajeCorreoInven);
			
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemNuevoDetalleMensajeCorreoInven);
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven);
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven);
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven);		
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemDuplicarDetalleMensajeCorreoInven);		
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemCopiarDetalleMensajeCorreoInven);		
			this.jmenuAccionesDetalleMensajeCorreoInven.add(this.jMenuItemVerFormDetalleMensajeCorreoInven);		
			
			this.jmenuDatosDetalleMensajeCorreoInven.add(this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven);				
			this.jmenuDatosDetalleMensajeCorreoInven.add(this.jMenuItemAnterioresDetalleMensajeCorreoInven);				
			this.jmenuDatosDetalleMensajeCorreoInven.add(this.jMenuItemSiguientesDetalleMensajeCorreoInven);				
			this.jmenuDatosDetalleMensajeCorreoInven.add(this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven);				
			this.jmenuDatosDetalleMensajeCorreoInven.add(this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleMensajeCorreoInven.add(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuArchivoDetalleMensajeCorreoInven);		
			this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuAccionesDetalleMensajeCorreoInven);		
			this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuDatosDetalleMensajeCorreoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleMensajeCorreoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleMensajeCorreoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setToolTipText("Buscar Por Mensaje Correo Inven ");
		this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setToolTipText("Buscar Por Mensaje Correo Inven ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven,"buscar_button","Buscar Por Mensaje Correo Inven ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven = new JLabelMe();
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setText("Mensaje Correo Inven :");
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setToolTipText("Mensaje Correo Inven");
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven.setToolTipText("Buscar Por Usuario ");
		this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven.setToolTipText("Buscar Por Usuario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven,"buscar_button","Buscar Por Usuario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven = new JLabelMe();
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setText("Usuario :");
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setToolTipText("Usuario");
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleMensajeCorreoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleMensajeCorreoInven = new DetalleMensajeCorreoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Mensaje Correo Inven DATOS");
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven = new DetalleMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven = null;//new DetalleMensajeCorreoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleMensajeCorreoInven= new GridBagLayout();
		
		
		this.jTableDatosDetalleMensajeCorreoInven = new JTableMe();      
		
		String sToolTipDetalleMensajeCorreoInven="";
		sToolTipDetalleMensajeCorreoInven=DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMensajeCorreoInven+="(Inventario.DetalleMensajeCorreoInven)";
		}
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleMensajeCorreoInven.setToolTipText(sToolTipDetalleMensajeCorreoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleMensajeCorreoInven);
		this.jTableDatosDetalleMensajeCorreoInven.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionAllowed(true);
		this.jTableDatosDetalleMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonDuplicarDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonCopiarDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonVerFormDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarDetalleMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Mensaje Correo Inven";
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMensajeCorreoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven=new ReporteDinamicoJInternalFrame(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleMensajeCorreoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleMensajeCorreoInven=new ImportacionJInternalFrame(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleMensajeCorreoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleMensajeCorreoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setText("Orden");
		this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMensajeCorreoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMensajeCorreoInven,false,this);
			
			//this.cargarOrderByDetalleMensajeCorreoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMensajeCorreoInven,true,this);
			
			//this.cargarOrderByDetalleMensajeCorreoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleMensajeCorreoInven.setText("Nuevo");
		this.jButtonDuplicarDetalleMensajeCorreoInven.setText("Duplicar");
		this.jButtonCopiarDetalleMensajeCorreoInven.setText("Copiar");
		this.jButtonVerFormDetalleMensajeCorreoInven.setText("Ver");
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarDetalleMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMensajeCorreoInven,"nuevo_button","Nuevo",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleMensajeCorreoInven,"duplicar_button","Duplicar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleMensajeCorreoInven,"copiar_button","Copiar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleMensajeCorreoInven,"ver_form","Ver",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMensajeCorreoInven,"cerrar_button","Salir",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleMensajeCorreoInven.setToolTipText("Nuevo"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleMensajeCorreoInven.setToolTipText("Duplicar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleMensajeCorreoInven.setToolTipText("Copiar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleMensajeCorreoInven.setToolTipText("Ver"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.setToolTipText("Nuevo Rel"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setToolTipText("Guardar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMensajeCorreoInven.setToolTipText("Salir"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMensajeCorreoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleMensajeCorreoInven";
		inputMap = this.jButtonDuplicarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleMensajeCorreoInven"));
		
		//COPIAR
		sMapKey = "CopiarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCopiarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleMensajeCorreoInven"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleMensajeCorreoInven";
		inputMap = this.jButtonVerFormDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleMensajeCorreoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleMensajeCorreoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleMensajeCorreoInven";
		inputMap = this.jButtonModificarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleMensajeCorreoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCerrarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMensajeCorreoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleMensajeCorreoInven.setName("jPanelParametrosReportesDetalleMensajeCorreoInven"); 
		
		this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven.setName("jPanelParametrosReportesAccionesDetalleMensajeCorreoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.setText("Recargar");
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.setToolTipText("Recargar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleMensajeCorreoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setText("Procesar");
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setToolTipText("Procesar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesDetalleMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleMensajeCorreoInven = new JButtonMe();
		//this.jButtonAnterioresDetalleMensajeCorreoInven.setText("<<");
        this.jButtonAnterioresDetalleMensajeCorreoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleMensajeCorreoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleMensajeCorreoInven = new JButtonMe();
		//this.jButtonSiguientesDetalleMensajeCorreoInven.setText(">>");
        this.jButtonSiguientesDetalleMensajeCorreoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleMensajeCorreoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven,"nuevoguardarcambios_button","Nue",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleMensajeCorreoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleMensajeCorreoInven";
		inputMap = this.jButtonRecargarInformacionDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleMensajeCorreoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleMensajeCorreoInven";
		inputMap = this.jButtonSiguientesDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleMensajeCorreoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleMensajeCorreoInven";
		inputMap = this.jButtonAnterioresDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleMensajeCorreoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleMensajeCorreoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleMensajeCorreoInven = new GridBagLayout();

			this.jPanelPaginacionDetalleMensajeCorreoInven.setLayout(gridaBagLayoutPaginacionDetalleMensajeCorreoInven);						
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonAnterioresDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					
						
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
			
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
						
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonSiguientesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonNuevoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
						
			
			
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			}
			
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonDuplicarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonCopiarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonVerFormDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleMensajeCorreoInven.add(this.jButtonCerrarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
		
		
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleMensajeCorreoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleMensajeCorreoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.setLayout(gridaBagParametrosReportesDetalleMensajeCorreoInven);
			this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven.setLayout(gridaBagParametrosReportesAccionesDetalleMensajeCorreoInven);
			
			
			this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar1DetalleMensajeCorreoInven);
			this.jPanelParametrosAuxiliar2DetalleMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2DetalleMensajeCorreoInven);
			this.jPanelParametrosAuxiliar3DetalleMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar3DetalleMensajeCorreoInven);
			this.jPanelParametrosAuxiliar4DetalleMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar4DetalleMensajeCorreoInven);
			//this.jPanelParametrosAuxiliar5DetalleMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2DetalleMensajeCorreoInven);			
			
			
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jButtonRecargarInformacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven.add(this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven.add(this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jPanelParametrosAuxiliar1DetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleMensajeCorreoInven.add(this.jComboBoxTiposReportesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jPanelParametrosAuxiliar4DetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jComboBoxTiposReportesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jCheckBoxGenerarReporteDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jPanelParametrosAuxiliar2DetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jLabelAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jButtonAbrirOrderByDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			
			
			/*
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);															
				
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMensajeCorreoInven.add(this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jPanelParametrosAuxiliar3DetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jComboBoxTiposAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
	
				
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.add(this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleMensajeCorreoInven = new GridBagLayout();

			this.jScrollPanelDatosDetalleMensajeCorreoInven.setLayout(gridaBagLayoutDatosDetalleMensajeCorreoInven);
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
			
			this.jScrollPanelDatosDetalleMensajeCorreoInven.add(this.jTableDatosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setViewportView(this.jTableDatosDetalleMensajeCorreoInven);
		this.jTableDatosDetalleMensajeCorreoInven.setFillsViewportHeight(true);
		this.jTableDatosDetalleMensajeCorreoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesDetalleMensajeCorreoInven.setLayout(gridaBagLayoutAccionesDetalleMensajeCorreoInven);
		
		
		/*	
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
			
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonNuevoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoDetalleMensajeCorreoInven.setLayout(gridaBagLayoutFK_IdEmpleadoDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		jPanelFK_IdEmpleadoDetalleMensajeCorreoInven.add(jLabelid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
		jPanelFK_IdEmpleadoDetalleMensajeCorreoInven.add(jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx =1;
		jPanelFK_IdEmpleadoDetalleMensajeCorreoInven.add(jButtonFK_IdEmpleadoDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		jTabbedPaneBusquedasDetalleMensajeCorreoInven.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);
		jTabbedPaneBusquedasDetalleMensajeCorreoInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven= new GridBagLayout();
		gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setLayout(gridaBagLayoutFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.add(jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
		jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.add(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx =1;
		jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.add(jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		jTabbedPaneBusquedasDetalleMensajeCorreoInven.addTab("2.-Por Mensaje Correo Inven ", jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
		jTabbedPaneBusquedasDetalleMensajeCorreoInven.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven= new GridBagLayout();
		gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUsuarioDetalleMensajeCorreoInven.setLayout(gridaBagLayoutFK_IdUsuarioDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		jPanelFK_IdUsuarioDetalleMensajeCorreoInven.add(jLabelid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
		jPanelFK_IdUsuarioDetalleMensajeCorreoInven.add(jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMensajeCorreoInven.gridy = 1;
		gridBagConstraintsDetalleMensajeCorreoInven.gridx =1;
		jPanelFK_IdUsuarioDetalleMensajeCorreoInven.add(jButtonFK_IdUsuarioDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);

		jTabbedPaneBusquedasDetalleMensajeCorreoInven.addTab("3.-Por Usuario ", jPanelFK_IdUsuarioDetalleMensajeCorreoInven);
		jTabbedPaneBusquedasDetalleMensajeCorreoInven.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMensajeCorreoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsDetalleMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;		
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);								
		
		
		/*
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/		
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
				
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMensajeCorreoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleMensajeCorreoInven.setLayout(gridaBagLayoutBusquedasParametrosDetalleMensajeCorreoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleMensajeCorreoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setName("jPanelReporteDinamicoDetalleMensajeCorreoInven"); 
		
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.setLayout(gridaBagLayoutReporteDinamicoDetalleMensajeCorreoInven);
		
		
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jLabelColumnasSelectReporteDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleMensajeCorreoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven=new JScrollPane(this.jListColumnasSelectReporteDetalleMensajeCorreoInven);
			
			this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jListColumnasSelectReporteDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleMensajeCorreoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleMensajeCorreoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleMensajeCorreoInven=new JScrollPane(this.jListRelacionesSelectReporteDetalleMensajeCorreoInven);
			
			this.jScrollRelacionesSelectReporteDetalleMensajeCorreoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMensajeCorreoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMensajeCorreoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleMensajeCorreoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleMensajeCorreoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jLabelGenerarExcelReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.setToolTipText("Generar EXCEL"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jComboBoxTiposReportesDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jLabelTiposArchivoReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven.setToolTipText("Generar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven.setToolTipText("Cancelar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMensajeCorreoInven.add(this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven= new JScrollPane(jPanelReporteDinamicoDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleMensajeCorreoInven);
		this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleMensajeCorreoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleMensajeCorreoInven.setName("jPanelImportacionDetalleMensajeCorreoInven"); 
		
		this.jPanelImportacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleMensajeCorreoInven.setLayout(gridaBagLayoutImportacionDetalleMensajeCorreoInven);
		
		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleMensajeCorreoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionDetalleMensajeCorreoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelArchivoImportacionDetalleMensajeCorreoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jLabelArchivoImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleMensajeCorreoInven = new JFileChooser();		
		this.jFileChooserImportacionDetalleMensajeCorreoInven.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonAbrirImportacionDetalleMensajeCorreoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleMensajeCorreoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleMensajeCorreoInven.setToolTipText("Generar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jButtonAbrirImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jLabelPathArchivoImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jTextFieldPathArchivoImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarImportacionDetalleMensajeCorreoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleMensajeCorreoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleMensajeCorreoInven.setToolTipText("Generar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jButtonGenerarImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarImportacionDetalleMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleMensajeCorreoInven.setToolTipText("Cancelar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMensajeCorreoInven.add(this.jButtonCerrarImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleMensajeCorreoInven= new JScrollPane(jPanelImportacionDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleMensajeCorreoInven);
		this.jInternalFrameImportacionDetalleMensajeCorreoInven.getContentPane().add(this.jScrollPanelImportacionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleMensajeCorreoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven = new JButtonMe();
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setText("Orden");
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMensajeCorreoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleMensajeCorreoInven";
			inputMap = this.jButtonAbrirOrderByDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleMensajeCorreoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleMensajeCorreoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleMensajeCorreoInven.setName("jPanelOrderByDetalleMensajeCorreoInven"); 
			
			this.jPanelOrderByDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleMensajeCorreoInven.setLayout(gridaBagLayoutOrderByDetalleMensajeCorreoInven);
			
			
			this.jTableDatosDetalleMensajeCorreoInvenOrderBy = new JTableMe();        
			this.jTableDatosDetalleMensajeCorreoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleMensajeCorreoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleMensajeCorreoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleMensajeCorreoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleMensajeCorreoInvenOrderBy.setViewportView(this.jTableDatosDetalleMensajeCorreoInvenOrderBy);
			this.jTableDatosDetalleMensajeCorreoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleMensajeCorreoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleMensajeCorreoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleMensajeCorreoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleMensajeCorreoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleMensajeCorreoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setTitle("Orden");
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setResizable(true);
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setClosable(true);
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleMensajeCorreoInven.ipady =150;
				
			this.jPanelOrderByDetalleMensajeCorreoInven.add(jScrollPanelDatosDetalleMensajeCorreoInvenOrderBy, this.gridBagConstraintsDetalleMensajeCorreoInven);//this.jTableDatosDetalleMensajeCorreoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleMensajeCorreoInven = new JButtonMe();
			this.jButtonCerrarOrderByDetalleMensajeCorreoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleMensajeCorreoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleMensajeCorreoInven.setToolTipText("Cancelar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleMensajeCorreoInven.add(this.jButtonCerrarOrderByDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleMensajeCorreoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleMensajeCorreoInven= new JScrollPane(jPanelOrderByDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleMensajeCorreoInven);
			
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getContentPane().add(this.jScrollPanelOrderByDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
		
		} else {
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleMensajeCorreoInven.getRowHeight();//DetalleMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.isSelected()) {
					iHeightTable=DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMensajeCorreoInven.isSelected()) {
					iHeightTable=DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleMensajeCorreoInven!=null && this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallemensajecorreoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleMensajeCorreoInven> TraerDetalleMensajeCorreoInvenBeans(List<DetalleMensajeCorreoInven> detallemensajecorreoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvens) {
					
				if(!(DetalleMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallemensajecorreoinven.setsDetalleGeneralEntityReporte(DetalleMensajeCorreoInvenConstantesFunciones.getDetalleMensajeCorreoInvenDescripcion(detallemensajecorreoinven));
										
					detallemensajecorreoinven.setesta_activo_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getesta_activoDescripcion(detallemensajecorreoinven));	
					
						
					
				} else  {
							
					//detallemensajecorreoinven.setsDetalleGeneralEntityReporte(detallemensajecorreoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallemensajecorreoinvenbeans.add(detallemensajecorreoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallemensajecorreoinvens;
    }
	//PARA REPORTES FIN
}
