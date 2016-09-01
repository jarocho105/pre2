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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoIntervaloConstantesFunciones;

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
public class TipoIntervaloJInternalFrame extends TipoIntervaloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoIntervalo;
	
	protected JMenuBar jmenuBarTipoIntervalo;
	
	protected JMenu jmenuTipoIntervalo;
	protected JMenu jmenuDatosTipoIntervalo;
	protected JMenu jmenuArchivoTipoIntervalo;
	protected JMenu jmenuAccionesTipoIntervalo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIntervalo;	
	protected GridBagConstraints gridBagConstraintsTipoIntervalo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoIntervaloDetalleFormJInternalFrame jInternalFrameDetalleFormTipoIntervalo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoIntervalo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoIntervalo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIntervaloSessionBean tipointervaloSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoIntervalo> tipointervalos;		
	public List<TipoIntervalo> tipointervalosEliminados;	
	public List<TipoIntervalo> tipointervalosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoIntervalo;		
	protected JButton jButtonAbrirOrderByTipoIntervalo;
	
	
	//protected JPanel jPanelOrderByTipoIntervalo;
	//public JScrollPane jScrollPanelOrderByTipoIntervalo;	
	//protected JButton jButtonCerrarOrderByTipoIntervalo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoIntervaloLogic tipointervaloLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoIntervalo;
	public JScrollPane jScrollPanelDatosEdicionTipoIntervalo;
	public JScrollPane jScrollPanelDatosGeneralTipoIntervalo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoIntervaloOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoIntervalo;
	//public JScrollPane jScrollPanelImportacionTipoIntervalo;
	
	
	
	protected JPanel jPanelAccionesTipoIntervalo;
	
    protected JPanel jPanelPaginacionTipoIntervalo;
    protected JPanel jPanelParametrosReportesTipoIntervalo;
	protected JPanel jPanelParametrosReportesAccionesTipoIntervalo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoIntervalo;
	protected JPanel jPanelParametrosAuxiliar2TipoIntervalo;
	protected JPanel jPanelParametrosAuxiliar3TipoIntervalo;
	protected JPanel jPanelParametrosAuxiliar4TipoIntervalo;
	//protected JPanel jPanelParametrosAuxiliar5TipoIntervalo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoIntervalo;
	//protected JPanel jPanelImportacionTipoIntervalo;
	
	
	public JTable jTableDatosTipoIntervalo;
	
	
	
	//public JTable jTableDatosTipoIntervaloOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoIntervalo;
	protected JButton jButtonDuplicarTipoIntervalo;
	protected JButton jButtonCopiarTipoIntervalo;
	protected JButton jButtonVerFormTipoIntervalo;
	protected JButton jButtonNuevoRelacionesTipoIntervalo;
	protected JButton jButtonModificarTipoIntervalo;
	
    protected JButton jButtonGuardarCambiosTablaTipoIntervalo;
	protected JButton jButtonCerrarTipoIntervalo;
	
	
	protected JButton jButtonRecargarInformacionTipoIntervalo;
	protected JButton jButtonProcesarInformacionTipoIntervalo;
	
	
	protected JButton jButtonAnterioresTipoIntervalo;
	protected JButton jButtonSiguientesTipoIntervalo;
	protected JButton jButtonNuevoGuardarCambiosTipoIntervalo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoIntervalo;
	//protected JButton jButtonCerrarReporteDinamicoTipoIntervalo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoIntervalo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoIntervalo;
	//protected JButton jButtonGenerarImportacionTipoIntervalo;
	//protected JButton jButtonCerrarImportacionTipoIntervalo;
	//protected JFileChooser jFileChooserImportacionTipoIntervalo;
	//protected File fileImportacionTipoIntervalo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIntervalo;
	protected JButton jButtonDuplicarToolBarTipoIntervalo;
	protected JButton jButtonNuevoRelacionesToolBarTipoIntervalo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoIntervalo;
	protected JButton jButtonCopiarToolBarTipoIntervalo;
	protected JButton jButtonVerFormToolBarTipoIntervalo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoIntervalo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIntervalo;
	protected JButton jButtonCerrarToolBarTipoIntervalo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoIntervalo;
	protected JButton jButtonProcesarInformacionToolBarTipoIntervalo;
	protected JButton jButtonAnterioresToolBarTipoIntervalo;
	protected JButton jButtonSiguientesToolBarTipoIntervalo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoIntervalo;
	protected JButton jButtonAbrirOrderByToolBarTipoIntervalo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIntervalo;
	protected JMenuItem jMenuItemDuplicarTipoIntervalo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoIntervalo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoIntervalo;
	protected JMenuItem jMenuItemCopiarTipoIntervalo;
	protected JMenuItem jMenuItemVerFormTipoIntervalo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIntervalo;
	protected JMenuItem jMenuItemCerrarTipoIntervalo;
	protected JMenuItem jMenuItemDetalleCerrarTipoIntervalo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoIntervalo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIntervalo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoIntervalo;
	protected JMenuItem jMenuItemProcesarInformacionTipoIntervalo;
	protected JMenuItem jMenuItemAnterioresTipoIntervalo;
	protected JMenuItem jMenuItemSiguientesTipoIntervalo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIntervalo;
	protected JMenuItem jMenuItemAbrirOrderByTipoIntervalo;
	protected JMenuItem jMenuItemMostrarOcultarTipoIntervalo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIntervalo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoIntervalo;
	protected JCheckBox jCheckBoxSeleccionadosTipoIntervalo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoIntervalo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoIntervalo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoIntervalo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoIntervalo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIntervalo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoIntervalo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoIntervalo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoIntervalo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIntervalo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIntervalo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoIntervalo;
	protected JTextField jTextFieldValorCampoGeneralTipoIntervalo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoIntervalo;
	//public JList<Reporte> jListColumnasSelectReporteTipoIntervalo;
	//public JScrollPane jScrollColumnasSelectReporteTipoIntervalo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoIntervalo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoIntervalo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoIntervalo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoIntervalo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoIntervalo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoIntervalo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoIntervalo;
	
		
	//public JLabel jLabelArchivoImportacionTipoIntervalo;	
	//public JLabel jLabelPathArchivoImportacionTipoIntervalo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoIntervalo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoIntervalo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoIntervalo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoIntervalo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoIntervalo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoIntervalo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoIntervalo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoIntervalo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoIntervalo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoIntervalo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoIntervaloJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoIntervalo)	{
		this.jButtonRecargarInformacionTipoIntervalo = jButtonRecargarInformacionTipoIntervalo;
	}
	
	public JButton getjButtonProcesarInformacionTipoIntervalo() {
		return this.jButtonProcesarInformacionTipoIntervalo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIntervalo)	{
		this.jButtonProcesarInformacionTipoIntervalo = jButtonProcesarInformacionTipoIntervalo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoIntervalo() {
		return this.jButtonRecargarInformacionTipoIntervalo;
	}
	
	
	public List<TipoIntervalo> gettipointervalos() {
		return this.tipointervalos;
	}

	public void settipointervalos(List<TipoIntervalo> tipointervalos) {
		this.tipointervalos = tipointervalos;
	}
	
	public List<TipoIntervalo> gettipointervalosAux() {
		return this.tipointervalosAux;
	}

	public void settipointervalosAux(List<TipoIntervalo> tipointervalosAux) {
		this.tipointervalosAux = tipointervalosAux;
	}
	
	public List<TipoIntervalo> gettipointervalosEliminados() {
		return this.tipointervalosEliminados;
	}

	public void setTipoIntervalosEliminados(List<TipoIntervalo> tipointervalosEliminados) {
		this.tipointervalosEliminados = tipointervalosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoIntervalo() {
		return jComboBoxTiposSeleccionarTipoIntervalo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoIntervalo(
			JComboBox jComboBoxTiposSeleccionarTipoIntervalo) {
		this.jComboBoxTiposSeleccionarTipoIntervalo = jComboBoxTiposSeleccionarTipoIntervalo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoIntervalo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoIntervalo() {
		return jTextFieldValorCampoGeneralTipoIntervalo;
	}

	public void setjTextFieldValorCampoGeneralTipoIntervalo(
			JTextField jTextFieldValorCampoGeneralTipoIntervalo) {
		this.jTextFieldValorCampoGeneralTipoIntervalo = jTextFieldValorCampoGeneralTipoIntervalo;
	}

	public void setBorderResaltarValorCampoGeneralTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoIntervalo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoIntervalo() {
		return this.jCheckBoxSeleccionarTodosTipoIntervalo;
	}

	public void setjCheckBoxSeleccionarTodosTipoIntervalo(
			JCheckBox jCheckBoxSeleccionarTodosTipoIntervalo) {
		this.jCheckBoxSeleccionarTodosTipoIntervalo = jCheckBoxSeleccionarTodosTipoIntervalo;
	}

	public void setBorderResaltarSeleccionarTodosTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoIntervalo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoIntervalo() {
		return this.jCheckBoxSeleccionadosTipoIntervalo;
	}

	public void setjCheckBoxSeleccionadosTipoIntervalo(
			JCheckBox jCheckBoxSeleccionadosTipoIntervalo) {
		this.jCheckBoxSeleccionadosTipoIntervalo = jCheckBoxSeleccionadosTipoIntervalo;
	}
	
	public void setBorderResaltarSeleccionadosTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoIntervalo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoIntervalo() {
		return this.jComboBoxTiposArchivosReportesTipoIntervalo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoIntervalo(
			JComboBox jComboBoxTiposArchivosReportesTipoIntervalo) {
		this.jComboBoxTiposArchivosReportesTipoIntervalo = jComboBoxTiposArchivosReportesTipoIntervalo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoIntervalo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoIntervalo() {
		return this.jComboBoxTiposReportesTipoIntervalo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoIntervalo(
			JComboBox jComboBoxTiposReportesTipoIntervalo) {
		this.jComboBoxTiposReportesTipoIntervalo = jComboBoxTiposReportesTipoIntervalo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoIntervalo() {
	//	return jComboBoxTiposReportesDinamicoTipoIntervalo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoIntervalo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoIntervalo) {
	//	this.jComboBoxTiposReportesDinamicoTipoIntervalo = jComboBoxTiposReportesDinamicoTipoIntervalo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoIntervalo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoIntervalo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoIntervalo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIntervalo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo = jComboBoxTiposArchivosReportesDinamicoTipoIntervalo;
	//}
	
	public void setBorderResaltarTiposReportesTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoIntervalo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoIntervalo() {
		return this.jComboBoxTiposGraficosReportesTipoIntervalo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoIntervalo(
			JComboBox jComboBoxTiposGraficosReportesTipoIntervalo) {
		this.jComboBoxTiposGraficosReportesTipoIntervalo = jComboBoxTiposGraficosReportesTipoIntervalo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoIntervalo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoIntervalo() {
		return this.jComboBoxTiposPaginacionTipoIntervalo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoIntervalo(
			JComboBox jComboBoxTiposPaginacionTipoIntervalo) {
		this.jComboBoxTiposPaginacionTipoIntervalo = jComboBoxTiposPaginacionTipoIntervalo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoIntervalo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoIntervalo() {
		return this.jComboBoxTiposRelacionesTipoIntervalo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIntervalo() {
		return this.jComboBoxTiposAccionesTipoIntervalo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIntervalo(
			JComboBox jComboBoxTiposRelacionesTipoIntervalo) {
		this.jComboBoxTiposRelacionesTipoIntervalo = jComboBoxTiposRelacionesTipoIntervalo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIntervalo(
			JComboBox jComboBoxTiposAccionesTipoIntervalo) {
		this.jComboBoxTiposAccionesTipoIntervalo = jComboBoxTiposAccionesTipoIntervalo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoIntervalo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoIntervalo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoIntervalo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoIntervalo() {
	//	return jCheckBoxConGraficoDinamicoTipoIntervalo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoIntervalo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoIntervalo) {
	//	this.jCheckBoxConGraficoDinamicoTipoIntervalo = jCheckBoxConGraficoDinamicoTipoIntervalo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoIntervalo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoIntervalo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoIntervalo .setBorder(borderResaltar);		
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
		this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
		
		this.tipointervaloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointervaloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipointervaloSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIntervaloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Intervalo  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoIntervaloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoIntervalo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"nuevo","nuevo","Nuevo"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"duplicar","duplicar","Duplicar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"copiar","copiar","Copiar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"ver_form","ver_form","Ver"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"recargar","recargar","Recargar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoIntervalo,this.jTtoolBarTipoIntervalo,
							"cerrar","cerrar","Salir"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoIntervalo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoIntervalo;
			
				this.jButtonProcesarInformacionToolBarTipoIntervalo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoIntervalo;
				
		//protected JButton jButtonModificarToolBarTipoIntervalo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoIntervalo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoIntervalo=new JMenuMe("General");
		this.jmenuArchivoTipoIntervalo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoIntervalo=new JMenuMe("Acciones");
		this.jmenuDatosTipoIntervalo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIntervalo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIntervalo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIntervalo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoIntervalo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoIntervalo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoIntervalo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoIntervalo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoIntervalo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoIntervalo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoIntervalo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIntervalo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIntervalo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoIntervalo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoIntervalo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoIntervalo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoIntervalo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoIntervalo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoIntervalo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoIntervalo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoIntervalo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoIntervalo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIntervalo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIntervalo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIntervalo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoIntervalo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoIntervalo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoIntervalo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoIntervalo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoIntervalo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoIntervalo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoIntervalo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoIntervalo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoIntervalo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoIntervalo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoIntervalo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoIntervalo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoIntervalo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoIntervalo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoIntervalo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIntervalo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIntervalo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIntervalo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoIntervalo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoIntervalo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoIntervalo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIntervalo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIntervalo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIntervalo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoIntervalo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoIntervalo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoIntervalo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoIntervalo.add(this.jMenuItemCerrarTipoIntervalo);
			
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemNuevoTipoIntervalo);
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemNuevoGuardarCambiosTipoIntervalo);
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemNuevoRelacionesTipoIntervalo);
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemGuardarCambiosTablaTipoIntervalo);		
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemDuplicarTipoIntervalo);		
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemCopiarTipoIntervalo);		
			this.jmenuAccionesTipoIntervalo.add(this.jMenuItemVerFormTipoIntervalo);		
			
			this.jmenuDatosTipoIntervalo.add(this.jMenuItemRecargarInformacionTipoIntervalo);				
			this.jmenuDatosTipoIntervalo.add(this.jMenuItemAnterioresTipoIntervalo);				
			this.jmenuDatosTipoIntervalo.add(this.jMenuItemSiguientesTipoIntervalo);				
			this.jmenuDatosTipoIntervalo.add(this.jMenuItemAbrirOrderByTipoIntervalo);				
			this.jmenuDatosTipoIntervalo.add(this.jMenuItemMostrarOcultarTipoIntervalo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoIntervalo.add(this.jMenuItemGuardarCambiosTipoIntervalo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoIntervalo.add(this.jmenuArchivoTipoIntervalo);		
			this.jmenuBarTipoIntervalo.add(this.jmenuAccionesTipoIntervalo);		
			this.jmenuBarTipoIntervalo.add(this.jmenuDatosTipoIntervalo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoIntervalo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoIntervalo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoIntervalo = new TipoIntervaloDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Intervalo  DATOS");
			this.jInternalFrameDetalleFormTipoIntervalo = new TipoIntervaloDetalleFormJInternalFrame(jDesktopPane,this.tipointervaloSessionBean.getConGuardarRelaciones(),this.tipointervaloSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoIntervalo = null;//new TipoIntervaloDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIntervalo= new GridBagLayout();
		
		
		this.jTableDatosTipoIntervalo = new JTableMe();      
		
		String sToolTipTipoIntervalo="";
		sToolTipTipoIntervalo=TipoIntervaloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIntervalo+="(Contabilidad.TipoIntervalo)";
		}
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIntervalo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoIntervalo.setToolTipText(sToolTipTipoIntervalo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoIntervalo);
		this.jTableDatosTipoIntervalo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoIntervalo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoIntervalo.setRowSelectionAllowed(true);
		this.jTableDatosTipoIntervalo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoIntervalo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoIntervalo = new JButtonMe();
		this.jButtonDuplicarTipoIntervalo = new JButtonMe();
		this.jButtonCopiarTipoIntervalo = new JButtonMe();
		this.jButtonVerFormTipoIntervalo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoIntervalo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoIntervalo = new JButtonMe();
		this.jButtonCerrarTipoIntervalo = new JButtonMe();
		
		this.jScrollPanelDatosTipoIntervalo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoIntervalo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Intervalo ";
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIntervalo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIntervalo.setToolTipText("Acciones");
        this.jPanelAccionesTipoIntervalo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoIntervalo=new ReporteDinamicoJInternalFrame(TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoIntervalo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoIntervalo=new ImportacionJInternalFrame(TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoIntervalo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoIntervalo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoIntervalo.setText("Orden");
		this.jButtonAbrirOrderByTipoIntervalo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIntervalo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIntervalo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIntervalo,false,this);
			
			//this.cargarOrderByTipoIntervalo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIntervalo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIntervalo,true,this);
			
			//this.cargarOrderByTipoIntervalo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoIntervalo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoIntervalo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoIntervalo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoIntervalo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIntervalo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIntervalo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoIntervalo.setText("Nuevo");
		this.jButtonDuplicarTipoIntervalo.setText("Duplicar");
		this.jButtonCopiarTipoIntervalo.setText("Copiar");
		this.jButtonVerFormTipoIntervalo.setText("Ver");
		this.jButtonNuevoRelacionesTipoIntervalo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.setText("Guardar");
		this.jButtonCerrarTipoIntervalo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIntervalo,"nuevo_button","Nuevo",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoIntervalo,"duplicar_button","Duplicar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoIntervalo,"copiar_button","Copiar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoIntervalo,"ver_form","Ver",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoIntervalo,"nuevorelaciones_button","Nuevo Rel",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIntervalo,"guardarcambiostabla_button","Guardar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIntervalo,"cerrar_button","Salir",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoIntervalo.setToolTipText("Nuevo"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoIntervalo.setToolTipText("Duplicar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoIntervalo.setToolTipText("Copiar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoIntervalo.setToolTipText("Ver"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoIntervalo.setToolTipText("Nuevo Rel"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.setToolTipText("Guardar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIntervalo.setToolTipText("Salir"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIntervalo";
		inputMap = this.jButtonNuevoTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIntervalo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIntervalo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoIntervalo";
		inputMap = this.jButtonDuplicarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoIntervalo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoIntervalo"));
		
		//COPIAR
		sMapKey = "CopiarTipoIntervalo";
		inputMap = this.jButtonCopiarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoIntervalo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoIntervalo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoIntervalo";
		inputMap = this.jButtonVerFormTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoIntervalo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoIntervalo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoIntervalo";
		inputMap = this.jButtonNuevoRelacionesTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoIntervalo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoIntervalo";
		inputMap = this.jButtonModificarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoIntervalo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoIntervalo";
		inputMap = this.jButtonCerrarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIntervalo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIntervalo";
		inputMap = this.jButtonGuardarCambiosTablaTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIntervalo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoIntervalo.setName("jPanelParametrosReportesTipoIntervalo"); 
		
		this.jPanelParametrosReportesAccionesTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoIntervalo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoIntervalo.setName("jPanelParametrosReportesAccionesTipoIntervalo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoIntervalo = new JButtonMe();
		this.jButtonRecargarInformacionTipoIntervalo.setText("Recargar");
		this.jButtonRecargarInformacionTipoIntervalo.setToolTipText("Recargar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoIntervalo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoIntervalo = new JButtonMe();
		this.jButtonProcesarInformacionTipoIntervalo.setText("Procesar");
		this.jButtonProcesarInformacionTipoIntervalo.setToolTipText("Procesar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoIntervalo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoIntervalo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIntervalo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIntervalo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIntervalo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoIntervalo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIntervalo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoIntervalo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIntervalo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoIntervalo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoIntervalo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoIntervalo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoIntervalo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoIntervalo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIntervalo.setText("Accion");
		this.jComboBoxTiposAccionesTipoIntervalo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoIntervalo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoIntervalo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoIntervalo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoIntervalo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIntervalo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIntervalo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoIntervalo = new JLabelMe();
		
		this.jLabelAccionesTipoIntervalo.setText("Acciones");		
		this.jLabelAccionesTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoIntervalo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoIntervalo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoIntervalo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoIntervalo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoIntervalo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoIntervalo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoIntervalo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoIntervalo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoIntervalo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoIntervalo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoIntervalo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoIntervalo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoIntervalo = new JButtonMe();
		//this.jButtonAnterioresTipoIntervalo.setText("<<");
        this.jButtonAnterioresTipoIntervalo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoIntervalo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoIntervalo = new JButtonMe();
		//this.jButtonSiguientesTipoIntervalo.setText(">>");
        this.jButtonSiguientesTipoIntervalo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoIntervalo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoIntervalo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoIntervalo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoIntervalo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoIntervalo,"nuevoguardarcambios_button","Nue",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoIntervalo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoIntervalo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoIntervalo";
		inputMap = this.jButtonRecargarInformacionTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoIntervalo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoIntervalo";
		inputMap = this.jButtonSiguientesTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoIntervalo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoIntervalo";
		inputMap = this.jButtonAnterioresTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoIntervalo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoIntervalo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoIntervalo.setMinimumSize(new Dimension(this.getWidth(),TipoIntervaloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIntervaloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIntervalo.setMaximumSize(new Dimension(this.getWidth(),TipoIntervaloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIntervaloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIntervalo.setPreferredSize(new Dimension(this.getWidth(),TipoIntervaloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIntervaloBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoIntervalo = new GridBagLayout();

			this.jPanelPaginacionTipoIntervalo.setLayout(gridaBagLayoutPaginacionTipoIntervalo);						
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 0;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonAnterioresTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					
						
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIntervalo.gridy = 0;
			
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonNuevoGuardarCambiosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
						
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIntervalo.gridy = 0;
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonSiguientesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 1;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonNuevoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIntervalo.gridy = 1;
				this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoIntervalo.add(this.jButtonNuevoRelacionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			}
			
			
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIntervalo.gridy = 1;
				this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoIntervalo.add(this.jButtonGuardarCambiosTablaTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			}
			
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 1;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonDuplicarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 1;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonCopiarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 1;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonVerFormTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 1;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoIntervalo.add(this.jButtonCerrarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
		
		
		this.jButtonRecargarInformacionTipoIntervalo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIntervalo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIntervalo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoIntervalo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIntervalo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIntervalo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoIntervalo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIntervalo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIntervalo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoIntervalo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIntervalo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIntervalo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoIntervalo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIntervalo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIntervalo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoIntervalo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIntervalo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIntervalo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoIntervalo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIntervalo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIntervalo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoIntervalo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIntervalo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIntervalo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoIntervalo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIntervalo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIntervalo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoIntervalo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIntervalo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIntervalo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoIntervalo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIntervalo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIntervalo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoIntervalo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIntervalo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIntervalo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoIntervalo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoIntervalo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoIntervalo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoIntervalo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoIntervalo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoIntervalo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoIntervalo.setLayout(gridaBagParametrosReportesTipoIntervalo);
			this.jPanelParametrosReportesAccionesTipoIntervalo.setLayout(gridaBagParametrosReportesAccionesTipoIntervalo);
			
			
			this.jPanelParametrosAuxiliar1TipoIntervalo.setLayout(gridaBagParametrosAuxiliar1TipoIntervalo);
			this.jPanelParametrosAuxiliar2TipoIntervalo.setLayout(gridaBagParametrosAuxiliar2TipoIntervalo);
			this.jPanelParametrosAuxiliar3TipoIntervalo.setLayout(gridaBagParametrosAuxiliar3TipoIntervalo);
			this.jPanelParametrosAuxiliar4TipoIntervalo.setLayout(gridaBagParametrosAuxiliar4TipoIntervalo);
			//this.jPanelParametrosAuxiliar5TipoIntervalo.setLayout(gridaBagParametrosAuxiliar2TipoIntervalo);			
			
			
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIntervalo.add(this.jButtonRecargarInformacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIntervalo.add(this.jComboBoxTiposPaginacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIntervalo.add(this.jCheckBoxConAltoMaximoTablaTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIntervalo.add(this.jComboBoxTiposArchivosReportesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIntervalo.add(this.jPanelParametrosAuxiliar1TipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoIntervalo.add(this.jComboBoxTiposReportesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIntervalo.add(this.jPanelParametrosAuxiliar4TipoIntervalo, this.gridBagConstraintsTipoIntervalo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIntervalo.add(this.jComboBoxTiposReportesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIntervalo.add(this.jCheckBoxGenerarReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIntervalo.add(this.jPanelParametrosAuxiliar2TipoIntervalo, this.gridBagConstraintsTipoIntervalo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIntervalo.add(this.jLabelAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoIntervalo.add(this.jButtonAbrirOrderByTipoIntervalo, this.gridBagConstraintsTipoIntervalo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIntervalo.add(this.jComboBoxTiposSeleccionarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
			
			
			/*
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIntervalo.add(this.jCheckBoxSeleccionarTodosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIntervalo.add(this.jCheckBoxSeleccionarTodosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);															
				
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIntervalo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIntervalo.add(this.jCheckBoxSeleccionadosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIntervalo.add(this.jPanelParametrosAuxiliar3TipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIntervalo.add(this.jComboBoxTiposRelacionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
				
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIntervalo.add(this.jComboBoxTiposAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoIntervalo = new GridBagLayout();

			this.jScrollPanelDatosTipoIntervalo.setLayout(gridaBagLayoutDatosTipoIntervalo);
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = 0;
			this.gridBagConstraintsTipoIntervalo.gridx = 0;
			
			this.jScrollPanelDatosTipoIntervalo.add(this.jTableDatosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoIntervalo.setViewportView(this.jTableDatosTipoIntervalo);
		this.jTableDatosTipoIntervalo.setFillsViewportHeight(true);
		this.jTableDatosTipoIntervalo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIntervalo= new GridBagLayout();
		this.jPanelAccionesTipoIntervalo.setLayout(gridaBagLayoutAccionesTipoIntervalo);
		
		
		/*	
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = 0;
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
			
		this.jPanelAccionesTipoIntervalo.add(this.jButtonNuevoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIntervalo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIntervalo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();						
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIntervalo.gridx = 0;		
			//this.gridBagConstraintsTipoIntervalo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIntervalo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoIntervalo.gridx = 0;		
		//this.gridBagConstraintsTipoIntervalo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoIntervalo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoIntervalo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);								
		
		
		/*
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		*/		
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIntervalo.gridx =0;
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIntervalo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
				
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoIntervalo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIntervalo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoIntervalo.setLayout(gridaBagLayoutBusquedasParametrosTipoIntervalo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoIntervalo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIntervalo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIntervalo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIntervalo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoIntervalo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoIntervalo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoIntervalo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoIntervalo.setName("jPanelReporteDinamicoTipoIntervalo"); 
		
		this.jPanelReporteDinamicoTipoIntervalo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIntervalo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIntervalo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoIntervalo.setLayout(gridaBagLayoutReporteDinamicoTipoIntervalo);
		
		
		this.jInternalFrameReporteDinamicoTipoIntervalo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoIntervalo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIntervalo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoIntervalo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoIntervalo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoIntervalo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoIntervalo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoIntervalo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoIntervalo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoIntervalo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoIntervalo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoIntervalo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIntervalo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIntervalo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoIntervalo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoIntervalo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jLabelColumnasSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoIntervalo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoIntervalo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoIntervalo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoIntervalo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIntervalo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIntervalo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoIntervalo=new JScrollPane(this.jListColumnasSelectReporteTipoIntervalo);
			
			this.jScrollColumnasSelectReporteTipoIntervalo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIntervalo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIntervalo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIntervalo.add(this.jListColumnasSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jScrollColumnasSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoIntervalo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoIntervalo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jLabelRelacionesSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoIntervalo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoIntervalo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoIntervalo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoIntervalo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIntervalo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIntervalo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoIntervalo=new JScrollPane(this.jListRelacionesSelectReporteTipoIntervalo);
			
			this.jScrollRelacionesSelectReporteTipoIntervalo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIntervalo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIntervalo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIntervalo.add(this.jListRelacionesSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jScrollRelacionesSelectReporteTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoIntervalo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoIntervalo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoIntervalo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoIntervalo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoIntervalo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoIntervalo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIntervalo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIntervalo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoIntervalo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoIntervalo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jLabelGenerarExcelReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoIntervalo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoIntervalo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoIntervalo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoIntervalo.setToolTipText("Generar EXCEL"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		//this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoIntervalo.add(this.jButtonGenerarExcelReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jComboBoxTiposReportesDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoIntervalo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoIntervalo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jLabelTiposArchivoReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoIntervalo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoIntervalo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoIntervalo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoIntervalo.setToolTipText("Generar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jButtonGenerarReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoIntervalo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoIntervalo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoIntervalo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoIntervalo.setToolTipText("Cancelar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIntervalo.add(this.jButtonCerrarReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoIntervalo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoIntervalo= new JScrollPane(jPanelReporteDinamicoTipoIntervalo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoIntervalo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIntervalo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIntervalo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoIntervalo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoIntervalo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoIntervalo);
		this.jInternalFrameReporteDinamicoTipoIntervalo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoIntervalo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoIntervalo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoIntervalo.setName("jPanelImportacionTipoIntervalo"); 
		
		this.jPanelImportacionTipoIntervalo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIntervalo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIntervalo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoIntervalo.setLayout(gridaBagLayoutImportacionTipoIntervalo);
		
		
		this.jInternalFrameImportacionTipoIntervalo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoIntervalo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoIntervalo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIntervalo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoIntervalo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIntervalo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIntervalo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoIntervalo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIntervalo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIntervalo.setResizable(true);
	    this.jInternalFrameImportacionTipoIntervalo.setClosable(true);
	    this.jInternalFrameImportacionTipoIntervalo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoIntervalo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIntervalo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIntervalo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoIntervalo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIntervalo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIntervalo.setResizable(true);
	    this.jInternalFrameImportacionTipoIntervalo.setClosable(true);
	    this.jInternalFrameImportacionTipoIntervalo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoIntervalo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIntervalo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIntervalo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoIntervalo = new JLabelMe();

		this.jLabelArchivoImportacionTipoIntervalo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIntervalo.add(this.jLabelArchivoImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoIntervalo = new JFileChooser();		
		this.jFileChooserImportacionTipoIntervalo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoIntervalo = new JButtonMe();
		this.jButtonAbrirImportacionTipoIntervalo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoIntervalo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoIntervalo.setToolTipText("Generar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIntervalo.add(this.jButtonAbrirImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoIntervalo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoIntervalo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIntervalo.add(this.jLabelPathArchivoImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoIntervalo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoIntervalo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIntervalo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIntervalo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIntervalo.add(this.jTextFieldPathArchivoImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoIntervalo = new JButtonMe();
		this.jButtonGenerarImportacionTipoIntervalo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoIntervalo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoIntervalo.setToolTipText("Generar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIntervalo.add(this.jButtonGenerarImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoIntervalo = new JButtonMe();
		this.jButtonCerrarImportacionTipoIntervalo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoIntervalo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoIntervalo.setToolTipText("Cancelar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIntervalo.add(this.jButtonCerrarImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoIntervalo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoIntervalo= new JScrollPane(jPanelImportacionTipoIntervalo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoIntervalo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoIntervalo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoIntervalo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoIntervalo);
		this.jInternalFrameImportacionTipoIntervalo.getContentPane().add(this.jScrollPanelImportacionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoIntervalo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoIntervalo = new JButtonMe();
			this.jButtonAbrirOrderByTipoIntervalo.setText("Orden");
			this.jButtonAbrirOrderByTipoIntervalo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIntervalo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoIntervalo";
			inputMap = this.jButtonAbrirOrderByTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoIntervalo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoIntervalo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoIntervalo.setName("jPanelOrderByTipoIntervalo"); 
			
			this.jPanelOrderByTipoIntervalo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIntervalo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIntervalo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoIntervalo.setLayout(gridaBagLayoutOrderByTipoIntervalo);
			
			
			this.jTableDatosTipoIntervaloOrderBy = new JTableMe();        
			this.jTableDatosTipoIntervaloOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoIntervaloOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoIntervaloOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoIntervaloOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoIntervaloOrderBy.setViewportView(this.jTableDatosTipoIntervaloOrderBy);
			this.jTableDatosTipoIntervaloOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoIntervaloOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoIntervalo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoIntervalo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoIntervalo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoIntervalo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoIntervalo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoIntervalo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoIntervalo.setTitle("Orden");
			this.jInternalFrameOrderByTipoIntervalo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoIntervalo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoIntervalo.setResizable(true);
			this.jInternalFrameOrderByTipoIntervalo.setClosable(true);
			this.jInternalFrameOrderByTipoIntervalo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoIntervalo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIntervalo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIntervalo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoIntervalo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoIntervalo.ipady =150;
				
			this.jPanelOrderByTipoIntervalo.add(jScrollPanelDatosTipoIntervaloOrderBy, this.gridBagConstraintsTipoIntervalo);//this.jTableDatosTipoIntervaloTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoIntervalo = new JButtonMe();
			this.jButtonCerrarOrderByTipoIntervalo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoIntervalo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoIntervalo.setToolTipText("Cancelar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoIntervalo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoIntervalo.add(this.jButtonCerrarOrderByTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoIntervalo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoIntervalo= new JScrollPane(jPanelOrderByTipoIntervalo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoIntervalo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoIntervalo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoIntervalo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoIntervalo);
			
			this.jInternalFrameOrderByTipoIntervalo.getContentPane().add(this.jScrollPanelOrderByTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
		
		} else {
			this.jButtonAbrirOrderByTipoIntervalo = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipointervaloSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoIntervalo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoIntervalo.getRowHeight();//TipoIntervaloConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIntervalo.isSelected()) {
					iHeightTable=TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIntervalo.isSelected()) {
					iHeightTable=TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIntervaloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoIntervalo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIntervalo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIntervalo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoIntervalo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIntervalo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIntervalo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoIntervalo!=null && this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoIntervalo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoIntervalo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoIntervalo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoIntervalo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIntervalo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIntervalo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipointervaloLogic.getTipoIntervalos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointervalos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoIntervalo> TraerTipoIntervaloBeans(List<TipoIntervalo> tipointervalos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoIntervalo tipointervalo:tipointervalos) {
					
				if(!(TipoIntervaloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoIntervaloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipointervalo.setsDetalleGeneralEntityReporte(TipoIntervaloConstantesFunciones.getTipoIntervaloDescripcion(tipointervalo));
										
						
					
					

					if(tipointervalo.getParametroContabilidadDefectos()!=null && Funciones.existeClass(classes,ParametroContabilidadDefecto.class)) {
						try{tipointervalo.setparametrocontabilidaddefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroContabilidadDefectoJInternalFrame.TraerParametroContabilidadDefectoBeans(tipointervalo.getParametroContabilidadDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipointervalo.getTablaAmortiDetalles()!=null && Funciones.existeClass(classes,TablaAmortiDetalle.class)) {
						try{tipointervalo.settablaamortidetallesDescripcionReporte(new JRBeanCollectionDataSource(TablaAmortiDetalleJInternalFrame.TraerTablaAmortiDetalleBeans(tipointervalo.getTablaAmortiDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipointervalo.setsDetalleGeneralEntityReporte(tipointervalo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipointervalobeans.add(tipointervalobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipointervalos;
    }
	//PARA REPORTES FIN
}
