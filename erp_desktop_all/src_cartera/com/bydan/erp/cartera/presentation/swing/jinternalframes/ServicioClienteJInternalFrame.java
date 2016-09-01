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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ServicioClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ServicioClienteJInternalFrame extends ServicioClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarServicioCliente;
	
	protected JMenuBar jmenuBarServicioCliente;
	
	protected JMenu jmenuServicioCliente;
	protected JMenu jmenuDatosServicioCliente;
	protected JMenu jmenuArchivoServicioCliente;
	protected JMenu jmenuAccionesServicioCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicioCliente;	
	protected GridBagConstraints gridBagConstraintsServicioCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ServicioClienteDetalleFormJInternalFrame jInternalFrameDetalleFormServicioCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoServicioCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionServicioCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public ServicioClienteSessionBean servicioclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ServicioCliente> servicioclientes;		
	public List<ServicioCliente> servicioclientesEliminados;	
	public List<ServicioCliente> servicioclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByServicioCliente;		
	protected JButton jButtonAbrirOrderByServicioCliente;
	
	
	//protected JPanel jPanelOrderByServicioCliente;
	//public JScrollPane jScrollPanelOrderByServicioCliente;	
	//protected JButton jButtonCerrarOrderByServicioCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ServicioClienteLogic servicioclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosServicioCliente;
	public JScrollPane jScrollPanelDatosEdicionServicioCliente;
	public JScrollPane jScrollPanelDatosGeneralServicioCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosServicioClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoServicioCliente;
	//public JScrollPane jScrollPanelImportacionServicioCliente;
	
	
	
	protected JPanel jPanelAccionesServicioCliente;
	
    protected JPanel jPanelPaginacionServicioCliente;
    protected JPanel jPanelParametrosReportesServicioCliente;
	protected JPanel jPanelParametrosReportesAccionesServicioCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ServicioCliente;
	protected JPanel jPanelParametrosAuxiliar2ServicioCliente;
	protected JPanel jPanelParametrosAuxiliar3ServicioCliente;
	protected JPanel jPanelParametrosAuxiliar4ServicioCliente;
	//protected JPanel jPanelParametrosAuxiliar5ServicioCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoServicioCliente;
	//protected JPanel jPanelImportacionServicioCliente;
	
	
	public JTable jTableDatosServicioCliente;
	
	
	
	//public JTable jTableDatosServicioClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoServicioCliente;
	protected JButton jButtonDuplicarServicioCliente;
	protected JButton jButtonCopiarServicioCliente;
	protected JButton jButtonVerFormServicioCliente;
	protected JButton jButtonNuevoRelacionesServicioCliente;
	protected JButton jButtonModificarServicioCliente;
	
    protected JButton jButtonGuardarCambiosTablaServicioCliente;
	protected JButton jButtonCerrarServicioCliente;
	
	
	protected JButton jButtonRecargarInformacionServicioCliente;
	protected JButton jButtonProcesarInformacionServicioCliente;
	
	
	protected JButton jButtonAnterioresServicioCliente;
	protected JButton jButtonSiguientesServicioCliente;
	protected JButton jButtonNuevoGuardarCambiosServicioCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoServicioCliente;
	//protected JButton jButtonCerrarReporteDinamicoServicioCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoServicioCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionServicioCliente;
	//protected JButton jButtonGenerarImportacionServicioCliente;
	//protected JButton jButtonCerrarImportacionServicioCliente;
	//protected JFileChooser jFileChooserImportacionServicioCliente;
	//protected File fileImportacionServicioCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicioCliente;
	protected JButton jButtonDuplicarToolBarServicioCliente;
	protected JButton jButtonNuevoRelacionesToolBarServicioCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarServicioCliente;
	protected JButton jButtonCopiarToolBarServicioCliente;
	protected JButton jButtonVerFormToolBarServicioCliente;
	public JButton jButtonGuardarCambiosTablaToolBarServicioCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarServicioCliente;
	protected JButton jButtonCerrarToolBarServicioCliente;
	
	protected JButton jButtonRecargarInformacionToolBarServicioCliente;
	protected JButton jButtonProcesarInformacionToolBarServicioCliente;
	protected JButton jButtonAnterioresToolBarServicioCliente;
	protected JButton jButtonSiguientesToolBarServicioCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarServicioCliente;
	protected JButton jButtonAbrirOrderByToolBarServicioCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicioCliente;
	protected JMenuItem jMenuItemDuplicarServicioCliente;
	protected JMenuItem jMenuItemNuevoRelacionesServicioCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosServicioCliente;
	protected JMenuItem jMenuItemCopiarServicioCliente;
	protected JMenuItem jMenuItemVerFormServicioCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicioCliente;
	protected JMenuItem jMenuItemCerrarServicioCliente;
	protected JMenuItem jMenuItemDetalleCerrarServicioCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByServicioCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicioCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionServicioCliente;
	protected JMenuItem jMenuItemProcesarInformacionServicioCliente;
	protected JMenuItem jMenuItemAnterioresServicioCliente;
	protected JMenuItem jMenuItemSiguientesServicioCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicioCliente;
	protected JMenuItem jMenuItemAbrirOrderByServicioCliente;
	protected JMenuItem jMenuItemMostrarOcultarServicioCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicioCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosServicioCliente;
	protected JCheckBox jCheckBoxSeleccionadosServicioCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaServicioCliente;
	protected JCheckBox jCheckBoxConGraficoReporteServicioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesServicioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesServicioCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoServicioCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoServicioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesServicioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionServicioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarServicioCliente;
	protected JTextField jTextFieldValorCampoGeneralServicioCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteServicioCliente;
	//public JList<Reporte> jListColumnasSelectReporteServicioCliente;
	//public JScrollPane jScrollColumnasSelectReporteServicioCliente;
	
	//public JLabel jLabelRelacionesSelectReporteServicioCliente;
	//public JList<Reporte> jListRelacionesSelectReporteServicioCliente;
	//public JScrollPane jScrollRelacionesSelectReporteServicioCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoServicioCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoServicioCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoServicioCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoServicioCliente;
	
		
	//public JLabel jLabelArchivoImportacionServicioCliente;	
	//public JLabel jLabelPathArchivoImportacionServicioCliente;
	//protected JTextField jTextFieldPathArchivoImportacionServicioCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoServicioCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoServicioCliente;
	
	//public JLabel jLabelColumnaCategoriaValorServicioCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorServicioCliente;
	
	//public JLabel jLabelColumnasValoresGraficoServicioCliente;
	//public JList<Reporte> jListColumnasValoresGraficoServicioCliente;
	//public JScrollPane jScrollColumnasValoresGraficoServicioCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoServicioCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoServicioCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasServicioCliente;
	public JPanel jPanelFK_IdBodegaServicioCliente;
	public JButton jButtonFK_IdBodegaServicioCliente;
	public JPanel jPanelFK_IdClienteServicioCliente;
	public JButton jButtonFK_IdClienteServicioCliente;
	public JPanel jPanelFK_IdProductoServicioCliente;
	public JButton jButtonFK_IdProductoServicioCliente;
	public JPanel jPanelFK_IdTipoPrecioServicioCliente;
	public JButton jButtonFK_IdTipoPrecioServicioCliente;
	
	public JPanel jPanelid_bodegaFK_IdBodegaServicioCliente;
	public JLabel jLabelid_bodegaFK_IdBodegaServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaServicioCliente;
	public JButton jButtonid_bodegaFK_IdBodegaServicioCliente= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaServicioClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteServicioCliente;
	public JLabel jLabelid_clienteFK_IdClienteServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteServicioCliente;
	public JButton jButtonid_clienteFK_IdClienteServicioCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteServicioClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteServicioCliente;
	
	public JPanel jPanelid_productoFK_IdProductoServicioCliente;
	public JLabel jLabelid_productoFK_IdProductoServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoServicioCliente;
	public JButton jButtonid_productoFK_IdProductoServicioCliente= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoServicioClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoServicioCliente;
	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioServicioCliente;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioServicioCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioServicioClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public ServicioClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionServicioCliente)	{
		this.jButtonRecargarInformacionServicioCliente = jButtonRecargarInformacionServicioCliente;
	}
	
	public JButton getjButtonProcesarInformacionServicioCliente() {
		return this.jButtonProcesarInformacionServicioCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicioCliente)	{
		this.jButtonProcesarInformacionServicioCliente = jButtonProcesarInformacionServicioCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionServicioCliente() {
		return this.jButtonRecargarInformacionServicioCliente;
	}
	
	
	public List<ServicioCliente> getservicioclientes() {
		return this.servicioclientes;
	}

	public void setservicioclientes(List<ServicioCliente> servicioclientes) {
		this.servicioclientes = servicioclientes;
	}
	
	public List<ServicioCliente> getservicioclientesAux() {
		return this.servicioclientesAux;
	}

	public void setservicioclientesAux(List<ServicioCliente> servicioclientesAux) {
		this.servicioclientesAux = servicioclientesAux;
	}
	
	public List<ServicioCliente> getservicioclientesEliminados() {
		return this.servicioclientesEliminados;
	}

	public void setServicioClientesEliminados(List<ServicioCliente> servicioclientesEliminados) {
		this.servicioclientesEliminados = servicioclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarServicioCliente() {
		return jComboBoxTiposSeleccionarServicioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarServicioCliente(
			JComboBox jComboBoxTiposSeleccionarServicioCliente) {
		this.jComboBoxTiposSeleccionarServicioCliente = jComboBoxTiposSeleccionarServicioCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarServicioCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralServicioCliente() {
		return jTextFieldValorCampoGeneralServicioCliente;
	}

	public void setjTextFieldValorCampoGeneralServicioCliente(
			JTextField jTextFieldValorCampoGeneralServicioCliente) {
		this.jTextFieldValorCampoGeneralServicioCliente = jTextFieldValorCampoGeneralServicioCliente;
	}

	public void setBorderResaltarValorCampoGeneralServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralServicioCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosServicioCliente() {
		return this.jCheckBoxSeleccionarTodosServicioCliente;
	}

	public void setjCheckBoxSeleccionarTodosServicioCliente(
			JCheckBox jCheckBoxSeleccionarTodosServicioCliente) {
		this.jCheckBoxSeleccionarTodosServicioCliente = jCheckBoxSeleccionarTodosServicioCliente;
	}

	public void setBorderResaltarSeleccionarTodosServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosServicioCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosServicioCliente() {
		return this.jCheckBoxSeleccionadosServicioCliente;
	}

	public void setjCheckBoxSeleccionadosServicioCliente(
			JCheckBox jCheckBoxSeleccionadosServicioCliente) {
		this.jCheckBoxSeleccionadosServicioCliente = jCheckBoxSeleccionadosServicioCliente;
	}
	
	public void setBorderResaltarSeleccionadosServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosServicioCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesServicioCliente() {
		return this.jComboBoxTiposArchivosReportesServicioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesServicioCliente(
			JComboBox jComboBoxTiposArchivosReportesServicioCliente) {
		this.jComboBoxTiposArchivosReportesServicioCliente = jComboBoxTiposArchivosReportesServicioCliente;
	}

	public void setBorderResaltarTiposArchivosReportesServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesServicioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesServicioCliente() {
		return this.jComboBoxTiposReportesServicioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesServicioCliente(
			JComboBox jComboBoxTiposReportesServicioCliente) {
		this.jComboBoxTiposReportesServicioCliente = jComboBoxTiposReportesServicioCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoServicioCliente() {
	//	return jComboBoxTiposReportesDinamicoServicioCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoServicioCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoServicioCliente) {
	//	this.jComboBoxTiposReportesDinamicoServicioCliente = jComboBoxTiposReportesDinamicoServicioCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoServicioCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoServicioCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoServicioCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoServicioCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoServicioCliente = jComboBoxTiposArchivosReportesDinamicoServicioCliente;
	//}
	
	public void setBorderResaltarTiposReportesServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesServicioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesServicioCliente() {
		return this.jComboBoxTiposGraficosReportesServicioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesServicioCliente(
			JComboBox jComboBoxTiposGraficosReportesServicioCliente) {
		this.jComboBoxTiposGraficosReportesServicioCliente = jComboBoxTiposGraficosReportesServicioCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesServicioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionServicioCliente() {
		return this.jComboBoxTiposPaginacionServicioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionServicioCliente(
			JComboBox jComboBoxTiposPaginacionServicioCliente) {
		this.jComboBoxTiposPaginacionServicioCliente = jComboBoxTiposPaginacionServicioCliente;
	}
	
	public void setBorderResaltarTiposPaginacionServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionServicioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesServicioCliente() {
		return this.jComboBoxTiposRelacionesServicioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicioCliente() {
		return this.jComboBoxTiposAccionesServicioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicioCliente(
			JComboBox jComboBoxTiposRelacionesServicioCliente) {
		this.jComboBoxTiposRelacionesServicioCliente = jComboBoxTiposRelacionesServicioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicioCliente(
			JComboBox jComboBoxTiposAccionesServicioCliente) {
		this.jComboBoxTiposAccionesServicioCliente = jComboBoxTiposAccionesServicioCliente;
	}
	
	public void setBorderResaltarTiposRelacionesServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesServicioCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesServicioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesServicioCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoServicioCliente() {
	//	return jCheckBoxConGraficoDinamicoServicioCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoServicioCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoServicioCliente) {
	//	this.jCheckBoxConGraficoDinamicoServicioCliente = jCheckBoxConGraficoDinamicoServicioCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoServicioCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarServicioCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoServicioCliente .setBorder(borderResaltar);		
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
		this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		
		this.servicioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.servicioclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		ServicioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarServicioCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"nuevo","nuevo","Nuevo"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"duplicar","duplicar","Duplicar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"copiar","copiar","Copiar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"ver_form","ver_form","Ver"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"recargar","recargar","Recargar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarServicioCliente,this.jTtoolBarServicioCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarServicioCliente,this.jTtoolBarServicioCliente,
							"cerrar","cerrar","Salir"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarServicioCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarServicioCliente;
			
				this.jButtonProcesarInformacionToolBarServicioCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarServicioCliente;
				
		//protected JButton jButtonModificarToolBarServicioCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarServicioCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuServicioCliente=new JMenuMe("General");
		this.jmenuArchivoServicioCliente=new JMenuMe("Archivo");
		this.jmenuAccionesServicioCliente=new JMenuMe("Acciones");
		this.jmenuDatosServicioCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicioCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicioCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicioCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarServicioCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarServicioCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarServicioCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesServicioCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesServicioCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesServicioCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosServicioCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicioCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicioCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarServicioCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarServicioCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarServicioCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormServicioCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormServicioCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormServicioCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaServicioCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaServicioCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaServicioCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionServicioCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionServicioCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionServicioCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionServicioCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionServicioCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionServicioCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresServicioCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresServicioCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresServicioCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesServicioCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesServicioCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesServicioCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByServicioCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByServicioCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByServicioCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicioCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByServicioCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByServicioCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByServicioCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicioCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosServicioCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosServicioCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosServicioCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoServicioCliente.add(this.jMenuItemCerrarServicioCliente);
			
			this.jmenuAccionesServicioCliente.add(this.jMenuItemNuevoServicioCliente);
			this.jmenuAccionesServicioCliente.add(this.jMenuItemNuevoGuardarCambiosServicioCliente);
			this.jmenuAccionesServicioCliente.add(this.jMenuItemNuevoRelacionesServicioCliente);
			this.jmenuAccionesServicioCliente.add(this.jMenuItemGuardarCambiosTablaServicioCliente);		
			this.jmenuAccionesServicioCliente.add(this.jMenuItemDuplicarServicioCliente);		
			this.jmenuAccionesServicioCliente.add(this.jMenuItemCopiarServicioCliente);		
			this.jmenuAccionesServicioCliente.add(this.jMenuItemVerFormServicioCliente);		
			
			this.jmenuDatosServicioCliente.add(this.jMenuItemRecargarInformacionServicioCliente);				
			this.jmenuDatosServicioCliente.add(this.jMenuItemAnterioresServicioCliente);				
			this.jmenuDatosServicioCliente.add(this.jMenuItemSiguientesServicioCliente);				
			this.jmenuDatosServicioCliente.add(this.jMenuItemAbrirOrderByServicioCliente);				
			this.jmenuDatosServicioCliente.add(this.jMenuItemMostrarOcultarServicioCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesServicioCliente.add(this.jMenuItemGuardarCambiosServicioCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarServicioCliente.add(this.jmenuArchivoServicioCliente);		
			this.jmenuBarServicioCliente.add(this.jmenuAccionesServicioCliente);		
			this.jmenuBarServicioCliente.add(this.jmenuDatosServicioCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarServicioCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasServicioCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaServicioCliente.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaServicioCliente= new JButtonMe();
		this.jButtonFK_IdBodegaServicioCliente.setText("Buscar");
		this.jButtonFK_IdBodegaServicioCliente.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaServicioCliente,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaServicioCliente = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaServicioCliente.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaServicioCliente.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaServicioCliente= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteServicioCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteServicioCliente= new JButtonMe();
		this.jButtonFK_IdClienteServicioCliente.setText("Buscar");
		this.jButtonFK_IdClienteServicioCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteServicioCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteServicioCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteServicioCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteServicioCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteServicioCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.setFocusable(false);

		this.jPanelFK_IdProductoServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoServicioCliente.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoServicioCliente= new JButtonMe();
		this.jButtonFK_IdProductoServicioCliente.setText("Buscar");
		this.jButtonFK_IdProductoServicioCliente.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoServicioCliente,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoServicioCliente = new JLabelMe();
		jLabelid_productoFK_IdProductoServicioCliente.setText("Producto :");
		jLabelid_productoFK_IdProductoServicioCliente.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoServicioCliente= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoServicioCliente= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.setFocusable(false);

		this.jPanelFK_IdTipoPrecioServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioServicioCliente.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioServicioCliente= new JButtonMe();
		this.jButtonFK_IdTipoPrecioServicioCliente.setText("Buscar");
		this.jButtonFK_IdTipoPrecioServicioCliente.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioServicioCliente,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasServicioCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasServicioCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicioCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicioCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasServicioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleServicioCliente = new ServicioClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Servicio Cliente DATOS");
			this.jInternalFrameDetalleFormServicioCliente = new ServicioClienteDetalleFormJInternalFrame(jDesktopPane,this.servicioclienteSessionBean.getConGuardarRelaciones(),this.servicioclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormServicioCliente = null;//new ServicioClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicioCliente= new GridBagLayout();
		
		
		this.jTableDatosServicioCliente = new JTableMe();      
		
		String sToolTipServicioCliente="";
		sToolTipServicioCliente=ServicioClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicioCliente+="(Cartera.ServicioCliente)";
		}
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicioCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosServicioCliente.setToolTipText(sToolTipServicioCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosServicioCliente);
		this.jTableDatosServicioCliente.setAutoCreateRowSorter(true);
		this.jTableDatosServicioCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosServicioCliente.setRowSelectionAllowed(true);
		this.jTableDatosServicioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosServicioCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoServicioCliente = new JButtonMe();
		this.jButtonDuplicarServicioCliente = new JButtonMe();
		this.jButtonCopiarServicioCliente = new JButtonMe();
		this.jButtonVerFormServicioCliente = new JButtonMe();
		this.jButtonNuevoRelacionesServicioCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaServicioCliente = new JButtonMe();
		this.jButtonCerrarServicioCliente = new JButtonMe();
		
		this.jScrollPanelDatosServicioCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralServicioCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Servicio Cliente";
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicioCliente.setToolTipText("Acciones");
        this.jPanelAccionesServicioCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoServicioCliente=new ReporteDinamicoJInternalFrame(ServicioClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoServicioCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionServicioCliente=new ImportacionJInternalFrame(ServicioClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionServicioCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByServicioCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByServicioCliente.setText("Orden");
		this.jButtonAbrirOrderByServicioCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicioCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioCliente,false,this);
			
			//this.cargarOrderByServicioCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioCliente,true,this);
			
			//this.cargarOrderByServicioCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosServicioCliente.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosServicioCliente.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosServicioCliente.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosServicioCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicioCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicioCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoServicioCliente.setText("Nuevo");
		this.jButtonDuplicarServicioCliente.setText("Duplicar");
		this.jButtonCopiarServicioCliente.setText("Copiar");
		this.jButtonVerFormServicioCliente.setText("Ver");
		this.jButtonNuevoRelacionesServicioCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaServicioCliente.setText("Guardar");
		this.jButtonCerrarServicioCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicioCliente,"nuevo_button","Nuevo",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarServicioCliente,"duplicar_button","Duplicar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarServicioCliente,"copiar_button","Copiar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormServicioCliente,"ver_form","Ver",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesServicioCliente,"nuevorelaciones_button","Nuevo Rel",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicioCliente,"guardarcambiostabla_button","Guardar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicioCliente,"cerrar_button","Salir",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoServicioCliente.setToolTipText("Nuevo"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarServicioCliente.setToolTipText("Duplicar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarServicioCliente.setToolTipText("Copiar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormServicioCliente.setToolTipText("Ver"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesServicioCliente.setToolTipText("Nuevo Rel"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaServicioCliente.setToolTipText("Guardar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicioCliente.setToolTipText("Salir"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicioCliente";
		inputMap = this.jButtonNuevoServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicioCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarServicioCliente";
		inputMap = this.jButtonDuplicarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarServicioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarServicioCliente"));
		
		//COPIAR
		sMapKey = "CopiarServicioCliente";
		inputMap = this.jButtonCopiarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarServicioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarServicioCliente"));
		
		//VEr FORM
		sMapKey = "VerFormServicioCliente";
		inputMap = this.jButtonVerFormServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormServicioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormServicioCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesServicioCliente";
		inputMap = this.jButtonNuevoRelacionesServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesServicioCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarServicioCliente";
		inputMap = this.jButtonModificarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarServicioCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarServicioCliente";
		inputMap = this.jButtonCerrarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicioCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicioCliente";
		inputMap = this.jButtonGuardarCambiosTablaServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicioCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesServicioCliente.setName("jPanelParametrosReportesServicioCliente"); 
		
		this.jPanelParametrosReportesAccionesServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesServicioCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesServicioCliente.setName("jPanelParametrosReportesAccionesServicioCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionServicioCliente = new JButtonMe();
		this.jButtonRecargarInformacionServicioCliente.setText("Recargar");
		this.jButtonRecargarInformacionServicioCliente.setToolTipText("Recargar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionServicioCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionServicioCliente = new JButtonMe();
		this.jButtonProcesarInformacionServicioCliente.setText("Procesar");
		this.jButtonProcesarInformacionServicioCliente.setToolTipText("Procesar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionServicioCliente.setVisible(false);
			
		this.jButtonProcesarInformacionServicioCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicioCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicioCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesServicioCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioCliente.setText("TIPO");       
		this.jComboBoxTiposReportesServicioCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesServicioCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionServicioCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionServicioCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesServicioCliente.setText("Accion");
		this.jComboBoxTiposRelacionesServicioCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicioCliente.setText("Accion");
		this.jComboBoxTiposAccionesServicioCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarServicioCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarServicioCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralServicioCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralServicioCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicioCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicioCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesServicioCliente = new JLabelMe();
		
		this.jLabelAccionesServicioCliente.setText("Acciones");		
		this.jLabelAccionesServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosServicioCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosServicioCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosServicioCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosServicioCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosServicioCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosServicioCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaServicioCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaServicioCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaServicioCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteServicioCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteServicioCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteServicioCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresServicioCliente = new JButtonMe();
		//this.jButtonAnterioresServicioCliente.setText("<<");
        this.jButtonAnterioresServicioCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresServicioCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesServicioCliente = new JButtonMe();
		//this.jButtonSiguientesServicioCliente.setText(">>");
        this.jButtonSiguientesServicioCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesServicioCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosServicioCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosServicioCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosServicioCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosServicioCliente,"nuevoguardarcambios_button","Nue",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosServicioCliente";
		inputMap = this.jButtonNuevoGuardarCambiosServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosServicioCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionServicioCliente";
		inputMap = this.jButtonRecargarInformacionServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionServicioCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesServicioCliente";
		inputMap = this.jButtonSiguientesServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesServicioCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresServicioCliente";
		inputMap = this.jButtonAnterioresServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresServicioCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasServicioCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesServicioCliente.setMinimumSize(new Dimension(this.getWidth(),ServicioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicioCliente.setMaximumSize(new Dimension(this.getWidth(),ServicioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicioCliente.setPreferredSize(new Dimension(this.getWidth(),ServicioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionServicioCliente = new GridBagLayout();

			this.jPanelPaginacionServicioCliente.setLayout(gridaBagLayoutPaginacionServicioCliente);						
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 0;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionServicioCliente.add(this.jButtonAnterioresServicioCliente, this.gridBagConstraintsServicioCliente);
					
						
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicioCliente.gridy = 0;
			
			this.jPanelPaginacionServicioCliente.add(this.jButtonNuevoGuardarCambiosServicioCliente, this.gridBagConstraintsServicioCliente);
						
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicioCliente.gridy = 0;
			this.jPanelPaginacionServicioCliente.add(this.jButtonSiguientesServicioCliente, this.gridBagConstraintsServicioCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 1;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioCliente.add(this.jButtonNuevoServicioCliente, this.gridBagConstraintsServicioCliente);
						
			
			
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsServicioCliente = new GridBagConstraints();
				this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsServicioCliente.gridy = 1;
				this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionServicioCliente.add(this.jButtonGuardarCambiosTablaServicioCliente, this.gridBagConstraintsServicioCliente);
			}
			
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 1;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioCliente.add(this.jButtonDuplicarServicioCliente, this.gridBagConstraintsServicioCliente);
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 1;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioCliente.add(this.jButtonCopiarServicioCliente, this.gridBagConstraintsServicioCliente);
		
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 1;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioCliente.add(this.jButtonVerFormServicioCliente, this.gridBagConstraintsServicioCliente);
		
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 1;
			this.gridBagConstraintsServicioCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionServicioCliente.add(this.jButtonCerrarServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		
		this.jButtonRecargarInformacionServicioCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicioCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicioCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesServicioCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicioCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicioCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesServicioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesServicioCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicioCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicioCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionServicioCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicioCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicioCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesServicioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesServicioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarServicioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaServicioCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicioCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicioCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteServicioCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicioCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicioCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosServicioCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicioCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicioCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosServicioCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicioCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicioCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesServicioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesServicioCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ServicioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ServicioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ServicioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ServicioCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesServicioCliente.setLayout(gridaBagParametrosReportesServicioCliente);
			this.jPanelParametrosReportesAccionesServicioCliente.setLayout(gridaBagParametrosReportesAccionesServicioCliente);
			
			
			this.jPanelParametrosAuxiliar1ServicioCliente.setLayout(gridaBagParametrosAuxiliar1ServicioCliente);
			this.jPanelParametrosAuxiliar2ServicioCliente.setLayout(gridaBagParametrosAuxiliar2ServicioCliente);
			this.jPanelParametrosAuxiliar3ServicioCliente.setLayout(gridaBagParametrosAuxiliar3ServicioCliente);
			this.jPanelParametrosAuxiliar4ServicioCliente.setLayout(gridaBagParametrosAuxiliar4ServicioCliente);
			//this.jPanelParametrosAuxiliar5ServicioCliente.setLayout(gridaBagParametrosAuxiliar2ServicioCliente);			
			
			
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioCliente.add(this.jButtonRecargarInformacionServicioCliente, this.gridBagConstraintsServicioCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioCliente.add(this.jComboBoxTiposPaginacionServicioCliente, this.gridBagConstraintsServicioCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioCliente.add(this.jCheckBoxConAltoMaximoTablaServicioCliente, this.gridBagConstraintsServicioCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioCliente.add(this.jComboBoxTiposArchivosReportesServicioCliente, this.gridBagConstraintsServicioCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioCliente.add(this.jPanelParametrosAuxiliar1ServicioCliente, this.gridBagConstraintsServicioCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ServicioCliente.add(this.jComboBoxTiposReportesServicioCliente, this.gridBagConstraintsServicioCliente);																		
			
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ServicioCliente.add(this.jComboBoxTiposGraficosReportesServicioCliente, this.gridBagConstraintsServicioCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioCliente.add(this.jPanelParametrosAuxiliar4ServicioCliente, this.gridBagConstraintsServicioCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioCliente.add(this.jComboBoxTiposReportesServicioCliente, this.gridBagConstraintsServicioCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioCliente.add(this.jCheckBoxGenerarReporteServicioCliente, this.gridBagConstraintsServicioCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioCliente.add(this.jPanelParametrosAuxiliar2ServicioCliente, this.gridBagConstraintsServicioCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioCliente.add(this.jLabelAccionesServicioCliente, this.gridBagConstraintsServicioCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsServicioCliente = new GridBagConstraints();
				this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesServicioCliente.add(this.jButtonAbrirOrderByServicioCliente, this.gridBagConstraintsServicioCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioCliente.add(this.jComboBoxTiposSeleccionarServicioCliente, this.gridBagConstraintsServicioCliente);			
			
			
			/*
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioCliente.add(this.jCheckBoxSeleccionarTodosServicioCliente, this.gridBagConstraintsServicioCliente);
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioCliente.add(this.jCheckBoxConGraficoReporteServicioCliente, this.gridBagConstraintsServicioCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioCliente.add(this.jCheckBoxSeleccionarTodosServicioCliente, this.gridBagConstraintsServicioCliente);															
				
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioCliente.add(this.jCheckBoxSeleccionadosServicioCliente, this.gridBagConstraintsServicioCliente);															
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioCliente.add(this.jCheckBoxConGraficoReporteServicioCliente, this.gridBagConstraintsServicioCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioCliente.add(this.jPanelParametrosAuxiliar3ServicioCliente, this.gridBagConstraintsServicioCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioCliente.add(this.jComboBoxTiposAccionesServicioCliente, this.gridBagConstraintsServicioCliente);
	
				
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioCliente.add(this.jTextFieldValorCampoGeneralServicioCliente, this.gridBagConstraintsServicioCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosServicioCliente = new GridBagLayout();

			this.jScrollPanelDatosServicioCliente.setLayout(gridaBagLayoutDatosServicioCliente);
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = 0;
			this.gridBagConstraintsServicioCliente.gridx = 0;
			
			this.jScrollPanelDatosServicioCliente.add(this.jTableDatosServicioCliente, this.gridBagConstraintsServicioCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosServicioCliente.setViewportView(this.jTableDatosServicioCliente);
		this.jTableDatosServicioCliente.setFillsViewportHeight(true);
		this.jTableDatosServicioCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesServicioCliente= new GridBagLayout();
		this.jPanelAccionesServicioCliente.setLayout(gridaBagLayoutAccionesServicioCliente);
		
		
		/*	
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 0;
			
		this.jPanelAccionesServicioCliente.add(this.jButtonNuevoServicioCliente, this.gridBagConstraintsServicioCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaServicioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaServicioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaServicioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaServicioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaServicioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaServicioCliente.setLayout(gridaBagLayoutFK_IdBodegaServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdBodegaServicioCliente.add(jLabelid_bodegaFK_IdBodegaServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 1;
		jPanelFK_IdBodegaServicioCliente.add(jComboBoxid_bodegaFK_IdBodegaServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 1;
		gridBagConstraintsServicioCliente.gridx =1;
		jPanelFK_IdBodegaServicioCliente.add(jButtonFK_IdBodegaServicioCliente, gridBagConstraintsServicioCliente);

		jTabbedPaneBusquedasServicioCliente.addTab("1.-Por Bodega ", jPanelFK_IdBodegaServicioCliente);
		jTabbedPaneBusquedasServicioCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteServicioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteServicioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteServicioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteServicioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteServicioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteServicioCliente.setLayout(gridaBagLayoutFK_IdClienteServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdClienteServicioCliente.add(jLabelid_clienteFK_IdClienteServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 1;
		jPanelFK_IdClienteServicioCliente.add(jComboBoxid_clienteFK_IdClienteServicioCliente, gridBagConstraintsServicioCliente);


		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdClienteServicioCliente.add(this.jButtonBuscarFK_IdClienteid_clienteServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 1;
		gridBagConstraintsServicioCliente.gridx =1;
		jPanelFK_IdClienteServicioCliente.add(jButtonFK_IdClienteServicioCliente, gridBagConstraintsServicioCliente);

		jTabbedPaneBusquedasServicioCliente.addTab("2.-Por Cliente ", jPanelFK_IdClienteServicioCliente);
		jTabbedPaneBusquedasServicioCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoServicioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdProductoServicioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoServicioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoServicioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoServicioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoServicioCliente.setLayout(gridaBagLayoutFK_IdProductoServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdProductoServicioCliente.add(jLabelid_productoFK_IdProductoServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 1;
		jPanelFK_IdProductoServicioCliente.add(jComboBoxid_productoFK_IdProductoServicioCliente, gridBagConstraintsServicioCliente);


		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdProductoServicioCliente.add(this.jButtonBuscarFK_IdProductoid_productoServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 1;
		gridBagConstraintsServicioCliente.gridx =1;
		jPanelFK_IdProductoServicioCliente.add(jButtonFK_IdProductoServicioCliente, gridBagConstraintsServicioCliente);

		jTabbedPaneBusquedasServicioCliente.addTab("3.-Por Producto ", jPanelFK_IdProductoServicioCliente);
		jTabbedPaneBusquedasServicioCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioServicioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioServicioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioServicioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioServicioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioServicioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioServicioCliente.setLayout(gridaBagLayoutFK_IdTipoPrecioServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 0;
		jPanelFK_IdTipoPrecioServicioCliente.add(jLabelid_tipo_precioFK_IdTipoPrecioServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 0;
		gridBagConstraintsServicioCliente.gridx = 1;
		jPanelFK_IdTipoPrecioServicioCliente.add(jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente, gridBagConstraintsServicioCliente);

		gridBagConstraintsServicioCliente = new GridBagConstraints();
		gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioCliente.gridy = 1;
		gridBagConstraintsServicioCliente.gridx =1;
		jPanelFK_IdTipoPrecioServicioCliente.add(jButtonFK_IdTipoPrecioServicioCliente, gridBagConstraintsServicioCliente);

		jTabbedPaneBusquedasServicioCliente.addTab("4.-Por Tipo Precio ", jPanelFK_IdTipoPrecioServicioCliente);
		jTabbedPaneBusquedasServicioCliente.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicioCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicioCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();						
			this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioCliente.gridx = 0;		
			//this.gridBagConstraintsServicioCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicioCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarServicioCliente, this.gridBagConstraintsServicioCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsServicioCliente.gridx = 0;		
		//this.gridBagConstraintsServicioCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsServicioCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsServicioCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioCliente.gridx = 0;		
			this.gridBagConstraintsServicioCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsServicioCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasServicioCliente, this.gridBagConstraintsServicioCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesServicioCliente, this.gridBagConstraintsServicioCliente);								
		
		
		/*
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesServicioCliente, this.gridBagConstraintsServicioCliente);
		*/		
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicioCliente.gridx =0;
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicioCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicioCliente, this.gridBagConstraintsServicioCliente);
				
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionServicioCliente, this.gridBagConstraintsServicioCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosServicioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicioCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosServicioCliente.setLayout(gridaBagLayoutBusquedasParametrosServicioCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralServicioCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicioCliente, this.gridBagConstraintsServicioCliente);
			
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicioCliente, this.gridBagConstraintsServicioCliente);
		
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicioCliente, this.gridBagConstraintsServicioCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralServicioCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoServicioCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoServicioCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoServicioCliente.setName("jPanelReporteDinamicoServicioCliente"); 
		
		this.jPanelReporteDinamicoServicioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoServicioCliente.setLayout(gridaBagLayoutReporteDinamicoServicioCliente);
		
		
		this.jInternalFrameReporteDinamicoServicioCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoServicioCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicioCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoServicioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoServicioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoServicioCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoServicioCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoServicioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoServicioCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoServicioCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoServicioCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoServicioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteServicioCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteServicioCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelColumnasSelectReporteServicioCliente, this.gridBagConstraintsServicioCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteServicioCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteServicioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteServicioCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteServicioCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicioCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteServicioCliente=new JScrollPane(this.jListColumnasSelectReporteServicioCliente);
			
			this.jScrollColumnasSelectReporteServicioCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicioCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicioCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoServicioCliente.add(this.jListColumnasSelectReporteServicioCliente, this.gridBagConstraintsServicioCliente);
		this.jPanelReporteDinamicoServicioCliente.add(this.jScrollColumnasSelectReporteServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteServicioCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteServicioCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteServicioCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteServicioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteServicioCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteServicioCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicioCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteServicioCliente=new JScrollPane(this.jListRelacionesSelectReporteServicioCliente);
			
			this.jScrollRelacionesSelectReporteServicioCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicioCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicioCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoServicioCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoServicioCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoServicioCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoServicioCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoServicioCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoServicioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoServicioCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoServicioCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoServicioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoServicioCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoServicioCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelConGraficoDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoServicioCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoServicioCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoServicioCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoServicioCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicioCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicioCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jCheckBoxConGraficoDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoServicioCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoServicioCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelColumnaCategoriaGraficoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoServicioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicioCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoServicioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoServicioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoServicioCliente.add(this.jComboBoxColumnaCategoriaGraficoServicioCliente, this.gridBagConstraintsServicioCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorServicioCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorServicioCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelColumnaCategoriaValorServicioCliente, this.gridBagConstraintsServicioCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorServicioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorServicioCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorServicioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorServicioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoServicioCliente.add(this.jComboBoxColumnaCategoriaValorServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoServicioCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoServicioCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelColumnasValoresGraficoServicioCliente, this.gridBagConstraintsServicioCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoServicioCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoServicioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoServicioCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoServicioCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicioCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoServicioCliente=new JScrollPane(this.jListColumnasValoresGraficoServicioCliente);
			
			this.jScrollColumnasValoresGraficoServicioCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicioCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicioCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoServicioCliente.add(this.jListColumnasSelectReporteServicioCliente, this.gridBagConstraintsServicioCliente);
		this.jPanelReporteDinamicoServicioCliente.add(this.jScrollColumnasValoresGraficoServicioCliente, this.gridBagConstraintsServicioCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoServicioCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoServicioCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelTiposGraficosReportesDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoServicioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicioCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoServicioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoServicioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jComboBoxTiposGraficosReportesDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoServicioCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoServicioCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelGenerarExcelReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoServicioCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoServicioCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoServicioCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoServicioCliente.setToolTipText("Generar EXCEL"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoServicioCliente.add(this.jButtonGenerarExcelReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioCliente.add(this.jComboBoxTiposReportesDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoServicioCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoServicioCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioCliente.add(this.jLabelTiposArchivoReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioCliente.add(this.jComboBoxTiposArchivosReportesDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoServicioCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoServicioCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoServicioCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoServicioCliente.setToolTipText("Generar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioCliente.add(this.jButtonGenerarReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoServicioCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoServicioCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoServicioCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoServicioCliente.setToolTipText("Cancelar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioCliente.add(this.jButtonCerrarReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalServicioCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoServicioCliente= new JScrollPane(jPanelReporteDinamicoServicioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoServicioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsServicioCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoServicioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoServicioCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalServicioCliente);
		this.jInternalFrameReporteDinamicoServicioCliente.getContentPane().add(this.jScrollPanelReporteDinamicoServicioCliente, this.gridBagConstraintsServicioCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionServicioCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionServicioCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionServicioCliente.setName("jPanelImportacionServicioCliente"); 
		
		this.jPanelImportacionServicioCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicioCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicioCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionServicioCliente.setLayout(gridaBagLayoutImportacionServicioCliente);
		
		
		this.jInternalFrameImportacionServicioCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionServicioCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionServicioCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicioCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionServicioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicioCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionServicioCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicioCliente.setResizable(true);
	    this.jInternalFrameImportacionServicioCliente.setClosable(true);
	    this.jInternalFrameImportacionServicioCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionServicioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicioCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionServicioCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicioCliente.setResizable(true);
	    this.jInternalFrameImportacionServicioCliente.setClosable(true);
	    this.jInternalFrameImportacionServicioCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionServicioCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicioCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicioCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionServicioCliente = new JLabelMe();

		this.jLabelArchivoImportacionServicioCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicioCliente.add(this.jLabelArchivoImportacionServicioCliente, this.gridBagConstraintsServicioCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionServicioCliente = new JFileChooser();		
		this.jFileChooserImportacionServicioCliente.setToolTipText("ESCOGER ARCHIVO"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionServicioCliente = new JButtonMe();
		this.jButtonAbrirImportacionServicioCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionServicioCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionServicioCliente.setToolTipText("Generar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioCliente.add(this.jButtonAbrirImportacionServicioCliente, this.gridBagConstraintsServicioCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionServicioCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionServicioCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicioCliente.add(this.jLabelPathArchivoImportacionServicioCliente, this.gridBagConstraintsServicioCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionServicioCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionServicioCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicioCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicioCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioCliente.add(this.jTextFieldPathArchivoImportacionServicioCliente, this.gridBagConstraintsServicioCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionServicioCliente = new JButtonMe();
		this.jButtonGenerarImportacionServicioCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionServicioCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionServicioCliente.setToolTipText("Generar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioCliente.add(this.jButtonGenerarImportacionServicioCliente, this.gridBagConstraintsServicioCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionServicioCliente = new JButtonMe();
		this.jButtonCerrarImportacionServicioCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionServicioCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionServicioCliente.setToolTipText("Cancelar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioCliente.add(this.jButtonCerrarImportacionServicioCliente, this.gridBagConstraintsServicioCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalServicioCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionServicioCliente= new JScrollPane(jPanelImportacionServicioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsServicioCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionServicioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionServicioCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalServicioCliente);
		this.jInternalFrameImportacionServicioCliente.getContentPane().add(this.jScrollPanelImportacionServicioCliente, this.gridBagConstraintsServicioCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByServicioCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByServicioCliente = new JButtonMe();
			this.jButtonAbrirOrderByServicioCliente.setText("Orden");
			this.jButtonAbrirOrderByServicioCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicioCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByServicioCliente";
			inputMap = this.jButtonAbrirOrderByServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByServicioCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByServicioCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByServicioCliente.setName("jPanelOrderByServicioCliente"); 
			
			this.jPanelOrderByServicioCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicioCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicioCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByServicioCliente.setLayout(gridaBagLayoutOrderByServicioCliente);
			
			
			this.jTableDatosServicioClienteOrderBy = new JTableMe();        
			this.jTableDatosServicioClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosServicioClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosServicioClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosServicioClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosServicioClienteOrderBy.setViewportView(this.jTableDatosServicioClienteOrderBy);
			this.jTableDatosServicioClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosServicioClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByServicioCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByServicioCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByServicioCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteServicioCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByServicioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByServicioCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByServicioCliente.setTitle("Orden");
			this.jInternalFrameOrderByServicioCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByServicioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByServicioCliente.setResizable(true);
			this.jInternalFrameOrderByServicioCliente.setClosable(true);
			this.jInternalFrameOrderByServicioCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByServicioCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicioCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicioCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsServicioCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsServicioCliente.ipady =150;
				
			this.jPanelOrderByServicioCliente.add(jScrollPanelDatosServicioClienteOrderBy, this.gridBagConstraintsServicioCliente);//this.jTableDatosServicioClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByServicioCliente = new JButtonMe();
			this.jButtonCerrarOrderByServicioCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByServicioCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByServicioCliente.setToolTipText("Cancelar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsServicioCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByServicioCliente.add(this.jButtonCerrarOrderByServicioCliente, this.gridBagConstraintsServicioCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalServicioCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByServicioCliente= new JScrollPane(jPanelOrderByServicioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsServicioCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByServicioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByServicioCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalServicioCliente);
			
			this.jInternalFrameOrderByServicioCliente.getContentPane().add(this.jScrollPanelOrderByServicioCliente, this.gridBagConstraintsServicioCliente);			
		
		} else {
			this.jButtonAbrirOrderByServicioCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.servicioclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosServicioCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosServicioCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosServicioCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosServicioCliente.getRowHeight();//ServicioClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ServicioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicioCliente.isSelected()) {
					iHeightTable=ServicioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ServicioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicioCliente.isSelected()) {
					iHeightTable=ServicioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosServicioCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicioCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicioCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosServicioCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicioCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicioCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByServicioCliente!=null && this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByServicioCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByServicioCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByServicioCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosServicioCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicioCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicioCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=servicioclienteLogic.getServicioClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=servicioclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ServicioCliente> TraerServicioClienteBeans(List<ServicioCliente> servicioclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(ServicioCliente serviciocliente:servicioclientes) {
					
				if(!(ServicioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ServicioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					serviciocliente.setsDetalleGeneralEntityReporte(ServicioClienteConstantesFunciones.getServicioClienteDescripcion(serviciocliente));
										
						
					
						
					
				} else  {
							
					//serviciocliente.setsDetalleGeneralEntityReporte(serviciocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//servicioclientebeans.add(servicioclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return servicioclientes;
    }
	//PARA REPORTES FIN
}
