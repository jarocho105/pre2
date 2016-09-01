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
import com.bydan.erp.inventario.util.PlaneacionCompraConstantesFunciones;

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
public class PlaneacionCompraJInternalFrame extends PlaneacionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPlaneacionCompra;
	
	protected JMenuBar jmenuBarPlaneacionCompra;
	
	protected JMenu jmenuPlaneacionCompra;
	protected JMenu jmenuDatosPlaneacionCompra;
	protected JMenu jmenuArchivoPlaneacionCompra;
	protected JMenu jmenuAccionesPlaneacionCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaneacionCompra;	
	protected GridBagConstraints gridBagConstraintsPlaneacionCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PlaneacionCompraDetalleFormJInternalFrame jInternalFrameDetalleFormPlaneacionCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPlaneacionCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPlaneacionCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicio="";

	protected MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfin="";
	
	public PlaneacionCompraSessionBean planeacioncompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public MesSessionBean mesinicioSessionBean;
	public MesSessionBean mesfinSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PlaneacionCompra> planeacioncompras;		
	public List<PlaneacionCompra> planeacioncomprasEliminados;	
	public List<PlaneacionCompra> planeacioncomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPlaneacionCompra;		
	protected JButton jButtonAbrirOrderByPlaneacionCompra;
	
	
	//protected JPanel jPanelOrderByPlaneacionCompra;
	//public JScrollPane jScrollPanelOrderByPlaneacionCompra;	
	//protected JButton jButtonCerrarOrderByPlaneacionCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PlaneacionCompraLogic planeacioncompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPlaneacionCompra;
	public JScrollPane jScrollPanelDatosEdicionPlaneacionCompra;
	public JScrollPane jScrollPanelDatosGeneralPlaneacionCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosPlaneacionCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPlaneacionCompra;
	//public JScrollPane jScrollPanelImportacionPlaneacionCompra;
	
	
	
	protected JPanel jPanelAccionesPlaneacionCompra;
	
    protected JPanel jPanelPaginacionPlaneacionCompra;
    protected JPanel jPanelParametrosReportesPlaneacionCompra;
	protected JPanel jPanelParametrosReportesAccionesPlaneacionCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar2PlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar3PlaneacionCompra;
	protected JPanel jPanelParametrosAuxiliar4PlaneacionCompra;
	//protected JPanel jPanelParametrosAuxiliar5PlaneacionCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoPlaneacionCompra;
	//protected JPanel jPanelImportacionPlaneacionCompra;
	
	
	public JTable jTableDatosPlaneacionCompra;
	
	
	
	//public JTable jTableDatosPlaneacionCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPlaneacionCompra;
	protected JButton jButtonDuplicarPlaneacionCompra;
	protected JButton jButtonCopiarPlaneacionCompra;
	protected JButton jButtonVerFormPlaneacionCompra;
	protected JButton jButtonNuevoRelacionesPlaneacionCompra;
	protected JButton jButtonModificarPlaneacionCompra;
	
    protected JButton jButtonGuardarCambiosTablaPlaneacionCompra;
	protected JButton jButtonCerrarPlaneacionCompra;
	
	
	protected JButton jButtonRecargarInformacionPlaneacionCompra;
	protected JButton jButtonProcesarInformacionPlaneacionCompra;
	
	
	protected JButton jButtonAnterioresPlaneacionCompra;
	protected JButton jButtonSiguientesPlaneacionCompra;
	protected JButton jButtonNuevoGuardarCambiosPlaneacionCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPlaneacionCompra;
	//protected JButton jButtonCerrarReporteDinamicoPlaneacionCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoPlaneacionCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionPlaneacionCompra;
	//protected JButton jButtonGenerarImportacionPlaneacionCompra;
	//protected JButton jButtonCerrarImportacionPlaneacionCompra;
	//protected JFileChooser jFileChooserImportacionPlaneacionCompra;
	//protected File fileImportacionPlaneacionCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaneacionCompra;
	protected JButton jButtonDuplicarToolBarPlaneacionCompra;
	protected JButton jButtonNuevoRelacionesToolBarPlaneacionCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarPlaneacionCompra;
	protected JButton jButtonCopiarToolBarPlaneacionCompra;
	protected JButton jButtonVerFormToolBarPlaneacionCompra;
	public JButton jButtonGuardarCambiosTablaToolBarPlaneacionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaneacionCompra;
	protected JButton jButtonCerrarToolBarPlaneacionCompra;
	
	protected JButton jButtonRecargarInformacionToolBarPlaneacionCompra;
	protected JButton jButtonProcesarInformacionToolBarPlaneacionCompra;
	protected JButton jButtonAnterioresToolBarPlaneacionCompra;
	protected JButton jButtonSiguientesToolBarPlaneacionCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarPlaneacionCompra;
	protected JButton jButtonAbrirOrderByToolBarPlaneacionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaneacionCompra;
	protected JMenuItem jMenuItemDuplicarPlaneacionCompra;
	protected JMenuItem jMenuItemNuevoRelacionesPlaneacionCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPlaneacionCompra;
	protected JMenuItem jMenuItemCopiarPlaneacionCompra;
	protected JMenuItem jMenuItemVerFormPlaneacionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaneacionCompra;
	protected JMenuItem jMenuItemCerrarPlaneacionCompra;
	protected JMenuItem jMenuItemDetalleCerrarPlaneacionCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPlaneacionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaneacionCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionPlaneacionCompra;
	protected JMenuItem jMenuItemProcesarInformacionPlaneacionCompra;
	protected JMenuItem jMenuItemAnterioresPlaneacionCompra;
	protected JMenuItem jMenuItemSiguientesPlaneacionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaneacionCompra;
	protected JMenuItem jMenuItemAbrirOrderByPlaneacionCompra;
	protected JMenuItem jMenuItemMostrarOcultarPlaneacionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaneacionCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPlaneacionCompra;
	protected JCheckBox jCheckBoxSeleccionadosPlaneacionCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPlaneacionCompra;
	protected JCheckBox jCheckBoxConGraficoReportePlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPlaneacionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPlaneacionCompra;
	protected JTextField jTextFieldValorCampoGeneralPlaneacionCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePlaneacionCompra;
	//public JList<Reporte> jListColumnasSelectReportePlaneacionCompra;
	//public JScrollPane jScrollColumnasSelectReportePlaneacionCompra;
	
	//public JLabel jLabelRelacionesSelectReportePlaneacionCompra;
	//public JList<Reporte> jListRelacionesSelectReportePlaneacionCompra;
	//public JScrollPane jScrollRelacionesSelectReportePlaneacionCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPlaneacionCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPlaneacionCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPlaneacionCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoPlaneacionCompra;
	
		
	//public JLabel jLabelArchivoImportacionPlaneacionCompra;	
	//public JLabel jLabelPathArchivoImportacionPlaneacionCompra;
	//protected JTextField jTextFieldPathArchivoImportacionPlaneacionCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPlaneacionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPlaneacionCompra;
	
	//public JLabel jLabelColumnaCategoriaValorPlaneacionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPlaneacionCompra;
	
	//public JLabel jLabelColumnasValoresGraficoPlaneacionCompra;
	//public JList<Reporte> jListColumnasValoresGraficoPlaneacionCompra;
	//public JScrollPane jScrollColumnasValoresGraficoPlaneacionCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPlaneacionCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPlaneacionCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPlaneacionCompra;
	public JPanel jPanelFK_IdEmpleadoPlaneacionCompra;
	public JButton jButtonFK_IdEmpleadoPlaneacionCompra;
	public JPanel jPanelFK_IdFormatoPlaneacionCompra;
	public JButton jButtonFK_IdFormatoPlaneacionCompra;
	public JPanel jPanelFK_IdMesFinPlaneacionCompra;
	public JButton jButtonFK_IdMesFinPlaneacionCompra;
	public JPanel jPanelFK_IdMesInicioPlaneacionCompra;
	public JButton jButtonFK_IdMesInicioPlaneacionCompra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPlaneacionCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoPlaneacionCompra;
	public JLabel jLabelid_formatoFK_IdFormatoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoPlaneacionCompra;
	public JButton jButtonid_formatoFK_IdFormatoPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_finFK_IdMesFinPlaneacionCompra;
	public JLabel jLabelid_mes_finFK_IdMesFinPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra;
	public JButton jButtonid_mes_finFK_IdMesFinPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_mes_finFK_IdMesFinPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mes_finFK_IdMesFinPlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_inicioFK_IdMesInicioPlaneacionCompra;
	public JLabel jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra;
	public JButton jButtonid_mes_inicioFK_IdMesInicioPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_mes_inicioFK_IdMesInicioPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicioFK_IdMesInicioPlaneacionCompraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PlaneacionCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPlaneacionCompra)	{
		this.jButtonRecargarInformacionPlaneacionCompra = jButtonRecargarInformacionPlaneacionCompra;
	}
	
	public JButton getjButtonProcesarInformacionPlaneacionCompra() {
		return this.jButtonProcesarInformacionPlaneacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaneacionCompra)	{
		this.jButtonProcesarInformacionPlaneacionCompra = jButtonProcesarInformacionPlaneacionCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionPlaneacionCompra() {
		return this.jButtonRecargarInformacionPlaneacionCompra;
	}
	
	
	public List<PlaneacionCompra> getplaneacioncompras() {
		return this.planeacioncompras;
	}

	public void setplaneacioncompras(List<PlaneacionCompra> planeacioncompras) {
		this.planeacioncompras = planeacioncompras;
	}
	
	public List<PlaneacionCompra> getplaneacioncomprasAux() {
		return this.planeacioncomprasAux;
	}

	public void setplaneacioncomprasAux(List<PlaneacionCompra> planeacioncomprasAux) {
		this.planeacioncomprasAux = planeacioncomprasAux;
	}
	
	public List<PlaneacionCompra> getplaneacioncomprasEliminados() {
		return this.planeacioncomprasEliminados;
	}

	public void setPlaneacionComprasEliminados(List<PlaneacionCompra> planeacioncomprasEliminados) {
		this.planeacioncomprasEliminados = planeacioncomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPlaneacionCompra() {
		return jComboBoxTiposSeleccionarPlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPlaneacionCompra(
			JComboBox jComboBoxTiposSeleccionarPlaneacionCompra) {
		this.jComboBoxTiposSeleccionarPlaneacionCompra = jComboBoxTiposSeleccionarPlaneacionCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPlaneacionCompra() {
		return jTextFieldValorCampoGeneralPlaneacionCompra;
	}

	public void setjTextFieldValorCampoGeneralPlaneacionCompra(
			JTextField jTextFieldValorCampoGeneralPlaneacionCompra) {
		this.jTextFieldValorCampoGeneralPlaneacionCompra = jTextFieldValorCampoGeneralPlaneacionCompra;
	}

	public void setBorderResaltarValorCampoGeneralPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPlaneacionCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPlaneacionCompra() {
		return this.jCheckBoxSeleccionarTodosPlaneacionCompra;
	}

	public void setjCheckBoxSeleccionarTodosPlaneacionCompra(
			JCheckBox jCheckBoxSeleccionarTodosPlaneacionCompra) {
		this.jCheckBoxSeleccionarTodosPlaneacionCompra = jCheckBoxSeleccionarTodosPlaneacionCompra;
	}

	public void setBorderResaltarSeleccionarTodosPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPlaneacionCompra() {
		return this.jCheckBoxSeleccionadosPlaneacionCompra;
	}

	public void setjCheckBoxSeleccionadosPlaneacionCompra(
			JCheckBox jCheckBoxSeleccionadosPlaneacionCompra) {
		this.jCheckBoxSeleccionadosPlaneacionCompra = jCheckBoxSeleccionadosPlaneacionCompra;
	}
	
	public void setBorderResaltarSeleccionadosPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPlaneacionCompra() {
		return this.jComboBoxTiposArchivosReportesPlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPlaneacionCompra(
			JComboBox jComboBoxTiposArchivosReportesPlaneacionCompra) {
		this.jComboBoxTiposArchivosReportesPlaneacionCompra = jComboBoxTiposArchivosReportesPlaneacionCompra;
	}

	public void setBorderResaltarTiposArchivosReportesPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPlaneacionCompra() {
		return this.jComboBoxTiposReportesPlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPlaneacionCompra(
			JComboBox jComboBoxTiposReportesPlaneacionCompra) {
		this.jComboBoxTiposReportesPlaneacionCompra = jComboBoxTiposReportesPlaneacionCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPlaneacionCompra() {
	//	return jComboBoxTiposReportesDinamicoPlaneacionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPlaneacionCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoPlaneacionCompra) {
	//	this.jComboBoxTiposReportesDinamicoPlaneacionCompra = jComboBoxTiposReportesDinamicoPlaneacionCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPlaneacionCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPlaneacionCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra = jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra;
	//}
	
	public void setBorderResaltarTiposReportesPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPlaneacionCompra() {
		return this.jComboBoxTiposGraficosReportesPlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPlaneacionCompra(
			JComboBox jComboBoxTiposGraficosReportesPlaneacionCompra) {
		this.jComboBoxTiposGraficosReportesPlaneacionCompra = jComboBoxTiposGraficosReportesPlaneacionCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPlaneacionCompra() {
		return this.jComboBoxTiposPaginacionPlaneacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPlaneacionCompra(
			JComboBox jComboBoxTiposPaginacionPlaneacionCompra) {
		this.jComboBoxTiposPaginacionPlaneacionCompra = jComboBoxTiposPaginacionPlaneacionCompra;
	}
	
	public void setBorderResaltarTiposPaginacionPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPlaneacionCompra() {
		return this.jComboBoxTiposRelacionesPlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaneacionCompra() {
		return this.jComboBoxTiposAccionesPlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaneacionCompra(
			JComboBox jComboBoxTiposRelacionesPlaneacionCompra) {
		this.jComboBoxTiposRelacionesPlaneacionCompra = jComboBoxTiposRelacionesPlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaneacionCompra(
			JComboBox jComboBoxTiposAccionesPlaneacionCompra) {
		this.jComboBoxTiposAccionesPlaneacionCompra = jComboBoxTiposAccionesPlaneacionCompra;
	}
	
	public void setBorderResaltarTiposRelacionesPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPlaneacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPlaneacionCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPlaneacionCompra() {
	//	return jCheckBoxConGraficoDinamicoPlaneacionCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoPlaneacionCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoPlaneacionCompra) {
	//	this.jCheckBoxConGraficoDinamicoPlaneacionCompra = jCheckBoxConGraficoDinamicoPlaneacionCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPlaneacionCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPlaneacionCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPlaneacionCompra .setBorder(borderResaltar);		
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
		this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		
		this.planeacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planeacioncompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaneacionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeacion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
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
		
		PlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPlaneacionCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"nuevo","nuevo","Nuevo"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"duplicar","duplicar","Duplicar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"copiar","copiar","Copiar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"ver_form","ver_form","Ver"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"recargar","recargar","Recargar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPlaneacionCompra,this.jTtoolBarPlaneacionCompra,
							"cerrar","cerrar","Salir"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPlaneacionCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPlaneacionCompra;
			
				this.jButtonProcesarInformacionToolBarPlaneacionCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPlaneacionCompra;
				
		//protected JButton jButtonModificarToolBarPlaneacionCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPlaneacionCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPlaneacionCompra=new JMenuMe("General");
		this.jmenuArchivoPlaneacionCompra=new JMenuMe("Archivo");
		this.jmenuAccionesPlaneacionCompra=new JMenuMe("Acciones");
		this.jmenuDatosPlaneacionCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaneacionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaneacionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaneacionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPlaneacionCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPlaneacionCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPlaneacionCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPlaneacionCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPlaneacionCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPlaneacionCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPlaneacionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaneacionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaneacionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPlaneacionCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPlaneacionCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPlaneacionCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPlaneacionCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPlaneacionCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPlaneacionCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPlaneacionCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPlaneacionCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPlaneacionCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPlaneacionCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPlaneacionCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPlaneacionCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPlaneacionCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPlaneacionCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPlaneacionCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPlaneacionCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPlaneacionCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPlaneacionCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPlaneacionCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPlaneacionCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPlaneacionCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPlaneacionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPlaneacionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPlaneacionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPlaneacionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPlaneacionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPlaneacionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPlaneacionCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPlaneacionCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPlaneacionCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPlaneacionCompra.add(this.jMenuItemCerrarPlaneacionCompra);
			
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemNuevoPlaneacionCompra);
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemNuevoGuardarCambiosPlaneacionCompra);
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemNuevoRelacionesPlaneacionCompra);
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemGuardarCambiosTablaPlaneacionCompra);		
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemDuplicarPlaneacionCompra);		
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemCopiarPlaneacionCompra);		
			this.jmenuAccionesPlaneacionCompra.add(this.jMenuItemVerFormPlaneacionCompra);		
			
			this.jmenuDatosPlaneacionCompra.add(this.jMenuItemRecargarInformacionPlaneacionCompra);				
			this.jmenuDatosPlaneacionCompra.add(this.jMenuItemAnterioresPlaneacionCompra);				
			this.jmenuDatosPlaneacionCompra.add(this.jMenuItemSiguientesPlaneacionCompra);				
			this.jmenuDatosPlaneacionCompra.add(this.jMenuItemAbrirOrderByPlaneacionCompra);				
			this.jmenuDatosPlaneacionCompra.add(this.jMenuItemMostrarOcultarPlaneacionCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPlaneacionCompra.add(this.jMenuItemGuardarCambiosPlaneacionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPlaneacionCompra.add(this.jmenuArchivoPlaneacionCompra);		
			this.jmenuBarPlaneacionCompra.add(this.jmenuAccionesPlaneacionCompra);		
			this.jmenuBarPlaneacionCompra.add(this.jmenuDatosPlaneacionCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPlaneacionCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPlaneacionCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPlaneacionCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoPlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoPlaneacionCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPlaneacionCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPlaneacionCompra.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoPlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdFormatoPlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdFormatoPlaneacionCompra.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPlaneacionCompra,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoPlaneacionCompra = new JLabelMe();
		jLabelid_formatoFK_IdFormatoPlaneacionCompra.setText("Formato :");
		jLabelid_formatoFK_IdFormatoPlaneacionCompra.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesFinPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesFinPlaneacionCompra.setToolTipText("Buscar Por Mes Fin ");
		this.jButtonFK_IdMesFinPlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdMesFinPlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdMesFinPlaneacionCompra.setToolTipText("Buscar Por Mes Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesFinPlaneacionCompra,"buscar_button","Buscar Por Mes Fin ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesFinPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra = new JLabelMe();
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra.setText("Mes Fin :");
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra.setToolTipText("Mes Fin");
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finFK_IdMesFinPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finFK_IdMesFinPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesInicioPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesInicioPlaneacionCompra.setToolTipText("Buscar Por Mes Inicio ");
		this.jButtonFK_IdMesInicioPlaneacionCompra= new JButtonMe();
		this.jButtonFK_IdMesInicioPlaneacionCompra.setText("Buscar");
		this.jButtonFK_IdMesInicioPlaneacionCompra.setToolTipText("Buscar Por Mes Inicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesInicioPlaneacionCompra,"buscar_button","Buscar Por Mes Inicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesInicioPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra = new JLabelMe();
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra.setText("Mes Inicio :");
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra.setToolTipText("Mes Inicio");
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPlaneacionCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasPlaneacionCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlaneacionCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlaneacionCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePlaneacionCompra = new PlaneacionCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Planeacion Compra DATOS");
			this.jInternalFrameDetalleFormPlaneacionCompra = new PlaneacionCompraDetalleFormJInternalFrame(jDesktopPane,this.planeacioncompraSessionBean.getConGuardarRelaciones(),this.planeacioncompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPlaneacionCompra = null;//new PlaneacionCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaneacionCompra= new GridBagLayout();
		
		
		this.jTableDatosPlaneacionCompra = new JTableMe();      
		
		String sToolTipPlaneacionCompra="";
		sToolTipPlaneacionCompra=PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaneacionCompra+="(Inventario.PlaneacionCompra)";
		}
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaneacionCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPlaneacionCompra.setToolTipText(sToolTipPlaneacionCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPlaneacionCompra);
		this.jTableDatosPlaneacionCompra.setAutoCreateRowSorter(true);
		this.jTableDatosPlaneacionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPlaneacionCompra.setRowSelectionAllowed(true);
		this.jTableDatosPlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPlaneacionCompra = new JButtonMe();
		this.jButtonDuplicarPlaneacionCompra = new JButtonMe();
		this.jButtonCopiarPlaneacionCompra = new JButtonMe();
		this.jButtonVerFormPlaneacionCompra = new JButtonMe();
		this.jButtonNuevoRelacionesPlaneacionCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra = new JButtonMe();
		this.jButtonCerrarPlaneacionCompra = new JButtonMe();
		
		this.jScrollPanelDatosPlaneacionCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralPlaneacionCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Planeacion Compra";
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesPlaneacionCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPlaneacionCompra=new ReporteDinamicoJInternalFrame(PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPlaneacionCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPlaneacionCompra=new ImportacionJInternalFrame(PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPlaneacionCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPlaneacionCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByPlaneacionCompra.setText("Orden");
		this.jButtonAbrirOrderByPlaneacionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaneacionCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionCompra,false,this);
			
			//this.cargarOrderByPlaneacionCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionCompra,true,this);
			
			//this.cargarOrderByPlaneacionCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPlaneacionCompra.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosPlaneacionCompra.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosPlaneacionCompra.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosPlaneacionCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaneacionCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaneacionCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPlaneacionCompra.setText("Nuevo");
		this.jButtonDuplicarPlaneacionCompra.setText("Duplicar");
		this.jButtonCopiarPlaneacionCompra.setText("Copiar");
		this.jButtonVerFormPlaneacionCompra.setText("Ver");
		this.jButtonNuevoRelacionesPlaneacionCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.setText("Guardar");
		this.jButtonCerrarPlaneacionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaneacionCompra,"nuevo_button","Nuevo",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPlaneacionCompra,"duplicar_button","Duplicar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPlaneacionCompra,"copiar_button","Copiar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPlaneacionCompra,"ver_form","Ver",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPlaneacionCompra,"nuevorelaciones_button","Nuevo Rel",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaneacionCompra,"guardarcambiostabla_button","Guardar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaneacionCompra,"cerrar_button","Salir",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPlaneacionCompra.setToolTipText("Nuevo"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPlaneacionCompra.setToolTipText("Duplicar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPlaneacionCompra.setToolTipText("Copiar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPlaneacionCompra.setToolTipText("Ver"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPlaneacionCompra.setToolTipText("Nuevo Rel"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.setToolTipText("Guardar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaneacionCompra.setToolTipText("Salir"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaneacionCompra";
		inputMap = this.jButtonNuevoPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaneacionCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarPlaneacionCompra";
		inputMap = this.jButtonDuplicarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPlaneacionCompra"));
		
		//COPIAR
		sMapKey = "CopiarPlaneacionCompra";
		inputMap = this.jButtonCopiarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPlaneacionCompra"));
		
		//VEr FORM
		sMapKey = "VerFormPlaneacionCompra";
		inputMap = this.jButtonVerFormPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPlaneacionCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPlaneacionCompra";
		inputMap = this.jButtonNuevoRelacionesPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPlaneacionCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPlaneacionCompra";
		inputMap = this.jButtonModificarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPlaneacionCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPlaneacionCompra";
		inputMap = this.jButtonCerrarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaneacionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaneacionCompra";
		inputMap = this.jButtonGuardarCambiosTablaPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaneacionCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPlaneacionCompra.setName("jPanelParametrosReportesPlaneacionCompra"); 
		
		this.jPanelParametrosReportesAccionesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPlaneacionCompra.setName("jPanelParametrosReportesAccionesPlaneacionCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPlaneacionCompra = new JButtonMe();
		this.jButtonRecargarInformacionPlaneacionCompra.setText("Recargar");
		this.jButtonRecargarInformacionPlaneacionCompra.setToolTipText("Recargar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPlaneacionCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPlaneacionCompra = new JButtonMe();
		this.jButtonProcesarInformacionPlaneacionCompra.setText("Procesar");
		this.jButtonProcesarInformacionPlaneacionCompra.setToolTipText("Procesar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPlaneacionCompra.setVisible(false);
			
		this.jButtonProcesarInformacionPlaneacionCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaneacionCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaneacionCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPlaneacionCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposReportesPlaneacionCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPlaneacionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPlaneacionCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionPlaneacionCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPlaneacionCompra.setText("Accion");
		this.jComboBoxTiposRelacionesPlaneacionCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaneacionCompra.setText("Accion");
		this.jComboBoxTiposAccionesPlaneacionCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPlaneacionCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarPlaneacionCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPlaneacionCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPlaneacionCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaneacionCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaneacionCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPlaneacionCompra = new JLabelMe();
		
		this.jLabelAccionesPlaneacionCompra.setText("Acciones");		
		this.jLabelAccionesPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPlaneacionCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPlaneacionCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPlaneacionCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPlaneacionCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPlaneacionCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPlaneacionCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePlaneacionCompra.setText("Graf.");
		this.jCheckBoxConGraficoReportePlaneacionCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPlaneacionCompra = new JButtonMe();
		//this.jButtonAnterioresPlaneacionCompra.setText("<<");
        this.jButtonAnterioresPlaneacionCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPlaneacionCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPlaneacionCompra = new JButtonMe();
		//this.jButtonSiguientesPlaneacionCompra.setText(">>");
        this.jButtonSiguientesPlaneacionCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPlaneacionCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPlaneacionCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPlaneacionCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosPlaneacionCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPlaneacionCompra,"nuevoguardarcambios_button","Nue",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPlaneacionCompra";
		inputMap = this.jButtonNuevoGuardarCambiosPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPlaneacionCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPlaneacionCompra";
		inputMap = this.jButtonRecargarInformacionPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPlaneacionCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPlaneacionCompra";
		inputMap = this.jButtonSiguientesPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPlaneacionCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPlaneacionCompra";
		inputMap = this.jButtonAnterioresPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPlaneacionCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPlaneacionCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPlaneacionCompra.setMinimumSize(new Dimension(this.getWidth(),PlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaneacionCompra.setMaximumSize(new Dimension(this.getWidth(),PlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaneacionCompra.setPreferredSize(new Dimension(this.getWidth(),PlaneacionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPlaneacionCompra = new GridBagLayout();

			this.jPanelPaginacionPlaneacionCompra.setLayout(gridaBagLayoutPaginacionPlaneacionCompra);						
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 0;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonAnterioresPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					
						
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaneacionCompra.gridy = 0;
			
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonNuevoGuardarCambiosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
						
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaneacionCompra.gridy = 0;
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonSiguientesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 1;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonNuevoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlaneacionCompra.gridy = 1;
				this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPlaneacionCompra.add(this.jButtonNuevoRelacionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			}
			
			
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlaneacionCompra.gridy = 1;
				this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPlaneacionCompra.add(this.jButtonGuardarCambiosTablaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			}
			
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 1;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonDuplicarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 1;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonCopiarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 1;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonVerFormPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 1;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPlaneacionCompra.add(this.jButtonCerrarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
		
		
		this.jButtonRecargarInformacionPlaneacionCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaneacionCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaneacionCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPlaneacionCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaneacionCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaneacionCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPlaneacionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaneacionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaneacionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPlaneacionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaneacionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaneacionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePlaneacionCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaneacionCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaneacionCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPlaneacionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaneacionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaneacionCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPlaneacionCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaneacionCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaneacionCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPlaneacionCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PlaneacionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PlaneacionCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPlaneacionCompra.setLayout(gridaBagParametrosReportesPlaneacionCompra);
			this.jPanelParametrosReportesAccionesPlaneacionCompra.setLayout(gridaBagParametrosReportesAccionesPlaneacionCompra);
			
			
			this.jPanelParametrosAuxiliar1PlaneacionCompra.setLayout(gridaBagParametrosAuxiliar1PlaneacionCompra);
			this.jPanelParametrosAuxiliar2PlaneacionCompra.setLayout(gridaBagParametrosAuxiliar2PlaneacionCompra);
			this.jPanelParametrosAuxiliar3PlaneacionCompra.setLayout(gridaBagParametrosAuxiliar3PlaneacionCompra);
			this.jPanelParametrosAuxiliar4PlaneacionCompra.setLayout(gridaBagParametrosAuxiliar4PlaneacionCompra);
			//this.jPanelParametrosAuxiliar5PlaneacionCompra.setLayout(gridaBagParametrosAuxiliar2PlaneacionCompra);			
			
			
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jButtonRecargarInformacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionCompra.add(this.jComboBoxTiposPaginacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionCompra.add(this.jCheckBoxConAltoMaximoTablaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionCompra.add(this.jComboBoxTiposArchivosReportesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jPanelParametrosAuxiliar1PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PlaneacionCompra.add(this.jComboBoxTiposReportesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jPanelParametrosAuxiliar4PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jComboBoxTiposReportesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jCheckBoxGenerarReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jPanelParametrosAuxiliar2PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jLabelAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPlaneacionCompra.add(this.jButtonAbrirOrderByPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jComboBoxTiposSeleccionarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			
			
			/*
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jCheckBoxSeleccionarTodosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaneacionCompra.add(this.jCheckBoxSeleccionarTodosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);															
				
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaneacionCompra.add(this.jCheckBoxSeleccionadosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jPanelParametrosAuxiliar3PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jComboBoxTiposRelacionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
				
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jComboBoxTiposAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
	
				
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionCompra.add(this.jTextFieldValorCampoGeneralPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPlaneacionCompra = new GridBagLayout();

			this.jScrollPanelDatosPlaneacionCompra.setLayout(gridaBagLayoutDatosPlaneacionCompra);
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = 0;
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;
			
			this.jScrollPanelDatosPlaneacionCompra.add(this.jTableDatosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPlaneacionCompra.setViewportView(this.jTableDatosPlaneacionCompra);
		this.jTableDatosPlaneacionCompra.setFillsViewportHeight(true);
		this.jTableDatosPlaneacionCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesPlaneacionCompra.setLayout(gridaBagLayoutAccionesPlaneacionCompra);
		
		
		/*	
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
			
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonNuevoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoPlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPlaneacionCompra.setLayout(gridaBagLayoutFK_IdEmpleadoPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 0;
		jPanelFK_IdEmpleadoPlaneacionCompra.add(jLabelid_empleadoFK_IdEmpleadoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 1;
		jPanelFK_IdEmpleadoPlaneacionCompra.add(jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 1;
		gridBagConstraintsPlaneacionCompra.gridx =1;
		jPanelFK_IdEmpleadoPlaneacionCompra.add(jButtonFK_IdEmpleadoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		jTabbedPaneBusquedasPlaneacionCompra.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoPlaneacionCompra);
		jTabbedPaneBusquedasPlaneacionCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFormatoPlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPlaneacionCompra.setLayout(gridaBagLayoutFK_IdFormatoPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 0;
		jPanelFK_IdFormatoPlaneacionCompra.add(jLabelid_formatoFK_IdFormatoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 1;
		jPanelFK_IdFormatoPlaneacionCompra.add(jComboBoxid_formatoFK_IdFormatoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 1;
		gridBagConstraintsPlaneacionCompra.gridx =1;
		jPanelFK_IdFormatoPlaneacionCompra.add(jButtonFK_IdFormatoPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		jTabbedPaneBusquedasPlaneacionCompra.addTab("2.-Por Formato ", jPanelFK_IdFormatoPlaneacionCompra);
		jTabbedPaneBusquedasPlaneacionCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdMesFinPlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdMesFinPlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesFinPlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesFinPlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesFinPlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesFinPlaneacionCompra.setLayout(gridaBagLayoutFK_IdMesFinPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 0;
		jPanelFK_IdMesFinPlaneacionCompra.add(jLabelid_mes_finFK_IdMesFinPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 1;
		jPanelFK_IdMesFinPlaneacionCompra.add(jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 1;
		gridBagConstraintsPlaneacionCompra.gridx =1;
		jPanelFK_IdMesFinPlaneacionCompra.add(jButtonFK_IdMesFinPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		jTabbedPaneBusquedasPlaneacionCompra.addTab("3.-Por Mes Fin ", jPanelFK_IdMesFinPlaneacionCompra);
		jTabbedPaneBusquedasPlaneacionCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdMesInicioPlaneacionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdMesInicioPlaneacionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesInicioPlaneacionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesInicioPlaneacionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesInicioPlaneacionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesInicioPlaneacionCompra.setLayout(gridaBagLayoutFK_IdMesInicioPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 0;
		jPanelFK_IdMesInicioPlaneacionCompra.add(jLabelid_mes_inicioFK_IdMesInicioPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 0;
		gridBagConstraintsPlaneacionCompra.gridx = 1;
		jPanelFK_IdMesInicioPlaneacionCompra.add(jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionCompra.gridy = 1;
		gridBagConstraintsPlaneacionCompra.gridx =1;
		jPanelFK_IdMesInicioPlaneacionCompra.add(jButtonFK_IdMesInicioPlaneacionCompra, gridBagConstraintsPlaneacionCompra);

		jTabbedPaneBusquedasPlaneacionCompra.addTab("4.-Por Mes Inicio ", jPanelFK_IdMesInicioPlaneacionCompra);
		jTabbedPaneBusquedasPlaneacionCompra.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaneacionCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();						
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;		
			//this.gridBagConstraintsPlaneacionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaneacionCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;		
		//this.gridBagConstraintsPlaneacionCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPlaneacionCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;		
			this.gridBagConstraintsPlaneacionCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPlaneacionCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);								
		
		
		/*
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		*/		
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionCompra.gridx =0;
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaneacionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
				
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPlaneacionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaneacionCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosPlaneacionCompra.setLayout(gridaBagLayoutBusquedasParametrosPlaneacionCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPlaneacionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPlaneacionCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPlaneacionCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPlaneacionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPlaneacionCompra.setName("jPanelReporteDinamicoPlaneacionCompra"); 
		
		this.jPanelReporteDinamicoPlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPlaneacionCompra.setLayout(gridaBagLayoutReporteDinamicoPlaneacionCompra);
		
		
		this.jInternalFrameReporteDinamicoPlaneacionCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPlaneacionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaneacionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPlaneacionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPlaneacionCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPlaneacionCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoPlaneacionCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoPlaneacionCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePlaneacionCompra = new JLabelMe();

		this.jLabelColumnasSelectReportePlaneacionCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jLabelColumnasSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePlaneacionCompra = new JList<Reporte>();
		this.jListColumnasSelectReportePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePlaneacionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaneacionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaneacionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePlaneacionCompra=new JScrollPane(this.jListColumnasSelectReportePlaneacionCompra);
			
			this.jScrollColumnasSelectReportePlaneacionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaneacionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaneacionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlaneacionCompra.add(this.jListColumnasSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jScrollColumnasSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePlaneacionCompra = new JLabelMe();

		this.jLabelRelacionesSelectReportePlaneacionCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jLabelRelacionesSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePlaneacionCompra = new JList<Reporte>();
		this.jListRelacionesSelectReportePlaneacionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePlaneacionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePlaneacionCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaneacionCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaneacionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePlaneacionCompra=new JScrollPane(this.jListRelacionesSelectReportePlaneacionCompra);
			
			this.jScrollRelacionesSelectReportePlaneacionCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaneacionCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaneacionCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlaneacionCompra.add(this.jListRelacionesSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jScrollRelacionesSelectReportePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPlaneacionCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPlaneacionCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoPlaneacionCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPlaneacionCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPlaneacionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jLabelGenerarExcelReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra.setToolTipText("Generar EXCEL"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPlaneacionCompra.add(this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jComboBoxTiposReportesDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jLabelTiposArchivoReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jComboBoxTiposArchivosReportesDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPlaneacionCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPlaneacionCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPlaneacionCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPlaneacionCompra.setToolTipText("Generar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jButtonGenerarReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPlaneacionCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPlaneacionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPlaneacionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPlaneacionCompra.setToolTipText("Cancelar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionCompra.add(this.jButtonCerrarReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPlaneacionCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPlaneacionCompra= new JScrollPane(jPanelReporteDinamicoPlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPlaneacionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaneacionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaneacionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPlaneacionCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPlaneacionCompra);
		this.jInternalFrameReporteDinamicoPlaneacionCompra.getContentPane().add(this.jScrollPanelReporteDinamicoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPlaneacionCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPlaneacionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPlaneacionCompra.setName("jPanelImportacionPlaneacionCompra"); 
		
		this.jPanelImportacionPlaneacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaneacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaneacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPlaneacionCompra.setLayout(gridaBagLayoutImportacionPlaneacionCompra);
		
		
		this.jInternalFrameImportacionPlaneacionCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPlaneacionCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPlaneacionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaneacionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaneacionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPlaneacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaneacionCompra.setResizable(true);
	    this.jInternalFrameImportacionPlaneacionCompra.setClosable(true);
	    this.jInternalFrameImportacionPlaneacionCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaneacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaneacionCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPlaneacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaneacionCompra.setResizable(true);
	    this.jInternalFrameImportacionPlaneacionCompra.setClosable(true);
	    this.jInternalFrameImportacionPlaneacionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPlaneacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaneacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaneacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPlaneacionCompra = new JLabelMe();

		this.jLabelArchivoImportacionPlaneacionCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaneacionCompra.add(this.jLabelArchivoImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPlaneacionCompra = new JFileChooser();		
		this.jFileChooserImportacionPlaneacionCompra.setToolTipText("ESCOGER ARCHIVO"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPlaneacionCompra = new JButtonMe();
		this.jButtonAbrirImportacionPlaneacionCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPlaneacionCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPlaneacionCompra.setToolTipText("Generar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionCompra.add(this.jButtonAbrirImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPlaneacionCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionPlaneacionCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaneacionCompra.add(this.jLabelPathArchivoImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPlaneacionCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPlaneacionCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaneacionCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaneacionCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionCompra.add(this.jTextFieldPathArchivoImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPlaneacionCompra = new JButtonMe();
		this.jButtonGenerarImportacionPlaneacionCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPlaneacionCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPlaneacionCompra.setToolTipText("Generar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionCompra.add(this.jButtonGenerarImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPlaneacionCompra = new JButtonMe();
		this.jButtonCerrarImportacionPlaneacionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPlaneacionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPlaneacionCompra.setToolTipText("Cancelar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionCompra.add(this.jButtonCerrarImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPlaneacionCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionPlaneacionCompra= new JScrollPane(jPanelImportacionPlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsPlaneacionCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPlaneacionCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPlaneacionCompra);
		this.jInternalFrameImportacionPlaneacionCompra.getContentPane().add(this.jScrollPanelImportacionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPlaneacionCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPlaneacionCompra = new JButtonMe();
			this.jButtonAbrirOrderByPlaneacionCompra.setText("Orden");
			this.jButtonAbrirOrderByPlaneacionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaneacionCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPlaneacionCompra";
			inputMap = this.jButtonAbrirOrderByPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPlaneacionCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByPlaneacionCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPlaneacionCompra.setName("jPanelOrderByPlaneacionCompra"); 
			
			this.jPanelOrderByPlaneacionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaneacionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaneacionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPlaneacionCompra.setLayout(gridaBagLayoutOrderByPlaneacionCompra);
			
			
			this.jTableDatosPlaneacionCompraOrderBy = new JTableMe();        
			this.jTableDatosPlaneacionCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPlaneacionCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPlaneacionCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPlaneacionCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPlaneacionCompraOrderBy.setViewportView(this.jTableDatosPlaneacionCompraOrderBy);
			this.jTableDatosPlaneacionCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPlaneacionCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPlaneacionCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPlaneacionCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPlaneacionCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePlaneacionCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPlaneacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPlaneacionCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPlaneacionCompra.setTitle("Orden");
			this.jInternalFrameOrderByPlaneacionCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPlaneacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPlaneacionCompra.setResizable(true);
			this.jInternalFrameOrderByPlaneacionCompra.setClosable(true);
			this.jInternalFrameOrderByPlaneacionCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPlaneacionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaneacionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaneacionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPlaneacionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPlaneacionCompra.ipady =150;
				
			this.jPanelOrderByPlaneacionCompra.add(jScrollPanelDatosPlaneacionCompraOrderBy, this.gridBagConstraintsPlaneacionCompra);//this.jTableDatosPlaneacionCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPlaneacionCompra = new JButtonMe();
			this.jButtonCerrarOrderByPlaneacionCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPlaneacionCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPlaneacionCompra.setToolTipText("Cancelar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPlaneacionCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPlaneacionCompra.add(this.jButtonCerrarOrderByPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPlaneacionCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByPlaneacionCompra= new JScrollPane(jPanelOrderByPlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsPlaneacionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPlaneacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPlaneacionCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPlaneacionCompra);
			
			this.jInternalFrameOrderByPlaneacionCompra.getContentPane().add(this.jScrollPanelOrderByPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
		
		} else {
			this.jButtonAbrirOrderByPlaneacionCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.planeacioncompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPlaneacionCompra.getRowHeight();//PlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.isSelected()) {
					iHeightTable=PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaneacionCompra.isSelected()) {
					iHeightTable=PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaneacionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPlaneacionCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaneacionCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaneacionCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPlaneacionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaneacionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaneacionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPlaneacionCompra!=null && this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPlaneacionCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPlaneacionCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPlaneacionCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPlaneacionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaneacionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaneacionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=planeacioncompraLogic.getPlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacioncompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PlaneacionCompra> TraerPlaneacionCompraBeans(List<PlaneacionCompra> planeacioncompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(PlaneacionCompra planeacioncompra:planeacioncompras) {
					
				if(!(PlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					planeacioncompra.setsDetalleGeneralEntityReporte(PlaneacionCompraConstantesFunciones.getPlaneacionCompraDescripcion(planeacioncompra));
										
						
					
					

					if(planeacioncompra.getDetallePlaneacionCompras()!=null && Funciones.existeClass(classes,DetallePlaneacionCompra.class)) {
						try{planeacioncompra.setdetalleplaneacioncomprasDescripcionReporte(new JRBeanCollectionDataSource(DetallePlaneacionCompraJInternalFrame.TraerDetallePlaneacionCompraBeans(planeacioncompra.getDetallePlaneacionCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//planeacioncompra.setsDetalleGeneralEntityReporte(planeacioncompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//planeacioncomprabeans.add(planeacioncomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return planeacioncompras;
    }
	//PARA REPORTES FIN
}
