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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.EstadoServicioConstantesFunciones;

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
public class EstadoServicioJInternalFrame extends EstadoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoServicio;
	
	protected JMenuBar jmenuBarEstadoServicio;
	
	protected JMenu jmenuEstadoServicio;
	protected JMenu jmenuDatosEstadoServicio;
	protected JMenu jmenuArchivoEstadoServicio;
	protected JMenu jmenuAccionesEstadoServicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoServicio;	
	protected GridBagConstraints gridBagConstraintsEstadoServicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoServicioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoServicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoServicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoServicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoServicioSessionBean estadoservicioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoServicio> estadoservicios;		
	public List<EstadoServicio> estadoserviciosEliminados;	
	public List<EstadoServicio> estadoserviciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoServicio;		
	protected JButton jButtonAbrirOrderByEstadoServicio;
	
	
	//protected JPanel jPanelOrderByEstadoServicio;
	//public JScrollPane jScrollPanelOrderByEstadoServicio;	
	//protected JButton jButtonCerrarOrderByEstadoServicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoServicioLogic estadoservicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoServicio;
	public JScrollPane jScrollPanelDatosEdicionEstadoServicio;
	public JScrollPane jScrollPanelDatosGeneralEstadoServicio;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoServicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoServicio;
	//public JScrollPane jScrollPanelImportacionEstadoServicio;
	
	
	
	protected JPanel jPanelAccionesEstadoServicio;
	
    protected JPanel jPanelPaginacionEstadoServicio;
    protected JPanel jPanelParametrosReportesEstadoServicio;
	protected JPanel jPanelParametrosReportesAccionesEstadoServicio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoServicio;
	protected JPanel jPanelParametrosAuxiliar2EstadoServicio;
	protected JPanel jPanelParametrosAuxiliar3EstadoServicio;
	protected JPanel jPanelParametrosAuxiliar4EstadoServicio;
	//protected JPanel jPanelParametrosAuxiliar5EstadoServicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoServicio;
	//protected JPanel jPanelImportacionEstadoServicio;
	
	
	public JTable jTableDatosEstadoServicio;
	
	
	
	//public JTable jTableDatosEstadoServicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoServicio;
	protected JButton jButtonDuplicarEstadoServicio;
	protected JButton jButtonCopiarEstadoServicio;
	protected JButton jButtonVerFormEstadoServicio;
	protected JButton jButtonNuevoRelacionesEstadoServicio;
	protected JButton jButtonModificarEstadoServicio;
	
    protected JButton jButtonGuardarCambiosTablaEstadoServicio;
	protected JButton jButtonCerrarEstadoServicio;
	
	
	protected JButton jButtonRecargarInformacionEstadoServicio;
	protected JButton jButtonProcesarInformacionEstadoServicio;
	
	
	protected JButton jButtonAnterioresEstadoServicio;
	protected JButton jButtonSiguientesEstadoServicio;
	protected JButton jButtonNuevoGuardarCambiosEstadoServicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoServicio;
	//protected JButton jButtonCerrarReporteDinamicoEstadoServicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoServicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoServicio;
	//protected JButton jButtonGenerarImportacionEstadoServicio;
	//protected JButton jButtonCerrarImportacionEstadoServicio;
	//protected JFileChooser jFileChooserImportacionEstadoServicio;
	//protected File fileImportacionEstadoServicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoServicio;
	protected JButton jButtonDuplicarToolBarEstadoServicio;
	protected JButton jButtonNuevoRelacionesToolBarEstadoServicio;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoServicio;
	protected JButton jButtonCopiarToolBarEstadoServicio;
	protected JButton jButtonVerFormToolBarEstadoServicio;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoServicio;
	protected JButton jButtonCerrarToolBarEstadoServicio;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoServicio;
	protected JButton jButtonProcesarInformacionToolBarEstadoServicio;
	protected JButton jButtonAnterioresToolBarEstadoServicio;
	protected JButton jButtonSiguientesToolBarEstadoServicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoServicio;
	protected JButton jButtonAbrirOrderByToolBarEstadoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoServicio;
	protected JMenuItem jMenuItemDuplicarEstadoServicio;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoServicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoServicio;
	protected JMenuItem jMenuItemCopiarEstadoServicio;
	protected JMenuItem jMenuItemVerFormEstadoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoServicio;
	protected JMenuItem jMenuItemCerrarEstadoServicio;
	protected JMenuItem jMenuItemDetalleCerrarEstadoServicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoServicio;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoServicio;
	protected JMenuItem jMenuItemProcesarInformacionEstadoServicio;
	protected JMenuItem jMenuItemAnterioresEstadoServicio;
	protected JMenuItem jMenuItemSiguientesEstadoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoServicio;
	protected JMenuItem jMenuItemAbrirOrderByEstadoServicio;
	protected JMenuItem jMenuItemMostrarOcultarEstadoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoServicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoServicio;
	protected JCheckBox jCheckBoxSeleccionadosEstadoServicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoServicio;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoServicio;
	protected JTextField jTextFieldValorCampoGeneralEstadoServicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoServicio;
	//public JList<Reporte> jListColumnasSelectReporteEstadoServicio;
	//public JScrollPane jScrollColumnasSelectReporteEstadoServicio;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoServicio;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoServicio;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoServicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoServicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoServicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoServicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoServicio;
	
		
	//public JLabel jLabelArchivoImportacionEstadoServicio;	
	//public JLabel jLabelPathArchivoImportacionEstadoServicio;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoServicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoServicio;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoServicio;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoServicio;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoServicio;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoServicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoServicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoServicio;	
	
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoServicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoServicio)	{
		this.jButtonRecargarInformacionEstadoServicio = jButtonRecargarInformacionEstadoServicio;
	}
	
	public JButton getjButtonProcesarInformacionEstadoServicio() {
		return this.jButtonProcesarInformacionEstadoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoServicio)	{
		this.jButtonProcesarInformacionEstadoServicio = jButtonProcesarInformacionEstadoServicio;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoServicio() {
		return this.jButtonRecargarInformacionEstadoServicio;
	}
	
	
	public List<EstadoServicio> getestadoservicios() {
		return this.estadoservicios;
	}

	public void setestadoservicios(List<EstadoServicio> estadoservicios) {
		this.estadoservicios = estadoservicios;
	}
	
	public List<EstadoServicio> getestadoserviciosAux() {
		return this.estadoserviciosAux;
	}

	public void setestadoserviciosAux(List<EstadoServicio> estadoserviciosAux) {
		this.estadoserviciosAux = estadoserviciosAux;
	}
	
	public List<EstadoServicio> getestadoserviciosEliminados() {
		return this.estadoserviciosEliminados;
	}

	public void setEstadoServiciosEliminados(List<EstadoServicio> estadoserviciosEliminados) {
		this.estadoserviciosEliminados = estadoserviciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoServicio() {
		return jComboBoxTiposSeleccionarEstadoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoServicio(
			JComboBox jComboBoxTiposSeleccionarEstadoServicio) {
		this.jComboBoxTiposSeleccionarEstadoServicio = jComboBoxTiposSeleccionarEstadoServicio;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoServicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoServicio() {
		return jTextFieldValorCampoGeneralEstadoServicio;
	}

	public void setjTextFieldValorCampoGeneralEstadoServicio(
			JTextField jTextFieldValorCampoGeneralEstadoServicio) {
		this.jTextFieldValorCampoGeneralEstadoServicio = jTextFieldValorCampoGeneralEstadoServicio;
	}

	public void setBorderResaltarValorCampoGeneralEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoServicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoServicio() {
		return this.jCheckBoxSeleccionarTodosEstadoServicio;
	}

	public void setjCheckBoxSeleccionarTodosEstadoServicio(
			JCheckBox jCheckBoxSeleccionarTodosEstadoServicio) {
		this.jCheckBoxSeleccionarTodosEstadoServicio = jCheckBoxSeleccionarTodosEstadoServicio;
	}

	public void setBorderResaltarSeleccionarTodosEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoServicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoServicio() {
		return this.jCheckBoxSeleccionadosEstadoServicio;
	}

	public void setjCheckBoxSeleccionadosEstadoServicio(
			JCheckBox jCheckBoxSeleccionadosEstadoServicio) {
		this.jCheckBoxSeleccionadosEstadoServicio = jCheckBoxSeleccionadosEstadoServicio;
	}
	
	public void setBorderResaltarSeleccionadosEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoServicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoServicio() {
		return this.jComboBoxTiposArchivosReportesEstadoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoServicio(
			JComboBox jComboBoxTiposArchivosReportesEstadoServicio) {
		this.jComboBoxTiposArchivosReportesEstadoServicio = jComboBoxTiposArchivosReportesEstadoServicio;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoServicio() {
		return this.jComboBoxTiposReportesEstadoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoServicio(
			JComboBox jComboBoxTiposReportesEstadoServicio) {
		this.jComboBoxTiposReportesEstadoServicio = jComboBoxTiposReportesEstadoServicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoServicio() {
	//	return jComboBoxTiposReportesDinamicoEstadoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoServicio(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoServicio) {
	//	this.jComboBoxTiposReportesDinamicoEstadoServicio = jComboBoxTiposReportesDinamicoEstadoServicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoServicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoServicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoServicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio = jComboBoxTiposArchivosReportesDinamicoEstadoServicio;
	//}
	
	public void setBorderResaltarTiposReportesEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoServicio() {
		return this.jComboBoxTiposGraficosReportesEstadoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoServicio(
			JComboBox jComboBoxTiposGraficosReportesEstadoServicio) {
		this.jComboBoxTiposGraficosReportesEstadoServicio = jComboBoxTiposGraficosReportesEstadoServicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoServicio() {
		return this.jComboBoxTiposPaginacionEstadoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoServicio(
			JComboBox jComboBoxTiposPaginacionEstadoServicio) {
		this.jComboBoxTiposPaginacionEstadoServicio = jComboBoxTiposPaginacionEstadoServicio;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoServicio() {
		return this.jComboBoxTiposRelacionesEstadoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoServicio() {
		return this.jComboBoxTiposAccionesEstadoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoServicio(
			JComboBox jComboBoxTiposRelacionesEstadoServicio) {
		this.jComboBoxTiposRelacionesEstadoServicio = jComboBoxTiposRelacionesEstadoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoServicio(
			JComboBox jComboBoxTiposAccionesEstadoServicio) {
		this.jComboBoxTiposAccionesEstadoServicio = jComboBoxTiposAccionesEstadoServicio;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoServicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoServicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoServicio() {
	//	return jCheckBoxConGraficoDinamicoEstadoServicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoServicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoServicio) {
	//	this.jCheckBoxConGraficoDinamicoEstadoServicio = jCheckBoxConGraficoDinamicoEstadoServicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoServicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoServicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoServicio .setBorder(borderResaltar);		
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
		this.estadoservicioSessionBean=new EstadoServicioSessionBean();
		
		this.estadoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoservicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoServicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"nuevo","nuevo","Nuevo"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"duplicar","duplicar","Duplicar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"copiar","copiar","Copiar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"ver_form","ver_form","Ver"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"recargar","recargar","Recargar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoServicio,this.jTtoolBarEstadoServicio,
							"cerrar","cerrar","Salir"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoServicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoServicio;
			
				this.jButtonProcesarInformacionToolBarEstadoServicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoServicio;
				
		//protected JButton jButtonModificarToolBarEstadoServicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoServicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoServicio=new JMenuMe("General");
		this.jmenuArchivoEstadoServicio=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoServicio=new JMenuMe("Acciones");
		this.jmenuDatosEstadoServicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoServicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoServicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoServicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoServicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoServicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoServicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoServicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoServicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoServicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoServicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoServicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoServicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoServicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoServicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoServicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoServicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoServicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoServicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoServicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoServicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoServicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoServicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoServicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoServicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoServicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoServicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoServicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoServicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoServicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoServicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoServicio.add(this.jMenuItemCerrarEstadoServicio);
			
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemNuevoEstadoServicio);
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemNuevoGuardarCambiosEstadoServicio);
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemNuevoRelacionesEstadoServicio);
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemGuardarCambiosTablaEstadoServicio);		
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemDuplicarEstadoServicio);		
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemCopiarEstadoServicio);		
			this.jmenuAccionesEstadoServicio.add(this.jMenuItemVerFormEstadoServicio);		
			
			this.jmenuDatosEstadoServicio.add(this.jMenuItemRecargarInformacionEstadoServicio);				
			this.jmenuDatosEstadoServicio.add(this.jMenuItemAnterioresEstadoServicio);				
			this.jmenuDatosEstadoServicio.add(this.jMenuItemSiguientesEstadoServicio);				
			this.jmenuDatosEstadoServicio.add(this.jMenuItemAbrirOrderByEstadoServicio);				
			this.jmenuDatosEstadoServicio.add(this.jMenuItemMostrarOcultarEstadoServicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoServicio.add(this.jMenuItemGuardarCambiosEstadoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoServicio.add(this.jmenuArchivoEstadoServicio);		
			this.jmenuBarEstadoServicio.add(this.jmenuAccionesEstadoServicio);		
			this.jmenuBarEstadoServicio.add(this.jmenuDatosEstadoServicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoServicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoServicio() {
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
			//this.jInternalFrameDetalleEstadoServicio = new EstadoServicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Servicio DATOS");
			this.jInternalFrameDetalleFormEstadoServicio = new EstadoServicioDetalleFormJInternalFrame(jDesktopPane,this.estadoservicioSessionBean.getConGuardarRelaciones(),this.estadoservicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoServicio = null;//new EstadoServicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoServicio= new GridBagLayout();
		
		
		this.jTableDatosEstadoServicio = new JTableMe();      
		
		String sToolTipEstadoServicio="";
		sToolTipEstadoServicio=EstadoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoServicio+="(Inventario.EstadoServicio)";
		}
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoServicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoServicio.setToolTipText(sToolTipEstadoServicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoServicio);
		this.jTableDatosEstadoServicio.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoServicio.setRowSelectionAllowed(true);
		this.jTableDatosEstadoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoServicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoServicio = new JButtonMe();
		this.jButtonDuplicarEstadoServicio = new JButtonMe();
		this.jButtonCopiarEstadoServicio = new JButtonMe();
		this.jButtonVerFormEstadoServicio = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoServicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoServicio = new JButtonMe();
		this.jButtonCerrarEstadoServicio = new JButtonMe();
		
		this.jScrollPanelDatosEstadoServicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoServicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Servicio";
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoServicio.setToolTipText("Acciones");
        this.jPanelAccionesEstadoServicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoServicio=new ReporteDinamicoJInternalFrame(EstadoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoServicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoServicio=new ImportacionJInternalFrame(EstadoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoServicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoServicio = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoServicio.setText("Orden");
		this.jButtonAbrirOrderByEstadoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoServicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoServicio,false,this);
			
			//this.cargarOrderByEstadoServicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoServicio,true,this);
			
			//this.cargarOrderByEstadoServicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoServicio.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoServicio.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoServicio.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoServicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoServicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoServicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoServicio.setText("Nuevo");
		this.jButtonDuplicarEstadoServicio.setText("Duplicar");
		this.jButtonCopiarEstadoServicio.setText("Copiar");
		this.jButtonVerFormEstadoServicio.setText("Ver");
		this.jButtonNuevoRelacionesEstadoServicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoServicio.setText("Guardar");
		this.jButtonCerrarEstadoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoServicio,"nuevo_button","Nuevo",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoServicio,"duplicar_button","Duplicar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoServicio,"copiar_button","Copiar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoServicio,"ver_form","Ver",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoServicio,"nuevorelaciones_button","Nuevo Rel",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoServicio,"guardarcambiostabla_button","Guardar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoServicio,"cerrar_button","Salir",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoServicio.setToolTipText("Nuevo"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoServicio.setToolTipText("Duplicar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoServicio.setToolTipText("Copiar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoServicio.setToolTipText("Ver"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoServicio.setToolTipText("Nuevo Rel"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoServicio.setToolTipText("Guardar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoServicio.setToolTipText("Salir"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoServicio";
		inputMap = this.jButtonNuevoEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoServicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoServicio";
		inputMap = this.jButtonDuplicarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoServicio"));
		
		//COPIAR
		sMapKey = "CopiarEstadoServicio";
		inputMap = this.jButtonCopiarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoServicio"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoServicio";
		inputMap = this.jButtonVerFormEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoServicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoServicio";
		inputMap = this.jButtonNuevoRelacionesEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoServicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoServicio";
		inputMap = this.jButtonModificarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoServicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoServicio";
		inputMap = this.jButtonCerrarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoServicio";
		inputMap = this.jButtonGuardarCambiosTablaEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoServicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoServicio.setName("jPanelParametrosReportesEstadoServicio"); 
		
		this.jPanelParametrosReportesAccionesEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoServicio.setName("jPanelParametrosReportesAccionesEstadoServicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoServicio = new JButtonMe();
		this.jButtonRecargarInformacionEstadoServicio.setText("Recargar");
		this.jButtonRecargarInformacionEstadoServicio.setToolTipText("Recargar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoServicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoServicio = new JButtonMe();
		this.jButtonProcesarInformacionEstadoServicio.setText("Procesar");
		this.jButtonProcesarInformacionEstadoServicio.setToolTipText("Procesar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoServicio.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoServicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoServicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoServicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoServicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoServicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoServicio.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoServicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoServicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoServicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoServicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoServicio.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoServicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoServicio.setText("Accion");
		this.jComboBoxTiposAccionesEstadoServicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoServicio.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoServicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoServicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoServicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoServicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoServicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoServicio = new JLabelMe();
		
		this.jLabelAccionesEstadoServicio.setText("Acciones");		
		this.jLabelAccionesEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoServicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoServicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoServicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoServicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoServicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoServicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoServicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoServicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoServicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoServicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoServicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoServicio = new JButtonMe();
		//this.jButtonAnterioresEstadoServicio.setText("<<");
        this.jButtonAnterioresEstadoServicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoServicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoServicio = new JButtonMe();
		//this.jButtonSiguientesEstadoServicio.setText(">>");
        this.jButtonSiguientesEstadoServicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoServicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoServicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoServicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoServicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoServicio,"nuevoguardarcambios_button","Nue",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoServicio";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoServicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoServicio";
		inputMap = this.jButtonRecargarInformacionEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoServicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoServicio";
		inputMap = this.jButtonSiguientesEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoServicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoServicio";
		inputMap = this.jButtonAnterioresEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoServicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoServicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoServicio.setMinimumSize(new Dimension(this.getWidth(),EstadoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoServicio.setMaximumSize(new Dimension(this.getWidth(),EstadoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoServicio.setPreferredSize(new Dimension(this.getWidth(),EstadoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoServicio = new GridBagLayout();

			this.jPanelPaginacionEstadoServicio.setLayout(gridaBagLayoutPaginacionEstadoServicio);						
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 0;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoServicio.add(this.jButtonAnterioresEstadoServicio, this.gridBagConstraintsEstadoServicio);
					
						
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoServicio.gridy = 0;
			
			this.jPanelPaginacionEstadoServicio.add(this.jButtonNuevoGuardarCambiosEstadoServicio, this.gridBagConstraintsEstadoServicio);
						
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoServicio.gridy = 0;
			this.jPanelPaginacionEstadoServicio.add(this.jButtonSiguientesEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 1;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoServicio.add(this.jButtonNuevoEstadoServicio, this.gridBagConstraintsEstadoServicio);
						
			
			
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
				this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoServicio.gridy = 1;
				this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoServicio.add(this.jButtonGuardarCambiosTablaEstadoServicio, this.gridBagConstraintsEstadoServicio);
			}
			
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 1;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoServicio.add(this.jButtonDuplicarEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 1;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoServicio.add(this.jButtonCopiarEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 1;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoServicio.add(this.jButtonVerFormEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 1;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoServicio.add(this.jButtonCerrarEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
		
		
		this.jButtonRecargarInformacionEstadoServicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoServicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoServicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoServicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoServicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoServicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoServicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoServicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoServicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoServicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoServicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoServicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoServicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoServicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoServicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoServicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoServicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoServicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoServicio.setLayout(gridaBagParametrosReportesEstadoServicio);
			this.jPanelParametrosReportesAccionesEstadoServicio.setLayout(gridaBagParametrosReportesAccionesEstadoServicio);
			
			
			this.jPanelParametrosAuxiliar1EstadoServicio.setLayout(gridaBagParametrosAuxiliar1EstadoServicio);
			this.jPanelParametrosAuxiliar2EstadoServicio.setLayout(gridaBagParametrosAuxiliar2EstadoServicio);
			this.jPanelParametrosAuxiliar3EstadoServicio.setLayout(gridaBagParametrosAuxiliar3EstadoServicio);
			this.jPanelParametrosAuxiliar4EstadoServicio.setLayout(gridaBagParametrosAuxiliar4EstadoServicio);
			//this.jPanelParametrosAuxiliar5EstadoServicio.setLayout(gridaBagParametrosAuxiliar2EstadoServicio);			
			
			
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoServicio.add(this.jButtonRecargarInformacionEstadoServicio, this.gridBagConstraintsEstadoServicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoServicio.add(this.jComboBoxTiposPaginacionEstadoServicio, this.gridBagConstraintsEstadoServicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoServicio.add(this.jCheckBoxConAltoMaximoTablaEstadoServicio, this.gridBagConstraintsEstadoServicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoServicio.add(this.jComboBoxTiposArchivosReportesEstadoServicio, this.gridBagConstraintsEstadoServicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoServicio.add(this.jPanelParametrosAuxiliar1EstadoServicio, this.gridBagConstraintsEstadoServicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoServicio.add(this.jComboBoxTiposReportesEstadoServicio, this.gridBagConstraintsEstadoServicio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoServicio.add(this.jPanelParametrosAuxiliar4EstadoServicio, this.gridBagConstraintsEstadoServicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoServicio.add(this.jComboBoxTiposReportesEstadoServicio, this.gridBagConstraintsEstadoServicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoServicio.add(this.jCheckBoxGenerarReporteEstadoServicio, this.gridBagConstraintsEstadoServicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoServicio.add(this.jPanelParametrosAuxiliar2EstadoServicio, this.gridBagConstraintsEstadoServicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoServicio.add(this.jLabelAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
				this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoServicio.add(this.jButtonAbrirOrderByEstadoServicio, this.gridBagConstraintsEstadoServicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoServicio.add(this.jComboBoxTiposSeleccionarEstadoServicio, this.gridBagConstraintsEstadoServicio);			
			
			
			/*
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoServicio.add(this.jCheckBoxSeleccionarTodosEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoServicio.add(this.jCheckBoxSeleccionarTodosEstadoServicio, this.gridBagConstraintsEstadoServicio);															
				
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoServicio.add(this.jCheckBoxSeleccionadosEstadoServicio, this.gridBagConstraintsEstadoServicio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoServicio.add(this.jPanelParametrosAuxiliar3EstadoServicio, this.gridBagConstraintsEstadoServicio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoServicio.add(this.jComboBoxTiposRelacionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
				
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoServicio.add(this.jComboBoxTiposAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoServicio = new GridBagLayout();

			this.jScrollPanelDatosEstadoServicio.setLayout(gridaBagLayoutDatosEstadoServicio);
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = 0;
			this.gridBagConstraintsEstadoServicio.gridx = 0;
			
			this.jScrollPanelDatosEstadoServicio.add(this.jTableDatosEstadoServicio, this.gridBagConstraintsEstadoServicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoServicio.setViewportView(this.jTableDatosEstadoServicio);
		this.jTableDatosEstadoServicio.setFillsViewportHeight(true);
		this.jTableDatosEstadoServicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoServicio= new GridBagLayout();
		this.jPanelAccionesEstadoServicio.setLayout(gridaBagLayoutAccionesEstadoServicio);
		
		
		/*	
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx = 0;
			
		this.jPanelAccionesEstadoServicio.add(this.jButtonNuevoEstadoServicio, this.gridBagConstraintsEstadoServicio);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoServicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();						
			this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoServicio.gridx = 0;		
			//this.gridBagConstraintsEstadoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoServicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoServicio, this.gridBagConstraintsEstadoServicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoServicio.gridx = 0;		
		//this.gridBagConstraintsEstadoServicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoServicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoServicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoServicio, this.gridBagConstraintsEstadoServicio);								
		
		
		/*
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
		*/		
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoServicio.gridx =0;
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoServicio, this.gridBagConstraintsEstadoServicio);
				
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoServicio, this.gridBagConstraintsEstadoServicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoServicio = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoServicio.setLayout(gridaBagLayoutBusquedasParametrosEstadoServicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoServicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoServicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoServicio.setName("jPanelReporteDinamicoEstadoServicio"); 
		
		this.jPanelReporteDinamicoEstadoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoServicio.setLayout(gridaBagLayoutReporteDinamicoEstadoServicio);
		
		
		this.jInternalFrameReporteDinamicoEstadoServicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoServicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoServicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoServicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoServicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoServicio = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoServicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoServicio.add(this.jLabelColumnasSelectReporteEstadoServicio, this.gridBagConstraintsEstadoServicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoServicio = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoServicio=new JScrollPane(this.jListColumnasSelectReporteEstadoServicio);
			
			this.jScrollColumnasSelectReporteEstadoServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoServicio.add(this.jListColumnasSelectReporteEstadoServicio, this.gridBagConstraintsEstadoServicio);
		this.jPanelReporteDinamicoEstadoServicio.add(this.jScrollColumnasSelectReporteEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoServicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoServicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoServicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoServicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoServicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoServicio=new JScrollPane(this.jListRelacionesSelectReporteEstadoServicio);
			
			this.jScrollRelacionesSelectReporteEstadoServicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoServicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoServicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoServicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoServicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoServicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoServicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoServicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoServicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoServicio.add(this.jLabelGenerarExcelReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoServicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoServicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoServicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoServicio.setToolTipText("Generar EXCEL"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoServicio.add(this.jButtonGenerarExcelReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoServicio.add(this.jComboBoxTiposReportesDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoServicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoServicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoServicio.add(this.jLabelTiposArchivoReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoServicio.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoServicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoServicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoServicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoServicio.setToolTipText("Generar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoServicio.add(this.jButtonGenerarReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoServicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoServicio.setToolTipText("Cancelar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoServicio.add(this.jButtonCerrarReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoServicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoServicio= new JScrollPane(jPanelReporteDinamicoEstadoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoServicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoServicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoServicio);
		this.jInternalFrameReporteDinamicoEstadoServicio.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoServicio, this.gridBagConstraintsEstadoServicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoServicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoServicio.setName("jPanelImportacionEstadoServicio"); 
		
		this.jPanelImportacionEstadoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoServicio.setLayout(gridaBagLayoutImportacionEstadoServicio);
		
		
		this.jInternalFrameImportacionEstadoServicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoServicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoServicio.setResizable(true);
	    this.jInternalFrameImportacionEstadoServicio.setClosable(true);
	    this.jInternalFrameImportacionEstadoServicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoServicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoServicio.setResizable(true);
	    this.jInternalFrameImportacionEstadoServicio.setClosable(true);
	    this.jInternalFrameImportacionEstadoServicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoServicio = new JLabelMe();

		this.jLabelArchivoImportacionEstadoServicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoServicio.add(this.jLabelArchivoImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoServicio = new JFileChooser();		
		this.jFileChooserImportacionEstadoServicio.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoServicio = new JButtonMe();
		this.jButtonAbrirImportacionEstadoServicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoServicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoServicio.setToolTipText("Generar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoServicio.add(this.jButtonAbrirImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoServicio = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoServicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoServicio.add(this.jLabelPathArchivoImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoServicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoServicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoServicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoServicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoServicio.add(this.jTextFieldPathArchivoImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoServicio = new JButtonMe();
		this.jButtonGenerarImportacionEstadoServicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoServicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoServicio.setToolTipText("Generar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoServicio.add(this.jButtonGenerarImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoServicio = new JButtonMe();
		this.jButtonCerrarImportacionEstadoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoServicio.setToolTipText("Cancelar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoServicio.add(this.jButtonCerrarImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoServicio = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoServicio= new JScrollPane(jPanelImportacionEstadoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoServicio.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoServicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoServicio);
		this.jInternalFrameImportacionEstadoServicio.getContentPane().add(this.jScrollPanelImportacionEstadoServicio, this.gridBagConstraintsEstadoServicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoServicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoServicio = new JButtonMe();
			this.jButtonAbrirOrderByEstadoServicio.setText("Orden");
			this.jButtonAbrirOrderByEstadoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoServicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoServicio";
			inputMap = this.jButtonAbrirOrderByEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoServicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoServicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoServicio.setName("jPanelOrderByEstadoServicio"); 
			
			this.jPanelOrderByEstadoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoServicio.setLayout(gridaBagLayoutOrderByEstadoServicio);
			
			
			this.jTableDatosEstadoServicioOrderBy = new JTableMe();        
			this.jTableDatosEstadoServicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoServicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoServicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoServicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoServicioOrderBy.setViewportView(this.jTableDatosEstadoServicioOrderBy);
			this.jTableDatosEstadoServicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoServicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoServicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoServicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoServicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoServicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoServicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoServicio.setTitle("Orden");
			this.jInternalFrameOrderByEstadoServicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoServicio.setResizable(true);
			this.jInternalFrameOrderByEstadoServicio.setClosable(true);
			this.jInternalFrameOrderByEstadoServicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoServicio.ipady =150;
				
			this.jPanelOrderByEstadoServicio.add(jScrollPanelDatosEstadoServicioOrderBy, this.gridBagConstraintsEstadoServicio);//this.jTableDatosEstadoServicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoServicio = new JButtonMe();
			this.jButtonCerrarOrderByEstadoServicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoServicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoServicio.setToolTipText("Cancelar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoServicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoServicio.add(this.jButtonCerrarOrderByEstadoServicio, this.gridBagConstraintsEstadoServicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoServicio = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoServicio= new JScrollPane(jPanelOrderByEstadoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoServicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoServicio);
			
			this.jInternalFrameOrderByEstadoServicio.getContentPane().add(this.jScrollPanelOrderByEstadoServicio, this.gridBagConstraintsEstadoServicio);			
		
		} else {
			this.jButtonAbrirOrderByEstadoServicio = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoservicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoServicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoServicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoServicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoServicio.getRowHeight();//EstadoServicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoServicio.isSelected()) {
					iHeightTable=EstadoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoServicio.isSelected()) {
					iHeightTable=EstadoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoServicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoServicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoServicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoServicio!=null && this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoServicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoServicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoServicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoservicioLogic.getEstadoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoservicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoServicio> TraerEstadoServicioBeans(List<EstadoServicio> estadoservicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoServicio estadoservicio:estadoservicios) {
					
				if(!(EstadoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoservicio.setsDetalleGeneralEntityReporte(EstadoServicioConstantesFunciones.getEstadoServicioDescripcion(estadoservicio));
										
					estadoservicio.setes_defecto_descripcion(EstadoServicioConstantesFunciones.getes_defectoDescripcion(estadoservicio));	
					
						
					
				} else  {
							
					//estadoservicio.setsDetalleGeneralEntityReporte(estadoservicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoserviciobeans.add(estadoserviciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoservicios;
    }
	//PARA REPORTES FIN
}
