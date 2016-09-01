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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.AreaConstantesFunciones;

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
public class AreaJInternalFrame extends AreaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarArea;
	
	protected JMenuBar jmenuBarArea;
	
	protected JMenu jmenuArea;
	protected JMenu jmenuDatosArea;
	protected JMenu jmenuArchivoArea;
	protected JMenu jmenuAccionesArea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutArea;	
	protected GridBagConstraints gridBagConstraintsArea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AreaDetalleFormJInternalFrame jInternalFrameDetalleFormArea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoArea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionArea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadosustitutoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosustituto="";
	
	public AreaSessionBean areaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadosustitutoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Area> areas;		
	public List<Area> areasEliminados;	
	public List<Area> areasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByArea;		
	protected JButton jButtonAbrirOrderByArea;
	
	
	//protected JPanel jPanelOrderByArea;
	//public JScrollPane jScrollPanelOrderByArea;	
	//protected JButton jButtonCerrarOrderByArea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AreaLogic areaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosArea;
	public JScrollPane jScrollPanelDatosEdicionArea;
	public JScrollPane jScrollPanelDatosGeneralArea;
    
	
	
	//public JScrollPane jScrollPanelDatosAreaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoArea;
	//public JScrollPane jScrollPanelImportacionArea;
	
	
	
	protected JPanel jPanelAccionesArea;
	
    protected JPanel jPanelPaginacionArea;
    protected JPanel jPanelParametrosReportesArea;
	protected JPanel jPanelParametrosReportesAccionesArea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Area;
	protected JPanel jPanelParametrosAuxiliar2Area;
	protected JPanel jPanelParametrosAuxiliar3Area;
	protected JPanel jPanelParametrosAuxiliar4Area;
	//protected JPanel jPanelParametrosAuxiliar5Area;
	
	
	
	//protected JPanel jPanelReporteDinamicoArea;
	//protected JPanel jPanelImportacionArea;
	
	
	public JTable jTableDatosArea;
	
	
	
	//public JTable jTableDatosAreaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoArea;
	protected JButton jButtonDuplicarArea;
	protected JButton jButtonCopiarArea;
	protected JButton jButtonVerFormArea;
	protected JButton jButtonNuevoRelacionesArea;
	protected JButton jButtonModificarArea;
	
    protected JButton jButtonGuardarCambiosTablaArea;
	protected JButton jButtonCerrarArea;
	
	
	protected JButton jButtonRecargarInformacionArea;
	protected JButton jButtonProcesarInformacionArea;
	
	
	protected JButton jButtonAnterioresArea;
	protected JButton jButtonSiguientesArea;
	protected JButton jButtonNuevoGuardarCambiosArea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoArea;
	//protected JButton jButtonCerrarReporteDinamicoArea;
	//protected JButton jButtonGenerarExcelReporteDinamicoArea;	
	
	
	
	//protected JButton jButtonAbrirImportacionArea;
	//protected JButton jButtonGenerarImportacionArea;
	//protected JButton jButtonCerrarImportacionArea;
	//protected JFileChooser jFileChooserImportacionArea;
	//protected File fileImportacionArea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarArea;
	protected JButton jButtonDuplicarToolBarArea;
	protected JButton jButtonNuevoRelacionesToolBarArea;
	
	
	public JButton jButtonGuardarCambiosToolBarArea;
	protected JButton jButtonCopiarToolBarArea;
	protected JButton jButtonVerFormToolBarArea;
	public JButton jButtonGuardarCambiosTablaToolBarArea;
	protected JButton jButtonMostrarOcultarTablaToolBarArea;
	protected JButton jButtonCerrarToolBarArea;
	
	protected JButton jButtonRecargarInformacionToolBarArea;
	protected JButton jButtonProcesarInformacionToolBarArea;
	protected JButton jButtonAnterioresToolBarArea;
	protected JButton jButtonSiguientesToolBarArea;
	protected JButton jButtonNuevoGuardarCambiosToolBarArea;
	protected JButton jButtonAbrirOrderByToolBarArea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoArea;
	protected JMenuItem jMenuItemDuplicarArea;
	protected JMenuItem jMenuItemNuevoRelacionesArea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosArea;
	protected JMenuItem jMenuItemCopiarArea;
	protected JMenuItem jMenuItemVerFormArea;
	protected JMenuItem jMenuItemGuardarCambiosTablaArea;
	protected JMenuItem jMenuItemCerrarArea;
	protected JMenuItem jMenuItemDetalleCerrarArea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByArea;
	protected JMenuItem jMenuItemDetalleMostarOcultarArea;
	
	protected JMenuItem jMenuItemRecargarInformacionArea;
	protected JMenuItem jMenuItemProcesarInformacionArea;
	protected JMenuItem jMenuItemAnterioresArea;
	protected JMenuItem jMenuItemSiguientesArea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosArea;
	protected JMenuItem jMenuItemAbrirOrderByArea;
	protected JMenuItem jMenuItemMostrarOcultarArea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesArea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosArea;
	protected JCheckBox jCheckBoxSeleccionadosArea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaArea;
	protected JCheckBox jCheckBoxConGraficoReporteArea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesArea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesArea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoArea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoArea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesArea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionArea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesArea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesArea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarArea;
	protected JTextField jTextFieldValorCampoGeneralArea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteArea;
	//public JList<Reporte> jListColumnasSelectReporteArea;
	//public JScrollPane jScrollColumnasSelectReporteArea;
	
	//public JLabel jLabelRelacionesSelectReporteArea;
	//public JList<Reporte> jListRelacionesSelectReporteArea;
	//public JScrollPane jScrollRelacionesSelectReporteArea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoArea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoArea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoArea;
	//public JLabel jLabelTiposArchivoReporteDinamicoArea;
	
		
	//public JLabel jLabelArchivoImportacionArea;	
	//public JLabel jLabelPathArchivoImportacionArea;
	//protected JTextField jTextFieldPathArchivoImportacionArea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoArea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoArea;
	
	//public JLabel jLabelColumnaCategoriaValorArea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorArea;
	
	//public JLabel jLabelColumnasValoresGraficoArea;
	//public JList<Reporte> jListColumnasValoresGraficoArea;
	//public JScrollPane jScrollColumnasValoresGraficoArea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoArea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoArea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasArea;
	public JPanel jPanelFK_IdEmpleadoArea;
	public JButton jButtonFK_IdEmpleadoArea;
	public JPanel jPanelFK_IdEmpleadoSustitutoArea;
	public JButton jButtonFK_IdEmpleadoSustitutoArea;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoArea;
	public JLabel jLabelid_empleadoFK_IdEmpleadoArea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoArea;
	public JButton jButtonid_empleadoFK_IdEmpleadoArea= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAreaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAreaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoArea;
	
	public JPanel jPanelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea;
	public JLabel jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea;
	public JButton jButtonid_empleado_sustitutoFK_IdEmpleadoSustitutoArea= new JButtonMe();
	public JButton jButtonid_empleado_sustitutoFK_IdEmpleadoSustitutoAreaUpdate= new JButtonMe();
	public JButton jButtonid_empleado_sustitutoFK_IdEmpleadoSustitutoAreaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea;
	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AreaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionArea)	{
		this.jButtonRecargarInformacionArea = jButtonRecargarInformacionArea;
	}
	
	public JButton getjButtonProcesarInformacionArea() {
		return this.jButtonProcesarInformacionArea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionArea)	{
		this.jButtonProcesarInformacionArea = jButtonProcesarInformacionArea;
	}
	
	
	public JButton getjButtonRecargarInformacionArea() {
		return this.jButtonRecargarInformacionArea;
	}
	
	
	public List<Area> getareas() {
		return this.areas;
	}

	public void setareas(List<Area> areas) {
		this.areas = areas;
	}
	
	public List<Area> getareasAux() {
		return this.areasAux;
	}

	public void setareasAux(List<Area> areasAux) {
		this.areasAux = areasAux;
	}
	
	public List<Area> getareasEliminados() {
		return this.areasEliminados;
	}

	public void setAreasEliminados(List<Area> areasEliminados) {
		this.areasEliminados = areasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarArea() {
		return jComboBoxTiposSeleccionarArea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarArea(
			JComboBox jComboBoxTiposSeleccionarArea) {
		this.jComboBoxTiposSeleccionarArea = jComboBoxTiposSeleccionarArea;
	}
	
	public void setBorderResaltarTiposSeleccionarArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarArea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralArea() {
		return jTextFieldValorCampoGeneralArea;
	}

	public void setjTextFieldValorCampoGeneralArea(
			JTextField jTextFieldValorCampoGeneralArea) {
		this.jTextFieldValorCampoGeneralArea = jTextFieldValorCampoGeneralArea;
	}

	public void setBorderResaltarValorCampoGeneralArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralArea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosArea() {
		return this.jCheckBoxSeleccionarTodosArea;
	}

	public void setjCheckBoxSeleccionarTodosArea(
			JCheckBox jCheckBoxSeleccionarTodosArea) {
		this.jCheckBoxSeleccionarTodosArea = jCheckBoxSeleccionarTodosArea;
	}

	public void setBorderResaltarSeleccionarTodosArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosArea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosArea() {
		return this.jCheckBoxSeleccionadosArea;
	}

	public void setjCheckBoxSeleccionadosArea(
			JCheckBox jCheckBoxSeleccionadosArea) {
		this.jCheckBoxSeleccionadosArea = jCheckBoxSeleccionadosArea;
	}
	
	public void setBorderResaltarSeleccionadosArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosArea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesArea() {
		return this.jComboBoxTiposArchivosReportesArea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesArea(
			JComboBox jComboBoxTiposArchivosReportesArea) {
		this.jComboBoxTiposArchivosReportesArea = jComboBoxTiposArchivosReportesArea;
	}

	public void setBorderResaltarTiposArchivosReportesArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesArea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesArea() {
		return this.jComboBoxTiposReportesArea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesArea(
			JComboBox jComboBoxTiposReportesArea) {
		this.jComboBoxTiposReportesArea = jComboBoxTiposReportesArea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoArea() {
	//	return jComboBoxTiposReportesDinamicoArea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoArea(
	//		JComboBox jComboBoxTiposReportesDinamicoArea) {
	//	this.jComboBoxTiposReportesDinamicoArea = jComboBoxTiposReportesDinamicoArea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoArea() {
	//	return jComboBoxTiposArchivosReportesDinamicoArea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoArea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoArea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoArea = jComboBoxTiposArchivosReportesDinamicoArea;
	//}
	
	public void setBorderResaltarTiposReportesArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesArea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesArea() {
		return this.jComboBoxTiposGraficosReportesArea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesArea(
			JComboBox jComboBoxTiposGraficosReportesArea) {
		this.jComboBoxTiposGraficosReportesArea = jComboBoxTiposGraficosReportesArea;
	}
	
	public void setBorderResaltarTiposGraficosReportesArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesArea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionArea() {
		return this.jComboBoxTiposPaginacionArea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionArea(
			JComboBox jComboBoxTiposPaginacionArea) {
		this.jComboBoxTiposPaginacionArea = jComboBoxTiposPaginacionArea;
	}
	
	public void setBorderResaltarTiposPaginacionArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionArea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesArea() {
		return this.jComboBoxTiposRelacionesArea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesArea() {
		return this.jComboBoxTiposAccionesArea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesArea(
			JComboBox jComboBoxTiposRelacionesArea) {
		this.jComboBoxTiposRelacionesArea = jComboBoxTiposRelacionesArea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesArea(
			JComboBox jComboBoxTiposAccionesArea) {
		this.jComboBoxTiposAccionesArea = jComboBoxTiposAccionesArea;
	}
	
	public void setBorderResaltarTiposRelacionesArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesArea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesArea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesArea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoArea() {
	//	return jCheckBoxConGraficoDinamicoArea;
	//}

	//public void setjCheckBoxConGraficoDinamicoArea(
	//		JCheckBox jCheckBoxConGraficoDinamicoArea) {
	//	this.jCheckBoxConGraficoDinamicoArea = jCheckBoxConGraficoDinamicoArea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoArea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarArea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoArea .setBorder(borderResaltar);		
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
		this.areaSessionBean=new AreaSessionBean();
		
		this.areaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.areaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AreaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AreaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AreaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AreaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AreaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Area MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
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
		
		AreaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarArea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarArea,this.jTtoolBarArea,
							"nuevo","nuevo","Nuevo"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarArea,this.jTtoolBarArea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarArea,this.jTtoolBarArea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarArea,this.jTtoolBarArea,
							"duplicar","duplicar","Duplicar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarArea,this.jTtoolBarArea,
							"copiar","copiar","Copiar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarArea,this.jTtoolBarArea,
							"ver_form","ver_form","Ver"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArea,this.jTtoolBarArea,
							"recargar","recargar","Recargar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArea,this.jTtoolBarArea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArea,this.jTtoolBarArea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarArea,this.jTtoolBarArea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarArea,this.jTtoolBarArea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarArea,this.jTtoolBarArea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarArea,this.jTtoolBarArea,
							"cerrar","cerrar","Salir"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarArea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarArea;
			
				this.jButtonProcesarInformacionToolBarArea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarArea;
				
		//protected JButton jButtonModificarToolBarArea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarArea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuArea=new JMenuMe("General");
		this.jmenuArchivoArea=new JMenuMe("Archivo");
		this.jmenuAccionesArea=new JMenuMe("Acciones");
		this.jmenuDatosArea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoArea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoArea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoArea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarArea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarArea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarArea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesArea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesArea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesArea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosArea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosArea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosArea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarArea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarArea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarArea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormArea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormArea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormArea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaArea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaArea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaArea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarArea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarArea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarArea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionArea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionArea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionArea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionArea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionArea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionArea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresArea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresArea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresArea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesArea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesArea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesArea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByArea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByArea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByArea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarArea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarArea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarArea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByArea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByArea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByArea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarArea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarArea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarArea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarArea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosArea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosArea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosArea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoArea.add(this.jMenuItemCerrarArea);
			
			this.jmenuAccionesArea.add(this.jMenuItemNuevoArea);
			this.jmenuAccionesArea.add(this.jMenuItemNuevoGuardarCambiosArea);
			this.jmenuAccionesArea.add(this.jMenuItemNuevoRelacionesArea);
			this.jmenuAccionesArea.add(this.jMenuItemGuardarCambiosTablaArea);		
			this.jmenuAccionesArea.add(this.jMenuItemDuplicarArea);		
			this.jmenuAccionesArea.add(this.jMenuItemCopiarArea);		
			this.jmenuAccionesArea.add(this.jMenuItemVerFormArea);		
			
			this.jmenuDatosArea.add(this.jMenuItemRecargarInformacionArea);				
			this.jmenuDatosArea.add(this.jMenuItemAnterioresArea);				
			this.jmenuDatosArea.add(this.jMenuItemSiguientesArea);				
			this.jmenuDatosArea.add(this.jMenuItemAbrirOrderByArea);				
			this.jmenuDatosArea.add(this.jMenuItemMostrarOcultarArea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesArea.add(this.jMenuItemGuardarCambiosArea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoArea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesArea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosArea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarArea.add(this.jmenuArchivoArea);		
			this.jmenuBarArea.add(this.jmenuAccionesArea);		
			this.jmenuBarArea.add(this.jmenuDatosArea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarArea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasArea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoArea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoArea.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoArea= new JButtonMe();
		this.jButtonFK_IdEmpleadoArea.setText("Buscar");
		this.jButtonFK_IdEmpleadoArea.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoArea,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoArea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoArea = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoArea.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoArea.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoArea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoArea= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoArea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.setFocusable(false);

		this.jPanelFK_IdEmpleadoSustitutoArea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoSustitutoArea.setToolTipText("Buscar Por Empleado Sustituto ");
		this.jButtonFK_IdEmpleadoSustitutoArea= new JButtonMe();
		this.jButtonFK_IdEmpleadoSustitutoArea.setText("Buscar");
		this.jButtonFK_IdEmpleadoSustitutoArea.setToolTipText("Buscar Por Empleado Sustituto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoSustitutoArea,"buscar_button","Buscar Por Empleado Sustituto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoSustitutoArea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea = new JLabelMe();
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setText("Empleado Sustituto :");
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setToolTipText("Empleado Sustituto");
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea= new JComboBoxMe();
		jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.setFocusable(false);


		this.jTabbedPaneBusquedasArea=new JTabbedPane();


		this.jTabbedPaneBusquedasArea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasArea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasArea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasArea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasArea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleArea = new AreaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Area DATOS");
			this.jInternalFrameDetalleFormArea = new AreaDetalleFormJInternalFrame(jDesktopPane,this.areaSessionBean.getConGuardarRelaciones(),this.areaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormArea = null;//new AreaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutArea= new GridBagLayout();
		
		
		this.jTableDatosArea = new JTableMe();      
		
		String sToolTipArea="";
		sToolTipArea=AreaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipArea+="(Contabilidad.Area)";
		}
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			sToolTipArea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosArea.setToolTipText(sToolTipArea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosArea);
		this.jTableDatosArea.setAutoCreateRowSorter(true);
		this.jTableDatosArea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosArea.setRowSelectionAllowed(true);
		this.jTableDatosArea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosArea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoArea = new JButtonMe();
		this.jButtonDuplicarArea = new JButtonMe();
		this.jButtonCopiarArea = new JButtonMe();
		this.jButtonVerFormArea = new JButtonMe();
		this.jButtonNuevoRelacionesArea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaArea = new JButtonMe();
		this.jButtonCerrarArea = new JButtonMe();
		
		this.jScrollPanelDatosArea = new JScrollPane();   
        this.jScrollPanelDatosGeneralArea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Area";
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas" + this.sPath));
		} else {
			this.jScrollPanelDatosArea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesArea.setToolTipText("Acciones");
        this.jPanelAccionesArea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralArea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosArea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoArea=new ReporteDinamicoJInternalFrame(AreaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoArea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionArea=new ImportacionJInternalFrame(AreaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionArea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByArea = new JButtonMe();
		
		this.jButtonAbrirOrderByArea.setText("Orden");
		this.jButtonAbrirOrderByArea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByArea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByArea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArea,false,this);
			
			//this.cargarOrderByArea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByArea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArea,true,this);
			
			//this.cargarOrderByArea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosArea.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosArea.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosArea.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosArea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosArea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosArea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoArea.setText("Nuevo");
		this.jButtonDuplicarArea.setText("Duplicar");
		this.jButtonCopiarArea.setText("Copiar");
		this.jButtonVerFormArea.setText("Ver");
		this.jButtonNuevoRelacionesArea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaArea.setText("Guardar");
		this.jButtonCerrarArea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoArea,"nuevo_button","Nuevo",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarArea,"duplicar_button","Duplicar",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarArea,"copiar_button","Copiar",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormArea,"ver_form","Ver",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesArea,"nuevorelaciones_button","Nuevo Rel",this.areaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaArea,"guardarcambiostabla_button","Guardar",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarArea,"cerrar_button","Salir",this.areaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesArea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoArea.setToolTipText("Nuevo"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarArea.setToolTipText("Duplicar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarArea.setToolTipText("Copiar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormArea.setToolTipText("Ver"+" "+AreaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesArea.setToolTipText("Nuevo Rel"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaArea.setToolTipText("Guardar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarArea.setToolTipText("Salir"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoArea";
		inputMap = this.jButtonNuevoArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoArea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoArea"));
		
		//DUPLICAR
		sMapKey = "DuplicarArea";
		inputMap = this.jButtonDuplicarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarArea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarArea"));
		
		//COPIAR
		sMapKey = "CopiarArea";
		inputMap = this.jButtonCopiarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarArea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarArea"));
		
		//VEr FORM
		sMapKey = "VerFormArea";
		inputMap = this.jButtonVerFormArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormArea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormArea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesArea";
		inputMap = this.jButtonNuevoRelacionesArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesArea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarArea";
		inputMap = this.jButtonModificarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarArea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarArea";
		inputMap = this.jButtonCerrarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarArea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaArea";
		inputMap = this.jButtonGuardarCambiosTablaArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaArea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Area= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Area= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Area= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Area= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Area= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesArea.setName("jPanelParametrosReportesArea"); 
		
		this.jPanelParametrosReportesAccionesArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesArea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesArea.setName("jPanelParametrosReportesAccionesArea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesArea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesArea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionArea = new JButtonMe();
		this.jButtonRecargarInformacionArea.setText("Recargar");
		this.jButtonRecargarInformacionArea.setToolTipText("Recargar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionArea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionArea = new JButtonMe();
		this.jButtonProcesarInformacionArea.setText("Procesar");
		this.jButtonProcesarInformacionArea.setToolTipText("Procesar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionArea.setVisible(false);
			
		this.jButtonProcesarInformacionArea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionArea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionArea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesArea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesArea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesArea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArea.setText("TIPO");       
		this.jComboBoxTiposReportesArea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesArea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesArea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionArea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionArea.setText("Paginacion");
		this.jComboBoxTiposPaginacionArea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesArea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesArea.setText("Accion");
		this.jComboBoxTiposRelacionesArea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesArea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesArea.setText("Accion");
		this.jComboBoxTiposAccionesArea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarArea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarArea.setText("Accion");
		this.jComboBoxTiposSeleccionarArea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralArea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralArea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralArea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralArea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesArea = new JLabelMe();
		
		this.jLabelAccionesArea.setText("Acciones");		
		this.jLabelAccionesArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosArea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosArea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosArea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosArea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosArea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosArea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaArea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaArea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaArea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteArea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteArea.setText("Graf.");
		this.jCheckBoxConGraficoReporteArea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresArea = new JButtonMe();
		//this.jButtonAnterioresArea.setText("<<");
        this.jButtonAnterioresArea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresArea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesArea = new JButtonMe();
		//this.jButtonSiguientesArea.setText(">>");
        this.jButtonSiguientesArea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesArea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosArea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosArea.setText("Nue");
        this.jButtonNuevoGuardarCambiosArea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosArea,"nuevoguardarcambios_button","Nue",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosArea";
		inputMap = this.jButtonNuevoGuardarCambiosArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosArea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionArea";
		inputMap = this.jButtonRecargarInformacionArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionArea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesArea";
		inputMap = this.jButtonSiguientesArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesArea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresArea";
		inputMap = this.jButtonAnterioresArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresArea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasArea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesArea.setMinimumSize(new Dimension(this.getWidth(),AreaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesArea.setMaximumSize(new Dimension(this.getWidth(),AreaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesArea.setPreferredSize(new Dimension(this.getWidth(),AreaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionArea = new GridBagLayout();

			this.jPanelPaginacionArea.setLayout(gridaBagLayoutPaginacionArea);						
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 0;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionArea.add(this.jButtonAnterioresArea, this.gridBagConstraintsArea);
					
						
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsArea.gridy = 0;
			
			this.jPanelPaginacionArea.add(this.jButtonNuevoGuardarCambiosArea, this.gridBagConstraintsArea);
						
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsArea.gridy = 0;
			this.jPanelPaginacionArea.add(this.jButtonSiguientesArea, this.gridBagConstraintsArea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 1;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArea.add(this.jButtonNuevoArea, this.gridBagConstraintsArea);
						
			
			
			if(!this.areaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsArea = new GridBagConstraints();
				this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsArea.gridy = 1;
				this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionArea.add(this.jButtonGuardarCambiosTablaArea, this.gridBagConstraintsArea);
			}
			
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 1;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArea.add(this.jButtonDuplicarArea, this.gridBagConstraintsArea);
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 1;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArea.add(this.jButtonCopiarArea, this.gridBagConstraintsArea);
		
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 1;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArea.add(this.jButtonVerFormArea, this.gridBagConstraintsArea);
		
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 1;
			this.gridBagConstraintsArea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionArea.add(this.jButtonCerrarArea, this.gridBagConstraintsArea);
		
		
		
		this.jButtonRecargarInformacionArea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionArea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionArea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionArea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesArea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesArea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesArea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesArea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesArea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesArea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesArea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesArea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesArea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionArea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionArea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionArea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesArea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesArea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesArea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesArea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarArea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarArea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarArea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaArea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaArea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaArea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteArea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteArea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteArea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteArea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosArea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosArea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosArea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosArea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosArea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosArea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosArea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosArea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesArea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesArea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Area = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Area = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Area = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Area = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesArea.setLayout(gridaBagParametrosReportesArea);
			this.jPanelParametrosReportesAccionesArea.setLayout(gridaBagParametrosReportesAccionesArea);
			
			
			this.jPanelParametrosAuxiliar1Area.setLayout(gridaBagParametrosAuxiliar1Area);
			this.jPanelParametrosAuxiliar2Area.setLayout(gridaBagParametrosAuxiliar2Area);
			this.jPanelParametrosAuxiliar3Area.setLayout(gridaBagParametrosAuxiliar3Area);
			this.jPanelParametrosAuxiliar4Area.setLayout(gridaBagParametrosAuxiliar4Area);
			//this.jPanelParametrosAuxiliar5Area.setLayout(gridaBagParametrosAuxiliar2Area);			
			
			
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArea.add(this.jButtonRecargarInformacionArea, this.gridBagConstraintsArea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Area.add(this.jComboBoxTiposPaginacionArea, this.gridBagConstraintsArea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Area.add(this.jCheckBoxConAltoMaximoTablaArea, this.gridBagConstraintsArea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Area.add(this.jComboBoxTiposArchivosReportesArea, this.gridBagConstraintsArea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArea.add(this.jPanelParametrosAuxiliar1Area, this.gridBagConstraintsArea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Area.add(this.jComboBoxTiposReportesArea, this.gridBagConstraintsArea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArea.add(this.jPanelParametrosAuxiliar4Area, this.gridBagConstraintsArea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArea.add(this.jComboBoxTiposReportesArea, this.gridBagConstraintsArea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArea.add(this.jCheckBoxGenerarReporteArea, this.gridBagConstraintsArea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArea.add(this.jPanelParametrosAuxiliar2Area, this.gridBagConstraintsArea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArea.add(this.jLabelAccionesArea, this.gridBagConstraintsArea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsArea = new GridBagConstraints();
				this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesArea.add(this.jButtonAbrirOrderByArea, this.gridBagConstraintsArea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArea.add(this.jComboBoxTiposSeleccionarArea, this.gridBagConstraintsArea);			
			
			
			/*
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArea.add(this.jCheckBoxSeleccionarTodosArea, this.gridBagConstraintsArea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Area.add(this.jCheckBoxSeleccionarTodosArea, this.gridBagConstraintsArea);															
				
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Area.add(this.jCheckBoxSeleccionadosArea, this.gridBagConstraintsArea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArea.add(this.jPanelParametrosAuxiliar3Area, this.gridBagConstraintsArea);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArea.add(this.jComboBoxTiposAccionesArea, this.gridBagConstraintsArea);
	
				
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArea.add(this.jTextFieldValorCampoGeneralArea, this.gridBagConstraintsArea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosArea = new GridBagLayout();

			this.jScrollPanelDatosArea.setLayout(gridaBagLayoutDatosArea);
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = 0;
			this.gridBagConstraintsArea.gridx = 0;
			
			this.jScrollPanelDatosArea.add(this.jTableDatosArea, this.gridBagConstraintsArea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosArea.setViewportView(this.jTableDatosArea);
		this.jTableDatosArea.setFillsViewportHeight(true);
		this.jTableDatosArea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesArea= new GridBagLayout();
		this.jPanelAccionesArea.setLayout(gridaBagLayoutAccionesArea);
		
		
		/*	
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 0;
			
		this.jPanelAccionesArea.add(this.jButtonNuevoArea, this.gridBagConstraintsArea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoArea= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoArea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoArea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoArea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoArea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoArea.setLayout(gridaBagLayoutFK_IdEmpleadoArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 0;
		jPanelFK_IdEmpleadoArea.add(jLabelid_empleadoFK_IdEmpleadoArea, gridBagConstraintsArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 1;
		jPanelFK_IdEmpleadoArea.add(jComboBoxid_empleadoFK_IdEmpleadoArea, gridBagConstraintsArea);


		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.EAST;
		gridBagConstraintsArea.fill = GridBagConstraints.NONE;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 0;
		jPanelFK_IdEmpleadoArea.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoArea, gridBagConstraintsArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 1;
		gridBagConstraintsArea.gridx =1;
		jPanelFK_IdEmpleadoArea.add(jButtonFK_IdEmpleadoArea, gridBagConstraintsArea);

		jTabbedPaneBusquedasArea.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoArea);
		jTabbedPaneBusquedasArea.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoSustitutoArea= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoSustitutoArea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSustitutoArea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSustitutoArea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoSustitutoArea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoSustitutoArea.setLayout(gridaBagLayoutFK_IdEmpleadoSustitutoArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 0;
		jPanelFK_IdEmpleadoSustitutoArea.add(jLabelid_empleado_sustitutoFK_IdEmpleadoSustitutoArea, gridBagConstraintsArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 1;
		jPanelFK_IdEmpleadoSustitutoArea.add(jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea, gridBagConstraintsArea);


		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.EAST;
		gridBagConstraintsArea.fill = GridBagConstraints.NONE;
		gridBagConstraintsArea.gridy = 0;
		gridBagConstraintsArea.gridx = 0;
		jPanelFK_IdEmpleadoSustitutoArea.add(this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea, gridBagConstraintsArea);

		gridBagConstraintsArea = new GridBagConstraints();
		gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArea.gridy = 1;
		gridBagConstraintsArea.gridx =1;
		jPanelFK_IdEmpleadoSustitutoArea.add(jButtonFK_IdEmpleadoSustitutoArea, gridBagConstraintsArea);

		jTabbedPaneBusquedasArea.addTab("2.-Por Empleado Sustituto ", jPanelFK_IdEmpleadoSustitutoArea);
		jTabbedPaneBusquedasArea.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutArea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutArea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.areaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsArea = new GridBagConstraints();						
			this.gridBagConstraintsArea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArea.gridx = 0;		
			//this.gridBagConstraintsArea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsArea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarArea, this.gridBagConstraintsArea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsArea.gridx = 0;		
		//this.gridBagConstraintsArea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsArea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsArea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsArea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArea.gridx = 0;		
			this.gridBagConstraintsArea.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsArea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasArea, this.gridBagConstraintsArea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesArea, this.gridBagConstraintsArea);								
		
		
		/*
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesArea, this.gridBagConstraintsArea);
		*/		
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsArea.gridx =0;
		this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsArea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosArea, this.gridBagConstraintsArea);
				
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionArea, this.gridBagConstraintsArea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AreaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosArea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosArea = new GridBagLayout();
			this.jPanelBusquedasParametrosArea.setLayout(gridaBagLayoutBusquedasParametrosArea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralArea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralArea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposArea, this.gridBagConstraintsArea);
			
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosArea, this.gridBagConstraintsArea);
		
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesArea, this.gridBagConstraintsArea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralArea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoArea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoArea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoArea.setName("jPanelReporteDinamicoArea"); 
		
		this.jPanelReporteDinamicoArea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoArea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoArea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoArea.setLayout(gridaBagLayoutReporteDinamicoArea);
		
		
		this.jInternalFrameReporteDinamicoArea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoArea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteArea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoArea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoArea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoArea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoArea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoArea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoArea.setResizable(true);
	    this.jInternalFrameReporteDinamicoArea.setClosable(true);
	    this.jInternalFrameReporteDinamicoArea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoArea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoArea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoArea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteArea = new JLabelMe();

		this.jLabelColumnasSelectReporteArea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoArea.add(this.jLabelColumnasSelectReporteArea, this.gridBagConstraintsArea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteArea = new JList<Reporte>();
		this.jListColumnasSelectReporteArea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteArea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteArea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteArea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteArea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteArea=new JScrollPane(this.jListColumnasSelectReporteArea);
			
			this.jScrollColumnasSelectReporteArea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteArea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteArea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteArea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoArea.add(this.jListColumnasSelectReporteArea, this.gridBagConstraintsArea);
		this.jPanelReporteDinamicoArea.add(this.jScrollColumnasSelectReporteArea, this.gridBagConstraintsArea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteArea = new JLabelMe();

		this.jLabelRelacionesSelectReporteArea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteArea = new JList<Reporte>();
		this.jListRelacionesSelectReporteArea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteArea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteArea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteArea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteArea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteArea=new JScrollPane(this.jListRelacionesSelectReporteArea);
			
			this.jScrollRelacionesSelectReporteArea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteArea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteArea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteArea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoArea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoArea = new JComboBoxMe();
		this.jListColumnasValoresGraficoArea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoArea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoArea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoArea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoArea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoArea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoArea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoArea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoArea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoArea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoArea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoArea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoArea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoArea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoArea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArea.add(this.jLabelGenerarExcelReporteDinamicoArea, this.gridBagConstraintsArea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoArea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoArea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoArea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoArea.setToolTipText("Generar EXCEL"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoArea.add(this.jButtonGenerarExcelReporteDinamicoArea, this.gridBagConstraintsArea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArea.add(this.jComboBoxTiposReportesDinamicoArea, this.gridBagConstraintsArea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoArea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoArea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArea.add(this.jLabelTiposArchivoReporteDinamicoArea, this.gridBagConstraintsArea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArea.add(this.jComboBoxTiposArchivosReportesDinamicoArea, this.gridBagConstraintsArea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoArea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoArea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoArea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoArea.setToolTipText("Generar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArea.add(this.jButtonGenerarReporteDinamicoArea, this.gridBagConstraintsArea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoArea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoArea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoArea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoArea.setToolTipText("Cancelar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArea.add(this.jButtonCerrarReporteDinamicoArea, this.gridBagConstraintsArea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalArea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoArea= new JScrollPane(jPanelReporteDinamicoArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoArea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoArea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoArea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsArea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoArea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoArea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalArea);
		this.jInternalFrameReporteDinamicoArea.getContentPane().add(this.jScrollPanelReporteDinamicoArea, this.gridBagConstraintsArea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionArea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionArea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionArea.setName("jPanelImportacionArea"); 
		
		this.jPanelImportacionArea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionArea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionArea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionArea.setLayout(gridaBagLayoutImportacionArea);
		
		
		this.jInternalFrameImportacionArea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionArea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionArea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteArea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionArea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionArea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionArea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionArea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionArea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionArea.setResizable(true);
	    this.jInternalFrameImportacionArea.setClosable(true);
	    this.jInternalFrameImportacionArea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionArea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionArea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionArea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionArea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionArea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionArea.setResizable(true);
	    this.jInternalFrameImportacionArea.setClosable(true);
	    this.jInternalFrameImportacionArea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionArea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionArea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionArea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionArea = new JLabelMe();

		this.jLabelArchivoImportacionArea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;		
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionArea.add(this.jLabelArchivoImportacionArea, this.gridBagConstraintsArea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionArea = new JFileChooser();		
		this.jFileChooserImportacionArea.setToolTipText("ESCOGER ARCHIVO"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionArea = new JButtonMe();
		this.jButtonAbrirImportacionArea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionArea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionArea.setToolTipText("Generar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArea.add(this.jButtonAbrirImportacionArea, this.gridBagConstraintsArea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionArea = new JLabelMe();

		this.jLabelPathArchivoImportacionArea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;		
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionArea.add(this.jLabelPathArchivoImportacionArea, this.gridBagConstraintsArea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionArea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionArea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionArea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionArea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArea.add(this.jTextFieldPathArchivoImportacionArea, this.gridBagConstraintsArea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionArea = new JButtonMe();
		this.jButtonGenerarImportacionArea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionArea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionArea.setToolTipText("Generar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArea.add(this.jButtonGenerarImportacionArea, this.gridBagConstraintsArea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionArea = new JButtonMe();
		this.jButtonCerrarImportacionArea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionArea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionArea.setToolTipText("Cancelar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = iPosYImportacion;
		this.gridBagConstraintsArea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArea.add(this.jButtonCerrarImportacionArea, this.gridBagConstraintsArea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalArea = new GridBagLayout();
		
		this.jScrollPanelImportacionArea= new JScrollPane(jPanelImportacionArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iPosYImportacion;
		this.gridBagConstraintsArea.gridx =iPosXImportacion;
		this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionArea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionArea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalArea);
		this.jInternalFrameImportacionArea.getContentPane().add(this.jScrollPanelImportacionArea, this.gridBagConstraintsArea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByArea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByArea = new JButtonMe();
			this.jButtonAbrirOrderByArea.setText("Orden");
			this.jButtonAbrirOrderByArea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByArea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByArea";
			inputMap = this.jButtonAbrirOrderByArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByArea"));
		
		
			GridBagLayout gridaBagLayoutOrderByArea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByArea.setName("jPanelOrderByArea"); 
			
			this.jPanelOrderByArea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByArea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByArea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByArea.setLayout(gridaBagLayoutOrderByArea);
			
			
			this.jTableDatosAreaOrderBy = new JTableMe();        
			this.jTableDatosAreaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAreaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAreaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAreaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAreaOrderBy.setViewportView(this.jTableDatosAreaOrderBy);
			this.jTableDatosAreaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAreaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByArea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByArea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByArea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteArea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByArea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByArea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByArea.setTitle("Orden");
			this.jInternalFrameOrderByArea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByArea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByArea.setResizable(true);
			this.jInternalFrameOrderByArea.setClosable(true);
			this.jInternalFrameOrderByArea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByArea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByArea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByArea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsArea.gridx =iPosXOrderBy;
			this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsArea.ipady =150;
				
			this.jPanelOrderByArea.add(jScrollPanelDatosAreaOrderBy, this.gridBagConstraintsArea);//this.jTableDatosAreaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByArea = new JButtonMe();
			this.jButtonCerrarOrderByArea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByArea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByArea.setToolTipText("Cancelar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsArea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByArea.add(this.jButtonCerrarOrderByArea, this.gridBagConstraintsArea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalArea = new GridBagLayout();
			
			this.jScrollPanelOrderByArea= new JScrollPane(jPanelOrderByArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy =iPosYOrderBy;
			this.gridBagConstraintsArea.gridx =iPosXOrderBy;
			this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByArea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByArea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalArea);
			
			this.jInternalFrameOrderByArea.getContentPane().add(this.jScrollPanelOrderByArea, this.gridBagConstraintsArea);			
		
		} else {
			this.jButtonAbrirOrderByArea = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.areaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosArea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosArea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosArea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosArea.getRowHeight();//AreaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AreaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaArea.isSelected()) {
					iHeightTable=AreaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AreaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AreaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AreaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaArea.isSelected()) {
					iHeightTable=AreaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AreaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AreaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosArea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosArea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosArea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosArea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosArea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosArea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByArea!=null && this.jInternalFrameOrderByArea.getjTableDatosOrderBy()!=null) {
			//if(!this.areaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByArea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByArea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByArea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByArea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByArea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByArea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByArea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosArea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosArea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosArea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=areaLogic.getAreas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Area> TraerAreaBeans(List<Area> areas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Area area:areas) {
					
				if(!(AreaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AreaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					area.setsDetalleGeneralEntityReporte(AreaConstantesFunciones.getAreaDescripcion(area));
										
						
					
						
					
				} else  {
							
					//area.setsDetalleGeneralEntityReporte(area.getsDetalleGeneralEntityReporte());
										
				}
				
				//areabeans.add(areabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return areas;
    }
	//PARA REPORTES FIN
}
