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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.EstadoRequisicionConstantesFunciones;

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
public class EstadoRequisicionJInternalFrame extends EstadoRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoRequisicion;
	
	protected JMenuBar jmenuBarEstadoRequisicion;
	
	protected JMenu jmenuEstadoRequisicion;
	protected JMenu jmenuDatosEstadoRequisicion;
	protected JMenu jmenuArchivoEstadoRequisicion;
	protected JMenu jmenuAccionesEstadoRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRequisicion;	
	protected GridBagConstraints gridBagConstraintsEstadoRequisicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoRequisicionDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoRequisicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoRequisicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoRequisicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRequisicionSessionBean estadorequisicionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoRequisicion> estadorequisicions;		
	public List<EstadoRequisicion> estadorequisicionsEliminados;	
	public List<EstadoRequisicion> estadorequisicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoRequisicion;		
	protected JButton jButtonAbrirOrderByEstadoRequisicion;
	
	
	//protected JPanel jPanelOrderByEstadoRequisicion;
	//public JScrollPane jScrollPanelOrderByEstadoRequisicion;	
	//protected JButton jButtonCerrarOrderByEstadoRequisicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoRequisicionLogic estadorequisicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoRequisicion;
	public JScrollPane jScrollPanelDatosEdicionEstadoRequisicion;
	public JScrollPane jScrollPanelDatosGeneralEstadoRequisicion;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoRequisicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoRequisicion;
	//public JScrollPane jScrollPanelImportacionEstadoRequisicion;
	
	
	
	protected JPanel jPanelAccionesEstadoRequisicion;
	
    protected JPanel jPanelPaginacionEstadoRequisicion;
    protected JPanel jPanelParametrosReportesEstadoRequisicion;
	protected JPanel jPanelParametrosReportesAccionesEstadoRequisicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoRequisicion;
	protected JPanel jPanelParametrosAuxiliar2EstadoRequisicion;
	protected JPanel jPanelParametrosAuxiliar3EstadoRequisicion;
	protected JPanel jPanelParametrosAuxiliar4EstadoRequisicion;
	//protected JPanel jPanelParametrosAuxiliar5EstadoRequisicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoRequisicion;
	//protected JPanel jPanelImportacionEstadoRequisicion;
	
	
	public JTable jTableDatosEstadoRequisicion;
	
	
	
	//public JTable jTableDatosEstadoRequisicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoRequisicion;
	protected JButton jButtonDuplicarEstadoRequisicion;
	protected JButton jButtonCopiarEstadoRequisicion;
	protected JButton jButtonVerFormEstadoRequisicion;
	protected JButton jButtonNuevoRelacionesEstadoRequisicion;
	protected JButton jButtonModificarEstadoRequisicion;
	
    protected JButton jButtonGuardarCambiosTablaEstadoRequisicion;
	protected JButton jButtonCerrarEstadoRequisicion;
	
	
	protected JButton jButtonRecargarInformacionEstadoRequisicion;
	protected JButton jButtonProcesarInformacionEstadoRequisicion;
	
	
	protected JButton jButtonAnterioresEstadoRequisicion;
	protected JButton jButtonSiguientesEstadoRequisicion;
	protected JButton jButtonNuevoGuardarCambiosEstadoRequisicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoRequisicion;
	//protected JButton jButtonCerrarReporteDinamicoEstadoRequisicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoRequisicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoRequisicion;
	//protected JButton jButtonGenerarImportacionEstadoRequisicion;
	//protected JButton jButtonCerrarImportacionEstadoRequisicion;
	//protected JFileChooser jFileChooserImportacionEstadoRequisicion;
	//protected File fileImportacionEstadoRequisicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRequisicion;
	protected JButton jButtonDuplicarToolBarEstadoRequisicion;
	protected JButton jButtonNuevoRelacionesToolBarEstadoRequisicion;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoRequisicion;
	protected JButton jButtonCopiarToolBarEstadoRequisicion;
	protected JButton jButtonVerFormToolBarEstadoRequisicion;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRequisicion;
	protected JButton jButtonCerrarToolBarEstadoRequisicion;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoRequisicion;
	protected JButton jButtonProcesarInformacionToolBarEstadoRequisicion;
	protected JButton jButtonAnterioresToolBarEstadoRequisicion;
	protected JButton jButtonSiguientesToolBarEstadoRequisicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoRequisicion;
	protected JButton jButtonAbrirOrderByToolBarEstadoRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRequisicion;
	protected JMenuItem jMenuItemDuplicarEstadoRequisicion;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoRequisicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoRequisicion;
	protected JMenuItem jMenuItemCopiarEstadoRequisicion;
	protected JMenuItem jMenuItemVerFormEstadoRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRequisicion;
	protected JMenuItem jMenuItemCerrarEstadoRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRequisicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRequisicion;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoRequisicion;
	protected JMenuItem jMenuItemProcesarInformacionEstadoRequisicion;
	protected JMenuItem jMenuItemAnterioresEstadoRequisicion;
	protected JMenuItem jMenuItemSiguientesEstadoRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRequisicion;
	protected JMenuItem jMenuItemAbrirOrderByEstadoRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRequisicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoRequisicion;
	protected JCheckBox jCheckBoxSeleccionadosEstadoRequisicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoRequisicion;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoRequisicion;
	protected JTextField jTextFieldValorCampoGeneralEstadoRequisicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoRequisicion;
	//public JList<Reporte> jListColumnasSelectReporteEstadoRequisicion;
	//public JScrollPane jScrollColumnasSelectReporteEstadoRequisicion;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoRequisicion;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoRequisicion;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoRequisicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoRequisicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoRequisicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoRequisicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoRequisicion;
	
		
	//public JLabel jLabelArchivoImportacionEstadoRequisicion;	
	//public JLabel jLabelPathArchivoImportacionEstadoRequisicion;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoRequisicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoRequisicion;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoRequisicion;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoRequisicion;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoRequisicion;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoRequisicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoRequisicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoRequisicion;	
	
	
	
	
	
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
	public EstadoRequisicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoRequisicion)	{
		this.jButtonRecargarInformacionEstadoRequisicion = jButtonRecargarInformacionEstadoRequisicion;
	}
	
	public JButton getjButtonProcesarInformacionEstadoRequisicion() {
		return this.jButtonProcesarInformacionEstadoRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRequisicion)	{
		this.jButtonProcesarInformacionEstadoRequisicion = jButtonProcesarInformacionEstadoRequisicion;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoRequisicion() {
		return this.jButtonRecargarInformacionEstadoRequisicion;
	}
	
	
	public List<EstadoRequisicion> getestadorequisicions() {
		return this.estadorequisicions;
	}

	public void setestadorequisicions(List<EstadoRequisicion> estadorequisicions) {
		this.estadorequisicions = estadorequisicions;
	}
	
	public List<EstadoRequisicion> getestadorequisicionsAux() {
		return this.estadorequisicionsAux;
	}

	public void setestadorequisicionsAux(List<EstadoRequisicion> estadorequisicionsAux) {
		this.estadorequisicionsAux = estadorequisicionsAux;
	}
	
	public List<EstadoRequisicion> getestadorequisicionsEliminados() {
		return this.estadorequisicionsEliminados;
	}

	public void setEstadoRequisicionsEliminados(List<EstadoRequisicion> estadorequisicionsEliminados) {
		this.estadorequisicionsEliminados = estadorequisicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoRequisicion() {
		return jComboBoxTiposSeleccionarEstadoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoRequisicion(
			JComboBox jComboBoxTiposSeleccionarEstadoRequisicion) {
		this.jComboBoxTiposSeleccionarEstadoRequisicion = jComboBoxTiposSeleccionarEstadoRequisicion;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoRequisicion() {
		return jTextFieldValorCampoGeneralEstadoRequisicion;
	}

	public void setjTextFieldValorCampoGeneralEstadoRequisicion(
			JTextField jTextFieldValorCampoGeneralEstadoRequisicion) {
		this.jTextFieldValorCampoGeneralEstadoRequisicion = jTextFieldValorCampoGeneralEstadoRequisicion;
	}

	public void setBorderResaltarValorCampoGeneralEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoRequisicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoRequisicion() {
		return this.jCheckBoxSeleccionarTodosEstadoRequisicion;
	}

	public void setjCheckBoxSeleccionarTodosEstadoRequisicion(
			JCheckBox jCheckBoxSeleccionarTodosEstadoRequisicion) {
		this.jCheckBoxSeleccionarTodosEstadoRequisicion = jCheckBoxSeleccionarTodosEstadoRequisicion;
	}

	public void setBorderResaltarSeleccionarTodosEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoRequisicion() {
		return this.jCheckBoxSeleccionadosEstadoRequisicion;
	}

	public void setjCheckBoxSeleccionadosEstadoRequisicion(
			JCheckBox jCheckBoxSeleccionadosEstadoRequisicion) {
		this.jCheckBoxSeleccionadosEstadoRequisicion = jCheckBoxSeleccionadosEstadoRequisicion;
	}
	
	public void setBorderResaltarSeleccionadosEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoRequisicion() {
		return this.jComboBoxTiposArchivosReportesEstadoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoRequisicion(
			JComboBox jComboBoxTiposArchivosReportesEstadoRequisicion) {
		this.jComboBoxTiposArchivosReportesEstadoRequisicion = jComboBoxTiposArchivosReportesEstadoRequisicion;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoRequisicion() {
		return this.jComboBoxTiposReportesEstadoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoRequisicion(
			JComboBox jComboBoxTiposReportesEstadoRequisicion) {
		this.jComboBoxTiposReportesEstadoRequisicion = jComboBoxTiposReportesEstadoRequisicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoRequisicion() {
	//	return jComboBoxTiposReportesDinamicoEstadoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoRequisicion(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoRequisicion) {
	//	this.jComboBoxTiposReportesDinamicoEstadoRequisicion = jComboBoxTiposReportesDinamicoEstadoRequisicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoRequisicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoRequisicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion = jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion;
	//}
	
	public void setBorderResaltarTiposReportesEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoRequisicion() {
		return this.jComboBoxTiposGraficosReportesEstadoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoRequisicion(
			JComboBox jComboBoxTiposGraficosReportesEstadoRequisicion) {
		this.jComboBoxTiposGraficosReportesEstadoRequisicion = jComboBoxTiposGraficosReportesEstadoRequisicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoRequisicion() {
		return this.jComboBoxTiposPaginacionEstadoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoRequisicion(
			JComboBox jComboBoxTiposPaginacionEstadoRequisicion) {
		this.jComboBoxTiposPaginacionEstadoRequisicion = jComboBoxTiposPaginacionEstadoRequisicion;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoRequisicion() {
		return this.jComboBoxTiposRelacionesEstadoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRequisicion() {
		return this.jComboBoxTiposAccionesEstadoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRequisicion(
			JComboBox jComboBoxTiposRelacionesEstadoRequisicion) {
		this.jComboBoxTiposRelacionesEstadoRequisicion = jComboBoxTiposRelacionesEstadoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRequisicion(
			JComboBox jComboBoxTiposAccionesEstadoRequisicion) {
		this.jComboBoxTiposAccionesEstadoRequisicion = jComboBoxTiposAccionesEstadoRequisicion;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoRequisicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoRequisicion() {
	//	return jCheckBoxConGraficoDinamicoEstadoRequisicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoRequisicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoRequisicion) {
	//	this.jCheckBoxConGraficoDinamicoEstadoRequisicion = jCheckBoxConGraficoDinamicoEstadoRequisicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoRequisicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoRequisicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoRequisicion .setBorder(borderResaltar);		
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
		this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		
		this.estadorequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadorequisicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoRequisicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"nuevo","nuevo","Nuevo"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"duplicar","duplicar","Duplicar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"copiar","copiar","Copiar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"ver_form","ver_form","Ver"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"recargar","recargar","Recargar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoRequisicion,this.jTtoolBarEstadoRequisicion,
							"cerrar","cerrar","Salir"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoRequisicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoRequisicion;
			
				this.jButtonProcesarInformacionToolBarEstadoRequisicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoRequisicion;
				
		//protected JButton jButtonModificarToolBarEstadoRequisicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoRequisicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoRequisicion=new JMenuMe("General");
		this.jmenuArchivoEstadoRequisicion=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoRequisicion=new JMenuMe("Acciones");
		this.jmenuDatosEstadoRequisicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoRequisicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoRequisicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoRequisicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoRequisicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoRequisicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoRequisicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoRequisicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoRequisicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoRequisicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoRequisicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoRequisicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoRequisicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoRequisicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoRequisicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoRequisicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoRequisicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoRequisicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoRequisicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoRequisicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoRequisicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoRequisicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoRequisicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoRequisicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoRequisicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoRequisicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoRequisicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoRequisicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoRequisicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoRequisicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoRequisicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoRequisicion.add(this.jMenuItemCerrarEstadoRequisicion);
			
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemNuevoEstadoRequisicion);
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemNuevoGuardarCambiosEstadoRequisicion);
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemNuevoRelacionesEstadoRequisicion);
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemGuardarCambiosTablaEstadoRequisicion);		
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemDuplicarEstadoRequisicion);		
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemCopiarEstadoRequisicion);		
			this.jmenuAccionesEstadoRequisicion.add(this.jMenuItemVerFormEstadoRequisicion);		
			
			this.jmenuDatosEstadoRequisicion.add(this.jMenuItemRecargarInformacionEstadoRequisicion);				
			this.jmenuDatosEstadoRequisicion.add(this.jMenuItemAnterioresEstadoRequisicion);				
			this.jmenuDatosEstadoRequisicion.add(this.jMenuItemSiguientesEstadoRequisicion);				
			this.jmenuDatosEstadoRequisicion.add(this.jMenuItemAbrirOrderByEstadoRequisicion);				
			this.jmenuDatosEstadoRequisicion.add(this.jMenuItemMostrarOcultarEstadoRequisicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoRequisicion.add(this.jMenuItemGuardarCambiosEstadoRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoRequisicion.add(this.jmenuArchivoEstadoRequisicion);		
			this.jmenuBarEstadoRequisicion.add(this.jmenuAccionesEstadoRequisicion);		
			this.jmenuBarEstadoRequisicion.add(this.jmenuDatosEstadoRequisicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoRequisicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoRequisicion() {
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
			//this.jInternalFrameDetalleEstadoRequisicion = new EstadoRequisicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Requisicion DATOS");
			this.jInternalFrameDetalleFormEstadoRequisicion = new EstadoRequisicionDetalleFormJInternalFrame(jDesktopPane,this.estadorequisicionSessionBean.getConGuardarRelaciones(),this.estadorequisicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoRequisicion = null;//new EstadoRequisicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRequisicion= new GridBagLayout();
		
		
		this.jTableDatosEstadoRequisicion = new JTableMe();      
		
		String sToolTipEstadoRequisicion="";
		sToolTipEstadoRequisicion=EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRequisicion+="(Inventario.EstadoRequisicion)";
		}
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRequisicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoRequisicion.setToolTipText(sToolTipEstadoRequisicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoRequisicion);
		this.jTableDatosEstadoRequisicion.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoRequisicion.setRowSelectionAllowed(true);
		this.jTableDatosEstadoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoRequisicion = new JButtonMe();
		this.jButtonDuplicarEstadoRequisicion = new JButtonMe();
		this.jButtonCopiarEstadoRequisicion = new JButtonMe();
		this.jButtonVerFormEstadoRequisicion = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoRequisicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion = new JButtonMe();
		this.jButtonCerrarEstadoRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRequisicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoRequisicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Requisicion";
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRequisicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoRequisicion=new ReporteDinamicoJInternalFrame(EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoRequisicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoRequisicion=new ImportacionJInternalFrame(EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoRequisicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoRequisicion = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoRequisicion.setText("Orden");
		this.jButtonAbrirOrderByEstadoRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRequisicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRequisicion,false,this);
			
			//this.cargarOrderByEstadoRequisicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRequisicion,true,this);
			
			//this.cargarOrderByEstadoRequisicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoRequisicion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRequisicion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRequisicion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoRequisicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRequisicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRequisicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoRequisicion.setText("Nuevo");
		this.jButtonDuplicarEstadoRequisicion.setText("Duplicar");
		this.jButtonCopiarEstadoRequisicion.setText("Copiar");
		this.jButtonVerFormEstadoRequisicion.setText("Ver");
		this.jButtonNuevoRelacionesEstadoRequisicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.setText("Guardar");
		this.jButtonCerrarEstadoRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRequisicion,"nuevo_button","Nuevo",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoRequisicion,"duplicar_button","Duplicar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoRequisicion,"copiar_button","Copiar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoRequisicion,"ver_form","Ver",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoRequisicion,"nuevorelaciones_button","Nuevo Rel",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRequisicion,"guardarcambiostabla_button","Guardar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRequisicion,"cerrar_button","Salir",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoRequisicion.setToolTipText("Nuevo"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoRequisicion.setToolTipText("Duplicar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoRequisicion.setToolTipText("Copiar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoRequisicion.setToolTipText("Ver"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoRequisicion.setToolTipText("Nuevo Rel"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.setToolTipText("Guardar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRequisicion.setToolTipText("Salir"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRequisicion";
		inputMap = this.jButtonNuevoEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRequisicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoRequisicion";
		inputMap = this.jButtonDuplicarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoRequisicion"));
		
		//COPIAR
		sMapKey = "CopiarEstadoRequisicion";
		inputMap = this.jButtonCopiarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoRequisicion"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoRequisicion";
		inputMap = this.jButtonVerFormEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoRequisicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoRequisicion";
		inputMap = this.jButtonNuevoRelacionesEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoRequisicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoRequisicion";
		inputMap = this.jButtonModificarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoRequisicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoRequisicion";
		inputMap = this.jButtonCerrarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRequisicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoRequisicion.setName("jPanelParametrosReportesEstadoRequisicion"); 
		
		this.jPanelParametrosReportesAccionesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoRequisicion.setName("jPanelParametrosReportesAccionesEstadoRequisicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoRequisicion = new JButtonMe();
		this.jButtonRecargarInformacionEstadoRequisicion.setText("Recargar");
		this.jButtonRecargarInformacionEstadoRequisicion.setToolTipText("Recargar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoRequisicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoRequisicion = new JButtonMe();
		this.jButtonProcesarInformacionEstadoRequisicion.setText("Procesar");
		this.jButtonProcesarInformacionEstadoRequisicion.setToolTipText("Procesar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoRequisicion.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoRequisicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRequisicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRequisicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRequisicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoRequisicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRequisicion.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoRequisicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRequisicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoRequisicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoRequisicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoRequisicion.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoRequisicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRequisicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoRequisicion.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoRequisicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoRequisicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoRequisicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRequisicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRequisicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoRequisicion = new JLabelMe();
		
		this.jLabelAccionesEstadoRequisicion.setText("Acciones");		
		this.jLabelAccionesEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoRequisicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoRequisicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoRequisicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoRequisicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoRequisicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoRequisicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoRequisicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoRequisicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoRequisicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoRequisicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoRequisicion = new JButtonMe();
		//this.jButtonAnterioresEstadoRequisicion.setText("<<");
        this.jButtonAnterioresEstadoRequisicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoRequisicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoRequisicion = new JButtonMe();
		//this.jButtonSiguientesEstadoRequisicion.setText(">>");
        this.jButtonSiguientesEstadoRequisicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoRequisicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoRequisicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoRequisicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoRequisicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoRequisicion,"nuevoguardarcambios_button","Nue",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoRequisicion";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoRequisicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoRequisicion";
		inputMap = this.jButtonRecargarInformacionEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoRequisicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoRequisicion";
		inputMap = this.jButtonSiguientesEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoRequisicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoRequisicion";
		inputMap = this.jButtonAnterioresEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoRequisicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoRequisicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoRequisicion.setMinimumSize(new Dimension(this.getWidth(),EstadoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRequisicion.setMaximumSize(new Dimension(this.getWidth(),EstadoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRequisicion.setPreferredSize(new Dimension(this.getWidth(),EstadoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoRequisicion = new GridBagLayout();

			this.jPanelPaginacionEstadoRequisicion.setLayout(gridaBagLayoutPaginacionEstadoRequisicion);						
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 0;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonAnterioresEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					
						
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRequisicion.gridy = 0;
			
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonNuevoGuardarCambiosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
						
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRequisicion.gridy = 0;
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonSiguientesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 1;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonNuevoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRequisicion.gridy = 1;
				this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoRequisicion.add(this.jButtonNuevoRelacionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			}
			
			
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRequisicion.gridy = 1;
				this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoRequisicion.add(this.jButtonGuardarCambiosTablaEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			}
			
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 1;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonDuplicarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 1;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonCopiarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 1;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonVerFormEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 1;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoRequisicion.add(this.jButtonCerrarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
		
		
		this.jButtonRecargarInformacionEstadoRequisicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRequisicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRequisicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoRequisicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRequisicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRequisicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoRequisicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRequisicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRequisicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoRequisicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRequisicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRequisicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoRequisicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRequisicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRequisicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoRequisicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoRequisicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoRequisicion.setLayout(gridaBagParametrosReportesEstadoRequisicion);
			this.jPanelParametrosReportesAccionesEstadoRequisicion.setLayout(gridaBagParametrosReportesAccionesEstadoRequisicion);
			
			
			this.jPanelParametrosAuxiliar1EstadoRequisicion.setLayout(gridaBagParametrosAuxiliar1EstadoRequisicion);
			this.jPanelParametrosAuxiliar2EstadoRequisicion.setLayout(gridaBagParametrosAuxiliar2EstadoRequisicion);
			this.jPanelParametrosAuxiliar3EstadoRequisicion.setLayout(gridaBagParametrosAuxiliar3EstadoRequisicion);
			this.jPanelParametrosAuxiliar4EstadoRequisicion.setLayout(gridaBagParametrosAuxiliar4EstadoRequisicion);
			//this.jPanelParametrosAuxiliar5EstadoRequisicion.setLayout(gridaBagParametrosAuxiliar2EstadoRequisicion);			
			
			
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jButtonRecargarInformacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRequisicion.add(this.jComboBoxTiposPaginacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRequisicion.add(this.jCheckBoxConAltoMaximoTablaEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRequisicion.add(this.jComboBoxTiposArchivosReportesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jPanelParametrosAuxiliar1EstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoRequisicion.add(this.jComboBoxTiposReportesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jPanelParametrosAuxiliar4EstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jComboBoxTiposReportesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jCheckBoxGenerarReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jPanelParametrosAuxiliar2EstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jLabelAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoRequisicion.add(this.jButtonAbrirOrderByEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jComboBoxTiposSeleccionarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			
			
			/*
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jCheckBoxSeleccionarTodosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRequisicion.add(this.jCheckBoxSeleccionarTodosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);															
				
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRequisicion.add(this.jCheckBoxSeleccionadosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jPanelParametrosAuxiliar3EstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jComboBoxTiposRelacionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
				
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jComboBoxTiposAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
	
				
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRequisicion.add(this.jTextFieldValorCampoGeneralEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoRequisicion = new GridBagLayout();

			this.jScrollPanelDatosEstadoRequisicion.setLayout(gridaBagLayoutDatosEstadoRequisicion);
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = 0;
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;
			
			this.jScrollPanelDatosEstadoRequisicion.add(this.jTableDatosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoRequisicion.setViewportView(this.jTableDatosEstadoRequisicion);
		this.jTableDatosEstadoRequisicion.setFillsViewportHeight(true);
		this.jTableDatosEstadoRequisicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoRequisicion= new GridBagLayout();
		this.jPanelAccionesEstadoRequisicion.setLayout(gridaBagLayoutAccionesEstadoRequisicion);
		
		
		/*	
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
			
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonNuevoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRequisicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;		
			//this.gridBagConstraintsEstadoRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRequisicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;		
		//this.gridBagConstraintsEstadoRequisicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoRequisicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoRequisicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);								
		
		
		/*
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		*/		
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRequisicion.gridx =0;
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
				
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRequisicion = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoRequisicion.setLayout(gridaBagLayoutBusquedasParametrosEstadoRequisicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoRequisicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoRequisicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoRequisicion.setName("jPanelReporteDinamicoEstadoRequisicion"); 
		
		this.jPanelReporteDinamicoEstadoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoRequisicion.setLayout(gridaBagLayoutReporteDinamicoEstadoRequisicion);
		
		
		this.jInternalFrameReporteDinamicoEstadoRequisicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoRequisicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoRequisicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoRequisicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoRequisicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoRequisicion = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoRequisicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jLabelColumnasSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoRequisicion = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoRequisicion=new JScrollPane(this.jListColumnasSelectReporteEstadoRequisicion);
			
			this.jScrollColumnasSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRequisicion.add(this.jListColumnasSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jScrollColumnasSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoRequisicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoRequisicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jLabelRelacionesSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoRequisicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoRequisicion=new JScrollPane(this.jListRelacionesSelectReporteEstadoRequisicion);
			
			this.jScrollRelacionesSelectReporteEstadoRequisicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRequisicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRequisicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRequisicion.add(this.jListRelacionesSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jScrollRelacionesSelectReporteEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoRequisicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoRequisicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoRequisicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jLabelGenerarExcelReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion.setToolTipText("Generar EXCEL"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoRequisicion.add(this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jComboBoxTiposReportesDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jLabelTiposArchivoReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoRequisicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoRequisicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoRequisicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoRequisicion.setToolTipText("Generar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jButtonGenerarReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoRequisicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoRequisicion.setToolTipText("Cancelar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRequisicion.add(this.jButtonCerrarReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoRequisicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoRequisicion= new JScrollPane(jPanelReporteDinamicoEstadoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoRequisicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoRequisicion);
		this.jInternalFrameReporteDinamicoEstadoRequisicion.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoRequisicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoRequisicion.setName("jPanelImportacionEstadoRequisicion"); 
		
		this.jPanelImportacionEstadoRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoRequisicion.setLayout(gridaBagLayoutImportacionEstadoRequisicion);
		
		
		this.jInternalFrameImportacionEstadoRequisicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoRequisicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRequisicion.setResizable(true);
	    this.jInternalFrameImportacionEstadoRequisicion.setClosable(true);
	    this.jInternalFrameImportacionEstadoRequisicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRequisicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRequisicion.setResizable(true);
	    this.jInternalFrameImportacionEstadoRequisicion.setClosable(true);
	    this.jInternalFrameImportacionEstadoRequisicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoRequisicion = new JLabelMe();

		this.jLabelArchivoImportacionEstadoRequisicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRequisicion.add(this.jLabelArchivoImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoRequisicion = new JFileChooser();		
		this.jFileChooserImportacionEstadoRequisicion.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoRequisicion = new JButtonMe();
		this.jButtonAbrirImportacionEstadoRequisicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoRequisicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoRequisicion.setToolTipText("Generar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRequisicion.add(this.jButtonAbrirImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoRequisicion = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoRequisicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRequisicion.add(this.jLabelPathArchivoImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoRequisicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoRequisicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRequisicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRequisicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRequisicion.add(this.jTextFieldPathArchivoImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoRequisicion = new JButtonMe();
		this.jButtonGenerarImportacionEstadoRequisicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoRequisicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoRequisicion.setToolTipText("Generar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRequisicion.add(this.jButtonGenerarImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoRequisicion = new JButtonMe();
		this.jButtonCerrarImportacionEstadoRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoRequisicion.setToolTipText("Cancelar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRequisicion.add(this.jButtonCerrarImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoRequisicion = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoRequisicion= new JScrollPane(jPanelImportacionEstadoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoRequisicion.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoRequisicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoRequisicion);
		this.jInternalFrameImportacionEstadoRequisicion.getContentPane().add(this.jScrollPanelImportacionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoRequisicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoRequisicion = new JButtonMe();
			this.jButtonAbrirOrderByEstadoRequisicion.setText("Orden");
			this.jButtonAbrirOrderByEstadoRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRequisicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoRequisicion";
			inputMap = this.jButtonAbrirOrderByEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoRequisicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoRequisicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoRequisicion.setName("jPanelOrderByEstadoRequisicion"); 
			
			this.jPanelOrderByEstadoRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoRequisicion.setLayout(gridaBagLayoutOrderByEstadoRequisicion);
			
			
			this.jTableDatosEstadoRequisicionOrderBy = new JTableMe();        
			this.jTableDatosEstadoRequisicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoRequisicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoRequisicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoRequisicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoRequisicionOrderBy.setViewportView(this.jTableDatosEstadoRequisicionOrderBy);
			this.jTableDatosEstadoRequisicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoRequisicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoRequisicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoRequisicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoRequisicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoRequisicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoRequisicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoRequisicion.setTitle("Orden");
			this.jInternalFrameOrderByEstadoRequisicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoRequisicion.setResizable(true);
			this.jInternalFrameOrderByEstadoRequisicion.setClosable(true);
			this.jInternalFrameOrderByEstadoRequisicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoRequisicion.ipady =150;
				
			this.jPanelOrderByEstadoRequisicion.add(jScrollPanelDatosEstadoRequisicionOrderBy, this.gridBagConstraintsEstadoRequisicion);//this.jTableDatosEstadoRequisicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoRequisicion = new JButtonMe();
			this.jButtonCerrarOrderByEstadoRequisicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoRequisicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoRequisicion.setToolTipText("Cancelar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoRequisicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoRequisicion.add(this.jButtonCerrarOrderByEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoRequisicion = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoRequisicion= new JScrollPane(jPanelOrderByEstadoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoRequisicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoRequisicion);
			
			this.jInternalFrameOrderByEstadoRequisicion.getContentPane().add(this.jScrollPanelOrderByEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
		
		} else {
			this.jButtonAbrirOrderByEstadoRequisicion = new JButtonMe();
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
			&& this.estadorequisicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoRequisicion.getRowHeight();//EstadoRequisicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.isSelected()) {
					iHeightTable=EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRequisicion.isSelected()) {
					iHeightTable=EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoRequisicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRequisicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRequisicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoRequisicion!=null && this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy()!=null) {
			//if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoRequisicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoRequisicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoRequisicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadorequisicionLogic.getEstadoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorequisicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoRequisicion> TraerEstadoRequisicionBeans(List<EstadoRequisicion> estadorequisicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoRequisicion estadorequisicion:estadorequisicions) {
					
				if(!(EstadoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadorequisicion.setsDetalleGeneralEntityReporte(EstadoRequisicionConstantesFunciones.getEstadoRequisicionDescripcion(estadorequisicion));
										
						
					
					

					if(estadorequisicion.getRequisicionCompraCompras()!=null && Funciones.existeClass(classes,RequisicionCompra.class)) {
						try{estadorequisicion.setrequisicioncompraComprasDescripcionReporte(new JRBeanCollectionDataSource(RequisicionCompraJInternalFrame.TraerRequisicionCompraBeans(estadorequisicion.getRequisicionCompraCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadorequisicion.setsDetalleGeneralEntityReporte(estadorequisicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadorequisicionbeans.add(estadorequisicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadorequisicions;
    }
	//PARA REPORTES FIN
}
