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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.ProcesoPedidosConstantesFunciones;

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
public class ProcesoPedidosJInternalFrame extends ProcesoPedidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoPedidos;
	
	protected JMenuBar jmenuBarProcesoPedidos;
	
	protected JMenu jmenuProcesoPedidos;
	protected JMenu jmenuDatosProcesoPedidos;
	protected JMenu jmenuArchivoProcesoPedidos;
	protected JMenu jmenuAccionesProcesoPedidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPedidos;	
	protected GridBagConstraints gridBagConstraintsProcesoPedidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoPedidosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoPedidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoPedidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoPedidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoPedidosSessionBean procesopedidosSessionBean;
		
	
	
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoPedidos> procesopedidoss;		
	public List<ProcesoPedidos> procesopedidossEliminados;	
	public List<ProcesoPedidos> procesopedidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoPedidos;		
	protected JButton jButtonAbrirOrderByProcesoPedidos;
	
	
	//protected JPanel jPanelOrderByProcesoPedidos;
	//public JScrollPane jScrollPanelOrderByProcesoPedidos;	
	//protected JButton jButtonCerrarOrderByProcesoPedidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoPedidosLogic procesopedidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoPedidos;
	public JScrollPane jScrollPanelDatosEdicionProcesoPedidos;
	public JScrollPane jScrollPanelDatosGeneralProcesoPedidos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoPedidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoPedidos;
	//public JScrollPane jScrollPanelImportacionProcesoPedidos;
	
	
	
	protected JPanel jPanelAccionesProcesoPedidos;
	
    protected JPanel jPanelPaginacionProcesoPedidos;
    protected JPanel jPanelParametrosReportesProcesoPedidos;
	protected JPanel jPanelParametrosReportesAccionesProcesoPedidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoPedidos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoPedidos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoPedidos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoPedidos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoPedidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoPedidos;
	//protected JPanel jPanelImportacionProcesoPedidos;
	
	
	public JTable jTableDatosProcesoPedidos;
	
	
	
	//public JTable jTableDatosProcesoPedidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoPedidos;
	protected JButton jButtonDuplicarProcesoPedidos;
	protected JButton jButtonCopiarProcesoPedidos;
	protected JButton jButtonVerFormProcesoPedidos;
	protected JButton jButtonNuevoRelacionesProcesoPedidos;
	protected JButton jButtonModificarProcesoPedidos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoPedidos;
	protected JButton jButtonCerrarProcesoPedidos;
	
	
	protected JButton jButtonRecargarInformacionProcesoPedidos;
	protected JButton jButtonProcesarInformacionProcesoPedidos;
	
	
	protected JButton jButtonAnterioresProcesoPedidos;
	protected JButton jButtonSiguientesProcesoPedidos;
	protected JButton jButtonNuevoGuardarCambiosProcesoPedidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoPedidos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoPedidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoPedidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoPedidos;
	//protected JButton jButtonGenerarImportacionProcesoPedidos;
	//protected JButton jButtonCerrarImportacionProcesoPedidos;
	//protected JFileChooser jFileChooserImportacionProcesoPedidos;
	//protected File fileImportacionProcesoPedidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPedidos;
	protected JButton jButtonDuplicarToolBarProcesoPedidos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoPedidos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoPedidos;
	protected JButton jButtonCopiarToolBarProcesoPedidos;
	protected JButton jButtonVerFormToolBarProcesoPedidos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoPedidos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPedidos;
	protected JButton jButtonCerrarToolBarProcesoPedidos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoPedidos;
	protected JButton jButtonProcesarInformacionToolBarProcesoPedidos;
	protected JButton jButtonAnterioresToolBarProcesoPedidos;
	protected JButton jButtonSiguientesToolBarProcesoPedidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoPedidos;
	protected JButton jButtonAbrirOrderByToolBarProcesoPedidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPedidos;
	protected JMenuItem jMenuItemDuplicarProcesoPedidos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoPedidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoPedidos;
	protected JMenuItem jMenuItemCopiarProcesoPedidos;
	protected JMenuItem jMenuItemVerFormProcesoPedidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPedidos;
	protected JMenuItem jMenuItemCerrarProcesoPedidos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPedidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoPedidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPedidos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoPedidos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoPedidos;
	protected JMenuItem jMenuItemAnterioresProcesoPedidos;
	protected JMenuItem jMenuItemSiguientesProcesoPedidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPedidos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoPedidos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPedidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPedidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoPedidos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoPedidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoPedidos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoPedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoPedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoPedidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPedidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoPedidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoPedidos;
	protected JTextField jTextFieldValorCampoGeneralProcesoPedidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoPedidos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoPedidos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoPedidos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoPedidos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoPedidos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoPedidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoPedidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoPedidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoPedidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoPedidos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoPedidos;	
	//public JLabel jLabelPathArchivoImportacionProcesoPedidos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoPedidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoPedidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoPedidos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoPedidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoPedidos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoPedidos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoPedidos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoPedidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoPedidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoPedidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoPedidos;
	public JPanel jPanelBusquedaProcesoPedidosProcesoPedidos;
	public JButton jButtonBusquedaProcesoPedidosProcesoPedidos;
	
	public JPanel jPanelid_ciudadBusquedaProcesoPedidosProcesoPedidos;
	public JLabel jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos;
	public JButton jButtonid_ciudadBusquedaProcesoPedidosProcesoPedidos= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoPedidosProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoPedidosProcesoPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaBusquedaProcesoPedidosProcesoPedidos;
	public JLabel jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos;
	public JButton jButtonid_zonaBusquedaProcesoPedidosProcesoPedidos= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoPedidosProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoPedidosProcesoPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos;
	public JLabel jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos;
	public JButton jButtonid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoPedidosProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoPedidosProcesoPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorBusquedaProcesoPedidosProcesoPedidos;
	public JLabel jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos;
	public JButton jButtonid_vendedorBusquedaProcesoPedidosProcesoPedidos= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoPedidosProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoPedidosProcesoPedidosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoPedidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoPedidos)	{
		this.jButtonRecargarInformacionProcesoPedidos = jButtonRecargarInformacionProcesoPedidos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoPedidos() {
		return this.jButtonProcesarInformacionProcesoPedidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPedidos)	{
		this.jButtonProcesarInformacionProcesoPedidos = jButtonProcesarInformacionProcesoPedidos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoPedidos() {
		return this.jButtonRecargarInformacionProcesoPedidos;
	}
	
	
	public List<ProcesoPedidos> getprocesopedidoss() {
		return this.procesopedidoss;
	}

	public void setprocesopedidoss(List<ProcesoPedidos> procesopedidoss) {
		this.procesopedidoss = procesopedidoss;
	}
	
	public List<ProcesoPedidos> getprocesopedidossAux() {
		return this.procesopedidossAux;
	}

	public void setprocesopedidossAux(List<ProcesoPedidos> procesopedidossAux) {
		this.procesopedidossAux = procesopedidossAux;
	}
	
	public List<ProcesoPedidos> getprocesopedidossEliminados() {
		return this.procesopedidossEliminados;
	}

	public void setProcesoPedidossEliminados(List<ProcesoPedidos> procesopedidossEliminados) {
		this.procesopedidossEliminados = procesopedidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoPedidos() {
		return jComboBoxTiposSeleccionarProcesoPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoPedidos(
			JComboBox jComboBoxTiposSeleccionarProcesoPedidos) {
		this.jComboBoxTiposSeleccionarProcesoPedidos = jComboBoxTiposSeleccionarProcesoPedidos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoPedidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoPedidos() {
		return jTextFieldValorCampoGeneralProcesoPedidos;
	}

	public void setjTextFieldValorCampoGeneralProcesoPedidos(
			JTextField jTextFieldValorCampoGeneralProcesoPedidos) {
		this.jTextFieldValorCampoGeneralProcesoPedidos = jTextFieldValorCampoGeneralProcesoPedidos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoPedidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoPedidos() {
		return this.jCheckBoxSeleccionarTodosProcesoPedidos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoPedidos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoPedidos) {
		this.jCheckBoxSeleccionarTodosProcesoPedidos = jCheckBoxSeleccionarTodosProcesoPedidos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoPedidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoPedidos() {
		return this.jCheckBoxSeleccionadosProcesoPedidos;
	}

	public void setjCheckBoxSeleccionadosProcesoPedidos(
			JCheckBox jCheckBoxSeleccionadosProcesoPedidos) {
		this.jCheckBoxSeleccionadosProcesoPedidos = jCheckBoxSeleccionadosProcesoPedidos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoPedidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoPedidos() {
		return this.jComboBoxTiposArchivosReportesProcesoPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoPedidos(
			JComboBox jComboBoxTiposArchivosReportesProcesoPedidos) {
		this.jComboBoxTiposArchivosReportesProcesoPedidos = jComboBoxTiposArchivosReportesProcesoPedidos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoPedidos() {
		return this.jComboBoxTiposReportesProcesoPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoPedidos(
			JComboBox jComboBoxTiposReportesProcesoPedidos) {
		this.jComboBoxTiposReportesProcesoPedidos = jComboBoxTiposReportesProcesoPedidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoPedidos() {
	//	return jComboBoxTiposReportesDinamicoProcesoPedidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoPedidos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoPedidos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoPedidos = jComboBoxTiposReportesDinamicoProcesoPedidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoPedidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoPedidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoPedidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPedidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos = jComboBoxTiposArchivosReportesDinamicoProcesoPedidos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoPedidos() {
		return this.jComboBoxTiposGraficosReportesProcesoPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoPedidos(
			JComboBox jComboBoxTiposGraficosReportesProcesoPedidos) {
		this.jComboBoxTiposGraficosReportesProcesoPedidos = jComboBoxTiposGraficosReportesProcesoPedidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoPedidos() {
		return this.jComboBoxTiposPaginacionProcesoPedidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoPedidos(
			JComboBox jComboBoxTiposPaginacionProcesoPedidos) {
		this.jComboBoxTiposPaginacionProcesoPedidos = jComboBoxTiposPaginacionProcesoPedidos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoPedidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoPedidos() {
		return this.jComboBoxTiposRelacionesProcesoPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPedidos() {
		return this.jComboBoxTiposAccionesProcesoPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPedidos(
			JComboBox jComboBoxTiposRelacionesProcesoPedidos) {
		this.jComboBoxTiposRelacionesProcesoPedidos = jComboBoxTiposRelacionesProcesoPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPedidos(
			JComboBox jComboBoxTiposAccionesProcesoPedidos) {
		this.jComboBoxTiposAccionesProcesoPedidos = jComboBoxTiposAccionesProcesoPedidos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoPedidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoPedidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoPedidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoPedidos() {
	//	return jCheckBoxConGraficoDinamicoProcesoPedidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoPedidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoPedidos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoPedidos = jCheckBoxConGraficoDinamicoProcesoPedidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoPedidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoPedidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoPedidos .setBorder(borderResaltar);		
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
		this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
		
		this.procesopedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopedidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPedidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Pedidos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoPedidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoPedidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"copiar","copiar","Copiar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"ver_form","ver_form","Ver"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"recargar","recargar","Buscar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoPedidos,this.jTtoolBarProcesoPedidos,
							"cerrar","cerrar","Salir"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoPedidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoPedidos;
			
				this.jButtonProcesarInformacionToolBarProcesoPedidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoPedidos;
				
		//protected JButton jButtonModificarToolBarProcesoPedidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoPedidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoPedidos=new JMenuMe("General");
		this.jmenuArchivoProcesoPedidos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoPedidos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoPedidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPedidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPedidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPedidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoPedidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoPedidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoPedidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoPedidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoPedidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoPedidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoPedidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPedidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPedidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoPedidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoPedidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoPedidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoPedidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoPedidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoPedidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoPedidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoPedidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoPedidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoPedidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoPedidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoPedidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoPedidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoPedidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoPedidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoPedidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoPedidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoPedidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoPedidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoPedidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoPedidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoPedidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoPedidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoPedidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPedidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoPedidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoPedidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoPedidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPedidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoPedidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoPedidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoPedidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoPedidos.add(this.jMenuItemCerrarProcesoPedidos);
			
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemNuevoProcesoPedidos);
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemNuevoGuardarCambiosProcesoPedidos);
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemNuevoRelacionesProcesoPedidos);
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemGuardarCambiosTablaProcesoPedidos);		
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemDuplicarProcesoPedidos);		
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemCopiarProcesoPedidos);		
			this.jmenuAccionesProcesoPedidos.add(this.jMenuItemVerFormProcesoPedidos);		
			
			this.jmenuDatosProcesoPedidos.add(this.jMenuItemRecargarInformacionProcesoPedidos);				
			this.jmenuDatosProcesoPedidos.add(this.jMenuItemAnterioresProcesoPedidos);				
			this.jmenuDatosProcesoPedidos.add(this.jMenuItemSiguientesProcesoPedidos);				
			this.jmenuDatosProcesoPedidos.add(this.jMenuItemAbrirOrderByProcesoPedidos);				
			this.jmenuDatosProcesoPedidos.add(this.jMenuItemMostrarOcultarProcesoPedidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoPedidos.add(this.jMenuItemGuardarCambiosProcesoPedidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoPedidos.add(this.jmenuArchivoProcesoPedidos);		
			this.jmenuBarProcesoPedidos.add(this.jmenuAccionesProcesoPedidos);		
			this.jmenuBarProcesoPedidos.add(this.jmenuDatosProcesoPedidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoPedidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoPedidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoPedidosProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");
		this.jButtonBusquedaProcesoPedidosProcesoPedidos= new JButtonMe();
		this.jButtonBusquedaProcesoPedidosProcesoPedidos.setText("Buscar");
		this.jButtonBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoPedidosProcesoPedidos,"buscar_button","Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoPedidosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos = new JLabelMe();
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos.setText("Ciudad :");
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos = new JLabelMe();
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos.setText("Zona :");
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Zona");
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos= new JComboBoxMe();
		jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos = new JLabelMe();
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos.setText("Vendedor :");
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoPedidos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoPedidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoPedidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoPedidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoPedidos = new ProcesoPedidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Pedidos DATOS");
			this.jInternalFrameDetalleFormProcesoPedidos = new ProcesoPedidosDetalleFormJInternalFrame(jDesktopPane,this.procesopedidosSessionBean.getConGuardarRelaciones(),this.procesopedidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoPedidos = null;//new ProcesoPedidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPedidos= new GridBagLayout();
		
		
		this.jTableDatosProcesoPedidos = new JTableMe();      
		
		String sToolTipProcesoPedidos="";
		sToolTipProcesoPedidos=ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPedidos+="(Facturacion.ProcesoPedidos)";
		}
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPedidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoPedidos.setToolTipText(sToolTipProcesoPedidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoPedidos);
		this.jTableDatosProcesoPedidos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoPedidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoPedidos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoPedidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoPedidos = new JButtonMe();
		this.jButtonDuplicarProcesoPedidos = new JButtonMe();
		this.jButtonCopiarProcesoPedidos = new JButtonMe();
		this.jButtonVerFormProcesoPedidos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoPedidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoPedidos = new JButtonMe();
		this.jButtonCerrarProcesoPedidos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPedidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoPedidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Pedidos";
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPedidos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPedidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoPedidos=new ReporteDinamicoJInternalFrame(ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoPedidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoPedidos=new ImportacionJInternalFrame(ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoPedidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoPedidos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoPedidos.setText("Orden");
		this.jButtonAbrirOrderByProcesoPedidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPedidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPedidos,false,this);
			
			//this.cargarOrderByProcesoPedidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPedidos,true,this);
			
			//this.cargarOrderByProcesoPedidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoPedidos.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoPedidos.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoPedidos.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProcesoPedidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPedidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPedidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoPedidos.setText("Nuevo");
		this.jButtonDuplicarProcesoPedidos.setText("Duplicar");
		this.jButtonCopiarProcesoPedidos.setText("Copiar");
		this.jButtonVerFormProcesoPedidos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoPedidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.setText("Guardar");
		this.jButtonCerrarProcesoPedidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPedidos,"nuevo_button","Nuevo",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoPedidos,"duplicar_button","Duplicar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoPedidos,"copiar_button","Copiar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoPedidos,"ver_form","Ver",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoPedidos,"nuevorelaciones_button","Nuevo Rel",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPedidos,"guardarcambiostabla_button","Guardar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPedidos,"cerrar_button","Salir",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoPedidos.setToolTipText("Nuevo"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoPedidos.setToolTipText("Duplicar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoPedidos.setToolTipText("Copiar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoPedidos.setToolTipText("Ver"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoPedidos.setToolTipText("Nuevo Rel"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.setToolTipText("Guardar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPedidos.setToolTipText("Salir"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPedidos";
		inputMap = this.jButtonNuevoProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPedidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoPedidos";
		inputMap = this.jButtonDuplicarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoPedidos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoPedidos";
		inputMap = this.jButtonCopiarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoPedidos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoPedidos";
		inputMap = this.jButtonVerFormProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoPedidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoPedidos";
		inputMap = this.jButtonNuevoRelacionesProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoPedidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoPedidos";
		inputMap = this.jButtonModificarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoPedidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoPedidos";
		inputMap = this.jButtonCerrarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPedidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPedidos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPedidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoPedidos.setName("jPanelParametrosReportesProcesoPedidos"); 
		
		this.jPanelParametrosReportesAccionesProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoPedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoPedidos.setName("jPanelParametrosReportesAccionesProcesoPedidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoPedidos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoPedidos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoPedidos.setToolTipText("Buscar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoPedidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoPedidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoPedidos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoPedidos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoPedidos.setToolTipText("Procesar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoPedidos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoPedidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPedidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPedidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPedidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoPedidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPedidos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoPedidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPedidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoPedidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoPedidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoPedidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoPedidos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoPedidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPedidos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPedidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoPedidos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoPedidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoPedidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoPedidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPedidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPedidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoPedidos = new JLabelMe();
		
		this.jLabelAccionesProcesoPedidos.setText("Acciones");		
		this.jLabelAccionesProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoPedidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoPedidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoPedidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoPedidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoPedidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoPedidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoPedidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoPedidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoPedidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoPedidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoPedidos = new JButtonMe();
		//this.jButtonAnterioresProcesoPedidos.setText("<<");
        this.jButtonAnterioresProcesoPedidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoPedidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoPedidos = new JButtonMe();
		//this.jButtonSiguientesProcesoPedidos.setText(">>");
        this.jButtonSiguientesProcesoPedidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoPedidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoPedidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoPedidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoPedidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoPedidos,"nuevoguardarcambios_button","Nue",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoPedidos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoPedidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoPedidos";
		inputMap = this.jButtonRecargarInformacionProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoPedidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoPedidos";
		inputMap = this.jButtonSiguientesProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoPedidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoPedidos";
		inputMap = this.jButtonAnterioresProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoPedidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoPedidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoPedidos.setMinimumSize(new Dimension(this.getWidth(),ProcesoPedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPedidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPedidos.setMaximumSize(new Dimension(this.getWidth(),ProcesoPedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPedidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPedidos.setPreferredSize(new Dimension(this.getWidth(),ProcesoPedidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPedidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoPedidos = new GridBagLayout();

			this.jPanelPaginacionProcesoPedidos.setLayout(gridaBagLayoutPaginacionProcesoPedidos);						
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 0;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonAnterioresProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					
						
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPedidos.gridy = 0;
			
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonNuevoGuardarCambiosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
						
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPedidos.gridy = 0;
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonSiguientesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 1;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonNuevoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
						
			
			
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
				this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoPedidos.gridy = 1;
				this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoPedidos.add(this.jButtonGuardarCambiosTablaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			}
			
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 1;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonDuplicarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 1;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonCopiarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 1;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonVerFormProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 1;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoPedidos.add(this.jButtonCerrarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		
		this.jButtonRecargarInformacionProcesoPedidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPedidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPedidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoPedidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPedidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPedidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoPedidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPedidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPedidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoPedidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPedidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPedidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoPedidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPedidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPedidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoPedidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPedidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPedidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoPedidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPedidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPedidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoPedidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPedidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPedidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoPedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoPedidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoPedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoPedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoPedidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoPedidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoPedidos.setLayout(gridaBagParametrosReportesProcesoPedidos);
			this.jPanelParametrosReportesAccionesProcesoPedidos.setLayout(gridaBagParametrosReportesAccionesProcesoPedidos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoPedidos.setLayout(gridaBagParametrosAuxiliar1ProcesoPedidos);
			this.jPanelParametrosAuxiliar2ProcesoPedidos.setLayout(gridaBagParametrosAuxiliar2ProcesoPedidos);
			this.jPanelParametrosAuxiliar3ProcesoPedidos.setLayout(gridaBagParametrosAuxiliar3ProcesoPedidos);
			this.jPanelParametrosAuxiliar4ProcesoPedidos.setLayout(gridaBagParametrosAuxiliar4ProcesoPedidos);
			//this.jPanelParametrosAuxiliar5ProcesoPedidos.setLayout(gridaBagParametrosAuxiliar2ProcesoPedidos);			
			
			
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPedidos.add(this.jButtonRecargarInformacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPedidos.add(this.jComboBoxTiposPaginacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPedidos.add(this.jCheckBoxConAltoMaximoTablaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPedidos.add(this.jComboBoxTiposArchivosReportesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPedidos.add(this.jPanelParametrosAuxiliar1ProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoPedidos.add(this.jComboBoxTiposReportesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);																		
			
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoPedidos.add(this.jComboBoxTiposGraficosReportesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPedidos.add(this.jPanelParametrosAuxiliar4ProcesoPedidos, this.gridBagConstraintsProcesoPedidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPedidos.add(this.jComboBoxTiposReportesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPedidos.add(this.jCheckBoxGenerarReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPedidos.add(this.jPanelParametrosAuxiliar2ProcesoPedidos, this.gridBagConstraintsProcesoPedidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPedidos.add(this.jLabelAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
				this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoPedidos.add(this.jButtonAbrirOrderByProcesoPedidos, this.gridBagConstraintsProcesoPedidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPedidos.add(this.jComboBoxTiposSeleccionarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
			
			
			/*
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPedidos.add(this.jCheckBoxSeleccionarTodosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPedidos.add(this.jCheckBoxConGraficoReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPedidos.add(this.jCheckBoxSeleccionarTodosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);															
				
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPedidos.add(this.jCheckBoxSeleccionadosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);															
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPedidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPedidos.add(this.jCheckBoxConGraficoReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPedidos.add(this.jPanelParametrosAuxiliar3ProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPedidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPedidos.add(this.jComboBoxTiposAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoPedidos = new GridBagLayout();

			this.jScrollPanelDatosProcesoPedidos.setLayout(gridaBagLayoutDatosProcesoPedidos);
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = 0;
			this.gridBagConstraintsProcesoPedidos.gridx = 0;
			
			this.jScrollPanelDatosProcesoPedidos.add(this.jTableDatosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoPedidos.setViewportView(this.jTableDatosProcesoPedidos);
		this.jTableDatosProcesoPedidos.setFillsViewportHeight(true);
		this.jTableDatosProcesoPedidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoPedidos= new GridBagLayout();
		this.jPanelAccionesProcesoPedidos.setLayout(gridaBagLayoutAccionesProcesoPedidos);
		
		
		/*	
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
			
		this.jPanelAccionesProcesoPedidos.add(this.jButtonNuevoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoPedidosProcesoPedidos.setLayout(gridaBagLayoutBusquedaProcesoPedidosProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 0;
		gridBagConstraintsProcesoPedidos.gridx = 0;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jLabelid_ciudadBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 0;
		gridBagConstraintsProcesoPedidos.gridx = 1;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);


		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 1;
		gridBagConstraintsProcesoPedidos.gridx = 0;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jLabelid_zonaBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 1;
		gridBagConstraintsProcesoPedidos.gridx = 1;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);


		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 2;
		gridBagConstraintsProcesoPedidos.gridx = 0;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jLabelid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 2;
		gridBagConstraintsProcesoPedidos.gridx = 1;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);


		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 3;
		gridBagConstraintsProcesoPedidos.gridx = 0;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jLabelid_vendedorBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 3;
		gridBagConstraintsProcesoPedidos.gridx = 1;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPedidos.gridy = 4;
		gridBagConstraintsProcesoPedidos.gridx =1;
		jPanelBusquedaProcesoPedidosProcesoPedidos.add(jButtonBusquedaProcesoPedidosProcesoPedidos, gridBagConstraintsProcesoPedidos);

		jTabbedPaneBusquedasProcesoPedidos.addTab("1.-Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ", jPanelBusquedaProcesoPedidosProcesoPedidos);
		jTabbedPaneBusquedasProcesoPedidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPedidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPedidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPedidos.gridx = 0;		
			//this.gridBagConstraintsProcesoPedidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPedidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoPedidos.gridx = 0;		
		//this.gridBagConstraintsProcesoPedidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoPedidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoPedidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPedidos.gridx = 0;		
			this.gridBagConstraintsProcesoPedidos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoPedidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoPedidos, this.gridBagConstraintsProcesoPedidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);								
		
		
		/*
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		*/		
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPedidos.gridx =0;
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPedidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
				
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoPedidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPedidos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoPedidos.setLayout(gridaBagLayoutBusquedasParametrosProcesoPedidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoPedidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoPedidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoPedidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoPedidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoPedidos.setName("jPanelReporteDinamicoProcesoPedidos"); 
		
		this.jPanelReporteDinamicoProcesoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoPedidos.setLayout(gridaBagLayoutReporteDinamicoProcesoPedidos);
		
		
		this.jInternalFrameReporteDinamicoProcesoPedidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoPedidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPedidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoPedidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoPedidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoPedidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoPedidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoPedidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoPedidos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoPedidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelColumnasSelectReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoPedidos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoPedidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoPedidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPedidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoPedidos=new JScrollPane(this.jListColumnasSelectReporteProcesoPedidos);
			
			this.jScrollColumnasSelectReporteProcesoPedidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPedidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPedidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoPedidos.add(this.jListColumnasSelectReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jScrollColumnasSelectReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoPedidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoPedidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoPedidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoPedidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoPedidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPedidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoPedidos=new JScrollPane(this.jListRelacionesSelectReporteProcesoPedidos);
			
			this.jScrollRelacionesSelectReporteProcesoPedidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPedidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPedidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoPedidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoPedidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoPedidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoPedidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoPedidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoPedidos = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoPedidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelConGraficoDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoPedidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoPedidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoPedidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPedidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPedidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jCheckBoxConGraficoDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoPedidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoPedidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelColumnaCategoriaGraficoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jComboBoxColumnaCategoriaGraficoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoPedidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoPedidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelColumnaCategoriaValorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoPedidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jComboBoxColumnaCategoriaValorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoPedidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoPedidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelColumnasValoresGraficoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoPedidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoPedidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoPedidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoPedidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPedidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPedidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoPedidos=new JScrollPane(this.jListColumnasValoresGraficoProcesoPedidos);
			
			this.jScrollColumnasValoresGraficoProcesoPedidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPedidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPedidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoPedidos.add(this.jListColumnasSelectReporteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jScrollColumnasValoresGraficoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoPedidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoPedidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelTiposGraficosReportesDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPedidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoPedidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoPedidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelGenerarExcelReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPedidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoPedidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoPedidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoPedidos.setToolTipText("Generar EXCEL"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoPedidos.add(this.jButtonGenerarExcelReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jComboBoxTiposReportesDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoPedidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoPedidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jLabelTiposArchivoReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoPedidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoPedidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoPedidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoPedidos.setToolTipText("Generar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jButtonGenerarReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoPedidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoPedidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoPedidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoPedidos.setToolTipText("Cancelar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPedidos.add(this.jButtonCerrarReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoPedidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoPedidos= new JScrollPane(jPanelReporteDinamicoProcesoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoPedidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPedidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPedidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoPedidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoPedidos);
		this.jInternalFrameReporteDinamicoProcesoPedidos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoPedidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoPedidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoPedidos.setName("jPanelImportacionProcesoPedidos"); 
		
		this.jPanelImportacionProcesoPedidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPedidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPedidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoPedidos.setLayout(gridaBagLayoutImportacionProcesoPedidos);
		
		
		this.jInternalFrameImportacionProcesoPedidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoPedidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoPedidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPedidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPedidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoPedidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPedidos.setResizable(true);
	    this.jInternalFrameImportacionProcesoPedidos.setClosable(true);
	    this.jInternalFrameImportacionProcesoPedidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPedidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPedidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoPedidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPedidos.setResizable(true);
	    this.jInternalFrameImportacionProcesoPedidos.setClosable(true);
	    this.jInternalFrameImportacionProcesoPedidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoPedidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPedidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPedidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoPedidos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoPedidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPedidos.add(this.jLabelArchivoImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoPedidos = new JFileChooser();		
		this.jFileChooserImportacionProcesoPedidos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoPedidos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoPedidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoPedidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoPedidos.setToolTipText("Generar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPedidos.add(this.jButtonAbrirImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoPedidos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoPedidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPedidos.add(this.jLabelPathArchivoImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoPedidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoPedidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPedidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPedidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPedidos.add(this.jTextFieldPathArchivoImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoPedidos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoPedidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoPedidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoPedidos.setToolTipText("Generar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPedidos.add(this.jButtonGenerarImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoPedidos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoPedidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoPedidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoPedidos.setToolTipText("Cancelar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPedidos.add(this.jButtonCerrarImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoPedidos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoPedidos= new JScrollPane(jPanelImportacionProcesoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoPedidos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoPedidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoPedidos);
		this.jInternalFrameImportacionProcesoPedidos.getContentPane().add(this.jScrollPanelImportacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoPedidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoPedidos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoPedidos.setText("Orden");
			this.jButtonAbrirOrderByProcesoPedidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPedidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoPedidos";
			inputMap = this.jButtonAbrirOrderByProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoPedidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoPedidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoPedidos.setName("jPanelOrderByProcesoPedidos"); 
			
			this.jPanelOrderByProcesoPedidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPedidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPedidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoPedidos.setLayout(gridaBagLayoutOrderByProcesoPedidos);
			
			
			this.jTableDatosProcesoPedidosOrderBy = new JTableMe();        
			this.jTableDatosProcesoPedidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoPedidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoPedidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoPedidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoPedidosOrderBy.setViewportView(this.jTableDatosProcesoPedidosOrderBy);
			this.jTableDatosProcesoPedidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoPedidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoPedidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoPedidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoPedidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoPedidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoPedidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoPedidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoPedidos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoPedidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoPedidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoPedidos.setResizable(true);
			this.jInternalFrameOrderByProcesoPedidos.setClosable(true);
			this.jInternalFrameOrderByProcesoPedidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoPedidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPedidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPedidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoPedidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoPedidos.ipady =150;
				
			this.jPanelOrderByProcesoPedidos.add(jScrollPanelDatosProcesoPedidosOrderBy, this.gridBagConstraintsProcesoPedidos);//this.jTableDatosProcesoPedidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoPedidos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoPedidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoPedidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoPedidos.setToolTipText("Cancelar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoPedidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoPedidos.add(this.jButtonCerrarOrderByProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoPedidos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoPedidos= new JScrollPane(jPanelOrderByProcesoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoPedidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoPedidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoPedidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoPedidos);
			
			this.jInternalFrameOrderByProcesoPedidos.getContentPane().add(this.jScrollPanelOrderByProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoPedidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesopedidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoPedidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoPedidos.getRowHeight();//ProcesoPedidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPedidos.isSelected()) {
					iHeightTable=ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPedidos.isSelected()) {
					iHeightTable=ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPedidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoPedidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPedidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPedidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoPedidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPedidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPedidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoPedidos!=null && this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoPedidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoPedidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoPedidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoPedidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPedidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPedidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesopedidosLogic.getProcesoPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopedidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoPedidos> TraerProcesoPedidosBeans(List<ProcesoPedidos> procesopedidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoPedidos procesopedidos:procesopedidoss) {
					
				if(!(ProcesoPedidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoPedidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesopedidos.setsDetalleGeneralEntityReporte(ProcesoPedidosConstantesFunciones.getProcesoPedidosDescripcion(procesopedidos));
										
						
					
						
					
				} else  {
							
					//procesopedidos.setsDetalleGeneralEntityReporte(procesopedidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesopedidosbeans.add(procesopedidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesopedidoss;
    }
	//PARA REPORTES FIN
}
