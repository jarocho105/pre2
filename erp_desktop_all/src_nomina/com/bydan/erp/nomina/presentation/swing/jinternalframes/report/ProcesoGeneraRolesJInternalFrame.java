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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoGeneraRolesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoGeneraRolesJInternalFrame extends ProcesoGeneraRolesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoGeneraRoles;
	
	protected JMenuBar jmenuBarProcesoGeneraRoles;
	
	protected JMenu jmenuProcesoGeneraRoles;
	protected JMenu jmenuDatosProcesoGeneraRoles;
	protected JMenu jmenuArchivoProcesoGeneraRoles;
	protected JMenu jmenuAccionesProcesoGeneraRoles;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGeneraRoles;	
	protected GridBagConstraints gridBagConstraintsProcesoGeneraRoles;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoGeneraRoles;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoGeneraRoles;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoGeneraRoles;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ProcesoGeneraRolesSessionBean procesogenerarolesSessionBean;
		
	
	
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoGeneraRoles> procesogeneraroless;		
	public List<ProcesoGeneraRoles> procesogenerarolessEliminados;	
	public List<ProcesoGeneraRoles> procesogenerarolessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoGeneraRoles;		
	protected JButton jButtonAbrirOrderByProcesoGeneraRoles;
	
	
	//protected JPanel jPanelOrderByProcesoGeneraRoles;
	//public JScrollPane jScrollPanelOrderByProcesoGeneraRoles;	
	//protected JButton jButtonCerrarOrderByProcesoGeneraRoles;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoGeneraRolesLogic procesogenerarolesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoGeneraRoles;
	public JScrollPane jScrollPanelDatosEdicionProcesoGeneraRoles;
	public JScrollPane jScrollPanelDatosGeneralProcesoGeneraRoles;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoGeneraRolesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoGeneraRoles;
	//public JScrollPane jScrollPanelImportacionProcesoGeneraRoles;
	
	
	
	protected JPanel jPanelAccionesProcesoGeneraRoles;
	
    protected JPanel jPanelPaginacionProcesoGeneraRoles;
    protected JPanel jPanelParametrosReportesProcesoGeneraRoles;
	protected JPanel jPanelParametrosReportesAccionesProcesoGeneraRoles;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoGeneraRoles;
	protected JPanel jPanelParametrosAuxiliar2ProcesoGeneraRoles;
	protected JPanel jPanelParametrosAuxiliar3ProcesoGeneraRoles;
	protected JPanel jPanelParametrosAuxiliar4ProcesoGeneraRoles;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoGeneraRoles;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoGeneraRoles;
	//protected JPanel jPanelImportacionProcesoGeneraRoles;
	
	
	public JTable jTableDatosProcesoGeneraRoles;
	
	
	
	//public JTable jTableDatosProcesoGeneraRolesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoGeneraRoles;
	protected JButton jButtonDuplicarProcesoGeneraRoles;
	protected JButton jButtonCopiarProcesoGeneraRoles;
	protected JButton jButtonVerFormProcesoGeneraRoles;
	protected JButton jButtonNuevoRelacionesProcesoGeneraRoles;
	protected JButton jButtonModificarProcesoGeneraRoles;
	
    protected JButton jButtonGuardarCambiosTablaProcesoGeneraRoles;
	protected JButton jButtonCerrarProcesoGeneraRoles;
	
	
	protected JButton jButtonRecargarInformacionProcesoGeneraRoles;
	protected JButton jButtonProcesarInformacionProcesoGeneraRoles;
	
	
	protected JButton jButtonAnterioresProcesoGeneraRoles;
	protected JButton jButtonSiguientesProcesoGeneraRoles;
	protected JButton jButtonNuevoGuardarCambiosProcesoGeneraRoles;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoGeneraRoles;
	//protected JButton jButtonCerrarReporteDinamicoProcesoGeneraRoles;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoGeneraRoles;
	//protected JButton jButtonGenerarImportacionProcesoGeneraRoles;
	//protected JButton jButtonCerrarImportacionProcesoGeneraRoles;
	//protected JFileChooser jFileChooserImportacionProcesoGeneraRoles;
	//protected File fileImportacionProcesoGeneraRoles;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGeneraRoles;
	protected JButton jButtonDuplicarToolBarProcesoGeneraRoles;
	protected JButton jButtonNuevoRelacionesToolBarProcesoGeneraRoles;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoGeneraRoles;
	protected JButton jButtonCopiarToolBarProcesoGeneraRoles;
	protected JButton jButtonVerFormToolBarProcesoGeneraRoles;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGeneraRoles;
	protected JButton jButtonCerrarToolBarProcesoGeneraRoles;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoGeneraRoles;
	protected JButton jButtonProcesarInformacionToolBarProcesoGeneraRoles;
	protected JButton jButtonAnterioresToolBarProcesoGeneraRoles;
	protected JButton jButtonSiguientesToolBarProcesoGeneraRoles;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles;
	protected JButton jButtonAbrirOrderByToolBarProcesoGeneraRoles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGeneraRoles;
	protected JMenuItem jMenuItemDuplicarProcesoGeneraRoles;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoGeneraRoles;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoGeneraRoles;
	protected JMenuItem jMenuItemCopiarProcesoGeneraRoles;
	protected JMenuItem jMenuItemVerFormProcesoGeneraRoles;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGeneraRoles;
	protected JMenuItem jMenuItemCerrarProcesoGeneraRoles;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGeneraRoles;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoGeneraRoles;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGeneraRoles;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoGeneraRoles;
	protected JMenuItem jMenuItemProcesarInformacionProcesoGeneraRoles;
	protected JMenuItem jMenuItemAnterioresProcesoGeneraRoles;
	protected JMenuItem jMenuItemSiguientesProcesoGeneraRoles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGeneraRoles;
	protected JMenuItem jMenuItemAbrirOrderByProcesoGeneraRoles;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGeneraRoles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGeneraRoles;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoGeneraRoles;
	protected JCheckBox jCheckBoxSeleccionadosProcesoGeneraRoles;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoGeneraRoles;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoGeneraRoles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoGeneraRoles;
	protected JTextField jTextFieldValorCampoGeneralProcesoGeneraRoles;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoGeneraRoles;
	//public JList<Reporte> jListColumnasSelectReporteProcesoGeneraRoles;
	//public JScrollPane jScrollColumnasSelectReporteProcesoGeneraRoles;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoGeneraRoles;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoGeneraRoles;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoGeneraRoles;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoGeneraRoles;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoGeneraRoles;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles;
	
		
	//public JLabel jLabelArchivoImportacionProcesoGeneraRoles;	
	//public JLabel jLabelPathArchivoImportacionProcesoGeneraRoles;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoGeneraRoles;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoGeneraRoles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoGeneraRoles;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoGeneraRoles;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoGeneraRoles;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoGeneraRoles;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoGeneraRoles;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoGeneraRoles;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoGeneraRoles;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoGeneraRoles;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoGeneraRoles;
	public JPanel jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JButton jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	
	public JPanel jPanelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JLabel jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JButton jButtonid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoGeneraRolesProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoGeneraRolesProcesoGeneraRolesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JLabel jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JButton jButtonid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRolesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JLabel jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles;
	public JButton jButtonid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRolesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public ProcesoGeneraRolesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoGeneraRoles)	{
		this.jButtonRecargarInformacionProcesoGeneraRoles = jButtonRecargarInformacionProcesoGeneraRoles;
	}
	
	public JButton getjButtonProcesarInformacionProcesoGeneraRoles() {
		return this.jButtonProcesarInformacionProcesoGeneraRoles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGeneraRoles)	{
		this.jButtonProcesarInformacionProcesoGeneraRoles = jButtonProcesarInformacionProcesoGeneraRoles;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoGeneraRoles() {
		return this.jButtonRecargarInformacionProcesoGeneraRoles;
	}
	
	
	public List<ProcesoGeneraRoles> getprocesogeneraroless() {
		return this.procesogeneraroless;
	}

	public void setprocesogeneraroless(List<ProcesoGeneraRoles> procesogeneraroless) {
		this.procesogeneraroless = procesogeneraroless;
	}
	
	public List<ProcesoGeneraRoles> getprocesogenerarolessAux() {
		return this.procesogenerarolessAux;
	}

	public void setprocesogenerarolessAux(List<ProcesoGeneraRoles> procesogenerarolessAux) {
		this.procesogenerarolessAux = procesogenerarolessAux;
	}
	
	public List<ProcesoGeneraRoles> getprocesogenerarolessEliminados() {
		return this.procesogenerarolessEliminados;
	}

	public void setProcesoGeneraRolessEliminados(List<ProcesoGeneraRoles> procesogenerarolessEliminados) {
		this.procesogenerarolessEliminados = procesogenerarolessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoGeneraRoles() {
		return jComboBoxTiposSeleccionarProcesoGeneraRoles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoGeneraRoles(
			JComboBox jComboBoxTiposSeleccionarProcesoGeneraRoles) {
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles = jComboBoxTiposSeleccionarProcesoGeneraRoles;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoGeneraRoles() {
		return jTextFieldValorCampoGeneralProcesoGeneraRoles;
	}

	public void setjTextFieldValorCampoGeneralProcesoGeneraRoles(
			JTextField jTextFieldValorCampoGeneralProcesoGeneraRoles) {
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles = jTextFieldValorCampoGeneralProcesoGeneraRoles;
	}

	public void setBorderResaltarValorCampoGeneralProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoGeneraRoles() {
		return this.jCheckBoxSeleccionarTodosProcesoGeneraRoles;
	}

	public void setjCheckBoxSeleccionarTodosProcesoGeneraRoles(
			JCheckBox jCheckBoxSeleccionarTodosProcesoGeneraRoles) {
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles = jCheckBoxSeleccionarTodosProcesoGeneraRoles;
	}

	public void setBorderResaltarSeleccionarTodosProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoGeneraRoles() {
		return this.jCheckBoxSeleccionadosProcesoGeneraRoles;
	}

	public void setjCheckBoxSeleccionadosProcesoGeneraRoles(
			JCheckBox jCheckBoxSeleccionadosProcesoGeneraRoles) {
		this.jCheckBoxSeleccionadosProcesoGeneraRoles = jCheckBoxSeleccionadosProcesoGeneraRoles;
	}
	
	public void setBorderResaltarSeleccionadosProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoGeneraRoles() {
		return this.jComboBoxTiposArchivosReportesProcesoGeneraRoles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoGeneraRoles(
			JComboBox jComboBoxTiposArchivosReportesProcesoGeneraRoles) {
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles = jComboBoxTiposArchivosReportesProcesoGeneraRoles;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoGeneraRoles() {
		return this.jComboBoxTiposReportesProcesoGeneraRoles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoGeneraRoles(
			JComboBox jComboBoxTiposReportesProcesoGeneraRoles) {
		this.jComboBoxTiposReportesProcesoGeneraRoles = jComboBoxTiposReportesProcesoGeneraRoles;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoGeneraRoles() {
	//	return jComboBoxTiposReportesDinamicoProcesoGeneraRoles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoGeneraRoles(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoGeneraRoles) {
	//	this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles = jComboBoxTiposReportesDinamicoProcesoGeneraRoles;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles = jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles;
	//}
	
	public void setBorderResaltarTiposReportesProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoGeneraRoles() {
		return this.jComboBoxTiposGraficosReportesProcesoGeneraRoles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoGeneraRoles(
			JComboBox jComboBoxTiposGraficosReportesProcesoGeneraRoles) {
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles = jComboBoxTiposGraficosReportesProcesoGeneraRoles;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoGeneraRoles() {
		return this.jComboBoxTiposPaginacionProcesoGeneraRoles;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoGeneraRoles(
			JComboBox jComboBoxTiposPaginacionProcesoGeneraRoles) {
		this.jComboBoxTiposPaginacionProcesoGeneraRoles = jComboBoxTiposPaginacionProcesoGeneraRoles;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoGeneraRoles() {
		return this.jComboBoxTiposRelacionesProcesoGeneraRoles;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGeneraRoles() {
		return this.jComboBoxTiposAccionesProcesoGeneraRoles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGeneraRoles(
			JComboBox jComboBoxTiposRelacionesProcesoGeneraRoles) {
		this.jComboBoxTiposRelacionesProcesoGeneraRoles = jComboBoxTiposRelacionesProcesoGeneraRoles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGeneraRoles(
			JComboBox jComboBoxTiposAccionesProcesoGeneraRoles) {
		this.jComboBoxTiposAccionesProcesoGeneraRoles = jComboBoxTiposAccionesProcesoGeneraRoles;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoGeneraRoles() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoGeneraRoles .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoGeneraRoles() {
	//	return jCheckBoxConGraficoDinamicoProcesoGeneraRoles;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoGeneraRoles(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoGeneraRoles) {
	//	this.jCheckBoxConGraficoDinamicoProcesoGeneraRoles = jCheckBoxConGraficoDinamicoProcesoGeneraRoles;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoGeneraRoles() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoGeneraRoles.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoGeneraRoles .setBorder(borderResaltar);		
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
		this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
		
		this.procesogenerarolesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarolesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogenerarolesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGeneraRolesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Genera Roles MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoGeneraRolesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoGeneraRoles= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"nuevo","nuevo","Nuevo"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"duplicar","duplicar","Duplicar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"copiar","copiar","Copiar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"ver_form","ver_form","Ver"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"recargar","recargar","Procesar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,
							"cerrar","cerrar","Salir"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoGeneraRoles;
			
				this.jButtonProcesarInformacionToolBarProcesoGeneraRoles=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoGeneraRoles;
				
		//protected JButton jButtonModificarToolBarProcesoGeneraRoles;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoGeneraRoles=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoGeneraRoles=new JMenuMe("General");
		this.jmenuArchivoProcesoGeneraRoles=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoGeneraRoles=new JMenuMe("Acciones");
		this.jmenuDatosProcesoGeneraRoles=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGeneraRoles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGeneraRoles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGeneraRoles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoGeneraRoles= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoGeneraRoles.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoGeneraRoles,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoGeneraRoles= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoGeneraRoles.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoGeneraRoles,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoGeneraRoles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGeneraRoles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGeneraRoles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoGeneraRoles= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoGeneraRoles.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoGeneraRoles,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoGeneraRoles= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoGeneraRoles.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoGeneraRoles,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGeneraRoles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGeneraRoles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGeneraRoles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoGeneraRoles= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoGeneraRoles.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoGeneraRoles,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoGeneraRoles= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoGeneraRoles.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoGeneraRoles,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoGeneraRoles= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoGeneraRoles.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoGeneraRoles,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoGeneraRoles= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoGeneraRoles.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoGeneraRoles,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoGeneraRoles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoGeneraRoles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoGeneraRoles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGeneraRoles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGeneraRoles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGeneraRoles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoGeneraRoles.add(this.jMenuItemCerrarProcesoGeneraRoles);
			
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemNuevoProcesoGeneraRoles);
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles);
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemNuevoRelacionesProcesoGeneraRoles);
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles);		
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemDuplicarProcesoGeneraRoles);		
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemCopiarProcesoGeneraRoles);		
			this.jmenuAccionesProcesoGeneraRoles.add(this.jMenuItemVerFormProcesoGeneraRoles);		
			
			this.jmenuDatosProcesoGeneraRoles.add(this.jMenuItemRecargarInformacionProcesoGeneraRoles);				
			this.jmenuDatosProcesoGeneraRoles.add(this.jMenuItemAnterioresProcesoGeneraRoles);				
			this.jmenuDatosProcesoGeneraRoles.add(this.jMenuItemSiguientesProcesoGeneraRoles);				
			this.jmenuDatosProcesoGeneraRoles.add(this.jMenuItemAbrirOrderByProcesoGeneraRoles);				
			this.jmenuDatosProcesoGeneraRoles.add(this.jMenuItemMostrarOcultarProcesoGeneraRoles);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoGeneraRoles.add(this.jMenuItemGuardarCambiosProcesoGeneraRoles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoGeneraRoles.add(this.jmenuArchivoProcesoGeneraRoles);		
			this.jmenuBarProcesoGeneraRoles.add(this.jmenuAccionesProcesoGeneraRoles);		
			this.jmenuBarProcesoGeneraRoles.add(this.jmenuDatosProcesoGeneraRoles);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoGeneraRoles);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoGeneraRoles() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.setToolTipText("Procesar Proceso Genera Roles");
		this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JButtonMe();
		this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles.setText("Procesar");
		this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles.setToolTipText("Procesar Proceso Genera Roles");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles,"buscar_button","Procesar Proceso Genera Roles");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles = new JLabelMe();
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setText("Mes :");
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles = new JLabelMe();
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setText("Estructura :");
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles = new JLabelMe();
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setText("Empleado :");
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setToolTipText("Empleado");
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoGeneraRoles=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoGeneraRoles.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoGeneraRoles.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoGeneraRoles.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Genera Roles"));
		this.jTabbedPaneBusquedasProcesoGeneraRoles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoGeneraRoles = new ProcesoGeneraRolesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Genera Roles DATOS");
			this.jInternalFrameDetalleFormProcesoGeneraRoles = new ProcesoGeneraRolesDetalleFormJInternalFrame(jDesktopPane,this.procesogenerarolesSessionBean.getConGuardarRelaciones(),this.procesogenerarolesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoGeneraRoles = null;//new ProcesoGeneraRolesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGeneraRoles= new GridBagLayout();
		
		
		this.jTableDatosProcesoGeneraRoles = new JTableMe();      
		
		String sToolTipProcesoGeneraRoles="";
		sToolTipProcesoGeneraRoles=ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGeneraRoles+="(Nomina.ProcesoGeneraRoles)";
		}
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGeneraRoles+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoGeneraRoles.setToolTipText(sToolTipProcesoGeneraRoles);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoGeneraRoles);
		this.jTableDatosProcesoGeneraRoles.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoGeneraRoles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoGeneraRoles.setRowSelectionAllowed(true);
		this.jTableDatosProcesoGeneraRoles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoGeneraRoles = new JButtonMe();
		this.jButtonDuplicarProcesoGeneraRoles = new JButtonMe();
		this.jButtonCopiarProcesoGeneraRoles = new JButtonMe();
		this.jButtonVerFormProcesoGeneraRoles = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoGeneraRoles = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles = new JButtonMe();
		this.jButtonCerrarProcesoGeneraRoles = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGeneraRoles = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoGeneraRoles = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Genera Roles";
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGeneraRoles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGeneraRoles.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGeneraRoles.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoGeneraRoles=new ReporteDinamicoJInternalFrame(ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoGeneraRoles();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoGeneraRoles=new ImportacionJInternalFrame(ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoGeneraRoles();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoGeneraRoles = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoGeneraRoles.setText("Orden");
		this.jButtonAbrirOrderByProcesoGeneraRoles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGeneraRoles,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGeneraRoles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraRoles,false,this);
			
			//this.cargarOrderByProcesoGeneraRoles(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGeneraRoles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraRoles,true,this);
			
			//this.cargarOrderByProcesoGeneraRoles(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoGeneraRoles.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoGeneraRoles.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoGeneraRoles.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosProcesoGeneraRoles.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGeneraRoles.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGeneraRoles.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoGeneraRoles.setText("Nuevo");
		this.jButtonDuplicarProcesoGeneraRoles.setText("Duplicar");
		this.jButtonCopiarProcesoGeneraRoles.setText("Copiar");
		this.jButtonVerFormProcesoGeneraRoles.setText("Ver");
		this.jButtonNuevoRelacionesProcesoGeneraRoles.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setText("Guardar");
		this.jButtonCerrarProcesoGeneraRoles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGeneraRoles,"nuevo_button","Nuevo",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoGeneraRoles,"duplicar_button","Duplicar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoGeneraRoles,"copiar_button","Copiar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoGeneraRoles,"ver_form","Ver",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoGeneraRoles,"nuevorelaciones_button","Nuevo Rel",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGeneraRoles,"guardarcambiostabla_button","Guardar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGeneraRoles,"cerrar_button","Salir",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoGeneraRoles.setToolTipText("Nuevo"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoGeneraRoles.setToolTipText("Duplicar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoGeneraRoles.setToolTipText("Copiar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoGeneraRoles.setToolTipText("Ver"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoGeneraRoles.setToolTipText("Nuevo Rel"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setToolTipText("Guardar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGeneraRoles.setToolTipText("Salir"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGeneraRoles";
		inputMap = this.jButtonNuevoProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGeneraRoles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGeneraRoles"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoGeneraRoles";
		inputMap = this.jButtonDuplicarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoGeneraRoles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoGeneraRoles"));
		
		//COPIAR
		sMapKey = "CopiarProcesoGeneraRoles";
		inputMap = this.jButtonCopiarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoGeneraRoles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoGeneraRoles"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoGeneraRoles";
		inputMap = this.jButtonVerFormProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoGeneraRoles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoGeneraRoles"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoGeneraRoles";
		inputMap = this.jButtonNuevoRelacionesProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoGeneraRoles"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoGeneraRoles";
		inputMap = this.jButtonModificarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoGeneraRoles"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoGeneraRoles";
		inputMap = this.jButtonCerrarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGeneraRoles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGeneraRoles";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGeneraRoles"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoGeneraRoles.setName("jPanelParametrosReportesProcesoGeneraRoles"); 
		
		this.jPanelParametrosReportesAccionesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoGeneraRoles.setName("jPanelParametrosReportesAccionesProcesoGeneraRoles"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoGeneraRoles = new JButtonMe();
		this.jButtonRecargarInformacionProcesoGeneraRoles.setText("Procesar");
		this.jButtonRecargarInformacionProcesoGeneraRoles.setToolTipText("Procesar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoGeneraRoles,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoGeneraRoles = new JButtonMe();
		this.jButtonProcesarInformacionProcesoGeneraRoles.setText("Procesar");
		this.jButtonProcesarInformacionProcesoGeneraRoles.setToolTipText("Procesar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoGeneraRoles.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoGeneraRoles.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGeneraRoles.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGeneraRoles.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoGeneraRoles.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoGeneraRoles.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoGeneraRoles.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoGeneraRoles.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGeneraRoles.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoGeneraRoles = new JLabelMe();
		
		this.jLabelAccionesProcesoGeneraRoles.setText("Acciones");		
		this.jLabelAccionesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoGeneraRoles = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoGeneraRoles.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoGeneraRoles.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoGeneraRoles = new JButtonMe();
		//this.jButtonAnterioresProcesoGeneraRoles.setText("<<");
        this.jButtonAnterioresProcesoGeneraRoles.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoGeneraRoles,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoGeneraRoles = new JButtonMe();
		//this.jButtonSiguientesProcesoGeneraRoles.setText(">>");
        this.jButtonSiguientesProcesoGeneraRoles.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoGeneraRoles,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoGeneraRoles,"nuevoguardarcambios_button","Nue",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoGeneraRoles";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoGeneraRoles"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoGeneraRoles";
		inputMap = this.jButtonRecargarInformacionProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoGeneraRoles"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoGeneraRoles";
		inputMap = this.jButtonSiguientesProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoGeneraRoles"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoGeneraRoles";
		inputMap = this.jButtonAnterioresProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoGeneraRoles"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoGeneraRoles();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoGeneraRoles.setMinimumSize(new Dimension(this.getWidth(),ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGeneraRoles.setMaximumSize(new Dimension(this.getWidth(),ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGeneraRoles.setPreferredSize(new Dimension(this.getWidth(),ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGeneraRolesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoGeneraRoles = new GridBagLayout();

			this.jPanelPaginacionProcesoGeneraRoles.setLayout(gridaBagLayoutPaginacionProcesoGeneraRoles);						
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonAnterioresProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					
						
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
			
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonNuevoGuardarCambiosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
						
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonSiguientesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonNuevoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
						
			
			
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
				this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
				this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonGuardarCambiosTablaProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			}
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonProcesarInformacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonDuplicarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonCopiarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonVerFormProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 1;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoGeneraRoles.add(this.jButtonCerrarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGeneraRoles.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGeneraRoles.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoGeneraRoles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGeneraRoles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGeneraRoles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoGeneraRoles.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGeneraRoles.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGeneraRoles.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoGeneraRoles.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGeneraRoles.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGeneraRoles.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoGeneraRoles = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoGeneraRoles = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoGeneraRoles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoGeneraRoles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoGeneraRoles = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoGeneraRoles = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoGeneraRoles.setLayout(gridaBagParametrosReportesProcesoGeneraRoles);
			this.jPanelParametrosReportesAccionesProcesoGeneraRoles.setLayout(gridaBagParametrosReportesAccionesProcesoGeneraRoles);
			
			
			this.jPanelParametrosAuxiliar1ProcesoGeneraRoles.setLayout(gridaBagParametrosAuxiliar1ProcesoGeneraRoles);
			this.jPanelParametrosAuxiliar2ProcesoGeneraRoles.setLayout(gridaBagParametrosAuxiliar2ProcesoGeneraRoles);
			this.jPanelParametrosAuxiliar3ProcesoGeneraRoles.setLayout(gridaBagParametrosAuxiliar3ProcesoGeneraRoles);
			this.jPanelParametrosAuxiliar4ProcesoGeneraRoles.setLayout(gridaBagParametrosAuxiliar4ProcesoGeneraRoles);
			//this.jPanelParametrosAuxiliar5ProcesoGeneraRoles.setLayout(gridaBagParametrosAuxiliar2ProcesoGeneraRoles);			
			
			
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jButtonRecargarInformacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraRoles.add(this.jComboBoxTiposPaginacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraRoles.add(this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGeneraRoles.add(this.jComboBoxTiposArchivosReportesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jPanelParametrosAuxiliar1ProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoGeneraRoles.add(this.jComboBoxTiposReportesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jPanelParametrosAuxiliar4ProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jComboBoxTiposReportesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jCheckBoxGenerarReporteProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jPanelParametrosAuxiliar2ProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jLabelAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jComboBoxTiposSeleccionarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
			
			
			/*
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jCheckBoxSeleccionarTodosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGeneraRoles.add(this.jCheckBoxSeleccionarTodosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);															
				
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGeneraRoles.add(this.jCheckBoxSeleccionadosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jPanelParametrosAuxiliar3ProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGeneraRoles.add(this.jComboBoxTiposAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoGeneraRoles = new GridBagLayout();

			this.jScrollPanelDatosProcesoGeneraRoles.setLayout(gridaBagLayoutDatosProcesoGeneraRoles);
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
			
			this.jScrollPanelDatosProcesoGeneraRoles.add(this.jTableDatosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoGeneraRoles.setViewportView(this.jTableDatosProcesoGeneraRoles);
		this.jTableDatosProcesoGeneraRoles.setFillsViewportHeight(true);
		this.jTableDatosProcesoGeneraRoles.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoGeneraRoles= new GridBagLayout();
		this.jPanelAccionesProcesoGeneraRoles.setLayout(gridaBagLayoutAccionesProcesoGeneraRoles);
		
		
		/*	
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
			
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonNuevoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.setLayout(gridaBagLayoutBusquedaProcesoGeneraRolesProcesoGeneraRoles);

		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jLabelid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);

		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		gridBagConstraintsProcesoGeneraRoles.gridx = 1;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);


		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 1;
		gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jLabelid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);

		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 1;
		gridBagConstraintsProcesoGeneraRoles.gridx = 1;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);


		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 2;
		gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jLabelid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);

		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 2;
		gridBagConstraintsProcesoGeneraRoles.gridx = 1;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);

		gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGeneraRoles.gridy = 3;
		gridBagConstraintsProcesoGeneraRoles.gridx =1;
		jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles.add(jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);

		jTabbedPaneBusquedasProcesoGeneraRoles.addTab("1.-Por Mes Por Estructura Por Empleado ", jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);
		jTabbedPaneBusquedasProcesoGeneraRoles.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGeneraRoles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGeneraRoles);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;		
			//this.gridBagConstraintsProcesoGeneraRoles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGeneraRoles.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;		
		//this.gridBagConstraintsProcesoGeneraRoles.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoGeneraRoles);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;		
			this.gridBagConstraintsProcesoGeneraRoles.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoGeneraRoles.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);								
		
		
		/*
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		*/		
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraRoles.gridx =0;
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGeneraRoles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
				
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoGeneraRoles= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGeneraRoles = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoGeneraRoles.setLayout(gridaBagLayoutBusquedasParametrosProcesoGeneraRoles);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoGeneraRoles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoGeneraRoles.setVisible(false);
		this.jButtonAnterioresProcesoGeneraRoles.setVisible(false);
		this.jButtonSiguientesProcesoGeneraRoles.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoGeneraRoles.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoGeneraRoles.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposReportesProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.setVisible(false);
		
		this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(false);
		
		
		this.jTtoolBarProcesoGeneraRoles.setVisible(false);
			
		this.jMenuItemAnterioresProcesoGeneraRoles.setVisible(false);
		this.jMenuItemSiguientesProcesoGeneraRoles.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoGeneraRoles.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoGeneraRoles.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoGeneraRoles.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoGeneraRoles.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoGeneraRoles;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoGeneraRoles() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoGeneraRoles = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoGeneraRoles.setName("jPanelReporteDinamicoProcesoGeneraRoles"); 
		
		this.jPanelReporteDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoGeneraRoles.setLayout(gridaBagLayoutReporteDinamicoProcesoGeneraRoles);
		
		
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGeneraRoles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoGeneraRoles = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoGeneraRoles.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jLabelColumnasSelectReporteProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoGeneraRoles = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoGeneraRoles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoGeneraRoles.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoGeneraRoles=new JScrollPane(this.jListColumnasSelectReporteProcesoGeneraRoles);
			
			this.jScrollColumnasSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jListColumnasSelectReporteProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jScrollColumnasSelectReporteProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoGeneraRoles = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoGeneraRoles.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoGeneraRoles = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoGeneraRoles.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoGeneraRoles.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoGeneraRoles=new JScrollPane(this.jListRelacionesSelectReporteProcesoGeneraRoles);
			
			this.jScrollRelacionesSelectReporteProcesoGeneraRoles.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGeneraRoles.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGeneraRoles.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoGeneraRoles = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoGeneraRoles = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoGeneraRoles = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jLabelGenerarExcelReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles.setToolTipText("Generar EXCEL"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jComboBoxTiposReportesDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jLabelTiposArchivoReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoGeneraRoles = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoGeneraRoles.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoGeneraRoles,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoGeneraRoles.setToolTipText("Generar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jButtonGenerarReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoGeneraRoles = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoGeneraRoles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoGeneraRoles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoGeneraRoles.setToolTipText("Cancelar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGeneraRoles.add(this.jButtonCerrarReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoGeneraRoles = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles= new JScrollPane(jPanelReporteDinamicoProcesoGeneraRoles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoGeneraRoles);
		this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoGeneraRoles() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoGeneraRoles = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoGeneraRoles.setName("jPanelImportacionProcesoGeneraRoles"); 
		
		this.jPanelImportacionProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoGeneraRoles.setLayout(gridaBagLayoutImportacionProcesoGeneraRoles);
		
		
		this.jInternalFrameImportacionProcesoGeneraRoles= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoGeneraRoles= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoGeneraRoles = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGeneraRoles= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoGeneraRoles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGeneraRoles.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoGeneraRoles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGeneraRoles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGeneraRoles.setResizable(true);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setClosable(true);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoGeneraRoles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGeneraRoles.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoGeneraRoles.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGeneraRoles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGeneraRoles.setResizable(true);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setClosable(true);
	    this.jInternalFrameImportacionProcesoGeneraRoles.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoGeneraRoles = new JLabelMe();

		this.jLabelArchivoImportacionProcesoGeneraRoles.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGeneraRoles.add(this.jLabelArchivoImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoGeneraRoles = new JFileChooser();		
		this.jFileChooserImportacionProcesoGeneraRoles.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoGeneraRoles = new JButtonMe();
		this.jButtonAbrirImportacionProcesoGeneraRoles.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoGeneraRoles,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoGeneraRoles.setToolTipText("Generar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraRoles.add(this.jButtonAbrirImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoGeneraRoles = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoGeneraRoles.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGeneraRoles.add(this.jLabelPathArchivoImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoGeneraRoles=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoGeneraRoles.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGeneraRoles.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGeneraRoles.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraRoles.add(this.jTextFieldPathArchivoImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoGeneraRoles = new JButtonMe();
		this.jButtonGenerarImportacionProcesoGeneraRoles.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoGeneraRoles,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoGeneraRoles.setToolTipText("Generar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraRoles.add(this.jButtonGenerarImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoGeneraRoles = new JButtonMe();
		this.jButtonCerrarImportacionProcesoGeneraRoles.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoGeneraRoles,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoGeneraRoles.setToolTipText("Cancelar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGeneraRoles.add(this.jButtonCerrarImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoGeneraRoles = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoGeneraRoles= new JScrollPane(jPanelImportacionProcesoGeneraRoles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoGeneraRoles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoGeneraRoles.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoGeneraRoles);
		this.jInternalFrameImportacionProcesoGeneraRoles.getContentPane().add(this.jScrollPanelImportacionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoGeneraRoles(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoGeneraRoles = new JButtonMe();
			this.jButtonAbrirOrderByProcesoGeneraRoles.setText("Orden");
			this.jButtonAbrirOrderByProcesoGeneraRoles.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGeneraRoles,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoGeneraRoles";
			inputMap = this.jButtonAbrirOrderByProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoGeneraRoles"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoGeneraRoles = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoGeneraRoles.setName("jPanelOrderByProcesoGeneraRoles"); 
			
			this.jPanelOrderByProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoGeneraRoles.setLayout(gridaBagLayoutOrderByProcesoGeneraRoles);
			
			
			this.jTableDatosProcesoGeneraRolesOrderBy = new JTableMe();        
			this.jTableDatosProcesoGeneraRolesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoGeneraRolesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoGeneraRolesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoGeneraRolesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoGeneraRolesOrderBy.setViewportView(this.jTableDatosProcesoGeneraRolesOrderBy);
			this.jTableDatosProcesoGeneraRolesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoGeneraRolesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoGeneraRoles= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoGeneraRoles= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoGeneraRoles = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoGeneraRoles= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoGeneraRoles.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoGeneraRoles.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoGeneraRoles.setTitle("Orden");
			this.jInternalFrameOrderByProcesoGeneraRoles.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoGeneraRoles.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoGeneraRoles.setResizable(true);
			this.jInternalFrameOrderByProcesoGeneraRoles.setClosable(true);
			this.jInternalFrameOrderByProcesoGeneraRoles.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoGeneraRoles.ipady =150;
				
			this.jPanelOrderByProcesoGeneraRoles.add(jScrollPanelDatosProcesoGeneraRolesOrderBy, this.gridBagConstraintsProcesoGeneraRoles);//this.jTableDatosProcesoGeneraRolesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoGeneraRoles = new JButtonMe();
			this.jButtonCerrarOrderByProcesoGeneraRoles.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoGeneraRoles,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoGeneraRoles.setToolTipText("Cancelar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoGeneraRoles.add(this.jButtonCerrarOrderByProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoGeneraRoles = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoGeneraRoles= new JScrollPane(jPanelOrderByProcesoGeneraRoles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoGeneraRoles.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoGeneraRoles.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoGeneraRoles);
			
			this.jInternalFrameOrderByProcesoGeneraRoles.getContentPane().add(this.jScrollPanelOrderByProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
		
		} else {
			this.jButtonAbrirOrderByProcesoGeneraRoles = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesogenerarolesSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoGeneraRoles.getRowHeight();//ProcesoGeneraRolesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.isSelected()) {
					iHeightTable=ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGeneraRoles.isSelected()) {
					iHeightTable=ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGeneraRolesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoGeneraRoles!=null && this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy()!=null) {
			//if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoGeneraRoles.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoGeneraRoles.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoGeneraRoles.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesogenerarolesLogic.getProcesoGeneraRoless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneraroless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoGeneraRoles> TraerProcesoGeneraRolesBeans(List<ProcesoGeneraRoles> procesogeneraroless,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoGeneraRoles procesogeneraroles:procesogeneraroless) {
					
				if(!(ProcesoGeneraRolesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoGeneraRolesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesogeneraroles.setsDetalleGeneralEntityReporte(ProcesoGeneraRolesConstantesFunciones.getProcesoGeneraRolesDescripcion(procesogeneraroles));
										
						
					
						
					
				} else  {
							
					//procesogeneraroles.setsDetalleGeneralEntityReporte(procesogeneraroles.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesogenerarolesbeans.add(procesogenerarolesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesogeneraroless;
    }
	//PARA REPORTES FIN
}
