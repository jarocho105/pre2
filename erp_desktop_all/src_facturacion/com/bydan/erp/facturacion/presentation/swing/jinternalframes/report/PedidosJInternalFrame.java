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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.PedidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class PedidosJInternalFrame extends PedidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidos;
	
	protected JMenuBar jmenuBarPedidos;
	
	protected JMenu jmenuPedidos;
	protected JMenu jmenuDatosPedidos;
	protected JMenu jmenuArchivoPedidos;
	protected JMenu jmenuAccionesPedidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidos;	
	protected GridBagConstraints gridBagConstraintsPedidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidosDetalleFormJInternalFrame jInternalFrameDetalleFormPedidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";
	
	public PedidosSessionBean pedidosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Pedidos> pedidoss;		
	public List<Pedidos> pedidossEliminados;	
	public List<Pedidos> pedidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidos;		
	protected JButton jButtonAbrirOrderByPedidos;
	
	
	//protected JPanel jPanelOrderByPedidos;
	//public JScrollPane jScrollPanelOrderByPedidos;	
	//protected JButton jButtonCerrarOrderByPedidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidosLogic pedidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidos;
	public JScrollPane jScrollPanelDatosEdicionPedidos;
	public JScrollPane jScrollPanelDatosGeneralPedidos;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidos;
	//public JScrollPane jScrollPanelImportacionPedidos;
	
	
	
	protected JPanel jPanelAccionesPedidos;
	
    protected JPanel jPanelPaginacionPedidos;
    protected JPanel jPanelParametrosReportesPedidos;
	protected JPanel jPanelParametrosReportesAccionesPedidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Pedidos;
	protected JPanel jPanelParametrosAuxiliar2Pedidos;
	protected JPanel jPanelParametrosAuxiliar3Pedidos;
	protected JPanel jPanelParametrosAuxiliar4Pedidos;
	//protected JPanel jPanelParametrosAuxiliar5Pedidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidos;
	//protected JPanel jPanelImportacionPedidos;
	
	
	public JTable jTableDatosPedidos;
	
	
	
	//public JTable jTableDatosPedidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidos;
	protected JButton jButtonDuplicarPedidos;
	protected JButton jButtonCopiarPedidos;
	protected JButton jButtonVerFormPedidos;
	protected JButton jButtonNuevoRelacionesPedidos;
	protected JButton jButtonModificarPedidos;
	
    protected JButton jButtonGuardarCambiosTablaPedidos;
	protected JButton jButtonCerrarPedidos;
	
	
	protected JButton jButtonRecargarInformacionPedidos;
	protected JButton jButtonProcesarInformacionPedidos;
	
	
	protected JButton jButtonAnterioresPedidos;
	protected JButton jButtonSiguientesPedidos;
	protected JButton jButtonNuevoGuardarCambiosPedidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidos;
	//protected JButton jButtonCerrarReporteDinamicoPedidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidos;
	//protected JButton jButtonGenerarImportacionPedidos;
	//protected JButton jButtonCerrarImportacionPedidos;
	//protected JFileChooser jFileChooserImportacionPedidos;
	//protected File fileImportacionPedidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidos;
	protected JButton jButtonDuplicarToolBarPedidos;
	protected JButton jButtonNuevoRelacionesToolBarPedidos;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidos;
	protected JButton jButtonCopiarToolBarPedidos;
	protected JButton jButtonVerFormToolBarPedidos;
	public JButton jButtonGuardarCambiosTablaToolBarPedidos;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidos;
	protected JButton jButtonCerrarToolBarPedidos;
	
	protected JButton jButtonRecargarInformacionToolBarPedidos;
	protected JButton jButtonProcesarInformacionToolBarPedidos;
	protected JButton jButtonAnterioresToolBarPedidos;
	protected JButton jButtonSiguientesToolBarPedidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidos;
	protected JButton jButtonAbrirOrderByToolBarPedidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidos;
	protected JMenuItem jMenuItemDuplicarPedidos;
	protected JMenuItem jMenuItemNuevoRelacionesPedidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidos;
	protected JMenuItem jMenuItemCopiarPedidos;
	protected JMenuItem jMenuItemVerFormPedidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidos;
	protected JMenuItem jMenuItemCerrarPedidos;
	protected JMenuItem jMenuItemDetalleCerrarPedidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidos;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidos;
	protected JMenuItem jMenuItemProcesarInformacionPedidos;
	protected JMenuItem jMenuItemAnterioresPedidos;
	protected JMenuItem jMenuItemSiguientesPedidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidos;
	protected JMenuItem jMenuItemAbrirOrderByPedidos;
	protected JMenuItem jMenuItemMostrarOcultarPedidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidos;
	protected JCheckBox jCheckBoxSeleccionadosPedidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidos;
	protected JCheckBox jCheckBoxConGraficoReportePedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidos;
	protected JTextField jTextFieldValorCampoGeneralPedidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidos;
	//public JList<Reporte> jListColumnasSelectReportePedidos;
	//public JScrollPane jScrollColumnasSelectReportePedidos;
	
	//public JLabel jLabelRelacionesSelectReportePedidos;
	//public JList<Reporte> jListRelacionesSelectReportePedidos;
	//public JScrollPane jScrollRelacionesSelectReportePedidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidos;
	
		
	//public JLabel jLabelArchivoImportacionPedidos;	
	//public JLabel jLabelPathArchivoImportacionPedidos;
	//protected JTextField jTextFieldPathArchivoImportacionPedidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidos;
	
	//public JLabel jLabelColumnaCategoriaValorPedidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidos;
	
	//public JLabel jLabelColumnasValoresGraficoPedidos;
	//public JList<Reporte> jListColumnasValoresGraficoPedidos;
	//public JScrollPane jScrollColumnasValoresGraficoPedidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidos;
	public JPanel jPanelBusquedaPedidosPedidos;
	public JButton jButtonBusquedaPedidosPedidos;
	
	public JPanel jPanelid_estado_pedidoBusquedaPedidosPedidos;
	public JLabel jLabelid_estado_pedidoBusquedaPedidosPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoBusquedaPedidosPedidos;
	public JButton jButtonid_estado_pedidoBusquedaPedidosPedidos= new JButtonMe();
	public JButton jButtonid_estado_pedidoBusquedaPedidosPedidosUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoBusquedaPedidosPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaPedidosPedidos;
	public JLabel jLabelfecha_emision_desdeBusquedaPedidosPedidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaPedidosPedidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaPedidosPedidos;
	public JButton jButtonfecha_emision_desdeBusquedaPedidosPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaPedidosPedidos;
	public JLabel jLabelfecha_emision_hastaBusquedaPedidosPedidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaPedidosPedidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaPedidosPedidos;
	public JButton jButtonfecha_emision_hastaBusquedaPedidosPedidosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidos)	{
		this.jButtonRecargarInformacionPedidos = jButtonRecargarInformacionPedidos;
	}
	
	public JButton getjButtonProcesarInformacionPedidos() {
		return this.jButtonProcesarInformacionPedidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidos)	{
		this.jButtonProcesarInformacionPedidos = jButtonProcesarInformacionPedidos;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidos() {
		return this.jButtonRecargarInformacionPedidos;
	}
	
	
	public List<Pedidos> getpedidoss() {
		return this.pedidoss;
	}

	public void setpedidoss(List<Pedidos> pedidoss) {
		this.pedidoss = pedidoss;
	}
	
	public List<Pedidos> getpedidossAux() {
		return this.pedidossAux;
	}

	public void setpedidossAux(List<Pedidos> pedidossAux) {
		this.pedidossAux = pedidossAux;
	}
	
	public List<Pedidos> getpedidossEliminados() {
		return this.pedidossEliminados;
	}

	public void setPedidossEliminados(List<Pedidos> pedidossEliminados) {
		this.pedidossEliminados = pedidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidos() {
		return jComboBoxTiposSeleccionarPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidos(
			JComboBox jComboBoxTiposSeleccionarPedidos) {
		this.jComboBoxTiposSeleccionarPedidos = jComboBoxTiposSeleccionarPedidos;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidos() {
		return jTextFieldValorCampoGeneralPedidos;
	}

	public void setjTextFieldValorCampoGeneralPedidos(
			JTextField jTextFieldValorCampoGeneralPedidos) {
		this.jTextFieldValorCampoGeneralPedidos = jTextFieldValorCampoGeneralPedidos;
	}

	public void setBorderResaltarValorCampoGeneralPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidos() {
		return this.jCheckBoxSeleccionarTodosPedidos;
	}

	public void setjCheckBoxSeleccionarTodosPedidos(
			JCheckBox jCheckBoxSeleccionarTodosPedidos) {
		this.jCheckBoxSeleccionarTodosPedidos = jCheckBoxSeleccionarTodosPedidos;
	}

	public void setBorderResaltarSeleccionarTodosPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidos() {
		return this.jCheckBoxSeleccionadosPedidos;
	}

	public void setjCheckBoxSeleccionadosPedidos(
			JCheckBox jCheckBoxSeleccionadosPedidos) {
		this.jCheckBoxSeleccionadosPedidos = jCheckBoxSeleccionadosPedidos;
	}
	
	public void setBorderResaltarSeleccionadosPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidos() {
		return this.jComboBoxTiposArchivosReportesPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidos(
			JComboBox jComboBoxTiposArchivosReportesPedidos) {
		this.jComboBoxTiposArchivosReportesPedidos = jComboBoxTiposArchivosReportesPedidos;
	}

	public void setBorderResaltarTiposArchivosReportesPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidos() {
		return this.jComboBoxTiposReportesPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidos(
			JComboBox jComboBoxTiposReportesPedidos) {
		this.jComboBoxTiposReportesPedidos = jComboBoxTiposReportesPedidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidos() {
	//	return jComboBoxTiposReportesDinamicoPedidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidos(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidos) {
	//	this.jComboBoxTiposReportesDinamicoPedidos = jComboBoxTiposReportesDinamicoPedidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidos = jComboBoxTiposArchivosReportesDinamicoPedidos;
	//}
	
	public void setBorderResaltarTiposReportesPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidos() {
		return this.jComboBoxTiposGraficosReportesPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidos(
			JComboBox jComboBoxTiposGraficosReportesPedidos) {
		this.jComboBoxTiposGraficosReportesPedidos = jComboBoxTiposGraficosReportesPedidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidos() {
		return this.jComboBoxTiposPaginacionPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidos(
			JComboBox jComboBoxTiposPaginacionPedidos) {
		this.jComboBoxTiposPaginacionPedidos = jComboBoxTiposPaginacionPedidos;
	}
	
	public void setBorderResaltarTiposPaginacionPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidos() {
		return this.jComboBoxTiposRelacionesPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidos() {
		return this.jComboBoxTiposAccionesPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidos(
			JComboBox jComboBoxTiposRelacionesPedidos) {
		this.jComboBoxTiposRelacionesPedidos = jComboBoxTiposRelacionesPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidos(
			JComboBox jComboBoxTiposAccionesPedidos) {
		this.jComboBoxTiposAccionesPedidos = jComboBoxTiposAccionesPedidos;
	}
	
	public void setBorderResaltarTiposRelacionesPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidos() {
	//	return jCheckBoxConGraficoDinamicoPedidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidos) {
	//	this.jCheckBoxConGraficoDinamicoPedidos = jCheckBoxConGraficoDinamicoPedidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidos .setBorder(borderResaltar);		
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
		this.pedidosSessionBean=new PedidosSessionBean();
		
		this.pedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedidos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidos,this.jTtoolBarPedidos,
							"nuevo","nuevo","Nuevo"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidos,this.jTtoolBarPedidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidos,this.jTtoolBarPedidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidos,this.jTtoolBarPedidos,
							"duplicar","duplicar","Duplicar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidos,this.jTtoolBarPedidos,
							"copiar","copiar","Copiar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidos,this.jTtoolBarPedidos,
							"ver_form","ver_form","Ver"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidos,this.jTtoolBarPedidos,
							"recargar","recargar","Buscar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidos,this.jTtoolBarPedidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidos,this.jTtoolBarPedidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidos,this.jTtoolBarPedidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidos,this.jTtoolBarPedidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidos,this.jTtoolBarPedidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidos,this.jTtoolBarPedidos,
							"cerrar","cerrar","Salir"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidos;
			
				this.jButtonProcesarInformacionToolBarPedidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidos;
				
		//protected JButton jButtonModificarToolBarPedidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidos=new JMenuMe("General");
		this.jmenuArchivoPedidos=new JMenuMe("Archivo");
		this.jmenuAccionesPedidos=new JMenuMe("Acciones");
		this.jmenuDatosPedidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidos.add(this.jMenuItemCerrarPedidos);
			
			this.jmenuAccionesPedidos.add(this.jMenuItemNuevoPedidos);
			this.jmenuAccionesPedidos.add(this.jMenuItemNuevoGuardarCambiosPedidos);
			this.jmenuAccionesPedidos.add(this.jMenuItemNuevoRelacionesPedidos);
			this.jmenuAccionesPedidos.add(this.jMenuItemGuardarCambiosTablaPedidos);		
			this.jmenuAccionesPedidos.add(this.jMenuItemDuplicarPedidos);		
			this.jmenuAccionesPedidos.add(this.jMenuItemCopiarPedidos);		
			this.jmenuAccionesPedidos.add(this.jMenuItemVerFormPedidos);		
			
			this.jmenuDatosPedidos.add(this.jMenuItemRecargarInformacionPedidos);				
			this.jmenuDatosPedidos.add(this.jMenuItemAnterioresPedidos);				
			this.jmenuDatosPedidos.add(this.jMenuItemSiguientesPedidos);				
			this.jmenuDatosPedidos.add(this.jMenuItemAbrirOrderByPedidos);				
			this.jmenuDatosPedidos.add(this.jMenuItemMostrarOcultarPedidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidos.add(this.jMenuItemGuardarCambiosPedidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidos.add(this.jmenuArchivoPedidos);		
			this.jmenuBarPedidos.add(this.jmenuAccionesPedidos);		
			this.jmenuBarPedidos.add(this.jmenuDatosPedidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPedidosPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPedidosPedidos.setToolTipText("Buscar Por Estado Pedo Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaPedidosPedidos= new JButtonMe();
		this.jButtonBusquedaPedidosPedidos.setText("Buscar");
		this.jButtonBusquedaPedidosPedidos.setToolTipText("Buscar Por Estado Pedo Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPedidosPedidos,"buscar_button","Buscar Por Estado Pedo Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPedidosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedidoBusquedaPedidosPedidos = new JLabelMe();
		jLabelid_estado_pedidoBusquedaPedidosPedidos.setText("Estado Pedo :");
		jLabelid_estado_pedidoBusquedaPedidosPedidos.setToolTipText("Estado Pedo");
		jLabelid_estado_pedidoBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedidoBusquedaPedidosPedidos= new JComboBoxMe();
		jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaPedidosPedidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaPedidosPedidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaPedidosPedidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaPedidosPedidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaPedidosPedidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaPedidosPedidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaPedidosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPedidos=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasPedidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasPedidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidos = new PedidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedidos DATOS");
			this.jInternalFrameDetalleFormPedidos = new PedidosDetalleFormJInternalFrame(jDesktopPane,this.pedidosSessionBean.getConGuardarRelaciones(),this.pedidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidos = null;//new PedidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidos= new GridBagLayout();
		
		
		this.jTableDatosPedidos = new JTableMe();      
		
		String sToolTipPedidos="";
		sToolTipPedidos=PedidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidos+="(Facturacion.Pedidos)";
		}
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidos.setToolTipText(sToolTipPedidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidos);
		this.jTableDatosPedidos.setAutoCreateRowSorter(true);
		this.jTableDatosPedidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidos.setRowSelectionAllowed(true);
		this.jTableDatosPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidos = new JButtonMe();
		this.jButtonDuplicarPedidos = new JButtonMe();
		this.jButtonCopiarPedidos = new JButtonMe();
		this.jButtonVerFormPedidos = new JButtonMe();
		this.jButtonNuevoRelacionesPedidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidos = new JButtonMe();
		this.jButtonCerrarPedidos = new JButtonMe();
		
		this.jScrollPanelDatosPedidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedidos";
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidos.setToolTipText("Acciones");
        this.jPanelAccionesPedidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidos=new ReporteDinamicoJInternalFrame(PedidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidos=new ImportacionJInternalFrame(PedidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidos = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidos.setText("Orden");
		this.jButtonAbrirOrderByPedidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidos,false,this);
			
			//this.cargarOrderByPedidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidos,true,this);
			
			//this.cargarOrderByPedidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosPedidos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosPedidos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosPedidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidos.setText("Nuevo");
		this.jButtonDuplicarPedidos.setText("Duplicar");
		this.jButtonCopiarPedidos.setText("Copiar");
		this.jButtonVerFormPedidos.setText("Ver");
		this.jButtonNuevoRelacionesPedidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidos.setText("Guardar");
		this.jButtonCerrarPedidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidos,"nuevo_button","Nuevo",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidos,"duplicar_button","Duplicar",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidos,"copiar_button","Copiar",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidos,"ver_form","Ver",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidos,"nuevorelaciones_button","Nuevo Rel",this.pedidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidos,"guardarcambiostabla_button","Guardar",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidos,"cerrar_button","Salir",this.pedidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidos.setToolTipText("Nuevo"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidos.setToolTipText("Duplicar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidos.setToolTipText("Copiar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidos.setToolTipText("Ver"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidos.setToolTipText("Nuevo Rel"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidos.setToolTipText("Guardar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidos.setToolTipText("Salir"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidos";
		inputMap = this.jButtonNuevoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidos";
		inputMap = this.jButtonDuplicarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidos"));
		
		//COPIAR
		sMapKey = "CopiarPedidos";
		inputMap = this.jButtonCopiarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidos"));
		
		//VEr FORM
		sMapKey = "VerFormPedidos";
		inputMap = this.jButtonVerFormPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidos";
		inputMap = this.jButtonNuevoRelacionesPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidos";
		inputMap = this.jButtonModificarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidos";
		inputMap = this.jButtonCerrarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidos";
		inputMap = this.jButtonGuardarCambiosTablaPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Pedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Pedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Pedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Pedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Pedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidos.setName("jPanelParametrosReportesPedidos"); 
		
		this.jPanelParametrosReportesAccionesPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidos.setName("jPanelParametrosReportesAccionesPedidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidos = new JButtonMe();
		this.jButtonRecargarInformacionPedidos.setText("Buscar");
		this.jButtonRecargarInformacionPedidos.setToolTipText("Buscar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPedidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionPedidos = new JButtonMe();
		this.jButtonProcesarInformacionPedidos.setText("Procesar");
		this.jButtonProcesarInformacionPedidos.setToolTipText("Procesar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidos.setVisible(false);
			
		this.jButtonProcesarInformacionPedidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidos.setText("TIPO");       
		this.jComboBoxTiposReportesPedidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidos.setText("Accion");
		this.jComboBoxTiposRelacionesPedidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidos.setText("Accion");
		this.jComboBoxTiposAccionesPedidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidos.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidos = new JLabelMe();
		
		this.jLabelAccionesPedidos.setText("Acciones");		
		this.jLabelAccionesPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidos.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidos = new JButtonMe();
		//this.jButtonAnterioresPedidos.setText("<<");
        this.jButtonAnterioresPedidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidos = new JButtonMe();
		//this.jButtonSiguientesPedidos.setText(">>");
        this.jButtonSiguientesPedidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidos,"nuevoguardarcambios_button","Nue",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidos";
		inputMap = this.jButtonNuevoGuardarCambiosPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidos";
		inputMap = this.jButtonRecargarInformacionPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidos";
		inputMap = this.jButtonSiguientesPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidos";
		inputMap = this.jButtonAnterioresPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidos.setMinimumSize(new Dimension(this.getWidth(),PedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidos.setMaximumSize(new Dimension(this.getWidth(),PedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidos.setPreferredSize(new Dimension(this.getWidth(),PedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidos = new GridBagLayout();

			this.jPanelPaginacionPedidos.setLayout(gridaBagLayoutPaginacionPedidos);						
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 0;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidos.add(this.jButtonAnterioresPedidos, this.gridBagConstraintsPedidos);
					
						
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidos.gridy = 0;
			
			this.jPanelPaginacionPedidos.add(this.jButtonNuevoGuardarCambiosPedidos, this.gridBagConstraintsPedidos);
						
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidos.gridy = 0;
			this.jPanelPaginacionPedidos.add(this.jButtonSiguientesPedidos, this.gridBagConstraintsPedidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 1;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidos.add(this.jButtonNuevoPedidos, this.gridBagConstraintsPedidos);
						
			
			
			if(!this.pedidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidos = new GridBagConstraints();
				this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidos.gridy = 1;
				this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPedidos.add(this.jButtonGuardarCambiosTablaPedidos, this.gridBagConstraintsPedidos);
			}
			
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 1;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidos.add(this.jButtonDuplicarPedidos, this.gridBagConstraintsPedidos);
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 1;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidos.add(this.jButtonCopiarPedidos, this.gridBagConstraintsPedidos);
		
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 1;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidos.add(this.jButtonVerFormPedidos, this.gridBagConstraintsPedidos);
		
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 1;
			this.gridBagConstraintsPedidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidos.add(this.jButtonCerrarPedidos, this.gridBagConstraintsPedidos);
		
		
		
		this.jButtonRecargarInformacionPedidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Pedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Pedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Pedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Pedidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidos.setLayout(gridaBagParametrosReportesPedidos);
			this.jPanelParametrosReportesAccionesPedidos.setLayout(gridaBagParametrosReportesAccionesPedidos);
			
			
			this.jPanelParametrosAuxiliar1Pedidos.setLayout(gridaBagParametrosAuxiliar1Pedidos);
			this.jPanelParametrosAuxiliar2Pedidos.setLayout(gridaBagParametrosAuxiliar2Pedidos);
			this.jPanelParametrosAuxiliar3Pedidos.setLayout(gridaBagParametrosAuxiliar3Pedidos);
			this.jPanelParametrosAuxiliar4Pedidos.setLayout(gridaBagParametrosAuxiliar4Pedidos);
			//this.jPanelParametrosAuxiliar5Pedidos.setLayout(gridaBagParametrosAuxiliar2Pedidos);			
			
			
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidos.add(this.jButtonRecargarInformacionPedidos, this.gridBagConstraintsPedidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedidos.add(this.jComboBoxTiposPaginacionPedidos, this.gridBagConstraintsPedidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedidos.add(this.jCheckBoxConAltoMaximoTablaPedidos, this.gridBagConstraintsPedidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedidos.add(this.jComboBoxTiposArchivosReportesPedidos, this.gridBagConstraintsPedidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidos.add(this.jPanelParametrosAuxiliar1Pedidos, this.gridBagConstraintsPedidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Pedidos.add(this.jComboBoxTiposReportesPedidos, this.gridBagConstraintsPedidos);																		
			
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Pedidos.add(this.jComboBoxTiposGraficosReportesPedidos, this.gridBagConstraintsPedidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidos.add(this.jPanelParametrosAuxiliar4Pedidos, this.gridBagConstraintsPedidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidos.add(this.jComboBoxTiposReportesPedidos, this.gridBagConstraintsPedidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidos.add(this.jCheckBoxGenerarReportePedidos, this.gridBagConstraintsPedidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidos.add(this.jPanelParametrosAuxiliar2Pedidos, this.gridBagConstraintsPedidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidos.add(this.jLabelAccionesPedidos, this.gridBagConstraintsPedidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidos = new GridBagConstraints();
				this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidos.add(this.jButtonAbrirOrderByPedidos, this.gridBagConstraintsPedidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidos.add(this.jComboBoxTiposSeleccionarPedidos, this.gridBagConstraintsPedidos);			
			
			
			/*
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidos.add(this.jCheckBoxSeleccionarTodosPedidos, this.gridBagConstraintsPedidos);
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidos.add(this.jCheckBoxConGraficoReportePedidos, this.gridBagConstraintsPedidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedidos.add(this.jCheckBoxSeleccionarTodosPedidos, this.gridBagConstraintsPedidos);															
				
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedidos.add(this.jCheckBoxSeleccionadosPedidos, this.gridBagConstraintsPedidos);															
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedidos.add(this.jCheckBoxConGraficoReportePedidos, this.gridBagConstraintsPedidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidos.add(this.jPanelParametrosAuxiliar3Pedidos, this.gridBagConstraintsPedidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidos.add(this.jComboBoxTiposAccionesPedidos, this.gridBagConstraintsPedidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidos = new GridBagLayout();

			this.jScrollPanelDatosPedidos.setLayout(gridaBagLayoutDatosPedidos);
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = 0;
			this.gridBagConstraintsPedidos.gridx = 0;
			
			this.jScrollPanelDatosPedidos.add(this.jTableDatosPedidos, this.gridBagConstraintsPedidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidos.setViewportView(this.jTableDatosPedidos);
		this.jTableDatosPedidos.setFillsViewportHeight(true);
		this.jTableDatosPedidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidos= new GridBagLayout();
		this.jPanelAccionesPedidos.setLayout(gridaBagLayoutAccionesPedidos);
		
		
		/*	
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 0;
			
		this.jPanelAccionesPedidos.add(this.jButtonNuevoPedidos, this.gridBagConstraintsPedidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPedidosPedidos= new GridBagLayout();
		gridaBagLayoutBusquedaPedidosPedidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPedidosPedidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPedidosPedidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPedidosPedidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPedidosPedidos.setLayout(gridaBagLayoutBusquedaPedidosPedidos);

		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 0;
		gridBagConstraintsPedidos.gridx = 0;
		jPanelBusquedaPedidosPedidos.add(jLabelid_estado_pedidoBusquedaPedidosPedidos, gridBagConstraintsPedidos);

		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 0;
		gridBagConstraintsPedidos.gridx = 1;
		jPanelBusquedaPedidosPedidos.add(jComboBoxid_estado_pedidoBusquedaPedidosPedidos, gridBagConstraintsPedidos);


		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 1;
		gridBagConstraintsPedidos.gridx = 0;
		jPanelBusquedaPedidosPedidos.add(jLabelfecha_emision_desdeBusquedaPedidosPedidos, gridBagConstraintsPedidos);

		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 1;
		gridBagConstraintsPedidos.gridx = 1;
		jPanelBusquedaPedidosPedidos.add(jDateChooserfecha_emision_desdeBusquedaPedidosPedidos, gridBagConstraintsPedidos);


		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 2;
		gridBagConstraintsPedidos.gridx = 0;
		jPanelBusquedaPedidosPedidos.add(jLabelfecha_emision_hastaBusquedaPedidosPedidos, gridBagConstraintsPedidos);

		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 2;
		gridBagConstraintsPedidos.gridx = 1;
		jPanelBusquedaPedidosPedidos.add(jDateChooserfecha_emision_hastaBusquedaPedidosPedidos, gridBagConstraintsPedidos);

		gridBagConstraintsPedidos = new GridBagConstraints();
		gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidos.gridy = 3;
		gridBagConstraintsPedidos.gridx =1;
		jPanelBusquedaPedidosPedidos.add(jButtonBusquedaPedidosPedidos, gridBagConstraintsPedidos);

		jTabbedPaneBusquedasPedidos.addTab("1.-Por Estado Pedo Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaPedidosPedidos);
		jTabbedPaneBusquedasPedidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidos = new GridBagConstraints();						
			this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidos.gridx = 0;		
			//this.gridBagConstraintsPedidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidos, this.gridBagConstraintsPedidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidos.gridx = 0;		
		//this.gridBagConstraintsPedidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidos.gridx = 0;		
			this.gridBagConstraintsPedidos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidos, this.gridBagConstraintsPedidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidos, this.gridBagConstraintsPedidos);								
		
		
		/*
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidos, this.gridBagConstraintsPedidos);
		*/		
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidos.gridx =0;
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidos, this.gridBagConstraintsPedidos);
				
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidos, this.gridBagConstraintsPedidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PedidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidos = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidos.setLayout(gridaBagLayoutBusquedasParametrosPedidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidos, this.gridBagConstraintsPedidos);
			
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidos, this.gridBagConstraintsPedidos);
		
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidos, this.gridBagConstraintsPedidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidos.setName("jPanelReporteDinamicoPedidos"); 
		
		this.jPanelReporteDinamicoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidos.setLayout(gridaBagLayoutReporteDinamicoPedidos);
		
		
		this.jInternalFrameReporteDinamicoPedidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidos = new JLabelMe();

		this.jLabelColumnasSelectReportePedidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidos.add(this.jLabelColumnasSelectReportePedidos, this.gridBagConstraintsPedidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidos = new JList<Reporte>();
		this.jListColumnasSelectReportePedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidos=new JScrollPane(this.jListColumnasSelectReportePedidos);
			
			this.jScrollColumnasSelectReportePedidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidos.add(this.jListColumnasSelectReportePedidos, this.gridBagConstraintsPedidos);
		this.jPanelReporteDinamicoPedidos.add(this.jScrollColumnasSelectReportePedidos, this.gridBagConstraintsPedidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidos = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidos = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidos=new JScrollPane(this.jListRelacionesSelectReportePedidos);
			
			this.jScrollRelacionesSelectReportePedidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPedidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedidos = new JLabelMe();

		this.jLabelConGraficoDinamicoPedidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidos.add(this.jLabelConGraficoDinamicoPedidos, this.gridBagConstraintsPedidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jCheckBoxConGraficoDinamicoPedidos, this.gridBagConstraintsPedidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidos.add(this.jLabelColumnaCategoriaGraficoPedidos, this.gridBagConstraintsPedidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedidos.add(this.jComboBoxColumnaCategoriaGraficoPedidos, this.gridBagConstraintsPedidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jLabelColumnaCategoriaValorPedidos, this.gridBagConstraintsPedidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedidos.add(this.jComboBoxColumnaCategoriaValorPedidos, this.gridBagConstraintsPedidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jLabelColumnasValoresGraficoPedidos, this.gridBagConstraintsPedidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedidos=new JScrollPane(this.jListColumnasValoresGraficoPedidos);
			
			this.jScrollColumnasValoresGraficoPedidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedidos.add(this.jListColumnasSelectReportePedidos, this.gridBagConstraintsPedidos);
		this.jPanelReporteDinamicoPedidos.add(this.jScrollColumnasValoresGraficoPedidos, this.gridBagConstraintsPedidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jLabelTiposGraficosReportesDinamicoPedidos, this.gridBagConstraintsPedidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jComboBoxTiposGraficosReportesDinamicoPedidos, this.gridBagConstraintsPedidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jLabelGenerarExcelReporteDinamicoPedidos, this.gridBagConstraintsPedidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidos.setToolTipText("Generar EXCEL"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidos.add(this.jButtonGenerarExcelReporteDinamicoPedidos, this.gridBagConstraintsPedidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidos.add(this.jComboBoxTiposReportesDinamicoPedidos, this.gridBagConstraintsPedidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidos.add(this.jLabelTiposArchivoReporteDinamicoPedidos, this.gridBagConstraintsPedidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidos.add(this.jComboBoxTiposArchivosReportesDinamicoPedidos, this.gridBagConstraintsPedidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidos.setToolTipText("Generar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidos.add(this.jButtonGenerarReporteDinamicoPedidos, this.gridBagConstraintsPedidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidos.setToolTipText("Cancelar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidos.add(this.jButtonCerrarReporteDinamicoPedidos, this.gridBagConstraintsPedidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidos= new JScrollPane(jPanelReporteDinamicoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidos);
		this.jInternalFrameReporteDinamicoPedidos.getContentPane().add(this.jScrollPanelReporteDinamicoPedidos, this.gridBagConstraintsPedidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidos.setName("jPanelImportacionPedidos"); 
		
		this.jPanelImportacionPedidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidos.setLayout(gridaBagLayoutImportacionPedidos);
		
		
		this.jInternalFrameImportacionPedidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidos.setResizable(true);
	    this.jInternalFrameImportacionPedidos.setClosable(true);
	    this.jInternalFrameImportacionPedidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidos.setResizable(true);
	    this.jInternalFrameImportacionPedidos.setClosable(true);
	    this.jInternalFrameImportacionPedidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidos = new JLabelMe();

		this.jLabelArchivoImportacionPedidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidos.add(this.jLabelArchivoImportacionPedidos, this.gridBagConstraintsPedidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidos = new JFileChooser();		
		this.jFileChooserImportacionPedidos.setToolTipText("ESCOGER ARCHIVO"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidos = new JButtonMe();
		this.jButtonAbrirImportacionPedidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidos.setToolTipText("Generar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidos.add(this.jButtonAbrirImportacionPedidos, this.gridBagConstraintsPedidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidos = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidos.add(this.jLabelPathArchivoImportacionPedidos, this.gridBagConstraintsPedidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidos.add(this.jTextFieldPathArchivoImportacionPedidos, this.gridBagConstraintsPedidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidos = new JButtonMe();
		this.jButtonGenerarImportacionPedidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidos.setToolTipText("Generar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidos.add(this.jButtonGenerarImportacionPedidos, this.gridBagConstraintsPedidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidos = new JButtonMe();
		this.jButtonCerrarImportacionPedidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidos.setToolTipText("Cancelar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidos.add(this.jButtonCerrarImportacionPedidos, this.gridBagConstraintsPedidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidos = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidos= new JScrollPane(jPanelImportacionPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidos.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidos);
		this.jInternalFrameImportacionPedidos.getContentPane().add(this.jScrollPanelImportacionPedidos, this.gridBagConstraintsPedidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidos = new JButtonMe();
			this.jButtonAbrirOrderByPedidos.setText("Orden");
			this.jButtonAbrirOrderByPedidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidos";
			inputMap = this.jButtonAbrirOrderByPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidos.setName("jPanelOrderByPedidos"); 
			
			this.jPanelOrderByPedidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidos.setLayout(gridaBagLayoutOrderByPedidos);
			
			
			this.jTableDatosPedidosOrderBy = new JTableMe();        
			this.jTableDatosPedidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidosOrderBy.setViewportView(this.jTableDatosPedidosOrderBy);
			this.jTableDatosPedidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidos.setTitle("Orden");
			this.jInternalFrameOrderByPedidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidos.setResizable(true);
			this.jInternalFrameOrderByPedidos.setClosable(true);
			this.jInternalFrameOrderByPedidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidos.ipady =150;
				
			this.jPanelOrderByPedidos.add(jScrollPanelDatosPedidosOrderBy, this.gridBagConstraintsPedidos);//this.jTableDatosPedidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidos = new JButtonMe();
			this.jButtonCerrarOrderByPedidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidos.setToolTipText("Cancelar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidos.add(this.jButtonCerrarOrderByPedidos, this.gridBagConstraintsPedidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidos = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidos= new JScrollPane(jPanelOrderByPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidos);
			
			this.jInternalFrameOrderByPedidos.getContentPane().add(this.jScrollPanelOrderByPedidos, this.gridBagConstraintsPedidos);			
		
		} else {
			this.jButtonAbrirOrderByPedidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.pedidosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosPedidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPedidos.getRowHeight();//PedidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidos.isSelected()) {
					iHeightTable=PedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidos.isSelected()) {
					iHeightTable=PedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidos!=null && this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pedidosLogic.getPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Pedidos> TraerPedidosBeans(List<Pedidos> pedidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(Pedidos pedidos:pedidoss) {
					
				if(!(PedidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidos.setsDetalleGeneralEntityReporte(PedidosConstantesFunciones.getPedidosDescripcion(pedidos));
										
						
					
						
					
				} else  {
							
					//pedidos.setsDetalleGeneralEntityReporte(pedidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidosbeans.add(pedidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidoss;
    }
	//PARA REPORTES FIN
}
