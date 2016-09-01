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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoRetencionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoRetencionJInternalFrame extends EstadoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoRetencion;
	
	protected JMenuBar jmenuBarEstadoRetencion;
	
	protected JMenu jmenuEstadoRetencion;
	protected JMenu jmenuDatosEstadoRetencion;
	protected JMenu jmenuArchivoEstadoRetencion;
	protected JMenu jmenuAccionesEstadoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRetencion;	
	protected GridBagConstraints gridBagConstraintsEstadoRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRetencionSessionBean estadoretencionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoRetencion> estadoretencions;		
	public List<EstadoRetencion> estadoretencionsEliminados;	
	public List<EstadoRetencion> estadoretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoRetencion;		
	protected JButton jButtonAbrirOrderByEstadoRetencion;
	
	
	//protected JPanel jPanelOrderByEstadoRetencion;
	//public JScrollPane jScrollPanelOrderByEstadoRetencion;	
	//protected JButton jButtonCerrarOrderByEstadoRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoRetencionLogic estadoretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoRetencion;
	public JScrollPane jScrollPanelDatosEdicionEstadoRetencion;
	public JScrollPane jScrollPanelDatosGeneralEstadoRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoRetencion;
	//public JScrollPane jScrollPanelImportacionEstadoRetencion;
	
	
	
	protected JPanel jPanelAccionesEstadoRetencion;
	
    protected JPanel jPanelPaginacionEstadoRetencion;
    protected JPanel jPanelParametrosReportesEstadoRetencion;
	protected JPanel jPanelParametrosReportesAccionesEstadoRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoRetencion;
	protected JPanel jPanelParametrosAuxiliar2EstadoRetencion;
	protected JPanel jPanelParametrosAuxiliar3EstadoRetencion;
	protected JPanel jPanelParametrosAuxiliar4EstadoRetencion;
	//protected JPanel jPanelParametrosAuxiliar5EstadoRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoRetencion;
	//protected JPanel jPanelImportacionEstadoRetencion;
	
	
	public JTable jTableDatosEstadoRetencion;
	
	
	
	//public JTable jTableDatosEstadoRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoRetencion;
	protected JButton jButtonDuplicarEstadoRetencion;
	protected JButton jButtonCopiarEstadoRetencion;
	protected JButton jButtonVerFormEstadoRetencion;
	protected JButton jButtonNuevoRelacionesEstadoRetencion;
	protected JButton jButtonModificarEstadoRetencion;
	
    protected JButton jButtonGuardarCambiosTablaEstadoRetencion;
	protected JButton jButtonCerrarEstadoRetencion;
	
	
	protected JButton jButtonRecargarInformacionEstadoRetencion;
	protected JButton jButtonProcesarInformacionEstadoRetencion;
	
	
	protected JButton jButtonAnterioresEstadoRetencion;
	protected JButton jButtonSiguientesEstadoRetencion;
	protected JButton jButtonNuevoGuardarCambiosEstadoRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoRetencion;
	//protected JButton jButtonCerrarReporteDinamicoEstadoRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoRetencion;
	//protected JButton jButtonGenerarImportacionEstadoRetencion;
	//protected JButton jButtonCerrarImportacionEstadoRetencion;
	//protected JFileChooser jFileChooserImportacionEstadoRetencion;
	//protected File fileImportacionEstadoRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRetencion;
	protected JButton jButtonDuplicarToolBarEstadoRetencion;
	protected JButton jButtonNuevoRelacionesToolBarEstadoRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoRetencion;
	protected JButton jButtonCopiarToolBarEstadoRetencion;
	protected JButton jButtonVerFormToolBarEstadoRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRetencion;
	protected JButton jButtonCerrarToolBarEstadoRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoRetencion;
	protected JButton jButtonProcesarInformacionToolBarEstadoRetencion;
	protected JButton jButtonAnterioresToolBarEstadoRetencion;
	protected JButton jButtonSiguientesToolBarEstadoRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoRetencion;
	protected JButton jButtonAbrirOrderByToolBarEstadoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRetencion;
	protected JMenuItem jMenuItemDuplicarEstadoRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoRetencion;
	protected JMenuItem jMenuItemCopiarEstadoRetencion;
	protected JMenuItem jMenuItemVerFormEstadoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRetencion;
	protected JMenuItem jMenuItemCerrarEstadoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoRetencion;
	protected JMenuItem jMenuItemProcesarInformacionEstadoRetencion;
	protected JMenuItem jMenuItemAnterioresEstadoRetencion;
	protected JMenuItem jMenuItemSiguientesEstadoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRetencion;
	protected JMenuItem jMenuItemAbrirOrderByEstadoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoRetencion;
	protected JCheckBox jCheckBoxSeleccionadosEstadoRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoRetencion;
	protected JTextField jTextFieldValorCampoGeneralEstadoRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoRetencion;
	//public JList<Reporte> jListColumnasSelectReporteEstadoRetencion;
	//public JScrollPane jScrollColumnasSelectReporteEstadoRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoRetencion;
	
		
	//public JLabel jLabelArchivoImportacionEstadoRetencion;	
	//public JLabel jLabelPathArchivoImportacionEstadoRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoRetencion;	
	
	
	
	
	
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
	public EstadoRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoRetencion)	{
		this.jButtonRecargarInformacionEstadoRetencion = jButtonRecargarInformacionEstadoRetencion;
	}
	
	public JButton getjButtonProcesarInformacionEstadoRetencion() {
		return this.jButtonProcesarInformacionEstadoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRetencion)	{
		this.jButtonProcesarInformacionEstadoRetencion = jButtonProcesarInformacionEstadoRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoRetencion() {
		return this.jButtonRecargarInformacionEstadoRetencion;
	}
	
	
	public List<EstadoRetencion> getestadoretencions() {
		return this.estadoretencions;
	}

	public void setestadoretencions(List<EstadoRetencion> estadoretencions) {
		this.estadoretencions = estadoretencions;
	}
	
	public List<EstadoRetencion> getestadoretencionsAux() {
		return this.estadoretencionsAux;
	}

	public void setestadoretencionsAux(List<EstadoRetencion> estadoretencionsAux) {
		this.estadoretencionsAux = estadoretencionsAux;
	}
	
	public List<EstadoRetencion> getestadoretencionsEliminados() {
		return this.estadoretencionsEliminados;
	}

	public void setEstadoRetencionsEliminados(List<EstadoRetencion> estadoretencionsEliminados) {
		this.estadoretencionsEliminados = estadoretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoRetencion() {
		return jComboBoxTiposSeleccionarEstadoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoRetencion(
			JComboBox jComboBoxTiposSeleccionarEstadoRetencion) {
		this.jComboBoxTiposSeleccionarEstadoRetencion = jComboBoxTiposSeleccionarEstadoRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoRetencion() {
		return jTextFieldValorCampoGeneralEstadoRetencion;
	}

	public void setjTextFieldValorCampoGeneralEstadoRetencion(
			JTextField jTextFieldValorCampoGeneralEstadoRetencion) {
		this.jTextFieldValorCampoGeneralEstadoRetencion = jTextFieldValorCampoGeneralEstadoRetencion;
	}

	public void setBorderResaltarValorCampoGeneralEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoRetencion() {
		return this.jCheckBoxSeleccionarTodosEstadoRetencion;
	}

	public void setjCheckBoxSeleccionarTodosEstadoRetencion(
			JCheckBox jCheckBoxSeleccionarTodosEstadoRetencion) {
		this.jCheckBoxSeleccionarTodosEstadoRetencion = jCheckBoxSeleccionarTodosEstadoRetencion;
	}

	public void setBorderResaltarSeleccionarTodosEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoRetencion() {
		return this.jCheckBoxSeleccionadosEstadoRetencion;
	}

	public void setjCheckBoxSeleccionadosEstadoRetencion(
			JCheckBox jCheckBoxSeleccionadosEstadoRetencion) {
		this.jCheckBoxSeleccionadosEstadoRetencion = jCheckBoxSeleccionadosEstadoRetencion;
	}
	
	public void setBorderResaltarSeleccionadosEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoRetencion() {
		return this.jComboBoxTiposArchivosReportesEstadoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoRetencion(
			JComboBox jComboBoxTiposArchivosReportesEstadoRetencion) {
		this.jComboBoxTiposArchivosReportesEstadoRetencion = jComboBoxTiposArchivosReportesEstadoRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoRetencion() {
		return this.jComboBoxTiposReportesEstadoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoRetencion(
			JComboBox jComboBoxTiposReportesEstadoRetencion) {
		this.jComboBoxTiposReportesEstadoRetencion = jComboBoxTiposReportesEstadoRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoRetencion() {
	//	return jComboBoxTiposReportesDinamicoEstadoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoRetencion) {
	//	this.jComboBoxTiposReportesDinamicoEstadoRetencion = jComboBoxTiposReportesDinamicoEstadoRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion = jComboBoxTiposArchivosReportesDinamicoEstadoRetencion;
	//}
	
	public void setBorderResaltarTiposReportesEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoRetencion() {
		return this.jComboBoxTiposGraficosReportesEstadoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoRetencion(
			JComboBox jComboBoxTiposGraficosReportesEstadoRetencion) {
		this.jComboBoxTiposGraficosReportesEstadoRetencion = jComboBoxTiposGraficosReportesEstadoRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoRetencion() {
		return this.jComboBoxTiposPaginacionEstadoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoRetencion(
			JComboBox jComboBoxTiposPaginacionEstadoRetencion) {
		this.jComboBoxTiposPaginacionEstadoRetencion = jComboBoxTiposPaginacionEstadoRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoRetencion() {
		return this.jComboBoxTiposRelacionesEstadoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRetencion() {
		return this.jComboBoxTiposAccionesEstadoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRetencion(
			JComboBox jComboBoxTiposRelacionesEstadoRetencion) {
		this.jComboBoxTiposRelacionesEstadoRetencion = jComboBoxTiposRelacionesEstadoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRetencion(
			JComboBox jComboBoxTiposAccionesEstadoRetencion) {
		this.jComboBoxTiposAccionesEstadoRetencion = jComboBoxTiposAccionesEstadoRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoRetencion() {
	//	return jCheckBoxConGraficoDinamicoEstadoRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoRetencion) {
	//	this.jCheckBoxConGraficoDinamicoEstadoRetencion = jCheckBoxConGraficoDinamicoEstadoRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoRetencion .setBorder(borderResaltar);		
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
		this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
		
		this.estadoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"nuevo","nuevo","Nuevo"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"duplicar","duplicar","Duplicar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"copiar","copiar","Copiar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"ver_form","ver_form","Ver"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"recargar","recargar","Recargar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoRetencion,this.jTtoolBarEstadoRetencion,
							"cerrar","cerrar","Salir"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoRetencion;
			
				this.jButtonProcesarInformacionToolBarEstadoRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoRetencion;
				
		//protected JButton jButtonModificarToolBarEstadoRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoRetencion=new JMenuMe("General");
		this.jmenuArchivoEstadoRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoRetencion=new JMenuMe("Acciones");
		this.jmenuDatosEstadoRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoRetencion.add(this.jMenuItemCerrarEstadoRetencion);
			
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemNuevoEstadoRetencion);
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemNuevoGuardarCambiosEstadoRetencion);
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemNuevoRelacionesEstadoRetencion);
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemGuardarCambiosTablaEstadoRetencion);		
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemDuplicarEstadoRetencion);		
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemCopiarEstadoRetencion);		
			this.jmenuAccionesEstadoRetencion.add(this.jMenuItemVerFormEstadoRetencion);		
			
			this.jmenuDatosEstadoRetencion.add(this.jMenuItemRecargarInformacionEstadoRetencion);				
			this.jmenuDatosEstadoRetencion.add(this.jMenuItemAnterioresEstadoRetencion);				
			this.jmenuDatosEstadoRetencion.add(this.jMenuItemSiguientesEstadoRetencion);				
			this.jmenuDatosEstadoRetencion.add(this.jMenuItemAbrirOrderByEstadoRetencion);				
			this.jmenuDatosEstadoRetencion.add(this.jMenuItemMostrarOcultarEstadoRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoRetencion.add(this.jMenuItemGuardarCambiosEstadoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoRetencion.add(this.jmenuArchivoEstadoRetencion);		
			this.jmenuBarEstadoRetencion.add(this.jmenuAccionesEstadoRetencion);		
			this.jmenuBarEstadoRetencion.add(this.jmenuDatosEstadoRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoRetencion() {
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
			//this.jInternalFrameDetalleEstadoRetencion = new EstadoRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Retencion DATOS");
			this.jInternalFrameDetalleFormEstadoRetencion = new EstadoRetencionDetalleFormJInternalFrame(jDesktopPane,this.estadoretencionSessionBean.getConGuardarRelaciones(),this.estadoretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoRetencion = null;//new EstadoRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRetencion= new GridBagLayout();
		
		
		this.jTableDatosEstadoRetencion = new JTableMe();      
		
		String sToolTipEstadoRetencion="";
		sToolTipEstadoRetencion=EstadoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRetencion+="(Facturacion.EstadoRetencion)";
		}
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoRetencion.setToolTipText(sToolTipEstadoRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoRetencion);
		this.jTableDatosEstadoRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoRetencion.setRowSelectionAllowed(true);
		this.jTableDatosEstadoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoRetencion = new JButtonMe();
		this.jButtonDuplicarEstadoRetencion = new JButtonMe();
		this.jButtonCopiarEstadoRetencion = new JButtonMe();
		this.jButtonVerFormEstadoRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoRetencion = new JButtonMe();
		this.jButtonCerrarEstadoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Retencion";
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoRetencion=new ReporteDinamicoJInternalFrame(EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoRetencion=new ImportacionJInternalFrame(EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoRetencion.setText("Orden");
		this.jButtonAbrirOrderByEstadoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRetencion,false,this);
			
			//this.cargarOrderByEstadoRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRetencion,true,this);
			
			//this.cargarOrderByEstadoRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoRetencion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRetencion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRetencion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoRetencion.setText("Nuevo");
		this.jButtonDuplicarEstadoRetencion.setText("Duplicar");
		this.jButtonCopiarEstadoRetencion.setText("Copiar");
		this.jButtonVerFormEstadoRetencion.setText("Ver");
		this.jButtonNuevoRelacionesEstadoRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.setText("Guardar");
		this.jButtonCerrarEstadoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRetencion,"nuevo_button","Nuevo",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoRetencion,"duplicar_button","Duplicar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoRetencion,"copiar_button","Copiar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoRetencion,"ver_form","Ver",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoRetencion,"nuevorelaciones_button","Nuevo Rel",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRetencion,"guardarcambiostabla_button","Guardar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRetencion,"cerrar_button","Salir",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoRetencion.setToolTipText("Nuevo"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoRetencion.setToolTipText("Duplicar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoRetencion.setToolTipText("Copiar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoRetencion.setToolTipText("Ver"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoRetencion.setToolTipText("Nuevo Rel"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.setToolTipText("Guardar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRetencion.setToolTipText("Salir"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRetencion";
		inputMap = this.jButtonNuevoEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoRetencion";
		inputMap = this.jButtonDuplicarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoRetencion"));
		
		//COPIAR
		sMapKey = "CopiarEstadoRetencion";
		inputMap = this.jButtonCopiarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoRetencion";
		inputMap = this.jButtonVerFormEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoRetencion";
		inputMap = this.jButtonNuevoRelacionesEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoRetencion";
		inputMap = this.jButtonModificarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoRetencion";
		inputMap = this.jButtonCerrarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoRetencion.setName("jPanelParametrosReportesEstadoRetencion"); 
		
		this.jPanelParametrosReportesAccionesEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoRetencion.setName("jPanelParametrosReportesAccionesEstadoRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoRetencion = new JButtonMe();
		this.jButtonRecargarInformacionEstadoRetencion.setText("Recargar");
		this.jButtonRecargarInformacionEstadoRetencion.setToolTipText("Recargar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoRetencion = new JButtonMe();
		this.jButtonProcesarInformacionEstadoRetencion.setText("Procesar");
		this.jButtonProcesarInformacionEstadoRetencion.setToolTipText("Procesar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoRetencion = new JLabelMe();
		
		this.jLabelAccionesEstadoRetencion.setText("Acciones");		
		this.jLabelAccionesEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoRetencion = new JButtonMe();
		//this.jButtonAnterioresEstadoRetencion.setText("<<");
        this.jButtonAnterioresEstadoRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoRetencion = new JButtonMe();
		//this.jButtonSiguientesEstadoRetencion.setText(">>");
        this.jButtonSiguientesEstadoRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoRetencion,"nuevoguardarcambios_button","Nue",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoRetencion";
		inputMap = this.jButtonRecargarInformacionEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoRetencion";
		inputMap = this.jButtonSiguientesEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoRetencion";
		inputMap = this.jButtonAnterioresEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoRetencion.setMinimumSize(new Dimension(this.getWidth(),EstadoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRetencion.setMaximumSize(new Dimension(this.getWidth(),EstadoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRetencion.setPreferredSize(new Dimension(this.getWidth(),EstadoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoRetencion = new GridBagLayout();

			this.jPanelPaginacionEstadoRetencion.setLayout(gridaBagLayoutPaginacionEstadoRetencion);						
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 0;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonAnterioresEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					
						
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRetencion.gridy = 0;
			
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonNuevoGuardarCambiosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
						
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRetencion.gridy = 0;
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonSiguientesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 1;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonNuevoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRetencion.gridy = 1;
				this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoRetencion.add(this.jButtonNuevoRelacionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			}
			
			
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRetencion.gridy = 1;
				this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoRetencion.add(this.jButtonGuardarCambiosTablaEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			}
			
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 1;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonDuplicarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 1;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonCopiarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 1;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonVerFormEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 1;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoRetencion.add(this.jButtonCerrarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
		
		
		this.jButtonRecargarInformacionEstadoRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoRetencion.setLayout(gridaBagParametrosReportesEstadoRetencion);
			this.jPanelParametrosReportesAccionesEstadoRetencion.setLayout(gridaBagParametrosReportesAccionesEstadoRetencion);
			
			
			this.jPanelParametrosAuxiliar1EstadoRetencion.setLayout(gridaBagParametrosAuxiliar1EstadoRetencion);
			this.jPanelParametrosAuxiliar2EstadoRetencion.setLayout(gridaBagParametrosAuxiliar2EstadoRetencion);
			this.jPanelParametrosAuxiliar3EstadoRetencion.setLayout(gridaBagParametrosAuxiliar3EstadoRetencion);
			this.jPanelParametrosAuxiliar4EstadoRetencion.setLayout(gridaBagParametrosAuxiliar4EstadoRetencion);
			//this.jPanelParametrosAuxiliar5EstadoRetencion.setLayout(gridaBagParametrosAuxiliar2EstadoRetencion);			
			
			
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRetencion.add(this.jButtonRecargarInformacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRetencion.add(this.jComboBoxTiposPaginacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRetencion.add(this.jCheckBoxConAltoMaximoTablaEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRetencion.add(this.jComboBoxTiposArchivosReportesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRetencion.add(this.jPanelParametrosAuxiliar1EstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoRetencion.add(this.jComboBoxTiposReportesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRetencion.add(this.jPanelParametrosAuxiliar4EstadoRetencion, this.gridBagConstraintsEstadoRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRetencion.add(this.jComboBoxTiposReportesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRetencion.add(this.jCheckBoxGenerarReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRetencion.add(this.jPanelParametrosAuxiliar2EstadoRetencion, this.gridBagConstraintsEstadoRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRetencion.add(this.jLabelAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoRetencion.add(this.jButtonAbrirOrderByEstadoRetencion, this.gridBagConstraintsEstadoRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRetencion.add(this.jComboBoxTiposSeleccionarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
			
			
			/*
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRetencion.add(this.jCheckBoxSeleccionarTodosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRetencion.add(this.jCheckBoxSeleccionarTodosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);															
				
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRetencion.add(this.jCheckBoxSeleccionadosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRetencion.add(this.jPanelParametrosAuxiliar3EstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRetencion.add(this.jComboBoxTiposRelacionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
				
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRetencion.add(this.jComboBoxTiposAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoRetencion = new GridBagLayout();

			this.jScrollPanelDatosEstadoRetencion.setLayout(gridaBagLayoutDatosEstadoRetencion);
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = 0;
			this.gridBagConstraintsEstadoRetencion.gridx = 0;
			
			this.jScrollPanelDatosEstadoRetencion.add(this.jTableDatosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoRetencion.setViewportView(this.jTableDatosEstadoRetencion);
		this.jTableDatosEstadoRetencion.setFillsViewportHeight(true);
		this.jTableDatosEstadoRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoRetencion= new GridBagLayout();
		this.jPanelAccionesEstadoRetencion.setLayout(gridaBagLayoutAccionesEstadoRetencion);
		
		
		/*	
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = 0;
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
			
		this.jPanelAccionesEstadoRetencion.add(this.jButtonNuevoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRetencion.gridx = 0;		
			//this.gridBagConstraintsEstadoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoRetencion.gridx = 0;		
		//this.gridBagConstraintsEstadoRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);								
		
		
		/*
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		*/		
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRetencion.gridx =0;
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
				
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoRetencion.setLayout(gridaBagLayoutBusquedasParametrosEstadoRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoRetencion.setName("jPanelReporteDinamicoEstadoRetencion"); 
		
		this.jPanelReporteDinamicoEstadoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoRetencion.setLayout(gridaBagLayoutReporteDinamicoEstadoRetencion);
		
		
		this.jInternalFrameReporteDinamicoEstadoRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jLabelColumnasSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoRetencion=new JScrollPane(this.jListColumnasSelectReporteEstadoRetencion);
			
			this.jScrollColumnasSelectReporteEstadoRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRetencion.add(this.jListColumnasSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jScrollColumnasSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jLabelRelacionesSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoRetencion=new JScrollPane(this.jListRelacionesSelectReporteEstadoRetencion);
			
			this.jScrollRelacionesSelectReporteEstadoRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRetencion.add(this.jListRelacionesSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jScrollRelacionesSelectReporteEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jLabelGenerarExcelReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoRetencion.setToolTipText("Generar EXCEL"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoRetencion.add(this.jButtonGenerarExcelReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jComboBoxTiposReportesDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jLabelTiposArchivoReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoRetencion.setToolTipText("Generar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jButtonGenerarReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoRetencion.setToolTipText("Cancelar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRetencion.add(this.jButtonCerrarReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoRetencion= new JScrollPane(jPanelReporteDinamicoEstadoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoRetencion);
		this.jInternalFrameReporteDinamicoEstadoRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoRetencion.setName("jPanelImportacionEstadoRetencion"); 
		
		this.jPanelImportacionEstadoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoRetencion.setLayout(gridaBagLayoutImportacionEstadoRetencion);
		
		
		this.jInternalFrameImportacionEstadoRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRetencion.setResizable(true);
	    this.jInternalFrameImportacionEstadoRetencion.setClosable(true);
	    this.jInternalFrameImportacionEstadoRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRetencion.setResizable(true);
	    this.jInternalFrameImportacionEstadoRetencion.setClosable(true);
	    this.jInternalFrameImportacionEstadoRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoRetencion = new JLabelMe();

		this.jLabelArchivoImportacionEstadoRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRetencion.add(this.jLabelArchivoImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoRetencion = new JFileChooser();		
		this.jFileChooserImportacionEstadoRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoRetencion = new JButtonMe();
		this.jButtonAbrirImportacionEstadoRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoRetencion.setToolTipText("Generar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRetencion.add(this.jButtonAbrirImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRetencion.add(this.jLabelPathArchivoImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRetencion.add(this.jTextFieldPathArchivoImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoRetencion = new JButtonMe();
		this.jButtonGenerarImportacionEstadoRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoRetencion.setToolTipText("Generar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRetencion.add(this.jButtonGenerarImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoRetencion = new JButtonMe();
		this.jButtonCerrarImportacionEstadoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoRetencion.setToolTipText("Cancelar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRetencion.add(this.jButtonCerrarImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoRetencion= new JScrollPane(jPanelImportacionEstadoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoRetencion);
		this.jInternalFrameImportacionEstadoRetencion.getContentPane().add(this.jScrollPanelImportacionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoRetencion = new JButtonMe();
			this.jButtonAbrirOrderByEstadoRetencion.setText("Orden");
			this.jButtonAbrirOrderByEstadoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoRetencion";
			inputMap = this.jButtonAbrirOrderByEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoRetencion.setName("jPanelOrderByEstadoRetencion"); 
			
			this.jPanelOrderByEstadoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoRetencion.setLayout(gridaBagLayoutOrderByEstadoRetencion);
			
			
			this.jTableDatosEstadoRetencionOrderBy = new JTableMe();        
			this.jTableDatosEstadoRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoRetencionOrderBy.setViewportView(this.jTableDatosEstadoRetencionOrderBy);
			this.jTableDatosEstadoRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoRetencion.setTitle("Orden");
			this.jInternalFrameOrderByEstadoRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoRetencion.setResizable(true);
			this.jInternalFrameOrderByEstadoRetencion.setClosable(true);
			this.jInternalFrameOrderByEstadoRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoRetencion.ipady =150;
				
			this.jPanelOrderByEstadoRetencion.add(jScrollPanelDatosEstadoRetencionOrderBy, this.gridBagConstraintsEstadoRetencion);//this.jTableDatosEstadoRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoRetencion = new JButtonMe();
			this.jButtonCerrarOrderByEstadoRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoRetencion.setToolTipText("Cancelar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoRetencion.add(this.jButtonCerrarOrderByEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoRetencion= new JScrollPane(jPanelOrderByEstadoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoRetencion);
			
			this.jInternalFrameOrderByEstadoRetencion.getContentPane().add(this.jScrollPanelOrderByEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
		
		} else {
			this.jButtonAbrirOrderByEstadoRetencion = new JButtonMe();
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
			&& this.estadoretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoRetencion.getRowHeight();//EstadoRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRetencion.isSelected()) {
					iHeightTable=EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRetencion.isSelected()) {
					iHeightTable=EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoRetencion!=null && this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoretencionLogic.getEstadoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoRetencion> TraerEstadoRetencionBeans(List<EstadoRetencion> estadoretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoRetencion estadoretencion:estadoretencions) {
					
				if(!(EstadoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoretencion.setsDetalleGeneralEntityReporte(EstadoRetencionConstantesFunciones.getEstadoRetencionDescripcion(estadoretencion));
										
						
					
					

					if(estadoretencion.getClienteRetencions()!=null && Funciones.existeClass(classes,ClienteRetencion.class)) {
						try{estadoretencion.setclienteretencionsDescripcionReporte(new JRBeanCollectionDataSource(ClienteRetencionJInternalFrame.TraerClienteRetencionBeans(estadoretencion.getClienteRetencions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadoretencion.getRetencions()!=null && Funciones.existeClass(classes,Retencion.class)) {
						try{estadoretencion.setretencionsDescripcionReporte(new JRBeanCollectionDataSource(RetencionJInternalFrame.TraerRetencionBeans(estadoretencion.getRetencions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoretencion.setsDetalleGeneralEntityReporte(estadoretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoretencionbeans.add(estadoretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoretencions;
    }
	//PARA REPORTES FIN
}
