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
import com.bydan.erp.inventario.util.DetalleImpuestoInvenConstantesFunciones;

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
public class DetalleImpuestoInvenJInternalFrame extends DetalleImpuestoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleImpuestoInven;
	
	protected JMenuBar jmenuBarDetalleImpuestoInven;
	
	protected JMenu jmenuDetalleImpuestoInven;
	protected JMenu jmenuDatosDetalleImpuestoInven;
	protected JMenu jmenuArchivoDetalleImpuestoInven;
	protected JMenu jmenuAccionesDetalleImpuestoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleImpuestoInven;	
	protected GridBagConstraints gridBagConstraintsDetalleImpuestoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleImpuestoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleImpuestoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleImpuestoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_impuestoinven="";
	
	public DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleImpuestoInven> detalleimpuestoinvens;		
	public List<DetalleImpuestoInven> detalleimpuestoinvensEliminados;	
	public List<DetalleImpuestoInven> detalleimpuestoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleImpuestoInven;		
	protected JButton jButtonAbrirOrderByDetalleImpuestoInven;
	
	
	//protected JPanel jPanelOrderByDetalleImpuestoInven;
	//public JScrollPane jScrollPanelOrderByDetalleImpuestoInven;	
	//protected JButton jButtonCerrarOrderByDetalleImpuestoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleImpuestoInvenLogic detalleimpuestoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleImpuestoInven;
	public JScrollPane jScrollPanelDatosEdicionDetalleImpuestoInven;
	public JScrollPane jScrollPanelDatosGeneralDetalleImpuestoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleImpuestoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleImpuestoInven;
	//public JScrollPane jScrollPanelImportacionDetalleImpuestoInven;
	
	
	
	protected JPanel jPanelAccionesDetalleImpuestoInven;
	
    protected JPanel jPanelPaginacionDetalleImpuestoInven;
    protected JPanel jPanelParametrosReportesDetalleImpuestoInven;
	protected JPanel jPanelParametrosReportesAccionesDetalleImpuestoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar2DetalleImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar3DetalleImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar4DetalleImpuestoInven;
	//protected JPanel jPanelParametrosAuxiliar5DetalleImpuestoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleImpuestoInven;
	//protected JPanel jPanelImportacionDetalleImpuestoInven;
	
	
	public JTable jTableDatosDetalleImpuestoInven;
	
	
	
	//public JTable jTableDatosDetalleImpuestoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleImpuestoInven;
	protected JButton jButtonDuplicarDetalleImpuestoInven;
	protected JButton jButtonCopiarDetalleImpuestoInven;
	protected JButton jButtonVerFormDetalleImpuestoInven;
	protected JButton jButtonNuevoRelacionesDetalleImpuestoInven;
	protected JButton jButtonModificarDetalleImpuestoInven;
	
    protected JButton jButtonGuardarCambiosTablaDetalleImpuestoInven;
	protected JButton jButtonCerrarDetalleImpuestoInven;
	
	
	protected JButton jButtonRecargarInformacionDetalleImpuestoInven;
	protected JButton jButtonProcesarInformacionDetalleImpuestoInven;
	
	
	protected JButton jButtonAnterioresDetalleImpuestoInven;
	protected JButton jButtonSiguientesDetalleImpuestoInven;
	protected JButton jButtonNuevoGuardarCambiosDetalleImpuestoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleImpuestoInven;
	//protected JButton jButtonCerrarReporteDinamicoDetalleImpuestoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleImpuestoInven;
	//protected JButton jButtonGenerarImportacionDetalleImpuestoInven;
	//protected JButton jButtonCerrarImportacionDetalleImpuestoInven;
	//protected JFileChooser jFileChooserImportacionDetalleImpuestoInven;
	//protected File fileImportacionDetalleImpuestoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleImpuestoInven;
	protected JButton jButtonDuplicarToolBarDetalleImpuestoInven;
	protected JButton jButtonNuevoRelacionesToolBarDetalleImpuestoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleImpuestoInven;
	protected JButton jButtonCopiarToolBarDetalleImpuestoInven;
	protected JButton jButtonVerFormToolBarDetalleImpuestoInven;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleImpuestoInven;
	protected JButton jButtonCerrarToolBarDetalleImpuestoInven;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleImpuestoInven;
	protected JButton jButtonProcesarInformacionToolBarDetalleImpuestoInven;
	protected JButton jButtonAnterioresToolBarDetalleImpuestoInven;
	protected JButton jButtonSiguientesToolBarDetalleImpuestoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven;
	protected JButton jButtonAbrirOrderByToolBarDetalleImpuestoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleImpuestoInven;
	protected JMenuItem jMenuItemDuplicarDetalleImpuestoInven;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleImpuestoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleImpuestoInven;
	protected JMenuItem jMenuItemCopiarDetalleImpuestoInven;
	protected JMenuItem jMenuItemVerFormDetalleImpuestoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleImpuestoInven;
	protected JMenuItem jMenuItemCerrarDetalleImpuestoInven;
	protected JMenuItem jMenuItemDetalleCerrarDetalleImpuestoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleImpuestoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleImpuestoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleImpuestoInven;
	protected JMenuItem jMenuItemProcesarInformacionDetalleImpuestoInven;
	protected JMenuItem jMenuItemAnterioresDetalleImpuestoInven;
	protected JMenuItem jMenuItemSiguientesDetalleImpuestoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleImpuestoInven;
	protected JMenuItem jMenuItemAbrirOrderByDetalleImpuestoInven;
	protected JMenuItem jMenuItemMostrarOcultarDetalleImpuestoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleImpuestoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleImpuestoInven;
	protected JCheckBox jCheckBoxSeleccionadosDetalleImpuestoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleImpuestoInven;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleImpuestoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleImpuestoInven;
	protected JTextField jTextFieldValorCampoGeneralDetalleImpuestoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleImpuestoInven;
	//public JList<Reporte> jListColumnasSelectReporteDetalleImpuestoInven;
	//public JScrollPane jScrollColumnasSelectReporteDetalleImpuestoInven;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleImpuestoInven;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleImpuestoInven;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleImpuestoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleImpuestoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleImpuestoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven;
	
		
	//public JLabel jLabelArchivoImportacionDetalleImpuestoInven;	
	//public JLabel jLabelPathArchivoImportacionDetalleImpuestoInven;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleImpuestoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleImpuestoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleImpuestoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleImpuestoInven;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleImpuestoInven;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleImpuestoInven;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleImpuestoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleImpuestoInven;
	public JPanel jPanelFK_IdBodegaDetalleImpuestoInven;
	public JButton jButtonFK_IdBodegaDetalleImpuestoInven;
	public JPanel jPanelFK_IdImpuestoInvenDetalleImpuestoInven;
	public JButton jButtonFK_IdImpuestoInvenDetalleImpuestoInven;
	public JPanel jPanelFK_IdProductoDetalleImpuestoInven;
	public JButton jButtonFK_IdProductoDetalleImpuestoInven;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleImpuestoInven;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleImpuestoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven;
	public JLabel jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven;
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleImpuestoInven;
	public JLabel jLabelid_productoFK_IdProductoDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleImpuestoInven;
	public JButton jButtonid_productoFK_IdProductoDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven;
	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleImpuestoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleImpuestoInven)	{
		this.jButtonRecargarInformacionDetalleImpuestoInven = jButtonRecargarInformacionDetalleImpuestoInven;
	}
	
	public JButton getjButtonProcesarInformacionDetalleImpuestoInven() {
		return this.jButtonProcesarInformacionDetalleImpuestoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleImpuestoInven)	{
		this.jButtonProcesarInformacionDetalleImpuestoInven = jButtonProcesarInformacionDetalleImpuestoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleImpuestoInven() {
		return this.jButtonRecargarInformacionDetalleImpuestoInven;
	}
	
	
	public List<DetalleImpuestoInven> getdetalleimpuestoinvens() {
		return this.detalleimpuestoinvens;
	}

	public void setdetalleimpuestoinvens(List<DetalleImpuestoInven> detalleimpuestoinvens) {
		this.detalleimpuestoinvens = detalleimpuestoinvens;
	}
	
	public List<DetalleImpuestoInven> getdetalleimpuestoinvensAux() {
		return this.detalleimpuestoinvensAux;
	}

	public void setdetalleimpuestoinvensAux(List<DetalleImpuestoInven> detalleimpuestoinvensAux) {
		this.detalleimpuestoinvensAux = detalleimpuestoinvensAux;
	}
	
	public List<DetalleImpuestoInven> getdetalleimpuestoinvensEliminados() {
		return this.detalleimpuestoinvensEliminados;
	}

	public void setDetalleImpuestoInvensEliminados(List<DetalleImpuestoInven> detalleimpuestoinvensEliminados) {
		this.detalleimpuestoinvensEliminados = detalleimpuestoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleImpuestoInven() {
		return jComboBoxTiposSeleccionarDetalleImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleImpuestoInven(
			JComboBox jComboBoxTiposSeleccionarDetalleImpuestoInven) {
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven = jComboBoxTiposSeleccionarDetalleImpuestoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleImpuestoInven() {
		return jTextFieldValorCampoGeneralDetalleImpuestoInven;
	}

	public void setjTextFieldValorCampoGeneralDetalleImpuestoInven(
			JTextField jTextFieldValorCampoGeneralDetalleImpuestoInven) {
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven = jTextFieldValorCampoGeneralDetalleImpuestoInven;
	}

	public void setBorderResaltarValorCampoGeneralDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleImpuestoInven() {
		return this.jCheckBoxSeleccionarTodosDetalleImpuestoInven;
	}

	public void setjCheckBoxSeleccionarTodosDetalleImpuestoInven(
			JCheckBox jCheckBoxSeleccionarTodosDetalleImpuestoInven) {
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven = jCheckBoxSeleccionarTodosDetalleImpuestoInven;
	}

	public void setBorderResaltarSeleccionarTodosDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleImpuestoInven() {
		return this.jCheckBoxSeleccionadosDetalleImpuestoInven;
	}

	public void setjCheckBoxSeleccionadosDetalleImpuestoInven(
			JCheckBox jCheckBoxSeleccionadosDetalleImpuestoInven) {
		this.jCheckBoxSeleccionadosDetalleImpuestoInven = jCheckBoxSeleccionadosDetalleImpuestoInven;
	}
	
	public void setBorderResaltarSeleccionadosDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleImpuestoInven() {
		return this.jComboBoxTiposArchivosReportesDetalleImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleImpuestoInven(
			JComboBox jComboBoxTiposArchivosReportesDetalleImpuestoInven) {
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven = jComboBoxTiposArchivosReportesDetalleImpuestoInven;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleImpuestoInven() {
		return this.jComboBoxTiposReportesDetalleImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleImpuestoInven(
			JComboBox jComboBoxTiposReportesDetalleImpuestoInven) {
		this.jComboBoxTiposReportesDetalleImpuestoInven = jComboBoxTiposReportesDetalleImpuestoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleImpuestoInven() {
	//	return jComboBoxTiposReportesDinamicoDetalleImpuestoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleImpuestoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleImpuestoInven) {
	//	this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven = jComboBoxTiposReportesDinamicoDetalleImpuestoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven = jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven;
	//}
	
	public void setBorderResaltarTiposReportesDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleImpuestoInven() {
		return this.jComboBoxTiposGraficosReportesDetalleImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleImpuestoInven(
			JComboBox jComboBoxTiposGraficosReportesDetalleImpuestoInven) {
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven = jComboBoxTiposGraficosReportesDetalleImpuestoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleImpuestoInven() {
		return this.jComboBoxTiposPaginacionDetalleImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleImpuestoInven(
			JComboBox jComboBoxTiposPaginacionDetalleImpuestoInven) {
		this.jComboBoxTiposPaginacionDetalleImpuestoInven = jComboBoxTiposPaginacionDetalleImpuestoInven;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleImpuestoInven() {
		return this.jComboBoxTiposRelacionesDetalleImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleImpuestoInven() {
		return this.jComboBoxTiposAccionesDetalleImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleImpuestoInven(
			JComboBox jComboBoxTiposRelacionesDetalleImpuestoInven) {
		this.jComboBoxTiposRelacionesDetalleImpuestoInven = jComboBoxTiposRelacionesDetalleImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleImpuestoInven(
			JComboBox jComboBoxTiposAccionesDetalleImpuestoInven) {
		this.jComboBoxTiposAccionesDetalleImpuestoInven = jComboBoxTiposAccionesDetalleImpuestoInven;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleImpuestoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleImpuestoInven() {
	//	return jCheckBoxConGraficoDinamicoDetalleImpuestoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleImpuestoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleImpuestoInven) {
	//	this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven = jCheckBoxConGraficoDinamicoDetalleImpuestoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleImpuestoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleImpuestoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven .setBorder(borderResaltar);		
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
		this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		
		this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleImpuestoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Impuesto Inven MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleImpuestoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"nuevo","nuevo","Nuevo"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"duplicar","duplicar","Duplicar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"copiar","copiar","Copiar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"ver_form","ver_form","Ver"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"recargar","recargar","Recargar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"cerrar","cerrar","Salir"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleImpuestoInven;
			
				this.jButtonProcesarInformacionToolBarDetalleImpuestoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleImpuestoInven;
				
		//protected JButton jButtonModificarToolBarDetalleImpuestoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleImpuestoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleImpuestoInven=new JMenuMe("General");
		this.jmenuArchivoDetalleImpuestoInven=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleImpuestoInven=new JMenuMe("Acciones");
		this.jmenuDatosDetalleImpuestoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleImpuestoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleImpuestoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleImpuestoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleImpuestoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleImpuestoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleImpuestoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleImpuestoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleImpuestoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleImpuestoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleImpuestoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleImpuestoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleImpuestoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleImpuestoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleImpuestoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleImpuestoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleImpuestoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleImpuestoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleImpuestoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleImpuestoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleImpuestoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleImpuestoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleImpuestoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleImpuestoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleImpuestoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleImpuestoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleImpuestoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleImpuestoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleImpuestoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleImpuestoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleImpuestoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleImpuestoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleImpuestoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleImpuestoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleImpuestoInven.add(this.jMenuItemCerrarDetalleImpuestoInven);
			
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemNuevoDetalleImpuestoInven);
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven);
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemNuevoRelacionesDetalleImpuestoInven);
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven);		
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemDuplicarDetalleImpuestoInven);		
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemCopiarDetalleImpuestoInven);		
			this.jmenuAccionesDetalleImpuestoInven.add(this.jMenuItemVerFormDetalleImpuestoInven);		
			
			this.jmenuDatosDetalleImpuestoInven.add(this.jMenuItemRecargarInformacionDetalleImpuestoInven);				
			this.jmenuDatosDetalleImpuestoInven.add(this.jMenuItemAnterioresDetalleImpuestoInven);				
			this.jmenuDatosDetalleImpuestoInven.add(this.jMenuItemSiguientesDetalleImpuestoInven);				
			this.jmenuDatosDetalleImpuestoInven.add(this.jMenuItemAbrirOrderByDetalleImpuestoInven);				
			this.jmenuDatosDetalleImpuestoInven.add(this.jMenuItemMostrarOcultarDetalleImpuestoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleImpuestoInven.add(this.jMenuItemGuardarCambiosDetalleImpuestoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleImpuestoInven.add(this.jmenuArchivoDetalleImpuestoInven);		
			this.jmenuBarDetalleImpuestoInven.add(this.jmenuAccionesDetalleImpuestoInven);		
			this.jmenuBarDetalleImpuestoInven.add(this.jmenuDatosDetalleImpuestoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleImpuestoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleImpuestoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleImpuestoInven.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleImpuestoInven= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleImpuestoInven.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleImpuestoInven.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleImpuestoInven,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven.setToolTipText("Buscar Por Impuesto Inven ");
		this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven= new JButtonMe();
		this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven.setText("Buscar");
		this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven.setToolTipText("Buscar Por Impuesto Inven ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven,"buscar_button","Buscar Por Impuesto Inven ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven = new JLabelMe();
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setText("Impuesto Inven :");
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setToolTipText("Impuesto Inven");
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleImpuestoInven.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleImpuestoInven= new JButtonMe();
		this.jButtonFK_IdProductoDetalleImpuestoInven.setText("Buscar");
		this.jButtonFK_IdProductoDetalleImpuestoInven.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleImpuestoInven,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleImpuestoInven = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleImpuestoInven.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleImpuestoInven.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.setFocusable(false);


		this.jTabbedPaneBusquedasDetalleImpuestoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleImpuestoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleImpuestoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleImpuestoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleImpuestoInven = new DetalleImpuestoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Impuesto Inven DATOS");
			this.jInternalFrameDetalleFormDetalleImpuestoInven = new DetalleImpuestoInvenDetalleFormJInternalFrame(jDesktopPane,this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleImpuestoInven = null;//new DetalleImpuestoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleImpuestoInven= new GridBagLayout();
		
		
		this.jTableDatosDetalleImpuestoInven = new JTableMe();      
		
		String sToolTipDetalleImpuestoInven="";
		sToolTipDetalleImpuestoInven=DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleImpuestoInven+="(Inventario.DetalleImpuestoInven)";
		}
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleImpuestoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleImpuestoInven.setToolTipText(sToolTipDetalleImpuestoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleImpuestoInven);
		this.jTableDatosDetalleImpuestoInven.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleImpuestoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleImpuestoInven.setRowSelectionAllowed(true);
		this.jTableDatosDetalleImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleImpuestoInven = new JButtonMe();
		this.jButtonDuplicarDetalleImpuestoInven = new JButtonMe();
		this.jButtonCopiarDetalleImpuestoInven = new JButtonMe();
		this.jButtonVerFormDetalleImpuestoInven = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleImpuestoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven = new JButtonMe();
		this.jButtonCerrarDetalleImpuestoInven = new JButtonMe();
		
		this.jScrollPanelDatosDetalleImpuestoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleImpuestoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Impuesto Inven";
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesDetalleImpuestoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleImpuestoInven=new ReporteDinamicoJInternalFrame(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleImpuestoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleImpuestoInven=new ImportacionJInternalFrame(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleImpuestoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleImpuestoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleImpuestoInven.setText("Orden");
		this.jButtonAbrirOrderByDetalleImpuestoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleImpuestoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleImpuestoInven,false,this);
			
			//this.cargarOrderByDetalleImpuestoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleImpuestoInven,true,this);
			
			//this.cargarOrderByDetalleImpuestoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleImpuestoInven.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleImpuestoInven.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleImpuestoInven.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleImpuestoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleImpuestoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleImpuestoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleImpuestoInven.setText("Nuevo");
		this.jButtonDuplicarDetalleImpuestoInven.setText("Duplicar");
		this.jButtonCopiarDetalleImpuestoInven.setText("Copiar");
		this.jButtonVerFormDetalleImpuestoInven.setText("Ver");
		this.jButtonNuevoRelacionesDetalleImpuestoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setText("Guardar");
		this.jButtonCerrarDetalleImpuestoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleImpuestoInven,"nuevo_button","Nuevo",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleImpuestoInven,"duplicar_button","Duplicar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleImpuestoInven,"copiar_button","Copiar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleImpuestoInven,"ver_form","Ver",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleImpuestoInven,"nuevorelaciones_button","Nuevo Rel",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleImpuestoInven,"guardarcambiostabla_button","Guardar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleImpuestoInven,"cerrar_button","Salir",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleImpuestoInven.setToolTipText("Nuevo"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleImpuestoInven.setToolTipText("Duplicar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleImpuestoInven.setToolTipText("Copiar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleImpuestoInven.setToolTipText("Ver"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleImpuestoInven.setToolTipText("Nuevo Rel"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setToolTipText("Guardar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleImpuestoInven.setToolTipText("Salir"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleImpuestoInven";
		inputMap = this.jButtonNuevoDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleImpuestoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleImpuestoInven";
		inputMap = this.jButtonDuplicarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleImpuestoInven"));
		
		//COPIAR
		sMapKey = "CopiarDetalleImpuestoInven";
		inputMap = this.jButtonCopiarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleImpuestoInven"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleImpuestoInven";
		inputMap = this.jButtonVerFormDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleImpuestoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleImpuestoInven";
		inputMap = this.jButtonNuevoRelacionesDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleImpuestoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleImpuestoInven";
		inputMap = this.jButtonModificarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleImpuestoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleImpuestoInven";
		inputMap = this.jButtonCerrarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleImpuestoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleImpuestoInven";
		inputMap = this.jButtonGuardarCambiosTablaDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleImpuestoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleImpuestoInven.setName("jPanelParametrosReportesDetalleImpuestoInven"); 
		
		this.jPanelParametrosReportesAccionesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleImpuestoInven.setName("jPanelParametrosReportesAccionesDetalleImpuestoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleImpuestoInven = new JButtonMe();
		this.jButtonRecargarInformacionDetalleImpuestoInven.setText("Recargar");
		this.jButtonRecargarInformacionDetalleImpuestoInven.setToolTipText("Recargar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleImpuestoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleImpuestoInven = new JButtonMe();
		this.jButtonProcesarInformacionDetalleImpuestoInven.setText("Procesar");
		this.jButtonProcesarInformacionDetalleImpuestoInven.setToolTipText("Procesar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleImpuestoInven.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleImpuestoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleImpuestoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleImpuestoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleImpuestoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleImpuestoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleImpuestoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleImpuestoInven.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleImpuestoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleImpuestoInven.setText("Accion");
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleImpuestoInven = new JLabelMe();
		
		this.jLabelAccionesDetalleImpuestoInven.setText("Acciones");		
		this.jLabelAccionesDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleImpuestoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleImpuestoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleImpuestoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleImpuestoInven = new JButtonMe();
		//this.jButtonAnterioresDetalleImpuestoInven.setText("<<");
        this.jButtonAnterioresDetalleImpuestoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleImpuestoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleImpuestoInven = new JButtonMe();
		//this.jButtonSiguientesDetalleImpuestoInven.setText(">>");
        this.jButtonSiguientesDetalleImpuestoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleImpuestoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleImpuestoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleImpuestoInven,"nuevoguardarcambios_button","Nue",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleImpuestoInven";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleImpuestoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleImpuestoInven";
		inputMap = this.jButtonRecargarInformacionDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleImpuestoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleImpuestoInven";
		inputMap = this.jButtonSiguientesDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleImpuestoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleImpuestoInven";
		inputMap = this.jButtonAnterioresDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleImpuestoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleImpuestoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleImpuestoInven.setMinimumSize(new Dimension(this.getWidth(),DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleImpuestoInven.setMaximumSize(new Dimension(this.getWidth(),DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleImpuestoInven.setPreferredSize(new Dimension(this.getWidth(),DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleImpuestoInven = new GridBagLayout();

			this.jPanelPaginacionDetalleImpuestoInven.setLayout(gridaBagLayoutPaginacionDetalleImpuestoInven);						
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonAnterioresDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					
						
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
			
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonNuevoGuardarCambiosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
						
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonSiguientesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonNuevoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
						
			
			
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
				this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonGuardarCambiosTablaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			}
			
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonDuplicarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonCopiarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonVerFormDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 1;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleImpuestoInven.add(this.jButtonCerrarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		
		this.jButtonRecargarInformacionDetalleImpuestoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleImpuestoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleImpuestoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleImpuestoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleImpuestoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleImpuestoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleImpuestoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleImpuestoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleImpuestoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleImpuestoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleImpuestoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleImpuestoInven.setLayout(gridaBagParametrosReportesDetalleImpuestoInven);
			this.jPanelParametrosReportesAccionesDetalleImpuestoInven.setLayout(gridaBagParametrosReportesAccionesDetalleImpuestoInven);
			
			
			this.jPanelParametrosAuxiliar1DetalleImpuestoInven.setLayout(gridaBagParametrosAuxiliar1DetalleImpuestoInven);
			this.jPanelParametrosAuxiliar2DetalleImpuestoInven.setLayout(gridaBagParametrosAuxiliar2DetalleImpuestoInven);
			this.jPanelParametrosAuxiliar3DetalleImpuestoInven.setLayout(gridaBagParametrosAuxiliar3DetalleImpuestoInven);
			this.jPanelParametrosAuxiliar4DetalleImpuestoInven.setLayout(gridaBagParametrosAuxiliar4DetalleImpuestoInven);
			//this.jPanelParametrosAuxiliar5DetalleImpuestoInven.setLayout(gridaBagParametrosAuxiliar2DetalleImpuestoInven);			
			
			
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jButtonRecargarInformacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleImpuestoInven.add(this.jComboBoxTiposPaginacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleImpuestoInven.add(this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleImpuestoInven.add(this.jComboBoxTiposArchivosReportesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jPanelParametrosAuxiliar1DetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleImpuestoInven.add(this.jComboBoxTiposReportesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);																		
			
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleImpuestoInven.add(this.jComboBoxTiposGraficosReportesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jPanelParametrosAuxiliar4DetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jComboBoxTiposReportesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jCheckBoxGenerarReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jPanelParametrosAuxiliar2DetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jLabelAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jButtonAbrirOrderByDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jComboBoxTiposSeleccionarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			
			
			/*
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jCheckBoxSeleccionarTodosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jCheckBoxConGraficoReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleImpuestoInven.add(this.jCheckBoxSeleccionarTodosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);															
				
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleImpuestoInven.add(this.jCheckBoxSeleccionadosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);															
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleImpuestoInven.add(this.jCheckBoxConGraficoReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jPanelParametrosAuxiliar3DetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jComboBoxTiposAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
	
				
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleImpuestoInven.add(this.jTextFieldValorCampoGeneralDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleImpuestoInven = new GridBagLayout();

			this.jScrollPanelDatosDetalleImpuestoInven.setLayout(gridaBagLayoutDatosDetalleImpuestoInven);
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
			
			this.jScrollPanelDatosDetalleImpuestoInven.add(this.jTableDatosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleImpuestoInven.setViewportView(this.jTableDatosDetalleImpuestoInven);
		this.jTableDatosDetalleImpuestoInven.setFillsViewportHeight(true);
		this.jTableDatosDetalleImpuestoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleImpuestoInven= new GridBagLayout();
		this.jPanelAccionesDetalleImpuestoInven.setLayout(gridaBagLayoutAccionesDetalleImpuestoInven);
		
		
		/*	
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
			
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonNuevoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleImpuestoInven= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleImpuestoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleImpuestoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleImpuestoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleImpuestoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleImpuestoInven.setLayout(gridaBagLayoutFK_IdBodegaDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		jPanelFK_IdBodegaDetalleImpuestoInven.add(jLabelid_bodegaFK_IdBodegaDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 1;
		jPanelFK_IdBodegaDetalleImpuestoInven.add(jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 1;
		gridBagConstraintsDetalleImpuestoInven.gridx =1;
		jPanelFK_IdBodegaDetalleImpuestoInven.add(jButtonFK_IdBodegaDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		jTabbedPaneBusquedasDetalleImpuestoInven.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleImpuestoInven);
		jTabbedPaneBusquedasDetalleImpuestoInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven= new GridBagLayout();
		gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdImpuestoInvenDetalleImpuestoInven.setLayout(gridaBagLayoutFK_IdImpuestoInvenDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		jPanelFK_IdImpuestoInvenDetalleImpuestoInven.add(jLabelid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 1;
		jPanelFK_IdImpuestoInvenDetalleImpuestoInven.add(jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 1;
		gridBagConstraintsDetalleImpuestoInven.gridx =1;
		jPanelFK_IdImpuestoInvenDetalleImpuestoInven.add(jButtonFK_IdImpuestoInvenDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		jTabbedPaneBusquedasDetalleImpuestoInven.addTab("2.-Por Impuesto Inven ", jPanelFK_IdImpuestoInvenDetalleImpuestoInven);
		jTabbedPaneBusquedasDetalleImpuestoInven.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleImpuestoInven= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleImpuestoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleImpuestoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleImpuestoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleImpuestoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleImpuestoInven.setLayout(gridaBagLayoutFK_IdProductoDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		jPanelFK_IdProductoDetalleImpuestoInven.add(jLabelid_productoFK_IdProductoDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 1;
		jPanelFK_IdProductoDetalleImpuestoInven.add(jComboBoxid_productoFK_IdProductoDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);


		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		jPanelFK_IdProductoDetalleImpuestoInven.add(this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleImpuestoInven.gridy = 1;
		gridBagConstraintsDetalleImpuestoInven.gridx =1;
		jPanelFK_IdProductoDetalleImpuestoInven.add(jButtonFK_IdProductoDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);

		jTabbedPaneBusquedasDetalleImpuestoInven.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleImpuestoInven);
		jTabbedPaneBusquedasDetalleImpuestoInven.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleImpuestoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();						
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;		
			//this.gridBagConstraintsDetalleImpuestoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleImpuestoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;		
		//this.gridBagConstraintsDetalleImpuestoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleImpuestoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;		
			this.gridBagConstraintsDetalleImpuestoInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleImpuestoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);								
		
		
		/*
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		*/		
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleImpuestoInven.gridx =0;
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleImpuestoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
				
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleImpuestoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleImpuestoInven.setLayout(gridaBagLayoutBusquedasParametrosDetalleImpuestoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleImpuestoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleImpuestoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleImpuestoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleImpuestoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleImpuestoInven.setName("jPanelReporteDinamicoDetalleImpuestoInven"); 
		
		this.jPanelReporteDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleImpuestoInven.setLayout(gridaBagLayoutReporteDinamicoDetalleImpuestoInven);
		
		
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleImpuestoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleImpuestoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleImpuestoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelColumnasSelectReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleImpuestoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleImpuestoInven=new JScrollPane(this.jListColumnasSelectReporteDetalleImpuestoInven);
			
			this.jScrollColumnasSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jListColumnasSelectReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jScrollColumnasSelectReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleImpuestoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleImpuestoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleImpuestoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleImpuestoInven=new JScrollPane(this.jListRelacionesSelectReporteDetalleImpuestoInven);
			
			this.jScrollRelacionesSelectReporteDetalleImpuestoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleImpuestoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleImpuestoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleImpuestoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleImpuestoInven = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleImpuestoInven.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelConGraficoDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jCheckBoxConGraficoDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelColumnaCategoriaGraficoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleImpuestoInven = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleImpuestoInven.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelColumnaCategoriaValorDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jComboBoxColumnaCategoriaValorDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleImpuestoInven = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleImpuestoInven.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelColumnasValoresGraficoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleImpuestoInven = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleImpuestoInven.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleImpuestoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleImpuestoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleImpuestoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleImpuestoInven=new JScrollPane(this.jListColumnasValoresGraficoDetalleImpuestoInven);
			
			this.jScrollColumnasValoresGraficoDetalleImpuestoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleImpuestoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleImpuestoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jListColumnasSelectReporteDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jScrollColumnasValoresGraficoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelTiposGraficosReportesDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleImpuestoInven.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelGenerarExcelReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven.setToolTipText("Generar EXCEL"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jComboBoxTiposReportesDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jLabelTiposArchivoReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleImpuestoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleImpuestoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleImpuestoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleImpuestoInven.setToolTipText("Generar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jButtonGenerarReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleImpuestoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleImpuestoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleImpuestoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleImpuestoInven.setToolTipText("Cancelar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleImpuestoInven.add(this.jButtonCerrarReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleImpuestoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven= new JScrollPane(jPanelReporteDinamicoDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleImpuestoInven);
		this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleImpuestoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleImpuestoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleImpuestoInven.setName("jPanelImportacionDetalleImpuestoInven"); 
		
		this.jPanelImportacionDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleImpuestoInven.setLayout(gridaBagLayoutImportacionDetalleImpuestoInven);
		
		
		this.jInternalFrameImportacionDetalleImpuestoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleImpuestoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleImpuestoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleImpuestoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleImpuestoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleImpuestoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleImpuestoInven.setResizable(true);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setClosable(true);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleImpuestoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleImpuestoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleImpuestoInven.setResizable(true);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setClosable(true);
	    this.jInternalFrameImportacionDetalleImpuestoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleImpuestoInven = new JLabelMe();

		this.jLabelArchivoImportacionDetalleImpuestoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleImpuestoInven.add(this.jLabelArchivoImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleImpuestoInven = new JFileChooser();		
		this.jFileChooserImportacionDetalleImpuestoInven.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleImpuestoInven = new JButtonMe();
		this.jButtonAbrirImportacionDetalleImpuestoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleImpuestoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleImpuestoInven.setToolTipText("Generar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleImpuestoInven.add(this.jButtonAbrirImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleImpuestoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleImpuestoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleImpuestoInven.add(this.jLabelPathArchivoImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleImpuestoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleImpuestoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleImpuestoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleImpuestoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleImpuestoInven.add(this.jTextFieldPathArchivoImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleImpuestoInven = new JButtonMe();
		this.jButtonGenerarImportacionDetalleImpuestoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleImpuestoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleImpuestoInven.setToolTipText("Generar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleImpuestoInven.add(this.jButtonGenerarImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleImpuestoInven = new JButtonMe();
		this.jButtonCerrarImportacionDetalleImpuestoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleImpuestoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleImpuestoInven.setToolTipText("Cancelar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleImpuestoInven.add(this.jButtonCerrarImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleImpuestoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleImpuestoInven= new JScrollPane(jPanelImportacionDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleImpuestoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleImpuestoInven);
		this.jInternalFrameImportacionDetalleImpuestoInven.getContentPane().add(this.jScrollPanelImportacionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleImpuestoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleImpuestoInven = new JButtonMe();
			this.jButtonAbrirOrderByDetalleImpuestoInven.setText("Orden");
			this.jButtonAbrirOrderByDetalleImpuestoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleImpuestoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleImpuestoInven";
			inputMap = this.jButtonAbrirOrderByDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleImpuestoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleImpuestoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleImpuestoInven.setName("jPanelOrderByDetalleImpuestoInven"); 
			
			this.jPanelOrderByDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleImpuestoInven.setLayout(gridaBagLayoutOrderByDetalleImpuestoInven);
			
			
			this.jTableDatosDetalleImpuestoInvenOrderBy = new JTableMe();        
			this.jTableDatosDetalleImpuestoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleImpuestoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleImpuestoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleImpuestoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleImpuestoInvenOrderBy.setViewportView(this.jTableDatosDetalleImpuestoInvenOrderBy);
			this.jTableDatosDetalleImpuestoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleImpuestoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleImpuestoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleImpuestoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleImpuestoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleImpuestoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleImpuestoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleImpuestoInven.setTitle("Orden");
			this.jInternalFrameOrderByDetalleImpuestoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleImpuestoInven.setResizable(true);
			this.jInternalFrameOrderByDetalleImpuestoInven.setClosable(true);
			this.jInternalFrameOrderByDetalleImpuestoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleImpuestoInven.ipady =150;
				
			this.jPanelOrderByDetalleImpuestoInven.add(jScrollPanelDatosDetalleImpuestoInvenOrderBy, this.gridBagConstraintsDetalleImpuestoInven);//this.jTableDatosDetalleImpuestoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleImpuestoInven = new JButtonMe();
			this.jButtonCerrarOrderByDetalleImpuestoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleImpuestoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleImpuestoInven.setToolTipText("Cancelar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleImpuestoInven.add(this.jButtonCerrarOrderByDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleImpuestoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleImpuestoInven= new JScrollPane(jPanelOrderByDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleImpuestoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleImpuestoInven);
			
			this.jInternalFrameOrderByDetalleImpuestoInven.getContentPane().add(this.jScrollPanelOrderByDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
		
		} else {
			this.jButtonAbrirOrderByDetalleImpuestoInven = new JButtonMe();
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
			&& this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleImpuestoInven.getRowHeight();//DetalleImpuestoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.isSelected()) {
					iHeightTable=DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleImpuestoInven.isSelected()) {
					iHeightTable=DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleImpuestoInven!=null && this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleImpuestoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleImpuestoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleImpuestoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleimpuestoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleImpuestoInven> TraerDetalleImpuestoInvenBeans(List<DetalleImpuestoInven> detalleimpuestoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvens) {
					
				if(!(DetalleImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleimpuestoinven.setsDetalleGeneralEntityReporte(DetalleImpuestoInvenConstantesFunciones.getDetalleImpuestoInvenDescripcion(detalleimpuestoinven));
										
						
					
						
					
				} else  {
							
					//detalleimpuestoinven.setsDetalleGeneralEntityReporte(detalleimpuestoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleimpuestoinvenbeans.add(detalleimpuestoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleimpuestoinvens;
    }
	//PARA REPORTES FIN
}
