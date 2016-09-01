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
import com.bydan.erp.inventario.util.EstadoDetalleInventarioConstantesFunciones;

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
public class EstadoDetalleInventarioJInternalFrame extends EstadoDetalleInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleInventario;
	
	protected JMenuBar jmenuBarEstadoDetalleInventario;
	
	protected JMenu jmenuEstadoDetalleInventario;
	protected JMenu jmenuDatosEstadoDetalleInventario;
	protected JMenu jmenuArchivoEstadoDetalleInventario;
	protected JMenu jmenuAccionesEstadoDetalleInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleInventario> estadodetalleinventarios;		
	public List<EstadoDetalleInventario> estadodetalleinventariosEliminados;	
	public List<EstadoDetalleInventario> estadodetalleinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleInventario;		
	protected JButton jButtonAbrirOrderByEstadoDetalleInventario;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleInventario;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleInventario;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleInventarioLogic estadodetalleinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleInventario;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleInventario;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleInventario;
	
    protected JPanel jPanelPaginacionEstadoDetalleInventario;
    protected JPanel jPanelParametrosReportesEstadoDetalleInventario;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleInventario;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleInventario;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleInventario;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleInventario;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleInventario;
	//protected JPanel jPanelImportacionEstadoDetalleInventario;
	
	
	public JTable jTableDatosEstadoDetalleInventario;
	
	
	
	//public JTable jTableDatosEstadoDetalleInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleInventario;
	protected JButton jButtonDuplicarEstadoDetalleInventario;
	protected JButton jButtonCopiarEstadoDetalleInventario;
	protected JButton jButtonVerFormEstadoDetalleInventario;
	protected JButton jButtonNuevoRelacionesEstadoDetalleInventario;
	protected JButton jButtonModificarEstadoDetalleInventario;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleInventario;
	protected JButton jButtonCerrarEstadoDetalleInventario;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleInventario;
	protected JButton jButtonProcesarInformacionEstadoDetalleInventario;
	
	
	protected JButton jButtonAnterioresEstadoDetalleInventario;
	protected JButton jButtonSiguientesEstadoDetalleInventario;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleInventario;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleInventario;
	//protected JButton jButtonGenerarImportacionEstadoDetalleInventario;
	//protected JButton jButtonCerrarImportacionEstadoDetalleInventario;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleInventario;
	//protected File fileImportacionEstadoDetalleInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleInventario;
	protected JButton jButtonDuplicarToolBarEstadoDetalleInventario;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleInventario;
	protected JButton jButtonCopiarToolBarEstadoDetalleInventario;
	protected JButton jButtonVerFormToolBarEstadoDetalleInventario;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleInventario;
	protected JButton jButtonCerrarToolBarEstadoDetalleInventario;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleInventario;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleInventario;
	protected JButton jButtonAnterioresToolBarEstadoDetalleInventario;
	protected JButton jButtonSiguientesToolBarEstadoDetalleInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleInventario;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleInventario;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleInventario;
	protected JMenuItem jMenuItemCopiarEstadoDetalleInventario;
	protected JMenuItem jMenuItemVerFormEstadoDetalleInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleInventario;
	protected JMenuItem jMenuItemCerrarEstadoDetalleInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleInventario;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleInventario;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleInventario;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleInventario;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleInventario;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleInventario;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleInventario;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleInventario;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleInventario;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleInventario;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleInventario;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleInventario;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleInventario;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleInventario;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleInventario;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleInventario;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleInventario;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleInventario;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleInventario;	
	
	
	
	
	
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
	public EstadoDetalleInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleInventario)	{
		this.jButtonRecargarInformacionEstadoDetalleInventario = jButtonRecargarInformacionEstadoDetalleInventario;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleInventario() {
		return this.jButtonProcesarInformacionEstadoDetalleInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleInventario)	{
		this.jButtonProcesarInformacionEstadoDetalleInventario = jButtonProcesarInformacionEstadoDetalleInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleInventario() {
		return this.jButtonRecargarInformacionEstadoDetalleInventario;
	}
	
	
	public List<EstadoDetalleInventario> getestadodetalleinventarios() {
		return this.estadodetalleinventarios;
	}

	public void setestadodetalleinventarios(List<EstadoDetalleInventario> estadodetalleinventarios) {
		this.estadodetalleinventarios = estadodetalleinventarios;
	}
	
	public List<EstadoDetalleInventario> getestadodetalleinventariosAux() {
		return this.estadodetalleinventariosAux;
	}

	public void setestadodetalleinventariosAux(List<EstadoDetalleInventario> estadodetalleinventariosAux) {
		this.estadodetalleinventariosAux = estadodetalleinventariosAux;
	}
	
	public List<EstadoDetalleInventario> getestadodetalleinventariosEliminados() {
		return this.estadodetalleinventariosEliminados;
	}

	public void setEstadoDetalleInventariosEliminados(List<EstadoDetalleInventario> estadodetalleinventariosEliminados) {
		this.estadodetalleinventariosEliminados = estadodetalleinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleInventario() {
		return jComboBoxTiposSeleccionarEstadoDetalleInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleInventario(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleInventario) {
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario = jComboBoxTiposSeleccionarEstadoDetalleInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleInventario() {
		return jTextFieldValorCampoGeneralEstadoDetalleInventario;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleInventario(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleInventario) {
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario = jTextFieldValorCampoGeneralEstadoDetalleInventario;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleInventario() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleInventario;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleInventario(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleInventario) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario = jCheckBoxSeleccionarTodosEstadoDetalleInventario;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleInventario() {
		return this.jCheckBoxSeleccionadosEstadoDetalleInventario;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleInventario(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleInventario) {
		this.jCheckBoxSeleccionadosEstadoDetalleInventario = jCheckBoxSeleccionadosEstadoDetalleInventario;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleInventario() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleInventario(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleInventario) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario = jComboBoxTiposArchivosReportesEstadoDetalleInventario;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleInventario() {
		return this.jComboBoxTiposReportesEstadoDetalleInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleInventario(
			JComboBox jComboBoxTiposReportesEstadoDetalleInventario) {
		this.jComboBoxTiposReportesEstadoDetalleInventario = jComboBoxTiposReportesEstadoDetalleInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleInventario() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleInventario) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario = jComboBoxTiposReportesDinamicoEstadoDetalleInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleInventario() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleInventario(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleInventario) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario = jComboBoxTiposGraficosReportesEstadoDetalleInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleInventario() {
		return this.jComboBoxTiposPaginacionEstadoDetalleInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleInventario(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleInventario) {
		this.jComboBoxTiposPaginacionEstadoDetalleInventario = jComboBoxTiposPaginacionEstadoDetalleInventario;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleInventario() {
		return this.jComboBoxTiposRelacionesEstadoDetalleInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleInventario() {
		return this.jComboBoxTiposAccionesEstadoDetalleInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleInventario(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleInventario) {
		this.jComboBoxTiposRelacionesEstadoDetalleInventario = jComboBoxTiposRelacionesEstadoDetalleInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleInventario(
			JComboBox jComboBoxTiposAccionesEstadoDetalleInventario) {
		this.jComboBoxTiposAccionesEstadoDetalleInventario = jComboBoxTiposAccionesEstadoDetalleInventario;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleInventario() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleInventario) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleInventario = jCheckBoxConGraficoDinamicoEstadoDetalleInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleInventario .setBorder(borderResaltar);		
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
		this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		
		this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"copiar","copiar","Copiar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"recargar","recargar","Recargar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleInventario;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleInventario;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleInventario=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleInventario=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleInventario=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleInventario.add(this.jMenuItemCerrarEstadoDetalleInventario);
			
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemNuevoEstadoDetalleInventario);
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario);
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemNuevoRelacionesEstadoDetalleInventario);
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario);		
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemDuplicarEstadoDetalleInventario);		
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemCopiarEstadoDetalleInventario);		
			this.jmenuAccionesEstadoDetalleInventario.add(this.jMenuItemVerFormEstadoDetalleInventario);		
			
			this.jmenuDatosEstadoDetalleInventario.add(this.jMenuItemRecargarInformacionEstadoDetalleInventario);				
			this.jmenuDatosEstadoDetalleInventario.add(this.jMenuItemAnterioresEstadoDetalleInventario);				
			this.jmenuDatosEstadoDetalleInventario.add(this.jMenuItemSiguientesEstadoDetalleInventario);				
			this.jmenuDatosEstadoDetalleInventario.add(this.jMenuItemAbrirOrderByEstadoDetalleInventario);				
			this.jmenuDatosEstadoDetalleInventario.add(this.jMenuItemMostrarOcultarEstadoDetalleInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleInventario.add(this.jMenuItemGuardarCambiosEstadoDetalleInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleInventario.add(this.jmenuArchivoEstadoDetalleInventario);		
			this.jmenuBarEstadoDetalleInventario.add(this.jmenuAccionesEstadoDetalleInventario);		
			this.jmenuBarEstadoDetalleInventario.add(this.jmenuDatosEstadoDetalleInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleInventario() {
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
			//this.jInternalFrameDetalleEstadoDetalleInventario = new EstadoDetalleInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Inventario DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleInventario = new EstadoDetalleInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleinventarioSessionBean.getConGuardarRelaciones(),this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleInventario = null;//new EstadoDetalleInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleInventario= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleInventario = new JTableMe();      
		
		String sToolTipEstadoDetalleInventario="";
		sToolTipEstadoDetalleInventario=EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleInventario+="(Inventario.EstadoDetalleInventario)";
		}
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleInventario.setToolTipText(sToolTipEstadoDetalleInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleInventario);
		this.jTableDatosEstadoDetalleInventario.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleInventario.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleInventario = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleInventario = new JButtonMe();
		this.jButtonCopiarEstadoDetalleInventario = new JButtonMe();
		this.jButtonVerFormEstadoDetalleInventario = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario = new JButtonMe();
		this.jButtonCerrarEstadoDetalleInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Inventario";
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleInventario=new ReporteDinamicoJInternalFrame(EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleInventario=new ImportacionJInternalFrame(EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleInventario.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleInventario,false,this);
			
			//this.cargarOrderByEstadoDetalleInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleInventario,true,this);
			
			//this.cargarOrderByEstadoDetalleInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleInventario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleInventario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleInventario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleInventario.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleInventario.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleInventario.setText("Copiar");
		this.jButtonVerFormEstadoDetalleInventario.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setText("Guardar");
		this.jButtonCerrarEstadoDetalleInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleInventario,"nuevo_button","Nuevo",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleInventario,"duplicar_button","Duplicar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleInventario,"copiar_button","Copiar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleInventario,"ver_form","Ver",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleInventario,"nuevorelaciones_button","Nuevo Rel",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleInventario,"guardarcambiostabla_button","Guardar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleInventario,"cerrar_button","Salir",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleInventario.setToolTipText("Nuevo"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleInventario.setToolTipText("Duplicar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleInventario.setToolTipText("Copiar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleInventario.setToolTipText("Ver"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleInventario.setToolTipText("Nuevo Rel"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setToolTipText("Guardar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleInventario.setToolTipText("Salir"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleInventario";
		inputMap = this.jButtonNuevoEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleInventario";
		inputMap = this.jButtonDuplicarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleInventario"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleInventario";
		inputMap = this.jButtonCopiarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleInventario"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleInventario";
		inputMap = this.jButtonVerFormEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleInventario";
		inputMap = this.jButtonModificarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleInventario";
		inputMap = this.jButtonCerrarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleInventario.setName("jPanelParametrosReportesEstadoDetalleInventario"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleInventario.setName("jPanelParametrosReportesAccionesEstadoDetalleInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleInventario = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleInventario.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleInventario.setToolTipText("Recargar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleInventario = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleInventario.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleInventario.setToolTipText("Procesar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleInventario.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleInventario.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleInventario.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleInventario = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleInventario.setText("<<");
        this.jButtonAnterioresEstadoDetalleInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleInventario = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleInventario.setText(">>");
        this.jButtonSiguientesEstadoDetalleInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleInventario,"nuevoguardarcambios_button","Nue",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleInventario";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleInventario";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleInventario";
		inputMap = this.jButtonSiguientesEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleInventario";
		inputMap = this.jButtonAnterioresEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleInventario.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleInventario.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleInventario.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleInventario = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleInventario.setLayout(gridaBagLayoutPaginacionEstadoDetalleInventario);						
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonAnterioresEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					
						
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonNuevoGuardarCambiosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
						
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonSiguientesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonNuevoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
				this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonNuevoRelacionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			}
			
			
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
				this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonGuardarCambiosTablaEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonDuplicarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonCopiarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonVerFormEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleInventario.add(this.jButtonCerrarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleInventario.setLayout(gridaBagParametrosReportesEstadoDetalleInventario);
			this.jPanelParametrosReportesAccionesEstadoDetalleInventario.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleInventario);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleInventario.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleInventario);
			this.jPanelParametrosAuxiliar2EstadoDetalleInventario.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleInventario);
			this.jPanelParametrosAuxiliar3EstadoDetalleInventario.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleInventario);
			this.jPanelParametrosAuxiliar4EstadoDetalleInventario.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleInventario);
			//this.jPanelParametrosAuxiliar5EstadoDetalleInventario.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleInventario);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jButtonRecargarInformacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleInventario.add(this.jComboBoxTiposPaginacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleInventario.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleInventario.add(this.jComboBoxTiposArchivosReportesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jPanelParametrosAuxiliar1EstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleInventario.add(this.jComboBoxTiposReportesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jPanelParametrosAuxiliar4EstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jComboBoxTiposReportesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jCheckBoxGenerarReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jPanelParametrosAuxiliar2EstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jLabelAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jButtonAbrirOrderByEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jComboBoxTiposSeleccionarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jCheckBoxSeleccionarTodosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleInventario.add(this.jCheckBoxSeleccionarTodosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);															
				
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleInventario.add(this.jCheckBoxSeleccionadosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jPanelParametrosAuxiliar3EstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jComboBoxTiposRelacionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
				
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jComboBoxTiposAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
	
				
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleInventario.add(this.jTextFieldValorCampoGeneralEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleInventario = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleInventario.setLayout(gridaBagLayoutDatosEstadoDetalleInventario);
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleInventario.add(this.jTableDatosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleInventario.setViewportView(this.jTableDatosEstadoDetalleInventario);
		this.jTableDatosEstadoDetalleInventario.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleInventario= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleInventario.setLayout(gridaBagLayoutAccionesEstadoDetalleInventario);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonNuevoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		*/		
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleInventario.gridx =0;
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
				
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleInventario.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleInventario.setName("jPanelReporteDinamicoEstadoDetalleInventario"); 
		
		this.jPanelReporteDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleInventario.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleInventario);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jLabelColumnasSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleInventario=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleInventario);
			
			this.jScrollColumnasSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jListColumnasSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jScrollColumnasSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jLabelRelacionesSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleInventario=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleInventario);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jListRelacionesSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jScrollRelacionesSelectReporteEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario.setToolTipText("Generar EXCEL"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleInventario.setToolTipText("Generar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jButtonGenerarReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleInventario.setToolTipText("Cancelar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleInventario.add(this.jButtonCerrarReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario= new JScrollPane(jPanelReporteDinamicoEstadoDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleInventario);
		this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleInventario.setName("jPanelImportacionEstadoDetalleInventario"); 
		
		this.jPanelImportacionEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleInventario.setLayout(gridaBagLayoutImportacionEstadoDetalleInventario);
		
		
		this.jInternalFrameImportacionEstadoDetalleInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleInventario = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleInventario.add(this.jLabelArchivoImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleInventario = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleInventario.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleInventario = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleInventario.setToolTipText("Generar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleInventario.add(this.jButtonAbrirImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleInventario.add(this.jLabelPathArchivoImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleInventario.add(this.jTextFieldPathArchivoImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleInventario = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleInventario.setToolTipText("Generar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleInventario.add(this.jButtonGenerarImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleInventario = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleInventario.setToolTipText("Cancelar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleInventario.add(this.jButtonCerrarImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleInventario= new JScrollPane(jPanelImportacionEstadoDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleInventario);
		this.jInternalFrameImportacionEstadoDetalleInventario.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleInventario = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleInventario.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleInventario";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleInventario.setName("jPanelOrderByEstadoDetalleInventario"); 
			
			this.jPanelOrderByEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleInventario.setLayout(gridaBagLayoutOrderByEstadoDetalleInventario);
			
			
			this.jTableDatosEstadoDetalleInventarioOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleInventarioOrderBy.setViewportView(this.jTableDatosEstadoDetalleInventarioOrderBy);
			this.jTableDatosEstadoDetalleInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleInventario.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleInventario.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleInventario.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleInventario.ipady =150;
				
			this.jPanelOrderByEstadoDetalleInventario.add(jScrollPanelDatosEstadoDetalleInventarioOrderBy, this.gridBagConstraintsEstadoDetalleInventario);//this.jTableDatosEstadoDetalleInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleInventario = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleInventario.setToolTipText("Cancelar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleInventario.add(this.jButtonCerrarOrderByEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleInventario= new JScrollPane(jPanelOrderByEstadoDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleInventario);
			
			this.jInternalFrameOrderByEstadoDetalleInventario.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleInventario = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleInventario.getRowHeight();//EstadoDetalleInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.isSelected()) {
					iHeightTable=EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleInventario.isSelected()) {
					iHeightTable=EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleInventario!=null && this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetalleinventarioLogic.getEstadoDetalleInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleInventario> TraerEstadoDetalleInventarioBeans(List<EstadoDetalleInventario> estadodetalleinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleInventario estadodetalleinventario:estadodetalleinventarios) {
					
				if(!(EstadoDetalleInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetalleinventario.setsDetalleGeneralEntityReporte(EstadoDetalleInventarioConstantesFunciones.getEstadoDetalleInventarioDescripcion(estadodetalleinventario));
										
						
					
					

					if(estadodetalleinventario.getDetalleCompras()!=null && Funciones.existeClass(classes,DetalleCompra.class)) {
						try{estadodetalleinventario.setdetallecomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleCompraJInternalFrame.TraerDetalleCompraBeans(estadodetalleinventario.getDetalleCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadodetalleinventario.getDetalleTransferencias()!=null && Funciones.existeClass(classes,DetalleTransferencia.class)) {
						try{estadodetalleinventario.setdetalletransferenciasDescripcionReporte(new JRBeanCollectionDataSource(DetalleTransferenciaJInternalFrame.TraerDetalleTransferenciaBeans(estadodetalleinventario.getDetalleTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetalleinventario.setsDetalleGeneralEntityReporte(estadodetalleinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetalleinventariobeans.add(estadodetalleinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetalleinventarios;
    }
	//PARA REPORTES FIN
}
