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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoRefePersoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoRefePersoJInternalFrame extends TipoRefePersoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRefePerso;
	
	protected JMenuBar jmenuBarTipoRefePerso;
	
	protected JMenu jmenuTipoRefePerso;
	protected JMenu jmenuDatosTipoRefePerso;
	protected JMenu jmenuArchivoTipoRefePerso;
	protected JMenu jmenuAccionesTipoRefePerso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRefePerso;	
	protected GridBagConstraints gridBagConstraintsTipoRefePerso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRefePersoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRefePerso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRefePerso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRefePerso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRefePersoSessionBean tiporefepersoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRefePerso> tiporefepersos;		
	public List<TipoRefePerso> tiporefepersosEliminados;	
	public List<TipoRefePerso> tiporefepersosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRefePerso;		
	protected JButton jButtonAbrirOrderByTipoRefePerso;
	
	
	//protected JPanel jPanelOrderByTipoRefePerso;
	//public JScrollPane jScrollPanelOrderByTipoRefePerso;	
	//protected JButton jButtonCerrarOrderByTipoRefePerso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRefePersoLogic tiporefepersoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRefePerso;
	public JScrollPane jScrollPanelDatosEdicionTipoRefePerso;
	public JScrollPane jScrollPanelDatosGeneralTipoRefePerso;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRefePersoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRefePerso;
	//public JScrollPane jScrollPanelImportacionTipoRefePerso;
	
	
	
	protected JPanel jPanelAccionesTipoRefePerso;
	
    protected JPanel jPanelPaginacionTipoRefePerso;
    protected JPanel jPanelParametrosReportesTipoRefePerso;
	protected JPanel jPanelParametrosReportesAccionesTipoRefePerso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRefePerso;
	protected JPanel jPanelParametrosAuxiliar2TipoRefePerso;
	protected JPanel jPanelParametrosAuxiliar3TipoRefePerso;
	protected JPanel jPanelParametrosAuxiliar4TipoRefePerso;
	//protected JPanel jPanelParametrosAuxiliar5TipoRefePerso;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRefePerso;
	//protected JPanel jPanelImportacionTipoRefePerso;
	
	
	public JTable jTableDatosTipoRefePerso;
	
	
	
	//public JTable jTableDatosTipoRefePersoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRefePerso;
	protected JButton jButtonDuplicarTipoRefePerso;
	protected JButton jButtonCopiarTipoRefePerso;
	protected JButton jButtonVerFormTipoRefePerso;
	protected JButton jButtonNuevoRelacionesTipoRefePerso;
	protected JButton jButtonModificarTipoRefePerso;
	
    protected JButton jButtonGuardarCambiosTablaTipoRefePerso;
	protected JButton jButtonCerrarTipoRefePerso;
	
	
	protected JButton jButtonRecargarInformacionTipoRefePerso;
	protected JButton jButtonProcesarInformacionTipoRefePerso;
	
	
	protected JButton jButtonAnterioresTipoRefePerso;
	protected JButton jButtonSiguientesTipoRefePerso;
	protected JButton jButtonNuevoGuardarCambiosTipoRefePerso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRefePerso;
	//protected JButton jButtonCerrarReporteDinamicoTipoRefePerso;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRefePerso;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRefePerso;
	//protected JButton jButtonGenerarImportacionTipoRefePerso;
	//protected JButton jButtonCerrarImportacionTipoRefePerso;
	//protected JFileChooser jFileChooserImportacionTipoRefePerso;
	//protected File fileImportacionTipoRefePerso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRefePerso;
	protected JButton jButtonDuplicarToolBarTipoRefePerso;
	protected JButton jButtonNuevoRelacionesToolBarTipoRefePerso;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRefePerso;
	protected JButton jButtonCopiarToolBarTipoRefePerso;
	protected JButton jButtonVerFormToolBarTipoRefePerso;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRefePerso;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRefePerso;
	protected JButton jButtonCerrarToolBarTipoRefePerso;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRefePerso;
	protected JButton jButtonProcesarInformacionToolBarTipoRefePerso;
	protected JButton jButtonAnterioresToolBarTipoRefePerso;
	protected JButton jButtonSiguientesToolBarTipoRefePerso;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRefePerso;
	protected JButton jButtonAbrirOrderByToolBarTipoRefePerso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRefePerso;
	protected JMenuItem jMenuItemDuplicarTipoRefePerso;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRefePerso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRefePerso;
	protected JMenuItem jMenuItemCopiarTipoRefePerso;
	protected JMenuItem jMenuItemVerFormTipoRefePerso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRefePerso;
	protected JMenuItem jMenuItemCerrarTipoRefePerso;
	protected JMenuItem jMenuItemDetalleCerrarTipoRefePerso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRefePerso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRefePerso;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRefePerso;
	protected JMenuItem jMenuItemProcesarInformacionTipoRefePerso;
	protected JMenuItem jMenuItemAnterioresTipoRefePerso;
	protected JMenuItem jMenuItemSiguientesTipoRefePerso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRefePerso;
	protected JMenuItem jMenuItemAbrirOrderByTipoRefePerso;
	protected JMenuItem jMenuItemMostrarOcultarTipoRefePerso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRefePerso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRefePerso;
	protected JCheckBox jCheckBoxSeleccionadosTipoRefePerso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRefePerso;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRefePerso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRefePerso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRefePerso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRefePerso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRefePerso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRefePerso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRefePerso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRefePerso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRefePerso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRefePerso;
	protected JTextField jTextFieldValorCampoGeneralTipoRefePerso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRefePerso;
	//public JList<Reporte> jListColumnasSelectReporteTipoRefePerso;
	//public JScrollPane jScrollColumnasSelectReporteTipoRefePerso;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRefePerso;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRefePerso;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRefePerso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRefePerso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRefePerso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRefePerso;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRefePerso;
	
		
	//public JLabel jLabelArchivoImportacionTipoRefePerso;	
	//public JLabel jLabelPathArchivoImportacionTipoRefePerso;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRefePerso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRefePerso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRefePerso;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRefePerso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRefePerso;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRefePerso;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRefePerso;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRefePerso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRefePerso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRefePerso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRefePerso;
	public JPanel jPanelBusquedaPorCodigoTipoRefePerso;
	public JButton jButtonBusquedaPorCodigoTipoRefePerso;
	public JPanel jPanelBusquedaPorNombreTipoRefePerso;
	public JButton jButtonBusquedaPorNombreTipoRefePerso;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoRefePerso;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoRefePerso;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoRefePerso;
	public JButton jButtoncodigoBusquedaPorCodigoTipoRefePersoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoRefePerso;
	public JLabel jLabelnombreBusquedaPorNombreTipoRefePerso;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoRefePerso;
	public JButton jButtonnombreBusquedaPorNombreTipoRefePersoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRefePersoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRefePerso)	{
		this.jButtonRecargarInformacionTipoRefePerso = jButtonRecargarInformacionTipoRefePerso;
	}
	
	public JButton getjButtonProcesarInformacionTipoRefePerso() {
		return this.jButtonProcesarInformacionTipoRefePerso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRefePerso)	{
		this.jButtonProcesarInformacionTipoRefePerso = jButtonProcesarInformacionTipoRefePerso;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRefePerso() {
		return this.jButtonRecargarInformacionTipoRefePerso;
	}
	
	
	public List<TipoRefePerso> gettiporefepersos() {
		return this.tiporefepersos;
	}

	public void settiporefepersos(List<TipoRefePerso> tiporefepersos) {
		this.tiporefepersos = tiporefepersos;
	}
	
	public List<TipoRefePerso> gettiporefepersosAux() {
		return this.tiporefepersosAux;
	}

	public void settiporefepersosAux(List<TipoRefePerso> tiporefepersosAux) {
		this.tiporefepersosAux = tiporefepersosAux;
	}
	
	public List<TipoRefePerso> gettiporefepersosEliminados() {
		return this.tiporefepersosEliminados;
	}

	public void setTipoRefePersosEliminados(List<TipoRefePerso> tiporefepersosEliminados) {
		this.tiporefepersosEliminados = tiporefepersosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRefePerso() {
		return jComboBoxTiposSeleccionarTipoRefePerso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRefePerso(
			JComboBox jComboBoxTiposSeleccionarTipoRefePerso) {
		this.jComboBoxTiposSeleccionarTipoRefePerso = jComboBoxTiposSeleccionarTipoRefePerso;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRefePerso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRefePerso() {
		return jTextFieldValorCampoGeneralTipoRefePerso;
	}

	public void setjTextFieldValorCampoGeneralTipoRefePerso(
			JTextField jTextFieldValorCampoGeneralTipoRefePerso) {
		this.jTextFieldValorCampoGeneralTipoRefePerso = jTextFieldValorCampoGeneralTipoRefePerso;
	}

	public void setBorderResaltarValorCampoGeneralTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRefePerso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRefePerso() {
		return this.jCheckBoxSeleccionarTodosTipoRefePerso;
	}

	public void setjCheckBoxSeleccionarTodosTipoRefePerso(
			JCheckBox jCheckBoxSeleccionarTodosTipoRefePerso) {
		this.jCheckBoxSeleccionarTodosTipoRefePerso = jCheckBoxSeleccionarTodosTipoRefePerso;
	}

	public void setBorderResaltarSeleccionarTodosTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRefePerso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRefePerso() {
		return this.jCheckBoxSeleccionadosTipoRefePerso;
	}

	public void setjCheckBoxSeleccionadosTipoRefePerso(
			JCheckBox jCheckBoxSeleccionadosTipoRefePerso) {
		this.jCheckBoxSeleccionadosTipoRefePerso = jCheckBoxSeleccionadosTipoRefePerso;
	}
	
	public void setBorderResaltarSeleccionadosTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRefePerso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRefePerso() {
		return this.jComboBoxTiposArchivosReportesTipoRefePerso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRefePerso(
			JComboBox jComboBoxTiposArchivosReportesTipoRefePerso) {
		this.jComboBoxTiposArchivosReportesTipoRefePerso = jComboBoxTiposArchivosReportesTipoRefePerso;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRefePerso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRefePerso() {
		return this.jComboBoxTiposReportesTipoRefePerso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRefePerso(
			JComboBox jComboBoxTiposReportesTipoRefePerso) {
		this.jComboBoxTiposReportesTipoRefePerso = jComboBoxTiposReportesTipoRefePerso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRefePerso() {
	//	return jComboBoxTiposReportesDinamicoTipoRefePerso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRefePerso(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRefePerso) {
	//	this.jComboBoxTiposReportesDinamicoTipoRefePerso = jComboBoxTiposReportesDinamicoTipoRefePerso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRefePerso() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRefePerso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRefePerso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRefePerso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso = jComboBoxTiposArchivosReportesDinamicoTipoRefePerso;
	//}
	
	public void setBorderResaltarTiposReportesTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRefePerso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRefePerso() {
		return this.jComboBoxTiposGraficosReportesTipoRefePerso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRefePerso(
			JComboBox jComboBoxTiposGraficosReportesTipoRefePerso) {
		this.jComboBoxTiposGraficosReportesTipoRefePerso = jComboBoxTiposGraficosReportesTipoRefePerso;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRefePerso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRefePerso() {
		return this.jComboBoxTiposPaginacionTipoRefePerso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRefePerso(
			JComboBox jComboBoxTiposPaginacionTipoRefePerso) {
		this.jComboBoxTiposPaginacionTipoRefePerso = jComboBoxTiposPaginacionTipoRefePerso;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRefePerso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRefePerso() {
		return this.jComboBoxTiposRelacionesTipoRefePerso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRefePerso() {
		return this.jComboBoxTiposAccionesTipoRefePerso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRefePerso(
			JComboBox jComboBoxTiposRelacionesTipoRefePerso) {
		this.jComboBoxTiposRelacionesTipoRefePerso = jComboBoxTiposRelacionesTipoRefePerso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRefePerso(
			JComboBox jComboBoxTiposAccionesTipoRefePerso) {
		this.jComboBoxTiposAccionesTipoRefePerso = jComboBoxTiposAccionesTipoRefePerso;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRefePerso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRefePerso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRefePerso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRefePerso() {
	//	return jCheckBoxConGraficoDinamicoTipoRefePerso;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRefePerso(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRefePerso) {
	//	this.jCheckBoxConGraficoDinamicoTipoRefePerso = jCheckBoxConGraficoDinamicoTipoRefePerso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRefePerso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRefePerso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRefePerso .setBorder(borderResaltar);		
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
		this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		
		this.tiporefepersoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporefepersoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporefepersoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRefePersoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Refe Perso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRefePersoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRefePerso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"nuevo","nuevo","Nuevo"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"duplicar","duplicar","Duplicar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"copiar","copiar","Copiar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"ver_form","ver_form","Ver"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"recargar","recargar","Recargar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRefePerso,this.jTtoolBarTipoRefePerso,
							"cerrar","cerrar","Salir"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRefePerso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRefePerso;
			
				this.jButtonProcesarInformacionToolBarTipoRefePerso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRefePerso;
				
		//protected JButton jButtonModificarToolBarTipoRefePerso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRefePerso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRefePerso=new JMenuMe("General");
		this.jmenuArchivoTipoRefePerso=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRefePerso=new JMenuMe("Acciones");
		this.jmenuDatosTipoRefePerso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRefePerso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRefePerso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRefePerso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRefePerso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRefePerso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRefePerso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRefePerso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRefePerso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRefePerso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRefePerso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRefePerso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRefePerso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRefePerso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRefePerso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRefePerso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRefePerso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRefePerso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRefePerso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRefePerso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRefePerso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRefePerso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRefePerso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRefePerso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRefePerso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRefePerso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRefePerso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRefePerso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRefePerso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRefePerso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRefePerso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRefePerso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRefePerso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRefePerso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRefePerso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRefePerso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRefePerso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRefePerso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRefePerso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRefePerso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRefePerso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRefePerso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRefePerso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRefePerso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRefePerso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRefePerso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRefePerso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRefePerso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRefePerso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRefePerso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRefePerso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRefePerso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRefePerso.add(this.jMenuItemCerrarTipoRefePerso);
			
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemNuevoTipoRefePerso);
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemNuevoGuardarCambiosTipoRefePerso);
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemNuevoRelacionesTipoRefePerso);
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemGuardarCambiosTablaTipoRefePerso);		
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemDuplicarTipoRefePerso);		
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemCopiarTipoRefePerso);		
			this.jmenuAccionesTipoRefePerso.add(this.jMenuItemVerFormTipoRefePerso);		
			
			this.jmenuDatosTipoRefePerso.add(this.jMenuItemRecargarInformacionTipoRefePerso);				
			this.jmenuDatosTipoRefePerso.add(this.jMenuItemAnterioresTipoRefePerso);				
			this.jmenuDatosTipoRefePerso.add(this.jMenuItemSiguientesTipoRefePerso);				
			this.jmenuDatosTipoRefePerso.add(this.jMenuItemAbrirOrderByTipoRefePerso);				
			this.jmenuDatosTipoRefePerso.add(this.jMenuItemMostrarOcultarTipoRefePerso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRefePerso.add(this.jMenuItemGuardarCambiosTipoRefePerso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRefePerso.add(this.jmenuArchivoTipoRefePerso);		
			this.jmenuBarTipoRefePerso.add(this.jmenuAccionesTipoRefePerso);		
			this.jmenuBarTipoRefePerso.add(this.jmenuDatosTipoRefePerso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRefePerso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRefePerso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoRefePerso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoRefePerso.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoRefePerso= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoRefePerso.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoRefePerso.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoRefePerso,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoRefePerso = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoRefePerso.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoRefePerso.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoRefePerso= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoRefePerso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoRefePerso.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoRefePerso= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoRefePerso.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoRefePerso.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoRefePerso,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoRefePerso = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoRefePerso.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoRefePerso.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoRefePerso= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoRefePerso=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRefePerso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRefePerso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRefePerso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRefePerso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRefePerso = new TipoRefePersoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Refe Perso DATOS");
			this.jInternalFrameDetalleFormTipoRefePerso = new TipoRefePersoDetalleFormJInternalFrame(jDesktopPane,this.tiporefepersoSessionBean.getConGuardarRelaciones(),this.tiporefepersoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRefePerso = null;//new TipoRefePersoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRefePerso= new GridBagLayout();
		
		
		this.jTableDatosTipoRefePerso = new JTableMe();      
		
		String sToolTipTipoRefePerso="";
		sToolTipTipoRefePerso=TipoRefePersoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRefePerso+="(Cartera.TipoRefePerso)";
		}
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRefePerso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRefePerso.setToolTipText(sToolTipTipoRefePerso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRefePerso);
		this.jTableDatosTipoRefePerso.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRefePerso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRefePerso.setRowSelectionAllowed(true);
		this.jTableDatosTipoRefePerso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRefePerso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRefePerso = new JButtonMe();
		this.jButtonDuplicarTipoRefePerso = new JButtonMe();
		this.jButtonCopiarTipoRefePerso = new JButtonMe();
		this.jButtonVerFormTipoRefePerso = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRefePerso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRefePerso = new JButtonMe();
		this.jButtonCerrarTipoRefePerso = new JButtonMe();
		
		this.jScrollPanelDatosTipoRefePerso = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRefePerso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Refe Perso";
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRefePerso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRefePerso.setToolTipText("Acciones");
        this.jPanelAccionesTipoRefePerso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRefePerso=new ReporteDinamicoJInternalFrame(TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRefePerso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRefePerso=new ImportacionJInternalFrame(TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRefePerso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRefePerso = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRefePerso.setText("Orden");
		this.jButtonAbrirOrderByTipoRefePerso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRefePerso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRefePerso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRefePerso,false,this);
			
			//this.cargarOrderByTipoRefePerso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRefePerso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRefePerso,true,this);
			
			//this.cargarOrderByTipoRefePerso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRefePerso.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRefePerso.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRefePerso.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRefePerso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRefePerso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRefePerso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRefePerso.setText("Nuevo");
		this.jButtonDuplicarTipoRefePerso.setText("Duplicar");
		this.jButtonCopiarTipoRefePerso.setText("Copiar");
		this.jButtonVerFormTipoRefePerso.setText("Ver");
		this.jButtonNuevoRelacionesTipoRefePerso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.setText("Guardar");
		this.jButtonCerrarTipoRefePerso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRefePerso,"nuevo_button","Nuevo",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRefePerso,"duplicar_button","Duplicar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRefePerso,"copiar_button","Copiar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRefePerso,"ver_form","Ver",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRefePerso,"nuevorelaciones_button","Nuevo Rel",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRefePerso,"guardarcambiostabla_button","Guardar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRefePerso,"cerrar_button","Salir",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRefePerso.setToolTipText("Nuevo"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRefePerso.setToolTipText("Duplicar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRefePerso.setToolTipText("Copiar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRefePerso.setToolTipText("Ver"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRefePerso.setToolTipText("Nuevo Rel"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.setToolTipText("Guardar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRefePerso.setToolTipText("Salir"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRefePerso";
		inputMap = this.jButtonNuevoTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRefePerso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRefePerso"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRefePerso";
		inputMap = this.jButtonDuplicarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRefePerso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRefePerso"));
		
		//COPIAR
		sMapKey = "CopiarTipoRefePerso";
		inputMap = this.jButtonCopiarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRefePerso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRefePerso"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRefePerso";
		inputMap = this.jButtonVerFormTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRefePerso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRefePerso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRefePerso";
		inputMap = this.jButtonNuevoRelacionesTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRefePerso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRefePerso";
		inputMap = this.jButtonModificarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRefePerso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRefePerso";
		inputMap = this.jButtonCerrarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRefePerso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRefePerso";
		inputMap = this.jButtonGuardarCambiosTablaTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRefePerso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRefePerso.setName("jPanelParametrosReportesTipoRefePerso"); 
		
		this.jPanelParametrosReportesAccionesTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRefePerso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRefePerso.setName("jPanelParametrosReportesAccionesTipoRefePerso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRefePerso = new JButtonMe();
		this.jButtonRecargarInformacionTipoRefePerso.setText("Recargar");
		this.jButtonRecargarInformacionTipoRefePerso.setToolTipText("Recargar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRefePerso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRefePerso = new JButtonMe();
		this.jButtonProcesarInformacionTipoRefePerso.setText("Procesar");
		this.jButtonProcesarInformacionTipoRefePerso.setToolTipText("Procesar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRefePerso.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRefePerso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRefePerso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRefePerso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRefePerso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRefePerso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRefePerso.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRefePerso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRefePerso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRefePerso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRefePerso.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRefePerso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRefePerso.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRefePerso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRefePerso.setText("Accion");
		this.jComboBoxTiposAccionesTipoRefePerso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRefePerso.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRefePerso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRefePerso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRefePerso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRefePerso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRefePerso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRefePerso = new JLabelMe();
		
		this.jLabelAccionesTipoRefePerso.setText("Acciones");		
		this.jLabelAccionesTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRefePerso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRefePerso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRefePerso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRefePerso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRefePerso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRefePerso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRefePerso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRefePerso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRefePerso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRefePerso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRefePerso.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRefePerso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRefePerso = new JButtonMe();
		//this.jButtonAnterioresTipoRefePerso.setText("<<");
        this.jButtonAnterioresTipoRefePerso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRefePerso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRefePerso = new JButtonMe();
		//this.jButtonSiguientesTipoRefePerso.setText(">>");
        this.jButtonSiguientesTipoRefePerso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRefePerso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRefePerso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRefePerso.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRefePerso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRefePerso,"nuevoguardarcambios_button","Nue",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRefePerso";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRefePerso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRefePerso";
		inputMap = this.jButtonRecargarInformacionTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRefePerso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRefePerso";
		inputMap = this.jButtonSiguientesTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRefePerso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRefePerso";
		inputMap = this.jButtonAnterioresTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRefePerso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRefePerso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRefePerso.setMinimumSize(new Dimension(this.getWidth(),TipoRefePersoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRefePersoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRefePerso.setMaximumSize(new Dimension(this.getWidth(),TipoRefePersoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRefePersoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRefePerso.setPreferredSize(new Dimension(this.getWidth(),TipoRefePersoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRefePersoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRefePerso = new GridBagLayout();

			this.jPanelPaginacionTipoRefePerso.setLayout(gridaBagLayoutPaginacionTipoRefePerso);						
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 0;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonAnterioresTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					
						
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRefePerso.gridy = 0;
			
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonNuevoGuardarCambiosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
						
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRefePerso.gridy = 0;
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonSiguientesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 1;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonNuevoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
				this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRefePerso.gridy = 1;
				this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRefePerso.add(this.jButtonNuevoRelacionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			}
			
			
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
				this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRefePerso.gridy = 1;
				this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRefePerso.add(this.jButtonGuardarCambiosTablaTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			}
			
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 1;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonDuplicarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 1;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonCopiarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 1;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonVerFormTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 1;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRefePerso.add(this.jButtonCerrarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
		
		
		this.jButtonRecargarInformacionTipoRefePerso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRefePerso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRefePerso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRefePerso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRefePerso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRefePerso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRefePerso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRefePerso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRefePerso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRefePerso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRefePerso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRefePerso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRefePerso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRefePerso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRefePerso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRefePerso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRefePerso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRefePerso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRefePerso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRefePerso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRefePerso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRefePerso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRefePerso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRefePerso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRefePerso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRefePerso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRefePerso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRefePerso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRefePerso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRefePerso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRefePerso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRefePerso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRefePerso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRefePerso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRefePerso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRefePerso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRefePerso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRefePerso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRefePerso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRefePerso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRefePerso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRefePerso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRefePerso.setLayout(gridaBagParametrosReportesTipoRefePerso);
			this.jPanelParametrosReportesAccionesTipoRefePerso.setLayout(gridaBagParametrosReportesAccionesTipoRefePerso);
			
			
			this.jPanelParametrosAuxiliar1TipoRefePerso.setLayout(gridaBagParametrosAuxiliar1TipoRefePerso);
			this.jPanelParametrosAuxiliar2TipoRefePerso.setLayout(gridaBagParametrosAuxiliar2TipoRefePerso);
			this.jPanelParametrosAuxiliar3TipoRefePerso.setLayout(gridaBagParametrosAuxiliar3TipoRefePerso);
			this.jPanelParametrosAuxiliar4TipoRefePerso.setLayout(gridaBagParametrosAuxiliar4TipoRefePerso);
			//this.jPanelParametrosAuxiliar5TipoRefePerso.setLayout(gridaBagParametrosAuxiliar2TipoRefePerso);			
			
			
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRefePerso.add(this.jButtonRecargarInformacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRefePerso.add(this.jComboBoxTiposPaginacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRefePerso.add(this.jCheckBoxConAltoMaximoTablaTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRefePerso.add(this.jComboBoxTiposArchivosReportesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRefePerso.add(this.jPanelParametrosAuxiliar1TipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRefePerso.add(this.jComboBoxTiposReportesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRefePerso.add(this.jPanelParametrosAuxiliar4TipoRefePerso, this.gridBagConstraintsTipoRefePerso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRefePerso.add(this.jComboBoxTiposReportesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRefePerso.add(this.jCheckBoxGenerarReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRefePerso.add(this.jPanelParametrosAuxiliar2TipoRefePerso, this.gridBagConstraintsTipoRefePerso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRefePerso.add(this.jLabelAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
				this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRefePerso.add(this.jButtonAbrirOrderByTipoRefePerso, this.gridBagConstraintsTipoRefePerso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRefePerso.add(this.jComboBoxTiposSeleccionarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			
			
			/*
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRefePerso.add(this.jCheckBoxSeleccionarTodosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRefePerso.add(this.jCheckBoxSeleccionarTodosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);															
				
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRefePerso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRefePerso.add(this.jCheckBoxSeleccionadosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRefePerso.add(this.jPanelParametrosAuxiliar3TipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRefePerso.add(this.jComboBoxTiposRelacionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
				
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRefePerso.add(this.jComboBoxTiposAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
	
				
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRefePerso.add(this.jTextFieldValorCampoGeneralTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRefePerso = new GridBagLayout();

			this.jScrollPanelDatosTipoRefePerso.setLayout(gridaBagLayoutDatosTipoRefePerso);
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = 0;
			this.gridBagConstraintsTipoRefePerso.gridx = 0;
			
			this.jScrollPanelDatosTipoRefePerso.add(this.jTableDatosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRefePerso.setViewportView(this.jTableDatosTipoRefePerso);
		this.jTableDatosTipoRefePerso.setFillsViewportHeight(true);
		this.jTableDatosTipoRefePerso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRefePerso= new GridBagLayout();
		this.jPanelAccionesTipoRefePerso.setLayout(gridaBagLayoutAccionesTipoRefePerso);
		
		
		/*	
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = 0;
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
			
		this.jPanelAccionesTipoRefePerso.add(this.jButtonNuevoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoRefePerso= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoRefePerso.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRefePerso.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRefePerso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoRefePerso.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoRefePerso.setLayout(gridaBagLayoutBusquedaPorCodigoTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 0;
		gridBagConstraintsTipoRefePerso.gridx = 0;
		jPanelBusquedaPorCodigoTipoRefePerso.add(jLabelcodigoBusquedaPorCodigoTipoRefePerso, gridBagConstraintsTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 0;
		gridBagConstraintsTipoRefePerso.gridx = 1;
		jPanelBusquedaPorCodigoTipoRefePerso.add(jTextFieldcodigoBusquedaPorCodigoTipoRefePerso, gridBagConstraintsTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 1;
		gridBagConstraintsTipoRefePerso.gridx =1;
		jPanelBusquedaPorCodigoTipoRefePerso.add(jButtonBusquedaPorCodigoTipoRefePerso, gridBagConstraintsTipoRefePerso);

		jTabbedPaneBusquedasTipoRefePerso.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoRefePerso);
		jTabbedPaneBusquedasTipoRefePerso.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoRefePerso= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoRefePerso.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRefePerso.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRefePerso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoRefePerso.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoRefePerso.setLayout(gridaBagLayoutBusquedaPorNombreTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 0;
		gridBagConstraintsTipoRefePerso.gridx = 0;
		jPanelBusquedaPorNombreTipoRefePerso.add(jLabelnombreBusquedaPorNombreTipoRefePerso, gridBagConstraintsTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 0;
		gridBagConstraintsTipoRefePerso.gridx = 1;
		jPanelBusquedaPorNombreTipoRefePerso.add(jTextAreanombreBusquedaPorNombreTipoRefePerso, gridBagConstraintsTipoRefePerso);

		gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRefePerso.gridy = 1;
		gridBagConstraintsTipoRefePerso.gridx =1;
		jPanelBusquedaPorNombreTipoRefePerso.add(jButtonBusquedaPorNombreTipoRefePerso, gridBagConstraintsTipoRefePerso);

		jTabbedPaneBusquedasTipoRefePerso.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoRefePerso);
		jTabbedPaneBusquedasTipoRefePerso.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRefePerso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRefePerso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();						
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRefePerso.gridx = 0;		
			//this.gridBagConstraintsTipoRefePerso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRefePerso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRefePerso.gridx = 0;		
		//this.gridBagConstraintsTipoRefePerso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRefePerso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRefePerso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRefePerso.gridx = 0;		
			this.gridBagConstraintsTipoRefePerso.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoRefePerso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoRefePerso, this.gridBagConstraintsTipoRefePerso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);								
		
		
		/*
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		*/		
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRefePerso.gridx =0;
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRefePerso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
				
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRefePerso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRefePerso = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRefePerso.setLayout(gridaBagLayoutBusquedasParametrosTipoRefePerso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRefePerso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRefePerso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRefePerso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRefePerso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRefePerso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRefePerso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRefePerso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRefePerso.setName("jPanelReporteDinamicoTipoRefePerso"); 
		
		this.jPanelReporteDinamicoTipoRefePerso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRefePerso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRefePerso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRefePerso.setLayout(gridaBagLayoutReporteDinamicoTipoRefePerso);
		
		
		this.jInternalFrameReporteDinamicoTipoRefePerso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRefePerso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRefePerso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRefePerso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRefePerso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRefePerso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRefePerso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRefePerso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRefePerso.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRefePerso.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRefePerso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRefePerso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRefePerso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRefePerso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRefePerso = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRefePerso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jLabelColumnasSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRefePerso = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRefePerso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRefePerso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRefePerso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRefePerso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRefePerso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRefePerso=new JScrollPane(this.jListColumnasSelectReporteTipoRefePerso);
			
			this.jScrollColumnasSelectReporteTipoRefePerso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRefePerso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRefePerso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRefePerso.add(this.jListColumnasSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jScrollColumnasSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRefePerso = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRefePerso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jLabelRelacionesSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRefePerso = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRefePerso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRefePerso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRefePerso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRefePerso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRefePerso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRefePerso=new JScrollPane(this.jListRelacionesSelectReporteTipoRefePerso);
			
			this.jScrollRelacionesSelectReporteTipoRefePerso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRefePerso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRefePerso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRefePerso.add(this.jListRelacionesSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jScrollRelacionesSelectReporteTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRefePerso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRefePerso = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRefePerso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRefePerso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRefePerso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRefePerso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRefePerso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRefePerso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRefePerso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRefePerso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jLabelGenerarExcelReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRefePerso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRefePerso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRefePerso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRefePerso.setToolTipText("Generar EXCEL"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		//this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRefePerso.add(this.jButtonGenerarExcelReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jComboBoxTiposReportesDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRefePerso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRefePerso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jLabelTiposArchivoReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRefePerso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRefePerso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRefePerso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRefePerso.setToolTipText("Generar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jButtonGenerarReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRefePerso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRefePerso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRefePerso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRefePerso.setToolTipText("Cancelar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRefePerso.add(this.jButtonCerrarReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRefePerso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRefePerso= new JScrollPane(jPanelReporteDinamicoTipoRefePerso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRefePerso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRefePerso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRefePerso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRefePerso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRefePerso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRefePerso);
		this.jInternalFrameReporteDinamicoTipoRefePerso.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRefePerso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRefePerso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRefePerso.setName("jPanelImportacionTipoRefePerso"); 
		
		this.jPanelImportacionTipoRefePerso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRefePerso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRefePerso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRefePerso.setLayout(gridaBagLayoutImportacionTipoRefePerso);
		
		
		this.jInternalFrameImportacionTipoRefePerso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRefePerso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRefePerso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRefePerso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRefePerso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRefePerso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRefePerso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRefePerso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRefePerso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRefePerso.setResizable(true);
	    this.jInternalFrameImportacionTipoRefePerso.setClosable(true);
	    this.jInternalFrameImportacionTipoRefePerso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRefePerso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRefePerso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRefePerso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRefePerso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRefePerso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRefePerso.setResizable(true);
	    this.jInternalFrameImportacionTipoRefePerso.setClosable(true);
	    this.jInternalFrameImportacionTipoRefePerso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRefePerso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRefePerso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRefePerso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRefePerso = new JLabelMe();

		this.jLabelArchivoImportacionTipoRefePerso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRefePerso.add(this.jLabelArchivoImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRefePerso = new JFileChooser();		
		this.jFileChooserImportacionTipoRefePerso.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRefePerso = new JButtonMe();
		this.jButtonAbrirImportacionTipoRefePerso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRefePerso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRefePerso.setToolTipText("Generar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRefePerso.add(this.jButtonAbrirImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRefePerso = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRefePerso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRefePerso.add(this.jLabelPathArchivoImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRefePerso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRefePerso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRefePerso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRefePerso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRefePerso.add(this.jTextFieldPathArchivoImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRefePerso = new JButtonMe();
		this.jButtonGenerarImportacionTipoRefePerso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRefePerso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRefePerso.setToolTipText("Generar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRefePerso.add(this.jButtonGenerarImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRefePerso = new JButtonMe();
		this.jButtonCerrarImportacionTipoRefePerso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRefePerso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRefePerso.setToolTipText("Cancelar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRefePerso.add(this.jButtonCerrarImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRefePerso = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRefePerso= new JScrollPane(jPanelImportacionTipoRefePerso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRefePerso.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRefePerso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRefePerso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRefePerso);
		this.jInternalFrameImportacionTipoRefePerso.getContentPane().add(this.jScrollPanelImportacionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRefePerso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRefePerso = new JButtonMe();
			this.jButtonAbrirOrderByTipoRefePerso.setText("Orden");
			this.jButtonAbrirOrderByTipoRefePerso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRefePerso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRefePerso";
			inputMap = this.jButtonAbrirOrderByTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRefePerso"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRefePerso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRefePerso.setName("jPanelOrderByTipoRefePerso"); 
			
			this.jPanelOrderByTipoRefePerso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRefePerso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRefePerso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRefePerso.setLayout(gridaBagLayoutOrderByTipoRefePerso);
			
			
			this.jTableDatosTipoRefePersoOrderBy = new JTableMe();        
			this.jTableDatosTipoRefePersoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRefePersoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRefePersoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRefePersoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRefePersoOrderBy.setViewportView(this.jTableDatosTipoRefePersoOrderBy);
			this.jTableDatosTipoRefePersoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRefePersoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRefePerso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRefePerso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRefePerso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRefePerso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRefePerso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRefePerso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRefePerso.setTitle("Orden");
			this.jInternalFrameOrderByTipoRefePerso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRefePerso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRefePerso.setResizable(true);
			this.jInternalFrameOrderByTipoRefePerso.setClosable(true);
			this.jInternalFrameOrderByTipoRefePerso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRefePerso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRefePerso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRefePerso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRefePerso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRefePerso.ipady =150;
				
			this.jPanelOrderByTipoRefePerso.add(jScrollPanelDatosTipoRefePersoOrderBy, this.gridBagConstraintsTipoRefePerso);//this.jTableDatosTipoRefePersoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRefePerso = new JButtonMe();
			this.jButtonCerrarOrderByTipoRefePerso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRefePerso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRefePerso.setToolTipText("Cancelar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRefePerso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRefePerso.add(this.jButtonCerrarOrderByTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRefePerso = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRefePerso= new JScrollPane(jPanelOrderByTipoRefePerso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRefePerso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRefePerso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRefePerso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRefePerso);
			
			this.jInternalFrameOrderByTipoRefePerso.getContentPane().add(this.jScrollPanelOrderByTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
		
		} else {
			this.jButtonAbrirOrderByTipoRefePerso = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporefepersoSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRefePerso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRefePerso.getRowHeight();//TipoRefePersoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRefePerso.isSelected()) {
					iHeightTable=TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRefePerso.isSelected()) {
					iHeightTable=TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRefePersoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRefePerso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRefePerso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRefePerso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRefePerso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRefePerso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRefePerso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRefePerso!=null && this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRefePerso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRefePerso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRefePerso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRefePerso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRefePerso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRefePerso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporefepersoLogic.getTipoRefePersos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporefepersos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRefePerso> TraerTipoRefePersoBeans(List<TipoRefePerso> tiporefepersos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRefePerso tiporefeperso:tiporefepersos) {
					
				if(!(TipoRefePersoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRefePersoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporefeperso.setsDetalleGeneralEntityReporte(TipoRefePersoConstantesFunciones.getTipoRefePersoDescripcion(tiporefeperso));
										
						
					
					

					if(tiporefeperso.getReferenciaPersonals()!=null && Funciones.existeClass(classes,ReferenciaPersonal.class)) {
						try{tiporefeperso.setreferenciapersonalsDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaPersonalJInternalFrame.TraerReferenciaPersonalBeans(tiporefeperso.getReferenciaPersonals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporefeperso.setsDetalleGeneralEntityReporte(tiporefeperso.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporefepersobeans.add(tiporefepersobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporefepersos;
    }
	//PARA REPORTES FIN
}
