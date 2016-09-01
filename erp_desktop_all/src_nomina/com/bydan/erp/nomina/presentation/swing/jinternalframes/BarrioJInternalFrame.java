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
import com.bydan.erp.nomina.util.BarrioConstantesFunciones;

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
public class BarrioJInternalFrame extends BarrioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBarrio;
	
	protected JMenuBar jmenuBarBarrio;
	
	protected JMenu jmenuBarrio;
	protected JMenu jmenuDatosBarrio;
	protected JMenu jmenuArchivoBarrio;
	protected JMenu jmenuAccionesBarrio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBarrio;	
	protected GridBagConstraints gridBagConstraintsBarrio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BarrioDetalleFormJInternalFrame jInternalFrameDetalleFormBarrio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBarrio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBarrio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";
	
	public BarrioSessionBean barrioSessionBean;
		
	
	
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Barrio> barrios;		
	public List<Barrio> barriosEliminados;	
	public List<Barrio> barriosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBarrio;		
	protected JButton jButtonAbrirOrderByBarrio;
	
	
	//protected JPanel jPanelOrderByBarrio;
	//public JScrollPane jScrollPanelOrderByBarrio;	
	//protected JButton jButtonCerrarOrderByBarrio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BarrioLogic barrioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBarrio;
	public JScrollPane jScrollPanelDatosEdicionBarrio;
	public JScrollPane jScrollPanelDatosGeneralBarrio;
    
	
	
	//public JScrollPane jScrollPanelDatosBarrioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBarrio;
	//public JScrollPane jScrollPanelImportacionBarrio;
	
	
	
	protected JPanel jPanelAccionesBarrio;
	
    protected JPanel jPanelPaginacionBarrio;
    protected JPanel jPanelParametrosReportesBarrio;
	protected JPanel jPanelParametrosReportesAccionesBarrio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Barrio;
	protected JPanel jPanelParametrosAuxiliar2Barrio;
	protected JPanel jPanelParametrosAuxiliar3Barrio;
	protected JPanel jPanelParametrosAuxiliar4Barrio;
	//protected JPanel jPanelParametrosAuxiliar5Barrio;
	
	
	
	//protected JPanel jPanelReporteDinamicoBarrio;
	//protected JPanel jPanelImportacionBarrio;
	
	
	public JTable jTableDatosBarrio;
	
	
	
	//public JTable jTableDatosBarrioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBarrio;
	protected JButton jButtonDuplicarBarrio;
	protected JButton jButtonCopiarBarrio;
	protected JButton jButtonVerFormBarrio;
	protected JButton jButtonNuevoRelacionesBarrio;
	protected JButton jButtonModificarBarrio;
	
    protected JButton jButtonGuardarCambiosTablaBarrio;
	protected JButton jButtonCerrarBarrio;
	
	
	protected JButton jButtonRecargarInformacionBarrio;
	protected JButton jButtonProcesarInformacionBarrio;
	
	
	protected JButton jButtonAnterioresBarrio;
	protected JButton jButtonSiguientesBarrio;
	protected JButton jButtonNuevoGuardarCambiosBarrio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBarrio;
	//protected JButton jButtonCerrarReporteDinamicoBarrio;
	//protected JButton jButtonGenerarExcelReporteDinamicoBarrio;	
	
	
	
	//protected JButton jButtonAbrirImportacionBarrio;
	//protected JButton jButtonGenerarImportacionBarrio;
	//protected JButton jButtonCerrarImportacionBarrio;
	//protected JFileChooser jFileChooserImportacionBarrio;
	//protected File fileImportacionBarrio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBarrio;
	protected JButton jButtonDuplicarToolBarBarrio;
	protected JButton jButtonNuevoRelacionesToolBarBarrio;
	
	
	public JButton jButtonGuardarCambiosToolBarBarrio;
	protected JButton jButtonCopiarToolBarBarrio;
	protected JButton jButtonVerFormToolBarBarrio;
	public JButton jButtonGuardarCambiosTablaToolBarBarrio;
	protected JButton jButtonMostrarOcultarTablaToolBarBarrio;
	protected JButton jButtonCerrarToolBarBarrio;
	
	protected JButton jButtonRecargarInformacionToolBarBarrio;
	protected JButton jButtonProcesarInformacionToolBarBarrio;
	protected JButton jButtonAnterioresToolBarBarrio;
	protected JButton jButtonSiguientesToolBarBarrio;
	protected JButton jButtonNuevoGuardarCambiosToolBarBarrio;
	protected JButton jButtonAbrirOrderByToolBarBarrio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBarrio;
	protected JMenuItem jMenuItemDuplicarBarrio;
	protected JMenuItem jMenuItemNuevoRelacionesBarrio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBarrio;
	protected JMenuItem jMenuItemCopiarBarrio;
	protected JMenuItem jMenuItemVerFormBarrio;
	protected JMenuItem jMenuItemGuardarCambiosTablaBarrio;
	protected JMenuItem jMenuItemCerrarBarrio;
	protected JMenuItem jMenuItemDetalleCerrarBarrio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBarrio;
	protected JMenuItem jMenuItemDetalleMostarOcultarBarrio;
	
	protected JMenuItem jMenuItemRecargarInformacionBarrio;
	protected JMenuItem jMenuItemProcesarInformacionBarrio;
	protected JMenuItem jMenuItemAnterioresBarrio;
	protected JMenuItem jMenuItemSiguientesBarrio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBarrio;
	protected JMenuItem jMenuItemAbrirOrderByBarrio;
	protected JMenuItem jMenuItemMostrarOcultarBarrio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBarrio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBarrio;
	protected JCheckBox jCheckBoxSeleccionadosBarrio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBarrio;
	protected JCheckBox jCheckBoxConGraficoReporteBarrio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBarrio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBarrio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBarrio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBarrio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBarrio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBarrio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBarrio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBarrio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBarrio;
	protected JTextField jTextFieldValorCampoGeneralBarrio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBarrio;
	//public JList<Reporte> jListColumnasSelectReporteBarrio;
	//public JScrollPane jScrollColumnasSelectReporteBarrio;
	
	//public JLabel jLabelRelacionesSelectReporteBarrio;
	//public JList<Reporte> jListRelacionesSelectReporteBarrio;
	//public JScrollPane jScrollRelacionesSelectReporteBarrio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBarrio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBarrio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBarrio;
	//public JLabel jLabelTiposArchivoReporteDinamicoBarrio;
	
		
	//public JLabel jLabelArchivoImportacionBarrio;	
	//public JLabel jLabelPathArchivoImportacionBarrio;
	//protected JTextField jTextFieldPathArchivoImportacionBarrio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBarrio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBarrio;
	
	//public JLabel jLabelColumnaCategoriaValorBarrio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBarrio;
	
	//public JLabel jLabelColumnasValoresGraficoBarrio;
	//public JList<Reporte> jListColumnasValoresGraficoBarrio;
	//public JScrollPane jScrollColumnasValoresGraficoBarrio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBarrio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBarrio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBarrio;
	public JPanel jPanelFK_IdCantonBarrio;
	public JButton jButtonFK_IdCantonBarrio;
	public JPanel jPanelFK_IdParroquiaBarrio;
	public JButton jButtonFK_IdParroquiaBarrio;
	public JPanel jPanelFK_IdProvinciaBarrio;
	public JButton jButtonFK_IdProvinciaBarrio;
	
	public JPanel jPanelid_cantonFK_IdCantonBarrio;
	public JLabel jLabelid_cantonFK_IdCantonBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonFK_IdCantonBarrio;
	public JButton jButtonid_cantonFK_IdCantonBarrio= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonBarrioUpdate= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonBarrioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parroquiaFK_IdParroquiaBarrio;
	public JLabel jLabelid_parroquiaFK_IdParroquiaBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaFK_IdParroquiaBarrio;
	public JButton jButtonid_parroquiaFK_IdParroquiaBarrio= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaBarrioUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaBarrioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaBarrio;
	public JLabel jLabelid_provinciaFK_IdProvinciaBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaBarrio;
	public JButton jButtonid_provinciaFK_IdProvinciaBarrio= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaBarrioUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaBarrioBusqueda= new JButtonMe();

	
	
	
	
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
	public BarrioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBarrio)	{
		this.jButtonRecargarInformacionBarrio = jButtonRecargarInformacionBarrio;
	}
	
	public JButton getjButtonProcesarInformacionBarrio() {
		return this.jButtonProcesarInformacionBarrio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBarrio)	{
		this.jButtonProcesarInformacionBarrio = jButtonProcesarInformacionBarrio;
	}
	
	
	public JButton getjButtonRecargarInformacionBarrio() {
		return this.jButtonRecargarInformacionBarrio;
	}
	
	
	public List<Barrio> getbarrios() {
		return this.barrios;
	}

	public void setbarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}
	
	public List<Barrio> getbarriosAux() {
		return this.barriosAux;
	}

	public void setbarriosAux(List<Barrio> barriosAux) {
		this.barriosAux = barriosAux;
	}
	
	public List<Barrio> getbarriosEliminados() {
		return this.barriosEliminados;
	}

	public void setBarriosEliminados(List<Barrio> barriosEliminados) {
		this.barriosEliminados = barriosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBarrio() {
		return jComboBoxTiposSeleccionarBarrio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBarrio(
			JComboBox jComboBoxTiposSeleccionarBarrio) {
		this.jComboBoxTiposSeleccionarBarrio = jComboBoxTiposSeleccionarBarrio;
	}
	
	public void setBorderResaltarTiposSeleccionarBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBarrio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBarrio() {
		return jTextFieldValorCampoGeneralBarrio;
	}

	public void setjTextFieldValorCampoGeneralBarrio(
			JTextField jTextFieldValorCampoGeneralBarrio) {
		this.jTextFieldValorCampoGeneralBarrio = jTextFieldValorCampoGeneralBarrio;
	}

	public void setBorderResaltarValorCampoGeneralBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBarrio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBarrio() {
		return this.jCheckBoxSeleccionarTodosBarrio;
	}

	public void setjCheckBoxSeleccionarTodosBarrio(
			JCheckBox jCheckBoxSeleccionarTodosBarrio) {
		this.jCheckBoxSeleccionarTodosBarrio = jCheckBoxSeleccionarTodosBarrio;
	}

	public void setBorderResaltarSeleccionarTodosBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBarrio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBarrio() {
		return this.jCheckBoxSeleccionadosBarrio;
	}

	public void setjCheckBoxSeleccionadosBarrio(
			JCheckBox jCheckBoxSeleccionadosBarrio) {
		this.jCheckBoxSeleccionadosBarrio = jCheckBoxSeleccionadosBarrio;
	}
	
	public void setBorderResaltarSeleccionadosBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBarrio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBarrio() {
		return this.jComboBoxTiposArchivosReportesBarrio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBarrio(
			JComboBox jComboBoxTiposArchivosReportesBarrio) {
		this.jComboBoxTiposArchivosReportesBarrio = jComboBoxTiposArchivosReportesBarrio;
	}

	public void setBorderResaltarTiposArchivosReportesBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBarrio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBarrio() {
		return this.jComboBoxTiposReportesBarrio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBarrio(
			JComboBox jComboBoxTiposReportesBarrio) {
		this.jComboBoxTiposReportesBarrio = jComboBoxTiposReportesBarrio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBarrio() {
	//	return jComboBoxTiposReportesDinamicoBarrio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBarrio(
	//		JComboBox jComboBoxTiposReportesDinamicoBarrio) {
	//	this.jComboBoxTiposReportesDinamicoBarrio = jComboBoxTiposReportesDinamicoBarrio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBarrio() {
	//	return jComboBoxTiposArchivosReportesDinamicoBarrio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBarrio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBarrio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBarrio = jComboBoxTiposArchivosReportesDinamicoBarrio;
	//}
	
	public void setBorderResaltarTiposReportesBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBarrio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBarrio() {
		return this.jComboBoxTiposGraficosReportesBarrio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBarrio(
			JComboBox jComboBoxTiposGraficosReportesBarrio) {
		this.jComboBoxTiposGraficosReportesBarrio = jComboBoxTiposGraficosReportesBarrio;
	}
	
	public void setBorderResaltarTiposGraficosReportesBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBarrio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBarrio() {
		return this.jComboBoxTiposPaginacionBarrio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBarrio(
			JComboBox jComboBoxTiposPaginacionBarrio) {
		this.jComboBoxTiposPaginacionBarrio = jComboBoxTiposPaginacionBarrio;
	}
	
	public void setBorderResaltarTiposPaginacionBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBarrio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBarrio() {
		return this.jComboBoxTiposRelacionesBarrio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBarrio() {
		return this.jComboBoxTiposAccionesBarrio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBarrio(
			JComboBox jComboBoxTiposRelacionesBarrio) {
		this.jComboBoxTiposRelacionesBarrio = jComboBoxTiposRelacionesBarrio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBarrio(
			JComboBox jComboBoxTiposAccionesBarrio) {
		this.jComboBoxTiposAccionesBarrio = jComboBoxTiposAccionesBarrio;
	}
	
	public void setBorderResaltarTiposRelacionesBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBarrio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBarrio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBarrio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBarrio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBarrio() {
	//	return jCheckBoxConGraficoDinamicoBarrio;
	//}

	//public void setjCheckBoxConGraficoDinamicoBarrio(
	//		JCheckBox jCheckBoxConGraficoDinamicoBarrio) {
	//	this.jCheckBoxConGraficoDinamicoBarrio = jCheckBoxConGraficoDinamicoBarrio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBarrio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBarrio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBarrio .setBorder(borderResaltar);		
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
		this.barrioSessionBean=new BarrioSessionBean();
		
		this.barrioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.barrioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.barrioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BarrioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BarrioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BarrioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BarrioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BarrioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Barrio MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
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
		
		BarrioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBarrio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBarrio,this.jTtoolBarBarrio,
							"nuevo","nuevo","Nuevo"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBarrio,this.jTtoolBarBarrio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBarrio,this.jTtoolBarBarrio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBarrio,this.jTtoolBarBarrio,
							"duplicar","duplicar","Duplicar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBarrio,this.jTtoolBarBarrio,
							"copiar","copiar","Copiar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBarrio,this.jTtoolBarBarrio,
							"ver_form","ver_form","Ver"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBarrio,this.jTtoolBarBarrio,
							"recargar","recargar","Recargar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBarrio,this.jTtoolBarBarrio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBarrio,this.jTtoolBarBarrio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBarrio,this.jTtoolBarBarrio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBarrio,this.jTtoolBarBarrio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBarrio,this.jTtoolBarBarrio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBarrio,this.jTtoolBarBarrio,
							"cerrar","cerrar","Salir"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBarrio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBarrio;
			
				this.jButtonProcesarInformacionToolBarBarrio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBarrio;
				
		//protected JButton jButtonModificarToolBarBarrio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBarrio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBarrio=new JMenuMe("General");
		this.jmenuArchivoBarrio=new JMenuMe("Archivo");
		this.jmenuAccionesBarrio=new JMenuMe("Acciones");
		this.jmenuDatosBarrio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBarrio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBarrio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBarrio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBarrio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBarrio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBarrio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBarrio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBarrio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBarrio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBarrio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBarrio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBarrio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBarrio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBarrio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBarrio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBarrio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBarrio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBarrio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBarrio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBarrio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBarrio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBarrio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBarrio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBarrio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBarrio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBarrio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBarrio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBarrio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBarrio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBarrio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBarrio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBarrio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBarrio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBarrio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBarrio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBarrio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBarrio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBarrio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBarrio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBarrio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBarrio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBarrio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBarrio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBarrio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBarrio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBarrio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBarrio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBarrio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBarrio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBarrio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBarrio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBarrio.add(this.jMenuItemCerrarBarrio);
			
			this.jmenuAccionesBarrio.add(this.jMenuItemNuevoBarrio);
			this.jmenuAccionesBarrio.add(this.jMenuItemNuevoGuardarCambiosBarrio);
			this.jmenuAccionesBarrio.add(this.jMenuItemNuevoRelacionesBarrio);
			this.jmenuAccionesBarrio.add(this.jMenuItemGuardarCambiosTablaBarrio);		
			this.jmenuAccionesBarrio.add(this.jMenuItemDuplicarBarrio);		
			this.jmenuAccionesBarrio.add(this.jMenuItemCopiarBarrio);		
			this.jmenuAccionesBarrio.add(this.jMenuItemVerFormBarrio);		
			
			this.jmenuDatosBarrio.add(this.jMenuItemRecargarInformacionBarrio);				
			this.jmenuDatosBarrio.add(this.jMenuItemAnterioresBarrio);				
			this.jmenuDatosBarrio.add(this.jMenuItemSiguientesBarrio);				
			this.jmenuDatosBarrio.add(this.jMenuItemAbrirOrderByBarrio);				
			this.jmenuDatosBarrio.add(this.jMenuItemMostrarOcultarBarrio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBarrio.add(this.jMenuItemGuardarCambiosBarrio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBarrio.add(this.jmenuArchivoBarrio);		
			this.jmenuBarBarrio.add(this.jmenuAccionesBarrio);		
			this.jmenuBarBarrio.add(this.jmenuDatosBarrio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBarrio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBarrio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCantonBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCantonBarrio.setToolTipText("Buscar Por Canton ");
		this.jButtonFK_IdCantonBarrio= new JButtonMe();
		this.jButtonFK_IdCantonBarrio.setText("Buscar");
		this.jButtonFK_IdCantonBarrio.setToolTipText("Buscar Por Canton ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCantonBarrio,"buscar_button","Buscar Por Canton ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCantonBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cantonFK_IdCantonBarrio = new JLabelMe();
		jLabelid_cantonFK_IdCantonBarrio.setText("Canton :");
		jLabelid_cantonFK_IdCantonBarrio.setToolTipText("Canton");
		jLabelid_cantonFK_IdCantonBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cantonFK_IdCantonBarrio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cantonFK_IdCantonBarrio= new JComboBoxMe();
		jComboBoxid_cantonFK_IdCantonBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonFK_IdCantonBarrio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParroquiaBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParroquiaBarrio.setToolTipText("Buscar Por Parroquia ");
		this.jButtonFK_IdParroquiaBarrio= new JButtonMe();
		this.jButtonFK_IdParroquiaBarrio.setText("Buscar");
		this.jButtonFK_IdParroquiaBarrio.setToolTipText("Buscar Por Parroquia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParroquiaBarrio,"buscar_button","Buscar Por Parroquia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParroquiaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parroquiaFK_IdParroquiaBarrio = new JLabelMe();
		jLabelid_parroquiaFK_IdParroquiaBarrio.setText("Parroquia :");
		jLabelid_parroquiaFK_IdParroquiaBarrio.setToolTipText("Parroquia");
		jLabelid_parroquiaFK_IdParroquiaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaFK_IdParroquiaBarrio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parroquiaFK_IdParroquiaBarrio= new JComboBoxMe();
		jComboBoxid_parroquiaFK_IdParroquiaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaFK_IdParroquiaBarrio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaBarrio.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaBarrio= new JButtonMe();
		this.jButtonFK_IdProvinciaBarrio.setText("Buscar");
		this.jButtonFK_IdProvinciaBarrio.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaBarrio,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaBarrio = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaBarrio.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaBarrio.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaBarrio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaBarrio= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaBarrio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBarrio=new JTabbedPane();


		this.jTabbedPaneBusquedasBarrio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBarrio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBarrio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBarrio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBarrio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBarrio = new BarrioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Barrio DATOS");
			this.jInternalFrameDetalleFormBarrio = new BarrioDetalleFormJInternalFrame(jDesktopPane,this.barrioSessionBean.getConGuardarRelaciones(),this.barrioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBarrio = null;//new BarrioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBarrio= new GridBagLayout();
		
		
		this.jTableDatosBarrio = new JTableMe();      
		
		String sToolTipBarrio="";
		sToolTipBarrio=BarrioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBarrio+="(Nomina.Barrio)";
		}
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			sToolTipBarrio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBarrio.setToolTipText(sToolTipBarrio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBarrio);
		this.jTableDatosBarrio.setAutoCreateRowSorter(true);
		this.jTableDatosBarrio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBarrio.setRowSelectionAllowed(true);
		this.jTableDatosBarrio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBarrio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBarrio = new JButtonMe();
		this.jButtonDuplicarBarrio = new JButtonMe();
		this.jButtonCopiarBarrio = new JButtonMe();
		this.jButtonVerFormBarrio = new JButtonMe();
		this.jButtonNuevoRelacionesBarrio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBarrio = new JButtonMe();
		this.jButtonCerrarBarrio = new JButtonMe();
		
		this.jScrollPanelDatosBarrio = new JScrollPane();   
        this.jScrollPanelDatosGeneralBarrio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Barrio";
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios" + this.sPath));
		} else {
			this.jScrollPanelDatosBarrio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBarrio.setToolTipText("Acciones");
        this.jPanelAccionesBarrio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBarrio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBarrio=new ReporteDinamicoJInternalFrame(BarrioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBarrio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBarrio=new ImportacionJInternalFrame(BarrioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBarrio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBarrio = new JButtonMe();
		
		this.jButtonAbrirOrderByBarrio.setText("Orden");
		this.jButtonAbrirOrderByBarrio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBarrio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBarrio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBarrio,false,this);
			
			//this.cargarOrderByBarrio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBarrio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBarrio,true,this);
			
			//this.cargarOrderByBarrio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBarrio.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosBarrio.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosBarrio.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosBarrio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBarrio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBarrio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBarrio.setText("Nuevo");
		this.jButtonDuplicarBarrio.setText("Duplicar");
		this.jButtonCopiarBarrio.setText("Copiar");
		this.jButtonVerFormBarrio.setText("Ver");
		this.jButtonNuevoRelacionesBarrio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBarrio.setText("Guardar");
		this.jButtonCerrarBarrio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBarrio,"nuevo_button","Nuevo",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBarrio,"duplicar_button","Duplicar",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBarrio,"copiar_button","Copiar",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBarrio,"ver_form","Ver",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBarrio,"nuevorelaciones_button","Nuevo Rel",this.barrioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBarrio,"guardarcambiostabla_button","Guardar",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBarrio,"cerrar_button","Salir",this.barrioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBarrio.setToolTipText("Nuevo"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBarrio.setToolTipText("Duplicar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBarrio.setToolTipText("Copiar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBarrio.setToolTipText("Ver"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBarrio.setToolTipText("Nuevo Rel"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBarrio.setToolTipText("Guardar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBarrio.setToolTipText("Salir"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBarrio";
		inputMap = this.jButtonNuevoBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBarrio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBarrio"));
		
		//DUPLICAR
		sMapKey = "DuplicarBarrio";
		inputMap = this.jButtonDuplicarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBarrio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBarrio"));
		
		//COPIAR
		sMapKey = "CopiarBarrio";
		inputMap = this.jButtonCopiarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBarrio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBarrio"));
		
		//VEr FORM
		sMapKey = "VerFormBarrio";
		inputMap = this.jButtonVerFormBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBarrio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBarrio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBarrio";
		inputMap = this.jButtonNuevoRelacionesBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBarrio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBarrio";
		inputMap = this.jButtonModificarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBarrio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBarrio";
		inputMap = this.jButtonCerrarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBarrio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBarrio";
		inputMap = this.jButtonGuardarCambiosTablaBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBarrio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Barrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Barrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Barrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Barrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Barrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBarrio.setName("jPanelParametrosReportesBarrio"); 
		
		this.jPanelParametrosReportesAccionesBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBarrio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBarrio.setName("jPanelParametrosReportesAccionesBarrio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBarrio = new JButtonMe();
		this.jButtonRecargarInformacionBarrio.setText("Recargar");
		this.jButtonRecargarInformacionBarrio.setToolTipText("Recargar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBarrio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBarrio = new JButtonMe();
		this.jButtonProcesarInformacionBarrio.setText("Procesar");
		this.jButtonProcesarInformacionBarrio.setToolTipText("Procesar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBarrio.setVisible(false);
			
		this.jButtonProcesarInformacionBarrio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBarrio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBarrio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBarrio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBarrio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBarrio.setText("TIPO");       
		this.jComboBoxTiposReportesBarrio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBarrio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBarrio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBarrio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBarrio.setText("Paginacion");
		this.jComboBoxTiposPaginacionBarrio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBarrio.setText("Accion");
		this.jComboBoxTiposRelacionesBarrio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBarrio.setText("Accion");
		this.jComboBoxTiposAccionesBarrio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBarrio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBarrio.setText("Accion");
		this.jComboBoxTiposSeleccionarBarrio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBarrio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBarrio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBarrio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBarrio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBarrio = new JLabelMe();
		
		this.jLabelAccionesBarrio.setText("Acciones");		
		this.jLabelAccionesBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBarrio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBarrio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBarrio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBarrio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBarrio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBarrio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBarrio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBarrio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBarrio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBarrio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBarrio.setText("Graf.");
		this.jCheckBoxConGraficoReporteBarrio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBarrio = new JButtonMe();
		//this.jButtonAnterioresBarrio.setText("<<");
        this.jButtonAnterioresBarrio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBarrio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBarrio = new JButtonMe();
		//this.jButtonSiguientesBarrio.setText(">>");
        this.jButtonSiguientesBarrio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBarrio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBarrio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBarrio.setText("Nue");
        this.jButtonNuevoGuardarCambiosBarrio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBarrio,"nuevoguardarcambios_button","Nue",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBarrio";
		inputMap = this.jButtonNuevoGuardarCambiosBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBarrio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBarrio";
		inputMap = this.jButtonRecargarInformacionBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBarrio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBarrio";
		inputMap = this.jButtonSiguientesBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBarrio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBarrio";
		inputMap = this.jButtonAnterioresBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBarrio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBarrio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBarrio.setMinimumSize(new Dimension(this.getWidth(),BarrioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BarrioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBarrio.setMaximumSize(new Dimension(this.getWidth(),BarrioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BarrioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBarrio.setPreferredSize(new Dimension(this.getWidth(),BarrioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BarrioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBarrio = new GridBagLayout();

			this.jPanelPaginacionBarrio.setLayout(gridaBagLayoutPaginacionBarrio);						
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 0;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBarrio.add(this.jButtonAnterioresBarrio, this.gridBagConstraintsBarrio);
					
						
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBarrio.gridy = 0;
			
			this.jPanelPaginacionBarrio.add(this.jButtonNuevoGuardarCambiosBarrio, this.gridBagConstraintsBarrio);
						
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBarrio.gridy = 0;
			this.jPanelPaginacionBarrio.add(this.jButtonSiguientesBarrio, this.gridBagConstraintsBarrio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 1;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBarrio.add(this.jButtonNuevoBarrio, this.gridBagConstraintsBarrio);
						
			
			
			if(!this.barrioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBarrio = new GridBagConstraints();
				this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBarrio.gridy = 1;
				this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBarrio.add(this.jButtonGuardarCambiosTablaBarrio, this.gridBagConstraintsBarrio);
			}
			
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 1;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBarrio.add(this.jButtonDuplicarBarrio, this.gridBagConstraintsBarrio);
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 1;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBarrio.add(this.jButtonCopiarBarrio, this.gridBagConstraintsBarrio);
		
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 1;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBarrio.add(this.jButtonVerFormBarrio, this.gridBagConstraintsBarrio);
		
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 1;
			this.gridBagConstraintsBarrio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBarrio.add(this.jButtonCerrarBarrio, this.gridBagConstraintsBarrio);
		
		
		
		this.jButtonRecargarInformacionBarrio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBarrio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBarrio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBarrio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBarrio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBarrio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBarrio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBarrio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBarrio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBarrio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBarrio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBarrio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBarrio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBarrio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBarrio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBarrio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBarrio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBarrio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBarrio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBarrio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBarrio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBarrio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBarrio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBarrio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBarrio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBarrio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBarrio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBarrio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBarrio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBarrio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBarrio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBarrio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBarrio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBarrio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBarrio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBarrio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBarrio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBarrio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBarrio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBarrio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Barrio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Barrio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Barrio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Barrio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBarrio.setLayout(gridaBagParametrosReportesBarrio);
			this.jPanelParametrosReportesAccionesBarrio.setLayout(gridaBagParametrosReportesAccionesBarrio);
			
			
			this.jPanelParametrosAuxiliar1Barrio.setLayout(gridaBagParametrosAuxiliar1Barrio);
			this.jPanelParametrosAuxiliar2Barrio.setLayout(gridaBagParametrosAuxiliar2Barrio);
			this.jPanelParametrosAuxiliar3Barrio.setLayout(gridaBagParametrosAuxiliar3Barrio);
			this.jPanelParametrosAuxiliar4Barrio.setLayout(gridaBagParametrosAuxiliar4Barrio);
			//this.jPanelParametrosAuxiliar5Barrio.setLayout(gridaBagParametrosAuxiliar2Barrio);			
			
			
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBarrio.add(this.jButtonRecargarInformacionBarrio, this.gridBagConstraintsBarrio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Barrio.add(this.jComboBoxTiposPaginacionBarrio, this.gridBagConstraintsBarrio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Barrio.add(this.jCheckBoxConAltoMaximoTablaBarrio, this.gridBagConstraintsBarrio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Barrio.add(this.jComboBoxTiposArchivosReportesBarrio, this.gridBagConstraintsBarrio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBarrio.add(this.jPanelParametrosAuxiliar1Barrio, this.gridBagConstraintsBarrio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Barrio.add(this.jComboBoxTiposReportesBarrio, this.gridBagConstraintsBarrio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBarrio.add(this.jPanelParametrosAuxiliar4Barrio, this.gridBagConstraintsBarrio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBarrio.add(this.jComboBoxTiposReportesBarrio, this.gridBagConstraintsBarrio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBarrio.add(this.jCheckBoxGenerarReporteBarrio, this.gridBagConstraintsBarrio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBarrio.add(this.jPanelParametrosAuxiliar2Barrio, this.gridBagConstraintsBarrio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBarrio.add(this.jLabelAccionesBarrio, this.gridBagConstraintsBarrio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBarrio = new GridBagConstraints();
				this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBarrio.add(this.jButtonAbrirOrderByBarrio, this.gridBagConstraintsBarrio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBarrio.add(this.jComboBoxTiposSeleccionarBarrio, this.gridBagConstraintsBarrio);			
			
			
			/*
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBarrio.add(this.jCheckBoxSeleccionarTodosBarrio, this.gridBagConstraintsBarrio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Barrio.add(this.jCheckBoxSeleccionarTodosBarrio, this.gridBagConstraintsBarrio);															
				
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBarrio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Barrio.add(this.jCheckBoxSeleccionadosBarrio, this.gridBagConstraintsBarrio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBarrio.add(this.jPanelParametrosAuxiliar3Barrio, this.gridBagConstraintsBarrio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBarrio.add(this.jComboBoxTiposAccionesBarrio, this.gridBagConstraintsBarrio);
	
				
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBarrio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBarrio.add(this.jTextFieldValorCampoGeneralBarrio, this.gridBagConstraintsBarrio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBarrio = new GridBagLayout();

			this.jScrollPanelDatosBarrio.setLayout(gridaBagLayoutDatosBarrio);
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = 0;
			this.gridBagConstraintsBarrio.gridx = 0;
			
			this.jScrollPanelDatosBarrio.add(this.jTableDatosBarrio, this.gridBagConstraintsBarrio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBarrio.setViewportView(this.jTableDatosBarrio);
		this.jTableDatosBarrio.setFillsViewportHeight(true);
		this.jTableDatosBarrio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBarrio= new GridBagLayout();
		this.jPanelAccionesBarrio.setLayout(gridaBagLayoutAccionesBarrio);
		
		
		/*	
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 0;
			
		this.jPanelAccionesBarrio.add(this.jButtonNuevoBarrio, this.gridBagConstraintsBarrio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCantonBarrio= new GridBagLayout();
		gridaBagLayoutFK_IdCantonBarrio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCantonBarrio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCantonBarrio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCantonBarrio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCantonBarrio.setLayout(gridaBagLayoutFK_IdCantonBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 0;
		jPanelFK_IdCantonBarrio.add(jLabelid_cantonFK_IdCantonBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 1;
		jPanelFK_IdCantonBarrio.add(jComboBoxid_cantonFK_IdCantonBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 1;
		gridBagConstraintsBarrio.gridx =1;
		jPanelFK_IdCantonBarrio.add(jButtonFK_IdCantonBarrio, gridBagConstraintsBarrio);

		jTabbedPaneBusquedasBarrio.addTab("1.-Por Canton ", jPanelFK_IdCantonBarrio);
		jTabbedPaneBusquedasBarrio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdParroquiaBarrio= new GridBagLayout();
		gridaBagLayoutFK_IdParroquiaBarrio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParroquiaBarrio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParroquiaBarrio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParroquiaBarrio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParroquiaBarrio.setLayout(gridaBagLayoutFK_IdParroquiaBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 0;
		jPanelFK_IdParroquiaBarrio.add(jLabelid_parroquiaFK_IdParroquiaBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 1;
		jPanelFK_IdParroquiaBarrio.add(jComboBoxid_parroquiaFK_IdParroquiaBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 1;
		gridBagConstraintsBarrio.gridx =1;
		jPanelFK_IdParroquiaBarrio.add(jButtonFK_IdParroquiaBarrio, gridBagConstraintsBarrio);

		jTabbedPaneBusquedasBarrio.addTab("2.-Por Parroquia ", jPanelFK_IdParroquiaBarrio);
		jTabbedPaneBusquedasBarrio.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProvinciaBarrio= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaBarrio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaBarrio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaBarrio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaBarrio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaBarrio.setLayout(gridaBagLayoutFK_IdProvinciaBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 0;
		jPanelFK_IdProvinciaBarrio.add(jLabelid_provinciaFK_IdProvinciaBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 0;
		gridBagConstraintsBarrio.gridx = 1;
		jPanelFK_IdProvinciaBarrio.add(jComboBoxid_provinciaFK_IdProvinciaBarrio, gridBagConstraintsBarrio);

		gridBagConstraintsBarrio = new GridBagConstraints();
		gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBarrio.gridy = 1;
		gridBagConstraintsBarrio.gridx =1;
		jPanelFK_IdProvinciaBarrio.add(jButtonFK_IdProvinciaBarrio, gridBagConstraintsBarrio);

		jTabbedPaneBusquedasBarrio.addTab("3.-Por Provincia ", jPanelFK_IdProvinciaBarrio);
		jTabbedPaneBusquedasBarrio.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBarrio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBarrio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.barrioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBarrio = new GridBagConstraints();						
			this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBarrio.gridx = 0;		
			//this.gridBagConstraintsBarrio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBarrio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBarrio, this.gridBagConstraintsBarrio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBarrio.gridx = 0;		
		//this.gridBagConstraintsBarrio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBarrio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBarrio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBarrio.gridx = 0;		
			this.gridBagConstraintsBarrio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBarrio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBarrio, this.gridBagConstraintsBarrio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBarrio, this.gridBagConstraintsBarrio);								
		
		
		/*
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBarrio, this.gridBagConstraintsBarrio);
		*/		
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBarrio.gridx =0;
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBarrio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBarrio, this.gridBagConstraintsBarrio);
				
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBarrio, this.gridBagConstraintsBarrio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BarrioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBarrio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBarrio = new GridBagLayout();
			this.jPanelBusquedasParametrosBarrio.setLayout(gridaBagLayoutBusquedasParametrosBarrio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBarrio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBarrio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBarrio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBarrio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBarrio, this.gridBagConstraintsBarrio);
			
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBarrio, this.gridBagConstraintsBarrio);
		
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBarrio, this.gridBagConstraintsBarrio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBarrio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBarrio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBarrio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBarrio.setName("jPanelReporteDinamicoBarrio"); 
		
		this.jPanelReporteDinamicoBarrio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBarrio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBarrio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBarrio.setLayout(gridaBagLayoutReporteDinamicoBarrio);
		
		
		this.jInternalFrameReporteDinamicoBarrio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBarrio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBarrio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBarrio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBarrio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBarrio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBarrio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBarrio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBarrio.setResizable(true);
	    this.jInternalFrameReporteDinamicoBarrio.setClosable(true);
	    this.jInternalFrameReporteDinamicoBarrio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBarrio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBarrio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBarrio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBarrio = new JLabelMe();

		this.jLabelColumnasSelectReporteBarrio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBarrio.add(this.jLabelColumnasSelectReporteBarrio, this.gridBagConstraintsBarrio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBarrio = new JList<Reporte>();
		this.jListColumnasSelectReporteBarrio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBarrio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBarrio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBarrio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBarrio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBarrio=new JScrollPane(this.jListColumnasSelectReporteBarrio);
			
			this.jScrollColumnasSelectReporteBarrio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBarrio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBarrio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBarrio.add(this.jListColumnasSelectReporteBarrio, this.gridBagConstraintsBarrio);
		this.jPanelReporteDinamicoBarrio.add(this.jScrollColumnasSelectReporteBarrio, this.gridBagConstraintsBarrio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBarrio = new JLabelMe();

		this.jLabelRelacionesSelectReporteBarrio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBarrio = new JList<Reporte>();
		this.jListRelacionesSelectReporteBarrio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBarrio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBarrio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBarrio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBarrio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBarrio=new JScrollPane(this.jListRelacionesSelectReporteBarrio);
			
			this.jScrollRelacionesSelectReporteBarrio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBarrio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBarrio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBarrio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBarrio = new JComboBoxMe();
		this.jListColumnasValoresGraficoBarrio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBarrio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBarrio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBarrio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBarrio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBarrio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBarrio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBarrio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBarrio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBarrio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBarrio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBarrio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBarrio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBarrio.add(this.jLabelGenerarExcelReporteDinamicoBarrio, this.gridBagConstraintsBarrio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBarrio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBarrio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBarrio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBarrio.setToolTipText("Generar EXCEL"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBarrio.add(this.jButtonGenerarExcelReporteDinamicoBarrio, this.gridBagConstraintsBarrio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBarrio.add(this.jComboBoxTiposReportesDinamicoBarrio, this.gridBagConstraintsBarrio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBarrio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBarrio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBarrio.add(this.jLabelTiposArchivoReporteDinamicoBarrio, this.gridBagConstraintsBarrio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBarrio.add(this.jComboBoxTiposArchivosReportesDinamicoBarrio, this.gridBagConstraintsBarrio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBarrio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBarrio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBarrio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBarrio.setToolTipText("Generar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBarrio.add(this.jButtonGenerarReporteDinamicoBarrio, this.gridBagConstraintsBarrio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBarrio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBarrio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBarrio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBarrio.setToolTipText("Cancelar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBarrio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBarrio.add(this.jButtonCerrarReporteDinamicoBarrio, this.gridBagConstraintsBarrio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBarrio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBarrio= new JScrollPane(jPanelReporteDinamicoBarrio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBarrio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBarrio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBarrio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBarrio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBarrio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBarrio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBarrio);
		this.jInternalFrameReporteDinamicoBarrio.getContentPane().add(this.jScrollPanelReporteDinamicoBarrio, this.gridBagConstraintsBarrio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBarrio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBarrio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBarrio.setName("jPanelImportacionBarrio"); 
		
		this.jPanelImportacionBarrio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBarrio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBarrio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBarrio.setLayout(gridaBagLayoutImportacionBarrio);
		
		
		this.jInternalFrameImportacionBarrio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBarrio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBarrio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBarrio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBarrio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBarrio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBarrio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBarrio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBarrio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBarrio.setResizable(true);
	    this.jInternalFrameImportacionBarrio.setClosable(true);
	    this.jInternalFrameImportacionBarrio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBarrio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBarrio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBarrio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBarrio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBarrio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBarrio.setResizable(true);
	    this.jInternalFrameImportacionBarrio.setClosable(true);
	    this.jInternalFrameImportacionBarrio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBarrio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBarrio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBarrio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBarrio = new JLabelMe();

		this.jLabelArchivoImportacionBarrio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;		
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBarrio.add(this.jLabelArchivoImportacionBarrio, this.gridBagConstraintsBarrio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBarrio = new JFileChooser();		
		this.jFileChooserImportacionBarrio.setToolTipText("ESCOGER ARCHIVO"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBarrio = new JButtonMe();
		this.jButtonAbrirImportacionBarrio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBarrio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBarrio.setToolTipText("Generar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBarrio.add(this.jButtonAbrirImportacionBarrio, this.gridBagConstraintsBarrio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBarrio = new JLabelMe();

		this.jLabelPathArchivoImportacionBarrio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;		
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBarrio.add(this.jLabelPathArchivoImportacionBarrio, this.gridBagConstraintsBarrio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBarrio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBarrio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBarrio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBarrio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBarrio.add(this.jTextFieldPathArchivoImportacionBarrio, this.gridBagConstraintsBarrio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBarrio = new JButtonMe();
		this.jButtonGenerarImportacionBarrio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBarrio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBarrio.setToolTipText("Generar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBarrio.add(this.jButtonGenerarImportacionBarrio, this.gridBagConstraintsBarrio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBarrio = new JButtonMe();
		this.jButtonCerrarImportacionBarrio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBarrio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBarrio.setToolTipText("Cancelar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = iPosYImportacion;
		this.gridBagConstraintsBarrio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBarrio.add(this.jButtonCerrarImportacionBarrio, this.gridBagConstraintsBarrio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBarrio = new GridBagLayout();
		
		this.jScrollPanelImportacionBarrio= new JScrollPane(jPanelImportacionBarrio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iPosYImportacion;
		this.gridBagConstraintsBarrio.gridx =iPosXImportacion;
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBarrio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBarrio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBarrio);
		this.jInternalFrameImportacionBarrio.getContentPane().add(this.jScrollPanelImportacionBarrio, this.gridBagConstraintsBarrio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBarrio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBarrio = new JButtonMe();
			this.jButtonAbrirOrderByBarrio.setText("Orden");
			this.jButtonAbrirOrderByBarrio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBarrio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBarrio";
			inputMap = this.jButtonAbrirOrderByBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBarrio"));
		
		
			GridBagLayout gridaBagLayoutOrderByBarrio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBarrio.setName("jPanelOrderByBarrio"); 
			
			this.jPanelOrderByBarrio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBarrio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBarrio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBarrio.setLayout(gridaBagLayoutOrderByBarrio);
			
			
			this.jTableDatosBarrioOrderBy = new JTableMe();        
			this.jTableDatosBarrioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBarrioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBarrioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBarrioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBarrioOrderBy.setViewportView(this.jTableDatosBarrioOrderBy);
			this.jTableDatosBarrioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBarrioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBarrio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBarrio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBarrio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBarrio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBarrio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBarrio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBarrio.setTitle("Orden");
			this.jInternalFrameOrderByBarrio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBarrio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBarrio.setResizable(true);
			this.jInternalFrameOrderByBarrio.setClosable(true);
			this.jInternalFrameOrderByBarrio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBarrio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBarrio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBarrio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBarrio.gridx =iPosXOrderBy;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBarrio.ipady =150;
				
			this.jPanelOrderByBarrio.add(jScrollPanelDatosBarrioOrderBy, this.gridBagConstraintsBarrio);//this.jTableDatosBarrioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBarrio = new JButtonMe();
			this.jButtonCerrarOrderByBarrio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBarrio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBarrio.setToolTipText("Cancelar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBarrio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBarrio.add(this.jButtonCerrarOrderByBarrio, this.gridBagConstraintsBarrio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBarrio = new GridBagLayout();
			
			this.jScrollPanelOrderByBarrio= new JScrollPane(jPanelOrderByBarrio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy =iPosYOrderBy;
			this.gridBagConstraintsBarrio.gridx =iPosXOrderBy;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBarrio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBarrio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBarrio);
			
			this.jInternalFrameOrderByBarrio.getContentPane().add(this.jScrollPanelOrderByBarrio, this.gridBagConstraintsBarrio);			
		
		} else {
			this.jButtonAbrirOrderByBarrio = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.barrioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBarrio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBarrio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBarrio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBarrio.getRowHeight();//BarrioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BarrioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBarrio.isSelected()) {
					iHeightTable=BarrioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BarrioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BarrioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BarrioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBarrio.isSelected()) {
					iHeightTable=BarrioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BarrioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BarrioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBarrio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBarrio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBarrio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBarrio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBarrio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBarrio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBarrio!=null && this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy()!=null) {
			//if(!this.barrioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBarrio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBarrio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBarrio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBarrio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBarrio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBarrio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=barrioLogic.getBarrios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=barrios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Barrio> TraerBarrioBeans(List<Barrio> barrios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Barrio barrio:barrios) {
					
				if(!(BarrioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BarrioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					barrio.setsDetalleGeneralEntityReporte(BarrioConstantesFunciones.getBarrioDescripcion(barrio));
										
						
					
						
					
				} else  {
							
					//barrio.setsDetalleGeneralEntityReporte(barrio.getsDetalleGeneralEntityReporte());
										
				}
				
				//barriobeans.add(barriobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return barrios;
    }
	//PARA REPORTES FIN
}
