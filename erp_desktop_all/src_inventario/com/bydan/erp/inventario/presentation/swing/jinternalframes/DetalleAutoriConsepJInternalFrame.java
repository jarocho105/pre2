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
import com.bydan.erp.inventario.util.DetalleAutoriConsepConstantesFunciones;

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
public class DetalleAutoriConsepJInternalFrame extends DetalleAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleAutoriConsep;
	
	protected JMenuBar jmenuBarDetalleAutoriConsep;
	
	protected JMenu jmenuDetalleAutoriConsep;
	protected JMenu jmenuDatosDetalleAutoriConsep;
	protected JMenu jmenuArchivoDetalleAutoriConsep;
	protected JMenu jmenuAccionesDetalleAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsDetalleAutoriConsep;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleAutoriConsepDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleAutoriConsep;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleAutoriConsep;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleAutoriConsep;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_autoriconsep="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetalleAutoriConsepBeanSwingJInternalFrame estadodetalleautoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleautoriconsep="";
	
	public DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean;
		
	
	
	public AutoriConsepSessionBean autoriconsepSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleAutoriConsep> detalleautoriconseps;		
	public List<DetalleAutoriConsep> detalleautoriconsepsEliminados;	
	public List<DetalleAutoriConsep> detalleautoriconsepsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleAutoriConsep;		
	protected JButton jButtonAbrirOrderByDetalleAutoriConsep;
	
	
	//protected JPanel jPanelOrderByDetalleAutoriConsep;
	//public JScrollPane jScrollPanelOrderByDetalleAutoriConsep;	
	//protected JButton jButtonCerrarOrderByDetalleAutoriConsep;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleAutoriConsepLogic detalleautoriconsepLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralDetalleAutoriConsep;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleAutoriConsepOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleAutoriConsep;
	//public JScrollPane jScrollPanelImportacionDetalleAutoriConsep;
	
	
	
	protected JPanel jPanelAccionesDetalleAutoriConsep;
	
    protected JPanel jPanelPaginacionDetalleAutoriConsep;
    protected JPanel jPanelParametrosReportesDetalleAutoriConsep;
	protected JPanel jPanelParametrosReportesAccionesDetalleAutoriConsep;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar2DetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar3DetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar4DetalleAutoriConsep;
	//protected JPanel jPanelParametrosAuxiliar5DetalleAutoriConsep;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleAutoriConsep;
	//protected JPanel jPanelImportacionDetalleAutoriConsep;
	
	
	public JTable jTableDatosDetalleAutoriConsep;
	
	
	
	//public JTable jTableDatosDetalleAutoriConsepOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleAutoriConsep;
	protected JButton jButtonDuplicarDetalleAutoriConsep;
	protected JButton jButtonCopiarDetalleAutoriConsep;
	protected JButton jButtonVerFormDetalleAutoriConsep;
	protected JButton jButtonNuevoRelacionesDetalleAutoriConsep;
	protected JButton jButtonModificarDetalleAutoriConsep;
	
    protected JButton jButtonGuardarCambiosTablaDetalleAutoriConsep;
	protected JButton jButtonCerrarDetalleAutoriConsep;
	
	
	protected JButton jButtonRecargarInformacionDetalleAutoriConsep;
	protected JButton jButtonProcesarInformacionDetalleAutoriConsep;
	
	
	protected JButton jButtonAnterioresDetalleAutoriConsep;
	protected JButton jButtonSiguientesDetalleAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosDetalleAutoriConsep;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleAutoriConsep;
	//protected JButton jButtonCerrarReporteDinamicoDetalleAutoriConsep;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleAutoriConsep;
	//protected JButton jButtonGenerarImportacionDetalleAutoriConsep;
	//protected JButton jButtonCerrarImportacionDetalleAutoriConsep;
	//protected JFileChooser jFileChooserImportacionDetalleAutoriConsep;
	//protected File fileImportacionDetalleAutoriConsep;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleAutoriConsep;
	protected JButton jButtonDuplicarToolBarDetalleAutoriConsep;
	protected JButton jButtonNuevoRelacionesToolBarDetalleAutoriConsep;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleAutoriConsep;
	protected JButton jButtonCopiarToolBarDetalleAutoriConsep;
	protected JButton jButtonVerFormToolBarDetalleAutoriConsep;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAutoriConsep;
	protected JButton jButtonCerrarToolBarDetalleAutoriConsep;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleAutoriConsep;
	protected JButton jButtonProcesarInformacionToolBarDetalleAutoriConsep;
	protected JButton jButtonAnterioresToolBarDetalleAutoriConsep;
	protected JButton jButtonSiguientesToolBarDetalleAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep;
	protected JButton jButtonAbrirOrderByToolBarDetalleAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDuplicarDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleAutoriConsep;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleAutoriConsep;
	protected JMenuItem jMenuItemCopiarDetalleAutoriConsep;
	protected JMenuItem jMenuItemVerFormDetalleAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAutoriConsep;
	protected JMenuItem jMenuItemCerrarDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAutoriConsep;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleAutoriConsep;
	protected JMenuItem jMenuItemProcesarInformacionDetalleAutoriConsep;
	protected JMenuItem jMenuItemAnterioresDetalleAutoriConsep;
	protected JMenuItem jMenuItemSiguientesDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAutoriConsep;
	protected JMenuItem jMenuItemAbrirOrderByDetalleAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAutoriConsep;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleAutoriConsep;
	protected JCheckBox jCheckBoxSeleccionadosDetalleAutoriConsep;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleAutoriConsep;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleAutoriConsep;
	protected JTextField jTextFieldValorCampoGeneralDetalleAutoriConsep;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleAutoriConsep;
	//public JList<Reporte> jListColumnasSelectReporteDetalleAutoriConsep;
	//public JScrollPane jScrollColumnasSelectReporteDetalleAutoriConsep;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleAutoriConsep;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleAutoriConsep;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleAutoriConsep;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleAutoriConsep;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleAutoriConsep;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep;
	
		
	//public JLabel jLabelArchivoImportacionDetalleAutoriConsep;	
	//public JLabel jLabelPathArchivoImportacionDetalleAutoriConsep;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleAutoriConsep;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleAutoriConsep;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleAutoriConsep;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleAutoriConsep;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleAutoriConsep;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleAutoriConsep;
	public JPanel jPanelFK_IdAutoriConsepDetalleAutoriConsep;
	public JButton jButtonFK_IdAutoriConsepDetalleAutoriConsep;
	public JPanel jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep;
	public JButton jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep;
	public JPanel jPanelFK_IdProductoDetalleAutoriConsep;
	public JButton jButtonFK_IdProductoDetalleAutoriConsep;
	public JPanel jPanelFK_IdUnidadDetalleAutoriConsep;
	public JButton jButtonFK_IdUnidadDetalleAutoriConsep;
	
	public JPanel jPanelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep;
	public JLabel jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep;
	public JButton jButtonid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_autori_consepFK_IdAutoriConsepDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_autori_consepFK_IdAutoriConsepDetalleAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep;
	public JLabel jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep;
	public JButton jButtonid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleAutoriConsep;
	public JLabel jLabelid_productoFK_IdProductoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleAutoriConsep;
	public JButton jButtonid_productoFK_IdProductoDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleAutoriConsepBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleAutoriConsep;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep;
	public JButton jButtonid_unidadFK_IdUnidadDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleAutoriConsepBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleAutoriConsepJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleAutoriConsep)	{
		this.jButtonRecargarInformacionDetalleAutoriConsep = jButtonRecargarInformacionDetalleAutoriConsep;
	}
	
	public JButton getjButtonProcesarInformacionDetalleAutoriConsep() {
		return this.jButtonProcesarInformacionDetalleAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAutoriConsep)	{
		this.jButtonProcesarInformacionDetalleAutoriConsep = jButtonProcesarInformacionDetalleAutoriConsep;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleAutoriConsep() {
		return this.jButtonRecargarInformacionDetalleAutoriConsep;
	}
	
	
	public List<DetalleAutoriConsep> getdetalleautoriconseps() {
		return this.detalleautoriconseps;
	}

	public void setdetalleautoriconseps(List<DetalleAutoriConsep> detalleautoriconseps) {
		this.detalleautoriconseps = detalleautoriconseps;
	}
	
	public List<DetalleAutoriConsep> getdetalleautoriconsepsAux() {
		return this.detalleautoriconsepsAux;
	}

	public void setdetalleautoriconsepsAux(List<DetalleAutoriConsep> detalleautoriconsepsAux) {
		this.detalleautoriconsepsAux = detalleautoriconsepsAux;
	}
	
	public List<DetalleAutoriConsep> getdetalleautoriconsepsEliminados() {
		return this.detalleautoriconsepsEliminados;
	}

	public void setDetalleAutoriConsepsEliminados(List<DetalleAutoriConsep> detalleautoriconsepsEliminados) {
		this.detalleautoriconsepsEliminados = detalleautoriconsepsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleAutoriConsep() {
		return jComboBoxTiposSeleccionarDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleAutoriConsep(
			JComboBox jComboBoxTiposSeleccionarDetalleAutoriConsep) {
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep = jComboBoxTiposSeleccionarDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleAutoriConsep() {
		return jTextFieldValorCampoGeneralDetalleAutoriConsep;
	}

	public void setjTextFieldValorCampoGeneralDetalleAutoriConsep(
			JTextField jTextFieldValorCampoGeneralDetalleAutoriConsep) {
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep = jTextFieldValorCampoGeneralDetalleAutoriConsep;
	}

	public void setBorderResaltarValorCampoGeneralDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleAutoriConsep() {
		return this.jCheckBoxSeleccionarTodosDetalleAutoriConsep;
	}

	public void setjCheckBoxSeleccionarTodosDetalleAutoriConsep(
			JCheckBox jCheckBoxSeleccionarTodosDetalleAutoriConsep) {
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep = jCheckBoxSeleccionarTodosDetalleAutoriConsep;
	}

	public void setBorderResaltarSeleccionarTodosDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleAutoriConsep() {
		return this.jCheckBoxSeleccionadosDetalleAutoriConsep;
	}

	public void setjCheckBoxSeleccionadosDetalleAutoriConsep(
			JCheckBox jCheckBoxSeleccionadosDetalleAutoriConsep) {
		this.jCheckBoxSeleccionadosDetalleAutoriConsep = jCheckBoxSeleccionadosDetalleAutoriConsep;
	}
	
	public void setBorderResaltarSeleccionadosDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleAutoriConsep() {
		return this.jComboBoxTiposArchivosReportesDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleAutoriConsep(
			JComboBox jComboBoxTiposArchivosReportesDetalleAutoriConsep) {
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep = jComboBoxTiposArchivosReportesDetalleAutoriConsep;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleAutoriConsep() {
		return this.jComboBoxTiposReportesDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleAutoriConsep(
			JComboBox jComboBoxTiposReportesDetalleAutoriConsep) {
		this.jComboBoxTiposReportesDetalleAutoriConsep = jComboBoxTiposReportesDetalleAutoriConsep;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleAutoriConsep() {
	//	return jComboBoxTiposReportesDinamicoDetalleAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleAutoriConsep(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleAutoriConsep) {
	//	this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep = jComboBoxTiposReportesDinamicoDetalleAutoriConsep;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep = jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep;
	//}
	
	public void setBorderResaltarTiposReportesDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleAutoriConsep() {
		return this.jComboBoxTiposGraficosReportesDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleAutoriConsep(
			JComboBox jComboBoxTiposGraficosReportesDetalleAutoriConsep) {
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep = jComboBoxTiposGraficosReportesDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleAutoriConsep() {
		return this.jComboBoxTiposPaginacionDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleAutoriConsep(
			JComboBox jComboBoxTiposPaginacionDetalleAutoriConsep) {
		this.jComboBoxTiposPaginacionDetalleAutoriConsep = jComboBoxTiposPaginacionDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleAutoriConsep() {
		return this.jComboBoxTiposRelacionesDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAutoriConsep(
			JComboBox jComboBoxTiposRelacionesDetalleAutoriConsep) {
		this.jComboBoxTiposRelacionesDetalleAutoriConsep = jComboBoxTiposRelacionesDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesDetalleAutoriConsep = jComboBoxTiposAccionesDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleAutoriConsep() {
	//	return jCheckBoxConGraficoDinamicoDetalleAutoriConsep;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleAutoriConsep(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleAutoriConsep) {
	//	this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep = jCheckBoxConGraficoDinamicoDetalleAutoriConsep;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleAutoriConsep() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleAutoriConsep.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep .setBorder(borderResaltar);		
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
		this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		
		this.detalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleautoriconsepSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriConsep= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"nuevo","nuevo","Nuevo"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"duplicar","duplicar","Duplicar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"copiar","copiar","Copiar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"ver_form","ver_form","Ver"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"recargar","recargar","Recargar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"cerrar","cerrar","Salir"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleAutoriConsep;
			
				this.jButtonProcesarInformacionToolBarDetalleAutoriConsep=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleAutoriConsep;
				
		//protected JButton jButtonModificarToolBarDetalleAutoriConsep;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleAutoriConsep=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleAutoriConsep=new JMenuMe("General");
		this.jmenuArchivoDetalleAutoriConsep=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDatosDetalleAutoriConsep=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleAutoriConsep= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleAutoriConsep.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleAutoriConsep,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleAutoriConsep= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleAutoriConsep.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleAutoriConsep,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleAutoriConsep= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleAutoriConsep.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleAutoriConsep,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleAutoriConsep= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleAutoriConsep.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleAutoriConsep,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleAutoriConsep= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleAutoriConsep.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleAutoriConsep,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleAutoriConsep= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleAutoriConsep.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleAutoriConsep,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleAutoriConsep= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleAutoriConsep.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleAutoriConsep,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleAutoriConsep= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleAutoriConsep.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleAutoriConsep,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleAutoriConsep.add(this.jMenuItemCerrarDetalleAutoriConsep);
			
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemNuevoDetalleAutoriConsep);
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep);
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemNuevoRelacionesDetalleAutoriConsep);
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep);		
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemDuplicarDetalleAutoriConsep);		
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemCopiarDetalleAutoriConsep);		
			this.jmenuAccionesDetalleAutoriConsep.add(this.jMenuItemVerFormDetalleAutoriConsep);		
			
			this.jmenuDatosDetalleAutoriConsep.add(this.jMenuItemRecargarInformacionDetalleAutoriConsep);				
			this.jmenuDatosDetalleAutoriConsep.add(this.jMenuItemAnterioresDetalleAutoriConsep);				
			this.jmenuDatosDetalleAutoriConsep.add(this.jMenuItemSiguientesDetalleAutoriConsep);				
			this.jmenuDatosDetalleAutoriConsep.add(this.jMenuItemAbrirOrderByDetalleAutoriConsep);				
			this.jmenuDatosDetalleAutoriConsep.add(this.jMenuItemMostrarOcultarDetalleAutoriConsep);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosDetalleAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAutoriConsep.add(this.jmenuArchivoDetalleAutoriConsep);		
			this.jmenuBarDetalleAutoriConsep.add(this.jmenuAccionesDetalleAutoriConsep);		
			this.jmenuBarDetalleAutoriConsep.add(this.jmenuDatosDetalleAutoriConsep);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleAutoriConsep);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleAutoriConsep() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAutoriConsepDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAutoriConsepDetalleAutoriConsep.setToolTipText("Buscar Por Autorizacion Consep ");
		this.jButtonFK_IdAutoriConsepDetalleAutoriConsep= new JButtonMe();
		this.jButtonFK_IdAutoriConsepDetalleAutoriConsep.setText("Buscar");
		this.jButtonFK_IdAutoriConsepDetalleAutoriConsep.setToolTipText("Buscar Por Autorizacion Consep ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAutoriConsepDetalleAutoriConsep,"buscar_button","Buscar Por Autorizacion Consep ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAutoriConsepDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep = new JLabelMe();
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setText("Autorizacion Consep :");
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setToolTipText("Autorizacion Consep");
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep = new JLabelMe();
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setText("Estado :");
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setToolTipText("Estado");
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleAutoriConsep.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleAutoriConsep= new JButtonMe();
		this.jButtonFK_IdProductoDetalleAutoriConsep.setText("Buscar");
		this.jButtonFK_IdProductoDetalleAutoriConsep.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleAutoriConsep,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleAutoriConsep = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleAutoriConsep.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleAutoriConsep.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleAutoriConsep.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleAutoriConsep= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleAutoriConsep.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleAutoriConsep.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleAutoriConsep,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleAutoriConsep=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleAutoriConsep = new DetalleAutoriConsepDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Autorizacion Consep DATOS");
			this.jInternalFrameDetalleFormDetalleAutoriConsep = new DetalleAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.detalleautoriconsepSessionBean.getConGuardarRelaciones(),this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleAutoriConsep = null;//new DetalleAutoriConsepDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleAutoriConsep= new GridBagLayout();
		
		
		this.jTableDatosDetalleAutoriConsep = new JTableMe();      
		
		String sToolTipDetalleAutoriConsep="";
		sToolTipDetalleAutoriConsep=DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAutoriConsep+="(Inventario.DetalleAutoriConsep)";
		}
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAutoriConsep+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleAutoriConsep.setToolTipText(sToolTipDetalleAutoriConsep);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleAutoriConsep);
		this.jTableDatosDetalleAutoriConsep.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleAutoriConsep.setRowSelectionAllowed(true);
		this.jTableDatosDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleAutoriConsep = new JButtonMe();
		this.jButtonDuplicarDetalleAutoriConsep = new JButtonMe();
		this.jButtonCopiarDetalleAutoriConsep = new JButtonMe();
		this.jButtonVerFormDetalleAutoriConsep = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleAutoriConsep = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarDetalleAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleAutoriConsep = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Autorizacion Consep";
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAutoriConsep.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleAutoriConsep=new ReporteDinamicoJInternalFrame(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleAutoriConsep();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleAutoriConsep=new ImportacionJInternalFrame(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleAutoriConsep();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleAutoriConsep = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleAutoriConsep.setText("Orden");
		this.jButtonAbrirOrderByDetalleAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAutoriConsep,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAutoriConsep,false,this);
			
			//this.cargarOrderByDetalleAutoriConsep(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAutoriConsep,true,this);
			
			//this.cargarOrderByDetalleAutoriConsep(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleAutoriConsep.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleAutoriConsep.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleAutoriConsep.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleAutoriConsep.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAutoriConsep.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAutoriConsep.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleAutoriConsep.setText("Nuevo");
		this.jButtonDuplicarDetalleAutoriConsep.setText("Duplicar");
		this.jButtonCopiarDetalleAutoriConsep.setText("Copiar");
		this.jButtonVerFormDetalleAutoriConsep.setText("Ver");
		this.jButtonNuevoRelacionesDetalleAutoriConsep.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setText("Guardar");
		this.jButtonCerrarDetalleAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAutoriConsep,"nuevo_button","Nuevo",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleAutoriConsep,"duplicar_button","Duplicar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleAutoriConsep,"copiar_button","Copiar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleAutoriConsep,"ver_form","Ver",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleAutoriConsep,"nuevorelaciones_button","Nuevo Rel",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAutoriConsep,"guardarcambiostabla_button","Guardar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAutoriConsep,"cerrar_button","Salir",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleAutoriConsep.setToolTipText("Nuevo"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleAutoriConsep.setToolTipText("Duplicar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleAutoriConsep.setToolTipText("Copiar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleAutoriConsep.setToolTipText("Ver"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleAutoriConsep.setToolTipText("Nuevo Rel"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setToolTipText("Guardar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAutoriConsep.setToolTipText("Salir"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAutoriConsep"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleAutoriConsep";
		inputMap = this.jButtonDuplicarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleAutoriConsep"));
		
		//COPIAR
		sMapKey = "CopiarDetalleAutoriConsep";
		inputMap = this.jButtonCopiarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleAutoriConsep"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleAutoriConsep";
		inputMap = this.jButtonVerFormDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleAutoriConsep"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleAutoriConsep"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleAutoriConsep";
		inputMap = this.jButtonModificarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleAutoriConsep"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleAutoriConsep";
		inputMap = this.jButtonCerrarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAutoriConsep"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleAutoriConsep.setName("jPanelParametrosReportesDetalleAutoriConsep"); 
		
		this.jPanelParametrosReportesAccionesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleAutoriConsep.setName("jPanelParametrosReportesAccionesDetalleAutoriConsep"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleAutoriConsep = new JButtonMe();
		this.jButtonRecargarInformacionDetalleAutoriConsep.setText("Recargar");
		this.jButtonRecargarInformacionDetalleAutoriConsep.setToolTipText("Recargar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleAutoriConsep,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleAutoriConsep = new JButtonMe();
		this.jButtonProcesarInformacionDetalleAutoriConsep.setText("Procesar");
		this.jButtonProcesarInformacionDetalleAutoriConsep.setToolTipText("Procesar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleAutoriConsep.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleAutoriConsep.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAutoriConsep.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAutoriConsep.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleAutoriConsep.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleAutoriConsep.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleAutoriConsep.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesDetalleAutoriConsep.setText("Acciones");		
		this.jLabelAccionesDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleAutoriConsep.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleAutoriConsep.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleAutoriConsep = new JButtonMe();
		//this.jButtonAnterioresDetalleAutoriConsep.setText("<<");
        this.jButtonAnterioresDetalleAutoriConsep.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleAutoriConsep,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleAutoriConsep = new JButtonMe();
		//this.jButtonSiguientesDetalleAutoriConsep.setText(">>");
        this.jButtonSiguientesDetalleAutoriConsep.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleAutoriConsep,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleAutoriConsep = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleAutoriConsep,"nuevoguardarcambios_button","Nue",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleAutoriConsep";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleAutoriConsep"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleAutoriConsep";
		inputMap = this.jButtonRecargarInformacionDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleAutoriConsep"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleAutoriConsep";
		inputMap = this.jButtonSiguientesDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleAutoriConsep"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleAutoriConsep";
		inputMap = this.jButtonAnterioresDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleAutoriConsep"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleAutoriConsep();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleAutoriConsep = new GridBagLayout();

			this.jPanelPaginacionDetalleAutoriConsep.setLayout(gridaBagLayoutPaginacionDetalleAutoriConsep);						
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonAnterioresDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					
						
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
			
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonNuevoGuardarCambiosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
						
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonSiguientesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonNuevoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
						
			
			
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
				this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonGuardarCambiosTablaDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			}
			
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonDuplicarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonCopiarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonVerFormDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleAutoriConsep.add(this.jButtonCerrarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		
		this.jButtonRecargarInformacionDetalleAutoriConsep.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAutoriConsep.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAutoriConsep.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleAutoriConsep.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAutoriConsep.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAutoriConsep.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleAutoriConsep = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleAutoriConsep = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleAutoriConsep.setLayout(gridaBagParametrosReportesDetalleAutoriConsep);
			this.jPanelParametrosReportesAccionesDetalleAutoriConsep.setLayout(gridaBagParametrosReportesAccionesDetalleAutoriConsep);
			
			
			this.jPanelParametrosAuxiliar1DetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar1DetalleAutoriConsep);
			this.jPanelParametrosAuxiliar2DetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar2DetalleAutoriConsep);
			this.jPanelParametrosAuxiliar3DetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar3DetalleAutoriConsep);
			this.jPanelParametrosAuxiliar4DetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar4DetalleAutoriConsep);
			//this.jPanelParametrosAuxiliar5DetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar2DetalleAutoriConsep);			
			
			
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jButtonRecargarInformacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAutoriConsep.add(this.jComboBoxTiposPaginacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAutoriConsep.add(this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAutoriConsep.add(this.jComboBoxTiposArchivosReportesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar1DetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleAutoriConsep.add(this.jComboBoxTiposReportesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);																		
			
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleAutoriConsep.add(this.jComboBoxTiposGraficosReportesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar4DetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jComboBoxTiposReportesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jCheckBoxGenerarReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar2DetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jLabelAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jButtonAbrirOrderByDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jComboBoxTiposSeleccionarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			
			
			/*
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jCheckBoxSeleccionarTodosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jCheckBoxConGraficoReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAutoriConsep.add(this.jCheckBoxSeleccionarTodosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);															
				
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAutoriConsep.add(this.jCheckBoxSeleccionadosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);															
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAutoriConsep.add(this.jCheckBoxConGraficoReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar3DetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jComboBoxTiposAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
	
				
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAutoriConsep.add(this.jTextFieldValorCampoGeneralDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleAutoriConsep = new GridBagLayout();

			this.jScrollPanelDatosDetalleAutoriConsep.setLayout(gridaBagLayoutDatosDetalleAutoriConsep);
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
			
			this.jScrollPanelDatosDetalleAutoriConsep.add(this.jTableDatosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleAutoriConsep.setViewportView(this.jTableDatosDetalleAutoriConsep);
		this.jTableDatosDetalleAutoriConsep.setFillsViewportHeight(true);
		this.jTableDatosDetalleAutoriConsep.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesDetalleAutoriConsep);
		
		
		/*	
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
			
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonNuevoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAutoriConsepDetalleAutoriConsep.setLayout(gridaBagLayoutFK_IdAutoriConsepDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		jPanelFK_IdAutoriConsepDetalleAutoriConsep.add(jLabelid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 1;
		jPanelFK_IdAutoriConsepDetalleAutoriConsep.add(jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 1;
		gridBagConstraintsDetalleAutoriConsep.gridx =1;
		jPanelFK_IdAutoriConsepDetalleAutoriConsep.add(jButtonFK_IdAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		jTabbedPaneBusquedasDetalleAutoriConsep.addTab("1.-Por Autorizacion Consep ", jPanelFK_IdAutoriConsepDetalleAutoriConsep);
		jTabbedPaneBusquedasDetalleAutoriConsep.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setLayout(gridaBagLayoutFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.add(jLabelid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 1;
		jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.add(jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 1;
		gridBagConstraintsDetalleAutoriConsep.gridx =1;
		jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.add(jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		jTabbedPaneBusquedasDetalleAutoriConsep.addTab("2.-Por Estado ", jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
		jTabbedPaneBusquedasDetalleAutoriConsep.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleAutoriConsep.setLayout(gridaBagLayoutFK_IdProductoDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		jPanelFK_IdProductoDetalleAutoriConsep.add(jLabelid_productoFK_IdProductoDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 1;
		jPanelFK_IdProductoDetalleAutoriConsep.add(jComboBoxid_productoFK_IdProductoDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);


		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		jPanelFK_IdProductoDetalleAutoriConsep.add(this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 1;
		gridBagConstraintsDetalleAutoriConsep.gridx =1;
		jPanelFK_IdProductoDetalleAutoriConsep.add(jButtonFK_IdProductoDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		jTabbedPaneBusquedasDetalleAutoriConsep.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleAutoriConsep);
		jTabbedPaneBusquedasDetalleAutoriConsep.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleAutoriConsep.setLayout(gridaBagLayoutFK_IdUnidadDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		jPanelFK_IdUnidadDetalleAutoriConsep.add(jLabelid_unidadFK_IdUnidadDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		gridBagConstraintsDetalleAutoriConsep.gridx = 1;
		jPanelFK_IdUnidadDetalleAutoriConsep.add(jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAutoriConsep.gridy = 1;
		gridBagConstraintsDetalleAutoriConsep.gridx =1;
		jPanelFK_IdUnidadDetalleAutoriConsep.add(jButtonFK_IdUnidadDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);

		jTabbedPaneBusquedasDetalleAutoriConsep.addTab("4.-Por Unidad ", jPanelFK_IdUnidadDetalleAutoriConsep);
		jTabbedPaneBusquedasDetalleAutoriConsep.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAutoriConsep);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAutoriConsep.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;		
		//this.gridBagConstraintsDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleAutoriConsep);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;		
			this.gridBagConstraintsDetalleAutoriConsep.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleAutoriConsep.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);								
		
		
		/*
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		*/		
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAutoriConsep.gridx =0;
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
				
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAutoriConsep = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleAutoriConsep.setLayout(gridaBagLayoutBusquedasParametrosDetalleAutoriConsep);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleAutoriConsep;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleAutoriConsep() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleAutoriConsep.setName("jPanelReporteDinamicoDetalleAutoriConsep"); 
		
		this.jPanelReporteDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleAutoriConsep.setLayout(gridaBagLayoutReporteDinamicoDetalleAutoriConsep);
		
		
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleAutoriConsep = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleAutoriConsep.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelColumnasSelectReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleAutoriConsep = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleAutoriConsep=new JScrollPane(this.jListColumnasSelectReporteDetalleAutoriConsep);
			
			this.jScrollColumnasSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jListColumnasSelectReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jScrollColumnasSelectReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleAutoriConsep = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleAutoriConsep.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleAutoriConsep = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleAutoriConsep=new JScrollPane(this.jListRelacionesSelectReporteDetalleAutoriConsep);
			
			this.jScrollRelacionesSelectReporteDetalleAutoriConsep.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAutoriConsep.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAutoriConsep.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleAutoriConsep = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleAutoriConsep = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleAutoriConsep.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelConGraficoDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jCheckBoxConGraficoDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelColumnaCategoriaGraficoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleAutoriConsep = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleAutoriConsep.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelColumnaCategoriaValorDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jComboBoxColumnaCategoriaValorDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleAutoriConsep = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleAutoriConsep.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelColumnasValoresGraficoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleAutoriConsep = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleAutoriConsep.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleAutoriConsep=new JScrollPane(this.jListColumnasValoresGraficoDetalleAutoriConsep);
			
			this.jScrollColumnasValoresGraficoDetalleAutoriConsep.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAutoriConsep.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAutoriConsep.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jListColumnasSelectReporteDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jScrollColumnasValoresGraficoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelTiposGraficosReportesDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAutoriConsep.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelGenerarExcelReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep.setToolTipText("Generar EXCEL"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jComboBoxTiposReportesDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jLabelTiposArchivoReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleAutoriConsep.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleAutoriConsep,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleAutoriConsep.setToolTipText("Generar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jButtonGenerarReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleAutoriConsep.setToolTipText("Cancelar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAutoriConsep.add(this.jButtonCerrarReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep= new JScrollPane(jPanelReporteDinamicoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleAutoriConsep);
		this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleAutoriConsep() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleAutoriConsep.setName("jPanelImportacionDetalleAutoriConsep"); 
		
		this.jPanelImportacionDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleAutoriConsep.setLayout(gridaBagLayoutImportacionDetalleAutoriConsep);
		
		
		this.jInternalFrameImportacionDetalleAutoriConsep= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleAutoriConsep= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAutoriConsep.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionDetalleAutoriConsep.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleAutoriConsep = new JLabelMe();

		this.jLabelArchivoImportacionDetalleAutoriConsep.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAutoriConsep.add(this.jLabelArchivoImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleAutoriConsep = new JFileChooser();		
		this.jFileChooserImportacionDetalleAutoriConsep.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleAutoriConsep = new JButtonMe();
		this.jButtonAbrirImportacionDetalleAutoriConsep.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleAutoriConsep,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleAutoriConsep.setToolTipText("Generar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAutoriConsep.add(this.jButtonAbrirImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleAutoriConsep = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleAutoriConsep.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAutoriConsep.add(this.jLabelPathArchivoImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleAutoriConsep=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleAutoriConsep.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAutoriConsep.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAutoriConsep.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAutoriConsep.add(this.jTextFieldPathArchivoImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarImportacionDetalleAutoriConsep.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleAutoriConsep,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleAutoriConsep.setToolTipText("Generar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAutoriConsep.add(this.jButtonGenerarImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarImportacionDetalleAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleAutoriConsep.setToolTipText("Cancelar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAutoriConsep.add(this.jButtonCerrarImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleAutoriConsep= new JScrollPane(jPanelImportacionDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleAutoriConsep);
		this.jInternalFrameImportacionDetalleAutoriConsep.getContentPane().add(this.jScrollPanelImportacionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleAutoriConsep(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleAutoriConsep = new JButtonMe();
			this.jButtonAbrirOrderByDetalleAutoriConsep.setText("Orden");
			this.jButtonAbrirOrderByDetalleAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAutoriConsep,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleAutoriConsep";
			inputMap = this.jButtonAbrirOrderByDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleAutoriConsep"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleAutoriConsep = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleAutoriConsep.setName("jPanelOrderByDetalleAutoriConsep"); 
			
			this.jPanelOrderByDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleAutoriConsep.setLayout(gridaBagLayoutOrderByDetalleAutoriConsep);
			
			
			this.jTableDatosDetalleAutoriConsepOrderBy = new JTableMe();        
			this.jTableDatosDetalleAutoriConsepOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleAutoriConsepOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleAutoriConsepOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleAutoriConsepOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleAutoriConsepOrderBy.setViewportView(this.jTableDatosDetalleAutoriConsepOrderBy);
			this.jTableDatosDetalleAutoriConsepOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleAutoriConsepOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleAutoriConsep= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleAutoriConsep= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleAutoriConsep = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleAutoriConsep= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleAutoriConsep.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleAutoriConsep.setTitle("Orden");
			this.jInternalFrameOrderByDetalleAutoriConsep.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleAutoriConsep.setResizable(true);
			this.jInternalFrameOrderByDetalleAutoriConsep.setClosable(true);
			this.jInternalFrameOrderByDetalleAutoriConsep.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleAutoriConsep.ipady =150;
				
			this.jPanelOrderByDetalleAutoriConsep.add(jScrollPanelDatosDetalleAutoriConsepOrderBy, this.gridBagConstraintsDetalleAutoriConsep);//this.jTableDatosDetalleAutoriConsepTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleAutoriConsep = new JButtonMe();
			this.jButtonCerrarOrderByDetalleAutoriConsep.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleAutoriConsep,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleAutoriConsep.setToolTipText("Cancelar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleAutoriConsep.add(this.jButtonCerrarOrderByDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleAutoriConsep = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleAutoriConsep= new JScrollPane(jPanelOrderByDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleAutoriConsep);
			
			this.jInternalFrameOrderByDetalleAutoriConsep.getContentPane().add(this.jScrollPanelOrderByDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
		
		} else {
			this.jButtonAbrirOrderByDetalleAutoriConsep = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleautoriconsepSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleAutoriConsep.getRowHeight();//DetalleAutoriConsepConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.isSelected()) {
					iHeightTable=DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAutoriConsep.isSelected()) {
					iHeightTable=DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleAutoriConsep!=null && this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleautoriconsepLogic.getDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleautoriconseps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleAutoriConsep> TraerDetalleAutoriConsepBeans(List<DetalleAutoriConsep> detalleautoriconseps,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconseps) {
					
				if(!(DetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleautoriconsep.setsDetalleGeneralEntityReporte(DetalleAutoriConsepConstantesFunciones.getDetalleAutoriConsepDescripcion(detalleautoriconsep));
										
						
					
						
					
				} else  {
							
					//detalleautoriconsep.setsDetalleGeneralEntityReporte(detalleautoriconsep.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleautoriconsepbeans.add(detalleautoriconsepbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleautoriconseps;
    }
	//PARA REPORTES FIN
}
