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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


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
import com.bydan.erp.contabilidad.util.PresuAsignacionConstantesFunciones;

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
public class PresuAsignacionJInternalFrame extends PresuAsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuAsignacion;
	
	protected JMenuBar jmenuBarPresuAsignacion;
	
	protected JMenu jmenuPresuAsignacion;
	protected JMenu jmenuDatosPresuAsignacion;
	protected JMenu jmenuArchivoPresuAsignacion;
	protected JMenu jmenuAccionesPresuAsignacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuAsignacion;	
	protected GridBagConstraints gridBagConstraintsPresuAsignacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuAsignacionDetalleFormJInternalFrame jInternalFrameDetalleFormPresuAsignacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuAsignacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuAsignacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyectocuenta="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuAsignacionSessionBean presuasignacionSessionBean;
		
	
	
	public PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuAsignacion> presuasignacions;		
	public List<PresuAsignacion> presuasignacionsEliminados;	
	public List<PresuAsignacion> presuasignacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuAsignacion;		
	protected JButton jButtonAbrirOrderByPresuAsignacion;
	
	
	//protected JPanel jPanelOrderByPresuAsignacion;
	//public JScrollPane jScrollPanelOrderByPresuAsignacion;	
	//protected JButton jButtonCerrarOrderByPresuAsignacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuAsignacionLogic presuasignacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuAsignacion;
	public JScrollPane jScrollPanelDatosEdicionPresuAsignacion;
	public JScrollPane jScrollPanelDatosGeneralPresuAsignacion;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuAsignacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuAsignacion;
	//public JScrollPane jScrollPanelImportacionPresuAsignacion;
	
	
	
	protected JPanel jPanelAccionesPresuAsignacion;
	
    protected JPanel jPanelPaginacionPresuAsignacion;
    protected JPanel jPanelParametrosReportesPresuAsignacion;
	protected JPanel jPanelParametrosReportesAccionesPresuAsignacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuAsignacion;
	protected JPanel jPanelParametrosAuxiliar2PresuAsignacion;
	protected JPanel jPanelParametrosAuxiliar3PresuAsignacion;
	protected JPanel jPanelParametrosAuxiliar4PresuAsignacion;
	//protected JPanel jPanelParametrosAuxiliar5PresuAsignacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuAsignacion;
	//protected JPanel jPanelImportacionPresuAsignacion;
	
	
	public JTable jTableDatosPresuAsignacion;
	
	
	
	//public JTable jTableDatosPresuAsignacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuAsignacion;
	protected JButton jButtonDuplicarPresuAsignacion;
	protected JButton jButtonCopiarPresuAsignacion;
	protected JButton jButtonVerFormPresuAsignacion;
	protected JButton jButtonNuevoRelacionesPresuAsignacion;
	protected JButton jButtonModificarPresuAsignacion;
	
    protected JButton jButtonGuardarCambiosTablaPresuAsignacion;
	protected JButton jButtonCerrarPresuAsignacion;
	
	
	protected JButton jButtonRecargarInformacionPresuAsignacion;
	protected JButton jButtonProcesarInformacionPresuAsignacion;
	
	
	protected JButton jButtonAnterioresPresuAsignacion;
	protected JButton jButtonSiguientesPresuAsignacion;
	protected JButton jButtonNuevoGuardarCambiosPresuAsignacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuAsignacion;
	//protected JButton jButtonCerrarReporteDinamicoPresuAsignacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuAsignacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuAsignacion;
	//protected JButton jButtonGenerarImportacionPresuAsignacion;
	//protected JButton jButtonCerrarImportacionPresuAsignacion;
	//protected JFileChooser jFileChooserImportacionPresuAsignacion;
	//protected File fileImportacionPresuAsignacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuAsignacion;
	protected JButton jButtonDuplicarToolBarPresuAsignacion;
	protected JButton jButtonNuevoRelacionesToolBarPresuAsignacion;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuAsignacion;
	protected JButton jButtonCopiarToolBarPresuAsignacion;
	protected JButton jButtonVerFormToolBarPresuAsignacion;
	public JButton jButtonGuardarCambiosTablaToolBarPresuAsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuAsignacion;
	protected JButton jButtonCerrarToolBarPresuAsignacion;
	
	protected JButton jButtonRecargarInformacionToolBarPresuAsignacion;
	protected JButton jButtonProcesarInformacionToolBarPresuAsignacion;
	protected JButton jButtonAnterioresToolBarPresuAsignacion;
	protected JButton jButtonSiguientesToolBarPresuAsignacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuAsignacion;
	protected JButton jButtonAbrirOrderByToolBarPresuAsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuAsignacion;
	protected JMenuItem jMenuItemDuplicarPresuAsignacion;
	protected JMenuItem jMenuItemNuevoRelacionesPresuAsignacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuAsignacion;
	protected JMenuItem jMenuItemCopiarPresuAsignacion;
	protected JMenuItem jMenuItemVerFormPresuAsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuAsignacion;
	protected JMenuItem jMenuItemCerrarPresuAsignacion;
	protected JMenuItem jMenuItemDetalleCerrarPresuAsignacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuAsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuAsignacion;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuAsignacion;
	protected JMenuItem jMenuItemProcesarInformacionPresuAsignacion;
	protected JMenuItem jMenuItemAnterioresPresuAsignacion;
	protected JMenuItem jMenuItemSiguientesPresuAsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuAsignacion;
	protected JMenuItem jMenuItemAbrirOrderByPresuAsignacion;
	protected JMenuItem jMenuItemMostrarOcultarPresuAsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuAsignacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuAsignacion;
	protected JCheckBox jCheckBoxSeleccionadosPresuAsignacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuAsignacion;
	protected JCheckBox jCheckBoxConGraficoReportePresuAsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuAsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuAsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuAsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuAsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuAsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuAsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuAsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuAsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuAsignacion;
	protected JTextField jTextFieldValorCampoGeneralPresuAsignacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuAsignacion;
	//public JList<Reporte> jListColumnasSelectReportePresuAsignacion;
	//public JScrollPane jScrollColumnasSelectReportePresuAsignacion;
	
	//public JLabel jLabelRelacionesSelectReportePresuAsignacion;
	//public JList<Reporte> jListRelacionesSelectReportePresuAsignacion;
	//public JScrollPane jScrollRelacionesSelectReportePresuAsignacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuAsignacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuAsignacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuAsignacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuAsignacion;
	
		
	//public JLabel jLabelArchivoImportacionPresuAsignacion;	
	//public JLabel jLabelPathArchivoImportacionPresuAsignacion;
	//protected JTextField jTextFieldPathArchivoImportacionPresuAsignacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuAsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuAsignacion;
	
	//public JLabel jLabelColumnaCategoriaValorPresuAsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuAsignacion;
	
	//public JLabel jLabelColumnasValoresGraficoPresuAsignacion;
	//public JList<Reporte> jListColumnasValoresGraficoPresuAsignacion;
	//public JScrollPane jScrollColumnasValoresGraficoPresuAsignacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuAsignacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuAsignacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuAsignacion;
	public JPanel jPanelFK_IdEmpleadoPresuAsignacion;
	public JButton jButtonFK_IdEmpleadoPresuAsignacion;
	public JPanel jPanelFK_IdPresuEstadoPresuAsignacion;
	public JButton jButtonFK_IdPresuEstadoPresuAsignacion;
	public JPanel jPanelFK_IdPresuProyectoCuentaPresuAsignacion;
	public JButton jButtonFK_IdPresuProyectoCuentaPresuAsignacion;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPresuAsignacion;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion;
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuAsignacion= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuAsignacionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion;
	
	public JPanel jPanelid_presu_estadoFK_IdPresuEstadoPresuAsignacion;
	public JLabel jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion;
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuAsignacion= new JButtonMe();
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuAsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion;
	public JLabel jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion;
	public JButton jButtonid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion= new JButtonMe();
	public JButton jButtonid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresuAsignacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuAsignacion)	{
		this.jButtonRecargarInformacionPresuAsignacion = jButtonRecargarInformacionPresuAsignacion;
	}
	
	public JButton getjButtonProcesarInformacionPresuAsignacion() {
		return this.jButtonProcesarInformacionPresuAsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuAsignacion)	{
		this.jButtonProcesarInformacionPresuAsignacion = jButtonProcesarInformacionPresuAsignacion;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuAsignacion() {
		return this.jButtonRecargarInformacionPresuAsignacion;
	}
	
	
	public List<PresuAsignacion> getpresuasignacions() {
		return this.presuasignacions;
	}

	public void setpresuasignacions(List<PresuAsignacion> presuasignacions) {
		this.presuasignacions = presuasignacions;
	}
	
	public List<PresuAsignacion> getpresuasignacionsAux() {
		return this.presuasignacionsAux;
	}

	public void setpresuasignacionsAux(List<PresuAsignacion> presuasignacionsAux) {
		this.presuasignacionsAux = presuasignacionsAux;
	}
	
	public List<PresuAsignacion> getpresuasignacionsEliminados() {
		return this.presuasignacionsEliminados;
	}

	public void setPresuAsignacionsEliminados(List<PresuAsignacion> presuasignacionsEliminados) {
		this.presuasignacionsEliminados = presuasignacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuAsignacion() {
		return jComboBoxTiposSeleccionarPresuAsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuAsignacion(
			JComboBox jComboBoxTiposSeleccionarPresuAsignacion) {
		this.jComboBoxTiposSeleccionarPresuAsignacion = jComboBoxTiposSeleccionarPresuAsignacion;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuAsignacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuAsignacion() {
		return jTextFieldValorCampoGeneralPresuAsignacion;
	}

	public void setjTextFieldValorCampoGeneralPresuAsignacion(
			JTextField jTextFieldValorCampoGeneralPresuAsignacion) {
		this.jTextFieldValorCampoGeneralPresuAsignacion = jTextFieldValorCampoGeneralPresuAsignacion;
	}

	public void setBorderResaltarValorCampoGeneralPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuAsignacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuAsignacion() {
		return this.jCheckBoxSeleccionarTodosPresuAsignacion;
	}

	public void setjCheckBoxSeleccionarTodosPresuAsignacion(
			JCheckBox jCheckBoxSeleccionarTodosPresuAsignacion) {
		this.jCheckBoxSeleccionarTodosPresuAsignacion = jCheckBoxSeleccionarTodosPresuAsignacion;
	}

	public void setBorderResaltarSeleccionarTodosPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuAsignacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuAsignacion() {
		return this.jCheckBoxSeleccionadosPresuAsignacion;
	}

	public void setjCheckBoxSeleccionadosPresuAsignacion(
			JCheckBox jCheckBoxSeleccionadosPresuAsignacion) {
		this.jCheckBoxSeleccionadosPresuAsignacion = jCheckBoxSeleccionadosPresuAsignacion;
	}
	
	public void setBorderResaltarSeleccionadosPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuAsignacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuAsignacion() {
		return this.jComboBoxTiposArchivosReportesPresuAsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuAsignacion(
			JComboBox jComboBoxTiposArchivosReportesPresuAsignacion) {
		this.jComboBoxTiposArchivosReportesPresuAsignacion = jComboBoxTiposArchivosReportesPresuAsignacion;
	}

	public void setBorderResaltarTiposArchivosReportesPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuAsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuAsignacion() {
		return this.jComboBoxTiposReportesPresuAsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuAsignacion(
			JComboBox jComboBoxTiposReportesPresuAsignacion) {
		this.jComboBoxTiposReportesPresuAsignacion = jComboBoxTiposReportesPresuAsignacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuAsignacion() {
	//	return jComboBoxTiposReportesDinamicoPresuAsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuAsignacion(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuAsignacion) {
	//	this.jComboBoxTiposReportesDinamicoPresuAsignacion = jComboBoxTiposReportesDinamicoPresuAsignacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuAsignacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuAsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuAsignacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuAsignacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion = jComboBoxTiposArchivosReportesDinamicoPresuAsignacion;
	//}
	
	public void setBorderResaltarTiposReportesPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuAsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuAsignacion() {
		return this.jComboBoxTiposGraficosReportesPresuAsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuAsignacion(
			JComboBox jComboBoxTiposGraficosReportesPresuAsignacion) {
		this.jComboBoxTiposGraficosReportesPresuAsignacion = jComboBoxTiposGraficosReportesPresuAsignacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuAsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuAsignacion() {
		return this.jComboBoxTiposPaginacionPresuAsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuAsignacion(
			JComboBox jComboBoxTiposPaginacionPresuAsignacion) {
		this.jComboBoxTiposPaginacionPresuAsignacion = jComboBoxTiposPaginacionPresuAsignacion;
	}
	
	public void setBorderResaltarTiposPaginacionPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuAsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuAsignacion() {
		return this.jComboBoxTiposRelacionesPresuAsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuAsignacion() {
		return this.jComboBoxTiposAccionesPresuAsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuAsignacion(
			JComboBox jComboBoxTiposRelacionesPresuAsignacion) {
		this.jComboBoxTiposRelacionesPresuAsignacion = jComboBoxTiposRelacionesPresuAsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuAsignacion(
			JComboBox jComboBoxTiposAccionesPresuAsignacion) {
		this.jComboBoxTiposAccionesPresuAsignacion = jComboBoxTiposAccionesPresuAsignacion;
	}
	
	public void setBorderResaltarTiposRelacionesPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuAsignacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuAsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuAsignacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuAsignacion() {
	//	return jCheckBoxConGraficoDinamicoPresuAsignacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuAsignacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuAsignacion) {
	//	this.jCheckBoxConGraficoDinamicoPresuAsignacion = jCheckBoxConGraficoDinamicoPresuAsignacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuAsignacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuAsignacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuAsignacion .setBorder(borderResaltar);		
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
		this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		
		this.presuasignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuasignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuasignacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuAsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asignacion Presupuesto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuAsignacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"nuevo","nuevo","Nuevo"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"duplicar","duplicar","Duplicar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"copiar","copiar","Copiar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"ver_form","ver_form","Ver"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"recargar","recargar","Recargar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuAsignacion,this.jTtoolBarPresuAsignacion,
							"cerrar","cerrar","Salir"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuAsignacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuAsignacion;
			
				this.jButtonProcesarInformacionToolBarPresuAsignacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuAsignacion;
				
		//protected JButton jButtonModificarToolBarPresuAsignacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuAsignacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuAsignacion=new JMenuMe("General");
		this.jmenuArchivoPresuAsignacion=new JMenuMe("Archivo");
		this.jmenuAccionesPresuAsignacion=new JMenuMe("Acciones");
		this.jmenuDatosPresuAsignacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuAsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuAsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuAsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuAsignacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuAsignacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuAsignacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuAsignacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuAsignacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuAsignacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuAsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuAsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuAsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuAsignacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuAsignacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuAsignacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuAsignacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuAsignacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuAsignacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuAsignacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuAsignacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuAsignacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuAsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuAsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuAsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuAsignacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuAsignacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuAsignacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuAsignacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuAsignacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuAsignacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuAsignacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuAsignacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuAsignacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuAsignacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuAsignacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuAsignacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuAsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuAsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuAsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuAsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuAsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuAsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuAsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuAsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuAsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuAsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuAsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuAsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuAsignacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuAsignacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuAsignacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuAsignacion.add(this.jMenuItemCerrarPresuAsignacion);
			
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemNuevoPresuAsignacion);
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemNuevoGuardarCambiosPresuAsignacion);
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemNuevoRelacionesPresuAsignacion);
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemGuardarCambiosTablaPresuAsignacion);		
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemDuplicarPresuAsignacion);		
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemCopiarPresuAsignacion);		
			this.jmenuAccionesPresuAsignacion.add(this.jMenuItemVerFormPresuAsignacion);		
			
			this.jmenuDatosPresuAsignacion.add(this.jMenuItemRecargarInformacionPresuAsignacion);				
			this.jmenuDatosPresuAsignacion.add(this.jMenuItemAnterioresPresuAsignacion);				
			this.jmenuDatosPresuAsignacion.add(this.jMenuItemSiguientesPresuAsignacion);				
			this.jmenuDatosPresuAsignacion.add(this.jMenuItemAbrirOrderByPresuAsignacion);				
			this.jmenuDatosPresuAsignacion.add(this.jMenuItemMostrarOcultarPresuAsignacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuAsignacion.add(this.jMenuItemGuardarCambiosPresuAsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuAsignacion.add(this.jmenuArchivoPresuAsignacion);		
			this.jmenuBarPresuAsignacion.add(this.jmenuAccionesPresuAsignacion);		
			this.jmenuBarPresuAsignacion.add(this.jmenuDatosPresuAsignacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuAsignacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuAsignacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPresuAsignacion.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPresuAsignacion= new JButtonMe();
		this.jButtonFK_IdEmpleadoPresuAsignacion.setText("Buscar");
		this.jButtonFK_IdEmpleadoPresuAsignacion.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPresuAsignacion,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.setFocusable(false);

		this.jPanelFK_IdPresuEstadoPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuEstadoPresuAsignacion.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdPresuEstadoPresuAsignacion= new JButtonMe();
		this.jButtonFK_IdPresuEstadoPresuAsignacion.setText("Buscar");
		this.jButtonFK_IdPresuEstadoPresuAsignacion.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuEstadoPresuAsignacion,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuEstadoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion = new JLabelMe();
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setText("Estado :");
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setToolTipText("Estado");
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion= new JComboBoxMe();
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion.setToolTipText("Buscar Por Proyecto Cuenta ");
		this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion= new JButtonMe();
		this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion.setText("Buscar");
		this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion.setToolTipText("Buscar Por Proyecto Cuenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion,"buscar_button","Buscar Por Proyecto Cuenta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion = new JLabelMe();
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setText("Proyecto Cuenta :");
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setToolTipText("Proyecto Cuenta");
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion= new JComboBoxMe();
		jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuAsignacion=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuAsignacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuAsignacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuAsignacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuAsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuAsignacion = new PresuAsignacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asignacion Presupuesto DATOS");
			this.jInternalFrameDetalleFormPresuAsignacion = new PresuAsignacionDetalleFormJInternalFrame(jDesktopPane,this.presuasignacionSessionBean.getConGuardarRelaciones(),this.presuasignacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuAsignacion = null;//new PresuAsignacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuAsignacion= new GridBagLayout();
		
		
		this.jTableDatosPresuAsignacion = new JTableMe();      
		
		String sToolTipPresuAsignacion="";
		sToolTipPresuAsignacion=PresuAsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuAsignacion+="(Contabilidad.PresuAsignacion)";
		}
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuAsignacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuAsignacion.setToolTipText(sToolTipPresuAsignacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuAsignacion);
		this.jTableDatosPresuAsignacion.setAutoCreateRowSorter(true);
		this.jTableDatosPresuAsignacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuAsignacion.setRowSelectionAllowed(true);
		this.jTableDatosPresuAsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuAsignacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuAsignacion = new JButtonMe();
		this.jButtonDuplicarPresuAsignacion = new JButtonMe();
		this.jButtonCopiarPresuAsignacion = new JButtonMe();
		this.jButtonVerFormPresuAsignacion = new JButtonMe();
		this.jButtonNuevoRelacionesPresuAsignacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuAsignacion = new JButtonMe();
		this.jButtonCerrarPresuAsignacion = new JButtonMe();
		
		this.jScrollPanelDatosPresuAsignacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuAsignacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asignacion Presupuesto";
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuAsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuAsignacion.setToolTipText("Acciones");
        this.jPanelAccionesPresuAsignacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuAsignacion=new ReporteDinamicoJInternalFrame(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuAsignacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuAsignacion=new ImportacionJInternalFrame(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuAsignacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuAsignacion = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuAsignacion.setText("Orden");
		this.jButtonAbrirOrderByPresuAsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuAsignacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuAsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuAsignacion,false,this);
			
			//this.cargarOrderByPresuAsignacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuAsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuAsignacion,true,this);
			
			//this.cargarOrderByPresuAsignacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuAsignacion.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosPresuAsignacion.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosPresuAsignacion.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosPresuAsignacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuAsignacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuAsignacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuAsignacion.setText("Nuevo");
		this.jButtonDuplicarPresuAsignacion.setText("Duplicar");
		this.jButtonCopiarPresuAsignacion.setText("Copiar");
		this.jButtonVerFormPresuAsignacion.setText("Ver");
		this.jButtonNuevoRelacionesPresuAsignacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.setText("Guardar");
		this.jButtonCerrarPresuAsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuAsignacion,"nuevo_button","Nuevo",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuAsignacion,"duplicar_button","Duplicar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuAsignacion,"copiar_button","Copiar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuAsignacion,"ver_form","Ver",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuAsignacion,"nuevorelaciones_button","Nuevo Rel",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuAsignacion,"guardarcambiostabla_button","Guardar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuAsignacion,"cerrar_button","Salir",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuAsignacion.setToolTipText("Nuevo"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuAsignacion.setToolTipText("Duplicar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuAsignacion.setToolTipText("Copiar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuAsignacion.setToolTipText("Ver"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuAsignacion.setToolTipText("Nuevo Rel"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.setToolTipText("Guardar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuAsignacion.setToolTipText("Salir"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuAsignacion";
		inputMap = this.jButtonNuevoPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuAsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuAsignacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuAsignacion";
		inputMap = this.jButtonDuplicarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuAsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuAsignacion"));
		
		//COPIAR
		sMapKey = "CopiarPresuAsignacion";
		inputMap = this.jButtonCopiarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuAsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuAsignacion"));
		
		//VEr FORM
		sMapKey = "VerFormPresuAsignacion";
		inputMap = this.jButtonVerFormPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuAsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuAsignacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuAsignacion";
		inputMap = this.jButtonNuevoRelacionesPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuAsignacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuAsignacion";
		inputMap = this.jButtonModificarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuAsignacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuAsignacion";
		inputMap = this.jButtonCerrarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuAsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuAsignacion";
		inputMap = this.jButtonGuardarCambiosTablaPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuAsignacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuAsignacion.setName("jPanelParametrosReportesPresuAsignacion"); 
		
		this.jPanelParametrosReportesAccionesPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuAsignacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuAsignacion.setName("jPanelParametrosReportesAccionesPresuAsignacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuAsignacion = new JButtonMe();
		this.jButtonRecargarInformacionPresuAsignacion.setText("Recargar");
		this.jButtonRecargarInformacionPresuAsignacion.setToolTipText("Recargar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuAsignacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuAsignacion = new JButtonMe();
		this.jButtonProcesarInformacionPresuAsignacion.setText("Procesar");
		this.jButtonProcesarInformacionPresuAsignacion.setToolTipText("Procesar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuAsignacion.setVisible(false);
			
		this.jButtonProcesarInformacionPresuAsignacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuAsignacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuAsignacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuAsignacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuAsignacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuAsignacion.setText("TIPO");       
		this.jComboBoxTiposReportesPresuAsignacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuAsignacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuAsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuAsignacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuAsignacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuAsignacion.setText("Accion");
		this.jComboBoxTiposRelacionesPresuAsignacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuAsignacion.setText("Accion");
		this.jComboBoxTiposAccionesPresuAsignacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuAsignacion.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuAsignacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuAsignacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuAsignacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuAsignacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuAsignacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuAsignacion = new JLabelMe();
		
		this.jLabelAccionesPresuAsignacion.setText("Acciones");		
		this.jLabelAccionesPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuAsignacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuAsignacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuAsignacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuAsignacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuAsignacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuAsignacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuAsignacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuAsignacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuAsignacion.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuAsignacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuAsignacion = new JButtonMe();
		//this.jButtonAnterioresPresuAsignacion.setText("<<");
        this.jButtonAnterioresPresuAsignacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuAsignacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuAsignacion = new JButtonMe();
		//this.jButtonSiguientesPresuAsignacion.setText(">>");
        this.jButtonSiguientesPresuAsignacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuAsignacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuAsignacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuAsignacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuAsignacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuAsignacion,"nuevoguardarcambios_button","Nue",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuAsignacion";
		inputMap = this.jButtonNuevoGuardarCambiosPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuAsignacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuAsignacion";
		inputMap = this.jButtonRecargarInformacionPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuAsignacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuAsignacion";
		inputMap = this.jButtonSiguientesPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuAsignacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuAsignacion";
		inputMap = this.jButtonAnterioresPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuAsignacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuAsignacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuAsignacion.setMinimumSize(new Dimension(this.getWidth(),PresuAsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuAsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuAsignacion.setMaximumSize(new Dimension(this.getWidth(),PresuAsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuAsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuAsignacion.setPreferredSize(new Dimension(this.getWidth(),PresuAsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuAsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuAsignacion = new GridBagLayout();

			this.jPanelPaginacionPresuAsignacion.setLayout(gridaBagLayoutPaginacionPresuAsignacion);						
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 0;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonAnterioresPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					
						
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuAsignacion.gridy = 0;
			
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonNuevoGuardarCambiosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
						
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuAsignacion.gridy = 0;
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonSiguientesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 1;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonNuevoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
						
			
			
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
				this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuAsignacion.gridy = 1;
				this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuAsignacion.add(this.jButtonGuardarCambiosTablaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			}
			
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 1;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonDuplicarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 1;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonCopiarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 1;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonVerFormPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 1;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuAsignacion.add(this.jButtonCerrarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		
		this.jButtonRecargarInformacionPresuAsignacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuAsignacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuAsignacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuAsignacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuAsignacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuAsignacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuAsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuAsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuAsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuAsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuAsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuAsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuAsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuAsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuAsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuAsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuAsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuAsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuAsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuAsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuAsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuAsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuAsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuAsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuAsignacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuAsignacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuAsignacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuAsignacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuAsignacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuAsignacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuAsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuAsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuAsignacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuAsignacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuAsignacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuAsignacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuAsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuAsignacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuAsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuAsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuAsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuAsignacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuAsignacion.setLayout(gridaBagParametrosReportesPresuAsignacion);
			this.jPanelParametrosReportesAccionesPresuAsignacion.setLayout(gridaBagParametrosReportesAccionesPresuAsignacion);
			
			
			this.jPanelParametrosAuxiliar1PresuAsignacion.setLayout(gridaBagParametrosAuxiliar1PresuAsignacion);
			this.jPanelParametrosAuxiliar2PresuAsignacion.setLayout(gridaBagParametrosAuxiliar2PresuAsignacion);
			this.jPanelParametrosAuxiliar3PresuAsignacion.setLayout(gridaBagParametrosAuxiliar3PresuAsignacion);
			this.jPanelParametrosAuxiliar4PresuAsignacion.setLayout(gridaBagParametrosAuxiliar4PresuAsignacion);
			//this.jPanelParametrosAuxiliar5PresuAsignacion.setLayout(gridaBagParametrosAuxiliar2PresuAsignacion);			
			
			
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuAsignacion.add(this.jButtonRecargarInformacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuAsignacion.add(this.jComboBoxTiposPaginacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuAsignacion.add(this.jCheckBoxConAltoMaximoTablaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuAsignacion.add(this.jComboBoxTiposArchivosReportesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuAsignacion.add(this.jPanelParametrosAuxiliar1PresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuAsignacion.add(this.jComboBoxTiposReportesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);																		
			
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresuAsignacion.add(this.jComboBoxTiposGraficosReportesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuAsignacion.add(this.jPanelParametrosAuxiliar4PresuAsignacion, this.gridBagConstraintsPresuAsignacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuAsignacion.add(this.jComboBoxTiposReportesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuAsignacion.add(this.jCheckBoxGenerarReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuAsignacion.add(this.jPanelParametrosAuxiliar2PresuAsignacion, this.gridBagConstraintsPresuAsignacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuAsignacion.add(this.jLabelAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
				this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuAsignacion.add(this.jButtonAbrirOrderByPresuAsignacion, this.gridBagConstraintsPresuAsignacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuAsignacion.add(this.jComboBoxTiposSeleccionarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			
			
			/*
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuAsignacion.add(this.jCheckBoxSeleccionarTodosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuAsignacion.add(this.jCheckBoxConGraficoReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuAsignacion.add(this.jCheckBoxSeleccionarTodosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);															
				
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuAsignacion.add(this.jCheckBoxSeleccionadosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);															
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuAsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuAsignacion.add(this.jCheckBoxConGraficoReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuAsignacion.add(this.jPanelParametrosAuxiliar3PresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuAsignacion.add(this.jComboBoxTiposAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
	
				
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuAsignacion.add(this.jTextFieldValorCampoGeneralPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuAsignacion = new GridBagLayout();

			this.jScrollPanelDatosPresuAsignacion.setLayout(gridaBagLayoutDatosPresuAsignacion);
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = 0;
			this.gridBagConstraintsPresuAsignacion.gridx = 0;
			
			this.jScrollPanelDatosPresuAsignacion.add(this.jTableDatosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuAsignacion.setViewportView(this.jTableDatosPresuAsignacion);
		this.jTableDatosPresuAsignacion.setFillsViewportHeight(true);
		this.jTableDatosPresuAsignacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuAsignacion= new GridBagLayout();
		this.jPanelAccionesPresuAsignacion.setLayout(gridaBagLayoutAccionesPresuAsignacion);
		
		
		/*	
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
			
		this.jPanelAccionesPresuAsignacion.add(this.jButtonNuevoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoPresuAsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPresuAsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuAsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuAsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPresuAsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPresuAsignacion.setLayout(gridaBagLayoutFK_IdEmpleadoPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 0;
		jPanelFK_IdEmpleadoPresuAsignacion.add(jLabelid_empleadoFK_IdEmpleadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 1;
		jPanelFK_IdEmpleadoPresuAsignacion.add(jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion, gridBagConstraintsPresuAsignacion);


		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 0;
		jPanelFK_IdEmpleadoPresuAsignacion.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 1;
		gridBagConstraintsPresuAsignacion.gridx =1;
		jPanelFK_IdEmpleadoPresuAsignacion.add(jButtonFK_IdEmpleadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		jTabbedPaneBusquedasPresuAsignacion.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoPresuAsignacion);
		jTabbedPaneBusquedasPresuAsignacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPresuEstadoPresuAsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdPresuEstadoPresuAsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuEstadoPresuAsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuEstadoPresuAsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuEstadoPresuAsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuEstadoPresuAsignacion.setLayout(gridaBagLayoutFK_IdPresuEstadoPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 0;
		jPanelFK_IdPresuEstadoPresuAsignacion.add(jLabelid_presu_estadoFK_IdPresuEstadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 1;
		jPanelFK_IdPresuEstadoPresuAsignacion.add(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 1;
		gridBagConstraintsPresuAsignacion.gridx =1;
		jPanelFK_IdPresuEstadoPresuAsignacion.add(jButtonFK_IdPresuEstadoPresuAsignacion, gridBagConstraintsPresuAsignacion);

		jTabbedPaneBusquedasPresuAsignacion.addTab("2.-Por Estado ", jPanelFK_IdPresuEstadoPresuAsignacion);
		jTabbedPaneBusquedasPresuAsignacion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuProyectoCuentaPresuAsignacion.setLayout(gridaBagLayoutFK_IdPresuProyectoCuentaPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 0;
		jPanelFK_IdPresuProyectoCuentaPresuAsignacion.add(jLabelid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 0;
		gridBagConstraintsPresuAsignacion.gridx = 1;
		jPanelFK_IdPresuProyectoCuentaPresuAsignacion.add(jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion, gridBagConstraintsPresuAsignacion);

		gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuAsignacion.gridy = 1;
		gridBagConstraintsPresuAsignacion.gridx =1;
		jPanelFK_IdPresuProyectoCuentaPresuAsignacion.add(jButtonFK_IdPresuProyectoCuentaPresuAsignacion, gridBagConstraintsPresuAsignacion);

		jTabbedPaneBusquedasPresuAsignacion.addTab("3.-Por Proyecto Cuenta ", jPanelFK_IdPresuProyectoCuentaPresuAsignacion);
		jTabbedPaneBusquedasPresuAsignacion.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuAsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuAsignacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();						
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuAsignacion.gridx = 0;		
			//this.gridBagConstraintsPresuAsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuAsignacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuAsignacion.gridx = 0;		
		//this.gridBagConstraintsPresuAsignacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuAsignacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuAsignacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuAsignacion.gridx = 0;		
			this.gridBagConstraintsPresuAsignacion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuAsignacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuAsignacion, this.gridBagConstraintsPresuAsignacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);								
		
		
		/*
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		*/		
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuAsignacion.gridx =0;
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuAsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
				
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuAsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuAsignacion = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuAsignacion.setLayout(gridaBagLayoutBusquedasParametrosPresuAsignacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuAsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuAsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuAsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuAsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuAsignacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuAsignacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuAsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuAsignacion.setName("jPanelReporteDinamicoPresuAsignacion"); 
		
		this.jPanelReporteDinamicoPresuAsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuAsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuAsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuAsignacion.setLayout(gridaBagLayoutReporteDinamicoPresuAsignacion);
		
		
		this.jInternalFrameReporteDinamicoPresuAsignacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuAsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuAsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuAsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuAsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuAsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuAsignacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuAsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuAsignacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuAsignacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuAsignacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuAsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuAsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuAsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuAsignacion = new JLabelMe();

		this.jLabelColumnasSelectReportePresuAsignacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelColumnasSelectReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuAsignacion = new JList<Reporte>();
		this.jListColumnasSelectReportePresuAsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuAsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuAsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuAsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuAsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuAsignacion=new JScrollPane(this.jListColumnasSelectReportePresuAsignacion);
			
			this.jScrollColumnasSelectReportePresuAsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuAsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuAsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuAsignacion.add(this.jListColumnasSelectReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jScrollColumnasSelectReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuAsignacion = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuAsignacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuAsignacion = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuAsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuAsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuAsignacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuAsignacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuAsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuAsignacion=new JScrollPane(this.jListRelacionesSelectReportePresuAsignacion);
			
			this.jScrollRelacionesSelectReportePresuAsignacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuAsignacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuAsignacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresuAsignacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuAsignacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuAsignacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuAsignacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuAsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuAsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuAsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuAsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresuAsignacion = new JLabelMe();

		this.jLabelConGraficoDinamicoPresuAsignacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelConGraficoDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresuAsignacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresuAsignacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresuAsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuAsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuAsignacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jCheckBoxConGraficoDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresuAsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresuAsignacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelColumnaCategoriaGraficoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jComboBoxColumnaCategoriaGraficoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresuAsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresuAsignacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelColumnaCategoriaValorPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresuAsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresuAsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresuAsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuAsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuAsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jComboBoxColumnaCategoriaValorPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresuAsignacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresuAsignacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelColumnasValoresGraficoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresuAsignacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresuAsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresuAsignacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresuAsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuAsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuAsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresuAsignacion=new JScrollPane(this.jListColumnasValoresGraficoPresuAsignacion);
			
			this.jScrollColumnasValoresGraficoPresuAsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuAsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuAsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresuAsignacion.add(this.jListColumnasSelectReportePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jScrollColumnasValoresGraficoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresuAsignacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresuAsignacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelTiposGraficosReportesDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuAsignacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jComboBoxTiposGraficosReportesDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuAsignacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuAsignacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelGenerarExcelReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuAsignacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuAsignacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuAsignacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuAsignacion.setToolTipText("Generar EXCEL"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuAsignacion.add(this.jButtonGenerarExcelReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jComboBoxTiposReportesDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuAsignacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuAsignacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jLabelTiposArchivoReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jComboBoxTiposArchivosReportesDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuAsignacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuAsignacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuAsignacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuAsignacion.setToolTipText("Generar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jButtonGenerarReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuAsignacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuAsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuAsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuAsignacion.setToolTipText("Cancelar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuAsignacion.add(this.jButtonCerrarReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuAsignacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuAsignacion= new JScrollPane(jPanelReporteDinamicoPresuAsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuAsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuAsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuAsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuAsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuAsignacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuAsignacion);
		this.jInternalFrameReporteDinamicoPresuAsignacion.getContentPane().add(this.jScrollPanelReporteDinamicoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuAsignacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuAsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuAsignacion.setName("jPanelImportacionPresuAsignacion"); 
		
		this.jPanelImportacionPresuAsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuAsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuAsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuAsignacion.setLayout(gridaBagLayoutImportacionPresuAsignacion);
		
		
		this.jInternalFrameImportacionPresuAsignacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuAsignacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuAsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuAsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuAsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuAsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuAsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuAsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuAsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuAsignacion.setResizable(true);
	    this.jInternalFrameImportacionPresuAsignacion.setClosable(true);
	    this.jInternalFrameImportacionPresuAsignacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuAsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuAsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuAsignacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuAsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuAsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuAsignacion.setResizable(true);
	    this.jInternalFrameImportacionPresuAsignacion.setClosable(true);
	    this.jInternalFrameImportacionPresuAsignacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuAsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuAsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuAsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuAsignacion = new JLabelMe();

		this.jLabelArchivoImportacionPresuAsignacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuAsignacion.add(this.jLabelArchivoImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuAsignacion = new JFileChooser();		
		this.jFileChooserImportacionPresuAsignacion.setToolTipText("ESCOGER ARCHIVO"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuAsignacion = new JButtonMe();
		this.jButtonAbrirImportacionPresuAsignacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuAsignacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuAsignacion.setToolTipText("Generar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuAsignacion.add(this.jButtonAbrirImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuAsignacion = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuAsignacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuAsignacion.add(this.jLabelPathArchivoImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuAsignacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuAsignacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuAsignacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuAsignacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuAsignacion.add(this.jTextFieldPathArchivoImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuAsignacion = new JButtonMe();
		this.jButtonGenerarImportacionPresuAsignacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuAsignacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuAsignacion.setToolTipText("Generar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuAsignacion.add(this.jButtonGenerarImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuAsignacion = new JButtonMe();
		this.jButtonCerrarImportacionPresuAsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuAsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuAsignacion.setToolTipText("Cancelar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuAsignacion.add(this.jButtonCerrarImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuAsignacion = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuAsignacion= new JScrollPane(jPanelImportacionPresuAsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuAsignacion.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuAsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuAsignacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuAsignacion);
		this.jInternalFrameImportacionPresuAsignacion.getContentPane().add(this.jScrollPanelImportacionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuAsignacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuAsignacion = new JButtonMe();
			this.jButtonAbrirOrderByPresuAsignacion.setText("Orden");
			this.jButtonAbrirOrderByPresuAsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuAsignacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuAsignacion";
			inputMap = this.jButtonAbrirOrderByPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuAsignacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuAsignacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuAsignacion.setName("jPanelOrderByPresuAsignacion"); 
			
			this.jPanelOrderByPresuAsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuAsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuAsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuAsignacion.setLayout(gridaBagLayoutOrderByPresuAsignacion);
			
			
			this.jTableDatosPresuAsignacionOrderBy = new JTableMe();        
			this.jTableDatosPresuAsignacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuAsignacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuAsignacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuAsignacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuAsignacionOrderBy.setViewportView(this.jTableDatosPresuAsignacionOrderBy);
			this.jTableDatosPresuAsignacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuAsignacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuAsignacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuAsignacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuAsignacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuAsignacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuAsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuAsignacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuAsignacion.setTitle("Orden");
			this.jInternalFrameOrderByPresuAsignacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuAsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuAsignacion.setResizable(true);
			this.jInternalFrameOrderByPresuAsignacion.setClosable(true);
			this.jInternalFrameOrderByPresuAsignacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuAsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuAsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuAsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuAsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuAsignacion.ipady =150;
				
			this.jPanelOrderByPresuAsignacion.add(jScrollPanelDatosPresuAsignacionOrderBy, this.gridBagConstraintsPresuAsignacion);//this.jTableDatosPresuAsignacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuAsignacion = new JButtonMe();
			this.jButtonCerrarOrderByPresuAsignacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuAsignacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuAsignacion.setToolTipText("Cancelar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuAsignacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuAsignacion.add(this.jButtonCerrarOrderByPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuAsignacion = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuAsignacion= new JScrollPane(jPanelOrderByPresuAsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuAsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuAsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuAsignacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuAsignacion);
			
			this.jInternalFrameOrderByPresuAsignacion.getContentPane().add(this.jScrollPanelOrderByPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
		
		} else {
			this.jButtonAbrirOrderByPresuAsignacion = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presuasignacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuAsignacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuAsignacion.getRowHeight();//PresuAsignacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuAsignacion.isSelected()) {
					iHeightTable=PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuAsignacion.isSelected()) {
					iHeightTable=PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuAsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuAsignacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuAsignacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuAsignacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuAsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuAsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuAsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuAsignacion!=null && this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy()!=null) {
			//if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuAsignacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuAsignacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuAsignacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuAsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuAsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuAsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presuasignacionLogic.getPresuAsignacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuasignacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuAsignacion> TraerPresuAsignacionBeans(List<PresuAsignacion> presuasignacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuAsignacion presuasignacion:presuasignacions) {
					
				if(!(PresuAsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuAsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presuasignacion.setsDetalleGeneralEntityReporte(PresuAsignacionConstantesFunciones.getPresuAsignacionDescripcion(presuasignacion));
										
						
					
						
					
				} else  {
							
					//presuasignacion.setsDetalleGeneralEntityReporte(presuasignacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//presuasignacionbeans.add(presuasignacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presuasignacions;
    }
	//PARA REPORTES FIN
}
