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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.facturacion.util.EstadoDetallePedidoConstantesFunciones;

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
public class EstadoDetallePedidoJInternalFrame extends EstadoDetallePedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetallePedido;
	
	protected JMenuBar jmenuBarEstadoDetallePedido;
	
	protected JMenu jmenuEstadoDetallePedido;
	protected JMenu jmenuDatosEstadoDetallePedido;
	protected JMenu jmenuArchivoEstadoDetallePedido;
	protected JMenu jmenuAccionesEstadoDetallePedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetallePedido;	
	protected GridBagConstraints gridBagConstraintsEstadoDetallePedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetallePedidoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetallePedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetallePedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetallePedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetallePedido> estadodetallepedidos;		
	public List<EstadoDetallePedido> estadodetallepedidosEliminados;	
	public List<EstadoDetallePedido> estadodetallepedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetallePedido;		
	protected JButton jButtonAbrirOrderByEstadoDetallePedido;
	
	
	//protected JPanel jPanelOrderByEstadoDetallePedido;
	//public JScrollPane jScrollPanelOrderByEstadoDetallePedido;	
	//protected JButton jButtonCerrarOrderByEstadoDetallePedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetallePedidoLogic estadodetallepedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetallePedido;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetallePedido;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetallePedido;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetallePedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetallePedido;
	//public JScrollPane jScrollPanelImportacionEstadoDetallePedido;
	
	
	
	protected JPanel jPanelAccionesEstadoDetallePedido;
	
    protected JPanel jPanelPaginacionEstadoDetallePedido;
    protected JPanel jPanelParametrosReportesEstadoDetallePedido;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetallePedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetallePedido;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetallePedido;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetallePedido;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetallePedido;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetallePedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetallePedido;
	//protected JPanel jPanelImportacionEstadoDetallePedido;
	
	
	public JTable jTableDatosEstadoDetallePedido;
	
	
	
	//public JTable jTableDatosEstadoDetallePedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetallePedido;
	protected JButton jButtonDuplicarEstadoDetallePedido;
	protected JButton jButtonCopiarEstadoDetallePedido;
	protected JButton jButtonVerFormEstadoDetallePedido;
	protected JButton jButtonNuevoRelacionesEstadoDetallePedido;
	protected JButton jButtonModificarEstadoDetallePedido;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetallePedido;
	protected JButton jButtonCerrarEstadoDetallePedido;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetallePedido;
	protected JButton jButtonProcesarInformacionEstadoDetallePedido;
	
	
	protected JButton jButtonAnterioresEstadoDetallePedido;
	protected JButton jButtonSiguientesEstadoDetallePedido;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetallePedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetallePedido;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetallePedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetallePedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetallePedido;
	//protected JButton jButtonGenerarImportacionEstadoDetallePedido;
	//protected JButton jButtonCerrarImportacionEstadoDetallePedido;
	//protected JFileChooser jFileChooserImportacionEstadoDetallePedido;
	//protected File fileImportacionEstadoDetallePedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetallePedido;
	protected JButton jButtonDuplicarToolBarEstadoDetallePedido;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetallePedido;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetallePedido;
	protected JButton jButtonCopiarToolBarEstadoDetallePedido;
	protected JButton jButtonVerFormToolBarEstadoDetallePedido;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetallePedido;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetallePedido;
	protected JButton jButtonCerrarToolBarEstadoDetallePedido;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetallePedido;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetallePedido;
	protected JButton jButtonAnterioresToolBarEstadoDetallePedido;
	protected JButton jButtonSiguientesToolBarEstadoDetallePedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetallePedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetallePedido;
	protected JMenuItem jMenuItemDuplicarEstadoDetallePedido;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetallePedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetallePedido;
	protected JMenuItem jMenuItemCopiarEstadoDetallePedido;
	protected JMenuItem jMenuItemVerFormEstadoDetallePedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetallePedido;
	protected JMenuItem jMenuItemCerrarEstadoDetallePedido;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetallePedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetallePedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetallePedido;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetallePedido;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetallePedido;
	protected JMenuItem jMenuItemAnterioresEstadoDetallePedido;
	protected JMenuItem jMenuItemSiguientesEstadoDetallePedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetallePedido;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetallePedido;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetallePedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetallePedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetallePedido;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetallePedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetallePedido;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetallePedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetallePedido;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetallePedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetallePedido;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetallePedido;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetallePedido;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetallePedido;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetallePedido;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetallePedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetallePedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetallePedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetallePedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetallePedido;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetallePedido;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetallePedido;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetallePedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetallePedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetallePedido;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetallePedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetallePedido;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetallePedido;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetallePedido;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetallePedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetallePedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetallePedido;	
	
	
	
	
	
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
	public EstadoDetallePedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetallePedido)	{
		this.jButtonRecargarInformacionEstadoDetallePedido = jButtonRecargarInformacionEstadoDetallePedido;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetallePedido() {
		return this.jButtonProcesarInformacionEstadoDetallePedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetallePedido)	{
		this.jButtonProcesarInformacionEstadoDetallePedido = jButtonProcesarInformacionEstadoDetallePedido;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetallePedido() {
		return this.jButtonRecargarInformacionEstadoDetallePedido;
	}
	
	
	public List<EstadoDetallePedido> getestadodetallepedidos() {
		return this.estadodetallepedidos;
	}

	public void setestadodetallepedidos(List<EstadoDetallePedido> estadodetallepedidos) {
		this.estadodetallepedidos = estadodetallepedidos;
	}
	
	public List<EstadoDetallePedido> getestadodetallepedidosAux() {
		return this.estadodetallepedidosAux;
	}

	public void setestadodetallepedidosAux(List<EstadoDetallePedido> estadodetallepedidosAux) {
		this.estadodetallepedidosAux = estadodetallepedidosAux;
	}
	
	public List<EstadoDetallePedido> getestadodetallepedidosEliminados() {
		return this.estadodetallepedidosEliminados;
	}

	public void setEstadoDetallePedidosEliminados(List<EstadoDetallePedido> estadodetallepedidosEliminados) {
		this.estadodetallepedidosEliminados = estadodetallepedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetallePedido() {
		return jComboBoxTiposSeleccionarEstadoDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetallePedido(
			JComboBox jComboBoxTiposSeleccionarEstadoDetallePedido) {
		this.jComboBoxTiposSeleccionarEstadoDetallePedido = jComboBoxTiposSeleccionarEstadoDetallePedido;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetallePedido() {
		return jTextFieldValorCampoGeneralEstadoDetallePedido;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetallePedido(
			JTextField jTextFieldValorCampoGeneralEstadoDetallePedido) {
		this.jTextFieldValorCampoGeneralEstadoDetallePedido = jTextFieldValorCampoGeneralEstadoDetallePedido;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetallePedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetallePedido() {
		return this.jCheckBoxSeleccionarTodosEstadoDetallePedido;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetallePedido(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetallePedido) {
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido = jCheckBoxSeleccionarTodosEstadoDetallePedido;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetallePedido() {
		return this.jCheckBoxSeleccionadosEstadoDetallePedido;
	}

	public void setjCheckBoxSeleccionadosEstadoDetallePedido(
			JCheckBox jCheckBoxSeleccionadosEstadoDetallePedido) {
		this.jCheckBoxSeleccionadosEstadoDetallePedido = jCheckBoxSeleccionadosEstadoDetallePedido;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetallePedido() {
		return this.jComboBoxTiposArchivosReportesEstadoDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetallePedido(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetallePedido) {
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido = jComboBoxTiposArchivosReportesEstadoDetallePedido;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetallePedido() {
		return this.jComboBoxTiposReportesEstadoDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetallePedido(
			JComboBox jComboBoxTiposReportesEstadoDetallePedido) {
		this.jComboBoxTiposReportesEstadoDetallePedido = jComboBoxTiposReportesEstadoDetallePedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetallePedido() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetallePedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetallePedido(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetallePedido) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetallePedido = jComboBoxTiposReportesDinamicoEstadoDetallePedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido = jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetallePedido() {
		return this.jComboBoxTiposGraficosReportesEstadoDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetallePedido(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetallePedido) {
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido = jComboBoxTiposGraficosReportesEstadoDetallePedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetallePedido() {
		return this.jComboBoxTiposPaginacionEstadoDetallePedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetallePedido(
			JComboBox jComboBoxTiposPaginacionEstadoDetallePedido) {
		this.jComboBoxTiposPaginacionEstadoDetallePedido = jComboBoxTiposPaginacionEstadoDetallePedido;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetallePedido() {
		return this.jComboBoxTiposRelacionesEstadoDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetallePedido() {
		return this.jComboBoxTiposAccionesEstadoDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetallePedido(
			JComboBox jComboBoxTiposRelacionesEstadoDetallePedido) {
		this.jComboBoxTiposRelacionesEstadoDetallePedido = jComboBoxTiposRelacionesEstadoDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetallePedido(
			JComboBox jComboBoxTiposAccionesEstadoDetallePedido) {
		this.jComboBoxTiposAccionesEstadoDetallePedido = jComboBoxTiposAccionesEstadoDetallePedido;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetallePedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetallePedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetallePedido() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetallePedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetallePedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetallePedido) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetallePedido = jCheckBoxConGraficoDinamicoEstadoDetallePedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetallePedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetallePedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetallePedido .setBorder(borderResaltar);		
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
		this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		
		this.estadodetallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetallepedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetallePedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetallePedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetallePedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"copiar","copiar","Copiar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"ver_form","ver_form","Ver"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"recargar","recargar","Recargar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,
							"cerrar","cerrar","Salir"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetallePedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetallePedido;
			
				this.jButtonProcesarInformacionToolBarEstadoDetallePedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetallePedido;
				
		//protected JButton jButtonModificarToolBarEstadoDetallePedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetallePedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetallePedido=new JMenuMe("General");
		this.jmenuArchivoEstadoDetallePedido=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetallePedido=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetallePedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetallePedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetallePedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetallePedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetallePedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetallePedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetallePedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetallePedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetallePedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetallePedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetallePedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetallePedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetallePedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetallePedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetallePedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetallePedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetallePedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetallePedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetallePedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetallePedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetallePedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetallePedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetallePedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetallePedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetallePedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetallePedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetallePedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetallePedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetallePedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetallePedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetallePedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetallePedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetallePedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetallePedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetallePedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetallePedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetallePedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetallePedido.add(this.jMenuItemCerrarEstadoDetallePedido);
			
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemNuevoEstadoDetallePedido);
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido);
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemNuevoRelacionesEstadoDetallePedido);
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemGuardarCambiosTablaEstadoDetallePedido);		
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemDuplicarEstadoDetallePedido);		
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemCopiarEstadoDetallePedido);		
			this.jmenuAccionesEstadoDetallePedido.add(this.jMenuItemVerFormEstadoDetallePedido);		
			
			this.jmenuDatosEstadoDetallePedido.add(this.jMenuItemRecargarInformacionEstadoDetallePedido);				
			this.jmenuDatosEstadoDetallePedido.add(this.jMenuItemAnterioresEstadoDetallePedido);				
			this.jmenuDatosEstadoDetallePedido.add(this.jMenuItemSiguientesEstadoDetallePedido);				
			this.jmenuDatosEstadoDetallePedido.add(this.jMenuItemAbrirOrderByEstadoDetallePedido);				
			this.jmenuDatosEstadoDetallePedido.add(this.jMenuItemMostrarOcultarEstadoDetallePedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetallePedido.add(this.jMenuItemGuardarCambiosEstadoDetallePedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetallePedido.add(this.jmenuArchivoEstadoDetallePedido);		
			this.jmenuBarEstadoDetallePedido.add(this.jmenuAccionesEstadoDetallePedido);		
			this.jmenuBarEstadoDetallePedido.add(this.jmenuDatosEstadoDetallePedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetallePedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetallePedido() {
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
			//this.jInternalFrameDetalleEstadoDetallePedido = new EstadoDetallePedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Pedido DATOS");
			this.jInternalFrameDetalleFormEstadoDetallePedido = new EstadoDetallePedidoDetalleFormJInternalFrame(jDesktopPane,this.estadodetallepedidoSessionBean.getConGuardarRelaciones(),this.estadodetallepedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetallePedido = null;//new EstadoDetallePedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetallePedido= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetallePedido = new JTableMe();      
		
		String sToolTipEstadoDetallePedido="";
		sToolTipEstadoDetallePedido=EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetallePedido+="(Facturacion.EstadoDetallePedido)";
		}
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetallePedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetallePedido.setToolTipText(sToolTipEstadoDetallePedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetallePedido);
		this.jTableDatosEstadoDetallePedido.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetallePedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetallePedido.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetallePedido = new JButtonMe();
		this.jButtonDuplicarEstadoDetallePedido = new JButtonMe();
		this.jButtonCopiarEstadoDetallePedido = new JButtonMe();
		this.jButtonVerFormEstadoDetallePedido = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetallePedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido = new JButtonMe();
		this.jButtonCerrarEstadoDetallePedido = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetallePedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetallePedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Pedido";
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetallePedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetallePedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetallePedido=new ReporteDinamicoJInternalFrame(EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetallePedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetallePedido=new ImportacionJInternalFrame(EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetallePedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetallePedido = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetallePedido.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetallePedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetallePedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetallePedido,false,this);
			
			//this.cargarOrderByEstadoDetallePedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetallePedido,true,this);
			
			//this.cargarOrderByEstadoDetallePedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetallePedido.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetallePedido.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetallePedido.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetallePedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetallePedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetallePedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetallePedido.setText("Nuevo");
		this.jButtonDuplicarEstadoDetallePedido.setText("Duplicar");
		this.jButtonCopiarEstadoDetallePedido.setText("Copiar");
		this.jButtonVerFormEstadoDetallePedido.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetallePedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.setText("Guardar");
		this.jButtonCerrarEstadoDetallePedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetallePedido,"nuevo_button","Nuevo",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetallePedido,"duplicar_button","Duplicar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetallePedido,"copiar_button","Copiar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetallePedido,"ver_form","Ver",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetallePedido,"nuevorelaciones_button","Nuevo Rel",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetallePedido,"guardarcambiostabla_button","Guardar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetallePedido,"cerrar_button","Salir",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetallePedido.setToolTipText("Nuevo"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetallePedido.setToolTipText("Duplicar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetallePedido.setToolTipText("Copiar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetallePedido.setToolTipText("Ver"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetallePedido.setToolTipText("Nuevo Rel"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.setToolTipText("Guardar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetallePedido.setToolTipText("Salir"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetallePedido";
		inputMap = this.jButtonNuevoEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetallePedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetallePedido";
		inputMap = this.jButtonDuplicarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetallePedido"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetallePedido";
		inputMap = this.jButtonCopiarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetallePedido"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetallePedido";
		inputMap = this.jButtonVerFormEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetallePedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetallePedido";
		inputMap = this.jButtonNuevoRelacionesEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetallePedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetallePedido";
		inputMap = this.jButtonModificarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetallePedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetallePedido";
		inputMap = this.jButtonCerrarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetallePedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetallePedido";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetallePedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetallePedido.setName("jPanelParametrosReportesEstadoDetallePedido"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetallePedido.setName("jPanelParametrosReportesAccionesEstadoDetallePedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetallePedido = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetallePedido.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetallePedido.setToolTipText("Recargar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetallePedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetallePedido = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetallePedido.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetallePedido.setToolTipText("Procesar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetallePedido.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetallePedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetallePedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetallePedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetallePedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetallePedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetallePedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetallePedido.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetallePedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetallePedido.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetallePedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetallePedido.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetallePedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetallePedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetallePedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetallePedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetallePedido = new JLabelMe();
		
		this.jLabelAccionesEstadoDetallePedido.setText("Acciones");		
		this.jLabelAccionesEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetallePedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetallePedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetallePedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetallePedido.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetallePedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetallePedido = new JButtonMe();
		//this.jButtonAnterioresEstadoDetallePedido.setText("<<");
        this.jButtonAnterioresEstadoDetallePedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetallePedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetallePedido = new JButtonMe();
		//this.jButtonSiguientesEstadoDetallePedido.setText(">>");
        this.jButtonSiguientesEstadoDetallePedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetallePedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetallePedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetallePedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetallePedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetallePedido,"nuevoguardarcambios_button","Nue",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetallePedido";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetallePedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetallePedido";
		inputMap = this.jButtonRecargarInformacionEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetallePedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetallePedido";
		inputMap = this.jButtonSiguientesEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetallePedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetallePedido";
		inputMap = this.jButtonAnterioresEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetallePedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetallePedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetallePedido.setMinimumSize(new Dimension(this.getWidth(),EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetallePedido.setMaximumSize(new Dimension(this.getWidth(),EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetallePedido.setPreferredSize(new Dimension(this.getWidth(),EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetallePedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetallePedido = new GridBagLayout();

			this.jPanelPaginacionEstadoDetallePedido.setLayout(gridaBagLayoutPaginacionEstadoDetallePedido);						
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonAnterioresEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					
						
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
			
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonNuevoGuardarCambiosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
						
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonSiguientesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonNuevoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
				this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonNuevoRelacionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			}
			
			
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
				this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonGuardarCambiosTablaEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			}
			
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonDuplicarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonCopiarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonVerFormEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 1;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetallePedido.add(this.jButtonCerrarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
		
		
		this.jButtonRecargarInformacionEstadoDetallePedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetallePedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetallePedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetallePedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetallePedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetallePedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetallePedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetallePedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetallePedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetallePedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetallePedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetallePedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetallePedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetallePedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetallePedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetallePedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetallePedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetallePedido.setLayout(gridaBagParametrosReportesEstadoDetallePedido);
			this.jPanelParametrosReportesAccionesEstadoDetallePedido.setLayout(gridaBagParametrosReportesAccionesEstadoDetallePedido);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetallePedido.setLayout(gridaBagParametrosAuxiliar1EstadoDetallePedido);
			this.jPanelParametrosAuxiliar2EstadoDetallePedido.setLayout(gridaBagParametrosAuxiliar2EstadoDetallePedido);
			this.jPanelParametrosAuxiliar3EstadoDetallePedido.setLayout(gridaBagParametrosAuxiliar3EstadoDetallePedido);
			this.jPanelParametrosAuxiliar4EstadoDetallePedido.setLayout(gridaBagParametrosAuxiliar4EstadoDetallePedido);
			//this.jPanelParametrosAuxiliar5EstadoDetallePedido.setLayout(gridaBagParametrosAuxiliar2EstadoDetallePedido);			
			
			
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jButtonRecargarInformacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetallePedido.add(this.jComboBoxTiposPaginacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetallePedido.add(this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetallePedido.add(this.jComboBoxTiposArchivosReportesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jPanelParametrosAuxiliar1EstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetallePedido.add(this.jComboBoxTiposReportesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jPanelParametrosAuxiliar4EstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jComboBoxTiposReportesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jCheckBoxGenerarReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jPanelParametrosAuxiliar2EstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jLabelAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetallePedido.add(this.jButtonAbrirOrderByEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jComboBoxTiposSeleccionarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
			
			
			/*
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jCheckBoxSeleccionarTodosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetallePedido.add(this.jCheckBoxSeleccionarTodosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);															
				
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetallePedido.add(this.jCheckBoxSeleccionadosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jPanelParametrosAuxiliar3EstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jComboBoxTiposRelacionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
				
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetallePedido.add(this.jComboBoxTiposAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetallePedido = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetallePedido.setLayout(gridaBagLayoutDatosEstadoDetallePedido);
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetallePedido.add(this.jTableDatosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetallePedido.setViewportView(this.jTableDatosEstadoDetallePedido);
		this.jTableDatosEstadoDetallePedido.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetallePedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetallePedido= new GridBagLayout();
		this.jPanelAccionesEstadoDetallePedido.setLayout(gridaBagLayoutAccionesEstadoDetallePedido);
		
		
		/*	
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
			
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonNuevoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetallePedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetallePedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;		
			//this.gridBagConstraintsEstadoDetallePedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetallePedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;		
		//this.gridBagConstraintsEstadoDetallePedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetallePedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetallePedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);								
		
		
		/*
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		*/		
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetallePedido.gridx =0;
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetallePedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
				
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetallePedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetallePedido = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetallePedido.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetallePedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetallePedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetallePedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetallePedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetallePedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetallePedido.setName("jPanelReporteDinamicoEstadoDetallePedido"); 
		
		this.jPanelReporteDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetallePedido.setLayout(gridaBagLayoutReporteDinamicoEstadoDetallePedido);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetallePedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetallePedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetallePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetallePedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetallePedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetallePedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetallePedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetallePedido = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetallePedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jLabelColumnasSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetallePedido = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetallePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetallePedido=new JScrollPane(this.jListColumnasSelectReporteEstadoDetallePedido);
			
			this.jScrollColumnasSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jListColumnasSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jScrollColumnasSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetallePedido = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetallePedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jLabelRelacionesSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetallePedido = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetallePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetallePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetallePedido=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetallePedido);
			
			this.jScrollRelacionesSelectReporteEstadoDetallePedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetallePedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetallePedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jListRelacionesSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jScrollRelacionesSelectReporteEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetallePedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetallePedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetallePedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetallePedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetallePedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido.setToolTipText("Generar EXCEL"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jComboBoxTiposReportesDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetallePedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetallePedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetallePedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetallePedido.setToolTipText("Generar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jButtonGenerarReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetallePedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetallePedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetallePedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetallePedido.setToolTipText("Cancelar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetallePedido.add(this.jButtonCerrarReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetallePedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetallePedido= new JScrollPane(jPanelReporteDinamicoEstadoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetallePedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetallePedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetallePedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetallePedido);
		this.jInternalFrameReporteDinamicoEstadoDetallePedido.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetallePedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetallePedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetallePedido.setName("jPanelImportacionEstadoDetallePedido"); 
		
		this.jPanelImportacionEstadoDetallePedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetallePedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetallePedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetallePedido.setLayout(gridaBagLayoutImportacionEstadoDetallePedido);
		
		
		this.jInternalFrameImportacionEstadoDetallePedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetallePedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetallePedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetallePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetallePedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetallePedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetallePedido.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetallePedido.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetallePedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetallePedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetallePedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetallePedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetallePedido.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetallePedido.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetallePedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetallePedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetallePedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetallePedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetallePedido = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetallePedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetallePedido.add(this.jLabelArchivoImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetallePedido = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetallePedido.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetallePedido = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetallePedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetallePedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetallePedido.setToolTipText("Generar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetallePedido.add(this.jButtonAbrirImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetallePedido = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetallePedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetallePedido.add(this.jLabelPathArchivoImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetallePedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetallePedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetallePedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetallePedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetallePedido.add(this.jTextFieldPathArchivoImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetallePedido = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetallePedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetallePedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetallePedido.setToolTipText("Generar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetallePedido.add(this.jButtonGenerarImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetallePedido = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetallePedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetallePedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetallePedido.setToolTipText("Cancelar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetallePedido.add(this.jButtonCerrarImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetallePedido = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetallePedido= new JScrollPane(jPanelImportacionEstadoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetallePedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetallePedido);
		this.jInternalFrameImportacionEstadoDetallePedido.getContentPane().add(this.jScrollPanelImportacionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetallePedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetallePedido = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetallePedido.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetallePedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetallePedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetallePedido";
			inputMap = this.jButtonAbrirOrderByEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetallePedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetallePedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetallePedido.setName("jPanelOrderByEstadoDetallePedido"); 
			
			this.jPanelOrderByEstadoDetallePedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetallePedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetallePedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetallePedido.setLayout(gridaBagLayoutOrderByEstadoDetallePedido);
			
			
			this.jTableDatosEstadoDetallePedidoOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetallePedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetallePedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetallePedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetallePedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetallePedidoOrderBy.setViewportView(this.jTableDatosEstadoDetallePedidoOrderBy);
			this.jTableDatosEstadoDetallePedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetallePedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetallePedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetallePedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetallePedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetallePedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetallePedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetallePedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetallePedido.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetallePedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetallePedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetallePedido.setResizable(true);
			this.jInternalFrameOrderByEstadoDetallePedido.setClosable(true);
			this.jInternalFrameOrderByEstadoDetallePedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetallePedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetallePedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetallePedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetallePedido.ipady =150;
				
			this.jPanelOrderByEstadoDetallePedido.add(jScrollPanelDatosEstadoDetallePedidoOrderBy, this.gridBagConstraintsEstadoDetallePedido);//this.jTableDatosEstadoDetallePedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetallePedido = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetallePedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetallePedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetallePedido.setToolTipText("Cancelar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetallePedido.add(this.jButtonCerrarOrderByEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetallePedido = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetallePedido= new JScrollPane(jPanelOrderByEstadoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetallePedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetallePedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetallePedido);
			
			this.jInternalFrameOrderByEstadoDetallePedido.getContentPane().add(this.jScrollPanelOrderByEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetallePedido = new JButtonMe();
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
			&& this.estadodetallepedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetallePedido.getRowHeight();//EstadoDetallePedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.isSelected()) {
					iHeightTable=EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetallePedido.isSelected()) {
					iHeightTable=EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetallePedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetallePedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetallePedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetallePedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetallePedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetallePedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetallePedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetallePedido!=null && this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetallePedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetallePedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetallePedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetallePedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetallePedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetallePedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetallepedidoLogic.getEstadoDetallePedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallepedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetallePedido> TraerEstadoDetallePedidoBeans(List<EstadoDetallePedido> estadodetallepedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetallePedido estadodetallepedido:estadodetallepedidos) {
					
				if(!(EstadoDetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetallepedido.setsDetalleGeneralEntityReporte(EstadoDetallePedidoConstantesFunciones.getEstadoDetallePedidoDescripcion(estadodetallepedido));
										
						
					
					

					if(estadodetallepedido.getDetalleConsignacions()!=null && Funciones.existeClass(classes,DetalleConsignacion.class)) {
						try{estadodetallepedido.setdetalleconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(DetalleConsignacionJInternalFrame.TraerDetalleConsignacionBeans(estadodetallepedido.getDetalleConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadodetallepedido.getDetallePedidoExporExpors()!=null && Funciones.existeClass(classes,DetallePedidoExpor.class)) {
						try{estadodetallepedido.setdetallepedidoexporExporsDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoExporJInternalFrame.TraerDetallePedidoExporBeans(estadodetallepedido.getDetallePedidoExporExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetallepedido.setsDetalleGeneralEntityReporte(estadodetallepedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetallepedidobeans.add(estadodetallepedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetallepedidos;
    }
	//PARA REPORTES FIN
}
