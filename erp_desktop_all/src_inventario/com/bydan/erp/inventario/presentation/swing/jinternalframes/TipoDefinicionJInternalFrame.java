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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoDefinicionConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoDefinicionJInternalFrame extends TipoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDefinicion;
	
	protected JMenuBar jmenuBarTipoDefinicion;
	
	protected JMenu jmenuTipoDefinicion;
	protected JMenu jmenuDatosTipoDefinicion;
	protected JMenu jmenuArchivoTipoDefinicion;
	protected JMenu jmenuAccionesTipoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoDefinicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDefinicionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDefinicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDefinicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDefinicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDefinicionSessionBean tipodefinicionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDefinicion> tipodefinicions;		
	public List<TipoDefinicion> tipodefinicionsEliminados;	
	public List<TipoDefinicion> tipodefinicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDefinicion;		
	protected JButton jButtonAbrirOrderByTipoDefinicion;
	
	
	//protected JPanel jPanelOrderByTipoDefinicion;
	//public JScrollPane jScrollPanelOrderByTipoDefinicion;	
	//protected JButton jButtonCerrarOrderByTipoDefinicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDefinicionLogic tipodefinicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoDefinicion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDefinicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDefinicion;
	//public JScrollPane jScrollPanelImportacionTipoDefinicion;
	
	
	
	protected JPanel jPanelAccionesTipoDefinicion;
	
    protected JPanel jPanelPaginacionTipoDefinicion;
    protected JPanel jPanelParametrosReportesTipoDefinicion;
	protected JPanel jPanelParametrosReportesAccionesTipoDefinicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDefinicion;
	protected JPanel jPanelParametrosAuxiliar2TipoDefinicion;
	protected JPanel jPanelParametrosAuxiliar3TipoDefinicion;
	protected JPanel jPanelParametrosAuxiliar4TipoDefinicion;
	//protected JPanel jPanelParametrosAuxiliar5TipoDefinicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDefinicion;
	//protected JPanel jPanelImportacionTipoDefinicion;
	
	
	public JTable jTableDatosTipoDefinicion;
	
	
	
	//public JTable jTableDatosTipoDefinicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDefinicion;
	protected JButton jButtonDuplicarTipoDefinicion;
	protected JButton jButtonCopiarTipoDefinicion;
	protected JButton jButtonVerFormTipoDefinicion;
	protected JButton jButtonNuevoRelacionesTipoDefinicion;
	protected JButton jButtonModificarTipoDefinicion;
	
    protected JButton jButtonGuardarCambiosTablaTipoDefinicion;
	protected JButton jButtonCerrarTipoDefinicion;
	
	
	protected JButton jButtonRecargarInformacionTipoDefinicion;
	protected JButton jButtonProcesarInformacionTipoDefinicion;
	
	
	protected JButton jButtonAnterioresTipoDefinicion;
	protected JButton jButtonSiguientesTipoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosTipoDefinicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDefinicion;
	//protected JButton jButtonCerrarReporteDinamicoTipoDefinicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDefinicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDefinicion;
	//protected JButton jButtonGenerarImportacionTipoDefinicion;
	//protected JButton jButtonCerrarImportacionTipoDefinicion;
	//protected JFileChooser jFileChooserImportacionTipoDefinicion;
	//protected File fileImportacionTipoDefinicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDefinicion;
	protected JButton jButtonDuplicarToolBarTipoDefinicion;
	protected JButton jButtonNuevoRelacionesToolBarTipoDefinicion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDefinicion;
	protected JButton jButtonCopiarToolBarTipoDefinicion;
	protected JButton jButtonVerFormToolBarTipoDefinicion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDefinicion;
	protected JButton jButtonCerrarToolBarTipoDefinicion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDefinicion;
	protected JButton jButtonProcesarInformacionToolBarTipoDefinicion;
	protected JButton jButtonAnterioresToolBarTipoDefinicion;
	protected JButton jButtonSiguientesToolBarTipoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDefinicion;
	protected JButton jButtonAbrirOrderByToolBarTipoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDefinicion;
	protected JMenuItem jMenuItemDuplicarTipoDefinicion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDefinicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDefinicion;
	protected JMenuItem jMenuItemCopiarTipoDefinicion;
	protected JMenuItem jMenuItemVerFormTipoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDefinicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDefinicion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDefinicion;
	protected JMenuItem jMenuItemProcesarInformacionTipoDefinicion;
	protected JMenuItem jMenuItemAnterioresTipoDefinicion;
	protected JMenuItem jMenuItemSiguientesTipoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDefinicion;
	protected JMenuItem jMenuItemAbrirOrderByTipoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDefinicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDefinicion;
	protected JCheckBox jCheckBoxSeleccionadosTipoDefinicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDefinicion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDefinicion;
	protected JTextField jTextFieldValorCampoGeneralTipoDefinicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDefinicion;
	//public JList<Reporte> jListColumnasSelectReporteTipoDefinicion;
	//public JScrollPane jScrollColumnasSelectReporteTipoDefinicion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDefinicion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDefinicion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDefinicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDefinicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDefinicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDefinicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDefinicion;
	
		
	//public JLabel jLabelArchivoImportacionTipoDefinicion;	
	//public JLabel jLabelPathArchivoImportacionTipoDefinicion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDefinicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDefinicion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDefinicion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDefinicion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDefinicion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDefinicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDefinicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDefinicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDefinicion;
	public JPanel jPanelBusquedaPorCodigoTipoDefinicion;
	public JButton jButtonBusquedaPorCodigoTipoDefinicion;
	public JPanel jPanelBusquedaPorNombreTipoDefinicion;
	public JButton jButtonBusquedaPorNombreTipoDefinicion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDefinicion;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDefinicion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDefinicion;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDefinicion;
	public JLabel jLabelnombreBusquedaPorNombreTipoDefinicion;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoDefinicion;
	public JButton jButtonnombreBusquedaPorNombreTipoDefinicionBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoDefinicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDefinicion)	{
		this.jButtonRecargarInformacionTipoDefinicion = jButtonRecargarInformacionTipoDefinicion;
	}
	
	public JButton getjButtonProcesarInformacionTipoDefinicion() {
		return this.jButtonProcesarInformacionTipoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDefinicion)	{
		this.jButtonProcesarInformacionTipoDefinicion = jButtonProcesarInformacionTipoDefinicion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDefinicion() {
		return this.jButtonRecargarInformacionTipoDefinicion;
	}
	
	
	public List<TipoDefinicion> gettipodefinicions() {
		return this.tipodefinicions;
	}

	public void settipodefinicions(List<TipoDefinicion> tipodefinicions) {
		this.tipodefinicions = tipodefinicions;
	}
	
	public List<TipoDefinicion> gettipodefinicionsAux() {
		return this.tipodefinicionsAux;
	}

	public void settipodefinicionsAux(List<TipoDefinicion> tipodefinicionsAux) {
		this.tipodefinicionsAux = tipodefinicionsAux;
	}
	
	public List<TipoDefinicion> gettipodefinicionsEliminados() {
		return this.tipodefinicionsEliminados;
	}

	public void setTipoDefinicionsEliminados(List<TipoDefinicion> tipodefinicionsEliminados) {
		this.tipodefinicionsEliminados = tipodefinicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDefinicion() {
		return jComboBoxTiposSeleccionarTipoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDefinicion(
			JComboBox jComboBoxTiposSeleccionarTipoDefinicion) {
		this.jComboBoxTiposSeleccionarTipoDefinicion = jComboBoxTiposSeleccionarTipoDefinicion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDefinicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDefinicion() {
		return jTextFieldValorCampoGeneralTipoDefinicion;
	}

	public void setjTextFieldValorCampoGeneralTipoDefinicion(
			JTextField jTextFieldValorCampoGeneralTipoDefinicion) {
		this.jTextFieldValorCampoGeneralTipoDefinicion = jTextFieldValorCampoGeneralTipoDefinicion;
	}

	public void setBorderResaltarValorCampoGeneralTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDefinicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDefinicion() {
		return this.jCheckBoxSeleccionarTodosTipoDefinicion;
	}

	public void setjCheckBoxSeleccionarTodosTipoDefinicion(
			JCheckBox jCheckBoxSeleccionarTodosTipoDefinicion) {
		this.jCheckBoxSeleccionarTodosTipoDefinicion = jCheckBoxSeleccionarTodosTipoDefinicion;
	}

	public void setBorderResaltarSeleccionarTodosTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDefinicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDefinicion() {
		return this.jCheckBoxSeleccionadosTipoDefinicion;
	}

	public void setjCheckBoxSeleccionadosTipoDefinicion(
			JCheckBox jCheckBoxSeleccionadosTipoDefinicion) {
		this.jCheckBoxSeleccionadosTipoDefinicion = jCheckBoxSeleccionadosTipoDefinicion;
	}
	
	public void setBorderResaltarSeleccionadosTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDefinicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDefinicion() {
		return this.jComboBoxTiposArchivosReportesTipoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDefinicion(
			JComboBox jComboBoxTiposArchivosReportesTipoDefinicion) {
		this.jComboBoxTiposArchivosReportesTipoDefinicion = jComboBoxTiposArchivosReportesTipoDefinicion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDefinicion() {
		return this.jComboBoxTiposReportesTipoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDefinicion(
			JComboBox jComboBoxTiposReportesTipoDefinicion) {
		this.jComboBoxTiposReportesTipoDefinicion = jComboBoxTiposReportesTipoDefinicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDefinicion() {
	//	return jComboBoxTiposReportesDinamicoTipoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDefinicion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDefinicion) {
	//	this.jComboBoxTiposReportesDinamicoTipoDefinicion = jComboBoxTiposReportesDinamicoTipoDefinicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDefinicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDefinicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDefinicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion = jComboBoxTiposArchivosReportesDinamicoTipoDefinicion;
	//}
	
	public void setBorderResaltarTiposReportesTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDefinicion() {
		return this.jComboBoxTiposGraficosReportesTipoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDefinicion(
			JComboBox jComboBoxTiposGraficosReportesTipoDefinicion) {
		this.jComboBoxTiposGraficosReportesTipoDefinicion = jComboBoxTiposGraficosReportesTipoDefinicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDefinicion() {
		return this.jComboBoxTiposPaginacionTipoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDefinicion(
			JComboBox jComboBoxTiposPaginacionTipoDefinicion) {
		this.jComboBoxTiposPaginacionTipoDefinicion = jComboBoxTiposPaginacionTipoDefinicion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDefinicion() {
		return this.jComboBoxTiposRelacionesTipoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDefinicion() {
		return this.jComboBoxTiposAccionesTipoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoDefinicion) {
		this.jComboBoxTiposRelacionesTipoDefinicion = jComboBoxTiposRelacionesTipoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoDefinicion) {
		this.jComboBoxTiposAccionesTipoDefinicion = jComboBoxTiposAccionesTipoDefinicion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDefinicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDefinicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDefinicion() {
	//	return jCheckBoxConGraficoDinamicoTipoDefinicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDefinicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDefinicion) {
	//	this.jCheckBoxConGraficoDinamicoTipoDefinicion = jCheckBoxConGraficoDinamicoTipoDefinicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDefinicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDefinicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDefinicion .setBorder(borderResaltar);		
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
		this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		
		this.tipodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodefinicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDefinicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"nuevo","nuevo","Nuevo"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"duplicar","duplicar","Duplicar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"copiar","copiar","Copiar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"ver_form","ver_form","Ver"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"recargar","recargar","Recargar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDefinicion,this.jTtoolBarTipoDefinicion,
							"cerrar","cerrar","Salir"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDefinicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDefinicion;
			
				this.jButtonProcesarInformacionToolBarTipoDefinicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDefinicion;
				
		//protected JButton jButtonModificarToolBarTipoDefinicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDefinicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDefinicion=new JMenuMe("General");
		this.jmenuArchivoTipoDefinicion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDefinicion=new JMenuMe("Acciones");
		this.jmenuDatosTipoDefinicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDefinicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDefinicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDefinicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDefinicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDefinicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDefinicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDefinicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDefinicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDefinicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDefinicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDefinicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDefinicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDefinicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDefinicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDefinicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDefinicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDefinicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDefinicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDefinicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDefinicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDefinicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDefinicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDefinicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDefinicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDefinicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDefinicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDefinicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDefinicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDefinicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDefinicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDefinicion.add(this.jMenuItemCerrarTipoDefinicion);
			
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemNuevoTipoDefinicion);
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemNuevoGuardarCambiosTipoDefinicion);
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemNuevoRelacionesTipoDefinicion);
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemGuardarCambiosTablaTipoDefinicion);		
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemDuplicarTipoDefinicion);		
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemCopiarTipoDefinicion);		
			this.jmenuAccionesTipoDefinicion.add(this.jMenuItemVerFormTipoDefinicion);		
			
			this.jmenuDatosTipoDefinicion.add(this.jMenuItemRecargarInformacionTipoDefinicion);				
			this.jmenuDatosTipoDefinicion.add(this.jMenuItemAnterioresTipoDefinicion);				
			this.jmenuDatosTipoDefinicion.add(this.jMenuItemSiguientesTipoDefinicion);				
			this.jmenuDatosTipoDefinicion.add(this.jMenuItemAbrirOrderByTipoDefinicion);				
			this.jmenuDatosTipoDefinicion.add(this.jMenuItemMostrarOcultarTipoDefinicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDefinicion.add(this.jMenuItemGuardarCambiosTipoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDefinicion.add(this.jmenuArchivoTipoDefinicion);		
			this.jmenuBarTipoDefinicion.add(this.jmenuAccionesTipoDefinicion);		
			this.jmenuBarTipoDefinicion.add(this.jmenuDatosTipoDefinicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDefinicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDefinicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDefinicion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDefinicion= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDefinicion.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDefinicion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDefinicion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDefinicion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDefinicion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDefinicion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDefinicion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDefinicion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDefinicion= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDefinicion.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDefinicion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDefinicion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDefinicion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDefinicion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDefinicion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoDefinicion= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDefinicion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDefinicion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDefinicion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDefinicion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDefinicion = new TipoDefinicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Definicion DATOS");
			this.jInternalFrameDetalleFormTipoDefinicion = new TipoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipodefinicionSessionBean.getConGuardarRelaciones(),this.tipodefinicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDefinicion = null;//new TipoDefinicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDefinicion= new GridBagLayout();
		
		
		this.jTableDatosTipoDefinicion = new JTableMe();      
		
		String sToolTipTipoDefinicion="";
		sToolTipTipoDefinicion=TipoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDefinicion+="(Inventario.TipoDefinicion)";
		}
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDefinicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDefinicion.setToolTipText(sToolTipTipoDefinicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDefinicion);
		this.jTableDatosTipoDefinicion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDefinicion.setRowSelectionAllowed(true);
		this.jTableDatosTipoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDefinicion = new JButtonMe();
		this.jButtonDuplicarTipoDefinicion = new JButtonMe();
		this.jButtonCopiarTipoDefinicion = new JButtonMe();
		this.jButtonVerFormTipoDefinicion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDefinicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDefinicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Definicion";
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDefinicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDefinicion=new ReporteDinamicoJInternalFrame(TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDefinicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDefinicion=new ImportacionJInternalFrame(TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDefinicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDefinicion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDefinicion.setText("Orden");
		this.jButtonAbrirOrderByTipoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDefinicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDefinicion,false,this);
			
			//this.cargarOrderByTipoDefinicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDefinicion,true,this);
			
			//this.cargarOrderByTipoDefinicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDefinicion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDefinicion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDefinicion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDefinicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDefinicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDefinicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDefinicion.setText("Nuevo");
		this.jButtonDuplicarTipoDefinicion.setText("Duplicar");
		this.jButtonCopiarTipoDefinicion.setText("Copiar");
		this.jButtonVerFormTipoDefinicion.setText("Ver");
		this.jButtonNuevoRelacionesTipoDefinicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDefinicion,"nuevo_button","Nuevo",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDefinicion,"duplicar_button","Duplicar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDefinicion,"copiar_button","Copiar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDefinicion,"ver_form","Ver",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDefinicion,"nuevorelaciones_button","Nuevo Rel",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDefinicion,"guardarcambiostabla_button","Guardar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDefinicion,"cerrar_button","Salir",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDefinicion.setToolTipText("Nuevo"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDefinicion.setToolTipText("Duplicar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDefinicion.setToolTipText("Copiar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDefinicion.setToolTipText("Ver"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDefinicion.setToolTipText("Nuevo Rel"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.setToolTipText("Guardar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDefinicion.setToolTipText("Salir"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDefinicion";
		inputMap = this.jButtonNuevoTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDefinicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDefinicion";
		inputMap = this.jButtonDuplicarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDefinicion"));
		
		//COPIAR
		sMapKey = "CopiarTipoDefinicion";
		inputMap = this.jButtonCopiarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDefinicion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDefinicion";
		inputMap = this.jButtonVerFormTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDefinicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDefinicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDefinicion";
		inputMap = this.jButtonModificarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDefinicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDefinicion";
		inputMap = this.jButtonCerrarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDefinicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDefinicion.setName("jPanelParametrosReportesTipoDefinicion"); 
		
		this.jPanelParametrosReportesAccionesTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDefinicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDefinicion.setName("jPanelParametrosReportesAccionesTipoDefinicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDefinicion = new JButtonMe();
		this.jButtonRecargarInformacionTipoDefinicion.setText("Recargar");
		this.jButtonRecargarInformacionTipoDefinicion.setToolTipText("Recargar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDefinicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDefinicion = new JButtonMe();
		this.jButtonProcesarInformacionTipoDefinicion.setText("Procesar");
		this.jButtonProcesarInformacionTipoDefinicion.setToolTipText("Procesar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDefinicion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDefinicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDefinicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDefinicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDefinicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDefinicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDefinicion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDefinicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDefinicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDefinicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDefinicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDefinicion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDefinicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDefinicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDefinicion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDefinicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDefinicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDefinicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDefinicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDefinicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDefinicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDefinicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDefinicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDefinicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDefinicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDefinicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDefinicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDefinicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDefinicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDefinicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDefinicion = new JButtonMe();
		//this.jButtonAnterioresTipoDefinicion.setText("<<");
        this.jButtonAnterioresTipoDefinicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDefinicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDefinicion = new JButtonMe();
		//this.jButtonSiguientesTipoDefinicion.setText(">>");
        this.jButtonSiguientesTipoDefinicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDefinicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDefinicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDefinicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDefinicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDefinicion,"nuevoguardarcambios_button","Nue",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDefinicion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDefinicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDefinicion";
		inputMap = this.jButtonRecargarInformacionTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDefinicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDefinicion";
		inputMap = this.jButtonSiguientesTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDefinicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDefinicion";
		inputMap = this.jButtonAnterioresTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDefinicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDefinicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDefinicion.setMinimumSize(new Dimension(this.getWidth(),TipoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDefinicion.setMaximumSize(new Dimension(this.getWidth(),TipoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDefinicion.setPreferredSize(new Dimension(this.getWidth(),TipoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDefinicion = new GridBagLayout();

			this.jPanelPaginacionTipoDefinicion.setLayout(gridaBagLayoutPaginacionTipoDefinicion);						
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonAnterioresTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					
						
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDefinicion.gridy = 0;
			
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonNuevoGuardarCambiosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
						
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDefinicion.gridy = 0;
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonSiguientesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonNuevoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDefinicion.add(this.jButtonNuevoRelacionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			}
			
			
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDefinicion.add(this.jButtonGuardarCambiosTablaTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			}
			
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonDuplicarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonCopiarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonVerFormTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDefinicion.add(this.jButtonCerrarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
		
		
		this.jButtonRecargarInformacionTipoDefinicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDefinicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDefinicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDefinicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDefinicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDefinicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDefinicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDefinicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDefinicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDefinicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDefinicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDefinicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDefinicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDefinicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDefinicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDefinicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDefinicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDefinicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDefinicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDefinicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDefinicion.setLayout(gridaBagParametrosReportesTipoDefinicion);
			this.jPanelParametrosReportesAccionesTipoDefinicion.setLayout(gridaBagParametrosReportesAccionesTipoDefinicion);
			
			
			this.jPanelParametrosAuxiliar1TipoDefinicion.setLayout(gridaBagParametrosAuxiliar1TipoDefinicion);
			this.jPanelParametrosAuxiliar2TipoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoDefinicion);
			this.jPanelParametrosAuxiliar3TipoDefinicion.setLayout(gridaBagParametrosAuxiliar3TipoDefinicion);
			this.jPanelParametrosAuxiliar4TipoDefinicion.setLayout(gridaBagParametrosAuxiliar4TipoDefinicion);
			//this.jPanelParametrosAuxiliar5TipoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoDefinicion);			
			
			
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDefinicion.add(this.jButtonRecargarInformacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDefinicion.add(this.jComboBoxTiposPaginacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDefinicion.add(this.jCheckBoxConAltoMaximoTablaTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDefinicion.add(this.jComboBoxTiposArchivosReportesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDefinicion.add(this.jPanelParametrosAuxiliar1TipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDefinicion.add(this.jComboBoxTiposReportesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDefinicion.add(this.jPanelParametrosAuxiliar4TipoDefinicion, this.gridBagConstraintsTipoDefinicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDefinicion.add(this.jComboBoxTiposReportesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDefinicion.add(this.jCheckBoxGenerarReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDefinicion.add(this.jPanelParametrosAuxiliar2TipoDefinicion, this.gridBagConstraintsTipoDefinicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDefinicion.add(this.jLabelAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDefinicion.add(this.jButtonAbrirOrderByTipoDefinicion, this.gridBagConstraintsTipoDefinicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDefinicion.add(this.jComboBoxTiposSeleccionarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
			
			
			/*
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);															
				
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDefinicion.add(this.jCheckBoxSeleccionadosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDefinicion.add(this.jPanelParametrosAuxiliar3TipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDefinicion.add(this.jComboBoxTiposRelacionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
				
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDefinicion.add(this.jComboBoxTiposAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDefinicion = new GridBagLayout();

			this.jScrollPanelDatosTipoDefinicion.setLayout(gridaBagLayoutDatosTipoDefinicion);
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoDefinicion.gridx = 0;
			
			this.jScrollPanelDatosTipoDefinicion.add(this.jTableDatosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDefinicion.setViewportView(this.jTableDatosTipoDefinicion);
		this.jTableDatosTipoDefinicion.setFillsViewportHeight(true);
		this.jTableDatosTipoDefinicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoDefinicion.setLayout(gridaBagLayoutAccionesTipoDefinicion);
		
		
		/*	
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
			
		this.jPanelAccionesTipoDefinicion.add(this.jButtonNuevoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDefinicion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDefinicion.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 0;
		gridBagConstraintsTipoDefinicion.gridx = 0;
		jPanelBusquedaPorCodigoTipoDefinicion.add(jLabelcodigoBusquedaPorCodigoTipoDefinicion, gridBagConstraintsTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 0;
		gridBagConstraintsTipoDefinicion.gridx = 1;
		jPanelBusquedaPorCodigoTipoDefinicion.add(jTextFieldcodigoBusquedaPorCodigoTipoDefinicion, gridBagConstraintsTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 1;
		gridBagConstraintsTipoDefinicion.gridx =1;
		jPanelBusquedaPorCodigoTipoDefinicion.add(jButtonBusquedaPorCodigoTipoDefinicion, gridBagConstraintsTipoDefinicion);

		jTabbedPaneBusquedasTipoDefinicion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDefinicion);
		jTabbedPaneBusquedasTipoDefinicion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDefinicion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDefinicion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDefinicion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDefinicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDefinicion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDefinicion.setLayout(gridaBagLayoutBusquedaPorNombreTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 0;
		gridBagConstraintsTipoDefinicion.gridx = 0;
		jPanelBusquedaPorNombreTipoDefinicion.add(jLabelnombreBusquedaPorNombreTipoDefinicion, gridBagConstraintsTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 0;
		gridBagConstraintsTipoDefinicion.gridx = 1;
		jPanelBusquedaPorNombreTipoDefinicion.add(jTextFieldnombreBusquedaPorNombreTipoDefinicion, gridBagConstraintsTipoDefinicion);

		gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDefinicion.gridy = 1;
		gridBagConstraintsTipoDefinicion.gridx =1;
		jPanelBusquedaPorNombreTipoDefinicion.add(jButtonBusquedaPorNombreTipoDefinicion, gridBagConstraintsTipoDefinicion);

		jTabbedPaneBusquedasTipoDefinicion.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoDefinicion);
		jTabbedPaneBusquedasTipoDefinicion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDefinicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDefinicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDefinicion.gridx = 0;		
		//this.gridBagConstraintsTipoDefinicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDefinicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDefinicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDefinicion.gridx = 0;		
			this.gridBagConstraintsTipoDefinicion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDefinicion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDefinicion, this.gridBagConstraintsTipoDefinicion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);								
		
		
		/*
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		*/		
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDefinicion.gridx =0;
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
				
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDefinicion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDefinicion.setLayout(gridaBagLayoutBusquedasParametrosTipoDefinicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDefinicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDefinicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDefinicion.setName("jPanelReporteDinamicoTipoDefinicion"); 
		
		this.jPanelReporteDinamicoTipoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDefinicion.setLayout(gridaBagLayoutReporteDinamicoTipoDefinicion);
		
		
		this.jInternalFrameReporteDinamicoTipoDefinicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDefinicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDefinicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDefinicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDefinicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDefinicion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDefinicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jLabelColumnasSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDefinicion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDefinicion=new JScrollPane(this.jListColumnasSelectReporteTipoDefinicion);
			
			this.jScrollColumnasSelectReporteTipoDefinicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDefinicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDefinicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDefinicion.add(this.jListColumnasSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jScrollColumnasSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDefinicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDefinicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jLabelRelacionesSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDefinicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDefinicion=new JScrollPane(this.jListRelacionesSelectReporteTipoDefinicion);
			
			this.jScrollRelacionesSelectReporteTipoDefinicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDefinicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDefinicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDefinicion.add(this.jListRelacionesSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jScrollRelacionesSelectReporteTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDefinicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDefinicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDefinicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDefinicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDefinicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jLabelGenerarExcelReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDefinicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDefinicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDefinicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDefinicion.setToolTipText("Generar EXCEL"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDefinicion.add(this.jButtonGenerarExcelReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jComboBoxTiposReportesDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDefinicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDefinicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jLabelTiposArchivoReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDefinicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDefinicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDefinicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDefinicion.setToolTipText("Generar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jButtonGenerarReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDefinicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDefinicion.setToolTipText("Cancelar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDefinicion.add(this.jButtonCerrarReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDefinicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDefinicion= new JScrollPane(jPanelReporteDinamicoTipoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDefinicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDefinicion);
		this.jInternalFrameReporteDinamicoTipoDefinicion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDefinicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDefinicion.setName("jPanelImportacionTipoDefinicion"); 
		
		this.jPanelImportacionTipoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDefinicion.setLayout(gridaBagLayoutImportacionTipoDefinicion);
		
		
		this.jInternalFrameImportacionTipoDefinicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDefinicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoDefinicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDefinicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoDefinicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDefinicion = new JLabelMe();

		this.jLabelArchivoImportacionTipoDefinicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDefinicion.add(this.jLabelArchivoImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDefinicion = new JFileChooser();		
		this.jFileChooserImportacionTipoDefinicion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDefinicion = new JButtonMe();
		this.jButtonAbrirImportacionTipoDefinicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDefinicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDefinicion.setToolTipText("Generar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDefinicion.add(this.jButtonAbrirImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDefinicion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDefinicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDefinicion.add(this.jLabelPathArchivoImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDefinicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDefinicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDefinicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDefinicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDefinicion.add(this.jTextFieldPathArchivoImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDefinicion = new JButtonMe();
		this.jButtonGenerarImportacionTipoDefinicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDefinicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDefinicion.setToolTipText("Generar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDefinicion.add(this.jButtonGenerarImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDefinicion = new JButtonMe();
		this.jButtonCerrarImportacionTipoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDefinicion.setToolTipText("Cancelar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDefinicion.add(this.jButtonCerrarImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDefinicion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDefinicion= new JScrollPane(jPanelImportacionTipoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDefinicion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDefinicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDefinicion);
		this.jInternalFrameImportacionTipoDefinicion.getContentPane().add(this.jScrollPanelImportacionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDefinicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDefinicion = new JButtonMe();
			this.jButtonAbrirOrderByTipoDefinicion.setText("Orden");
			this.jButtonAbrirOrderByTipoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDefinicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDefinicion";
			inputMap = this.jButtonAbrirOrderByTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDefinicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDefinicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDefinicion.setName("jPanelOrderByTipoDefinicion"); 
			
			this.jPanelOrderByTipoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDefinicion.setLayout(gridaBagLayoutOrderByTipoDefinicion);
			
			
			this.jTableDatosTipoDefinicionOrderBy = new JTableMe();        
			this.jTableDatosTipoDefinicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDefinicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDefinicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDefinicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDefinicionOrderBy.setViewportView(this.jTableDatosTipoDefinicionOrderBy);
			this.jTableDatosTipoDefinicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDefinicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDefinicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDefinicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDefinicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDefinicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDefinicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDefinicion.setTitle("Orden");
			this.jInternalFrameOrderByTipoDefinicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDefinicion.setResizable(true);
			this.jInternalFrameOrderByTipoDefinicion.setClosable(true);
			this.jInternalFrameOrderByTipoDefinicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDefinicion.ipady =150;
				
			this.jPanelOrderByTipoDefinicion.add(jScrollPanelDatosTipoDefinicionOrderBy, this.gridBagConstraintsTipoDefinicion);//this.jTableDatosTipoDefinicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDefinicion = new JButtonMe();
			this.jButtonCerrarOrderByTipoDefinicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDefinicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDefinicion.setToolTipText("Cancelar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDefinicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDefinicion.add(this.jButtonCerrarOrderByTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDefinicion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDefinicion= new JScrollPane(jPanelOrderByTipoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDefinicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDefinicion);
			
			this.jInternalFrameOrderByTipoDefinicion.getContentPane().add(this.jScrollPanelOrderByTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
		
		} else {
			this.jButtonAbrirOrderByTipoDefinicion = new JButtonMe();
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
			&& this.tipodefinicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDefinicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDefinicion.getRowHeight();//TipoDefinicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDefinicion.isSelected()) {
					iHeightTable=TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDefinicion.isSelected()) {
					iHeightTable=TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDefinicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDefinicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDefinicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDefinicion!=null && this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDefinicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDefinicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDefinicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodefinicionLogic.getTipoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodefinicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDefinicion> TraerTipoDefinicionBeans(List<TipoDefinicion> tipodefinicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDefinicion tipodefinicion:tipodefinicions) {
					
				if(!(TipoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodefinicion.setsDetalleGeneralEntityReporte(TipoDefinicionConstantesFunciones.getTipoDefinicionDescripcion(tipodefinicion));
										
						
					
					

					if(tipodefinicion.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipodefinicion.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipodefinicion.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodefinicion.setsDetalleGeneralEntityReporte(tipodefinicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodefinicionbeans.add(tipodefinicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodefinicions;
    }
	//PARA REPORTES FIN
}
