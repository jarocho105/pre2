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
import com.bydan.erp.nomina.util.EmpleadoHerraConstantesFunciones;

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
public class EmpleadoHerraJInternalFrame extends EmpleadoHerraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoHerra;
	
	protected JMenuBar jmenuBarEmpleadoHerra;
	
	protected JMenu jmenuEmpleadoHerra;
	protected JMenu jmenuDatosEmpleadoHerra;
	protected JMenu jmenuArchivoEmpleadoHerra;
	protected JMenu jmenuAccionesEmpleadoHerra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoHerra;	
	protected GridBagConstraints gridBagConstraintsEmpleadoHerra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoHerraDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoHerra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoHerra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoHerra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected HerramientaBeanSwingJInternalFrame herramientaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_herramienta="";
	
	public EmpleadoHerraSessionBean empleadoherraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public HerramientaSessionBean herramientaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoHerra> empleadoherras;		
	public List<EmpleadoHerra> empleadoherrasEliminados;	
	public List<EmpleadoHerra> empleadoherrasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoHerra;		
	protected JButton jButtonAbrirOrderByEmpleadoHerra;
	
	
	//protected JPanel jPanelOrderByEmpleadoHerra;
	//public JScrollPane jScrollPanelOrderByEmpleadoHerra;	
	//protected JButton jButtonCerrarOrderByEmpleadoHerra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoHerraLogic empleadoherraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoHerra;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoHerra;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoHerra;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoHerraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoHerra;
	//public JScrollPane jScrollPanelImportacionEmpleadoHerra;
	
	
	
	protected JPanel jPanelAccionesEmpleadoHerra;
	
    protected JPanel jPanelPaginacionEmpleadoHerra;
    protected JPanel jPanelParametrosReportesEmpleadoHerra;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoHerra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoHerra;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoHerra;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoHerra;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoHerra;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoHerra;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoHerra;
	//protected JPanel jPanelImportacionEmpleadoHerra;
	
	
	public JTable jTableDatosEmpleadoHerra;
	
	
	
	//public JTable jTableDatosEmpleadoHerraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoHerra;
	protected JButton jButtonDuplicarEmpleadoHerra;
	protected JButton jButtonCopiarEmpleadoHerra;
	protected JButton jButtonVerFormEmpleadoHerra;
	protected JButton jButtonNuevoRelacionesEmpleadoHerra;
	protected JButton jButtonModificarEmpleadoHerra;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoHerra;
	protected JButton jButtonCerrarEmpleadoHerra;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoHerra;
	protected JButton jButtonProcesarInformacionEmpleadoHerra;
	
	
	protected JButton jButtonAnterioresEmpleadoHerra;
	protected JButton jButtonSiguientesEmpleadoHerra;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoHerra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoHerra;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoHerra;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoHerra;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoHerra;
	//protected JButton jButtonGenerarImportacionEmpleadoHerra;
	//protected JButton jButtonCerrarImportacionEmpleadoHerra;
	//protected JFileChooser jFileChooserImportacionEmpleadoHerra;
	//protected File fileImportacionEmpleadoHerra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoHerra;
	protected JButton jButtonDuplicarToolBarEmpleadoHerra;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoHerra;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoHerra;
	protected JButton jButtonCopiarToolBarEmpleadoHerra;
	protected JButton jButtonVerFormToolBarEmpleadoHerra;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoHerra;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoHerra;
	protected JButton jButtonCerrarToolBarEmpleadoHerra;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoHerra;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoHerra;
	protected JButton jButtonAnterioresToolBarEmpleadoHerra;
	protected JButton jButtonSiguientesToolBarEmpleadoHerra;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoHerra;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoHerra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoHerra;
	protected JMenuItem jMenuItemDuplicarEmpleadoHerra;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoHerra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoHerra;
	protected JMenuItem jMenuItemCopiarEmpleadoHerra;
	protected JMenuItem jMenuItemVerFormEmpleadoHerra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoHerra;
	protected JMenuItem jMenuItemCerrarEmpleadoHerra;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoHerra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoHerra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoHerra;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoHerra;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoHerra;
	protected JMenuItem jMenuItemAnterioresEmpleadoHerra;
	protected JMenuItem jMenuItemSiguientesEmpleadoHerra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoHerra;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoHerra;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoHerra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoHerra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoHerra;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoHerra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoHerra;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoHerra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoHerra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoHerra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoHerra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoHerra;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoHerra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoHerra;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoHerra;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoHerra;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoHerra;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoHerra;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoHerra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoHerra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoHerra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoHerra;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoHerra;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoHerra;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoHerra;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoHerra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoHerra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoHerra;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoHerra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoHerra;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoHerra;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoHerra;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoHerra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoHerra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoHerra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoHerra;
	public JPanel jPanelFK_IdEmpleadoEmpleadoHerra;
	public JButton jButtonFK_IdEmpleadoEmpleadoHerra;
	public JPanel jPanelFK_IdHerramientaEmpleadoHerra;
	public JButton jButtonFK_IdHerramientaEmpleadoHerra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoHerra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHerra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHerraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoHerraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra;
	
	public JPanel jPanelid_herramientaFK_IdHerramientaEmpleadoHerra;
	public JLabel jLabelid_herramientaFK_IdHerramientaEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra;
	public JButton jButtonid_herramientaFK_IdHerramientaEmpleadoHerra= new JButtonMe();
	public JButton jButtonid_herramientaFK_IdHerramientaEmpleadoHerraUpdate= new JButtonMe();
	public JButton jButtonid_herramientaFK_IdHerramientaEmpleadoHerraBusqueda= new JButtonMe();

	
	
	
	
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
	public EmpleadoHerraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoHerra)	{
		this.jButtonRecargarInformacionEmpleadoHerra = jButtonRecargarInformacionEmpleadoHerra;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoHerra() {
		return this.jButtonProcesarInformacionEmpleadoHerra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoHerra)	{
		this.jButtonProcesarInformacionEmpleadoHerra = jButtonProcesarInformacionEmpleadoHerra;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoHerra() {
		return this.jButtonRecargarInformacionEmpleadoHerra;
	}
	
	
	public List<EmpleadoHerra> getempleadoherras() {
		return this.empleadoherras;
	}

	public void setempleadoherras(List<EmpleadoHerra> empleadoherras) {
		this.empleadoherras = empleadoherras;
	}
	
	public List<EmpleadoHerra> getempleadoherrasAux() {
		return this.empleadoherrasAux;
	}

	public void setempleadoherrasAux(List<EmpleadoHerra> empleadoherrasAux) {
		this.empleadoherrasAux = empleadoherrasAux;
	}
	
	public List<EmpleadoHerra> getempleadoherrasEliminados() {
		return this.empleadoherrasEliminados;
	}

	public void setEmpleadoHerrasEliminados(List<EmpleadoHerra> empleadoherrasEliminados) {
		this.empleadoherrasEliminados = empleadoherrasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoHerra() {
		return jComboBoxTiposSeleccionarEmpleadoHerra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoHerra(
			JComboBox jComboBoxTiposSeleccionarEmpleadoHerra) {
		this.jComboBoxTiposSeleccionarEmpleadoHerra = jComboBoxTiposSeleccionarEmpleadoHerra;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoHerra() {
		return jTextFieldValorCampoGeneralEmpleadoHerra;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoHerra(
			JTextField jTextFieldValorCampoGeneralEmpleadoHerra) {
		this.jTextFieldValorCampoGeneralEmpleadoHerra = jTextFieldValorCampoGeneralEmpleadoHerra;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoHerra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoHerra() {
		return this.jCheckBoxSeleccionarTodosEmpleadoHerra;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoHerra(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoHerra) {
		this.jCheckBoxSeleccionarTodosEmpleadoHerra = jCheckBoxSeleccionarTodosEmpleadoHerra;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoHerra() {
		return this.jCheckBoxSeleccionadosEmpleadoHerra;
	}

	public void setjCheckBoxSeleccionadosEmpleadoHerra(
			JCheckBox jCheckBoxSeleccionadosEmpleadoHerra) {
		this.jCheckBoxSeleccionadosEmpleadoHerra = jCheckBoxSeleccionadosEmpleadoHerra;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoHerra() {
		return this.jComboBoxTiposArchivosReportesEmpleadoHerra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoHerra(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoHerra) {
		this.jComboBoxTiposArchivosReportesEmpleadoHerra = jComboBoxTiposArchivosReportesEmpleadoHerra;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoHerra() {
		return this.jComboBoxTiposReportesEmpleadoHerra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoHerra(
			JComboBox jComboBoxTiposReportesEmpleadoHerra) {
		this.jComboBoxTiposReportesEmpleadoHerra = jComboBoxTiposReportesEmpleadoHerra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoHerra() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoHerra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoHerra(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoHerra) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoHerra = jComboBoxTiposReportesDinamicoEmpleadoHerra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoHerra() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoHerra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra = jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoHerra() {
		return this.jComboBoxTiposGraficosReportesEmpleadoHerra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoHerra(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoHerra) {
		this.jComboBoxTiposGraficosReportesEmpleadoHerra = jComboBoxTiposGraficosReportesEmpleadoHerra;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoHerra() {
		return this.jComboBoxTiposPaginacionEmpleadoHerra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoHerra(
			JComboBox jComboBoxTiposPaginacionEmpleadoHerra) {
		this.jComboBoxTiposPaginacionEmpleadoHerra = jComboBoxTiposPaginacionEmpleadoHerra;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoHerra() {
		return this.jComboBoxTiposRelacionesEmpleadoHerra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoHerra() {
		return this.jComboBoxTiposAccionesEmpleadoHerra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoHerra(
			JComboBox jComboBoxTiposRelacionesEmpleadoHerra) {
		this.jComboBoxTiposRelacionesEmpleadoHerra = jComboBoxTiposRelacionesEmpleadoHerra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoHerra(
			JComboBox jComboBoxTiposAccionesEmpleadoHerra) {
		this.jComboBoxTiposAccionesEmpleadoHerra = jComboBoxTiposAccionesEmpleadoHerra;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoHerra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoHerra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoHerra() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoHerra;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoHerra(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoHerra) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoHerra = jCheckBoxConGraficoDinamicoEmpleadoHerra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoHerra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoHerra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoHerra .setBorder(borderResaltar);		
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
		this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		
		this.empleadoherraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoherraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoherraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoHerraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Herra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoHerra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"copiar","copiar","Copiar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"ver_form","ver_form","Ver"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"recargar","recargar","Recargar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoHerra,this.jTtoolBarEmpleadoHerra,
							"cerrar","cerrar","Salir"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoHerra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoHerra;
			
				this.jButtonProcesarInformacionToolBarEmpleadoHerra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoHerra;
				
		//protected JButton jButtonModificarToolBarEmpleadoHerra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoHerra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoHerra=new JMenuMe("General");
		this.jmenuArchivoEmpleadoHerra=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoHerra=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoHerra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoHerra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoHerra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoHerra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoHerra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoHerra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoHerra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoHerra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoHerra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoHerra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoHerra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoHerra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoHerra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoHerra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoHerra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoHerra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoHerra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoHerra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoHerra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoHerra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoHerra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoHerra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoHerra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoHerra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoHerra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoHerra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoHerra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoHerra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoHerra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoHerra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoHerra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoHerra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoHerra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoHerra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoHerra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoHerra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoHerra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoHerra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoHerra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoHerra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoHerra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoHerra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoHerra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoHerra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoHerra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoHerra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoHerra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoHerra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoHerra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoHerra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoHerra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoHerra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoHerra.add(this.jMenuItemCerrarEmpleadoHerra);
			
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemNuevoEmpleadoHerra);
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemNuevoGuardarCambiosEmpleadoHerra);
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemNuevoRelacionesEmpleadoHerra);
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemGuardarCambiosTablaEmpleadoHerra);		
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemDuplicarEmpleadoHerra);		
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemCopiarEmpleadoHerra);		
			this.jmenuAccionesEmpleadoHerra.add(this.jMenuItemVerFormEmpleadoHerra);		
			
			this.jmenuDatosEmpleadoHerra.add(this.jMenuItemRecargarInformacionEmpleadoHerra);				
			this.jmenuDatosEmpleadoHerra.add(this.jMenuItemAnterioresEmpleadoHerra);				
			this.jmenuDatosEmpleadoHerra.add(this.jMenuItemSiguientesEmpleadoHerra);				
			this.jmenuDatosEmpleadoHerra.add(this.jMenuItemAbrirOrderByEmpleadoHerra);				
			this.jmenuDatosEmpleadoHerra.add(this.jMenuItemMostrarOcultarEmpleadoHerra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoHerra.add(this.jMenuItemGuardarCambiosEmpleadoHerra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoHerra.add(this.jmenuArchivoEmpleadoHerra);		
			this.jmenuBarEmpleadoHerra.add(this.jmenuAccionesEmpleadoHerra);		
			this.jmenuBarEmpleadoHerra.add(this.jmenuDatosEmpleadoHerra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoHerra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoHerra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoHerra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoHerra= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoHerra.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoHerra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoHerra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.setFocusable(false);

		this.jPanelFK_IdHerramientaEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdHerramientaEmpleadoHerra.setToolTipText("Buscar Por Herramienta ");
		this.jButtonFK_IdHerramientaEmpleadoHerra= new JButtonMe();
		this.jButtonFK_IdHerramientaEmpleadoHerra.setText("Buscar");
		this.jButtonFK_IdHerramientaEmpleadoHerra.setToolTipText("Buscar Por Herramienta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdHerramientaEmpleadoHerra,"buscar_button","Buscar Por Herramienta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdHerramientaEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra = new JLabelMe();
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra.setText("Herramienta :");
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra.setToolTipText("Herramienta");
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_herramientaFK_IdHerramientaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_herramientaFK_IdHerramientaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra= new JComboBoxMe();
		jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoHerra=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoHerra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoHerra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoHerra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoHerra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoHerra = new EmpleadoHerraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Herra DATOS");
			this.jInternalFrameDetalleFormEmpleadoHerra = new EmpleadoHerraDetalleFormJInternalFrame(jDesktopPane,this.empleadoherraSessionBean.getConGuardarRelaciones(),this.empleadoherraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoHerra = null;//new EmpleadoHerraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoHerra= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoHerra = new JTableMe();      
		
		String sToolTipEmpleadoHerra="";
		sToolTipEmpleadoHerra=EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoHerra+="(Nomina.EmpleadoHerra)";
		}
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoHerra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoHerra.setToolTipText(sToolTipEmpleadoHerra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoHerra);
		this.jTableDatosEmpleadoHerra.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoHerra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoHerra.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoHerra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoHerra = new JButtonMe();
		this.jButtonDuplicarEmpleadoHerra = new JButtonMe();
		this.jButtonCopiarEmpleadoHerra = new JButtonMe();
		this.jButtonVerFormEmpleadoHerra = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoHerra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra = new JButtonMe();
		this.jButtonCerrarEmpleadoHerra = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoHerra = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoHerra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Herra";
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoHerra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoHerra.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoHerra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoHerra=new ReporteDinamicoJInternalFrame(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoHerra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoHerra=new ImportacionJInternalFrame(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoHerra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoHerra = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoHerra.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoHerra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoHerra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoHerra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHerra,false,this);
			
			//this.cargarOrderByEmpleadoHerra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoHerra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHerra,true,this);
			
			//this.cargarOrderByEmpleadoHerra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoHerra.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoHerra.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoHerra.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEmpleadoHerra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoHerra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoHerra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoHerra.setText("Nuevo");
		this.jButtonDuplicarEmpleadoHerra.setText("Duplicar");
		this.jButtonCopiarEmpleadoHerra.setText("Copiar");
		this.jButtonVerFormEmpleadoHerra.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoHerra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.setText("Guardar");
		this.jButtonCerrarEmpleadoHerra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoHerra,"nuevo_button","Nuevo",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoHerra,"duplicar_button","Duplicar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoHerra,"copiar_button","Copiar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoHerra,"ver_form","Ver",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoHerra,"nuevorelaciones_button","Nuevo Rel",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoHerra,"guardarcambiostabla_button","Guardar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoHerra,"cerrar_button","Salir",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoHerra.setToolTipText("Nuevo"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoHerra.setToolTipText("Duplicar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoHerra.setToolTipText("Copiar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoHerra.setToolTipText("Ver"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoHerra.setToolTipText("Nuevo Rel"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.setToolTipText("Guardar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoHerra.setToolTipText("Salir"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoHerra";
		inputMap = this.jButtonNuevoEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoHerra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoHerra"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoHerra";
		inputMap = this.jButtonDuplicarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoHerra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoHerra"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoHerra";
		inputMap = this.jButtonCopiarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoHerra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoHerra"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoHerra";
		inputMap = this.jButtonVerFormEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoHerra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoHerra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoHerra";
		inputMap = this.jButtonNuevoRelacionesEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoHerra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoHerra";
		inputMap = this.jButtonModificarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoHerra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoHerra";
		inputMap = this.jButtonCerrarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoHerra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoHerra";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoHerra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoHerra.setName("jPanelParametrosReportesEmpleadoHerra"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoHerra.setName("jPanelParametrosReportesAccionesEmpleadoHerra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoHerra = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoHerra.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoHerra.setToolTipText("Recargar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoHerra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoHerra = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoHerra.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoHerra.setToolTipText("Procesar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoHerra.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoHerra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoHerra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoHerra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHerra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoHerra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHerra.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoHerra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoHerra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoHerra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoHerra.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoHerra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoHerra.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoHerra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoHerra.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoHerra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoHerra.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoHerra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoHerra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoHerra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoHerra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoHerra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoHerra = new JLabelMe();
		
		this.jLabelAccionesEmpleadoHerra.setText("Acciones");		
		this.jLabelAccionesEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoHerra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoHerra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoHerra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoHerra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoHerra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoHerra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoHerra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoHerra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoHerra.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoHerra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoHerra = new JButtonMe();
		//this.jButtonAnterioresEmpleadoHerra.setText("<<");
        this.jButtonAnterioresEmpleadoHerra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoHerra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoHerra = new JButtonMe();
		//this.jButtonSiguientesEmpleadoHerra.setText(">>");
        this.jButtonSiguientesEmpleadoHerra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoHerra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoHerra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoHerra.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoHerra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoHerra,"nuevoguardarcambios_button","Nue",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoHerra";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoHerra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoHerra";
		inputMap = this.jButtonRecargarInformacionEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoHerra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoHerra";
		inputMap = this.jButtonSiguientesEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoHerra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoHerra";
		inputMap = this.jButtonAnterioresEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoHerra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoHerra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoHerra.setMinimumSize(new Dimension(this.getWidth(),EmpleadoHerraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHerraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoHerra.setMaximumSize(new Dimension(this.getWidth(),EmpleadoHerraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHerraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoHerra.setPreferredSize(new Dimension(this.getWidth(),EmpleadoHerraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoHerraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoHerra = new GridBagLayout();

			this.jPanelPaginacionEmpleadoHerra.setLayout(gridaBagLayoutPaginacionEmpleadoHerra);						
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 0;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonAnterioresEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					
						
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoHerra.gridy = 0;
			
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonNuevoGuardarCambiosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
						
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoHerra.gridy = 0;
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonSiguientesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 1;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonNuevoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
						
			
			
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoHerra.gridy = 1;
				this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoHerra.add(this.jButtonGuardarCambiosTablaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			}
			
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 1;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonDuplicarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 1;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonCopiarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 1;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonVerFormEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 1;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoHerra.add(this.jButtonCerrarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
		
		
		this.jButtonRecargarInformacionEmpleadoHerra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoHerra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoHerra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoHerra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoHerra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoHerra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoHerra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoHerra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoHerra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoHerra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoHerra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoHerra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoHerra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoHerra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoHerra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoHerra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoHerra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoHerra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoHerra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHerra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHerra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoHerra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoHerra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoHerra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoHerra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoHerra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoHerra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoHerra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoHerra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoHerra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoHerra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoHerra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoHerra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoHerra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoHerra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoHerra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoHerra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoHerra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoHerra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoHerra.setLayout(gridaBagParametrosReportesEmpleadoHerra);
			this.jPanelParametrosReportesAccionesEmpleadoHerra.setLayout(gridaBagParametrosReportesAccionesEmpleadoHerra);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoHerra.setLayout(gridaBagParametrosAuxiliar1EmpleadoHerra);
			this.jPanelParametrosAuxiliar2EmpleadoHerra.setLayout(gridaBagParametrosAuxiliar2EmpleadoHerra);
			this.jPanelParametrosAuxiliar3EmpleadoHerra.setLayout(gridaBagParametrosAuxiliar3EmpleadoHerra);
			this.jPanelParametrosAuxiliar4EmpleadoHerra.setLayout(gridaBagParametrosAuxiliar4EmpleadoHerra);
			//this.jPanelParametrosAuxiliar5EmpleadoHerra.setLayout(gridaBagParametrosAuxiliar2EmpleadoHerra);			
			
			
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jButtonRecargarInformacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHerra.add(this.jComboBoxTiposPaginacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHerra.add(this.jCheckBoxConAltoMaximoTablaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoHerra.add(this.jComboBoxTiposArchivosReportesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jPanelParametrosAuxiliar1EmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoHerra.add(this.jComboBoxTiposReportesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jPanelParametrosAuxiliar4EmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jComboBoxTiposReportesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jCheckBoxGenerarReporteEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jPanelParametrosAuxiliar2EmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jLabelAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoHerra.add(this.jButtonAbrirOrderByEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jComboBoxTiposSeleccionarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			
			
			/*
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jCheckBoxSeleccionarTodosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoHerra.add(this.jCheckBoxSeleccionarTodosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);															
				
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoHerra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoHerra.add(this.jCheckBoxSeleccionadosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jPanelParametrosAuxiliar3EmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jComboBoxTiposAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
	
				
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoHerra.add(this.jTextFieldValorCampoGeneralEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoHerra = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoHerra.setLayout(gridaBagLayoutDatosEmpleadoHerra);
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = 0;
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoHerra.add(this.jTableDatosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoHerra.setViewportView(this.jTableDatosEmpleadoHerra);
		this.jTableDatosEmpleadoHerra.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoHerra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoHerra= new GridBagLayout();
		this.jPanelAccionesEmpleadoHerra.setLayout(gridaBagLayoutAccionesEmpleadoHerra);
		
		
		/*	
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
			
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonNuevoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoHerra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoHerra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHerra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHerra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoHerra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoHerra.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 0;
		gridBagConstraintsEmpleadoHerra.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoHerra.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 0;
		gridBagConstraintsEmpleadoHerra.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoHerra.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra, gridBagConstraintsEmpleadoHerra);


		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoHerra.gridy = 0;
		gridBagConstraintsEmpleadoHerra.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoHerra.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 1;
		gridBagConstraintsEmpleadoHerra.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoHerra.add(jButtonFK_IdEmpleadoEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		jTabbedPaneBusquedasEmpleadoHerra.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoHerra);
		jTabbedPaneBusquedasEmpleadoHerra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdHerramientaEmpleadoHerra= new GridBagLayout();
		gridaBagLayoutFK_IdHerramientaEmpleadoHerra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdHerramientaEmpleadoHerra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdHerramientaEmpleadoHerra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdHerramientaEmpleadoHerra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdHerramientaEmpleadoHerra.setLayout(gridaBagLayoutFK_IdHerramientaEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 0;
		gridBagConstraintsEmpleadoHerra.gridx = 0;
		jPanelFK_IdHerramientaEmpleadoHerra.add(jLabelid_herramientaFK_IdHerramientaEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 0;
		gridBagConstraintsEmpleadoHerra.gridx = 1;
		jPanelFK_IdHerramientaEmpleadoHerra.add(jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoHerra.gridy = 1;
		gridBagConstraintsEmpleadoHerra.gridx =1;
		jPanelFK_IdHerramientaEmpleadoHerra.add(jButtonFK_IdHerramientaEmpleadoHerra, gridBagConstraintsEmpleadoHerra);

		jTabbedPaneBusquedasEmpleadoHerra.addTab("2.-Por Herramienta ", jPanelFK_IdHerramientaEmpleadoHerra);
		jTabbedPaneBusquedasEmpleadoHerra.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoHerra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;		
			//this.gridBagConstraintsEmpleadoHerra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoHerra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;		
		//this.gridBagConstraintsEmpleadoHerra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoHerra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;		
			this.gridBagConstraintsEmpleadoHerra.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoHerra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);								
		
		
		/*
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		*/		
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHerra.gridx =0;
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoHerra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
				
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoHerra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoHerra = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoHerra.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoHerra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoHerra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoHerra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHerra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHerra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoHerra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoHerra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoHerra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoHerra.setName("jPanelReporteDinamicoEmpleadoHerra"); 
		
		this.jPanelReporteDinamicoEmpleadoHerra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoHerra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoHerra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoHerra.setLayout(gridaBagLayoutReporteDinamicoEmpleadoHerra);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoHerra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoHerra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoHerra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoHerra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoHerra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoHerra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoHerra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoHerra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoHerra.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoHerra.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoHerra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoHerra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoHerra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoHerra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoHerra = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoHerra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jLabelColumnasSelectReporteEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoHerra = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoHerra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoHerra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoHerra=new JScrollPane(this.jListColumnasSelectReporteEmpleadoHerra);
			
			this.jScrollColumnasSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoHerra.add(this.jListColumnasSelectReporteEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jScrollColumnasSelectReporteEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoHerra = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoHerra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoHerra = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoHerra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoHerra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoHerra=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoHerra);
			
			this.jScrollRelacionesSelectReporteEmpleadoHerra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoHerra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoHerra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoHerra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoHerra = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoHerra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoHerra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoHerra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoHerra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoHerra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoHerra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra.setToolTipText("Generar EXCEL"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoHerra.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jComboBoxTiposReportesDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoHerra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoHerra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoHerra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoHerra.setToolTipText("Generar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jButtonGenerarReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoHerra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoHerra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoHerra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoHerra.setToolTipText("Cancelar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoHerra.add(this.jButtonCerrarReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoHerra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoHerra= new JScrollPane(jPanelReporteDinamicoEmpleadoHerra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoHerra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoHerra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoHerra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoHerra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoHerra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoHerra);
		this.jInternalFrameReporteDinamicoEmpleadoHerra.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoHerra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoHerra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoHerra.setName("jPanelImportacionEmpleadoHerra"); 
		
		this.jPanelImportacionEmpleadoHerra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoHerra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoHerra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoHerra.setLayout(gridaBagLayoutImportacionEmpleadoHerra);
		
		
		this.jInternalFrameImportacionEmpleadoHerra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoHerra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoHerra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoHerra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoHerra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoHerra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoHerra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoHerra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoHerra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoHerra.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoHerra.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoHerra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoHerra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoHerra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoHerra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoHerra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoHerra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoHerra.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoHerra.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoHerra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoHerra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoHerra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoHerra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoHerra = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoHerra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoHerra.add(this.jLabelArchivoImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoHerra = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoHerra.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoHerra = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoHerra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoHerra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoHerra.setToolTipText("Generar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHerra.add(this.jButtonAbrirImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoHerra = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoHerra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoHerra.add(this.jLabelPathArchivoImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoHerra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoHerra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoHerra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoHerra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHerra.add(this.jTextFieldPathArchivoImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoHerra = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoHerra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoHerra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoHerra.setToolTipText("Generar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHerra.add(this.jButtonGenerarImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoHerra = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoHerra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoHerra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoHerra.setToolTipText("Cancelar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoHerra.add(this.jButtonCerrarImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoHerra = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoHerra= new JScrollPane(jPanelImportacionEmpleadoHerra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoHerra.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoHerra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoHerra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoHerra);
		this.jInternalFrameImportacionEmpleadoHerra.getContentPane().add(this.jScrollPanelImportacionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoHerra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoHerra = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoHerra.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoHerra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoHerra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoHerra";
			inputMap = this.jButtonAbrirOrderByEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoHerra"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoHerra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoHerra.setName("jPanelOrderByEmpleadoHerra"); 
			
			this.jPanelOrderByEmpleadoHerra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoHerra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoHerra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoHerra.setLayout(gridaBagLayoutOrderByEmpleadoHerra);
			
			
			this.jTableDatosEmpleadoHerraOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoHerraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoHerraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoHerraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoHerraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoHerraOrderBy.setViewportView(this.jTableDatosEmpleadoHerraOrderBy);
			this.jTableDatosEmpleadoHerraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoHerraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoHerra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoHerra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoHerra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoHerra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoHerra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoHerra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoHerra.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoHerra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoHerra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoHerra.setResizable(true);
			this.jInternalFrameOrderByEmpleadoHerra.setClosable(true);
			this.jInternalFrameOrderByEmpleadoHerra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoHerra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoHerra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoHerra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoHerra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoHerra.ipady =150;
				
			this.jPanelOrderByEmpleadoHerra.add(jScrollPanelDatosEmpleadoHerraOrderBy, this.gridBagConstraintsEmpleadoHerra);//this.jTableDatosEmpleadoHerraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoHerra = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoHerra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoHerra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoHerra.setToolTipText("Cancelar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoHerra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoHerra.add(this.jButtonCerrarOrderByEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoHerra = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoHerra= new JScrollPane(jPanelOrderByEmpleadoHerra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoHerra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoHerra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoHerra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoHerra);
			
			this.jInternalFrameOrderByEmpleadoHerra.getContentPane().add(this.jScrollPanelOrderByEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoHerra = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoherraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoHerra.getRowHeight();//EmpleadoHerraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.isSelected()) {
					iHeightTable=EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoHerra.isSelected()) {
					iHeightTable=EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoHerraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoHerra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoHerra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoHerra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoHerra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoHerra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoHerra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoHerra!=null && this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoHerra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoHerra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoHerra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoHerra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoHerra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoHerra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoherraLogic.getEmpleadoHerras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoherras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoHerra> TraerEmpleadoHerraBeans(List<EmpleadoHerra> empleadoherras,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoHerra empleadoherra:empleadoherras) {
					
				if(!(EmpleadoHerraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoHerraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoherra.setsDetalleGeneralEntityReporte(EmpleadoHerraConstantesFunciones.getEmpleadoHerraDescripcion(empleadoherra));
										
					empleadoherra.setesta_activo_descripcion(EmpleadoHerraConstantesFunciones.getesta_activoDescripcion(empleadoherra));	
					
						
					
				} else  {
							
					//empleadoherra.setsDetalleGeneralEntityReporte(empleadoherra.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoherrabeans.add(empleadoherrabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoherras;
    }
	//PARA REPORTES FIN
}
