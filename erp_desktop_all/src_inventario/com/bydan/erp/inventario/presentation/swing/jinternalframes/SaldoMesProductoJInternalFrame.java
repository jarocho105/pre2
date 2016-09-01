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
import com.bydan.erp.inventario.util.SaldoMesProductoConstantesFunciones;

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
public class SaldoMesProductoJInternalFrame extends SaldoMesProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSaldoMesProducto;
	
	protected JMenuBar jmenuBarSaldoMesProducto;
	
	protected JMenu jmenuSaldoMesProducto;
	protected JMenu jmenuDatosSaldoMesProducto;
	protected JMenu jmenuArchivoSaldoMesProducto;
	protected JMenu jmenuAccionesSaldoMesProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldoMesProducto;	
	protected GridBagConstraints gridBagConstraintsSaldoMesProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SaldoMesProductoDetalleFormJInternalFrame jInternalFrameDetalleFormSaldoMesProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSaldoMesProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSaldoMesProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public SaldoMesProductoSessionBean saldomesproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SaldoMesProducto> saldomesproductos;		
	public List<SaldoMesProducto> saldomesproductosEliminados;	
	public List<SaldoMesProducto> saldomesproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySaldoMesProducto;		
	protected JButton jButtonAbrirOrderBySaldoMesProducto;
	
	
	//protected JPanel jPanelOrderBySaldoMesProducto;
	//public JScrollPane jScrollPanelOrderBySaldoMesProducto;	
	//protected JButton jButtonCerrarOrderBySaldoMesProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SaldoMesProductoLogic saldomesproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSaldoMesProducto;
	public JScrollPane jScrollPanelDatosEdicionSaldoMesProducto;
	public JScrollPane jScrollPanelDatosGeneralSaldoMesProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosSaldoMesProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSaldoMesProducto;
	//public JScrollPane jScrollPanelImportacionSaldoMesProducto;
	
	
	
	protected JPanel jPanelAccionesSaldoMesProducto;
	
    protected JPanel jPanelPaginacionSaldoMesProducto;
    protected JPanel jPanelParametrosReportesSaldoMesProducto;
	protected JPanel jPanelParametrosReportesAccionesSaldoMesProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SaldoMesProducto;
	protected JPanel jPanelParametrosAuxiliar2SaldoMesProducto;
	protected JPanel jPanelParametrosAuxiliar3SaldoMesProducto;
	protected JPanel jPanelParametrosAuxiliar4SaldoMesProducto;
	//protected JPanel jPanelParametrosAuxiliar5SaldoMesProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoSaldoMesProducto;
	//protected JPanel jPanelImportacionSaldoMesProducto;
	
	
	public JTable jTableDatosSaldoMesProducto;
	
	
	
	//public JTable jTableDatosSaldoMesProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSaldoMesProducto;
	protected JButton jButtonDuplicarSaldoMesProducto;
	protected JButton jButtonCopiarSaldoMesProducto;
	protected JButton jButtonVerFormSaldoMesProducto;
	protected JButton jButtonNuevoRelacionesSaldoMesProducto;
	protected JButton jButtonModificarSaldoMesProducto;
	
    protected JButton jButtonGuardarCambiosTablaSaldoMesProducto;
	protected JButton jButtonCerrarSaldoMesProducto;
	
	
	protected JButton jButtonRecargarInformacionSaldoMesProducto;
	protected JButton jButtonProcesarInformacionSaldoMesProducto;
	
	
	protected JButton jButtonAnterioresSaldoMesProducto;
	protected JButton jButtonSiguientesSaldoMesProducto;
	protected JButton jButtonNuevoGuardarCambiosSaldoMesProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSaldoMesProducto;
	//protected JButton jButtonCerrarReporteDinamicoSaldoMesProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoSaldoMesProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionSaldoMesProducto;
	//protected JButton jButtonGenerarImportacionSaldoMesProducto;
	//protected JButton jButtonCerrarImportacionSaldoMesProducto;
	//protected JFileChooser jFileChooserImportacionSaldoMesProducto;
	//protected File fileImportacionSaldoMesProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldoMesProducto;
	protected JButton jButtonDuplicarToolBarSaldoMesProducto;
	protected JButton jButtonNuevoRelacionesToolBarSaldoMesProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarSaldoMesProducto;
	protected JButton jButtonCopiarToolBarSaldoMesProducto;
	protected JButton jButtonVerFormToolBarSaldoMesProducto;
	public JButton jButtonGuardarCambiosTablaToolBarSaldoMesProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldoMesProducto;
	protected JButton jButtonCerrarToolBarSaldoMesProducto;
	
	protected JButton jButtonRecargarInformacionToolBarSaldoMesProducto;
	protected JButton jButtonProcesarInformacionToolBarSaldoMesProducto;
	protected JButton jButtonAnterioresToolBarSaldoMesProducto;
	protected JButton jButtonSiguientesToolBarSaldoMesProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarSaldoMesProducto;
	protected JButton jButtonAbrirOrderByToolBarSaldoMesProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldoMesProducto;
	protected JMenuItem jMenuItemDuplicarSaldoMesProducto;
	protected JMenuItem jMenuItemNuevoRelacionesSaldoMesProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSaldoMesProducto;
	protected JMenuItem jMenuItemCopiarSaldoMesProducto;
	protected JMenuItem jMenuItemVerFormSaldoMesProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldoMesProducto;
	protected JMenuItem jMenuItemCerrarSaldoMesProducto;
	protected JMenuItem jMenuItemDetalleCerrarSaldoMesProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySaldoMesProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldoMesProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionSaldoMesProducto;
	protected JMenuItem jMenuItemProcesarInformacionSaldoMesProducto;
	protected JMenuItem jMenuItemAnterioresSaldoMesProducto;
	protected JMenuItem jMenuItemSiguientesSaldoMesProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldoMesProducto;
	protected JMenuItem jMenuItemAbrirOrderBySaldoMesProducto;
	protected JMenuItem jMenuItemMostrarOcultarSaldoMesProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldoMesProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSaldoMesProducto;
	protected JCheckBox jCheckBoxSeleccionadosSaldoMesProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSaldoMesProducto;
	protected JCheckBox jCheckBoxConGraficoReporteSaldoMesProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSaldoMesProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSaldoMesProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSaldoMesProducto;
	protected JTextField jTextFieldValorCampoGeneralSaldoMesProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSaldoMesProducto;
	//public JList<Reporte> jListColumnasSelectReporteSaldoMesProducto;
	//public JScrollPane jScrollColumnasSelectReporteSaldoMesProducto;
	
	//public JLabel jLabelRelacionesSelectReporteSaldoMesProducto;
	//public JList<Reporte> jListRelacionesSelectReporteSaldoMesProducto;
	//public JScrollPane jScrollRelacionesSelectReporteSaldoMesProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSaldoMesProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSaldoMesProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSaldoMesProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoSaldoMesProducto;
	
		
	//public JLabel jLabelArchivoImportacionSaldoMesProducto;	
	//public JLabel jLabelPathArchivoImportacionSaldoMesProducto;
	//protected JTextField jTextFieldPathArchivoImportacionSaldoMesProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSaldoMesProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSaldoMesProducto;
	
	//public JLabel jLabelColumnaCategoriaValorSaldoMesProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSaldoMesProducto;
	
	//public JLabel jLabelColumnasValoresGraficoSaldoMesProducto;
	//public JList<Reporte> jListColumnasValoresGraficoSaldoMesProducto;
	//public JScrollPane jScrollColumnasValoresGraficoSaldoMesProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSaldoMesProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSaldoMesProducto;
	public JPanel jPanelFK_IdAnioSaldoMesProducto;
	public JButton jButtonFK_IdAnioSaldoMesProducto;
	public JPanel jPanelFK_IdBodegaSaldoMesProducto;
	public JButton jButtonFK_IdBodegaSaldoMesProducto;
	public JPanel jPanelFK_IdMesSaldoMesProducto;
	public JButton jButtonFK_IdMesSaldoMesProducto;
	public JPanel jPanelFK_IdProductoSaldoMesProducto;
	public JButton jButtonFK_IdProductoSaldoMesProducto;
	
	public JPanel jPanelid_anioFK_IdAnioSaldoMesProducto;
	public JLabel jLabelid_anioFK_IdAnioSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioSaldoMesProducto;
	public JButton jButtonid_anioFK_IdAnioSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioSaldoMesProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaFK_IdBodegaSaldoMesProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto;
	public JButton jButtonid_bodegaFK_IdBodegaSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaSaldoMesProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesSaldoMesProducto;
	public JLabel jLabelid_mesFK_IdMesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesSaldoMesProducto;
	public JButton jButtonid_mesFK_IdMesSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesSaldoMesProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoSaldoMesProducto;
	public JLabel jLabelid_productoFK_IdProductoSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoSaldoMesProducto;
	public JButton jButtonid_productoFK_IdProductoSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoSaldoMesProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoSaldoMesProducto;
	
	
	
	
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
	public SaldoMesProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSaldoMesProducto)	{
		this.jButtonRecargarInformacionSaldoMesProducto = jButtonRecargarInformacionSaldoMesProducto;
	}
	
	public JButton getjButtonProcesarInformacionSaldoMesProducto() {
		return this.jButtonProcesarInformacionSaldoMesProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldoMesProducto)	{
		this.jButtonProcesarInformacionSaldoMesProducto = jButtonProcesarInformacionSaldoMesProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionSaldoMesProducto() {
		return this.jButtonRecargarInformacionSaldoMesProducto;
	}
	
	
	public List<SaldoMesProducto> getsaldomesproductos() {
		return this.saldomesproductos;
	}

	public void setsaldomesproductos(List<SaldoMesProducto> saldomesproductos) {
		this.saldomesproductos = saldomesproductos;
	}
	
	public List<SaldoMesProducto> getsaldomesproductosAux() {
		return this.saldomesproductosAux;
	}

	public void setsaldomesproductosAux(List<SaldoMesProducto> saldomesproductosAux) {
		this.saldomesproductosAux = saldomesproductosAux;
	}
	
	public List<SaldoMesProducto> getsaldomesproductosEliminados() {
		return this.saldomesproductosEliminados;
	}

	public void setSaldoMesProductosEliminados(List<SaldoMesProducto> saldomesproductosEliminados) {
		this.saldomesproductosEliminados = saldomesproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSaldoMesProducto() {
		return jComboBoxTiposSeleccionarSaldoMesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSaldoMesProducto(
			JComboBox jComboBoxTiposSeleccionarSaldoMesProducto) {
		this.jComboBoxTiposSeleccionarSaldoMesProducto = jComboBoxTiposSeleccionarSaldoMesProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSaldoMesProducto() {
		return jTextFieldValorCampoGeneralSaldoMesProducto;
	}

	public void setjTextFieldValorCampoGeneralSaldoMesProducto(
			JTextField jTextFieldValorCampoGeneralSaldoMesProducto) {
		this.jTextFieldValorCampoGeneralSaldoMesProducto = jTextFieldValorCampoGeneralSaldoMesProducto;
	}

	public void setBorderResaltarValorCampoGeneralSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSaldoMesProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSaldoMesProducto() {
		return this.jCheckBoxSeleccionarTodosSaldoMesProducto;
	}

	public void setjCheckBoxSeleccionarTodosSaldoMesProducto(
			JCheckBox jCheckBoxSeleccionarTodosSaldoMesProducto) {
		this.jCheckBoxSeleccionarTodosSaldoMesProducto = jCheckBoxSeleccionarTodosSaldoMesProducto;
	}

	public void setBorderResaltarSeleccionarTodosSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSaldoMesProducto() {
		return this.jCheckBoxSeleccionadosSaldoMesProducto;
	}

	public void setjCheckBoxSeleccionadosSaldoMesProducto(
			JCheckBox jCheckBoxSeleccionadosSaldoMesProducto) {
		this.jCheckBoxSeleccionadosSaldoMesProducto = jCheckBoxSeleccionadosSaldoMesProducto;
	}
	
	public void setBorderResaltarSeleccionadosSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSaldoMesProducto() {
		return this.jComboBoxTiposArchivosReportesSaldoMesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSaldoMesProducto(
			JComboBox jComboBoxTiposArchivosReportesSaldoMesProducto) {
		this.jComboBoxTiposArchivosReportesSaldoMesProducto = jComboBoxTiposArchivosReportesSaldoMesProducto;
	}

	public void setBorderResaltarTiposArchivosReportesSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSaldoMesProducto() {
		return this.jComboBoxTiposReportesSaldoMesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSaldoMesProducto(
			JComboBox jComboBoxTiposReportesSaldoMesProducto) {
		this.jComboBoxTiposReportesSaldoMesProducto = jComboBoxTiposReportesSaldoMesProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSaldoMesProducto() {
	//	return jComboBoxTiposReportesDinamicoSaldoMesProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSaldoMesProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoSaldoMesProducto) {
	//	this.jComboBoxTiposReportesDinamicoSaldoMesProducto = jComboBoxTiposReportesDinamicoSaldoMesProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSaldoMesProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSaldoMesProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto = jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto;
	//}
	
	public void setBorderResaltarTiposReportesSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSaldoMesProducto() {
		return this.jComboBoxTiposGraficosReportesSaldoMesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSaldoMesProducto(
			JComboBox jComboBoxTiposGraficosReportesSaldoMesProducto) {
		this.jComboBoxTiposGraficosReportesSaldoMesProducto = jComboBoxTiposGraficosReportesSaldoMesProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSaldoMesProducto() {
		return this.jComboBoxTiposPaginacionSaldoMesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSaldoMesProducto(
			JComboBox jComboBoxTiposPaginacionSaldoMesProducto) {
		this.jComboBoxTiposPaginacionSaldoMesProducto = jComboBoxTiposPaginacionSaldoMesProducto;
	}
	
	public void setBorderResaltarTiposPaginacionSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSaldoMesProducto() {
		return this.jComboBoxTiposRelacionesSaldoMesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldoMesProducto() {
		return this.jComboBoxTiposAccionesSaldoMesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldoMesProducto(
			JComboBox jComboBoxTiposRelacionesSaldoMesProducto) {
		this.jComboBoxTiposRelacionesSaldoMesProducto = jComboBoxTiposRelacionesSaldoMesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldoMesProducto(
			JComboBox jComboBoxTiposAccionesSaldoMesProducto) {
		this.jComboBoxTiposAccionesSaldoMesProducto = jComboBoxTiposAccionesSaldoMesProducto;
	}
	
	public void setBorderResaltarTiposRelacionesSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSaldoMesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSaldoMesProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSaldoMesProducto() {
	//	return jCheckBoxConGraficoDinamicoSaldoMesProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoSaldoMesProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoSaldoMesProducto) {
	//	this.jCheckBoxConGraficoDinamicoSaldoMesProducto = jCheckBoxConGraficoDinamicoSaldoMesProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSaldoMesProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSaldoMesProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSaldoMesProducto .setBorder(borderResaltar);		
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
		this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		
		this.saldomesproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldomesproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldomesproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldoMesProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldo Mes Producto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		SaldoMesProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSaldoMesProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"nuevo","nuevo","Nuevo"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"duplicar","duplicar","Duplicar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"copiar","copiar","Copiar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"ver_form","ver_form","Ver"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"recargar","recargar","Recargar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSaldoMesProducto,this.jTtoolBarSaldoMesProducto,
							"cerrar","cerrar","Salir"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSaldoMesProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSaldoMesProducto;
			
				this.jButtonProcesarInformacionToolBarSaldoMesProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSaldoMesProducto;
				
		//protected JButton jButtonModificarToolBarSaldoMesProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSaldoMesProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSaldoMesProducto=new JMenuMe("General");
		this.jmenuArchivoSaldoMesProducto=new JMenuMe("Archivo");
		this.jmenuAccionesSaldoMesProducto=new JMenuMe("Acciones");
		this.jmenuDatosSaldoMesProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldoMesProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldoMesProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldoMesProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSaldoMesProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSaldoMesProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSaldoMesProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSaldoMesProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSaldoMesProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSaldoMesProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSaldoMesProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldoMesProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldoMesProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSaldoMesProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSaldoMesProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSaldoMesProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSaldoMesProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSaldoMesProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSaldoMesProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSaldoMesProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSaldoMesProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSaldoMesProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldoMesProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldoMesProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldoMesProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSaldoMesProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSaldoMesProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSaldoMesProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSaldoMesProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSaldoMesProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSaldoMesProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSaldoMesProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSaldoMesProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSaldoMesProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSaldoMesProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSaldoMesProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSaldoMesProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySaldoMesProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySaldoMesProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySaldoMesProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldoMesProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldoMesProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldoMesProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySaldoMesProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySaldoMesProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySaldoMesProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldoMesProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldoMesProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldoMesProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSaldoMesProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSaldoMesProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSaldoMesProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSaldoMesProducto.add(this.jMenuItemCerrarSaldoMesProducto);
			
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemNuevoSaldoMesProducto);
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemNuevoGuardarCambiosSaldoMesProducto);
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemNuevoRelacionesSaldoMesProducto);
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemGuardarCambiosTablaSaldoMesProducto);		
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemDuplicarSaldoMesProducto);		
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemCopiarSaldoMesProducto);		
			this.jmenuAccionesSaldoMesProducto.add(this.jMenuItemVerFormSaldoMesProducto);		
			
			this.jmenuDatosSaldoMesProducto.add(this.jMenuItemRecargarInformacionSaldoMesProducto);				
			this.jmenuDatosSaldoMesProducto.add(this.jMenuItemAnterioresSaldoMesProducto);				
			this.jmenuDatosSaldoMesProducto.add(this.jMenuItemSiguientesSaldoMesProducto);				
			this.jmenuDatosSaldoMesProducto.add(this.jMenuItemAbrirOrderBySaldoMesProducto);				
			this.jmenuDatosSaldoMesProducto.add(this.jMenuItemMostrarOcultarSaldoMesProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSaldoMesProducto.add(this.jMenuItemGuardarCambiosSaldoMesProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSaldoMesProducto.add(this.jmenuArchivoSaldoMesProducto);		
			this.jmenuBarSaldoMesProducto.add(this.jmenuAccionesSaldoMesProducto);		
			this.jmenuBarSaldoMesProducto.add(this.jmenuDatosSaldoMesProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSaldoMesProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSaldoMesProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioSaldoMesProducto.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioSaldoMesProducto= new JButtonMe();
		this.jButtonFK_IdAnioSaldoMesProducto.setText("Buscar");
		this.jButtonFK_IdAnioSaldoMesProducto.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioSaldoMesProducto,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioSaldoMesProducto = new JLabelMe();
		jLabelid_anioFK_IdAnioSaldoMesProducto.setText("Anio :");
		jLabelid_anioFK_IdAnioSaldoMesProducto.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaSaldoMesProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaSaldoMesProducto= new JButtonMe();
		this.jButtonFK_IdBodegaSaldoMesProducto.setText("Buscar");
		this.jButtonFK_IdBodegaSaldoMesProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaSaldoMesProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesSaldoMesProducto.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesSaldoMesProducto= new JButtonMe();
		this.jButtonFK_IdMesSaldoMesProducto.setText("Buscar");
		this.jButtonFK_IdMesSaldoMesProducto.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesSaldoMesProducto,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesSaldoMesProducto = new JLabelMe();
		jLabelid_mesFK_IdMesSaldoMesProducto.setText("Mes :");
		jLabelid_mesFK_IdMesSaldoMesProducto.setToolTipText("Mes");
		jLabelid_mesFK_IdMesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoSaldoMesProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoSaldoMesProducto= new JButtonMe();
		this.jButtonFK_IdProductoSaldoMesProducto.setText("Buscar");
		this.jButtonFK_IdProductoSaldoMesProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoSaldoMesProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoSaldoMesProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoSaldoMesProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoSaldoMesProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.setFocusable(false);


		this.jTabbedPaneBusquedasSaldoMesProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasSaldoMesProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSaldoMesProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSaldoMesProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSaldoMesProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSaldoMesProducto = new SaldoMesProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Saldo Mes Producto DATOS");
			this.jInternalFrameDetalleFormSaldoMesProducto = new SaldoMesProductoDetalleFormJInternalFrame(jDesktopPane,this.saldomesproductoSessionBean.getConGuardarRelaciones(),this.saldomesproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSaldoMesProducto = null;//new SaldoMesProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldoMesProducto= new GridBagLayout();
		
		
		this.jTableDatosSaldoMesProducto = new JTableMe();      
		
		String sToolTipSaldoMesProducto="";
		sToolTipSaldoMesProducto=SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldoMesProducto+="(Inventario.SaldoMesProducto)";
		}
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldoMesProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSaldoMesProducto.setToolTipText(sToolTipSaldoMesProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSaldoMesProducto);
		this.jTableDatosSaldoMesProducto.setAutoCreateRowSorter(true);
		this.jTableDatosSaldoMesProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSaldoMesProducto.setRowSelectionAllowed(true);
		this.jTableDatosSaldoMesProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSaldoMesProducto = new JButtonMe();
		this.jButtonDuplicarSaldoMesProducto = new JButtonMe();
		this.jButtonCopiarSaldoMesProducto = new JButtonMe();
		this.jButtonVerFormSaldoMesProducto = new JButtonMe();
		this.jButtonNuevoRelacionesSaldoMesProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto = new JButtonMe();
		this.jButtonCerrarSaldoMesProducto = new JButtonMe();
		
		this.jScrollPanelDatosSaldoMesProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralSaldoMesProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Saldo Mes Producto";
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldoMesProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldoMesProducto.setToolTipText("Acciones");
        this.jPanelAccionesSaldoMesProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSaldoMesProducto=new ReporteDinamicoJInternalFrame(SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSaldoMesProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSaldoMesProducto=new ImportacionJInternalFrame(SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSaldoMesProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySaldoMesProducto = new JButtonMe();
		
		this.jButtonAbrirOrderBySaldoMesProducto.setText("Orden");
		this.jButtonAbrirOrderBySaldoMesProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldoMesProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldoMesProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoMesProducto,false,this);
			
			//this.cargarOrderBySaldoMesProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldoMesProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoMesProducto,true,this);
			
			//this.cargarOrderBySaldoMesProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSaldoMesProducto.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosSaldoMesProducto.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosSaldoMesProducto.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosSaldoMesProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldoMesProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldoMesProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSaldoMesProducto.setText("Nuevo");
		this.jButtonDuplicarSaldoMesProducto.setText("Duplicar");
		this.jButtonCopiarSaldoMesProducto.setText("Copiar");
		this.jButtonVerFormSaldoMesProducto.setText("Ver");
		this.jButtonNuevoRelacionesSaldoMesProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.setText("Guardar");
		this.jButtonCerrarSaldoMesProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldoMesProducto,"nuevo_button","Nuevo",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSaldoMesProducto,"duplicar_button","Duplicar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSaldoMesProducto,"copiar_button","Copiar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSaldoMesProducto,"ver_form","Ver",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSaldoMesProducto,"nuevorelaciones_button","Nuevo Rel",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldoMesProducto,"guardarcambiostabla_button","Guardar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldoMesProducto,"cerrar_button","Salir",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSaldoMesProducto.setToolTipText("Nuevo"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSaldoMesProducto.setToolTipText("Duplicar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSaldoMesProducto.setToolTipText("Copiar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSaldoMesProducto.setToolTipText("Ver"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSaldoMesProducto.setToolTipText("Nuevo Rel"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.setToolTipText("Guardar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldoMesProducto.setToolTipText("Salir"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldoMesProducto";
		inputMap = this.jButtonNuevoSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldoMesProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldoMesProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarSaldoMesProducto";
		inputMap = this.jButtonDuplicarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSaldoMesProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSaldoMesProducto"));
		
		//COPIAR
		sMapKey = "CopiarSaldoMesProducto";
		inputMap = this.jButtonCopiarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSaldoMesProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSaldoMesProducto"));
		
		//VEr FORM
		sMapKey = "VerFormSaldoMesProducto";
		inputMap = this.jButtonVerFormSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSaldoMesProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSaldoMesProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSaldoMesProducto";
		inputMap = this.jButtonNuevoRelacionesSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSaldoMesProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSaldoMesProducto";
		inputMap = this.jButtonModificarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSaldoMesProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSaldoMesProducto";
		inputMap = this.jButtonCerrarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldoMesProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldoMesProducto";
		inputMap = this.jButtonGuardarCambiosTablaSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldoMesProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSaldoMesProducto.setName("jPanelParametrosReportesSaldoMesProducto"); 
		
		this.jPanelParametrosReportesAccionesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSaldoMesProducto.setName("jPanelParametrosReportesAccionesSaldoMesProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSaldoMesProducto = new JButtonMe();
		this.jButtonRecargarInformacionSaldoMesProducto.setText("Recargar");
		this.jButtonRecargarInformacionSaldoMesProducto.setToolTipText("Recargar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSaldoMesProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSaldoMesProducto = new JButtonMe();
		this.jButtonProcesarInformacionSaldoMesProducto.setText("Procesar");
		this.jButtonProcesarInformacionSaldoMesProducto.setToolTipText("Procesar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSaldoMesProducto.setVisible(false);
			
		this.jButtonProcesarInformacionSaldoMesProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldoMesProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldoMesProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoMesProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSaldoMesProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoMesProducto.setText("TIPO");       
		this.jComboBoxTiposReportesSaldoMesProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldoMesProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSaldoMesProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSaldoMesProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionSaldoMesProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSaldoMesProducto.setText("Accion");
		this.jComboBoxTiposRelacionesSaldoMesProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldoMesProducto.setText("Accion");
		this.jComboBoxTiposAccionesSaldoMesProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSaldoMesProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarSaldoMesProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSaldoMesProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSaldoMesProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldoMesProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldoMesProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSaldoMesProducto = new JLabelMe();
		
		this.jLabelAccionesSaldoMesProducto.setText("Acciones");		
		this.jLabelAccionesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSaldoMesProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSaldoMesProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSaldoMesProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSaldoMesProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSaldoMesProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSaldoMesProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSaldoMesProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteSaldoMesProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSaldoMesProducto = new JButtonMe();
		//this.jButtonAnterioresSaldoMesProducto.setText("<<");
        this.jButtonAnterioresSaldoMesProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSaldoMesProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSaldoMesProducto = new JButtonMe();
		//this.jButtonSiguientesSaldoMesProducto.setText(">>");
        this.jButtonSiguientesSaldoMesProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSaldoMesProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSaldoMesProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSaldoMesProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosSaldoMesProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSaldoMesProducto,"nuevoguardarcambios_button","Nue",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSaldoMesProducto";
		inputMap = this.jButtonNuevoGuardarCambiosSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSaldoMesProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSaldoMesProducto";
		inputMap = this.jButtonRecargarInformacionSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSaldoMesProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSaldoMesProducto";
		inputMap = this.jButtonSiguientesSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSaldoMesProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSaldoMesProducto";
		inputMap = this.jButtonAnterioresSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSaldoMesProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSaldoMesProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSaldoMesProducto.setMinimumSize(new Dimension(this.getWidth(),SaldoMesProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoMesProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldoMesProducto.setMaximumSize(new Dimension(this.getWidth(),SaldoMesProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoMesProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldoMesProducto.setPreferredSize(new Dimension(this.getWidth(),SaldoMesProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldoMesProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSaldoMesProducto = new GridBagLayout();

			this.jPanelPaginacionSaldoMesProducto.setLayout(gridaBagLayoutPaginacionSaldoMesProducto);						
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 0;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonAnterioresSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					
						
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldoMesProducto.gridy = 0;
			
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonNuevoGuardarCambiosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
						
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldoMesProducto.gridy = 0;
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonSiguientesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 1;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonNuevoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
						
			
			
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
				this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSaldoMesProducto.gridy = 1;
				this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSaldoMesProducto.add(this.jButtonGuardarCambiosTablaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			}
			
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 1;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonDuplicarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 1;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonCopiarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 1;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonVerFormSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 1;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSaldoMesProducto.add(this.jButtonCerrarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		
		this.jButtonRecargarInformacionSaldoMesProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldoMesProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldoMesProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSaldoMesProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldoMesProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldoMesProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSaldoMesProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldoMesProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldoMesProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSaldoMesProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldoMesProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldoMesProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSaldoMesProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldoMesProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldoMesProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSaldoMesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldoMesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldoMesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSaldoMesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoMesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoMesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSaldoMesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldoMesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldoMesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSaldoMesProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldoMesProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldoMesProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSaldoMesProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldoMesProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldoMesProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSaldoMesProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldoMesProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldoMesProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSaldoMesProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSaldoMesProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SaldoMesProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SaldoMesProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SaldoMesProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SaldoMesProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSaldoMesProducto.setLayout(gridaBagParametrosReportesSaldoMesProducto);
			this.jPanelParametrosReportesAccionesSaldoMesProducto.setLayout(gridaBagParametrosReportesAccionesSaldoMesProducto);
			
			
			this.jPanelParametrosAuxiliar1SaldoMesProducto.setLayout(gridaBagParametrosAuxiliar1SaldoMesProducto);
			this.jPanelParametrosAuxiliar2SaldoMesProducto.setLayout(gridaBagParametrosAuxiliar2SaldoMesProducto);
			this.jPanelParametrosAuxiliar3SaldoMesProducto.setLayout(gridaBagParametrosAuxiliar3SaldoMesProducto);
			this.jPanelParametrosAuxiliar4SaldoMesProducto.setLayout(gridaBagParametrosAuxiliar4SaldoMesProducto);
			//this.jPanelParametrosAuxiliar5SaldoMesProducto.setLayout(gridaBagParametrosAuxiliar2SaldoMesProducto);			
			
			
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jButtonRecargarInformacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoMesProducto.add(this.jComboBoxTiposPaginacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoMesProducto.add(this.jCheckBoxConAltoMaximoTablaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldoMesProducto.add(this.jComboBoxTiposArchivosReportesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jPanelParametrosAuxiliar1SaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SaldoMesProducto.add(this.jComboBoxTiposReportesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);																		
			
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SaldoMesProducto.add(this.jComboBoxTiposGraficosReportesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jPanelParametrosAuxiliar4SaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jComboBoxTiposReportesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jCheckBoxGenerarReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jPanelParametrosAuxiliar2SaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jLabelAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
				this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSaldoMesProducto.add(this.jButtonAbrirOrderBySaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jComboBoxTiposSeleccionarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			
			
			/*
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jCheckBoxSeleccionarTodosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jCheckBoxConGraficoReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoMesProducto.add(this.jCheckBoxSeleccionarTodosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);															
				
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoMesProducto.add(this.jCheckBoxSeleccionadosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);															
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldoMesProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldoMesProducto.add(this.jCheckBoxConGraficoReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jPanelParametrosAuxiliar3SaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jComboBoxTiposAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
	
				
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldoMesProducto.add(this.jTextFieldValorCampoGeneralSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSaldoMesProducto = new GridBagLayout();

			this.jScrollPanelDatosSaldoMesProducto.setLayout(gridaBagLayoutDatosSaldoMesProducto);
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = 0;
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;
			
			this.jScrollPanelDatosSaldoMesProducto.add(this.jTableDatosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSaldoMesProducto.setViewportView(this.jTableDatosSaldoMesProducto);
		this.jTableDatosSaldoMesProducto.setFillsViewportHeight(true);
		this.jTableDatosSaldoMesProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSaldoMesProducto= new GridBagLayout();
		this.jPanelAccionesSaldoMesProducto.setLayout(gridaBagLayoutAccionesSaldoMesProducto);
		
		
		/*	
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
			
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonNuevoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioSaldoMesProducto= new GridBagLayout();
		gridaBagLayoutFK_IdAnioSaldoMesProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioSaldoMesProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioSaldoMesProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioSaldoMesProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioSaldoMesProducto.setLayout(gridaBagLayoutFK_IdAnioSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 0;
		jPanelFK_IdAnioSaldoMesProducto.add(jLabelid_anioFK_IdAnioSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 1;
		jPanelFK_IdAnioSaldoMesProducto.add(jComboBoxid_anioFK_IdAnioSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 1;
		gridBagConstraintsSaldoMesProducto.gridx =1;
		jPanelFK_IdAnioSaldoMesProducto.add(jButtonFK_IdAnioSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		jTabbedPaneBusquedasSaldoMesProducto.addTab("1.-Por Anio ", jPanelFK_IdAnioSaldoMesProducto);
		jTabbedPaneBusquedasSaldoMesProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaSaldoMesProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaSaldoMesProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaSaldoMesProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaSaldoMesProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaSaldoMesProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaSaldoMesProducto.setLayout(gridaBagLayoutFK_IdBodegaSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 0;
		jPanelFK_IdBodegaSaldoMesProducto.add(jLabelid_bodegaFK_IdBodegaSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 1;
		jPanelFK_IdBodegaSaldoMesProducto.add(jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 1;
		gridBagConstraintsSaldoMesProducto.gridx =1;
		jPanelFK_IdBodegaSaldoMesProducto.add(jButtonFK_IdBodegaSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		jTabbedPaneBusquedasSaldoMesProducto.addTab("2.-Por Bodega ", jPanelFK_IdBodegaSaldoMesProducto);
		jTabbedPaneBusquedasSaldoMesProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdMesSaldoMesProducto= new GridBagLayout();
		gridaBagLayoutFK_IdMesSaldoMesProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesSaldoMesProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesSaldoMesProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesSaldoMesProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesSaldoMesProducto.setLayout(gridaBagLayoutFK_IdMesSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 0;
		jPanelFK_IdMesSaldoMesProducto.add(jLabelid_mesFK_IdMesSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 1;
		jPanelFK_IdMesSaldoMesProducto.add(jComboBoxid_mesFK_IdMesSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 1;
		gridBagConstraintsSaldoMesProducto.gridx =1;
		jPanelFK_IdMesSaldoMesProducto.add(jButtonFK_IdMesSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		jTabbedPaneBusquedasSaldoMesProducto.addTab("3.-Por Mes ", jPanelFK_IdMesSaldoMesProducto);
		jTabbedPaneBusquedasSaldoMesProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoSaldoMesProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoSaldoMesProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoSaldoMesProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoSaldoMesProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoSaldoMesProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoSaldoMesProducto.setLayout(gridaBagLayoutFK_IdProductoSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 0;
		jPanelFK_IdProductoSaldoMesProducto.add(jLabelid_productoFK_IdProductoSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 1;
		jPanelFK_IdProductoSaldoMesProducto.add(jComboBoxid_productoFK_IdProductoSaldoMesProducto, gridBagConstraintsSaldoMesProducto);


		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsSaldoMesProducto.gridy = 0;
		gridBagConstraintsSaldoMesProducto.gridx = 0;
		jPanelFK_IdProductoSaldoMesProducto.add(this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldoMesProducto.gridy = 1;
		gridBagConstraintsSaldoMesProducto.gridx =1;
		jPanelFK_IdProductoSaldoMesProducto.add(jButtonFK_IdProductoSaldoMesProducto, gridBagConstraintsSaldoMesProducto);

		jTabbedPaneBusquedasSaldoMesProducto.addTab("4.-Por Producto ", jPanelFK_IdProductoSaldoMesProducto);
		jTabbedPaneBusquedasSaldoMesProducto.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldoMesProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();						
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;		
			//this.gridBagConstraintsSaldoMesProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldoMesProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;		
		//this.gridBagConstraintsSaldoMesProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSaldoMesProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;		
			this.gridBagConstraintsSaldoMesProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSaldoMesProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);								
		
		
		/*
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		*/		
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldoMesProducto.gridx =0;
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldoMesProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
				
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSaldoMesProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldoMesProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosSaldoMesProducto.setLayout(gridaBagLayoutBusquedasParametrosSaldoMesProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSaldoMesProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldoMesProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoMesProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoMesProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSaldoMesProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSaldoMesProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSaldoMesProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSaldoMesProducto.setName("jPanelReporteDinamicoSaldoMesProducto"); 
		
		this.jPanelReporteDinamicoSaldoMesProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldoMesProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldoMesProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSaldoMesProducto.setLayout(gridaBagLayoutReporteDinamicoSaldoMesProducto);
		
		
		this.jInternalFrameReporteDinamicoSaldoMesProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSaldoMesProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldoMesProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSaldoMesProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSaldoMesProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSaldoMesProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSaldoMesProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSaldoMesProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSaldoMesProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoSaldoMesProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoSaldoMesProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSaldoMesProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldoMesProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldoMesProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSaldoMesProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteSaldoMesProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelColumnasSelectReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSaldoMesProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteSaldoMesProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSaldoMesProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSaldoMesProducto=new JScrollPane(this.jListColumnasSelectReporteSaldoMesProducto);
			
			this.jScrollColumnasSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSaldoMesProducto.add(this.jListColumnasSelectReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jScrollColumnasSelectReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSaldoMesProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteSaldoMesProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSaldoMesProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteSaldoMesProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSaldoMesProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSaldoMesProducto=new JScrollPane(this.jListRelacionesSelectReporteSaldoMesProducto);
			
			this.jScrollRelacionesSelectReporteSaldoMesProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldoMesProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldoMesProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSaldoMesProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoSaldoMesProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSaldoMesProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSaldoMesProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSaldoMesProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldoMesProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldoMesProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSaldoMesProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoSaldoMesProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelConGraficoDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSaldoMesProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSaldoMesProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSaldoMesProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldoMesProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldoMesProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jCheckBoxConGraficoDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSaldoMesProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSaldoMesProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelColumnaCategoriaGraficoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSaldoMesProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorSaldoMesProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelColumnaCategoriaValorSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSaldoMesProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSaldoMesProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSaldoMesProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldoMesProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldoMesProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jComboBoxColumnaCategoriaValorSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSaldoMesProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoSaldoMesProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelColumnasValoresGraficoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSaldoMesProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoSaldoMesProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSaldoMesProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSaldoMesProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldoMesProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldoMesProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSaldoMesProducto=new JScrollPane(this.jListColumnasValoresGraficoSaldoMesProducto);
			
			this.jScrollColumnasValoresGraficoSaldoMesProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldoMesProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldoMesProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSaldoMesProducto.add(this.jListColumnasSelectReporteSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jScrollColumnasValoresGraficoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelTiposGraficosReportesDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldoMesProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jComboBoxTiposGraficosReportesDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelGenerarExcelReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto.setToolTipText("Generar EXCEL"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSaldoMesProducto.add(this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jComboBoxTiposReportesDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jLabelTiposArchivoReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jComboBoxTiposArchivosReportesDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSaldoMesProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSaldoMesProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSaldoMesProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSaldoMesProducto.setToolTipText("Generar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jButtonGenerarReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSaldoMesProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSaldoMesProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSaldoMesProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSaldoMesProducto.setToolTipText("Cancelar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldoMesProducto.add(this.jButtonCerrarReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSaldoMesProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSaldoMesProducto= new JScrollPane(jPanelReporteDinamicoSaldoMesProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSaldoMesProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldoMesProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldoMesProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSaldoMesProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSaldoMesProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSaldoMesProducto);
		this.jInternalFrameReporteDinamicoSaldoMesProducto.getContentPane().add(this.jScrollPanelReporteDinamicoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSaldoMesProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSaldoMesProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSaldoMesProducto.setName("jPanelImportacionSaldoMesProducto"); 
		
		this.jPanelImportacionSaldoMesProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldoMesProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldoMesProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSaldoMesProducto.setLayout(gridaBagLayoutImportacionSaldoMesProducto);
		
		
		this.jInternalFrameImportacionSaldoMesProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSaldoMesProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSaldoMesProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldoMesProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSaldoMesProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldoMesProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldoMesProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSaldoMesProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldoMesProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldoMesProducto.setResizable(true);
	    this.jInternalFrameImportacionSaldoMesProducto.setClosable(true);
	    this.jInternalFrameImportacionSaldoMesProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSaldoMesProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldoMesProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldoMesProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSaldoMesProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldoMesProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldoMesProducto.setResizable(true);
	    this.jInternalFrameImportacionSaldoMesProducto.setClosable(true);
	    this.jInternalFrameImportacionSaldoMesProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSaldoMesProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldoMesProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldoMesProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSaldoMesProducto = new JLabelMe();

		this.jLabelArchivoImportacionSaldoMesProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldoMesProducto.add(this.jLabelArchivoImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSaldoMesProducto = new JFileChooser();		
		this.jFileChooserImportacionSaldoMesProducto.setToolTipText("ESCOGER ARCHIVO"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSaldoMesProducto = new JButtonMe();
		this.jButtonAbrirImportacionSaldoMesProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSaldoMesProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSaldoMesProducto.setToolTipText("Generar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoMesProducto.add(this.jButtonAbrirImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSaldoMesProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionSaldoMesProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldoMesProducto.add(this.jLabelPathArchivoImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSaldoMesProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSaldoMesProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldoMesProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldoMesProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoMesProducto.add(this.jTextFieldPathArchivoImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSaldoMesProducto = new JButtonMe();
		this.jButtonGenerarImportacionSaldoMesProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSaldoMesProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSaldoMesProducto.setToolTipText("Generar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoMesProducto.add(this.jButtonGenerarImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSaldoMesProducto = new JButtonMe();
		this.jButtonCerrarImportacionSaldoMesProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSaldoMesProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSaldoMesProducto.setToolTipText("Cancelar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldoMesProducto.add(this.jButtonCerrarImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSaldoMesProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionSaldoMesProducto= new JScrollPane(jPanelImportacionSaldoMesProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsSaldoMesProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSaldoMesProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSaldoMesProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSaldoMesProducto);
		this.jInternalFrameImportacionSaldoMesProducto.getContentPane().add(this.jScrollPanelImportacionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySaldoMesProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySaldoMesProducto = new JButtonMe();
			this.jButtonAbrirOrderBySaldoMesProducto.setText("Orden");
			this.jButtonAbrirOrderBySaldoMesProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldoMesProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySaldoMesProducto";
			inputMap = this.jButtonAbrirOrderBySaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySaldoMesProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderBySaldoMesProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySaldoMesProducto.setName("jPanelOrderBySaldoMesProducto"); 
			
			this.jPanelOrderBySaldoMesProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldoMesProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldoMesProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySaldoMesProducto.setLayout(gridaBagLayoutOrderBySaldoMesProducto);
			
			
			this.jTableDatosSaldoMesProductoOrderBy = new JTableMe();        
			this.jTableDatosSaldoMesProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSaldoMesProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSaldoMesProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSaldoMesProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSaldoMesProductoOrderBy.setViewportView(this.jTableDatosSaldoMesProductoOrderBy);
			this.jTableDatosSaldoMesProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSaldoMesProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySaldoMesProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySaldoMesProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySaldoMesProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSaldoMesProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySaldoMesProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySaldoMesProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySaldoMesProducto.setTitle("Orden");
			this.jInternalFrameOrderBySaldoMesProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySaldoMesProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySaldoMesProducto.setResizable(true);
			this.jInternalFrameOrderBySaldoMesProducto.setClosable(true);
			this.jInternalFrameOrderBySaldoMesProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySaldoMesProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldoMesProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldoMesProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSaldoMesProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSaldoMesProducto.ipady =150;
				
			this.jPanelOrderBySaldoMesProducto.add(jScrollPanelDatosSaldoMesProductoOrderBy, this.gridBagConstraintsSaldoMesProducto);//this.jTableDatosSaldoMesProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySaldoMesProducto = new JButtonMe();
			this.jButtonCerrarOrderBySaldoMesProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySaldoMesProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySaldoMesProducto.setToolTipText("Cancelar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSaldoMesProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySaldoMesProducto.add(this.jButtonCerrarOrderBySaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSaldoMesProducto = new GridBagLayout();
			
			this.jScrollPanelOrderBySaldoMesProducto= new JScrollPane(jPanelOrderBySaldoMesProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsSaldoMesProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySaldoMesProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySaldoMesProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSaldoMesProducto);
			
			this.jInternalFrameOrderBySaldoMesProducto.getContentPane().add(this.jScrollPanelOrderBySaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
		
		} else {
			this.jButtonAbrirOrderBySaldoMesProducto = new JButtonMe();
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
			&& this.saldomesproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSaldoMesProducto.getRowHeight();//SaldoMesProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.isSelected()) {
					iHeightTable=SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldoMesProducto.isSelected()) {
					iHeightTable=SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldoMesProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSaldoMesProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldoMesProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldoMesProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSaldoMesProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldoMesProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldoMesProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySaldoMesProducto!=null && this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySaldoMesProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySaldoMesProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySaldoMesProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSaldoMesProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldoMesProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldoMesProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=saldomesproductoLogic.getSaldoMesProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldomesproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SaldoMesProducto> TraerSaldoMesProductoBeans(List<SaldoMesProducto> saldomesproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SaldoMesProducto saldomesproducto:saldomesproductos) {
					
				if(!(SaldoMesProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SaldoMesProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					saldomesproducto.setsDetalleGeneralEntityReporte(SaldoMesProductoConstantesFunciones.getSaldoMesProductoDescripcion(saldomesproducto));
										
						
					
						
					
				} else  {
							
					//saldomesproducto.setsDetalleGeneralEntityReporte(saldomesproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//saldomesproductobeans.add(saldomesproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return saldomesproductos;
    }
	//PARA REPORTES FIN
}
