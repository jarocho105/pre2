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
import com.bydan.erp.inventario.util.EstadoPrecioConstantesFunciones;

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
public class EstadoPrecioJInternalFrame extends EstadoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPrecio;
	
	protected JMenuBar jmenuBarEstadoPrecio;
	
	protected JMenu jmenuEstadoPrecio;
	protected JMenu jmenuDatosEstadoPrecio;
	protected JMenu jmenuArchivoEstadoPrecio;
	protected JMenu jmenuAccionesEstadoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPrecio;	
	protected GridBagConstraints gridBagConstraintsEstadoPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPrecioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPrecioSessionBean estadoprecioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPrecio> estadoprecios;		
	public List<EstadoPrecio> estadopreciosEliminados;	
	public List<EstadoPrecio> estadopreciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPrecio;		
	protected JButton jButtonAbrirOrderByEstadoPrecio;
	
	
	//protected JPanel jPanelOrderByEstadoPrecio;
	//public JScrollPane jScrollPanelOrderByEstadoPrecio;	
	//protected JButton jButtonCerrarOrderByEstadoPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPrecioLogic estadoprecioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPrecio;
	public JScrollPane jScrollPanelDatosEdicionEstadoPrecio;
	public JScrollPane jScrollPanelDatosGeneralEstadoPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPrecio;
	//public JScrollPane jScrollPanelImportacionEstadoPrecio;
	
	
	
	protected JPanel jPanelAccionesEstadoPrecio;
	
    protected JPanel jPanelPaginacionEstadoPrecio;
    protected JPanel jPanelParametrosReportesEstadoPrecio;
	protected JPanel jPanelParametrosReportesAccionesEstadoPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPrecio;
	protected JPanel jPanelParametrosAuxiliar2EstadoPrecio;
	protected JPanel jPanelParametrosAuxiliar3EstadoPrecio;
	protected JPanel jPanelParametrosAuxiliar4EstadoPrecio;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPrecio;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPrecio;
	//protected JPanel jPanelImportacionEstadoPrecio;
	
	
	public JTable jTableDatosEstadoPrecio;
	
	
	
	//public JTable jTableDatosEstadoPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPrecio;
	protected JButton jButtonDuplicarEstadoPrecio;
	protected JButton jButtonCopiarEstadoPrecio;
	protected JButton jButtonVerFormEstadoPrecio;
	protected JButton jButtonNuevoRelacionesEstadoPrecio;
	protected JButton jButtonModificarEstadoPrecio;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPrecio;
	protected JButton jButtonCerrarEstadoPrecio;
	
	
	protected JButton jButtonRecargarInformacionEstadoPrecio;
	protected JButton jButtonProcesarInformacionEstadoPrecio;
	
	
	protected JButton jButtonAnterioresEstadoPrecio;
	protected JButton jButtonSiguientesEstadoPrecio;
	protected JButton jButtonNuevoGuardarCambiosEstadoPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPrecio;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPrecio;
	//protected JButton jButtonGenerarImportacionEstadoPrecio;
	//protected JButton jButtonCerrarImportacionEstadoPrecio;
	//protected JFileChooser jFileChooserImportacionEstadoPrecio;
	//protected File fileImportacionEstadoPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPrecio;
	protected JButton jButtonDuplicarToolBarEstadoPrecio;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPrecio;
	protected JButton jButtonCopiarToolBarEstadoPrecio;
	protected JButton jButtonVerFormToolBarEstadoPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPrecio;
	protected JButton jButtonCerrarToolBarEstadoPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPrecio;
	protected JButton jButtonProcesarInformacionToolBarEstadoPrecio;
	protected JButton jButtonAnterioresToolBarEstadoPrecio;
	protected JButton jButtonSiguientesToolBarEstadoPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPrecio;
	protected JButton jButtonAbrirOrderByToolBarEstadoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPrecio;
	protected JMenuItem jMenuItemDuplicarEstadoPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPrecio;
	protected JMenuItem jMenuItemCopiarEstadoPrecio;
	protected JMenuItem jMenuItemVerFormEstadoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPrecio;
	protected JMenuItem jMenuItemCerrarEstadoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPrecio;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPrecio;
	protected JMenuItem jMenuItemAnterioresEstadoPrecio;
	protected JMenuItem jMenuItemSiguientesEstadoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPrecio;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPrecio;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPrecio;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPrecio;
	protected JTextField jTextFieldValorCampoGeneralEstadoPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPrecio;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPrecio;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPrecio;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPrecio;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPrecio;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPrecio;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPrecio;	
	//public JLabel jLabelPathArchivoImportacionEstadoPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPrecio;	
	
	
	
	
	
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
	public EstadoPrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPrecio)	{
		this.jButtonRecargarInformacionEstadoPrecio = jButtonRecargarInformacionEstadoPrecio;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPrecio() {
		return this.jButtonProcesarInformacionEstadoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPrecio)	{
		this.jButtonProcesarInformacionEstadoPrecio = jButtonProcesarInformacionEstadoPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPrecio() {
		return this.jButtonRecargarInformacionEstadoPrecio;
	}
	
	
	public List<EstadoPrecio> getestadoprecios() {
		return this.estadoprecios;
	}

	public void setestadoprecios(List<EstadoPrecio> estadoprecios) {
		this.estadoprecios = estadoprecios;
	}
	
	public List<EstadoPrecio> getestadopreciosAux() {
		return this.estadopreciosAux;
	}

	public void setestadopreciosAux(List<EstadoPrecio> estadopreciosAux) {
		this.estadopreciosAux = estadopreciosAux;
	}
	
	public List<EstadoPrecio> getestadopreciosEliminados() {
		return this.estadopreciosEliminados;
	}

	public void setEstadoPreciosEliminados(List<EstadoPrecio> estadopreciosEliminados) {
		this.estadopreciosEliminados = estadopreciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPrecio() {
		return jComboBoxTiposSeleccionarEstadoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPrecio(
			JComboBox jComboBoxTiposSeleccionarEstadoPrecio) {
		this.jComboBoxTiposSeleccionarEstadoPrecio = jComboBoxTiposSeleccionarEstadoPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPrecio() {
		return jTextFieldValorCampoGeneralEstadoPrecio;
	}

	public void setjTextFieldValorCampoGeneralEstadoPrecio(
			JTextField jTextFieldValorCampoGeneralEstadoPrecio) {
		this.jTextFieldValorCampoGeneralEstadoPrecio = jTextFieldValorCampoGeneralEstadoPrecio;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPrecio() {
		return this.jCheckBoxSeleccionarTodosEstadoPrecio;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPrecio(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPrecio) {
		this.jCheckBoxSeleccionarTodosEstadoPrecio = jCheckBoxSeleccionarTodosEstadoPrecio;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPrecio() {
		return this.jCheckBoxSeleccionadosEstadoPrecio;
	}

	public void setjCheckBoxSeleccionadosEstadoPrecio(
			JCheckBox jCheckBoxSeleccionadosEstadoPrecio) {
		this.jCheckBoxSeleccionadosEstadoPrecio = jCheckBoxSeleccionadosEstadoPrecio;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPrecio() {
		return this.jComboBoxTiposArchivosReportesEstadoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPrecio(
			JComboBox jComboBoxTiposArchivosReportesEstadoPrecio) {
		this.jComboBoxTiposArchivosReportesEstadoPrecio = jComboBoxTiposArchivosReportesEstadoPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPrecio() {
		return this.jComboBoxTiposReportesEstadoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPrecio(
			JComboBox jComboBoxTiposReportesEstadoPrecio) {
		this.jComboBoxTiposReportesEstadoPrecio = jComboBoxTiposReportesEstadoPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPrecio() {
	//	return jComboBoxTiposReportesDinamicoEstadoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPrecio) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPrecio = jComboBoxTiposReportesDinamicoEstadoPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio = jComboBoxTiposArchivosReportesDinamicoEstadoPrecio;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPrecio() {
		return this.jComboBoxTiposGraficosReportesEstadoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPrecio(
			JComboBox jComboBoxTiposGraficosReportesEstadoPrecio) {
		this.jComboBoxTiposGraficosReportesEstadoPrecio = jComboBoxTiposGraficosReportesEstadoPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPrecio() {
		return this.jComboBoxTiposPaginacionEstadoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPrecio(
			JComboBox jComboBoxTiposPaginacionEstadoPrecio) {
		this.jComboBoxTiposPaginacionEstadoPrecio = jComboBoxTiposPaginacionEstadoPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPrecio() {
		return this.jComboBoxTiposRelacionesEstadoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPrecio() {
		return this.jComboBoxTiposAccionesEstadoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPrecio(
			JComboBox jComboBoxTiposRelacionesEstadoPrecio) {
		this.jComboBoxTiposRelacionesEstadoPrecio = jComboBoxTiposRelacionesEstadoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPrecio(
			JComboBox jComboBoxTiposAccionesEstadoPrecio) {
		this.jComboBoxTiposAccionesEstadoPrecio = jComboBoxTiposAccionesEstadoPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPrecio() {
	//	return jCheckBoxConGraficoDinamicoEstadoPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPrecio) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPrecio = jCheckBoxConGraficoDinamicoEstadoPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPrecio .setBorder(borderResaltar);		
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
		this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
		
		this.estadoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoprecioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Precio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"nuevo","nuevo","Nuevo"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"duplicar","duplicar","Duplicar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"copiar","copiar","Copiar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"ver_form","ver_form","Ver"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"recargar","recargar","Recargar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPrecio,this.jTtoolBarEstadoPrecio,
							"cerrar","cerrar","Salir"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPrecio;
			
				this.jButtonProcesarInformacionToolBarEstadoPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPrecio;
				
		//protected JButton jButtonModificarToolBarEstadoPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPrecio=new JMenuMe("General");
		this.jmenuArchivoEstadoPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPrecio=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPrecio.add(this.jMenuItemCerrarEstadoPrecio);
			
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemNuevoEstadoPrecio);
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemNuevoGuardarCambiosEstadoPrecio);
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemNuevoRelacionesEstadoPrecio);
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemGuardarCambiosTablaEstadoPrecio);		
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemDuplicarEstadoPrecio);		
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemCopiarEstadoPrecio);		
			this.jmenuAccionesEstadoPrecio.add(this.jMenuItemVerFormEstadoPrecio);		
			
			this.jmenuDatosEstadoPrecio.add(this.jMenuItemRecargarInformacionEstadoPrecio);				
			this.jmenuDatosEstadoPrecio.add(this.jMenuItemAnterioresEstadoPrecio);				
			this.jmenuDatosEstadoPrecio.add(this.jMenuItemSiguientesEstadoPrecio);				
			this.jmenuDatosEstadoPrecio.add(this.jMenuItemAbrirOrderByEstadoPrecio);				
			this.jmenuDatosEstadoPrecio.add(this.jMenuItemMostrarOcultarEstadoPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPrecio.add(this.jMenuItemGuardarCambiosEstadoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPrecio.add(this.jmenuArchivoEstadoPrecio);		
			this.jmenuBarEstadoPrecio.add(this.jmenuAccionesEstadoPrecio);		
			this.jmenuBarEstadoPrecio.add(this.jmenuDatosEstadoPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPrecio() {
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
			//this.jInternalFrameDetalleEstadoPrecio = new EstadoPrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Precio DATOS");
			this.jInternalFrameDetalleFormEstadoPrecio = new EstadoPrecioDetalleFormJInternalFrame(jDesktopPane,this.estadoprecioSessionBean.getConGuardarRelaciones(),this.estadoprecioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPrecio = null;//new EstadoPrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPrecio= new GridBagLayout();
		
		
		this.jTableDatosEstadoPrecio = new JTableMe();      
		
		String sToolTipEstadoPrecio="";
		sToolTipEstadoPrecio=EstadoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPrecio+="(Inventario.EstadoPrecio)";
		}
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPrecio.setToolTipText(sToolTipEstadoPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPrecio);
		this.jTableDatosEstadoPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPrecio.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPrecio = new JButtonMe();
		this.jButtonDuplicarEstadoPrecio = new JButtonMe();
		this.jButtonCopiarEstadoPrecio = new JButtonMe();
		this.jButtonVerFormEstadoPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPrecio = new JButtonMe();
		this.jButtonCerrarEstadoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Precio";
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPrecio=new ReporteDinamicoJInternalFrame(EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPrecio=new ImportacionJInternalFrame(EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPrecio.setText("Orden");
		this.jButtonAbrirOrderByEstadoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPrecio,false,this);
			
			//this.cargarOrderByEstadoPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPrecio,true,this);
			
			//this.cargarOrderByEstadoPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPrecio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPrecio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPrecio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPrecio.setText("Nuevo");
		this.jButtonDuplicarEstadoPrecio.setText("Duplicar");
		this.jButtonCopiarEstadoPrecio.setText("Copiar");
		this.jButtonVerFormEstadoPrecio.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.setText("Guardar");
		this.jButtonCerrarEstadoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPrecio,"nuevo_button","Nuevo",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPrecio,"duplicar_button","Duplicar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPrecio,"copiar_button","Copiar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPrecio,"ver_form","Ver",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPrecio,"nuevorelaciones_button","Nuevo Rel",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPrecio,"guardarcambiostabla_button","Guardar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPrecio,"cerrar_button","Salir",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPrecio.setToolTipText("Nuevo"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPrecio.setToolTipText("Duplicar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPrecio.setToolTipText("Copiar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPrecio.setToolTipText("Ver"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPrecio.setToolTipText("Nuevo Rel"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.setToolTipText("Guardar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPrecio.setToolTipText("Salir"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPrecio";
		inputMap = this.jButtonNuevoEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPrecio";
		inputMap = this.jButtonDuplicarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPrecio"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPrecio";
		inputMap = this.jButtonCopiarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPrecio";
		inputMap = this.jButtonVerFormEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPrecio";
		inputMap = this.jButtonNuevoRelacionesEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPrecio";
		inputMap = this.jButtonModificarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPrecio";
		inputMap = this.jButtonCerrarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPrecio.setName("jPanelParametrosReportesEstadoPrecio"); 
		
		this.jPanelParametrosReportesAccionesEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPrecio.setName("jPanelParametrosReportesAccionesEstadoPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPrecio = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPrecio.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPrecio.setToolTipText("Recargar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPrecio = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPrecio.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPrecio.setToolTipText("Procesar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPrecio = new JLabelMe();
		
		this.jLabelAccionesEstadoPrecio.setText("Acciones");		
		this.jLabelAccionesEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPrecio = new JButtonMe();
		//this.jButtonAnterioresEstadoPrecio.setText("<<");
        this.jButtonAnterioresEstadoPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPrecio = new JButtonMe();
		//this.jButtonSiguientesEstadoPrecio.setText(">>");
        this.jButtonSiguientesEstadoPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPrecio,"nuevoguardarcambios_button","Nue",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPrecio";
		inputMap = this.jButtonRecargarInformacionEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPrecio";
		inputMap = this.jButtonSiguientesEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPrecio";
		inputMap = this.jButtonAnterioresEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPrecio.setMinimumSize(new Dimension(this.getWidth(),EstadoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPrecio.setMaximumSize(new Dimension(this.getWidth(),EstadoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPrecio.setPreferredSize(new Dimension(this.getWidth(),EstadoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPrecio = new GridBagLayout();

			this.jPanelPaginacionEstadoPrecio.setLayout(gridaBagLayoutPaginacionEstadoPrecio);						
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 0;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonAnterioresEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					
						
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPrecio.gridy = 0;
			
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonNuevoGuardarCambiosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
						
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPrecio.gridy = 0;
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonSiguientesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 1;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonNuevoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
				this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPrecio.gridy = 1;
				this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoPrecio.add(this.jButtonNuevoRelacionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			}
			
			
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
				this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPrecio.gridy = 1;
				this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPrecio.add(this.jButtonGuardarCambiosTablaEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			}
			
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 1;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonDuplicarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 1;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonCopiarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 1;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonVerFormEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 1;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPrecio.add(this.jButtonCerrarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
		
		
		this.jButtonRecargarInformacionEstadoPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPrecio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPrecio.setLayout(gridaBagParametrosReportesEstadoPrecio);
			this.jPanelParametrosReportesAccionesEstadoPrecio.setLayout(gridaBagParametrosReportesAccionesEstadoPrecio);
			
			
			this.jPanelParametrosAuxiliar1EstadoPrecio.setLayout(gridaBagParametrosAuxiliar1EstadoPrecio);
			this.jPanelParametrosAuxiliar2EstadoPrecio.setLayout(gridaBagParametrosAuxiliar2EstadoPrecio);
			this.jPanelParametrosAuxiliar3EstadoPrecio.setLayout(gridaBagParametrosAuxiliar3EstadoPrecio);
			this.jPanelParametrosAuxiliar4EstadoPrecio.setLayout(gridaBagParametrosAuxiliar4EstadoPrecio);
			//this.jPanelParametrosAuxiliar5EstadoPrecio.setLayout(gridaBagParametrosAuxiliar2EstadoPrecio);			
			
			
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPrecio.add(this.jButtonRecargarInformacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPrecio.add(this.jComboBoxTiposPaginacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPrecio.add(this.jCheckBoxConAltoMaximoTablaEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPrecio.add(this.jComboBoxTiposArchivosReportesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPrecio.add(this.jPanelParametrosAuxiliar1EstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPrecio.add(this.jComboBoxTiposReportesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPrecio.add(this.jPanelParametrosAuxiliar4EstadoPrecio, this.gridBagConstraintsEstadoPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPrecio.add(this.jComboBoxTiposReportesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPrecio.add(this.jCheckBoxGenerarReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPrecio.add(this.jPanelParametrosAuxiliar2EstadoPrecio, this.gridBagConstraintsEstadoPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPrecio.add(this.jLabelAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
				this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPrecio.add(this.jButtonAbrirOrderByEstadoPrecio, this.gridBagConstraintsEstadoPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPrecio.add(this.jComboBoxTiposSeleccionarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			
			
			/*
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPrecio.add(this.jCheckBoxSeleccionarTodosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPrecio.add(this.jCheckBoxSeleccionarTodosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);															
				
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPrecio.add(this.jCheckBoxSeleccionadosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPrecio.add(this.jPanelParametrosAuxiliar3EstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPrecio.add(this.jComboBoxTiposRelacionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
				
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPrecio.add(this.jComboBoxTiposAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
	
				
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPrecio.add(this.jTextFieldValorCampoGeneralEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPrecio = new GridBagLayout();

			this.jScrollPanelDatosEstadoPrecio.setLayout(gridaBagLayoutDatosEstadoPrecio);
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = 0;
			this.gridBagConstraintsEstadoPrecio.gridx = 0;
			
			this.jScrollPanelDatosEstadoPrecio.add(this.jTableDatosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPrecio.setViewportView(this.jTableDatosEstadoPrecio);
		this.jTableDatosEstadoPrecio.setFillsViewportHeight(true);
		this.jTableDatosEstadoPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPrecio= new GridBagLayout();
		this.jPanelAccionesEstadoPrecio.setLayout(gridaBagLayoutAccionesEstadoPrecio);
		
		
		/*	
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = 0;
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
			
		this.jPanelAccionesEstadoPrecio.add(this.jButtonNuevoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPrecio.gridx = 0;		
			//this.gridBagConstraintsEstadoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPrecio.gridx = 0;		
		//this.gridBagConstraintsEstadoPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);								
		
		
		/*
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		*/		
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPrecio.gridx =0;
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
				
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPrecio.setLayout(gridaBagLayoutBusquedasParametrosEstadoPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPrecio.setName("jPanelReporteDinamicoEstadoPrecio"); 
		
		this.jPanelReporteDinamicoEstadoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPrecio.setLayout(gridaBagLayoutReporteDinamicoEstadoPrecio);
		
		
		this.jInternalFrameReporteDinamicoEstadoPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPrecio = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jLabelColumnasSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPrecio = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPrecio=new JScrollPane(this.jListColumnasSelectReporteEstadoPrecio);
			
			this.jScrollColumnasSelectReporteEstadoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPrecio.add(this.jListColumnasSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jScrollColumnasSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPrecio = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jLabelRelacionesSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPrecio = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPrecio=new JScrollPane(this.jListRelacionesSelectReporteEstadoPrecio);
			
			this.jScrollRelacionesSelectReporteEstadoPrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPrecio.add(this.jListRelacionesSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jScrollRelacionesSelectReporteEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jLabelGenerarExcelReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPrecio.setToolTipText("Generar EXCEL"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPrecio.add(this.jButtonGenerarExcelReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jComboBoxTiposReportesDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jLabelTiposArchivoReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPrecio.setToolTipText("Generar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jButtonGenerarReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPrecio.setToolTipText("Cancelar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPrecio.add(this.jButtonCerrarReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPrecio= new JScrollPane(jPanelReporteDinamicoEstadoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPrecio);
		this.jInternalFrameReporteDinamicoEstadoPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPrecio.setName("jPanelImportacionEstadoPrecio"); 
		
		this.jPanelImportacionEstadoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPrecio.setLayout(gridaBagLayoutImportacionEstadoPrecio);
		
		
		this.jInternalFrameImportacionEstadoPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPrecio.setResizable(true);
	    this.jInternalFrameImportacionEstadoPrecio.setClosable(true);
	    this.jInternalFrameImportacionEstadoPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPrecio.setResizable(true);
	    this.jInternalFrameImportacionEstadoPrecio.setClosable(true);
	    this.jInternalFrameImportacionEstadoPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPrecio = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPrecio.add(this.jLabelArchivoImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPrecio = new JFileChooser();		
		this.jFileChooserImportacionEstadoPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPrecio = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPrecio.setToolTipText("Generar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPrecio.add(this.jButtonAbrirImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPrecio.add(this.jLabelPathArchivoImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPrecio.add(this.jTextFieldPathArchivoImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPrecio = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPrecio.setToolTipText("Generar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPrecio.add(this.jButtonGenerarImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPrecio = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPrecio.setToolTipText("Cancelar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPrecio.add(this.jButtonCerrarImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPrecio= new JScrollPane(jPanelImportacionEstadoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPrecio);
		this.jInternalFrameImportacionEstadoPrecio.getContentPane().add(this.jScrollPanelImportacionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPrecio = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPrecio.setText("Orden");
			this.jButtonAbrirOrderByEstadoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPrecio";
			inputMap = this.jButtonAbrirOrderByEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPrecio.setName("jPanelOrderByEstadoPrecio"); 
			
			this.jPanelOrderByEstadoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPrecio.setLayout(gridaBagLayoutOrderByEstadoPrecio);
			
			
			this.jTableDatosEstadoPrecioOrderBy = new JTableMe();        
			this.jTableDatosEstadoPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPrecioOrderBy.setViewportView(this.jTableDatosEstadoPrecioOrderBy);
			this.jTableDatosEstadoPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPrecio.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPrecio.setResizable(true);
			this.jInternalFrameOrderByEstadoPrecio.setClosable(true);
			this.jInternalFrameOrderByEstadoPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPrecio.ipady =150;
				
			this.jPanelOrderByEstadoPrecio.add(jScrollPanelDatosEstadoPrecioOrderBy, this.gridBagConstraintsEstadoPrecio);//this.jTableDatosEstadoPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPrecio = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPrecio.setToolTipText("Cancelar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPrecio.add(this.jButtonCerrarOrderByEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPrecio= new JScrollPane(jPanelOrderByEstadoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPrecio);
			
			this.jInternalFrameOrderByEstadoPrecio.getContentPane().add(this.jScrollPanelOrderByEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPrecio = new JButtonMe();
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
			&& this.estadoprecioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPrecio.getRowHeight();//EstadoPrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPrecio.isSelected()) {
					iHeightTable=EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPrecio.isSelected()) {
					iHeightTable=EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPrecio!=null && this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoprecioLogic.getEstadoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoprecios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPrecio> TraerEstadoPrecioBeans(List<EstadoPrecio> estadoprecios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPrecio estadoprecio:estadoprecios) {
					
				if(!(EstadoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoprecio.setsDetalleGeneralEntityReporte(EstadoPrecioConstantesFunciones.getEstadoPrecioDescripcion(estadoprecio));
										
						
					
					

					if(estadoprecio.getPrecios()!=null && Funciones.existeClass(classes,Precio.class)) {
						try{estadoprecio.setpreciosDescripcionReporte(new JRBeanCollectionDataSource(PrecioJInternalFrame.TraerPrecioBeans(estadoprecio.getPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoprecio.setsDetalleGeneralEntityReporte(estadoprecio.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopreciobeans.add(estadopreciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoprecios;
    }
	//PARA REPORTES FIN
}
