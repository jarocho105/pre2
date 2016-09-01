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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.facturacion.util.report.VentasResumidasMontosConstantesFunciones;

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
public class VentasResumidasMontosJInternalFrame extends VentasResumidasMontosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasResumidasMontos;
	
	protected JMenuBar jmenuBarVentasResumidasMontos;
	
	protected JMenu jmenuVentasResumidasMontos;
	protected JMenu jmenuDatosVentasResumidasMontos;
	protected JMenu jmenuArchivoVentasResumidasMontos;
	protected JMenu jmenuAccionesVentasResumidasMontos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidasMontos;	
	protected GridBagConstraints gridBagConstraintsVentasResumidasMontos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasResumidasMontosDetalleFormJInternalFrame jInternalFrameDetalleFormVentasResumidasMontos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasResumidasMontos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasResumidasMontos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public VentasResumidasMontosSessionBean ventasresumidasmontosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasResumidasMontos> ventasresumidasmontoss;		
	public List<VentasResumidasMontos> ventasresumidasmontossEliminados;	
	public List<VentasResumidasMontos> ventasresumidasmontossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasResumidasMontos;		
	protected JButton jButtonAbrirOrderByVentasResumidasMontos;
	
	
	//protected JPanel jPanelOrderByVentasResumidasMontos;
	//public JScrollPane jScrollPanelOrderByVentasResumidasMontos;	
	//protected JButton jButtonCerrarOrderByVentasResumidasMontos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasResumidasMontosLogic ventasresumidasmontosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasResumidasMontos;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidasMontos;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidasMontos;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasResumidasMontosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasResumidasMontos;
	//public JScrollPane jScrollPanelImportacionVentasResumidasMontos;
	
	
	
	protected JPanel jPanelAccionesVentasResumidasMontos;
	
    protected JPanel jPanelPaginacionVentasResumidasMontos;
    protected JPanel jPanelParametrosReportesVentasResumidasMontos;
	protected JPanel jPanelParametrosReportesAccionesVentasResumidasMontos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasResumidasMontos;
	protected JPanel jPanelParametrosAuxiliar2VentasResumidasMontos;
	protected JPanel jPanelParametrosAuxiliar3VentasResumidasMontos;
	protected JPanel jPanelParametrosAuxiliar4VentasResumidasMontos;
	//protected JPanel jPanelParametrosAuxiliar5VentasResumidasMontos;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasResumidasMontos;
	//protected JPanel jPanelImportacionVentasResumidasMontos;
	
	
	public JTable jTableDatosVentasResumidasMontos;
	
	
	
	//public JTable jTableDatosVentasResumidasMontosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasResumidasMontos;
	protected JButton jButtonDuplicarVentasResumidasMontos;
	protected JButton jButtonCopiarVentasResumidasMontos;
	protected JButton jButtonVerFormVentasResumidasMontos;
	protected JButton jButtonNuevoRelacionesVentasResumidasMontos;
	protected JButton jButtonModificarVentasResumidasMontos;
	
    protected JButton jButtonGuardarCambiosTablaVentasResumidasMontos;
	protected JButton jButtonCerrarVentasResumidasMontos;
	
	
	protected JButton jButtonRecargarInformacionVentasResumidasMontos;
	protected JButton jButtonProcesarInformacionVentasResumidasMontos;
	
	
	protected JButton jButtonAnterioresVentasResumidasMontos;
	protected JButton jButtonSiguientesVentasResumidasMontos;
	protected JButton jButtonNuevoGuardarCambiosVentasResumidasMontos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasResumidasMontos;
	//protected JButton jButtonCerrarReporteDinamicoVentasResumidasMontos;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasResumidasMontos;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasResumidasMontos;
	//protected JButton jButtonGenerarImportacionVentasResumidasMontos;
	//protected JButton jButtonCerrarImportacionVentasResumidasMontos;
	//protected JFileChooser jFileChooserImportacionVentasResumidasMontos;
	//protected File fileImportacionVentasResumidasMontos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidasMontos;
	protected JButton jButtonDuplicarToolBarVentasResumidasMontos;
	protected JButton jButtonNuevoRelacionesToolBarVentasResumidasMontos;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasResumidasMontos;
	protected JButton jButtonCopiarToolBarVentasResumidasMontos;
	protected JButton jButtonVerFormToolBarVentasResumidasMontos;
	public JButton jButtonGuardarCambiosTablaToolBarVentasResumidasMontos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidasMontos;
	protected JButton jButtonCerrarToolBarVentasResumidasMontos;
	
	protected JButton jButtonRecargarInformacionToolBarVentasResumidasMontos;
	protected JButton jButtonProcesarInformacionToolBarVentasResumidasMontos;
	protected JButton jButtonAnterioresToolBarVentasResumidasMontos;
	protected JButton jButtonSiguientesToolBarVentasResumidasMontos;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos;
	protected JButton jButtonAbrirOrderByToolBarVentasResumidasMontos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidasMontos;
	protected JMenuItem jMenuItemDuplicarVentasResumidasMontos;
	protected JMenuItem jMenuItemNuevoRelacionesVentasResumidasMontos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasResumidasMontos;
	protected JMenuItem jMenuItemCopiarVentasResumidasMontos;
	protected JMenuItem jMenuItemVerFormVentasResumidasMontos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidasMontos;
	protected JMenuItem jMenuItemCerrarVentasResumidasMontos;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidasMontos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasResumidasMontos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidasMontos;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasResumidasMontos;
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidasMontos;
	protected JMenuItem jMenuItemAnterioresVentasResumidasMontos;
	protected JMenuItem jMenuItemSiguientesVentasResumidasMontos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidasMontos;
	protected JMenuItem jMenuItemAbrirOrderByVentasResumidasMontos;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidasMontos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidasMontos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasResumidasMontos;
	protected JCheckBox jCheckBoxSeleccionadosVentasResumidasMontos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasResumidasMontos;
	protected JCheckBox jCheckBoxConGraficoReporteVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasResumidasMontos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasResumidasMontos;
	protected JTextField jTextFieldValorCampoGeneralVentasResumidasMontos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasResumidasMontos;
	//public JList<Reporte> jListColumnasSelectReporteVentasResumidasMontos;
	//public JScrollPane jScrollColumnasSelectReporteVentasResumidasMontos;
	
	//public JLabel jLabelRelacionesSelectReporteVentasResumidasMontos;
	//public JList<Reporte> jListRelacionesSelectReporteVentasResumidasMontos;
	//public JScrollPane jScrollRelacionesSelectReporteVentasResumidasMontos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasResumidasMontos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasResumidasMontos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasResumidasMontos;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasResumidasMontos;
	
		
	//public JLabel jLabelArchivoImportacionVentasResumidasMontos;	
	//public JLabel jLabelPathArchivoImportacionVentasResumidasMontos;
	//protected JTextField jTextFieldPathArchivoImportacionVentasResumidasMontos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasResumidasMontos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasResumidasMontos;
	
	//public JLabel jLabelColumnaCategoriaValorVentasResumidasMontos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasResumidasMontos;
	
	//public JLabel jLabelColumnasValoresGraficoVentasResumidasMontos;
	//public JList<Reporte> jListColumnasValoresGraficoVentasResumidasMontos;
	//public JScrollPane jScrollColumnasValoresGraficoVentasResumidasMontos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasResumidasMontos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasResumidasMontos;
	public JPanel jPanelBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JButton jButtonBusquedaVentasResumidasMontosVentasResumidasMontos;
	
	public JPanel jPanelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JLabel jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JButton jButtonid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JButton jButtonfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos;
	public JButton jButtonfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentasResumidasMontosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasResumidasMontos)	{
		this.jButtonRecargarInformacionVentasResumidasMontos = jButtonRecargarInformacionVentasResumidasMontos;
	}
	
	public JButton getjButtonProcesarInformacionVentasResumidasMontos() {
		return this.jButtonProcesarInformacionVentasResumidasMontos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidasMontos)	{
		this.jButtonProcesarInformacionVentasResumidasMontos = jButtonProcesarInformacionVentasResumidasMontos;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasResumidasMontos() {
		return this.jButtonRecargarInformacionVentasResumidasMontos;
	}
	
	
	public List<VentasResumidasMontos> getventasresumidasmontoss() {
		return this.ventasresumidasmontoss;
	}

	public void setventasresumidasmontoss(List<VentasResumidasMontos> ventasresumidasmontoss) {
		this.ventasresumidasmontoss = ventasresumidasmontoss;
	}
	
	public List<VentasResumidasMontos> getventasresumidasmontossAux() {
		return this.ventasresumidasmontossAux;
	}

	public void setventasresumidasmontossAux(List<VentasResumidasMontos> ventasresumidasmontossAux) {
		this.ventasresumidasmontossAux = ventasresumidasmontossAux;
	}
	
	public List<VentasResumidasMontos> getventasresumidasmontossEliminados() {
		return this.ventasresumidasmontossEliminados;
	}

	public void setVentasResumidasMontossEliminados(List<VentasResumidasMontos> ventasresumidasmontossEliminados) {
		this.ventasresumidasmontossEliminados = ventasresumidasmontossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasResumidasMontos() {
		return jComboBoxTiposSeleccionarVentasResumidasMontos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasResumidasMontos(
			JComboBox jComboBoxTiposSeleccionarVentasResumidasMontos) {
		this.jComboBoxTiposSeleccionarVentasResumidasMontos = jComboBoxTiposSeleccionarVentasResumidasMontos;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasResumidasMontos() {
		return jTextFieldValorCampoGeneralVentasResumidasMontos;
	}

	public void setjTextFieldValorCampoGeneralVentasResumidasMontos(
			JTextField jTextFieldValorCampoGeneralVentasResumidasMontos) {
		this.jTextFieldValorCampoGeneralVentasResumidasMontos = jTextFieldValorCampoGeneralVentasResumidasMontos;
	}

	public void setBorderResaltarValorCampoGeneralVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasResumidasMontos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasResumidasMontos() {
		return this.jCheckBoxSeleccionarTodosVentasResumidasMontos;
	}

	public void setjCheckBoxSeleccionarTodosVentasResumidasMontos(
			JCheckBox jCheckBoxSeleccionarTodosVentasResumidasMontos) {
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos = jCheckBoxSeleccionarTodosVentasResumidasMontos;
	}

	public void setBorderResaltarSeleccionarTodosVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasResumidasMontos() {
		return this.jCheckBoxSeleccionadosVentasResumidasMontos;
	}

	public void setjCheckBoxSeleccionadosVentasResumidasMontos(
			JCheckBox jCheckBoxSeleccionadosVentasResumidasMontos) {
		this.jCheckBoxSeleccionadosVentasResumidasMontos = jCheckBoxSeleccionadosVentasResumidasMontos;
	}
	
	public void setBorderResaltarSeleccionadosVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasResumidasMontos() {
		return this.jComboBoxTiposArchivosReportesVentasResumidasMontos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasResumidasMontos(
			JComboBox jComboBoxTiposArchivosReportesVentasResumidasMontos) {
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos = jComboBoxTiposArchivosReportesVentasResumidasMontos;
	}

	public void setBorderResaltarTiposArchivosReportesVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasResumidasMontos() {
		return this.jComboBoxTiposReportesVentasResumidasMontos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasResumidasMontos(
			JComboBox jComboBoxTiposReportesVentasResumidasMontos) {
		this.jComboBoxTiposReportesVentasResumidasMontos = jComboBoxTiposReportesVentasResumidasMontos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasResumidasMontos() {
	//	return jComboBoxTiposReportesDinamicoVentasResumidasMontos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasResumidasMontos(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasResumidasMontos) {
	//	this.jComboBoxTiposReportesDinamicoVentasResumidasMontos = jComboBoxTiposReportesDinamicoVentasResumidasMontos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos = jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos;
	//}
	
	public void setBorderResaltarTiposReportesVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasResumidasMontos() {
		return this.jComboBoxTiposGraficosReportesVentasResumidasMontos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasResumidasMontos(
			JComboBox jComboBoxTiposGraficosReportesVentasResumidasMontos) {
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos = jComboBoxTiposGraficosReportesVentasResumidasMontos;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasResumidasMontos() {
		return this.jComboBoxTiposPaginacionVentasResumidasMontos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasResumidasMontos(
			JComboBox jComboBoxTiposPaginacionVentasResumidasMontos) {
		this.jComboBoxTiposPaginacionVentasResumidasMontos = jComboBoxTiposPaginacionVentasResumidasMontos;
	}
	
	public void setBorderResaltarTiposPaginacionVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasResumidasMontos() {
		return this.jComboBoxTiposRelacionesVentasResumidasMontos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidasMontos() {
		return this.jComboBoxTiposAccionesVentasResumidasMontos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidasMontos(
			JComboBox jComboBoxTiposRelacionesVentasResumidasMontos) {
		this.jComboBoxTiposRelacionesVentasResumidasMontos = jComboBoxTiposRelacionesVentasResumidasMontos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidasMontos(
			JComboBox jComboBoxTiposAccionesVentasResumidasMontos) {
		this.jComboBoxTiposAccionesVentasResumidasMontos = jComboBoxTiposAccionesVentasResumidasMontos;
	}
	
	public void setBorderResaltarTiposRelacionesVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasResumidasMontos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasResumidasMontos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasResumidasMontos() {
	//	return jCheckBoxConGraficoDinamicoVentasResumidasMontos;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasResumidasMontos(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasResumidasMontos) {
	//	this.jCheckBoxConGraficoDinamicoVentasResumidasMontos = jCheckBoxConGraficoDinamicoVentasResumidasMontos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasResumidasMontos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasResumidasMontos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasResumidasMontos .setBorder(borderResaltar);		
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
		this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
		
		this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidasmontosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidasMontosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidas Montos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasResumidasMontosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasResumidasMontos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"nuevo","nuevo","Nuevo"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"duplicar","duplicar","Duplicar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"copiar","copiar","Copiar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"ver_form","ver_form","Ver"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"recargar","recargar","Buscar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,
							"cerrar","cerrar","Salir"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasResumidasMontos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasResumidasMontos;
			
				this.jButtonProcesarInformacionToolBarVentasResumidasMontos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasResumidasMontos;
				
		//protected JButton jButtonModificarToolBarVentasResumidasMontos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasResumidasMontos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasResumidasMontos=new JMenuMe("General");
		this.jmenuArchivoVentasResumidasMontos=new JMenuMe("Archivo");
		this.jmenuAccionesVentasResumidasMontos=new JMenuMe("Acciones");
		this.jmenuDatosVentasResumidasMontos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidasMontos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidasMontos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidasMontos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasResumidasMontos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasResumidasMontos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasResumidasMontos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasResumidasMontos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasResumidasMontos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasResumidasMontos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasResumidasMontos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidasMontos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidasMontos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasResumidasMontos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasResumidasMontos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasResumidasMontos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasResumidasMontos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasResumidasMontos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasResumidasMontos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasResumidasMontos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasResumidasMontos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasResumidasMontos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidasMontos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidasMontos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidasMontos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasResumidasMontos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasResumidasMontos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasResumidasMontos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasResumidasMontos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasResumidasMontos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasResumidasMontos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasResumidasMontos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasResumidasMontos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasResumidasMontos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasResumidasMontos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasResumidasMontos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasResumidasMontos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasResumidasMontos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasResumidasMontos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasResumidasMontos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidasMontos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidasMontos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidasMontos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidasMontos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidasMontos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidasMontos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasResumidasMontos.add(this.jMenuItemCerrarVentasResumidasMontos);
			
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemNuevoVentasResumidasMontos);
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos);
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemNuevoRelacionesVentasResumidasMontos);
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemGuardarCambiosTablaVentasResumidasMontos);		
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemDuplicarVentasResumidasMontos);		
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemCopiarVentasResumidasMontos);		
			this.jmenuAccionesVentasResumidasMontos.add(this.jMenuItemVerFormVentasResumidasMontos);		
			
			this.jmenuDatosVentasResumidasMontos.add(this.jMenuItemRecargarInformacionVentasResumidasMontos);				
			this.jmenuDatosVentasResumidasMontos.add(this.jMenuItemAnterioresVentasResumidasMontos);				
			this.jmenuDatosVentasResumidasMontos.add(this.jMenuItemSiguientesVentasResumidasMontos);				
			this.jmenuDatosVentasResumidasMontos.add(this.jMenuItemAbrirOrderByVentasResumidasMontos);				
			this.jmenuDatosVentasResumidasMontos.add(this.jMenuItemMostrarOcultarVentasResumidasMontos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasResumidasMontos.add(this.jMenuItemGuardarCambiosVentasResumidasMontos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasResumidasMontos.add(this.jmenuArchivoVentasResumidasMontos);		
			this.jmenuBarVentasResumidasMontos.add(this.jmenuAccionesVentasResumidasMontos);		
			this.jmenuBarVentasResumidasMontos.add(this.jmenuDatosVentasResumidasMontos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasResumidasMontos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasResumidasMontos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.setToolTipText("Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos= new JButtonMe();
		this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos.setText("Buscar");
		this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos.setToolTipText("Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos,"buscar_button","Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos = new JLabelMe();
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setText("Vendedor :");
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasResumidasMontos=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasResumidasMontos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasVentasResumidasMontos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasVentasResumidasMontos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasResumidasMontos = new VentasResumidasMontosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Resumidas Montos DATOS");
			this.jInternalFrameDetalleFormVentasResumidasMontos = new VentasResumidasMontosDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidasmontosSessionBean.getConGuardarRelaciones(),this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasResumidasMontos = null;//new VentasResumidasMontosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidasMontos= new GridBagLayout();
		
		
		this.jTableDatosVentasResumidasMontos = new JTableMe();      
		
		String sToolTipVentasResumidasMontos="";
		sToolTipVentasResumidasMontos=VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidasMontos+="(Facturacion.VentasResumidasMontos)";
		}
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidasMontos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasResumidasMontos.setToolTipText(sToolTipVentasResumidasMontos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasResumidasMontos);
		this.jTableDatosVentasResumidasMontos.setAutoCreateRowSorter(true);
		this.jTableDatosVentasResumidasMontos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasResumidasMontos.setRowSelectionAllowed(true);
		this.jTableDatosVentasResumidasMontos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasResumidasMontos = new JButtonMe();
		this.jButtonDuplicarVentasResumidasMontos = new JButtonMe();
		this.jButtonCopiarVentasResumidasMontos = new JButtonMe();
		this.jButtonVerFormVentasResumidasMontos = new JButtonMe();
		this.jButtonNuevoRelacionesVentasResumidasMontos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos = new JButtonMe();
		this.jButtonCerrarVentasResumidasMontos = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidasMontos = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasResumidasMontos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidas Montos";
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidasMontos.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidasMontos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasResumidasMontos=new ReporteDinamicoJInternalFrame(VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasResumidasMontos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasResumidasMontos=new ImportacionJInternalFrame(VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasResumidasMontos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasResumidasMontos = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasResumidasMontos.setText("Orden");
		this.jButtonAbrirOrderByVentasResumidasMontos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidasMontos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidasMontos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidasMontos,false,this);
			
			//this.cargarOrderByVentasResumidasMontos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidasMontos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidasMontos,true,this);
			
			//this.cargarOrderByVentasResumidasMontos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasResumidasMontos.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosVentasResumidasMontos.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosVentasResumidasMontos.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosVentasResumidasMontos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidasMontos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidasMontos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasResumidasMontos.setText("Nuevo");
		this.jButtonDuplicarVentasResumidasMontos.setText("Duplicar");
		this.jButtonCopiarVentasResumidasMontos.setText("Copiar");
		this.jButtonVerFormVentasResumidasMontos.setText("Ver");
		this.jButtonNuevoRelacionesVentasResumidasMontos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.setText("Guardar");
		this.jButtonCerrarVentasResumidasMontos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidasMontos,"nuevo_button","Nuevo",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasResumidasMontos,"duplicar_button","Duplicar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasResumidasMontos,"copiar_button","Copiar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasResumidasMontos,"ver_form","Ver",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasResumidasMontos,"nuevorelaciones_button","Nuevo Rel",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidasMontos,"guardarcambiostabla_button","Guardar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidasMontos,"cerrar_button","Salir",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasResumidasMontos.setToolTipText("Nuevo"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasResumidasMontos.setToolTipText("Duplicar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasResumidasMontos.setToolTipText("Copiar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasResumidasMontos.setToolTipText("Ver"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasResumidasMontos.setToolTipText("Nuevo Rel"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.setToolTipText("Guardar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidasMontos.setToolTipText("Salir"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidasMontos";
		inputMap = this.jButtonNuevoVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidasMontos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidasMontos"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasResumidasMontos";
		inputMap = this.jButtonDuplicarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasResumidasMontos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasResumidasMontos"));
		
		//COPIAR
		sMapKey = "CopiarVentasResumidasMontos";
		inputMap = this.jButtonCopiarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasResumidasMontos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasResumidasMontos"));
		
		//VEr FORM
		sMapKey = "VerFormVentasResumidasMontos";
		inputMap = this.jButtonVerFormVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasResumidasMontos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasResumidasMontos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasResumidasMontos";
		inputMap = this.jButtonNuevoRelacionesVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasResumidasMontos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasResumidasMontos";
		inputMap = this.jButtonModificarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasResumidasMontos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidasMontos";
		inputMap = this.jButtonCerrarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidasMontos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidasMontos";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidasMontos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasResumidasMontos.setName("jPanelParametrosReportesVentasResumidasMontos"); 
		
		this.jPanelParametrosReportesAccionesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasResumidasMontos.setName("jPanelParametrosReportesAccionesVentasResumidasMontos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasResumidasMontos = new JButtonMe();
		this.jButtonRecargarInformacionVentasResumidasMontos.setText("Buscar");
		this.jButtonRecargarInformacionVentasResumidasMontos.setToolTipText("Buscar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasResumidasMontos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasResumidasMontos.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasResumidasMontos = new JButtonMe();
		this.jButtonProcesarInformacionVentasResumidasMontos.setText("Procesar");
		this.jButtonProcesarInformacionVentasResumidasMontos.setToolTipText("Procesar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasResumidasMontos.setVisible(false);
			
		this.jButtonProcesarInformacionVentasResumidasMontos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidasMontos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidasMontos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setText("TIPO");       
		this.jComboBoxTiposReportesVentasResumidasMontos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasResumidasMontos.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasResumidasMontos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasResumidasMontos.setText("Accion");
		this.jComboBoxTiposRelacionesVentasResumidasMontos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidasMontos.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidasMontos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasResumidasMontos.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasResumidasMontos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasResumidasMontos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidasMontos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidasMontos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasResumidasMontos = new JLabelMe();
		
		this.jLabelAccionesVentasResumidasMontos.setText("Acciones");		
		this.jLabelAccionesVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasResumidasMontos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasResumidasMontos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasResumidasMontos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasResumidasMontos.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasResumidasMontos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasResumidasMontos = new JButtonMe();
		//this.jButtonAnterioresVentasResumidasMontos.setText("<<");
        this.jButtonAnterioresVentasResumidasMontos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasResumidasMontos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasResumidasMontos = new JButtonMe();
		//this.jButtonSiguientesVentasResumidasMontos.setText(">>");
        this.jButtonSiguientesVentasResumidasMontos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasResumidasMontos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasResumidasMontos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasResumidasMontos.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasResumidasMontos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasResumidasMontos,"nuevoguardarcambios_button","Nue",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasResumidasMontos";
		inputMap = this.jButtonNuevoGuardarCambiosVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasResumidasMontos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasResumidasMontos";
		inputMap = this.jButtonRecargarInformacionVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasResumidasMontos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasResumidasMontos";
		inputMap = this.jButtonSiguientesVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasResumidasMontos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasResumidasMontos";
		inputMap = this.jButtonAnterioresVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasResumidasMontos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasResumidasMontos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasResumidasMontos.setMinimumSize(new Dimension(this.getWidth(),VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidasMontos.setMaximumSize(new Dimension(this.getWidth(),VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidasMontos.setPreferredSize(new Dimension(this.getWidth(),VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidasMontosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasResumidasMontos = new GridBagLayout();

			this.jPanelPaginacionVentasResumidasMontos.setLayout(gridaBagLayoutPaginacionVentasResumidasMontos);						
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonAnterioresVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					
						
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
			
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonNuevoGuardarCambiosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
						
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonSiguientesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonNuevoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
						
			
			
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
				this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonGuardarCambiosTablaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			}
			
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonDuplicarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonCopiarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonVerFormVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 1;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasResumidasMontos.add(this.jButtonCerrarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		
		this.jButtonRecargarInformacionVentasResumidasMontos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidasMontos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidasMontos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidasMontos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasResumidasMontos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidasMontos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidasMontos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidasMontos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasResumidasMontos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidasMontos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidasMontos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidasMontos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidasMontos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasResumidasMontos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidasMontos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidasMontos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasResumidasMontos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidasMontos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidasMontos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasResumidasMontos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasResumidasMontos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasResumidasMontos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasResumidasMontos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasResumidasMontos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasResumidasMontos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasResumidasMontos.setLayout(gridaBagParametrosReportesVentasResumidasMontos);
			this.jPanelParametrosReportesAccionesVentasResumidasMontos.setLayout(gridaBagParametrosReportesAccionesVentasResumidasMontos);
			
			
			this.jPanelParametrosAuxiliar1VentasResumidasMontos.setLayout(gridaBagParametrosAuxiliar1VentasResumidasMontos);
			this.jPanelParametrosAuxiliar2VentasResumidasMontos.setLayout(gridaBagParametrosAuxiliar2VentasResumidasMontos);
			this.jPanelParametrosAuxiliar3VentasResumidasMontos.setLayout(gridaBagParametrosAuxiliar3VentasResumidasMontos);
			this.jPanelParametrosAuxiliar4VentasResumidasMontos.setLayout(gridaBagParametrosAuxiliar4VentasResumidasMontos);
			//this.jPanelParametrosAuxiliar5VentasResumidasMontos.setLayout(gridaBagParametrosAuxiliar2VentasResumidasMontos);			
			
			
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jButtonRecargarInformacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidasMontos.add(this.jComboBoxTiposPaginacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidasMontos.add(this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidasMontos.add(this.jComboBoxTiposArchivosReportesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jPanelParametrosAuxiliar1VentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasResumidasMontos.add(this.jComboBoxTiposReportesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);																		
			
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasResumidasMontos.add(this.jComboBoxTiposGraficosReportesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jPanelParametrosAuxiliar4VentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jComboBoxTiposReportesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jCheckBoxGenerarReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jPanelParametrosAuxiliar2VentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jLabelAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasResumidasMontos.add(this.jButtonAbrirOrderByVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jComboBoxTiposSeleccionarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
			
			
			/*
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jCheckBoxSeleccionarTodosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jCheckBoxConGraficoReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidasMontos.add(this.jCheckBoxSeleccionarTodosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);															
				
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidasMontos.add(this.jCheckBoxSeleccionadosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);															
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidasMontos.add(this.jCheckBoxConGraficoReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jPanelParametrosAuxiliar3VentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidasMontos.add(this.jComboBoxTiposAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasResumidasMontos = new GridBagLayout();

			this.jScrollPanelDatosVentasResumidasMontos.setLayout(gridaBagLayoutDatosVentasResumidasMontos);
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
			
			this.jScrollPanelDatosVentasResumidasMontos.add(this.jTableDatosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasResumidasMontos.setViewportView(this.jTableDatosVentasResumidasMontos);
		this.jTableDatosVentasResumidasMontos.setFillsViewportHeight(true);
		this.jTableDatosVentasResumidasMontos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidasMontos= new GridBagLayout();
		this.jPanelAccionesVentasResumidasMontos.setLayout(gridaBagLayoutAccionesVentasResumidasMontos);
		
		
		/*	
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
			
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonNuevoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos= new GridBagLayout();
		gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.setLayout(gridaBagLayoutBusquedaVentasResumidasMontosVentasResumidasMontos);

		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 0;
		gridBagConstraintsVentasResumidasMontos.gridx = 0;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jLabelid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);

		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 0;
		gridBagConstraintsVentasResumidasMontos.gridx = 1;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);


		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 1;
		gridBagConstraintsVentasResumidasMontos.gridx = 0;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jLabelfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);

		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 1;
		gridBagConstraintsVentasResumidasMontos.gridx = 1;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);


		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 2;
		gridBagConstraintsVentasResumidasMontos.gridx = 0;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jLabelfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);

		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 2;
		gridBagConstraintsVentasResumidasMontos.gridx = 1;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);

		gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidasMontos.gridy = 3;
		gridBagConstraintsVentasResumidasMontos.gridx =1;
		jPanelBusquedaVentasResumidasMontosVentasResumidasMontos.add(jButtonBusquedaVentasResumidasMontosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);

		jTabbedPaneBusquedasVentasResumidasMontos.addTab("1.-Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);
		jTabbedPaneBusquedasVentasResumidasMontos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidasMontos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;		
			//this.gridBagConstraintsVentasResumidasMontos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidasMontos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;		
		//this.gridBagConstraintsVentasResumidasMontos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasResumidasMontos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;		
			this.gridBagConstraintsVentasResumidasMontos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasResumidasMontos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);								
		
		
		/*
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		*/		
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidasMontos.gridx =0;
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidasMontos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
				
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasResumidasMontos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidasMontos = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasResumidasMontos.setLayout(gridaBagLayoutBusquedasParametrosVentasResumidasMontos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasResumidasMontos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasResumidasMontos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasResumidasMontos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasResumidasMontos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasResumidasMontos.setName("jPanelReporteDinamicoVentasResumidasMontos"); 
		
		this.jPanelReporteDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasResumidasMontos.setLayout(gridaBagLayoutReporteDinamicoVentasResumidasMontos);
		
		
		this.jInternalFrameReporteDinamicoVentasResumidasMontos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasResumidasMontos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidasMontos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasResumidasMontos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasResumidasMontos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasResumidasMontos.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidasMontos.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidasMontos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasResumidasMontos = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasResumidasMontos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelColumnasSelectReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasResumidasMontos = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasResumidasMontos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasResumidasMontos=new JScrollPane(this.jListColumnasSelectReporteVentasResumidasMontos);
			
			this.jScrollColumnasSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jListColumnasSelectReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jScrollColumnasSelectReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasResumidasMontos = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasResumidasMontos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasResumidasMontos = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasResumidasMontos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasResumidasMontos=new JScrollPane(this.jListRelacionesSelectReporteVentasResumidasMontos);
			
			this.jScrollRelacionesSelectReporteVentasResumidasMontos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidasMontos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidasMontos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasResumidasMontos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasResumidasMontos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasResumidasMontos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasResumidasMontos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasResumidasMontos = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasResumidasMontos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelConGraficoDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasResumidasMontos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasResumidasMontos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jCheckBoxConGraficoDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasResumidasMontos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasResumidasMontos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelColumnaCategoriaGraficoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasResumidasMontos = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasResumidasMontos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelColumnaCategoriaValorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasResumidasMontos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidasMontos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jComboBoxColumnaCategoriaValorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasResumidasMontos = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasResumidasMontos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelColumnasValoresGraficoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasResumidasMontos = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasResumidasMontos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasResumidasMontos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasResumidasMontos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidasMontos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidasMontos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasResumidasMontos=new JScrollPane(this.jListColumnasValoresGraficoVentasResumidasMontos);
			
			this.jScrollColumnasValoresGraficoVentasResumidasMontos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidasMontos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidasMontos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jListColumnasSelectReporteVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jScrollColumnasValoresGraficoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelTiposGraficosReportesDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidasMontos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jComboBoxTiposGraficosReportesDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelGenerarExcelReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos.setToolTipText("Generar EXCEL"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jComboBoxTiposReportesDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jLabelTiposArchivoReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasResumidasMontos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasResumidasMontos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasResumidasMontos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasResumidasMontos.setToolTipText("Generar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jButtonGenerarReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasResumidasMontos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasResumidasMontos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasResumidasMontos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasResumidasMontos.setToolTipText("Cancelar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidasMontos.add(this.jButtonCerrarReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasResumidasMontos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasResumidasMontos= new JScrollPane(jPanelReporteDinamicoVentasResumidasMontos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasResumidasMontos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidasMontos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidasMontos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasResumidasMontos);
		this.jInternalFrameReporteDinamicoVentasResumidasMontos.getContentPane().add(this.jScrollPanelReporteDinamicoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasResumidasMontos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasResumidasMontos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasResumidasMontos.setName("jPanelImportacionVentasResumidasMontos"); 
		
		this.jPanelImportacionVentasResumidasMontos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidasMontos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidasMontos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasResumidasMontos.setLayout(gridaBagLayoutImportacionVentasResumidasMontos);
		
		
		this.jInternalFrameImportacionVentasResumidasMontos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasResumidasMontos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasResumidasMontos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidasMontos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasResumidasMontos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidasMontos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidasMontos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasResumidasMontos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidasMontos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidasMontos.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidasMontos.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidasMontos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasResumidasMontos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidasMontos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidasMontos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasResumidasMontos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidasMontos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidasMontos.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidasMontos.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidasMontos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasResumidasMontos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidasMontos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidasMontos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasResumidasMontos = new JLabelMe();

		this.jLabelArchivoImportacionVentasResumidasMontos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidasMontos.add(this.jLabelArchivoImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasResumidasMontos = new JFileChooser();		
		this.jFileChooserImportacionVentasResumidasMontos.setToolTipText("ESCOGER ARCHIVO"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasResumidasMontos = new JButtonMe();
		this.jButtonAbrirImportacionVentasResumidasMontos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasResumidasMontos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasResumidasMontos.setToolTipText("Generar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidasMontos.add(this.jButtonAbrirImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasResumidasMontos = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasResumidasMontos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidasMontos.add(this.jLabelPathArchivoImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasResumidasMontos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasResumidasMontos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidasMontos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidasMontos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidasMontos.add(this.jTextFieldPathArchivoImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasResumidasMontos = new JButtonMe();
		this.jButtonGenerarImportacionVentasResumidasMontos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasResumidasMontos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasResumidasMontos.setToolTipText("Generar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidasMontos.add(this.jButtonGenerarImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasResumidasMontos = new JButtonMe();
		this.jButtonCerrarImportacionVentasResumidasMontos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasResumidasMontos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasResumidasMontos.setToolTipText("Cancelar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidasMontos.add(this.jButtonCerrarImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasResumidasMontos = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasResumidasMontos= new JScrollPane(jPanelImportacionVentasResumidasMontos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasResumidasMontos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasResumidasMontos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasResumidasMontos);
		this.jInternalFrameImportacionVentasResumidasMontos.getContentPane().add(this.jScrollPanelImportacionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasResumidasMontos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasResumidasMontos = new JButtonMe();
			this.jButtonAbrirOrderByVentasResumidasMontos.setText("Orden");
			this.jButtonAbrirOrderByVentasResumidasMontos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidasMontos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasResumidasMontos";
			inputMap = this.jButtonAbrirOrderByVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasResumidasMontos"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasResumidasMontos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasResumidasMontos.setName("jPanelOrderByVentasResumidasMontos"); 
			
			this.jPanelOrderByVentasResumidasMontos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidasMontos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidasMontos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasResumidasMontos.setLayout(gridaBagLayoutOrderByVentasResumidasMontos);
			
			
			this.jTableDatosVentasResumidasMontosOrderBy = new JTableMe();        
			this.jTableDatosVentasResumidasMontosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasResumidasMontosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasResumidasMontosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasResumidasMontosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasResumidasMontosOrderBy.setViewportView(this.jTableDatosVentasResumidasMontosOrderBy);
			this.jTableDatosVentasResumidasMontosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasResumidasMontosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasResumidasMontos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasResumidasMontos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasResumidasMontos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasResumidasMontos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasResumidasMontos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasResumidasMontos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasResumidasMontos.setTitle("Orden");
			this.jInternalFrameOrderByVentasResumidasMontos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasResumidasMontos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasResumidasMontos.setResizable(true);
			this.jInternalFrameOrderByVentasResumidasMontos.setClosable(true);
			this.jInternalFrameOrderByVentasResumidasMontos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasResumidasMontos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidasMontos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidasMontos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasResumidasMontos.ipady =150;
				
			this.jPanelOrderByVentasResumidasMontos.add(jScrollPanelDatosVentasResumidasMontosOrderBy, this.gridBagConstraintsVentasResumidasMontos);//this.jTableDatosVentasResumidasMontosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasResumidasMontos = new JButtonMe();
			this.jButtonCerrarOrderByVentasResumidasMontos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasResumidasMontos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasResumidasMontos.setToolTipText("Cancelar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasResumidasMontos.add(this.jButtonCerrarOrderByVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasResumidasMontos = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasResumidasMontos= new JScrollPane(jPanelOrderByVentasResumidasMontos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasResumidasMontos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasResumidasMontos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasResumidasMontos);
			
			this.jInternalFrameOrderByVentasResumidasMontos.getContentPane().add(this.jScrollPanelOrderByVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
		
		} else {
			this.jButtonAbrirOrderByVentasResumidasMontos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasResumidasMontos.getRowHeight();//VentasResumidasMontosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.isSelected()) {
					iHeightTable=VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidasMontos.isSelected()) {
					iHeightTable=VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidasMontosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasResumidasMontos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidasMontos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidasMontos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasResumidasMontos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidasMontos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidasMontos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasResumidasMontos!=null && this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy()!=null) {
			//if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasResumidasMontos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasResumidasMontos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasResumidasMontos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasResumidasMontos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidasMontos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidasMontos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventasresumidasmontosLogic.getVentasResumidasMontoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidasmontoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasResumidasMontos> TraerVentasResumidasMontosBeans(List<VentasResumidasMontos> ventasresumidasmontoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontoss) {
					
				if(!(VentasResumidasMontosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasResumidasMontosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventasresumidasmontos.setsDetalleGeneralEntityReporte(VentasResumidasMontosConstantesFunciones.getVentasResumidasMontosDescripcion(ventasresumidasmontos));
										
						
					
						
					
				} else  {
							
					//ventasresumidasmontos.setsDetalleGeneralEntityReporte(ventasresumidasmontos.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventasresumidasmontosbeans.add(ventasresumidasmontosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventasresumidasmontoss;
    }
	//PARA REPORTES FIN
}
