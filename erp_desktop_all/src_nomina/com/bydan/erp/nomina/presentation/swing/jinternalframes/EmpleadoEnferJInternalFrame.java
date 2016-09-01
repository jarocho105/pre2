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
import com.bydan.erp.nomina.util.EmpleadoEnferConstantesFunciones;

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
public class EmpleadoEnferJInternalFrame extends EmpleadoEnferBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoEnfer;
	
	protected JMenuBar jmenuBarEmpleadoEnfer;
	
	protected JMenu jmenuEmpleadoEnfer;
	protected JMenu jmenuDatosEmpleadoEnfer;
	protected JMenu jmenuArchivoEmpleadoEnfer;
	protected JMenu jmenuAccionesEmpleadoEnfer;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEnfer;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEnfer;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoEnferDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoEnfer;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoEnfer;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoEnfer;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_enfermedad="";
	
	public EmpleadoEnferSessionBean empleadoenferSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EnfermedadSessionBean enfermedadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoEnfer> empleadoenfers;		
	public List<EmpleadoEnfer> empleadoenfersEliminados;	
	public List<EmpleadoEnfer> empleadoenfersAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoEnfer;		
	protected JButton jButtonAbrirOrderByEmpleadoEnfer;
	
	
	//protected JPanel jPanelOrderByEmpleadoEnfer;
	//public JScrollPane jScrollPanelOrderByEmpleadoEnfer;	
	//protected JButton jButtonCerrarOrderByEmpleadoEnfer;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoEnferLogic empleadoenferLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoEnfer;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEnfer;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEnfer;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoEnferOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoEnfer;
	//public JScrollPane jScrollPanelImportacionEmpleadoEnfer;
	
	
	
	protected JPanel jPanelAccionesEmpleadoEnfer;
	
    protected JPanel jPanelPaginacionEmpleadoEnfer;
    protected JPanel jPanelParametrosReportesEmpleadoEnfer;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoEnfer;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoEnfer;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoEnfer;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoEnfer;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoEnfer;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoEnfer;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoEnfer;
	//protected JPanel jPanelImportacionEmpleadoEnfer;
	
	
	public JTable jTableDatosEmpleadoEnfer;
	
	
	
	//public JTable jTableDatosEmpleadoEnferOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoEnfer;
	protected JButton jButtonDuplicarEmpleadoEnfer;
	protected JButton jButtonCopiarEmpleadoEnfer;
	protected JButton jButtonVerFormEmpleadoEnfer;
	protected JButton jButtonNuevoRelacionesEmpleadoEnfer;
	protected JButton jButtonModificarEmpleadoEnfer;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoEnfer;
	protected JButton jButtonCerrarEmpleadoEnfer;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoEnfer;
	protected JButton jButtonProcesarInformacionEmpleadoEnfer;
	
	
	protected JButton jButtonAnterioresEmpleadoEnfer;
	protected JButton jButtonSiguientesEmpleadoEnfer;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoEnfer;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoEnfer;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoEnfer;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoEnfer;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoEnfer;
	//protected JButton jButtonGenerarImportacionEmpleadoEnfer;
	//protected JButton jButtonCerrarImportacionEmpleadoEnfer;
	//protected JFileChooser jFileChooserImportacionEmpleadoEnfer;
	//protected File fileImportacionEmpleadoEnfer;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEnfer;
	protected JButton jButtonDuplicarToolBarEmpleadoEnfer;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoEnfer;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoEnfer;
	protected JButton jButtonCopiarToolBarEmpleadoEnfer;
	protected JButton jButtonVerFormToolBarEmpleadoEnfer;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoEnfer;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEnfer;
	protected JButton jButtonCerrarToolBarEmpleadoEnfer;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoEnfer;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEnfer;
	protected JButton jButtonAnterioresToolBarEmpleadoEnfer;
	protected JButton jButtonSiguientesToolBarEmpleadoEnfer;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoEnfer;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEnfer;
	protected JMenuItem jMenuItemDuplicarEmpleadoEnfer;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoEnfer;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoEnfer;
	protected JMenuItem jMenuItemCopiarEmpleadoEnfer;
	protected JMenuItem jMenuItemVerFormEmpleadoEnfer;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEnfer;
	protected JMenuItem jMenuItemCerrarEmpleadoEnfer;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEnfer;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoEnfer;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEnfer;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoEnfer;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEnfer;
	protected JMenuItem jMenuItemAnterioresEmpleadoEnfer;
	protected JMenuItem jMenuItemSiguientesEmpleadoEnfer;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEnfer;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoEnfer;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEnfer;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEnfer;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoEnfer;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoEnfer;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoEnfer;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoEnfer;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoEnfer;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoEnfer;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoEnfer;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoEnfer;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoEnfer;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoEnfer;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoEnfer;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoEnfer;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoEnfer;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEnfer;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoEnfer;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoEnfer;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoEnfer;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoEnfer;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoEnfer;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoEnfer;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoEnfer;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoEnfer;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoEnfer;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoEnfer;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoEnfer;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoEnfer;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoEnfer;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoEnfer;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoEnfer;
	public JPanel jPanelFK_IdEmpleadoEmpleadoEnfer;
	public JButton jButtonFK_IdEmpleadoEmpleadoEnfer;
	public JPanel jPanelFK_IdEnfermedadEmpleadoEnfer;
	public JButton jButtonFK_IdEnfermedadEmpleadoEnfer;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoEnfer;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEnfer= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEnferUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEnferBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer;
	
	public JPanel jPanelid_enfermedadFK_IdEnfermedadEmpleadoEnfer;
	public JLabel jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer;
	public JButton jButtonid_enfermedadFK_IdEnfermedadEmpleadoEnfer= new JButtonMe();
	public JButton jButtonid_enfermedadFK_IdEnfermedadEmpleadoEnferUpdate= new JButtonMe();
	public JButton jButtonid_enfermedadFK_IdEnfermedadEmpleadoEnferBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoEnferJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoEnfer)	{
		this.jButtonRecargarInformacionEmpleadoEnfer = jButtonRecargarInformacionEmpleadoEnfer;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoEnfer() {
		return this.jButtonProcesarInformacionEmpleadoEnfer;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEnfer)	{
		this.jButtonProcesarInformacionEmpleadoEnfer = jButtonProcesarInformacionEmpleadoEnfer;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoEnfer() {
		return this.jButtonRecargarInformacionEmpleadoEnfer;
	}
	
	
	public List<EmpleadoEnfer> getempleadoenfers() {
		return this.empleadoenfers;
	}

	public void setempleadoenfers(List<EmpleadoEnfer> empleadoenfers) {
		this.empleadoenfers = empleadoenfers;
	}
	
	public List<EmpleadoEnfer> getempleadoenfersAux() {
		return this.empleadoenfersAux;
	}

	public void setempleadoenfersAux(List<EmpleadoEnfer> empleadoenfersAux) {
		this.empleadoenfersAux = empleadoenfersAux;
	}
	
	public List<EmpleadoEnfer> getempleadoenfersEliminados() {
		return this.empleadoenfersEliminados;
	}

	public void setEmpleadoEnfersEliminados(List<EmpleadoEnfer> empleadoenfersEliminados) {
		this.empleadoenfersEliminados = empleadoenfersEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoEnfer() {
		return jComboBoxTiposSeleccionarEmpleadoEnfer;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoEnfer(
			JComboBox jComboBoxTiposSeleccionarEmpleadoEnfer) {
		this.jComboBoxTiposSeleccionarEmpleadoEnfer = jComboBoxTiposSeleccionarEmpleadoEnfer;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoEnfer() {
		return jTextFieldValorCampoGeneralEmpleadoEnfer;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoEnfer(
			JTextField jTextFieldValorCampoGeneralEmpleadoEnfer) {
		this.jTextFieldValorCampoGeneralEmpleadoEnfer = jTextFieldValorCampoGeneralEmpleadoEnfer;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoEnfer .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoEnfer() {
		return this.jCheckBoxSeleccionarTodosEmpleadoEnfer;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoEnfer(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoEnfer) {
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer = jCheckBoxSeleccionarTodosEmpleadoEnfer;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoEnfer() {
		return this.jCheckBoxSeleccionadosEmpleadoEnfer;
	}

	public void setjCheckBoxSeleccionadosEmpleadoEnfer(
			JCheckBox jCheckBoxSeleccionadosEmpleadoEnfer) {
		this.jCheckBoxSeleccionadosEmpleadoEnfer = jCheckBoxSeleccionadosEmpleadoEnfer;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoEnfer() {
		return this.jComboBoxTiposArchivosReportesEmpleadoEnfer;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoEnfer(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoEnfer) {
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer = jComboBoxTiposArchivosReportesEmpleadoEnfer;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoEnfer() {
		return this.jComboBoxTiposReportesEmpleadoEnfer;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoEnfer(
			JComboBox jComboBoxTiposReportesEmpleadoEnfer) {
		this.jComboBoxTiposReportesEmpleadoEnfer = jComboBoxTiposReportesEmpleadoEnfer;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoEnfer() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoEnfer;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoEnfer(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoEnfer) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoEnfer = jComboBoxTiposReportesDinamicoEmpleadoEnfer;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer = jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoEnfer() {
		return this.jComboBoxTiposGraficosReportesEmpleadoEnfer;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoEnfer(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoEnfer) {
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer = jComboBoxTiposGraficosReportesEmpleadoEnfer;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoEnfer() {
		return this.jComboBoxTiposPaginacionEmpleadoEnfer;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoEnfer(
			JComboBox jComboBoxTiposPaginacionEmpleadoEnfer) {
		this.jComboBoxTiposPaginacionEmpleadoEnfer = jComboBoxTiposPaginacionEmpleadoEnfer;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoEnfer() {
		return this.jComboBoxTiposRelacionesEmpleadoEnfer;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEnfer() {
		return this.jComboBoxTiposAccionesEmpleadoEnfer;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEnfer(
			JComboBox jComboBoxTiposRelacionesEmpleadoEnfer) {
		this.jComboBoxTiposRelacionesEmpleadoEnfer = jComboBoxTiposRelacionesEmpleadoEnfer;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEnfer(
			JComboBox jComboBoxTiposAccionesEmpleadoEnfer) {
		this.jComboBoxTiposAccionesEmpleadoEnfer = jComboBoxTiposAccionesEmpleadoEnfer;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoEnfer() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoEnfer .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoEnfer() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoEnfer;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoEnfer(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEnfer) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEnfer = jCheckBoxConGraficoDinamicoEmpleadoEnfer;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoEnfer() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoEnfer.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEnfer .setBorder(borderResaltar);		
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
		this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		
		this.empleadoenferSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoenferSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoenferSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEnferJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Enfer MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoEnfer= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"copiar","copiar","Copiar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"ver_form","ver_form","Ver"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"recargar","recargar","Recargar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,
							"cerrar","cerrar","Salir"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoEnfer=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoEnfer;
			
				this.jButtonProcesarInformacionToolBarEmpleadoEnfer=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoEnfer;
				
		//protected JButton jButtonModificarToolBarEmpleadoEnfer;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoEnfer=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoEnfer=new JMenuMe("General");
		this.jmenuArchivoEmpleadoEnfer=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoEnfer=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoEnfer=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEnfer= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEnfer.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEnfer,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoEnfer= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoEnfer.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoEnfer,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoEnfer= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoEnfer.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoEnfer,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoEnfer= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEnfer.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEnfer,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoEnfer= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoEnfer.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoEnfer,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoEnfer= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoEnfer.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoEnfer,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEnfer= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoEnfer.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoEnfer,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEnfer= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEnfer.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEnfer,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoEnfer= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoEnfer.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoEnfer,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoEnfer= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoEnfer.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoEnfer,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoEnfer= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoEnfer.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoEnfer,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoEnfer= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoEnfer.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoEnfer,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoEnfer= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoEnfer.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoEnfer,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEnfer= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEnfer.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEnfer,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEnfer= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEnfer.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEnfer,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoEnfer.add(this.jMenuItemCerrarEmpleadoEnfer);
			
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemNuevoEmpleadoEnfer);
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer);
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemNuevoRelacionesEmpleadoEnfer);
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemGuardarCambiosTablaEmpleadoEnfer);		
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemDuplicarEmpleadoEnfer);		
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemCopiarEmpleadoEnfer);		
			this.jmenuAccionesEmpleadoEnfer.add(this.jMenuItemVerFormEmpleadoEnfer);		
			
			this.jmenuDatosEmpleadoEnfer.add(this.jMenuItemRecargarInformacionEmpleadoEnfer);				
			this.jmenuDatosEmpleadoEnfer.add(this.jMenuItemAnterioresEmpleadoEnfer);				
			this.jmenuDatosEmpleadoEnfer.add(this.jMenuItemSiguientesEmpleadoEnfer);				
			this.jmenuDatosEmpleadoEnfer.add(this.jMenuItemAbrirOrderByEmpleadoEnfer);				
			this.jmenuDatosEmpleadoEnfer.add(this.jMenuItemMostrarOcultarEmpleadoEnfer);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoEnfer.add(this.jMenuItemGuardarCambiosEmpleadoEnfer);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoEnfer.add(this.jmenuArchivoEmpleadoEnfer);		
			this.jmenuBarEmpleadoEnfer.add(this.jmenuAccionesEmpleadoEnfer);		
			this.jmenuBarEmpleadoEnfer.add(this.jmenuDatosEmpleadoEnfer);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoEnfer);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoEnfer() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoEnfer.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoEnfer= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoEnfer.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoEnfer.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoEnfer,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.setFocusable(false);

		this.jPanelFK_IdEnfermedadEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEnfermedadEmpleadoEnfer.setToolTipText("Buscar Por Enfermedad ");
		this.jButtonFK_IdEnfermedadEmpleadoEnfer= new JButtonMe();
		this.jButtonFK_IdEnfermedadEmpleadoEnfer.setText("Buscar");
		this.jButtonFK_IdEnfermedadEmpleadoEnfer.setToolTipText("Buscar Por Enfermedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEnfermedadEmpleadoEnfer,"buscar_button","Buscar Por Enfermedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEnfermedadEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer = new JLabelMe();
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setText("Enfermedad :");
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setToolTipText("Enfermedad");
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer= new JComboBoxMe();
		jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoEnfer=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoEnfer.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEnfer.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEnfer.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoEnfer.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoEnfer = new EmpleadoEnferDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Enfer DATOS");
			this.jInternalFrameDetalleFormEmpleadoEnfer = new EmpleadoEnferDetalleFormJInternalFrame(jDesktopPane,this.empleadoenferSessionBean.getConGuardarRelaciones(),this.empleadoenferSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoEnfer = null;//new EmpleadoEnferDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEnfer= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoEnfer = new JTableMe();      
		
		String sToolTipEmpleadoEnfer="";
		sToolTipEmpleadoEnfer=EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEnfer+="(Nomina.EmpleadoEnfer)";
		}
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEnfer+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoEnfer.setToolTipText(sToolTipEmpleadoEnfer);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoEnfer);
		this.jTableDatosEmpleadoEnfer.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoEnfer.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoEnfer.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoEnfer.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoEnfer = new JButtonMe();
		this.jButtonDuplicarEmpleadoEnfer = new JButtonMe();
		this.jButtonCopiarEmpleadoEnfer = new JButtonMe();
		this.jButtonVerFormEmpleadoEnfer = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoEnfer = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer = new JButtonMe();
		this.jButtonCerrarEmpleadoEnfer = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEnfer = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoEnfer = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Enfer";
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEnfer.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEnfer.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEnfer.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoEnfer=new ReporteDinamicoJInternalFrame(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoEnfer();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoEnfer=new ImportacionJInternalFrame(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoEnfer();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoEnfer = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoEnfer.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoEnfer.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEnfer,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEnfer=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEnfer,false,this);
			
			//this.cargarOrderByEmpleadoEnfer(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEnfer=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEnfer,true,this);
			
			//this.cargarOrderByEmpleadoEnfer(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoEnfer.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEmpleadoEnfer.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEmpleadoEnfer.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEmpleadoEnfer.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEnfer.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEnfer.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoEnfer.setText("Nuevo");
		this.jButtonDuplicarEmpleadoEnfer.setText("Duplicar");
		this.jButtonCopiarEmpleadoEnfer.setText("Copiar");
		this.jButtonVerFormEmpleadoEnfer.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoEnfer.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.setText("Guardar");
		this.jButtonCerrarEmpleadoEnfer.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEnfer,"nuevo_button","Nuevo",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoEnfer,"duplicar_button","Duplicar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoEnfer,"copiar_button","Copiar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoEnfer,"ver_form","Ver",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoEnfer,"nuevorelaciones_button","Nuevo Rel",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEnfer,"guardarcambiostabla_button","Guardar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEnfer,"cerrar_button","Salir",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoEnfer.setToolTipText("Nuevo"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoEnfer.setToolTipText("Duplicar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoEnfer.setToolTipText("Copiar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoEnfer.setToolTipText("Ver"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoEnfer.setToolTipText("Nuevo Rel"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.setToolTipText("Guardar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEnfer.setToolTipText("Salir"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEnfer";
		inputMap = this.jButtonNuevoEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEnfer.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEnfer"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoEnfer";
		inputMap = this.jButtonDuplicarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoEnfer.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoEnfer"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoEnfer";
		inputMap = this.jButtonCopiarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoEnfer.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoEnfer"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoEnfer";
		inputMap = this.jButtonVerFormEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoEnfer.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoEnfer"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoEnfer";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoEnfer"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoEnfer";
		inputMap = this.jButtonModificarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoEnfer"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEnfer";
		inputMap = this.jButtonCerrarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEnfer"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEnfer";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEnfer"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoEnfer.setName("jPanelParametrosReportesEmpleadoEnfer"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoEnfer.setName("jPanelParametrosReportesAccionesEmpleadoEnfer"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoEnfer = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoEnfer.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoEnfer.setToolTipText("Recargar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoEnfer,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoEnfer = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoEnfer.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoEnfer.setToolTipText("Procesar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoEnfer.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoEnfer.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEnfer.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEnfer.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoEnfer.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoEnfer.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoEnfer.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoEnfer.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoEnfer.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEnfer.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEnfer.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoEnfer.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoEnfer=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoEnfer.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEnfer.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEnfer.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoEnfer = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEnfer.setText("Acciones");		
		this.jLabelAccionesEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoEnfer = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoEnfer.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoEnfer.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoEnfer = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoEnfer.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoEnfer.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoEnfer = new JButtonMe();
		//this.jButtonAnterioresEmpleadoEnfer.setText("<<");
        this.jButtonAnterioresEmpleadoEnfer.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoEnfer,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoEnfer = new JButtonMe();
		//this.jButtonSiguientesEmpleadoEnfer.setText(">>");
        this.jButtonSiguientesEmpleadoEnfer.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoEnfer,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEnfer = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoEnfer.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoEnfer.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoEnfer,"nuevoguardarcambios_button","Nue",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoEnfer";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoEnfer"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoEnfer";
		inputMap = this.jButtonRecargarInformacionEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoEnfer"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoEnfer";
		inputMap = this.jButtonSiguientesEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoEnfer"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoEnfer";
		inputMap = this.jButtonAnterioresEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoEnfer"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoEnfer();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoEnfer.setMinimumSize(new Dimension(this.getWidth(),EmpleadoEnferBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEnferBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEnfer.setMaximumSize(new Dimension(this.getWidth(),EmpleadoEnferBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEnferBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEnfer.setPreferredSize(new Dimension(this.getWidth(),EmpleadoEnferBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEnferBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoEnfer = new GridBagLayout();

			this.jPanelPaginacionEmpleadoEnfer.setLayout(gridaBagLayoutPaginacionEmpleadoEnfer);						
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonAnterioresEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					
						
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
			
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonNuevoGuardarCambiosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
						
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonSiguientesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonNuevoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
						
			
			
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
				this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonGuardarCambiosTablaEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			}
			
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonDuplicarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonCopiarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonVerFormEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 1;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoEnfer.add(this.jButtonCerrarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
		
		
		this.jButtonRecargarInformacionEmpleadoEnfer.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEnfer.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEnfer.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEnfer.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoEnfer.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEnfer.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEnfer.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEnfer.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoEnfer.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEnfer.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEnfer.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoEnfer.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEnfer.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEnfer.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoEnfer.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEnfer.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEnfer.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoEnfer.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEnfer.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEnfer.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoEnfer.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEnfer.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEnfer.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoEnfer = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoEnfer = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoEnfer = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoEnfer = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoEnfer = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoEnfer = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoEnfer.setLayout(gridaBagParametrosReportesEmpleadoEnfer);
			this.jPanelParametrosReportesAccionesEmpleadoEnfer.setLayout(gridaBagParametrosReportesAccionesEmpleadoEnfer);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoEnfer.setLayout(gridaBagParametrosAuxiliar1EmpleadoEnfer);
			this.jPanelParametrosAuxiliar2EmpleadoEnfer.setLayout(gridaBagParametrosAuxiliar2EmpleadoEnfer);
			this.jPanelParametrosAuxiliar3EmpleadoEnfer.setLayout(gridaBagParametrosAuxiliar3EmpleadoEnfer);
			this.jPanelParametrosAuxiliar4EmpleadoEnfer.setLayout(gridaBagParametrosAuxiliar4EmpleadoEnfer);
			//this.jPanelParametrosAuxiliar5EmpleadoEnfer.setLayout(gridaBagParametrosAuxiliar2EmpleadoEnfer);			
			
			
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jButtonRecargarInformacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEnfer.add(this.jComboBoxTiposPaginacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEnfer.add(this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEnfer.add(this.jComboBoxTiposArchivosReportesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jPanelParametrosAuxiliar1EmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoEnfer.add(this.jComboBoxTiposReportesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jPanelParametrosAuxiliar4EmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jComboBoxTiposReportesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jCheckBoxGenerarReporteEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jPanelParametrosAuxiliar2EmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jLabelAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoEnfer.add(this.jButtonAbrirOrderByEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jComboBoxTiposSeleccionarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			
			
			/*
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jCheckBoxSeleccionarTodosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEnfer.add(this.jCheckBoxSeleccionarTodosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);															
				
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEnfer.add(this.jCheckBoxSeleccionadosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jPanelParametrosAuxiliar3EmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jComboBoxTiposAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
	
				
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEnfer.add(this.jTextFieldValorCampoGeneralEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoEnfer = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoEnfer.setLayout(gridaBagLayoutDatosEmpleadoEnfer);
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoEnfer.add(this.jTableDatosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoEnfer.setViewportView(this.jTableDatosEmpleadoEnfer);
		this.jTableDatosEmpleadoEnfer.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoEnfer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEnfer= new GridBagLayout();
		this.jPanelAccionesEmpleadoEnfer.setLayout(gridaBagLayoutAccionesEmpleadoEnfer);
		
		
		/*	
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
			
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonNuevoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoEnfer.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 0;
		gridBagConstraintsEmpleadoEnfer.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEnfer.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 0;
		gridBagConstraintsEmpleadoEnfer.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoEnfer.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);


		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoEnfer.gridy = 0;
		gridBagConstraintsEmpleadoEnfer.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEnfer.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 1;
		gridBagConstraintsEmpleadoEnfer.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoEnfer.add(jButtonFK_IdEmpleadoEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		jTabbedPaneBusquedasEmpleadoEnfer.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoEnfer);
		jTabbedPaneBusquedasEmpleadoEnfer.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer= new GridBagLayout();
		gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEnfermedadEmpleadoEnfer.setLayout(gridaBagLayoutFK_IdEnfermedadEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 0;
		gridBagConstraintsEmpleadoEnfer.gridx = 0;
		jPanelFK_IdEnfermedadEmpleadoEnfer.add(jLabelid_enfermedadFK_IdEnfermedadEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 0;
		gridBagConstraintsEmpleadoEnfer.gridx = 1;
		jPanelFK_IdEnfermedadEmpleadoEnfer.add(jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEnfer.gridy = 1;
		gridBagConstraintsEmpleadoEnfer.gridx =1;
		jPanelFK_IdEnfermedadEmpleadoEnfer.add(jButtonFK_IdEnfermedadEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);

		jTabbedPaneBusquedasEmpleadoEnfer.addTab("2.-Por Enfermedad ", jPanelFK_IdEnfermedadEmpleadoEnfer);
		jTabbedPaneBusquedasEmpleadoEnfer.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEnfer);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEnfer.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEnfer.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;		
		//this.gridBagConstraintsEmpleadoEnfer.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoEnfer);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;		
			this.gridBagConstraintsEmpleadoEnfer.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoEnfer.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);								
		
		
		/*
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		*/		
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEnfer.gridx =0;
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEnfer.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
				
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoEnfer= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEnfer = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoEnfer.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoEnfer);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoEnfer=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoEnfer;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoEnfer() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoEnfer = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoEnfer.setName("jPanelReporteDinamicoEmpleadoEnfer"); 
		
		this.jPanelReporteDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoEnfer.setLayout(gridaBagLayoutReporteDinamicoEmpleadoEnfer);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoEnfer= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoEnfer = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEnfer= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoEnfer.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoEnfer.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoEnfer.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEnfer.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEnfer.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoEnfer = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoEnfer.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jLabelColumnasSelectReporteEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoEnfer = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoEnfer.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoEnfer.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoEnfer=new JScrollPane(this.jListColumnasSelectReporteEmpleadoEnfer);
			
			this.jScrollColumnasSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jListColumnasSelectReporteEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jScrollColumnasSelectReporteEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoEnfer = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoEnfer.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoEnfer = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoEnfer.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoEnfer.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoEnfer=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoEnfer);
			
			this.jScrollRelacionesSelectReporteEmpleadoEnfer.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEnfer.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEnfer.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoEnfer = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoEnfer = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoEnfer = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoEnfer = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoEnfer.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer.setToolTipText("Generar EXCEL"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jComboBoxTiposReportesDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoEnfer = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoEnfer.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoEnfer,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoEnfer.setToolTipText("Generar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jButtonGenerarReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoEnfer = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoEnfer.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoEnfer,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoEnfer.setToolTipText("Cancelar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEnfer.add(this.jButtonCerrarReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoEnfer = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoEnfer= new JScrollPane(jPanelReporteDinamicoEmpleadoEnfer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoEnfer.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEnfer.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEnfer.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoEnfer);
		this.jInternalFrameReporteDinamicoEmpleadoEnfer.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoEnfer() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoEnfer = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoEnfer.setName("jPanelImportacionEmpleadoEnfer"); 
		
		this.jPanelImportacionEmpleadoEnfer.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEnfer.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEnfer.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoEnfer.setLayout(gridaBagLayoutImportacionEmpleadoEnfer);
		
		
		this.jInternalFrameImportacionEmpleadoEnfer= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoEnfer= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoEnfer = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEnfer= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoEnfer.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEnfer.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEnfer.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoEnfer.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEnfer.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEnfer.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEnfer.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEnfer.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoEnfer.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEnfer.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEnfer.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoEnfer.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEnfer.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEnfer.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEnfer.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEnfer.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoEnfer.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEnfer.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEnfer.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoEnfer = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoEnfer.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEnfer.add(this.jLabelArchivoImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoEnfer = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoEnfer.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoEnfer = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoEnfer.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoEnfer,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoEnfer.setToolTipText("Generar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEnfer.add(this.jButtonAbrirImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoEnfer = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoEnfer.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEnfer.add(this.jLabelPathArchivoImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoEnfer=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoEnfer.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEnfer.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEnfer.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEnfer.add(this.jTextFieldPathArchivoImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoEnfer = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoEnfer.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoEnfer,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoEnfer.setToolTipText("Generar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEnfer.add(this.jButtonGenerarImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoEnfer = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoEnfer.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoEnfer,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoEnfer.setToolTipText("Cancelar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEnfer.add(this.jButtonCerrarImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoEnfer = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoEnfer= new JScrollPane(jPanelImportacionEmpleadoEnfer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoEnfer.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoEnfer.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoEnfer);
		this.jInternalFrameImportacionEmpleadoEnfer.getContentPane().add(this.jScrollPanelImportacionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoEnfer(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoEnfer = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoEnfer.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoEnfer.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEnfer,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoEnfer";
			inputMap = this.jButtonAbrirOrderByEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoEnfer"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoEnfer = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoEnfer.setName("jPanelOrderByEmpleadoEnfer"); 
			
			this.jPanelOrderByEmpleadoEnfer.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEnfer.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEnfer.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoEnfer.setLayout(gridaBagLayoutOrderByEmpleadoEnfer);
			
			
			this.jTableDatosEmpleadoEnferOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoEnferOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoEnferOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoEnferOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoEnferOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoEnferOrderBy.setViewportView(this.jTableDatosEmpleadoEnferOrderBy);
			this.jTableDatosEmpleadoEnferOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoEnferOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoEnfer= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoEnfer= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoEnfer = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoEnfer= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoEnfer.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoEnfer.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoEnfer.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoEnfer.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoEnfer.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoEnfer.setResizable(true);
			this.jInternalFrameOrderByEmpleadoEnfer.setClosable(true);
			this.jInternalFrameOrderByEmpleadoEnfer.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoEnfer.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEnfer.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEnfer.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoEnfer.ipady =150;
				
			this.jPanelOrderByEmpleadoEnfer.add(jScrollPanelDatosEmpleadoEnferOrderBy, this.gridBagConstraintsEmpleadoEnfer);//this.jTableDatosEmpleadoEnferTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoEnfer = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoEnfer.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoEnfer,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoEnfer.setToolTipText("Cancelar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoEnfer.add(this.jButtonCerrarOrderByEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoEnfer = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoEnfer= new JScrollPane(jPanelOrderByEmpleadoEnfer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoEnfer.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoEnfer.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoEnfer);
			
			this.jInternalFrameOrderByEmpleadoEnfer.getContentPane().add(this.jScrollPanelOrderByEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoEnfer = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoenferSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoEnfer.getRowHeight();//EmpleadoEnferConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.isSelected()) {
					iHeightTable=EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEnfer.isSelected()) {
					iHeightTable=EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEnferConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoEnfer.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEnfer.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEnfer.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoEnfer.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEnfer.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEnfer.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoEnfer!=null && this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoEnfer.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoEnfer.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoEnfer.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoEnfer.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEnfer.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEnfer.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoenferLogic.getEmpleadoEnfers().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoenfers.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoEnfer> TraerEmpleadoEnferBeans(List<EmpleadoEnfer> empleadoenfers,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoEnfer empleadoenfer:empleadoenfers) {
					
				if(!(EmpleadoEnferConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoEnferConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoenfer.setsDetalleGeneralEntityReporte(EmpleadoEnferConstantesFunciones.getEmpleadoEnferDescripcion(empleadoenfer));
										
						
					
						
					
				} else  {
							
					//empleadoenfer.setsDetalleGeneralEntityReporte(empleadoenfer.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoenferbeans.add(empleadoenferbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoenfers;
    }
	//PARA REPORTES FIN
}
