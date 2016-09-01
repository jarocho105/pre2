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
import com.bydan.erp.inventario.util.EstadoBodegaProductoConstantesFunciones;

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
public class EstadoBodegaProductoJInternalFrame extends EstadoBodegaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoBodegaProducto;
	
	protected JMenuBar jmenuBarEstadoBodegaProducto;
	
	protected JMenu jmenuEstadoBodegaProducto;
	protected JMenu jmenuDatosEstadoBodegaProducto;
	protected JMenu jmenuArchivoEstadoBodegaProducto;
	protected JMenu jmenuAccionesEstadoBodegaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoBodegaProducto;	
	protected GridBagConstraints gridBagConstraintsEstadoBodegaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoBodegaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoBodegaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoBodegaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoBodegaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoBodegaProducto> estadobodegaproductos;		
	public List<EstadoBodegaProducto> estadobodegaproductosEliminados;	
	public List<EstadoBodegaProducto> estadobodegaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoBodegaProducto;		
	protected JButton jButtonAbrirOrderByEstadoBodegaProducto;
	
	
	//protected JPanel jPanelOrderByEstadoBodegaProducto;
	//public JScrollPane jScrollPanelOrderByEstadoBodegaProducto;	
	//protected JButton jButtonCerrarOrderByEstadoBodegaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoBodegaProductoLogic estadobodegaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoBodegaProducto;
	public JScrollPane jScrollPanelDatosEdicionEstadoBodegaProducto;
	public JScrollPane jScrollPanelDatosGeneralEstadoBodegaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoBodegaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoBodegaProducto;
	//public JScrollPane jScrollPanelImportacionEstadoBodegaProducto;
	
	
	
	protected JPanel jPanelAccionesEstadoBodegaProducto;
	
    protected JPanel jPanelPaginacionEstadoBodegaProducto;
    protected JPanel jPanelParametrosReportesEstadoBodegaProducto;
	protected JPanel jPanelParametrosReportesAccionesEstadoBodegaProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoBodegaProducto;
	protected JPanel jPanelParametrosAuxiliar2EstadoBodegaProducto;
	protected JPanel jPanelParametrosAuxiliar3EstadoBodegaProducto;
	protected JPanel jPanelParametrosAuxiliar4EstadoBodegaProducto;
	//protected JPanel jPanelParametrosAuxiliar5EstadoBodegaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoBodegaProducto;
	//protected JPanel jPanelImportacionEstadoBodegaProducto;
	
	
	public JTable jTableDatosEstadoBodegaProducto;
	
	
	
	//public JTable jTableDatosEstadoBodegaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoBodegaProducto;
	protected JButton jButtonDuplicarEstadoBodegaProducto;
	protected JButton jButtonCopiarEstadoBodegaProducto;
	protected JButton jButtonVerFormEstadoBodegaProducto;
	protected JButton jButtonNuevoRelacionesEstadoBodegaProducto;
	protected JButton jButtonModificarEstadoBodegaProducto;
	
    protected JButton jButtonGuardarCambiosTablaEstadoBodegaProducto;
	protected JButton jButtonCerrarEstadoBodegaProducto;
	
	
	protected JButton jButtonRecargarInformacionEstadoBodegaProducto;
	protected JButton jButtonProcesarInformacionEstadoBodegaProducto;
	
	
	protected JButton jButtonAnterioresEstadoBodegaProducto;
	protected JButton jButtonSiguientesEstadoBodegaProducto;
	protected JButton jButtonNuevoGuardarCambiosEstadoBodegaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoBodegaProducto;
	//protected JButton jButtonCerrarReporteDinamicoEstadoBodegaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoBodegaProducto;
	//protected JButton jButtonGenerarImportacionEstadoBodegaProducto;
	//protected JButton jButtonCerrarImportacionEstadoBodegaProducto;
	//protected JFileChooser jFileChooserImportacionEstadoBodegaProducto;
	//protected File fileImportacionEstadoBodegaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoBodegaProducto;
	protected JButton jButtonDuplicarToolBarEstadoBodegaProducto;
	protected JButton jButtonNuevoRelacionesToolBarEstadoBodegaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoBodegaProducto;
	protected JButton jButtonCopiarToolBarEstadoBodegaProducto;
	protected JButton jButtonVerFormToolBarEstadoBodegaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoBodegaProducto;
	protected JButton jButtonCerrarToolBarEstadoBodegaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoBodegaProducto;
	protected JButton jButtonProcesarInformacionToolBarEstadoBodegaProducto;
	protected JButton jButtonAnterioresToolBarEstadoBodegaProducto;
	protected JButton jButtonSiguientesToolBarEstadoBodegaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto;
	protected JButton jButtonAbrirOrderByToolBarEstadoBodegaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoBodegaProducto;
	protected JMenuItem jMenuItemDuplicarEstadoBodegaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoBodegaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoBodegaProducto;
	protected JMenuItem jMenuItemCopiarEstadoBodegaProducto;
	protected JMenuItem jMenuItemVerFormEstadoBodegaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoBodegaProducto;
	protected JMenuItem jMenuItemCerrarEstadoBodegaProducto;
	protected JMenuItem jMenuItemDetalleCerrarEstadoBodegaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoBodegaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoBodegaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoBodegaProducto;
	protected JMenuItem jMenuItemProcesarInformacionEstadoBodegaProducto;
	protected JMenuItem jMenuItemAnterioresEstadoBodegaProducto;
	protected JMenuItem jMenuItemSiguientesEstadoBodegaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoBodegaProducto;
	protected JMenuItem jMenuItemAbrirOrderByEstadoBodegaProducto;
	protected JMenuItem jMenuItemMostrarOcultarEstadoBodegaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoBodegaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoBodegaProducto;
	protected JCheckBox jCheckBoxSeleccionadosEstadoBodegaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoBodegaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoBodegaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoBodegaProducto;
	protected JTextField jTextFieldValorCampoGeneralEstadoBodegaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoBodegaProducto;
	//public JList<Reporte> jListColumnasSelectReporteEstadoBodegaProducto;
	//public JScrollPane jScrollColumnasSelectReporteEstadoBodegaProducto;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoBodegaProducto;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoBodegaProducto;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoBodegaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoBodegaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoBodegaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto;
	
		
	//public JLabel jLabelArchivoImportacionEstadoBodegaProducto;	
	//public JLabel jLabelPathArchivoImportacionEstadoBodegaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoBodegaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoBodegaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoBodegaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoBodegaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoBodegaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoBodegaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoBodegaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoBodegaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoBodegaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoBodegaProducto;	
	
	
	
	
	
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
	public EstadoBodegaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoBodegaProducto)	{
		this.jButtonRecargarInformacionEstadoBodegaProducto = jButtonRecargarInformacionEstadoBodegaProducto;
	}
	
	public JButton getjButtonProcesarInformacionEstadoBodegaProducto() {
		return this.jButtonProcesarInformacionEstadoBodegaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoBodegaProducto)	{
		this.jButtonProcesarInformacionEstadoBodegaProducto = jButtonProcesarInformacionEstadoBodegaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoBodegaProducto() {
		return this.jButtonRecargarInformacionEstadoBodegaProducto;
	}
	
	
	public List<EstadoBodegaProducto> getestadobodegaproductos() {
		return this.estadobodegaproductos;
	}

	public void setestadobodegaproductos(List<EstadoBodegaProducto> estadobodegaproductos) {
		this.estadobodegaproductos = estadobodegaproductos;
	}
	
	public List<EstadoBodegaProducto> getestadobodegaproductosAux() {
		return this.estadobodegaproductosAux;
	}

	public void setestadobodegaproductosAux(List<EstadoBodegaProducto> estadobodegaproductosAux) {
		this.estadobodegaproductosAux = estadobodegaproductosAux;
	}
	
	public List<EstadoBodegaProducto> getestadobodegaproductosEliminados() {
		return this.estadobodegaproductosEliminados;
	}

	public void setEstadoBodegaProductosEliminados(List<EstadoBodegaProducto> estadobodegaproductosEliminados) {
		this.estadobodegaproductosEliminados = estadobodegaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoBodegaProducto() {
		return jComboBoxTiposSeleccionarEstadoBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoBodegaProducto(
			JComboBox jComboBoxTiposSeleccionarEstadoBodegaProducto) {
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto = jComboBoxTiposSeleccionarEstadoBodegaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoBodegaProducto() {
		return jTextFieldValorCampoGeneralEstadoBodegaProducto;
	}

	public void setjTextFieldValorCampoGeneralEstadoBodegaProducto(
			JTextField jTextFieldValorCampoGeneralEstadoBodegaProducto) {
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto = jTextFieldValorCampoGeneralEstadoBodegaProducto;
	}

	public void setBorderResaltarValorCampoGeneralEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoBodegaProducto() {
		return this.jCheckBoxSeleccionarTodosEstadoBodegaProducto;
	}

	public void setjCheckBoxSeleccionarTodosEstadoBodegaProducto(
			JCheckBox jCheckBoxSeleccionarTodosEstadoBodegaProducto) {
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto = jCheckBoxSeleccionarTodosEstadoBodegaProducto;
	}

	public void setBorderResaltarSeleccionarTodosEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoBodegaProducto() {
		return this.jCheckBoxSeleccionadosEstadoBodegaProducto;
	}

	public void setjCheckBoxSeleccionadosEstadoBodegaProducto(
			JCheckBox jCheckBoxSeleccionadosEstadoBodegaProducto) {
		this.jCheckBoxSeleccionadosEstadoBodegaProducto = jCheckBoxSeleccionadosEstadoBodegaProducto;
	}
	
	public void setBorderResaltarSeleccionadosEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoBodegaProducto() {
		return this.jComboBoxTiposArchivosReportesEstadoBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoBodegaProducto(
			JComboBox jComboBoxTiposArchivosReportesEstadoBodegaProducto) {
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto = jComboBoxTiposArchivosReportesEstadoBodegaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoBodegaProducto() {
		return this.jComboBoxTiposReportesEstadoBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoBodegaProducto(
			JComboBox jComboBoxTiposReportesEstadoBodegaProducto) {
		this.jComboBoxTiposReportesEstadoBodegaProducto = jComboBoxTiposReportesEstadoBodegaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoBodegaProducto() {
	//	return jComboBoxTiposReportesDinamicoEstadoBodegaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoBodegaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoBodegaProducto) {
	//	this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto = jComboBoxTiposReportesDinamicoEstadoBodegaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto = jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto;
	//}
	
	public void setBorderResaltarTiposReportesEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoBodegaProducto() {
		return this.jComboBoxTiposGraficosReportesEstadoBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoBodegaProducto(
			JComboBox jComboBoxTiposGraficosReportesEstadoBodegaProducto) {
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto = jComboBoxTiposGraficosReportesEstadoBodegaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoBodegaProducto() {
		return this.jComboBoxTiposPaginacionEstadoBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoBodegaProducto(
			JComboBox jComboBoxTiposPaginacionEstadoBodegaProducto) {
		this.jComboBoxTiposPaginacionEstadoBodegaProducto = jComboBoxTiposPaginacionEstadoBodegaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoBodegaProducto() {
		return this.jComboBoxTiposRelacionesEstadoBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoBodegaProducto() {
		return this.jComboBoxTiposAccionesEstadoBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoBodegaProducto(
			JComboBox jComboBoxTiposRelacionesEstadoBodegaProducto) {
		this.jComboBoxTiposRelacionesEstadoBodegaProducto = jComboBoxTiposRelacionesEstadoBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoBodegaProducto(
			JComboBox jComboBoxTiposAccionesEstadoBodegaProducto) {
		this.jComboBoxTiposAccionesEstadoBodegaProducto = jComboBoxTiposAccionesEstadoBodegaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoBodegaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoBodegaProducto() {
	//	return jCheckBoxConGraficoDinamicoEstadoBodegaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoBodegaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoBodegaProducto) {
	//	this.jCheckBoxConGraficoDinamicoEstadoBodegaProducto = jCheckBoxConGraficoDinamicoEstadoBodegaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoBodegaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoBodegaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoBodegaProducto .setBorder(borderResaltar);		
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
		this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		
		this.estadobodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadobodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadobodegaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoBodegaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Bodega Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoBodegaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoBodegaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"nuevo","nuevo","Nuevo"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"duplicar","duplicar","Duplicar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"copiar","copiar","Copiar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"ver_form","ver_form","Ver"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"recargar","recargar","Recargar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,
							"cerrar","cerrar","Salir"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoBodegaProducto;
			
				this.jButtonProcesarInformacionToolBarEstadoBodegaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoBodegaProducto;
				
		//protected JButton jButtonModificarToolBarEstadoBodegaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoBodegaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoBodegaProducto=new JMenuMe("General");
		this.jmenuArchivoEstadoBodegaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoBodegaProducto=new JMenuMe("Acciones");
		this.jmenuDatosEstadoBodegaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoBodegaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoBodegaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoBodegaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoBodegaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoBodegaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoBodegaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoBodegaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoBodegaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoBodegaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoBodegaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoBodegaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoBodegaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoBodegaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoBodegaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoBodegaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoBodegaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoBodegaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoBodegaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoBodegaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoBodegaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoBodegaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoBodegaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoBodegaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoBodegaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoBodegaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoBodegaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoBodegaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoBodegaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoBodegaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoBodegaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoBodegaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoBodegaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoBodegaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoBodegaProducto.add(this.jMenuItemCerrarEstadoBodegaProducto);
			
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemNuevoEstadoBodegaProducto);
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto);
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemNuevoRelacionesEstadoBodegaProducto);
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto);		
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemDuplicarEstadoBodegaProducto);		
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemCopiarEstadoBodegaProducto);		
			this.jmenuAccionesEstadoBodegaProducto.add(this.jMenuItemVerFormEstadoBodegaProducto);		
			
			this.jmenuDatosEstadoBodegaProducto.add(this.jMenuItemRecargarInformacionEstadoBodegaProducto);				
			this.jmenuDatosEstadoBodegaProducto.add(this.jMenuItemAnterioresEstadoBodegaProducto);				
			this.jmenuDatosEstadoBodegaProducto.add(this.jMenuItemSiguientesEstadoBodegaProducto);				
			this.jmenuDatosEstadoBodegaProducto.add(this.jMenuItemAbrirOrderByEstadoBodegaProducto);				
			this.jmenuDatosEstadoBodegaProducto.add(this.jMenuItemMostrarOcultarEstadoBodegaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoBodegaProducto.add(this.jMenuItemGuardarCambiosEstadoBodegaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoBodegaProducto.add(this.jmenuArchivoEstadoBodegaProducto);		
			this.jmenuBarEstadoBodegaProducto.add(this.jmenuAccionesEstadoBodegaProducto);		
			this.jmenuBarEstadoBodegaProducto.add(this.jmenuDatosEstadoBodegaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoBodegaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoBodegaProducto() {
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
			//this.jInternalFrameDetalleEstadoBodegaProducto = new EstadoBodegaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Bodega Producto DATOS");
			this.jInternalFrameDetalleFormEstadoBodegaProducto = new EstadoBodegaProductoDetalleFormJInternalFrame(jDesktopPane,this.estadobodegaproductoSessionBean.getConGuardarRelaciones(),this.estadobodegaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoBodegaProducto = null;//new EstadoBodegaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoBodegaProducto= new GridBagLayout();
		
		
		this.jTableDatosEstadoBodegaProducto = new JTableMe();      
		
		String sToolTipEstadoBodegaProducto="";
		sToolTipEstadoBodegaProducto=EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoBodegaProducto+="(Inventario.EstadoBodegaProducto)";
		}
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoBodegaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoBodegaProducto.setToolTipText(sToolTipEstadoBodegaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoBodegaProducto);
		this.jTableDatosEstadoBodegaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoBodegaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoBodegaProducto.setRowSelectionAllowed(true);
		this.jTableDatosEstadoBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoBodegaProducto = new JButtonMe();
		this.jButtonDuplicarEstadoBodegaProducto = new JButtonMe();
		this.jButtonCopiarEstadoBodegaProducto = new JButtonMe();
		this.jButtonVerFormEstadoBodegaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoBodegaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto = new JButtonMe();
		this.jButtonCerrarEstadoBodegaProducto = new JButtonMe();
		
		this.jScrollPanelDatosEstadoBodegaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoBodegaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Bodega Producto";
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoBodegaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesEstadoBodegaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoBodegaProducto=new ReporteDinamicoJInternalFrame(EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoBodegaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoBodegaProducto=new ImportacionJInternalFrame(EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoBodegaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoBodegaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoBodegaProducto.setText("Orden");
		this.jButtonAbrirOrderByEstadoBodegaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoBodegaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoBodegaProducto,false,this);
			
			//this.cargarOrderByEstadoBodegaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoBodegaProducto,true,this);
			
			//this.cargarOrderByEstadoBodegaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoBodegaProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoBodegaProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoBodegaProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoBodegaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoBodegaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoBodegaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoBodegaProducto.setText("Nuevo");
		this.jButtonDuplicarEstadoBodegaProducto.setText("Duplicar");
		this.jButtonCopiarEstadoBodegaProducto.setText("Copiar");
		this.jButtonVerFormEstadoBodegaProducto.setText("Ver");
		this.jButtonNuevoRelacionesEstadoBodegaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setText("Guardar");
		this.jButtonCerrarEstadoBodegaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoBodegaProducto,"nuevo_button","Nuevo",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoBodegaProducto,"duplicar_button","Duplicar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoBodegaProducto,"copiar_button","Copiar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoBodegaProducto,"ver_form","Ver",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoBodegaProducto,"nuevorelaciones_button","Nuevo Rel",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoBodegaProducto,"guardarcambiostabla_button","Guardar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoBodegaProducto,"cerrar_button","Salir",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoBodegaProducto.setToolTipText("Nuevo"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoBodegaProducto.setToolTipText("Duplicar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoBodegaProducto.setToolTipText("Copiar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoBodegaProducto.setToolTipText("Ver"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoBodegaProducto.setToolTipText("Nuevo Rel"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setToolTipText("Guardar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoBodegaProducto.setToolTipText("Salir"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoBodegaProducto";
		inputMap = this.jButtonNuevoEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoBodegaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoBodegaProducto";
		inputMap = this.jButtonDuplicarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoBodegaProducto"));
		
		//COPIAR
		sMapKey = "CopiarEstadoBodegaProducto";
		inputMap = this.jButtonCopiarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoBodegaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoBodegaProducto";
		inputMap = this.jButtonVerFormEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoBodegaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoBodegaProducto";
		inputMap = this.jButtonNuevoRelacionesEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoBodegaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoBodegaProducto";
		inputMap = this.jButtonModificarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoBodegaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoBodegaProducto";
		inputMap = this.jButtonCerrarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoBodegaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoBodegaProducto";
		inputMap = this.jButtonGuardarCambiosTablaEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoBodegaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoBodegaProducto.setName("jPanelParametrosReportesEstadoBodegaProducto"); 
		
		this.jPanelParametrosReportesAccionesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoBodegaProducto.setName("jPanelParametrosReportesAccionesEstadoBodegaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoBodegaProducto = new JButtonMe();
		this.jButtonRecargarInformacionEstadoBodegaProducto.setText("Recargar");
		this.jButtonRecargarInformacionEstadoBodegaProducto.setToolTipText("Recargar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoBodegaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoBodegaProducto = new JButtonMe();
		this.jButtonProcesarInformacionEstadoBodegaProducto.setText("Procesar");
		this.jButtonProcesarInformacionEstadoBodegaProducto.setToolTipText("Procesar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoBodegaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoBodegaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoBodegaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoBodegaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoBodegaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoBodegaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoBodegaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoBodegaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoBodegaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoBodegaProducto.setText("Accion");
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoBodegaProducto = new JLabelMe();
		
		this.jLabelAccionesEstadoBodegaProducto.setText("Acciones");		
		this.jLabelAccionesEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoBodegaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoBodegaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoBodegaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoBodegaProducto = new JButtonMe();
		//this.jButtonAnterioresEstadoBodegaProducto.setText("<<");
        this.jButtonAnterioresEstadoBodegaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoBodegaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoBodegaProducto = new JButtonMe();
		//this.jButtonSiguientesEstadoBodegaProducto.setText(">>");
        this.jButtonSiguientesEstadoBodegaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoBodegaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoBodegaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoBodegaProducto,"nuevoguardarcambios_button","Nue",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoBodegaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoBodegaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoBodegaProducto";
		inputMap = this.jButtonRecargarInformacionEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoBodegaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoBodegaProducto";
		inputMap = this.jButtonSiguientesEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoBodegaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoBodegaProducto";
		inputMap = this.jButtonAnterioresEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoBodegaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoBodegaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoBodegaProducto.setMinimumSize(new Dimension(this.getWidth(),EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoBodegaProducto.setMaximumSize(new Dimension(this.getWidth(),EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoBodegaProducto.setPreferredSize(new Dimension(this.getWidth(),EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoBodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoBodegaProducto = new GridBagLayout();

			this.jPanelPaginacionEstadoBodegaProducto.setLayout(gridaBagLayoutPaginacionEstadoBodegaProducto);						
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonAnterioresEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					
						
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
			
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonNuevoGuardarCambiosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
						
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonSiguientesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonNuevoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
						
			
			
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
				this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonGuardarCambiosTablaEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			}
			
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonDuplicarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonCopiarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonVerFormEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 1;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoBodegaProducto.add(this.jButtonCerrarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
		
		
		this.jButtonRecargarInformacionEstadoBodegaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoBodegaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoBodegaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoBodegaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoBodegaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoBodegaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoBodegaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoBodegaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoBodegaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoBodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoBodegaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoBodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoBodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoBodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoBodegaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoBodegaProducto.setLayout(gridaBagParametrosReportesEstadoBodegaProducto);
			this.jPanelParametrosReportesAccionesEstadoBodegaProducto.setLayout(gridaBagParametrosReportesAccionesEstadoBodegaProducto);
			
			
			this.jPanelParametrosAuxiliar1EstadoBodegaProducto.setLayout(gridaBagParametrosAuxiliar1EstadoBodegaProducto);
			this.jPanelParametrosAuxiliar2EstadoBodegaProducto.setLayout(gridaBagParametrosAuxiliar2EstadoBodegaProducto);
			this.jPanelParametrosAuxiliar3EstadoBodegaProducto.setLayout(gridaBagParametrosAuxiliar3EstadoBodegaProducto);
			this.jPanelParametrosAuxiliar4EstadoBodegaProducto.setLayout(gridaBagParametrosAuxiliar4EstadoBodegaProducto);
			//this.jPanelParametrosAuxiliar5EstadoBodegaProducto.setLayout(gridaBagParametrosAuxiliar2EstadoBodegaProducto);			
			
			
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jButtonRecargarInformacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoBodegaProducto.add(this.jComboBoxTiposPaginacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoBodegaProducto.add(this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoBodegaProducto.add(this.jComboBoxTiposArchivosReportesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jPanelParametrosAuxiliar1EstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoBodegaProducto.add(this.jComboBoxTiposReportesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jPanelParametrosAuxiliar4EstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jComboBoxTiposReportesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jCheckBoxGenerarReporteEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jPanelParametrosAuxiliar2EstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jLabelAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jButtonAbrirOrderByEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jComboBoxTiposSeleccionarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
			
			
			/*
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jCheckBoxSeleccionarTodosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoBodegaProducto.add(this.jCheckBoxSeleccionarTodosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);															
				
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoBodegaProducto.add(this.jCheckBoxSeleccionadosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jPanelParametrosAuxiliar3EstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jComboBoxTiposRelacionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
				
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoBodegaProducto.add(this.jComboBoxTiposAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoBodegaProducto = new GridBagLayout();

			this.jScrollPanelDatosEstadoBodegaProducto.setLayout(gridaBagLayoutDatosEstadoBodegaProducto);
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
			
			this.jScrollPanelDatosEstadoBodegaProducto.add(this.jTableDatosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoBodegaProducto.setViewportView(this.jTableDatosEstadoBodegaProducto);
		this.jTableDatosEstadoBodegaProducto.setFillsViewportHeight(true);
		this.jTableDatosEstadoBodegaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoBodegaProducto= new GridBagLayout();
		this.jPanelAccionesEstadoBodegaProducto.setLayout(gridaBagLayoutAccionesEstadoBodegaProducto);
		
		
		/*	
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
			
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonNuevoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoBodegaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoBodegaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();						
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;		
			//this.gridBagConstraintsEstadoBodegaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoBodegaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;		
		//this.gridBagConstraintsEstadoBodegaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoBodegaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoBodegaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);								
		
		
		/*
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		*/		
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoBodegaProducto.gridx =0;
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoBodegaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
				
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoBodegaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoBodegaProducto.setLayout(gridaBagLayoutBusquedasParametrosEstadoBodegaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoBodegaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoBodegaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoBodegaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoBodegaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoBodegaProducto.setName("jPanelReporteDinamicoEstadoBodegaProducto"); 
		
		this.jPanelReporteDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoBodegaProducto.setLayout(gridaBagLayoutReporteDinamicoEstadoBodegaProducto);
		
		
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoBodegaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoBodegaProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoBodegaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jLabelColumnasSelectReporteEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoBodegaProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoBodegaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoBodegaProducto=new JScrollPane(this.jListColumnasSelectReporteEstadoBodegaProducto);
			
			this.jScrollColumnasSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jListColumnasSelectReporteEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jScrollColumnasSelectReporteEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoBodegaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoBodegaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoBodegaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoBodegaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoBodegaProducto=new JScrollPane(this.jListRelacionesSelectReporteEstadoBodegaProducto);
			
			this.jScrollRelacionesSelectReporteEstadoBodegaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoBodegaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoBodegaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoBodegaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoBodegaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoBodegaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jLabelGenerarExcelReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto.setToolTipText("Generar EXCEL"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jComboBoxTiposReportesDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jLabelTiposArchivoReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoBodegaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoBodegaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoBodegaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoBodegaProducto.setToolTipText("Generar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jButtonGenerarReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoBodegaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoBodegaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoBodegaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoBodegaProducto.setToolTipText("Cancelar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoBodegaProducto.add(this.jButtonCerrarReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoBodegaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto= new JScrollPane(jPanelReporteDinamicoEstadoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoBodegaProducto);
		this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoBodegaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoBodegaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoBodegaProducto.setName("jPanelImportacionEstadoBodegaProducto"); 
		
		this.jPanelImportacionEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoBodegaProducto.setLayout(gridaBagLayoutImportacionEstadoBodegaProducto);
		
		
		this.jInternalFrameImportacionEstadoBodegaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoBodegaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoBodegaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoBodegaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoBodegaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoBodegaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoBodegaProducto.setResizable(true);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setClosable(true);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoBodegaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoBodegaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoBodegaProducto.setResizable(true);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setClosable(true);
	    this.jInternalFrameImportacionEstadoBodegaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoBodegaProducto = new JLabelMe();

		this.jLabelArchivoImportacionEstadoBodegaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoBodegaProducto.add(this.jLabelArchivoImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoBodegaProducto = new JFileChooser();		
		this.jFileChooserImportacionEstadoBodegaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoBodegaProducto = new JButtonMe();
		this.jButtonAbrirImportacionEstadoBodegaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoBodegaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoBodegaProducto.setToolTipText("Generar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoBodegaProducto.add(this.jButtonAbrirImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoBodegaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoBodegaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoBodegaProducto.add(this.jLabelPathArchivoImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoBodegaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoBodegaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoBodegaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoBodegaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoBodegaProducto.add(this.jTextFieldPathArchivoImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoBodegaProducto = new JButtonMe();
		this.jButtonGenerarImportacionEstadoBodegaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoBodegaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoBodegaProducto.setToolTipText("Generar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoBodegaProducto.add(this.jButtonGenerarImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoBodegaProducto = new JButtonMe();
		this.jButtonCerrarImportacionEstadoBodegaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoBodegaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoBodegaProducto.setToolTipText("Cancelar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoBodegaProducto.add(this.jButtonCerrarImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoBodegaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoBodegaProducto= new JScrollPane(jPanelImportacionEstadoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoBodegaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoBodegaProducto);
		this.jInternalFrameImportacionEstadoBodegaProducto.getContentPane().add(this.jScrollPanelImportacionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoBodegaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoBodegaProducto = new JButtonMe();
			this.jButtonAbrirOrderByEstadoBodegaProducto.setText("Orden");
			this.jButtonAbrirOrderByEstadoBodegaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoBodegaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoBodegaProducto";
			inputMap = this.jButtonAbrirOrderByEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoBodegaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoBodegaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoBodegaProducto.setName("jPanelOrderByEstadoBodegaProducto"); 
			
			this.jPanelOrderByEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoBodegaProducto.setLayout(gridaBagLayoutOrderByEstadoBodegaProducto);
			
			
			this.jTableDatosEstadoBodegaProductoOrderBy = new JTableMe();        
			this.jTableDatosEstadoBodegaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoBodegaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoBodegaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoBodegaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoBodegaProductoOrderBy.setViewportView(this.jTableDatosEstadoBodegaProductoOrderBy);
			this.jTableDatosEstadoBodegaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoBodegaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoBodegaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoBodegaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoBodegaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoBodegaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoBodegaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoBodegaProducto.setTitle("Orden");
			this.jInternalFrameOrderByEstadoBodegaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoBodegaProducto.setResizable(true);
			this.jInternalFrameOrderByEstadoBodegaProducto.setClosable(true);
			this.jInternalFrameOrderByEstadoBodegaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoBodegaProducto.ipady =150;
				
			this.jPanelOrderByEstadoBodegaProducto.add(jScrollPanelDatosEstadoBodegaProductoOrderBy, this.gridBagConstraintsEstadoBodegaProducto);//this.jTableDatosEstadoBodegaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoBodegaProducto = new JButtonMe();
			this.jButtonCerrarOrderByEstadoBodegaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoBodegaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoBodegaProducto.setToolTipText("Cancelar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoBodegaProducto.add(this.jButtonCerrarOrderByEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoBodegaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoBodegaProducto= new JScrollPane(jPanelOrderByEstadoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoBodegaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoBodegaProducto);
			
			this.jInternalFrameOrderByEstadoBodegaProducto.getContentPane().add(this.jScrollPanelOrderByEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
		
		} else {
			this.jButtonAbrirOrderByEstadoBodegaProducto = new JButtonMe();
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
			&& this.estadobodegaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoBodegaProducto.getRowHeight();//EstadoBodegaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.isSelected()) {
					iHeightTable=EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoBodegaProducto.isSelected()) {
					iHeightTable=EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoBodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoBodegaProducto!=null && this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoBodegaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoBodegaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoBodegaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadobodegaproductoLogic.getEstadoBodegaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadobodegaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoBodegaProducto> TraerEstadoBodegaProductoBeans(List<EstadoBodegaProducto> estadobodegaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductos) {
					
				if(!(EstadoBodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoBodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadobodegaproducto.setsDetalleGeneralEntityReporte(EstadoBodegaProductoConstantesFunciones.getEstadoBodegaProductoDescripcion(estadobodegaproducto));
										
					estadobodegaproducto.setes_defecto_descripcion(EstadoBodegaProductoConstantesFunciones.getes_defectoDescripcion(estadobodegaproducto));	
					
						
					
				} else  {
							
					//estadobodegaproducto.setsDetalleGeneralEntityReporte(estadobodegaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadobodegaproductobeans.add(estadobodegaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadobodegaproductos;
    }
	//PARA REPORTES FIN
}
