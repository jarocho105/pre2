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
import com.bydan.erp.inventario.util.CalidadProductoConstantesFunciones;

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
public class CalidadProductoJInternalFrame extends CalidadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCalidadProducto;
	
	protected JMenuBar jmenuBarCalidadProducto;
	
	protected JMenu jmenuCalidadProducto;
	protected JMenu jmenuDatosCalidadProducto;
	protected JMenu jmenuArchivoCalidadProducto;
	protected JMenu jmenuAccionesCalidadProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCalidadProducto;	
	protected GridBagConstraints gridBagConstraintsCalidadProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CalidadProductoDetalleFormJInternalFrame jInternalFrameDetalleFormCalidadProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCalidadProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCalidadProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CalidadProductoSessionBean calidadproductoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<CalidadProducto> calidadproductos;		
	public List<CalidadProducto> calidadproductosEliminados;	
	public List<CalidadProducto> calidadproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCalidadProducto;		
	protected JButton jButtonAbrirOrderByCalidadProducto;
	
	
	//protected JPanel jPanelOrderByCalidadProducto;
	//public JScrollPane jScrollPanelOrderByCalidadProducto;	
	//protected JButton jButtonCerrarOrderByCalidadProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CalidadProductoLogic calidadproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCalidadProducto;
	public JScrollPane jScrollPanelDatosEdicionCalidadProducto;
	public JScrollPane jScrollPanelDatosGeneralCalidadProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosCalidadProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCalidadProducto;
	//public JScrollPane jScrollPanelImportacionCalidadProducto;
	
	
	
	protected JPanel jPanelAccionesCalidadProducto;
	
    protected JPanel jPanelPaginacionCalidadProducto;
    protected JPanel jPanelParametrosReportesCalidadProducto;
	protected JPanel jPanelParametrosReportesAccionesCalidadProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CalidadProducto;
	protected JPanel jPanelParametrosAuxiliar2CalidadProducto;
	protected JPanel jPanelParametrosAuxiliar3CalidadProducto;
	protected JPanel jPanelParametrosAuxiliar4CalidadProducto;
	//protected JPanel jPanelParametrosAuxiliar5CalidadProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoCalidadProducto;
	//protected JPanel jPanelImportacionCalidadProducto;
	
	
	public JTable jTableDatosCalidadProducto;
	
	
	
	//public JTable jTableDatosCalidadProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCalidadProducto;
	protected JButton jButtonDuplicarCalidadProducto;
	protected JButton jButtonCopiarCalidadProducto;
	protected JButton jButtonVerFormCalidadProducto;
	protected JButton jButtonNuevoRelacionesCalidadProducto;
	protected JButton jButtonModificarCalidadProducto;
	
    protected JButton jButtonGuardarCambiosTablaCalidadProducto;
	protected JButton jButtonCerrarCalidadProducto;
	
	
	protected JButton jButtonRecargarInformacionCalidadProducto;
	protected JButton jButtonProcesarInformacionCalidadProducto;
	
	
	protected JButton jButtonAnterioresCalidadProducto;
	protected JButton jButtonSiguientesCalidadProducto;
	protected JButton jButtonNuevoGuardarCambiosCalidadProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCalidadProducto;
	//protected JButton jButtonCerrarReporteDinamicoCalidadProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoCalidadProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionCalidadProducto;
	//protected JButton jButtonGenerarImportacionCalidadProducto;
	//protected JButton jButtonCerrarImportacionCalidadProducto;
	//protected JFileChooser jFileChooserImportacionCalidadProducto;
	//protected File fileImportacionCalidadProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCalidadProducto;
	protected JButton jButtonDuplicarToolBarCalidadProducto;
	protected JButton jButtonNuevoRelacionesToolBarCalidadProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarCalidadProducto;
	protected JButton jButtonCopiarToolBarCalidadProducto;
	protected JButton jButtonVerFormToolBarCalidadProducto;
	public JButton jButtonGuardarCambiosTablaToolBarCalidadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCalidadProducto;
	protected JButton jButtonCerrarToolBarCalidadProducto;
	
	protected JButton jButtonRecargarInformacionToolBarCalidadProducto;
	protected JButton jButtonProcesarInformacionToolBarCalidadProducto;
	protected JButton jButtonAnterioresToolBarCalidadProducto;
	protected JButton jButtonSiguientesToolBarCalidadProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarCalidadProducto;
	protected JButton jButtonAbrirOrderByToolBarCalidadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCalidadProducto;
	protected JMenuItem jMenuItemDuplicarCalidadProducto;
	protected JMenuItem jMenuItemNuevoRelacionesCalidadProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCalidadProducto;
	protected JMenuItem jMenuItemCopiarCalidadProducto;
	protected JMenuItem jMenuItemVerFormCalidadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCalidadProducto;
	protected JMenuItem jMenuItemCerrarCalidadProducto;
	protected JMenuItem jMenuItemDetalleCerrarCalidadProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCalidadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCalidadProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionCalidadProducto;
	protected JMenuItem jMenuItemProcesarInformacionCalidadProducto;
	protected JMenuItem jMenuItemAnterioresCalidadProducto;
	protected JMenuItem jMenuItemSiguientesCalidadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCalidadProducto;
	protected JMenuItem jMenuItemAbrirOrderByCalidadProducto;
	protected JMenuItem jMenuItemMostrarOcultarCalidadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCalidadProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCalidadProducto;
	protected JCheckBox jCheckBoxSeleccionadosCalidadProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCalidadProducto;
	protected JCheckBox jCheckBoxConGraficoReporteCalidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCalidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCalidadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCalidadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCalidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCalidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCalidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCalidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCalidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCalidadProducto;
	protected JTextField jTextFieldValorCampoGeneralCalidadProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCalidadProducto;
	//public JList<Reporte> jListColumnasSelectReporteCalidadProducto;
	//public JScrollPane jScrollColumnasSelectReporteCalidadProducto;
	
	//public JLabel jLabelRelacionesSelectReporteCalidadProducto;
	//public JList<Reporte> jListRelacionesSelectReporteCalidadProducto;
	//public JScrollPane jScrollRelacionesSelectReporteCalidadProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCalidadProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCalidadProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCalidadProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoCalidadProducto;
	
		
	//public JLabel jLabelArchivoImportacionCalidadProducto;	
	//public JLabel jLabelPathArchivoImportacionCalidadProducto;
	//protected JTextField jTextFieldPathArchivoImportacionCalidadProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCalidadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCalidadProducto;
	
	//public JLabel jLabelColumnaCategoriaValorCalidadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCalidadProducto;
	
	//public JLabel jLabelColumnasValoresGraficoCalidadProducto;
	//public JList<Reporte> jListColumnasValoresGraficoCalidadProducto;
	//public JScrollPane jScrollColumnasValoresGraficoCalidadProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCalidadProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCalidadProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCalidadProducto;
	public JPanel jPanelBusquedaPorCodigoCalidadProducto;
	public JButton jButtonBusquedaPorCodigoCalidadProducto;
	public JPanel jPanelBusquedaPorNombreCalidadProducto;
	public JButton jButtonBusquedaPorNombreCalidadProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoCalidadProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoCalidadProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoCalidadProducto;
	public JButton jButtoncodigoBusquedaPorCodigoCalidadProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreCalidadProducto;
	public JLabel jLabelnombreBusquedaPorNombreCalidadProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreCalidadProducto;
	public JButton jButtonnombreBusquedaPorNombreCalidadProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public CalidadProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCalidadProducto)	{
		this.jButtonRecargarInformacionCalidadProducto = jButtonRecargarInformacionCalidadProducto;
	}
	
	public JButton getjButtonProcesarInformacionCalidadProducto() {
		return this.jButtonProcesarInformacionCalidadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCalidadProducto)	{
		this.jButtonProcesarInformacionCalidadProducto = jButtonProcesarInformacionCalidadProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionCalidadProducto() {
		return this.jButtonRecargarInformacionCalidadProducto;
	}
	
	
	public List<CalidadProducto> getcalidadproductos() {
		return this.calidadproductos;
	}

	public void setcalidadproductos(List<CalidadProducto> calidadproductos) {
		this.calidadproductos = calidadproductos;
	}
	
	public List<CalidadProducto> getcalidadproductosAux() {
		return this.calidadproductosAux;
	}

	public void setcalidadproductosAux(List<CalidadProducto> calidadproductosAux) {
		this.calidadproductosAux = calidadproductosAux;
	}
	
	public List<CalidadProducto> getcalidadproductosEliminados() {
		return this.calidadproductosEliminados;
	}

	public void setCalidadProductosEliminados(List<CalidadProducto> calidadproductosEliminados) {
		this.calidadproductosEliminados = calidadproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCalidadProducto() {
		return jComboBoxTiposSeleccionarCalidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCalidadProducto(
			JComboBox jComboBoxTiposSeleccionarCalidadProducto) {
		this.jComboBoxTiposSeleccionarCalidadProducto = jComboBoxTiposSeleccionarCalidadProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCalidadProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCalidadProducto() {
		return jTextFieldValorCampoGeneralCalidadProducto;
	}

	public void setjTextFieldValorCampoGeneralCalidadProducto(
			JTextField jTextFieldValorCampoGeneralCalidadProducto) {
		this.jTextFieldValorCampoGeneralCalidadProducto = jTextFieldValorCampoGeneralCalidadProducto;
	}

	public void setBorderResaltarValorCampoGeneralCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCalidadProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCalidadProducto() {
		return this.jCheckBoxSeleccionarTodosCalidadProducto;
	}

	public void setjCheckBoxSeleccionarTodosCalidadProducto(
			JCheckBox jCheckBoxSeleccionarTodosCalidadProducto) {
		this.jCheckBoxSeleccionarTodosCalidadProducto = jCheckBoxSeleccionarTodosCalidadProducto;
	}

	public void setBorderResaltarSeleccionarTodosCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCalidadProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCalidadProducto() {
		return this.jCheckBoxSeleccionadosCalidadProducto;
	}

	public void setjCheckBoxSeleccionadosCalidadProducto(
			JCheckBox jCheckBoxSeleccionadosCalidadProducto) {
		this.jCheckBoxSeleccionadosCalidadProducto = jCheckBoxSeleccionadosCalidadProducto;
	}
	
	public void setBorderResaltarSeleccionadosCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCalidadProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCalidadProducto() {
		return this.jComboBoxTiposArchivosReportesCalidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCalidadProducto(
			JComboBox jComboBoxTiposArchivosReportesCalidadProducto) {
		this.jComboBoxTiposArchivosReportesCalidadProducto = jComboBoxTiposArchivosReportesCalidadProducto;
	}

	public void setBorderResaltarTiposArchivosReportesCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCalidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCalidadProducto() {
		return this.jComboBoxTiposReportesCalidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCalidadProducto(
			JComboBox jComboBoxTiposReportesCalidadProducto) {
		this.jComboBoxTiposReportesCalidadProducto = jComboBoxTiposReportesCalidadProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCalidadProducto() {
	//	return jComboBoxTiposReportesDinamicoCalidadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCalidadProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoCalidadProducto) {
	//	this.jComboBoxTiposReportesDinamicoCalidadProducto = jComboBoxTiposReportesDinamicoCalidadProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCalidadProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoCalidadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCalidadProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCalidadProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto = jComboBoxTiposArchivosReportesDinamicoCalidadProducto;
	//}
	
	public void setBorderResaltarTiposReportesCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCalidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCalidadProducto() {
		return this.jComboBoxTiposGraficosReportesCalidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCalidadProducto(
			JComboBox jComboBoxTiposGraficosReportesCalidadProducto) {
		this.jComboBoxTiposGraficosReportesCalidadProducto = jComboBoxTiposGraficosReportesCalidadProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCalidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCalidadProducto() {
		return this.jComboBoxTiposPaginacionCalidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCalidadProducto(
			JComboBox jComboBoxTiposPaginacionCalidadProducto) {
		this.jComboBoxTiposPaginacionCalidadProducto = jComboBoxTiposPaginacionCalidadProducto;
	}
	
	public void setBorderResaltarTiposPaginacionCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCalidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCalidadProducto() {
		return this.jComboBoxTiposRelacionesCalidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCalidadProducto() {
		return this.jComboBoxTiposAccionesCalidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCalidadProducto(
			JComboBox jComboBoxTiposRelacionesCalidadProducto) {
		this.jComboBoxTiposRelacionesCalidadProducto = jComboBoxTiposRelacionesCalidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCalidadProducto(
			JComboBox jComboBoxTiposAccionesCalidadProducto) {
		this.jComboBoxTiposAccionesCalidadProducto = jComboBoxTiposAccionesCalidadProducto;
	}
	
	public void setBorderResaltarTiposRelacionesCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCalidadProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCalidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCalidadProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCalidadProducto() {
	//	return jCheckBoxConGraficoDinamicoCalidadProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoCalidadProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoCalidadProducto) {
	//	this.jCheckBoxConGraficoDinamicoCalidadProducto = jCheckBoxConGraficoDinamicoCalidadProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCalidadProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCalidadProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCalidadProducto .setBorder(borderResaltar);		
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
		this.calidadproductoSessionBean=new CalidadProductoSessionBean();
		
		this.calidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.calidadproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CalidadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Calidad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		CalidadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCalidadProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"nuevo","nuevo","Nuevo"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"duplicar","duplicar","Duplicar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"copiar","copiar","Copiar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"ver_form","ver_form","Ver"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"recargar","recargar","Recargar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCalidadProducto,this.jTtoolBarCalidadProducto,
							"cerrar","cerrar","Salir"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCalidadProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCalidadProducto;
			
				this.jButtonProcesarInformacionToolBarCalidadProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCalidadProducto;
				
		//protected JButton jButtonModificarToolBarCalidadProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCalidadProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCalidadProducto=new JMenuMe("General");
		this.jmenuArchivoCalidadProducto=new JMenuMe("Archivo");
		this.jmenuAccionesCalidadProducto=new JMenuMe("Acciones");
		this.jmenuDatosCalidadProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCalidadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCalidadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCalidadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCalidadProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCalidadProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCalidadProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCalidadProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCalidadProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCalidadProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCalidadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCalidadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCalidadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCalidadProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCalidadProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCalidadProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCalidadProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCalidadProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCalidadProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCalidadProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCalidadProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCalidadProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCalidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCalidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCalidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCalidadProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCalidadProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCalidadProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCalidadProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCalidadProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCalidadProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCalidadProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCalidadProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCalidadProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCalidadProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCalidadProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCalidadProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCalidadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCalidadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCalidadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCalidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCalidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCalidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCalidadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCalidadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCalidadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCalidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCalidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCalidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCalidadProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCalidadProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCalidadProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCalidadProducto.add(this.jMenuItemCerrarCalidadProducto);
			
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemNuevoCalidadProducto);
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemNuevoGuardarCambiosCalidadProducto);
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemNuevoRelacionesCalidadProducto);
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemGuardarCambiosTablaCalidadProducto);		
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemDuplicarCalidadProducto);		
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemCopiarCalidadProducto);		
			this.jmenuAccionesCalidadProducto.add(this.jMenuItemVerFormCalidadProducto);		
			
			this.jmenuDatosCalidadProducto.add(this.jMenuItemRecargarInformacionCalidadProducto);				
			this.jmenuDatosCalidadProducto.add(this.jMenuItemAnterioresCalidadProducto);				
			this.jmenuDatosCalidadProducto.add(this.jMenuItemSiguientesCalidadProducto);				
			this.jmenuDatosCalidadProducto.add(this.jMenuItemAbrirOrderByCalidadProducto);				
			this.jmenuDatosCalidadProducto.add(this.jMenuItemMostrarOcultarCalidadProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCalidadProducto.add(this.jMenuItemGuardarCambiosCalidadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCalidadProducto.add(this.jmenuArchivoCalidadProducto);		
			this.jmenuBarCalidadProducto.add(this.jmenuAccionesCalidadProducto);		
			this.jmenuBarCalidadProducto.add(this.jmenuDatosCalidadProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCalidadProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCalidadProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoCalidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoCalidadProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoCalidadProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoCalidadProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoCalidadProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoCalidadProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoCalidadProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoCalidadProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoCalidadProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoCalidadProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCalidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCalidadProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCalidadProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreCalidadProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreCalidadProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCalidadProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCalidadProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreCalidadProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCalidadProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCalidadProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCalidadProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasCalidadProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCalidadProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCalidadProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCalidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCalidadProducto = new CalidadProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Calidad Producto DATOS");
			this.jInternalFrameDetalleFormCalidadProducto = new CalidadProductoDetalleFormJInternalFrame(jDesktopPane,this.calidadproductoSessionBean.getConGuardarRelaciones(),this.calidadproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCalidadProducto = null;//new CalidadProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCalidadProducto= new GridBagLayout();
		
		
		this.jTableDatosCalidadProducto = new JTableMe();      
		
		String sToolTipCalidadProducto="";
		sToolTipCalidadProducto=CalidadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCalidadProducto+="(Inventario.CalidadProducto)";
		}
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCalidadProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCalidadProducto.setToolTipText(sToolTipCalidadProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCalidadProducto);
		this.jTableDatosCalidadProducto.setAutoCreateRowSorter(true);
		this.jTableDatosCalidadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCalidadProducto.setRowSelectionAllowed(true);
		this.jTableDatosCalidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCalidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCalidadProducto = new JButtonMe();
		this.jButtonDuplicarCalidadProducto = new JButtonMe();
		this.jButtonCopiarCalidadProducto = new JButtonMe();
		this.jButtonVerFormCalidadProducto = new JButtonMe();
		this.jButtonNuevoRelacionesCalidadProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCalidadProducto = new JButtonMe();
		this.jButtonCerrarCalidadProducto = new JButtonMe();
		
		this.jScrollPanelDatosCalidadProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralCalidadProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Calidad Producto";
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosCalidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCalidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesCalidadProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCalidadProducto=new ReporteDinamicoJInternalFrame(CalidadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCalidadProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCalidadProducto=new ImportacionJInternalFrame(CalidadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCalidadProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCalidadProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByCalidadProducto.setText("Orden");
		this.jButtonAbrirOrderByCalidadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCalidadProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCalidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalidadProducto,false,this);
			
			//this.cargarOrderByCalidadProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCalidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalidadProducto,true,this);
			
			//this.cargarOrderByCalidadProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCalidadProducto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCalidadProducto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCalidadProducto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCalidadProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCalidadProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCalidadProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCalidadProducto.setText("Nuevo");
		this.jButtonDuplicarCalidadProducto.setText("Duplicar");
		this.jButtonCopiarCalidadProducto.setText("Copiar");
		this.jButtonVerFormCalidadProducto.setText("Ver");
		this.jButtonNuevoRelacionesCalidadProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCalidadProducto.setText("Guardar");
		this.jButtonCerrarCalidadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCalidadProducto,"nuevo_button","Nuevo",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCalidadProducto,"duplicar_button","Duplicar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCalidadProducto,"copiar_button","Copiar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCalidadProducto,"ver_form","Ver",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCalidadProducto,"nuevorelaciones_button","Nuevo Rel",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCalidadProducto,"guardarcambiostabla_button","Guardar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCalidadProducto,"cerrar_button","Salir",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCalidadProducto.setToolTipText("Nuevo"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCalidadProducto.setToolTipText("Duplicar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCalidadProducto.setToolTipText("Copiar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCalidadProducto.setToolTipText("Ver"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCalidadProducto.setToolTipText("Nuevo Rel"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCalidadProducto.setToolTipText("Guardar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCalidadProducto.setToolTipText("Salir"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCalidadProducto";
		inputMap = this.jButtonNuevoCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCalidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCalidadProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarCalidadProducto";
		inputMap = this.jButtonDuplicarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCalidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCalidadProducto"));
		
		//COPIAR
		sMapKey = "CopiarCalidadProducto";
		inputMap = this.jButtonCopiarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCalidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCalidadProducto"));
		
		//VEr FORM
		sMapKey = "VerFormCalidadProducto";
		inputMap = this.jButtonVerFormCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCalidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCalidadProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCalidadProducto";
		inputMap = this.jButtonNuevoRelacionesCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCalidadProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCalidadProducto";
		inputMap = this.jButtonModificarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCalidadProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCalidadProducto";
		inputMap = this.jButtonCerrarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCalidadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCalidadProducto";
		inputMap = this.jButtonGuardarCambiosTablaCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCalidadProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCalidadProducto.setName("jPanelParametrosReportesCalidadProducto"); 
		
		this.jPanelParametrosReportesAccionesCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCalidadProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCalidadProducto.setName("jPanelParametrosReportesAccionesCalidadProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCalidadProducto = new JButtonMe();
		this.jButtonRecargarInformacionCalidadProducto.setText("Recargar");
		this.jButtonRecargarInformacionCalidadProducto.setToolTipText("Recargar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCalidadProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCalidadProducto = new JButtonMe();
		this.jButtonProcesarInformacionCalidadProducto.setText("Procesar");
		this.jButtonProcesarInformacionCalidadProducto.setToolTipText("Procesar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCalidadProducto.setVisible(false);
			
		this.jButtonProcesarInformacionCalidadProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCalidadProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCalidadProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalidadProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCalidadProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalidadProducto.setText("TIPO");       
		this.jComboBoxTiposReportesCalidadProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCalidadProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCalidadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCalidadProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionCalidadProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCalidadProducto.setText("Accion");
		this.jComboBoxTiposRelacionesCalidadProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCalidadProducto.setText("Accion");
		this.jComboBoxTiposAccionesCalidadProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCalidadProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarCalidadProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCalidadProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCalidadProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCalidadProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCalidadProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCalidadProducto = new JLabelMe();
		
		this.jLabelAccionesCalidadProducto.setText("Acciones");		
		this.jLabelAccionesCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCalidadProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCalidadProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCalidadProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCalidadProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCalidadProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCalidadProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCalidadProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCalidadProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCalidadProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCalidadProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCalidadProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteCalidadProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCalidadProducto = new JButtonMe();
		//this.jButtonAnterioresCalidadProducto.setText("<<");
        this.jButtonAnterioresCalidadProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCalidadProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCalidadProducto = new JButtonMe();
		//this.jButtonSiguientesCalidadProducto.setText(">>");
        this.jButtonSiguientesCalidadProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCalidadProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCalidadProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCalidadProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosCalidadProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCalidadProducto,"nuevoguardarcambios_button","Nue",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCalidadProducto";
		inputMap = this.jButtonNuevoGuardarCambiosCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCalidadProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCalidadProducto";
		inputMap = this.jButtonRecargarInformacionCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCalidadProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCalidadProducto";
		inputMap = this.jButtonSiguientesCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCalidadProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCalidadProducto";
		inputMap = this.jButtonAnterioresCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCalidadProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCalidadProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCalidadProducto.setMinimumSize(new Dimension(this.getWidth(),CalidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCalidadProducto.setMaximumSize(new Dimension(this.getWidth(),CalidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCalidadProducto.setPreferredSize(new Dimension(this.getWidth(),CalidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CalidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCalidadProducto = new GridBagLayout();

			this.jPanelPaginacionCalidadProducto.setLayout(gridaBagLayoutPaginacionCalidadProducto);						
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 0;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCalidadProducto.add(this.jButtonAnterioresCalidadProducto, this.gridBagConstraintsCalidadProducto);
					
						
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCalidadProducto.gridy = 0;
			
			this.jPanelPaginacionCalidadProducto.add(this.jButtonNuevoGuardarCambiosCalidadProducto, this.gridBagConstraintsCalidadProducto);
						
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCalidadProducto.gridy = 0;
			this.jPanelPaginacionCalidadProducto.add(this.jButtonSiguientesCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 1;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalidadProducto.add(this.jButtonNuevoCalidadProducto, this.gridBagConstraintsCalidadProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCalidadProducto.gridy = 1;
				this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCalidadProducto.add(this.jButtonNuevoRelacionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
			}
			
			
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCalidadProducto.gridy = 1;
				this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCalidadProducto.add(this.jButtonGuardarCambiosTablaCalidadProducto, this.gridBagConstraintsCalidadProducto);
			}
			
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 1;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalidadProducto.add(this.jButtonDuplicarCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 1;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalidadProducto.add(this.jButtonCopiarCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 1;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCalidadProducto.add(this.jButtonVerFormCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 1;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCalidadProducto.add(this.jButtonCerrarCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
		
		
		this.jButtonRecargarInformacionCalidadProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCalidadProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCalidadProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCalidadProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCalidadProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCalidadProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCalidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCalidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCalidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCalidadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCalidadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCalidadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCalidadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCalidadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCalidadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCalidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCalidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCalidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCalidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCalidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCalidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCalidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCalidadProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCalidadProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCalidadProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCalidadProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCalidadProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCalidadProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCalidadProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCalidadProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCalidadProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCalidadProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCalidadProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCalidadProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCalidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCalidadProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CalidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CalidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CalidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CalidadProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCalidadProducto.setLayout(gridaBagParametrosReportesCalidadProducto);
			this.jPanelParametrosReportesAccionesCalidadProducto.setLayout(gridaBagParametrosReportesAccionesCalidadProducto);
			
			
			this.jPanelParametrosAuxiliar1CalidadProducto.setLayout(gridaBagParametrosAuxiliar1CalidadProducto);
			this.jPanelParametrosAuxiliar2CalidadProducto.setLayout(gridaBagParametrosAuxiliar2CalidadProducto);
			this.jPanelParametrosAuxiliar3CalidadProducto.setLayout(gridaBagParametrosAuxiliar3CalidadProducto);
			this.jPanelParametrosAuxiliar4CalidadProducto.setLayout(gridaBagParametrosAuxiliar4CalidadProducto);
			//this.jPanelParametrosAuxiliar5CalidadProducto.setLayout(gridaBagParametrosAuxiliar2CalidadProducto);			
			
			
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalidadProducto.add(this.jButtonRecargarInformacionCalidadProducto, this.gridBagConstraintsCalidadProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalidadProducto.add(this.jComboBoxTiposPaginacionCalidadProducto, this.gridBagConstraintsCalidadProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalidadProducto.add(this.jCheckBoxConAltoMaximoTablaCalidadProducto, this.gridBagConstraintsCalidadProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CalidadProducto.add(this.jComboBoxTiposArchivosReportesCalidadProducto, this.gridBagConstraintsCalidadProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalidadProducto.add(this.jPanelParametrosAuxiliar1CalidadProducto, this.gridBagConstraintsCalidadProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CalidadProducto.add(this.jComboBoxTiposReportesCalidadProducto, this.gridBagConstraintsCalidadProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalidadProducto.add(this.jPanelParametrosAuxiliar4CalidadProducto, this.gridBagConstraintsCalidadProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalidadProducto.add(this.jComboBoxTiposReportesCalidadProducto, this.gridBagConstraintsCalidadProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalidadProducto.add(this.jCheckBoxGenerarReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalidadProducto.add(this.jPanelParametrosAuxiliar2CalidadProducto, this.gridBagConstraintsCalidadProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalidadProducto.add(this.jLabelAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCalidadProducto.add(this.jButtonAbrirOrderByCalidadProducto, this.gridBagConstraintsCalidadProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalidadProducto.add(this.jComboBoxTiposSeleccionarCalidadProducto, this.gridBagConstraintsCalidadProducto);			
			
			
			/*
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCalidadProducto.add(this.jCheckBoxSeleccionarTodosCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CalidadProducto.add(this.jCheckBoxSeleccionarTodosCalidadProducto, this.gridBagConstraintsCalidadProducto);															
				
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCalidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CalidadProducto.add(this.jCheckBoxSeleccionadosCalidadProducto, this.gridBagConstraintsCalidadProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCalidadProducto.add(this.jPanelParametrosAuxiliar3CalidadProducto, this.gridBagConstraintsCalidadProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalidadProducto.add(this.jComboBoxTiposRelacionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
				
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalidadProducto.add(this.jComboBoxTiposAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
	
				
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCalidadProducto.add(this.jTextFieldValorCampoGeneralCalidadProducto, this.gridBagConstraintsCalidadProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCalidadProducto = new GridBagLayout();

			this.jScrollPanelDatosCalidadProducto.setLayout(gridaBagLayoutDatosCalidadProducto);
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = 0;
			this.gridBagConstraintsCalidadProducto.gridx = 0;
			
			this.jScrollPanelDatosCalidadProducto.add(this.jTableDatosCalidadProducto, this.gridBagConstraintsCalidadProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCalidadProducto.setViewportView(this.jTableDatosCalidadProducto);
		this.jTableDatosCalidadProducto.setFillsViewportHeight(true);
		this.jTableDatosCalidadProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCalidadProducto= new GridBagLayout();
		this.jPanelAccionesCalidadProducto.setLayout(gridaBagLayoutAccionesCalidadProducto);
		
		
		/*	
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = 0;
		this.gridBagConstraintsCalidadProducto.gridx = 0;
			
		this.jPanelAccionesCalidadProducto.add(this.jButtonNuevoCalidadProducto, this.gridBagConstraintsCalidadProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoCalidadProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoCalidadProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCalidadProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCalidadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoCalidadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoCalidadProducto.setLayout(gridaBagLayoutBusquedaPorCodigoCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 0;
		gridBagConstraintsCalidadProducto.gridx = 0;
		jPanelBusquedaPorCodigoCalidadProducto.add(jLabelcodigoBusquedaPorCodigoCalidadProducto, gridBagConstraintsCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 0;
		gridBagConstraintsCalidadProducto.gridx = 1;
		jPanelBusquedaPorCodigoCalidadProducto.add(jTextFieldcodigoBusquedaPorCodigoCalidadProducto, gridBagConstraintsCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 1;
		gridBagConstraintsCalidadProducto.gridx =1;
		jPanelBusquedaPorCodigoCalidadProducto.add(jButtonBusquedaPorCodigoCalidadProducto, gridBagConstraintsCalidadProducto);

		jTabbedPaneBusquedasCalidadProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoCalidadProducto);
		jTabbedPaneBusquedasCalidadProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCalidadProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCalidadProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCalidadProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCalidadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCalidadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCalidadProducto.setLayout(gridaBagLayoutBusquedaPorNombreCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 0;
		gridBagConstraintsCalidadProducto.gridx = 0;
		jPanelBusquedaPorNombreCalidadProducto.add(jLabelnombreBusquedaPorNombreCalidadProducto, gridBagConstraintsCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 0;
		gridBagConstraintsCalidadProducto.gridx = 1;
		jPanelBusquedaPorNombreCalidadProducto.add(jTextAreanombreBusquedaPorNombreCalidadProducto, gridBagConstraintsCalidadProducto);

		gridBagConstraintsCalidadProducto = new GridBagConstraints();
		gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCalidadProducto.gridy = 1;
		gridBagConstraintsCalidadProducto.gridx =1;
		jPanelBusquedaPorNombreCalidadProducto.add(jButtonBusquedaPorNombreCalidadProducto, gridBagConstraintsCalidadProducto);

		jTabbedPaneBusquedasCalidadProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreCalidadProducto);
		jTabbedPaneBusquedasCalidadProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCalidadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCalidadProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();						
			this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalidadProducto.gridx = 0;		
			//this.gridBagConstraintsCalidadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCalidadProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCalidadProducto, this.gridBagConstraintsCalidadProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCalidadProducto.gridx = 0;		
		//this.gridBagConstraintsCalidadProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCalidadProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCalidadProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalidadProducto.gridx = 0;		
			this.gridBagConstraintsCalidadProducto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCalidadProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCalidadProducto, this.gridBagConstraintsCalidadProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCalidadProducto, this.gridBagConstraintsCalidadProducto);								
		
		
		/*
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
		*/		
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCalidadProducto.gridx =0;
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCalidadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCalidadProducto, this.gridBagConstraintsCalidadProducto);
				
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCalidadProducto, this.gridBagConstraintsCalidadProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCalidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCalidadProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosCalidadProducto.setLayout(gridaBagLayoutBusquedasParametrosCalidadProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCalidadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCalidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCalidadProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCalidadProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCalidadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCalidadProducto.setName("jPanelReporteDinamicoCalidadProducto"); 
		
		this.jPanelReporteDinamicoCalidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCalidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCalidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCalidadProducto.setLayout(gridaBagLayoutReporteDinamicoCalidadProducto);
		
		
		this.jInternalFrameReporteDinamicoCalidadProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCalidadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCalidadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCalidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCalidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCalidadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCalidadProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCalidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCalidadProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoCalidadProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoCalidadProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCalidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCalidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCalidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCalidadProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteCalidadProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCalidadProducto.add(this.jLabelColumnasSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCalidadProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteCalidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCalidadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCalidadProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCalidadProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCalidadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCalidadProducto=new JScrollPane(this.jListColumnasSelectReporteCalidadProducto);
			
			this.jScrollColumnasSelectReporteCalidadProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCalidadProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCalidadProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCalidadProducto.add(this.jListColumnasSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		this.jPanelReporteDinamicoCalidadProducto.add(this.jScrollColumnasSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCalidadProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteCalidadProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCalidadProducto.add(this.jLabelRelacionesSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCalidadProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteCalidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCalidadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCalidadProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCalidadProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCalidadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCalidadProducto=new JScrollPane(this.jListRelacionesSelectReporteCalidadProducto);
			
			this.jScrollRelacionesSelectReporteCalidadProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCalidadProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCalidadProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCalidadProducto.add(this.jListRelacionesSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		this.jPanelReporteDinamicoCalidadProducto.add(this.jScrollRelacionesSelectReporteCalidadProducto, this.gridBagConstraintsCalidadProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCalidadProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCalidadProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoCalidadProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCalidadProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCalidadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCalidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCalidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCalidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCalidadProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCalidadProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalidadProducto.add(this.jLabelGenerarExcelReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCalidadProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCalidadProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCalidadProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCalidadProducto.setToolTipText("Generar EXCEL"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCalidadProducto.add(this.jButtonGenerarExcelReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalidadProducto.add(this.jComboBoxTiposReportesDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCalidadProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCalidadProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCalidadProducto.add(this.jLabelTiposArchivoReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalidadProducto.add(this.jComboBoxTiposArchivosReportesDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCalidadProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCalidadProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCalidadProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCalidadProducto.setToolTipText("Generar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalidadProducto.add(this.jButtonGenerarReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCalidadProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCalidadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCalidadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCalidadProducto.setToolTipText("Cancelar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCalidadProducto.add(this.jButtonCerrarReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCalidadProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCalidadProducto= new JScrollPane(jPanelReporteDinamicoCalidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCalidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCalidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCalidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCalidadProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCalidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCalidadProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCalidadProducto);
		this.jInternalFrameReporteDinamicoCalidadProducto.getContentPane().add(this.jScrollPanelReporteDinamicoCalidadProducto, this.gridBagConstraintsCalidadProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCalidadProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCalidadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCalidadProducto.setName("jPanelImportacionCalidadProducto"); 
		
		this.jPanelImportacionCalidadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCalidadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCalidadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCalidadProducto.setLayout(gridaBagLayoutImportacionCalidadProducto);
		
		
		this.jInternalFrameImportacionCalidadProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCalidadProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCalidadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCalidadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCalidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCalidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCalidadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCalidadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCalidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCalidadProducto.setResizable(true);
	    this.jInternalFrameImportacionCalidadProducto.setClosable(true);
	    this.jInternalFrameImportacionCalidadProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCalidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCalidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCalidadProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCalidadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCalidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCalidadProducto.setResizable(true);
	    this.jInternalFrameImportacionCalidadProducto.setClosable(true);
	    this.jInternalFrameImportacionCalidadProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCalidadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCalidadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCalidadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCalidadProducto = new JLabelMe();

		this.jLabelArchivoImportacionCalidadProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCalidadProducto.add(this.jLabelArchivoImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCalidadProducto = new JFileChooser();		
		this.jFileChooserImportacionCalidadProducto.setToolTipText("ESCOGER ARCHIVO"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCalidadProducto = new JButtonMe();
		this.jButtonAbrirImportacionCalidadProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCalidadProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCalidadProducto.setToolTipText("Generar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalidadProducto.add(this.jButtonAbrirImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCalidadProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionCalidadProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCalidadProducto.add(this.jLabelPathArchivoImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCalidadProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCalidadProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCalidadProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCalidadProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalidadProducto.add(this.jTextFieldPathArchivoImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCalidadProducto = new JButtonMe();
		this.jButtonGenerarImportacionCalidadProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCalidadProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCalidadProducto.setToolTipText("Generar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalidadProducto.add(this.jButtonGenerarImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCalidadProducto = new JButtonMe();
		this.jButtonCerrarImportacionCalidadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCalidadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCalidadProducto.setToolTipText("Cancelar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCalidadProducto.add(this.jButtonCerrarImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCalidadProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionCalidadProducto= new JScrollPane(jPanelImportacionCalidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsCalidadProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCalidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCalidadProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCalidadProducto);
		this.jInternalFrameImportacionCalidadProducto.getContentPane().add(this.jScrollPanelImportacionCalidadProducto, this.gridBagConstraintsCalidadProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCalidadProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCalidadProducto = new JButtonMe();
			this.jButtonAbrirOrderByCalidadProducto.setText("Orden");
			this.jButtonAbrirOrderByCalidadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCalidadProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCalidadProducto";
			inputMap = this.jButtonAbrirOrderByCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCalidadProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByCalidadProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCalidadProducto.setName("jPanelOrderByCalidadProducto"); 
			
			this.jPanelOrderByCalidadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCalidadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCalidadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCalidadProducto.setLayout(gridaBagLayoutOrderByCalidadProducto);
			
			
			this.jTableDatosCalidadProductoOrderBy = new JTableMe();        
			this.jTableDatosCalidadProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCalidadProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCalidadProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCalidadProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCalidadProductoOrderBy.setViewportView(this.jTableDatosCalidadProductoOrderBy);
			this.jTableDatosCalidadProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCalidadProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCalidadProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCalidadProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCalidadProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCalidadProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCalidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCalidadProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCalidadProducto.setTitle("Orden");
			this.jInternalFrameOrderByCalidadProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCalidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCalidadProducto.setResizable(true);
			this.jInternalFrameOrderByCalidadProducto.setClosable(true);
			this.jInternalFrameOrderByCalidadProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCalidadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCalidadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCalidadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCalidadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCalidadProducto.ipady =150;
				
			this.jPanelOrderByCalidadProducto.add(jScrollPanelDatosCalidadProductoOrderBy, this.gridBagConstraintsCalidadProducto);//this.jTableDatosCalidadProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCalidadProducto = new JButtonMe();
			this.jButtonCerrarOrderByCalidadProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCalidadProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCalidadProducto.setToolTipText("Cancelar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCalidadProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCalidadProducto.add(this.jButtonCerrarOrderByCalidadProducto, this.gridBagConstraintsCalidadProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCalidadProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByCalidadProducto= new JScrollPane(jPanelOrderByCalidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsCalidadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCalidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCalidadProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCalidadProducto);
			
			this.jInternalFrameOrderByCalidadProducto.getContentPane().add(this.jScrollPanelOrderByCalidadProducto, this.gridBagConstraintsCalidadProducto);			
		
		} else {
			this.jButtonAbrirOrderByCalidadProducto = new JButtonMe();
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
			&& this.calidadproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCalidadProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCalidadProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCalidadProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCalidadProducto.getRowHeight();//CalidadProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CalidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCalidadProducto.isSelected()) {
					iHeightTable=CalidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CalidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CalidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CalidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCalidadProducto.isSelected()) {
					iHeightTable=CalidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CalidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CalidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCalidadProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCalidadProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCalidadProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCalidadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCalidadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCalidadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCalidadProducto!=null && this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCalidadProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCalidadProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCalidadProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCalidadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCalidadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCalidadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=calidadproductoLogic.getCalidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calidadproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CalidadProducto> TraerCalidadProductoBeans(List<CalidadProducto> calidadproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CalidadProducto calidadproducto:calidadproductos) {
					
				if(!(CalidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CalidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					calidadproducto.setsDetalleGeneralEntityReporte(CalidadProductoConstantesFunciones.getCalidadProductoDescripcion(calidadproducto));
										
						
					
					

					if(calidadproducto.getBodegas()!=null && Funciones.existeClass(classes,Bodega.class)) {
						try{calidadproducto.setbodegasDescripcionReporte(new JRBeanCollectionDataSource(BodegaJInternalFrame.TraerBodegaBeans(calidadproducto.getBodegas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(calidadproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{calidadproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(calidadproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//calidadproducto.setsDetalleGeneralEntityReporte(calidadproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//calidadproductobeans.add(calidadproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return calidadproductos;
    }
	//PARA REPORTES FIN
}
