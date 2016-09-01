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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.PlanetaSistemaSolarConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class PlanetaSistemaSolarJInternalFrame extends PlanetaSistemaSolarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPlanetaSistemaSolar;
	
	protected JMenuBar jmenuBarPlanetaSistemaSolar;
	
	protected JMenu jmenuPlanetaSistemaSolar;
	protected JMenu jmenuDatosPlanetaSistemaSolar;
	protected JMenu jmenuArchivoPlanetaSistemaSolar;
	protected JMenu jmenuAccionesPlanetaSistemaSolar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlanetaSistemaSolar;	
	protected GridBagConstraints gridBagConstraintsPlanetaSistemaSolar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame jInternalFrameDetalleFormPlanetaSistemaSolar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPlanetaSistemaSolar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPlanetaSistemaSolar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean;
		
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PlanetaSistemaSolar> planetasistemasolars;		
	public List<PlanetaSistemaSolar> planetasistemasolarsEliminados;	
	public List<PlanetaSistemaSolar> planetasistemasolarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPlanetaSistemaSolar;		
	protected JButton jButtonAbrirOrderByPlanetaSistemaSolar;
	
	
	//protected JPanel jPanelOrderByPlanetaSistemaSolar;
	//public JScrollPane jScrollPanelOrderByPlanetaSistemaSolar;	
	//protected JButton jButtonCerrarOrderByPlanetaSistemaSolar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PlanetaSistemaSolarLogic planetasistemasolarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPlanetaSistemaSolar;
	public JScrollPane jScrollPanelDatosEdicionPlanetaSistemaSolar;
	public JScrollPane jScrollPanelDatosGeneralPlanetaSistemaSolar;
    
	
	
	//public JScrollPane jScrollPanelDatosPlanetaSistemaSolarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPlanetaSistemaSolar;
	//public JScrollPane jScrollPanelImportacionPlanetaSistemaSolar;
	
	
	
	protected JPanel jPanelAccionesPlanetaSistemaSolar;
	
    protected JPanel jPanelPaginacionPlanetaSistemaSolar;
    protected JPanel jPanelParametrosReportesPlanetaSistemaSolar;
	protected JPanel jPanelParametrosReportesAccionesPlanetaSistemaSolar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PlanetaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar2PlanetaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar3PlanetaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar4PlanetaSistemaSolar;
	//protected JPanel jPanelParametrosAuxiliar5PlanetaSistemaSolar;
	
	
	
	//protected JPanel jPanelReporteDinamicoPlanetaSistemaSolar;
	//protected JPanel jPanelImportacionPlanetaSistemaSolar;
	
	
	public JTable jTableDatosPlanetaSistemaSolar;
	
	
	
	//public JTable jTableDatosPlanetaSistemaSolarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPlanetaSistemaSolar;
	protected JButton jButtonDuplicarPlanetaSistemaSolar;
	protected JButton jButtonCopiarPlanetaSistemaSolar;
	protected JButton jButtonVerFormPlanetaSistemaSolar;
	protected JButton jButtonNuevoRelacionesPlanetaSistemaSolar;
	protected JButton jButtonModificarPlanetaSistemaSolar;
	
    protected JButton jButtonGuardarCambiosTablaPlanetaSistemaSolar;
	protected JButton jButtonCerrarPlanetaSistemaSolar;
	
	
	protected JButton jButtonRecargarInformacionPlanetaSistemaSolar;
	protected JButton jButtonProcesarInformacionPlanetaSistemaSolar;
	
	
	protected JButton jButtonAnterioresPlanetaSistemaSolar;
	protected JButton jButtonSiguientesPlanetaSistemaSolar;
	protected JButton jButtonNuevoGuardarCambiosPlanetaSistemaSolar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPlanetaSistemaSolar;
	//protected JButton jButtonCerrarReporteDinamicoPlanetaSistemaSolar;
	//protected JButton jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar;	
	
	
	
	//protected JButton jButtonAbrirImportacionPlanetaSistemaSolar;
	//protected JButton jButtonGenerarImportacionPlanetaSistemaSolar;
	//protected JButton jButtonCerrarImportacionPlanetaSistemaSolar;
	//protected JFileChooser jFileChooserImportacionPlanetaSistemaSolar;
	//protected File fileImportacionPlanetaSistemaSolar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlanetaSistemaSolar;
	protected JButton jButtonDuplicarToolBarPlanetaSistemaSolar;
	protected JButton jButtonNuevoRelacionesToolBarPlanetaSistemaSolar;
	
	
	public JButton jButtonGuardarCambiosToolBarPlanetaSistemaSolar;
	protected JButton jButtonCopiarToolBarPlanetaSistemaSolar;
	protected JButton jButtonVerFormToolBarPlanetaSistemaSolar;
	public JButton jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar;
	protected JButton jButtonMostrarOcultarTablaToolBarPlanetaSistemaSolar;
	protected JButton jButtonCerrarToolBarPlanetaSistemaSolar;
	
	protected JButton jButtonRecargarInformacionToolBarPlanetaSistemaSolar;
	protected JButton jButtonProcesarInformacionToolBarPlanetaSistemaSolar;
	protected JButton jButtonAnterioresToolBarPlanetaSistemaSolar;
	protected JButton jButtonSiguientesToolBarPlanetaSistemaSolar;
	protected JButton jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar;
	protected JButton jButtonAbrirOrderByToolBarPlanetaSistemaSolar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDuplicarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemNuevoRelacionesPlanetaSistemaSolar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPlanetaSistemaSolar;
	protected JMenuItem jMenuItemCopiarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemVerFormPlanetaSistemaSolar;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlanetaSistemaSolar;
	protected JMenuItem jMenuItemCerrarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDetalleCerrarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlanetaSistemaSolar;
	
	protected JMenuItem jMenuItemRecargarInformacionPlanetaSistemaSolar;
	protected JMenuItem jMenuItemProcesarInformacionPlanetaSistemaSolar;
	protected JMenuItem jMenuItemAnterioresPlanetaSistemaSolar;
	protected JMenuItem jMenuItemSiguientesPlanetaSistemaSolar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar;
	protected JMenuItem jMenuItemAbrirOrderByPlanetaSistemaSolar;
	protected JMenuItem jMenuItemMostrarOcultarPlanetaSistemaSolar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlanetaSistemaSolar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPlanetaSistemaSolar;
	protected JCheckBox jCheckBoxSeleccionadosPlanetaSistemaSolar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar;
	protected JCheckBox jCheckBoxConGraficoReportePlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPlanetaSistemaSolar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPlanetaSistemaSolar;
	protected JTextField jTextFieldValorCampoGeneralPlanetaSistemaSolar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePlanetaSistemaSolar;
	//public JList<Reporte> jListColumnasSelectReportePlanetaSistemaSolar;
	//public JScrollPane jScrollColumnasSelectReportePlanetaSistemaSolar;
	
	//public JLabel jLabelRelacionesSelectReportePlanetaSistemaSolar;
	//public JList<Reporte> jListRelacionesSelectReportePlanetaSistemaSolar;
	//public JScrollPane jScrollRelacionesSelectReportePlanetaSistemaSolar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPlanetaSistemaSolar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPlanetaSistemaSolar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar;
	//public JLabel jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar;
	
		
	//public JLabel jLabelArchivoImportacionPlanetaSistemaSolar;	
	//public JLabel jLabelPathArchivoImportacionPlanetaSistemaSolar;
	//protected JTextField jTextFieldPathArchivoImportacionPlanetaSistemaSolar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPlanetaSistemaSolar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPlanetaSistemaSolar;
	
	//public JLabel jLabelColumnaCategoriaValorPlanetaSistemaSolar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPlanetaSistemaSolar;
	
	//public JLabel jLabelColumnasValoresGraficoPlanetaSistemaSolar;
	//public JList<Reporte> jListColumnasValoresGraficoPlanetaSistemaSolar;
	//public JScrollPane jScrollColumnasValoresGraficoPlanetaSistemaSolar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPlanetaSistemaSolar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPlanetaSistemaSolar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPlanetaSistemaSolar;
	public JPanel jPanelBusquedaPorCodigoPlanetaSistemaSolar;
	public JButton jButtonBusquedaPorCodigoPlanetaSistemaSolar;
	public JPanel jPanelFK_IdTipoValoracionPlanetaSistemaSolar;
	public JButton jButtonFK_IdTipoValoracionPlanetaSistemaSolar;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPlanetaSistemaSolar;
	public JLabel jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar;
	public JButton jButtoncodigoBusquedaPorCodigoPlanetaSistemaSolarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar;
	public JLabel jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar;
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolarBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PlanetaSistemaSolarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPlanetaSistemaSolar)	{
		this.jButtonRecargarInformacionPlanetaSistemaSolar = jButtonRecargarInformacionPlanetaSistemaSolar;
	}
	
	public JButton getjButtonProcesarInformacionPlanetaSistemaSolar() {
		return this.jButtonProcesarInformacionPlanetaSistemaSolar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlanetaSistemaSolar)	{
		this.jButtonProcesarInformacionPlanetaSistemaSolar = jButtonProcesarInformacionPlanetaSistemaSolar;
	}
	
	
	public JButton getjButtonRecargarInformacionPlanetaSistemaSolar() {
		return this.jButtonRecargarInformacionPlanetaSistemaSolar;
	}
	
	
	public List<PlanetaSistemaSolar> getplanetasistemasolars() {
		return this.planetasistemasolars;
	}

	public void setplanetasistemasolars(List<PlanetaSistemaSolar> planetasistemasolars) {
		this.planetasistemasolars = planetasistemasolars;
	}
	
	public List<PlanetaSistemaSolar> getplanetasistemasolarsAux() {
		return this.planetasistemasolarsAux;
	}

	public void setplanetasistemasolarsAux(List<PlanetaSistemaSolar> planetasistemasolarsAux) {
		this.planetasistemasolarsAux = planetasistemasolarsAux;
	}
	
	public List<PlanetaSistemaSolar> getplanetasistemasolarsEliminados() {
		return this.planetasistemasolarsEliminados;
	}

	public void setPlanetaSistemaSolarsEliminados(List<PlanetaSistemaSolar> planetasistemasolarsEliminados) {
		this.planetasistemasolarsEliminados = planetasistemasolarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPlanetaSistemaSolar() {
		return jComboBoxTiposSeleccionarPlanetaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPlanetaSistemaSolar(
			JComboBox jComboBoxTiposSeleccionarPlanetaSistemaSolar) {
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar = jComboBoxTiposSeleccionarPlanetaSistemaSolar;
	}
	
	public void setBorderResaltarTiposSeleccionarPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPlanetaSistemaSolar() {
		return jTextFieldValorCampoGeneralPlanetaSistemaSolar;
	}

	public void setjTextFieldValorCampoGeneralPlanetaSistemaSolar(
			JTextField jTextFieldValorCampoGeneralPlanetaSistemaSolar) {
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar = jTextFieldValorCampoGeneralPlanetaSistemaSolar;
	}

	public void setBorderResaltarValorCampoGeneralPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPlanetaSistemaSolar() {
		return this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar;
	}

	public void setjCheckBoxSeleccionarTodosPlanetaSistemaSolar(
			JCheckBox jCheckBoxSeleccionarTodosPlanetaSistemaSolar) {
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar = jCheckBoxSeleccionarTodosPlanetaSistemaSolar;
	}

	public void setBorderResaltarSeleccionarTodosPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPlanetaSistemaSolar() {
		return this.jCheckBoxSeleccionadosPlanetaSistemaSolar;
	}

	public void setjCheckBoxSeleccionadosPlanetaSistemaSolar(
			JCheckBox jCheckBoxSeleccionadosPlanetaSistemaSolar) {
		this.jCheckBoxSeleccionadosPlanetaSistemaSolar = jCheckBoxSeleccionadosPlanetaSistemaSolar;
	}
	
	public void setBorderResaltarSeleccionadosPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPlanetaSistemaSolar() {
		return this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposArchivosReportesPlanetaSistemaSolar) {
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar = jComboBoxTiposArchivosReportesPlanetaSistemaSolar;
	}

	public void setBorderResaltarTiposArchivosReportesPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPlanetaSistemaSolar() {
		return this.jComboBoxTiposReportesPlanetaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposReportesPlanetaSistemaSolar) {
		this.jComboBoxTiposReportesPlanetaSistemaSolar = jComboBoxTiposReportesPlanetaSistemaSolar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPlanetaSistemaSolar() {
	//	return jComboBoxTiposReportesDinamicoPlanetaSistemaSolar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPlanetaSistemaSolar(
	//		JComboBox jComboBoxTiposReportesDinamicoPlanetaSistemaSolar) {
	//	this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar = jComboBoxTiposReportesDinamicoPlanetaSistemaSolar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar() {
	//	return jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar = jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar;
	//}
	
	public void setBorderResaltarTiposReportesPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPlanetaSistemaSolar() {
		return this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposGraficosReportesPlanetaSistemaSolar) {
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar = jComboBoxTiposGraficosReportesPlanetaSistemaSolar;
	}
	
	public void setBorderResaltarTiposGraficosReportesPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPlanetaSistemaSolar() {
		return this.jComboBoxTiposPaginacionPlanetaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPlanetaSistemaSolar(
			JComboBox jComboBoxTiposPaginacionPlanetaSistemaSolar) {
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar = jComboBoxTiposPaginacionPlanetaSistemaSolar;
	}
	
	public void setBorderResaltarTiposPaginacionPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPlanetaSistemaSolar() {
		return this.jComboBoxTiposRelacionesPlanetaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlanetaSistemaSolar() {
		return this.jComboBoxTiposAccionesPlanetaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposRelacionesPlanetaSistemaSolar) {
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar = jComboBoxTiposRelacionesPlanetaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposAccionesPlanetaSistemaSolar) {
		this.jComboBoxTiposAccionesPlanetaSistemaSolar = jComboBoxTiposAccionesPlanetaSistemaSolar;
	}
	
	public void setBorderResaltarTiposRelacionesPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPlanetaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPlanetaSistemaSolar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPlanetaSistemaSolar() {
	//	return jCheckBoxConGraficoDinamicoPlanetaSistemaSolar;
	//}

	//public void setjCheckBoxConGraficoDinamicoPlanetaSistemaSolar(
	//		JCheckBox jCheckBoxConGraficoDinamicoPlanetaSistemaSolar) {
	//	this.jCheckBoxConGraficoDinamicoPlanetaSistemaSolar = jCheckBoxConGraficoDinamicoPlanetaSistemaSolar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPlanetaSistemaSolar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPlanetaSistemaSolar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPlanetaSistemaSolar .setBorder(borderResaltar);		
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
		this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		
		this.planetasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planetasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planetasistemasolarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlanetaSistemaSolarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeta Sistema Solar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
		
		PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPlanetaSistemaSolar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"nuevo","nuevo","Nuevo"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"duplicar","duplicar","Duplicar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"copiar","copiar","Copiar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"ver_form","ver_form","Ver"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"recargar","recargar","Recargar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,
							"cerrar","cerrar","Salir"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPlanetaSistemaSolar;
			
				this.jButtonProcesarInformacionToolBarPlanetaSistemaSolar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPlanetaSistemaSolar;
				
		//protected JButton jButtonModificarToolBarPlanetaSistemaSolar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPlanetaSistemaSolar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPlanetaSistemaSolar=new JMenuMe("General");
		this.jmenuArchivoPlanetaSistemaSolar=new JMenuMe("Archivo");
		this.jmenuAccionesPlanetaSistemaSolar=new JMenuMe("Acciones");
		this.jmenuDatosPlanetaSistemaSolar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlanetaSistemaSolar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlanetaSistemaSolar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlanetaSistemaSolar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPlanetaSistemaSolar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPlanetaSistemaSolar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPlanetaSistemaSolar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPlanetaSistemaSolar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPlanetaSistemaSolar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPlanetaSistemaSolar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlanetaSistemaSolar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPlanetaSistemaSolar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPlanetaSistemaSolar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPlanetaSistemaSolar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPlanetaSistemaSolar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPlanetaSistemaSolar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPlanetaSistemaSolar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlanetaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlanetaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlanetaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPlanetaSistemaSolar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPlanetaSistemaSolar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPlanetaSistemaSolar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPlanetaSistemaSolar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPlanetaSistemaSolar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPlanetaSistemaSolar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPlanetaSistemaSolar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPlanetaSistemaSolar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPlanetaSistemaSolar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPlanetaSistemaSolar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPlanetaSistemaSolar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPlanetaSistemaSolar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPlanetaSistemaSolar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPlanetaSistemaSolar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPlanetaSistemaSolar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlanetaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlanetaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlanetaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPlanetaSistemaSolar.add(this.jMenuItemCerrarPlanetaSistemaSolar);
			
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemNuevoPlanetaSistemaSolar);
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar);
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemNuevoRelacionesPlanetaSistemaSolar);
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar);		
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemDuplicarPlanetaSistemaSolar);		
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemCopiarPlanetaSistemaSolar);		
			this.jmenuAccionesPlanetaSistemaSolar.add(this.jMenuItemVerFormPlanetaSistemaSolar);		
			
			this.jmenuDatosPlanetaSistemaSolar.add(this.jMenuItemRecargarInformacionPlanetaSistemaSolar);				
			this.jmenuDatosPlanetaSistemaSolar.add(this.jMenuItemAnterioresPlanetaSistemaSolar);				
			this.jmenuDatosPlanetaSistemaSolar.add(this.jMenuItemSiguientesPlanetaSistemaSolar);				
			this.jmenuDatosPlanetaSistemaSolar.add(this.jMenuItemAbrirOrderByPlanetaSistemaSolar);				
			this.jmenuDatosPlanetaSistemaSolar.add(this.jMenuItemMostrarOcultarPlanetaSistemaSolar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPlanetaSistemaSolar.add(this.jMenuItemGuardarCambiosPlanetaSistemaSolar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPlanetaSistemaSolar.add(this.jmenuArchivoPlanetaSistemaSolar);		
			this.jmenuBarPlanetaSistemaSolar.add(this.jmenuAccionesPlanetaSistemaSolar);		
			this.jmenuBarPlanetaSistemaSolar.add(this.jmenuDatosPlanetaSistemaSolar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPlanetaSistemaSolar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPlanetaSistemaSolar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPlanetaSistemaSolar.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPlanetaSistemaSolar= new JButtonMe();
		this.jButtonBusquedaPorCodigoPlanetaSistemaSolar.setText("Buscar");
		this.jButtonBusquedaPorCodigoPlanetaSistemaSolar.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPlanetaSistemaSolar,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar.setToolTipText("Buscar Por Tipo Valoracion ");
		this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar= new JButtonMe();
		this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar.setText("Buscar");
		this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar.setToolTipText("Buscar Por Tipo Valoracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar,"buscar_button","Buscar Por Tipo Valoracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar = new JLabelMe();
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setText("Tipo Valoracion :");
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setToolTipText("Tipo Valoracion");
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar= new JComboBoxMe();
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPlanetaSistemaSolar=new JTabbedPane();


		this.jTabbedPaneBusquedasPlanetaSistemaSolar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlanetaSistemaSolar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlanetaSistemaSolar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPlanetaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePlanetaSistemaSolar = new PlanetaSistemaSolarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Planeta Sistema Solar DATOS");
			this.jInternalFrameDetalleFormPlanetaSistemaSolar = new PlanetaSistemaSolarDetalleFormJInternalFrame(jDesktopPane,this.planetasistemasolarSessionBean.getConGuardarRelaciones(),this.planetasistemasolarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar = null;//new PlanetaSistemaSolarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlanetaSistemaSolar= new GridBagLayout();
		
		
		this.jTableDatosPlanetaSistemaSolar = new JTableMe();      
		
		String sToolTipPlanetaSistemaSolar="";
		sToolTipPlanetaSistemaSolar=PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlanetaSistemaSolar+="(Seguridad.PlanetaSistemaSolar)";
		}
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlanetaSistemaSolar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPlanetaSistemaSolar.setToolTipText(sToolTipPlanetaSistemaSolar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPlanetaSistemaSolar);
		this.jTableDatosPlanetaSistemaSolar.setAutoCreateRowSorter(true);
		this.jTableDatosPlanetaSistemaSolar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPlanetaSistemaSolar.setRowSelectionAllowed(true);
		this.jTableDatosPlanetaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPlanetaSistemaSolar = new JButtonMe();
		this.jButtonDuplicarPlanetaSistemaSolar = new JButtonMe();
		this.jButtonCopiarPlanetaSistemaSolar = new JButtonMe();
		this.jButtonVerFormPlanetaSistemaSolar = new JButtonMe();
		this.jButtonNuevoRelacionesPlanetaSistemaSolar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar = new JButtonMe();
		this.jButtonCerrarPlanetaSistemaSolar = new JButtonMe();
		
		this.jScrollPanelDatosPlanetaSistemaSolar = new JScrollPane();   
        this.jScrollPanelDatosGeneralPlanetaSistemaSolar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Planeta Sistema Solar";
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares" + this.sPath));
		} else {
			this.jScrollPanelDatosPlanetaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlanetaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesPlanetaSistemaSolar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPlanetaSistemaSolar=new ReporteDinamicoJInternalFrame(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPlanetaSistemaSolar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPlanetaSistemaSolar=new ImportacionJInternalFrame(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPlanetaSistemaSolar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPlanetaSistemaSolar = new JButtonMe();
		
		this.jButtonAbrirOrderByPlanetaSistemaSolar.setText("Orden");
		this.jButtonAbrirOrderByPlanetaSistemaSolar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlanetaSistemaSolar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlanetaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlanetaSistemaSolar,false,this);
			
			//this.cargarOrderByPlanetaSistemaSolar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlanetaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlanetaSistemaSolar,true,this);
			
			//this.cargarOrderByPlanetaSistemaSolar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPlanetaSistemaSolar.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosPlanetaSistemaSolar.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosPlanetaSistemaSolar.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosPlanetaSistemaSolar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlanetaSistemaSolar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlanetaSistemaSolar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPlanetaSistemaSolar.setText("Nuevo");
		this.jButtonDuplicarPlanetaSistemaSolar.setText("Duplicar");
		this.jButtonCopiarPlanetaSistemaSolar.setText("Copiar");
		this.jButtonVerFormPlanetaSistemaSolar.setText("Ver");
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setText("Guardar");
		this.jButtonCerrarPlanetaSistemaSolar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlanetaSistemaSolar,"nuevo_button","Nuevo",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPlanetaSistemaSolar,"duplicar_button","Duplicar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPlanetaSistemaSolar,"copiar_button","Copiar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPlanetaSistemaSolar,"ver_form","Ver",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPlanetaSistemaSolar,"nuevorelaciones_button","Nuevo Rel",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlanetaSistemaSolar,"guardarcambiostabla_button","Guardar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlanetaSistemaSolar,"cerrar_button","Salir",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPlanetaSistemaSolar.setToolTipText("Nuevo"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPlanetaSistemaSolar.setToolTipText("Duplicar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPlanetaSistemaSolar.setToolTipText("Copiar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPlanetaSistemaSolar.setToolTipText("Ver"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.setToolTipText("Nuevo Rel"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setToolTipText("Guardar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlanetaSistemaSolar.setToolTipText("Salir"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlanetaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlanetaSistemaSolar"));
		
		//DUPLICAR
		sMapKey = "DuplicarPlanetaSistemaSolar";
		inputMap = this.jButtonDuplicarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPlanetaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPlanetaSistemaSolar"));
		
		//COPIAR
		sMapKey = "CopiarPlanetaSistemaSolar";
		inputMap = this.jButtonCopiarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPlanetaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPlanetaSistemaSolar"));
		
		//VEr FORM
		sMapKey = "VerFormPlanetaSistemaSolar";
		inputMap = this.jButtonVerFormPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPlanetaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPlanetaSistemaSolar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoRelacionesPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPlanetaSistemaSolar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPlanetaSistemaSolar";
		inputMap = this.jButtonModificarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPlanetaSistemaSolar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPlanetaSistemaSolar";
		inputMap = this.jButtonCerrarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlanetaSistemaSolar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlanetaSistemaSolar";
		inputMap = this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlanetaSistemaSolar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPlanetaSistemaSolar.setName("jPanelParametrosReportesPlanetaSistemaSolar"); 
		
		this.jPanelParametrosReportesAccionesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPlanetaSistemaSolar.setName("jPanelParametrosReportesAccionesPlanetaSistemaSolar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPlanetaSistemaSolar = new JButtonMe();
		this.jButtonRecargarInformacionPlanetaSistemaSolar.setText("Recargar");
		this.jButtonRecargarInformacionPlanetaSistemaSolar.setToolTipText("Recargar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPlanetaSistemaSolar,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPlanetaSistemaSolar = new JButtonMe();
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setText("Procesar");
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setToolTipText("Procesar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setVisible(false);
			
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlanetaSistemaSolar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposReportesPlanetaSistemaSolar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setText("Paginacion");
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPlanetaSistemaSolar.setText("Accion");
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setText("Accion");
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setText("Accion");
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPlanetaSistemaSolar = new JLabelMe();
		
		this.jLabelAccionesPlanetaSistemaSolar.setText("Acciones");		
		this.jLabelAccionesPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPlanetaSistemaSolar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setText("Graf.");
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPlanetaSistemaSolar = new JButtonMe();
		//this.jButtonAnterioresPlanetaSistemaSolar.setText("<<");
        this.jButtonAnterioresPlanetaSistemaSolar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPlanetaSistemaSolar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPlanetaSistemaSolar = new JButtonMe();
		//this.jButtonSiguientesPlanetaSistemaSolar.setText(">>");
        this.jButtonSiguientesPlanetaSistemaSolar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPlanetaSistemaSolar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.setText("Nue");
        this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar,"nuevoguardarcambios_button","Nue",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPlanetaSistemaSolar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPlanetaSistemaSolar";
		inputMap = this.jButtonRecargarInformacionPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPlanetaSistemaSolar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPlanetaSistemaSolar";
		inputMap = this.jButtonSiguientesPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPlanetaSistemaSolar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPlanetaSistemaSolar";
		inputMap = this.jButtonAnterioresPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPlanetaSistemaSolar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPlanetaSistemaSolar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPlanetaSistemaSolar.setMinimumSize(new Dimension(this.getWidth(),PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlanetaSistemaSolar.setMaximumSize(new Dimension(this.getWidth(),PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlanetaSistemaSolar.setPreferredSize(new Dimension(this.getWidth(),PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlanetaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPlanetaSistemaSolar = new GridBagLayout();

			this.jPanelPaginacionPlanetaSistemaSolar.setLayout(gridaBagLayoutPaginacionPlanetaSistemaSolar);						
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonAnterioresPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					
						
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
			
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
						
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonSiguientesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonNuevoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
						
			
			
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
				this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonGuardarCambiosTablaPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			}
			
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonDuplicarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonCopiarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonVerFormPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPlanetaSistemaSolar.add(this.jButtonCerrarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
		
		
		this.jButtonRecargarInformacionPlanetaSistemaSolar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlanetaSistemaSolar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlanetaSistemaSolar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPlanetaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlanetaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlanetaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPlanetaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPlanetaSistemaSolar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PlanetaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PlanetaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PlanetaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PlanetaSistemaSolar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPlanetaSistemaSolar.setLayout(gridaBagParametrosReportesPlanetaSistemaSolar);
			this.jPanelParametrosReportesAccionesPlanetaSistemaSolar.setLayout(gridaBagParametrosReportesAccionesPlanetaSistemaSolar);
			
			
			this.jPanelParametrosAuxiliar1PlanetaSistemaSolar.setLayout(gridaBagParametrosAuxiliar1PlanetaSistemaSolar);
			this.jPanelParametrosAuxiliar2PlanetaSistemaSolar.setLayout(gridaBagParametrosAuxiliar2PlanetaSistemaSolar);
			this.jPanelParametrosAuxiliar3PlanetaSistemaSolar.setLayout(gridaBagParametrosAuxiliar3PlanetaSistemaSolar);
			this.jPanelParametrosAuxiliar4PlanetaSistemaSolar.setLayout(gridaBagParametrosAuxiliar4PlanetaSistemaSolar);
			//this.jPanelParametrosAuxiliar5PlanetaSistemaSolar.setLayout(gridaBagParametrosAuxiliar2PlanetaSistemaSolar);			
			
			
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jButtonRecargarInformacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlanetaSistemaSolar.add(this.jComboBoxTiposPaginacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlanetaSistemaSolar.add(this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlanetaSistemaSolar.add(this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jPanelParametrosAuxiliar1PlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PlanetaSistemaSolar.add(this.jComboBoxTiposReportesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jPanelParametrosAuxiliar4PlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jComboBoxTiposReportesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jCheckBoxGenerarReportePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jPanelParametrosAuxiliar2PlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jLabelAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jButtonAbrirOrderByPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jComboBoxTiposSeleccionarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
			
			
			/*
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlanetaSistemaSolar.add(this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);															
				
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlanetaSistemaSolar.add(this.jCheckBoxSeleccionadosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jPanelParametrosAuxiliar3PlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlanetaSistemaSolar.add(this.jComboBoxTiposAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPlanetaSistemaSolar = new GridBagLayout();

			this.jScrollPanelDatosPlanetaSistemaSolar.setLayout(gridaBagLayoutDatosPlanetaSistemaSolar);
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
			
			this.jScrollPanelDatosPlanetaSistemaSolar.add(this.jTableDatosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPlanetaSistemaSolar.setViewportView(this.jTableDatosPlanetaSistemaSolar);
		this.jTableDatosPlanetaSistemaSolar.setFillsViewportHeight(true);
		this.jTableDatosPlanetaSistemaSolar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPlanetaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesPlanetaSistemaSolar.setLayout(gridaBagLayoutAccionesPlanetaSistemaSolar);
		
		
		/*	
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
			
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonNuevoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPlanetaSistemaSolar.setLayout(gridaBagLayoutBusquedaPorCodigoPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
		jPanelBusquedaPorCodigoPlanetaSistemaSolar.add(jLabelcodigoBusquedaPorCodigoPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
		jPanelBusquedaPorCodigoPlanetaSistemaSolar.add(jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
		gridBagConstraintsPlanetaSistemaSolar.gridx =1;
		jPanelBusquedaPorCodigoPlanetaSistemaSolar.add(jButtonBusquedaPorCodigoPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		jTabbedPaneBusquedasPlanetaSistemaSolar.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPlanetaSistemaSolar);
		jTabbedPaneBusquedasPlanetaSistemaSolar.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoValoracionPlanetaSistemaSolar.setLayout(gridaBagLayoutFK_IdTipoValoracionPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
		jPanelFK_IdTipoValoracionPlanetaSistemaSolar.add(jLabelid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
		jPanelFK_IdTipoValoracionPlanetaSistemaSolar.add(jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlanetaSistemaSolar.gridy = 1;
		gridBagConstraintsPlanetaSistemaSolar.gridx =1;
		jPanelFK_IdTipoValoracionPlanetaSistemaSolar.add(jButtonFK_IdTipoValoracionPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);

		jTabbedPaneBusquedasPlanetaSistemaSolar.addTab("2.-Por Tipo Valoracion ", jPanelFK_IdTipoValoracionPlanetaSistemaSolar);
		jTabbedPaneBusquedasPlanetaSistemaSolar.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlanetaSistemaSolar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();						
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;		
			//this.gridBagConstraintsPlanetaSistemaSolar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;		
		//this.gridBagConstraintsPlanetaSistemaSolar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPlanetaSistemaSolar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;		
			this.gridBagConstraintsPlanetaSistemaSolar.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);								
		
		
		/*
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		*/		
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =0;
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlanetaSistemaSolar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
				
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPlanetaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlanetaSistemaSolar = new GridBagLayout();
			this.jPanelBusquedasParametrosPlanetaSistemaSolar.setLayout(gridaBagLayoutBusquedasParametrosPlanetaSistemaSolar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPlanetaSistemaSolar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPlanetaSistemaSolar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPlanetaSistemaSolar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setName("jPanelReporteDinamicoPlanetaSistemaSolar"); 
		
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPlanetaSistemaSolar.setLayout(gridaBagLayoutReporteDinamicoPlanetaSistemaSolar);
		
		
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlanetaSistemaSolar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setResizable(true);
	    this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setClosable(true);
	    this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePlanetaSistemaSolar = new JLabelMe();

		this.jLabelColumnasSelectReportePlanetaSistemaSolar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jLabelColumnasSelectReportePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePlanetaSistemaSolar = new JList<Reporte>();
		this.jListColumnasSelectReportePlanetaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePlanetaSistemaSolar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePlanetaSistemaSolar=new JScrollPane(this.jListColumnasSelectReportePlanetaSistemaSolar);
			
			this.jScrollColumnasSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jListColumnasSelectReportePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jScrollColumnasSelectReportePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePlanetaSistemaSolar = new JLabelMe();

		this.jLabelRelacionesSelectReportePlanetaSistemaSolar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePlanetaSistemaSolar = new JList<Reporte>();
		this.jListRelacionesSelectReportePlanetaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePlanetaSistemaSolar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePlanetaSistemaSolar=new JScrollPane(this.jListRelacionesSelectReportePlanetaSistemaSolar);
			
			this.jScrollRelacionesSelectReportePlanetaSistemaSolar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlanetaSistemaSolar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlanetaSistemaSolar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPlanetaSistemaSolar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPlanetaSistemaSolar = new JComboBoxMe();
		this.jListColumnasValoresGraficoPlanetaSistemaSolar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jLabelGenerarExcelReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar.setToolTipText("Generar EXCEL"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jComboBoxTiposReportesDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jLabelTiposArchivoReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jComboBoxTiposArchivosReportesDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar.setToolTipText("Generar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar.setToolTipText("Cancelar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlanetaSistemaSolar.add(this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPlanetaSistemaSolar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar= new JScrollPane(jPanelReporteDinamicoPlanetaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPlanetaSistemaSolar);
		this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getContentPane().add(this.jScrollPanelReporteDinamicoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPlanetaSistemaSolar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPlanetaSistemaSolar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPlanetaSistemaSolar.setName("jPanelImportacionPlanetaSistemaSolar"); 
		
		this.jPanelImportacionPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPlanetaSistemaSolar.setLayout(gridaBagLayoutImportacionPlanetaSistemaSolar);
		
		
		this.jInternalFrameImportacionPlanetaSistemaSolar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPlanetaSistemaSolar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPlanetaSistemaSolar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlanetaSistemaSolar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPlanetaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlanetaSistemaSolar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlanetaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setResizable(true);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setClosable(true);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPlanetaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlanetaSistemaSolar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlanetaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setResizable(true);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setClosable(true);
	    this.jInternalFrameImportacionPlanetaSistemaSolar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPlanetaSistemaSolar = new JLabelMe();

		this.jLabelArchivoImportacionPlanetaSistemaSolar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jLabelArchivoImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPlanetaSistemaSolar = new JFileChooser();		
		this.jFileChooserImportacionPlanetaSistemaSolar.setToolTipText("ESCOGER ARCHIVO"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPlanetaSistemaSolar = new JButtonMe();
		this.jButtonAbrirImportacionPlanetaSistemaSolar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPlanetaSistemaSolar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPlanetaSistemaSolar.setToolTipText("Generar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jButtonAbrirImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPlanetaSistemaSolar = new JLabelMe();

		this.jLabelPathArchivoImportacionPlanetaSistemaSolar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jLabelPathArchivoImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPlanetaSistemaSolar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPlanetaSistemaSolar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlanetaSistemaSolar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlanetaSistemaSolar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jTextFieldPathArchivoImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPlanetaSistemaSolar = new JButtonMe();
		this.jButtonGenerarImportacionPlanetaSistemaSolar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPlanetaSistemaSolar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPlanetaSistemaSolar.setToolTipText("Generar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jButtonGenerarImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPlanetaSistemaSolar = new JButtonMe();
		this.jButtonCerrarImportacionPlanetaSistemaSolar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPlanetaSistemaSolar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPlanetaSistemaSolar.setToolTipText("Cancelar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlanetaSistemaSolar.add(this.jButtonCerrarImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPlanetaSistemaSolar = new GridBagLayout();
		
		this.jScrollPanelImportacionPlanetaSistemaSolar= new JScrollPane(jPanelImportacionPlanetaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iPosYImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXImportacion;
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPlanetaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPlanetaSistemaSolar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPlanetaSistemaSolar);
		this.jInternalFrameImportacionPlanetaSistemaSolar.getContentPane().add(this.jScrollPanelImportacionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPlanetaSistemaSolar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPlanetaSistemaSolar = new JButtonMe();
			this.jButtonAbrirOrderByPlanetaSistemaSolar.setText("Orden");
			this.jButtonAbrirOrderByPlanetaSistemaSolar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlanetaSistemaSolar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPlanetaSistemaSolar";
			inputMap = this.jButtonAbrirOrderByPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPlanetaSistemaSolar"));
		
		
			GridBagLayout gridaBagLayoutOrderByPlanetaSistemaSolar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPlanetaSistemaSolar.setName("jPanelOrderByPlanetaSistemaSolar"); 
			
			this.jPanelOrderByPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPlanetaSistemaSolar.setLayout(gridaBagLayoutOrderByPlanetaSistemaSolar);
			
			
			this.jTableDatosPlanetaSistemaSolarOrderBy = new JTableMe();        
			this.jTableDatosPlanetaSistemaSolarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPlanetaSistemaSolarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPlanetaSistemaSolarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPlanetaSistemaSolarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPlanetaSistemaSolarOrderBy.setViewportView(this.jTableDatosPlanetaSistemaSolarOrderBy);
			this.jTableDatosPlanetaSistemaSolarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPlanetaSistemaSolarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPlanetaSistemaSolar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPlanetaSistemaSolar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPlanetaSistemaSolar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePlanetaSistemaSolar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPlanetaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPlanetaSistemaSolar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPlanetaSistemaSolar.setTitle("Orden");
			this.jInternalFrameOrderByPlanetaSistemaSolar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPlanetaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPlanetaSistemaSolar.setResizable(true);
			this.jInternalFrameOrderByPlanetaSistemaSolar.setClosable(true);
			this.jInternalFrameOrderByPlanetaSistemaSolar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPlanetaSistemaSolar.ipady =150;
				
			this.jPanelOrderByPlanetaSistemaSolar.add(jScrollPanelDatosPlanetaSistemaSolarOrderBy, this.gridBagConstraintsPlanetaSistemaSolar);//this.jTableDatosPlanetaSistemaSolarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPlanetaSistemaSolar = new JButtonMe();
			this.jButtonCerrarOrderByPlanetaSistemaSolar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPlanetaSistemaSolar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPlanetaSistemaSolar.setToolTipText("Cancelar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPlanetaSistemaSolar.add(this.jButtonCerrarOrderByPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPlanetaSistemaSolar = new GridBagLayout();
			
			this.jScrollPanelOrderByPlanetaSistemaSolar= new JScrollPane(jPanelOrderByPlanetaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iPosYOrderBy;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPlanetaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPlanetaSistemaSolar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPlanetaSistemaSolar);
			
			this.jInternalFrameOrderByPlanetaSistemaSolar.getContentPane().add(this.jScrollPanelOrderByPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
		
		} else {
			this.jButtonAbrirOrderByPlanetaSistemaSolar = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.planetasistemasolarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPlanetaSistemaSolar.getRowHeight();//PlanetaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.isSelected()) {
					iHeightTable=PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlanetaSistemaSolar.isSelected()) {
					iHeightTable=PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlanetaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPlanetaSistemaSolar!=null && this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy()!=null) {
			//if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPlanetaSistemaSolar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=planetasistemasolarLogic.getPlanetaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planetasistemasolars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PlanetaSistemaSolar> TraerPlanetaSistemaSolarBeans(List<PlanetaSistemaSolar> planetasistemasolars,ArrayList<Classe> classes)throws Exception {
		try {
			for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolars) {
					
				if(!(PlanetaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PlanetaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					planetasistemasolar.setsDetalleGeneralEntityReporte(PlanetaSistemaSolarConstantesFunciones.getPlanetaSistemaSolarDescripcion(planetasistemasolar));
										
						
					
						
					
				} else  {
							
					//planetasistemasolar.setsDetalleGeneralEntityReporte(planetasistemasolar.getsDetalleGeneralEntityReporte());
										
				}
				
				//planetasistemasolarbeans.add(planetasistemasolarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return planetasistemasolars;
    }
	//PARA REPORTES FIN
}
