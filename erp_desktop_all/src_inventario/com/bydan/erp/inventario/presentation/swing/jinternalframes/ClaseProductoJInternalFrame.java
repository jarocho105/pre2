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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
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
import com.bydan.erp.inventario.util.ClaseProductoConstantesFunciones;

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
public class ClaseProductoJInternalFrame extends ClaseProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClaseProducto;
	
	protected JMenuBar jmenuBarClaseProducto;
	
	protected JMenu jmenuClaseProducto;
	protected JMenu jmenuDatosClaseProducto;
	protected JMenu jmenuArchivoClaseProducto;
	protected JMenu jmenuAccionesClaseProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClaseProducto;	
	protected GridBagConstraints gridBagConstraintsClaseProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClaseProductoDetalleFormJInternalFrame jInternalFrameDetalleFormClaseProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClaseProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClaseProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public ClaseProductoSessionBean claseproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClaseProducto> claseproductos;		
	public List<ClaseProducto> claseproductosEliminados;	
	public List<ClaseProducto> claseproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClaseProducto;		
	protected JButton jButtonAbrirOrderByClaseProducto;
	
	
	//protected JPanel jPanelOrderByClaseProducto;
	//public JScrollPane jScrollPanelOrderByClaseProducto;	
	//protected JButton jButtonCerrarOrderByClaseProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClaseProductoLogic claseproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClaseProducto;
	public JScrollPane jScrollPanelDatosEdicionClaseProducto;
	public JScrollPane jScrollPanelDatosGeneralClaseProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosClaseProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClaseProducto;
	//public JScrollPane jScrollPanelImportacionClaseProducto;
	
	
	
	protected JPanel jPanelAccionesClaseProducto;
	
    protected JPanel jPanelPaginacionClaseProducto;
    protected JPanel jPanelParametrosReportesClaseProducto;
	protected JPanel jPanelParametrosReportesAccionesClaseProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClaseProducto;
	protected JPanel jPanelParametrosAuxiliar2ClaseProducto;
	protected JPanel jPanelParametrosAuxiliar3ClaseProducto;
	protected JPanel jPanelParametrosAuxiliar4ClaseProducto;
	//protected JPanel jPanelParametrosAuxiliar5ClaseProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoClaseProducto;
	//protected JPanel jPanelImportacionClaseProducto;
	
	
	public JTable jTableDatosClaseProducto;
	
	
	
	//public JTable jTableDatosClaseProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClaseProducto;
	protected JButton jButtonDuplicarClaseProducto;
	protected JButton jButtonCopiarClaseProducto;
	protected JButton jButtonVerFormClaseProducto;
	protected JButton jButtonNuevoRelacionesClaseProducto;
	protected JButton jButtonModificarClaseProducto;
	
    protected JButton jButtonGuardarCambiosTablaClaseProducto;
	protected JButton jButtonCerrarClaseProducto;
	
	
	protected JButton jButtonRecargarInformacionClaseProducto;
	protected JButton jButtonProcesarInformacionClaseProducto;
	
	
	protected JButton jButtonAnterioresClaseProducto;
	protected JButton jButtonSiguientesClaseProducto;
	protected JButton jButtonNuevoGuardarCambiosClaseProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClaseProducto;
	//protected JButton jButtonCerrarReporteDinamicoClaseProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoClaseProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionClaseProducto;
	//protected JButton jButtonGenerarImportacionClaseProducto;
	//protected JButton jButtonCerrarImportacionClaseProducto;
	//protected JFileChooser jFileChooserImportacionClaseProducto;
	//protected File fileImportacionClaseProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClaseProducto;
	protected JButton jButtonDuplicarToolBarClaseProducto;
	protected JButton jButtonNuevoRelacionesToolBarClaseProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarClaseProducto;
	protected JButton jButtonCopiarToolBarClaseProducto;
	protected JButton jButtonVerFormToolBarClaseProducto;
	public JButton jButtonGuardarCambiosTablaToolBarClaseProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarClaseProducto;
	protected JButton jButtonCerrarToolBarClaseProducto;
	
	protected JButton jButtonRecargarInformacionToolBarClaseProducto;
	protected JButton jButtonProcesarInformacionToolBarClaseProducto;
	protected JButton jButtonAnterioresToolBarClaseProducto;
	protected JButton jButtonSiguientesToolBarClaseProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarClaseProducto;
	protected JButton jButtonAbrirOrderByToolBarClaseProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClaseProducto;
	protected JMenuItem jMenuItemDuplicarClaseProducto;
	protected JMenuItem jMenuItemNuevoRelacionesClaseProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClaseProducto;
	protected JMenuItem jMenuItemCopiarClaseProducto;
	protected JMenuItem jMenuItemVerFormClaseProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaClaseProducto;
	protected JMenuItem jMenuItemCerrarClaseProducto;
	protected JMenuItem jMenuItemDetalleCerrarClaseProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClaseProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarClaseProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionClaseProducto;
	protected JMenuItem jMenuItemProcesarInformacionClaseProducto;
	protected JMenuItem jMenuItemAnterioresClaseProducto;
	protected JMenuItem jMenuItemSiguientesClaseProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClaseProducto;
	protected JMenuItem jMenuItemAbrirOrderByClaseProducto;
	protected JMenuItem jMenuItemMostrarOcultarClaseProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClaseProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClaseProducto;
	protected JCheckBox jCheckBoxSeleccionadosClaseProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClaseProducto;
	protected JCheckBox jCheckBoxConGraficoReporteClaseProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClaseProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClaseProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClaseProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClaseProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClaseProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClaseProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClaseProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClaseProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClaseProducto;
	protected JTextField jTextFieldValorCampoGeneralClaseProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClaseProducto;
	//public JList<Reporte> jListColumnasSelectReporteClaseProducto;
	//public JScrollPane jScrollColumnasSelectReporteClaseProducto;
	
	//public JLabel jLabelRelacionesSelectReporteClaseProducto;
	//public JList<Reporte> jListRelacionesSelectReporteClaseProducto;
	//public JScrollPane jScrollRelacionesSelectReporteClaseProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClaseProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClaseProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClaseProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoClaseProducto;
	
		
	//public JLabel jLabelArchivoImportacionClaseProducto;	
	//public JLabel jLabelPathArchivoImportacionClaseProducto;
	//protected JTextField jTextFieldPathArchivoImportacionClaseProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClaseProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClaseProducto;
	
	//public JLabel jLabelColumnaCategoriaValorClaseProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClaseProducto;
	
	//public JLabel jLabelColumnasValoresGraficoClaseProducto;
	//public JList<Reporte> jListColumnasValoresGraficoClaseProducto;
	//public JScrollPane jScrollColumnasValoresGraficoClaseProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClaseProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClaseProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClaseProducto;
	public JPanel jPanelBusquedaPorCodigoClaseProducto;
	public JButton jButtonBusquedaPorCodigoClaseProducto;
	public JPanel jPanelBusquedaPorNombreClaseProducto;
	public JButton jButtonBusquedaPorNombreClaseProducto;
	public JPanel jPanelFK_IdTipoProductoClaseProducto;
	public JButton jButtonFK_IdTipoProductoClaseProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoClaseProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoClaseProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoClaseProducto;
	public JButton jButtoncodigoBusquedaPorCodigoClaseProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreClaseProducto;
	public JLabel jLabelnombreBusquedaPorNombreClaseProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreClaseProducto;
	public JButton jButtonnombreBusquedaPorNombreClaseProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoClaseProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoClaseProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoClaseProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoClaseProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoClaseProductoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClaseProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClaseProducto)	{
		this.jButtonRecargarInformacionClaseProducto = jButtonRecargarInformacionClaseProducto;
	}
	
	public JButton getjButtonProcesarInformacionClaseProducto() {
		return this.jButtonProcesarInformacionClaseProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClaseProducto)	{
		this.jButtonProcesarInformacionClaseProducto = jButtonProcesarInformacionClaseProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionClaseProducto() {
		return this.jButtonRecargarInformacionClaseProducto;
	}
	
	
	public List<ClaseProducto> getclaseproductos() {
		return this.claseproductos;
	}

	public void setclaseproductos(List<ClaseProducto> claseproductos) {
		this.claseproductos = claseproductos;
	}
	
	public List<ClaseProducto> getclaseproductosAux() {
		return this.claseproductosAux;
	}

	public void setclaseproductosAux(List<ClaseProducto> claseproductosAux) {
		this.claseproductosAux = claseproductosAux;
	}
	
	public List<ClaseProducto> getclaseproductosEliminados() {
		return this.claseproductosEliminados;
	}

	public void setClaseProductosEliminados(List<ClaseProducto> claseproductosEliminados) {
		this.claseproductosEliminados = claseproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClaseProducto() {
		return jComboBoxTiposSeleccionarClaseProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClaseProducto(
			JComboBox jComboBoxTiposSeleccionarClaseProducto) {
		this.jComboBoxTiposSeleccionarClaseProducto = jComboBoxTiposSeleccionarClaseProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClaseProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClaseProducto() {
		return jTextFieldValorCampoGeneralClaseProducto;
	}

	public void setjTextFieldValorCampoGeneralClaseProducto(
			JTextField jTextFieldValorCampoGeneralClaseProducto) {
		this.jTextFieldValorCampoGeneralClaseProducto = jTextFieldValorCampoGeneralClaseProducto;
	}

	public void setBorderResaltarValorCampoGeneralClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClaseProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClaseProducto() {
		return this.jCheckBoxSeleccionarTodosClaseProducto;
	}

	public void setjCheckBoxSeleccionarTodosClaseProducto(
			JCheckBox jCheckBoxSeleccionarTodosClaseProducto) {
		this.jCheckBoxSeleccionarTodosClaseProducto = jCheckBoxSeleccionarTodosClaseProducto;
	}

	public void setBorderResaltarSeleccionarTodosClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClaseProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClaseProducto() {
		return this.jCheckBoxSeleccionadosClaseProducto;
	}

	public void setjCheckBoxSeleccionadosClaseProducto(
			JCheckBox jCheckBoxSeleccionadosClaseProducto) {
		this.jCheckBoxSeleccionadosClaseProducto = jCheckBoxSeleccionadosClaseProducto;
	}
	
	public void setBorderResaltarSeleccionadosClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClaseProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClaseProducto() {
		return this.jComboBoxTiposArchivosReportesClaseProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClaseProducto(
			JComboBox jComboBoxTiposArchivosReportesClaseProducto) {
		this.jComboBoxTiposArchivosReportesClaseProducto = jComboBoxTiposArchivosReportesClaseProducto;
	}

	public void setBorderResaltarTiposArchivosReportesClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClaseProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClaseProducto() {
		return this.jComboBoxTiposReportesClaseProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClaseProducto(
			JComboBox jComboBoxTiposReportesClaseProducto) {
		this.jComboBoxTiposReportesClaseProducto = jComboBoxTiposReportesClaseProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClaseProducto() {
	//	return jComboBoxTiposReportesDinamicoClaseProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClaseProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoClaseProducto) {
	//	this.jComboBoxTiposReportesDinamicoClaseProducto = jComboBoxTiposReportesDinamicoClaseProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClaseProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoClaseProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClaseProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClaseProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClaseProducto = jComboBoxTiposArchivosReportesDinamicoClaseProducto;
	//}
	
	public void setBorderResaltarTiposReportesClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClaseProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClaseProducto() {
		return this.jComboBoxTiposGraficosReportesClaseProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClaseProducto(
			JComboBox jComboBoxTiposGraficosReportesClaseProducto) {
		this.jComboBoxTiposGraficosReportesClaseProducto = jComboBoxTiposGraficosReportesClaseProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClaseProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClaseProducto() {
		return this.jComboBoxTiposPaginacionClaseProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClaseProducto(
			JComboBox jComboBoxTiposPaginacionClaseProducto) {
		this.jComboBoxTiposPaginacionClaseProducto = jComboBoxTiposPaginacionClaseProducto;
	}
	
	public void setBorderResaltarTiposPaginacionClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClaseProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClaseProducto() {
		return this.jComboBoxTiposRelacionesClaseProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClaseProducto() {
		return this.jComboBoxTiposAccionesClaseProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClaseProducto(
			JComboBox jComboBoxTiposRelacionesClaseProducto) {
		this.jComboBoxTiposRelacionesClaseProducto = jComboBoxTiposRelacionesClaseProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClaseProducto(
			JComboBox jComboBoxTiposAccionesClaseProducto) {
		this.jComboBoxTiposAccionesClaseProducto = jComboBoxTiposAccionesClaseProducto;
	}
	
	public void setBorderResaltarTiposRelacionesClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClaseProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClaseProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClaseProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClaseProducto() {
	//	return jCheckBoxConGraficoDinamicoClaseProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoClaseProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoClaseProducto) {
	//	this.jCheckBoxConGraficoDinamicoClaseProducto = jCheckBoxConGraficoDinamicoClaseProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClaseProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClaseProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClaseProducto .setBorder(borderResaltar);		
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
		this.claseproductoSessionBean=new ClaseProductoSessionBean();
		
		this.claseproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.claseproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClaseProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Clase Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClaseProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"nuevo","nuevo","Nuevo"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"duplicar","duplicar","Duplicar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"copiar","copiar","Copiar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"ver_form","ver_form","Ver"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"recargar","recargar","Recargar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClaseProducto,this.jTtoolBarClaseProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClaseProducto,this.jTtoolBarClaseProducto,
							"cerrar","cerrar","Salir"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClaseProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClaseProducto;
			
				this.jButtonProcesarInformacionToolBarClaseProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClaseProducto;
				
		//protected JButton jButtonModificarToolBarClaseProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClaseProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClaseProducto=new JMenuMe("General");
		this.jmenuArchivoClaseProducto=new JMenuMe("Archivo");
		this.jmenuAccionesClaseProducto=new JMenuMe("Acciones");
		this.jmenuDatosClaseProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClaseProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClaseProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClaseProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClaseProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClaseProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClaseProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClaseProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClaseProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClaseProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClaseProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClaseProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClaseProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClaseProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClaseProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClaseProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClaseProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClaseProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClaseProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClaseProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClaseProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClaseProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClaseProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClaseProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClaseProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClaseProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClaseProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClaseProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClaseProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClaseProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClaseProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClaseProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClaseProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClaseProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClaseProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClaseProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClaseProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClaseProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClaseProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClaseProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClaseProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClaseProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClaseProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClaseProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClaseProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClaseProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClaseProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClaseProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClaseProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClaseProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClaseProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClaseProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClaseProducto.add(this.jMenuItemCerrarClaseProducto);
			
			this.jmenuAccionesClaseProducto.add(this.jMenuItemNuevoClaseProducto);
			this.jmenuAccionesClaseProducto.add(this.jMenuItemNuevoGuardarCambiosClaseProducto);
			this.jmenuAccionesClaseProducto.add(this.jMenuItemNuevoRelacionesClaseProducto);
			this.jmenuAccionesClaseProducto.add(this.jMenuItemGuardarCambiosTablaClaseProducto);		
			this.jmenuAccionesClaseProducto.add(this.jMenuItemDuplicarClaseProducto);		
			this.jmenuAccionesClaseProducto.add(this.jMenuItemCopiarClaseProducto);		
			this.jmenuAccionesClaseProducto.add(this.jMenuItemVerFormClaseProducto);		
			
			this.jmenuDatosClaseProducto.add(this.jMenuItemRecargarInformacionClaseProducto);				
			this.jmenuDatosClaseProducto.add(this.jMenuItemAnterioresClaseProducto);				
			this.jmenuDatosClaseProducto.add(this.jMenuItemSiguientesClaseProducto);				
			this.jmenuDatosClaseProducto.add(this.jMenuItemAbrirOrderByClaseProducto);				
			this.jmenuDatosClaseProducto.add(this.jMenuItemMostrarOcultarClaseProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClaseProducto.add(this.jMenuItemGuardarCambiosClaseProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClaseProducto.add(this.jmenuArchivoClaseProducto);		
			this.jmenuBarClaseProducto.add(this.jmenuAccionesClaseProducto);		
			this.jmenuBarClaseProducto.add(this.jmenuDatosClaseProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClaseProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClaseProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoClaseProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoClaseProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoClaseProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoClaseProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoClaseProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoClaseProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoClaseProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoClaseProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoClaseProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreClaseProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreClaseProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreClaseProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreClaseProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreClaseProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreClaseProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreClaseProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreClaseProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreClaseProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoClaseProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoClaseProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoClaseProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoClaseProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoClaseProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasClaseProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasClaseProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasClaseProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasClaseProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClaseProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClaseProducto = new ClaseProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Clase Producto DATOS");
			this.jInternalFrameDetalleFormClaseProducto = new ClaseProductoDetalleFormJInternalFrame(jDesktopPane,this.claseproductoSessionBean.getConGuardarRelaciones(),this.claseproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClaseProducto = null;//new ClaseProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClaseProducto= new GridBagLayout();
		
		
		this.jTableDatosClaseProducto = new JTableMe();      
		
		String sToolTipClaseProducto="";
		sToolTipClaseProducto=ClaseProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClaseProducto+="(Inventario.ClaseProducto)";
		}
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipClaseProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClaseProducto.setToolTipText(sToolTipClaseProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClaseProducto);
		this.jTableDatosClaseProducto.setAutoCreateRowSorter(true);
		this.jTableDatosClaseProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClaseProducto.setRowSelectionAllowed(true);
		this.jTableDatosClaseProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClaseProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClaseProducto = new JButtonMe();
		this.jButtonDuplicarClaseProducto = new JButtonMe();
		this.jButtonCopiarClaseProducto = new JButtonMe();
		this.jButtonVerFormClaseProducto = new JButtonMe();
		this.jButtonNuevoRelacionesClaseProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClaseProducto = new JButtonMe();
		this.jButtonCerrarClaseProducto = new JButtonMe();
		
		this.jScrollPanelDatosClaseProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralClaseProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Clase Producto";
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosClaseProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClaseProducto.setToolTipText("Acciones");
        this.jPanelAccionesClaseProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClaseProducto=new ReporteDinamicoJInternalFrame(ClaseProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClaseProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClaseProducto=new ImportacionJInternalFrame(ClaseProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClaseProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClaseProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByClaseProducto.setText("Orden");
		this.jButtonAbrirOrderByClaseProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClaseProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClaseProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseProducto,false,this);
			
			//this.cargarOrderByClaseProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClaseProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseProducto,true,this);
			
			//this.cargarOrderByClaseProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClaseProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosClaseProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosClaseProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosClaseProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClaseProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClaseProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClaseProducto.setText("Nuevo");
		this.jButtonDuplicarClaseProducto.setText("Duplicar");
		this.jButtonCopiarClaseProducto.setText("Copiar");
		this.jButtonVerFormClaseProducto.setText("Ver");
		this.jButtonNuevoRelacionesClaseProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClaseProducto.setText("Guardar");
		this.jButtonCerrarClaseProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClaseProducto,"nuevo_button","Nuevo",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClaseProducto,"duplicar_button","Duplicar",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClaseProducto,"copiar_button","Copiar",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClaseProducto,"ver_form","Ver",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClaseProducto,"nuevorelaciones_button","Nuevo Rel",this.claseproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClaseProducto,"guardarcambiostabla_button","Guardar",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClaseProducto,"cerrar_button","Salir",this.claseproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClaseProducto.setToolTipText("Nuevo"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClaseProducto.setToolTipText("Duplicar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClaseProducto.setToolTipText("Copiar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClaseProducto.setToolTipText("Ver"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClaseProducto.setToolTipText("Nuevo Rel"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClaseProducto.setToolTipText("Guardar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClaseProducto.setToolTipText("Salir"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClaseProducto";
		inputMap = this.jButtonNuevoClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClaseProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClaseProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarClaseProducto";
		inputMap = this.jButtonDuplicarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClaseProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClaseProducto"));
		
		//COPIAR
		sMapKey = "CopiarClaseProducto";
		inputMap = this.jButtonCopiarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClaseProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClaseProducto"));
		
		//VEr FORM
		sMapKey = "VerFormClaseProducto";
		inputMap = this.jButtonVerFormClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClaseProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClaseProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClaseProducto";
		inputMap = this.jButtonNuevoRelacionesClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClaseProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClaseProducto";
		inputMap = this.jButtonModificarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClaseProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClaseProducto";
		inputMap = this.jButtonCerrarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClaseProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClaseProducto";
		inputMap = this.jButtonGuardarCambiosTablaClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClaseProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClaseProducto.setName("jPanelParametrosReportesClaseProducto"); 
		
		this.jPanelParametrosReportesAccionesClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClaseProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClaseProducto.setName("jPanelParametrosReportesAccionesClaseProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClaseProducto = new JButtonMe();
		this.jButtonRecargarInformacionClaseProducto.setText("Recargar");
		this.jButtonRecargarInformacionClaseProducto.setToolTipText("Recargar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClaseProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClaseProducto = new JButtonMe();
		this.jButtonProcesarInformacionClaseProducto.setText("Procesar");
		this.jButtonProcesarInformacionClaseProducto.setToolTipText("Procesar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClaseProducto.setVisible(false);
			
		this.jButtonProcesarInformacionClaseProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClaseProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClaseProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClaseProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseProducto.setText("TIPO");       
		this.jComboBoxTiposReportesClaseProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClaseProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClaseProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionClaseProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClaseProducto.setText("Accion");
		this.jComboBoxTiposRelacionesClaseProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClaseProducto.setText("Accion");
		this.jComboBoxTiposAccionesClaseProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClaseProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarClaseProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClaseProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClaseProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClaseProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClaseProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClaseProducto = new JLabelMe();
		
		this.jLabelAccionesClaseProducto.setText("Acciones");		
		this.jLabelAccionesClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClaseProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClaseProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClaseProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClaseProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClaseProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClaseProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClaseProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClaseProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClaseProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClaseProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClaseProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteClaseProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClaseProducto = new JButtonMe();
		//this.jButtonAnterioresClaseProducto.setText("<<");
        this.jButtonAnterioresClaseProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClaseProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClaseProducto = new JButtonMe();
		//this.jButtonSiguientesClaseProducto.setText(">>");
        this.jButtonSiguientesClaseProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClaseProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClaseProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClaseProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosClaseProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClaseProducto,"nuevoguardarcambios_button","Nue",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClaseProducto";
		inputMap = this.jButtonNuevoGuardarCambiosClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClaseProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClaseProducto";
		inputMap = this.jButtonRecargarInformacionClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClaseProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClaseProducto";
		inputMap = this.jButtonSiguientesClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClaseProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClaseProducto";
		inputMap = this.jButtonAnterioresClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClaseProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClaseProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClaseProducto.setMinimumSize(new Dimension(this.getWidth(),ClaseProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClaseProducto.setMaximumSize(new Dimension(this.getWidth(),ClaseProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClaseProducto.setPreferredSize(new Dimension(this.getWidth(),ClaseProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClaseProducto = new GridBagLayout();

			this.jPanelPaginacionClaseProducto.setLayout(gridaBagLayoutPaginacionClaseProducto);						
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 0;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClaseProducto.add(this.jButtonAnterioresClaseProducto, this.gridBagConstraintsClaseProducto);
					
						
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClaseProducto.gridy = 0;
			
			this.jPanelPaginacionClaseProducto.add(this.jButtonNuevoGuardarCambiosClaseProducto, this.gridBagConstraintsClaseProducto);
						
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClaseProducto.gridy = 0;
			this.jPanelPaginacionClaseProducto.add(this.jButtonSiguientesClaseProducto, this.gridBagConstraintsClaseProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 1;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseProducto.add(this.jButtonNuevoClaseProducto, this.gridBagConstraintsClaseProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClaseProducto.gridy = 1;
				this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionClaseProducto.add(this.jButtonNuevoRelacionesClaseProducto, this.gridBagConstraintsClaseProducto);
			}
			
			
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClaseProducto.gridy = 1;
				this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClaseProducto.add(this.jButtonGuardarCambiosTablaClaseProducto, this.gridBagConstraintsClaseProducto);
			}
			
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 1;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseProducto.add(this.jButtonDuplicarClaseProducto, this.gridBagConstraintsClaseProducto);
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 1;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseProducto.add(this.jButtonCopiarClaseProducto, this.gridBagConstraintsClaseProducto);
		
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 1;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseProducto.add(this.jButtonVerFormClaseProducto, this.gridBagConstraintsClaseProducto);
		
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 1;
			this.gridBagConstraintsClaseProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClaseProducto.add(this.jButtonCerrarClaseProducto, this.gridBagConstraintsClaseProducto);
		
		
		
		this.jButtonRecargarInformacionClaseProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClaseProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClaseProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClaseProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClaseProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClaseProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClaseProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClaseProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClaseProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClaseProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClaseProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClaseProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClaseProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClaseProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClaseProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClaseProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClaseProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClaseProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClaseProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClaseProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClaseProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClaseProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClaseProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClaseProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClaseProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClaseProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClaseProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClaseProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClaseProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClaseProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClaseProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClaseProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClaseProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClaseProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClaseProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClaseProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClaseProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClaseProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClaseProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClaseProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClaseProducto.setLayout(gridaBagParametrosReportesClaseProducto);
			this.jPanelParametrosReportesAccionesClaseProducto.setLayout(gridaBagParametrosReportesAccionesClaseProducto);
			
			
			this.jPanelParametrosAuxiliar1ClaseProducto.setLayout(gridaBagParametrosAuxiliar1ClaseProducto);
			this.jPanelParametrosAuxiliar2ClaseProducto.setLayout(gridaBagParametrosAuxiliar2ClaseProducto);
			this.jPanelParametrosAuxiliar3ClaseProducto.setLayout(gridaBagParametrosAuxiliar3ClaseProducto);
			this.jPanelParametrosAuxiliar4ClaseProducto.setLayout(gridaBagParametrosAuxiliar4ClaseProducto);
			//this.jPanelParametrosAuxiliar5ClaseProducto.setLayout(gridaBagParametrosAuxiliar2ClaseProducto);			
			
			
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseProducto.add(this.jButtonRecargarInformacionClaseProducto, this.gridBagConstraintsClaseProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseProducto.add(this.jComboBoxTiposPaginacionClaseProducto, this.gridBagConstraintsClaseProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseProducto.add(this.jCheckBoxConAltoMaximoTablaClaseProducto, this.gridBagConstraintsClaseProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseProducto.add(this.jComboBoxTiposArchivosReportesClaseProducto, this.gridBagConstraintsClaseProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseProducto.add(this.jPanelParametrosAuxiliar1ClaseProducto, this.gridBagConstraintsClaseProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClaseProducto.add(this.jComboBoxTiposReportesClaseProducto, this.gridBagConstraintsClaseProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseProducto.add(this.jPanelParametrosAuxiliar4ClaseProducto, this.gridBagConstraintsClaseProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseProducto.add(this.jComboBoxTiposReportesClaseProducto, this.gridBagConstraintsClaseProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseProducto.add(this.jCheckBoxGenerarReporteClaseProducto, this.gridBagConstraintsClaseProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseProducto.add(this.jPanelParametrosAuxiliar2ClaseProducto, this.gridBagConstraintsClaseProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseProducto.add(this.jLabelAccionesClaseProducto, this.gridBagConstraintsClaseProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClaseProducto.add(this.jButtonAbrirOrderByClaseProducto, this.gridBagConstraintsClaseProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseProducto.add(this.jComboBoxTiposSeleccionarClaseProducto, this.gridBagConstraintsClaseProducto);			
			
			
			/*
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseProducto.add(this.jCheckBoxSeleccionarTodosClaseProducto, this.gridBagConstraintsClaseProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClaseProducto.add(this.jCheckBoxSeleccionarTodosClaseProducto, this.gridBagConstraintsClaseProducto);															
				
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClaseProducto.add(this.jCheckBoxSeleccionadosClaseProducto, this.gridBagConstraintsClaseProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseProducto.add(this.jPanelParametrosAuxiliar3ClaseProducto, this.gridBagConstraintsClaseProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseProducto.add(this.jComboBoxTiposRelacionesClaseProducto, this.gridBagConstraintsClaseProducto);
				
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseProducto.add(this.jComboBoxTiposAccionesClaseProducto, this.gridBagConstraintsClaseProducto);
	
				
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseProducto.add(this.jTextFieldValorCampoGeneralClaseProducto, this.gridBagConstraintsClaseProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClaseProducto = new GridBagLayout();

			this.jScrollPanelDatosClaseProducto.setLayout(gridaBagLayoutDatosClaseProducto);
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = 0;
			this.gridBagConstraintsClaseProducto.gridx = 0;
			
			this.jScrollPanelDatosClaseProducto.add(this.jTableDatosClaseProducto, this.gridBagConstraintsClaseProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClaseProducto.setViewportView(this.jTableDatosClaseProducto);
		this.jTableDatosClaseProducto.setFillsViewportHeight(true);
		this.jTableDatosClaseProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClaseProducto= new GridBagLayout();
		this.jPanelAccionesClaseProducto.setLayout(gridaBagLayoutAccionesClaseProducto);
		
		
		/*	
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 0;
			
		this.jPanelAccionesClaseProducto.add(this.jButtonNuevoClaseProducto, this.gridBagConstraintsClaseProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoClaseProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoClaseProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoClaseProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoClaseProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoClaseProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoClaseProducto.setLayout(gridaBagLayoutBusquedaPorCodigoClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 0;
		jPanelBusquedaPorCodigoClaseProducto.add(jLabelcodigoBusquedaPorCodigoClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 1;
		jPanelBusquedaPorCodigoClaseProducto.add(jTextFieldcodigoBusquedaPorCodigoClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 1;
		gridBagConstraintsClaseProducto.gridx =1;
		jPanelBusquedaPorCodigoClaseProducto.add(jButtonBusquedaPorCodigoClaseProducto, gridBagConstraintsClaseProducto);

		jTabbedPaneBusquedasClaseProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoClaseProducto);
		jTabbedPaneBusquedasClaseProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreClaseProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreClaseProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreClaseProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreClaseProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreClaseProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreClaseProducto.setLayout(gridaBagLayoutBusquedaPorNombreClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 0;
		jPanelBusquedaPorNombreClaseProducto.add(jLabelnombreBusquedaPorNombreClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 1;
		jPanelBusquedaPorNombreClaseProducto.add(jTextAreanombreBusquedaPorNombreClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 1;
		gridBagConstraintsClaseProducto.gridx =1;
		jPanelBusquedaPorNombreClaseProducto.add(jButtonBusquedaPorNombreClaseProducto, gridBagConstraintsClaseProducto);

		jTabbedPaneBusquedasClaseProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreClaseProducto);
		jTabbedPaneBusquedasClaseProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoClaseProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoClaseProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoClaseProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoClaseProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoClaseProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoClaseProducto.setLayout(gridaBagLayoutFK_IdTipoProductoClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 0;
		jPanelFK_IdTipoProductoClaseProducto.add(jLabelid_tipo_productoFK_IdTipoProductoClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 0;
		gridBagConstraintsClaseProducto.gridx = 1;
		jPanelFK_IdTipoProductoClaseProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto, gridBagConstraintsClaseProducto);

		gridBagConstraintsClaseProducto = new GridBagConstraints();
		gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseProducto.gridy = 1;
		gridBagConstraintsClaseProducto.gridx =1;
		jPanelFK_IdTipoProductoClaseProducto.add(jButtonFK_IdTipoProductoClaseProducto, gridBagConstraintsClaseProducto);

		jTabbedPaneBusquedasClaseProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoClaseProducto);
		jTabbedPaneBusquedasClaseProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClaseProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClaseProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();						
			this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseProducto.gridx = 0;		
			//this.gridBagConstraintsClaseProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClaseProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClaseProducto, this.gridBagConstraintsClaseProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClaseProducto.gridx = 0;		
		//this.gridBagConstraintsClaseProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClaseProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClaseProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseProducto.gridx = 0;		
			this.gridBagConstraintsClaseProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClaseProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClaseProducto, this.gridBagConstraintsClaseProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClaseProducto, this.gridBagConstraintsClaseProducto);								
		
		
		/*
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClaseProducto, this.gridBagConstraintsClaseProducto);
		*/		
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClaseProducto.gridx =0;
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClaseProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClaseProducto, this.gridBagConstraintsClaseProducto);
				
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClaseProducto, this.gridBagConstraintsClaseProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClaseProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClaseProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosClaseProducto.setLayout(gridaBagLayoutBusquedasParametrosClaseProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClaseProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClaseProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClaseProducto, this.gridBagConstraintsClaseProducto);
			
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClaseProducto, this.gridBagConstraintsClaseProducto);
		
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClaseProducto, this.gridBagConstraintsClaseProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClaseProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClaseProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClaseProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClaseProducto.setName("jPanelReporteDinamicoClaseProducto"); 
		
		this.jPanelReporteDinamicoClaseProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClaseProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClaseProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClaseProducto.setLayout(gridaBagLayoutReporteDinamicoClaseProducto);
		
		
		this.jInternalFrameReporteDinamicoClaseProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClaseProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClaseProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClaseProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClaseProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClaseProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClaseProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClaseProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClaseProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoClaseProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoClaseProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClaseProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClaseProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClaseProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClaseProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteClaseProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClaseProducto.add(this.jLabelColumnasSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClaseProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteClaseProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClaseProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClaseProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClaseProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClaseProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClaseProducto=new JScrollPane(this.jListColumnasSelectReporteClaseProducto);
			
			this.jScrollColumnasSelectReporteClaseProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClaseProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClaseProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClaseProducto.add(this.jListColumnasSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		this.jPanelReporteDinamicoClaseProducto.add(this.jScrollColumnasSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClaseProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteClaseProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClaseProducto.add(this.jLabelRelacionesSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClaseProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteClaseProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClaseProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClaseProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClaseProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClaseProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClaseProducto=new JScrollPane(this.jListRelacionesSelectReporteClaseProducto);
			
			this.jScrollRelacionesSelectReporteClaseProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClaseProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClaseProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClaseProducto.add(this.jListRelacionesSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		this.jPanelReporteDinamicoClaseProducto.add(this.jScrollRelacionesSelectReporteClaseProducto, this.gridBagConstraintsClaseProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoClaseProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClaseProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoClaseProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClaseProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClaseProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClaseProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClaseProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClaseProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClaseProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClaseProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClaseProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClaseProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClaseProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClaseProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClaseProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClaseProducto.add(this.jLabelGenerarExcelReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClaseProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClaseProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClaseProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClaseProducto.setToolTipText("Generar EXCEL"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClaseProducto.add(this.jButtonGenerarExcelReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseProducto.add(this.jComboBoxTiposReportesDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClaseProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClaseProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClaseProducto.add(this.jLabelTiposArchivoReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseProducto.add(this.jComboBoxTiposArchivosReportesDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClaseProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClaseProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClaseProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClaseProducto.setToolTipText("Generar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseProducto.add(this.jButtonGenerarReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClaseProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClaseProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClaseProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClaseProducto.setToolTipText("Cancelar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseProducto.add(this.jButtonCerrarReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClaseProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClaseProducto= new JScrollPane(jPanelReporteDinamicoClaseProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClaseProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClaseProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClaseProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClaseProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClaseProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClaseProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClaseProducto);
		this.jInternalFrameReporteDinamicoClaseProducto.getContentPane().add(this.jScrollPanelReporteDinamicoClaseProducto, this.gridBagConstraintsClaseProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClaseProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClaseProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClaseProducto.setName("jPanelImportacionClaseProducto"); 
		
		this.jPanelImportacionClaseProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClaseProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClaseProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClaseProducto.setLayout(gridaBagLayoutImportacionClaseProducto);
		
		
		this.jInternalFrameImportacionClaseProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClaseProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClaseProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClaseProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClaseProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClaseProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClaseProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClaseProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClaseProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClaseProducto.setResizable(true);
	    this.jInternalFrameImportacionClaseProducto.setClosable(true);
	    this.jInternalFrameImportacionClaseProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClaseProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClaseProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClaseProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClaseProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClaseProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClaseProducto.setResizable(true);
	    this.jInternalFrameImportacionClaseProducto.setClosable(true);
	    this.jInternalFrameImportacionClaseProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClaseProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClaseProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClaseProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClaseProducto = new JLabelMe();

		this.jLabelArchivoImportacionClaseProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClaseProducto.add(this.jLabelArchivoImportacionClaseProducto, this.gridBagConstraintsClaseProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClaseProducto = new JFileChooser();		
		this.jFileChooserImportacionClaseProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClaseProducto = new JButtonMe();
		this.jButtonAbrirImportacionClaseProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClaseProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClaseProducto.setToolTipText("Generar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseProducto.add(this.jButtonAbrirImportacionClaseProducto, this.gridBagConstraintsClaseProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClaseProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionClaseProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClaseProducto.add(this.jLabelPathArchivoImportacionClaseProducto, this.gridBagConstraintsClaseProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClaseProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClaseProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClaseProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClaseProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseProducto.add(this.jTextFieldPathArchivoImportacionClaseProducto, this.gridBagConstraintsClaseProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClaseProducto = new JButtonMe();
		this.jButtonGenerarImportacionClaseProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClaseProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClaseProducto.setToolTipText("Generar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseProducto.add(this.jButtonGenerarImportacionClaseProducto, this.gridBagConstraintsClaseProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClaseProducto = new JButtonMe();
		this.jButtonCerrarImportacionClaseProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClaseProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClaseProducto.setToolTipText("Cancelar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseProducto.add(this.jButtonCerrarImportacionClaseProducto, this.gridBagConstraintsClaseProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClaseProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionClaseProducto= new JScrollPane(jPanelImportacionClaseProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsClaseProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClaseProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClaseProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClaseProducto);
		this.jInternalFrameImportacionClaseProducto.getContentPane().add(this.jScrollPanelImportacionClaseProducto, this.gridBagConstraintsClaseProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClaseProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClaseProducto = new JButtonMe();
			this.jButtonAbrirOrderByClaseProducto.setText("Orden");
			this.jButtonAbrirOrderByClaseProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClaseProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClaseProducto";
			inputMap = this.jButtonAbrirOrderByClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClaseProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByClaseProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClaseProducto.setName("jPanelOrderByClaseProducto"); 
			
			this.jPanelOrderByClaseProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClaseProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClaseProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClaseProducto.setLayout(gridaBagLayoutOrderByClaseProducto);
			
			
			this.jTableDatosClaseProductoOrderBy = new JTableMe();        
			this.jTableDatosClaseProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClaseProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClaseProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClaseProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClaseProductoOrderBy.setViewportView(this.jTableDatosClaseProductoOrderBy);
			this.jTableDatosClaseProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClaseProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClaseProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClaseProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClaseProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClaseProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClaseProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClaseProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClaseProducto.setTitle("Orden");
			this.jInternalFrameOrderByClaseProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClaseProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClaseProducto.setResizable(true);
			this.jInternalFrameOrderByClaseProducto.setClosable(true);
			this.jInternalFrameOrderByClaseProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClaseProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClaseProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClaseProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClaseProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClaseProducto.ipady =150;
				
			this.jPanelOrderByClaseProducto.add(jScrollPanelDatosClaseProductoOrderBy, this.gridBagConstraintsClaseProducto);//this.jTableDatosClaseProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClaseProducto = new JButtonMe();
			this.jButtonCerrarOrderByClaseProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClaseProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClaseProducto.setToolTipText("Cancelar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClaseProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClaseProducto.add(this.jButtonCerrarOrderByClaseProducto, this.gridBagConstraintsClaseProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClaseProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByClaseProducto= new JScrollPane(jPanelOrderByClaseProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsClaseProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClaseProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClaseProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClaseProducto);
			
			this.jInternalFrameOrderByClaseProducto.getContentPane().add(this.jScrollPanelOrderByClaseProducto, this.gridBagConstraintsClaseProducto);			
		
		} else {
			this.jButtonAbrirOrderByClaseProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.claseproductoSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosClaseProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClaseProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClaseProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClaseProducto.getRowHeight();//ClaseProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClaseProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClaseProducto.isSelected()) {
					iHeightTable=ClaseProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClaseProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClaseProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClaseProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClaseProducto.isSelected()) {
					iHeightTable=ClaseProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClaseProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClaseProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClaseProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClaseProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClaseProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClaseProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClaseProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClaseProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClaseProducto!=null && this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClaseProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClaseProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClaseProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClaseProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClaseProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClaseProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=claseproductoLogic.getClaseProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClaseProducto> TraerClaseProductoBeans(List<ClaseProducto> claseproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClaseProducto claseproducto:claseproductos) {
					
				if(!(ClaseProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClaseProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					claseproducto.setsDetalleGeneralEntityReporte(ClaseProductoConstantesFunciones.getClaseProductoDescripcion(claseproducto));
										
						
					
					

					if(claseproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{claseproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(claseproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(claseproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{claseproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(claseproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//claseproducto.setsDetalleGeneralEntityReporte(claseproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//claseproductobeans.add(claseproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return claseproductos;
    }
	//PARA REPORTES FIN
}
