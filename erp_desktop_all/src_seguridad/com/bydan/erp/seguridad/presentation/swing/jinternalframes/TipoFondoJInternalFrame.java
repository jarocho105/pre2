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
import com.bydan.erp.seguridad.util.TipoFondoConstantesFunciones;

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
public class TipoFondoJInternalFrame extends TipoFondoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFondo;
	
	protected JMenuBar jmenuBarTipoFondo;
	
	protected JMenu jmenuTipoFondo;
	protected JMenu jmenuDatosTipoFondo;
	protected JMenu jmenuArchivoTipoFondo;
	protected JMenu jmenuAccionesTipoFondo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFondo;	
	protected GridBagConstraints gridBagConstraintsTipoFondo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFondoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFondo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFondo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFondo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFondoSessionBean tipofondoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFondo> tipofondos;		
	public List<TipoFondo> tipofondosEliminados;	
	public List<TipoFondo> tipofondosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFondo;		
	protected JButton jButtonAbrirOrderByTipoFondo;
	
	
	//protected JPanel jPanelOrderByTipoFondo;
	//public JScrollPane jScrollPanelOrderByTipoFondo;	
	//protected JButton jButtonCerrarOrderByTipoFondo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFondoLogic tipofondoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFondo;
	public JScrollPane jScrollPanelDatosEdicionTipoFondo;
	public JScrollPane jScrollPanelDatosGeneralTipoFondo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFondoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFondo;
	//public JScrollPane jScrollPanelImportacionTipoFondo;
	
	
	
	protected JPanel jPanelAccionesTipoFondo;
	
    protected JPanel jPanelPaginacionTipoFondo;
    protected JPanel jPanelParametrosReportesTipoFondo;
	protected JPanel jPanelParametrosReportesAccionesTipoFondo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFondo;
	protected JPanel jPanelParametrosAuxiliar2TipoFondo;
	protected JPanel jPanelParametrosAuxiliar3TipoFondo;
	protected JPanel jPanelParametrosAuxiliar4TipoFondo;
	//protected JPanel jPanelParametrosAuxiliar5TipoFondo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFondo;
	//protected JPanel jPanelImportacionTipoFondo;
	
	
	public JTable jTableDatosTipoFondo;
	
	
	
	//public JTable jTableDatosTipoFondoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFondo;
	protected JButton jButtonDuplicarTipoFondo;
	protected JButton jButtonCopiarTipoFondo;
	protected JButton jButtonVerFormTipoFondo;
	protected JButton jButtonNuevoRelacionesTipoFondo;
	protected JButton jButtonModificarTipoFondo;
	
    protected JButton jButtonGuardarCambiosTablaTipoFondo;
	protected JButton jButtonCerrarTipoFondo;
	
	
	protected JButton jButtonRecargarInformacionTipoFondo;
	protected JButton jButtonProcesarInformacionTipoFondo;
	
	
	protected JButton jButtonAnterioresTipoFondo;
	protected JButton jButtonSiguientesTipoFondo;
	protected JButton jButtonNuevoGuardarCambiosTipoFondo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFondo;
	//protected JButton jButtonCerrarReporteDinamicoTipoFondo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFondo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFondo;
	//protected JButton jButtonGenerarImportacionTipoFondo;
	//protected JButton jButtonCerrarImportacionTipoFondo;
	//protected JFileChooser jFileChooserImportacionTipoFondo;
	//protected File fileImportacionTipoFondo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFondo;
	protected JButton jButtonDuplicarToolBarTipoFondo;
	protected JButton jButtonNuevoRelacionesToolBarTipoFondo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFondo;
	protected JButton jButtonCopiarToolBarTipoFondo;
	protected JButton jButtonVerFormToolBarTipoFondo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFondo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFondo;
	protected JButton jButtonCerrarToolBarTipoFondo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFondo;
	protected JButton jButtonProcesarInformacionToolBarTipoFondo;
	protected JButton jButtonAnterioresToolBarTipoFondo;
	protected JButton jButtonSiguientesToolBarTipoFondo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFondo;
	protected JButton jButtonAbrirOrderByToolBarTipoFondo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFondo;
	protected JMenuItem jMenuItemDuplicarTipoFondo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFondo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFondo;
	protected JMenuItem jMenuItemCopiarTipoFondo;
	protected JMenuItem jMenuItemVerFormTipoFondo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFondo;
	protected JMenuItem jMenuItemCerrarTipoFondo;
	protected JMenuItem jMenuItemDetalleCerrarTipoFondo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFondo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFondo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFondo;
	protected JMenuItem jMenuItemProcesarInformacionTipoFondo;
	protected JMenuItem jMenuItemAnterioresTipoFondo;
	protected JMenuItem jMenuItemSiguientesTipoFondo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFondo;
	protected JMenuItem jMenuItemAbrirOrderByTipoFondo;
	protected JMenuItem jMenuItemMostrarOcultarTipoFondo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFondo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFondo;
	protected JCheckBox jCheckBoxSeleccionadosTipoFondo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFondo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFondo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFondo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFondo;
	protected JTextField jTextFieldValorCampoGeneralTipoFondo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFondo;
	//public JList<Reporte> jListColumnasSelectReporteTipoFondo;
	//public JScrollPane jScrollColumnasSelectReporteTipoFondo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFondo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFondo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFondo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFondo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFondo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFondo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFondo;
	
		
	//public JLabel jLabelArchivoImportacionTipoFondo;	
	//public JLabel jLabelPathArchivoImportacionTipoFondo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFondo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFondo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFondo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFondo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFondo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFondo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFondo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFondo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFondo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFondo;	
	
	
	
	
	
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
	public TipoFondoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFondo)	{
		this.jButtonRecargarInformacionTipoFondo = jButtonRecargarInformacionTipoFondo;
	}
	
	public JButton getjButtonProcesarInformacionTipoFondo() {
		return this.jButtonProcesarInformacionTipoFondo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFondo)	{
		this.jButtonProcesarInformacionTipoFondo = jButtonProcesarInformacionTipoFondo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFondo() {
		return this.jButtonRecargarInformacionTipoFondo;
	}
	
	
	public List<TipoFondo> gettipofondos() {
		return this.tipofondos;
	}

	public void settipofondos(List<TipoFondo> tipofondos) {
		this.tipofondos = tipofondos;
	}
	
	public List<TipoFondo> gettipofondosAux() {
		return this.tipofondosAux;
	}

	public void settipofondosAux(List<TipoFondo> tipofondosAux) {
		this.tipofondosAux = tipofondosAux;
	}
	
	public List<TipoFondo> gettipofondosEliminados() {
		return this.tipofondosEliminados;
	}

	public void setTipoFondosEliminados(List<TipoFondo> tipofondosEliminados) {
		this.tipofondosEliminados = tipofondosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFondo() {
		return jComboBoxTiposSeleccionarTipoFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFondo(
			JComboBox jComboBoxTiposSeleccionarTipoFondo) {
		this.jComboBoxTiposSeleccionarTipoFondo = jComboBoxTiposSeleccionarTipoFondo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFondo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFondo() {
		return jTextFieldValorCampoGeneralTipoFondo;
	}

	public void setjTextFieldValorCampoGeneralTipoFondo(
			JTextField jTextFieldValorCampoGeneralTipoFondo) {
		this.jTextFieldValorCampoGeneralTipoFondo = jTextFieldValorCampoGeneralTipoFondo;
	}

	public void setBorderResaltarValorCampoGeneralTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFondo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFondo() {
		return this.jCheckBoxSeleccionarTodosTipoFondo;
	}

	public void setjCheckBoxSeleccionarTodosTipoFondo(
			JCheckBox jCheckBoxSeleccionarTodosTipoFondo) {
		this.jCheckBoxSeleccionarTodosTipoFondo = jCheckBoxSeleccionarTodosTipoFondo;
	}

	public void setBorderResaltarSeleccionarTodosTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFondo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFondo() {
		return this.jCheckBoxSeleccionadosTipoFondo;
	}

	public void setjCheckBoxSeleccionadosTipoFondo(
			JCheckBox jCheckBoxSeleccionadosTipoFondo) {
		this.jCheckBoxSeleccionadosTipoFondo = jCheckBoxSeleccionadosTipoFondo;
	}
	
	public void setBorderResaltarSeleccionadosTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFondo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFondo() {
		return this.jComboBoxTiposArchivosReportesTipoFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFondo(
			JComboBox jComboBoxTiposArchivosReportesTipoFondo) {
		this.jComboBoxTiposArchivosReportesTipoFondo = jComboBoxTiposArchivosReportesTipoFondo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFondo() {
		return this.jComboBoxTiposReportesTipoFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFondo(
			JComboBox jComboBoxTiposReportesTipoFondo) {
		this.jComboBoxTiposReportesTipoFondo = jComboBoxTiposReportesTipoFondo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFondo() {
	//	return jComboBoxTiposReportesDinamicoTipoFondo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFondo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFondo) {
	//	this.jComboBoxTiposReportesDinamicoTipoFondo = jComboBoxTiposReportesDinamicoTipoFondo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFondo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFondo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFondo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFondo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFondo = jComboBoxTiposArchivosReportesDinamicoTipoFondo;
	//}
	
	public void setBorderResaltarTiposReportesTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFondo() {
		return this.jComboBoxTiposGraficosReportesTipoFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFondo(
			JComboBox jComboBoxTiposGraficosReportesTipoFondo) {
		this.jComboBoxTiposGraficosReportesTipoFondo = jComboBoxTiposGraficosReportesTipoFondo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFondo() {
		return this.jComboBoxTiposPaginacionTipoFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFondo(
			JComboBox jComboBoxTiposPaginacionTipoFondo) {
		this.jComboBoxTiposPaginacionTipoFondo = jComboBoxTiposPaginacionTipoFondo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFondo() {
		return this.jComboBoxTiposRelacionesTipoFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFondo() {
		return this.jComboBoxTiposAccionesTipoFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFondo(
			JComboBox jComboBoxTiposRelacionesTipoFondo) {
		this.jComboBoxTiposRelacionesTipoFondo = jComboBoxTiposRelacionesTipoFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFondo(
			JComboBox jComboBoxTiposAccionesTipoFondo) {
		this.jComboBoxTiposAccionesTipoFondo = jComboBoxTiposAccionesTipoFondo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFondo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFondo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFondo() {
	//	return jCheckBoxConGraficoDinamicoTipoFondo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFondo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFondo) {
	//	this.jCheckBoxConGraficoDinamicoTipoFondo = jCheckBoxConGraficoDinamicoTipoFondo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFondo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFondo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFondo .setBorder(borderResaltar);		
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
		this.tipofondoSessionBean=new TipoFondoSessionBean();
		
		this.tipofondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofondoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFondoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fondo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFondoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFondo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"nuevo","nuevo","Nuevo"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"duplicar","duplicar","Duplicar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"copiar","copiar","Copiar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"ver_form","ver_form","Ver"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"recargar","recargar","Recargar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFondo,this.jTtoolBarTipoFondo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFondo,this.jTtoolBarTipoFondo,
							"cerrar","cerrar","Salir"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFondo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFondo;
			
				this.jButtonProcesarInformacionToolBarTipoFondo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFondo;
				
		//protected JButton jButtonModificarToolBarTipoFondo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFondo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFondo=new JMenuMe("General");
		this.jmenuArchivoTipoFondo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFondo=new JMenuMe("Acciones");
		this.jmenuDatosTipoFondo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFondo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFondo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFondo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFondo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFondo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFondo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFondo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFondo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFondo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFondo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFondo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFondo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFondo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFondo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFondo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFondo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFondo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFondo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFondo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFondo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFondo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFondo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFondo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFondo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFondo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFondo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFondo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFondo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFondo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFondo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFondo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFondo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFondo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFondo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFondo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFondo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFondo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFondo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFondo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFondo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFondo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFondo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFondo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFondo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFondo.add(this.jMenuItemCerrarTipoFondo);
			
			this.jmenuAccionesTipoFondo.add(this.jMenuItemNuevoTipoFondo);
			this.jmenuAccionesTipoFondo.add(this.jMenuItemNuevoGuardarCambiosTipoFondo);
			this.jmenuAccionesTipoFondo.add(this.jMenuItemNuevoRelacionesTipoFondo);
			this.jmenuAccionesTipoFondo.add(this.jMenuItemGuardarCambiosTablaTipoFondo);		
			this.jmenuAccionesTipoFondo.add(this.jMenuItemDuplicarTipoFondo);		
			this.jmenuAccionesTipoFondo.add(this.jMenuItemCopiarTipoFondo);		
			this.jmenuAccionesTipoFondo.add(this.jMenuItemVerFormTipoFondo);		
			
			this.jmenuDatosTipoFondo.add(this.jMenuItemRecargarInformacionTipoFondo);				
			this.jmenuDatosTipoFondo.add(this.jMenuItemAnterioresTipoFondo);				
			this.jmenuDatosTipoFondo.add(this.jMenuItemSiguientesTipoFondo);				
			this.jmenuDatosTipoFondo.add(this.jMenuItemAbrirOrderByTipoFondo);				
			this.jmenuDatosTipoFondo.add(this.jMenuItemMostrarOcultarTipoFondo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFondo.add(this.jMenuItemGuardarCambiosTipoFondo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFondo.add(this.jmenuArchivoTipoFondo);		
			this.jmenuBarTipoFondo.add(this.jmenuAccionesTipoFondo);		
			this.jmenuBarTipoFondo.add(this.jmenuDatosTipoFondo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFondo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFondo() {
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
			//this.jInternalFrameDetalleTipoFondo = new TipoFondoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Fondo DATOS");
			this.jInternalFrameDetalleFormTipoFondo = new TipoFondoDetalleFormJInternalFrame(jDesktopPane,this.tipofondoSessionBean.getConGuardarRelaciones(),this.tipofondoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFondo = null;//new TipoFondoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFondo= new GridBagLayout();
		
		
		this.jTableDatosTipoFondo = new JTableMe();      
		
		String sToolTipTipoFondo="";
		sToolTipTipoFondo=TipoFondoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFondo+="(Seguridad.TipoFondo)";
		}
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFondo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFondo.setToolTipText(sToolTipTipoFondo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFondo);
		this.jTableDatosTipoFondo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFondo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFondo.setRowSelectionAllowed(true);
		this.jTableDatosTipoFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFondo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFondo = new JButtonMe();
		this.jButtonDuplicarTipoFondo = new JButtonMe();
		this.jButtonCopiarTipoFondo = new JButtonMe();
		this.jButtonVerFormTipoFondo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFondo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFondo = new JButtonMe();
		this.jButtonCerrarTipoFondo = new JButtonMe();
		
		this.jScrollPanelDatosTipoFondo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFondo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fondo";
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFondo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFondo.setToolTipText("Acciones");
        this.jPanelAccionesTipoFondo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFondo=new ReporteDinamicoJInternalFrame(TipoFondoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFondo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFondo=new ImportacionJInternalFrame(TipoFondoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFondo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFondo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFondo.setText("Orden");
		this.jButtonAbrirOrderByTipoFondo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFondo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondo,false,this);
			
			//this.cargarOrderByTipoFondo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondo,true,this);
			
			//this.cargarOrderByTipoFondo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFondo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFondo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFondo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFondo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFondo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFondo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFondo.setText("Nuevo");
		this.jButtonDuplicarTipoFondo.setText("Duplicar");
		this.jButtonCopiarTipoFondo.setText("Copiar");
		this.jButtonVerFormTipoFondo.setText("Ver");
		this.jButtonNuevoRelacionesTipoFondo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFondo.setText("Guardar");
		this.jButtonCerrarTipoFondo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFondo,"nuevo_button","Nuevo",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFondo,"duplicar_button","Duplicar",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFondo,"copiar_button","Copiar",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFondo,"ver_form","Ver",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFondo,"nuevorelaciones_button","Nuevo Rel",this.tipofondoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFondo,"guardarcambiostabla_button","Guardar",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFondo,"cerrar_button","Salir",this.tipofondoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFondo.setToolTipText("Nuevo"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFondo.setToolTipText("Duplicar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFondo.setToolTipText("Copiar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFondo.setToolTipText("Ver"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFondo.setToolTipText("Nuevo Rel"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFondo.setToolTipText("Guardar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFondo.setToolTipText("Salir"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFondo";
		inputMap = this.jButtonNuevoTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFondo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFondo";
		inputMap = this.jButtonDuplicarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFondo"));
		
		//COPIAR
		sMapKey = "CopiarTipoFondo";
		inputMap = this.jButtonCopiarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFondo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFondo";
		inputMap = this.jButtonVerFormTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFondo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFondo";
		inputMap = this.jButtonNuevoRelacionesTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFondo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFondo";
		inputMap = this.jButtonModificarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFondo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFondo";
		inputMap = this.jButtonCerrarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFondo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFondo";
		inputMap = this.jButtonGuardarCambiosTablaTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFondo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFondo.setName("jPanelParametrosReportesTipoFondo"); 
		
		this.jPanelParametrosReportesAccionesTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFondo.setName("jPanelParametrosReportesAccionesTipoFondo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFondo = new JButtonMe();
		this.jButtonRecargarInformacionTipoFondo.setText("Recargar");
		this.jButtonRecargarInformacionTipoFondo.setToolTipText("Recargar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFondo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFondo = new JButtonMe();
		this.jButtonProcesarInformacionTipoFondo.setText("Procesar");
		this.jButtonProcesarInformacionTipoFondo.setToolTipText("Procesar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFondo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFondo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFondo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFondo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFondo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFondo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFondo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFondo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFondo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFondo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFondo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFondo.setText("Accion");
		this.jComboBoxTiposAccionesTipoFondo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFondo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFondo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFondo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFondo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFondo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFondo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFondo = new JLabelMe();
		
		this.jLabelAccionesTipoFondo.setText("Acciones");		
		this.jLabelAccionesTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFondo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFondo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFondo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFondo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFondo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFondo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFondo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFondo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFondo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFondo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFondo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFondo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFondo = new JButtonMe();
		//this.jButtonAnterioresTipoFondo.setText("<<");
        this.jButtonAnterioresTipoFondo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFondo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFondo = new JButtonMe();
		//this.jButtonSiguientesTipoFondo.setText(">>");
        this.jButtonSiguientesTipoFondo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFondo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFondo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFondo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFondo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFondo,"nuevoguardarcambios_button","Nue",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFondo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFondo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFondo";
		inputMap = this.jButtonRecargarInformacionTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFondo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFondo";
		inputMap = this.jButtonSiguientesTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFondo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFondo";
		inputMap = this.jButtonAnterioresTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFondo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFondo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFondo.setMinimumSize(new Dimension(this.getWidth(),TipoFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFondo.setMaximumSize(new Dimension(this.getWidth(),TipoFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFondo.setPreferredSize(new Dimension(this.getWidth(),TipoFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFondo = new GridBagLayout();

			this.jPanelPaginacionTipoFondo.setLayout(gridaBagLayoutPaginacionTipoFondo);						
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 0;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFondo.add(this.jButtonAnterioresTipoFondo, this.gridBagConstraintsTipoFondo);
					
						
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFondo.gridy = 0;
			
			this.jPanelPaginacionTipoFondo.add(this.jButtonNuevoGuardarCambiosTipoFondo, this.gridBagConstraintsTipoFondo);
						
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFondo.gridy = 0;
			this.jPanelPaginacionTipoFondo.add(this.jButtonSiguientesTipoFondo, this.gridBagConstraintsTipoFondo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 1;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondo.add(this.jButtonNuevoTipoFondo, this.gridBagConstraintsTipoFondo);
						
			
			
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFondo = new GridBagConstraints();
				this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFondo.gridy = 1;
				this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFondo.add(this.jButtonGuardarCambiosTablaTipoFondo, this.gridBagConstraintsTipoFondo);
			}
			
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 1;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondo.add(this.jButtonDuplicarTipoFondo, this.gridBagConstraintsTipoFondo);
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 1;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondo.add(this.jButtonCopiarTipoFondo, this.gridBagConstraintsTipoFondo);
		
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 1;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondo.add(this.jButtonVerFormTipoFondo, this.gridBagConstraintsTipoFondo);
		
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 1;
			this.gridBagConstraintsTipoFondo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFondo.add(this.jButtonCerrarTipoFondo, this.gridBagConstraintsTipoFondo);
		
		
		
		this.jButtonRecargarInformacionTipoFondo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFondo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFondo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFondo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFondo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFondo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFondo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFondo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFondo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFondo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFondo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFondo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFondo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFondo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFondo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFondo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFondo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFondo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFondo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFondo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFondo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFondo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFondo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFondo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFondo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFondo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFondo.setLayout(gridaBagParametrosReportesTipoFondo);
			this.jPanelParametrosReportesAccionesTipoFondo.setLayout(gridaBagParametrosReportesAccionesTipoFondo);
			
			
			this.jPanelParametrosAuxiliar1TipoFondo.setLayout(gridaBagParametrosAuxiliar1TipoFondo);
			this.jPanelParametrosAuxiliar2TipoFondo.setLayout(gridaBagParametrosAuxiliar2TipoFondo);
			this.jPanelParametrosAuxiliar3TipoFondo.setLayout(gridaBagParametrosAuxiliar3TipoFondo);
			this.jPanelParametrosAuxiliar4TipoFondo.setLayout(gridaBagParametrosAuxiliar4TipoFondo);
			//this.jPanelParametrosAuxiliar5TipoFondo.setLayout(gridaBagParametrosAuxiliar2TipoFondo);			
			
			
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondo.add(this.jButtonRecargarInformacionTipoFondo, this.gridBagConstraintsTipoFondo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondo.add(this.jComboBoxTiposPaginacionTipoFondo, this.gridBagConstraintsTipoFondo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondo.add(this.jCheckBoxConAltoMaximoTablaTipoFondo, this.gridBagConstraintsTipoFondo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondo.add(this.jComboBoxTiposArchivosReportesTipoFondo, this.gridBagConstraintsTipoFondo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondo.add(this.jPanelParametrosAuxiliar1TipoFondo, this.gridBagConstraintsTipoFondo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFondo.add(this.jComboBoxTiposReportesTipoFondo, this.gridBagConstraintsTipoFondo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondo.add(this.jPanelParametrosAuxiliar4TipoFondo, this.gridBagConstraintsTipoFondo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondo.add(this.jComboBoxTiposReportesTipoFondo, this.gridBagConstraintsTipoFondo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondo.add(this.jCheckBoxGenerarReporteTipoFondo, this.gridBagConstraintsTipoFondo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondo.add(this.jPanelParametrosAuxiliar2TipoFondo, this.gridBagConstraintsTipoFondo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondo.add(this.jLabelAccionesTipoFondo, this.gridBagConstraintsTipoFondo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFondo = new GridBagConstraints();
				this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFondo.add(this.jButtonAbrirOrderByTipoFondo, this.gridBagConstraintsTipoFondo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondo.add(this.jComboBoxTiposSeleccionarTipoFondo, this.gridBagConstraintsTipoFondo);			
			
			
			/*
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondo.add(this.jCheckBoxSeleccionarTodosTipoFondo, this.gridBagConstraintsTipoFondo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFondo.add(this.jCheckBoxSeleccionarTodosTipoFondo, this.gridBagConstraintsTipoFondo);															
				
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFondo.add(this.jCheckBoxSeleccionadosTipoFondo, this.gridBagConstraintsTipoFondo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondo.add(this.jPanelParametrosAuxiliar3TipoFondo, this.gridBagConstraintsTipoFondo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondo.add(this.jComboBoxTiposRelacionesTipoFondo, this.gridBagConstraintsTipoFondo);
				
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondo.add(this.jComboBoxTiposAccionesTipoFondo, this.gridBagConstraintsTipoFondo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFondo = new GridBagLayout();

			this.jScrollPanelDatosTipoFondo.setLayout(gridaBagLayoutDatosTipoFondo);
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = 0;
			this.gridBagConstraintsTipoFondo.gridx = 0;
			
			this.jScrollPanelDatosTipoFondo.add(this.jTableDatosTipoFondo, this.gridBagConstraintsTipoFondo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFondo.setViewportView(this.jTableDatosTipoFondo);
		this.jTableDatosTipoFondo.setFillsViewportHeight(true);
		this.jTableDatosTipoFondo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFondo= new GridBagLayout();
		this.jPanelAccionesTipoFondo.setLayout(gridaBagLayoutAccionesTipoFondo);
		
		
		/*	
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = 0;
		this.gridBagConstraintsTipoFondo.gridx = 0;
			
		this.jPanelAccionesTipoFondo.add(this.jButtonNuevoTipoFondo, this.gridBagConstraintsTipoFondo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFondo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFondo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();						
			this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFondo.gridx = 0;		
			//this.gridBagConstraintsTipoFondo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFondo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFondo, this.gridBagConstraintsTipoFondo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFondo.gridx = 0;		
		//this.gridBagConstraintsTipoFondo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFondo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFondo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFondo, this.gridBagConstraintsTipoFondo);								
		
		
		/*
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFondo, this.gridBagConstraintsTipoFondo);
		*/		
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFondo.gridx =0;
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFondo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFondo, this.gridBagConstraintsTipoFondo);
				
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFondo, this.gridBagConstraintsTipoFondo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFondo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFondo.setLayout(gridaBagLayoutBusquedasParametrosTipoFondo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFondo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFondo, this.gridBagConstraintsTipoFondo);
			
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFondo, this.gridBagConstraintsTipoFondo);
		
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFondo, this.gridBagConstraintsTipoFondo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFondo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFondo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFondo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFondo.setName("jPanelReporteDinamicoTipoFondo"); 
		
		this.jPanelReporteDinamicoTipoFondo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFondo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFondo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFondo.setLayout(gridaBagLayoutReporteDinamicoTipoFondo);
		
		
		this.jInternalFrameReporteDinamicoTipoFondo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFondo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFondo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFondo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFondo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFondo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFondo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFondo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFondo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFondo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFondo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFondo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFondo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFondo.add(this.jLabelColumnasSelectReporteTipoFondo, this.gridBagConstraintsTipoFondo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFondo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFondo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFondo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFondo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFondo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFondo=new JScrollPane(this.jListColumnasSelectReporteTipoFondo);
			
			this.jScrollColumnasSelectReporteTipoFondo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFondo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFondo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFondo.add(this.jListColumnasSelectReporteTipoFondo, this.gridBagConstraintsTipoFondo);
		this.jPanelReporteDinamicoTipoFondo.add(this.jScrollColumnasSelectReporteTipoFondo, this.gridBagConstraintsTipoFondo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFondo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFondo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFondo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFondo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFondo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFondo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFondo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFondo=new JScrollPane(this.jListRelacionesSelectReporteTipoFondo);
			
			this.jScrollRelacionesSelectReporteTipoFondo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFondo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFondo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoFondo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFondo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFondo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFondo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFondo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFondo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFondo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFondo.add(this.jLabelGenerarExcelReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFondo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFondo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFondo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFondo.setToolTipText("Generar EXCEL"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFondo.add(this.jButtonGenerarExcelReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondo.add(this.jComboBoxTiposReportesDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFondo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFondo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFondo.add(this.jLabelTiposArchivoReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFondo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFondo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFondo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFondo.setToolTipText("Generar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondo.add(this.jButtonGenerarReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFondo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFondo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFondo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFondo.setToolTipText("Cancelar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondo.add(this.jButtonCerrarReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFondo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFondo= new JScrollPane(jPanelReporteDinamicoTipoFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFondo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFondo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFondo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFondo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFondo);
		this.jInternalFrameReporteDinamicoTipoFondo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFondo, this.gridBagConstraintsTipoFondo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFondo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFondo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFondo.setName("jPanelImportacionTipoFondo"); 
		
		this.jPanelImportacionTipoFondo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFondo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFondo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFondo.setLayout(gridaBagLayoutImportacionTipoFondo);
		
		
		this.jInternalFrameImportacionTipoFondo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFondo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFondo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFondo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFondo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFondo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFondo.setResizable(true);
	    this.jInternalFrameImportacionTipoFondo.setClosable(true);
	    this.jInternalFrameImportacionTipoFondo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFondo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFondo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFondo.setResizable(true);
	    this.jInternalFrameImportacionTipoFondo.setClosable(true);
	    this.jInternalFrameImportacionTipoFondo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFondo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFondo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFondo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFondo = new JLabelMe();

		this.jLabelArchivoImportacionTipoFondo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFondo.add(this.jLabelArchivoImportacionTipoFondo, this.gridBagConstraintsTipoFondo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFondo = new JFileChooser();		
		this.jFileChooserImportacionTipoFondo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFondo = new JButtonMe();
		this.jButtonAbrirImportacionTipoFondo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFondo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFondo.setToolTipText("Generar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondo.add(this.jButtonAbrirImportacionTipoFondo, this.gridBagConstraintsTipoFondo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFondo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFondo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFondo.add(this.jLabelPathArchivoImportacionTipoFondo, this.gridBagConstraintsTipoFondo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFondo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFondo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFondo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFondo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondo.add(this.jTextFieldPathArchivoImportacionTipoFondo, this.gridBagConstraintsTipoFondo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFondo = new JButtonMe();
		this.jButtonGenerarImportacionTipoFondo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFondo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFondo.setToolTipText("Generar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondo.add(this.jButtonGenerarImportacionTipoFondo, this.gridBagConstraintsTipoFondo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFondo = new JButtonMe();
		this.jButtonCerrarImportacionTipoFondo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFondo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFondo.setToolTipText("Cancelar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondo.add(this.jButtonCerrarImportacionTipoFondo, this.gridBagConstraintsTipoFondo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFondo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFondo= new JScrollPane(jPanelImportacionTipoFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFondo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFondo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFondo);
		this.jInternalFrameImportacionTipoFondo.getContentPane().add(this.jScrollPanelImportacionTipoFondo, this.gridBagConstraintsTipoFondo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFondo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFondo = new JButtonMe();
			this.jButtonAbrirOrderByTipoFondo.setText("Orden");
			this.jButtonAbrirOrderByTipoFondo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFondo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFondo";
			inputMap = this.jButtonAbrirOrderByTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFondo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFondo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFondo.setName("jPanelOrderByTipoFondo"); 
			
			this.jPanelOrderByTipoFondo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFondo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFondo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFondo.setLayout(gridaBagLayoutOrderByTipoFondo);
			
			
			this.jTableDatosTipoFondoOrderBy = new JTableMe();        
			this.jTableDatosTipoFondoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFondoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFondoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFondoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFondoOrderBy.setViewportView(this.jTableDatosTipoFondoOrderBy);
			this.jTableDatosTipoFondoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFondoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFondo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFondo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFondo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFondo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFondo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFondo.setTitle("Orden");
			this.jInternalFrameOrderByTipoFondo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFondo.setResizable(true);
			this.jInternalFrameOrderByTipoFondo.setClosable(true);
			this.jInternalFrameOrderByTipoFondo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFondo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFondo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFondo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFondo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFondo.ipady =150;
				
			this.jPanelOrderByTipoFondo.add(jScrollPanelDatosTipoFondoOrderBy, this.gridBagConstraintsTipoFondo);//this.jTableDatosTipoFondoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFondo = new JButtonMe();
			this.jButtonCerrarOrderByTipoFondo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFondo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFondo.setToolTipText("Cancelar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFondo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFondo.add(this.jButtonCerrarOrderByTipoFondo, this.gridBagConstraintsTipoFondo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFondo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFondo= new JScrollPane(jPanelOrderByTipoFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFondo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFondo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFondo);
			
			this.jInternalFrameOrderByTipoFondo.getContentPane().add(this.jScrollPanelOrderByTipoFondo, this.gridBagConstraintsTipoFondo);			
		
		} else {
			this.jButtonAbrirOrderByTipoFondo = new JButtonMe();
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
			&& this.tipofondoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFondo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFondo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFondo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFondo.getRowHeight();//TipoFondoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFondo.isSelected()) {
					iHeightTable=TipoFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFondo.isSelected()) {
					iHeightTable=TipoFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFondo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFondo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFondo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFondo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFondo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFondo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFondo!=null && this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFondo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFondo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFondo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFondo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFondo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFondo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipofondoLogic.getTipoFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFondo> TraerTipoFondoBeans(List<TipoFondo> tipofondos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFondo tipofondo:tipofondos) {
					
				if(!(TipoFondoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFondoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipofondo.setsDetalleGeneralEntityReporte(TipoFondoConstantesFunciones.getTipoFondoDescripcion(tipofondo));
										
						
					
						
					
				} else  {
							
					//tipofondo.setsDetalleGeneralEntityReporte(tipofondo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipofondobeans.add(tipofondobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipofondos;
    }
	//PARA REPORTES FIN
}
