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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.PrioridadPedidoConstantesFunciones;

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
public class PrioridadPedidoJInternalFrame extends PrioridadPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPrioridadPedido;
	
	protected JMenuBar jmenuBarPrioridadPedido;
	
	protected JMenu jmenuPrioridadPedido;
	protected JMenu jmenuDatosPrioridadPedido;
	protected JMenu jmenuArchivoPrioridadPedido;
	protected JMenu jmenuAccionesPrioridadPedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrioridadPedido;	
	protected GridBagConstraints gridBagConstraintsPrioridadPedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PrioridadPedidoDetalleFormJInternalFrame jInternalFrameDetalleFormPrioridadPedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPrioridadPedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPrioridadPedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PrioridadPedidoSessionBean prioridadpedidoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PrioridadPedido> prioridadpedidos;		
	public List<PrioridadPedido> prioridadpedidosEliminados;	
	public List<PrioridadPedido> prioridadpedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPrioridadPedido;		
	protected JButton jButtonAbrirOrderByPrioridadPedido;
	
	
	//protected JPanel jPanelOrderByPrioridadPedido;
	//public JScrollPane jScrollPanelOrderByPrioridadPedido;	
	//protected JButton jButtonCerrarOrderByPrioridadPedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PrioridadPedidoLogic prioridadpedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPrioridadPedido;
	public JScrollPane jScrollPanelDatosEdicionPrioridadPedido;
	public JScrollPane jScrollPanelDatosGeneralPrioridadPedido;
    
	
	
	//public JScrollPane jScrollPanelDatosPrioridadPedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPrioridadPedido;
	//public JScrollPane jScrollPanelImportacionPrioridadPedido;
	
	
	
	protected JPanel jPanelAccionesPrioridadPedido;
	
    protected JPanel jPanelPaginacionPrioridadPedido;
    protected JPanel jPanelParametrosReportesPrioridadPedido;
	protected JPanel jPanelParametrosReportesAccionesPrioridadPedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar2PrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar3PrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar4PrioridadPedido;
	//protected JPanel jPanelParametrosAuxiliar5PrioridadPedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoPrioridadPedido;
	//protected JPanel jPanelImportacionPrioridadPedido;
	
	
	public JTable jTableDatosPrioridadPedido;
	
	
	
	//public JTable jTableDatosPrioridadPedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPrioridadPedido;
	protected JButton jButtonDuplicarPrioridadPedido;
	protected JButton jButtonCopiarPrioridadPedido;
	protected JButton jButtonVerFormPrioridadPedido;
	protected JButton jButtonNuevoRelacionesPrioridadPedido;
	protected JButton jButtonModificarPrioridadPedido;
	
    protected JButton jButtonGuardarCambiosTablaPrioridadPedido;
	protected JButton jButtonCerrarPrioridadPedido;
	
	
	protected JButton jButtonRecargarInformacionPrioridadPedido;
	protected JButton jButtonProcesarInformacionPrioridadPedido;
	
	
	protected JButton jButtonAnterioresPrioridadPedido;
	protected JButton jButtonSiguientesPrioridadPedido;
	protected JButton jButtonNuevoGuardarCambiosPrioridadPedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPrioridadPedido;
	//protected JButton jButtonCerrarReporteDinamicoPrioridadPedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoPrioridadPedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionPrioridadPedido;
	//protected JButton jButtonGenerarImportacionPrioridadPedido;
	//protected JButton jButtonCerrarImportacionPrioridadPedido;
	//protected JFileChooser jFileChooserImportacionPrioridadPedido;
	//protected File fileImportacionPrioridadPedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrioridadPedido;
	protected JButton jButtonDuplicarToolBarPrioridadPedido;
	protected JButton jButtonNuevoRelacionesToolBarPrioridadPedido;
	
	
	public JButton jButtonGuardarCambiosToolBarPrioridadPedido;
	protected JButton jButtonCopiarToolBarPrioridadPedido;
	protected JButton jButtonVerFormToolBarPrioridadPedido;
	public JButton jButtonGuardarCambiosTablaToolBarPrioridadPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarPrioridadPedido;
	protected JButton jButtonCerrarToolBarPrioridadPedido;
	
	protected JButton jButtonRecargarInformacionToolBarPrioridadPedido;
	protected JButton jButtonProcesarInformacionToolBarPrioridadPedido;
	protected JButton jButtonAnterioresToolBarPrioridadPedido;
	protected JButton jButtonSiguientesToolBarPrioridadPedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarPrioridadPedido;
	protected JButton jButtonAbrirOrderByToolBarPrioridadPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrioridadPedido;
	protected JMenuItem jMenuItemDuplicarPrioridadPedido;
	protected JMenuItem jMenuItemNuevoRelacionesPrioridadPedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPrioridadPedido;
	protected JMenuItem jMenuItemCopiarPrioridadPedido;
	protected JMenuItem jMenuItemVerFormPrioridadPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrioridadPedido;
	protected JMenuItem jMenuItemCerrarPrioridadPedido;
	protected JMenuItem jMenuItemDetalleCerrarPrioridadPedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPrioridadPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrioridadPedido;
	
	protected JMenuItem jMenuItemRecargarInformacionPrioridadPedido;
	protected JMenuItem jMenuItemProcesarInformacionPrioridadPedido;
	protected JMenuItem jMenuItemAnterioresPrioridadPedido;
	protected JMenuItem jMenuItemSiguientesPrioridadPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrioridadPedido;
	protected JMenuItem jMenuItemAbrirOrderByPrioridadPedido;
	protected JMenuItem jMenuItemMostrarOcultarPrioridadPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrioridadPedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPrioridadPedido;
	protected JCheckBox jCheckBoxSeleccionadosPrioridadPedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPrioridadPedido;
	protected JCheckBox jCheckBoxConGraficoReportePrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPrioridadPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPrioridadPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPrioridadPedido;
	protected JTextField jTextFieldValorCampoGeneralPrioridadPedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePrioridadPedido;
	//public JList<Reporte> jListColumnasSelectReportePrioridadPedido;
	//public JScrollPane jScrollColumnasSelectReportePrioridadPedido;
	
	//public JLabel jLabelRelacionesSelectReportePrioridadPedido;
	//public JList<Reporte> jListRelacionesSelectReportePrioridadPedido;
	//public JScrollPane jScrollRelacionesSelectReportePrioridadPedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPrioridadPedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPrioridadPedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPrioridadPedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoPrioridadPedido;
	
		
	//public JLabel jLabelArchivoImportacionPrioridadPedido;	
	//public JLabel jLabelPathArchivoImportacionPrioridadPedido;
	//protected JTextField jTextFieldPathArchivoImportacionPrioridadPedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPrioridadPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPrioridadPedido;
	
	//public JLabel jLabelColumnaCategoriaValorPrioridadPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPrioridadPedido;
	
	//public JLabel jLabelColumnasValoresGraficoPrioridadPedido;
	//public JList<Reporte> jListColumnasValoresGraficoPrioridadPedido;
	//public JScrollPane jScrollColumnasValoresGraficoPrioridadPedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPrioridadPedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPrioridadPedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPrioridadPedido;
	public JPanel jPanelBusquedaPorNombrePrioridadPedido;
	public JButton jButtonBusquedaPorNombrePrioridadPedido;
	
	public JPanel jPanelnombreBusquedaPorNombrePrioridadPedido;
	public JLabel jLabelnombreBusquedaPorNombrePrioridadPedido;
	public JTextField jTextFieldnombreBusquedaPorNombrePrioridadPedido;
	public JButton jButtonnombreBusquedaPorNombrePrioridadPedidoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PrioridadPedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPrioridadPedido)	{
		this.jButtonRecargarInformacionPrioridadPedido = jButtonRecargarInformacionPrioridadPedido;
	}
	
	public JButton getjButtonProcesarInformacionPrioridadPedido() {
		return this.jButtonProcesarInformacionPrioridadPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrioridadPedido)	{
		this.jButtonProcesarInformacionPrioridadPedido = jButtonProcesarInformacionPrioridadPedido;
	}
	
	
	public JButton getjButtonRecargarInformacionPrioridadPedido() {
		return this.jButtonRecargarInformacionPrioridadPedido;
	}
	
	
	public List<PrioridadPedido> getprioridadpedidos() {
		return this.prioridadpedidos;
	}

	public void setprioridadpedidos(List<PrioridadPedido> prioridadpedidos) {
		this.prioridadpedidos = prioridadpedidos;
	}
	
	public List<PrioridadPedido> getprioridadpedidosAux() {
		return this.prioridadpedidosAux;
	}

	public void setprioridadpedidosAux(List<PrioridadPedido> prioridadpedidosAux) {
		this.prioridadpedidosAux = prioridadpedidosAux;
	}
	
	public List<PrioridadPedido> getprioridadpedidosEliminados() {
		return this.prioridadpedidosEliminados;
	}

	public void setPrioridadPedidosEliminados(List<PrioridadPedido> prioridadpedidosEliminados) {
		this.prioridadpedidosEliminados = prioridadpedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPrioridadPedido() {
		return jComboBoxTiposSeleccionarPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPrioridadPedido(
			JComboBox jComboBoxTiposSeleccionarPrioridadPedido) {
		this.jComboBoxTiposSeleccionarPrioridadPedido = jComboBoxTiposSeleccionarPrioridadPedido;
	}
	
	public void setBorderResaltarTiposSeleccionarPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPrioridadPedido() {
		return jTextFieldValorCampoGeneralPrioridadPedido;
	}

	public void setjTextFieldValorCampoGeneralPrioridadPedido(
			JTextField jTextFieldValorCampoGeneralPrioridadPedido) {
		this.jTextFieldValorCampoGeneralPrioridadPedido = jTextFieldValorCampoGeneralPrioridadPedido;
	}

	public void setBorderResaltarValorCampoGeneralPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPrioridadPedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPrioridadPedido() {
		return this.jCheckBoxSeleccionarTodosPrioridadPedido;
	}

	public void setjCheckBoxSeleccionarTodosPrioridadPedido(
			JCheckBox jCheckBoxSeleccionarTodosPrioridadPedido) {
		this.jCheckBoxSeleccionarTodosPrioridadPedido = jCheckBoxSeleccionarTodosPrioridadPedido;
	}

	public void setBorderResaltarSeleccionarTodosPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPrioridadPedido() {
		return this.jCheckBoxSeleccionadosPrioridadPedido;
	}

	public void setjCheckBoxSeleccionadosPrioridadPedido(
			JCheckBox jCheckBoxSeleccionadosPrioridadPedido) {
		this.jCheckBoxSeleccionadosPrioridadPedido = jCheckBoxSeleccionadosPrioridadPedido;
	}
	
	public void setBorderResaltarSeleccionadosPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPrioridadPedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPrioridadPedido() {
		return this.jComboBoxTiposArchivosReportesPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPrioridadPedido(
			JComboBox jComboBoxTiposArchivosReportesPrioridadPedido) {
		this.jComboBoxTiposArchivosReportesPrioridadPedido = jComboBoxTiposArchivosReportesPrioridadPedido;
	}

	public void setBorderResaltarTiposArchivosReportesPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPrioridadPedido() {
		return this.jComboBoxTiposReportesPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPrioridadPedido(
			JComboBox jComboBoxTiposReportesPrioridadPedido) {
		this.jComboBoxTiposReportesPrioridadPedido = jComboBoxTiposReportesPrioridadPedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPrioridadPedido() {
	//	return jComboBoxTiposReportesDinamicoPrioridadPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPrioridadPedido(
	//		JComboBox jComboBoxTiposReportesDinamicoPrioridadPedido) {
	//	this.jComboBoxTiposReportesDinamicoPrioridadPedido = jComboBoxTiposReportesDinamicoPrioridadPedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPrioridadPedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoPrioridadPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPrioridadPedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPrioridadPedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido = jComboBoxTiposArchivosReportesDinamicoPrioridadPedido;
	//}
	
	public void setBorderResaltarTiposReportesPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPrioridadPedido() {
		return this.jComboBoxTiposGraficosReportesPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPrioridadPedido(
			JComboBox jComboBoxTiposGraficosReportesPrioridadPedido) {
		this.jComboBoxTiposGraficosReportesPrioridadPedido = jComboBoxTiposGraficosReportesPrioridadPedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPrioridadPedido() {
		return this.jComboBoxTiposPaginacionPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPrioridadPedido(
			JComboBox jComboBoxTiposPaginacionPrioridadPedido) {
		this.jComboBoxTiposPaginacionPrioridadPedido = jComboBoxTiposPaginacionPrioridadPedido;
	}
	
	public void setBorderResaltarTiposPaginacionPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPrioridadPedido() {
		return this.jComboBoxTiposRelacionesPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrioridadPedido() {
		return this.jComboBoxTiposAccionesPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrioridadPedido(
			JComboBox jComboBoxTiposRelacionesPrioridadPedido) {
		this.jComboBoxTiposRelacionesPrioridadPedido = jComboBoxTiposRelacionesPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrioridadPedido(
			JComboBox jComboBoxTiposAccionesPrioridadPedido) {
		this.jComboBoxTiposAccionesPrioridadPedido = jComboBoxTiposAccionesPrioridadPedido;
	}
	
	public void setBorderResaltarTiposRelacionesPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPrioridadPedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPrioridadPedido() {
	//	return jCheckBoxConGraficoDinamicoPrioridadPedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoPrioridadPedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoPrioridadPedido) {
	//	this.jCheckBoxConGraficoDinamicoPrioridadPedido = jCheckBoxConGraficoDinamicoPrioridadPedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPrioridadPedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPrioridadPedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPrioridadPedido .setBorder(borderResaltar);		
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
		this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		
		this.prioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prioridadpedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrioridadPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Prioridad Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		PrioridadPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPrioridadPedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"nuevo","nuevo","Nuevo"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"duplicar","duplicar","Duplicar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"copiar","copiar","Copiar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"ver_form","ver_form","Ver"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"recargar","recargar","Recargar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPrioridadPedido,this.jTtoolBarPrioridadPedido,
							"cerrar","cerrar","Salir"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPrioridadPedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPrioridadPedido;
			
				this.jButtonProcesarInformacionToolBarPrioridadPedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPrioridadPedido;
				
		//protected JButton jButtonModificarToolBarPrioridadPedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPrioridadPedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPrioridadPedido=new JMenuMe("General");
		this.jmenuArchivoPrioridadPedido=new JMenuMe("Archivo");
		this.jmenuAccionesPrioridadPedido=new JMenuMe("Acciones");
		this.jmenuDatosPrioridadPedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrioridadPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrioridadPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrioridadPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPrioridadPedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPrioridadPedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPrioridadPedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPrioridadPedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPrioridadPedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPrioridadPedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPrioridadPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrioridadPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrioridadPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPrioridadPedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPrioridadPedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPrioridadPedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPrioridadPedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPrioridadPedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPrioridadPedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPrioridadPedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPrioridadPedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPrioridadPedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPrioridadPedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPrioridadPedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPrioridadPedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPrioridadPedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPrioridadPedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPrioridadPedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPrioridadPedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPrioridadPedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPrioridadPedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPrioridadPedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPrioridadPedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPrioridadPedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPrioridadPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPrioridadPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPrioridadPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPrioridadPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPrioridadPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPrioridadPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPrioridadPedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPrioridadPedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPrioridadPedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPrioridadPedido.add(this.jMenuItemCerrarPrioridadPedido);
			
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemNuevoPrioridadPedido);
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemNuevoGuardarCambiosPrioridadPedido);
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemNuevoRelacionesPrioridadPedido);
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemGuardarCambiosTablaPrioridadPedido);		
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemDuplicarPrioridadPedido);		
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemCopiarPrioridadPedido);		
			this.jmenuAccionesPrioridadPedido.add(this.jMenuItemVerFormPrioridadPedido);		
			
			this.jmenuDatosPrioridadPedido.add(this.jMenuItemRecargarInformacionPrioridadPedido);				
			this.jmenuDatosPrioridadPedido.add(this.jMenuItemAnterioresPrioridadPedido);				
			this.jmenuDatosPrioridadPedido.add(this.jMenuItemSiguientesPrioridadPedido);				
			this.jmenuDatosPrioridadPedido.add(this.jMenuItemAbrirOrderByPrioridadPedido);				
			this.jmenuDatosPrioridadPedido.add(this.jMenuItemMostrarOcultarPrioridadPedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPrioridadPedido.add(this.jMenuItemGuardarCambiosPrioridadPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPrioridadPedido.add(this.jmenuArchivoPrioridadPedido);		
			this.jmenuBarPrioridadPedido.add(this.jmenuAccionesPrioridadPedido);		
			this.jmenuBarPrioridadPedido.add(this.jmenuDatosPrioridadPedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPrioridadPedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPrioridadPedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombrePrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePrioridadPedido.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePrioridadPedido= new JButtonMe();
		this.jButtonBusquedaPorNombrePrioridadPedido.setText("Buscar");
		this.jButtonBusquedaPorNombrePrioridadPedido.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePrioridadPedido,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePrioridadPedido = new JLabelMe();
		jLabelnombreBusquedaPorNombrePrioridadPedido.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePrioridadPedido.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombrePrioridadPedido= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombrePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombrePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombrePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombrePrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPrioridadPedido=new JTabbedPane();


		this.jTabbedPaneBusquedasPrioridadPedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrioridadPedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrioridadPedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePrioridadPedido = new PrioridadPedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Prioridad Pedido DATOS");
			this.jInternalFrameDetalleFormPrioridadPedido = new PrioridadPedidoDetalleFormJInternalFrame(jDesktopPane,this.prioridadpedidoSessionBean.getConGuardarRelaciones(),this.prioridadpedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPrioridadPedido = null;//new PrioridadPedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrioridadPedido= new GridBagLayout();
		
		
		this.jTableDatosPrioridadPedido = new JTableMe();      
		
		String sToolTipPrioridadPedido="";
		sToolTipPrioridadPedido=PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrioridadPedido+="(Inventario.PrioridadPedido)";
		}
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrioridadPedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPrioridadPedido.setToolTipText(sToolTipPrioridadPedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPrioridadPedido);
		this.jTableDatosPrioridadPedido.setAutoCreateRowSorter(true);
		this.jTableDatosPrioridadPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPrioridadPedido.setRowSelectionAllowed(true);
		this.jTableDatosPrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPrioridadPedido = new JButtonMe();
		this.jButtonDuplicarPrioridadPedido = new JButtonMe();
		this.jButtonCopiarPrioridadPedido = new JButtonMe();
		this.jButtonVerFormPrioridadPedido = new JButtonMe();
		this.jButtonNuevoRelacionesPrioridadPedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPrioridadPedido = new JButtonMe();
		this.jButtonCerrarPrioridadPedido = new JButtonMe();
		
		this.jScrollPanelDatosPrioridadPedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralPrioridadPedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Prioridad Pedido";
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesPrioridadPedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPrioridadPedido=new ReporteDinamicoJInternalFrame(PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPrioridadPedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPrioridadPedido=new ImportacionJInternalFrame(PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPrioridadPedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPrioridadPedido = new JButtonMe();
		
		this.jButtonAbrirOrderByPrioridadPedido.setText("Orden");
		this.jButtonAbrirOrderByPrioridadPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrioridadPedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrioridadPedido,false,this);
			
			//this.cargarOrderByPrioridadPedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrioridadPedido,true,this);
			
			//this.cargarOrderByPrioridadPedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPrioridadPedido.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPrioridadPedido.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPrioridadPedido.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPrioridadPedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrioridadPedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrioridadPedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPrioridadPedido.setText("Nuevo");
		this.jButtonDuplicarPrioridadPedido.setText("Duplicar");
		this.jButtonCopiarPrioridadPedido.setText("Copiar");
		this.jButtonVerFormPrioridadPedido.setText("Ver");
		this.jButtonNuevoRelacionesPrioridadPedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.setText("Guardar");
		this.jButtonCerrarPrioridadPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrioridadPedido,"nuevo_button","Nuevo",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPrioridadPedido,"duplicar_button","Duplicar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPrioridadPedido,"copiar_button","Copiar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPrioridadPedido,"ver_form","Ver",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPrioridadPedido,"nuevorelaciones_button","Nuevo Rel",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrioridadPedido,"guardarcambiostabla_button","Guardar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrioridadPedido,"cerrar_button","Salir",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPrioridadPedido.setToolTipText("Nuevo"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPrioridadPedido.setToolTipText("Duplicar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPrioridadPedido.setToolTipText("Copiar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPrioridadPedido.setToolTipText("Ver"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPrioridadPedido.setToolTipText("Nuevo Rel"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.setToolTipText("Guardar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrioridadPedido.setToolTipText("Salir"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrioridadPedido";
		inputMap = this.jButtonNuevoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrioridadPedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarPrioridadPedido";
		inputMap = this.jButtonDuplicarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPrioridadPedido"));
		
		//COPIAR
		sMapKey = "CopiarPrioridadPedido";
		inputMap = this.jButtonCopiarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPrioridadPedido"));
		
		//VEr FORM
		sMapKey = "VerFormPrioridadPedido";
		inputMap = this.jButtonVerFormPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPrioridadPedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPrioridadPedido";
		inputMap = this.jButtonNuevoRelacionesPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPrioridadPedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPrioridadPedido";
		inputMap = this.jButtonModificarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPrioridadPedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPrioridadPedido";
		inputMap = this.jButtonCerrarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrioridadPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrioridadPedido";
		inputMap = this.jButtonGuardarCambiosTablaPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrioridadPedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPrioridadPedido.setName("jPanelParametrosReportesPrioridadPedido"); 
		
		this.jPanelParametrosReportesAccionesPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPrioridadPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPrioridadPedido.setName("jPanelParametrosReportesAccionesPrioridadPedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPrioridadPedido = new JButtonMe();
		this.jButtonRecargarInformacionPrioridadPedido.setText("Recargar");
		this.jButtonRecargarInformacionPrioridadPedido.setToolTipText("Recargar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPrioridadPedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPrioridadPedido = new JButtonMe();
		this.jButtonProcesarInformacionPrioridadPedido.setText("Procesar");
		this.jButtonProcesarInformacionPrioridadPedido.setToolTipText("Procesar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPrioridadPedido.setVisible(false);
			
		this.jButtonProcesarInformacionPrioridadPedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrioridadPedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrioridadPedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPrioridadPedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposReportesPrioridadPedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPrioridadPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPrioridadPedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionPrioridadPedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPrioridadPedido.setText("Accion");
		this.jComboBoxTiposRelacionesPrioridadPedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrioridadPedido.setText("Accion");
		this.jComboBoxTiposAccionesPrioridadPedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPrioridadPedido.setText("Accion");
		this.jComboBoxTiposSeleccionarPrioridadPedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPrioridadPedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPrioridadPedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrioridadPedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrioridadPedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPrioridadPedido = new JLabelMe();
		
		this.jLabelAccionesPrioridadPedido.setText("Acciones");		
		this.jLabelAccionesPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPrioridadPedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPrioridadPedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPrioridadPedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPrioridadPedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPrioridadPedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPrioridadPedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPrioridadPedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPrioridadPedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePrioridadPedido.setText("Graf.");
		this.jCheckBoxConGraficoReportePrioridadPedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPrioridadPedido = new JButtonMe();
		//this.jButtonAnterioresPrioridadPedido.setText("<<");
        this.jButtonAnterioresPrioridadPedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPrioridadPedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPrioridadPedido = new JButtonMe();
		//this.jButtonSiguientesPrioridadPedido.setText(">>");
        this.jButtonSiguientesPrioridadPedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPrioridadPedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPrioridadPedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPrioridadPedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosPrioridadPedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPrioridadPedido,"nuevoguardarcambios_button","Nue",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPrioridadPedido";
		inputMap = this.jButtonNuevoGuardarCambiosPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPrioridadPedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPrioridadPedido";
		inputMap = this.jButtonRecargarInformacionPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPrioridadPedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPrioridadPedido";
		inputMap = this.jButtonSiguientesPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPrioridadPedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPrioridadPedido";
		inputMap = this.jButtonAnterioresPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPrioridadPedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPrioridadPedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPrioridadPedido.setMinimumSize(new Dimension(this.getWidth(),PrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrioridadPedido.setMaximumSize(new Dimension(this.getWidth(),PrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrioridadPedido.setPreferredSize(new Dimension(this.getWidth(),PrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPrioridadPedido = new GridBagLayout();

			this.jPanelPaginacionPrioridadPedido.setLayout(gridaBagLayoutPaginacionPrioridadPedido);						
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 0;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonAnterioresPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					
						
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPrioridadPedido.gridy = 0;
			
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonNuevoGuardarCambiosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
						
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPrioridadPedido.gridy = 0;
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonSiguientesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 1;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonNuevoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
						
			
			
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPrioridadPedido.gridy = 1;
				this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPrioridadPedido.add(this.jButtonGuardarCambiosTablaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			}
			
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 1;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonDuplicarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 1;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonCopiarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 1;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonVerFormPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 1;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPrioridadPedido.add(this.jButtonCerrarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
		
		
		this.jButtonRecargarInformacionPrioridadPedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrioridadPedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrioridadPedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPrioridadPedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrioridadPedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrioridadPedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPrioridadPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrioridadPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrioridadPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPrioridadPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrioridadPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrioridadPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPrioridadPedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrioridadPedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrioridadPedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePrioridadPedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrioridadPedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrioridadPedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPrioridadPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrioridadPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrioridadPedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPrioridadPedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrioridadPedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrioridadPedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPrioridadPedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PrioridadPedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPrioridadPedido.setLayout(gridaBagParametrosReportesPrioridadPedido);
			this.jPanelParametrosReportesAccionesPrioridadPedido.setLayout(gridaBagParametrosReportesAccionesPrioridadPedido);
			
			
			this.jPanelParametrosAuxiliar1PrioridadPedido.setLayout(gridaBagParametrosAuxiliar1PrioridadPedido);
			this.jPanelParametrosAuxiliar2PrioridadPedido.setLayout(gridaBagParametrosAuxiliar2PrioridadPedido);
			this.jPanelParametrosAuxiliar3PrioridadPedido.setLayout(gridaBagParametrosAuxiliar3PrioridadPedido);
			this.jPanelParametrosAuxiliar4PrioridadPedido.setLayout(gridaBagParametrosAuxiliar4PrioridadPedido);
			//this.jPanelParametrosAuxiliar5PrioridadPedido.setLayout(gridaBagParametrosAuxiliar2PrioridadPedido);			
			
			
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrioridadPedido.add(this.jButtonRecargarInformacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PrioridadPedido.add(this.jComboBoxTiposPaginacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PrioridadPedido.add(this.jCheckBoxConAltoMaximoTablaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PrioridadPedido.add(this.jComboBoxTiposArchivosReportesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrioridadPedido.add(this.jPanelParametrosAuxiliar1PrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PrioridadPedido.add(this.jComboBoxTiposReportesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrioridadPedido.add(this.jPanelParametrosAuxiliar4PrioridadPedido, this.gridBagConstraintsPrioridadPedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrioridadPedido.add(this.jComboBoxTiposReportesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrioridadPedido.add(this.jCheckBoxGenerarReportePrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrioridadPedido.add(this.jPanelParametrosAuxiliar2PrioridadPedido, this.gridBagConstraintsPrioridadPedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrioridadPedido.add(this.jLabelAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPrioridadPedido.add(this.jButtonAbrirOrderByPrioridadPedido, this.gridBagConstraintsPrioridadPedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrioridadPedido.add(this.jComboBoxTiposSeleccionarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			
			
			/*
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrioridadPedido.add(this.jCheckBoxSeleccionarTodosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PrioridadPedido.add(this.jCheckBoxSeleccionarTodosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);															
				
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PrioridadPedido.add(this.jCheckBoxSeleccionadosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrioridadPedido.add(this.jPanelParametrosAuxiliar3PrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrioridadPedido.add(this.jComboBoxTiposRelacionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
				
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrioridadPedido.add(this.jComboBoxTiposAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
	
				
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrioridadPedido.add(this.jTextFieldValorCampoGeneralPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPrioridadPedido = new GridBagLayout();

			this.jScrollPanelDatosPrioridadPedido.setLayout(gridaBagLayoutDatosPrioridadPedido);
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = 0;
			this.gridBagConstraintsPrioridadPedido.gridx = 0;
			
			this.jScrollPanelDatosPrioridadPedido.add(this.jTableDatosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPrioridadPedido.setViewportView(this.jTableDatosPrioridadPedido);
		this.jTableDatosPrioridadPedido.setFillsViewportHeight(true);
		this.jTableDatosPrioridadPedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesPrioridadPedido.setLayout(gridaBagLayoutAccionesPrioridadPedido);
		
		
		/*	
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
			
		this.jPanelAccionesPrioridadPedido.add(this.jButtonNuevoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombrePrioridadPedido= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePrioridadPedido.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePrioridadPedido.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePrioridadPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePrioridadPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePrioridadPedido.setLayout(gridaBagLayoutBusquedaPorNombrePrioridadPedido);

		gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrioridadPedido.gridy = 0;
		gridBagConstraintsPrioridadPedido.gridx = 0;
		jPanelBusquedaPorNombrePrioridadPedido.add(jLabelnombreBusquedaPorNombrePrioridadPedido, gridBagConstraintsPrioridadPedido);

		gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrioridadPedido.gridy = 0;
		gridBagConstraintsPrioridadPedido.gridx = 1;
		jPanelBusquedaPorNombrePrioridadPedido.add(jTextFieldnombreBusquedaPorNombrePrioridadPedido, gridBagConstraintsPrioridadPedido);

		gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrioridadPedido.gridy = 1;
		gridBagConstraintsPrioridadPedido.gridx =1;
		jPanelBusquedaPorNombrePrioridadPedido.add(jButtonBusquedaPorNombrePrioridadPedido, gridBagConstraintsPrioridadPedido);

		jTabbedPaneBusquedasPrioridadPedido.addTab("1.-Por Nombre ", jPanelBusquedaPorNombrePrioridadPedido);
		jTabbedPaneBusquedasPrioridadPedido.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrioridadPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrioridadPedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();						
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrioridadPedido.gridx = 0;		
			//this.gridBagConstraintsPrioridadPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrioridadPedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPrioridadPedido.gridx = 0;		
		//this.gridBagConstraintsPrioridadPedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPrioridadPedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPrioridadPedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrioridadPedido.gridx = 0;		
			this.gridBagConstraintsPrioridadPedido.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPrioridadPedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPrioridadPedido, this.gridBagConstraintsPrioridadPedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);								
		
		
		/*
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		*/		
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrioridadPedido.gridx =0;
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrioridadPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
				
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrioridadPedido = new GridBagLayout();
			this.jPanelBusquedasParametrosPrioridadPedido.setLayout(gridaBagLayoutBusquedasParametrosPrioridadPedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPrioridadPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPrioridadPedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPrioridadPedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPrioridadPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPrioridadPedido.setName("jPanelReporteDinamicoPrioridadPedido"); 
		
		this.jPanelReporteDinamicoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPrioridadPedido.setLayout(gridaBagLayoutReporteDinamicoPrioridadPedido);
		
		
		this.jInternalFrameReporteDinamicoPrioridadPedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPrioridadPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrioridadPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPrioridadPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPrioridadPedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPrioridadPedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoPrioridadPedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoPrioridadPedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePrioridadPedido = new JLabelMe();

		this.jLabelColumnasSelectReportePrioridadPedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jLabelColumnasSelectReportePrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePrioridadPedido = new JList<Reporte>();
		this.jListColumnasSelectReportePrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePrioridadPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePrioridadPedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrioridadPedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrioridadPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePrioridadPedido=new JScrollPane(this.jListColumnasSelectReportePrioridadPedido);
			
			this.jScrollColumnasSelectReportePrioridadPedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrioridadPedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrioridadPedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPrioridadPedido.add(this.jListColumnasSelectReportePrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jScrollColumnasSelectReportePrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePrioridadPedido = new JLabelMe();

		this.jLabelRelacionesSelectReportePrioridadPedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePrioridadPedido = new JList<Reporte>();
		this.jListRelacionesSelectReportePrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePrioridadPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePrioridadPedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrioridadPedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrioridadPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePrioridadPedido=new JScrollPane(this.jListRelacionesSelectReportePrioridadPedido);
			
			this.jScrollRelacionesSelectReportePrioridadPedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrioridadPedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrioridadPedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPrioridadPedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPrioridadPedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoPrioridadPedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPrioridadPedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPrioridadPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPrioridadPedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPrioridadPedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jLabelGenerarExcelReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPrioridadPedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPrioridadPedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPrioridadPedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPrioridadPedido.setToolTipText("Generar EXCEL"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPrioridadPedido.add(this.jButtonGenerarExcelReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jComboBoxTiposReportesDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPrioridadPedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPrioridadPedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jLabelTiposArchivoReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jComboBoxTiposArchivosReportesDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPrioridadPedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPrioridadPedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPrioridadPedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPrioridadPedido.setToolTipText("Generar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jButtonGenerarReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPrioridadPedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPrioridadPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPrioridadPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPrioridadPedido.setToolTipText("Cancelar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrioridadPedido.add(this.jButtonCerrarReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPrioridadPedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPrioridadPedido= new JScrollPane(jPanelReporteDinamicoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPrioridadPedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPrioridadPedido);
		this.jInternalFrameReporteDinamicoPrioridadPedido.getContentPane().add(this.jScrollPanelReporteDinamicoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPrioridadPedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPrioridadPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPrioridadPedido.setName("jPanelImportacionPrioridadPedido"); 
		
		this.jPanelImportacionPrioridadPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrioridadPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrioridadPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPrioridadPedido.setLayout(gridaBagLayoutImportacionPrioridadPedido);
		
		
		this.jInternalFrameImportacionPrioridadPedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPrioridadPedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPrioridadPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrioridadPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrioridadPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPrioridadPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrioridadPedido.setResizable(true);
	    this.jInternalFrameImportacionPrioridadPedido.setClosable(true);
	    this.jInternalFrameImportacionPrioridadPedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrioridadPedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPrioridadPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrioridadPedido.setResizable(true);
	    this.jInternalFrameImportacionPrioridadPedido.setClosable(true);
	    this.jInternalFrameImportacionPrioridadPedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPrioridadPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrioridadPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrioridadPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPrioridadPedido = new JLabelMe();

		this.jLabelArchivoImportacionPrioridadPedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrioridadPedido.add(this.jLabelArchivoImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPrioridadPedido = new JFileChooser();		
		this.jFileChooserImportacionPrioridadPedido.setToolTipText("ESCOGER ARCHIVO"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPrioridadPedido = new JButtonMe();
		this.jButtonAbrirImportacionPrioridadPedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPrioridadPedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPrioridadPedido.setToolTipText("Generar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrioridadPedido.add(this.jButtonAbrirImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPrioridadPedido = new JLabelMe();

		this.jLabelPathArchivoImportacionPrioridadPedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrioridadPedido.add(this.jLabelPathArchivoImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPrioridadPedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPrioridadPedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrioridadPedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrioridadPedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrioridadPedido.add(this.jTextFieldPathArchivoImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPrioridadPedido = new JButtonMe();
		this.jButtonGenerarImportacionPrioridadPedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPrioridadPedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPrioridadPedido.setToolTipText("Generar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrioridadPedido.add(this.jButtonGenerarImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPrioridadPedido = new JButtonMe();
		this.jButtonCerrarImportacionPrioridadPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPrioridadPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPrioridadPedido.setToolTipText("Cancelar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrioridadPedido.add(this.jButtonCerrarImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPrioridadPedido = new GridBagLayout();
		
		this.jScrollPanelImportacionPrioridadPedido= new JScrollPane(jPanelImportacionPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iPosYImportacion;
		this.gridBagConstraintsPrioridadPedido.gridx =iPosXImportacion;
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPrioridadPedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPrioridadPedido);
		this.jInternalFrameImportacionPrioridadPedido.getContentPane().add(this.jScrollPanelImportacionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPrioridadPedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPrioridadPedido = new JButtonMe();
			this.jButtonAbrirOrderByPrioridadPedido.setText("Orden");
			this.jButtonAbrirOrderByPrioridadPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrioridadPedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPrioridadPedido";
			inputMap = this.jButtonAbrirOrderByPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPrioridadPedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByPrioridadPedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPrioridadPedido.setName("jPanelOrderByPrioridadPedido"); 
			
			this.jPanelOrderByPrioridadPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrioridadPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrioridadPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPrioridadPedido.setLayout(gridaBagLayoutOrderByPrioridadPedido);
			
			
			this.jTableDatosPrioridadPedidoOrderBy = new JTableMe();        
			this.jTableDatosPrioridadPedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPrioridadPedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPrioridadPedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPrioridadPedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPrioridadPedidoOrderBy.setViewportView(this.jTableDatosPrioridadPedidoOrderBy);
			this.jTableDatosPrioridadPedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPrioridadPedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPrioridadPedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPrioridadPedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPrioridadPedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePrioridadPedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPrioridadPedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPrioridadPedido.setTitle("Orden");
			this.jInternalFrameOrderByPrioridadPedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPrioridadPedido.setResizable(true);
			this.jInternalFrameOrderByPrioridadPedido.setClosable(true);
			this.jInternalFrameOrderByPrioridadPedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPrioridadPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrioridadPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrioridadPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPrioridadPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPrioridadPedido.ipady =150;
				
			this.jPanelOrderByPrioridadPedido.add(jScrollPanelDatosPrioridadPedidoOrderBy, this.gridBagConstraintsPrioridadPedido);//this.jTableDatosPrioridadPedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPrioridadPedido = new JButtonMe();
			this.jButtonCerrarOrderByPrioridadPedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPrioridadPedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPrioridadPedido.setToolTipText("Cancelar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPrioridadPedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPrioridadPedido.add(this.jButtonCerrarOrderByPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPrioridadPedido = new GridBagLayout();
			
			this.jScrollPanelOrderByPrioridadPedido= new JScrollPane(jPanelOrderByPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsPrioridadPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPrioridadPedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPrioridadPedido);
			
			this.jInternalFrameOrderByPrioridadPedido.getContentPane().add(this.jScrollPanelOrderByPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
		
		} else {
			this.jButtonAbrirOrderByPrioridadPedido = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.prioridadpedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPrioridadPedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPrioridadPedido.getRowHeight();//PrioridadPedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrioridadPedido.isSelected()) {
					iHeightTable=PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrioridadPedido.isSelected()) {
					iHeightTable=PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPrioridadPedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrioridadPedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrioridadPedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPrioridadPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrioridadPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrioridadPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPrioridadPedido!=null && this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy()!=null) {
			//if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPrioridadPedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPrioridadPedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPrioridadPedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPrioridadPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrioridadPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrioridadPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=prioridadpedidoLogic.getPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prioridadpedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PrioridadPedido> TraerPrioridadPedidoBeans(List<PrioridadPedido> prioridadpedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PrioridadPedido prioridadpedido:prioridadpedidos) {
					
				if(!(PrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					prioridadpedido.setsDetalleGeneralEntityReporte(PrioridadPedidoConstantesFunciones.getPrioridadPedidoDescripcion(prioridadpedido));
										
						
					
						
					
				} else  {
							
					//prioridadpedido.setsDetalleGeneralEntityReporte(prioridadpedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//prioridadpedidobeans.add(prioridadpedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return prioridadpedidos;
    }
	//PARA REPORTES FIN
}
