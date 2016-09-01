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
import com.bydan.erp.inventario.util.CompoKitConstantesFunciones;

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
public class CompoKitJInternalFrame extends CompoKitBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCompoKit;
	
	protected JMenuBar jmenuBarCompoKit;
	
	protected JMenu jmenuCompoKit;
	protected JMenu jmenuDatosCompoKit;
	protected JMenu jmenuArchivoCompoKit;
	protected JMenu jmenuAccionesCompoKit;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCompoKit;	
	protected GridBagConstraints gridBagConstraintsCompoKit;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CompoKitDetalleFormJInternalFrame jInternalFrameDetalleFormCompoKit;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCompoKit;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCompoKit;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected KitBeanSwingJInternalFrame kitBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_kit="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public CompoKitSessionBean compokitSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public KitSessionBean kitSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CompoKit> compokits;		
	public List<CompoKit> compokitsEliminados;	
	public List<CompoKit> compokitsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCompoKit;		
	protected JButton jButtonAbrirOrderByCompoKit;
	
	
	//protected JPanel jPanelOrderByCompoKit;
	//public JScrollPane jScrollPanelOrderByCompoKit;	
	//protected JButton jButtonCerrarOrderByCompoKit;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CompoKitLogic compokitLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCompoKit;
	public JScrollPane jScrollPanelDatosEdicionCompoKit;
	public JScrollPane jScrollPanelDatosGeneralCompoKit;
    
	
	
	//public JScrollPane jScrollPanelDatosCompoKitOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCompoKit;
	//public JScrollPane jScrollPanelImportacionCompoKit;
	
	
	
	protected JPanel jPanelAccionesCompoKit;
	
    protected JPanel jPanelPaginacionCompoKit;
    protected JPanel jPanelParametrosReportesCompoKit;
	protected JPanel jPanelParametrosReportesAccionesCompoKit;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CompoKit;
	protected JPanel jPanelParametrosAuxiliar2CompoKit;
	protected JPanel jPanelParametrosAuxiliar3CompoKit;
	protected JPanel jPanelParametrosAuxiliar4CompoKit;
	//protected JPanel jPanelParametrosAuxiliar5CompoKit;
	
	
	
	//protected JPanel jPanelReporteDinamicoCompoKit;
	//protected JPanel jPanelImportacionCompoKit;
	
	
	public JTable jTableDatosCompoKit;
	
	
	
	//public JTable jTableDatosCompoKitOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCompoKit;
	protected JButton jButtonDuplicarCompoKit;
	protected JButton jButtonCopiarCompoKit;
	protected JButton jButtonVerFormCompoKit;
	protected JButton jButtonNuevoRelacionesCompoKit;
	protected JButton jButtonModificarCompoKit;
	
    protected JButton jButtonGuardarCambiosTablaCompoKit;
	protected JButton jButtonCerrarCompoKit;
	
	
	protected JButton jButtonRecargarInformacionCompoKit;
	protected JButton jButtonProcesarInformacionCompoKit;
	
	
	protected JButton jButtonAnterioresCompoKit;
	protected JButton jButtonSiguientesCompoKit;
	protected JButton jButtonNuevoGuardarCambiosCompoKit;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCompoKit;
	//protected JButton jButtonCerrarReporteDinamicoCompoKit;
	//protected JButton jButtonGenerarExcelReporteDinamicoCompoKit;	
	
	
	
	//protected JButton jButtonAbrirImportacionCompoKit;
	//protected JButton jButtonGenerarImportacionCompoKit;
	//protected JButton jButtonCerrarImportacionCompoKit;
	//protected JFileChooser jFileChooserImportacionCompoKit;
	//protected File fileImportacionCompoKit;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCompoKit;
	protected JButton jButtonDuplicarToolBarCompoKit;
	protected JButton jButtonNuevoRelacionesToolBarCompoKit;
	
	
	public JButton jButtonGuardarCambiosToolBarCompoKit;
	protected JButton jButtonCopiarToolBarCompoKit;
	protected JButton jButtonVerFormToolBarCompoKit;
	public JButton jButtonGuardarCambiosTablaToolBarCompoKit;
	protected JButton jButtonMostrarOcultarTablaToolBarCompoKit;
	protected JButton jButtonCerrarToolBarCompoKit;
	
	protected JButton jButtonRecargarInformacionToolBarCompoKit;
	protected JButton jButtonProcesarInformacionToolBarCompoKit;
	protected JButton jButtonAnterioresToolBarCompoKit;
	protected JButton jButtonSiguientesToolBarCompoKit;
	protected JButton jButtonNuevoGuardarCambiosToolBarCompoKit;
	protected JButton jButtonAbrirOrderByToolBarCompoKit;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCompoKit;
	protected JMenuItem jMenuItemDuplicarCompoKit;
	protected JMenuItem jMenuItemNuevoRelacionesCompoKit;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCompoKit;
	protected JMenuItem jMenuItemCopiarCompoKit;
	protected JMenuItem jMenuItemVerFormCompoKit;
	protected JMenuItem jMenuItemGuardarCambiosTablaCompoKit;
	protected JMenuItem jMenuItemCerrarCompoKit;
	protected JMenuItem jMenuItemDetalleCerrarCompoKit;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCompoKit;
	protected JMenuItem jMenuItemDetalleMostarOcultarCompoKit;
	
	protected JMenuItem jMenuItemRecargarInformacionCompoKit;
	protected JMenuItem jMenuItemProcesarInformacionCompoKit;
	protected JMenuItem jMenuItemAnterioresCompoKit;
	protected JMenuItem jMenuItemSiguientesCompoKit;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCompoKit;
	protected JMenuItem jMenuItemAbrirOrderByCompoKit;
	protected JMenuItem jMenuItemMostrarOcultarCompoKit;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCompoKit;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCompoKit;
	protected JCheckBox jCheckBoxSeleccionadosCompoKit;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCompoKit;
	protected JCheckBox jCheckBoxConGraficoReporteCompoKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCompoKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCompoKit;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCompoKit;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCompoKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCompoKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCompoKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCompoKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCompoKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCompoKit;
	protected JTextField jTextFieldValorCampoGeneralCompoKit;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCompoKit;
	//public JList<Reporte> jListColumnasSelectReporteCompoKit;
	//public JScrollPane jScrollColumnasSelectReporteCompoKit;
	
	//public JLabel jLabelRelacionesSelectReporteCompoKit;
	//public JList<Reporte> jListRelacionesSelectReporteCompoKit;
	//public JScrollPane jScrollRelacionesSelectReporteCompoKit;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCompoKit;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCompoKit;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCompoKit;
	//public JLabel jLabelTiposArchivoReporteDinamicoCompoKit;
	
		
	//public JLabel jLabelArchivoImportacionCompoKit;	
	//public JLabel jLabelPathArchivoImportacionCompoKit;
	//protected JTextField jTextFieldPathArchivoImportacionCompoKit;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCompoKit;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCompoKit;
	
	//public JLabel jLabelColumnaCategoriaValorCompoKit;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCompoKit;
	
	//public JLabel jLabelColumnasValoresGraficoCompoKit;
	//public JList<Reporte> jListColumnasValoresGraficoCompoKit;
	//public JScrollPane jScrollColumnasValoresGraficoCompoKit;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCompoKit;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCompoKit;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCompoKit;
	public JPanel jPanelFK_IdBodegaCompoKit;
	public JButton jButtonFK_IdBodegaCompoKit;
	public JPanel jPanelFK_IdKitCompoKit;
	public JButton jButtonFK_IdKitCompoKit;
	public JPanel jPanelFK_IdProductoCompoKit;
	public JButton jButtonFK_IdProductoCompoKit;
	public JPanel jPanelFK_IdUnidadCompoKit;
	public JButton jButtonFK_IdUnidadCompoKit;
	
	public JPanel jPanelid_bodegaFK_IdBodegaCompoKit;
	public JLabel jLabelid_bodegaFK_IdBodegaCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaCompoKit;
	public JButton jButtonid_bodegaFK_IdBodegaCompoKit= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCompoKitBusqueda= new JButtonMe();

	
	public JPanel jPanelid_kitFK_IdKitCompoKit;
	public JLabel jLabelid_kitFK_IdKitCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_kitFK_IdKitCompoKit;
	public JButton jButtonid_kitFK_IdKitCompoKit= new JButtonMe();
	public JButton jButtonid_kitFK_IdKitCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_kitFK_IdKitCompoKitBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoCompoKit;
	public JLabel jLabelid_productoFK_IdProductoCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoCompoKit;
	public JButton jButtonid_productoFK_IdProductoCompoKit= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoCompoKitBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoCompoKit;
	
	public JPanel jPanelid_unidadFK_IdUnidadCompoKit;
	public JLabel jLabelid_unidadFK_IdUnidadCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadCompoKit;
	public JButton jButtonid_unidadFK_IdUnidadCompoKit= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadCompoKitBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CompoKitJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCompoKit)	{
		this.jButtonRecargarInformacionCompoKit = jButtonRecargarInformacionCompoKit;
	}
	
	public JButton getjButtonProcesarInformacionCompoKit() {
		return this.jButtonProcesarInformacionCompoKit;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCompoKit)	{
		this.jButtonProcesarInformacionCompoKit = jButtonProcesarInformacionCompoKit;
	}
	
	
	public JButton getjButtonRecargarInformacionCompoKit() {
		return this.jButtonRecargarInformacionCompoKit;
	}
	
	
	public List<CompoKit> getcompokits() {
		return this.compokits;
	}

	public void setcompokits(List<CompoKit> compokits) {
		this.compokits = compokits;
	}
	
	public List<CompoKit> getcompokitsAux() {
		return this.compokitsAux;
	}

	public void setcompokitsAux(List<CompoKit> compokitsAux) {
		this.compokitsAux = compokitsAux;
	}
	
	public List<CompoKit> getcompokitsEliminados() {
		return this.compokitsEliminados;
	}

	public void setCompoKitsEliminados(List<CompoKit> compokitsEliminados) {
		this.compokitsEliminados = compokitsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCompoKit() {
		return jComboBoxTiposSeleccionarCompoKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCompoKit(
			JComboBox jComboBoxTiposSeleccionarCompoKit) {
		this.jComboBoxTiposSeleccionarCompoKit = jComboBoxTiposSeleccionarCompoKit;
	}
	
	public void setBorderResaltarTiposSeleccionarCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCompoKit .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCompoKit() {
		return jTextFieldValorCampoGeneralCompoKit;
	}

	public void setjTextFieldValorCampoGeneralCompoKit(
			JTextField jTextFieldValorCampoGeneralCompoKit) {
		this.jTextFieldValorCampoGeneralCompoKit = jTextFieldValorCampoGeneralCompoKit;
	}

	public void setBorderResaltarValorCampoGeneralCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCompoKit .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCompoKit() {
		return this.jCheckBoxSeleccionarTodosCompoKit;
	}

	public void setjCheckBoxSeleccionarTodosCompoKit(
			JCheckBox jCheckBoxSeleccionarTodosCompoKit) {
		this.jCheckBoxSeleccionarTodosCompoKit = jCheckBoxSeleccionarTodosCompoKit;
	}

	public void setBorderResaltarSeleccionarTodosCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCompoKit .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCompoKit() {
		return this.jCheckBoxSeleccionadosCompoKit;
	}

	public void setjCheckBoxSeleccionadosCompoKit(
			JCheckBox jCheckBoxSeleccionadosCompoKit) {
		this.jCheckBoxSeleccionadosCompoKit = jCheckBoxSeleccionadosCompoKit;
	}
	
	public void setBorderResaltarSeleccionadosCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCompoKit .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCompoKit() {
		return this.jComboBoxTiposArchivosReportesCompoKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCompoKit(
			JComboBox jComboBoxTiposArchivosReportesCompoKit) {
		this.jComboBoxTiposArchivosReportesCompoKit = jComboBoxTiposArchivosReportesCompoKit;
	}

	public void setBorderResaltarTiposArchivosReportesCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCompoKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCompoKit() {
		return this.jComboBoxTiposReportesCompoKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCompoKit(
			JComboBox jComboBoxTiposReportesCompoKit) {
		this.jComboBoxTiposReportesCompoKit = jComboBoxTiposReportesCompoKit;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCompoKit() {
	//	return jComboBoxTiposReportesDinamicoCompoKit;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCompoKit(
	//		JComboBox jComboBoxTiposReportesDinamicoCompoKit) {
	//	this.jComboBoxTiposReportesDinamicoCompoKit = jComboBoxTiposReportesDinamicoCompoKit;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCompoKit() {
	//	return jComboBoxTiposArchivosReportesDinamicoCompoKit;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCompoKit(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCompoKit) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCompoKit = jComboBoxTiposArchivosReportesDinamicoCompoKit;
	//}
	
	public void setBorderResaltarTiposReportesCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCompoKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCompoKit() {
		return this.jComboBoxTiposGraficosReportesCompoKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCompoKit(
			JComboBox jComboBoxTiposGraficosReportesCompoKit) {
		this.jComboBoxTiposGraficosReportesCompoKit = jComboBoxTiposGraficosReportesCompoKit;
	}
	
	public void setBorderResaltarTiposGraficosReportesCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCompoKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCompoKit() {
		return this.jComboBoxTiposPaginacionCompoKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCompoKit(
			JComboBox jComboBoxTiposPaginacionCompoKit) {
		this.jComboBoxTiposPaginacionCompoKit = jComboBoxTiposPaginacionCompoKit;
	}
	
	public void setBorderResaltarTiposPaginacionCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCompoKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCompoKit() {
		return this.jComboBoxTiposRelacionesCompoKit;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCompoKit() {
		return this.jComboBoxTiposAccionesCompoKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCompoKit(
			JComboBox jComboBoxTiposRelacionesCompoKit) {
		this.jComboBoxTiposRelacionesCompoKit = jComboBoxTiposRelacionesCompoKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCompoKit(
			JComboBox jComboBoxTiposAccionesCompoKit) {
		this.jComboBoxTiposAccionesCompoKit = jComboBoxTiposAccionesCompoKit;
	}
	
	public void setBorderResaltarTiposRelacionesCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCompoKit .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCompoKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompoKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCompoKit .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCompoKit() {
	//	return jCheckBoxConGraficoDinamicoCompoKit;
	//}

	//public void setjCheckBoxConGraficoDinamicoCompoKit(
	//		JCheckBox jCheckBoxConGraficoDinamicoCompoKit) {
	//	this.jCheckBoxConGraficoDinamicoCompoKit = jCheckBoxConGraficoDinamicoCompoKit;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCompoKit() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCompoKit.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCompoKit .setBorder(borderResaltar);		
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
		this.compokitSessionBean=new CompoKitSessionBean();
		
		this.compokitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.compokitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.compokitSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CompoKitJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Compo Kit MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
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
		
		CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCompoKit= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCompoKit,this.jTtoolBarCompoKit,
							"nuevo","nuevo","Nuevo"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCompoKit,this.jTtoolBarCompoKit,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCompoKit,this.jTtoolBarCompoKit,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCompoKit,this.jTtoolBarCompoKit,
							"duplicar","duplicar","Duplicar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCompoKit,this.jTtoolBarCompoKit,
							"copiar","copiar","Copiar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCompoKit,this.jTtoolBarCompoKit,
							"ver_form","ver_form","Ver"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompoKit,this.jTtoolBarCompoKit,
							"recargar","recargar","Recargar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompoKit,this.jTtoolBarCompoKit,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompoKit,this.jTtoolBarCompoKit,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCompoKit,this.jTtoolBarCompoKit,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCompoKit,this.jTtoolBarCompoKit,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCompoKit,this.jTtoolBarCompoKit,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCompoKit,this.jTtoolBarCompoKit,
							"cerrar","cerrar","Salir"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCompoKit=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCompoKit;
			
				this.jButtonProcesarInformacionToolBarCompoKit=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCompoKit;
				
		//protected JButton jButtonModificarToolBarCompoKit;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCompoKit=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCompoKit=new JMenuMe("General");
		this.jmenuArchivoCompoKit=new JMenuMe("Archivo");
		this.jmenuAccionesCompoKit=new JMenuMe("Acciones");
		this.jmenuDatosCompoKit=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCompoKit= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCompoKit.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCompoKit,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCompoKit= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCompoKit.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCompoKit,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCompoKit= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCompoKit.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCompoKit,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCompoKit= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCompoKit.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCompoKit,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCompoKit= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCompoKit.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCompoKit,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCompoKit= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCompoKit.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCompoKit,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCompoKit= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCompoKit.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCompoKit,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCompoKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCompoKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCompoKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCompoKit= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCompoKit.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCompoKit,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCompoKit= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCompoKit.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCompoKit,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCompoKit= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCompoKit.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCompoKit,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCompoKit= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCompoKit.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCompoKit,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCompoKit= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCompoKit.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCompoKit,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCompoKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCompoKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCompoKit,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCompoKit= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCompoKit.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCompoKit,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCompoKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCompoKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCompoKit,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCompoKit= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCompoKit.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCompoKit,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCompoKit.add(this.jMenuItemCerrarCompoKit);
			
			this.jmenuAccionesCompoKit.add(this.jMenuItemNuevoCompoKit);
			this.jmenuAccionesCompoKit.add(this.jMenuItemNuevoGuardarCambiosCompoKit);
			this.jmenuAccionesCompoKit.add(this.jMenuItemNuevoRelacionesCompoKit);
			this.jmenuAccionesCompoKit.add(this.jMenuItemGuardarCambiosTablaCompoKit);		
			this.jmenuAccionesCompoKit.add(this.jMenuItemDuplicarCompoKit);		
			this.jmenuAccionesCompoKit.add(this.jMenuItemCopiarCompoKit);		
			this.jmenuAccionesCompoKit.add(this.jMenuItemVerFormCompoKit);		
			
			this.jmenuDatosCompoKit.add(this.jMenuItemRecargarInformacionCompoKit);				
			this.jmenuDatosCompoKit.add(this.jMenuItemAnterioresCompoKit);				
			this.jmenuDatosCompoKit.add(this.jMenuItemSiguientesCompoKit);				
			this.jmenuDatosCompoKit.add(this.jMenuItemAbrirOrderByCompoKit);				
			this.jmenuDatosCompoKit.add(this.jMenuItemMostrarOcultarCompoKit);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCompoKit.add(this.jMenuItemGuardarCambiosCompoKit);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCompoKit.add(this.jmenuArchivoCompoKit);		
			this.jmenuBarCompoKit.add(this.jmenuAccionesCompoKit);		
			this.jmenuBarCompoKit.add(this.jmenuDatosCompoKit);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCompoKit);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCompoKit() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaCompoKit.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaCompoKit= new JButtonMe();
		this.jButtonFK_IdBodegaCompoKit.setText("Buscar");
		this.jButtonFK_IdBodegaCompoKit.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaCompoKit,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaCompoKit = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaCompoKit.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaCompoKit.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaCompoKit= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdKitCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdKitCompoKit.setToolTipText("Buscar Por Kit ");
		this.jButtonFK_IdKitCompoKit= new JButtonMe();
		this.jButtonFK_IdKitCompoKit.setText("Buscar");
		this.jButtonFK_IdKitCompoKit.setToolTipText("Buscar Por Kit ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdKitCompoKit,"buscar_button","Buscar Por Kit ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdKitCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_kitFK_IdKitCompoKit = new JLabelMe();
		jLabelid_kitFK_IdKitCompoKit.setText("Kit :");
		jLabelid_kitFK_IdKitCompoKit.setToolTipText("Kit");
		jLabelid_kitFK_IdKitCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_kitFK_IdKitCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_kitFK_IdKitCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_kitFK_IdKitCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_kitFK_IdKitCompoKit= new JComboBoxMe();
		jComboBoxid_kitFK_IdKitCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_kitFK_IdKitCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_kitFK_IdKitCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_kitFK_IdKitCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoCompoKit.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoCompoKit= new JButtonMe();
		this.jButtonFK_IdProductoCompoKit.setText("Buscar");
		this.jButtonFK_IdProductoCompoKit.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoCompoKit,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoCompoKit = new JLabelMe();
		jLabelid_productoFK_IdProductoCompoKit.setText("Producto :");
		jLabelid_productoFK_IdProductoCompoKit.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoCompoKit= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoCompoKit= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoCompoKit.setFocusable(false);

		this.jPanelFK_IdUnidadCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadCompoKit.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadCompoKit= new JButtonMe();
		this.jButtonFK_IdUnidadCompoKit.setText("Buscar");
		this.jButtonFK_IdUnidadCompoKit.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadCompoKit,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadCompoKit = new JLabelMe();
		jLabelid_unidadFK_IdUnidadCompoKit.setText("Unad :");
		jLabelid_unidadFK_IdUnidadCompoKit.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadCompoKit= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCompoKit=new JTabbedPane();


		this.jTabbedPaneBusquedasCompoKit.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCompoKit.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCompoKit.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCompoKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCompoKit = new CompoKitDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Compo Kit DATOS");
			this.jInternalFrameDetalleFormCompoKit = new CompoKitDetalleFormJInternalFrame(jDesktopPane,this.compokitSessionBean.getConGuardarRelaciones(),this.compokitSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCompoKit = null;//new CompoKitDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCompoKit= new GridBagLayout();
		
		
		this.jTableDatosCompoKit = new JTableMe();      
		
		String sToolTipCompoKit="";
		sToolTipCompoKit=CompoKitConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCompoKit+="(Inventario.CompoKit)";
		}
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			sToolTipCompoKit+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCompoKit.setToolTipText(sToolTipCompoKit);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCompoKit);
		this.jTableDatosCompoKit.setAutoCreateRowSorter(true);
		this.jTableDatosCompoKit.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCompoKit.setRowSelectionAllowed(true);
		this.jTableDatosCompoKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCompoKit,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCompoKit = new JButtonMe();
		this.jButtonDuplicarCompoKit = new JButtonMe();
		this.jButtonCopiarCompoKit = new JButtonMe();
		this.jButtonVerFormCompoKit = new JButtonMe();
		this.jButtonNuevoRelacionesCompoKit = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCompoKit = new JButtonMe();
		this.jButtonCerrarCompoKit = new JButtonMe();
		
		this.jScrollPanelDatosCompoKit = new JScrollPane();   
        this.jScrollPanelDatosGeneralCompoKit = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Compo Kit";
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites" + this.sPath));
		} else {
			this.jScrollPanelDatosCompoKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCompoKit.setToolTipText("Acciones");
        this.jPanelAccionesCompoKit.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCompoKit=new ReporteDinamicoJInternalFrame(CompoKitConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCompoKit();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCompoKit=new ImportacionJInternalFrame(CompoKitConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCompoKit();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCompoKit = new JButtonMe();
		
		this.jButtonAbrirOrderByCompoKit.setText("Orden");
		this.jButtonAbrirOrderByCompoKit.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCompoKit,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCompoKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompoKit,false,this);
			
			//this.cargarOrderByCompoKit(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCompoKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompoKit,true,this);
			
			//this.cargarOrderByCompoKit(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCompoKit.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosCompoKit.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosCompoKit.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosCompoKit.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCompoKit.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCompoKit.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCompoKit.setText("Nuevo");
		this.jButtonDuplicarCompoKit.setText("Duplicar");
		this.jButtonCopiarCompoKit.setText("Copiar");
		this.jButtonVerFormCompoKit.setText("Ver");
		this.jButtonNuevoRelacionesCompoKit.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCompoKit.setText("Guardar");
		this.jButtonCerrarCompoKit.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCompoKit,"nuevo_button","Nuevo",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCompoKit,"duplicar_button","Duplicar",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCompoKit,"copiar_button","Copiar",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCompoKit,"ver_form","Ver",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCompoKit,"nuevorelaciones_button","Nuevo Rel",this.compokitSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCompoKit,"guardarcambiostabla_button","Guardar",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCompoKit,"cerrar_button","Salir",this.compokitSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCompoKit.setToolTipText("Nuevo"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCompoKit.setToolTipText("Duplicar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCompoKit.setToolTipText("Copiar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCompoKit.setToolTipText("Ver"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCompoKit.setToolTipText("Nuevo Rel"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCompoKit.setToolTipText("Guardar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCompoKit.setToolTipText("Salir"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCompoKit";
		inputMap = this.jButtonNuevoCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCompoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCompoKit"));
		
		//DUPLICAR
		sMapKey = "DuplicarCompoKit";
		inputMap = this.jButtonDuplicarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCompoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCompoKit"));
		
		//COPIAR
		sMapKey = "CopiarCompoKit";
		inputMap = this.jButtonCopiarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCompoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCompoKit"));
		
		//VEr FORM
		sMapKey = "VerFormCompoKit";
		inputMap = this.jButtonVerFormCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCompoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCompoKit"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCompoKit";
		inputMap = this.jButtonNuevoRelacionesCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCompoKit"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCompoKit";
		inputMap = this.jButtonModificarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCompoKit"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCompoKit";
		inputMap = this.jButtonCerrarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCompoKit"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCompoKit";
		inputMap = this.jButtonGuardarCambiosTablaCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCompoKit"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCompoKit.setName("jPanelParametrosReportesCompoKit"); 
		
		this.jPanelParametrosReportesAccionesCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCompoKit.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCompoKit.setName("jPanelParametrosReportesAccionesCompoKit"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCompoKit = new JButtonMe();
		this.jButtonRecargarInformacionCompoKit.setText("Recargar");
		this.jButtonRecargarInformacionCompoKit.setToolTipText("Recargar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCompoKit,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCompoKit = new JButtonMe();
		this.jButtonProcesarInformacionCompoKit.setText("Procesar");
		this.jButtonProcesarInformacionCompoKit.setToolTipText("Procesar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCompoKit.setVisible(false);
			
		this.jButtonProcesarInformacionCompoKit.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCompoKit.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCompoKit.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompoKit.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCompoKit.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompoKit.setText("TIPO");       
		this.jComboBoxTiposReportesCompoKit.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompoKit.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCompoKit.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCompoKit.setText("Paginacion");
		this.jComboBoxTiposPaginacionCompoKit.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCompoKit.setText("Accion");
		this.jComboBoxTiposRelacionesCompoKit.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCompoKit.setText("Accion");
		this.jComboBoxTiposAccionesCompoKit.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCompoKit.setText("Accion");
		this.jComboBoxTiposSeleccionarCompoKit.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCompoKit=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCompoKit.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCompoKit.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCompoKit.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCompoKit = new JLabelMe();
		
		this.jLabelAccionesCompoKit.setText("Acciones");		
		this.jLabelAccionesCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCompoKit = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCompoKit.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCompoKit.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCompoKit = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCompoKit.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCompoKit.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCompoKit = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCompoKit.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCompoKit.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCompoKit = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCompoKit.setText("Graf.");
		this.jCheckBoxConGraficoReporteCompoKit.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCompoKit = new JButtonMe();
		//this.jButtonAnterioresCompoKit.setText("<<");
        this.jButtonAnterioresCompoKit.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCompoKit,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCompoKit = new JButtonMe();
		//this.jButtonSiguientesCompoKit.setText(">>");
        this.jButtonSiguientesCompoKit.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCompoKit,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCompoKit = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCompoKit.setText("Nue");
        this.jButtonNuevoGuardarCambiosCompoKit.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCompoKit,"nuevoguardarcambios_button","Nue",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCompoKit";
		inputMap = this.jButtonNuevoGuardarCambiosCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCompoKit"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCompoKit";
		inputMap = this.jButtonRecargarInformacionCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCompoKit"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCompoKit";
		inputMap = this.jButtonSiguientesCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCompoKit"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCompoKit";
		inputMap = this.jButtonAnterioresCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCompoKit"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCompoKit();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCompoKit.setMinimumSize(new Dimension(this.getWidth(),CompoKitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompoKitBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCompoKit.setMaximumSize(new Dimension(this.getWidth(),CompoKitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompoKitBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCompoKit.setPreferredSize(new Dimension(this.getWidth(),CompoKitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompoKitBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCompoKit = new GridBagLayout();

			this.jPanelPaginacionCompoKit.setLayout(gridaBagLayoutPaginacionCompoKit);						
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 0;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCompoKit.add(this.jButtonAnterioresCompoKit, this.gridBagConstraintsCompoKit);
					
						
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCompoKit.gridy = 0;
			
			this.jPanelPaginacionCompoKit.add(this.jButtonNuevoGuardarCambiosCompoKit, this.gridBagConstraintsCompoKit);
						
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCompoKit.gridy = 0;
			this.jPanelPaginacionCompoKit.add(this.jButtonSiguientesCompoKit, this.gridBagConstraintsCompoKit);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 1;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCompoKit.add(this.jButtonNuevoCompoKit, this.gridBagConstraintsCompoKit);
						
			
			
			if(!this.compokitSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCompoKit = new GridBagConstraints();
				this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCompoKit.gridy = 1;
				this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCompoKit.add(this.jButtonGuardarCambiosTablaCompoKit, this.gridBagConstraintsCompoKit);
			}
			
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 1;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCompoKit.add(this.jButtonDuplicarCompoKit, this.gridBagConstraintsCompoKit);
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 1;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCompoKit.add(this.jButtonCopiarCompoKit, this.gridBagConstraintsCompoKit);
		
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 1;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCompoKit.add(this.jButtonVerFormCompoKit, this.gridBagConstraintsCompoKit);
		
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 1;
			this.gridBagConstraintsCompoKit.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCompoKit.add(this.jButtonCerrarCompoKit, this.gridBagConstraintsCompoKit);
		
		
		
		this.jButtonRecargarInformacionCompoKit.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCompoKit.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCompoKit.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCompoKit.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCompoKit.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCompoKit.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCompoKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCompoKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCompoKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCompoKit.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCompoKit.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCompoKit.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCompoKit.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCompoKit.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCompoKit.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCompoKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCompoKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCompoKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCompoKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompoKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompoKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCompoKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCompoKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCompoKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCompoKit.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCompoKit.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCompoKit.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCompoKit.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCompoKit.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCompoKit.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCompoKit.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCompoKit.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCompoKit.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCompoKit.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCompoKit.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCompoKit.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCompoKit = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCompoKit = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CompoKit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CompoKit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CompoKit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CompoKit = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCompoKit.setLayout(gridaBagParametrosReportesCompoKit);
			this.jPanelParametrosReportesAccionesCompoKit.setLayout(gridaBagParametrosReportesAccionesCompoKit);
			
			
			this.jPanelParametrosAuxiliar1CompoKit.setLayout(gridaBagParametrosAuxiliar1CompoKit);
			this.jPanelParametrosAuxiliar2CompoKit.setLayout(gridaBagParametrosAuxiliar2CompoKit);
			this.jPanelParametrosAuxiliar3CompoKit.setLayout(gridaBagParametrosAuxiliar3CompoKit);
			this.jPanelParametrosAuxiliar4CompoKit.setLayout(gridaBagParametrosAuxiliar4CompoKit);
			//this.jPanelParametrosAuxiliar5CompoKit.setLayout(gridaBagParametrosAuxiliar2CompoKit);			
			
			
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompoKit.add(this.jButtonRecargarInformacionCompoKit, this.gridBagConstraintsCompoKit);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CompoKit.add(this.jComboBoxTiposPaginacionCompoKit, this.gridBagConstraintsCompoKit);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CompoKit.add(this.jCheckBoxConAltoMaximoTablaCompoKit, this.gridBagConstraintsCompoKit);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CompoKit.add(this.jComboBoxTiposArchivosReportesCompoKit, this.gridBagConstraintsCompoKit);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompoKit.add(this.jPanelParametrosAuxiliar1CompoKit, this.gridBagConstraintsCompoKit);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CompoKit.add(this.jComboBoxTiposReportesCompoKit, this.gridBagConstraintsCompoKit);																		
			
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CompoKit.add(this.jComboBoxTiposGraficosReportesCompoKit, this.gridBagConstraintsCompoKit);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompoKit.add(this.jPanelParametrosAuxiliar4CompoKit, this.gridBagConstraintsCompoKit);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompoKit.add(this.jComboBoxTiposReportesCompoKit, this.gridBagConstraintsCompoKit);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompoKit.add(this.jCheckBoxGenerarReporteCompoKit, this.gridBagConstraintsCompoKit);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompoKit.add(this.jPanelParametrosAuxiliar2CompoKit, this.gridBagConstraintsCompoKit);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompoKit.add(this.jLabelAccionesCompoKit, this.gridBagConstraintsCompoKit);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCompoKit = new GridBagConstraints();
				this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCompoKit.add(this.jButtonAbrirOrderByCompoKit, this.gridBagConstraintsCompoKit);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompoKit.add(this.jComboBoxTiposSeleccionarCompoKit, this.gridBagConstraintsCompoKit);			
			
			
			/*
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompoKit.add(this.jCheckBoxSeleccionarTodosCompoKit, this.gridBagConstraintsCompoKit);
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompoKit.add(this.jCheckBoxConGraficoReporteCompoKit, this.gridBagConstraintsCompoKit);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CompoKit.add(this.jCheckBoxSeleccionarTodosCompoKit, this.gridBagConstraintsCompoKit);															
				
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CompoKit.add(this.jCheckBoxSeleccionadosCompoKit, this.gridBagConstraintsCompoKit);															
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompoKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CompoKit.add(this.jCheckBoxConGraficoReporteCompoKit, this.gridBagConstraintsCompoKit);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompoKit.add(this.jPanelParametrosAuxiliar3CompoKit, this.gridBagConstraintsCompoKit);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompoKit.add(this.jComboBoxTiposAccionesCompoKit, this.gridBagConstraintsCompoKit);
	
				
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompoKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompoKit.add(this.jTextFieldValorCampoGeneralCompoKit, this.gridBagConstraintsCompoKit);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCompoKit = new GridBagLayout();

			this.jScrollPanelDatosCompoKit.setLayout(gridaBagLayoutDatosCompoKit);
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = 0;
			this.gridBagConstraintsCompoKit.gridx = 0;
			
			this.jScrollPanelDatosCompoKit.add(this.jTableDatosCompoKit, this.gridBagConstraintsCompoKit);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCompoKit.setViewportView(this.jTableDatosCompoKit);
		this.jTableDatosCompoKit.setFillsViewportHeight(true);
		this.jTableDatosCompoKit.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCompoKit= new GridBagLayout();
		this.jPanelAccionesCompoKit.setLayout(gridaBagLayoutAccionesCompoKit);
		
		
		/*	
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 0;
			
		this.jPanelAccionesCompoKit.add(this.jButtonNuevoCompoKit, this.gridBagConstraintsCompoKit);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaCompoKit= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaCompoKit.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaCompoKit.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaCompoKit.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaCompoKit.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaCompoKit.setLayout(gridaBagLayoutFK_IdBodegaCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 0;
		jPanelFK_IdBodegaCompoKit.add(jLabelid_bodegaFK_IdBodegaCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 1;
		jPanelFK_IdBodegaCompoKit.add(jComboBoxid_bodegaFK_IdBodegaCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 1;
		gridBagConstraintsCompoKit.gridx =1;
		jPanelFK_IdBodegaCompoKit.add(jButtonFK_IdBodegaCompoKit, gridBagConstraintsCompoKit);

		jTabbedPaneBusquedasCompoKit.addTab("1.-Por Bodega ", jPanelFK_IdBodegaCompoKit);
		jTabbedPaneBusquedasCompoKit.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdKitCompoKit= new GridBagLayout();
		gridaBagLayoutFK_IdKitCompoKit.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdKitCompoKit.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdKitCompoKit.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdKitCompoKit.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdKitCompoKit.setLayout(gridaBagLayoutFK_IdKitCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 0;
		jPanelFK_IdKitCompoKit.add(jLabelid_kitFK_IdKitCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 1;
		jPanelFK_IdKitCompoKit.add(jComboBoxid_kitFK_IdKitCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 1;
		gridBagConstraintsCompoKit.gridx =1;
		jPanelFK_IdKitCompoKit.add(jButtonFK_IdKitCompoKit, gridBagConstraintsCompoKit);

		jTabbedPaneBusquedasCompoKit.addTab("2.-Por Kit ", jPanelFK_IdKitCompoKit);
		jTabbedPaneBusquedasCompoKit.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoCompoKit= new GridBagLayout();
		gridaBagLayoutFK_IdProductoCompoKit.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoCompoKit.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoCompoKit.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoCompoKit.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoCompoKit.setLayout(gridaBagLayoutFK_IdProductoCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 0;
		jPanelFK_IdProductoCompoKit.add(jLabelid_productoFK_IdProductoCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 1;
		jPanelFK_IdProductoCompoKit.add(jComboBoxid_productoFK_IdProductoCompoKit, gridBagConstraintsCompoKit);


		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 0;
		jPanelFK_IdProductoCompoKit.add(this.jButtonBuscarFK_IdProductoid_productoCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 1;
		gridBagConstraintsCompoKit.gridx =1;
		jPanelFK_IdProductoCompoKit.add(jButtonFK_IdProductoCompoKit, gridBagConstraintsCompoKit);

		jTabbedPaneBusquedasCompoKit.addTab("3.-Por Producto ", jPanelFK_IdProductoCompoKit);
		jTabbedPaneBusquedasCompoKit.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadCompoKit= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadCompoKit.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadCompoKit.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadCompoKit.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadCompoKit.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadCompoKit.setLayout(gridaBagLayoutFK_IdUnidadCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 0;
		jPanelFK_IdUnidadCompoKit.add(jLabelid_unidadFK_IdUnidadCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 0;
		gridBagConstraintsCompoKit.gridx = 1;
		jPanelFK_IdUnidadCompoKit.add(jComboBoxid_unidadFK_IdUnidadCompoKit, gridBagConstraintsCompoKit);

		gridBagConstraintsCompoKit = new GridBagConstraints();
		gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompoKit.gridy = 1;
		gridBagConstraintsCompoKit.gridx =1;
		jPanelFK_IdUnidadCompoKit.add(jButtonFK_IdUnidadCompoKit, gridBagConstraintsCompoKit);

		jTabbedPaneBusquedasCompoKit.addTab("4.-Por Unad ", jPanelFK_IdUnidadCompoKit);
		jTabbedPaneBusquedasCompoKit.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCompoKit = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCompoKit);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.compokitSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCompoKit = new GridBagConstraints();						
			this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompoKit.gridx = 0;		
			//this.gridBagConstraintsCompoKit.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCompoKit.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCompoKit, this.gridBagConstraintsCompoKit);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCompoKit.gridx = 0;		
		//this.gridBagConstraintsCompoKit.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCompoKit.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCompoKit);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompoKit.gridx = 0;		
			this.gridBagConstraintsCompoKit.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCompoKit.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCompoKit, this.gridBagConstraintsCompoKit);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCompoKit, this.gridBagConstraintsCompoKit);								
		
		
		/*
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCompoKit, this.gridBagConstraintsCompoKit);
		*/		
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCompoKit.gridx =0;
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCompoKit.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCompoKit, this.gridBagConstraintsCompoKit);
				
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCompoKit, this.gridBagConstraintsCompoKit);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CompoKitJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCompoKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCompoKit = new GridBagLayout();
			this.jPanelBusquedasParametrosCompoKit.setLayout(gridaBagLayoutBusquedasParametrosCompoKit);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCompoKit=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCompoKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompoKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompoKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCompoKit, this.gridBagConstraintsCompoKit);
			
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCompoKit, this.gridBagConstraintsCompoKit);
		
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCompoKit, this.gridBagConstraintsCompoKit);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCompoKit;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCompoKit() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCompoKit = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCompoKit.setName("jPanelReporteDinamicoCompoKit"); 
		
		this.jPanelReporteDinamicoCompoKit.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCompoKit.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCompoKit.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCompoKit.setLayout(gridaBagLayoutReporteDinamicoCompoKit);
		
		
		this.jInternalFrameReporteDinamicoCompoKit= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCompoKit = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCompoKit= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCompoKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCompoKit.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCompoKit.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCompoKit.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCompoKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCompoKit.setResizable(true);
	    this.jInternalFrameReporteDinamicoCompoKit.setClosable(true);
	    this.jInternalFrameReporteDinamicoCompoKit.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCompoKit.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCompoKit.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCompoKit.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCompoKit = new JLabelMe();

		this.jLabelColumnasSelectReporteCompoKit.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelColumnasSelectReporteCompoKit, this.gridBagConstraintsCompoKit);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCompoKit = new JList<Reporte>();
		this.jListColumnasSelectReporteCompoKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCompoKit.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCompoKit.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCompoKit.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCompoKit.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCompoKit=new JScrollPane(this.jListColumnasSelectReporteCompoKit);
			
			this.jScrollColumnasSelectReporteCompoKit.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCompoKit.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCompoKit.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCompoKit.add(this.jListColumnasSelectReporteCompoKit, this.gridBagConstraintsCompoKit);
		this.jPanelReporteDinamicoCompoKit.add(this.jScrollColumnasSelectReporteCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCompoKit = new JLabelMe();

		this.jLabelRelacionesSelectReporteCompoKit.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCompoKit = new JList<Reporte>();
		this.jListRelacionesSelectReporteCompoKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCompoKit.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCompoKit.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCompoKit.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCompoKit.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCompoKit=new JScrollPane(this.jListRelacionesSelectReporteCompoKit);
			
			this.jScrollRelacionesSelectReporteCompoKit.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCompoKit.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCompoKit.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCompoKit = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCompoKit = new JComboBoxMe();
		this.jListColumnasValoresGraficoCompoKit = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCompoKit = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCompoKit.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCompoKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCompoKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCompoKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCompoKit = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCompoKit.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCompoKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCompoKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCompoKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCompoKit = new JLabelMe();

		this.jLabelConGraficoDinamicoCompoKit.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelConGraficoDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCompoKit = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCompoKit.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCompoKit.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCompoKit.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCompoKit.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCompoKit.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jCheckBoxConGraficoDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCompoKit = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCompoKit.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelColumnaCategoriaGraficoCompoKit, this.gridBagConstraintsCompoKit);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCompoKit = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCompoKit.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCompoKit.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCompoKit.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCompoKit.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCompoKit.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCompoKit.add(this.jComboBoxColumnaCategoriaGraficoCompoKit, this.gridBagConstraintsCompoKit);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCompoKit = new JLabelMe();

		this.jLabelColumnaCategoriaValorCompoKit.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelColumnaCategoriaValorCompoKit, this.gridBagConstraintsCompoKit);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCompoKit = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCompoKit.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCompoKit.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCompoKit.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCompoKit.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCompoKit.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCompoKit.add(this.jComboBoxColumnaCategoriaValorCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCompoKit = new JLabelMe();

		this.jLabelColumnasValoresGraficoCompoKit.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelColumnasValoresGraficoCompoKit, this.gridBagConstraintsCompoKit);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCompoKit = new JList<Reporte>();
		this.jListColumnasValoresGraficoCompoKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCompoKit.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCompoKit.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCompoKit.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCompoKit.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCompoKit=new JScrollPane(this.jListColumnasValoresGraficoCompoKit);
			
			this.jScrollColumnasValoresGraficoCompoKit.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCompoKit.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCompoKit.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCompoKit.add(this.jListColumnasSelectReporteCompoKit, this.gridBagConstraintsCompoKit);
		this.jPanelReporteDinamicoCompoKit.add(this.jScrollColumnasValoresGraficoCompoKit, this.gridBagConstraintsCompoKit);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCompoKit = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCompoKit.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelTiposGraficosReportesDinamicoCompoKit, this.gridBagConstraintsCompoKit);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCompoKit = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCompoKit.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCompoKit.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCompoKit.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCompoKit.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCompoKit.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jComboBoxTiposGraficosReportesDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCompoKit = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCompoKit.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelGenerarExcelReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCompoKit = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCompoKit.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCompoKit,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCompoKit.setToolTipText("Generar EXCEL"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCompoKit.add(this.jButtonGenerarExcelReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompoKit.add(this.jComboBoxTiposReportesDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCompoKit = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCompoKit.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompoKit.add(this.jLabelTiposArchivoReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompoKit.add(this.jComboBoxTiposArchivosReportesDinamicoCompoKit, this.gridBagConstraintsCompoKit);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCompoKit = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCompoKit.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCompoKit,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCompoKit.setToolTipText("Generar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompoKit.add(this.jButtonGenerarReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCompoKit = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCompoKit.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCompoKit,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCompoKit.setToolTipText("Cancelar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompoKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompoKit.add(this.jButtonCerrarReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCompoKit = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCompoKit= new JScrollPane(jPanelReporteDinamicoCompoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCompoKit.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCompoKit.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCompoKit.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCompoKit.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCompoKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCompoKit.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCompoKit);
		this.jInternalFrameReporteDinamicoCompoKit.getContentPane().add(this.jScrollPanelReporteDinamicoCompoKit, this.gridBagConstraintsCompoKit);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCompoKit() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCompoKit = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCompoKit.setName("jPanelImportacionCompoKit"); 
		
		this.jPanelImportacionCompoKit.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCompoKit.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCompoKit.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCompoKit.setLayout(gridaBagLayoutImportacionCompoKit);
		
		
		this.jInternalFrameImportacionCompoKit= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCompoKit= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCompoKit = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCompoKit= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCompoKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCompoKit.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCompoKit.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCompoKit.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCompoKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCompoKit.setResizable(true);
	    this.jInternalFrameImportacionCompoKit.setClosable(true);
	    this.jInternalFrameImportacionCompoKit.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCompoKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCompoKit.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCompoKit.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCompoKit.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCompoKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCompoKit.setResizable(true);
	    this.jInternalFrameImportacionCompoKit.setClosable(true);
	    this.jInternalFrameImportacionCompoKit.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCompoKit.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCompoKit.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCompoKit.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCompoKit = new JLabelMe();

		this.jLabelArchivoImportacionCompoKit.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;		
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCompoKit.add(this.jLabelArchivoImportacionCompoKit, this.gridBagConstraintsCompoKit);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCompoKit = new JFileChooser();		
		this.jFileChooserImportacionCompoKit.setToolTipText("ESCOGER ARCHIVO"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCompoKit = new JButtonMe();
		this.jButtonAbrirImportacionCompoKit.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCompoKit,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCompoKit.setToolTipText("Generar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompoKit.add(this.jButtonAbrirImportacionCompoKit, this.gridBagConstraintsCompoKit);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCompoKit = new JLabelMe();

		this.jLabelPathArchivoImportacionCompoKit.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;		
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCompoKit.add(this.jLabelPathArchivoImportacionCompoKit, this.gridBagConstraintsCompoKit);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCompoKit=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCompoKit.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCompoKit.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCompoKit.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompoKit.add(this.jTextFieldPathArchivoImportacionCompoKit, this.gridBagConstraintsCompoKit);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCompoKit = new JButtonMe();
		this.jButtonGenerarImportacionCompoKit.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCompoKit,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCompoKit.setToolTipText("Generar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompoKit.add(this.jButtonGenerarImportacionCompoKit, this.gridBagConstraintsCompoKit);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCompoKit = new JButtonMe();
		this.jButtonCerrarImportacionCompoKit.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCompoKit,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCompoKit.setToolTipText("Cancelar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = iPosYImportacion;
		this.gridBagConstraintsCompoKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompoKit.add(this.jButtonCerrarImportacionCompoKit, this.gridBagConstraintsCompoKit);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCompoKit = new GridBagLayout();
		
		this.jScrollPanelImportacionCompoKit= new JScrollPane(jPanelImportacionCompoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iPosYImportacion;
		this.gridBagConstraintsCompoKit.gridx =iPosXImportacion;
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCompoKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCompoKit.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCompoKit);
		this.jInternalFrameImportacionCompoKit.getContentPane().add(this.jScrollPanelImportacionCompoKit, this.gridBagConstraintsCompoKit);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCompoKit(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCompoKit = new JButtonMe();
			this.jButtonAbrirOrderByCompoKit.setText("Orden");
			this.jButtonAbrirOrderByCompoKit.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCompoKit,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCompoKit";
			inputMap = this.jButtonAbrirOrderByCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCompoKit"));
		
		
			GridBagLayout gridaBagLayoutOrderByCompoKit = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCompoKit.setName("jPanelOrderByCompoKit"); 
			
			this.jPanelOrderByCompoKit.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCompoKit.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCompoKit.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCompoKit.setLayout(gridaBagLayoutOrderByCompoKit);
			
			
			this.jTableDatosCompoKitOrderBy = new JTableMe();        
			this.jTableDatosCompoKitOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCompoKitOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCompoKitOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCompoKitOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCompoKitOrderBy.setViewportView(this.jTableDatosCompoKitOrderBy);
			this.jTableDatosCompoKitOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCompoKitOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCompoKit= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCompoKit= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCompoKit = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCompoKit= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCompoKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCompoKit.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCompoKit.setTitle("Orden");
			this.jInternalFrameOrderByCompoKit.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCompoKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCompoKit.setResizable(true);
			this.jInternalFrameOrderByCompoKit.setClosable(true);
			this.jInternalFrameOrderByCompoKit.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCompoKit.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCompoKit.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCompoKit.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCompoKit.gridx =iPosXOrderBy;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCompoKit.ipady =150;
				
			this.jPanelOrderByCompoKit.add(jScrollPanelDatosCompoKitOrderBy, this.gridBagConstraintsCompoKit);//this.jTableDatosCompoKitTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCompoKit = new JButtonMe();
			this.jButtonCerrarOrderByCompoKit.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCompoKit,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCompoKit.setToolTipText("Cancelar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCompoKit.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCompoKit.add(this.jButtonCerrarOrderByCompoKit, this.gridBagConstraintsCompoKit);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCompoKit = new GridBagLayout();
			
			this.jScrollPanelOrderByCompoKit= new JScrollPane(jPanelOrderByCompoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy =iPosYOrderBy;
			this.gridBagConstraintsCompoKit.gridx =iPosXOrderBy;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCompoKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCompoKit.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCompoKit);
			
			this.jInternalFrameOrderByCompoKit.getContentPane().add(this.jScrollPanelOrderByCompoKit, this.gridBagConstraintsCompoKit);			
		
		} else {
			this.jButtonAbrirOrderByCompoKit = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.compokitSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCompoKit.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCompoKit.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCompoKit.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCompoKit.getRowHeight();//CompoKitConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CompoKitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCompoKit.isSelected()) {
					iHeightTable=CompoKitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CompoKitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CompoKitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CompoKitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCompoKit.isSelected()) {
					iHeightTable=CompoKitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CompoKitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CompoKitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCompoKit.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCompoKit.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCompoKit.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCompoKit.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCompoKit.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCompoKit.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCompoKit!=null && this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy()!=null) {
			//if(!this.compokitSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCompoKit.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCompoKit.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCompoKit.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCompoKit.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCompoKit.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCompoKit.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=compokitLogic.getCompoKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=compokits.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CompoKit> TraerCompoKitBeans(List<CompoKit> compokits,ArrayList<Classe> classes)throws Exception {
		try {
			for(CompoKit compokit:compokits) {
					
				if(!(CompoKitConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CompoKitConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					compokit.setsDetalleGeneralEntityReporte(CompoKitConstantesFunciones.getCompoKitDescripcion(compokit));
										
						
					
						
					
				} else  {
							
					//compokit.setsDetalleGeneralEntityReporte(compokit.getsDetalleGeneralEntityReporte());
										
				}
				
				//compokitbeans.add(compokitbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return compokits;
    }
	//PARA REPORTES FIN
}
