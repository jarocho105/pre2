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
import com.bydan.erp.inventario.util.ColorProductoConstantesFunciones;

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
public class ColorProductoJInternalFrame extends ColorProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarColorProducto;
	
	protected JMenuBar jmenuBarColorProducto;
	
	protected JMenu jmenuColorProducto;
	protected JMenu jmenuDatosColorProducto;
	protected JMenu jmenuArchivoColorProducto;
	protected JMenu jmenuAccionesColorProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutColorProducto;	
	protected GridBagConstraints gridBagConstraintsColorProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ColorProductoDetalleFormJInternalFrame jInternalFrameDetalleFormColorProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoColorProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionColorProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";

	protected GrupoColorBeanSwingJInternalFrame grupocolorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocolor="";
	
	public ColorProductoSessionBean colorproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	public GrupoColorSessionBean grupocolorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ColorProducto> colorproductos;		
	public List<ColorProducto> colorproductosEliminados;	
	public List<ColorProducto> colorproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByColorProducto;		
	protected JButton jButtonAbrirOrderByColorProducto;
	
	
	//protected JPanel jPanelOrderByColorProducto;
	//public JScrollPane jScrollPanelOrderByColorProducto;	
	//protected JButton jButtonCerrarOrderByColorProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ColorProductoLogic colorproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosColorProducto;
	public JScrollPane jScrollPanelDatosEdicionColorProducto;
	public JScrollPane jScrollPanelDatosGeneralColorProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosColorProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoColorProducto;
	//public JScrollPane jScrollPanelImportacionColorProducto;
	
	
	
	protected JPanel jPanelAccionesColorProducto;
	
    protected JPanel jPanelPaginacionColorProducto;
    protected JPanel jPanelParametrosReportesColorProducto;
	protected JPanel jPanelParametrosReportesAccionesColorProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ColorProducto;
	protected JPanel jPanelParametrosAuxiliar2ColorProducto;
	protected JPanel jPanelParametrosAuxiliar3ColorProducto;
	protected JPanel jPanelParametrosAuxiliar4ColorProducto;
	//protected JPanel jPanelParametrosAuxiliar5ColorProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoColorProducto;
	//protected JPanel jPanelImportacionColorProducto;
	
	
	public JTable jTableDatosColorProducto;
	
	
	
	//public JTable jTableDatosColorProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoColorProducto;
	protected JButton jButtonDuplicarColorProducto;
	protected JButton jButtonCopiarColorProducto;
	protected JButton jButtonVerFormColorProducto;
	protected JButton jButtonNuevoRelacionesColorProducto;
	protected JButton jButtonModificarColorProducto;
	
    protected JButton jButtonGuardarCambiosTablaColorProducto;
	protected JButton jButtonCerrarColorProducto;
	
	
	protected JButton jButtonRecargarInformacionColorProducto;
	protected JButton jButtonProcesarInformacionColorProducto;
	
	
	protected JButton jButtonAnterioresColorProducto;
	protected JButton jButtonSiguientesColorProducto;
	protected JButton jButtonNuevoGuardarCambiosColorProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoColorProducto;
	//protected JButton jButtonCerrarReporteDinamicoColorProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoColorProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionColorProducto;
	//protected JButton jButtonGenerarImportacionColorProducto;
	//protected JButton jButtonCerrarImportacionColorProducto;
	//protected JFileChooser jFileChooserImportacionColorProducto;
	//protected File fileImportacionColorProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarColorProducto;
	protected JButton jButtonDuplicarToolBarColorProducto;
	protected JButton jButtonNuevoRelacionesToolBarColorProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarColorProducto;
	protected JButton jButtonCopiarToolBarColorProducto;
	protected JButton jButtonVerFormToolBarColorProducto;
	public JButton jButtonGuardarCambiosTablaToolBarColorProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarColorProducto;
	protected JButton jButtonCerrarToolBarColorProducto;
	
	protected JButton jButtonRecargarInformacionToolBarColorProducto;
	protected JButton jButtonProcesarInformacionToolBarColorProducto;
	protected JButton jButtonAnterioresToolBarColorProducto;
	protected JButton jButtonSiguientesToolBarColorProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarColorProducto;
	protected JButton jButtonAbrirOrderByToolBarColorProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoColorProducto;
	protected JMenuItem jMenuItemDuplicarColorProducto;
	protected JMenuItem jMenuItemNuevoRelacionesColorProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosColorProducto;
	protected JMenuItem jMenuItemCopiarColorProducto;
	protected JMenuItem jMenuItemVerFormColorProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaColorProducto;
	protected JMenuItem jMenuItemCerrarColorProducto;
	protected JMenuItem jMenuItemDetalleCerrarColorProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByColorProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarColorProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionColorProducto;
	protected JMenuItem jMenuItemProcesarInformacionColorProducto;
	protected JMenuItem jMenuItemAnterioresColorProducto;
	protected JMenuItem jMenuItemSiguientesColorProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosColorProducto;
	protected JMenuItem jMenuItemAbrirOrderByColorProducto;
	protected JMenuItem jMenuItemMostrarOcultarColorProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesColorProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosColorProducto;
	protected JCheckBox jCheckBoxSeleccionadosColorProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaColorProducto;
	protected JCheckBox jCheckBoxConGraficoReporteColorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesColorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesColorProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoColorProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoColorProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesColorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionColorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesColorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesColorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarColorProducto;
	protected JTextField jTextFieldValorCampoGeneralColorProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteColorProducto;
	//public JList<Reporte> jListColumnasSelectReporteColorProducto;
	//public JScrollPane jScrollColumnasSelectReporteColorProducto;
	
	//public JLabel jLabelRelacionesSelectReporteColorProducto;
	//public JList<Reporte> jListRelacionesSelectReporteColorProducto;
	//public JScrollPane jScrollRelacionesSelectReporteColorProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoColorProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoColorProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoColorProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoColorProducto;
	
		
	//public JLabel jLabelArchivoImportacionColorProducto;	
	//public JLabel jLabelPathArchivoImportacionColorProducto;
	//protected JTextField jTextFieldPathArchivoImportacionColorProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoColorProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoColorProducto;
	
	//public JLabel jLabelColumnaCategoriaValorColorProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorColorProducto;
	
	//public JLabel jLabelColumnasValoresGraficoColorProducto;
	//public JList<Reporte> jListColumnasValoresGraficoColorProducto;
	//public JScrollPane jScrollColumnasValoresGraficoColorProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoColorProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoColorProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasColorProducto;
	public JPanel jPanelBusquedaPorCodigoColorProducto;
	public JButton jButtonBusquedaPorCodigoColorProducto;
	public JPanel jPanelBusquedaPorNombreColorProducto;
	public JButton jButtonBusquedaPorNombreColorProducto;
	public JPanel jPanelFK_IdGrupoColorColorProducto;
	public JButton jButtonFK_IdGrupoColorColorProducto;
	public JPanel jPanelFK_IdTipoProductoColorProducto;
	public JButton jButtonFK_IdTipoProductoColorProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoColorProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoColorProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoColorProducto;
	public JButton jButtoncodigoBusquedaPorCodigoColorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreColorProducto;
	public JLabel jLabelnombreBusquedaPorNombreColorProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreColorProducto;
	public JButton jButtonnombreBusquedaPorNombreColorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_colorFK_IdGrupoColorColorProducto;
	public JLabel jLabelid_grupo_colorFK_IdGrupoColorColorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto;
	public JButton jButtonid_grupo_colorFK_IdGrupoColorColorProducto= new JButtonMe();
	public JButton jButtonid_grupo_colorFK_IdGrupoColorColorProductoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_colorFK_IdGrupoColorColorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoColorProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoColorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoColorProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoColorProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoColorProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public ColorProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionColorProducto)	{
		this.jButtonRecargarInformacionColorProducto = jButtonRecargarInformacionColorProducto;
	}
	
	public JButton getjButtonProcesarInformacionColorProducto() {
		return this.jButtonProcesarInformacionColorProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionColorProducto)	{
		this.jButtonProcesarInformacionColorProducto = jButtonProcesarInformacionColorProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionColorProducto() {
		return this.jButtonRecargarInformacionColorProducto;
	}
	
	
	public List<ColorProducto> getcolorproductos() {
		return this.colorproductos;
	}

	public void setcolorproductos(List<ColorProducto> colorproductos) {
		this.colorproductos = colorproductos;
	}
	
	public List<ColorProducto> getcolorproductosAux() {
		return this.colorproductosAux;
	}

	public void setcolorproductosAux(List<ColorProducto> colorproductosAux) {
		this.colorproductosAux = colorproductosAux;
	}
	
	public List<ColorProducto> getcolorproductosEliminados() {
		return this.colorproductosEliminados;
	}

	public void setColorProductosEliminados(List<ColorProducto> colorproductosEliminados) {
		this.colorproductosEliminados = colorproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarColorProducto() {
		return jComboBoxTiposSeleccionarColorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarColorProducto(
			JComboBox jComboBoxTiposSeleccionarColorProducto) {
		this.jComboBoxTiposSeleccionarColorProducto = jComboBoxTiposSeleccionarColorProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarColorProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralColorProducto() {
		return jTextFieldValorCampoGeneralColorProducto;
	}

	public void setjTextFieldValorCampoGeneralColorProducto(
			JTextField jTextFieldValorCampoGeneralColorProducto) {
		this.jTextFieldValorCampoGeneralColorProducto = jTextFieldValorCampoGeneralColorProducto;
	}

	public void setBorderResaltarValorCampoGeneralColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralColorProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosColorProducto() {
		return this.jCheckBoxSeleccionarTodosColorProducto;
	}

	public void setjCheckBoxSeleccionarTodosColorProducto(
			JCheckBox jCheckBoxSeleccionarTodosColorProducto) {
		this.jCheckBoxSeleccionarTodosColorProducto = jCheckBoxSeleccionarTodosColorProducto;
	}

	public void setBorderResaltarSeleccionarTodosColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosColorProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosColorProducto() {
		return this.jCheckBoxSeleccionadosColorProducto;
	}

	public void setjCheckBoxSeleccionadosColorProducto(
			JCheckBox jCheckBoxSeleccionadosColorProducto) {
		this.jCheckBoxSeleccionadosColorProducto = jCheckBoxSeleccionadosColorProducto;
	}
	
	public void setBorderResaltarSeleccionadosColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosColorProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesColorProducto() {
		return this.jComboBoxTiposArchivosReportesColorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesColorProducto(
			JComboBox jComboBoxTiposArchivosReportesColorProducto) {
		this.jComboBoxTiposArchivosReportesColorProducto = jComboBoxTiposArchivosReportesColorProducto;
	}

	public void setBorderResaltarTiposArchivosReportesColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesColorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesColorProducto() {
		return this.jComboBoxTiposReportesColorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesColorProducto(
			JComboBox jComboBoxTiposReportesColorProducto) {
		this.jComboBoxTiposReportesColorProducto = jComboBoxTiposReportesColorProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoColorProducto() {
	//	return jComboBoxTiposReportesDinamicoColorProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoColorProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoColorProducto) {
	//	this.jComboBoxTiposReportesDinamicoColorProducto = jComboBoxTiposReportesDinamicoColorProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoColorProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoColorProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoColorProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoColorProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoColorProducto = jComboBoxTiposArchivosReportesDinamicoColorProducto;
	//}
	
	public void setBorderResaltarTiposReportesColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesColorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesColorProducto() {
		return this.jComboBoxTiposGraficosReportesColorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesColorProducto(
			JComboBox jComboBoxTiposGraficosReportesColorProducto) {
		this.jComboBoxTiposGraficosReportesColorProducto = jComboBoxTiposGraficosReportesColorProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesColorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionColorProducto() {
		return this.jComboBoxTiposPaginacionColorProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionColorProducto(
			JComboBox jComboBoxTiposPaginacionColorProducto) {
		this.jComboBoxTiposPaginacionColorProducto = jComboBoxTiposPaginacionColorProducto;
	}
	
	public void setBorderResaltarTiposPaginacionColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionColorProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesColorProducto() {
		return this.jComboBoxTiposRelacionesColorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesColorProducto() {
		return this.jComboBoxTiposAccionesColorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesColorProducto(
			JComboBox jComboBoxTiposRelacionesColorProducto) {
		this.jComboBoxTiposRelacionesColorProducto = jComboBoxTiposRelacionesColorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesColorProducto(
			JComboBox jComboBoxTiposAccionesColorProducto) {
		this.jComboBoxTiposAccionesColorProducto = jComboBoxTiposAccionesColorProducto;
	}
	
	public void setBorderResaltarTiposRelacionesColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesColorProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesColorProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesColorProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoColorProducto() {
	//	return jCheckBoxConGraficoDinamicoColorProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoColorProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoColorProducto) {
	//	this.jCheckBoxConGraficoDinamicoColorProducto = jCheckBoxConGraficoDinamicoColorProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoColorProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarColorProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoColorProducto .setBorder(borderResaltar);		
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
		this.colorproductoSessionBean=new ColorProductoSessionBean();
		
		this.colorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.colorproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ColorProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Color Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarColorProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarColorProducto,this.jTtoolBarColorProducto,
							"nuevo","nuevo","Nuevo"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarColorProducto,this.jTtoolBarColorProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarColorProducto,this.jTtoolBarColorProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarColorProducto,this.jTtoolBarColorProducto,
							"duplicar","duplicar","Duplicar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarColorProducto,this.jTtoolBarColorProducto,
							"copiar","copiar","Copiar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarColorProducto,this.jTtoolBarColorProducto,
							"ver_form","ver_form","Ver"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorProducto,this.jTtoolBarColorProducto,
							"recargar","recargar","Recargar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorProducto,this.jTtoolBarColorProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorProducto,this.jTtoolBarColorProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarColorProducto,this.jTtoolBarColorProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarColorProducto,this.jTtoolBarColorProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarColorProducto,this.jTtoolBarColorProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarColorProducto,this.jTtoolBarColorProducto,
							"cerrar","cerrar","Salir"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarColorProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarColorProducto;
			
				this.jButtonProcesarInformacionToolBarColorProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarColorProducto;
				
		//protected JButton jButtonModificarToolBarColorProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarColorProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuColorProducto=new JMenuMe("General");
		this.jmenuArchivoColorProducto=new JMenuMe("Archivo");
		this.jmenuAccionesColorProducto=new JMenuMe("Acciones");
		this.jmenuDatosColorProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoColorProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoColorProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoColorProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarColorProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarColorProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarColorProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesColorProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesColorProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesColorProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosColorProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosColorProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosColorProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarColorProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarColorProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarColorProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormColorProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormColorProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormColorProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaColorProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaColorProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaColorProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarColorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarColorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarColorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionColorProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionColorProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionColorProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionColorProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionColorProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionColorProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresColorProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresColorProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresColorProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesColorProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesColorProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesColorProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByColorProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByColorProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByColorProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarColorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarColorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarColorProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByColorProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByColorProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByColorProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarColorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarColorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarColorProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosColorProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosColorProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosColorProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoColorProducto.add(this.jMenuItemCerrarColorProducto);
			
			this.jmenuAccionesColorProducto.add(this.jMenuItemNuevoColorProducto);
			this.jmenuAccionesColorProducto.add(this.jMenuItemNuevoGuardarCambiosColorProducto);
			this.jmenuAccionesColorProducto.add(this.jMenuItemNuevoRelacionesColorProducto);
			this.jmenuAccionesColorProducto.add(this.jMenuItemGuardarCambiosTablaColorProducto);		
			this.jmenuAccionesColorProducto.add(this.jMenuItemDuplicarColorProducto);		
			this.jmenuAccionesColorProducto.add(this.jMenuItemCopiarColorProducto);		
			this.jmenuAccionesColorProducto.add(this.jMenuItemVerFormColorProducto);		
			
			this.jmenuDatosColorProducto.add(this.jMenuItemRecargarInformacionColorProducto);				
			this.jmenuDatosColorProducto.add(this.jMenuItemAnterioresColorProducto);				
			this.jmenuDatosColorProducto.add(this.jMenuItemSiguientesColorProducto);				
			this.jmenuDatosColorProducto.add(this.jMenuItemAbrirOrderByColorProducto);				
			this.jmenuDatosColorProducto.add(this.jMenuItemMostrarOcultarColorProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesColorProducto.add(this.jMenuItemGuardarCambiosColorProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarColorProducto.add(this.jmenuArchivoColorProducto);		
			this.jmenuBarColorProducto.add(this.jmenuAccionesColorProducto);		
			this.jmenuBarColorProducto.add(this.jmenuDatosColorProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarColorProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasColorProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoColorProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoColorProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoColorProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoColorProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoColorProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoColorProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoColorProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoColorProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoColorProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreColorProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreColorProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreColorProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreColorProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreColorProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreColorProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreColorProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreColorProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreColorProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGrupoColorColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoColorColorProducto.setToolTipText("Buscar Por Grupo Color ");
		this.jButtonFK_IdGrupoColorColorProducto= new JButtonMe();
		this.jButtonFK_IdGrupoColorColorProducto.setText("Buscar");
		this.jButtonFK_IdGrupoColorColorProducto.setToolTipText("Buscar Por Grupo Color ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoColorColorProducto,"buscar_button","Buscar Por Grupo Color ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoColorColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto = new JLabelMe();
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto.setText("Grupo Color :");
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto.setToolTipText("Grupo Color");
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_colorFK_IdGrupoColorColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_colorFK_IdGrupoColorColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto= new JComboBoxMe();
		jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoColorProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoColorProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoColorProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoColorProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoColorProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasColorProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasColorProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasColorProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasColorProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasColorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleColorProducto = new ColorProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Color Producto DATOS");
			this.jInternalFrameDetalleFormColorProducto = new ColorProductoDetalleFormJInternalFrame(jDesktopPane,this.colorproductoSessionBean.getConGuardarRelaciones(),this.colorproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormColorProducto = null;//new ColorProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutColorProducto= new GridBagLayout();
		
		
		this.jTableDatosColorProducto = new JTableMe();      
		
		String sToolTipColorProducto="";
		sToolTipColorProducto=ColorProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipColorProducto+="(Inventario.ColorProducto)";
		}
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipColorProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosColorProducto.setToolTipText(sToolTipColorProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosColorProducto);
		this.jTableDatosColorProducto.setAutoCreateRowSorter(true);
		this.jTableDatosColorProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosColorProducto.setRowSelectionAllowed(true);
		this.jTableDatosColorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosColorProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoColorProducto = new JButtonMe();
		this.jButtonDuplicarColorProducto = new JButtonMe();
		this.jButtonCopiarColorProducto = new JButtonMe();
		this.jButtonVerFormColorProducto = new JButtonMe();
		this.jButtonNuevoRelacionesColorProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaColorProducto = new JButtonMe();
		this.jButtonCerrarColorProducto = new JButtonMe();
		
		this.jScrollPanelDatosColorProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralColorProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Color Producto";
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosColorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesColorProducto.setToolTipText("Acciones");
        this.jPanelAccionesColorProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoColorProducto=new ReporteDinamicoJInternalFrame(ColorProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoColorProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionColorProducto=new ImportacionJInternalFrame(ColorProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionColorProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByColorProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByColorProducto.setText("Orden");
		this.jButtonAbrirOrderByColorProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByColorProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByColorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorProducto,false,this);
			
			//this.cargarOrderByColorProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByColorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorProducto,true,this);
			
			//this.cargarOrderByColorProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosColorProducto.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosColorProducto.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosColorProducto.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosColorProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosColorProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosColorProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoColorProducto.setText("Nuevo");
		this.jButtonDuplicarColorProducto.setText("Duplicar");
		this.jButtonCopiarColorProducto.setText("Copiar");
		this.jButtonVerFormColorProducto.setText("Ver");
		this.jButtonNuevoRelacionesColorProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaColorProducto.setText("Guardar");
		this.jButtonCerrarColorProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoColorProducto,"nuevo_button","Nuevo",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarColorProducto,"duplicar_button","Duplicar",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarColorProducto,"copiar_button","Copiar",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormColorProducto,"ver_form","Ver",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesColorProducto,"nuevorelaciones_button","Nuevo Rel",this.colorproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaColorProducto,"guardarcambiostabla_button","Guardar",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarColorProducto,"cerrar_button","Salir",this.colorproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoColorProducto.setToolTipText("Nuevo"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarColorProducto.setToolTipText("Duplicar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarColorProducto.setToolTipText("Copiar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormColorProducto.setToolTipText("Ver"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesColorProducto.setToolTipText("Nuevo Rel"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaColorProducto.setToolTipText("Guardar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarColorProducto.setToolTipText("Salir"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoColorProducto";
		inputMap = this.jButtonNuevoColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoColorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoColorProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarColorProducto";
		inputMap = this.jButtonDuplicarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarColorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarColorProducto"));
		
		//COPIAR
		sMapKey = "CopiarColorProducto";
		inputMap = this.jButtonCopiarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarColorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarColorProducto"));
		
		//VEr FORM
		sMapKey = "VerFormColorProducto";
		inputMap = this.jButtonVerFormColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormColorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormColorProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesColorProducto";
		inputMap = this.jButtonNuevoRelacionesColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesColorProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarColorProducto";
		inputMap = this.jButtonModificarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarColorProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarColorProducto";
		inputMap = this.jButtonCerrarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarColorProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaColorProducto";
		inputMap = this.jButtonGuardarCambiosTablaColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaColorProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesColorProducto.setName("jPanelParametrosReportesColorProducto"); 
		
		this.jPanelParametrosReportesAccionesColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesColorProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesColorProducto.setName("jPanelParametrosReportesAccionesColorProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionColorProducto = new JButtonMe();
		this.jButtonRecargarInformacionColorProducto.setText("Recargar");
		this.jButtonRecargarInformacionColorProducto.setToolTipText("Recargar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionColorProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionColorProducto = new JButtonMe();
		this.jButtonProcesarInformacionColorProducto.setText("Procesar");
		this.jButtonProcesarInformacionColorProducto.setToolTipText("Procesar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionColorProducto.setVisible(false);
			
		this.jButtonProcesarInformacionColorProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionColorProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionColorProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesColorProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorProducto.setText("TIPO");       
		this.jComboBoxTiposReportesColorProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesColorProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionColorProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionColorProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesColorProducto.setText("Accion");
		this.jComboBoxTiposRelacionesColorProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesColorProducto.setText("Accion");
		this.jComboBoxTiposAccionesColorProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarColorProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarColorProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralColorProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralColorProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralColorProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralColorProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesColorProducto = new JLabelMe();
		
		this.jLabelAccionesColorProducto.setText("Acciones");		
		this.jLabelAccionesColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosColorProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosColorProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosColorProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosColorProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosColorProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosColorProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaColorProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaColorProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaColorProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteColorProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteColorProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteColorProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresColorProducto = new JButtonMe();
		//this.jButtonAnterioresColorProducto.setText("<<");
        this.jButtonAnterioresColorProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresColorProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesColorProducto = new JButtonMe();
		//this.jButtonSiguientesColorProducto.setText(">>");
        this.jButtonSiguientesColorProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesColorProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosColorProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosColorProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosColorProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosColorProducto,"nuevoguardarcambios_button","Nue",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosColorProducto";
		inputMap = this.jButtonNuevoGuardarCambiosColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosColorProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionColorProducto";
		inputMap = this.jButtonRecargarInformacionColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionColorProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesColorProducto";
		inputMap = this.jButtonSiguientesColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesColorProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresColorProducto";
		inputMap = this.jButtonAnterioresColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresColorProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasColorProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesColorProducto.setMinimumSize(new Dimension(this.getWidth(),ColorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesColorProducto.setMaximumSize(new Dimension(this.getWidth(),ColorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesColorProducto.setPreferredSize(new Dimension(this.getWidth(),ColorProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionColorProducto = new GridBagLayout();

			this.jPanelPaginacionColorProducto.setLayout(gridaBagLayoutPaginacionColorProducto);						
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 0;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionColorProducto.add(this.jButtonAnterioresColorProducto, this.gridBagConstraintsColorProducto);
					
						
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsColorProducto.gridy = 0;
			
			this.jPanelPaginacionColorProducto.add(this.jButtonNuevoGuardarCambiosColorProducto, this.gridBagConstraintsColorProducto);
						
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsColorProducto.gridy = 0;
			this.jPanelPaginacionColorProducto.add(this.jButtonSiguientesColorProducto, this.gridBagConstraintsColorProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 1;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorProducto.add(this.jButtonNuevoColorProducto, this.gridBagConstraintsColorProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsColorProducto = new GridBagConstraints();
				this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsColorProducto.gridy = 1;
				this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionColorProducto.add(this.jButtonNuevoRelacionesColorProducto, this.gridBagConstraintsColorProducto);
			}
			
			
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsColorProducto = new GridBagConstraints();
				this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsColorProducto.gridy = 1;
				this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionColorProducto.add(this.jButtonGuardarCambiosTablaColorProducto, this.gridBagConstraintsColorProducto);
			}
			
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 1;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorProducto.add(this.jButtonDuplicarColorProducto, this.gridBagConstraintsColorProducto);
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 1;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorProducto.add(this.jButtonCopiarColorProducto, this.gridBagConstraintsColorProducto);
		
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 1;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorProducto.add(this.jButtonVerFormColorProducto, this.gridBagConstraintsColorProducto);
		
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 1;
			this.gridBagConstraintsColorProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionColorProducto.add(this.jButtonCerrarColorProducto, this.gridBagConstraintsColorProducto);
		
		
		
		this.jButtonRecargarInformacionColorProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionColorProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionColorProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesColorProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesColorProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesColorProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesColorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesColorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesColorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesColorProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesColorProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesColorProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionColorProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionColorProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionColorProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesColorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesColorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesColorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesColorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarColorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarColorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarColorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaColorProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaColorProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaColorProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteColorProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteColorProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteColorProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosColorProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosColorProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosColorProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosColorProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosColorProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosColorProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesColorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesColorProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ColorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ColorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ColorProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ColorProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesColorProducto.setLayout(gridaBagParametrosReportesColorProducto);
			this.jPanelParametrosReportesAccionesColorProducto.setLayout(gridaBagParametrosReportesAccionesColorProducto);
			
			
			this.jPanelParametrosAuxiliar1ColorProducto.setLayout(gridaBagParametrosAuxiliar1ColorProducto);
			this.jPanelParametrosAuxiliar2ColorProducto.setLayout(gridaBagParametrosAuxiliar2ColorProducto);
			this.jPanelParametrosAuxiliar3ColorProducto.setLayout(gridaBagParametrosAuxiliar3ColorProducto);
			this.jPanelParametrosAuxiliar4ColorProducto.setLayout(gridaBagParametrosAuxiliar4ColorProducto);
			//this.jPanelParametrosAuxiliar5ColorProducto.setLayout(gridaBagParametrosAuxiliar2ColorProducto);			
			
			
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorProducto.add(this.jButtonRecargarInformacionColorProducto, this.gridBagConstraintsColorProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorProducto.add(this.jComboBoxTiposPaginacionColorProducto, this.gridBagConstraintsColorProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorProducto.add(this.jCheckBoxConAltoMaximoTablaColorProducto, this.gridBagConstraintsColorProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorProducto.add(this.jComboBoxTiposArchivosReportesColorProducto, this.gridBagConstraintsColorProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorProducto.add(this.jPanelParametrosAuxiliar1ColorProducto, this.gridBagConstraintsColorProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ColorProducto.add(this.jComboBoxTiposReportesColorProducto, this.gridBagConstraintsColorProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorProducto.add(this.jPanelParametrosAuxiliar4ColorProducto, this.gridBagConstraintsColorProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorProducto.add(this.jComboBoxTiposReportesColorProducto, this.gridBagConstraintsColorProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorProducto.add(this.jCheckBoxGenerarReporteColorProducto, this.gridBagConstraintsColorProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorProducto.add(this.jPanelParametrosAuxiliar2ColorProducto, this.gridBagConstraintsColorProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorProducto.add(this.jLabelAccionesColorProducto, this.gridBagConstraintsColorProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsColorProducto = new GridBagConstraints();
				this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesColorProducto.add(this.jButtonAbrirOrderByColorProducto, this.gridBagConstraintsColorProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorProducto.add(this.jComboBoxTiposSeleccionarColorProducto, this.gridBagConstraintsColorProducto);			
			
			
			/*
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorProducto.add(this.jCheckBoxSeleccionarTodosColorProducto, this.gridBagConstraintsColorProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ColorProducto.add(this.jCheckBoxSeleccionarTodosColorProducto, this.gridBagConstraintsColorProducto);															
				
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ColorProducto.add(this.jCheckBoxSeleccionadosColorProducto, this.gridBagConstraintsColorProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorProducto.add(this.jPanelParametrosAuxiliar3ColorProducto, this.gridBagConstraintsColorProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorProducto.add(this.jComboBoxTiposRelacionesColorProducto, this.gridBagConstraintsColorProducto);
				
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorProducto.add(this.jComboBoxTiposAccionesColorProducto, this.gridBagConstraintsColorProducto);
	
				
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorProducto.add(this.jTextFieldValorCampoGeneralColorProducto, this.gridBagConstraintsColorProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosColorProducto = new GridBagLayout();

			this.jScrollPanelDatosColorProducto.setLayout(gridaBagLayoutDatosColorProducto);
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = 0;
			this.gridBagConstraintsColorProducto.gridx = 0;
			
			this.jScrollPanelDatosColorProducto.add(this.jTableDatosColorProducto, this.gridBagConstraintsColorProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosColorProducto.setViewportView(this.jTableDatosColorProducto);
		this.jTableDatosColorProducto.setFillsViewportHeight(true);
		this.jTableDatosColorProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesColorProducto= new GridBagLayout();
		this.jPanelAccionesColorProducto.setLayout(gridaBagLayoutAccionesColorProducto);
		
		
		/*	
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 0;
			
		this.jPanelAccionesColorProducto.add(this.jButtonNuevoColorProducto, this.gridBagConstraintsColorProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoColorProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoColorProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoColorProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoColorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoColorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoColorProducto.setLayout(gridaBagLayoutBusquedaPorCodigoColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 0;
		jPanelBusquedaPorCodigoColorProducto.add(jLabelcodigoBusquedaPorCodigoColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 1;
		jPanelBusquedaPorCodigoColorProducto.add(jTextFieldcodigoBusquedaPorCodigoColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 1;
		gridBagConstraintsColorProducto.gridx =1;
		jPanelBusquedaPorCodigoColorProducto.add(jButtonBusquedaPorCodigoColorProducto, gridBagConstraintsColorProducto);

		jTabbedPaneBusquedasColorProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoColorProducto);
		jTabbedPaneBusquedasColorProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreColorProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreColorProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreColorProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreColorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreColorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreColorProducto.setLayout(gridaBagLayoutBusquedaPorNombreColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 0;
		jPanelBusquedaPorNombreColorProducto.add(jLabelnombreBusquedaPorNombreColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 1;
		jPanelBusquedaPorNombreColorProducto.add(jTextAreanombreBusquedaPorNombreColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 1;
		gridBagConstraintsColorProducto.gridx =1;
		jPanelBusquedaPorNombreColorProducto.add(jButtonBusquedaPorNombreColorProducto, gridBagConstraintsColorProducto);

		jTabbedPaneBusquedasColorProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreColorProducto);
		jTabbedPaneBusquedasColorProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdGrupoColorColorProducto= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoColorColorProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoColorColorProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoColorColorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoColorColorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoColorColorProducto.setLayout(gridaBagLayoutFK_IdGrupoColorColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 0;
		jPanelFK_IdGrupoColorColorProducto.add(jLabelid_grupo_colorFK_IdGrupoColorColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 1;
		jPanelFK_IdGrupoColorColorProducto.add(jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 1;
		gridBagConstraintsColorProducto.gridx =1;
		jPanelFK_IdGrupoColorColorProducto.add(jButtonFK_IdGrupoColorColorProducto, gridBagConstraintsColorProducto);

		jTabbedPaneBusquedasColorProducto.addTab("3.-Por Grupo Color ", jPanelFK_IdGrupoColorColorProducto);
		jTabbedPaneBusquedasColorProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoColorProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoColorProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoColorProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoColorProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoColorProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoColorProducto.setLayout(gridaBagLayoutFK_IdTipoProductoColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 0;
		jPanelFK_IdTipoProductoColorProducto.add(jLabelid_tipo_productoFK_IdTipoProductoColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 0;
		gridBagConstraintsColorProducto.gridx = 1;
		jPanelFK_IdTipoProductoColorProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto, gridBagConstraintsColorProducto);

		gridBagConstraintsColorProducto = new GridBagConstraints();
		gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorProducto.gridy = 1;
		gridBagConstraintsColorProducto.gridx =1;
		jPanelFK_IdTipoProductoColorProducto.add(jButtonFK_IdTipoProductoColorProducto, gridBagConstraintsColorProducto);

		jTabbedPaneBusquedasColorProducto.addTab("4.-Por Tipo Producto ", jPanelFK_IdTipoProductoColorProducto);
		jTabbedPaneBusquedasColorProducto.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutColorProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutColorProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsColorProducto = new GridBagConstraints();						
			this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorProducto.gridx = 0;		
			//this.gridBagConstraintsColorProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsColorProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarColorProducto, this.gridBagConstraintsColorProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsColorProducto.gridx = 0;		
		//this.gridBagConstraintsColorProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsColorProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsColorProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorProducto.gridx = 0;		
			this.gridBagConstraintsColorProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsColorProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasColorProducto, this.gridBagConstraintsColorProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesColorProducto, this.gridBagConstraintsColorProducto);								
		
		
		/*
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesColorProducto, this.gridBagConstraintsColorProducto);
		*/		
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsColorProducto.gridx =0;
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsColorProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosColorProducto, this.gridBagConstraintsColorProducto);
				
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionColorProducto, this.gridBagConstraintsColorProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosColorProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosColorProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosColorProducto.setLayout(gridaBagLayoutBusquedasParametrosColorProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralColorProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralColorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposColorProducto, this.gridBagConstraintsColorProducto);
			
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosColorProducto, this.gridBagConstraintsColorProducto);
		
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesColorProducto, this.gridBagConstraintsColorProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralColorProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoColorProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoColorProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoColorProducto.setName("jPanelReporteDinamicoColorProducto"); 
		
		this.jPanelReporteDinamicoColorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoColorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoColorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoColorProducto.setLayout(gridaBagLayoutReporteDinamicoColorProducto);
		
		
		this.jInternalFrameReporteDinamicoColorProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoColorProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteColorProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoColorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoColorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoColorProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoColorProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoColorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoColorProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoColorProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoColorProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoColorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoColorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoColorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteColorProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteColorProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoColorProducto.add(this.jLabelColumnasSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteColorProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteColorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteColorProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteColorProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteColorProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteColorProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteColorProducto=new JScrollPane(this.jListColumnasSelectReporteColorProducto);
			
			this.jScrollColumnasSelectReporteColorProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteColorProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteColorProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoColorProducto.add(this.jListColumnasSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		this.jPanelReporteDinamicoColorProducto.add(this.jScrollColumnasSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteColorProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteColorProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoColorProducto.add(this.jLabelRelacionesSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteColorProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteColorProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteColorProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteColorProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteColorProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteColorProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteColorProducto=new JScrollPane(this.jListRelacionesSelectReporteColorProducto);
			
			this.jScrollRelacionesSelectReporteColorProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteColorProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteColorProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoColorProducto.add(this.jListRelacionesSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		this.jPanelReporteDinamicoColorProducto.add(this.jScrollRelacionesSelectReporteColorProducto, this.gridBagConstraintsColorProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoColorProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoColorProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoColorProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoColorProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoColorProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoColorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoColorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoColorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoColorProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoColorProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoColorProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoColorProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoColorProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoColorProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoColorProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoColorProducto.add(this.jLabelGenerarExcelReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoColorProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoColorProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoColorProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoColorProducto.setToolTipText("Generar EXCEL"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoColorProducto.add(this.jButtonGenerarExcelReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorProducto.add(this.jComboBoxTiposReportesDinamicoColorProducto, this.gridBagConstraintsColorProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoColorProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoColorProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoColorProducto.add(this.jLabelTiposArchivoReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorProducto.add(this.jComboBoxTiposArchivosReportesDinamicoColorProducto, this.gridBagConstraintsColorProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoColorProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoColorProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoColorProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoColorProducto.setToolTipText("Generar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorProducto.add(this.jButtonGenerarReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoColorProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoColorProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoColorProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoColorProducto.setToolTipText("Cancelar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorProducto.add(this.jButtonCerrarReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalColorProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoColorProducto= new JScrollPane(jPanelReporteDinamicoColorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoColorProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoColorProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoColorProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsColorProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoColorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoColorProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalColorProducto);
		this.jInternalFrameReporteDinamicoColorProducto.getContentPane().add(this.jScrollPanelReporteDinamicoColorProducto, this.gridBagConstraintsColorProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionColorProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionColorProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionColorProducto.setName("jPanelImportacionColorProducto"); 
		
		this.jPanelImportacionColorProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionColorProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionColorProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionColorProducto.setLayout(gridaBagLayoutImportacionColorProducto);
		
		
		this.jInternalFrameImportacionColorProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionColorProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionColorProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteColorProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionColorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionColorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionColorProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionColorProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionColorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionColorProducto.setResizable(true);
	    this.jInternalFrameImportacionColorProducto.setClosable(true);
	    this.jInternalFrameImportacionColorProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionColorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionColorProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionColorProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionColorProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionColorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionColorProducto.setResizable(true);
	    this.jInternalFrameImportacionColorProducto.setClosable(true);
	    this.jInternalFrameImportacionColorProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionColorProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionColorProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionColorProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionColorProducto = new JLabelMe();

		this.jLabelArchivoImportacionColorProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionColorProducto.add(this.jLabelArchivoImportacionColorProducto, this.gridBagConstraintsColorProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionColorProducto = new JFileChooser();		
		this.jFileChooserImportacionColorProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionColorProducto = new JButtonMe();
		this.jButtonAbrirImportacionColorProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionColorProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionColorProducto.setToolTipText("Generar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorProducto.add(this.jButtonAbrirImportacionColorProducto, this.gridBagConstraintsColorProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionColorProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionColorProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionColorProducto.add(this.jLabelPathArchivoImportacionColorProducto, this.gridBagConstraintsColorProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionColorProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionColorProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionColorProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionColorProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorProducto.add(this.jTextFieldPathArchivoImportacionColorProducto, this.gridBagConstraintsColorProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionColorProducto = new JButtonMe();
		this.jButtonGenerarImportacionColorProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionColorProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionColorProducto.setToolTipText("Generar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorProducto.add(this.jButtonGenerarImportacionColorProducto, this.gridBagConstraintsColorProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionColorProducto = new JButtonMe();
		this.jButtonCerrarImportacionColorProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionColorProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionColorProducto.setToolTipText("Cancelar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsColorProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorProducto.add(this.jButtonCerrarImportacionColorProducto, this.gridBagConstraintsColorProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalColorProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionColorProducto= new JScrollPane(jPanelImportacionColorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsColorProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionColorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionColorProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalColorProducto);
		this.jInternalFrameImportacionColorProducto.getContentPane().add(this.jScrollPanelImportacionColorProducto, this.gridBagConstraintsColorProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByColorProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByColorProducto = new JButtonMe();
			this.jButtonAbrirOrderByColorProducto.setText("Orden");
			this.jButtonAbrirOrderByColorProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByColorProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByColorProducto";
			inputMap = this.jButtonAbrirOrderByColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByColorProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByColorProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByColorProducto.setName("jPanelOrderByColorProducto"); 
			
			this.jPanelOrderByColorProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByColorProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByColorProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByColorProducto.setLayout(gridaBagLayoutOrderByColorProducto);
			
			
			this.jTableDatosColorProductoOrderBy = new JTableMe();        
			this.jTableDatosColorProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosColorProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosColorProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosColorProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosColorProductoOrderBy.setViewportView(this.jTableDatosColorProductoOrderBy);
			this.jTableDatosColorProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosColorProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByColorProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByColorProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByColorProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteColorProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByColorProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByColorProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByColorProducto.setTitle("Orden");
			this.jInternalFrameOrderByColorProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByColorProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByColorProducto.setResizable(true);
			this.jInternalFrameOrderByColorProducto.setClosable(true);
			this.jInternalFrameOrderByColorProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByColorProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByColorProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByColorProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsColorProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsColorProducto.ipady =150;
				
			this.jPanelOrderByColorProducto.add(jScrollPanelDatosColorProductoOrderBy, this.gridBagConstraintsColorProducto);//this.jTableDatosColorProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByColorProducto = new JButtonMe();
			this.jButtonCerrarOrderByColorProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByColorProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByColorProducto.setToolTipText("Cancelar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsColorProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByColorProducto.add(this.jButtonCerrarOrderByColorProducto, this.gridBagConstraintsColorProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalColorProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByColorProducto= new JScrollPane(jPanelOrderByColorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsColorProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByColorProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByColorProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalColorProducto);
			
			this.jInternalFrameOrderByColorProducto.getContentPane().add(this.jScrollPanelOrderByColorProducto, this.gridBagConstraintsColorProducto);			
		
		} else {
			this.jButtonAbrirOrderByColorProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.colorproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosColorProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosColorProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosColorProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosColorProducto.getRowHeight();//ColorProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ColorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaColorProducto.isSelected()) {
					iHeightTable=ColorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ColorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ColorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ColorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaColorProducto.isSelected()) {
					iHeightTable=ColorProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ColorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ColorProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosColorProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosColorProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosColorProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosColorProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosColorProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosColorProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByColorProducto!=null && this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByColorProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByColorProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByColorProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosColorProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosColorProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosColorProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=colorproductoLogic.getColorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ColorProducto> TraerColorProductoBeans(List<ColorProducto> colorproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ColorProducto colorproducto:colorproductos) {
					
				if(!(ColorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ColorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					colorproducto.setsDetalleGeneralEntityReporte(ColorProductoConstantesFunciones.getColorProductoDescripcion(colorproducto));
										
						
					
					

					if(colorproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{colorproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(colorproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//colorproducto.setsDetalleGeneralEntityReporte(colorproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//colorproductobeans.add(colorproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return colorproductos;
    }
	//PARA REPORTES FIN
}
