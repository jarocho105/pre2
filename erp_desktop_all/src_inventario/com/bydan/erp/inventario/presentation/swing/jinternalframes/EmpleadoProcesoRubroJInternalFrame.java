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
import com.bydan.erp.inventario.util.EmpleadoProcesoRubroConstantesFunciones;

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
public class EmpleadoProcesoRubroJInternalFrame extends EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoProcesoRubro;
	
	protected JMenuBar jmenuBarEmpleadoProcesoRubro;
	
	protected JMenu jmenuEmpleadoProcesoRubro;
	protected JMenu jmenuDatosEmpleadoProcesoRubro;
	protected JMenu jmenuArchivoEmpleadoProcesoRubro;
	protected JMenu jmenuAccionesEmpleadoProcesoRubro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoProcesoRubro;	
	protected GridBagConstraints gridBagConstraintsEmpleadoProcesoRubro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoProcesoRubro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoProcesoRubro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoProcesoRubro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoProcesoRubro> empleadoprocesorubros;		
	public List<EmpleadoProcesoRubro> empleadoprocesorubrosEliminados;	
	public List<EmpleadoProcesoRubro> empleadoprocesorubrosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoProcesoRubro;		
	protected JButton jButtonAbrirOrderByEmpleadoProcesoRubro;
	
	
	//protected JPanel jPanelOrderByEmpleadoProcesoRubro;
	//public JScrollPane jScrollPanelOrderByEmpleadoProcesoRubro;	
	//protected JButton jButtonCerrarOrderByEmpleadoProcesoRubro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoProcesoRubroLogic empleadoprocesorubroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoProcesoRubro;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoProcesoRubro;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoProcesoRubro;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoProcesoRubroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoProcesoRubro;
	//public JScrollPane jScrollPanelImportacionEmpleadoProcesoRubro;
	
	
	
	protected JPanel jPanelAccionesEmpleadoProcesoRubro;
	
    protected JPanel jPanelPaginacionEmpleadoProcesoRubro;
    protected JPanel jPanelParametrosReportesEmpleadoProcesoRubro;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoProcesoRubro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoProcesoRubro;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoProcesoRubro;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoProcesoRubro;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoProcesoRubro;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoProcesoRubro;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoProcesoRubro;
	//protected JPanel jPanelImportacionEmpleadoProcesoRubro;
	
	
	public JTable jTableDatosEmpleadoProcesoRubro;
	
	
	
	//public JTable jTableDatosEmpleadoProcesoRubroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoProcesoRubro;
	protected JButton jButtonDuplicarEmpleadoProcesoRubro;
	protected JButton jButtonCopiarEmpleadoProcesoRubro;
	protected JButton jButtonVerFormEmpleadoProcesoRubro;
	protected JButton jButtonNuevoRelacionesEmpleadoProcesoRubro;
	protected JButton jButtonModificarEmpleadoProcesoRubro;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoProcesoRubro;
	protected JButton jButtonCerrarEmpleadoProcesoRubro;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoProcesoRubro;
	protected JButton jButtonProcesarInformacionEmpleadoProcesoRubro;
	
	
	protected JButton jButtonAnterioresEmpleadoProcesoRubro;
	protected JButton jButtonSiguientesEmpleadoProcesoRubro;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoProcesoRubro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoProcesoRubro;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoProcesoRubro;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoProcesoRubro;
	//protected JButton jButtonGenerarImportacionEmpleadoProcesoRubro;
	//protected JButton jButtonCerrarImportacionEmpleadoProcesoRubro;
	//protected JFileChooser jFileChooserImportacionEmpleadoProcesoRubro;
	//protected File fileImportacionEmpleadoProcesoRubro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoProcesoRubro;
	protected JButton jButtonDuplicarToolBarEmpleadoProcesoRubro;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoProcesoRubro;
	protected JButton jButtonCopiarToolBarEmpleadoProcesoRubro;
	protected JButton jButtonVerFormToolBarEmpleadoProcesoRubro;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoProcesoRubro;
	protected JButton jButtonCerrarToolBarEmpleadoProcesoRubro;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoProcesoRubro;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoProcesoRubro;
	protected JButton jButtonAnterioresToolBarEmpleadoProcesoRubro;
	protected JButton jButtonSiguientesToolBarEmpleadoProcesoRubro;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoProcesoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDuplicarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoProcesoRubro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemCopiarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemVerFormEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemCerrarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemAnterioresEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemSiguientesEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoProcesoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoProcesoRubro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoProcesoRubro;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoProcesoRubro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoProcesoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoProcesoRubro;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoProcesoRubro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoProcesoRubro;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoProcesoRubro;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoProcesoRubro;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoProcesoRubro;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoProcesoRubro;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoProcesoRubro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoProcesoRubro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoProcesoRubro;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoProcesoRubro;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoProcesoRubro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoProcesoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoProcesoRubro;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoProcesoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoProcesoRubro;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoProcesoRubro;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoProcesoRubro;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoProcesoRubro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoProcesoRubro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoProcesoRubro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoProcesoRubro;
	public JPanel jPanelFK_IdEmpleadoEmpleadoProcesoRubro;
	public JButton jButtonFK_IdEmpleadoEmpleadoProcesoRubro;
	public JPanel jPanelFK_IdEstructuraEmpleadoProcesoRubro;
	public JButton jButtonFK_IdEstructuraEmpleadoProcesoRubro;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoProcesoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro;
	public JLabel jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro;
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoProcesoRubroBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoProcesoRubroArbol= new JButtonMe();

	
	
	
	
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
	public EmpleadoProcesoRubroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoProcesoRubro)	{
		this.jButtonRecargarInformacionEmpleadoProcesoRubro = jButtonRecargarInformacionEmpleadoProcesoRubro;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoProcesoRubro() {
		return this.jButtonProcesarInformacionEmpleadoProcesoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoProcesoRubro)	{
		this.jButtonProcesarInformacionEmpleadoProcesoRubro = jButtonProcesarInformacionEmpleadoProcesoRubro;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoProcesoRubro() {
		return this.jButtonRecargarInformacionEmpleadoProcesoRubro;
	}
	
	
	public List<EmpleadoProcesoRubro> getempleadoprocesorubros() {
		return this.empleadoprocesorubros;
	}

	public void setempleadoprocesorubros(List<EmpleadoProcesoRubro> empleadoprocesorubros) {
		this.empleadoprocesorubros = empleadoprocesorubros;
	}
	
	public List<EmpleadoProcesoRubro> getempleadoprocesorubrosAux() {
		return this.empleadoprocesorubrosAux;
	}

	public void setempleadoprocesorubrosAux(List<EmpleadoProcesoRubro> empleadoprocesorubrosAux) {
		this.empleadoprocesorubrosAux = empleadoprocesorubrosAux;
	}
	
	public List<EmpleadoProcesoRubro> getempleadoprocesorubrosEliminados() {
		return this.empleadoprocesorubrosEliminados;
	}

	public void setEmpleadoProcesoRubrosEliminados(List<EmpleadoProcesoRubro> empleadoprocesorubrosEliminados) {
		this.empleadoprocesorubrosEliminados = empleadoprocesorubrosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoProcesoRubro() {
		return jComboBoxTiposSeleccionarEmpleadoProcesoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposSeleccionarEmpleadoProcesoRubro) {
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro = jComboBoxTiposSeleccionarEmpleadoProcesoRubro;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoProcesoRubro() {
		return jTextFieldValorCampoGeneralEmpleadoProcesoRubro;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoProcesoRubro(
			JTextField jTextFieldValorCampoGeneralEmpleadoProcesoRubro) {
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro = jTextFieldValorCampoGeneralEmpleadoProcesoRubro;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoProcesoRubro() {
		return this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoProcesoRubro(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoProcesoRubro) {
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro = jCheckBoxSeleccionarTodosEmpleadoProcesoRubro;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoProcesoRubro() {
		return this.jCheckBoxSeleccionadosEmpleadoProcesoRubro;
	}

	public void setjCheckBoxSeleccionadosEmpleadoProcesoRubro(
			JCheckBox jCheckBoxSeleccionadosEmpleadoProcesoRubro) {
		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro = jCheckBoxSeleccionadosEmpleadoProcesoRubro;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoProcesoRubro) {
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro = jComboBoxTiposArchivosReportesEmpleadoProcesoRubro;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposReportesEmpleadoProcesoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposReportesEmpleadoProcesoRubro) {
		this.jComboBoxTiposReportesEmpleadoProcesoRubro = jComboBoxTiposReportesEmpleadoProcesoRubro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoProcesoRubro() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoProcesoRubro(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro = jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro = jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoProcesoRubro) {
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro = jComboBoxTiposGraficosReportesEmpleadoProcesoRubro;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoProcesoRubro() {
		return this.jComboBoxTiposPaginacionEmpleadoProcesoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposPaginacionEmpleadoProcesoRubro) {
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro = jComboBoxTiposPaginacionEmpleadoProcesoRubro;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposRelacionesEmpleadoProcesoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposAccionesEmpleadoProcesoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposRelacionesEmpleadoProcesoRubro) {
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro = jComboBoxTiposRelacionesEmpleadoProcesoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposAccionesEmpleadoProcesoRubro) {
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro = jComboBoxTiposAccionesEmpleadoProcesoRubro;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoProcesoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoProcesoRubro() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoProcesoRubro(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro = jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoProcesoRubro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoProcesoRubro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro .setBorder(borderResaltar);		
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
		this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		
		this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoProcesoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Proceso Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoProcesoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoProcesoRubro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"copiar","copiar","Copiar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"ver_form","ver_form","Ver"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"recargar","recargar","Recargar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,
							"cerrar","cerrar","Salir"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro;
			
				this.jButtonProcesarInformacionToolBarEmpleadoProcesoRubro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoProcesoRubro;
				
		//protected JButton jButtonModificarToolBarEmpleadoProcesoRubro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoProcesoRubro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoProcesoRubro=new JMenuMe("General");
		this.jmenuArchivoEmpleadoProcesoRubro=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoProcesoRubro=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoProcesoRubro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoProcesoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoProcesoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoProcesoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoProcesoRubro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoProcesoRubro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoProcesoRubro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoProcesoRubro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoProcesoRubro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoProcesoRubro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoProcesoRubro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoProcesoRubro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoProcesoRubro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoProcesoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoProcesoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoProcesoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoProcesoRubro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoProcesoRubro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoProcesoRubro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoProcesoRubro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoProcesoRubro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoProcesoRubro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoProcesoRubro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoProcesoRubro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoProcesoRubro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoProcesoRubro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoProcesoRubro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoProcesoRubro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoProcesoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoProcesoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoProcesoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoProcesoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoProcesoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoProcesoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoProcesoRubro.add(this.jMenuItemCerrarEmpleadoProcesoRubro);
			
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemNuevoEmpleadoProcesoRubro);
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro);
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro);
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro);		
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemDuplicarEmpleadoProcesoRubro);		
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemCopiarEmpleadoProcesoRubro);		
			this.jmenuAccionesEmpleadoProcesoRubro.add(this.jMenuItemVerFormEmpleadoProcesoRubro);		
			
			this.jmenuDatosEmpleadoProcesoRubro.add(this.jMenuItemRecargarInformacionEmpleadoProcesoRubro);				
			this.jmenuDatosEmpleadoProcesoRubro.add(this.jMenuItemAnterioresEmpleadoProcesoRubro);				
			this.jmenuDatosEmpleadoProcesoRubro.add(this.jMenuItemSiguientesEmpleadoProcesoRubro);				
			this.jmenuDatosEmpleadoProcesoRubro.add(this.jMenuItemAbrirOrderByEmpleadoProcesoRubro);				
			this.jmenuDatosEmpleadoProcesoRubro.add(this.jMenuItemMostrarOcultarEmpleadoProcesoRubro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoProcesoRubro.add(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoProcesoRubro.add(this.jmenuArchivoEmpleadoProcesoRubro);		
			this.jmenuBarEmpleadoProcesoRubro.add(this.jmenuAccionesEmpleadoProcesoRubro);		
			this.jmenuBarEmpleadoProcesoRubro.add(this.jmenuDatosEmpleadoProcesoRubro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoProcesoRubro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoProcesoRubro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEmpleadoProcesoRubro.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonFK_IdEstructuraEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonFK_IdEstructuraEmpleadoProcesoRubro.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEmpleadoProcesoRubro,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoProcesoRubro=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoProcesoRubro = new EmpleadoProcesoRubroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Proceso Rubro DATOS");
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro = new EmpleadoProcesoRubroDetalleFormJInternalFrame(jDesktopPane,this.empleadoprocesorubroSessionBean.getConGuardarRelaciones(),this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro = null;//new EmpleadoProcesoRubroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoProcesoRubro= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoProcesoRubro = new JTableMe();      
		
		String sToolTipEmpleadoProcesoRubro="";
		sToolTipEmpleadoProcesoRubro=EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoProcesoRubro+="(Inventario.EmpleadoProcesoRubro)";
		}
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoProcesoRubro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoProcesoRubro.setToolTipText(sToolTipEmpleadoProcesoRubro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoProcesoRubro);
		this.jTableDatosEmpleadoProcesoRubro.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoProcesoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoProcesoRubro.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoProcesoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonDuplicarEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonCopiarEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonVerFormEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonCerrarEmpleadoProcesoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoProcesoRubro = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoProcesoRubro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Proceso Rubro";
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoProcesoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoProcesoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoProcesoRubro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro=new ReporteDinamicoJInternalFrame(EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoProcesoRubro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoProcesoRubro=new ImportacionJInternalFrame(EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoProcesoRubro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoProcesoRubro = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoProcesoRubro.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoProcesoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoProcesoRubro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoProcesoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoProcesoRubro,false,this);
			
			//this.cargarOrderByEmpleadoProcesoRubro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoProcesoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoProcesoRubro,true,this);
			
			//this.cargarOrderByEmpleadoProcesoRubro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoProcesoRubro.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosEmpleadoProcesoRubro.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosEmpleadoProcesoRubro.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosEmpleadoProcesoRubro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoProcesoRubro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoProcesoRubro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoProcesoRubro.setText("Nuevo");
		this.jButtonDuplicarEmpleadoProcesoRubro.setText("Duplicar");
		this.jButtonCopiarEmpleadoProcesoRubro.setText("Copiar");
		this.jButtonVerFormEmpleadoProcesoRubro.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setText("Guardar");
		this.jButtonCerrarEmpleadoProcesoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoProcesoRubro,"nuevo_button","Nuevo",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoProcesoRubro,"duplicar_button","Duplicar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoProcesoRubro,"copiar_button","Copiar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoProcesoRubro,"ver_form","Ver",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoProcesoRubro,"nuevorelaciones_button","Nuevo Rel",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro,"guardarcambiostabla_button","Guardar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoProcesoRubro,"cerrar_button","Salir",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoProcesoRubro.setToolTipText("Nuevo"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoProcesoRubro.setToolTipText("Duplicar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoProcesoRubro.setToolTipText("Copiar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoProcesoRubro.setToolTipText("Ver"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.setToolTipText("Nuevo Rel"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setToolTipText("Guardar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoProcesoRubro.setToolTipText("Salir"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoProcesoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoProcesoRubro"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoProcesoRubro";
		inputMap = this.jButtonDuplicarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoProcesoRubro"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoProcesoRubro";
		inputMap = this.jButtonCopiarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoProcesoRubro"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoProcesoRubro";
		inputMap = this.jButtonVerFormEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoProcesoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoProcesoRubro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoRelacionesEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoProcesoRubro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoProcesoRubro";
		inputMap = this.jButtonModificarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoProcesoRubro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoProcesoRubro";
		inputMap = this.jButtonCerrarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoProcesoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoProcesoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoProcesoRubro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoProcesoRubro.setName("jPanelParametrosReportesEmpleadoProcesoRubro"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro.setName("jPanelParametrosReportesAccionesEmpleadoProcesoRubro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.setToolTipText("Recargar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoProcesoRubro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setToolTipText("Procesar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoProcesoRubro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoProcesoRubro = new JLabelMe();
		
		this.jLabelAccionesEmpleadoProcesoRubro.setText("Acciones");		
		this.jLabelAccionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoProcesoRubro = new JButtonMe();
		//this.jButtonAnterioresEmpleadoProcesoRubro.setText("<<");
        this.jButtonAnterioresEmpleadoProcesoRubro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoProcesoRubro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoProcesoRubro = new JButtonMe();
		//this.jButtonSiguientesEmpleadoProcesoRubro.setText(">>");
        this.jButtonSiguientesEmpleadoProcesoRubro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoProcesoRubro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro,"nuevoguardarcambios_button","Nue",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoProcesoRubro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoProcesoRubro";
		inputMap = this.jButtonRecargarInformacionEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoProcesoRubro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoProcesoRubro";
		inputMap = this.jButtonSiguientesEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoProcesoRubro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoProcesoRubro";
		inputMap = this.jButtonAnterioresEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoProcesoRubro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoProcesoRubro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(this.getWidth(),EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(this.getWidth(),EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(this.getWidth(),EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoProcesoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoProcesoRubro = new GridBagLayout();

			this.jPanelPaginacionEmpleadoProcesoRubro.setLayout(gridaBagLayoutPaginacionEmpleadoProcesoRubro);						
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonAnterioresEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					
						
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
			
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
						
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonSiguientesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonNuevoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
						
			
			
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
				this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			}
			
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonDuplicarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonCopiarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonVerFormEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoProcesoRubro.add(this.jButtonCerrarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
		
		
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoProcesoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoProcesoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoProcesoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoProcesoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoProcesoRubro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoProcesoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoProcesoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoProcesoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoProcesoRubro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoProcesoRubro.setLayout(gridaBagParametrosReportesEmpleadoProcesoRubro);
			this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro.setLayout(gridaBagParametrosReportesAccionesEmpleadoProcesoRubro);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro.setLayout(gridaBagParametrosAuxiliar1EmpleadoProcesoRubro);
			this.jPanelParametrosAuxiliar2EmpleadoProcesoRubro.setLayout(gridaBagParametrosAuxiliar2EmpleadoProcesoRubro);
			this.jPanelParametrosAuxiliar3EmpleadoProcesoRubro.setLayout(gridaBagParametrosAuxiliar3EmpleadoProcesoRubro);
			this.jPanelParametrosAuxiliar4EmpleadoProcesoRubro.setLayout(gridaBagParametrosAuxiliar4EmpleadoProcesoRubro);
			//this.jPanelParametrosAuxiliar5EmpleadoProcesoRubro.setLayout(gridaBagParametrosAuxiliar2EmpleadoProcesoRubro);			
			
			
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jButtonRecargarInformacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro.add(this.jComboBoxTiposPaginacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro.add(this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro.add(this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jPanelParametrosAuxiliar1EmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoProcesoRubro.add(this.jComboBoxTiposReportesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jPanelParametrosAuxiliar4EmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jComboBoxTiposReportesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jCheckBoxGenerarReporteEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jPanelParametrosAuxiliar2EmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jLabelAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jButtonAbrirOrderByEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			
			
			/*
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoProcesoRubro.add(this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);															
				
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoProcesoRubro.add(this.jCheckBoxSeleccionadosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jPanelParametrosAuxiliar3EmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jComboBoxTiposAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
	
				
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoProcesoRubro.add(this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoProcesoRubro = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoProcesoRubro.setLayout(gridaBagLayoutDatosEmpleadoProcesoRubro);
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoProcesoRubro.add(this.jTableDatosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoProcesoRubro.setViewportView(this.jTableDatosEmpleadoProcesoRubro);
		this.jTableDatosEmpleadoProcesoRubro.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoProcesoRubro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoProcesoRubro= new GridBagLayout();
		this.jPanelAccionesEmpleadoProcesoRubro.setLayout(gridaBagLayoutAccionesEmpleadoProcesoRubro);
		
		
		/*	
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
			
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonNuevoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoProcesoRubro.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoProcesoRubro.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoProcesoRubro.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
		gridBagConstraintsEmpleadoProcesoRubro.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoProcesoRubro.add(jButtonFK_IdEmpleadoEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		jTabbedPaneBusquedasEmpleadoProcesoRubro.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoProcesoRubro);
		jTabbedPaneBusquedasEmpleadoProcesoRubro.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEmpleadoProcesoRubro.setLayout(gridaBagLayoutFK_IdEstructuraEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
		jPanelFK_IdEstructuraEmpleadoProcesoRubro.add(jLabelid_estructuraFK_IdEstructuraEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
		jPanelFK_IdEstructuraEmpleadoProcesoRubro.add(jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoProcesoRubro.gridy = 1;
		gridBagConstraintsEmpleadoProcesoRubro.gridx =1;
		jPanelFK_IdEstructuraEmpleadoProcesoRubro.add(jButtonFK_IdEstructuraEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);

		jTabbedPaneBusquedasEmpleadoProcesoRubro.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraEmpleadoProcesoRubro);
		jTabbedPaneBusquedasEmpleadoProcesoRubro.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoProcesoRubro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;		
			//this.gridBagConstraintsEmpleadoProcesoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;		
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;		
			this.gridBagConstraintsEmpleadoProcesoRubro.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);								
		
		
		/*
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/		
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =0;
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoProcesoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
				
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoProcesoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoProcesoRubro = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoProcesoRubro.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoProcesoRubro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoProcesoRubro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoProcesoRubro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoProcesoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setName("jPanelReporteDinamicoEmpleadoProcesoRubro"); 
		
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.setLayout(gridaBagLayoutReporteDinamicoEmpleadoProcesoRubro);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoProcesoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoProcesoRubro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jLabelColumnasSelectReporteEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoProcesoRubro = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoProcesoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoProcesoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoProcesoRubro=new JScrollPane(this.jListColumnasSelectReporteEmpleadoProcesoRubro);
			
			this.jScrollColumnasSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jListColumnasSelectReporteEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jScrollColumnasSelectReporteEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoProcesoRubro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoProcesoRubro = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoProcesoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoProcesoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoProcesoRubro=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoProcesoRubro);
			
			this.jScrollRelacionesSelectReporteEmpleadoProcesoRubro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoProcesoRubro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoProcesoRubro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoProcesoRubro = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoProcesoRubro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro.setToolTipText("Generar EXCEL"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jComboBoxTiposReportesDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro.setToolTipText("Generar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro.setToolTipText("Cancelar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoProcesoRubro.add(this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoProcesoRubro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro= new JScrollPane(jPanelReporteDinamicoEmpleadoProcesoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoProcesoRubro);
		this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoProcesoRubro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoProcesoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoProcesoRubro.setName("jPanelImportacionEmpleadoProcesoRubro"); 
		
		this.jPanelImportacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoProcesoRubro.setLayout(gridaBagLayoutImportacionEmpleadoProcesoRubro);
		
		
		this.jInternalFrameImportacionEmpleadoProcesoRubro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoProcesoRubro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoProcesoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoProcesoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoProcesoRubro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoProcesoRubro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jLabelArchivoImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoProcesoRubro = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoProcesoRubro.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoProcesoRubro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoProcesoRubro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoProcesoRubro.setToolTipText("Generar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jButtonAbrirImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoProcesoRubro = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoProcesoRubro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jLabelPathArchivoImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoProcesoRubro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoProcesoRubro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoProcesoRubro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoProcesoRubro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jTextFieldPathArchivoImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoProcesoRubro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoProcesoRubro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoProcesoRubro.setToolTipText("Generar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jButtonGenerarImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoProcesoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoProcesoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoProcesoRubro.setToolTipText("Cancelar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoProcesoRubro.add(this.jButtonCerrarImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoProcesoRubro = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoProcesoRubro= new JScrollPane(jPanelImportacionEmpleadoProcesoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoProcesoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoProcesoRubro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoProcesoRubro);
		this.jInternalFrameImportacionEmpleadoProcesoRubro.getContentPane().add(this.jScrollPanelImportacionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoProcesoRubro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoProcesoRubro = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoProcesoRubro.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoProcesoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoProcesoRubro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoProcesoRubro";
			inputMap = this.jButtonAbrirOrderByEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoProcesoRubro"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoProcesoRubro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoProcesoRubro.setName("jPanelOrderByEmpleadoProcesoRubro"); 
			
			this.jPanelOrderByEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoProcesoRubro.setLayout(gridaBagLayoutOrderByEmpleadoProcesoRubro);
			
			
			this.jTableDatosEmpleadoProcesoRubroOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoProcesoRubroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoProcesoRubroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoProcesoRubroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoProcesoRubroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoProcesoRubroOrderBy.setViewportView(this.jTableDatosEmpleadoProcesoRubroOrderBy);
			this.jTableDatosEmpleadoProcesoRubroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoProcesoRubroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoProcesoRubro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoProcesoRubro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoProcesoRubro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoProcesoRubro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setResizable(true);
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setClosable(true);
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoProcesoRubro.ipady =150;
				
			this.jPanelOrderByEmpleadoProcesoRubro.add(jScrollPanelDatosEmpleadoProcesoRubroOrderBy, this.gridBagConstraintsEmpleadoProcesoRubro);//this.jTableDatosEmpleadoProcesoRubroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoProcesoRubro = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoProcesoRubro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoProcesoRubro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoProcesoRubro.setToolTipText("Cancelar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoProcesoRubro.add(this.jButtonCerrarOrderByEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoProcesoRubro = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoProcesoRubro= new JScrollPane(jPanelOrderByEmpleadoProcesoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoProcesoRubro);
			
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getContentPane().add(this.jScrollPanelOrderByEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoProcesoRubro = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoProcesoRubro.getRowHeight();//EmpleadoProcesoRubroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.isSelected()) {
					iHeightTable=EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoProcesoRubro.isSelected()) {
					iHeightTable=EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoProcesoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoProcesoRubro!=null && this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoProcesoRubro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoprocesorubros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoProcesoRubro> TraerEmpleadoProcesoRubroBeans(List<EmpleadoProcesoRubro> empleadoprocesorubros,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubros) {
					
				if(!(EmpleadoProcesoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoProcesoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoprocesorubro.setsDetalleGeneralEntityReporte(EmpleadoProcesoRubroConstantesFunciones.getEmpleadoProcesoRubroDescripcion(empleadoprocesorubro));
										
						
					
						
					
				} else  {
							
					//empleadoprocesorubro.setsDetalleGeneralEntityReporte(empleadoprocesorubro.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoprocesorubrobeans.add(empleadoprocesorubrobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoprocesorubros;
    }
	//PARA REPORTES FIN
}
