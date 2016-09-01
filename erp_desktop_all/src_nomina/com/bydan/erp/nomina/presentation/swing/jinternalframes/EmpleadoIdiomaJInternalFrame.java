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
import com.bydan.erp.nomina.util.EmpleadoIdiomaConstantesFunciones;

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
public class EmpleadoIdiomaJInternalFrame extends EmpleadoIdiomaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoIdioma;
	
	protected JMenuBar jmenuBarEmpleadoIdioma;
	
	protected JMenu jmenuEmpleadoIdioma;
	protected JMenu jmenuDatosEmpleadoIdioma;
	protected JMenu jmenuArchivoEmpleadoIdioma;
	protected JMenu jmenuAccionesEmpleadoIdioma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoIdioma;	
	protected GridBagConstraints gridBagConstraintsEmpleadoIdioma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoIdiomaDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoIdioma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoIdioma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoIdioma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected IdiomaBeanSwingJInternalFrame idiomaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_idioma="";
	
	public EmpleadoIdiomaSessionBean empleadoidiomaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public IdiomaSessionBean idiomaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoIdioma> empleadoidiomas;		
	public List<EmpleadoIdioma> empleadoidiomasEliminados;	
	public List<EmpleadoIdioma> empleadoidiomasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoIdioma;		
	protected JButton jButtonAbrirOrderByEmpleadoIdioma;
	
	
	//protected JPanel jPanelOrderByEmpleadoIdioma;
	//public JScrollPane jScrollPanelOrderByEmpleadoIdioma;	
	//protected JButton jButtonCerrarOrderByEmpleadoIdioma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoIdiomaLogic empleadoidiomaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoIdioma;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoIdioma;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoIdioma;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoIdiomaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoIdioma;
	//public JScrollPane jScrollPanelImportacionEmpleadoIdioma;
	
	
	
	protected JPanel jPanelAccionesEmpleadoIdioma;
	
    protected JPanel jPanelPaginacionEmpleadoIdioma;
    protected JPanel jPanelParametrosReportesEmpleadoIdioma;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoIdioma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoIdioma;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoIdioma;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoIdioma;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoIdioma;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoIdioma;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoIdioma;
	//protected JPanel jPanelImportacionEmpleadoIdioma;
	
	
	public JTable jTableDatosEmpleadoIdioma;
	
	
	
	//public JTable jTableDatosEmpleadoIdiomaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoIdioma;
	protected JButton jButtonDuplicarEmpleadoIdioma;
	protected JButton jButtonCopiarEmpleadoIdioma;
	protected JButton jButtonVerFormEmpleadoIdioma;
	protected JButton jButtonNuevoRelacionesEmpleadoIdioma;
	protected JButton jButtonModificarEmpleadoIdioma;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoIdioma;
	protected JButton jButtonCerrarEmpleadoIdioma;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoIdioma;
	protected JButton jButtonProcesarInformacionEmpleadoIdioma;
	
	
	protected JButton jButtonAnterioresEmpleadoIdioma;
	protected JButton jButtonSiguientesEmpleadoIdioma;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoIdioma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoIdioma;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoIdioma;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoIdioma;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoIdioma;
	//protected JButton jButtonGenerarImportacionEmpleadoIdioma;
	//protected JButton jButtonCerrarImportacionEmpleadoIdioma;
	//protected JFileChooser jFileChooserImportacionEmpleadoIdioma;
	//protected File fileImportacionEmpleadoIdioma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoIdioma;
	protected JButton jButtonDuplicarToolBarEmpleadoIdioma;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoIdioma;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoIdioma;
	protected JButton jButtonCopiarToolBarEmpleadoIdioma;
	protected JButton jButtonVerFormToolBarEmpleadoIdioma;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoIdioma;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoIdioma;
	protected JButton jButtonCerrarToolBarEmpleadoIdioma;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoIdioma;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoIdioma;
	protected JButton jButtonAnterioresToolBarEmpleadoIdioma;
	protected JButton jButtonSiguientesToolBarEmpleadoIdioma;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoIdioma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoIdioma;
	protected JMenuItem jMenuItemDuplicarEmpleadoIdioma;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoIdioma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoIdioma;
	protected JMenuItem jMenuItemCopiarEmpleadoIdioma;
	protected JMenuItem jMenuItemVerFormEmpleadoIdioma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoIdioma;
	protected JMenuItem jMenuItemCerrarEmpleadoIdioma;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoIdioma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoIdioma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoIdioma;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoIdioma;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoIdioma;
	protected JMenuItem jMenuItemAnterioresEmpleadoIdioma;
	protected JMenuItem jMenuItemSiguientesEmpleadoIdioma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoIdioma;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoIdioma;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoIdioma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoIdioma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoIdioma;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoIdioma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoIdioma;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoIdioma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoIdioma;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoIdioma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoIdioma;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoIdioma;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoIdioma;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoIdioma;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoIdioma;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoIdioma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoIdioma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoIdioma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoIdioma;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoIdioma;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoIdioma;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoIdioma;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoIdioma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoIdioma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoIdioma;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoIdioma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoIdioma;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoIdioma;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoIdioma;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoIdioma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoIdioma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoIdioma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoIdioma;
	public JPanel jPanelFK_IdEmpleadoEmpleadoIdioma;
	public JButton jButtonFK_IdEmpleadoEmpleadoIdioma;
	public JPanel jPanelFK_IdIdiomaEmpleadoIdioma;
	public JButton jButtonFK_IdIdiomaEmpleadoIdioma;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoIdioma;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoIdioma= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoIdiomaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma;
	
	public JPanel jPanelid_idiomaFK_IdIdiomaEmpleadoIdioma;
	public JLabel jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma;
	public JButton jButtonid_idiomaFK_IdIdiomaEmpleadoIdioma= new JButtonMe();
	public JButton jButtonid_idiomaFK_IdIdiomaEmpleadoIdiomaUpdate= new JButtonMe();
	public JButton jButtonid_idiomaFK_IdIdiomaEmpleadoIdiomaBusqueda= new JButtonMe();

	
	
	
	
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
	public EmpleadoIdiomaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoIdioma)	{
		this.jButtonRecargarInformacionEmpleadoIdioma = jButtonRecargarInformacionEmpleadoIdioma;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoIdioma() {
		return this.jButtonProcesarInformacionEmpleadoIdioma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoIdioma)	{
		this.jButtonProcesarInformacionEmpleadoIdioma = jButtonProcesarInformacionEmpleadoIdioma;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoIdioma() {
		return this.jButtonRecargarInformacionEmpleadoIdioma;
	}
	
	
	public List<EmpleadoIdioma> getempleadoidiomas() {
		return this.empleadoidiomas;
	}

	public void setempleadoidiomas(List<EmpleadoIdioma> empleadoidiomas) {
		this.empleadoidiomas = empleadoidiomas;
	}
	
	public List<EmpleadoIdioma> getempleadoidiomasAux() {
		return this.empleadoidiomasAux;
	}

	public void setempleadoidiomasAux(List<EmpleadoIdioma> empleadoidiomasAux) {
		this.empleadoidiomasAux = empleadoidiomasAux;
	}
	
	public List<EmpleadoIdioma> getempleadoidiomasEliminados() {
		return this.empleadoidiomasEliminados;
	}

	public void setEmpleadoIdiomasEliminados(List<EmpleadoIdioma> empleadoidiomasEliminados) {
		this.empleadoidiomasEliminados = empleadoidiomasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoIdioma() {
		return jComboBoxTiposSeleccionarEmpleadoIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoIdioma(
			JComboBox jComboBoxTiposSeleccionarEmpleadoIdioma) {
		this.jComboBoxTiposSeleccionarEmpleadoIdioma = jComboBoxTiposSeleccionarEmpleadoIdioma;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoIdioma() {
		return jTextFieldValorCampoGeneralEmpleadoIdioma;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoIdioma(
			JTextField jTextFieldValorCampoGeneralEmpleadoIdioma) {
		this.jTextFieldValorCampoGeneralEmpleadoIdioma = jTextFieldValorCampoGeneralEmpleadoIdioma;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoIdioma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoIdioma() {
		return this.jCheckBoxSeleccionarTodosEmpleadoIdioma;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoIdioma(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoIdioma) {
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma = jCheckBoxSeleccionarTodosEmpleadoIdioma;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoIdioma() {
		return this.jCheckBoxSeleccionadosEmpleadoIdioma;
	}

	public void setjCheckBoxSeleccionadosEmpleadoIdioma(
			JCheckBox jCheckBoxSeleccionadosEmpleadoIdioma) {
		this.jCheckBoxSeleccionadosEmpleadoIdioma = jCheckBoxSeleccionadosEmpleadoIdioma;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoIdioma() {
		return this.jComboBoxTiposArchivosReportesEmpleadoIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoIdioma(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoIdioma) {
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma = jComboBoxTiposArchivosReportesEmpleadoIdioma;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoIdioma() {
		return this.jComboBoxTiposReportesEmpleadoIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoIdioma(
			JComboBox jComboBoxTiposReportesEmpleadoIdioma) {
		this.jComboBoxTiposReportesEmpleadoIdioma = jComboBoxTiposReportesEmpleadoIdioma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoIdioma() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoIdioma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoIdioma(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoIdioma) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoIdioma = jComboBoxTiposReportesDinamicoEmpleadoIdioma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma = jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoIdioma() {
		return this.jComboBoxTiposGraficosReportesEmpleadoIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoIdioma(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoIdioma) {
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma = jComboBoxTiposGraficosReportesEmpleadoIdioma;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoIdioma() {
		return this.jComboBoxTiposPaginacionEmpleadoIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoIdioma(
			JComboBox jComboBoxTiposPaginacionEmpleadoIdioma) {
		this.jComboBoxTiposPaginacionEmpleadoIdioma = jComboBoxTiposPaginacionEmpleadoIdioma;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoIdioma() {
		return this.jComboBoxTiposRelacionesEmpleadoIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoIdioma() {
		return this.jComboBoxTiposAccionesEmpleadoIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoIdioma(
			JComboBox jComboBoxTiposRelacionesEmpleadoIdioma) {
		this.jComboBoxTiposRelacionesEmpleadoIdioma = jComboBoxTiposRelacionesEmpleadoIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoIdioma(
			JComboBox jComboBoxTiposAccionesEmpleadoIdioma) {
		this.jComboBoxTiposAccionesEmpleadoIdioma = jComboBoxTiposAccionesEmpleadoIdioma;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoIdioma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoIdioma() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoIdioma;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoIdioma(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoIdioma) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoIdioma = jCheckBoxConGraficoDinamicoEmpleadoIdioma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoIdioma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoIdioma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoIdioma .setBorder(borderResaltar);		
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
		this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		
		this.empleadoidiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoidiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoidiomaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoIdiomaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Idioma MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoIdioma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"copiar","copiar","Copiar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"ver_form","ver_form","Ver"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"recargar","recargar","Recargar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,
							"cerrar","cerrar","Salir"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoIdioma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoIdioma;
			
				this.jButtonProcesarInformacionToolBarEmpleadoIdioma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoIdioma;
				
		//protected JButton jButtonModificarToolBarEmpleadoIdioma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoIdioma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoIdioma=new JMenuMe("General");
		this.jmenuArchivoEmpleadoIdioma=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoIdioma=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoIdioma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoIdioma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoIdioma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoIdioma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoIdioma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoIdioma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoIdioma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoIdioma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoIdioma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoIdioma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoIdioma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoIdioma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoIdioma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoIdioma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoIdioma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoIdioma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoIdioma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoIdioma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoIdioma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoIdioma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoIdioma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoIdioma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoIdioma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoIdioma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoIdioma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoIdioma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoIdioma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoIdioma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoIdioma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoIdioma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoIdioma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoIdioma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoIdioma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoIdioma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoIdioma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoIdioma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoIdioma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoIdioma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoIdioma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoIdioma.add(this.jMenuItemCerrarEmpleadoIdioma);
			
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemNuevoEmpleadoIdioma);
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma);
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemNuevoRelacionesEmpleadoIdioma);
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemGuardarCambiosTablaEmpleadoIdioma);		
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemDuplicarEmpleadoIdioma);		
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemCopiarEmpleadoIdioma);		
			this.jmenuAccionesEmpleadoIdioma.add(this.jMenuItemVerFormEmpleadoIdioma);		
			
			this.jmenuDatosEmpleadoIdioma.add(this.jMenuItemRecargarInformacionEmpleadoIdioma);				
			this.jmenuDatosEmpleadoIdioma.add(this.jMenuItemAnterioresEmpleadoIdioma);				
			this.jmenuDatosEmpleadoIdioma.add(this.jMenuItemSiguientesEmpleadoIdioma);				
			this.jmenuDatosEmpleadoIdioma.add(this.jMenuItemAbrirOrderByEmpleadoIdioma);				
			this.jmenuDatosEmpleadoIdioma.add(this.jMenuItemMostrarOcultarEmpleadoIdioma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoIdioma.add(this.jMenuItemGuardarCambiosEmpleadoIdioma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoIdioma.add(this.jmenuArchivoEmpleadoIdioma);		
			this.jmenuBarEmpleadoIdioma.add(this.jmenuAccionesEmpleadoIdioma);		
			this.jmenuBarEmpleadoIdioma.add(this.jmenuDatosEmpleadoIdioma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoIdioma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoIdioma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoIdioma.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoIdioma= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoIdioma.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoIdioma.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoIdioma,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.setFocusable(false);

		this.jPanelFK_IdIdiomaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdIdiomaEmpleadoIdioma.setToolTipText("Buscar Por Idioma ");
		this.jButtonFK_IdIdiomaEmpleadoIdioma= new JButtonMe();
		this.jButtonFK_IdIdiomaEmpleadoIdioma.setText("Buscar");
		this.jButtonFK_IdIdiomaEmpleadoIdioma.setToolTipText("Buscar Por Idioma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdIdiomaEmpleadoIdioma,"buscar_button","Buscar Por Idioma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdIdiomaEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma = new JLabelMe();
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma.setText("Idioma :");
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma.setToolTipText("Idioma");
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma= new JComboBoxMe();
		jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoIdioma=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoIdioma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoIdioma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoIdioma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoIdioma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoIdioma = new EmpleadoIdiomaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Idioma DATOS");
			this.jInternalFrameDetalleFormEmpleadoIdioma = new EmpleadoIdiomaDetalleFormJInternalFrame(jDesktopPane,this.empleadoidiomaSessionBean.getConGuardarRelaciones(),this.empleadoidiomaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoIdioma = null;//new EmpleadoIdiomaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoIdioma= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoIdioma = new JTableMe();      
		
		String sToolTipEmpleadoIdioma="";
		sToolTipEmpleadoIdioma=EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoIdioma+="(Nomina.EmpleadoIdioma)";
		}
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoIdioma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoIdioma.setToolTipText(sToolTipEmpleadoIdioma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoIdioma);
		this.jTableDatosEmpleadoIdioma.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoIdioma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoIdioma.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoIdioma = new JButtonMe();
		this.jButtonDuplicarEmpleadoIdioma = new JButtonMe();
		this.jButtonCopiarEmpleadoIdioma = new JButtonMe();
		this.jButtonVerFormEmpleadoIdioma = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoIdioma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma = new JButtonMe();
		this.jButtonCerrarEmpleadoIdioma = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoIdioma = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoIdioma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Idioma";
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoIdioma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoIdioma.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoIdioma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoIdioma=new ReporteDinamicoJInternalFrame(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoIdioma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoIdioma=new ImportacionJInternalFrame(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoIdioma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoIdioma = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoIdioma.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoIdioma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoIdioma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoIdioma,false,this);
			
			//this.cargarOrderByEmpleadoIdioma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoIdioma,true,this);
			
			//this.cargarOrderByEmpleadoIdioma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoIdioma.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosEmpleadoIdioma.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosEmpleadoIdioma.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosEmpleadoIdioma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoIdioma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoIdioma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoIdioma.setText("Nuevo");
		this.jButtonDuplicarEmpleadoIdioma.setText("Duplicar");
		this.jButtonCopiarEmpleadoIdioma.setText("Copiar");
		this.jButtonVerFormEmpleadoIdioma.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoIdioma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.setText("Guardar");
		this.jButtonCerrarEmpleadoIdioma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoIdioma,"nuevo_button","Nuevo",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoIdioma,"duplicar_button","Duplicar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoIdioma,"copiar_button","Copiar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoIdioma,"ver_form","Ver",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoIdioma,"nuevorelaciones_button","Nuevo Rel",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoIdioma,"guardarcambiostabla_button","Guardar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoIdioma,"cerrar_button","Salir",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoIdioma.setToolTipText("Nuevo"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoIdioma.setToolTipText("Duplicar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoIdioma.setToolTipText("Copiar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoIdioma.setToolTipText("Ver"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoIdioma.setToolTipText("Nuevo Rel"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.setToolTipText("Guardar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoIdioma.setToolTipText("Salir"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoIdioma";
		inputMap = this.jButtonNuevoEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoIdioma"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoIdioma";
		inputMap = this.jButtonDuplicarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoIdioma"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoIdioma";
		inputMap = this.jButtonCopiarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoIdioma"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoIdioma";
		inputMap = this.jButtonVerFormEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoIdioma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoIdioma";
		inputMap = this.jButtonNuevoRelacionesEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoIdioma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoIdioma";
		inputMap = this.jButtonModificarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoIdioma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoIdioma";
		inputMap = this.jButtonCerrarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoIdioma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoIdioma";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoIdioma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoIdioma.setName("jPanelParametrosReportesEmpleadoIdioma"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoIdioma.setName("jPanelParametrosReportesAccionesEmpleadoIdioma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoIdioma = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoIdioma.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoIdioma.setToolTipText("Recargar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoIdioma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoIdioma = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoIdioma.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoIdioma.setToolTipText("Procesar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoIdioma.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoIdioma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoIdioma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoIdioma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoIdioma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoIdioma.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoIdioma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoIdioma.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoIdioma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoIdioma.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoIdioma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoIdioma.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoIdioma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoIdioma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoIdioma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoIdioma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoIdioma = new JLabelMe();
		
		this.jLabelAccionesEmpleadoIdioma.setText("Acciones");		
		this.jLabelAccionesEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoIdioma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoIdioma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoIdioma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoIdioma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoIdioma.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoIdioma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoIdioma = new JButtonMe();
		//this.jButtonAnterioresEmpleadoIdioma.setText("<<");
        this.jButtonAnterioresEmpleadoIdioma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoIdioma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoIdioma = new JButtonMe();
		//this.jButtonSiguientesEmpleadoIdioma.setText(">>");
        this.jButtonSiguientesEmpleadoIdioma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoIdioma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoIdioma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoIdioma.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoIdioma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoIdioma,"nuevoguardarcambios_button","Nue",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoIdioma";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoIdioma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoIdioma";
		inputMap = this.jButtonRecargarInformacionEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoIdioma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoIdioma";
		inputMap = this.jButtonSiguientesEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoIdioma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoIdioma";
		inputMap = this.jButtonAnterioresEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoIdioma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoIdioma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoIdioma.setMinimumSize(new Dimension(this.getWidth(),EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoIdioma.setMaximumSize(new Dimension(this.getWidth(),EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoIdioma.setPreferredSize(new Dimension(this.getWidth(),EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoIdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoIdioma = new GridBagLayout();

			this.jPanelPaginacionEmpleadoIdioma.setLayout(gridaBagLayoutPaginacionEmpleadoIdioma);						
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonAnterioresEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					
						
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
			
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonNuevoGuardarCambiosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
						
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonSiguientesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonNuevoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
						
			
			
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
				this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonGuardarCambiosTablaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			}
			
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonDuplicarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonCopiarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonVerFormEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 1;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoIdioma.add(this.jButtonCerrarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
		
		
		this.jButtonRecargarInformacionEmpleadoIdioma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoIdioma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoIdioma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoIdioma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoIdioma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoIdioma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoIdioma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoIdioma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoIdioma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoIdioma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoIdioma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoIdioma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoIdioma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoIdioma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoIdioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoIdioma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoIdioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoIdioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoIdioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoIdioma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoIdioma.setLayout(gridaBagParametrosReportesEmpleadoIdioma);
			this.jPanelParametrosReportesAccionesEmpleadoIdioma.setLayout(gridaBagParametrosReportesAccionesEmpleadoIdioma);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoIdioma.setLayout(gridaBagParametrosAuxiliar1EmpleadoIdioma);
			this.jPanelParametrosAuxiliar2EmpleadoIdioma.setLayout(gridaBagParametrosAuxiliar2EmpleadoIdioma);
			this.jPanelParametrosAuxiliar3EmpleadoIdioma.setLayout(gridaBagParametrosAuxiliar3EmpleadoIdioma);
			this.jPanelParametrosAuxiliar4EmpleadoIdioma.setLayout(gridaBagParametrosAuxiliar4EmpleadoIdioma);
			//this.jPanelParametrosAuxiliar5EmpleadoIdioma.setLayout(gridaBagParametrosAuxiliar2EmpleadoIdioma);			
			
			
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jButtonRecargarInformacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoIdioma.add(this.jComboBoxTiposPaginacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoIdioma.add(this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoIdioma.add(this.jComboBoxTiposArchivosReportesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jPanelParametrosAuxiliar1EmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoIdioma.add(this.jComboBoxTiposReportesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jPanelParametrosAuxiliar4EmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jComboBoxTiposReportesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jCheckBoxGenerarReporteEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jPanelParametrosAuxiliar2EmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jLabelAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoIdioma.add(this.jButtonAbrirOrderByEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jComboBoxTiposSeleccionarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			
			
			/*
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jCheckBoxSeleccionarTodosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoIdioma.add(this.jCheckBoxSeleccionarTodosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);															
				
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoIdioma.add(this.jCheckBoxSeleccionadosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jPanelParametrosAuxiliar3EmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jComboBoxTiposAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
	
				
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoIdioma.add(this.jTextFieldValorCampoGeneralEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoIdioma = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoIdioma.setLayout(gridaBagLayoutDatosEmpleadoIdioma);
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoIdioma.add(this.jTableDatosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoIdioma.setViewportView(this.jTableDatosEmpleadoIdioma);
		this.jTableDatosEmpleadoIdioma.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoIdioma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoIdioma= new GridBagLayout();
		this.jPanelAccionesEmpleadoIdioma.setLayout(gridaBagLayoutAccionesEmpleadoIdioma);
		
		
		/*	
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
			
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonNuevoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoIdioma.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 0;
		gridBagConstraintsEmpleadoIdioma.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoIdioma.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 0;
		gridBagConstraintsEmpleadoIdioma.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoIdioma.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);


		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoIdioma.gridy = 0;
		gridBagConstraintsEmpleadoIdioma.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoIdioma.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 1;
		gridBagConstraintsEmpleadoIdioma.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoIdioma.add(jButtonFK_IdEmpleadoEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		jTabbedPaneBusquedasEmpleadoIdioma.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoIdioma);
		jTabbedPaneBusquedasEmpleadoIdioma.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdIdiomaEmpleadoIdioma= new GridBagLayout();
		gridaBagLayoutFK_IdIdiomaEmpleadoIdioma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdIdiomaEmpleadoIdioma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdIdiomaEmpleadoIdioma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdIdiomaEmpleadoIdioma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdIdiomaEmpleadoIdioma.setLayout(gridaBagLayoutFK_IdIdiomaEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 0;
		gridBagConstraintsEmpleadoIdioma.gridx = 0;
		jPanelFK_IdIdiomaEmpleadoIdioma.add(jLabelid_idiomaFK_IdIdiomaEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 0;
		gridBagConstraintsEmpleadoIdioma.gridx = 1;
		jPanelFK_IdIdiomaEmpleadoIdioma.add(jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoIdioma.gridy = 1;
		gridBagConstraintsEmpleadoIdioma.gridx =1;
		jPanelFK_IdIdiomaEmpleadoIdioma.add(jButtonFK_IdIdiomaEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);

		jTabbedPaneBusquedasEmpleadoIdioma.addTab("2.-Por Idioma ", jPanelFK_IdIdiomaEmpleadoIdioma);
		jTabbedPaneBusquedasEmpleadoIdioma.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoIdioma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;		
			//this.gridBagConstraintsEmpleadoIdioma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoIdioma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;		
		//this.gridBagConstraintsEmpleadoIdioma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoIdioma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;		
			this.gridBagConstraintsEmpleadoIdioma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoIdioma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);								
		
		
		/*
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		*/		
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoIdioma.gridx =0;
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoIdioma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
				
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoIdioma = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoIdioma.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoIdioma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoIdioma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoIdioma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoIdioma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoIdioma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoIdioma.setName("jPanelReporteDinamicoEmpleadoIdioma"); 
		
		this.jPanelReporteDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoIdioma.setLayout(gridaBagLayoutReporteDinamicoEmpleadoIdioma);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoIdioma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoIdioma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoIdioma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoIdioma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoIdioma.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoIdioma.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoIdioma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoIdioma = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoIdioma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jLabelColumnasSelectReporteEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoIdioma = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoIdioma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoIdioma=new JScrollPane(this.jListColumnasSelectReporteEmpleadoIdioma);
			
			this.jScrollColumnasSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jListColumnasSelectReporteEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jScrollColumnasSelectReporteEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoIdioma = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoIdioma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoIdioma = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoIdioma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoIdioma=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoIdioma);
			
			this.jScrollRelacionesSelectReporteEmpleadoIdioma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoIdioma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoIdioma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoIdioma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoIdioma = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoIdioma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoIdioma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoIdioma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma.setToolTipText("Generar EXCEL"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jComboBoxTiposReportesDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoIdioma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoIdioma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoIdioma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoIdioma.setToolTipText("Generar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jButtonGenerarReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoIdioma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoIdioma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoIdioma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoIdioma.setToolTipText("Cancelar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoIdioma.add(this.jButtonCerrarReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoIdioma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoIdioma= new JScrollPane(jPanelReporteDinamicoEmpleadoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoIdioma);
		this.jInternalFrameReporteDinamicoEmpleadoIdioma.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoIdioma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoIdioma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoIdioma.setName("jPanelImportacionEmpleadoIdioma"); 
		
		this.jPanelImportacionEmpleadoIdioma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoIdioma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoIdioma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoIdioma.setLayout(gridaBagLayoutImportacionEmpleadoIdioma);
		
		
		this.jInternalFrameImportacionEmpleadoIdioma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoIdioma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoIdioma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoIdioma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoIdioma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoIdioma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoIdioma.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoIdioma.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoIdioma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoIdioma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoIdioma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoIdioma.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoIdioma.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoIdioma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoIdioma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoIdioma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoIdioma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoIdioma = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoIdioma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoIdioma.add(this.jLabelArchivoImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoIdioma = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoIdioma.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoIdioma = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoIdioma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoIdioma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoIdioma.setToolTipText("Generar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoIdioma.add(this.jButtonAbrirImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoIdioma = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoIdioma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoIdioma.add(this.jLabelPathArchivoImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoIdioma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoIdioma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoIdioma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoIdioma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoIdioma.add(this.jTextFieldPathArchivoImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoIdioma = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoIdioma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoIdioma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoIdioma.setToolTipText("Generar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoIdioma.add(this.jButtonGenerarImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoIdioma = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoIdioma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoIdioma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoIdioma.setToolTipText("Cancelar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoIdioma.add(this.jButtonCerrarImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoIdioma = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoIdioma= new JScrollPane(jPanelImportacionEmpleadoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoIdioma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoIdioma);
		this.jInternalFrameImportacionEmpleadoIdioma.getContentPane().add(this.jScrollPanelImportacionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoIdioma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoIdioma = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoIdioma.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoIdioma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoIdioma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoIdioma";
			inputMap = this.jButtonAbrirOrderByEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoIdioma"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoIdioma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoIdioma.setName("jPanelOrderByEmpleadoIdioma"); 
			
			this.jPanelOrderByEmpleadoIdioma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoIdioma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoIdioma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoIdioma.setLayout(gridaBagLayoutOrderByEmpleadoIdioma);
			
			
			this.jTableDatosEmpleadoIdiomaOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoIdiomaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoIdiomaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoIdiomaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoIdiomaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoIdiomaOrderBy.setViewportView(this.jTableDatosEmpleadoIdiomaOrderBy);
			this.jTableDatosEmpleadoIdiomaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoIdiomaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoIdioma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoIdioma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoIdioma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoIdioma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoIdioma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoIdioma.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoIdioma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoIdioma.setResizable(true);
			this.jInternalFrameOrderByEmpleadoIdioma.setClosable(true);
			this.jInternalFrameOrderByEmpleadoIdioma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoIdioma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoIdioma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoIdioma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoIdioma.ipady =150;
				
			this.jPanelOrderByEmpleadoIdioma.add(jScrollPanelDatosEmpleadoIdiomaOrderBy, this.gridBagConstraintsEmpleadoIdioma);//this.jTableDatosEmpleadoIdiomaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoIdioma = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoIdioma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoIdioma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoIdioma.setToolTipText("Cancelar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoIdioma.add(this.jButtonCerrarOrderByEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoIdioma = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoIdioma= new JScrollPane(jPanelOrderByEmpleadoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoIdioma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoIdioma);
			
			this.jInternalFrameOrderByEmpleadoIdioma.getContentPane().add(this.jScrollPanelOrderByEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoIdioma = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoidiomaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoIdioma.getRowHeight();//EmpleadoIdiomaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.isSelected()) {
					iHeightTable=EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoIdioma.isSelected()) {
					iHeightTable=EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoIdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoIdioma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoIdioma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoIdioma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoIdioma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoIdioma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoIdioma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoIdioma!=null && this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoIdioma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoIdioma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoIdioma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoIdioma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoIdioma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoIdioma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoidiomaLogic.getEmpleadoIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoidiomas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoIdioma> TraerEmpleadoIdiomaBeans(List<EmpleadoIdioma> empleadoidiomas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoIdioma empleadoidioma:empleadoidiomas) {
					
				if(!(EmpleadoIdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoIdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoidioma.setsDetalleGeneralEntityReporte(EmpleadoIdiomaConstantesFunciones.getEmpleadoIdiomaDescripcion(empleadoidioma));
										
					empleadoidioma.setes_materna_descripcion(EmpleadoIdiomaConstantesFunciones.getes_maternaDescripcion(empleadoidioma));empleadoidioma.setes_tecnico_descripcion(EmpleadoIdiomaConstantesFunciones.getes_tecnicoDescripcion(empleadoidioma));empleadoidioma.setes_lectura_descripcion(EmpleadoIdiomaConstantesFunciones.getes_lecturaDescripcion(empleadoidioma));empleadoidioma.setes_escrito_descripcion(EmpleadoIdiomaConstantesFunciones.getes_escritoDescripcion(empleadoidioma));empleadoidioma.setes_hablado_descripcion(EmpleadoIdiomaConstantesFunciones.getes_habladoDescripcion(empleadoidioma));	
					
						
					
				} else  {
							
					//empleadoidioma.setsDetalleGeneralEntityReporte(empleadoidioma.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoidiomabeans.add(empleadoidiomabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoidiomas;
    }
	//PARA REPORTES FIN
}
