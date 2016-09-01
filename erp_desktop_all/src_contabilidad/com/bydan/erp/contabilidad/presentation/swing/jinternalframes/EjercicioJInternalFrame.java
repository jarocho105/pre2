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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.EjercicioConstantesFunciones;

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
public class EjercicioJInternalFrame extends EjercicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEjercicio;
	
	protected JMenuBar jmenuBarEjercicio;
	
	protected JMenu jmenuEjercicio;
	protected JMenu jmenuDatosEjercicio;
	protected JMenu jmenuArchivoEjercicio;
	protected JMenu jmenuAccionesEjercicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEjercicio;	
	protected GridBagConstraints gridBagConstraintsEjercicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EjercicioDetalleFormJInternalFrame jInternalFrameDetalleFormEjercicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEjercicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEjercicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public EjercicioSessionBean ejercicioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Ejercicio> ejercicios;		
	public List<Ejercicio> ejerciciosEliminados;	
	public List<Ejercicio> ejerciciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEjercicio;		
	protected JButton jButtonAbrirOrderByEjercicio;
	
	
	//protected JPanel jPanelOrderByEjercicio;
	//public JScrollPane jScrollPanelOrderByEjercicio;	
	//protected JButton jButtonCerrarOrderByEjercicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EjercicioLogic ejercicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEjercicio;
	public JScrollPane jScrollPanelDatosEdicionEjercicio;
	public JScrollPane jScrollPanelDatosGeneralEjercicio;
    
	
	
	//public JScrollPane jScrollPanelDatosEjercicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEjercicio;
	//public JScrollPane jScrollPanelImportacionEjercicio;
	
	
	
	protected JPanel jPanelAccionesEjercicio;
	
    protected JPanel jPanelPaginacionEjercicio;
    protected JPanel jPanelParametrosReportesEjercicio;
	protected JPanel jPanelParametrosReportesAccionesEjercicio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Ejercicio;
	protected JPanel jPanelParametrosAuxiliar2Ejercicio;
	protected JPanel jPanelParametrosAuxiliar3Ejercicio;
	protected JPanel jPanelParametrosAuxiliar4Ejercicio;
	//protected JPanel jPanelParametrosAuxiliar5Ejercicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoEjercicio;
	//protected JPanel jPanelImportacionEjercicio;
	
	
	public JTable jTableDatosEjercicio;
	
	
	
	//public JTable jTableDatosEjercicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEjercicio;
	protected JButton jButtonDuplicarEjercicio;
	protected JButton jButtonCopiarEjercicio;
	protected JButton jButtonVerFormEjercicio;
	protected JButton jButtonNuevoRelacionesEjercicio;
	protected JButton jButtonModificarEjercicio;
	
    protected JButton jButtonGuardarCambiosTablaEjercicio;
	protected JButton jButtonCerrarEjercicio;
	
	
	protected JButton jButtonRecargarInformacionEjercicio;
	protected JButton jButtonProcesarInformacionEjercicio;
	
	
	protected JButton jButtonAnterioresEjercicio;
	protected JButton jButtonSiguientesEjercicio;
	protected JButton jButtonNuevoGuardarCambiosEjercicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEjercicio;
	//protected JButton jButtonCerrarReporteDinamicoEjercicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoEjercicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionEjercicio;
	//protected JButton jButtonGenerarImportacionEjercicio;
	//protected JButton jButtonCerrarImportacionEjercicio;
	//protected JFileChooser jFileChooserImportacionEjercicio;
	//protected File fileImportacionEjercicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEjercicio;
	protected JButton jButtonDuplicarToolBarEjercicio;
	protected JButton jButtonNuevoRelacionesToolBarEjercicio;
	
	
	public JButton jButtonGuardarCambiosToolBarEjercicio;
	protected JButton jButtonCopiarToolBarEjercicio;
	protected JButton jButtonVerFormToolBarEjercicio;
	public JButton jButtonGuardarCambiosTablaToolBarEjercicio;
	protected JButton jButtonMostrarOcultarTablaToolBarEjercicio;
	protected JButton jButtonCerrarToolBarEjercicio;
	
	protected JButton jButtonRecargarInformacionToolBarEjercicio;
	protected JButton jButtonProcesarInformacionToolBarEjercicio;
	protected JButton jButtonAnterioresToolBarEjercicio;
	protected JButton jButtonSiguientesToolBarEjercicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarEjercicio;
	protected JButton jButtonAbrirOrderByToolBarEjercicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEjercicio;
	protected JMenuItem jMenuItemDuplicarEjercicio;
	protected JMenuItem jMenuItemNuevoRelacionesEjercicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEjercicio;
	protected JMenuItem jMenuItemCopiarEjercicio;
	protected JMenuItem jMenuItemVerFormEjercicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEjercicio;
	protected JMenuItem jMenuItemCerrarEjercicio;
	protected JMenuItem jMenuItemDetalleCerrarEjercicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEjercicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEjercicio;
	
	protected JMenuItem jMenuItemRecargarInformacionEjercicio;
	protected JMenuItem jMenuItemProcesarInformacionEjercicio;
	protected JMenuItem jMenuItemAnterioresEjercicio;
	protected JMenuItem jMenuItemSiguientesEjercicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEjercicio;
	protected JMenuItem jMenuItemAbrirOrderByEjercicio;
	protected JMenuItem jMenuItemMostrarOcultarEjercicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEjercicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEjercicio;
	protected JCheckBox jCheckBoxSeleccionadosEjercicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEjercicio;
	protected JCheckBox jCheckBoxConGraficoReporteEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEjercicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEjercicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEjercicio;
	protected JTextField jTextFieldValorCampoGeneralEjercicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEjercicio;
	//public JList<Reporte> jListColumnasSelectReporteEjercicio;
	//public JScrollPane jScrollColumnasSelectReporteEjercicio;
	
	//public JLabel jLabelRelacionesSelectReporteEjercicio;
	//public JList<Reporte> jListRelacionesSelectReporteEjercicio;
	//public JScrollPane jScrollRelacionesSelectReporteEjercicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEjercicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEjercicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEjercicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoEjercicio;
	
		
	//public JLabel jLabelArchivoImportacionEjercicio;	
	//public JLabel jLabelPathArchivoImportacionEjercicio;
	//protected JTextField jTextFieldPathArchivoImportacionEjercicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEjercicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEjercicio;
	
	//public JLabel jLabelColumnaCategoriaValorEjercicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEjercicio;
	
	//public JLabel jLabelColumnasValoresGraficoEjercicio;
	//public JList<Reporte> jListColumnasValoresGraficoEjercicio;
	//public JScrollPane jScrollColumnasValoresGraficoEjercicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEjercicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEjercicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEjercicio;
	public JPanel jPanelBusquedaPorFechaInicioEjercicio;
	public JButton jButtonBusquedaPorFechaInicioEjercicio;
	public JPanel jPanelFK_IdAnioEjercicio;
	public JButton jButtonFK_IdAnioEjercicio;
	
	public JPanel jPanelfecha_inicioBusquedaPorFechaInicioEjercicio;
	public JLabel jLabelfecha_inicioBusquedaPorFechaInicioEjercicio;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio;

	public JDateChooser jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio;
	public JButton jButtonfecha_inicioBusquedaPorFechaInicioEjercicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioFK_IdAnioEjercicio;
	public JLabel jLabelid_anioFK_IdAnioEjercicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioEjercicio;
	public JButton jButtonid_anioFK_IdAnioEjercicio= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEjercicioUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEjercicioBusqueda= new JButtonMe();

	
	
	
	
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
	public EjercicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEjercicio)	{
		this.jButtonRecargarInformacionEjercicio = jButtonRecargarInformacionEjercicio;
	}
	
	public JButton getjButtonProcesarInformacionEjercicio() {
		return this.jButtonProcesarInformacionEjercicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEjercicio)	{
		this.jButtonProcesarInformacionEjercicio = jButtonProcesarInformacionEjercicio;
	}
	
	
	public JButton getjButtonRecargarInformacionEjercicio() {
		return this.jButtonRecargarInformacionEjercicio;
	}
	
	
	public List<Ejercicio> getejercicios() {
		return this.ejercicios;
	}

	public void setejercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}
	
	public List<Ejercicio> getejerciciosAux() {
		return this.ejerciciosAux;
	}

	public void setejerciciosAux(List<Ejercicio> ejerciciosAux) {
		this.ejerciciosAux = ejerciciosAux;
	}
	
	public List<Ejercicio> getejerciciosEliminados() {
		return this.ejerciciosEliminados;
	}

	public void setEjerciciosEliminados(List<Ejercicio> ejerciciosEliminados) {
		this.ejerciciosEliminados = ejerciciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEjercicio() {
		return jComboBoxTiposSeleccionarEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEjercicio(
			JComboBox jComboBoxTiposSeleccionarEjercicio) {
		this.jComboBoxTiposSeleccionarEjercicio = jComboBoxTiposSeleccionarEjercicio;
	}
	
	public void setBorderResaltarTiposSeleccionarEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEjercicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEjercicio() {
		return jTextFieldValorCampoGeneralEjercicio;
	}

	public void setjTextFieldValorCampoGeneralEjercicio(
			JTextField jTextFieldValorCampoGeneralEjercicio) {
		this.jTextFieldValorCampoGeneralEjercicio = jTextFieldValorCampoGeneralEjercicio;
	}

	public void setBorderResaltarValorCampoGeneralEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEjercicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEjercicio() {
		return this.jCheckBoxSeleccionarTodosEjercicio;
	}

	public void setjCheckBoxSeleccionarTodosEjercicio(
			JCheckBox jCheckBoxSeleccionarTodosEjercicio) {
		this.jCheckBoxSeleccionarTodosEjercicio = jCheckBoxSeleccionarTodosEjercicio;
	}

	public void setBorderResaltarSeleccionarTodosEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEjercicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEjercicio() {
		return this.jCheckBoxSeleccionadosEjercicio;
	}

	public void setjCheckBoxSeleccionadosEjercicio(
			JCheckBox jCheckBoxSeleccionadosEjercicio) {
		this.jCheckBoxSeleccionadosEjercicio = jCheckBoxSeleccionadosEjercicio;
	}
	
	public void setBorderResaltarSeleccionadosEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEjercicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEjercicio() {
		return this.jComboBoxTiposArchivosReportesEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEjercicio(
			JComboBox jComboBoxTiposArchivosReportesEjercicio) {
		this.jComboBoxTiposArchivosReportesEjercicio = jComboBoxTiposArchivosReportesEjercicio;
	}

	public void setBorderResaltarTiposArchivosReportesEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEjercicio() {
		return this.jComboBoxTiposReportesEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEjercicio(
			JComboBox jComboBoxTiposReportesEjercicio) {
		this.jComboBoxTiposReportesEjercicio = jComboBoxTiposReportesEjercicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEjercicio() {
	//	return jComboBoxTiposReportesDinamicoEjercicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEjercicio(
	//		JComboBox jComboBoxTiposReportesDinamicoEjercicio) {
	//	this.jComboBoxTiposReportesDinamicoEjercicio = jComboBoxTiposReportesDinamicoEjercicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEjercicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoEjercicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEjercicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEjercicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEjercicio = jComboBoxTiposArchivosReportesDinamicoEjercicio;
	//}
	
	public void setBorderResaltarTiposReportesEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEjercicio() {
		return this.jComboBoxTiposGraficosReportesEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEjercicio(
			JComboBox jComboBoxTiposGraficosReportesEjercicio) {
		this.jComboBoxTiposGraficosReportesEjercicio = jComboBoxTiposGraficosReportesEjercicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEjercicio() {
		return this.jComboBoxTiposPaginacionEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEjercicio(
			JComboBox jComboBoxTiposPaginacionEjercicio) {
		this.jComboBoxTiposPaginacionEjercicio = jComboBoxTiposPaginacionEjercicio;
	}
	
	public void setBorderResaltarTiposPaginacionEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEjercicio() {
		return this.jComboBoxTiposRelacionesEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEjercicio() {
		return this.jComboBoxTiposAccionesEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEjercicio(
			JComboBox jComboBoxTiposRelacionesEjercicio) {
		this.jComboBoxTiposRelacionesEjercicio = jComboBoxTiposRelacionesEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEjercicio(
			JComboBox jComboBoxTiposAccionesEjercicio) {
		this.jComboBoxTiposAccionesEjercicio = jComboBoxTiposAccionesEjercicio;
	}
	
	public void setBorderResaltarTiposRelacionesEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEjercicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEjercicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEjercicio() {
	//	return jCheckBoxConGraficoDinamicoEjercicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoEjercicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoEjercicio) {
	//	this.jCheckBoxConGraficoDinamicoEjercicio = jCheckBoxConGraficoDinamicoEjercicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEjercicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEjercicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEjercicio .setBorder(borderResaltar);		
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
		this.ejercicioSessionBean=new EjercicioSessionBean();
		
		this.ejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ejercicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EjercicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ejercicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
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
		
		EjercicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEjercicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEjercicio,this.jTtoolBarEjercicio,
							"nuevo","nuevo","Nuevo"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEjercicio,this.jTtoolBarEjercicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEjercicio,this.jTtoolBarEjercicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEjercicio,this.jTtoolBarEjercicio,
							"duplicar","duplicar","Duplicar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEjercicio,this.jTtoolBarEjercicio,
							"copiar","copiar","Copiar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEjercicio,this.jTtoolBarEjercicio,
							"ver_form","ver_form","Ver"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEjercicio,this.jTtoolBarEjercicio,
							"recargar","recargar","Recargar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEjercicio,this.jTtoolBarEjercicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEjercicio,this.jTtoolBarEjercicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEjercicio,this.jTtoolBarEjercicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEjercicio,this.jTtoolBarEjercicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEjercicio,this.jTtoolBarEjercicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEjercicio,this.jTtoolBarEjercicio,
							"cerrar","cerrar","Salir"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEjercicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEjercicio;
			
				this.jButtonProcesarInformacionToolBarEjercicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEjercicio;
				
		//protected JButton jButtonModificarToolBarEjercicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEjercicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEjercicio=new JMenuMe("General");
		this.jmenuArchivoEjercicio=new JMenuMe("Archivo");
		this.jmenuAccionesEjercicio=new JMenuMe("Acciones");
		this.jmenuDatosEjercicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEjercicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEjercicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEjercicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEjercicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEjercicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEjercicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEjercicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEjercicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEjercicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEjercicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEjercicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEjercicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEjercicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEjercicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEjercicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEjercicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEjercicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEjercicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEjercicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEjercicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEjercicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEjercicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEjercicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEjercicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEjercicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEjercicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEjercicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEjercicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEjercicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEjercicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEjercicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEjercicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEjercicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEjercicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEjercicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEjercicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEjercicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEjercicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEjercicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEjercicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEjercicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEjercicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEjercicio.add(this.jMenuItemCerrarEjercicio);
			
			this.jmenuAccionesEjercicio.add(this.jMenuItemNuevoEjercicio);
			this.jmenuAccionesEjercicio.add(this.jMenuItemNuevoGuardarCambiosEjercicio);
			this.jmenuAccionesEjercicio.add(this.jMenuItemNuevoRelacionesEjercicio);
			this.jmenuAccionesEjercicio.add(this.jMenuItemGuardarCambiosTablaEjercicio);		
			this.jmenuAccionesEjercicio.add(this.jMenuItemDuplicarEjercicio);		
			this.jmenuAccionesEjercicio.add(this.jMenuItemCopiarEjercicio);		
			this.jmenuAccionesEjercicio.add(this.jMenuItemVerFormEjercicio);		
			
			this.jmenuDatosEjercicio.add(this.jMenuItemRecargarInformacionEjercicio);				
			this.jmenuDatosEjercicio.add(this.jMenuItemAnterioresEjercicio);				
			this.jmenuDatosEjercicio.add(this.jMenuItemSiguientesEjercicio);				
			this.jmenuDatosEjercicio.add(this.jMenuItemAbrirOrderByEjercicio);				
			this.jmenuDatosEjercicio.add(this.jMenuItemMostrarOcultarEjercicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEjercicio.add(this.jMenuItemGuardarCambiosEjercicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEjercicio.add(this.jmenuArchivoEjercicio);		
			this.jmenuBarEjercicio.add(this.jmenuAccionesEjercicio);		
			this.jmenuBarEjercicio.add(this.jmenuDatosEjercicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEjercicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEjercicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorFechaInicioEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaInicioEjercicio.setToolTipText("Buscar Por Fecha Inicio ");
		this.jButtonBusquedaPorFechaInicioEjercicio= new JButtonMe();
		this.jButtonBusquedaPorFechaInicioEjercicio.setText("Buscar");
		this.jButtonBusquedaPorFechaInicioEjercicio.setToolTipText("Buscar Por Fecha Inicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaInicioEjercicio,"buscar_button","Buscar Por Fecha Inicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaInicioEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio = new JLabelMe();
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaPorFechaInicioEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio= new JDateChooser();
		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setDate(new Date());
		jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelFK_IdAnioEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioEjercicio.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioEjercicio= new JButtonMe();
		this.jButtonFK_IdAnioEjercicio.setText("Buscar");
		this.jButtonFK_IdAnioEjercicio.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioEjercicio,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioEjercicio = new JLabelMe();
		jLabelid_anioFK_IdAnioEjercicio.setText("Anio :");
		jLabelid_anioFK_IdAnioEjercicio.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioEjercicio= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEjercicio=new JTabbedPane();


		this.jTabbedPaneBusquedasEjercicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEjercicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEjercicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEjercicio = new EjercicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ejercicio DATOS");
			this.jInternalFrameDetalleFormEjercicio = new EjercicioDetalleFormJInternalFrame(jDesktopPane,this.ejercicioSessionBean.getConGuardarRelaciones(),this.ejercicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEjercicio = null;//new EjercicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEjercicio= new GridBagLayout();
		
		
		this.jTableDatosEjercicio = new JTableMe();      
		
		String sToolTipEjercicio="";
		sToolTipEjercicio=EjercicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEjercicio+="(Contabilidad.Ejercicio)";
		}
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEjercicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEjercicio.setToolTipText(sToolTipEjercicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEjercicio);
		this.jTableDatosEjercicio.setAutoCreateRowSorter(true);
		this.jTableDatosEjercicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEjercicio.setRowSelectionAllowed(true);
		this.jTableDatosEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEjercicio = new JButtonMe();
		this.jButtonDuplicarEjercicio = new JButtonMe();
		this.jButtonCopiarEjercicio = new JButtonMe();
		this.jButtonVerFormEjercicio = new JButtonMe();
		this.jButtonNuevoRelacionesEjercicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEjercicio = new JButtonMe();
		this.jButtonCerrarEjercicio = new JButtonMe();
		
		this.jScrollPanelDatosEjercicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralEjercicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ejercicio";
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios" + this.sPath));
		} else {
			this.jScrollPanelDatosEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesEjercicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEjercicio=new ReporteDinamicoJInternalFrame(EjercicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEjercicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEjercicio=new ImportacionJInternalFrame(EjercicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEjercicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEjercicio = new JButtonMe();
		
		this.jButtonAbrirOrderByEjercicio.setText("Orden");
		this.jButtonAbrirOrderByEjercicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEjercicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEjercicio,false,this);
			
			//this.cargarOrderByEjercicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEjercicio,true,this);
			
			//this.cargarOrderByEjercicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEjercicio.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEjercicio.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEjercicio.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEjercicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEjercicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEjercicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEjercicio.setText("Nuevo");
		this.jButtonDuplicarEjercicio.setText("Duplicar");
		this.jButtonCopiarEjercicio.setText("Copiar");
		this.jButtonVerFormEjercicio.setText("Ver");
		this.jButtonNuevoRelacionesEjercicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEjercicio.setText("Guardar");
		this.jButtonCerrarEjercicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEjercicio,"nuevo_button","Nuevo",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEjercicio,"duplicar_button","Duplicar",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEjercicio,"copiar_button","Copiar",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEjercicio,"ver_form","Ver",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEjercicio,"nuevorelaciones_button","Nuevo Rel",this.ejercicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEjercicio,"guardarcambiostabla_button","Guardar",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEjercicio,"cerrar_button","Salir",this.ejercicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEjercicio.setToolTipText("Nuevo"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEjercicio.setToolTipText("Duplicar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEjercicio.setToolTipText("Copiar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEjercicio.setToolTipText("Ver"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEjercicio.setToolTipText("Nuevo Rel"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEjercicio.setToolTipText("Guardar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEjercicio.setToolTipText("Salir"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEjercicio";
		inputMap = this.jButtonNuevoEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEjercicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarEjercicio";
		inputMap = this.jButtonDuplicarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEjercicio"));
		
		//COPIAR
		sMapKey = "CopiarEjercicio";
		inputMap = this.jButtonCopiarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEjercicio"));
		
		//VEr FORM
		sMapKey = "VerFormEjercicio";
		inputMap = this.jButtonVerFormEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEjercicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEjercicio";
		inputMap = this.jButtonNuevoRelacionesEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEjercicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEjercicio";
		inputMap = this.jButtonModificarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEjercicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEjercicio";
		inputMap = this.jButtonCerrarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEjercicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEjercicio";
		inputMap = this.jButtonGuardarCambiosTablaEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEjercicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Ejercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Ejercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Ejercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Ejercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Ejercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEjercicio.setName("jPanelParametrosReportesEjercicio"); 
		
		this.jPanelParametrosReportesAccionesEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEjercicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEjercicio.setName("jPanelParametrosReportesAccionesEjercicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEjercicio = new JButtonMe();
		this.jButtonRecargarInformacionEjercicio.setText("Recargar");
		this.jButtonRecargarInformacionEjercicio.setToolTipText("Recargar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEjercicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEjercicio = new JButtonMe();
		this.jButtonProcesarInformacionEjercicio.setText("Procesar");
		this.jButtonProcesarInformacionEjercicio.setToolTipText("Procesar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEjercicio.setVisible(false);
			
		this.jButtonProcesarInformacionEjercicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEjercicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEjercicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEjercicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEjercicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEjercicio.setText("TIPO");       
		this.jComboBoxTiposReportesEjercicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEjercicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEjercicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEjercicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionEjercicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEjercicio.setText("Accion");
		this.jComboBoxTiposRelacionesEjercicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEjercicio.setText("Accion");
		this.jComboBoxTiposAccionesEjercicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEjercicio.setText("Accion");
		this.jComboBoxTiposSeleccionarEjercicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEjercicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEjercicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEjercicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEjercicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEjercicio = new JLabelMe();
		
		this.jLabelAccionesEjercicio.setText("Acciones");		
		this.jLabelAccionesEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEjercicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEjercicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEjercicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEjercicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEjercicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEjercicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEjercicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEjercicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEjercicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEjercicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEjercicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteEjercicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEjercicio = new JButtonMe();
		//this.jButtonAnterioresEjercicio.setText("<<");
        this.jButtonAnterioresEjercicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEjercicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEjercicio = new JButtonMe();
		//this.jButtonSiguientesEjercicio.setText(">>");
        this.jButtonSiguientesEjercicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEjercicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEjercicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEjercicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosEjercicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEjercicio,"nuevoguardarcambios_button","Nue",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEjercicio";
		inputMap = this.jButtonNuevoGuardarCambiosEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEjercicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEjercicio";
		inputMap = this.jButtonRecargarInformacionEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEjercicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEjercicio";
		inputMap = this.jButtonSiguientesEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEjercicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEjercicio";
		inputMap = this.jButtonAnterioresEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEjercicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEjercicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEjercicio.setMinimumSize(new Dimension(this.getWidth(),EjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEjercicio.setMaximumSize(new Dimension(this.getWidth(),EjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEjercicio.setPreferredSize(new Dimension(this.getWidth(),EjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEjercicio = new GridBagLayout();

			this.jPanelPaginacionEjercicio.setLayout(gridaBagLayoutPaginacionEjercicio);						
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 0;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEjercicio.add(this.jButtonAnterioresEjercicio, this.gridBagConstraintsEjercicio);
					
						
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEjercicio.gridy = 0;
			
			this.jPanelPaginacionEjercicio.add(this.jButtonNuevoGuardarCambiosEjercicio, this.gridBagConstraintsEjercicio);
						
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEjercicio.gridy = 0;
			this.jPanelPaginacionEjercicio.add(this.jButtonSiguientesEjercicio, this.gridBagConstraintsEjercicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 1;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEjercicio.add(this.jButtonNuevoEjercicio, this.gridBagConstraintsEjercicio);
						
			
			
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEjercicio = new GridBagConstraints();
				this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEjercicio.gridy = 1;
				this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEjercicio.add(this.jButtonGuardarCambiosTablaEjercicio, this.gridBagConstraintsEjercicio);
			}
			
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 1;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEjercicio.add(this.jButtonDuplicarEjercicio, this.gridBagConstraintsEjercicio);
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 1;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEjercicio.add(this.jButtonCopiarEjercicio, this.gridBagConstraintsEjercicio);
		
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 1;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEjercicio.add(this.jButtonVerFormEjercicio, this.gridBagConstraintsEjercicio);
		
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 1;
			this.gridBagConstraintsEjercicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEjercicio.add(this.jButtonCerrarEjercicio, this.gridBagConstraintsEjercicio);
		
		
		
		this.jButtonRecargarInformacionEjercicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEjercicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEjercicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEjercicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEjercicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEjercicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEjercicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEjercicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEjercicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEjercicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEjercicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEjercicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEjercicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEjercicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEjercicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEjercicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEjercicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEjercicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEjercicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEjercicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEjercicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEjercicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEjercicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEjercicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEjercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEjercicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Ejercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Ejercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Ejercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Ejercicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEjercicio.setLayout(gridaBagParametrosReportesEjercicio);
			this.jPanelParametrosReportesAccionesEjercicio.setLayout(gridaBagParametrosReportesAccionesEjercicio);
			
			
			this.jPanelParametrosAuxiliar1Ejercicio.setLayout(gridaBagParametrosAuxiliar1Ejercicio);
			this.jPanelParametrosAuxiliar2Ejercicio.setLayout(gridaBagParametrosAuxiliar2Ejercicio);
			this.jPanelParametrosAuxiliar3Ejercicio.setLayout(gridaBagParametrosAuxiliar3Ejercicio);
			this.jPanelParametrosAuxiliar4Ejercicio.setLayout(gridaBagParametrosAuxiliar4Ejercicio);
			//this.jPanelParametrosAuxiliar5Ejercicio.setLayout(gridaBagParametrosAuxiliar2Ejercicio);			
			
			
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEjercicio.add(this.jButtonRecargarInformacionEjercicio, this.gridBagConstraintsEjercicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ejercicio.add(this.jComboBoxTiposPaginacionEjercicio, this.gridBagConstraintsEjercicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ejercicio.add(this.jCheckBoxConAltoMaximoTablaEjercicio, this.gridBagConstraintsEjercicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ejercicio.add(this.jComboBoxTiposArchivosReportesEjercicio, this.gridBagConstraintsEjercicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEjercicio.add(this.jPanelParametrosAuxiliar1Ejercicio, this.gridBagConstraintsEjercicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Ejercicio.add(this.jComboBoxTiposReportesEjercicio, this.gridBagConstraintsEjercicio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEjercicio.add(this.jPanelParametrosAuxiliar4Ejercicio, this.gridBagConstraintsEjercicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEjercicio.add(this.jComboBoxTiposReportesEjercicio, this.gridBagConstraintsEjercicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEjercicio.add(this.jCheckBoxGenerarReporteEjercicio, this.gridBagConstraintsEjercicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEjercicio.add(this.jPanelParametrosAuxiliar2Ejercicio, this.gridBagConstraintsEjercicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEjercicio.add(this.jLabelAccionesEjercicio, this.gridBagConstraintsEjercicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEjercicio = new GridBagConstraints();
				this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEjercicio.add(this.jButtonAbrirOrderByEjercicio, this.gridBagConstraintsEjercicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEjercicio.add(this.jComboBoxTiposSeleccionarEjercicio, this.gridBagConstraintsEjercicio);			
			
			
			/*
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEjercicio.add(this.jCheckBoxSeleccionarTodosEjercicio, this.gridBagConstraintsEjercicio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ejercicio.add(this.jCheckBoxSeleccionarTodosEjercicio, this.gridBagConstraintsEjercicio);															
				
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ejercicio.add(this.jCheckBoxSeleccionadosEjercicio, this.gridBagConstraintsEjercicio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEjercicio.add(this.jPanelParametrosAuxiliar3Ejercicio, this.gridBagConstraintsEjercicio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEjercicio.add(this.jComboBoxTiposAccionesEjercicio, this.gridBagConstraintsEjercicio);
	
				
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEjercicio.add(this.jTextFieldValorCampoGeneralEjercicio, this.gridBagConstraintsEjercicio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEjercicio = new GridBagLayout();

			this.jScrollPanelDatosEjercicio.setLayout(gridaBagLayoutDatosEjercicio);
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = 0;
			this.gridBagConstraintsEjercicio.gridx = 0;
			
			this.jScrollPanelDatosEjercicio.add(this.jTableDatosEjercicio, this.gridBagConstraintsEjercicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEjercicio.setViewportView(this.jTableDatosEjercicio);
		this.jTableDatosEjercicio.setFillsViewportHeight(true);
		this.jTableDatosEjercicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEjercicio= new GridBagLayout();
		this.jPanelAccionesEjercicio.setLayout(gridaBagLayoutAccionesEjercicio);
		
		
		/*	
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 0;
			
		this.jPanelAccionesEjercicio.add(this.jButtonNuevoEjercicio, this.gridBagConstraintsEjercicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorFechaInicioEjercicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaInicioEjercicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioEjercicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioEjercicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaInicioEjercicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaInicioEjercicio.setLayout(gridaBagLayoutBusquedaPorFechaInicioEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 0;
		gridBagConstraintsEjercicio.gridx = 0;
		jPanelBusquedaPorFechaInicioEjercicio.add(jLabelfecha_inicioBusquedaPorFechaInicioEjercicio, gridBagConstraintsEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 0;
		gridBagConstraintsEjercicio.gridx = 1;
		jPanelBusquedaPorFechaInicioEjercicio.add(jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio, gridBagConstraintsEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 1;
		gridBagConstraintsEjercicio.gridx =1;
		jPanelBusquedaPorFechaInicioEjercicio.add(jButtonBusquedaPorFechaInicioEjercicio, gridBagConstraintsEjercicio);

		jTabbedPaneBusquedasEjercicio.addTab("1.-Por Fecha Inicio ", jPanelBusquedaPorFechaInicioEjercicio);
		jTabbedPaneBusquedasEjercicio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAnioEjercicio= new GridBagLayout();
		gridaBagLayoutFK_IdAnioEjercicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioEjercicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioEjercicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioEjercicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioEjercicio.setLayout(gridaBagLayoutFK_IdAnioEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 0;
		gridBagConstraintsEjercicio.gridx = 0;
		jPanelFK_IdAnioEjercicio.add(jLabelid_anioFK_IdAnioEjercicio, gridBagConstraintsEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 0;
		gridBagConstraintsEjercicio.gridx = 1;
		jPanelFK_IdAnioEjercicio.add(jComboBoxid_anioFK_IdAnioEjercicio, gridBagConstraintsEjercicio);

		gridBagConstraintsEjercicio = new GridBagConstraints();
		gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEjercicio.gridy = 1;
		gridBagConstraintsEjercicio.gridx =1;
		jPanelFK_IdAnioEjercicio.add(jButtonFK_IdAnioEjercicio, gridBagConstraintsEjercicio);

		jTabbedPaneBusquedasEjercicio.addTab("2.-Por Anio ", jPanelFK_IdAnioEjercicio);
		jTabbedPaneBusquedasEjercicio.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEjercicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEjercicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEjercicio = new GridBagConstraints();						
			this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEjercicio.gridx = 0;		
			//this.gridBagConstraintsEjercicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEjercicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEjercicio, this.gridBagConstraintsEjercicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEjercicio.gridx = 0;		
		//this.gridBagConstraintsEjercicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEjercicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEjercicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEjercicio.gridx = 0;		
			this.gridBagConstraintsEjercicio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEjercicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEjercicio, this.gridBagConstraintsEjercicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEjercicio, this.gridBagConstraintsEjercicio);								
		
		
		/*
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEjercicio, this.gridBagConstraintsEjercicio);
		*/		
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEjercicio.gridx =0;
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEjercicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEjercicio, this.gridBagConstraintsEjercicio);
				
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEjercicio, this.gridBagConstraintsEjercicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EjercicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEjercicio = new GridBagLayout();
			this.jPanelBusquedasParametrosEjercicio.setLayout(gridaBagLayoutBusquedasParametrosEjercicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEjercicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEjercicio, this.gridBagConstraintsEjercicio);
			
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEjercicio, this.gridBagConstraintsEjercicio);
		
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEjercicio, this.gridBagConstraintsEjercicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEjercicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEjercicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEjercicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEjercicio.setName("jPanelReporteDinamicoEjercicio"); 
		
		this.jPanelReporteDinamicoEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEjercicio.setLayout(gridaBagLayoutReporteDinamicoEjercicio);
		
		
		this.jInternalFrameReporteDinamicoEjercicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEjercicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEjercicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEjercicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEjercicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEjercicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoEjercicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoEjercicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEjercicio = new JLabelMe();

		this.jLabelColumnasSelectReporteEjercicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEjercicio.add(this.jLabelColumnasSelectReporteEjercicio, this.gridBagConstraintsEjercicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEjercicio = new JList<Reporte>();
		this.jListColumnasSelectReporteEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEjercicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEjercicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEjercicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEjercicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEjercicio=new JScrollPane(this.jListColumnasSelectReporteEjercicio);
			
			this.jScrollColumnasSelectReporteEjercicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEjercicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEjercicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEjercicio.add(this.jListColumnasSelectReporteEjercicio, this.gridBagConstraintsEjercicio);
		this.jPanelReporteDinamicoEjercicio.add(this.jScrollColumnasSelectReporteEjercicio, this.gridBagConstraintsEjercicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEjercicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteEjercicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEjercicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEjercicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEjercicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEjercicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEjercicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEjercicio=new JScrollPane(this.jListRelacionesSelectReporteEjercicio);
			
			this.jScrollRelacionesSelectReporteEjercicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEjercicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEjercicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEjercicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEjercicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoEjercicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEjercicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEjercicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEjercicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEjercicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEjercicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEjercicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEjercicio.add(this.jLabelGenerarExcelReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEjercicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEjercicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEjercicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEjercicio.setToolTipText("Generar EXCEL"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEjercicio.add(this.jButtonGenerarExcelReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEjercicio.add(this.jComboBoxTiposReportesDinamicoEjercicio, this.gridBagConstraintsEjercicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEjercicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEjercicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEjercicio.add(this.jLabelTiposArchivoReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEjercicio.add(this.jComboBoxTiposArchivosReportesDinamicoEjercicio, this.gridBagConstraintsEjercicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEjercicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEjercicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEjercicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEjercicio.setToolTipText("Generar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEjercicio.add(this.jButtonGenerarReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEjercicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEjercicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEjercicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEjercicio.setToolTipText("Cancelar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEjercicio.add(this.jButtonCerrarReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEjercicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEjercicio= new JScrollPane(jPanelReporteDinamicoEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEjercicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEjercicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEjercicio);
		this.jInternalFrameReporteDinamicoEjercicio.getContentPane().add(this.jScrollPanelReporteDinamicoEjercicio, this.gridBagConstraintsEjercicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEjercicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEjercicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEjercicio.setName("jPanelImportacionEjercicio"); 
		
		this.jPanelImportacionEjercicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEjercicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEjercicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEjercicio.setLayout(gridaBagLayoutImportacionEjercicio);
		
		
		this.jInternalFrameImportacionEjercicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEjercicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEjercicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEjercicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEjercicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEjercicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEjercicio.setResizable(true);
	    this.jInternalFrameImportacionEjercicio.setClosable(true);
	    this.jInternalFrameImportacionEjercicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEjercicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEjercicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEjercicio.setResizable(true);
	    this.jInternalFrameImportacionEjercicio.setClosable(true);
	    this.jInternalFrameImportacionEjercicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEjercicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEjercicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEjercicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEjercicio = new JLabelMe();

		this.jLabelArchivoImportacionEjercicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEjercicio.add(this.jLabelArchivoImportacionEjercicio, this.gridBagConstraintsEjercicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEjercicio = new JFileChooser();		
		this.jFileChooserImportacionEjercicio.setToolTipText("ESCOGER ARCHIVO"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEjercicio = new JButtonMe();
		this.jButtonAbrirImportacionEjercicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEjercicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEjercicio.setToolTipText("Generar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEjercicio.add(this.jButtonAbrirImportacionEjercicio, this.gridBagConstraintsEjercicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEjercicio = new JLabelMe();

		this.jLabelPathArchivoImportacionEjercicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEjercicio.add(this.jLabelPathArchivoImportacionEjercicio, this.gridBagConstraintsEjercicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEjercicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEjercicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEjercicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEjercicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEjercicio.add(this.jTextFieldPathArchivoImportacionEjercicio, this.gridBagConstraintsEjercicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEjercicio = new JButtonMe();
		this.jButtonGenerarImportacionEjercicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEjercicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEjercicio.setToolTipText("Generar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEjercicio.add(this.jButtonGenerarImportacionEjercicio, this.gridBagConstraintsEjercicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEjercicio = new JButtonMe();
		this.jButtonCerrarImportacionEjercicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEjercicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEjercicio.setToolTipText("Cancelar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEjercicio.add(this.jButtonCerrarImportacionEjercicio, this.gridBagConstraintsEjercicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEjercicio = new GridBagLayout();
		
		this.jScrollPanelImportacionEjercicio= new JScrollPane(jPanelImportacionEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iPosYImportacion;
		this.gridBagConstraintsEjercicio.gridx =iPosXImportacion;
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEjercicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEjercicio);
		this.jInternalFrameImportacionEjercicio.getContentPane().add(this.jScrollPanelImportacionEjercicio, this.gridBagConstraintsEjercicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEjercicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEjercicio = new JButtonMe();
			this.jButtonAbrirOrderByEjercicio.setText("Orden");
			this.jButtonAbrirOrderByEjercicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEjercicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEjercicio";
			inputMap = this.jButtonAbrirOrderByEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEjercicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByEjercicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEjercicio.setName("jPanelOrderByEjercicio"); 
			
			this.jPanelOrderByEjercicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEjercicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEjercicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEjercicio.setLayout(gridaBagLayoutOrderByEjercicio);
			
			
			this.jTableDatosEjercicioOrderBy = new JTableMe();        
			this.jTableDatosEjercicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEjercicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEjercicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEjercicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEjercicioOrderBy.setViewportView(this.jTableDatosEjercicioOrderBy);
			this.jTableDatosEjercicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEjercicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEjercicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEjercicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEjercicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEjercicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEjercicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEjercicio.setTitle("Orden");
			this.jInternalFrameOrderByEjercicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEjercicio.setResizable(true);
			this.jInternalFrameOrderByEjercicio.setClosable(true);
			this.jInternalFrameOrderByEjercicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEjercicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEjercicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEjercicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEjercicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEjercicio.ipady =150;
				
			this.jPanelOrderByEjercicio.add(jScrollPanelDatosEjercicioOrderBy, this.gridBagConstraintsEjercicio);//this.jTableDatosEjercicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEjercicio = new JButtonMe();
			this.jButtonCerrarOrderByEjercicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEjercicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEjercicio.setToolTipText("Cancelar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEjercicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEjercicio.add(this.jButtonCerrarOrderByEjercicio, this.gridBagConstraintsEjercicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEjercicio = new GridBagLayout();
			
			this.jScrollPanelOrderByEjercicio= new JScrollPane(jPanelOrderByEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsEjercicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEjercicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEjercicio);
			
			this.jInternalFrameOrderByEjercicio.getContentPane().add(this.jScrollPanelOrderByEjercicio, this.gridBagConstraintsEjercicio);			
		
		} else {
			this.jButtonAbrirOrderByEjercicio = new JButtonMe();
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
			&& this.ejercicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEjercicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEjercicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEjercicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEjercicio.getRowHeight();//EjercicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEjercicio.isSelected()) {
					iHeightTable=EjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEjercicio.isSelected()) {
					iHeightTable=EjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEjercicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEjercicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEjercicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEjercicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEjercicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEjercicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEjercicio!=null && this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy()!=null) {
			//if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEjercicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEjercicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEjercicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEjercicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEjercicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEjercicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ejercicioLogic.getEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ejercicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Ejercicio> TraerEjercicioBeans(List<Ejercicio> ejercicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Ejercicio ejercicio:ejercicios) {
					
				if(!(EjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ejercicio.setsDetalleGeneralEntityReporte(EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicio));
										
					ejercicio.setesta_activo_descripcion(EjercicioConstantesFunciones.getesta_activoDescripcion(ejercicio));	
					
						
					
				} else  {
							
					//ejercicio.setsDetalleGeneralEntityReporte(ejercicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//ejerciciobeans.add(ejerciciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ejercicios;
    }
	//PARA REPORTES FIN
}
