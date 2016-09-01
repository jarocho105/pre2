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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.inventario.util.CostoConstantesFunciones;

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
public class CostoJInternalFrame extends CostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCosto;
	
	protected JMenuBar jmenuBarCosto;
	
	protected JMenu jmenuCosto;
	protected JMenu jmenuDatosCosto;
	protected JMenu jmenuArchivoCosto;
	protected JMenu jmenuAccionesCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCosto;	
	protected GridBagConstraints gridBagConstraintsCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CostoDetalleFormJInternalFrame jInternalFrameDetalleFormCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCosto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallemovimientoinventario="";

	protected TipoCostoBeanSwingJInternalFrame tipocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public CostoSessionBean costoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	public TipoCostoSessionBean tipocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Costo> costos;		
	public List<Costo> costosEliminados;	
	public List<Costo> costosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCosto;		
	protected JButton jButtonAbrirOrderByCosto;
	
	
	//protected JPanel jPanelOrderByCosto;
	//public JScrollPane jScrollPanelOrderByCosto;	
	//protected JButton jButtonCerrarOrderByCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CostoLogic costoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCosto;
	public JScrollPane jScrollPanelDatosEdicionCosto;
	public JScrollPane jScrollPanelDatosGeneralCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCosto;
	//public JScrollPane jScrollPanelImportacionCosto;
	
	
	
	protected JPanel jPanelAccionesCosto;
	
    protected JPanel jPanelPaginacionCosto;
    protected JPanel jPanelParametrosReportesCosto;
	protected JPanel jPanelParametrosReportesAccionesCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Costo;
	protected JPanel jPanelParametrosAuxiliar2Costo;
	protected JPanel jPanelParametrosAuxiliar3Costo;
	protected JPanel jPanelParametrosAuxiliar4Costo;
	//protected JPanel jPanelParametrosAuxiliar5Costo;
	
	
	
	//protected JPanel jPanelReporteDinamicoCosto;
	//protected JPanel jPanelImportacionCosto;
	
	
	public JTable jTableDatosCosto;
	
	
	
	//public JTable jTableDatosCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCosto;
	protected JButton jButtonDuplicarCosto;
	protected JButton jButtonCopiarCosto;
	protected JButton jButtonVerFormCosto;
	protected JButton jButtonNuevoRelacionesCosto;
	protected JButton jButtonModificarCosto;
	
    protected JButton jButtonGuardarCambiosTablaCosto;
	protected JButton jButtonCerrarCosto;
	
	
	protected JButton jButtonRecargarInformacionCosto;
	protected JButton jButtonProcesarInformacionCosto;
	
	
	protected JButton jButtonAnterioresCosto;
	protected JButton jButtonSiguientesCosto;
	protected JButton jButtonNuevoGuardarCambiosCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCosto;
	//protected JButton jButtonCerrarReporteDinamicoCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionCosto;
	//protected JButton jButtonGenerarImportacionCosto;
	//protected JButton jButtonCerrarImportacionCosto;
	//protected JFileChooser jFileChooserImportacionCosto;
	//protected File fileImportacionCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCosto;
	protected JButton jButtonDuplicarToolBarCosto;
	protected JButton jButtonNuevoRelacionesToolBarCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarCosto;
	protected JButton jButtonCopiarToolBarCosto;
	protected JButton jButtonVerFormToolBarCosto;
	public JButton jButtonGuardarCambiosTablaToolBarCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarCosto;
	protected JButton jButtonCerrarToolBarCosto;
	
	protected JButton jButtonRecargarInformacionToolBarCosto;
	protected JButton jButtonProcesarInformacionToolBarCosto;
	protected JButton jButtonAnterioresToolBarCosto;
	protected JButton jButtonSiguientesToolBarCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarCosto;
	protected JButton jButtonAbrirOrderByToolBarCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCosto;
	protected JMenuItem jMenuItemDuplicarCosto;
	protected JMenuItem jMenuItemNuevoRelacionesCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCosto;
	protected JMenuItem jMenuItemCopiarCosto;
	protected JMenuItem jMenuItemVerFormCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCosto;
	protected JMenuItem jMenuItemCerrarCosto;
	protected JMenuItem jMenuItemDetalleCerrarCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionCosto;
	protected JMenuItem jMenuItemProcesarInformacionCosto;
	protected JMenuItem jMenuItemAnterioresCosto;
	protected JMenuItem jMenuItemSiguientesCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCosto;
	protected JMenuItem jMenuItemAbrirOrderByCosto;
	protected JMenuItem jMenuItemMostrarOcultarCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCosto;
	protected JCheckBox jCheckBoxSeleccionadosCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCosto;
	protected JCheckBox jCheckBoxConGraficoReporteCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCosto;
	protected JTextField jTextFieldValorCampoGeneralCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCosto;
	//public JList<Reporte> jListColumnasSelectReporteCosto;
	//public JScrollPane jScrollColumnasSelectReporteCosto;
	
	//public JLabel jLabelRelacionesSelectReporteCosto;
	//public JList<Reporte> jListRelacionesSelectReporteCosto;
	//public JScrollPane jScrollRelacionesSelectReporteCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoCosto;
	
		
	//public JLabel jLabelArchivoImportacionCosto;	
	//public JLabel jLabelPathArchivoImportacionCosto;
	//protected JTextField jTextFieldPathArchivoImportacionCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCosto;
	
	//public JLabel jLabelColumnaCategoriaValorCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCosto;
	
	//public JLabel jLabelColumnasValoresGraficoCosto;
	//public JList<Reporte> jListColumnasValoresGraficoCosto;
	//public JScrollPane jScrollColumnasValoresGraficoCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCosto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCosto;
	public JPanel jPanelFK_IdBodegaCosto;
	public JButton jButtonFK_IdBodegaCosto;
	public JPanel jPanelFK_IdDetalleMovimientoInventarioCosto;
	public JButton jButtonFK_IdDetalleMovimientoInventarioCosto;
	public JPanel jPanelFK_IdProductoCosto;
	public JButton jButtonFK_IdProductoCosto;
	public JPanel jPanelFK_IdTipoCostoCosto;
	public JButton jButtonFK_IdTipoCostoCosto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaCosto;
	public JLabel jLabelid_bodegaFK_IdBodegaCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaCosto;
	public JButton jButtonid_bodegaFK_IdBodegaCosto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCostoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto;
	public JLabel jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto;
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCostoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoCosto;
	public JLabel jLabelid_productoFK_IdProductoCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoCosto;
	public JButton jButtonid_productoFK_IdProductoCosto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoCostoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoCostoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoCosto;
	
	public JPanel jPanelid_tipo_costoFK_IdTipoCostoCosto;
	public JLabel jLabelid_tipo_costoFK_IdTipoCostoCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costoFK_IdTipoCostoCosto;
	public JButton jButtonid_tipo_costoFK_IdTipoCostoCosto= new JButtonMe();
	public JButton jButtonid_tipo_costoFK_IdTipoCostoCostoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costoFK_IdTipoCostoCostoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public CostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCosto)	{
		this.jButtonRecargarInformacionCosto = jButtonRecargarInformacionCosto;
	}
	
	public JButton getjButtonProcesarInformacionCosto() {
		return this.jButtonProcesarInformacionCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCosto)	{
		this.jButtonProcesarInformacionCosto = jButtonProcesarInformacionCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionCosto() {
		return this.jButtonRecargarInformacionCosto;
	}
	
	
	public List<Costo> getcostos() {
		return this.costos;
	}

	public void setcostos(List<Costo> costos) {
		this.costos = costos;
	}
	
	public List<Costo> getcostosAux() {
		return this.costosAux;
	}

	public void setcostosAux(List<Costo> costosAux) {
		this.costosAux = costosAux;
	}
	
	public List<Costo> getcostosEliminados() {
		return this.costosEliminados;
	}

	public void setCostosEliminados(List<Costo> costosEliminados) {
		this.costosEliminados = costosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCosto() {
		return jComboBoxTiposSeleccionarCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCosto(
			JComboBox jComboBoxTiposSeleccionarCosto) {
		this.jComboBoxTiposSeleccionarCosto = jComboBoxTiposSeleccionarCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCosto() {
		return jTextFieldValorCampoGeneralCosto;
	}

	public void setjTextFieldValorCampoGeneralCosto(
			JTextField jTextFieldValorCampoGeneralCosto) {
		this.jTextFieldValorCampoGeneralCosto = jTextFieldValorCampoGeneralCosto;
	}

	public void setBorderResaltarValorCampoGeneralCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCosto() {
		return this.jCheckBoxSeleccionarTodosCosto;
	}

	public void setjCheckBoxSeleccionarTodosCosto(
			JCheckBox jCheckBoxSeleccionarTodosCosto) {
		this.jCheckBoxSeleccionarTodosCosto = jCheckBoxSeleccionarTodosCosto;
	}

	public void setBorderResaltarSeleccionarTodosCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCosto() {
		return this.jCheckBoxSeleccionadosCosto;
	}

	public void setjCheckBoxSeleccionadosCosto(
			JCheckBox jCheckBoxSeleccionadosCosto) {
		this.jCheckBoxSeleccionadosCosto = jCheckBoxSeleccionadosCosto;
	}
	
	public void setBorderResaltarSeleccionadosCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCosto() {
		return this.jComboBoxTiposArchivosReportesCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCosto(
			JComboBox jComboBoxTiposArchivosReportesCosto) {
		this.jComboBoxTiposArchivosReportesCosto = jComboBoxTiposArchivosReportesCosto;
	}

	public void setBorderResaltarTiposArchivosReportesCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCosto() {
		return this.jComboBoxTiposReportesCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCosto(
			JComboBox jComboBoxTiposReportesCosto) {
		this.jComboBoxTiposReportesCosto = jComboBoxTiposReportesCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCosto() {
	//	return jComboBoxTiposReportesDinamicoCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoCosto) {
	//	this.jComboBoxTiposReportesDinamicoCosto = jComboBoxTiposReportesDinamicoCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCosto = jComboBoxTiposArchivosReportesDinamicoCosto;
	//}
	
	public void setBorderResaltarTiposReportesCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCosto() {
		return this.jComboBoxTiposGraficosReportesCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCosto(
			JComboBox jComboBoxTiposGraficosReportesCosto) {
		this.jComboBoxTiposGraficosReportesCosto = jComboBoxTiposGraficosReportesCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCosto() {
		return this.jComboBoxTiposPaginacionCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCosto(
			JComboBox jComboBoxTiposPaginacionCosto) {
		this.jComboBoxTiposPaginacionCosto = jComboBoxTiposPaginacionCosto;
	}
	
	public void setBorderResaltarTiposPaginacionCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCosto() {
		return this.jComboBoxTiposRelacionesCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCosto() {
		return this.jComboBoxTiposAccionesCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCosto(
			JComboBox jComboBoxTiposRelacionesCosto) {
		this.jComboBoxTiposRelacionesCosto = jComboBoxTiposRelacionesCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCosto(
			JComboBox jComboBoxTiposAccionesCosto) {
		this.jComboBoxTiposAccionesCosto = jComboBoxTiposAccionesCosto;
	}
	
	public void setBorderResaltarTiposRelacionesCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCosto() {
	//	return jCheckBoxConGraficoDinamicoCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoCosto) {
	//	this.jCheckBoxConGraficoDinamicoCosto = jCheckBoxConGraficoDinamicoCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCosto .setBorder(borderResaltar);		
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
		this.costoSessionBean=new CostoSessionBean();
		
		this.costoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.costoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Costo MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
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
		
		CostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCosto,this.jTtoolBarCosto,
							"nuevo","nuevo","Nuevo"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCosto,this.jTtoolBarCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCosto,this.jTtoolBarCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCosto,this.jTtoolBarCosto,
							"duplicar","duplicar","Duplicar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCosto,this.jTtoolBarCosto,
							"copiar","copiar","Copiar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCosto,this.jTtoolBarCosto,
							"ver_form","ver_form","Ver"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCosto,this.jTtoolBarCosto,
							"recargar","recargar","Recargar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCosto,this.jTtoolBarCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCosto,this.jTtoolBarCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCosto,this.jTtoolBarCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCosto,this.jTtoolBarCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCosto,this.jTtoolBarCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCosto,this.jTtoolBarCosto,
							"cerrar","cerrar","Salir"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCosto;
			
				this.jButtonProcesarInformacionToolBarCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCosto;
				
		//protected JButton jButtonModificarToolBarCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCosto=new JMenuMe("General");
		this.jmenuArchivoCosto=new JMenuMe("Archivo");
		this.jmenuAccionesCosto=new JMenuMe("Acciones");
		this.jmenuDatosCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCosto.add(this.jMenuItemCerrarCosto);
			
			this.jmenuAccionesCosto.add(this.jMenuItemNuevoCosto);
			this.jmenuAccionesCosto.add(this.jMenuItemNuevoGuardarCambiosCosto);
			this.jmenuAccionesCosto.add(this.jMenuItemNuevoRelacionesCosto);
			this.jmenuAccionesCosto.add(this.jMenuItemGuardarCambiosTablaCosto);		
			this.jmenuAccionesCosto.add(this.jMenuItemDuplicarCosto);		
			this.jmenuAccionesCosto.add(this.jMenuItemCopiarCosto);		
			this.jmenuAccionesCosto.add(this.jMenuItemVerFormCosto);		
			
			this.jmenuDatosCosto.add(this.jMenuItemRecargarInformacionCosto);				
			this.jmenuDatosCosto.add(this.jMenuItemAnterioresCosto);				
			this.jmenuDatosCosto.add(this.jMenuItemSiguientesCosto);				
			this.jmenuDatosCosto.add(this.jMenuItemAbrirOrderByCosto);				
			this.jmenuDatosCosto.add(this.jMenuItemMostrarOcultarCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCosto.add(this.jMenuItemGuardarCambiosCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCosto.add(this.jmenuArchivoCosto);		
			this.jmenuBarCosto.add(this.jmenuAccionesCosto);		
			this.jmenuBarCosto.add(this.jmenuDatosCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCosto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaCosto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaCosto= new JButtonMe();
		this.jButtonFK_IdBodegaCosto.setText("Buscar");
		this.jButtonFK_IdBodegaCosto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaCosto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaCosto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaCosto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaCosto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaCosto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleMovimientoInventarioCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleMovimientoInventarioCosto.setToolTipText("Buscar Por Detalle Movimiento Inventario ");
		this.jButtonFK_IdDetalleMovimientoInventarioCosto= new JButtonMe();
		this.jButtonFK_IdDetalleMovimientoInventarioCosto.setText("Buscar");
		this.jButtonFK_IdDetalleMovimientoInventarioCosto.setToolTipText("Buscar Por Detalle Movimiento Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleMovimientoInventarioCosto,"buscar_button","Buscar Por Detalle Movimiento Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleMovimientoInventarioCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto = new JLabelMe();
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setText("Detalle Movimiento Inventario :");
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setToolTipText("Detalle Movimiento Inventario");
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto= new JComboBoxMe();
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoCosto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoCosto= new JButtonMe();
		this.jButtonFK_IdProductoCosto.setText("Buscar");
		this.jButtonFK_IdProductoCosto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoCosto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoCosto = new JLabelMe();
		jLabelid_productoFK_IdProductoCosto.setText("Producto :");
		jLabelid_productoFK_IdProductoCosto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoCosto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoCosto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoCosto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoCosto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoCosto.setFocusable(false);

		this.jPanelFK_IdTipoCostoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCostoCosto.setToolTipText("Buscar Por Tipo Costo ");
		this.jButtonFK_IdTipoCostoCosto= new JButtonMe();
		this.jButtonFK_IdTipoCostoCosto.setText("Buscar");
		this.jButtonFK_IdTipoCostoCosto.setToolTipText("Buscar Por Tipo Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCostoCosto,"buscar_button","Buscar Por Tipo Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCostoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_costoFK_IdTipoCostoCosto = new JLabelMe();
		jLabelid_tipo_costoFK_IdTipoCostoCosto.setText("Tipo Costo :");
		jLabelid_tipo_costoFK_IdTipoCostoCosto.setToolTipText("Tipo Costo");
		jLabelid_tipo_costoFK_IdTipoCostoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costoFK_IdTipoCostoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costoFK_IdTipoCostoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costoFK_IdTipoCostoCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_costoFK_IdTipoCostoCosto= new JComboBoxMe();
		jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costoFK_IdTipoCostoCosto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCosto=new JTabbedPane();


		this.jTabbedPaneBusquedasCosto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCosto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCosto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCosto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCosto = new CostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Costo DATOS");
			this.jInternalFrameDetalleFormCosto = new CostoDetalleFormJInternalFrame(jDesktopPane,this.costoSessionBean.getConGuardarRelaciones(),this.costoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCosto = null;//new CostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCosto= new GridBagLayout();
		
		
		this.jTableDatosCosto = new JTableMe();      
		
		String sToolTipCosto="";
		sToolTipCosto=CostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCosto+="(Inventario.Costo)";
		}
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCosto.setToolTipText(sToolTipCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCosto);
		this.jTableDatosCosto.setAutoCreateRowSorter(true);
		this.jTableDatosCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCosto.setRowSelectionAllowed(true);
		this.jTableDatosCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCosto = new JButtonMe();
		this.jButtonDuplicarCosto = new JButtonMe();
		this.jButtonCopiarCosto = new JButtonMe();
		this.jButtonVerFormCosto = new JButtonMe();
		this.jButtonNuevoRelacionesCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCosto = new JButtonMe();
		this.jButtonCerrarCosto = new JButtonMe();
		
		this.jScrollPanelDatosCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Costo";
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCosto.setToolTipText("Acciones");
        this.jPanelAccionesCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCosto=new ReporteDinamicoJInternalFrame(CostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCosto=new ImportacionJInternalFrame(CostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByCosto.setText("Orden");
		this.jButtonAbrirOrderByCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCosto,false,this);
			
			//this.cargarOrderByCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCosto,true,this);
			
			//this.cargarOrderByCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCosto.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosCosto.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosCosto.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCosto.setText("Nuevo");
		this.jButtonDuplicarCosto.setText("Duplicar");
		this.jButtonCopiarCosto.setText("Copiar");
		this.jButtonVerFormCosto.setText("Ver");
		this.jButtonNuevoRelacionesCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCosto.setText("Guardar");
		this.jButtonCerrarCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCosto,"nuevo_button","Nuevo",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCosto,"duplicar_button","Duplicar",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCosto,"copiar_button","Copiar",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCosto,"ver_form","Ver",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCosto,"nuevorelaciones_button","Nuevo Rel",this.costoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCosto,"guardarcambiostabla_button","Guardar",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCosto,"cerrar_button","Salir",this.costoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCosto.setToolTipText("Nuevo"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCosto.setToolTipText("Duplicar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCosto.setToolTipText("Copiar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCosto.setToolTipText("Ver"+" "+CostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCosto.setToolTipText("Nuevo Rel"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCosto.setToolTipText("Guardar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCosto.setToolTipText("Salir"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCosto";
		inputMap = this.jButtonNuevoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarCosto";
		inputMap = this.jButtonDuplicarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCosto"));
		
		//COPIAR
		sMapKey = "CopiarCosto";
		inputMap = this.jButtonCopiarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCosto"));
		
		//VEr FORM
		sMapKey = "VerFormCosto";
		inputMap = this.jButtonVerFormCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCosto";
		inputMap = this.jButtonNuevoRelacionesCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCosto";
		inputMap = this.jButtonModificarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCosto";
		inputMap = this.jButtonCerrarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCosto";
		inputMap = this.jButtonGuardarCambiosTablaCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Costo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Costo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Costo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Costo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Costo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCosto.setName("jPanelParametrosReportesCosto"); 
		
		this.jPanelParametrosReportesAccionesCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCosto.setName("jPanelParametrosReportesAccionesCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCosto = new JButtonMe();
		this.jButtonRecargarInformacionCosto.setText("Recargar");
		this.jButtonRecargarInformacionCosto.setToolTipText("Recargar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCosto = new JButtonMe();
		this.jButtonProcesarInformacionCosto.setText("Procesar");
		this.jButtonProcesarInformacionCosto.setToolTipText("Procesar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCosto.setVisible(false);
			
		this.jButtonProcesarInformacionCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCosto.setText("TIPO");       
		this.jComboBoxTiposReportesCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCosto.setText("Accion");
		this.jComboBoxTiposRelacionesCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCosto.setText("Accion");
		this.jComboBoxTiposAccionesCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCosto = new JLabelMe();
		
		this.jLabelAccionesCosto.setText("Acciones");		
		this.jLabelAccionesCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCosto = new JButtonMe();
		//this.jButtonAnterioresCosto.setText("<<");
        this.jButtonAnterioresCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCosto = new JButtonMe();
		//this.jButtonSiguientesCosto.setText(">>");
        this.jButtonSiguientesCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCosto,"nuevoguardarcambios_button","Nue",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCosto";
		inputMap = this.jButtonNuevoGuardarCambiosCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCosto";
		inputMap = this.jButtonRecargarInformacionCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCosto";
		inputMap = this.jButtonSiguientesCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCosto";
		inputMap = this.jButtonAnterioresCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCosto.setMinimumSize(new Dimension(this.getWidth(),CostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCosto.setMaximumSize(new Dimension(this.getWidth(),CostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCosto.setPreferredSize(new Dimension(this.getWidth(),CostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCosto = new GridBagLayout();

			this.jPanelPaginacionCosto.setLayout(gridaBagLayoutPaginacionCosto);						
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 0;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCosto.add(this.jButtonAnterioresCosto, this.gridBagConstraintsCosto);
					
						
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCosto.gridy = 0;
			
			this.jPanelPaginacionCosto.add(this.jButtonNuevoGuardarCambiosCosto, this.gridBagConstraintsCosto);
						
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCosto.gridy = 0;
			this.jPanelPaginacionCosto.add(this.jButtonSiguientesCosto, this.gridBagConstraintsCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 1;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCosto.add(this.jButtonNuevoCosto, this.gridBagConstraintsCosto);
						
			
			
			if(!this.costoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCosto = new GridBagConstraints();
				this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCosto.gridy = 1;
				this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCosto.add(this.jButtonGuardarCambiosTablaCosto, this.gridBagConstraintsCosto);
			}
			
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 1;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCosto.add(this.jButtonDuplicarCosto, this.gridBagConstraintsCosto);
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 1;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCosto.add(this.jButtonCopiarCosto, this.gridBagConstraintsCosto);
		
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 1;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCosto.add(this.jButtonVerFormCosto, this.gridBagConstraintsCosto);
		
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 1;
			this.gridBagConstraintsCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCosto.add(this.jButtonCerrarCosto, this.gridBagConstraintsCosto);
		
		
		
		this.jButtonRecargarInformacionCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Costo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Costo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Costo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Costo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCosto.setLayout(gridaBagParametrosReportesCosto);
			this.jPanelParametrosReportesAccionesCosto.setLayout(gridaBagParametrosReportesAccionesCosto);
			
			
			this.jPanelParametrosAuxiliar1Costo.setLayout(gridaBagParametrosAuxiliar1Costo);
			this.jPanelParametrosAuxiliar2Costo.setLayout(gridaBagParametrosAuxiliar2Costo);
			this.jPanelParametrosAuxiliar3Costo.setLayout(gridaBagParametrosAuxiliar3Costo);
			this.jPanelParametrosAuxiliar4Costo.setLayout(gridaBagParametrosAuxiliar4Costo);
			//this.jPanelParametrosAuxiliar5Costo.setLayout(gridaBagParametrosAuxiliar2Costo);			
			
			
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCosto.add(this.jButtonRecargarInformacionCosto, this.gridBagConstraintsCosto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Costo.add(this.jComboBoxTiposPaginacionCosto, this.gridBagConstraintsCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Costo.add(this.jCheckBoxConAltoMaximoTablaCosto, this.gridBagConstraintsCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Costo.add(this.jComboBoxTiposArchivosReportesCosto, this.gridBagConstraintsCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCosto.add(this.jPanelParametrosAuxiliar1Costo, this.gridBagConstraintsCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Costo.add(this.jComboBoxTiposReportesCosto, this.gridBagConstraintsCosto);																		
			
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Costo.add(this.jComboBoxTiposGraficosReportesCosto, this.gridBagConstraintsCosto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCosto.add(this.jPanelParametrosAuxiliar4Costo, this.gridBagConstraintsCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCosto.add(this.jComboBoxTiposReportesCosto, this.gridBagConstraintsCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCosto.add(this.jCheckBoxGenerarReporteCosto, this.gridBagConstraintsCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCosto.add(this.jPanelParametrosAuxiliar2Costo, this.gridBagConstraintsCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCosto.add(this.jLabelAccionesCosto, this.gridBagConstraintsCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCosto = new GridBagConstraints();
				this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCosto.add(this.jButtonAbrirOrderByCosto, this.gridBagConstraintsCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCosto.add(this.jComboBoxTiposSeleccionarCosto, this.gridBagConstraintsCosto);			
			
			
			/*
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCosto.add(this.jCheckBoxSeleccionarTodosCosto, this.gridBagConstraintsCosto);
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCosto.add(this.jCheckBoxConGraficoReporteCosto, this.gridBagConstraintsCosto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Costo.add(this.jCheckBoxSeleccionarTodosCosto, this.gridBagConstraintsCosto);															
				
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Costo.add(this.jCheckBoxSeleccionadosCosto, this.gridBagConstraintsCosto);															
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Costo.add(this.jCheckBoxConGraficoReporteCosto, this.gridBagConstraintsCosto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCosto.add(this.jPanelParametrosAuxiliar3Costo, this.gridBagConstraintsCosto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCosto.add(this.jComboBoxTiposAccionesCosto, this.gridBagConstraintsCosto);
	
				
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCosto.add(this.jTextFieldValorCampoGeneralCosto, this.gridBagConstraintsCosto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCosto = new GridBagLayout();

			this.jScrollPanelDatosCosto.setLayout(gridaBagLayoutDatosCosto);
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = 0;
			this.gridBagConstraintsCosto.gridx = 0;
			
			this.jScrollPanelDatosCosto.add(this.jTableDatosCosto, this.gridBagConstraintsCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCosto.setViewportView(this.jTableDatosCosto);
		this.jTableDatosCosto.setFillsViewportHeight(true);
		this.jTableDatosCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCosto= new GridBagLayout();
		this.jPanelAccionesCosto.setLayout(gridaBagLayoutAccionesCosto);
		
		
		/*	
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 0;
			
		this.jPanelAccionesCosto.add(this.jButtonNuevoCosto, this.gridBagConstraintsCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaCosto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaCosto.setLayout(gridaBagLayoutFK_IdBodegaCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 0;
		jPanelFK_IdBodegaCosto.add(jLabelid_bodegaFK_IdBodegaCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 1;
		jPanelFK_IdBodegaCosto.add(jComboBoxid_bodegaFK_IdBodegaCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 1;
		gridBagConstraintsCosto.gridx =1;
		jPanelFK_IdBodegaCosto.add(jButtonFK_IdBodegaCosto, gridBagConstraintsCosto);

		jTabbedPaneBusquedasCosto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaCosto);
		jTabbedPaneBusquedasCosto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleMovimientoInventarioCosto.setLayout(gridaBagLayoutFK_IdDetalleMovimientoInventarioCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 0;
		jPanelFK_IdDetalleMovimientoInventarioCosto.add(jLabelid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 1;
		jPanelFK_IdDetalleMovimientoInventarioCosto.add(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 1;
		gridBagConstraintsCosto.gridx =1;
		jPanelFK_IdDetalleMovimientoInventarioCosto.add(jButtonFK_IdDetalleMovimientoInventarioCosto, gridBagConstraintsCosto);

		jTabbedPaneBusquedasCosto.addTab("2.-Por Detalle Movimiento Inventario ", jPanelFK_IdDetalleMovimientoInventarioCosto);
		jTabbedPaneBusquedasCosto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoCosto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoCosto.setLayout(gridaBagLayoutFK_IdProductoCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 0;
		jPanelFK_IdProductoCosto.add(jLabelid_productoFK_IdProductoCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 1;
		jPanelFK_IdProductoCosto.add(jComboBoxid_productoFK_IdProductoCosto, gridBagConstraintsCosto);


		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 0;
		jPanelFK_IdProductoCosto.add(this.jButtonBuscarFK_IdProductoid_productoCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 1;
		gridBagConstraintsCosto.gridx =1;
		jPanelFK_IdProductoCosto.add(jButtonFK_IdProductoCosto, gridBagConstraintsCosto);

		jTabbedPaneBusquedasCosto.addTab("3.-Por Producto ", jPanelFK_IdProductoCosto);
		jTabbedPaneBusquedasCosto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoCostoCosto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCostoCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCostoCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCostoCosto.setLayout(gridaBagLayoutFK_IdTipoCostoCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 0;
		jPanelFK_IdTipoCostoCosto.add(jLabelid_tipo_costoFK_IdTipoCostoCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 0;
		gridBagConstraintsCosto.gridx = 1;
		jPanelFK_IdTipoCostoCosto.add(jComboBoxid_tipo_costoFK_IdTipoCostoCosto, gridBagConstraintsCosto);

		gridBagConstraintsCosto = new GridBagConstraints();
		gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCosto.gridy = 1;
		gridBagConstraintsCosto.gridx =1;
		jPanelFK_IdTipoCostoCosto.add(jButtonFK_IdTipoCostoCosto, gridBagConstraintsCosto);

		jTabbedPaneBusquedasCosto.addTab("4.-Por Tipo Costo ", jPanelFK_IdTipoCostoCosto);
		jTabbedPaneBusquedasCosto.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.costoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCosto = new GridBagConstraints();						
			this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCosto.gridx = 0;		
			//this.gridBagConstraintsCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCosto, this.gridBagConstraintsCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCosto.gridx = 0;		
		//this.gridBagConstraintsCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCosto.gridx = 0;		
			this.gridBagConstraintsCosto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCosto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCosto, this.gridBagConstraintsCosto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCosto, this.gridBagConstraintsCosto);								
		
		
		/*
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCosto, this.gridBagConstraintsCosto);
		*/		
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCosto.gridx =0;
		this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCosto, this.gridBagConstraintsCosto);
				
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCosto, this.gridBagConstraintsCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosCosto.setLayout(gridaBagLayoutBusquedasParametrosCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCosto, this.gridBagConstraintsCosto);
			
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCosto, this.gridBagConstraintsCosto);
		
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCosto, this.gridBagConstraintsCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCosto.setName("jPanelReporteDinamicoCosto"); 
		
		this.jPanelReporteDinamicoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCosto.setLayout(gridaBagLayoutReporteDinamicoCosto);
		
		
		this.jInternalFrameReporteDinamicoCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCosto.add(this.jLabelColumnasSelectReporteCosto, this.gridBagConstraintsCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCosto=new JScrollPane(this.jListColumnasSelectReporteCosto);
			
			this.jScrollColumnasSelectReporteCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCosto.add(this.jListColumnasSelectReporteCosto, this.gridBagConstraintsCosto);
		this.jPanelReporteDinamicoCosto.add(this.jScrollColumnasSelectReporteCosto, this.gridBagConstraintsCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCosto=new JScrollPane(this.jListRelacionesSelectReporteCosto);
			
			this.jScrollRelacionesSelectReporteCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCosto = new JLabelMe();

		this.jLabelConGraficoDinamicoCosto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCosto.add(this.jLabelConGraficoDinamicoCosto, this.gridBagConstraintsCosto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCosto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCosto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCosto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jCheckBoxConGraficoDinamicoCosto, this.gridBagConstraintsCosto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCosto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCosto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCosto.add(this.jLabelColumnaCategoriaGraficoCosto, this.gridBagConstraintsCosto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCosto.add(this.jComboBoxColumnaCategoriaGraficoCosto, this.gridBagConstraintsCosto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCosto = new JLabelMe();

		this.jLabelColumnaCategoriaValorCosto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jLabelColumnaCategoriaValorCosto, this.gridBagConstraintsCosto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCosto.add(this.jComboBoxColumnaCategoriaValorCosto, this.gridBagConstraintsCosto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCosto = new JLabelMe();

		this.jLabelColumnasValoresGraficoCosto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jLabelColumnasValoresGraficoCosto, this.gridBagConstraintsCosto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCosto = new JList<Reporte>();
		this.jListColumnasValoresGraficoCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCosto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCosto=new JScrollPane(this.jListColumnasValoresGraficoCosto);
			
			this.jScrollColumnasValoresGraficoCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCosto.add(this.jListColumnasSelectReporteCosto, this.gridBagConstraintsCosto);
		this.jPanelReporteDinamicoCosto.add(this.jScrollColumnasValoresGraficoCosto, this.gridBagConstraintsCosto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCosto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCosto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jLabelTiposGraficosReportesDinamicoCosto, this.gridBagConstraintsCosto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCosto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jComboBoxTiposGraficosReportesDinamicoCosto, this.gridBagConstraintsCosto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jLabelGenerarExcelReporteDinamicoCosto, this.gridBagConstraintsCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCosto.setToolTipText("Generar EXCEL"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCosto.add(this.jButtonGenerarExcelReporteDinamicoCosto, this.gridBagConstraintsCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCosto.add(this.jComboBoxTiposReportesDinamicoCosto, this.gridBagConstraintsCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCosto.add(this.jLabelTiposArchivoReporteDinamicoCosto, this.gridBagConstraintsCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCosto.add(this.jComboBoxTiposArchivosReportesDinamicoCosto, this.gridBagConstraintsCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCosto.setToolTipText("Generar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCosto.add(this.jButtonGenerarReporteDinamicoCosto, this.gridBagConstraintsCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCosto.setToolTipText("Cancelar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCosto.add(this.jButtonCerrarReporteDinamicoCosto, this.gridBagConstraintsCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCosto= new JScrollPane(jPanelReporteDinamicoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCosto);
		this.jInternalFrameReporteDinamicoCosto.getContentPane().add(this.jScrollPanelReporteDinamicoCosto, this.gridBagConstraintsCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCosto.setName("jPanelImportacionCosto"); 
		
		this.jPanelImportacionCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCosto.setLayout(gridaBagLayoutImportacionCosto);
		
		
		this.jInternalFrameImportacionCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCosto.setResizable(true);
	    this.jInternalFrameImportacionCosto.setClosable(true);
	    this.jInternalFrameImportacionCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCosto.setResizable(true);
	    this.jInternalFrameImportacionCosto.setClosable(true);
	    this.jInternalFrameImportacionCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCosto = new JLabelMe();

		this.jLabelArchivoImportacionCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCosto.add(this.jLabelArchivoImportacionCosto, this.gridBagConstraintsCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCosto = new JFileChooser();		
		this.jFileChooserImportacionCosto.setToolTipText("ESCOGER ARCHIVO"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCosto = new JButtonMe();
		this.jButtonAbrirImportacionCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCosto.setToolTipText("Generar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCosto.add(this.jButtonAbrirImportacionCosto, this.gridBagConstraintsCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCosto.add(this.jLabelPathArchivoImportacionCosto, this.gridBagConstraintsCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCosto.add(this.jTextFieldPathArchivoImportacionCosto, this.gridBagConstraintsCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCosto = new JButtonMe();
		this.jButtonGenerarImportacionCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCosto.setToolTipText("Generar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCosto.add(this.jButtonGenerarImportacionCosto, this.gridBagConstraintsCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCosto = new JButtonMe();
		this.jButtonCerrarImportacionCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCosto.setToolTipText("Cancelar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCosto.add(this.jButtonCerrarImportacionCosto, this.gridBagConstraintsCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionCosto= new JScrollPane(jPanelImportacionCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCosto);
		this.jInternalFrameImportacionCosto.getContentPane().add(this.jScrollPanelImportacionCosto, this.gridBagConstraintsCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCosto = new JButtonMe();
			this.jButtonAbrirOrderByCosto.setText("Orden");
			this.jButtonAbrirOrderByCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCosto";
			inputMap = this.jButtonAbrirOrderByCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCosto.setName("jPanelOrderByCosto"); 
			
			this.jPanelOrderByCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCosto.setLayout(gridaBagLayoutOrderByCosto);
			
			
			this.jTableDatosCostoOrderBy = new JTableMe();        
			this.jTableDatosCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCostoOrderBy.setViewportView(this.jTableDatosCostoOrderBy);
			this.jTableDatosCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCosto.setTitle("Orden");
			this.jInternalFrameOrderByCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCosto.setResizable(true);
			this.jInternalFrameOrderByCosto.setClosable(true);
			this.jInternalFrameOrderByCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCosto.ipady =150;
				
			this.jPanelOrderByCosto.add(jScrollPanelDatosCostoOrderBy, this.gridBagConstraintsCosto);//this.jTableDatosCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCosto = new JButtonMe();
			this.jButtonCerrarOrderByCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCosto.setToolTipText("Cancelar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCosto.add(this.jButtonCerrarOrderByCosto, this.gridBagConstraintsCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByCosto= new JScrollPane(jPanelOrderByCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCosto);
			
			this.jInternalFrameOrderByCosto.getContentPane().add(this.jScrollPanelOrderByCosto, this.gridBagConstraintsCosto);			
		
		} else {
			this.jButtonAbrirOrderByCosto = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.costoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCosto.getRowHeight();//CostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCosto.isSelected()) {
					iHeightTable=CostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCosto.isSelected()) {
					iHeightTable=CostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCosto!=null && this.jInternalFrameOrderByCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.costoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=costoLogic.getCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Costo> TraerCostoBeans(List<Costo> costos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Costo costo:costos) {
					
				if(!(CostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					costo.setsDetalleGeneralEntityReporte(CostoConstantesFunciones.getCostoDescripcion(costo));
										
						
					
						
					
				} else  {
							
					//costo.setsDetalleGeneralEntityReporte(costo.getsDetalleGeneralEntityReporte());
										
				}
				
				//costobeans.add(costobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return costos;
    }
	//PARA REPORTES FIN
}
