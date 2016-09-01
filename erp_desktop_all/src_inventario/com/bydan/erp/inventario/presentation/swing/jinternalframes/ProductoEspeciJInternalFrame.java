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
import com.bydan.erp.inventario.util.ProductoEspeciConstantesFunciones;

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
public class ProductoEspeciJInternalFrame extends ProductoEspeciBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoEspeci;
	
	protected JMenuBar jmenuBarProductoEspeci;
	
	protected JMenu jmenuProductoEspeci;
	protected JMenu jmenuDatosProductoEspeci;
	protected JMenu jmenuArchivoProductoEspeci;
	protected JMenu jmenuAccionesProductoEspeci;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoEspeci;	
	protected GridBagConstraints gridBagConstraintsProductoEspeci;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoEspeciDetalleFormJInternalFrame jInternalFrameDetalleFormProductoEspeci;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoEspeci;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoEspeci;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoEspeciSessionBean productoespeciSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoEspeci> productoespecis;		
	public List<ProductoEspeci> productoespecisEliminados;	
	public List<ProductoEspeci> productoespecisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoEspeci;		
	protected JButton jButtonAbrirOrderByProductoEspeci;
	
	
	//protected JPanel jPanelOrderByProductoEspeci;
	//public JScrollPane jScrollPanelOrderByProductoEspeci;	
	//protected JButton jButtonCerrarOrderByProductoEspeci;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoEspeciLogic productoespeciLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoEspeci;
	public JScrollPane jScrollPanelDatosEdicionProductoEspeci;
	public JScrollPane jScrollPanelDatosGeneralProductoEspeci;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoEspeciOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoEspeci;
	//public JScrollPane jScrollPanelImportacionProductoEspeci;
	
	
	
	protected JPanel jPanelAccionesProductoEspeci;
	
    protected JPanel jPanelPaginacionProductoEspeci;
    protected JPanel jPanelParametrosReportesProductoEspeci;
	protected JPanel jPanelParametrosReportesAccionesProductoEspeci;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoEspeci;
	protected JPanel jPanelParametrosAuxiliar2ProductoEspeci;
	protected JPanel jPanelParametrosAuxiliar3ProductoEspeci;
	protected JPanel jPanelParametrosAuxiliar4ProductoEspeci;
	//protected JPanel jPanelParametrosAuxiliar5ProductoEspeci;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoEspeci;
	//protected JPanel jPanelImportacionProductoEspeci;
	
	
	public JTable jTableDatosProductoEspeci;
	
	
	
	//public JTable jTableDatosProductoEspeciOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoEspeci;
	protected JButton jButtonDuplicarProductoEspeci;
	protected JButton jButtonCopiarProductoEspeci;
	protected JButton jButtonVerFormProductoEspeci;
	protected JButton jButtonNuevoRelacionesProductoEspeci;
	protected JButton jButtonModificarProductoEspeci;
	
    protected JButton jButtonGuardarCambiosTablaProductoEspeci;
	protected JButton jButtonCerrarProductoEspeci;
	
	
	protected JButton jButtonRecargarInformacionProductoEspeci;
	protected JButton jButtonProcesarInformacionProductoEspeci;
	
	
	protected JButton jButtonAnterioresProductoEspeci;
	protected JButton jButtonSiguientesProductoEspeci;
	protected JButton jButtonNuevoGuardarCambiosProductoEspeci;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoEspeci;
	//protected JButton jButtonCerrarReporteDinamicoProductoEspeci;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoEspeci;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoEspeci;
	//protected JButton jButtonGenerarImportacionProductoEspeci;
	//protected JButton jButtonCerrarImportacionProductoEspeci;
	//protected JFileChooser jFileChooserImportacionProductoEspeci;
	//protected File fileImportacionProductoEspeci;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoEspeci;
	protected JButton jButtonDuplicarToolBarProductoEspeci;
	protected JButton jButtonNuevoRelacionesToolBarProductoEspeci;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoEspeci;
	protected JButton jButtonCopiarToolBarProductoEspeci;
	protected JButton jButtonVerFormToolBarProductoEspeci;
	public JButton jButtonGuardarCambiosTablaToolBarProductoEspeci;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoEspeci;
	protected JButton jButtonCerrarToolBarProductoEspeci;
	
	protected JButton jButtonRecargarInformacionToolBarProductoEspeci;
	protected JButton jButtonProcesarInformacionToolBarProductoEspeci;
	protected JButton jButtonAnterioresToolBarProductoEspeci;
	protected JButton jButtonSiguientesToolBarProductoEspeci;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoEspeci;
	protected JButton jButtonAbrirOrderByToolBarProductoEspeci;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoEspeci;
	protected JMenuItem jMenuItemDuplicarProductoEspeci;
	protected JMenuItem jMenuItemNuevoRelacionesProductoEspeci;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoEspeci;
	protected JMenuItem jMenuItemCopiarProductoEspeci;
	protected JMenuItem jMenuItemVerFormProductoEspeci;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoEspeci;
	protected JMenuItem jMenuItemCerrarProductoEspeci;
	protected JMenuItem jMenuItemDetalleCerrarProductoEspeci;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoEspeci;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoEspeci;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoEspeci;
	protected JMenuItem jMenuItemProcesarInformacionProductoEspeci;
	protected JMenuItem jMenuItemAnterioresProductoEspeci;
	protected JMenuItem jMenuItemSiguientesProductoEspeci;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoEspeci;
	protected JMenuItem jMenuItemAbrirOrderByProductoEspeci;
	protected JMenuItem jMenuItemMostrarOcultarProductoEspeci;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoEspeci;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoEspeci;
	protected JCheckBox jCheckBoxSeleccionadosProductoEspeci;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoEspeci;
	protected JCheckBox jCheckBoxConGraficoReporteProductoEspeci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoEspeci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoEspeci;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoEspeci;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoEspeci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoEspeci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoEspeci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoEspeci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoEspeci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoEspeci;
	protected JTextField jTextFieldValorCampoGeneralProductoEspeci;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoEspeci;
	//public JList<Reporte> jListColumnasSelectReporteProductoEspeci;
	//public JScrollPane jScrollColumnasSelectReporteProductoEspeci;
	
	//public JLabel jLabelRelacionesSelectReporteProductoEspeci;
	//public JList<Reporte> jListRelacionesSelectReporteProductoEspeci;
	//public JScrollPane jScrollRelacionesSelectReporteProductoEspeci;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoEspeci;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoEspeci;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoEspeci;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoEspeci;
	
		
	//public JLabel jLabelArchivoImportacionProductoEspeci;	
	//public JLabel jLabelPathArchivoImportacionProductoEspeci;
	//protected JTextField jTextFieldPathArchivoImportacionProductoEspeci;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoEspeci;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoEspeci;
	
	//public JLabel jLabelColumnaCategoriaValorProductoEspeci;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoEspeci;
	
	//public JLabel jLabelColumnasValoresGraficoProductoEspeci;
	//public JList<Reporte> jListColumnasValoresGraficoProductoEspeci;
	//public JScrollPane jScrollColumnasValoresGraficoProductoEspeci;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoEspeci;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoEspeci;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoEspeci;
	public JPanel jPanelFK_IdProductoProductoEspeci;
	public JButton jButtonFK_IdProductoProductoEspeci;
	
	public JPanel jPanelid_productoFK_IdProductoProductoEspeci;
	public JLabel jLabelid_productoFK_IdProductoProductoEspeci;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoEspeci;
	public JButton jButtonid_productoFK_IdProductoProductoEspeci= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoEspeciUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoEspeciBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoEspeci;
	
	
	
	
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
	public ProductoEspeciJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoEspeci)	{
		this.jButtonRecargarInformacionProductoEspeci = jButtonRecargarInformacionProductoEspeci;
	}
	
	public JButton getjButtonProcesarInformacionProductoEspeci() {
		return this.jButtonProcesarInformacionProductoEspeci;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoEspeci)	{
		this.jButtonProcesarInformacionProductoEspeci = jButtonProcesarInformacionProductoEspeci;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoEspeci() {
		return this.jButtonRecargarInformacionProductoEspeci;
	}
	
	
	public List<ProductoEspeci> getproductoespecis() {
		return this.productoespecis;
	}

	public void setproductoespecis(List<ProductoEspeci> productoespecis) {
		this.productoespecis = productoespecis;
	}
	
	public List<ProductoEspeci> getproductoespecisAux() {
		return this.productoespecisAux;
	}

	public void setproductoespecisAux(List<ProductoEspeci> productoespecisAux) {
		this.productoespecisAux = productoespecisAux;
	}
	
	public List<ProductoEspeci> getproductoespecisEliminados() {
		return this.productoespecisEliminados;
	}

	public void setProductoEspecisEliminados(List<ProductoEspeci> productoespecisEliminados) {
		this.productoespecisEliminados = productoespecisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoEspeci() {
		return jComboBoxTiposSeleccionarProductoEspeci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoEspeci(
			JComboBox jComboBoxTiposSeleccionarProductoEspeci) {
		this.jComboBoxTiposSeleccionarProductoEspeci = jComboBoxTiposSeleccionarProductoEspeci;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoEspeci .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoEspeci() {
		return jTextFieldValorCampoGeneralProductoEspeci;
	}

	public void setjTextFieldValorCampoGeneralProductoEspeci(
			JTextField jTextFieldValorCampoGeneralProductoEspeci) {
		this.jTextFieldValorCampoGeneralProductoEspeci = jTextFieldValorCampoGeneralProductoEspeci;
	}

	public void setBorderResaltarValorCampoGeneralProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoEspeci .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoEspeci() {
		return this.jCheckBoxSeleccionarTodosProductoEspeci;
	}

	public void setjCheckBoxSeleccionarTodosProductoEspeci(
			JCheckBox jCheckBoxSeleccionarTodosProductoEspeci) {
		this.jCheckBoxSeleccionarTodosProductoEspeci = jCheckBoxSeleccionarTodosProductoEspeci;
	}

	public void setBorderResaltarSeleccionarTodosProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoEspeci .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoEspeci() {
		return this.jCheckBoxSeleccionadosProductoEspeci;
	}

	public void setjCheckBoxSeleccionadosProductoEspeci(
			JCheckBox jCheckBoxSeleccionadosProductoEspeci) {
		this.jCheckBoxSeleccionadosProductoEspeci = jCheckBoxSeleccionadosProductoEspeci;
	}
	
	public void setBorderResaltarSeleccionadosProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoEspeci .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoEspeci() {
		return this.jComboBoxTiposArchivosReportesProductoEspeci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoEspeci(
			JComboBox jComboBoxTiposArchivosReportesProductoEspeci) {
		this.jComboBoxTiposArchivosReportesProductoEspeci = jComboBoxTiposArchivosReportesProductoEspeci;
	}

	public void setBorderResaltarTiposArchivosReportesProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoEspeci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoEspeci() {
		return this.jComboBoxTiposReportesProductoEspeci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoEspeci(
			JComboBox jComboBoxTiposReportesProductoEspeci) {
		this.jComboBoxTiposReportesProductoEspeci = jComboBoxTiposReportesProductoEspeci;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoEspeci() {
	//	return jComboBoxTiposReportesDinamicoProductoEspeci;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoEspeci(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoEspeci) {
	//	this.jComboBoxTiposReportesDinamicoProductoEspeci = jComboBoxTiposReportesDinamicoProductoEspeci;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoEspeci() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoEspeci;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoEspeci(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoEspeci) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci = jComboBoxTiposArchivosReportesDinamicoProductoEspeci;
	//}
	
	public void setBorderResaltarTiposReportesProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoEspeci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoEspeci() {
		return this.jComboBoxTiposGraficosReportesProductoEspeci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoEspeci(
			JComboBox jComboBoxTiposGraficosReportesProductoEspeci) {
		this.jComboBoxTiposGraficosReportesProductoEspeci = jComboBoxTiposGraficosReportesProductoEspeci;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoEspeci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoEspeci() {
		return this.jComboBoxTiposPaginacionProductoEspeci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoEspeci(
			JComboBox jComboBoxTiposPaginacionProductoEspeci) {
		this.jComboBoxTiposPaginacionProductoEspeci = jComboBoxTiposPaginacionProductoEspeci;
	}
	
	public void setBorderResaltarTiposPaginacionProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoEspeci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoEspeci() {
		return this.jComboBoxTiposRelacionesProductoEspeci;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoEspeci() {
		return this.jComboBoxTiposAccionesProductoEspeci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoEspeci(
			JComboBox jComboBoxTiposRelacionesProductoEspeci) {
		this.jComboBoxTiposRelacionesProductoEspeci = jComboBoxTiposRelacionesProductoEspeci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoEspeci(
			JComboBox jComboBoxTiposAccionesProductoEspeci) {
		this.jComboBoxTiposAccionesProductoEspeci = jComboBoxTiposAccionesProductoEspeci;
	}
	
	public void setBorderResaltarTiposRelacionesProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoEspeci .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoEspeci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoEspeci .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoEspeci() {
	//	return jCheckBoxConGraficoDinamicoProductoEspeci;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoEspeci(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoEspeci) {
	//	this.jCheckBoxConGraficoDinamicoProductoEspeci = jCheckBoxConGraficoDinamicoProductoEspeci;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoEspeci() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoEspeci.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoEspeci .setBorder(borderResaltar);		
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
		this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		
		this.productoespeciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoespeciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoespeciSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoEspeciJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Especificacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoEspeciJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoEspeci= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"nuevo","nuevo","Nuevo"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"duplicar","duplicar","Duplicar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"copiar","copiar","Copiar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"ver_form","ver_form","Ver"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"recargar","recargar","Recargar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoEspeci,this.jTtoolBarProductoEspeci,
							"cerrar","cerrar","Salir"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoEspeci=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoEspeci;
			
				this.jButtonProcesarInformacionToolBarProductoEspeci=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoEspeci;
				
		//protected JButton jButtonModificarToolBarProductoEspeci;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoEspeci=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoEspeci=new JMenuMe("General");
		this.jmenuArchivoProductoEspeci=new JMenuMe("Archivo");
		this.jmenuAccionesProductoEspeci=new JMenuMe("Acciones");
		this.jmenuDatosProductoEspeci=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoEspeci= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoEspeci.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoEspeci,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoEspeci= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoEspeci.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoEspeci,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoEspeci= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoEspeci.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoEspeci,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoEspeci= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoEspeci.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoEspeci,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoEspeci= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoEspeci.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoEspeci,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoEspeci= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoEspeci.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoEspeci,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoEspeci= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoEspeci.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoEspeci,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoEspeci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoEspeci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoEspeci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoEspeci= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoEspeci.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoEspeci,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoEspeci= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoEspeci.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoEspeci,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoEspeci= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoEspeci.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoEspeci,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoEspeci= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoEspeci.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoEspeci,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoEspeci= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoEspeci.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoEspeci,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoEspeci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoEspeci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoEspeci,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoEspeci= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoEspeci.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoEspeci,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoEspeci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoEspeci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoEspeci,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoEspeci= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoEspeci.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoEspeci,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoEspeci.add(this.jMenuItemCerrarProductoEspeci);
			
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemNuevoProductoEspeci);
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemNuevoGuardarCambiosProductoEspeci);
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemNuevoRelacionesProductoEspeci);
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemGuardarCambiosTablaProductoEspeci);		
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemDuplicarProductoEspeci);		
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemCopiarProductoEspeci);		
			this.jmenuAccionesProductoEspeci.add(this.jMenuItemVerFormProductoEspeci);		
			
			this.jmenuDatosProductoEspeci.add(this.jMenuItemRecargarInformacionProductoEspeci);				
			this.jmenuDatosProductoEspeci.add(this.jMenuItemAnterioresProductoEspeci);				
			this.jmenuDatosProductoEspeci.add(this.jMenuItemSiguientesProductoEspeci);				
			this.jmenuDatosProductoEspeci.add(this.jMenuItemAbrirOrderByProductoEspeci);				
			this.jmenuDatosProductoEspeci.add(this.jMenuItemMostrarOcultarProductoEspeci);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoEspeci.add(this.jMenuItemGuardarCambiosProductoEspeci);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoEspeci.add(this.jmenuArchivoProductoEspeci);		
			this.jmenuBarProductoEspeci.add(this.jmenuAccionesProductoEspeci);		
			this.jmenuBarProductoEspeci.add(this.jmenuDatosProductoEspeci);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoEspeci);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoEspeci() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProductoProductoEspeci=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoEspeci.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoEspeci= new JButtonMe();
		this.jButtonFK_IdProductoProductoEspeci.setText("Buscar");
		this.jButtonFK_IdProductoProductoEspeci.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoEspeci,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoEspeci = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoEspeci.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoEspeci.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoEspeci,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoEspeci= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoEspeci,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.setFocusable(false);


		this.jTabbedPaneBusquedasProductoEspeci=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoEspeci.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoEspeci.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoEspeci.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoEspeci.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoEspeci,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoEspeci = new ProductoEspeciDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Especificacion DATOS");
			this.jInternalFrameDetalleFormProductoEspeci = new ProductoEspeciDetalleFormJInternalFrame(jDesktopPane,this.productoespeciSessionBean.getConGuardarRelaciones(),this.productoespeciSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoEspeci = null;//new ProductoEspeciDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoEspeci= new GridBagLayout();
		
		
		this.jTableDatosProductoEspeci = new JTableMe();      
		
		String sToolTipProductoEspeci="";
		sToolTipProductoEspeci=ProductoEspeciConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoEspeci+="(Inventario.ProductoEspeci)";
		}
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoEspeci+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoEspeci.setToolTipText(sToolTipProductoEspeci);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoEspeci);
		this.jTableDatosProductoEspeci.setAutoCreateRowSorter(true);
		this.jTableDatosProductoEspeci.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoEspeci.setRowSelectionAllowed(true);
		this.jTableDatosProductoEspeci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoEspeci,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoEspeci = new JButtonMe();
		this.jButtonDuplicarProductoEspeci = new JButtonMe();
		this.jButtonCopiarProductoEspeci = new JButtonMe();
		this.jButtonVerFormProductoEspeci = new JButtonMe();
		this.jButtonNuevoRelacionesProductoEspeci = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoEspeci = new JButtonMe();
		this.jButtonCerrarProductoEspeci = new JButtonMe();
		
		this.jScrollPanelDatosProductoEspeci = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoEspeci = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Especificacion";
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoEspeci.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoEspeci.setToolTipText("Acciones");
        this.jPanelAccionesProductoEspeci.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoEspeci=new ReporteDinamicoJInternalFrame(ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoEspeci();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoEspeci=new ImportacionJInternalFrame(ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoEspeci();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoEspeci = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoEspeci.setText("Orden");
		this.jButtonAbrirOrderByProductoEspeci.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoEspeci,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoEspeci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEspeci,false,this);
			
			//this.cargarOrderByProductoEspeci(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoEspeci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEspeci,true,this);
			
			//this.cargarOrderByProductoEspeci(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoEspeci.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProductoEspeci.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProductoEspeci.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProductoEspeci.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoEspeci.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoEspeci.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoEspeci.setText("Nuevo");
		this.jButtonDuplicarProductoEspeci.setText("Duplicar");
		this.jButtonCopiarProductoEspeci.setText("Copiar");
		this.jButtonVerFormProductoEspeci.setText("Ver");
		this.jButtonNuevoRelacionesProductoEspeci.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoEspeci.setText("Guardar");
		this.jButtonCerrarProductoEspeci.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoEspeci,"nuevo_button","Nuevo",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoEspeci,"duplicar_button","Duplicar",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoEspeci,"copiar_button","Copiar",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoEspeci,"ver_form","Ver",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoEspeci,"nuevorelaciones_button","Nuevo Rel",this.productoespeciSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoEspeci,"guardarcambiostabla_button","Guardar",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoEspeci,"cerrar_button","Salir",this.productoespeciSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoEspeci.setToolTipText("Nuevo"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoEspeci.setToolTipText("Duplicar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoEspeci.setToolTipText("Copiar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoEspeci.setToolTipText("Ver"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoEspeci.setToolTipText("Nuevo Rel"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoEspeci.setToolTipText("Guardar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoEspeci.setToolTipText("Salir"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoEspeci";
		inputMap = this.jButtonNuevoProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoEspeci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoEspeci"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoEspeci";
		inputMap = this.jButtonDuplicarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoEspeci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoEspeci"));
		
		//COPIAR
		sMapKey = "CopiarProductoEspeci";
		inputMap = this.jButtonCopiarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoEspeci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoEspeci"));
		
		//VEr FORM
		sMapKey = "VerFormProductoEspeci";
		inputMap = this.jButtonVerFormProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoEspeci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoEspeci"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoEspeci";
		inputMap = this.jButtonNuevoRelacionesProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoEspeci"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoEspeci";
		inputMap = this.jButtonModificarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoEspeci"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoEspeci";
		inputMap = this.jButtonCerrarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoEspeci"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoEspeci";
		inputMap = this.jButtonGuardarCambiosTablaProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoEspeci"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoEspeci.setName("jPanelParametrosReportesProductoEspeci"); 
		
		this.jPanelParametrosReportesAccionesProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoEspeci.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoEspeci.setName("jPanelParametrosReportesAccionesProductoEspeci"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoEspeci = new JButtonMe();
		this.jButtonRecargarInformacionProductoEspeci.setText("Recargar");
		this.jButtonRecargarInformacionProductoEspeci.setToolTipText("Recargar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoEspeci,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoEspeci = new JButtonMe();
		this.jButtonProcesarInformacionProductoEspeci.setText("Procesar");
		this.jButtonProcesarInformacionProductoEspeci.setToolTipText("Procesar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoEspeci.setVisible(false);
			
		this.jButtonProcesarInformacionProductoEspeci.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoEspeci.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoEspeci.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEspeci.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoEspeci.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEspeci.setText("TIPO");       
		this.jComboBoxTiposReportesProductoEspeci.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEspeci.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoEspeci.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoEspeci.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoEspeci.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoEspeci.setText("Accion");
		this.jComboBoxTiposRelacionesProductoEspeci.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoEspeci.setText("Accion");
		this.jComboBoxTiposAccionesProductoEspeci.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoEspeci.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoEspeci.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoEspeci=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoEspeci.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoEspeci.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoEspeci.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoEspeci = new JLabelMe();
		
		this.jLabelAccionesProductoEspeci.setText("Acciones");		
		this.jLabelAccionesProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoEspeci = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoEspeci.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoEspeci.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoEspeci = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoEspeci.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoEspeci.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoEspeci = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoEspeci.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoEspeci.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoEspeci = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoEspeci.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoEspeci.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoEspeci = new JButtonMe();
		//this.jButtonAnterioresProductoEspeci.setText("<<");
        this.jButtonAnterioresProductoEspeci.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoEspeci,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoEspeci = new JButtonMe();
		//this.jButtonSiguientesProductoEspeci.setText(">>");
        this.jButtonSiguientesProductoEspeci.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoEspeci,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoEspeci = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoEspeci.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoEspeci.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoEspeci,"nuevoguardarcambios_button","Nue",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoEspeci";
		inputMap = this.jButtonNuevoGuardarCambiosProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoEspeci"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoEspeci";
		inputMap = this.jButtonRecargarInformacionProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoEspeci"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoEspeci";
		inputMap = this.jButtonSiguientesProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoEspeci"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoEspeci";
		inputMap = this.jButtonAnterioresProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoEspeci"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoEspeci();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoEspeci.setMinimumSize(new Dimension(this.getWidth(),ProductoEspeciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEspeciBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoEspeci.setMaximumSize(new Dimension(this.getWidth(),ProductoEspeciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEspeciBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoEspeci.setPreferredSize(new Dimension(this.getWidth(),ProductoEspeciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEspeciBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoEspeci = new GridBagLayout();

			this.jPanelPaginacionProductoEspeci.setLayout(gridaBagLayoutPaginacionProductoEspeci);						
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 0;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoEspeci.add(this.jButtonAnterioresProductoEspeci, this.gridBagConstraintsProductoEspeci);
					
						
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoEspeci.gridy = 0;
			
			this.jPanelPaginacionProductoEspeci.add(this.jButtonNuevoGuardarCambiosProductoEspeci, this.gridBagConstraintsProductoEspeci);
						
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoEspeci.gridy = 0;
			this.jPanelPaginacionProductoEspeci.add(this.jButtonSiguientesProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 1;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEspeci.add(this.jButtonNuevoProductoEspeci, this.gridBagConstraintsProductoEspeci);
						
			
			
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
				this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoEspeci.gridy = 1;
				this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoEspeci.add(this.jButtonGuardarCambiosTablaProductoEspeci, this.gridBagConstraintsProductoEspeci);
			}
			
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 1;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEspeci.add(this.jButtonDuplicarProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 1;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEspeci.add(this.jButtonCopiarProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 1;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEspeci.add(this.jButtonVerFormProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 1;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoEspeci.add(this.jButtonCerrarProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
		
		
		this.jButtonRecargarInformacionProductoEspeci.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoEspeci.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoEspeci.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoEspeci.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoEspeci.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoEspeci.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoEspeci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoEspeci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoEspeci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoEspeci.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoEspeci.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoEspeci.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoEspeci.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoEspeci.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoEspeci.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoEspeci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoEspeci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoEspeci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoEspeci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEspeci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEspeci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoEspeci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoEspeci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoEspeci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoEspeci.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoEspeci.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoEspeci.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoEspeci.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoEspeci.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoEspeci.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoEspeci.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoEspeci.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoEspeci.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoEspeci.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoEspeci.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoEspeci.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoEspeci = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoEspeci = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoEspeci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoEspeci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoEspeci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoEspeci = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoEspeci.setLayout(gridaBagParametrosReportesProductoEspeci);
			this.jPanelParametrosReportesAccionesProductoEspeci.setLayout(gridaBagParametrosReportesAccionesProductoEspeci);
			
			
			this.jPanelParametrosAuxiliar1ProductoEspeci.setLayout(gridaBagParametrosAuxiliar1ProductoEspeci);
			this.jPanelParametrosAuxiliar2ProductoEspeci.setLayout(gridaBagParametrosAuxiliar2ProductoEspeci);
			this.jPanelParametrosAuxiliar3ProductoEspeci.setLayout(gridaBagParametrosAuxiliar3ProductoEspeci);
			this.jPanelParametrosAuxiliar4ProductoEspeci.setLayout(gridaBagParametrosAuxiliar4ProductoEspeci);
			//this.jPanelParametrosAuxiliar5ProductoEspeci.setLayout(gridaBagParametrosAuxiliar2ProductoEspeci);			
			
			
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEspeci.add(this.jButtonRecargarInformacionProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEspeci.add(this.jComboBoxTiposPaginacionProductoEspeci, this.gridBagConstraintsProductoEspeci);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEspeci.add(this.jCheckBoxConAltoMaximoTablaProductoEspeci, this.gridBagConstraintsProductoEspeci);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEspeci.add(this.jComboBoxTiposArchivosReportesProductoEspeci, this.gridBagConstraintsProductoEspeci);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEspeci.add(this.jPanelParametrosAuxiliar1ProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoEspeci.add(this.jComboBoxTiposReportesProductoEspeci, this.gridBagConstraintsProductoEspeci);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEspeci.add(this.jPanelParametrosAuxiliar4ProductoEspeci, this.gridBagConstraintsProductoEspeci);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEspeci.add(this.jComboBoxTiposReportesProductoEspeci, this.gridBagConstraintsProductoEspeci);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEspeci.add(this.jCheckBoxGenerarReporteProductoEspeci, this.gridBagConstraintsProductoEspeci);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEspeci.add(this.jPanelParametrosAuxiliar2ProductoEspeci, this.gridBagConstraintsProductoEspeci);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEspeci.add(this.jLabelAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
				this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoEspeci.add(this.jButtonAbrirOrderByProductoEspeci, this.gridBagConstraintsProductoEspeci);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEspeci.add(this.jComboBoxTiposSeleccionarProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			
			
			/*
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEspeci.add(this.jCheckBoxSeleccionarTodosProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoEspeci.add(this.jCheckBoxSeleccionarTodosProductoEspeci, this.gridBagConstraintsProductoEspeci);															
				
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEspeci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoEspeci.add(this.jCheckBoxSeleccionadosProductoEspeci, this.gridBagConstraintsProductoEspeci);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEspeci.add(this.jPanelParametrosAuxiliar3ProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEspeci.add(this.jComboBoxTiposAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
	
				
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEspeci.add(this.jTextFieldValorCampoGeneralProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoEspeci = new GridBagLayout();

			this.jScrollPanelDatosProductoEspeci.setLayout(gridaBagLayoutDatosProductoEspeci);
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = 0;
			this.gridBagConstraintsProductoEspeci.gridx = 0;
			
			this.jScrollPanelDatosProductoEspeci.add(this.jTableDatosProductoEspeci, this.gridBagConstraintsProductoEspeci);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoEspeci.setViewportView(this.jTableDatosProductoEspeci);
		this.jTableDatosProductoEspeci.setFillsViewportHeight(true);
		this.jTableDatosProductoEspeci.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoEspeci= new GridBagLayout();
		this.jPanelAccionesProductoEspeci.setLayout(gridaBagLayoutAccionesProductoEspeci);
		
		
		/*	
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 0;
			
		this.jPanelAccionesProductoEspeci.add(this.jButtonNuevoProductoEspeci, this.gridBagConstraintsProductoEspeci);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProductoProductoEspeci= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoEspeci.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoEspeci.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoEspeci.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoEspeci.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoEspeci.setLayout(gridaBagLayoutFK_IdProductoProductoEspeci);

		gridBagConstraintsProductoEspeci = new GridBagConstraints();
		gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEspeci.gridy = 0;
		gridBagConstraintsProductoEspeci.gridx = 0;
		jPanelFK_IdProductoProductoEspeci.add(jLabelid_productoFK_IdProductoProductoEspeci, gridBagConstraintsProductoEspeci);

		gridBagConstraintsProductoEspeci = new GridBagConstraints();
		gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEspeci.gridy = 0;
		gridBagConstraintsProductoEspeci.gridx = 1;
		jPanelFK_IdProductoProductoEspeci.add(jComboBoxid_productoFK_IdProductoProductoEspeci, gridBagConstraintsProductoEspeci);


		gridBagConstraintsProductoEspeci = new GridBagConstraints();
		gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoEspeci.gridy = 0;
		gridBagConstraintsProductoEspeci.gridx = 0;
		jPanelFK_IdProductoProductoEspeci.add(this.jButtonBuscarFK_IdProductoid_productoProductoEspeci, gridBagConstraintsProductoEspeci);

		gridBagConstraintsProductoEspeci = new GridBagConstraints();
		gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEspeci.gridy = 1;
		gridBagConstraintsProductoEspeci.gridx =1;
		jPanelFK_IdProductoProductoEspeci.add(jButtonFK_IdProductoProductoEspeci, gridBagConstraintsProductoEspeci);

		jTabbedPaneBusquedasProductoEspeci.addTab("1.-Por Producto ", jPanelFK_IdProductoProductoEspeci);
		jTabbedPaneBusquedasProductoEspeci.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoEspeci = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoEspeci);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();						
			this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEspeci.gridx = 0;		
			//this.gridBagConstraintsProductoEspeci.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoEspeci.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoEspeci, this.gridBagConstraintsProductoEspeci);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoEspeci.gridx = 0;		
		//this.gridBagConstraintsProductoEspeci.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoEspeci.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoEspeci);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEspeci.gridx = 0;		
			this.gridBagConstraintsProductoEspeci.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoEspeci.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoEspeci, this.gridBagConstraintsProductoEspeci);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoEspeci, this.gridBagConstraintsProductoEspeci);								
		
		
		/*
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
		*/		
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoEspeci.gridx =0;
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoEspeci.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoEspeci, this.gridBagConstraintsProductoEspeci);
				
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoEspeci, this.gridBagConstraintsProductoEspeci);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoEspeci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoEspeci = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoEspeci.setLayout(gridaBagLayoutBusquedasParametrosProductoEspeci);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoEspeci=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoEspeci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEspeci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEspeci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoEspeci;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoEspeci() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoEspeci = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoEspeci.setName("jPanelReporteDinamicoProductoEspeci"); 
		
		this.jPanelReporteDinamicoProductoEspeci.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoEspeci.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoEspeci.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoEspeci.setLayout(gridaBagLayoutReporteDinamicoProductoEspeci);
		
		
		this.jInternalFrameReporteDinamicoProductoEspeci= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoEspeci = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoEspeci= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoEspeci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoEspeci.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoEspeci.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoEspeci.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoEspeci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoEspeci.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoEspeci.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoEspeci.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoEspeci.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoEspeci.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoEspeci.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoEspeci = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoEspeci.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoEspeci.add(this.jLabelColumnasSelectReporteProductoEspeci, this.gridBagConstraintsProductoEspeci);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoEspeci = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoEspeci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoEspeci.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoEspeci.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoEspeci.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoEspeci.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoEspeci=new JScrollPane(this.jListColumnasSelectReporteProductoEspeci);
			
			this.jScrollColumnasSelectReporteProductoEspeci.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoEspeci.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoEspeci.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoEspeci.add(this.jListColumnasSelectReporteProductoEspeci, this.gridBagConstraintsProductoEspeci);
		this.jPanelReporteDinamicoProductoEspeci.add(this.jScrollColumnasSelectReporteProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoEspeci = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoEspeci.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoEspeci = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoEspeci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoEspeci.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoEspeci.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoEspeci.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoEspeci.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoEspeci=new JScrollPane(this.jListRelacionesSelectReporteProductoEspeci);
			
			this.jScrollRelacionesSelectReporteProductoEspeci.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoEspeci.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoEspeci.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoEspeci = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoEspeci = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoEspeci = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoEspeci = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoEspeci.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoEspeci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoEspeci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoEspeci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoEspeci = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoEspeci.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEspeci.add(this.jLabelGenerarExcelReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoEspeci = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoEspeci.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoEspeci,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoEspeci.setToolTipText("Generar EXCEL"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoEspeci.add(this.jButtonGenerarExcelReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEspeci.add(this.jComboBoxTiposReportesDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoEspeci = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoEspeci.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEspeci.add(this.jLabelTiposArchivoReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEspeci.add(this.jComboBoxTiposArchivosReportesDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoEspeci = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoEspeci.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoEspeci,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoEspeci.setToolTipText("Generar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEspeci.add(this.jButtonGenerarReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoEspeci = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoEspeci.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoEspeci,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoEspeci.setToolTipText("Cancelar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEspeci.add(this.jButtonCerrarReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoEspeci = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoEspeci= new JScrollPane(jPanelReporteDinamicoProductoEspeci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoEspeci.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoEspeci.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoEspeci.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoEspeci.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoEspeci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoEspeci.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoEspeci);
		this.jInternalFrameReporteDinamicoProductoEspeci.getContentPane().add(this.jScrollPanelReporteDinamicoProductoEspeci, this.gridBagConstraintsProductoEspeci);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoEspeci() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoEspeci = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoEspeci.setName("jPanelImportacionProductoEspeci"); 
		
		this.jPanelImportacionProductoEspeci.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoEspeci.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoEspeci.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoEspeci.setLayout(gridaBagLayoutImportacionProductoEspeci);
		
		
		this.jInternalFrameImportacionProductoEspeci= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoEspeci= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoEspeci = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoEspeci= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoEspeci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoEspeci.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoEspeci.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoEspeci.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoEspeci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoEspeci.setResizable(true);
	    this.jInternalFrameImportacionProductoEspeci.setClosable(true);
	    this.jInternalFrameImportacionProductoEspeci.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoEspeci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoEspeci.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoEspeci.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoEspeci.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoEspeci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoEspeci.setResizable(true);
	    this.jInternalFrameImportacionProductoEspeci.setClosable(true);
	    this.jInternalFrameImportacionProductoEspeci.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoEspeci.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoEspeci.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoEspeci.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoEspeci = new JLabelMe();

		this.jLabelArchivoImportacionProductoEspeci.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoEspeci.add(this.jLabelArchivoImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoEspeci = new JFileChooser();		
		this.jFileChooserImportacionProductoEspeci.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoEspeci = new JButtonMe();
		this.jButtonAbrirImportacionProductoEspeci.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoEspeci,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoEspeci.setToolTipText("Generar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEspeci.add(this.jButtonAbrirImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoEspeci = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoEspeci.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoEspeci.add(this.jLabelPathArchivoImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoEspeci=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoEspeci.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoEspeci.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoEspeci.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEspeci.add(this.jTextFieldPathArchivoImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoEspeci = new JButtonMe();
		this.jButtonGenerarImportacionProductoEspeci.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoEspeci,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoEspeci.setToolTipText("Generar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEspeci.add(this.jButtonGenerarImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoEspeci = new JButtonMe();
		this.jButtonCerrarImportacionProductoEspeci.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoEspeci,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoEspeci.setToolTipText("Cancelar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEspeci.add(this.jButtonCerrarImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoEspeci = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoEspeci= new JScrollPane(jPanelImportacionProductoEspeci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoEspeci.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoEspeci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoEspeci.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoEspeci);
		this.jInternalFrameImportacionProductoEspeci.getContentPane().add(this.jScrollPanelImportacionProductoEspeci, this.gridBagConstraintsProductoEspeci);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoEspeci(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoEspeci = new JButtonMe();
			this.jButtonAbrirOrderByProductoEspeci.setText("Orden");
			this.jButtonAbrirOrderByProductoEspeci.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoEspeci,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoEspeci";
			inputMap = this.jButtonAbrirOrderByProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoEspeci"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoEspeci = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoEspeci.setName("jPanelOrderByProductoEspeci"); 
			
			this.jPanelOrderByProductoEspeci.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoEspeci.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoEspeci.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoEspeci.setLayout(gridaBagLayoutOrderByProductoEspeci);
			
			
			this.jTableDatosProductoEspeciOrderBy = new JTableMe();        
			this.jTableDatosProductoEspeciOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoEspeciOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoEspeciOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoEspeciOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoEspeciOrderBy.setViewportView(this.jTableDatosProductoEspeciOrderBy);
			this.jTableDatosProductoEspeciOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoEspeciOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoEspeci= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoEspeci= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoEspeci = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoEspeci= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoEspeci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoEspeci.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoEspeci.setTitle("Orden");
			this.jInternalFrameOrderByProductoEspeci.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoEspeci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoEspeci.setResizable(true);
			this.jInternalFrameOrderByProductoEspeci.setClosable(true);
			this.jInternalFrameOrderByProductoEspeci.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoEspeci.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoEspeci.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoEspeci.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoEspeci.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoEspeci.ipady =150;
				
			this.jPanelOrderByProductoEspeci.add(jScrollPanelDatosProductoEspeciOrderBy, this.gridBagConstraintsProductoEspeci);//this.jTableDatosProductoEspeciTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoEspeci = new JButtonMe();
			this.jButtonCerrarOrderByProductoEspeci.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoEspeci,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoEspeci.setToolTipText("Cancelar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoEspeci.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoEspeci.add(this.jButtonCerrarOrderByProductoEspeci, this.gridBagConstraintsProductoEspeci);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoEspeci = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoEspeci= new JScrollPane(jPanelOrderByProductoEspeci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoEspeci.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoEspeci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoEspeci.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoEspeci);
			
			this.jInternalFrameOrderByProductoEspeci.getContentPane().add(this.jScrollPanelOrderByProductoEspeci, this.gridBagConstraintsProductoEspeci);			
		
		} else {
			this.jButtonAbrirOrderByProductoEspeci = new JButtonMe();
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
			&& this.productoespeciSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoEspeci.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoEspeci.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoEspeci.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoEspeci.getRowHeight();//ProductoEspeciConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoEspeci.isSelected()) {
					iHeightTable=ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoEspeci.isSelected()) {
					iHeightTable=ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoEspeciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoEspeci.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoEspeci.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoEspeci.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoEspeci.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoEspeci.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoEspeci.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoEspeci!=null && this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy()!=null) {
			//if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoEspeci.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoEspeci.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoEspeci.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoEspeci.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoEspeci.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoEspeci.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoespeciLogic.getProductoEspecis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoespecis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoEspeci> TraerProductoEspeciBeans(List<ProductoEspeci> productoespecis,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoEspeci productoespeci:productoespecis) {
					
				if(!(ProductoEspeciConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoEspeciConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoespeci.setsDetalleGeneralEntityReporte(ProductoEspeciConstantesFunciones.getProductoEspeciDescripcion(productoespeci));
										
						
					
						
					
				} else  {
							
					//productoespeci.setsDetalleGeneralEntityReporte(productoespeci.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoespecibeans.add(productoespecibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoespecis;
    }
	//PARA REPORTES FIN
}
