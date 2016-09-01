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
import com.bydan.erp.nomina.util.ProfesionEmpleaConstantesFunciones;

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
public class ProfesionEmpleaJInternalFrame extends ProfesionEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProfesionEmplea;
	
	protected JMenuBar jmenuBarProfesionEmplea;
	
	protected JMenu jmenuProfesionEmplea;
	protected JMenu jmenuDatosProfesionEmplea;
	protected JMenu jmenuArchivoProfesionEmplea;
	protected JMenu jmenuAccionesProfesionEmplea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProfesionEmplea;	
	protected GridBagConstraints gridBagConstraintsProfesionEmplea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProfesionEmpleaDetalleFormJInternalFrame jInternalFrameDetalleFormProfesionEmplea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProfesionEmplea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProfesionEmplea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";
	
	public ProfesionEmpleaSessionBean profesionempleaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ProfesionSessionBean profesionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProfesionEmplea> profesionempleas;		
	public List<ProfesionEmplea> profesionempleasEliminados;	
	public List<ProfesionEmplea> profesionempleasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProfesionEmplea;		
	protected JButton jButtonAbrirOrderByProfesionEmplea;
	
	
	//protected JPanel jPanelOrderByProfesionEmplea;
	//public JScrollPane jScrollPanelOrderByProfesionEmplea;	
	//protected JButton jButtonCerrarOrderByProfesionEmplea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProfesionEmpleaLogic profesionempleaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProfesionEmplea;
	public JScrollPane jScrollPanelDatosEdicionProfesionEmplea;
	public JScrollPane jScrollPanelDatosGeneralProfesionEmplea;
    
	
	
	//public JScrollPane jScrollPanelDatosProfesionEmpleaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProfesionEmplea;
	//public JScrollPane jScrollPanelImportacionProfesionEmplea;
	
	
	
	protected JPanel jPanelAccionesProfesionEmplea;
	
    protected JPanel jPanelPaginacionProfesionEmplea;
    protected JPanel jPanelParametrosReportesProfesionEmplea;
	protected JPanel jPanelParametrosReportesAccionesProfesionEmplea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProfesionEmplea;
	protected JPanel jPanelParametrosAuxiliar2ProfesionEmplea;
	protected JPanel jPanelParametrosAuxiliar3ProfesionEmplea;
	protected JPanel jPanelParametrosAuxiliar4ProfesionEmplea;
	//protected JPanel jPanelParametrosAuxiliar5ProfesionEmplea;
	
	
	
	//protected JPanel jPanelReporteDinamicoProfesionEmplea;
	//protected JPanel jPanelImportacionProfesionEmplea;
	
	
	public JTable jTableDatosProfesionEmplea;
	
	
	
	//public JTable jTableDatosProfesionEmpleaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProfesionEmplea;
	protected JButton jButtonDuplicarProfesionEmplea;
	protected JButton jButtonCopiarProfesionEmplea;
	protected JButton jButtonVerFormProfesionEmplea;
	protected JButton jButtonNuevoRelacionesProfesionEmplea;
	protected JButton jButtonModificarProfesionEmplea;
	
    protected JButton jButtonGuardarCambiosTablaProfesionEmplea;
	protected JButton jButtonCerrarProfesionEmplea;
	
	
	protected JButton jButtonRecargarInformacionProfesionEmplea;
	protected JButton jButtonProcesarInformacionProfesionEmplea;
	
	
	protected JButton jButtonAnterioresProfesionEmplea;
	protected JButton jButtonSiguientesProfesionEmplea;
	protected JButton jButtonNuevoGuardarCambiosProfesionEmplea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProfesionEmplea;
	//protected JButton jButtonCerrarReporteDinamicoProfesionEmplea;
	//protected JButton jButtonGenerarExcelReporteDinamicoProfesionEmplea;	
	
	
	
	//protected JButton jButtonAbrirImportacionProfesionEmplea;
	//protected JButton jButtonGenerarImportacionProfesionEmplea;
	//protected JButton jButtonCerrarImportacionProfesionEmplea;
	//protected JFileChooser jFileChooserImportacionProfesionEmplea;
	//protected File fileImportacionProfesionEmplea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProfesionEmplea;
	protected JButton jButtonDuplicarToolBarProfesionEmplea;
	protected JButton jButtonNuevoRelacionesToolBarProfesionEmplea;
	
	
	public JButton jButtonGuardarCambiosToolBarProfesionEmplea;
	protected JButton jButtonCopiarToolBarProfesionEmplea;
	protected JButton jButtonVerFormToolBarProfesionEmplea;
	public JButton jButtonGuardarCambiosTablaToolBarProfesionEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarProfesionEmplea;
	protected JButton jButtonCerrarToolBarProfesionEmplea;
	
	protected JButton jButtonRecargarInformacionToolBarProfesionEmplea;
	protected JButton jButtonProcesarInformacionToolBarProfesionEmplea;
	protected JButton jButtonAnterioresToolBarProfesionEmplea;
	protected JButton jButtonSiguientesToolBarProfesionEmplea;
	protected JButton jButtonNuevoGuardarCambiosToolBarProfesionEmplea;
	protected JButton jButtonAbrirOrderByToolBarProfesionEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProfesionEmplea;
	protected JMenuItem jMenuItemDuplicarProfesionEmplea;
	protected JMenuItem jMenuItemNuevoRelacionesProfesionEmplea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProfesionEmplea;
	protected JMenuItem jMenuItemCopiarProfesionEmplea;
	protected JMenuItem jMenuItemVerFormProfesionEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaProfesionEmplea;
	protected JMenuItem jMenuItemCerrarProfesionEmplea;
	protected JMenuItem jMenuItemDetalleCerrarProfesionEmplea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProfesionEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarProfesionEmplea;
	
	protected JMenuItem jMenuItemRecargarInformacionProfesionEmplea;
	protected JMenuItem jMenuItemProcesarInformacionProfesionEmplea;
	protected JMenuItem jMenuItemAnterioresProfesionEmplea;
	protected JMenuItem jMenuItemSiguientesProfesionEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProfesionEmplea;
	protected JMenuItem jMenuItemAbrirOrderByProfesionEmplea;
	protected JMenuItem jMenuItemMostrarOcultarProfesionEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProfesionEmplea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProfesionEmplea;
	protected JCheckBox jCheckBoxSeleccionadosProfesionEmplea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProfesionEmplea;
	protected JCheckBox jCheckBoxConGraficoReporteProfesionEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProfesionEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProfesionEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProfesionEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProfesionEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProfesionEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProfesionEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProfesionEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProfesionEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProfesionEmplea;
	protected JTextField jTextFieldValorCampoGeneralProfesionEmplea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProfesionEmplea;
	//public JList<Reporte> jListColumnasSelectReporteProfesionEmplea;
	//public JScrollPane jScrollColumnasSelectReporteProfesionEmplea;
	
	//public JLabel jLabelRelacionesSelectReporteProfesionEmplea;
	//public JList<Reporte> jListRelacionesSelectReporteProfesionEmplea;
	//public JScrollPane jScrollRelacionesSelectReporteProfesionEmplea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProfesionEmplea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProfesionEmplea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProfesionEmplea;
	//public JLabel jLabelTiposArchivoReporteDinamicoProfesionEmplea;
	
		
	//public JLabel jLabelArchivoImportacionProfesionEmplea;	
	//public JLabel jLabelPathArchivoImportacionProfesionEmplea;
	//protected JTextField jTextFieldPathArchivoImportacionProfesionEmplea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProfesionEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProfesionEmplea;
	
	//public JLabel jLabelColumnaCategoriaValorProfesionEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProfesionEmplea;
	
	//public JLabel jLabelColumnasValoresGraficoProfesionEmplea;
	//public JList<Reporte> jListColumnasValoresGraficoProfesionEmplea;
	//public JScrollPane jScrollColumnasValoresGraficoProfesionEmplea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProfesionEmplea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProfesionEmplea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProfesionEmplea;
	public JPanel jPanelFK_IdEmpleadoProfesionEmplea;
	public JButton jButtonFK_IdEmpleadoProfesionEmplea;
	public JPanel jPanelFK_IdProfesionProfesionEmplea;
	public JButton jButtonFK_IdProfesionProfesionEmplea;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoProfesionEmplea;
	public JLabel jLabelid_empleadoFK_IdEmpleadoProfesionEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea;
	public JButton jButtonid_empleadoFK_IdEmpleadoProfesionEmplea= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProfesionEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProfesionEmpleaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea;
	
	public JPanel jPanelid_profesionFK_IdProfesionProfesionEmplea;
	public JLabel jLabelid_profesionFK_IdProfesionProfesionEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_profesionFK_IdProfesionProfesionEmplea;
	public JButton jButtonid_profesionFK_IdProfesionProfesionEmplea= new JButtonMe();
	public JButton jButtonid_profesionFK_IdProfesionProfesionEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_profesionFK_IdProfesionProfesionEmpleaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProfesionEmpleaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProfesionEmplea)	{
		this.jButtonRecargarInformacionProfesionEmplea = jButtonRecargarInformacionProfesionEmplea;
	}
	
	public JButton getjButtonProcesarInformacionProfesionEmplea() {
		return this.jButtonProcesarInformacionProfesionEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProfesionEmplea)	{
		this.jButtonProcesarInformacionProfesionEmplea = jButtonProcesarInformacionProfesionEmplea;
	}
	
	
	public JButton getjButtonRecargarInformacionProfesionEmplea() {
		return this.jButtonRecargarInformacionProfesionEmplea;
	}
	
	
	public List<ProfesionEmplea> getprofesionempleas() {
		return this.profesionempleas;
	}

	public void setprofesionempleas(List<ProfesionEmplea> profesionempleas) {
		this.profesionempleas = profesionempleas;
	}
	
	public List<ProfesionEmplea> getprofesionempleasAux() {
		return this.profesionempleasAux;
	}

	public void setprofesionempleasAux(List<ProfesionEmplea> profesionempleasAux) {
		this.profesionempleasAux = profesionempleasAux;
	}
	
	public List<ProfesionEmplea> getprofesionempleasEliminados() {
		return this.profesionempleasEliminados;
	}

	public void setProfesionEmpleasEliminados(List<ProfesionEmplea> profesionempleasEliminados) {
		this.profesionempleasEliminados = profesionempleasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProfesionEmplea() {
		return jComboBoxTiposSeleccionarProfesionEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProfesionEmplea(
			JComboBox jComboBoxTiposSeleccionarProfesionEmplea) {
		this.jComboBoxTiposSeleccionarProfesionEmplea = jComboBoxTiposSeleccionarProfesionEmplea;
	}
	
	public void setBorderResaltarTiposSeleccionarProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProfesionEmplea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProfesionEmplea() {
		return jTextFieldValorCampoGeneralProfesionEmplea;
	}

	public void setjTextFieldValorCampoGeneralProfesionEmplea(
			JTextField jTextFieldValorCampoGeneralProfesionEmplea) {
		this.jTextFieldValorCampoGeneralProfesionEmplea = jTextFieldValorCampoGeneralProfesionEmplea;
	}

	public void setBorderResaltarValorCampoGeneralProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProfesionEmplea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProfesionEmplea() {
		return this.jCheckBoxSeleccionarTodosProfesionEmplea;
	}

	public void setjCheckBoxSeleccionarTodosProfesionEmplea(
			JCheckBox jCheckBoxSeleccionarTodosProfesionEmplea) {
		this.jCheckBoxSeleccionarTodosProfesionEmplea = jCheckBoxSeleccionarTodosProfesionEmplea;
	}

	public void setBorderResaltarSeleccionarTodosProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProfesionEmplea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProfesionEmplea() {
		return this.jCheckBoxSeleccionadosProfesionEmplea;
	}

	public void setjCheckBoxSeleccionadosProfesionEmplea(
			JCheckBox jCheckBoxSeleccionadosProfesionEmplea) {
		this.jCheckBoxSeleccionadosProfesionEmplea = jCheckBoxSeleccionadosProfesionEmplea;
	}
	
	public void setBorderResaltarSeleccionadosProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProfesionEmplea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProfesionEmplea() {
		return this.jComboBoxTiposArchivosReportesProfesionEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProfesionEmplea(
			JComboBox jComboBoxTiposArchivosReportesProfesionEmplea) {
		this.jComboBoxTiposArchivosReportesProfesionEmplea = jComboBoxTiposArchivosReportesProfesionEmplea;
	}

	public void setBorderResaltarTiposArchivosReportesProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProfesionEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProfesionEmplea() {
		return this.jComboBoxTiposReportesProfesionEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProfesionEmplea(
			JComboBox jComboBoxTiposReportesProfesionEmplea) {
		this.jComboBoxTiposReportesProfesionEmplea = jComboBoxTiposReportesProfesionEmplea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProfesionEmplea() {
	//	return jComboBoxTiposReportesDinamicoProfesionEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProfesionEmplea(
	//		JComboBox jComboBoxTiposReportesDinamicoProfesionEmplea) {
	//	this.jComboBoxTiposReportesDinamicoProfesionEmplea = jComboBoxTiposReportesDinamicoProfesionEmplea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProfesionEmplea() {
	//	return jComboBoxTiposArchivosReportesDinamicoProfesionEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProfesionEmplea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProfesionEmplea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea = jComboBoxTiposArchivosReportesDinamicoProfesionEmplea;
	//}
	
	public void setBorderResaltarTiposReportesProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProfesionEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProfesionEmplea() {
		return this.jComboBoxTiposGraficosReportesProfesionEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProfesionEmplea(
			JComboBox jComboBoxTiposGraficosReportesProfesionEmplea) {
		this.jComboBoxTiposGraficosReportesProfesionEmplea = jComboBoxTiposGraficosReportesProfesionEmplea;
	}
	
	public void setBorderResaltarTiposGraficosReportesProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProfesionEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProfesionEmplea() {
		return this.jComboBoxTiposPaginacionProfesionEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProfesionEmplea(
			JComboBox jComboBoxTiposPaginacionProfesionEmplea) {
		this.jComboBoxTiposPaginacionProfesionEmplea = jComboBoxTiposPaginacionProfesionEmplea;
	}
	
	public void setBorderResaltarTiposPaginacionProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProfesionEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProfesionEmplea() {
		return this.jComboBoxTiposRelacionesProfesionEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProfesionEmplea() {
		return this.jComboBoxTiposAccionesProfesionEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProfesionEmplea(
			JComboBox jComboBoxTiposRelacionesProfesionEmplea) {
		this.jComboBoxTiposRelacionesProfesionEmplea = jComboBoxTiposRelacionesProfesionEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProfesionEmplea(
			JComboBox jComboBoxTiposAccionesProfesionEmplea) {
		this.jComboBoxTiposAccionesProfesionEmplea = jComboBoxTiposAccionesProfesionEmplea;
	}
	
	public void setBorderResaltarTiposRelacionesProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProfesionEmplea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProfesionEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProfesionEmplea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProfesionEmplea() {
	//	return jCheckBoxConGraficoDinamicoProfesionEmplea;
	//}

	//public void setjCheckBoxConGraficoDinamicoProfesionEmplea(
	//		JCheckBox jCheckBoxConGraficoDinamicoProfesionEmplea) {
	//	this.jCheckBoxConGraficoDinamicoProfesionEmplea = jCheckBoxConGraficoDinamicoProfesionEmplea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProfesionEmplea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProfesionEmplea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProfesionEmplea .setBorder(borderResaltar);		
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
		this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		
		this.profesionempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.profesionempleaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProfesionEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Profesion Emplea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProfesionEmplea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"nuevo","nuevo","Nuevo"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"duplicar","duplicar","Duplicar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"copiar","copiar","Copiar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"ver_form","ver_form","Ver"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"recargar","recargar","Recargar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProfesionEmplea,this.jTtoolBarProfesionEmplea,
							"cerrar","cerrar","Salir"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProfesionEmplea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProfesionEmplea;
			
				this.jButtonProcesarInformacionToolBarProfesionEmplea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProfesionEmplea;
				
		//protected JButton jButtonModificarToolBarProfesionEmplea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProfesionEmplea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProfesionEmplea=new JMenuMe("General");
		this.jmenuArchivoProfesionEmplea=new JMenuMe("Archivo");
		this.jmenuAccionesProfesionEmplea=new JMenuMe("Acciones");
		this.jmenuDatosProfesionEmplea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProfesionEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProfesionEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProfesionEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProfesionEmplea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProfesionEmplea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProfesionEmplea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProfesionEmplea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProfesionEmplea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProfesionEmplea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProfesionEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProfesionEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProfesionEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProfesionEmplea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProfesionEmplea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProfesionEmplea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProfesionEmplea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProfesionEmplea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProfesionEmplea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProfesionEmplea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProfesionEmplea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProfesionEmplea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProfesionEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProfesionEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProfesionEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProfesionEmplea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProfesionEmplea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProfesionEmplea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProfesionEmplea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProfesionEmplea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProfesionEmplea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProfesionEmplea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProfesionEmplea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProfesionEmplea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProfesionEmplea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProfesionEmplea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProfesionEmplea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProfesionEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProfesionEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProfesionEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProfesionEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProfesionEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProfesionEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProfesionEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProfesionEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProfesionEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProfesionEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProfesionEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProfesionEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProfesionEmplea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProfesionEmplea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProfesionEmplea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProfesionEmplea.add(this.jMenuItemCerrarProfesionEmplea);
			
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemNuevoProfesionEmplea);
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemNuevoGuardarCambiosProfesionEmplea);
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemNuevoRelacionesProfesionEmplea);
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemGuardarCambiosTablaProfesionEmplea);		
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemDuplicarProfesionEmplea);		
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemCopiarProfesionEmplea);		
			this.jmenuAccionesProfesionEmplea.add(this.jMenuItemVerFormProfesionEmplea);		
			
			this.jmenuDatosProfesionEmplea.add(this.jMenuItemRecargarInformacionProfesionEmplea);				
			this.jmenuDatosProfesionEmplea.add(this.jMenuItemAnterioresProfesionEmplea);				
			this.jmenuDatosProfesionEmplea.add(this.jMenuItemSiguientesProfesionEmplea);				
			this.jmenuDatosProfesionEmplea.add(this.jMenuItemAbrirOrderByProfesionEmplea);				
			this.jmenuDatosProfesionEmplea.add(this.jMenuItemMostrarOcultarProfesionEmplea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProfesionEmplea.add(this.jMenuItemGuardarCambiosProfesionEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProfesionEmplea.add(this.jmenuArchivoProfesionEmplea);		
			this.jmenuBarProfesionEmplea.add(this.jmenuAccionesProfesionEmplea);		
			this.jmenuBarProfesionEmplea.add(this.jmenuDatosProfesionEmplea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProfesionEmplea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProfesionEmplea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoProfesionEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoProfesionEmplea.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoProfesionEmplea= new JButtonMe();
		this.jButtonFK_IdEmpleadoProfesionEmplea.setText("Buscar");
		this.jButtonFK_IdEmpleadoProfesionEmplea.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoProfesionEmplea,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.setFocusable(false);

		this.jPanelFK_IdProfesionProfesionEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProfesionProfesionEmplea.setToolTipText("Buscar Por Profesion ");
		this.jButtonFK_IdProfesionProfesionEmplea= new JButtonMe();
		this.jButtonFK_IdProfesionProfesionEmplea.setText("Buscar");
		this.jButtonFK_IdProfesionProfesionEmplea.setToolTipText("Buscar Por Profesion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProfesionProfesionEmplea,"buscar_button","Buscar Por Profesion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProfesionProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_profesionFK_IdProfesionProfesionEmplea = new JLabelMe();
		jLabelid_profesionFK_IdProfesionProfesionEmplea.setText("Profesion :");
		jLabelid_profesionFK_IdProfesionProfesionEmplea.setToolTipText("Profesion");
		jLabelid_profesionFK_IdProfesionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_profesionFK_IdProfesionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_profesionFK_IdProfesionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_profesionFK_IdProfesionProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_profesionFK_IdProfesionProfesionEmplea= new JComboBoxMe();
		jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_profesionFK_IdProfesionProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProfesionEmplea=new JTabbedPane();


		this.jTabbedPaneBusquedasProfesionEmplea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProfesionEmplea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProfesionEmplea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProfesionEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProfesionEmplea = new ProfesionEmpleaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Profesion Emplea DATOS");
			this.jInternalFrameDetalleFormProfesionEmplea = new ProfesionEmpleaDetalleFormJInternalFrame(jDesktopPane,this.profesionempleaSessionBean.getConGuardarRelaciones(),this.profesionempleaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProfesionEmplea = null;//new ProfesionEmpleaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProfesionEmplea= new GridBagLayout();
		
		
		this.jTableDatosProfesionEmplea = new JTableMe();      
		
		String sToolTipProfesionEmplea="";
		sToolTipProfesionEmplea=ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProfesionEmplea+="(Nomina.ProfesionEmplea)";
		}
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProfesionEmplea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProfesionEmplea.setToolTipText(sToolTipProfesionEmplea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProfesionEmplea);
		this.jTableDatosProfesionEmplea.setAutoCreateRowSorter(true);
		this.jTableDatosProfesionEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProfesionEmplea.setRowSelectionAllowed(true);
		this.jTableDatosProfesionEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProfesionEmplea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProfesionEmplea = new JButtonMe();
		this.jButtonDuplicarProfesionEmplea = new JButtonMe();
		this.jButtonCopiarProfesionEmplea = new JButtonMe();
		this.jButtonVerFormProfesionEmplea = new JButtonMe();
		this.jButtonNuevoRelacionesProfesionEmplea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProfesionEmplea = new JButtonMe();
		this.jButtonCerrarProfesionEmplea = new JButtonMe();
		
		this.jScrollPanelDatosProfesionEmplea = new JScrollPane();   
        this.jScrollPanelDatosGeneralProfesionEmplea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Profesion Emplea";
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas" + this.sPath));
		} else {
			this.jScrollPanelDatosProfesionEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProfesionEmplea.setToolTipText("Acciones");
        this.jPanelAccionesProfesionEmplea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProfesionEmplea=new ReporteDinamicoJInternalFrame(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProfesionEmplea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProfesionEmplea=new ImportacionJInternalFrame(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProfesionEmplea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProfesionEmplea = new JButtonMe();
		
		this.jButtonAbrirOrderByProfesionEmplea.setText("Orden");
		this.jButtonAbrirOrderByProfesionEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProfesionEmplea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProfesionEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesionEmplea,false,this);
			
			//this.cargarOrderByProfesionEmplea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProfesionEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesionEmplea,true,this);
			
			//this.cargarOrderByProfesionEmplea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProfesionEmplea.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProfesionEmplea.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProfesionEmplea.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProfesionEmplea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProfesionEmplea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProfesionEmplea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProfesionEmplea.setText("Nuevo");
		this.jButtonDuplicarProfesionEmplea.setText("Duplicar");
		this.jButtonCopiarProfesionEmplea.setText("Copiar");
		this.jButtonVerFormProfesionEmplea.setText("Ver");
		this.jButtonNuevoRelacionesProfesionEmplea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.setText("Guardar");
		this.jButtonCerrarProfesionEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProfesionEmplea,"nuevo_button","Nuevo",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProfesionEmplea,"duplicar_button","Duplicar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProfesionEmplea,"copiar_button","Copiar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProfesionEmplea,"ver_form","Ver",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProfesionEmplea,"nuevorelaciones_button","Nuevo Rel",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProfesionEmplea,"guardarcambiostabla_button","Guardar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProfesionEmplea,"cerrar_button","Salir",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProfesionEmplea.setToolTipText("Nuevo"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProfesionEmplea.setToolTipText("Duplicar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProfesionEmplea.setToolTipText("Copiar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProfesionEmplea.setToolTipText("Ver"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProfesionEmplea.setToolTipText("Nuevo Rel"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.setToolTipText("Guardar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProfesionEmplea.setToolTipText("Salir"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProfesionEmplea";
		inputMap = this.jButtonNuevoProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProfesionEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProfesionEmplea"));
		
		//DUPLICAR
		sMapKey = "DuplicarProfesionEmplea";
		inputMap = this.jButtonDuplicarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProfesionEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProfesionEmplea"));
		
		//COPIAR
		sMapKey = "CopiarProfesionEmplea";
		inputMap = this.jButtonCopiarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProfesionEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProfesionEmplea"));
		
		//VEr FORM
		sMapKey = "VerFormProfesionEmplea";
		inputMap = this.jButtonVerFormProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProfesionEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProfesionEmplea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProfesionEmplea";
		inputMap = this.jButtonNuevoRelacionesProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProfesionEmplea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProfesionEmplea";
		inputMap = this.jButtonModificarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProfesionEmplea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProfesionEmplea";
		inputMap = this.jButtonCerrarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProfesionEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProfesionEmplea";
		inputMap = this.jButtonGuardarCambiosTablaProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProfesionEmplea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProfesionEmplea.setName("jPanelParametrosReportesProfesionEmplea"); 
		
		this.jPanelParametrosReportesAccionesProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProfesionEmplea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProfesionEmplea.setName("jPanelParametrosReportesAccionesProfesionEmplea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProfesionEmplea = new JButtonMe();
		this.jButtonRecargarInformacionProfesionEmplea.setText("Recargar");
		this.jButtonRecargarInformacionProfesionEmplea.setToolTipText("Recargar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProfesionEmplea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProfesionEmplea = new JButtonMe();
		this.jButtonProcesarInformacionProfesionEmplea.setText("Procesar");
		this.jButtonProcesarInformacionProfesionEmplea.setToolTipText("Procesar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProfesionEmplea.setVisible(false);
			
		this.jButtonProcesarInformacionProfesionEmplea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProfesionEmplea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProfesionEmplea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesionEmplea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProfesionEmplea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesionEmplea.setText("TIPO");       
		this.jComboBoxTiposReportesProfesionEmplea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesionEmplea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProfesionEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProfesionEmplea.setText("Paginacion");
		this.jComboBoxTiposPaginacionProfesionEmplea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProfesionEmplea.setText("Accion");
		this.jComboBoxTiposRelacionesProfesionEmplea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProfesionEmplea.setText("Accion");
		this.jComboBoxTiposAccionesProfesionEmplea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProfesionEmplea.setText("Accion");
		this.jComboBoxTiposSeleccionarProfesionEmplea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProfesionEmplea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProfesionEmplea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProfesionEmplea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProfesionEmplea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProfesionEmplea = new JLabelMe();
		
		this.jLabelAccionesProfesionEmplea.setText("Acciones");		
		this.jLabelAccionesProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProfesionEmplea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProfesionEmplea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProfesionEmplea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProfesionEmplea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProfesionEmplea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProfesionEmplea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProfesionEmplea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProfesionEmplea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProfesionEmplea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProfesionEmplea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProfesionEmplea.setText("Graf.");
		this.jCheckBoxConGraficoReporteProfesionEmplea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProfesionEmplea = new JButtonMe();
		//this.jButtonAnterioresProfesionEmplea.setText("<<");
        this.jButtonAnterioresProfesionEmplea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProfesionEmplea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProfesionEmplea = new JButtonMe();
		//this.jButtonSiguientesProfesionEmplea.setText(">>");
        this.jButtonSiguientesProfesionEmplea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProfesionEmplea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProfesionEmplea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProfesionEmplea.setText("Nue");
        this.jButtonNuevoGuardarCambiosProfesionEmplea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProfesionEmplea,"nuevoguardarcambios_button","Nue",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProfesionEmplea";
		inputMap = this.jButtonNuevoGuardarCambiosProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProfesionEmplea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProfesionEmplea";
		inputMap = this.jButtonRecargarInformacionProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProfesionEmplea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProfesionEmplea";
		inputMap = this.jButtonSiguientesProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProfesionEmplea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProfesionEmplea";
		inputMap = this.jButtonAnterioresProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProfesionEmplea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProfesionEmplea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProfesionEmplea.setMinimumSize(new Dimension(this.getWidth(),ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProfesionEmplea.setMaximumSize(new Dimension(this.getWidth(),ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProfesionEmplea.setPreferredSize(new Dimension(this.getWidth(),ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProfesionEmplea = new GridBagLayout();

			this.jPanelPaginacionProfesionEmplea.setLayout(gridaBagLayoutPaginacionProfesionEmplea);						
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 0;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonAnterioresProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					
						
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProfesionEmplea.gridy = 0;
			
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonNuevoGuardarCambiosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
						
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProfesionEmplea.gridy = 0;
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonSiguientesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 1;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonNuevoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
						
			
			
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
				this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProfesionEmplea.gridy = 1;
				this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProfesionEmplea.add(this.jButtonGuardarCambiosTablaProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			}
			
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 1;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonDuplicarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 1;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonCopiarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 1;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonVerFormProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 1;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProfesionEmplea.add(this.jButtonCerrarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
		
		
		this.jButtonRecargarInformacionProfesionEmplea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProfesionEmplea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProfesionEmplea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProfesionEmplea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProfesionEmplea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProfesionEmplea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProfesionEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProfesionEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProfesionEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProfesionEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProfesionEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProfesionEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProfesionEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProfesionEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProfesionEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProfesionEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProfesionEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProfesionEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProfesionEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesionEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesionEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProfesionEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProfesionEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProfesionEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProfesionEmplea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProfesionEmplea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProfesionEmplea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProfesionEmplea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProfesionEmplea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProfesionEmplea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProfesionEmplea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProfesionEmplea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProfesionEmplea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProfesionEmplea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProfesionEmplea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProfesionEmplea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProfesionEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProfesionEmplea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProfesionEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProfesionEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProfesionEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProfesionEmplea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProfesionEmplea.setLayout(gridaBagParametrosReportesProfesionEmplea);
			this.jPanelParametrosReportesAccionesProfesionEmplea.setLayout(gridaBagParametrosReportesAccionesProfesionEmplea);
			
			
			this.jPanelParametrosAuxiliar1ProfesionEmplea.setLayout(gridaBagParametrosAuxiliar1ProfesionEmplea);
			this.jPanelParametrosAuxiliar2ProfesionEmplea.setLayout(gridaBagParametrosAuxiliar2ProfesionEmplea);
			this.jPanelParametrosAuxiliar3ProfesionEmplea.setLayout(gridaBagParametrosAuxiliar3ProfesionEmplea);
			this.jPanelParametrosAuxiliar4ProfesionEmplea.setLayout(gridaBagParametrosAuxiliar4ProfesionEmplea);
			//this.jPanelParametrosAuxiliar5ProfesionEmplea.setLayout(gridaBagParametrosAuxiliar2ProfesionEmplea);			
			
			
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesionEmplea.add(this.jButtonRecargarInformacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProfesionEmplea.add(this.jComboBoxTiposPaginacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProfesionEmplea.add(this.jCheckBoxConAltoMaximoTablaProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProfesionEmplea.add(this.jComboBoxTiposArchivosReportesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesionEmplea.add(this.jPanelParametrosAuxiliar1ProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProfesionEmplea.add(this.jComboBoxTiposReportesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesionEmplea.add(this.jPanelParametrosAuxiliar4ProfesionEmplea, this.gridBagConstraintsProfesionEmplea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesionEmplea.add(this.jComboBoxTiposReportesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesionEmplea.add(this.jCheckBoxGenerarReporteProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesionEmplea.add(this.jPanelParametrosAuxiliar2ProfesionEmplea, this.gridBagConstraintsProfesionEmplea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesionEmplea.add(this.jLabelAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
				this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProfesionEmplea.add(this.jButtonAbrirOrderByProfesionEmplea, this.gridBagConstraintsProfesionEmplea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesionEmplea.add(this.jComboBoxTiposSeleccionarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			
			
			/*
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesionEmplea.add(this.jCheckBoxSeleccionarTodosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProfesionEmplea.add(this.jCheckBoxSeleccionarTodosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);															
				
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesionEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProfesionEmplea.add(this.jCheckBoxSeleccionadosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesionEmplea.add(this.jPanelParametrosAuxiliar3ProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesionEmplea.add(this.jComboBoxTiposAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
	
				
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesionEmplea.add(this.jTextFieldValorCampoGeneralProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProfesionEmplea = new GridBagLayout();

			this.jScrollPanelDatosProfesionEmplea.setLayout(gridaBagLayoutDatosProfesionEmplea);
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = 0;
			this.gridBagConstraintsProfesionEmplea.gridx = 0;
			
			this.jScrollPanelDatosProfesionEmplea.add(this.jTableDatosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProfesionEmplea.setViewportView(this.jTableDatosProfesionEmplea);
		this.jTableDatosProfesionEmplea.setFillsViewportHeight(true);
		this.jTableDatosProfesionEmplea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProfesionEmplea= new GridBagLayout();
		this.jPanelAccionesProfesionEmplea.setLayout(gridaBagLayoutAccionesProfesionEmplea);
		
		
		/*	
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
			
		this.jPanelAccionesProfesionEmplea.add(this.jButtonNuevoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoProfesionEmplea= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoProfesionEmplea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProfesionEmplea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProfesionEmplea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoProfesionEmplea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoProfesionEmplea.setLayout(gridaBagLayoutFK_IdEmpleadoProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 0;
		gridBagConstraintsProfesionEmplea.gridx = 0;
		jPanelFK_IdEmpleadoProfesionEmplea.add(jLabelid_empleadoFK_IdEmpleadoProfesionEmplea, gridBagConstraintsProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 0;
		gridBagConstraintsProfesionEmplea.gridx = 1;
		jPanelFK_IdEmpleadoProfesionEmplea.add(jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea, gridBagConstraintsProfesionEmplea);


		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.NONE;
		gridBagConstraintsProfesionEmplea.gridy = 0;
		gridBagConstraintsProfesionEmplea.gridx = 0;
		jPanelFK_IdEmpleadoProfesionEmplea.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea, gridBagConstraintsProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 1;
		gridBagConstraintsProfesionEmplea.gridx =1;
		jPanelFK_IdEmpleadoProfesionEmplea.add(jButtonFK_IdEmpleadoProfesionEmplea, gridBagConstraintsProfesionEmplea);

		jTabbedPaneBusquedasProfesionEmplea.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoProfesionEmplea);
		jTabbedPaneBusquedasProfesionEmplea.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProfesionProfesionEmplea= new GridBagLayout();
		gridaBagLayoutFK_IdProfesionProfesionEmplea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProfesionProfesionEmplea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProfesionProfesionEmplea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProfesionProfesionEmplea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProfesionProfesionEmplea.setLayout(gridaBagLayoutFK_IdProfesionProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 0;
		gridBagConstraintsProfesionEmplea.gridx = 0;
		jPanelFK_IdProfesionProfesionEmplea.add(jLabelid_profesionFK_IdProfesionProfesionEmplea, gridBagConstraintsProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 0;
		gridBagConstraintsProfesionEmplea.gridx = 1;
		jPanelFK_IdProfesionProfesionEmplea.add(jComboBoxid_profesionFK_IdProfesionProfesionEmplea, gridBagConstraintsProfesionEmplea);

		gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesionEmplea.gridy = 1;
		gridBagConstraintsProfesionEmplea.gridx =1;
		jPanelFK_IdProfesionProfesionEmplea.add(jButtonFK_IdProfesionProfesionEmplea, gridBagConstraintsProfesionEmplea);

		jTabbedPaneBusquedasProfesionEmplea.addTab("2.-Por Profesion ", jPanelFK_IdProfesionProfesionEmplea);
		jTabbedPaneBusquedasProfesionEmplea.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProfesionEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProfesionEmplea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();						
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesionEmplea.gridx = 0;		
			//this.gridBagConstraintsProfesionEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProfesionEmplea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProfesionEmplea.gridx = 0;		
		//this.gridBagConstraintsProfesionEmplea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProfesionEmplea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProfesionEmplea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesionEmplea.gridx = 0;		
			this.gridBagConstraintsProfesionEmplea.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProfesionEmplea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProfesionEmplea, this.gridBagConstraintsProfesionEmplea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);								
		
		
		/*
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		*/		
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProfesionEmplea.gridx =0;
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProfesionEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
				
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProfesionEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProfesionEmplea = new GridBagLayout();
			this.jPanelBusquedasParametrosProfesionEmplea.setLayout(gridaBagLayoutBusquedasParametrosProfesionEmplea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProfesionEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProfesionEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesionEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesionEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProfesionEmplea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProfesionEmplea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProfesionEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProfesionEmplea.setName("jPanelReporteDinamicoProfesionEmplea"); 
		
		this.jPanelReporteDinamicoProfesionEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProfesionEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProfesionEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProfesionEmplea.setLayout(gridaBagLayoutReporteDinamicoProfesionEmplea);
		
		
		this.jInternalFrameReporteDinamicoProfesionEmplea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProfesionEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProfesionEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProfesionEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProfesionEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProfesionEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProfesionEmplea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProfesionEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProfesionEmplea.setResizable(true);
	    this.jInternalFrameReporteDinamicoProfesionEmplea.setClosable(true);
	    this.jInternalFrameReporteDinamicoProfesionEmplea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProfesionEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProfesionEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProfesionEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProfesionEmplea = new JLabelMe();

		this.jLabelColumnasSelectReporteProfesionEmplea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jLabelColumnasSelectReporteProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProfesionEmplea = new JList<Reporte>();
		this.jListColumnasSelectReporteProfesionEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProfesionEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProfesionEmplea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProfesionEmplea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProfesionEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProfesionEmplea=new JScrollPane(this.jListColumnasSelectReporteProfesionEmplea);
			
			this.jScrollColumnasSelectReporteProfesionEmplea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProfesionEmplea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProfesionEmplea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProfesionEmplea.add(this.jListColumnasSelectReporteProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jScrollColumnasSelectReporteProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProfesionEmplea = new JLabelMe();

		this.jLabelRelacionesSelectReporteProfesionEmplea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProfesionEmplea = new JList<Reporte>();
		this.jListRelacionesSelectReporteProfesionEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProfesionEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProfesionEmplea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProfesionEmplea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProfesionEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProfesionEmplea=new JScrollPane(this.jListRelacionesSelectReporteProfesionEmplea);
			
			this.jScrollRelacionesSelectReporteProfesionEmplea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProfesionEmplea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProfesionEmplea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProfesionEmplea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProfesionEmplea = new JComboBoxMe();
		this.jListColumnasValoresGraficoProfesionEmplea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProfesionEmplea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProfesionEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProfesionEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProfesionEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProfesionEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProfesionEmplea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProfesionEmplea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jLabelGenerarExcelReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProfesionEmplea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProfesionEmplea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProfesionEmplea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProfesionEmplea.setToolTipText("Generar EXCEL"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProfesionEmplea.add(this.jButtonGenerarExcelReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jComboBoxTiposReportesDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProfesionEmplea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProfesionEmplea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jLabelTiposArchivoReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jComboBoxTiposArchivosReportesDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProfesionEmplea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProfesionEmplea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProfesionEmplea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProfesionEmplea.setToolTipText("Generar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jButtonGenerarReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProfesionEmplea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProfesionEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProfesionEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProfesionEmplea.setToolTipText("Cancelar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesionEmplea.add(this.jButtonCerrarReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProfesionEmplea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProfesionEmplea= new JScrollPane(jPanelReporteDinamicoProfesionEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProfesionEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProfesionEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProfesionEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProfesionEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProfesionEmplea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProfesionEmplea);
		this.jInternalFrameReporteDinamicoProfesionEmplea.getContentPane().add(this.jScrollPanelReporteDinamicoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProfesionEmplea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProfesionEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProfesionEmplea.setName("jPanelImportacionProfesionEmplea"); 
		
		this.jPanelImportacionProfesionEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProfesionEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProfesionEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProfesionEmplea.setLayout(gridaBagLayoutImportacionProfesionEmplea);
		
		
		this.jInternalFrameImportacionProfesionEmplea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProfesionEmplea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProfesionEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProfesionEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProfesionEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProfesionEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProfesionEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProfesionEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProfesionEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProfesionEmplea.setResizable(true);
	    this.jInternalFrameImportacionProfesionEmplea.setClosable(true);
	    this.jInternalFrameImportacionProfesionEmplea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProfesionEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProfesionEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProfesionEmplea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProfesionEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProfesionEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProfesionEmplea.setResizable(true);
	    this.jInternalFrameImportacionProfesionEmplea.setClosable(true);
	    this.jInternalFrameImportacionProfesionEmplea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProfesionEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProfesionEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProfesionEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProfesionEmplea = new JLabelMe();

		this.jLabelArchivoImportacionProfesionEmplea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProfesionEmplea.add(this.jLabelArchivoImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProfesionEmplea = new JFileChooser();		
		this.jFileChooserImportacionProfesionEmplea.setToolTipText("ESCOGER ARCHIVO"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProfesionEmplea = new JButtonMe();
		this.jButtonAbrirImportacionProfesionEmplea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProfesionEmplea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProfesionEmplea.setToolTipText("Generar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesionEmplea.add(this.jButtonAbrirImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProfesionEmplea = new JLabelMe();

		this.jLabelPathArchivoImportacionProfesionEmplea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProfesionEmplea.add(this.jLabelPathArchivoImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProfesionEmplea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProfesionEmplea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProfesionEmplea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProfesionEmplea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesionEmplea.add(this.jTextFieldPathArchivoImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProfesionEmplea = new JButtonMe();
		this.jButtonGenerarImportacionProfesionEmplea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProfesionEmplea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProfesionEmplea.setToolTipText("Generar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesionEmplea.add(this.jButtonGenerarImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProfesionEmplea = new JButtonMe();
		this.jButtonCerrarImportacionProfesionEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProfesionEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProfesionEmplea.setToolTipText("Cancelar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesionEmplea.add(this.jButtonCerrarImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProfesionEmplea = new GridBagLayout();
		
		this.jScrollPanelImportacionProfesionEmplea= new JScrollPane(jPanelImportacionProfesionEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iPosYImportacion;
		this.gridBagConstraintsProfesionEmplea.gridx =iPosXImportacion;
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProfesionEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProfesionEmplea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProfesionEmplea);
		this.jInternalFrameImportacionProfesionEmplea.getContentPane().add(this.jScrollPanelImportacionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProfesionEmplea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProfesionEmplea = new JButtonMe();
			this.jButtonAbrirOrderByProfesionEmplea.setText("Orden");
			this.jButtonAbrirOrderByProfesionEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProfesionEmplea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProfesionEmplea";
			inputMap = this.jButtonAbrirOrderByProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProfesionEmplea"));
		
		
			GridBagLayout gridaBagLayoutOrderByProfesionEmplea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProfesionEmplea.setName("jPanelOrderByProfesionEmplea"); 
			
			this.jPanelOrderByProfesionEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProfesionEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProfesionEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProfesionEmplea.setLayout(gridaBagLayoutOrderByProfesionEmplea);
			
			
			this.jTableDatosProfesionEmpleaOrderBy = new JTableMe();        
			this.jTableDatosProfesionEmpleaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProfesionEmpleaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProfesionEmpleaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProfesionEmpleaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProfesionEmpleaOrderBy.setViewportView(this.jTableDatosProfesionEmpleaOrderBy);
			this.jTableDatosProfesionEmpleaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProfesionEmpleaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProfesionEmplea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProfesionEmplea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProfesionEmplea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProfesionEmplea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProfesionEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProfesionEmplea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProfesionEmplea.setTitle("Orden");
			this.jInternalFrameOrderByProfesionEmplea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProfesionEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProfesionEmplea.setResizable(true);
			this.jInternalFrameOrderByProfesionEmplea.setClosable(true);
			this.jInternalFrameOrderByProfesionEmplea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProfesionEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProfesionEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProfesionEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProfesionEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProfesionEmplea.ipady =150;
				
			this.jPanelOrderByProfesionEmplea.add(jScrollPanelDatosProfesionEmpleaOrderBy, this.gridBagConstraintsProfesionEmplea);//this.jTableDatosProfesionEmpleaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProfesionEmplea = new JButtonMe();
			this.jButtonCerrarOrderByProfesionEmplea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProfesionEmplea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProfesionEmplea.setToolTipText("Cancelar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProfesionEmplea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProfesionEmplea.add(this.jButtonCerrarOrderByProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProfesionEmplea = new GridBagLayout();
			
			this.jScrollPanelOrderByProfesionEmplea= new JScrollPane(jPanelOrderByProfesionEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy =iPosYOrderBy;
			this.gridBagConstraintsProfesionEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProfesionEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProfesionEmplea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProfesionEmplea);
			
			this.jInternalFrameOrderByProfesionEmplea.getContentPane().add(this.jScrollPanelOrderByProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
		
		} else {
			this.jButtonAbrirOrderByProfesionEmplea = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.profesionempleaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProfesionEmplea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProfesionEmplea.getRowHeight();//ProfesionEmpleaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProfesionEmplea.isSelected()) {
					iHeightTable=ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProfesionEmplea.isSelected()) {
					iHeightTable=ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProfesionEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProfesionEmplea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProfesionEmplea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProfesionEmplea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProfesionEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProfesionEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProfesionEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProfesionEmplea!=null && this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy()!=null) {
			//if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProfesionEmplea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProfesionEmplea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProfesionEmplea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProfesionEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProfesionEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProfesionEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=profesionempleaLogic.getProfesionEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesionempleas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProfesionEmplea> TraerProfesionEmpleaBeans(List<ProfesionEmplea> profesionempleas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProfesionEmplea profesionemplea:profesionempleas) {
					
				if(!(ProfesionEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProfesionEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					profesionemplea.setsDetalleGeneralEntityReporte(ProfesionEmpleaConstantesFunciones.getProfesionEmpleaDescripcion(profesionemplea));
										
						
					
						
					
				} else  {
							
					//profesionemplea.setsDetalleGeneralEntityReporte(profesionemplea.getsDetalleGeneralEntityReporte());
										
				}
				
				//profesionempleabeans.add(profesionempleabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return profesionempleas;
    }
	//PARA REPORTES FIN
}
