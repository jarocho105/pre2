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
import com.bydan.erp.nomina.util.EmpleadoHobbyConstantesFunciones;

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
public class EmpleadoHobbyJInternalFrame extends EmpleadoHobbyBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoHobby;
	
	protected JMenuBar jmenuBarEmpleadoHobby;
	
	protected JMenu jmenuEmpleadoHobby;
	protected JMenu jmenuDatosEmpleadoHobby;
	protected JMenu jmenuArchivoEmpleadoHobby;
	protected JMenu jmenuAccionesEmpleadoHobby;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoHobby;	
	protected GridBagConstraints gridBagConstraintsEmpleadoHobby;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoHobbyDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoHobby;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoHobby;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoHobby;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_hobby="";
	
	public EmpleadoHobbySessionBean empleadohobbySessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public HobbySessionBean hobbySessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoHobby> empleadohobbys;		
	public List<EmpleadoHobby> empleadohobbysEliminados;	
	public List<EmpleadoHobby> empleadohobbysAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoHobby;		
	protected JButton jButtonAbrirOrderByEmpleadoHobby;
	
	
	//protected JPanel jPanelOrderByEmpleadoHobby;
	//public JScrollPane jScrollPanelOrderByEmpleadoHobby;	
	//protected JButton jButtonCerrarOrderByEmpleadoHobby;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoHobbyLogic empleadohobbyLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoHobby;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoHobby;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoHobby;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoHobbyOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoHobby;
	//public JScrollPane jScrollPanelImportacionEmpleadoHobby;
	
	
	
	protected JPanel jPanelAccionesEmpleadoHobby;
	
    protected JPanel jPanelPaginacionEmpleadoHobby;
    protected JPanel jPanelParametrosReportesEmpleadoHobby;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoHobby;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoHobby;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoHobby;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoHobby;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoHobby;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoHobby;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoHobby;
	//protected JPanel jPanelImportacionEmpleadoHobby;
	
	
	public JTable jTableDatosEmpleadoHobby;
	
	
	
	//public JTable jTableDatosEmpleadoHobbyOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoHobby;
	protected JButton jButtonDuplicarEmpleadoHobby;
	protected JButton jButtonCopiarEmpleadoHobby;
	protected JButton jButtonVerFormEmpleadoHobby;
	protected JButton jButtonNuevoRelacionesEmpleadoHobby;
	protected JButton jButtonModificarEmpleadoHobby;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoHobby;
	protected JButton jButtonCerrarEmpleadoHobby;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoHobby;
	protected JButton jButtonProcesarInformacionEmpleadoHobby;
	
	
	protected JButton jButtonAnterioresEmpleadoHobby;
	protected JButton jButtonSiguientesEmpleadoHobby;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoHobby;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoHobby;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoHobby;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoHobby;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoHobby;
	//protected JButton jButtonGenerarImportacionEmpleadoHobby;
	//protected JButton jButtonCerrarImportacionEmpleadoHobby;
	//protected JFileChooser jFileChooserImportacionEmpleadoHobby;
	//protected File fileImportacionEmpleadoHobby;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoHobby;
	protected JButton jButtonDuplicarToolBarEmpleadoHobby;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoHobby;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoHobby;
	protected JButton jButtonCopiarToolBarEmpleadoHobby;
	protected JButton jButtonVerFormToolBarEmpleadoHobby;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoHobby;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoHobby;
	protected JButton jButtonCerrarToolBarEmpleadoHobby;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoHobby;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoHobby;
	protected JButton jButtonAnterioresToolBarEmpleadoHobby;
	protected JButton jButtonSiguientesToolBarEmpleadoHobby;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoHobby;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoHobby;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoHobby;
	protected JMenuItem jMenuItemDuplicarEmpleadoHobby;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoHobby;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoHobby;
	protected JMenuItem jMenuItemCopiarEmpleadoHobby;
	protected JMenuItem jMenuItemVerFormEmpleadoHobby;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoHobby;
	protected JMenuItem jMenuItemCerrarEmpleadoHobby;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoHobby;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoHobby;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoHobby;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoHobby;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoHobby;
	protected JMenuItem jMenuItemAnterioresEmpleadoHobby;
	protected JMenuItem jMenuItemSiguientesEmpleadoHobby;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoHobby;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoHobby;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoHobby;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoHobby;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoHobby;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoHobby;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoHobby;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoHobby;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoHobby;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoHobby;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoHobby;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoHobby;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoHobby;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoHobby;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoHobby;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoHobby;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoHobby;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoHobby;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoHobby;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoHobby;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoHobby;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoHobby;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoHobby;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoHobby;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoHobby;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoHobby;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoHobby;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoHobby;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoHobby;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoHobby;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoHobby;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoHobby;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoHobby;
	public JPanel jPanelFK_IdEmpleadoEmpleadoHobby;
	public JButton jButtonFK_IdEmpleadoEmpleadoHobby;
	public JPanel jPanelFK_IdHobbyEmpleadoHobby;
	public JButton jButtonFK_IdHobbyEmpleadoHobby;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoHobby;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHobby= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHobbyUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHobbyBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby;
	
	public JPanel jPanelid_hobbyFK_IdHobbyEmpleadoHobby;
	public JLabel jLabelid_hobbyFK_IdHobbyEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby;
	public JButton jButtonid_hobbyFK_IdHobbyEmpleadoHobby= new JButtonMe();
	public JButton jButtonid_hobbyFK_IdHobbyEmpleadoHobbyUpdate= new JButtonMe();
	public JButton jButtonid_hobbyFK_IdHobbyEmpleadoHobbyBusqueda= new JButtonMe();

	
	
	
	
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
	public EmpleadoHobbyJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoHobby)	{
		this.jButtonRecargarInformacionEmpleadoHobby = jButtonRecargarInformacionEmpleadoHobby;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoHobby() {
		return this.jButtonProcesarInformacionEmpleadoHobby;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoHobby)	{
		this.jButtonProcesarInformacionEmpleadoHobby = jButtonProcesarInformacionEmpleadoHobby;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoHobby() {
		return this.jButtonRecargarInformacionEmpleadoHobby;
	}
	
	
	public List<EmpleadoHobby> getempleadohobbys() {
		return this.empleadohobbys;
	}

	public void setempleadohobbys(List<EmpleadoHobby> empleadohobbys) {
		this.empleadohobbys = empleadohobbys;
	}
	
	public List<EmpleadoHobby> getempleadohobbysAux() {
		return this.empleadohobbysAux;
	}

	public void setempleadohobbysAux(List<EmpleadoHobby> empleadohobbysAux) {
		this.empleadohobbysAux = empleadohobbysAux;
	}
	
	public List<EmpleadoHobby> getempleadohobbysEliminados() {
		return this.empleadohobbysEliminados;
	}

	public void setEmpleadoHobbysEliminados(List<EmpleadoHobby> empleadohobbysEliminados) {
		this.empleadohobbysEliminados = empleadohobbysEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoHobby() {
		return jComboBoxTiposSeleccionarEmpleadoHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoHobby(
			JComboBox jComboBoxTiposSeleccionarEmpleadoHobby) {
		this.jComboBoxTiposSeleccionarEmpleadoHobby = jComboBoxTiposSeleccionarEmpleadoHobby;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoHobby() {
		return jTextFieldValorCampoGeneralEmpleadoHobby;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoHobby(
			JTextField jTextFieldValorCampoGeneralEmpleadoHobby) {
		this.jTextFieldValorCampoGeneralEmpleadoHobby = jTextFieldValorCampoGeneralEmpleadoHobby;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoHobby .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoHobby() {
		return this.jCheckBoxSeleccionarTodosEmpleadoHobby;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoHobby(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoHobby) {
		this.jCheckBoxSeleccionarTodosEmpleadoHobby = jCheckBoxSeleccionarTodosEmpleadoHobby;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoHobby() {
		return this.jCheckBoxSeleccionadosEmpleadoHobby;
	}

	public void setjCheckBoxSeleccionadosEmpleadoHobby(
			JCheckBox jCheckBoxSeleccionadosEmpleadoHobby) {
		this.jCheckBoxSeleccionadosEmpleadoHobby = jCheckBoxSeleccionadosEmpleadoHobby;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoHobby() {
		return this.jComboBoxTiposArchivosReportesEmpleadoHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoHobby(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoHobby) {
		this.jComboBoxTiposArchivosReportesEmpleadoHobby = jComboBoxTiposArchivosReportesEmpleadoHobby;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoHobby() {
		return this.jComboBoxTiposReportesEmpleadoHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoHobby(
			JComboBox jComboBoxTiposReportesEmpleadoHobby) {
		this.jComboBoxTiposReportesEmpleadoHobby = jComboBoxTiposReportesEmpleadoHobby;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoHobby() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoHobby;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoHobby(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoHobby) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoHobby = jComboBoxTiposReportesDinamicoEmpleadoHobby;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoHobby() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoHobby(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby = jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoHobby() {
		return this.jComboBoxTiposGraficosReportesEmpleadoHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoHobby(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoHobby) {
		this.jComboBoxTiposGraficosReportesEmpleadoHobby = jComboBoxTiposGraficosReportesEmpleadoHobby;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoHobby() {
		return this.jComboBoxTiposPaginacionEmpleadoHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoHobby(
			JComboBox jComboBoxTiposPaginacionEmpleadoHobby) {
		this.jComboBoxTiposPaginacionEmpleadoHobby = jComboBoxTiposPaginacionEmpleadoHobby;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoHobby() {
		return this.jComboBoxTiposRelacionesEmpleadoHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoHobby() {
		return this.jComboBoxTiposAccionesEmpleadoHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoHobby(
			JComboBox jComboBoxTiposRelacionesEmpleadoHobby) {
		this.jComboBoxTiposRelacionesEmpleadoHobby = jComboBoxTiposRelacionesEmpleadoHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoHobby(
			JComboBox jComboBoxTiposAccionesEmpleadoHobby) {
		this.jComboBoxTiposAccionesEmpleadoHobby = jComboBoxTiposAccionesEmpleadoHobby;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoHobby .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoHobby() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoHobby;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoHobby(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoHobby) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoHobby = jCheckBoxConGraficoDinamicoEmpleadoHobby;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoHobby() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoHobby.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoHobby .setBorder(borderResaltar);		
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
		this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		
		this.empleadohobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadohobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadohobbySessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoHobbyJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Hobby MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoHobby= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"copiar","copiar","Copiar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"ver_form","ver_form","Ver"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"recargar","recargar","Recargar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoHobby,this.jTtoolBarEmpleadoHobby,
							"cerrar","cerrar","Salir"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoHobby=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoHobby;
			
				this.jButtonProcesarInformacionToolBarEmpleadoHobby=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoHobby;
				
		//protected JButton jButtonModificarToolBarEmpleadoHobby;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoHobby=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoHobby=new JMenuMe("General");
		this.jmenuArchivoEmpleadoHobby=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoHobby=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoHobby=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoHobby= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoHobby.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoHobby,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoHobby= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoHobby.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoHobby,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoHobby= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoHobby.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoHobby,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoHobby= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoHobby.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoHobby,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoHobby= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoHobby.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoHobby,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoHobby= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoHobby.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoHobby,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoHobby= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoHobby.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoHobby,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoHobby= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoHobby.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoHobby,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoHobby= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoHobby.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoHobby,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoHobby= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoHobby.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoHobby,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoHobby= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoHobby.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoHobby,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoHobby= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoHobby.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoHobby,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoHobby,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoHobby= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoHobby.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoHobby,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoHobby,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoHobby= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoHobby.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoHobby,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoHobby.add(this.jMenuItemCerrarEmpleadoHobby);
			
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemNuevoEmpleadoHobby);
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemNuevoGuardarCambiosEmpleadoHobby);
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemNuevoRelacionesEmpleadoHobby);
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemGuardarCambiosTablaEmpleadoHobby);		
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemDuplicarEmpleadoHobby);		
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemCopiarEmpleadoHobby);		
			this.jmenuAccionesEmpleadoHobby.add(this.jMenuItemVerFormEmpleadoHobby);		
			
			this.jmenuDatosEmpleadoHobby.add(this.jMenuItemRecargarInformacionEmpleadoHobby);				
			this.jmenuDatosEmpleadoHobby.add(this.jMenuItemAnterioresEmpleadoHobby);				
			this.jmenuDatosEmpleadoHobby.add(this.jMenuItemSiguientesEmpleadoHobby);				
			this.jmenuDatosEmpleadoHobby.add(this.jMenuItemAbrirOrderByEmpleadoHobby);				
			this.jmenuDatosEmpleadoHobby.add(this.jMenuItemMostrarOcultarEmpleadoHobby);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoHobby.add(this.jMenuItemGuardarCambiosEmpleadoHobby);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoHobby.add(this.jmenuArchivoEmpleadoHobby);		
			this.jmenuBarEmpleadoHobby.add(this.jmenuAccionesEmpleadoHobby);		
			this.jmenuBarEmpleadoHobby.add(this.jmenuDatosEmpleadoHobby);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoHobby);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoHobby() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoHobby.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoHobby= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoHobby.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoHobby.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoHobby,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.setFocusable(false);

		this.jPanelFK_IdHobbyEmpleadoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdHobbyEmpleadoHobby.setToolTipText("Buscar Por Hobby ");
		this.jButtonFK_IdHobbyEmpleadoHobby= new JButtonMe();
		this.jButtonFK_IdHobbyEmpleadoHobby.setText("Buscar");
		this.jButtonFK_IdHobbyEmpleadoHobby.setToolTipText("Buscar Por Hobby ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdHobbyEmpleadoHobby,"buscar_button","Buscar Por Hobby ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdHobbyEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby = new JLabelMe();
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby.setText("Hobby :");
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby.setToolTipText("Hobby");
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_hobbyFK_IdHobbyEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_hobbyFK_IdHobbyEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby= new JComboBoxMe();
		jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoHobby=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoHobby.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoHobby.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoHobby.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoHobby = new EmpleadoHobbyDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Hobby DATOS");
			this.jInternalFrameDetalleFormEmpleadoHobby = new EmpleadoHobbyDetalleFormJInternalFrame(jDesktopPane,this.empleadohobbySessionBean.getConGuardarRelaciones(),this.empleadohobbySessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoHobby = null;//new EmpleadoHobbyDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoHobby= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoHobby = new JTableMe();      
		
		String sToolTipEmpleadoHobby="";
		sToolTipEmpleadoHobby=EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoHobby+="(Nomina.EmpleadoHobby)";
		}
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoHobby+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoHobby.setToolTipText(sToolTipEmpleadoHobby);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoHobby);
		this.jTableDatosEmpleadoHobby.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoHobby.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoHobby.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoHobby = new JButtonMe();
		this.jButtonDuplicarEmpleadoHobby = new JButtonMe();
		this.jButtonCopiarEmpleadoHobby = new JButtonMe();
		this.jButtonVerFormEmpleadoHobby = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoHobby = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby = new JButtonMe();
		this.jButtonCerrarEmpleadoHobby = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoHobby = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoHobby = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Hobby";
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoHobby.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoHobby.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoHobby=new ReporteDinamicoJInternalFrame(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoHobby();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoHobby=new ImportacionJInternalFrame(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoHobby();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoHobby = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoHobby.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoHobby.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoHobby,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHobby,false,this);
			
			//this.cargarOrderByEmpleadoHobby(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHobby,true,this);
			
			//this.cargarOrderByEmpleadoHobby(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoHobby.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEmpleadoHobby.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEmpleadoHobby.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEmpleadoHobby.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoHobby.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoHobby.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoHobby.setText("Nuevo");
		this.jButtonDuplicarEmpleadoHobby.setText("Duplicar");
		this.jButtonCopiarEmpleadoHobby.setText("Copiar");
		this.jButtonVerFormEmpleadoHobby.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoHobby.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.setText("Guardar");
		this.jButtonCerrarEmpleadoHobby.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoHobby,"nuevo_button","Nuevo",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoHobby,"duplicar_button","Duplicar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoHobby,"copiar_button","Copiar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoHobby,"ver_form","Ver",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoHobby,"nuevorelaciones_button","Nuevo Rel",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoHobby,"guardarcambiostabla_button","Guardar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoHobby,"cerrar_button","Salir",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoHobby.setToolTipText("Nuevo"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoHobby.setToolTipText("Duplicar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoHobby.setToolTipText("Copiar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoHobby.setToolTipText("Ver"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoHobby.setToolTipText("Nuevo Rel"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.setToolTipText("Guardar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoHobby.setToolTipText("Salir"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoHobby";
		inputMap = this.jButtonNuevoEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoHobby"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoHobby";
		inputMap = this.jButtonDuplicarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoHobby"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoHobby";
		inputMap = this.jButtonCopiarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoHobby"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoHobby";
		inputMap = this.jButtonVerFormEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoHobby"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoHobby";
		inputMap = this.jButtonNuevoRelacionesEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoHobby"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoHobby";
		inputMap = this.jButtonModificarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoHobby"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoHobby";
		inputMap = this.jButtonCerrarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoHobby"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoHobby";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoHobby"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoHobby.setName("jPanelParametrosReportesEmpleadoHobby"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoHobby.setName("jPanelParametrosReportesAccionesEmpleadoHobby"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoHobby = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoHobby.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoHobby.setToolTipText("Recargar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoHobby,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoHobby = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoHobby.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoHobby.setToolTipText("Procesar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoHobby.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoHobby.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoHobby.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoHobby.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHobby.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoHobby.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHobby.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoHobby.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHobby.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoHobby.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoHobby.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoHobby.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoHobby.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoHobby.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoHobby.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoHobby.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoHobby.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoHobby.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoHobby=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoHobby.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoHobby.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoHobby.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoHobby = new JLabelMe();
		
		this.jLabelAccionesEmpleadoHobby.setText("Acciones");		
		this.jLabelAccionesEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoHobby = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoHobby.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoHobby.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoHobby = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoHobby.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoHobby.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoHobby = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoHobby = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoHobby.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoHobby.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoHobby = new JButtonMe();
		//this.jButtonAnterioresEmpleadoHobby.setText("<<");
        this.jButtonAnterioresEmpleadoHobby.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoHobby,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoHobby = new JButtonMe();
		//this.jButtonSiguientesEmpleadoHobby.setText(">>");
        this.jButtonSiguientesEmpleadoHobby.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoHobby,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoHobby = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoHobby.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoHobby.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoHobby,"nuevoguardarcambios_button","Nue",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoHobby";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoHobby"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoHobby";
		inputMap = this.jButtonRecargarInformacionEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoHobby"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoHobby";
		inputMap = this.jButtonSiguientesEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoHobby"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoHobby";
		inputMap = this.jButtonAnterioresEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoHobby"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoHobby();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoHobby.setMinimumSize(new Dimension(this.getWidth(),EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoHobby.setMaximumSize(new Dimension(this.getWidth(),EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoHobby.setPreferredSize(new Dimension(this.getWidth(),EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHobbyBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoHobby = new GridBagLayout();

			this.jPanelPaginacionEmpleadoHobby.setLayout(gridaBagLayoutPaginacionEmpleadoHobby);						
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 0;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonAnterioresEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					
						
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoHobby.gridy = 0;
			
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonNuevoGuardarCambiosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
						
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoHobby.gridy = 0;
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonSiguientesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 1;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonNuevoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
						
			
			
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoHobby.gridy = 1;
				this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoHobby.add(this.jButtonGuardarCambiosTablaEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			}
			
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 1;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonDuplicarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 1;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonCopiarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 1;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonVerFormEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 1;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoHobby.add(this.jButtonCerrarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
		
		
		this.jButtonRecargarInformacionEmpleadoHobby.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoHobby.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoHobby.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoHobby.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoHobby.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoHobby.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoHobby.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoHobby.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoHobby.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoHobby.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoHobby.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoHobby.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoHobby.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoHobby.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoHobby.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoHobby.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoHobby.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoHobby.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoHobby.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoHobby.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoHobby.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoHobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoHobby = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoHobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoHobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoHobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoHobby = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoHobby.setLayout(gridaBagParametrosReportesEmpleadoHobby);
			this.jPanelParametrosReportesAccionesEmpleadoHobby.setLayout(gridaBagParametrosReportesAccionesEmpleadoHobby);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoHobby.setLayout(gridaBagParametrosAuxiliar1EmpleadoHobby);
			this.jPanelParametrosAuxiliar2EmpleadoHobby.setLayout(gridaBagParametrosAuxiliar2EmpleadoHobby);
			this.jPanelParametrosAuxiliar3EmpleadoHobby.setLayout(gridaBagParametrosAuxiliar3EmpleadoHobby);
			this.jPanelParametrosAuxiliar4EmpleadoHobby.setLayout(gridaBagParametrosAuxiliar4EmpleadoHobby);
			//this.jPanelParametrosAuxiliar5EmpleadoHobby.setLayout(gridaBagParametrosAuxiliar2EmpleadoHobby);			
			
			
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jButtonRecargarInformacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHobby.add(this.jComboBoxTiposPaginacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHobby.add(this.jCheckBoxConAltoMaximoTablaEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHobby.add(this.jComboBoxTiposArchivosReportesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jPanelParametrosAuxiliar1EmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoHobby.add(this.jComboBoxTiposReportesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jPanelParametrosAuxiliar4EmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jComboBoxTiposReportesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jCheckBoxGenerarReporteEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jPanelParametrosAuxiliar2EmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jLabelAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoHobby.add(this.jButtonAbrirOrderByEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jComboBoxTiposSeleccionarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			
			
			/*
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jCheckBoxSeleccionarTodosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoHobby.add(this.jCheckBoxSeleccionarTodosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);															
				
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoHobby.add(this.jCheckBoxSeleccionadosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jPanelParametrosAuxiliar3EmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jComboBoxTiposAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
	
				
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHobby.add(this.jTextFieldValorCampoGeneralEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoHobby = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoHobby.setLayout(gridaBagLayoutDatosEmpleadoHobby);
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = 0;
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoHobby.add(this.jTableDatosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoHobby.setViewportView(this.jTableDatosEmpleadoHobby);
		this.jTableDatosEmpleadoHobby.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoHobby.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoHobby= new GridBagLayout();
		this.jPanelAccionesEmpleadoHobby.setLayout(gridaBagLayoutAccionesEmpleadoHobby);
		
		
		/*	
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
			
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonNuevoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoHobby= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoHobby.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHobby.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHobby.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHobby.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoHobby.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 0;
		gridBagConstraintsEmpleadoHobby.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoHobby.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 0;
		gridBagConstraintsEmpleadoHobby.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoHobby.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby, gridBagConstraintsEmpleadoHobby);


		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoHobby.gridy = 0;
		gridBagConstraintsEmpleadoHobby.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoHobby.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 1;
		gridBagConstraintsEmpleadoHobby.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoHobby.add(jButtonFK_IdEmpleadoEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		jTabbedPaneBusquedasEmpleadoHobby.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoHobby);
		jTabbedPaneBusquedasEmpleadoHobby.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdHobbyEmpleadoHobby= new GridBagLayout();
		gridaBagLayoutFK_IdHobbyEmpleadoHobby.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdHobbyEmpleadoHobby.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdHobbyEmpleadoHobby.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdHobbyEmpleadoHobby.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdHobbyEmpleadoHobby.setLayout(gridaBagLayoutFK_IdHobbyEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 0;
		gridBagConstraintsEmpleadoHobby.gridx = 0;
		jPanelFK_IdHobbyEmpleadoHobby.add(jLabelid_hobbyFK_IdHobbyEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 0;
		gridBagConstraintsEmpleadoHobby.gridx = 1;
		jPanelFK_IdHobbyEmpleadoHobby.add(jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHobby.gridy = 1;
		gridBagConstraintsEmpleadoHobby.gridx =1;
		jPanelFK_IdHobbyEmpleadoHobby.add(jButtonFK_IdHobbyEmpleadoHobby, gridBagConstraintsEmpleadoHobby);

		jTabbedPaneBusquedasEmpleadoHobby.addTab("2.-Por Hobby ", jPanelFK_IdHobbyEmpleadoHobby);
		jTabbedPaneBusquedasEmpleadoHobby.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoHobby = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoHobby);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;		
			//this.gridBagConstraintsEmpleadoHobby.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoHobby.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;		
		//this.gridBagConstraintsEmpleadoHobby.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoHobby);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;		
			this.gridBagConstraintsEmpleadoHobby.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoHobby.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);								
		
		
		/*
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		*/		
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHobby.gridx =0;
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoHobby.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
				
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoHobby = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoHobby.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoHobby);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoHobby=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoHobby;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoHobby() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoHobby = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoHobby.setName("jPanelReporteDinamicoEmpleadoHobby"); 
		
		this.jPanelReporteDinamicoEmpleadoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoHobby.setLayout(gridaBagLayoutReporteDinamicoEmpleadoHobby);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoHobby= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoHobby = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoHobby= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoHobby.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoHobby.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoHobby.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoHobby.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoHobby.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoHobby = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoHobby.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jLabelColumnasSelectReporteEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoHobby = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoHobby.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoHobby=new JScrollPane(this.jListColumnasSelectReporteEmpleadoHobby);
			
			this.jScrollColumnasSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoHobby.add(this.jListColumnasSelectReporteEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jScrollColumnasSelectReporteEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoHobby = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoHobby.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoHobby = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoHobby.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoHobby=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoHobby);
			
			this.jScrollRelacionesSelectReporteEmpleadoHobby.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoHobby.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoHobby.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoHobby = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoHobby = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoHobby = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoHobby = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoHobby.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby.setToolTipText("Generar EXCEL"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoHobby.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jComboBoxTiposReportesDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoHobby = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoHobby.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoHobby,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoHobby.setToolTipText("Generar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jButtonGenerarReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoHobby = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoHobby.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoHobby,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoHobby.setToolTipText("Cancelar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHobby.add(this.jButtonCerrarReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoHobby = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoHobby= new JScrollPane(jPanelReporteDinamicoEmpleadoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoHobby.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoHobby);
		this.jInternalFrameReporteDinamicoEmpleadoHobby.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoHobby() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoHobby = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoHobby.setName("jPanelImportacionEmpleadoHobby"); 
		
		this.jPanelImportacionEmpleadoHobby.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoHobby.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoHobby.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoHobby.setLayout(gridaBagLayoutImportacionEmpleadoHobby);
		
		
		this.jInternalFrameImportacionEmpleadoHobby= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoHobby= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoHobby = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoHobby= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoHobby.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoHobby.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoHobby.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoHobby.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoHobby.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoHobby.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoHobby.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoHobby.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoHobby.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoHobby.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoHobby.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoHobby.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoHobby.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoHobby = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoHobby.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoHobby.add(this.jLabelArchivoImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoHobby = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoHobby.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoHobby = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoHobby.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoHobby,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoHobby.setToolTipText("Generar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHobby.add(this.jButtonAbrirImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoHobby = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoHobby.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoHobby.add(this.jLabelPathArchivoImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoHobby=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoHobby.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoHobby.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoHobby.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHobby.add(this.jTextFieldPathArchivoImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoHobby = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoHobby.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoHobby,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoHobby.setToolTipText("Generar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHobby.add(this.jButtonGenerarImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoHobby = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoHobby.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoHobby,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoHobby.setToolTipText("Cancelar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHobby.add(this.jButtonCerrarImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoHobby = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoHobby= new JScrollPane(jPanelImportacionEmpleadoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoHobby.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoHobby.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoHobby);
		this.jInternalFrameImportacionEmpleadoHobby.getContentPane().add(this.jScrollPanelImportacionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoHobby(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoHobby = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoHobby.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoHobby.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoHobby,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoHobby";
			inputMap = this.jButtonAbrirOrderByEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoHobby"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoHobby = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoHobby.setName("jPanelOrderByEmpleadoHobby"); 
			
			this.jPanelOrderByEmpleadoHobby.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoHobby.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoHobby.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoHobby.setLayout(gridaBagLayoutOrderByEmpleadoHobby);
			
			
			this.jTableDatosEmpleadoHobbyOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoHobbyOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoHobbyOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoHobbyOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoHobbyOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoHobbyOrderBy.setViewportView(this.jTableDatosEmpleadoHobbyOrderBy);
			this.jTableDatosEmpleadoHobbyOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoHobbyOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoHobby= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoHobby= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoHobby = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoHobby= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoHobby.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoHobby.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoHobby.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoHobby.setResizable(true);
			this.jInternalFrameOrderByEmpleadoHobby.setClosable(true);
			this.jInternalFrameOrderByEmpleadoHobby.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoHobby.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoHobby.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoHobby.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoHobby.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoHobby.ipady =150;
				
			this.jPanelOrderByEmpleadoHobby.add(jScrollPanelDatosEmpleadoHobbyOrderBy, this.gridBagConstraintsEmpleadoHobby);//this.jTableDatosEmpleadoHobbyTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoHobby = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoHobby.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoHobby,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoHobby.setToolTipText("Cancelar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoHobby.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoHobby.add(this.jButtonCerrarOrderByEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoHobby = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoHobby= new JScrollPane(jPanelOrderByEmpleadoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoHobby.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoHobby.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoHobby);
			
			this.jInternalFrameOrderByEmpleadoHobby.getContentPane().add(this.jScrollPanelOrderByEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoHobby = new JButtonMe();
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
			&& this.empleadohobbySessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoHobby.getRowHeight();//EmpleadoHobbyConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.isSelected()) {
					iHeightTable=EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoHobby.isSelected()) {
					iHeightTable=EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoHobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoHobby.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoHobby.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoHobby.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoHobby.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoHobby.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoHobby.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoHobby!=null && this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoHobby.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoHobby.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoHobby.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoHobby.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoHobby.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoHobby.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadohobbyLogic.getEmpleadoHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadohobbys.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoHobby> TraerEmpleadoHobbyBeans(List<EmpleadoHobby> empleadohobbys,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoHobby empleadohobby:empleadohobbys) {
					
				if(!(EmpleadoHobbyConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoHobbyConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadohobby.setsDetalleGeneralEntityReporte(EmpleadoHobbyConstantesFunciones.getEmpleadoHobbyDescripcion(empleadohobby));
										
						
					
						
					
				} else  {
							
					//empleadohobby.setsDetalleGeneralEntityReporte(empleadohobby.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadohobbybeans.add(empleadohobbybean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadohobbys;
    }
	//PARA REPORTES FIN
}
