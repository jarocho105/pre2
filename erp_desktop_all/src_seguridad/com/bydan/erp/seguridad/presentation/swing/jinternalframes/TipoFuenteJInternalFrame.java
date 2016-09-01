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
import com.bydan.erp.seguridad.util.TipoFuenteConstantesFunciones;

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
public class TipoFuenteJInternalFrame extends TipoFuenteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFuente;
	
	protected JMenuBar jmenuBarTipoFuente;
	
	protected JMenu jmenuTipoFuente;
	protected JMenu jmenuDatosTipoFuente;
	protected JMenu jmenuArchivoTipoFuente;
	protected JMenu jmenuAccionesTipoFuente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFuente;	
	protected GridBagConstraints gridBagConstraintsTipoFuente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFuenteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFuente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFuente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFuente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFuenteSessionBean tipofuenteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFuente> tipofuentes;		
	public List<TipoFuente> tipofuentesEliminados;	
	public List<TipoFuente> tipofuentesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFuente;		
	protected JButton jButtonAbrirOrderByTipoFuente;
	
	
	//protected JPanel jPanelOrderByTipoFuente;
	//public JScrollPane jScrollPanelOrderByTipoFuente;	
	//protected JButton jButtonCerrarOrderByTipoFuente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFuenteLogic tipofuenteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFuente;
	public JScrollPane jScrollPanelDatosEdicionTipoFuente;
	public JScrollPane jScrollPanelDatosGeneralTipoFuente;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFuenteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFuente;
	//public JScrollPane jScrollPanelImportacionTipoFuente;
	
	
	
	protected JPanel jPanelAccionesTipoFuente;
	
    protected JPanel jPanelPaginacionTipoFuente;
    protected JPanel jPanelParametrosReportesTipoFuente;
	protected JPanel jPanelParametrosReportesAccionesTipoFuente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFuente;
	protected JPanel jPanelParametrosAuxiliar2TipoFuente;
	protected JPanel jPanelParametrosAuxiliar3TipoFuente;
	protected JPanel jPanelParametrosAuxiliar4TipoFuente;
	//protected JPanel jPanelParametrosAuxiliar5TipoFuente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFuente;
	//protected JPanel jPanelImportacionTipoFuente;
	
	
	public JTable jTableDatosTipoFuente;
	
	
	
	//public JTable jTableDatosTipoFuenteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFuente;
	protected JButton jButtonDuplicarTipoFuente;
	protected JButton jButtonCopiarTipoFuente;
	protected JButton jButtonVerFormTipoFuente;
	protected JButton jButtonNuevoRelacionesTipoFuente;
	protected JButton jButtonModificarTipoFuente;
	
    protected JButton jButtonGuardarCambiosTablaTipoFuente;
	protected JButton jButtonCerrarTipoFuente;
	
	
	protected JButton jButtonRecargarInformacionTipoFuente;
	protected JButton jButtonProcesarInformacionTipoFuente;
	
	
	protected JButton jButtonAnterioresTipoFuente;
	protected JButton jButtonSiguientesTipoFuente;
	protected JButton jButtonNuevoGuardarCambiosTipoFuente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFuente;
	//protected JButton jButtonCerrarReporteDinamicoTipoFuente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFuente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFuente;
	//protected JButton jButtonGenerarImportacionTipoFuente;
	//protected JButton jButtonCerrarImportacionTipoFuente;
	//protected JFileChooser jFileChooserImportacionTipoFuente;
	//protected File fileImportacionTipoFuente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFuente;
	protected JButton jButtonDuplicarToolBarTipoFuente;
	protected JButton jButtonNuevoRelacionesToolBarTipoFuente;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFuente;
	protected JButton jButtonCopiarToolBarTipoFuente;
	protected JButton jButtonVerFormToolBarTipoFuente;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFuente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFuente;
	protected JButton jButtonCerrarToolBarTipoFuente;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFuente;
	protected JButton jButtonProcesarInformacionToolBarTipoFuente;
	protected JButton jButtonAnterioresToolBarTipoFuente;
	protected JButton jButtonSiguientesToolBarTipoFuente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFuente;
	protected JButton jButtonAbrirOrderByToolBarTipoFuente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFuente;
	protected JMenuItem jMenuItemDuplicarTipoFuente;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFuente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFuente;
	protected JMenuItem jMenuItemCopiarTipoFuente;
	protected JMenuItem jMenuItemVerFormTipoFuente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFuente;
	protected JMenuItem jMenuItemCerrarTipoFuente;
	protected JMenuItem jMenuItemDetalleCerrarTipoFuente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFuente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFuente;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFuente;
	protected JMenuItem jMenuItemProcesarInformacionTipoFuente;
	protected JMenuItem jMenuItemAnterioresTipoFuente;
	protected JMenuItem jMenuItemSiguientesTipoFuente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFuente;
	protected JMenuItem jMenuItemAbrirOrderByTipoFuente;
	protected JMenuItem jMenuItemMostrarOcultarTipoFuente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFuente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFuente;
	protected JCheckBox jCheckBoxSeleccionadosTipoFuente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFuente;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFuente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFuente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFuente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFuente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFuente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFuente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFuente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFuente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFuente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFuente;
	protected JTextField jTextFieldValorCampoGeneralTipoFuente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFuente;
	//public JList<Reporte> jListColumnasSelectReporteTipoFuente;
	//public JScrollPane jScrollColumnasSelectReporteTipoFuente;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFuente;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFuente;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFuente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFuente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFuente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFuente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFuente;
	
		
	//public JLabel jLabelArchivoImportacionTipoFuente;	
	//public JLabel jLabelPathArchivoImportacionTipoFuente;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFuente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFuente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFuente;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFuente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFuente;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFuente;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFuente;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFuente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFuente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFuente;	
	
	
	
	
	
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
	public TipoFuenteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFuente)	{
		this.jButtonRecargarInformacionTipoFuente = jButtonRecargarInformacionTipoFuente;
	}
	
	public JButton getjButtonProcesarInformacionTipoFuente() {
		return this.jButtonProcesarInformacionTipoFuente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFuente)	{
		this.jButtonProcesarInformacionTipoFuente = jButtonProcesarInformacionTipoFuente;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFuente() {
		return this.jButtonRecargarInformacionTipoFuente;
	}
	
	
	public List<TipoFuente> gettipofuentes() {
		return this.tipofuentes;
	}

	public void settipofuentes(List<TipoFuente> tipofuentes) {
		this.tipofuentes = tipofuentes;
	}
	
	public List<TipoFuente> gettipofuentesAux() {
		return this.tipofuentesAux;
	}

	public void settipofuentesAux(List<TipoFuente> tipofuentesAux) {
		this.tipofuentesAux = tipofuentesAux;
	}
	
	public List<TipoFuente> gettipofuentesEliminados() {
		return this.tipofuentesEliminados;
	}

	public void setTipoFuentesEliminados(List<TipoFuente> tipofuentesEliminados) {
		this.tipofuentesEliminados = tipofuentesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFuente() {
		return jComboBoxTiposSeleccionarTipoFuente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFuente(
			JComboBox jComboBoxTiposSeleccionarTipoFuente) {
		this.jComboBoxTiposSeleccionarTipoFuente = jComboBoxTiposSeleccionarTipoFuente;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFuente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFuente() {
		return jTextFieldValorCampoGeneralTipoFuente;
	}

	public void setjTextFieldValorCampoGeneralTipoFuente(
			JTextField jTextFieldValorCampoGeneralTipoFuente) {
		this.jTextFieldValorCampoGeneralTipoFuente = jTextFieldValorCampoGeneralTipoFuente;
	}

	public void setBorderResaltarValorCampoGeneralTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFuente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFuente() {
		return this.jCheckBoxSeleccionarTodosTipoFuente;
	}

	public void setjCheckBoxSeleccionarTodosTipoFuente(
			JCheckBox jCheckBoxSeleccionarTodosTipoFuente) {
		this.jCheckBoxSeleccionarTodosTipoFuente = jCheckBoxSeleccionarTodosTipoFuente;
	}

	public void setBorderResaltarSeleccionarTodosTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFuente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFuente() {
		return this.jCheckBoxSeleccionadosTipoFuente;
	}

	public void setjCheckBoxSeleccionadosTipoFuente(
			JCheckBox jCheckBoxSeleccionadosTipoFuente) {
		this.jCheckBoxSeleccionadosTipoFuente = jCheckBoxSeleccionadosTipoFuente;
	}
	
	public void setBorderResaltarSeleccionadosTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFuente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFuente() {
		return this.jComboBoxTiposArchivosReportesTipoFuente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFuente(
			JComboBox jComboBoxTiposArchivosReportesTipoFuente) {
		this.jComboBoxTiposArchivosReportesTipoFuente = jComboBoxTiposArchivosReportesTipoFuente;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFuente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFuente() {
		return this.jComboBoxTiposReportesTipoFuente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFuente(
			JComboBox jComboBoxTiposReportesTipoFuente) {
		this.jComboBoxTiposReportesTipoFuente = jComboBoxTiposReportesTipoFuente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFuente() {
	//	return jComboBoxTiposReportesDinamicoTipoFuente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFuente(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFuente) {
	//	this.jComboBoxTiposReportesDinamicoTipoFuente = jComboBoxTiposReportesDinamicoTipoFuente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFuente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFuente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFuente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFuente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFuente = jComboBoxTiposArchivosReportesDinamicoTipoFuente;
	//}
	
	public void setBorderResaltarTiposReportesTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFuente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFuente() {
		return this.jComboBoxTiposGraficosReportesTipoFuente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFuente(
			JComboBox jComboBoxTiposGraficosReportesTipoFuente) {
		this.jComboBoxTiposGraficosReportesTipoFuente = jComboBoxTiposGraficosReportesTipoFuente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFuente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFuente() {
		return this.jComboBoxTiposPaginacionTipoFuente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFuente(
			JComboBox jComboBoxTiposPaginacionTipoFuente) {
		this.jComboBoxTiposPaginacionTipoFuente = jComboBoxTiposPaginacionTipoFuente;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFuente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFuente() {
		return this.jComboBoxTiposRelacionesTipoFuente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFuente() {
		return this.jComboBoxTiposAccionesTipoFuente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFuente(
			JComboBox jComboBoxTiposRelacionesTipoFuente) {
		this.jComboBoxTiposRelacionesTipoFuente = jComboBoxTiposRelacionesTipoFuente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFuente(
			JComboBox jComboBoxTiposAccionesTipoFuente) {
		this.jComboBoxTiposAccionesTipoFuente = jComboBoxTiposAccionesTipoFuente;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFuente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFuente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFuente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFuente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFuente() {
	//	return jCheckBoxConGraficoDinamicoTipoFuente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFuente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFuente) {
	//	this.jCheckBoxConGraficoDinamicoTipoFuente = jCheckBoxConGraficoDinamicoTipoFuente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFuente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFuente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFuente .setBorder(borderResaltar);		
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
		this.tipofuenteSessionBean=new TipoFuenteSessionBean();
		
		this.tipofuenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofuenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofuenteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFuenteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fuente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFuenteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFuente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"nuevo","nuevo","Nuevo"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"duplicar","duplicar","Duplicar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"copiar","copiar","Copiar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"ver_form","ver_form","Ver"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"recargar","recargar","Recargar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFuente,this.jTtoolBarTipoFuente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFuente,this.jTtoolBarTipoFuente,
							"cerrar","cerrar","Salir"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFuente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFuente;
			
				this.jButtonProcesarInformacionToolBarTipoFuente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFuente;
				
		//protected JButton jButtonModificarToolBarTipoFuente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFuente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFuente=new JMenuMe("General");
		this.jmenuArchivoTipoFuente=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFuente=new JMenuMe("Acciones");
		this.jmenuDatosTipoFuente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFuente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFuente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFuente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFuente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFuente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFuente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFuente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFuente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFuente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFuente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFuente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFuente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFuente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFuente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFuente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFuente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFuente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFuente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFuente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFuente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFuente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFuente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFuente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFuente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFuente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFuente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFuente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFuente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFuente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFuente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFuente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFuente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFuente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFuente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFuente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFuente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFuente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFuente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFuente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFuente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFuente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFuente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFuente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFuente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFuente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFuente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFuente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFuente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFuente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFuente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFuente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFuente.add(this.jMenuItemCerrarTipoFuente);
			
			this.jmenuAccionesTipoFuente.add(this.jMenuItemNuevoTipoFuente);
			this.jmenuAccionesTipoFuente.add(this.jMenuItemNuevoGuardarCambiosTipoFuente);
			this.jmenuAccionesTipoFuente.add(this.jMenuItemNuevoRelacionesTipoFuente);
			this.jmenuAccionesTipoFuente.add(this.jMenuItemGuardarCambiosTablaTipoFuente);		
			this.jmenuAccionesTipoFuente.add(this.jMenuItemDuplicarTipoFuente);		
			this.jmenuAccionesTipoFuente.add(this.jMenuItemCopiarTipoFuente);		
			this.jmenuAccionesTipoFuente.add(this.jMenuItemVerFormTipoFuente);		
			
			this.jmenuDatosTipoFuente.add(this.jMenuItemRecargarInformacionTipoFuente);				
			this.jmenuDatosTipoFuente.add(this.jMenuItemAnterioresTipoFuente);				
			this.jmenuDatosTipoFuente.add(this.jMenuItemSiguientesTipoFuente);				
			this.jmenuDatosTipoFuente.add(this.jMenuItemAbrirOrderByTipoFuente);				
			this.jmenuDatosTipoFuente.add(this.jMenuItemMostrarOcultarTipoFuente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFuente.add(this.jMenuItemGuardarCambiosTipoFuente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFuente.add(this.jmenuArchivoTipoFuente);		
			this.jmenuBarTipoFuente.add(this.jmenuAccionesTipoFuente);		
			this.jmenuBarTipoFuente.add(this.jmenuDatosTipoFuente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFuente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFuente() {
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
			//this.jInternalFrameDetalleTipoFuente = new TipoFuenteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Fuente DATOS");
			this.jInternalFrameDetalleFormTipoFuente = new TipoFuenteDetalleFormJInternalFrame(jDesktopPane,this.tipofuenteSessionBean.getConGuardarRelaciones(),this.tipofuenteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFuente = null;//new TipoFuenteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFuente= new GridBagLayout();
		
		
		this.jTableDatosTipoFuente = new JTableMe();      
		
		String sToolTipTipoFuente="";
		sToolTipTipoFuente=TipoFuenteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFuente+="(Seguridad.TipoFuente)";
		}
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFuente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFuente.setToolTipText(sToolTipTipoFuente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFuente);
		this.jTableDatosTipoFuente.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFuente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFuente.setRowSelectionAllowed(true);
		this.jTableDatosTipoFuente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFuente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFuente = new JButtonMe();
		this.jButtonDuplicarTipoFuente = new JButtonMe();
		this.jButtonCopiarTipoFuente = new JButtonMe();
		this.jButtonVerFormTipoFuente = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFuente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFuente = new JButtonMe();
		this.jButtonCerrarTipoFuente = new JButtonMe();
		
		this.jScrollPanelDatosTipoFuente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFuente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fuente";
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFuente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFuente.setToolTipText("Acciones");
        this.jPanelAccionesTipoFuente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFuente=new ReporteDinamicoJInternalFrame(TipoFuenteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFuente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFuente=new ImportacionJInternalFrame(TipoFuenteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFuente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFuente = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFuente.setText("Orden");
		this.jButtonAbrirOrderByTipoFuente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFuente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFuente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFuente,false,this);
			
			//this.cargarOrderByTipoFuente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFuente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFuente,true,this);
			
			//this.cargarOrderByTipoFuente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFuente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFuente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFuente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFuente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFuente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFuente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFuente.setText("Nuevo");
		this.jButtonDuplicarTipoFuente.setText("Duplicar");
		this.jButtonCopiarTipoFuente.setText("Copiar");
		this.jButtonVerFormTipoFuente.setText("Ver");
		this.jButtonNuevoRelacionesTipoFuente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFuente.setText("Guardar");
		this.jButtonCerrarTipoFuente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFuente,"nuevo_button","Nuevo",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFuente,"duplicar_button","Duplicar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFuente,"copiar_button","Copiar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFuente,"ver_form","Ver",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFuente,"nuevorelaciones_button","Nuevo Rel",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFuente,"guardarcambiostabla_button","Guardar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFuente,"cerrar_button","Salir",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFuente.setToolTipText("Nuevo"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFuente.setToolTipText("Duplicar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFuente.setToolTipText("Copiar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFuente.setToolTipText("Ver"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFuente.setToolTipText("Nuevo Rel"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFuente.setToolTipText("Guardar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFuente.setToolTipText("Salir"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFuente";
		inputMap = this.jButtonNuevoTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFuente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFuente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFuente";
		inputMap = this.jButtonDuplicarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFuente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFuente"));
		
		//COPIAR
		sMapKey = "CopiarTipoFuente";
		inputMap = this.jButtonCopiarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFuente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFuente"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFuente";
		inputMap = this.jButtonVerFormTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFuente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFuente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFuente";
		inputMap = this.jButtonNuevoRelacionesTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFuente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFuente";
		inputMap = this.jButtonModificarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFuente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFuente";
		inputMap = this.jButtonCerrarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFuente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFuente";
		inputMap = this.jButtonGuardarCambiosTablaTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFuente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFuente.setName("jPanelParametrosReportesTipoFuente"); 
		
		this.jPanelParametrosReportesAccionesTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFuente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFuente.setName("jPanelParametrosReportesAccionesTipoFuente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFuente = new JButtonMe();
		this.jButtonRecargarInformacionTipoFuente.setText("Recargar");
		this.jButtonRecargarInformacionTipoFuente.setToolTipText("Recargar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFuente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFuente = new JButtonMe();
		this.jButtonProcesarInformacionTipoFuente.setText("Procesar");
		this.jButtonProcesarInformacionTipoFuente.setToolTipText("Procesar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFuente.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFuente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFuente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFuente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFuente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFuente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFuente.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFuente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFuente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFuente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFuente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFuente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFuente.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFuente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFuente.setText("Accion");
		this.jComboBoxTiposAccionesTipoFuente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFuente.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFuente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFuente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFuente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFuente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFuente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFuente = new JLabelMe();
		
		this.jLabelAccionesTipoFuente.setText("Acciones");		
		this.jLabelAccionesTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFuente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFuente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFuente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFuente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFuente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFuente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFuente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFuente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFuente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFuente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFuente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFuente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFuente = new JButtonMe();
		//this.jButtonAnterioresTipoFuente.setText("<<");
        this.jButtonAnterioresTipoFuente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFuente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFuente = new JButtonMe();
		//this.jButtonSiguientesTipoFuente.setText(">>");
        this.jButtonSiguientesTipoFuente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFuente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFuente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFuente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFuente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFuente,"nuevoguardarcambios_button","Nue",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFuente";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFuente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFuente";
		inputMap = this.jButtonRecargarInformacionTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFuente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFuente";
		inputMap = this.jButtonSiguientesTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFuente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFuente";
		inputMap = this.jButtonAnterioresTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFuente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFuente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFuente.setMinimumSize(new Dimension(this.getWidth(),TipoFuenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFuenteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFuente.setMaximumSize(new Dimension(this.getWidth(),TipoFuenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFuenteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFuente.setPreferredSize(new Dimension(this.getWidth(),TipoFuenteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFuenteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFuente = new GridBagLayout();

			this.jPanelPaginacionTipoFuente.setLayout(gridaBagLayoutPaginacionTipoFuente);						
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 0;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFuente.add(this.jButtonAnterioresTipoFuente, this.gridBagConstraintsTipoFuente);
					
						
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFuente.gridy = 0;
			
			this.jPanelPaginacionTipoFuente.add(this.jButtonNuevoGuardarCambiosTipoFuente, this.gridBagConstraintsTipoFuente);
						
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFuente.gridy = 0;
			this.jPanelPaginacionTipoFuente.add(this.jButtonSiguientesTipoFuente, this.gridBagConstraintsTipoFuente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 1;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFuente.add(this.jButtonNuevoTipoFuente, this.gridBagConstraintsTipoFuente);
						
			
			
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFuente = new GridBagConstraints();
				this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFuente.gridy = 1;
				this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFuente.add(this.jButtonGuardarCambiosTablaTipoFuente, this.gridBagConstraintsTipoFuente);
			}
			
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 1;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFuente.add(this.jButtonDuplicarTipoFuente, this.gridBagConstraintsTipoFuente);
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 1;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFuente.add(this.jButtonCopiarTipoFuente, this.gridBagConstraintsTipoFuente);
		
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 1;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFuente.add(this.jButtonVerFormTipoFuente, this.gridBagConstraintsTipoFuente);
		
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 1;
			this.gridBagConstraintsTipoFuente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFuente.add(this.jButtonCerrarTipoFuente, this.gridBagConstraintsTipoFuente);
		
		
		
		this.jButtonRecargarInformacionTipoFuente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFuente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFuente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFuente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFuente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFuente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFuente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFuente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFuente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFuente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFuente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFuente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFuente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFuente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFuente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFuente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFuente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFuente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFuente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFuente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFuente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFuente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFuente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFuente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFuente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFuente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFuente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFuente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFuente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFuente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFuente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFuente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFuente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFuente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFuente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFuente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFuente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFuente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFuente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFuente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFuente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFuente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFuente.setLayout(gridaBagParametrosReportesTipoFuente);
			this.jPanelParametrosReportesAccionesTipoFuente.setLayout(gridaBagParametrosReportesAccionesTipoFuente);
			
			
			this.jPanelParametrosAuxiliar1TipoFuente.setLayout(gridaBagParametrosAuxiliar1TipoFuente);
			this.jPanelParametrosAuxiliar2TipoFuente.setLayout(gridaBagParametrosAuxiliar2TipoFuente);
			this.jPanelParametrosAuxiliar3TipoFuente.setLayout(gridaBagParametrosAuxiliar3TipoFuente);
			this.jPanelParametrosAuxiliar4TipoFuente.setLayout(gridaBagParametrosAuxiliar4TipoFuente);
			//this.jPanelParametrosAuxiliar5TipoFuente.setLayout(gridaBagParametrosAuxiliar2TipoFuente);			
			
			
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFuente.add(this.jButtonRecargarInformacionTipoFuente, this.gridBagConstraintsTipoFuente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFuente.add(this.jComboBoxTiposPaginacionTipoFuente, this.gridBagConstraintsTipoFuente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFuente.add(this.jCheckBoxConAltoMaximoTablaTipoFuente, this.gridBagConstraintsTipoFuente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFuente.add(this.jComboBoxTiposArchivosReportesTipoFuente, this.gridBagConstraintsTipoFuente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFuente.add(this.jPanelParametrosAuxiliar1TipoFuente, this.gridBagConstraintsTipoFuente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFuente.add(this.jComboBoxTiposReportesTipoFuente, this.gridBagConstraintsTipoFuente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFuente.add(this.jPanelParametrosAuxiliar4TipoFuente, this.gridBagConstraintsTipoFuente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFuente.add(this.jComboBoxTiposReportesTipoFuente, this.gridBagConstraintsTipoFuente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFuente.add(this.jCheckBoxGenerarReporteTipoFuente, this.gridBagConstraintsTipoFuente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFuente.add(this.jPanelParametrosAuxiliar2TipoFuente, this.gridBagConstraintsTipoFuente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFuente.add(this.jLabelAccionesTipoFuente, this.gridBagConstraintsTipoFuente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFuente = new GridBagConstraints();
				this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFuente.add(this.jButtonAbrirOrderByTipoFuente, this.gridBagConstraintsTipoFuente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFuente.add(this.jComboBoxTiposSeleccionarTipoFuente, this.gridBagConstraintsTipoFuente);			
			
			
			/*
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFuente.add(this.jCheckBoxSeleccionarTodosTipoFuente, this.gridBagConstraintsTipoFuente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFuente.add(this.jCheckBoxSeleccionarTodosTipoFuente, this.gridBagConstraintsTipoFuente);															
				
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFuente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFuente.add(this.jCheckBoxSeleccionadosTipoFuente, this.gridBagConstraintsTipoFuente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFuente.add(this.jPanelParametrosAuxiliar3TipoFuente, this.gridBagConstraintsTipoFuente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFuente.add(this.jComboBoxTiposRelacionesTipoFuente, this.gridBagConstraintsTipoFuente);
				
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFuente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFuente.add(this.jComboBoxTiposAccionesTipoFuente, this.gridBagConstraintsTipoFuente);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFuente = new GridBagLayout();

			this.jScrollPanelDatosTipoFuente.setLayout(gridaBagLayoutDatosTipoFuente);
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = 0;
			this.gridBagConstraintsTipoFuente.gridx = 0;
			
			this.jScrollPanelDatosTipoFuente.add(this.jTableDatosTipoFuente, this.gridBagConstraintsTipoFuente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFuente.setViewportView(this.jTableDatosTipoFuente);
		this.jTableDatosTipoFuente.setFillsViewportHeight(true);
		this.jTableDatosTipoFuente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFuente= new GridBagLayout();
		this.jPanelAccionesTipoFuente.setLayout(gridaBagLayoutAccionesTipoFuente);
		
		
		/*	
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = 0;
		this.gridBagConstraintsTipoFuente.gridx = 0;
			
		this.jPanelAccionesTipoFuente.add(this.jButtonNuevoTipoFuente, this.gridBagConstraintsTipoFuente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFuente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFuente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();						
			this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFuente.gridx = 0;		
			//this.gridBagConstraintsTipoFuente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFuente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFuente, this.gridBagConstraintsTipoFuente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFuente.gridx = 0;		
		//this.gridBagConstraintsTipoFuente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFuente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFuente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFuente, this.gridBagConstraintsTipoFuente);								
		
		
		/*
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFuente, this.gridBagConstraintsTipoFuente);
		*/		
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFuente.gridx =0;
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFuente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFuente, this.gridBagConstraintsTipoFuente);
				
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFuente, this.gridBagConstraintsTipoFuente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFuente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFuente = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFuente.setLayout(gridaBagLayoutBusquedasParametrosTipoFuente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFuente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFuente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFuente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFuente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFuente, this.gridBagConstraintsTipoFuente);
			
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFuente, this.gridBagConstraintsTipoFuente);
		
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFuente, this.gridBagConstraintsTipoFuente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFuente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFuente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFuente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFuente.setName("jPanelReporteDinamicoTipoFuente"); 
		
		this.jPanelReporteDinamicoTipoFuente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFuente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFuente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFuente.setLayout(gridaBagLayoutReporteDinamicoTipoFuente);
		
		
		this.jInternalFrameReporteDinamicoTipoFuente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFuente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFuente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFuente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFuente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFuente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFuente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFuente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFuente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFuente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFuente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFuente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFuente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFuente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFuente = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFuente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFuente.add(this.jLabelColumnasSelectReporteTipoFuente, this.gridBagConstraintsTipoFuente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFuente = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFuente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFuente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFuente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFuente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFuente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFuente=new JScrollPane(this.jListColumnasSelectReporteTipoFuente);
			
			this.jScrollColumnasSelectReporteTipoFuente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFuente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFuente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFuente.add(this.jListColumnasSelectReporteTipoFuente, this.gridBagConstraintsTipoFuente);
		this.jPanelReporteDinamicoTipoFuente.add(this.jScrollColumnasSelectReporteTipoFuente, this.gridBagConstraintsTipoFuente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFuente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFuente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFuente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFuente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFuente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFuente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFuente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFuente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFuente=new JScrollPane(this.jListRelacionesSelectReporteTipoFuente);
			
			this.jScrollRelacionesSelectReporteTipoFuente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFuente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFuente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoFuente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFuente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFuente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFuente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFuente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFuente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFuente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFuente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFuente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFuente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFuente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFuente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFuente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFuente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFuente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFuente.add(this.jLabelGenerarExcelReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFuente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFuente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFuente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFuente.setToolTipText("Generar EXCEL"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		//this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFuente.add(this.jButtonGenerarExcelReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFuente.add(this.jComboBoxTiposReportesDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFuente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFuente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFuente.add(this.jLabelTiposArchivoReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFuente.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFuente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFuente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFuente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFuente.setToolTipText("Generar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFuente.add(this.jButtonGenerarReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFuente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFuente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFuente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFuente.setToolTipText("Cancelar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFuente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFuente.add(this.jButtonCerrarReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFuente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFuente= new JScrollPane(jPanelReporteDinamicoTipoFuente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFuente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFuente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFuente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFuente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFuente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFuente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFuente);
		this.jInternalFrameReporteDinamicoTipoFuente.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFuente, this.gridBagConstraintsTipoFuente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFuente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFuente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFuente.setName("jPanelImportacionTipoFuente"); 
		
		this.jPanelImportacionTipoFuente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFuente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFuente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFuente.setLayout(gridaBagLayoutImportacionTipoFuente);
		
		
		this.jInternalFrameImportacionTipoFuente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFuente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFuente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFuente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFuente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFuente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFuente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFuente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFuente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFuente.setResizable(true);
	    this.jInternalFrameImportacionTipoFuente.setClosable(true);
	    this.jInternalFrameImportacionTipoFuente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFuente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFuente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFuente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFuente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFuente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFuente.setResizable(true);
	    this.jInternalFrameImportacionTipoFuente.setClosable(true);
	    this.jInternalFrameImportacionTipoFuente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFuente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFuente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFuente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFuente = new JLabelMe();

		this.jLabelArchivoImportacionTipoFuente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFuente.add(this.jLabelArchivoImportacionTipoFuente, this.gridBagConstraintsTipoFuente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFuente = new JFileChooser();		
		this.jFileChooserImportacionTipoFuente.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFuente = new JButtonMe();
		this.jButtonAbrirImportacionTipoFuente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFuente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFuente.setToolTipText("Generar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFuente.add(this.jButtonAbrirImportacionTipoFuente, this.gridBagConstraintsTipoFuente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFuente = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFuente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFuente.add(this.jLabelPathArchivoImportacionTipoFuente, this.gridBagConstraintsTipoFuente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFuente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFuente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFuente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFuente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFuente.add(this.jTextFieldPathArchivoImportacionTipoFuente, this.gridBagConstraintsTipoFuente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFuente = new JButtonMe();
		this.jButtonGenerarImportacionTipoFuente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFuente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFuente.setToolTipText("Generar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFuente.add(this.jButtonGenerarImportacionTipoFuente, this.gridBagConstraintsTipoFuente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFuente = new JButtonMe();
		this.jButtonCerrarImportacionTipoFuente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFuente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFuente.setToolTipText("Cancelar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFuente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFuente.add(this.jButtonCerrarImportacionTipoFuente, this.gridBagConstraintsTipoFuente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFuente = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFuente= new JScrollPane(jPanelImportacionTipoFuente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFuente.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFuente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFuente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFuente);
		this.jInternalFrameImportacionTipoFuente.getContentPane().add(this.jScrollPanelImportacionTipoFuente, this.gridBagConstraintsTipoFuente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFuente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFuente = new JButtonMe();
			this.jButtonAbrirOrderByTipoFuente.setText("Orden");
			this.jButtonAbrirOrderByTipoFuente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFuente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFuente";
			inputMap = this.jButtonAbrirOrderByTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFuente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFuente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFuente.setName("jPanelOrderByTipoFuente"); 
			
			this.jPanelOrderByTipoFuente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFuente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFuente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFuente.setLayout(gridaBagLayoutOrderByTipoFuente);
			
			
			this.jTableDatosTipoFuenteOrderBy = new JTableMe();        
			this.jTableDatosTipoFuenteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFuenteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFuenteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFuenteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFuenteOrderBy.setViewportView(this.jTableDatosTipoFuenteOrderBy);
			this.jTableDatosTipoFuenteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFuenteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFuente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFuente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFuente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFuente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFuente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFuente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFuente.setTitle("Orden");
			this.jInternalFrameOrderByTipoFuente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFuente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFuente.setResizable(true);
			this.jInternalFrameOrderByTipoFuente.setClosable(true);
			this.jInternalFrameOrderByTipoFuente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFuente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFuente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFuente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFuente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFuente.ipady =150;
				
			this.jPanelOrderByTipoFuente.add(jScrollPanelDatosTipoFuenteOrderBy, this.gridBagConstraintsTipoFuente);//this.jTableDatosTipoFuenteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFuente = new JButtonMe();
			this.jButtonCerrarOrderByTipoFuente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFuente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFuente.setToolTipText("Cancelar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFuente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFuente.add(this.jButtonCerrarOrderByTipoFuente, this.gridBagConstraintsTipoFuente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFuente = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFuente= new JScrollPane(jPanelOrderByTipoFuente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFuente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFuente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFuente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFuente);
			
			this.jInternalFrameOrderByTipoFuente.getContentPane().add(this.jScrollPanelOrderByTipoFuente, this.gridBagConstraintsTipoFuente);			
		
		} else {
			this.jButtonAbrirOrderByTipoFuente = new JButtonMe();
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
		if(this.conMaximoRelaciones 
			&& this.tipofuenteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFuente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFuente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFuente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFuente.getRowHeight();//TipoFuenteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFuenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFuente.isSelected()) {
					iHeightTable=TipoFuenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFuenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFuenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFuenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFuente.isSelected()) {
					iHeightTable=TipoFuenteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFuenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFuenteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFuente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFuente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFuente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFuente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFuente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFuente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFuente!=null && this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy()!=null) {
			//if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFuente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFuente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFuente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFuente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFuente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFuente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipofuenteLogic.getTipoFuentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofuentes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFuente> TraerTipoFuenteBeans(List<TipoFuente> tipofuentes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFuente tipofuente:tipofuentes) {
					
				if(!(TipoFuenteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFuenteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipofuente.setsDetalleGeneralEntityReporte(TipoFuenteConstantesFunciones.getTipoFuenteDescripcion(tipofuente));
										
						
					
						
					
				} else  {
							
					//tipofuente.setsDetalleGeneralEntityReporte(tipofuente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipofuentebeans.add(tipofuentebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipofuentes;
    }
	//PARA REPORTES FIN
}
