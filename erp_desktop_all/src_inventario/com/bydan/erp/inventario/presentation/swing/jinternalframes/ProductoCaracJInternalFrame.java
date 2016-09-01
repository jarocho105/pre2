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
import com.bydan.erp.inventario.util.ProductoCaracConstantesFunciones;

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
public class ProductoCaracJInternalFrame extends ProductoCaracBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoCarac;
	
	protected JMenuBar jmenuBarProductoCarac;
	
	protected JMenu jmenuProductoCarac;
	protected JMenu jmenuDatosProductoCarac;
	protected JMenu jmenuArchivoProductoCarac;
	protected JMenu jmenuAccionesProductoCarac;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoCarac;	
	protected GridBagConstraints gridBagConstraintsProductoCarac;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoCaracDetalleFormJInternalFrame jInternalFrameDetalleFormProductoCarac;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoCarac;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoCarac;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoCaracSessionBean productocaracSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoCarac> productocaracs;		
	public List<ProductoCarac> productocaracsEliminados;	
	public List<ProductoCarac> productocaracsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoCarac;		
	protected JButton jButtonAbrirOrderByProductoCarac;
	
	
	//protected JPanel jPanelOrderByProductoCarac;
	//public JScrollPane jScrollPanelOrderByProductoCarac;	
	//protected JButton jButtonCerrarOrderByProductoCarac;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoCaracLogic productocaracLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoCarac;
	public JScrollPane jScrollPanelDatosEdicionProductoCarac;
	public JScrollPane jScrollPanelDatosGeneralProductoCarac;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoCaracOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoCarac;
	//public JScrollPane jScrollPanelImportacionProductoCarac;
	
	
	
	protected JPanel jPanelAccionesProductoCarac;
	
    protected JPanel jPanelPaginacionProductoCarac;
    protected JPanel jPanelParametrosReportesProductoCarac;
	protected JPanel jPanelParametrosReportesAccionesProductoCarac;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoCarac;
	protected JPanel jPanelParametrosAuxiliar2ProductoCarac;
	protected JPanel jPanelParametrosAuxiliar3ProductoCarac;
	protected JPanel jPanelParametrosAuxiliar4ProductoCarac;
	//protected JPanel jPanelParametrosAuxiliar5ProductoCarac;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoCarac;
	//protected JPanel jPanelImportacionProductoCarac;
	
	
	public JTable jTableDatosProductoCarac;
	
	
	
	//public JTable jTableDatosProductoCaracOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoCarac;
	protected JButton jButtonDuplicarProductoCarac;
	protected JButton jButtonCopiarProductoCarac;
	protected JButton jButtonVerFormProductoCarac;
	protected JButton jButtonNuevoRelacionesProductoCarac;
	protected JButton jButtonModificarProductoCarac;
	
    protected JButton jButtonGuardarCambiosTablaProductoCarac;
	protected JButton jButtonCerrarProductoCarac;
	
	
	protected JButton jButtonRecargarInformacionProductoCarac;
	protected JButton jButtonProcesarInformacionProductoCarac;
	
	
	protected JButton jButtonAnterioresProductoCarac;
	protected JButton jButtonSiguientesProductoCarac;
	protected JButton jButtonNuevoGuardarCambiosProductoCarac;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoCarac;
	//protected JButton jButtonCerrarReporteDinamicoProductoCarac;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoCarac;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoCarac;
	//protected JButton jButtonGenerarImportacionProductoCarac;
	//protected JButton jButtonCerrarImportacionProductoCarac;
	//protected JFileChooser jFileChooserImportacionProductoCarac;
	//protected File fileImportacionProductoCarac;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoCarac;
	protected JButton jButtonDuplicarToolBarProductoCarac;
	protected JButton jButtonNuevoRelacionesToolBarProductoCarac;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoCarac;
	protected JButton jButtonCopiarToolBarProductoCarac;
	protected JButton jButtonVerFormToolBarProductoCarac;
	public JButton jButtonGuardarCambiosTablaToolBarProductoCarac;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoCarac;
	protected JButton jButtonCerrarToolBarProductoCarac;
	
	protected JButton jButtonRecargarInformacionToolBarProductoCarac;
	protected JButton jButtonProcesarInformacionToolBarProductoCarac;
	protected JButton jButtonAnterioresToolBarProductoCarac;
	protected JButton jButtonSiguientesToolBarProductoCarac;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoCarac;
	protected JButton jButtonAbrirOrderByToolBarProductoCarac;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoCarac;
	protected JMenuItem jMenuItemDuplicarProductoCarac;
	protected JMenuItem jMenuItemNuevoRelacionesProductoCarac;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoCarac;
	protected JMenuItem jMenuItemCopiarProductoCarac;
	protected JMenuItem jMenuItemVerFormProductoCarac;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoCarac;
	protected JMenuItem jMenuItemCerrarProductoCarac;
	protected JMenuItem jMenuItemDetalleCerrarProductoCarac;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoCarac;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoCarac;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoCarac;
	protected JMenuItem jMenuItemProcesarInformacionProductoCarac;
	protected JMenuItem jMenuItemAnterioresProductoCarac;
	protected JMenuItem jMenuItemSiguientesProductoCarac;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoCarac;
	protected JMenuItem jMenuItemAbrirOrderByProductoCarac;
	protected JMenuItem jMenuItemMostrarOcultarProductoCarac;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoCarac;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoCarac;
	protected JCheckBox jCheckBoxSeleccionadosProductoCarac;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoCarac;
	protected JCheckBox jCheckBoxConGraficoReporteProductoCarac;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoCarac;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoCarac;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoCarac;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoCarac;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoCarac;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoCarac;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoCarac;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoCarac;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoCarac;
	protected JTextField jTextFieldValorCampoGeneralProductoCarac;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoCarac;
	//public JList<Reporte> jListColumnasSelectReporteProductoCarac;
	//public JScrollPane jScrollColumnasSelectReporteProductoCarac;
	
	//public JLabel jLabelRelacionesSelectReporteProductoCarac;
	//public JList<Reporte> jListRelacionesSelectReporteProductoCarac;
	//public JScrollPane jScrollRelacionesSelectReporteProductoCarac;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoCarac;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoCarac;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoCarac;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoCarac;
	
		
	//public JLabel jLabelArchivoImportacionProductoCarac;	
	//public JLabel jLabelPathArchivoImportacionProductoCarac;
	//protected JTextField jTextFieldPathArchivoImportacionProductoCarac;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoCarac;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoCarac;
	
	//public JLabel jLabelColumnaCategoriaValorProductoCarac;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoCarac;
	
	//public JLabel jLabelColumnasValoresGraficoProductoCarac;
	//public JList<Reporte> jListColumnasValoresGraficoProductoCarac;
	//public JScrollPane jScrollColumnasValoresGraficoProductoCarac;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoCarac;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoCarac;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoCarac;
	public JPanel jPanelFK_IdProductoProductoCarac;
	public JButton jButtonFK_IdProductoProductoCarac;
	
	public JPanel jPanelid_productoFK_IdProductoProductoCarac;
	public JLabel jLabelid_productoFK_IdProductoProductoCarac;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoCarac;
	public JButton jButtonid_productoFK_IdProductoProductoCarac= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoCaracUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoCaracBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoCarac;
	
	
	
	
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
	public ProductoCaracJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoCarac)	{
		this.jButtonRecargarInformacionProductoCarac = jButtonRecargarInformacionProductoCarac;
	}
	
	public JButton getjButtonProcesarInformacionProductoCarac() {
		return this.jButtonProcesarInformacionProductoCarac;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoCarac)	{
		this.jButtonProcesarInformacionProductoCarac = jButtonProcesarInformacionProductoCarac;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoCarac() {
		return this.jButtonRecargarInformacionProductoCarac;
	}
	
	
	public List<ProductoCarac> getproductocaracs() {
		return this.productocaracs;
	}

	public void setproductocaracs(List<ProductoCarac> productocaracs) {
		this.productocaracs = productocaracs;
	}
	
	public List<ProductoCarac> getproductocaracsAux() {
		return this.productocaracsAux;
	}

	public void setproductocaracsAux(List<ProductoCarac> productocaracsAux) {
		this.productocaracsAux = productocaracsAux;
	}
	
	public List<ProductoCarac> getproductocaracsEliminados() {
		return this.productocaracsEliminados;
	}

	public void setProductoCaracsEliminados(List<ProductoCarac> productocaracsEliminados) {
		this.productocaracsEliminados = productocaracsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoCarac() {
		return jComboBoxTiposSeleccionarProductoCarac;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoCarac(
			JComboBox jComboBoxTiposSeleccionarProductoCarac) {
		this.jComboBoxTiposSeleccionarProductoCarac = jComboBoxTiposSeleccionarProductoCarac;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoCarac .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoCarac() {
		return jTextFieldValorCampoGeneralProductoCarac;
	}

	public void setjTextFieldValorCampoGeneralProductoCarac(
			JTextField jTextFieldValorCampoGeneralProductoCarac) {
		this.jTextFieldValorCampoGeneralProductoCarac = jTextFieldValorCampoGeneralProductoCarac;
	}

	public void setBorderResaltarValorCampoGeneralProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoCarac .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoCarac() {
		return this.jCheckBoxSeleccionarTodosProductoCarac;
	}

	public void setjCheckBoxSeleccionarTodosProductoCarac(
			JCheckBox jCheckBoxSeleccionarTodosProductoCarac) {
		this.jCheckBoxSeleccionarTodosProductoCarac = jCheckBoxSeleccionarTodosProductoCarac;
	}

	public void setBorderResaltarSeleccionarTodosProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoCarac .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoCarac() {
		return this.jCheckBoxSeleccionadosProductoCarac;
	}

	public void setjCheckBoxSeleccionadosProductoCarac(
			JCheckBox jCheckBoxSeleccionadosProductoCarac) {
		this.jCheckBoxSeleccionadosProductoCarac = jCheckBoxSeleccionadosProductoCarac;
	}
	
	public void setBorderResaltarSeleccionadosProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoCarac .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoCarac() {
		return this.jComboBoxTiposArchivosReportesProductoCarac;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoCarac(
			JComboBox jComboBoxTiposArchivosReportesProductoCarac) {
		this.jComboBoxTiposArchivosReportesProductoCarac = jComboBoxTiposArchivosReportesProductoCarac;
	}

	public void setBorderResaltarTiposArchivosReportesProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoCarac .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoCarac() {
		return this.jComboBoxTiposReportesProductoCarac;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoCarac(
			JComboBox jComboBoxTiposReportesProductoCarac) {
		this.jComboBoxTiposReportesProductoCarac = jComboBoxTiposReportesProductoCarac;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoCarac() {
	//	return jComboBoxTiposReportesDinamicoProductoCarac;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoCarac(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoCarac) {
	//	this.jComboBoxTiposReportesDinamicoProductoCarac = jComboBoxTiposReportesDinamicoProductoCarac;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoCarac() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoCarac;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoCarac(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoCarac) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoCarac = jComboBoxTiposArchivosReportesDinamicoProductoCarac;
	//}
	
	public void setBorderResaltarTiposReportesProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoCarac .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoCarac() {
		return this.jComboBoxTiposGraficosReportesProductoCarac;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoCarac(
			JComboBox jComboBoxTiposGraficosReportesProductoCarac) {
		this.jComboBoxTiposGraficosReportesProductoCarac = jComboBoxTiposGraficosReportesProductoCarac;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoCarac .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoCarac() {
		return this.jComboBoxTiposPaginacionProductoCarac;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoCarac(
			JComboBox jComboBoxTiposPaginacionProductoCarac) {
		this.jComboBoxTiposPaginacionProductoCarac = jComboBoxTiposPaginacionProductoCarac;
	}
	
	public void setBorderResaltarTiposPaginacionProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoCarac .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoCarac() {
		return this.jComboBoxTiposRelacionesProductoCarac;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoCarac() {
		return this.jComboBoxTiposAccionesProductoCarac;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoCarac(
			JComboBox jComboBoxTiposRelacionesProductoCarac) {
		this.jComboBoxTiposRelacionesProductoCarac = jComboBoxTiposRelacionesProductoCarac;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoCarac(
			JComboBox jComboBoxTiposAccionesProductoCarac) {
		this.jComboBoxTiposAccionesProductoCarac = jComboBoxTiposAccionesProductoCarac;
	}
	
	public void setBorderResaltarTiposRelacionesProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoCarac .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoCarac() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCarac.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoCarac .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoCarac() {
	//	return jCheckBoxConGraficoDinamicoProductoCarac;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoCarac(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoCarac) {
	//	this.jCheckBoxConGraficoDinamicoProductoCarac = jCheckBoxConGraficoDinamicoProductoCarac;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoCarac() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoCarac.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoCarac .setBorder(borderResaltar);		
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
		this.productocaracSessionBean=new ProductoCaracSessionBean();
		
		this.productocaracSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productocaracSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productocaracSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoCaracJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caracteristica MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoCaracJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoCarac= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"nuevo","nuevo","Nuevo"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"duplicar","duplicar","Duplicar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"copiar","copiar","Copiar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"ver_form","ver_form","Ver"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"recargar","recargar","Recargar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoCarac,this.jTtoolBarProductoCarac,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoCarac,this.jTtoolBarProductoCarac,
							"cerrar","cerrar","Salir"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoCarac=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoCarac;
			
				this.jButtonProcesarInformacionToolBarProductoCarac=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoCarac;
				
		//protected JButton jButtonModificarToolBarProductoCarac;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoCarac=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoCarac=new JMenuMe("General");
		this.jmenuArchivoProductoCarac=new JMenuMe("Archivo");
		this.jmenuAccionesProductoCarac=new JMenuMe("Acciones");
		this.jmenuDatosProductoCarac=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoCarac= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoCarac.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoCarac,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoCarac= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoCarac.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoCarac,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoCarac= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoCarac.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoCarac,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoCarac= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoCarac.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoCarac,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoCarac= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoCarac.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoCarac,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoCarac= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoCarac.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoCarac,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoCarac= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoCarac.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoCarac,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoCarac= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoCarac.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoCarac,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoCarac= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoCarac.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoCarac,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoCarac= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoCarac.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoCarac,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoCarac= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoCarac.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoCarac,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoCarac= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoCarac.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoCarac,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoCarac= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoCarac.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoCarac,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoCarac= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoCarac.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoCarac,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoCarac= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoCarac.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoCarac,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoCarac= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoCarac.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoCarac,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoCarac= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoCarac.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoCarac,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoCarac.add(this.jMenuItemCerrarProductoCarac);
			
			this.jmenuAccionesProductoCarac.add(this.jMenuItemNuevoProductoCarac);
			this.jmenuAccionesProductoCarac.add(this.jMenuItemNuevoGuardarCambiosProductoCarac);
			this.jmenuAccionesProductoCarac.add(this.jMenuItemNuevoRelacionesProductoCarac);
			this.jmenuAccionesProductoCarac.add(this.jMenuItemGuardarCambiosTablaProductoCarac);		
			this.jmenuAccionesProductoCarac.add(this.jMenuItemDuplicarProductoCarac);		
			this.jmenuAccionesProductoCarac.add(this.jMenuItemCopiarProductoCarac);		
			this.jmenuAccionesProductoCarac.add(this.jMenuItemVerFormProductoCarac);		
			
			this.jmenuDatosProductoCarac.add(this.jMenuItemRecargarInformacionProductoCarac);				
			this.jmenuDatosProductoCarac.add(this.jMenuItemAnterioresProductoCarac);				
			this.jmenuDatosProductoCarac.add(this.jMenuItemSiguientesProductoCarac);				
			this.jmenuDatosProductoCarac.add(this.jMenuItemAbrirOrderByProductoCarac);				
			this.jmenuDatosProductoCarac.add(this.jMenuItemMostrarOcultarProductoCarac);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoCarac.add(this.jMenuItemGuardarCambiosProductoCarac);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoCarac.add(this.jmenuArchivoProductoCarac);		
			this.jmenuBarProductoCarac.add(this.jmenuAccionesProductoCarac);		
			this.jmenuBarProductoCarac.add(this.jmenuDatosProductoCarac);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoCarac);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoCarac() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProductoProductoCarac=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoCarac.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoCarac= new JButtonMe();
		this.jButtonFK_IdProductoProductoCarac.setText("Buscar");
		this.jButtonFK_IdProductoProductoCarac.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoCarac,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoCarac = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoCarac.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoCarac.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoCarac,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoCarac= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoCarac,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoCarac= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.setFocusable(false);


		this.jTabbedPaneBusquedasProductoCarac=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoCarac.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoCarac.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoCarac.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoCarac.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoCarac,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoCarac = new ProductoCaracDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caracteristica DATOS");
			this.jInternalFrameDetalleFormProductoCarac = new ProductoCaracDetalleFormJInternalFrame(jDesktopPane,this.productocaracSessionBean.getConGuardarRelaciones(),this.productocaracSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoCarac = null;//new ProductoCaracDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoCarac= new GridBagLayout();
		
		
		this.jTableDatosProductoCarac = new JTableMe();      
		
		String sToolTipProductoCarac="";
		sToolTipProductoCarac=ProductoCaracConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoCarac+="(Inventario.ProductoCarac)";
		}
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoCarac+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoCarac.setToolTipText(sToolTipProductoCarac);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoCarac);
		this.jTableDatosProductoCarac.setAutoCreateRowSorter(true);
		this.jTableDatosProductoCarac.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoCarac.setRowSelectionAllowed(true);
		this.jTableDatosProductoCarac.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoCarac,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoCarac = new JButtonMe();
		this.jButtonDuplicarProductoCarac = new JButtonMe();
		this.jButtonCopiarProductoCarac = new JButtonMe();
		this.jButtonVerFormProductoCarac = new JButtonMe();
		this.jButtonNuevoRelacionesProductoCarac = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoCarac = new JButtonMe();
		this.jButtonCerrarProductoCarac = new JButtonMe();
		
		this.jScrollPanelDatosProductoCarac = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoCarac = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caracteristica";
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoCarac.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoCarac.setToolTipText("Acciones");
        this.jPanelAccionesProductoCarac.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoCarac=new ReporteDinamicoJInternalFrame(ProductoCaracConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoCarac();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoCarac=new ImportacionJInternalFrame(ProductoCaracConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoCarac();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoCarac = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoCarac.setText("Orden");
		this.jButtonAbrirOrderByProductoCarac.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoCarac,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoCarac=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCarac,false,this);
			
			//this.cargarOrderByProductoCarac(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoCarac=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCarac,true,this);
			
			//this.cargarOrderByProductoCarac(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoCarac.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProductoCarac.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProductoCarac.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProductoCarac.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoCarac.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoCarac.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoCarac.setText("Nuevo");
		this.jButtonDuplicarProductoCarac.setText("Duplicar");
		this.jButtonCopiarProductoCarac.setText("Copiar");
		this.jButtonVerFormProductoCarac.setText("Ver");
		this.jButtonNuevoRelacionesProductoCarac.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoCarac.setText("Guardar");
		this.jButtonCerrarProductoCarac.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoCarac,"nuevo_button","Nuevo",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoCarac,"duplicar_button","Duplicar",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoCarac,"copiar_button","Copiar",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoCarac,"ver_form","Ver",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoCarac,"nuevorelaciones_button","Nuevo Rel",this.productocaracSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoCarac,"guardarcambiostabla_button","Guardar",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoCarac,"cerrar_button","Salir",this.productocaracSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoCarac.setToolTipText("Nuevo"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoCarac.setToolTipText("Duplicar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoCarac.setToolTipText("Copiar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoCarac.setToolTipText("Ver"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoCarac.setToolTipText("Nuevo Rel"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoCarac.setToolTipText("Guardar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoCarac.setToolTipText("Salir"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoCarac";
		inputMap = this.jButtonNuevoProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoCarac.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoCarac"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoCarac";
		inputMap = this.jButtonDuplicarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoCarac.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoCarac"));
		
		//COPIAR
		sMapKey = "CopiarProductoCarac";
		inputMap = this.jButtonCopiarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoCarac.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoCarac"));
		
		//VEr FORM
		sMapKey = "VerFormProductoCarac";
		inputMap = this.jButtonVerFormProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoCarac.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoCarac"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoCarac";
		inputMap = this.jButtonNuevoRelacionesProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoCarac"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoCarac";
		inputMap = this.jButtonModificarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoCarac"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoCarac";
		inputMap = this.jButtonCerrarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoCarac"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoCarac";
		inputMap = this.jButtonGuardarCambiosTablaProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoCarac"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoCarac.setName("jPanelParametrosReportesProductoCarac"); 
		
		this.jPanelParametrosReportesAccionesProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoCarac.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoCarac.setName("jPanelParametrosReportesAccionesProductoCarac"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoCarac = new JButtonMe();
		this.jButtonRecargarInformacionProductoCarac.setText("Recargar");
		this.jButtonRecargarInformacionProductoCarac.setToolTipText("Recargar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoCarac,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoCarac = new JButtonMe();
		this.jButtonProcesarInformacionProductoCarac.setText("Procesar");
		this.jButtonProcesarInformacionProductoCarac.setToolTipText("Procesar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoCarac.setVisible(false);
			
		this.jButtonProcesarInformacionProductoCarac.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoCarac.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoCarac.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCarac.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoCarac.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCarac.setText("TIPO");       
		this.jComboBoxTiposReportesProductoCarac.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCarac.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoCarac.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoCarac.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoCarac.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoCarac.setText("Accion");
		this.jComboBoxTiposRelacionesProductoCarac.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoCarac.setText("Accion");
		this.jComboBoxTiposAccionesProductoCarac.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoCarac.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoCarac.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoCarac=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoCarac.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoCarac.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoCarac.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoCarac = new JLabelMe();
		
		this.jLabelAccionesProductoCarac.setText("Acciones");		
		this.jLabelAccionesProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoCarac = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoCarac.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoCarac.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoCarac = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoCarac.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoCarac.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoCarac = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoCarac.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoCarac.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoCarac = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoCarac.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoCarac.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoCarac = new JButtonMe();
		//this.jButtonAnterioresProductoCarac.setText("<<");
        this.jButtonAnterioresProductoCarac.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoCarac,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoCarac = new JButtonMe();
		//this.jButtonSiguientesProductoCarac.setText(">>");
        this.jButtonSiguientesProductoCarac.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoCarac,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoCarac = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoCarac.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoCarac.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoCarac,"nuevoguardarcambios_button","Nue",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoCarac";
		inputMap = this.jButtonNuevoGuardarCambiosProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoCarac"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoCarac";
		inputMap = this.jButtonRecargarInformacionProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoCarac"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoCarac";
		inputMap = this.jButtonSiguientesProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoCarac"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoCarac";
		inputMap = this.jButtonAnterioresProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoCarac"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoCarac();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoCarac.setMinimumSize(new Dimension(this.getWidth(),ProductoCaracBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCaracBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoCarac.setMaximumSize(new Dimension(this.getWidth(),ProductoCaracBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCaracBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoCarac.setPreferredSize(new Dimension(this.getWidth(),ProductoCaracBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCaracBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoCarac = new GridBagLayout();

			this.jPanelPaginacionProductoCarac.setLayout(gridaBagLayoutPaginacionProductoCarac);						
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 0;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoCarac.add(this.jButtonAnterioresProductoCarac, this.gridBagConstraintsProductoCarac);
					
						
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoCarac.gridy = 0;
			
			this.jPanelPaginacionProductoCarac.add(this.jButtonNuevoGuardarCambiosProductoCarac, this.gridBagConstraintsProductoCarac);
						
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoCarac.gridy = 0;
			this.jPanelPaginacionProductoCarac.add(this.jButtonSiguientesProductoCarac, this.gridBagConstraintsProductoCarac);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 1;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCarac.add(this.jButtonNuevoProductoCarac, this.gridBagConstraintsProductoCarac);
						
			
			
			if(!this.productocaracSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoCarac = new GridBagConstraints();
				this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoCarac.gridy = 1;
				this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoCarac.add(this.jButtonGuardarCambiosTablaProductoCarac, this.gridBagConstraintsProductoCarac);
			}
			
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 1;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCarac.add(this.jButtonDuplicarProductoCarac, this.gridBagConstraintsProductoCarac);
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 1;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCarac.add(this.jButtonCopiarProductoCarac, this.gridBagConstraintsProductoCarac);
		
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 1;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCarac.add(this.jButtonVerFormProductoCarac, this.gridBagConstraintsProductoCarac);
		
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 1;
			this.gridBagConstraintsProductoCarac.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoCarac.add(this.jButtonCerrarProductoCarac, this.gridBagConstraintsProductoCarac);
		
		
		
		this.jButtonRecargarInformacionProductoCarac.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoCarac.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoCarac.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoCarac.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoCarac.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoCarac.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoCarac.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoCarac.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoCarac.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoCarac.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoCarac.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoCarac.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoCarac.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoCarac.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoCarac.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoCarac.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoCarac.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoCarac.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoCarac.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCarac.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCarac.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoCarac.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoCarac.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoCarac.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoCarac.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoCarac.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoCarac.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoCarac.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoCarac.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoCarac.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoCarac.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoCarac.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoCarac.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoCarac.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoCarac.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoCarac.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoCarac = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoCarac = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoCarac = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoCarac = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoCarac = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoCarac = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoCarac.setLayout(gridaBagParametrosReportesProductoCarac);
			this.jPanelParametrosReportesAccionesProductoCarac.setLayout(gridaBagParametrosReportesAccionesProductoCarac);
			
			
			this.jPanelParametrosAuxiliar1ProductoCarac.setLayout(gridaBagParametrosAuxiliar1ProductoCarac);
			this.jPanelParametrosAuxiliar2ProductoCarac.setLayout(gridaBagParametrosAuxiliar2ProductoCarac);
			this.jPanelParametrosAuxiliar3ProductoCarac.setLayout(gridaBagParametrosAuxiliar3ProductoCarac);
			this.jPanelParametrosAuxiliar4ProductoCarac.setLayout(gridaBagParametrosAuxiliar4ProductoCarac);
			//this.jPanelParametrosAuxiliar5ProductoCarac.setLayout(gridaBagParametrosAuxiliar2ProductoCarac);			
			
			
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCarac.add(this.jButtonRecargarInformacionProductoCarac, this.gridBagConstraintsProductoCarac);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCarac.add(this.jComboBoxTiposPaginacionProductoCarac, this.gridBagConstraintsProductoCarac);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCarac.add(this.jCheckBoxConAltoMaximoTablaProductoCarac, this.gridBagConstraintsProductoCarac);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCarac.add(this.jComboBoxTiposArchivosReportesProductoCarac, this.gridBagConstraintsProductoCarac);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCarac.add(this.jPanelParametrosAuxiliar1ProductoCarac, this.gridBagConstraintsProductoCarac);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoCarac.add(this.jComboBoxTiposReportesProductoCarac, this.gridBagConstraintsProductoCarac);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCarac.add(this.jPanelParametrosAuxiliar4ProductoCarac, this.gridBagConstraintsProductoCarac);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCarac.add(this.jComboBoxTiposReportesProductoCarac, this.gridBagConstraintsProductoCarac);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCarac.add(this.jCheckBoxGenerarReporteProductoCarac, this.gridBagConstraintsProductoCarac);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCarac.add(this.jPanelParametrosAuxiliar2ProductoCarac, this.gridBagConstraintsProductoCarac);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCarac.add(this.jLabelAccionesProductoCarac, this.gridBagConstraintsProductoCarac);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoCarac = new GridBagConstraints();
				this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoCarac.add(this.jButtonAbrirOrderByProductoCarac, this.gridBagConstraintsProductoCarac);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCarac.add(this.jComboBoxTiposSeleccionarProductoCarac, this.gridBagConstraintsProductoCarac);			
			
			
			/*
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCarac.add(this.jCheckBoxSeleccionarTodosProductoCarac, this.gridBagConstraintsProductoCarac);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoCarac.add(this.jCheckBoxSeleccionarTodosProductoCarac, this.gridBagConstraintsProductoCarac);															
				
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCarac.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoCarac.add(this.jCheckBoxSeleccionadosProductoCarac, this.gridBagConstraintsProductoCarac);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCarac.add(this.jPanelParametrosAuxiliar3ProductoCarac, this.gridBagConstraintsProductoCarac);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCarac.add(this.jComboBoxTiposAccionesProductoCarac, this.gridBagConstraintsProductoCarac);
	
				
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCarac.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCarac.add(this.jTextFieldValorCampoGeneralProductoCarac, this.gridBagConstraintsProductoCarac);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoCarac = new GridBagLayout();

			this.jScrollPanelDatosProductoCarac.setLayout(gridaBagLayoutDatosProductoCarac);
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = 0;
			this.gridBagConstraintsProductoCarac.gridx = 0;
			
			this.jScrollPanelDatosProductoCarac.add(this.jTableDatosProductoCarac, this.gridBagConstraintsProductoCarac);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoCarac.setViewportView(this.jTableDatosProductoCarac);
		this.jTableDatosProductoCarac.setFillsViewportHeight(true);
		this.jTableDatosProductoCarac.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoCarac= new GridBagLayout();
		this.jPanelAccionesProductoCarac.setLayout(gridaBagLayoutAccionesProductoCarac);
		
		
		/*	
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 0;
			
		this.jPanelAccionesProductoCarac.add(this.jButtonNuevoProductoCarac, this.gridBagConstraintsProductoCarac);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProductoProductoCarac= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoCarac.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoCarac.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoCarac.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoCarac.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoCarac.setLayout(gridaBagLayoutFK_IdProductoProductoCarac);

		gridBagConstraintsProductoCarac = new GridBagConstraints();
		gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCarac.gridy = 0;
		gridBagConstraintsProductoCarac.gridx = 0;
		jPanelFK_IdProductoProductoCarac.add(jLabelid_productoFK_IdProductoProductoCarac, gridBagConstraintsProductoCarac);

		gridBagConstraintsProductoCarac = new GridBagConstraints();
		gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCarac.gridy = 0;
		gridBagConstraintsProductoCarac.gridx = 1;
		jPanelFK_IdProductoProductoCarac.add(jComboBoxid_productoFK_IdProductoProductoCarac, gridBagConstraintsProductoCarac);


		gridBagConstraintsProductoCarac = new GridBagConstraints();
		gridBagConstraintsProductoCarac.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoCarac.gridy = 0;
		gridBagConstraintsProductoCarac.gridx = 0;
		jPanelFK_IdProductoProductoCarac.add(this.jButtonBuscarFK_IdProductoid_productoProductoCarac, gridBagConstraintsProductoCarac);

		gridBagConstraintsProductoCarac = new GridBagConstraints();
		gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCarac.gridy = 1;
		gridBagConstraintsProductoCarac.gridx =1;
		jPanelFK_IdProductoProductoCarac.add(jButtonFK_IdProductoProductoCarac, gridBagConstraintsProductoCarac);

		jTabbedPaneBusquedasProductoCarac.addTab("1.-Por Producto ", jPanelFK_IdProductoProductoCarac);
		jTabbedPaneBusquedasProductoCarac.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoCarac = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoCarac);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();						
			this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCarac.gridx = 0;		
			//this.gridBagConstraintsProductoCarac.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoCarac.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoCarac, this.gridBagConstraintsProductoCarac);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoCarac.gridx = 0;		
		//this.gridBagConstraintsProductoCarac.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoCarac.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoCarac);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCarac.gridx = 0;		
			this.gridBagConstraintsProductoCarac.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoCarac.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoCarac, this.gridBagConstraintsProductoCarac);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoCarac, this.gridBagConstraintsProductoCarac);								
		
		
		/*
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoCarac, this.gridBagConstraintsProductoCarac);
		*/		
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoCarac.gridx =0;
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoCarac.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoCarac, this.gridBagConstraintsProductoCarac);
				
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoCarac, this.gridBagConstraintsProductoCarac);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoCarac= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoCarac = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoCarac.setLayout(gridaBagLayoutBusquedasParametrosProductoCarac);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoCarac=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoCarac.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCarac.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCarac.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoCarac, this.gridBagConstraintsProductoCarac);
			
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoCarac, this.gridBagConstraintsProductoCarac);
		
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoCarac, this.gridBagConstraintsProductoCarac);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoCarac;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoCarac() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoCarac = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoCarac.setName("jPanelReporteDinamicoProductoCarac"); 
		
		this.jPanelReporteDinamicoProductoCarac.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoCarac.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoCarac.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoCarac.setLayout(gridaBagLayoutReporteDinamicoProductoCarac);
		
		
		this.jInternalFrameReporteDinamicoProductoCarac= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoCarac = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoCarac= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoCarac.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoCarac.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoCarac.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoCarac.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoCarac.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoCarac.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoCarac.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoCarac.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoCarac.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoCarac.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoCarac.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoCarac = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoCarac.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoCarac.add(this.jLabelColumnasSelectReporteProductoCarac, this.gridBagConstraintsProductoCarac);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoCarac = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoCarac.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoCarac.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoCarac.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoCarac.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoCarac.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoCarac=new JScrollPane(this.jListColumnasSelectReporteProductoCarac);
			
			this.jScrollColumnasSelectReporteProductoCarac.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoCarac.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoCarac.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoCarac.add(this.jListColumnasSelectReporteProductoCarac, this.gridBagConstraintsProductoCarac);
		this.jPanelReporteDinamicoProductoCarac.add(this.jScrollColumnasSelectReporteProductoCarac, this.gridBagConstraintsProductoCarac);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoCarac = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoCarac.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoCarac = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoCarac.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoCarac.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoCarac.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoCarac.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoCarac.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoCarac=new JScrollPane(this.jListRelacionesSelectReporteProductoCarac);
			
			this.jScrollRelacionesSelectReporteProductoCarac.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoCarac.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoCarac.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoCarac = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoCarac = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoCarac = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoCarac = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoCarac.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoCarac.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoCarac.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoCarac.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoCarac = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoCarac.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoCarac.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoCarac.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoCarac.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoCarac = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoCarac.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoCarac.add(this.jLabelGenerarExcelReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoCarac = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoCarac.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoCarac,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoCarac.setToolTipText("Generar EXCEL"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoCarac.add(this.jButtonGenerarExcelReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCarac.add(this.jComboBoxTiposReportesDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoCarac = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoCarac.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoCarac.add(this.jLabelTiposArchivoReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCarac.add(this.jComboBoxTiposArchivosReportesDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoCarac = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoCarac.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoCarac,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoCarac.setToolTipText("Generar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCarac.add(this.jButtonGenerarReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoCarac = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoCarac.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoCarac,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoCarac.setToolTipText("Cancelar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCarac.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCarac.add(this.jButtonCerrarReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoCarac = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoCarac= new JScrollPane(jPanelReporteDinamicoProductoCarac,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoCarac.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoCarac.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoCarac.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoCarac.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoCarac.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoCarac.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoCarac);
		this.jInternalFrameReporteDinamicoProductoCarac.getContentPane().add(this.jScrollPanelReporteDinamicoProductoCarac, this.gridBagConstraintsProductoCarac);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoCarac() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoCarac = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoCarac.setName("jPanelImportacionProductoCarac"); 
		
		this.jPanelImportacionProductoCarac.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoCarac.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoCarac.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoCarac.setLayout(gridaBagLayoutImportacionProductoCarac);
		
		
		this.jInternalFrameImportacionProductoCarac= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoCarac= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoCarac = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoCarac= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoCarac.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoCarac.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoCarac.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoCarac.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoCarac.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoCarac.setResizable(true);
	    this.jInternalFrameImportacionProductoCarac.setClosable(true);
	    this.jInternalFrameImportacionProductoCarac.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoCarac.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoCarac.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoCarac.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoCarac.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoCarac.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoCarac.setResizable(true);
	    this.jInternalFrameImportacionProductoCarac.setClosable(true);
	    this.jInternalFrameImportacionProductoCarac.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoCarac.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoCarac.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoCarac.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoCarac = new JLabelMe();

		this.jLabelArchivoImportacionProductoCarac.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoCarac.add(this.jLabelArchivoImportacionProductoCarac, this.gridBagConstraintsProductoCarac);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoCarac = new JFileChooser();		
		this.jFileChooserImportacionProductoCarac.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoCarac = new JButtonMe();
		this.jButtonAbrirImportacionProductoCarac.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoCarac,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoCarac.setToolTipText("Generar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCarac.add(this.jButtonAbrirImportacionProductoCarac, this.gridBagConstraintsProductoCarac);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoCarac = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoCarac.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoCarac.add(this.jLabelPathArchivoImportacionProductoCarac, this.gridBagConstraintsProductoCarac);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoCarac=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoCarac.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoCarac.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoCarac.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCarac.add(this.jTextFieldPathArchivoImportacionProductoCarac, this.gridBagConstraintsProductoCarac);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoCarac = new JButtonMe();
		this.jButtonGenerarImportacionProductoCarac.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoCarac,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoCarac.setToolTipText("Generar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCarac.add(this.jButtonGenerarImportacionProductoCarac, this.gridBagConstraintsProductoCarac);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoCarac = new JButtonMe();
		this.jButtonCerrarImportacionProductoCarac.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoCarac,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoCarac.setToolTipText("Cancelar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCarac.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCarac.add(this.jButtonCerrarImportacionProductoCarac, this.gridBagConstraintsProductoCarac);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoCarac = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoCarac= new JScrollPane(jPanelImportacionProductoCarac,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoCarac.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoCarac.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoCarac.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoCarac);
		this.jInternalFrameImportacionProductoCarac.getContentPane().add(this.jScrollPanelImportacionProductoCarac, this.gridBagConstraintsProductoCarac);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoCarac(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoCarac = new JButtonMe();
			this.jButtonAbrirOrderByProductoCarac.setText("Orden");
			this.jButtonAbrirOrderByProductoCarac.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoCarac,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoCarac";
			inputMap = this.jButtonAbrirOrderByProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoCarac"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoCarac = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoCarac.setName("jPanelOrderByProductoCarac"); 
			
			this.jPanelOrderByProductoCarac.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoCarac.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoCarac.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoCarac.setLayout(gridaBagLayoutOrderByProductoCarac);
			
			
			this.jTableDatosProductoCaracOrderBy = new JTableMe();        
			this.jTableDatosProductoCaracOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoCaracOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoCaracOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoCaracOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoCaracOrderBy.setViewportView(this.jTableDatosProductoCaracOrderBy);
			this.jTableDatosProductoCaracOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoCaracOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoCarac= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoCarac= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoCarac = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoCarac= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoCarac.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoCarac.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoCarac.setTitle("Orden");
			this.jInternalFrameOrderByProductoCarac.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoCarac.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoCarac.setResizable(true);
			this.jInternalFrameOrderByProductoCarac.setClosable(true);
			this.jInternalFrameOrderByProductoCarac.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoCarac.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoCarac.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoCarac.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoCarac.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoCarac.ipady =150;
				
			this.jPanelOrderByProductoCarac.add(jScrollPanelDatosProductoCaracOrderBy, this.gridBagConstraintsProductoCarac);//this.jTableDatosProductoCaracTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoCarac = new JButtonMe();
			this.jButtonCerrarOrderByProductoCarac.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoCarac,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoCarac.setToolTipText("Cancelar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoCarac.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoCarac.add(this.jButtonCerrarOrderByProductoCarac, this.gridBagConstraintsProductoCarac);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoCarac = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoCarac= new JScrollPane(jPanelOrderByProductoCarac,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoCarac.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoCarac.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoCarac.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoCarac);
			
			this.jInternalFrameOrderByProductoCarac.getContentPane().add(this.jScrollPanelOrderByProductoCarac, this.gridBagConstraintsProductoCarac);			
		
		} else {
			this.jButtonAbrirOrderByProductoCarac = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productocaracSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoCarac.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoCarac.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoCarac.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoCarac.getRowHeight();//ProductoCaracConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoCaracConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoCarac.isSelected()) {
					iHeightTable=ProductoCaracConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoCaracConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoCaracConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoCaracConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoCarac.isSelected()) {
					iHeightTable=ProductoCaracConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoCaracConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoCaracConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoCarac.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoCarac.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoCarac.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoCarac.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoCarac.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoCarac.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoCarac!=null && this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy()!=null) {
			//if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoCarac.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoCarac.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoCarac.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoCarac.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoCarac.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoCarac.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productocaracLogic.getProductoCaracs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productocaracs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoCarac> TraerProductoCaracBeans(List<ProductoCarac> productocaracs,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoCarac productocarac:productocaracs) {
					
				if(!(ProductoCaracConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoCaracConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productocarac.setsDetalleGeneralEntityReporte(ProductoCaracConstantesFunciones.getProductoCaracDescripcion(productocarac));
										
						
					
						
					
				} else  {
							
					//productocarac.setsDetalleGeneralEntityReporte(productocarac.getsDetalleGeneralEntityReporte());
										
				}
				
				//productocaracbeans.add(productocaracbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productocaracs;
    }
	//PARA REPORTES FIN
}
