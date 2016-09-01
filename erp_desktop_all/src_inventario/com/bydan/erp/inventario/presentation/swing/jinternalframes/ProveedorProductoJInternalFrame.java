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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.ProveedorProductoConstantesFunciones;

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
public class ProveedorProductoJInternalFrame extends ProveedorProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProveedorProducto;
	
	protected JMenuBar jmenuBarProveedorProducto;
	
	protected JMenu jmenuProveedorProducto;
	protected JMenu jmenuDatosProveedorProducto;
	protected JMenu jmenuArchivoProveedorProducto;
	protected JMenu jmenuAccionesProveedorProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProveedorProducto;	
	protected GridBagConstraints gridBagConstraintsProveedorProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProveedorProductoDetalleFormJInternalFrame jInternalFrameDetalleFormProveedorProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProveedorProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProveedorProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ProveedorProductoSessionBean proveedorproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProveedorProducto> proveedorproductos;		
	public List<ProveedorProducto> proveedorproductosEliminados;	
	public List<ProveedorProducto> proveedorproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProveedorProducto;		
	protected JButton jButtonAbrirOrderByProveedorProducto;
	
	
	//protected JPanel jPanelOrderByProveedorProducto;
	//public JScrollPane jScrollPanelOrderByProveedorProducto;	
	//protected JButton jButtonCerrarOrderByProveedorProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProveedorProductoLogic proveedorproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProveedorProducto;
	public JScrollPane jScrollPanelDatosEdicionProveedorProducto;
	public JScrollPane jScrollPanelDatosGeneralProveedorProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosProveedorProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProveedorProducto;
	//public JScrollPane jScrollPanelImportacionProveedorProducto;
	
	
	
	protected JPanel jPanelAccionesProveedorProducto;
	
    protected JPanel jPanelPaginacionProveedorProducto;
    protected JPanel jPanelParametrosReportesProveedorProducto;
	protected JPanel jPanelParametrosReportesAccionesProveedorProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProveedorProducto;
	protected JPanel jPanelParametrosAuxiliar2ProveedorProducto;
	protected JPanel jPanelParametrosAuxiliar3ProveedorProducto;
	protected JPanel jPanelParametrosAuxiliar4ProveedorProducto;
	//protected JPanel jPanelParametrosAuxiliar5ProveedorProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoProveedorProducto;
	//protected JPanel jPanelImportacionProveedorProducto;
	
	
	public JTable jTableDatosProveedorProducto;
	
	
	
	//public JTable jTableDatosProveedorProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProveedorProducto;
	protected JButton jButtonDuplicarProveedorProducto;
	protected JButton jButtonCopiarProveedorProducto;
	protected JButton jButtonVerFormProveedorProducto;
	protected JButton jButtonNuevoRelacionesProveedorProducto;
	protected JButton jButtonModificarProveedorProducto;
	
    protected JButton jButtonGuardarCambiosTablaProveedorProducto;
	protected JButton jButtonCerrarProveedorProducto;
	
	
	protected JButton jButtonRecargarInformacionProveedorProducto;
	protected JButton jButtonProcesarInformacionProveedorProducto;
	
	
	protected JButton jButtonAnterioresProveedorProducto;
	protected JButton jButtonSiguientesProveedorProducto;
	protected JButton jButtonNuevoGuardarCambiosProveedorProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProveedorProducto;
	//protected JButton jButtonCerrarReporteDinamicoProveedorProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoProveedorProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionProveedorProducto;
	//protected JButton jButtonGenerarImportacionProveedorProducto;
	//protected JButton jButtonCerrarImportacionProveedorProducto;
	//protected JFileChooser jFileChooserImportacionProveedorProducto;
	//protected File fileImportacionProveedorProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProveedorProducto;
	protected JButton jButtonDuplicarToolBarProveedorProducto;
	protected JButton jButtonNuevoRelacionesToolBarProveedorProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarProveedorProducto;
	protected JButton jButtonCopiarToolBarProveedorProducto;
	protected JButton jButtonVerFormToolBarProveedorProducto;
	public JButton jButtonGuardarCambiosTablaToolBarProveedorProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarProveedorProducto;
	protected JButton jButtonCerrarToolBarProveedorProducto;
	
	protected JButton jButtonRecargarInformacionToolBarProveedorProducto;
	protected JButton jButtonProcesarInformacionToolBarProveedorProducto;
	protected JButton jButtonAnterioresToolBarProveedorProducto;
	protected JButton jButtonSiguientesToolBarProveedorProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarProveedorProducto;
	protected JButton jButtonAbrirOrderByToolBarProveedorProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProveedorProducto;
	protected JMenuItem jMenuItemDuplicarProveedorProducto;
	protected JMenuItem jMenuItemNuevoRelacionesProveedorProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProveedorProducto;
	protected JMenuItem jMenuItemCopiarProveedorProducto;
	protected JMenuItem jMenuItemVerFormProveedorProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProveedorProducto;
	protected JMenuItem jMenuItemCerrarProveedorProducto;
	protected JMenuItem jMenuItemDetalleCerrarProveedorProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProveedorProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProveedorProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionProveedorProducto;
	protected JMenuItem jMenuItemProcesarInformacionProveedorProducto;
	protected JMenuItem jMenuItemAnterioresProveedorProducto;
	protected JMenuItem jMenuItemSiguientesProveedorProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProveedorProducto;
	protected JMenuItem jMenuItemAbrirOrderByProveedorProducto;
	protected JMenuItem jMenuItemMostrarOcultarProveedorProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProveedorProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProveedorProducto;
	protected JCheckBox jCheckBoxSeleccionadosProveedorProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProveedorProducto;
	protected JCheckBox jCheckBoxConGraficoReporteProveedorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProveedorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProveedorProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProveedorProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProveedorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProveedorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProveedorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProveedorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProveedorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProveedorProducto;
	protected JTextField jTextFieldValorCampoGeneralProveedorProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProveedorProducto;
	//public JList<Reporte> jListColumnasSelectReporteProveedorProducto;
	//public JScrollPane jScrollColumnasSelectReporteProveedorProducto;
	
	//public JLabel jLabelRelacionesSelectReporteProveedorProducto;
	//public JList<Reporte> jListRelacionesSelectReporteProveedorProducto;
	//public JScrollPane jScrollRelacionesSelectReporteProveedorProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProveedorProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProveedorProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProveedorProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoProveedorProducto;
	
		
	//public JLabel jLabelArchivoImportacionProveedorProducto;	
	//public JLabel jLabelPathArchivoImportacionProveedorProducto;
	//protected JTextField jTextFieldPathArchivoImportacionProveedorProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProveedorProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProveedorProducto;
	
	//public JLabel jLabelColumnaCategoriaValorProveedorProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProveedorProducto;
	
	//public JLabel jLabelColumnasValoresGraficoProveedorProducto;
	//public JList<Reporte> jListColumnasValoresGraficoProveedorProducto;
	//public JScrollPane jScrollColumnasValoresGraficoProveedorProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProveedorProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProveedorProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProveedorProducto;
	public JPanel jPanelFK_IdBodegaProveedorProducto;
	public JButton jButtonFK_IdBodegaProveedorProducto;
	public JPanel jPanelFK_IdClienteProveedorProducto;
	public JButton jButtonFK_IdClienteProveedorProducto;
	public JPanel jPanelFK_IdProductoProveedorProducto;
	public JButton jButtonFK_IdProductoProveedorProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProveedorProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProveedorProducto;
	public JButton jButtonid_bodegaFK_IdBodegaProveedorProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProveedorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteProveedorProducto;
	public JLabel jLabelid_clienteFK_IdClienteProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteProveedorProducto;
	public JButton jButtonid_clienteFK_IdClienteProveedorProducto= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProveedorProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteProveedorProducto;
	
	public JPanel jPanelid_productoFK_IdProductoProveedorProducto;
	public JLabel jLabelid_productoFK_IdProductoProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProveedorProducto;
	public JButton jButtonid_productoFK_IdProductoProveedorProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProveedorProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProveedorProducto;
	
	
	
	
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
	public ProveedorProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProveedorProducto)	{
		this.jButtonRecargarInformacionProveedorProducto = jButtonRecargarInformacionProveedorProducto;
	}
	
	public JButton getjButtonProcesarInformacionProveedorProducto() {
		return this.jButtonProcesarInformacionProveedorProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProveedorProducto)	{
		this.jButtonProcesarInformacionProveedorProducto = jButtonProcesarInformacionProveedorProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionProveedorProducto() {
		return this.jButtonRecargarInformacionProveedorProducto;
	}
	
	
	public List<ProveedorProducto> getproveedorproductos() {
		return this.proveedorproductos;
	}

	public void setproveedorproductos(List<ProveedorProducto> proveedorproductos) {
		this.proveedorproductos = proveedorproductos;
	}
	
	public List<ProveedorProducto> getproveedorproductosAux() {
		return this.proveedorproductosAux;
	}

	public void setproveedorproductosAux(List<ProveedorProducto> proveedorproductosAux) {
		this.proveedorproductosAux = proveedorproductosAux;
	}
	
	public List<ProveedorProducto> getproveedorproductosEliminados() {
		return this.proveedorproductosEliminados;
	}

	public void setProveedorProductosEliminados(List<ProveedorProducto> proveedorproductosEliminados) {
		this.proveedorproductosEliminados = proveedorproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProveedorProducto() {
		return jComboBoxTiposSeleccionarProveedorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProveedorProducto(
			JComboBox jComboBoxTiposSeleccionarProveedorProducto) {
		this.jComboBoxTiposSeleccionarProveedorProducto = jComboBoxTiposSeleccionarProveedorProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProveedorProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProveedorProducto() {
		return jTextFieldValorCampoGeneralProveedorProducto;
	}

	public void setjTextFieldValorCampoGeneralProveedorProducto(
			JTextField jTextFieldValorCampoGeneralProveedorProducto) {
		this.jTextFieldValorCampoGeneralProveedorProducto = jTextFieldValorCampoGeneralProveedorProducto;
	}

	public void setBorderResaltarValorCampoGeneralProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProveedorProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProveedorProducto() {
		return this.jCheckBoxSeleccionarTodosProveedorProducto;
	}

	public void setjCheckBoxSeleccionarTodosProveedorProducto(
			JCheckBox jCheckBoxSeleccionarTodosProveedorProducto) {
		this.jCheckBoxSeleccionarTodosProveedorProducto = jCheckBoxSeleccionarTodosProveedorProducto;
	}

	public void setBorderResaltarSeleccionarTodosProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProveedorProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProveedorProducto() {
		return this.jCheckBoxSeleccionadosProveedorProducto;
	}

	public void setjCheckBoxSeleccionadosProveedorProducto(
			JCheckBox jCheckBoxSeleccionadosProveedorProducto) {
		this.jCheckBoxSeleccionadosProveedorProducto = jCheckBoxSeleccionadosProveedorProducto;
	}
	
	public void setBorderResaltarSeleccionadosProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProveedorProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProveedorProducto() {
		return this.jComboBoxTiposArchivosReportesProveedorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProveedorProducto(
			JComboBox jComboBoxTiposArchivosReportesProveedorProducto) {
		this.jComboBoxTiposArchivosReportesProveedorProducto = jComboBoxTiposArchivosReportesProveedorProducto;
	}

	public void setBorderResaltarTiposArchivosReportesProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProveedorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProveedorProducto() {
		return this.jComboBoxTiposReportesProveedorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProveedorProducto(
			JComboBox jComboBoxTiposReportesProveedorProducto) {
		this.jComboBoxTiposReportesProveedorProducto = jComboBoxTiposReportesProveedorProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProveedorProducto() {
	//	return jComboBoxTiposReportesDinamicoProveedorProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProveedorProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoProveedorProducto) {
	//	this.jComboBoxTiposReportesDinamicoProveedorProducto = jComboBoxTiposReportesDinamicoProveedorProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProveedorProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoProveedorProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProveedorProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProveedorProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto = jComboBoxTiposArchivosReportesDinamicoProveedorProducto;
	//}
	
	public void setBorderResaltarTiposReportesProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProveedorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProveedorProducto() {
		return this.jComboBoxTiposGraficosReportesProveedorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProveedorProducto(
			JComboBox jComboBoxTiposGraficosReportesProveedorProducto) {
		this.jComboBoxTiposGraficosReportesProveedorProducto = jComboBoxTiposGraficosReportesProveedorProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProveedorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProveedorProducto() {
		return this.jComboBoxTiposPaginacionProveedorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProveedorProducto(
			JComboBox jComboBoxTiposPaginacionProveedorProducto) {
		this.jComboBoxTiposPaginacionProveedorProducto = jComboBoxTiposPaginacionProveedorProducto;
	}
	
	public void setBorderResaltarTiposPaginacionProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProveedorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProveedorProducto() {
		return this.jComboBoxTiposRelacionesProveedorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProveedorProducto() {
		return this.jComboBoxTiposAccionesProveedorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProveedorProducto(
			JComboBox jComboBoxTiposRelacionesProveedorProducto) {
		this.jComboBoxTiposRelacionesProveedorProducto = jComboBoxTiposRelacionesProveedorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProveedorProducto(
			JComboBox jComboBoxTiposAccionesProveedorProducto) {
		this.jComboBoxTiposAccionesProveedorProducto = jComboBoxTiposAccionesProveedorProducto;
	}
	
	public void setBorderResaltarTiposRelacionesProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProveedorProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProveedorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProveedorProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProveedorProducto() {
	//	return jCheckBoxConGraficoDinamicoProveedorProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoProveedorProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoProveedorProducto) {
	//	this.jCheckBoxConGraficoDinamicoProveedorProducto = jCheckBoxConGraficoDinamicoProveedorProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProveedorProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProveedorProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProveedorProducto .setBorder(borderResaltar);		
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
		this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		
		this.proveedorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.proveedorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.proveedorproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProveedorProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProveedorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProveedorProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"nuevo","nuevo","Nuevo"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"duplicar","duplicar","Duplicar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"copiar","copiar","Copiar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"ver_form","ver_form","Ver"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"recargar","recargar","Recargar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProveedorProducto,this.jTtoolBarProveedorProducto,
							"cerrar","cerrar","Salir"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProveedorProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProveedorProducto;
			
				this.jButtonProcesarInformacionToolBarProveedorProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProveedorProducto;
				
		//protected JButton jButtonModificarToolBarProveedorProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProveedorProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProveedorProducto=new JMenuMe("General");
		this.jmenuArchivoProveedorProducto=new JMenuMe("Archivo");
		this.jmenuAccionesProveedorProducto=new JMenuMe("Acciones");
		this.jmenuDatosProveedorProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProveedorProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProveedorProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProveedorProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProveedorProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProveedorProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProveedorProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProveedorProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProveedorProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProveedorProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProveedorProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProveedorProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProveedorProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProveedorProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProveedorProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProveedorProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProveedorProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProveedorProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProveedorProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProveedorProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProveedorProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProveedorProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProveedorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProveedorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProveedorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProveedorProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProveedorProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProveedorProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProveedorProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProveedorProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProveedorProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProveedorProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProveedorProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProveedorProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProveedorProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProveedorProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProveedorProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProveedorProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProveedorProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProveedorProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProveedorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProveedorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProveedorProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProveedorProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProveedorProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProveedorProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProveedorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProveedorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProveedorProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProveedorProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProveedorProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProveedorProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProveedorProducto.add(this.jMenuItemCerrarProveedorProducto);
			
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemNuevoProveedorProducto);
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemNuevoGuardarCambiosProveedorProducto);
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemNuevoRelacionesProveedorProducto);
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemGuardarCambiosTablaProveedorProducto);		
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemDuplicarProveedorProducto);		
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemCopiarProveedorProducto);		
			this.jmenuAccionesProveedorProducto.add(this.jMenuItemVerFormProveedorProducto);		
			
			this.jmenuDatosProveedorProducto.add(this.jMenuItemRecargarInformacionProveedorProducto);				
			this.jmenuDatosProveedorProducto.add(this.jMenuItemAnterioresProveedorProducto);				
			this.jmenuDatosProveedorProducto.add(this.jMenuItemSiguientesProveedorProducto);				
			this.jmenuDatosProveedorProducto.add(this.jMenuItemAbrirOrderByProveedorProducto);				
			this.jmenuDatosProveedorProducto.add(this.jMenuItemMostrarOcultarProveedorProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProveedorProducto.add(this.jMenuItemGuardarCambiosProveedorProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProveedorProducto.add(this.jmenuArchivoProveedorProducto);		
			this.jmenuBarProveedorProducto.add(this.jmenuAccionesProveedorProducto);		
			this.jmenuBarProveedorProducto.add(this.jmenuDatosProveedorProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProveedorProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProveedorProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProveedorProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProveedorProducto= new JButtonMe();
		this.jButtonFK_IdBodegaProveedorProducto.setText("Buscar");
		this.jButtonFK_IdBodegaProveedorProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProveedorProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProveedorProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProveedorProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProveedorProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProveedorProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorProducto.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteProveedorProducto= new JButtonMe();
		this.jButtonFK_IdClienteProveedorProducto.setText("Buscar");
		this.jButtonFK_IdClienteProveedorProducto.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorProducto,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteProveedorProducto = new JLabelMe();
		jLabelid_clienteFK_IdClienteProveedorProducto.setText("Cliente :");
		jLabelid_clienteFK_IdClienteProveedorProducto.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteProveedorProducto= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.setFocusable(false);

		this.jPanelFK_IdProductoProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProveedorProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProveedorProducto= new JButtonMe();
		this.jButtonFK_IdProductoProveedorProducto.setText("Buscar");
		this.jButtonFK_IdProductoProveedorProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProveedorProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProveedorProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoProveedorProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoProveedorProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProveedorProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.setFocusable(false);


		this.jTabbedPaneBusquedasProveedorProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasProveedorProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProveedorProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProveedorProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProveedorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProveedorProducto = new ProveedorProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Proveedor DATOS");
			this.jInternalFrameDetalleFormProveedorProducto = new ProveedorProductoDetalleFormJInternalFrame(jDesktopPane,this.proveedorproductoSessionBean.getConGuardarRelaciones(),this.proveedorproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProveedorProducto = null;//new ProveedorProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProveedorProducto= new GridBagLayout();
		
		
		this.jTableDatosProveedorProducto = new JTableMe();      
		
		String sToolTipProveedorProducto="";
		sToolTipProveedorProducto=ProveedorProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProveedorProducto+="(Inventario.ProveedorProducto)";
		}
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProveedorProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProveedorProducto.setToolTipText(sToolTipProveedorProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProveedorProducto);
		this.jTableDatosProveedorProducto.setAutoCreateRowSorter(true);
		this.jTableDatosProveedorProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProveedorProducto.setRowSelectionAllowed(true);
		this.jTableDatosProveedorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProveedorProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProveedorProducto = new JButtonMe();
		this.jButtonDuplicarProveedorProducto = new JButtonMe();
		this.jButtonCopiarProveedorProducto = new JButtonMe();
		this.jButtonVerFormProveedorProducto = new JButtonMe();
		this.jButtonNuevoRelacionesProveedorProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProveedorProducto = new JButtonMe();
		this.jButtonCerrarProveedorProducto = new JButtonMe();
		
		this.jScrollPanelDatosProveedorProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralProveedorProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Proveedor";
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosProveedorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProveedorProducto.setToolTipText("Acciones");
        this.jPanelAccionesProveedorProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProveedorProducto=new ReporteDinamicoJInternalFrame(ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProveedorProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProveedorProducto=new ImportacionJInternalFrame(ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProveedorProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProveedorProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByProveedorProducto.setText("Orden");
		this.jButtonAbrirOrderByProveedorProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProveedorProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProveedorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProveedorProducto,false,this);
			
			//this.cargarOrderByProveedorProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProveedorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProveedorProducto,true,this);
			
			//this.cargarOrderByProveedorProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProveedorProducto.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProveedorProducto.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProveedorProducto.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProveedorProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProveedorProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProveedorProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProveedorProducto.setText("Nuevo");
		this.jButtonDuplicarProveedorProducto.setText("Duplicar");
		this.jButtonCopiarProveedorProducto.setText("Copiar");
		this.jButtonVerFormProveedorProducto.setText("Ver");
		this.jButtonNuevoRelacionesProveedorProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProveedorProducto.setText("Guardar");
		this.jButtonCerrarProveedorProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProveedorProducto,"nuevo_button","Nuevo",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProveedorProducto,"duplicar_button","Duplicar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProveedorProducto,"copiar_button","Copiar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProveedorProducto,"ver_form","Ver",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProveedorProducto,"nuevorelaciones_button","Nuevo Rel",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProveedorProducto,"guardarcambiostabla_button","Guardar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProveedorProducto,"cerrar_button","Salir",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProveedorProducto.setToolTipText("Nuevo"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProveedorProducto.setToolTipText("Duplicar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProveedorProducto.setToolTipText("Copiar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProveedorProducto.setToolTipText("Ver"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProveedorProducto.setToolTipText("Nuevo Rel"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProveedorProducto.setToolTipText("Guardar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProveedorProducto.setToolTipText("Salir"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProveedorProducto";
		inputMap = this.jButtonNuevoProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProveedorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProveedorProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarProveedorProducto";
		inputMap = this.jButtonDuplicarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProveedorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProveedorProducto"));
		
		//COPIAR
		sMapKey = "CopiarProveedorProducto";
		inputMap = this.jButtonCopiarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProveedorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProveedorProducto"));
		
		//VEr FORM
		sMapKey = "VerFormProveedorProducto";
		inputMap = this.jButtonVerFormProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProveedorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProveedorProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProveedorProducto";
		inputMap = this.jButtonNuevoRelacionesProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProveedorProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProveedorProducto";
		inputMap = this.jButtonModificarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProveedorProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProveedorProducto";
		inputMap = this.jButtonCerrarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProveedorProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProveedorProducto";
		inputMap = this.jButtonGuardarCambiosTablaProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProveedorProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProveedorProducto.setName("jPanelParametrosReportesProveedorProducto"); 
		
		this.jPanelParametrosReportesAccionesProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProveedorProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProveedorProducto.setName("jPanelParametrosReportesAccionesProveedorProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProveedorProducto = new JButtonMe();
		this.jButtonRecargarInformacionProveedorProducto.setText("Recargar");
		this.jButtonRecargarInformacionProveedorProducto.setToolTipText("Recargar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProveedorProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProveedorProducto = new JButtonMe();
		this.jButtonProcesarInformacionProveedorProducto.setText("Procesar");
		this.jButtonProcesarInformacionProveedorProducto.setToolTipText("Procesar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProveedorProducto.setVisible(false);
			
		this.jButtonProcesarInformacionProveedorProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProveedorProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProveedorProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProveedorProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProveedorProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProveedorProducto.setText("TIPO");       
		this.jComboBoxTiposReportesProveedorProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProveedorProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProveedorProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProveedorProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionProveedorProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProveedorProducto.setText("Accion");
		this.jComboBoxTiposRelacionesProveedorProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProveedorProducto.setText("Accion");
		this.jComboBoxTiposAccionesProveedorProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProveedorProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarProveedorProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProveedorProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProveedorProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProveedorProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProveedorProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProveedorProducto = new JLabelMe();
		
		this.jLabelAccionesProveedorProducto.setText("Acciones");		
		this.jLabelAccionesProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProveedorProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProveedorProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProveedorProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProveedorProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProveedorProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProveedorProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProveedorProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProveedorProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProveedorProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteProveedorProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProveedorProducto = new JButtonMe();
		//this.jButtonAnterioresProveedorProducto.setText("<<");
        this.jButtonAnterioresProveedorProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProveedorProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProveedorProducto = new JButtonMe();
		//this.jButtonSiguientesProveedorProducto.setText(">>");
        this.jButtonSiguientesProveedorProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProveedorProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProveedorProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProveedorProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosProveedorProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProveedorProducto,"nuevoguardarcambios_button","Nue",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProveedorProducto";
		inputMap = this.jButtonNuevoGuardarCambiosProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProveedorProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProveedorProducto";
		inputMap = this.jButtonRecargarInformacionProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProveedorProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProveedorProducto";
		inputMap = this.jButtonSiguientesProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProveedorProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProveedorProducto";
		inputMap = this.jButtonAnterioresProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProveedorProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProveedorProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProveedorProducto.setMinimumSize(new Dimension(this.getWidth(),ProveedorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProveedorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProveedorProducto.setMaximumSize(new Dimension(this.getWidth(),ProveedorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProveedorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProveedorProducto.setPreferredSize(new Dimension(this.getWidth(),ProveedorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProveedorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProveedorProducto = new GridBagLayout();

			this.jPanelPaginacionProveedorProducto.setLayout(gridaBagLayoutPaginacionProveedorProducto);						
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 0;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProveedorProducto.add(this.jButtonAnterioresProveedorProducto, this.gridBagConstraintsProveedorProducto);
					
						
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProveedorProducto.gridy = 0;
			
			this.jPanelPaginacionProveedorProducto.add(this.jButtonNuevoGuardarCambiosProveedorProducto, this.gridBagConstraintsProveedorProducto);
						
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProveedorProducto.gridy = 0;
			this.jPanelPaginacionProveedorProducto.add(this.jButtonSiguientesProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 1;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProveedorProducto.add(this.jButtonNuevoProveedorProducto, this.gridBagConstraintsProveedorProducto);
						
			
			
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
				this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProveedorProducto.gridy = 1;
				this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProveedorProducto.add(this.jButtonGuardarCambiosTablaProveedorProducto, this.gridBagConstraintsProveedorProducto);
			}
			
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 1;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProveedorProducto.add(this.jButtonDuplicarProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 1;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProveedorProducto.add(this.jButtonCopiarProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 1;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProveedorProducto.add(this.jButtonVerFormProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 1;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProveedorProducto.add(this.jButtonCerrarProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		
		this.jButtonRecargarInformacionProveedorProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProveedorProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProveedorProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProveedorProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProveedorProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProveedorProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProveedorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProveedorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProveedorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProveedorProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProveedorProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProveedorProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProveedorProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProveedorProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProveedorProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProveedorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProveedorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProveedorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProveedorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProveedorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProveedorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProveedorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProveedorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProveedorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProveedorProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProveedorProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProveedorProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProveedorProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProveedorProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProveedorProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProveedorProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProveedorProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProveedorProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProveedorProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProveedorProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProveedorProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProveedorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProveedorProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProveedorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProveedorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProveedorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProveedorProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProveedorProducto.setLayout(gridaBagParametrosReportesProveedorProducto);
			this.jPanelParametrosReportesAccionesProveedorProducto.setLayout(gridaBagParametrosReportesAccionesProveedorProducto);
			
			
			this.jPanelParametrosAuxiliar1ProveedorProducto.setLayout(gridaBagParametrosAuxiliar1ProveedorProducto);
			this.jPanelParametrosAuxiliar2ProveedorProducto.setLayout(gridaBagParametrosAuxiliar2ProveedorProducto);
			this.jPanelParametrosAuxiliar3ProveedorProducto.setLayout(gridaBagParametrosAuxiliar3ProveedorProducto);
			this.jPanelParametrosAuxiliar4ProveedorProducto.setLayout(gridaBagParametrosAuxiliar4ProveedorProducto);
			//this.jPanelParametrosAuxiliar5ProveedorProducto.setLayout(gridaBagParametrosAuxiliar2ProveedorProducto);			
			
			
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProveedorProducto.add(this.jButtonRecargarInformacionProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProveedorProducto.add(this.jComboBoxTiposPaginacionProveedorProducto, this.gridBagConstraintsProveedorProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProveedorProducto.add(this.jCheckBoxConAltoMaximoTablaProveedorProducto, this.gridBagConstraintsProveedorProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProveedorProducto.add(this.jComboBoxTiposArchivosReportesProveedorProducto, this.gridBagConstraintsProveedorProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProveedorProducto.add(this.jPanelParametrosAuxiliar1ProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProveedorProducto.add(this.jComboBoxTiposReportesProveedorProducto, this.gridBagConstraintsProveedorProducto);																		
			
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProveedorProducto.add(this.jComboBoxTiposGraficosReportesProveedorProducto, this.gridBagConstraintsProveedorProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProveedorProducto.add(this.jPanelParametrosAuxiliar4ProveedorProducto, this.gridBagConstraintsProveedorProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProveedorProducto.add(this.jComboBoxTiposReportesProveedorProducto, this.gridBagConstraintsProveedorProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProveedorProducto.add(this.jCheckBoxGenerarReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProveedorProducto.add(this.jPanelParametrosAuxiliar2ProveedorProducto, this.gridBagConstraintsProveedorProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProveedorProducto.add(this.jLabelAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
				this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProveedorProducto.add(this.jButtonAbrirOrderByProveedorProducto, this.gridBagConstraintsProveedorProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProveedorProducto.add(this.jComboBoxTiposSeleccionarProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			
			
			/*
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProveedorProducto.add(this.jCheckBoxSeleccionarTodosProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProveedorProducto.add(this.jCheckBoxConGraficoReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProveedorProducto.add(this.jCheckBoxSeleccionarTodosProveedorProducto, this.gridBagConstraintsProveedorProducto);															
				
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProveedorProducto.add(this.jCheckBoxSeleccionadosProveedorProducto, this.gridBagConstraintsProveedorProducto);															
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProveedorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProveedorProducto.add(this.jCheckBoxConGraficoReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProveedorProducto.add(this.jPanelParametrosAuxiliar3ProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProveedorProducto.add(this.jComboBoxTiposAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
	
				
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProveedorProducto.add(this.jTextFieldValorCampoGeneralProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProveedorProducto = new GridBagLayout();

			this.jScrollPanelDatosProveedorProducto.setLayout(gridaBagLayoutDatosProveedorProducto);
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = 0;
			this.gridBagConstraintsProveedorProducto.gridx = 0;
			
			this.jScrollPanelDatosProveedorProducto.add(this.jTableDatosProveedorProducto, this.gridBagConstraintsProveedorProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProveedorProducto.setViewportView(this.jTableDatosProveedorProducto);
		this.jTableDatosProveedorProducto.setFillsViewportHeight(true);
		this.jTableDatosProveedorProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProveedorProducto= new GridBagLayout();
		this.jPanelAccionesProveedorProducto.setLayout(gridaBagLayoutAccionesProveedorProducto);
		
		
		/*	
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 0;
			
		this.jPanelAccionesProveedorProducto.add(this.jButtonNuevoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProveedorProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProveedorProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProveedorProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProveedorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProveedorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProveedorProducto.setLayout(gridaBagLayoutFK_IdBodegaProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 0;
		jPanelFK_IdBodegaProveedorProducto.add(jLabelid_bodegaFK_IdBodegaProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 1;
		jPanelFK_IdBodegaProveedorProducto.add(jComboBoxid_bodegaFK_IdBodegaProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 1;
		gridBagConstraintsProveedorProducto.gridx =1;
		jPanelFK_IdBodegaProveedorProducto.add(jButtonFK_IdBodegaProveedorProducto, gridBagConstraintsProveedorProducto);

		jTabbedPaneBusquedasProveedorProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProveedorProducto);
		jTabbedPaneBusquedasProveedorProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteProveedorProducto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorProducto.setLayout(gridaBagLayoutFK_IdClienteProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 0;
		jPanelFK_IdClienteProveedorProducto.add(jLabelid_clienteFK_IdClienteProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 1;
		jPanelFK_IdClienteProveedorProducto.add(jComboBoxid_clienteFK_IdClienteProveedorProducto, gridBagConstraintsProveedorProducto);


		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 0;
		jPanelFK_IdClienteProveedorProducto.add(this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 1;
		gridBagConstraintsProveedorProducto.gridx =1;
		jPanelFK_IdClienteProveedorProducto.add(jButtonFK_IdClienteProveedorProducto, gridBagConstraintsProveedorProducto);

		jTabbedPaneBusquedasProveedorProducto.addTab("2.-Por Cliente ", jPanelFK_IdClienteProveedorProducto);
		jTabbedPaneBusquedasProveedorProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoProveedorProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProveedorProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProveedorProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProveedorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProveedorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProveedorProducto.setLayout(gridaBagLayoutFK_IdProductoProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 0;
		jPanelFK_IdProductoProveedorProducto.add(jLabelid_productoFK_IdProductoProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 1;
		jPanelFK_IdProductoProveedorProducto.add(jComboBoxid_productoFK_IdProductoProveedorProducto, gridBagConstraintsProveedorProducto);


		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProveedorProducto.gridy = 0;
		gridBagConstraintsProveedorProducto.gridx = 0;
		jPanelFK_IdProductoProveedorProducto.add(this.jButtonBuscarFK_IdProductoid_productoProveedorProducto, gridBagConstraintsProveedorProducto);

		gridBagConstraintsProveedorProducto = new GridBagConstraints();
		gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProveedorProducto.gridy = 1;
		gridBagConstraintsProveedorProducto.gridx =1;
		jPanelFK_IdProductoProveedorProducto.add(jButtonFK_IdProductoProveedorProducto, gridBagConstraintsProveedorProducto);

		jTabbedPaneBusquedasProveedorProducto.addTab("3.-Por Producto ", jPanelFK_IdProductoProveedorProducto);
		jTabbedPaneBusquedasProveedorProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProveedorProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProveedorProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();						
			this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProveedorProducto.gridx = 0;		
			//this.gridBagConstraintsProveedorProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProveedorProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProveedorProducto, this.gridBagConstraintsProveedorProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProveedorProducto.gridx = 0;		
		//this.gridBagConstraintsProveedorProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProveedorProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProveedorProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProveedorProducto.gridx = 0;		
			this.gridBagConstraintsProveedorProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProveedorProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProveedorProducto, this.gridBagConstraintsProveedorProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProveedorProducto, this.gridBagConstraintsProveedorProducto);								
		
		
		/*
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
		*/		
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProveedorProducto.gridx =0;
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProveedorProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProveedorProducto, this.gridBagConstraintsProveedorProducto);
				
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProveedorProducto, this.gridBagConstraintsProveedorProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProveedorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProveedorProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosProveedorProducto.setLayout(gridaBagLayoutBusquedasParametrosProveedorProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProveedorProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProveedorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProveedorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProveedorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProveedorProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProveedorProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProveedorProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProveedorProducto.setName("jPanelReporteDinamicoProveedorProducto"); 
		
		this.jPanelReporteDinamicoProveedorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProveedorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProveedorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProveedorProducto.setLayout(gridaBagLayoutReporteDinamicoProveedorProducto);
		
		
		this.jInternalFrameReporteDinamicoProveedorProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProveedorProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProveedorProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProveedorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProveedorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProveedorProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProveedorProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProveedorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProveedorProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoProveedorProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoProveedorProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProveedorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProveedorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProveedorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProveedorProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteProveedorProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelColumnasSelectReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProveedorProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteProveedorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProveedorProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProveedorProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProveedorProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProveedorProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProveedorProducto=new JScrollPane(this.jListColumnasSelectReporteProveedorProducto);
			
			this.jScrollColumnasSelectReporteProveedorProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProveedorProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProveedorProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProveedorProducto.add(this.jListColumnasSelectReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
		this.jPanelReporteDinamicoProveedorProducto.add(this.jScrollColumnasSelectReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProveedorProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteProveedorProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProveedorProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteProveedorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProveedorProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProveedorProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProveedorProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProveedorProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProveedorProducto=new JScrollPane(this.jListRelacionesSelectReporteProveedorProducto);
			
			this.jScrollRelacionesSelectReporteProveedorProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProveedorProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProveedorProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProveedorProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProveedorProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoProveedorProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProveedorProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProveedorProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProveedorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProveedorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProveedorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProveedorProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoProveedorProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelConGraficoDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProveedorProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProveedorProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProveedorProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProveedorProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProveedorProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jCheckBoxConGraficoDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProveedorProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProveedorProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelColumnaCategoriaGraficoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProveedorProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProveedorProducto.add(this.jComboBoxColumnaCategoriaGraficoProveedorProducto, this.gridBagConstraintsProveedorProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProveedorProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorProveedorProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelColumnaCategoriaValorProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProveedorProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProveedorProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProveedorProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProveedorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProveedorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProveedorProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProveedorProducto.add(this.jComboBoxColumnaCategoriaValorProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProveedorProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoProveedorProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelColumnasValoresGraficoProveedorProducto, this.gridBagConstraintsProveedorProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProveedorProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoProveedorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProveedorProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProveedorProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProveedorProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProveedorProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProveedorProducto=new JScrollPane(this.jListColumnasValoresGraficoProveedorProducto);
			
			this.jScrollColumnasValoresGraficoProveedorProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProveedorProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProveedorProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProveedorProducto.add(this.jListColumnasSelectReporteProveedorProducto, this.gridBagConstraintsProveedorProducto);
		this.jPanelReporteDinamicoProveedorProducto.add(this.jScrollColumnasValoresGraficoProveedorProducto, this.gridBagConstraintsProveedorProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProveedorProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProveedorProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelTiposGraficosReportesDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProveedorProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jComboBoxTiposGraficosReportesDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProveedorProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProveedorProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelGenerarExcelReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProveedorProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProveedorProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProveedorProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProveedorProducto.setToolTipText("Generar EXCEL"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProveedorProducto.add(this.jButtonGenerarExcelReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProveedorProducto.add(this.jComboBoxTiposReportesDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProveedorProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProveedorProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProveedorProducto.add(this.jLabelTiposArchivoReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProveedorProducto.add(this.jComboBoxTiposArchivosReportesDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProveedorProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProveedorProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProveedorProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProveedorProducto.setToolTipText("Generar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProveedorProducto.add(this.jButtonGenerarReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProveedorProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProveedorProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProveedorProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProveedorProducto.setToolTipText("Cancelar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProveedorProducto.add(this.jButtonCerrarReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProveedorProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProveedorProducto= new JScrollPane(jPanelReporteDinamicoProveedorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProveedorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProveedorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProveedorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProveedorProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProveedorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProveedorProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProveedorProducto);
		this.jInternalFrameReporteDinamicoProveedorProducto.getContentPane().add(this.jScrollPanelReporteDinamicoProveedorProducto, this.gridBagConstraintsProveedorProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProveedorProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProveedorProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProveedorProducto.setName("jPanelImportacionProveedorProducto"); 
		
		this.jPanelImportacionProveedorProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProveedorProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProveedorProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProveedorProducto.setLayout(gridaBagLayoutImportacionProveedorProducto);
		
		
		this.jInternalFrameImportacionProveedorProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProveedorProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProveedorProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProveedorProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProveedorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProveedorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProveedorProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProveedorProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProveedorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProveedorProducto.setResizable(true);
	    this.jInternalFrameImportacionProveedorProducto.setClosable(true);
	    this.jInternalFrameImportacionProveedorProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProveedorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProveedorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProveedorProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProveedorProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProveedorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProveedorProducto.setResizable(true);
	    this.jInternalFrameImportacionProveedorProducto.setClosable(true);
	    this.jInternalFrameImportacionProveedorProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProveedorProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProveedorProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProveedorProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProveedorProducto = new JLabelMe();

		this.jLabelArchivoImportacionProveedorProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProveedorProducto.add(this.jLabelArchivoImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProveedorProducto = new JFileChooser();		
		this.jFileChooserImportacionProveedorProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProveedorProducto = new JButtonMe();
		this.jButtonAbrirImportacionProveedorProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProveedorProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProveedorProducto.setToolTipText("Generar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProveedorProducto.add(this.jButtonAbrirImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProveedorProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionProveedorProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProveedorProducto.add(this.jLabelPathArchivoImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProveedorProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProveedorProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProveedorProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProveedorProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProveedorProducto.add(this.jTextFieldPathArchivoImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProveedorProducto = new JButtonMe();
		this.jButtonGenerarImportacionProveedorProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProveedorProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProveedorProducto.setToolTipText("Generar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProveedorProducto.add(this.jButtonGenerarImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProveedorProducto = new JButtonMe();
		this.jButtonCerrarImportacionProveedorProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProveedorProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProveedorProducto.setToolTipText("Cancelar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProveedorProducto.add(this.jButtonCerrarImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProveedorProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionProveedorProducto= new JScrollPane(jPanelImportacionProveedorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsProveedorProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProveedorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProveedorProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProveedorProducto);
		this.jInternalFrameImportacionProveedorProducto.getContentPane().add(this.jScrollPanelImportacionProveedorProducto, this.gridBagConstraintsProveedorProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProveedorProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProveedorProducto = new JButtonMe();
			this.jButtonAbrirOrderByProveedorProducto.setText("Orden");
			this.jButtonAbrirOrderByProveedorProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProveedorProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProveedorProducto";
			inputMap = this.jButtonAbrirOrderByProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProveedorProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByProveedorProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProveedorProducto.setName("jPanelOrderByProveedorProducto"); 
			
			this.jPanelOrderByProveedorProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProveedorProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProveedorProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProveedorProducto.setLayout(gridaBagLayoutOrderByProveedorProducto);
			
			
			this.jTableDatosProveedorProductoOrderBy = new JTableMe();        
			this.jTableDatosProveedorProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProveedorProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProveedorProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProveedorProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProveedorProductoOrderBy.setViewportView(this.jTableDatosProveedorProductoOrderBy);
			this.jTableDatosProveedorProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProveedorProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProveedorProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProveedorProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProveedorProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProveedorProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProveedorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProveedorProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProveedorProducto.setTitle("Orden");
			this.jInternalFrameOrderByProveedorProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProveedorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProveedorProducto.setResizable(true);
			this.jInternalFrameOrderByProveedorProducto.setClosable(true);
			this.jInternalFrameOrderByProveedorProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProveedorProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProveedorProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProveedorProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProveedorProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProveedorProducto.ipady =150;
				
			this.jPanelOrderByProveedorProducto.add(jScrollPanelDatosProveedorProductoOrderBy, this.gridBagConstraintsProveedorProducto);//this.jTableDatosProveedorProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProveedorProducto = new JButtonMe();
			this.jButtonCerrarOrderByProveedorProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProveedorProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProveedorProducto.setToolTipText("Cancelar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProveedorProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProveedorProducto.add(this.jButtonCerrarOrderByProveedorProducto, this.gridBagConstraintsProveedorProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProveedorProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByProveedorProducto= new JScrollPane(jPanelOrderByProveedorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsProveedorProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProveedorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProveedorProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProveedorProducto);
			
			this.jInternalFrameOrderByProveedorProducto.getContentPane().add(this.jScrollPanelOrderByProveedorProducto, this.gridBagConstraintsProveedorProducto);			
		
		} else {
			this.jButtonAbrirOrderByProveedorProducto = new JButtonMe();
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
			&& this.proveedorproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProveedorProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProveedorProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProveedorProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProveedorProducto.getRowHeight();//ProveedorProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProveedorProducto.isSelected()) {
					iHeightTable=ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProveedorProducto.isSelected()) {
					iHeightTable=ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProveedorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProveedorProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProveedorProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProveedorProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProveedorProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProveedorProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProveedorProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProveedorProducto!=null && this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProveedorProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProveedorProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProveedorProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProveedorProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProveedorProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProveedorProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=proveedorproductoLogic.getProveedorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=proveedorproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProveedorProducto> TraerProveedorProductoBeans(List<ProveedorProducto> proveedorproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProveedorProducto proveedorproducto:proveedorproductos) {
					
				if(!(ProveedorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProveedorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					proveedorproducto.setsDetalleGeneralEntityReporte(ProveedorProductoConstantesFunciones.getProveedorProductoDescripcion(proveedorproducto));
										
						
					
						
					
				} else  {
							
					//proveedorproducto.setsDetalleGeneralEntityReporte(proveedorproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//proveedorproductobeans.add(proveedorproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return proveedorproductos;
    }
	//PARA REPORTES FIN
}
