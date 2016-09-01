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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.report.ProcesoUtilidadesConstantesFunciones;

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
public class ProcesoUtilidadesJInternalFrame extends ProcesoUtilidadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoUtilidades;
	
	protected JMenuBar jmenuBarProcesoUtilidades;
	
	protected JMenu jmenuProcesoUtilidades;
	protected JMenu jmenuDatosProcesoUtilidades;
	protected JMenu jmenuArchivoProcesoUtilidades;
	protected JMenu jmenuAccionesProcesoUtilidades;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoUtilidades;	
	protected GridBagConstraints gridBagConstraintsProcesoUtilidades;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoUtilidadesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoUtilidades;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoUtilidades;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoUtilidades;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public ProcesoUtilidadesSessionBean procesoutilidadesSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoUtilidades> procesoutilidadess;		
	public List<ProcesoUtilidades> procesoutilidadessEliminados;	
	public List<ProcesoUtilidades> procesoutilidadessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoUtilidades;		
	protected JButton jButtonAbrirOrderByProcesoUtilidades;
	
	
	//protected JPanel jPanelOrderByProcesoUtilidades;
	//public JScrollPane jScrollPanelOrderByProcesoUtilidades;	
	//protected JButton jButtonCerrarOrderByProcesoUtilidades;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoUtilidadesLogic procesoutilidadesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoUtilidades;
	public JScrollPane jScrollPanelDatosEdicionProcesoUtilidades;
	public JScrollPane jScrollPanelDatosGeneralProcesoUtilidades;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoUtilidadesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoUtilidades;
	//public JScrollPane jScrollPanelImportacionProcesoUtilidades;
	
	
	
	protected JPanel jPanelAccionesProcesoUtilidades;
	
    protected JPanel jPanelPaginacionProcesoUtilidades;
    protected JPanel jPanelParametrosReportesProcesoUtilidades;
	protected JPanel jPanelParametrosReportesAccionesProcesoUtilidades;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoUtilidades;
	protected JPanel jPanelParametrosAuxiliar2ProcesoUtilidades;
	protected JPanel jPanelParametrosAuxiliar3ProcesoUtilidades;
	protected JPanel jPanelParametrosAuxiliar4ProcesoUtilidades;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoUtilidades;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoUtilidades;
	//protected JPanel jPanelImportacionProcesoUtilidades;
	
	
	public JTable jTableDatosProcesoUtilidades;
	
	
	
	//public JTable jTableDatosProcesoUtilidadesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoUtilidades;
	protected JButton jButtonDuplicarProcesoUtilidades;
	protected JButton jButtonCopiarProcesoUtilidades;
	protected JButton jButtonVerFormProcesoUtilidades;
	protected JButton jButtonNuevoRelacionesProcesoUtilidades;
	protected JButton jButtonModificarProcesoUtilidades;
	
    protected JButton jButtonGuardarCambiosTablaProcesoUtilidades;
	protected JButton jButtonCerrarProcesoUtilidades;
	
	
	protected JButton jButtonRecargarInformacionProcesoUtilidades;
	protected JButton jButtonProcesarInformacionProcesoUtilidades;
	
	
	protected JButton jButtonAnterioresProcesoUtilidades;
	protected JButton jButtonSiguientesProcesoUtilidades;
	protected JButton jButtonNuevoGuardarCambiosProcesoUtilidades;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoUtilidades;
	//protected JButton jButtonCerrarReporteDinamicoProcesoUtilidades;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoUtilidades;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoUtilidades;
	//protected JButton jButtonGenerarImportacionProcesoUtilidades;
	//protected JButton jButtonCerrarImportacionProcesoUtilidades;
	//protected JFileChooser jFileChooserImportacionProcesoUtilidades;
	//protected File fileImportacionProcesoUtilidades;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoUtilidades;
	protected JButton jButtonDuplicarToolBarProcesoUtilidades;
	protected JButton jButtonNuevoRelacionesToolBarProcesoUtilidades;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoUtilidades;
	protected JButton jButtonCopiarToolBarProcesoUtilidades;
	protected JButton jButtonVerFormToolBarProcesoUtilidades;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoUtilidades;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoUtilidades;
	protected JButton jButtonCerrarToolBarProcesoUtilidades;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoUtilidades;
	protected JButton jButtonProcesarInformacionToolBarProcesoUtilidades;
	protected JButton jButtonAnterioresToolBarProcesoUtilidades;
	protected JButton jButtonSiguientesToolBarProcesoUtilidades;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoUtilidades;
	protected JButton jButtonAbrirOrderByToolBarProcesoUtilidades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoUtilidades;
	protected JMenuItem jMenuItemDuplicarProcesoUtilidades;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoUtilidades;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoUtilidades;
	protected JMenuItem jMenuItemCopiarProcesoUtilidades;
	protected JMenuItem jMenuItemVerFormProcesoUtilidades;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoUtilidades;
	protected JMenuItem jMenuItemCerrarProcesoUtilidades;
	protected JMenuItem jMenuItemDetalleCerrarProcesoUtilidades;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoUtilidades;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoUtilidades;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoUtilidades;
	protected JMenuItem jMenuItemProcesarInformacionProcesoUtilidades;
	protected JMenuItem jMenuItemAnterioresProcesoUtilidades;
	protected JMenuItem jMenuItemSiguientesProcesoUtilidades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoUtilidades;
	protected JMenuItem jMenuItemAbrirOrderByProcesoUtilidades;
	protected JMenuItem jMenuItemMostrarOcultarProcesoUtilidades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoUtilidades;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoUtilidades;
	protected JCheckBox jCheckBoxSeleccionadosProcesoUtilidades;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoUtilidades;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoUtilidades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoUtilidades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoUtilidades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoUtilidades;
	protected JTextField jTextFieldValorCampoGeneralProcesoUtilidades;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoUtilidades;
	//public JList<Reporte> jListColumnasSelectReporteProcesoUtilidades;
	//public JScrollPane jScrollColumnasSelectReporteProcesoUtilidades;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoUtilidades;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoUtilidades;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoUtilidades;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoUtilidades;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoUtilidades;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoUtilidades;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoUtilidades;
	
		
	//public JLabel jLabelArchivoImportacionProcesoUtilidades;	
	//public JLabel jLabelPathArchivoImportacionProcesoUtilidades;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoUtilidades;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoUtilidades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoUtilidades;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoUtilidades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoUtilidades;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoUtilidades;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoUtilidades;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoUtilidades;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoUtilidades;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoUtilidades;
	public JPanel jPanelBusquedaProcesoUtilidadesProcesoUtilidades;
	public JButton jButtonBusquedaProcesoUtilidadesProcesoUtilidades;
	
	public JPanel jPanelid_anioBusquedaProcesoUtilidadesProcesoUtilidades;
	public JLabel jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades;
	public JButton jButtonid_anioBusquedaProcesoUtilidadesProcesoUtilidades= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoUtilidadesProcesoUtilidadesUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoUtilidadesProcesoUtilidadesBusqueda= new JButtonMe();

	
	public JPanel jPanelvalorBusquedaProcesoUtilidadesProcesoUtilidades;
	public JLabel jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades;
	public JTextField jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades;
	public JButton jButtonvalorBusquedaProcesoUtilidadesProcesoUtilidadesBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoUtilidadesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoUtilidades)	{
		this.jButtonRecargarInformacionProcesoUtilidades = jButtonRecargarInformacionProcesoUtilidades;
	}
	
	public JButton getjButtonProcesarInformacionProcesoUtilidades() {
		return this.jButtonProcesarInformacionProcesoUtilidades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoUtilidades)	{
		this.jButtonProcesarInformacionProcesoUtilidades = jButtonProcesarInformacionProcesoUtilidades;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoUtilidades() {
		return this.jButtonRecargarInformacionProcesoUtilidades;
	}
	
	
	public List<ProcesoUtilidades> getprocesoutilidadess() {
		return this.procesoutilidadess;
	}

	public void setprocesoutilidadess(List<ProcesoUtilidades> procesoutilidadess) {
		this.procesoutilidadess = procesoutilidadess;
	}
	
	public List<ProcesoUtilidades> getprocesoutilidadessAux() {
		return this.procesoutilidadessAux;
	}

	public void setprocesoutilidadessAux(List<ProcesoUtilidades> procesoutilidadessAux) {
		this.procesoutilidadessAux = procesoutilidadessAux;
	}
	
	public List<ProcesoUtilidades> getprocesoutilidadessEliminados() {
		return this.procesoutilidadessEliminados;
	}

	public void setProcesoUtilidadessEliminados(List<ProcesoUtilidades> procesoutilidadessEliminados) {
		this.procesoutilidadessEliminados = procesoutilidadessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoUtilidades() {
		return jComboBoxTiposSeleccionarProcesoUtilidades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoUtilidades(
			JComboBox jComboBoxTiposSeleccionarProcesoUtilidades) {
		this.jComboBoxTiposSeleccionarProcesoUtilidades = jComboBoxTiposSeleccionarProcesoUtilidades;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoUtilidades() {
		return jTextFieldValorCampoGeneralProcesoUtilidades;
	}

	public void setjTextFieldValorCampoGeneralProcesoUtilidades(
			JTextField jTextFieldValorCampoGeneralProcesoUtilidades) {
		this.jTextFieldValorCampoGeneralProcesoUtilidades = jTextFieldValorCampoGeneralProcesoUtilidades;
	}

	public void setBorderResaltarValorCampoGeneralProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoUtilidades .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoUtilidades() {
		return this.jCheckBoxSeleccionarTodosProcesoUtilidades;
	}

	public void setjCheckBoxSeleccionarTodosProcesoUtilidades(
			JCheckBox jCheckBoxSeleccionarTodosProcesoUtilidades) {
		this.jCheckBoxSeleccionarTodosProcesoUtilidades = jCheckBoxSeleccionarTodosProcesoUtilidades;
	}

	public void setBorderResaltarSeleccionarTodosProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoUtilidades() {
		return this.jCheckBoxSeleccionadosProcesoUtilidades;
	}

	public void setjCheckBoxSeleccionadosProcesoUtilidades(
			JCheckBox jCheckBoxSeleccionadosProcesoUtilidades) {
		this.jCheckBoxSeleccionadosProcesoUtilidades = jCheckBoxSeleccionadosProcesoUtilidades;
	}
	
	public void setBorderResaltarSeleccionadosProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoUtilidades() {
		return this.jComboBoxTiposArchivosReportesProcesoUtilidades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoUtilidades(
			JComboBox jComboBoxTiposArchivosReportesProcesoUtilidades) {
		this.jComboBoxTiposArchivosReportesProcesoUtilidades = jComboBoxTiposArchivosReportesProcesoUtilidades;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoUtilidades() {
		return this.jComboBoxTiposReportesProcesoUtilidades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoUtilidades(
			JComboBox jComboBoxTiposReportesProcesoUtilidades) {
		this.jComboBoxTiposReportesProcesoUtilidades = jComboBoxTiposReportesProcesoUtilidades;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoUtilidades() {
	//	return jComboBoxTiposReportesDinamicoProcesoUtilidades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoUtilidades(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoUtilidades) {
	//	this.jComboBoxTiposReportesDinamicoProcesoUtilidades = jComboBoxTiposReportesDinamicoProcesoUtilidades;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoUtilidades() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoUtilidades(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades = jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades;
	//}
	
	public void setBorderResaltarTiposReportesProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoUtilidades() {
		return this.jComboBoxTiposGraficosReportesProcesoUtilidades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoUtilidades(
			JComboBox jComboBoxTiposGraficosReportesProcesoUtilidades) {
		this.jComboBoxTiposGraficosReportesProcesoUtilidades = jComboBoxTiposGraficosReportesProcesoUtilidades;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoUtilidades() {
		return this.jComboBoxTiposPaginacionProcesoUtilidades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoUtilidades(
			JComboBox jComboBoxTiposPaginacionProcesoUtilidades) {
		this.jComboBoxTiposPaginacionProcesoUtilidades = jComboBoxTiposPaginacionProcesoUtilidades;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoUtilidades() {
		return this.jComboBoxTiposRelacionesProcesoUtilidades;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoUtilidades() {
		return this.jComboBoxTiposAccionesProcesoUtilidades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoUtilidades(
			JComboBox jComboBoxTiposRelacionesProcesoUtilidades) {
		this.jComboBoxTiposRelacionesProcesoUtilidades = jComboBoxTiposRelacionesProcesoUtilidades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoUtilidades(
			JComboBox jComboBoxTiposAccionesProcesoUtilidades) {
		this.jComboBoxTiposAccionesProcesoUtilidades = jComboBoxTiposAccionesProcesoUtilidades;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoUtilidades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoUtilidades .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoUtilidades() {
	//	return jCheckBoxConGraficoDinamicoProcesoUtilidades;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoUtilidades(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoUtilidades) {
	//	this.jCheckBoxConGraficoDinamicoProcesoUtilidades = jCheckBoxConGraficoDinamicoProcesoUtilidades;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoUtilidades() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoUtilidades.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoUtilidades .setBorder(borderResaltar);		
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
		this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
		
		this.procesoutilidadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoutilidadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoutilidadesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoUtilidadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Utilidades MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoUtilidadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoUtilidades= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"nuevo","nuevo","Nuevo"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"duplicar","duplicar","Duplicar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"copiar","copiar","Copiar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"ver_form","ver_form","Ver"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"recargar","recargar","Procesar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoUtilidades,this.jTtoolBarProcesoUtilidades,
							"cerrar","cerrar","Salir"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoUtilidades=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoUtilidades;
			
				this.jButtonProcesarInformacionToolBarProcesoUtilidades=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoUtilidades;
				
		//protected JButton jButtonModificarToolBarProcesoUtilidades;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoUtilidades=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoUtilidades=new JMenuMe("General");
		this.jmenuArchivoProcesoUtilidades=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoUtilidades=new JMenuMe("Acciones");
		this.jmenuDatosProcesoUtilidades=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoUtilidades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoUtilidades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoUtilidades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoUtilidades= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoUtilidades.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoUtilidades,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoUtilidades= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoUtilidades.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoUtilidades,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoUtilidades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoUtilidades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoUtilidades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoUtilidades= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoUtilidades.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoUtilidades,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoUtilidades= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoUtilidades.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoUtilidades,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoUtilidades= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoUtilidades.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoUtilidades,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoUtilidades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoUtilidades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoUtilidades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoUtilidades= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoUtilidades.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoUtilidades,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoUtilidades= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoUtilidades.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoUtilidades,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoUtilidades= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoUtilidades.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoUtilidades,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoUtilidades= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoUtilidades.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoUtilidades,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoUtilidades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoUtilidades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoUtilidades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoUtilidades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoUtilidades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoUtilidades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoUtilidades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoUtilidades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoUtilidades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoUtilidades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoUtilidades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoUtilidades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoUtilidades= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoUtilidades.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoUtilidades,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoUtilidades.add(this.jMenuItemCerrarProcesoUtilidades);
			
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemNuevoProcesoUtilidades);
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemNuevoGuardarCambiosProcesoUtilidades);
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemNuevoRelacionesProcesoUtilidades);
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemGuardarCambiosTablaProcesoUtilidades);		
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemDuplicarProcesoUtilidades);		
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemCopiarProcesoUtilidades);		
			this.jmenuAccionesProcesoUtilidades.add(this.jMenuItemVerFormProcesoUtilidades);		
			
			this.jmenuDatosProcesoUtilidades.add(this.jMenuItemRecargarInformacionProcesoUtilidades);				
			this.jmenuDatosProcesoUtilidades.add(this.jMenuItemAnterioresProcesoUtilidades);				
			this.jmenuDatosProcesoUtilidades.add(this.jMenuItemSiguientesProcesoUtilidades);				
			this.jmenuDatosProcesoUtilidades.add(this.jMenuItemAbrirOrderByProcesoUtilidades);				
			this.jmenuDatosProcesoUtilidades.add(this.jMenuItemMostrarOcultarProcesoUtilidades);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoUtilidades.add(this.jMenuItemGuardarCambiosProcesoUtilidades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoUtilidades.add(this.jmenuArchivoProcesoUtilidades);		
			this.jmenuBarProcesoUtilidades.add(this.jmenuAccionesProcesoUtilidades);		
			this.jmenuBarProcesoUtilidades.add(this.jmenuDatosProcesoUtilidades);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoUtilidades);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoUtilidades() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades.setToolTipText("Procesar Proceso Utilidades");
		this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades= new JButtonMe();
		this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades.setText("Procesar");
		this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades.setToolTipText("Procesar Proceso Utilidades");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades,"buscar_button","Procesar Proceso Utilidades");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades = new JLabelMe();
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setText("Anio :");
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades = new JLabelMe();
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades.setText("Valor :");
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades.setToolTipText("Valor");
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades= new JTextFieldMe();
		jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades.setText("0.0");




		this.jTabbedPaneBusquedasProcesoUtilidades=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoUtilidades.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoUtilidades.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoUtilidades.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Utilidades"));
		this.jTabbedPaneBusquedasProcesoUtilidades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoUtilidades = new ProcesoUtilidadesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Utilidades DATOS");
			this.jInternalFrameDetalleFormProcesoUtilidades = new ProcesoUtilidadesDetalleFormJInternalFrame(jDesktopPane,this.procesoutilidadesSessionBean.getConGuardarRelaciones(),this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoUtilidades = null;//new ProcesoUtilidadesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoUtilidades= new GridBagLayout();
		
		
		this.jTableDatosProcesoUtilidades = new JTableMe();      
		
		String sToolTipProcesoUtilidades="";
		sToolTipProcesoUtilidades=ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoUtilidades+="(Nomina.ProcesoUtilidades)";
		}
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoUtilidades+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoUtilidades.setToolTipText(sToolTipProcesoUtilidades);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoUtilidades);
		this.jTableDatosProcesoUtilidades.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoUtilidades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoUtilidades.setRowSelectionAllowed(true);
		this.jTableDatosProcesoUtilidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoUtilidades = new JButtonMe();
		this.jButtonDuplicarProcesoUtilidades = new JButtonMe();
		this.jButtonCopiarProcesoUtilidades = new JButtonMe();
		this.jButtonVerFormProcesoUtilidades = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoUtilidades = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades = new JButtonMe();
		this.jButtonCerrarProcesoUtilidades = new JButtonMe();
		
		this.jScrollPanelDatosProcesoUtilidades = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoUtilidades = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Utilidades";
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoUtilidades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoUtilidades.setToolTipText("Acciones");
        this.jPanelAccionesProcesoUtilidades.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoUtilidades=new ReporteDinamicoJInternalFrame(ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoUtilidades();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoUtilidades=new ImportacionJInternalFrame(ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoUtilidades();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoUtilidades = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoUtilidades.setText("Orden");
		this.jButtonAbrirOrderByProcesoUtilidades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoUtilidades,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoUtilidades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoUtilidades,false,this);
			
			//this.cargarOrderByProcesoUtilidades(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoUtilidades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoUtilidades,true,this);
			
			//this.cargarOrderByProcesoUtilidades(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoUtilidades.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoUtilidades.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoUtilidades.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesoUtilidades.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoUtilidades.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoUtilidades.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoUtilidades.setText("Nuevo");
		this.jButtonDuplicarProcesoUtilidades.setText("Duplicar");
		this.jButtonCopiarProcesoUtilidades.setText("Copiar");
		this.jButtonVerFormProcesoUtilidades.setText("Ver");
		this.jButtonNuevoRelacionesProcesoUtilidades.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.setText("Guardar");
		this.jButtonCerrarProcesoUtilidades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoUtilidades,"nuevo_button","Nuevo",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoUtilidades,"duplicar_button","Duplicar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoUtilidades,"copiar_button","Copiar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoUtilidades,"ver_form","Ver",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoUtilidades,"nuevorelaciones_button","Nuevo Rel",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoUtilidades,"guardarcambiostabla_button","Guardar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoUtilidades,"cerrar_button","Salir",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoUtilidades.setToolTipText("Nuevo"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoUtilidades.setToolTipText("Duplicar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoUtilidades.setToolTipText("Copiar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoUtilidades.setToolTipText("Ver"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoUtilidades.setToolTipText("Nuevo Rel"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.setToolTipText("Guardar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoUtilidades.setToolTipText("Salir"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoUtilidades";
		inputMap = this.jButtonNuevoProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoUtilidades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoUtilidades"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoUtilidades";
		inputMap = this.jButtonDuplicarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoUtilidades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoUtilidades"));
		
		//COPIAR
		sMapKey = "CopiarProcesoUtilidades";
		inputMap = this.jButtonCopiarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoUtilidades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoUtilidades"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoUtilidades";
		inputMap = this.jButtonVerFormProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoUtilidades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoUtilidades"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoUtilidades";
		inputMap = this.jButtonNuevoRelacionesProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoUtilidades"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoUtilidades";
		inputMap = this.jButtonModificarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoUtilidades"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoUtilidades";
		inputMap = this.jButtonCerrarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoUtilidades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoUtilidades";
		inputMap = this.jButtonGuardarCambiosTablaProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoUtilidades"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoUtilidades.setName("jPanelParametrosReportesProcesoUtilidades"); 
		
		this.jPanelParametrosReportesAccionesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoUtilidades.setName("jPanelParametrosReportesAccionesProcesoUtilidades"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoUtilidades = new JButtonMe();
		this.jButtonRecargarInformacionProcesoUtilidades.setText("Procesar");
		this.jButtonRecargarInformacionProcesoUtilidades.setToolTipText("Procesar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoUtilidades,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoUtilidades.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoUtilidades = new JButtonMe();
		this.jButtonProcesarInformacionProcesoUtilidades.setText("Procesar");
		this.jButtonProcesarInformacionProcesoUtilidades.setToolTipText("Procesar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoUtilidades.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoUtilidades.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoUtilidades.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoUtilidades.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoUtilidades.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoUtilidades.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoUtilidades.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoUtilidades.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoUtilidades.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoUtilidades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoUtilidades.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoUtilidades.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoUtilidades.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoUtilidades.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoUtilidades.setText("Accion");
		this.jComboBoxTiposAccionesProcesoUtilidades.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoUtilidades.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoUtilidades.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoUtilidades=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoUtilidades.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoUtilidades.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoUtilidades.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoUtilidades = new JLabelMe();
		
		this.jLabelAccionesProcesoUtilidades.setText("Acciones");		
		this.jLabelAccionesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoUtilidades = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoUtilidades.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoUtilidades.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoUtilidades = new JButtonMe();
		//this.jButtonAnterioresProcesoUtilidades.setText("<<");
        this.jButtonAnterioresProcesoUtilidades.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoUtilidades,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoUtilidades = new JButtonMe();
		//this.jButtonSiguientesProcesoUtilidades.setText(">>");
        this.jButtonSiguientesProcesoUtilidades.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoUtilidades,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoUtilidades = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoUtilidades.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoUtilidades,"nuevoguardarcambios_button","Nue",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoUtilidades";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoUtilidades"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoUtilidades";
		inputMap = this.jButtonRecargarInformacionProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoUtilidades"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoUtilidades";
		inputMap = this.jButtonSiguientesProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoUtilidades"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoUtilidades";
		inputMap = this.jButtonAnterioresProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoUtilidades"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoUtilidades();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoUtilidades.setMinimumSize(new Dimension(this.getWidth(),ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoUtilidades.setMaximumSize(new Dimension(this.getWidth(),ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoUtilidades.setPreferredSize(new Dimension(this.getWidth(),ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoUtilidadesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoUtilidades = new GridBagLayout();

			this.jPanelPaginacionProcesoUtilidades.setLayout(gridaBagLayoutPaginacionProcesoUtilidades);						
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 0;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonAnterioresProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					
						
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoUtilidades.gridy = 0;
			
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonNuevoGuardarCambiosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
						
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoUtilidades.gridy = 0;
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonSiguientesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonNuevoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
						
			
			
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
				this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoUtilidades.gridy = 1;
				this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoUtilidades.add(this.jButtonGuardarCambiosTablaProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			}
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonProcesarInformacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonDuplicarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonCopiarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonVerFormProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 1;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoUtilidades.add(this.jButtonCerrarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		
		this.jButtonRecargarInformacionProcesoUtilidades.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoUtilidades.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoUtilidades.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoUtilidades.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoUtilidades.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoUtilidades.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoUtilidades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoUtilidades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoUtilidades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoUtilidades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoUtilidades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoUtilidades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoUtilidades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoUtilidades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoUtilidades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoUtilidades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoUtilidades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoUtilidades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoUtilidades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoUtilidades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoUtilidades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoUtilidades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoUtilidades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoUtilidades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoUtilidades.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoUtilidades.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoUtilidades.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoUtilidades.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoUtilidades.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoUtilidades = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoUtilidades = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoUtilidades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoUtilidades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoUtilidades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoUtilidades = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoUtilidades.setLayout(gridaBagParametrosReportesProcesoUtilidades);
			this.jPanelParametrosReportesAccionesProcesoUtilidades.setLayout(gridaBagParametrosReportesAccionesProcesoUtilidades);
			
			
			this.jPanelParametrosAuxiliar1ProcesoUtilidades.setLayout(gridaBagParametrosAuxiliar1ProcesoUtilidades);
			this.jPanelParametrosAuxiliar2ProcesoUtilidades.setLayout(gridaBagParametrosAuxiliar2ProcesoUtilidades);
			this.jPanelParametrosAuxiliar3ProcesoUtilidades.setLayout(gridaBagParametrosAuxiliar3ProcesoUtilidades);
			this.jPanelParametrosAuxiliar4ProcesoUtilidades.setLayout(gridaBagParametrosAuxiliar4ProcesoUtilidades);
			//this.jPanelParametrosAuxiliar5ProcesoUtilidades.setLayout(gridaBagParametrosAuxiliar2ProcesoUtilidades);			
			
			
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jButtonRecargarInformacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoUtilidades.add(this.jComboBoxTiposPaginacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoUtilidades.add(this.jCheckBoxConAltoMaximoTablaProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoUtilidades.add(this.jComboBoxTiposArchivosReportesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jPanelParametrosAuxiliar1ProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoUtilidades.add(this.jComboBoxTiposReportesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);																		
			
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoUtilidades.add(this.jComboBoxTiposGraficosReportesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jPanelParametrosAuxiliar4ProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jComboBoxTiposReportesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jCheckBoxGenerarReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jPanelParametrosAuxiliar2ProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jLabelAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jComboBoxTiposSeleccionarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
			
			
			/*
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jCheckBoxSeleccionarTodosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jCheckBoxConGraficoReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoUtilidades.add(this.jCheckBoxSeleccionarTodosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);															
				
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoUtilidades.add(this.jCheckBoxSeleccionadosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);															
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoUtilidades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoUtilidades.add(this.jCheckBoxConGraficoReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jPanelParametrosAuxiliar3ProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoUtilidades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoUtilidades.add(this.jComboBoxTiposAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoUtilidades = new GridBagLayout();

			this.jScrollPanelDatosProcesoUtilidades.setLayout(gridaBagLayoutDatosProcesoUtilidades);
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = 0;
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;
			
			this.jScrollPanelDatosProcesoUtilidades.add(this.jTableDatosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoUtilidades.setViewportView(this.jTableDatosProcesoUtilidades);
		this.jTableDatosProcesoUtilidades.setFillsViewportHeight(true);
		this.jTableDatosProcesoUtilidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoUtilidades= new GridBagLayout();
		this.jPanelAccionesProcesoUtilidades.setLayout(gridaBagLayoutAccionesProcesoUtilidades);
		
		
		/*	
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
			
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonNuevoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.setLayout(gridaBagLayoutBusquedaProcesoUtilidadesProcesoUtilidades);

		gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoUtilidades.gridy = 0;
		gridBagConstraintsProcesoUtilidades.gridx = 0;
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.add(jLabelid_anioBusquedaProcesoUtilidadesProcesoUtilidades, gridBagConstraintsProcesoUtilidades);

		gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoUtilidades.gridy = 0;
		gridBagConstraintsProcesoUtilidades.gridx = 1;
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.add(jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades, gridBagConstraintsProcesoUtilidades);


		gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoUtilidades.gridy = 1;
		gridBagConstraintsProcesoUtilidades.gridx = 0;
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.add(jLabelvalorBusquedaProcesoUtilidadesProcesoUtilidades, gridBagConstraintsProcesoUtilidades);

		gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoUtilidades.gridy = 1;
		gridBagConstraintsProcesoUtilidades.gridx = 1;
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.add(jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades, gridBagConstraintsProcesoUtilidades);

		gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoUtilidades.gridy = 2;
		gridBagConstraintsProcesoUtilidades.gridx =1;
		jPanelBusquedaProcesoUtilidadesProcesoUtilidades.add(jButtonBusquedaProcesoUtilidadesProcesoUtilidades, gridBagConstraintsProcesoUtilidades);

		jTabbedPaneBusquedasProcesoUtilidades.addTab("1.-Por Anio Por Valor ", jPanelBusquedaProcesoUtilidadesProcesoUtilidades);
		jTabbedPaneBusquedasProcesoUtilidades.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoUtilidades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoUtilidades);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();						
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;		
			//this.gridBagConstraintsProcesoUtilidades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoUtilidades.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;		
		//this.gridBagConstraintsProcesoUtilidades.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoUtilidades.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoUtilidades);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;		
			this.gridBagConstraintsProcesoUtilidades.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoUtilidades.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);								
		
		
		/*
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		*/		
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoUtilidades.gridx =0;
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoUtilidades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
				
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoUtilidades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoUtilidades = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoUtilidades.setLayout(gridaBagLayoutBusquedasParametrosProcesoUtilidades);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoUtilidades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoUtilidades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoUtilidades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoUtilidades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoUtilidades.setVisible(false);
		this.jButtonAnterioresProcesoUtilidades.setVisible(false);
		this.jButtonSiguientesProcesoUtilidades.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoUtilidades.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoUtilidades.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoUtilidades.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoUtilidades.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposReportesProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposAccionesProcesoUtilidades.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoUtilidades.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoUtilidades.setVisible(false);
		
		this.jPanelParametrosReportesProcesoUtilidades.setVisible(false);
		
		
		this.jTtoolBarProcesoUtilidades.setVisible(false);
			
		this.jMenuItemAnterioresProcesoUtilidades.setVisible(false);
		this.jMenuItemSiguientesProcesoUtilidades.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoUtilidades.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoUtilidades.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoUtilidades.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoUtilidades.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoUtilidades.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoUtilidades.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoUtilidades.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoUtilidades.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoUtilidades;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoUtilidades() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoUtilidades = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoUtilidades.setName("jPanelReporteDinamicoProcesoUtilidades"); 
		
		this.jPanelReporteDinamicoProcesoUtilidades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoUtilidades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoUtilidades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoUtilidades.setLayout(gridaBagLayoutReporteDinamicoProcesoUtilidades);
		
		
		this.jInternalFrameReporteDinamicoProcesoUtilidades= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoUtilidades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoUtilidades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoUtilidades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoUtilidades.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoUtilidades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoUtilidades.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoUtilidades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoUtilidades.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoUtilidades.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoUtilidades.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoUtilidades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoUtilidades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoUtilidades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoUtilidades = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoUtilidades.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelColumnasSelectReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoUtilidades = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoUtilidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoUtilidades.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoUtilidades=new JScrollPane(this.jListColumnasSelectReporteProcesoUtilidades);
			
			this.jScrollColumnasSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoUtilidades.add(this.jListColumnasSelectReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jScrollColumnasSelectReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoUtilidades = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoUtilidades.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoUtilidades = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoUtilidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoUtilidades.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoUtilidades=new JScrollPane(this.jListRelacionesSelectReporteProcesoUtilidades);
			
			this.jScrollRelacionesSelectReporteProcesoUtilidades.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoUtilidades.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoUtilidades.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoUtilidades = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoUtilidades = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoUtilidades = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoUtilidades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoUtilidades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoUtilidades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoUtilidades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoUtilidades = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoUtilidades.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelConGraficoDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoUtilidades.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoUtilidades.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoUtilidades.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoUtilidades.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoUtilidades.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jCheckBoxConGraficoDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoUtilidades = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoUtilidades.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelColumnaCategoriaGraficoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoUtilidades = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoUtilidades.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelColumnaCategoriaValorProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoUtilidades.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoUtilidades.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoUtilidades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoUtilidades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoUtilidades.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jComboBoxColumnaCategoriaValorProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoUtilidades = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoUtilidades.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelColumnasValoresGraficoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoUtilidades = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoUtilidades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoUtilidades.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoUtilidades.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoUtilidades.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoUtilidades.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoUtilidades=new JScrollPane(this.jListColumnasValoresGraficoProcesoUtilidades);
			
			this.jScrollColumnasValoresGraficoProcesoUtilidades.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoUtilidades.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoUtilidades.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoUtilidades.add(this.jListColumnasSelectReporteProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jScrollColumnasValoresGraficoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelTiposGraficosReportesDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoUtilidades.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelGenerarExcelReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades.setToolTipText("Generar EXCEL"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		//this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoUtilidades.add(this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jComboBoxTiposReportesDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jLabelTiposArchivoReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoUtilidades = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoUtilidades.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoUtilidades,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoUtilidades.setToolTipText("Generar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jButtonGenerarReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoUtilidades = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoUtilidades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoUtilidades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoUtilidades.setToolTipText("Cancelar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoUtilidades.add(this.jButtonCerrarReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoUtilidades = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoUtilidades= new JScrollPane(jPanelReporteDinamicoProcesoUtilidades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoUtilidades.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoUtilidades.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoUtilidades.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoUtilidades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoUtilidades.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoUtilidades);
		this.jInternalFrameReporteDinamicoProcesoUtilidades.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoUtilidades() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoUtilidades = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoUtilidades.setName("jPanelImportacionProcesoUtilidades"); 
		
		this.jPanelImportacionProcesoUtilidades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoUtilidades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoUtilidades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoUtilidades.setLayout(gridaBagLayoutImportacionProcesoUtilidades);
		
		
		this.jInternalFrameImportacionProcesoUtilidades= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoUtilidades= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoUtilidades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoUtilidades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoUtilidades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoUtilidades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoUtilidades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoUtilidades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoUtilidades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoUtilidades.setResizable(true);
	    this.jInternalFrameImportacionProcesoUtilidades.setClosable(true);
	    this.jInternalFrameImportacionProcesoUtilidades.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoUtilidades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoUtilidades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoUtilidades.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoUtilidades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoUtilidades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoUtilidades.setResizable(true);
	    this.jInternalFrameImportacionProcesoUtilidades.setClosable(true);
	    this.jInternalFrameImportacionProcesoUtilidades.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoUtilidades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoUtilidades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoUtilidades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoUtilidades = new JLabelMe();

		this.jLabelArchivoImportacionProcesoUtilidades.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoUtilidades.add(this.jLabelArchivoImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoUtilidades = new JFileChooser();		
		this.jFileChooserImportacionProcesoUtilidades.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoUtilidades = new JButtonMe();
		this.jButtonAbrirImportacionProcesoUtilidades.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoUtilidades,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoUtilidades.setToolTipText("Generar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoUtilidades.add(this.jButtonAbrirImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoUtilidades = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoUtilidades.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoUtilidades.add(this.jLabelPathArchivoImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoUtilidades=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoUtilidades.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoUtilidades.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoUtilidades.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoUtilidades.add(this.jTextFieldPathArchivoImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoUtilidades = new JButtonMe();
		this.jButtonGenerarImportacionProcesoUtilidades.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoUtilidades,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoUtilidades.setToolTipText("Generar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoUtilidades.add(this.jButtonGenerarImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoUtilidades = new JButtonMe();
		this.jButtonCerrarImportacionProcesoUtilidades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoUtilidades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoUtilidades.setToolTipText("Cancelar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoUtilidades.add(this.jButtonCerrarImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoUtilidades = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoUtilidades= new JScrollPane(jPanelImportacionProcesoUtilidades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoUtilidades.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoUtilidades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoUtilidades.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoUtilidades);
		this.jInternalFrameImportacionProcesoUtilidades.getContentPane().add(this.jScrollPanelImportacionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoUtilidades(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoUtilidades = new JButtonMe();
			this.jButtonAbrirOrderByProcesoUtilidades.setText("Orden");
			this.jButtonAbrirOrderByProcesoUtilidades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoUtilidades,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoUtilidades";
			inputMap = this.jButtonAbrirOrderByProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoUtilidades"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoUtilidades = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoUtilidades.setName("jPanelOrderByProcesoUtilidades"); 
			
			this.jPanelOrderByProcesoUtilidades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoUtilidades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoUtilidades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoUtilidades.setLayout(gridaBagLayoutOrderByProcesoUtilidades);
			
			
			this.jTableDatosProcesoUtilidadesOrderBy = new JTableMe();        
			this.jTableDatosProcesoUtilidadesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoUtilidadesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoUtilidadesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoUtilidadesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoUtilidadesOrderBy.setViewportView(this.jTableDatosProcesoUtilidadesOrderBy);
			this.jTableDatosProcesoUtilidadesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoUtilidadesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoUtilidades= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoUtilidades= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoUtilidades = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoUtilidades= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoUtilidades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoUtilidades.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoUtilidades.setTitle("Orden");
			this.jInternalFrameOrderByProcesoUtilidades.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoUtilidades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoUtilidades.setResizable(true);
			this.jInternalFrameOrderByProcesoUtilidades.setClosable(true);
			this.jInternalFrameOrderByProcesoUtilidades.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoUtilidades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoUtilidades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoUtilidades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoUtilidades.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoUtilidades.ipady =150;
				
			this.jPanelOrderByProcesoUtilidades.add(jScrollPanelDatosProcesoUtilidadesOrderBy, this.gridBagConstraintsProcesoUtilidades);//this.jTableDatosProcesoUtilidadesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoUtilidades = new JButtonMe();
			this.jButtonCerrarOrderByProcesoUtilidades.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoUtilidades,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoUtilidades.setToolTipText("Cancelar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoUtilidades.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoUtilidades.add(this.jButtonCerrarOrderByProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoUtilidades = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoUtilidades= new JScrollPane(jPanelOrderByProcesoUtilidades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoUtilidades.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoUtilidades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoUtilidades.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoUtilidades);
			
			this.jInternalFrameOrderByProcesoUtilidades.getContentPane().add(this.jScrollPanelOrderByProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
		
		} else {
			this.jButtonAbrirOrderByProcesoUtilidades = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoutilidadesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoUtilidades.getRowHeight();//ProcesoUtilidadesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.isSelected()) {
					iHeightTable=ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoUtilidades.isSelected()) {
					iHeightTable=ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoUtilidadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoUtilidades.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoUtilidades.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoUtilidades.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoUtilidades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoUtilidades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoUtilidades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoUtilidades!=null && this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoUtilidades.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoUtilidades.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoUtilidades.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoUtilidades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoUtilidades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoUtilidades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoutilidadesLogic.getProcesoUtilidadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoutilidadess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoUtilidades> TraerProcesoUtilidadesBeans(List<ProcesoUtilidades> procesoutilidadess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoUtilidades procesoutilidades:procesoutilidadess) {
					
				if(!(ProcesoUtilidadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoUtilidadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoutilidades.setsDetalleGeneralEntityReporte(ProcesoUtilidadesConstantesFunciones.getProcesoUtilidadesDescripcion(procesoutilidades));
										
						
					
						
					
				} else  {
							
					//procesoutilidades.setsDetalleGeneralEntityReporte(procesoutilidades.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoutilidadesbeans.add(procesoutilidadesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoutilidadess;
    }
	//PARA REPORTES FIN
}
