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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.EstadoDepreActiConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class EstadoDepreActiJInternalFrame extends EstadoDepreActiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDepreActi;
	
	protected JMenuBar jmenuBarEstadoDepreActi;
	
	protected JMenu jmenuEstadoDepreActi;
	protected JMenu jmenuDatosEstadoDepreActi;
	protected JMenu jmenuArchivoEstadoDepreActi;
	protected JMenu jmenuAccionesEstadoDepreActi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDepreActi;	
	protected GridBagConstraints gridBagConstraintsEstadoDepreActi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDepreActiDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDepreActi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDepreActi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDepreActi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDepreActiSessionBean estadodepreactiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDepreActi> estadodepreactis;		
	public List<EstadoDepreActi> estadodepreactisEliminados;	
	public List<EstadoDepreActi> estadodepreactisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDepreActi;		
	protected JButton jButtonAbrirOrderByEstadoDepreActi;
	
	
	//protected JPanel jPanelOrderByEstadoDepreActi;
	//public JScrollPane jScrollPanelOrderByEstadoDepreActi;	
	//protected JButton jButtonCerrarOrderByEstadoDepreActi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDepreActiLogic estadodepreactiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDepreActi;
	public JScrollPane jScrollPanelDatosEdicionEstadoDepreActi;
	public JScrollPane jScrollPanelDatosGeneralEstadoDepreActi;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDepreActiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDepreActi;
	//public JScrollPane jScrollPanelImportacionEstadoDepreActi;
	
	
	
	protected JPanel jPanelAccionesEstadoDepreActi;
	
    protected JPanel jPanelPaginacionEstadoDepreActi;
    protected JPanel jPanelParametrosReportesEstadoDepreActi;
	protected JPanel jPanelParametrosReportesAccionesEstadoDepreActi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDepreActi;
	protected JPanel jPanelParametrosAuxiliar2EstadoDepreActi;
	protected JPanel jPanelParametrosAuxiliar3EstadoDepreActi;
	protected JPanel jPanelParametrosAuxiliar4EstadoDepreActi;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDepreActi;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDepreActi;
	//protected JPanel jPanelImportacionEstadoDepreActi;
	
	
	public JTable jTableDatosEstadoDepreActi;
	
	
	
	//public JTable jTableDatosEstadoDepreActiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDepreActi;
	protected JButton jButtonDuplicarEstadoDepreActi;
	protected JButton jButtonCopiarEstadoDepreActi;
	protected JButton jButtonVerFormEstadoDepreActi;
	protected JButton jButtonNuevoRelacionesEstadoDepreActi;
	protected JButton jButtonModificarEstadoDepreActi;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDepreActi;
	protected JButton jButtonCerrarEstadoDepreActi;
	
	
	protected JButton jButtonRecargarInformacionEstadoDepreActi;
	protected JButton jButtonProcesarInformacionEstadoDepreActi;
	
	
	protected JButton jButtonAnterioresEstadoDepreActi;
	protected JButton jButtonSiguientesEstadoDepreActi;
	protected JButton jButtonNuevoGuardarCambiosEstadoDepreActi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDepreActi;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDepreActi;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDepreActi;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDepreActi;
	//protected JButton jButtonGenerarImportacionEstadoDepreActi;
	//protected JButton jButtonCerrarImportacionEstadoDepreActi;
	//protected JFileChooser jFileChooserImportacionEstadoDepreActi;
	//protected File fileImportacionEstadoDepreActi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDepreActi;
	protected JButton jButtonDuplicarToolBarEstadoDepreActi;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDepreActi;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDepreActi;
	protected JButton jButtonCopiarToolBarEstadoDepreActi;
	protected JButton jButtonVerFormToolBarEstadoDepreActi;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDepreActi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDepreActi;
	protected JButton jButtonCerrarToolBarEstadoDepreActi;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDepreActi;
	protected JButton jButtonProcesarInformacionToolBarEstadoDepreActi;
	protected JButton jButtonAnterioresToolBarEstadoDepreActi;
	protected JButton jButtonSiguientesToolBarEstadoDepreActi;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDepreActi;
	protected JButton jButtonAbrirOrderByToolBarEstadoDepreActi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDepreActi;
	protected JMenuItem jMenuItemDuplicarEstadoDepreActi;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDepreActi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDepreActi;
	protected JMenuItem jMenuItemCopiarEstadoDepreActi;
	protected JMenuItem jMenuItemVerFormEstadoDepreActi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDepreActi;
	protected JMenuItem jMenuItemCerrarEstadoDepreActi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDepreActi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDepreActi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDepreActi;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDepreActi;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDepreActi;
	protected JMenuItem jMenuItemAnterioresEstadoDepreActi;
	protected JMenuItem jMenuItemSiguientesEstadoDepreActi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDepreActi;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDepreActi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDepreActi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDepreActi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDepreActi;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDepreActi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDepreActi;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDepreActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDepreActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDepreActi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDepreActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDepreActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDepreActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDepreActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDepreActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDepreActi;
	protected JTextField jTextFieldValorCampoGeneralEstadoDepreActi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDepreActi;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDepreActi;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDepreActi;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDepreActi;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDepreActi;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDepreActi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDepreActi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDepreActi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDepreActi;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDepreActi;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDepreActi;	
	//public JLabel jLabelPathArchivoImportacionEstadoDepreActi;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDepreActi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDepreActi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDepreActi;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDepreActi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDepreActi;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDepreActi;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDepreActi;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDepreActi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDepreActi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDepreActi;	
	
	
	
	
	
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
	public EstadoDepreActiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDepreActi)	{
		this.jButtonRecargarInformacionEstadoDepreActi = jButtonRecargarInformacionEstadoDepreActi;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDepreActi() {
		return this.jButtonProcesarInformacionEstadoDepreActi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDepreActi)	{
		this.jButtonProcesarInformacionEstadoDepreActi = jButtonProcesarInformacionEstadoDepreActi;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDepreActi() {
		return this.jButtonRecargarInformacionEstadoDepreActi;
	}
	
	
	public List<EstadoDepreActi> getestadodepreactis() {
		return this.estadodepreactis;
	}

	public void setestadodepreactis(List<EstadoDepreActi> estadodepreactis) {
		this.estadodepreactis = estadodepreactis;
	}
	
	public List<EstadoDepreActi> getestadodepreactisAux() {
		return this.estadodepreactisAux;
	}

	public void setestadodepreactisAux(List<EstadoDepreActi> estadodepreactisAux) {
		this.estadodepreactisAux = estadodepreactisAux;
	}
	
	public List<EstadoDepreActi> getestadodepreactisEliminados() {
		return this.estadodepreactisEliminados;
	}

	public void setEstadoDepreActisEliminados(List<EstadoDepreActi> estadodepreactisEliminados) {
		this.estadodepreactisEliminados = estadodepreactisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDepreActi() {
		return jComboBoxTiposSeleccionarEstadoDepreActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDepreActi(
			JComboBox jComboBoxTiposSeleccionarEstadoDepreActi) {
		this.jComboBoxTiposSeleccionarEstadoDepreActi = jComboBoxTiposSeleccionarEstadoDepreActi;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDepreActi() {
		return jTextFieldValorCampoGeneralEstadoDepreActi;
	}

	public void setjTextFieldValorCampoGeneralEstadoDepreActi(
			JTextField jTextFieldValorCampoGeneralEstadoDepreActi) {
		this.jTextFieldValorCampoGeneralEstadoDepreActi = jTextFieldValorCampoGeneralEstadoDepreActi;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDepreActi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDepreActi() {
		return this.jCheckBoxSeleccionarTodosEstadoDepreActi;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDepreActi(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDepreActi) {
		this.jCheckBoxSeleccionarTodosEstadoDepreActi = jCheckBoxSeleccionarTodosEstadoDepreActi;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDepreActi() {
		return this.jCheckBoxSeleccionadosEstadoDepreActi;
	}

	public void setjCheckBoxSeleccionadosEstadoDepreActi(
			JCheckBox jCheckBoxSeleccionadosEstadoDepreActi) {
		this.jCheckBoxSeleccionadosEstadoDepreActi = jCheckBoxSeleccionadosEstadoDepreActi;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDepreActi() {
		return this.jComboBoxTiposArchivosReportesEstadoDepreActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDepreActi(
			JComboBox jComboBoxTiposArchivosReportesEstadoDepreActi) {
		this.jComboBoxTiposArchivosReportesEstadoDepreActi = jComboBoxTiposArchivosReportesEstadoDepreActi;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDepreActi() {
		return this.jComboBoxTiposReportesEstadoDepreActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDepreActi(
			JComboBox jComboBoxTiposReportesEstadoDepreActi) {
		this.jComboBoxTiposReportesEstadoDepreActi = jComboBoxTiposReportesEstadoDepreActi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDepreActi() {
	//	return jComboBoxTiposReportesDinamicoEstadoDepreActi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDepreActi(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDepreActi) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDepreActi = jComboBoxTiposReportesDinamicoEstadoDepreActi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDepreActi() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDepreActi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi = jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDepreActi() {
		return this.jComboBoxTiposGraficosReportesEstadoDepreActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDepreActi(
			JComboBox jComboBoxTiposGraficosReportesEstadoDepreActi) {
		this.jComboBoxTiposGraficosReportesEstadoDepreActi = jComboBoxTiposGraficosReportesEstadoDepreActi;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDepreActi() {
		return this.jComboBoxTiposPaginacionEstadoDepreActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDepreActi(
			JComboBox jComboBoxTiposPaginacionEstadoDepreActi) {
		this.jComboBoxTiposPaginacionEstadoDepreActi = jComboBoxTiposPaginacionEstadoDepreActi;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDepreActi() {
		return this.jComboBoxTiposRelacionesEstadoDepreActi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDepreActi() {
		return this.jComboBoxTiposAccionesEstadoDepreActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDepreActi(
			JComboBox jComboBoxTiposRelacionesEstadoDepreActi) {
		this.jComboBoxTiposRelacionesEstadoDepreActi = jComboBoxTiposRelacionesEstadoDepreActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDepreActi(
			JComboBox jComboBoxTiposAccionesEstadoDepreActi) {
		this.jComboBoxTiposAccionesEstadoDepreActi = jComboBoxTiposAccionesEstadoDepreActi;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDepreActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDepreActi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDepreActi() {
	//	return jCheckBoxConGraficoDinamicoEstadoDepreActi;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDepreActi(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDepreActi) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDepreActi = jCheckBoxConGraficoDinamicoEstadoDepreActi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDepreActi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDepreActi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDepreActi .setBorder(borderResaltar);		
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
		this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		
		this.estadodepreactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodepreactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodepreactiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDepreActiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Depre Acti MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDepreActiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDepreActi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"nuevo","nuevo","Nuevo"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"duplicar","duplicar","Duplicar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"copiar","copiar","Copiar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"ver_form","ver_form","Ver"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"recargar","recargar","Recargar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDepreActi,this.jTtoolBarEstadoDepreActi,
							"cerrar","cerrar","Salir"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDepreActi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDepreActi;
			
				this.jButtonProcesarInformacionToolBarEstadoDepreActi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDepreActi;
				
		//protected JButton jButtonModificarToolBarEstadoDepreActi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDepreActi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDepreActi=new JMenuMe("General");
		this.jmenuArchivoEstadoDepreActi=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDepreActi=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDepreActi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDepreActi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDepreActi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDepreActi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDepreActi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDepreActi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDepreActi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDepreActi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDepreActi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDepreActi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDepreActi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDepreActi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDepreActi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDepreActi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDepreActi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDepreActi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDepreActi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDepreActi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDepreActi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDepreActi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDepreActi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDepreActi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDepreActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDepreActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDepreActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDepreActi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDepreActi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDepreActi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDepreActi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDepreActi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDepreActi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDepreActi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDepreActi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDepreActi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDepreActi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDepreActi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDepreActi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDepreActi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDepreActi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDepreActi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDepreActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDepreActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDepreActi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDepreActi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDepreActi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDepreActi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDepreActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDepreActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDepreActi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDepreActi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDepreActi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDepreActi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDepreActi.add(this.jMenuItemCerrarEstadoDepreActi);
			
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemNuevoEstadoDepreActi);
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemNuevoGuardarCambiosEstadoDepreActi);
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemNuevoRelacionesEstadoDepreActi);
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemGuardarCambiosTablaEstadoDepreActi);		
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemDuplicarEstadoDepreActi);		
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemCopiarEstadoDepreActi);		
			this.jmenuAccionesEstadoDepreActi.add(this.jMenuItemVerFormEstadoDepreActi);		
			
			this.jmenuDatosEstadoDepreActi.add(this.jMenuItemRecargarInformacionEstadoDepreActi);				
			this.jmenuDatosEstadoDepreActi.add(this.jMenuItemAnterioresEstadoDepreActi);				
			this.jmenuDatosEstadoDepreActi.add(this.jMenuItemSiguientesEstadoDepreActi);				
			this.jmenuDatosEstadoDepreActi.add(this.jMenuItemAbrirOrderByEstadoDepreActi);				
			this.jmenuDatosEstadoDepreActi.add(this.jMenuItemMostrarOcultarEstadoDepreActi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDepreActi.add(this.jMenuItemGuardarCambiosEstadoDepreActi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDepreActi.add(this.jmenuArchivoEstadoDepreActi);		
			this.jmenuBarEstadoDepreActi.add(this.jmenuAccionesEstadoDepreActi);		
			this.jmenuBarEstadoDepreActi.add(this.jmenuDatosEstadoDepreActi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDepreActi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDepreActi() {
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
			//this.jInternalFrameDetalleEstadoDepreActi = new EstadoDepreActiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Depre Acti DATOS");
			this.jInternalFrameDetalleFormEstadoDepreActi = new EstadoDepreActiDetalleFormJInternalFrame(jDesktopPane,this.estadodepreactiSessionBean.getConGuardarRelaciones(),this.estadodepreactiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDepreActi = null;//new EstadoDepreActiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDepreActi= new GridBagLayout();
		
		
		this.jTableDatosEstadoDepreActi = new JTableMe();      
		
		String sToolTipEstadoDepreActi="";
		sToolTipEstadoDepreActi=EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDepreActi+="(ActivosFijos.EstadoDepreActi)";
		}
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDepreActi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDepreActi.setToolTipText(sToolTipEstadoDepreActi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDepreActi);
		this.jTableDatosEstadoDepreActi.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDepreActi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDepreActi.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDepreActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDepreActi = new JButtonMe();
		this.jButtonDuplicarEstadoDepreActi = new JButtonMe();
		this.jButtonCopiarEstadoDepreActi = new JButtonMe();
		this.jButtonVerFormEstadoDepreActi = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDepreActi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi = new JButtonMe();
		this.jButtonCerrarEstadoDepreActi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDepreActi = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDepreActi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Depre Acti";
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDepreActi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDepreActi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDepreActi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDepreActi=new ReporteDinamicoJInternalFrame(EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDepreActi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDepreActi=new ImportacionJInternalFrame(EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDepreActi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDepreActi = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDepreActi.setText("Orden");
		this.jButtonAbrirOrderByEstadoDepreActi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDepreActi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDepreActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDepreActi,false,this);
			
			//this.cargarOrderByEstadoDepreActi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDepreActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDepreActi,true,this);
			
			//this.cargarOrderByEstadoDepreActi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDepreActi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDepreActi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDepreActi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDepreActi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDepreActi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDepreActi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDepreActi.setText("Nuevo");
		this.jButtonDuplicarEstadoDepreActi.setText("Duplicar");
		this.jButtonCopiarEstadoDepreActi.setText("Copiar");
		this.jButtonVerFormEstadoDepreActi.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDepreActi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.setText("Guardar");
		this.jButtonCerrarEstadoDepreActi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDepreActi,"nuevo_button","Nuevo",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDepreActi,"duplicar_button","Duplicar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDepreActi,"copiar_button","Copiar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDepreActi,"ver_form","Ver",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDepreActi,"nuevorelaciones_button","Nuevo Rel",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDepreActi,"guardarcambiostabla_button","Guardar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDepreActi,"cerrar_button","Salir",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDepreActi.setToolTipText("Nuevo"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDepreActi.setToolTipText("Duplicar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDepreActi.setToolTipText("Copiar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDepreActi.setToolTipText("Ver"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDepreActi.setToolTipText("Nuevo Rel"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.setToolTipText("Guardar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDepreActi.setToolTipText("Salir"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDepreActi";
		inputMap = this.jButtonNuevoEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDepreActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDepreActi"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDepreActi";
		inputMap = this.jButtonDuplicarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDepreActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDepreActi"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDepreActi";
		inputMap = this.jButtonCopiarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDepreActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDepreActi"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDepreActi";
		inputMap = this.jButtonVerFormEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDepreActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDepreActi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDepreActi";
		inputMap = this.jButtonNuevoRelacionesEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDepreActi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDepreActi";
		inputMap = this.jButtonModificarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDepreActi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDepreActi";
		inputMap = this.jButtonCerrarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDepreActi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDepreActi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDepreActi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDepreActi.setName("jPanelParametrosReportesEstadoDepreActi"); 
		
		this.jPanelParametrosReportesAccionesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDepreActi.setName("jPanelParametrosReportesAccionesEstadoDepreActi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDepreActi = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDepreActi.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDepreActi.setToolTipText("Recargar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDepreActi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDepreActi = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDepreActi.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDepreActi.setToolTipText("Procesar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDepreActi.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDepreActi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDepreActi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDepreActi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDepreActi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDepreActi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDepreActi.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDepreActi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDepreActi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDepreActi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDepreActi.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDepreActi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDepreActi.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDepreActi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDepreActi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDepreActi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDepreActi.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDepreActi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDepreActi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDepreActi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDepreActi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDepreActi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDepreActi = new JLabelMe();
		
		this.jLabelAccionesEstadoDepreActi.setText("Acciones");		
		this.jLabelAccionesEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDepreActi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDepreActi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDepreActi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDepreActi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDepreActi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDepreActi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDepreActi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDepreActi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDepreActi.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDepreActi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDepreActi = new JButtonMe();
		//this.jButtonAnterioresEstadoDepreActi.setText("<<");
        this.jButtonAnterioresEstadoDepreActi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDepreActi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDepreActi = new JButtonMe();
		//this.jButtonSiguientesEstadoDepreActi.setText(">>");
        this.jButtonSiguientesEstadoDepreActi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDepreActi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDepreActi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDepreActi.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDepreActi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDepreActi,"nuevoguardarcambios_button","Nue",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDepreActi";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDepreActi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDepreActi";
		inputMap = this.jButtonRecargarInformacionEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDepreActi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDepreActi";
		inputMap = this.jButtonSiguientesEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDepreActi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDepreActi";
		inputMap = this.jButtonAnterioresEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDepreActi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDepreActi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDepreActi.setMinimumSize(new Dimension(this.getWidth(),EstadoDepreActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDepreActiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDepreActi.setMaximumSize(new Dimension(this.getWidth(),EstadoDepreActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDepreActiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDepreActi.setPreferredSize(new Dimension(this.getWidth(),EstadoDepreActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDepreActiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDepreActi = new GridBagLayout();

			this.jPanelPaginacionEstadoDepreActi.setLayout(gridaBagLayoutPaginacionEstadoDepreActi);						
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 0;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonAnterioresEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					
						
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDepreActi.gridy = 0;
			
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonNuevoGuardarCambiosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
						
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDepreActi.gridy = 0;
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonSiguientesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 1;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonNuevoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
				this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDepreActi.gridy = 1;
				this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDepreActi.add(this.jButtonNuevoRelacionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			}
			
			
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
				this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDepreActi.gridy = 1;
				this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDepreActi.add(this.jButtonGuardarCambiosTablaEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			}
			
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 1;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonDuplicarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 1;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonCopiarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 1;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonVerFormEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 1;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDepreActi.add(this.jButtonCerrarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
		
		
		this.jButtonRecargarInformacionEstadoDepreActi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDepreActi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDepreActi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDepreActi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDepreActi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDepreActi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDepreActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDepreActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDepreActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDepreActi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDepreActi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDepreActi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDepreActi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDepreActi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDepreActi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDepreActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDepreActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDepreActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDepreActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDepreActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDepreActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDepreActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDepreActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDepreActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDepreActi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDepreActi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDepreActi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDepreActi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDepreActi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDepreActi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDepreActi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDepreActi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDepreActi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDepreActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDepreActi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDepreActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDepreActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDepreActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDepreActi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDepreActi.setLayout(gridaBagParametrosReportesEstadoDepreActi);
			this.jPanelParametrosReportesAccionesEstadoDepreActi.setLayout(gridaBagParametrosReportesAccionesEstadoDepreActi);
			
			
			this.jPanelParametrosAuxiliar1EstadoDepreActi.setLayout(gridaBagParametrosAuxiliar1EstadoDepreActi);
			this.jPanelParametrosAuxiliar2EstadoDepreActi.setLayout(gridaBagParametrosAuxiliar2EstadoDepreActi);
			this.jPanelParametrosAuxiliar3EstadoDepreActi.setLayout(gridaBagParametrosAuxiliar3EstadoDepreActi);
			this.jPanelParametrosAuxiliar4EstadoDepreActi.setLayout(gridaBagParametrosAuxiliar4EstadoDepreActi);
			//this.jPanelParametrosAuxiliar5EstadoDepreActi.setLayout(gridaBagParametrosAuxiliar2EstadoDepreActi);			
			
			
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jButtonRecargarInformacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDepreActi.add(this.jComboBoxTiposPaginacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDepreActi.add(this.jCheckBoxConAltoMaximoTablaEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDepreActi.add(this.jComboBoxTiposArchivosReportesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jPanelParametrosAuxiliar1EstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDepreActi.add(this.jComboBoxTiposReportesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jPanelParametrosAuxiliar4EstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jComboBoxTiposReportesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jCheckBoxGenerarReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jPanelParametrosAuxiliar2EstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jLabelAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
				this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDepreActi.add(this.jButtonAbrirOrderByEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jComboBoxTiposSeleccionarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			
			
			/*
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jCheckBoxSeleccionarTodosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDepreActi.add(this.jCheckBoxSeleccionarTodosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);															
				
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDepreActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDepreActi.add(this.jCheckBoxSeleccionadosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jPanelParametrosAuxiliar3EstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jComboBoxTiposRelacionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
				
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jComboBoxTiposAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
	
				
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDepreActi.add(this.jTextFieldValorCampoGeneralEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDepreActi = new GridBagLayout();

			this.jScrollPanelDatosEstadoDepreActi.setLayout(gridaBagLayoutDatosEstadoDepreActi);
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = 0;
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;
			
			this.jScrollPanelDatosEstadoDepreActi.add(this.jTableDatosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDepreActi.setViewportView(this.jTableDatosEstadoDepreActi);
		this.jTableDatosEstadoDepreActi.setFillsViewportHeight(true);
		this.jTableDatosEstadoDepreActi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDepreActi= new GridBagLayout();
		this.jPanelAccionesEstadoDepreActi.setLayout(gridaBagLayoutAccionesEstadoDepreActi);
		
		
		/*	
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
			
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonNuevoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDepreActi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDepreActi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;		
			//this.gridBagConstraintsEstadoDepreActi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDepreActi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;		
		//this.gridBagConstraintsEstadoDepreActi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDepreActi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDepreActi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);								
		
		
		/*
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		*/		
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDepreActi.gridx =0;
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDepreActi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
				
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDepreActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDepreActi = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDepreActi.setLayout(gridaBagLayoutBusquedasParametrosEstadoDepreActi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDepreActi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDepreActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDepreActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDepreActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDepreActi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDepreActi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDepreActi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDepreActi.setName("jPanelReporteDinamicoEstadoDepreActi"); 
		
		this.jPanelReporteDinamicoEstadoDepreActi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDepreActi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDepreActi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDepreActi.setLayout(gridaBagLayoutReporteDinamicoEstadoDepreActi);
		
		
		this.jInternalFrameReporteDinamicoEstadoDepreActi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDepreActi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDepreActi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDepreActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDepreActi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDepreActi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDepreActi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDepreActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDepreActi.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDepreActi.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDepreActi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDepreActi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDepreActi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDepreActi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDepreActi = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDepreActi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jLabelColumnasSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDepreActi = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDepreActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDepreActi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDepreActi=new JScrollPane(this.jListColumnasSelectReporteEstadoDepreActi);
			
			this.jScrollColumnasSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDepreActi.add(this.jListColumnasSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jScrollColumnasSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDepreActi = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDepreActi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jLabelRelacionesSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDepreActi = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDepreActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDepreActi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDepreActi=new JScrollPane(this.jListRelacionesSelectReporteEstadoDepreActi);
			
			this.jScrollRelacionesSelectReporteEstadoDepreActi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDepreActi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDepreActi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDepreActi.add(this.jListRelacionesSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jScrollRelacionesSelectReporteEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDepreActi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDepreActi = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDepreActi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDepreActi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDepreActi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDepreActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDepreActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDepreActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jLabelGenerarExcelReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi.setToolTipText("Generar EXCEL"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDepreActi.add(this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jComboBoxTiposReportesDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jLabelTiposArchivoReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDepreActi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDepreActi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDepreActi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDepreActi.setToolTipText("Generar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jButtonGenerarReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDepreActi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDepreActi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDepreActi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDepreActi.setToolTipText("Cancelar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDepreActi.add(this.jButtonCerrarReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDepreActi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDepreActi= new JScrollPane(jPanelReporteDinamicoEstadoDepreActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDepreActi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDepreActi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDepreActi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDepreActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDepreActi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDepreActi);
		this.jInternalFrameReporteDinamicoEstadoDepreActi.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDepreActi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDepreActi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDepreActi.setName("jPanelImportacionEstadoDepreActi"); 
		
		this.jPanelImportacionEstadoDepreActi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDepreActi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDepreActi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDepreActi.setLayout(gridaBagLayoutImportacionEstadoDepreActi);
		
		
		this.jInternalFrameImportacionEstadoDepreActi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDepreActi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDepreActi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDepreActi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDepreActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDepreActi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDepreActi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDepreActi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDepreActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDepreActi.setResizable(true);
	    this.jInternalFrameImportacionEstadoDepreActi.setClosable(true);
	    this.jInternalFrameImportacionEstadoDepreActi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDepreActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDepreActi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDepreActi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDepreActi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDepreActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDepreActi.setResizable(true);
	    this.jInternalFrameImportacionEstadoDepreActi.setClosable(true);
	    this.jInternalFrameImportacionEstadoDepreActi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDepreActi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDepreActi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDepreActi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDepreActi = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDepreActi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDepreActi.add(this.jLabelArchivoImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDepreActi = new JFileChooser();		
		this.jFileChooserImportacionEstadoDepreActi.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDepreActi = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDepreActi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDepreActi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDepreActi.setToolTipText("Generar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDepreActi.add(this.jButtonAbrirImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDepreActi = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDepreActi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDepreActi.add(this.jLabelPathArchivoImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDepreActi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDepreActi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDepreActi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDepreActi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDepreActi.add(this.jTextFieldPathArchivoImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDepreActi = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDepreActi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDepreActi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDepreActi.setToolTipText("Generar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDepreActi.add(this.jButtonGenerarImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDepreActi = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDepreActi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDepreActi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDepreActi.setToolTipText("Cancelar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDepreActi.add(this.jButtonCerrarImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDepreActi = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDepreActi= new JScrollPane(jPanelImportacionEstadoDepreActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDepreActi.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDepreActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDepreActi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDepreActi);
		this.jInternalFrameImportacionEstadoDepreActi.getContentPane().add(this.jScrollPanelImportacionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDepreActi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDepreActi = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDepreActi.setText("Orden");
			this.jButtonAbrirOrderByEstadoDepreActi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDepreActi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDepreActi";
			inputMap = this.jButtonAbrirOrderByEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDepreActi"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDepreActi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDepreActi.setName("jPanelOrderByEstadoDepreActi"); 
			
			this.jPanelOrderByEstadoDepreActi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDepreActi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDepreActi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDepreActi.setLayout(gridaBagLayoutOrderByEstadoDepreActi);
			
			
			this.jTableDatosEstadoDepreActiOrderBy = new JTableMe();        
			this.jTableDatosEstadoDepreActiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDepreActiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDepreActiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDepreActiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDepreActiOrderBy.setViewportView(this.jTableDatosEstadoDepreActiOrderBy);
			this.jTableDatosEstadoDepreActiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDepreActiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDepreActi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDepreActi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDepreActi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDepreActi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDepreActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDepreActi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDepreActi.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDepreActi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDepreActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDepreActi.setResizable(true);
			this.jInternalFrameOrderByEstadoDepreActi.setClosable(true);
			this.jInternalFrameOrderByEstadoDepreActi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDepreActi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDepreActi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDepreActi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDepreActi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDepreActi.ipady =150;
				
			this.jPanelOrderByEstadoDepreActi.add(jScrollPanelDatosEstadoDepreActiOrderBy, this.gridBagConstraintsEstadoDepreActi);//this.jTableDatosEstadoDepreActiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDepreActi = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDepreActi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDepreActi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDepreActi.setToolTipText("Cancelar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDepreActi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDepreActi.add(this.jButtonCerrarOrderByEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDepreActi = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDepreActi= new JScrollPane(jPanelOrderByEstadoDepreActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDepreActi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDepreActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDepreActi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDepreActi);
			
			this.jInternalFrameOrderByEstadoDepreActi.getContentPane().add(this.jScrollPanelOrderByEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDepreActi = new JButtonMe();
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
			&& this.estadodepreactiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDepreActi.getRowHeight();//EstadoDepreActiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.isSelected()) {
					iHeightTable=EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDepreActi.isSelected()) {
					iHeightTable=EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDepreActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDepreActi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDepreActi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDepreActi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDepreActi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDepreActi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDepreActi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDepreActi!=null && this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDepreActi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDepreActi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDepreActi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDepreActi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDepreActi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDepreActi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodepreactiLogic.getEstadoDepreActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodepreactis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDepreActi> TraerEstadoDepreActiBeans(List<EstadoDepreActi> estadodepreactis,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDepreActi estadodepreacti:estadodepreactis) {
					
				if(!(EstadoDepreActiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDepreActiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodepreacti.setsDetalleGeneralEntityReporte(EstadoDepreActiConstantesFunciones.getEstadoDepreActiDescripcion(estadodepreacti));
										
						
					
					

					if(estadodepreacti.getDepreciacionActivoFijos()!=null && Funciones.existeClass(classes,DepreciacionActivoFijo.class)) {
						try{estadodepreacti.setdepreciacionactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DepreciacionActivoFijoJInternalFrame.TraerDepreciacionActivoFijoBeans(estadodepreacti.getDepreciacionActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodepreacti.setsDetalleGeneralEntityReporte(estadodepreacti.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodepreactibeans.add(estadodepreactibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodepreactis;
    }
	//PARA REPORTES FIN
}
