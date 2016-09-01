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
import com.bydan.erp.inventario.util.MaterialProductoConstantesFunciones;

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
public class MaterialProductoJInternalFrame extends MaterialProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMaterialProducto;
	
	protected JMenuBar jmenuBarMaterialProducto;
	
	protected JMenu jmenuMaterialProducto;
	protected JMenu jmenuDatosMaterialProducto;
	protected JMenu jmenuArchivoMaterialProducto;
	protected JMenu jmenuAccionesMaterialProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMaterialProducto;	
	protected GridBagConstraints gridBagConstraintsMaterialProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MaterialProductoDetalleFormJInternalFrame jInternalFrameDetalleFormMaterialProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMaterialProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMaterialProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public MaterialProductoSessionBean materialproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MaterialProducto> materialproductos;		
	public List<MaterialProducto> materialproductosEliminados;	
	public List<MaterialProducto> materialproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMaterialProducto;		
	protected JButton jButtonAbrirOrderByMaterialProducto;
	
	
	//protected JPanel jPanelOrderByMaterialProducto;
	//public JScrollPane jScrollPanelOrderByMaterialProducto;	
	//protected JButton jButtonCerrarOrderByMaterialProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MaterialProductoLogic materialproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMaterialProducto;
	public JScrollPane jScrollPanelDatosEdicionMaterialProducto;
	public JScrollPane jScrollPanelDatosGeneralMaterialProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosMaterialProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMaterialProducto;
	//public JScrollPane jScrollPanelImportacionMaterialProducto;
	
	
	
	protected JPanel jPanelAccionesMaterialProducto;
	
    protected JPanel jPanelPaginacionMaterialProducto;
    protected JPanel jPanelParametrosReportesMaterialProducto;
	protected JPanel jPanelParametrosReportesAccionesMaterialProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MaterialProducto;
	protected JPanel jPanelParametrosAuxiliar2MaterialProducto;
	protected JPanel jPanelParametrosAuxiliar3MaterialProducto;
	protected JPanel jPanelParametrosAuxiliar4MaterialProducto;
	//protected JPanel jPanelParametrosAuxiliar5MaterialProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoMaterialProducto;
	//protected JPanel jPanelImportacionMaterialProducto;
	
	
	public JTable jTableDatosMaterialProducto;
	
	
	
	//public JTable jTableDatosMaterialProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMaterialProducto;
	protected JButton jButtonDuplicarMaterialProducto;
	protected JButton jButtonCopiarMaterialProducto;
	protected JButton jButtonVerFormMaterialProducto;
	protected JButton jButtonNuevoRelacionesMaterialProducto;
	protected JButton jButtonModificarMaterialProducto;
	
    protected JButton jButtonGuardarCambiosTablaMaterialProducto;
	protected JButton jButtonCerrarMaterialProducto;
	
	
	protected JButton jButtonRecargarInformacionMaterialProducto;
	protected JButton jButtonProcesarInformacionMaterialProducto;
	
	
	protected JButton jButtonAnterioresMaterialProducto;
	protected JButton jButtonSiguientesMaterialProducto;
	protected JButton jButtonNuevoGuardarCambiosMaterialProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMaterialProducto;
	//protected JButton jButtonCerrarReporteDinamicoMaterialProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoMaterialProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionMaterialProducto;
	//protected JButton jButtonGenerarImportacionMaterialProducto;
	//protected JButton jButtonCerrarImportacionMaterialProducto;
	//protected JFileChooser jFileChooserImportacionMaterialProducto;
	//protected File fileImportacionMaterialProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMaterialProducto;
	protected JButton jButtonDuplicarToolBarMaterialProducto;
	protected JButton jButtonNuevoRelacionesToolBarMaterialProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarMaterialProducto;
	protected JButton jButtonCopiarToolBarMaterialProducto;
	protected JButton jButtonVerFormToolBarMaterialProducto;
	public JButton jButtonGuardarCambiosTablaToolBarMaterialProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarMaterialProducto;
	protected JButton jButtonCerrarToolBarMaterialProducto;
	
	protected JButton jButtonRecargarInformacionToolBarMaterialProducto;
	protected JButton jButtonProcesarInformacionToolBarMaterialProducto;
	protected JButton jButtonAnterioresToolBarMaterialProducto;
	protected JButton jButtonSiguientesToolBarMaterialProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarMaterialProducto;
	protected JButton jButtonAbrirOrderByToolBarMaterialProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMaterialProducto;
	protected JMenuItem jMenuItemDuplicarMaterialProducto;
	protected JMenuItem jMenuItemNuevoRelacionesMaterialProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMaterialProducto;
	protected JMenuItem jMenuItemCopiarMaterialProducto;
	protected JMenuItem jMenuItemVerFormMaterialProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMaterialProducto;
	protected JMenuItem jMenuItemCerrarMaterialProducto;
	protected JMenuItem jMenuItemDetalleCerrarMaterialProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMaterialProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMaterialProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionMaterialProducto;
	protected JMenuItem jMenuItemProcesarInformacionMaterialProducto;
	protected JMenuItem jMenuItemAnterioresMaterialProducto;
	protected JMenuItem jMenuItemSiguientesMaterialProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMaterialProducto;
	protected JMenuItem jMenuItemAbrirOrderByMaterialProducto;
	protected JMenuItem jMenuItemMostrarOcultarMaterialProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMaterialProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMaterialProducto;
	protected JCheckBox jCheckBoxSeleccionadosMaterialProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMaterialProducto;
	protected JCheckBox jCheckBoxConGraficoReporteMaterialProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMaterialProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMaterialProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMaterialProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMaterialProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMaterialProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMaterialProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMaterialProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMaterialProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMaterialProducto;
	protected JTextField jTextFieldValorCampoGeneralMaterialProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMaterialProducto;
	//public JList<Reporte> jListColumnasSelectReporteMaterialProducto;
	//public JScrollPane jScrollColumnasSelectReporteMaterialProducto;
	
	//public JLabel jLabelRelacionesSelectReporteMaterialProducto;
	//public JList<Reporte> jListRelacionesSelectReporteMaterialProducto;
	//public JScrollPane jScrollRelacionesSelectReporteMaterialProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMaterialProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMaterialProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMaterialProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoMaterialProducto;
	
		
	//public JLabel jLabelArchivoImportacionMaterialProducto;	
	//public JLabel jLabelPathArchivoImportacionMaterialProducto;
	//protected JTextField jTextFieldPathArchivoImportacionMaterialProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMaterialProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMaterialProducto;
	
	//public JLabel jLabelColumnaCategoriaValorMaterialProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMaterialProducto;
	
	//public JLabel jLabelColumnasValoresGraficoMaterialProducto;
	//public JList<Reporte> jListColumnasValoresGraficoMaterialProducto;
	//public JScrollPane jScrollColumnasValoresGraficoMaterialProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMaterialProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMaterialProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMaterialProducto;
	public JPanel jPanelBusquedaPorCodigoMaterialProducto;
	public JButton jButtonBusquedaPorCodigoMaterialProducto;
	public JPanel jPanelBusquedaPorNombreMaterialProducto;
	public JButton jButtonBusquedaPorNombreMaterialProducto;
	public JPanel jPanelFK_IdTipoProductoMaterialProducto;
	public JButton jButtonFK_IdTipoProductoMaterialProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoMaterialProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoMaterialProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoMaterialProducto;
	public JButton jButtoncodigoBusquedaPorCodigoMaterialProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreMaterialProducto;
	public JLabel jLabelnombreBusquedaPorNombreMaterialProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreMaterialProducto;
	public JButton jButtonnombreBusquedaPorNombreMaterialProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoMaterialProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMaterialProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMaterialProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMaterialProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public MaterialProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMaterialProducto)	{
		this.jButtonRecargarInformacionMaterialProducto = jButtonRecargarInformacionMaterialProducto;
	}
	
	public JButton getjButtonProcesarInformacionMaterialProducto() {
		return this.jButtonProcesarInformacionMaterialProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMaterialProducto)	{
		this.jButtonProcesarInformacionMaterialProducto = jButtonProcesarInformacionMaterialProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionMaterialProducto() {
		return this.jButtonRecargarInformacionMaterialProducto;
	}
	
	
	public List<MaterialProducto> getmaterialproductos() {
		return this.materialproductos;
	}

	public void setmaterialproductos(List<MaterialProducto> materialproductos) {
		this.materialproductos = materialproductos;
	}
	
	public List<MaterialProducto> getmaterialproductosAux() {
		return this.materialproductosAux;
	}

	public void setmaterialproductosAux(List<MaterialProducto> materialproductosAux) {
		this.materialproductosAux = materialproductosAux;
	}
	
	public List<MaterialProducto> getmaterialproductosEliminados() {
		return this.materialproductosEliminados;
	}

	public void setMaterialProductosEliminados(List<MaterialProducto> materialproductosEliminados) {
		this.materialproductosEliminados = materialproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMaterialProducto() {
		return jComboBoxTiposSeleccionarMaterialProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMaterialProducto(
			JComboBox jComboBoxTiposSeleccionarMaterialProducto) {
		this.jComboBoxTiposSeleccionarMaterialProducto = jComboBoxTiposSeleccionarMaterialProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMaterialProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMaterialProducto() {
		return jTextFieldValorCampoGeneralMaterialProducto;
	}

	public void setjTextFieldValorCampoGeneralMaterialProducto(
			JTextField jTextFieldValorCampoGeneralMaterialProducto) {
		this.jTextFieldValorCampoGeneralMaterialProducto = jTextFieldValorCampoGeneralMaterialProducto;
	}

	public void setBorderResaltarValorCampoGeneralMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMaterialProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMaterialProducto() {
		return this.jCheckBoxSeleccionarTodosMaterialProducto;
	}

	public void setjCheckBoxSeleccionarTodosMaterialProducto(
			JCheckBox jCheckBoxSeleccionarTodosMaterialProducto) {
		this.jCheckBoxSeleccionarTodosMaterialProducto = jCheckBoxSeleccionarTodosMaterialProducto;
	}

	public void setBorderResaltarSeleccionarTodosMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMaterialProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMaterialProducto() {
		return this.jCheckBoxSeleccionadosMaterialProducto;
	}

	public void setjCheckBoxSeleccionadosMaterialProducto(
			JCheckBox jCheckBoxSeleccionadosMaterialProducto) {
		this.jCheckBoxSeleccionadosMaterialProducto = jCheckBoxSeleccionadosMaterialProducto;
	}
	
	public void setBorderResaltarSeleccionadosMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMaterialProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMaterialProducto() {
		return this.jComboBoxTiposArchivosReportesMaterialProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMaterialProducto(
			JComboBox jComboBoxTiposArchivosReportesMaterialProducto) {
		this.jComboBoxTiposArchivosReportesMaterialProducto = jComboBoxTiposArchivosReportesMaterialProducto;
	}

	public void setBorderResaltarTiposArchivosReportesMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMaterialProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMaterialProducto() {
		return this.jComboBoxTiposReportesMaterialProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMaterialProducto(
			JComboBox jComboBoxTiposReportesMaterialProducto) {
		this.jComboBoxTiposReportesMaterialProducto = jComboBoxTiposReportesMaterialProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMaterialProducto() {
	//	return jComboBoxTiposReportesDinamicoMaterialProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMaterialProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoMaterialProducto) {
	//	this.jComboBoxTiposReportesDinamicoMaterialProducto = jComboBoxTiposReportesDinamicoMaterialProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMaterialProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoMaterialProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMaterialProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMaterialProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto = jComboBoxTiposArchivosReportesDinamicoMaterialProducto;
	//}
	
	public void setBorderResaltarTiposReportesMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMaterialProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMaterialProducto() {
		return this.jComboBoxTiposGraficosReportesMaterialProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMaterialProducto(
			JComboBox jComboBoxTiposGraficosReportesMaterialProducto) {
		this.jComboBoxTiposGraficosReportesMaterialProducto = jComboBoxTiposGraficosReportesMaterialProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMaterialProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMaterialProducto() {
		return this.jComboBoxTiposPaginacionMaterialProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMaterialProducto(
			JComboBox jComboBoxTiposPaginacionMaterialProducto) {
		this.jComboBoxTiposPaginacionMaterialProducto = jComboBoxTiposPaginacionMaterialProducto;
	}
	
	public void setBorderResaltarTiposPaginacionMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMaterialProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMaterialProducto() {
		return this.jComboBoxTiposRelacionesMaterialProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMaterialProducto() {
		return this.jComboBoxTiposAccionesMaterialProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMaterialProducto(
			JComboBox jComboBoxTiposRelacionesMaterialProducto) {
		this.jComboBoxTiposRelacionesMaterialProducto = jComboBoxTiposRelacionesMaterialProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMaterialProducto(
			JComboBox jComboBoxTiposAccionesMaterialProducto) {
		this.jComboBoxTiposAccionesMaterialProducto = jComboBoxTiposAccionesMaterialProducto;
	}
	
	public void setBorderResaltarTiposRelacionesMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMaterialProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMaterialProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMaterialProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMaterialProducto() {
	//	return jCheckBoxConGraficoDinamicoMaterialProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoMaterialProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoMaterialProducto) {
	//	this.jCheckBoxConGraficoDinamicoMaterialProducto = jCheckBoxConGraficoDinamicoMaterialProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMaterialProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMaterialProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMaterialProducto .setBorder(borderResaltar);		
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
		this.materialproductoSessionBean=new MaterialProductoSessionBean();
		
		this.materialproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.materialproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.materialproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MaterialProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Material Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMaterialProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"nuevo","nuevo","Nuevo"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"duplicar","duplicar","Duplicar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"copiar","copiar","Copiar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"ver_form","ver_form","Ver"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"recargar","recargar","Recargar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMaterialProducto,this.jTtoolBarMaterialProducto,
							"cerrar","cerrar","Salir"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMaterialProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMaterialProducto;
			
				this.jButtonProcesarInformacionToolBarMaterialProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMaterialProducto;
				
		//protected JButton jButtonModificarToolBarMaterialProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMaterialProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMaterialProducto=new JMenuMe("General");
		this.jmenuArchivoMaterialProducto=new JMenuMe("Archivo");
		this.jmenuAccionesMaterialProducto=new JMenuMe("Acciones");
		this.jmenuDatosMaterialProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMaterialProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMaterialProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMaterialProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMaterialProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMaterialProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMaterialProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMaterialProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMaterialProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMaterialProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMaterialProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMaterialProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMaterialProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMaterialProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMaterialProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMaterialProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMaterialProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMaterialProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMaterialProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMaterialProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMaterialProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMaterialProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMaterialProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMaterialProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMaterialProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMaterialProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMaterialProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMaterialProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMaterialProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMaterialProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMaterialProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMaterialProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMaterialProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMaterialProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMaterialProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMaterialProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMaterialProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMaterialProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMaterialProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMaterialProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMaterialProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMaterialProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMaterialProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMaterialProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMaterialProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMaterialProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMaterialProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMaterialProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMaterialProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMaterialProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMaterialProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMaterialProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMaterialProducto.add(this.jMenuItemCerrarMaterialProducto);
			
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemNuevoMaterialProducto);
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemNuevoGuardarCambiosMaterialProducto);
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemNuevoRelacionesMaterialProducto);
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemGuardarCambiosTablaMaterialProducto);		
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemDuplicarMaterialProducto);		
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemCopiarMaterialProducto);		
			this.jmenuAccionesMaterialProducto.add(this.jMenuItemVerFormMaterialProducto);		
			
			this.jmenuDatosMaterialProducto.add(this.jMenuItemRecargarInformacionMaterialProducto);				
			this.jmenuDatosMaterialProducto.add(this.jMenuItemAnterioresMaterialProducto);				
			this.jmenuDatosMaterialProducto.add(this.jMenuItemSiguientesMaterialProducto);				
			this.jmenuDatosMaterialProducto.add(this.jMenuItemAbrirOrderByMaterialProducto);				
			this.jmenuDatosMaterialProducto.add(this.jMenuItemMostrarOcultarMaterialProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMaterialProducto.add(this.jMenuItemGuardarCambiosMaterialProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMaterialProducto.add(this.jmenuArchivoMaterialProducto);		
			this.jmenuBarMaterialProducto.add(this.jmenuAccionesMaterialProducto);		
			this.jmenuBarMaterialProducto.add(this.jmenuDatosMaterialProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMaterialProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMaterialProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoMaterialProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoMaterialProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoMaterialProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoMaterialProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoMaterialProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoMaterialProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoMaterialProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoMaterialProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoMaterialProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreMaterialProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreMaterialProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreMaterialProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreMaterialProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreMaterialProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreMaterialProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreMaterialProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreMaterialProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreMaterialProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoMaterialProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoMaterialProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoMaterialProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoMaterialProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoMaterialProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMaterialProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasMaterialProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMaterialProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMaterialProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMaterialProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMaterialProducto = new MaterialProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Material Producto DATOS");
			this.jInternalFrameDetalleFormMaterialProducto = new MaterialProductoDetalleFormJInternalFrame(jDesktopPane,this.materialproductoSessionBean.getConGuardarRelaciones(),this.materialproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMaterialProducto = null;//new MaterialProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMaterialProducto= new GridBagLayout();
		
		
		this.jTableDatosMaterialProducto = new JTableMe();      
		
		String sToolTipMaterialProducto="";
		sToolTipMaterialProducto=MaterialProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMaterialProducto+="(Inventario.MaterialProducto)";
		}
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMaterialProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMaterialProducto.setToolTipText(sToolTipMaterialProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMaterialProducto);
		this.jTableDatosMaterialProducto.setAutoCreateRowSorter(true);
		this.jTableDatosMaterialProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMaterialProducto.setRowSelectionAllowed(true);
		this.jTableDatosMaterialProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMaterialProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMaterialProducto = new JButtonMe();
		this.jButtonDuplicarMaterialProducto = new JButtonMe();
		this.jButtonCopiarMaterialProducto = new JButtonMe();
		this.jButtonVerFormMaterialProducto = new JButtonMe();
		this.jButtonNuevoRelacionesMaterialProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMaterialProducto = new JButtonMe();
		this.jButtonCerrarMaterialProducto = new JButtonMe();
		
		this.jScrollPanelDatosMaterialProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralMaterialProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Material Producto";
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosMaterialProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMaterialProducto.setToolTipText("Acciones");
        this.jPanelAccionesMaterialProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMaterialProducto=new ReporteDinamicoJInternalFrame(MaterialProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMaterialProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMaterialProducto=new ImportacionJInternalFrame(MaterialProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMaterialProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMaterialProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByMaterialProducto.setText("Orden");
		this.jButtonAbrirOrderByMaterialProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMaterialProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMaterialProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMaterialProducto,false,this);
			
			//this.cargarOrderByMaterialProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMaterialProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMaterialProducto,true,this);
			
			//this.cargarOrderByMaterialProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMaterialProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosMaterialProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosMaterialProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosMaterialProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMaterialProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMaterialProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMaterialProducto.setText("Nuevo");
		this.jButtonDuplicarMaterialProducto.setText("Duplicar");
		this.jButtonCopiarMaterialProducto.setText("Copiar");
		this.jButtonVerFormMaterialProducto.setText("Ver");
		this.jButtonNuevoRelacionesMaterialProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMaterialProducto.setText("Guardar");
		this.jButtonCerrarMaterialProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMaterialProducto,"nuevo_button","Nuevo",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMaterialProducto,"duplicar_button","Duplicar",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMaterialProducto,"copiar_button","Copiar",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMaterialProducto,"ver_form","Ver",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMaterialProducto,"nuevorelaciones_button","Nuevo Rel",this.materialproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMaterialProducto,"guardarcambiostabla_button","Guardar",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMaterialProducto,"cerrar_button","Salir",this.materialproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMaterialProducto.setToolTipText("Nuevo"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMaterialProducto.setToolTipText("Duplicar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMaterialProducto.setToolTipText("Copiar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMaterialProducto.setToolTipText("Ver"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMaterialProducto.setToolTipText("Nuevo Rel"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMaterialProducto.setToolTipText("Guardar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMaterialProducto.setToolTipText("Salir"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMaterialProducto";
		inputMap = this.jButtonNuevoMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMaterialProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMaterialProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarMaterialProducto";
		inputMap = this.jButtonDuplicarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMaterialProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMaterialProducto"));
		
		//COPIAR
		sMapKey = "CopiarMaterialProducto";
		inputMap = this.jButtonCopiarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMaterialProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMaterialProducto"));
		
		//VEr FORM
		sMapKey = "VerFormMaterialProducto";
		inputMap = this.jButtonVerFormMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMaterialProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMaterialProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMaterialProducto";
		inputMap = this.jButtonNuevoRelacionesMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMaterialProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMaterialProducto";
		inputMap = this.jButtonModificarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMaterialProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMaterialProducto";
		inputMap = this.jButtonCerrarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMaterialProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMaterialProducto";
		inputMap = this.jButtonGuardarCambiosTablaMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMaterialProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMaterialProducto.setName("jPanelParametrosReportesMaterialProducto"); 
		
		this.jPanelParametrosReportesAccionesMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMaterialProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMaterialProducto.setName("jPanelParametrosReportesAccionesMaterialProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMaterialProducto = new JButtonMe();
		this.jButtonRecargarInformacionMaterialProducto.setText("Recargar");
		this.jButtonRecargarInformacionMaterialProducto.setToolTipText("Recargar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMaterialProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMaterialProducto = new JButtonMe();
		this.jButtonProcesarInformacionMaterialProducto.setText("Procesar");
		this.jButtonProcesarInformacionMaterialProducto.setToolTipText("Procesar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMaterialProducto.setVisible(false);
			
		this.jButtonProcesarInformacionMaterialProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMaterialProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMaterialProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMaterialProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMaterialProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMaterialProducto.setText("TIPO");       
		this.jComboBoxTiposReportesMaterialProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMaterialProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMaterialProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMaterialProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionMaterialProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMaterialProducto.setText("Accion");
		this.jComboBoxTiposRelacionesMaterialProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMaterialProducto.setText("Accion");
		this.jComboBoxTiposAccionesMaterialProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMaterialProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarMaterialProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMaterialProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMaterialProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMaterialProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMaterialProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMaterialProducto = new JLabelMe();
		
		this.jLabelAccionesMaterialProducto.setText("Acciones");		
		this.jLabelAccionesMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMaterialProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMaterialProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMaterialProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMaterialProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMaterialProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMaterialProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMaterialProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMaterialProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMaterialProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMaterialProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMaterialProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteMaterialProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMaterialProducto = new JButtonMe();
		//this.jButtonAnterioresMaterialProducto.setText("<<");
        this.jButtonAnterioresMaterialProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMaterialProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMaterialProducto = new JButtonMe();
		//this.jButtonSiguientesMaterialProducto.setText(">>");
        this.jButtonSiguientesMaterialProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMaterialProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMaterialProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMaterialProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosMaterialProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMaterialProducto,"nuevoguardarcambios_button","Nue",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMaterialProducto";
		inputMap = this.jButtonNuevoGuardarCambiosMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMaterialProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMaterialProducto";
		inputMap = this.jButtonRecargarInformacionMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMaterialProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMaterialProducto";
		inputMap = this.jButtonSiguientesMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMaterialProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMaterialProducto";
		inputMap = this.jButtonAnterioresMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMaterialProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMaterialProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMaterialProducto.setMinimumSize(new Dimension(this.getWidth(),MaterialProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MaterialProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMaterialProducto.setMaximumSize(new Dimension(this.getWidth(),MaterialProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MaterialProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMaterialProducto.setPreferredSize(new Dimension(this.getWidth(),MaterialProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MaterialProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMaterialProducto = new GridBagLayout();

			this.jPanelPaginacionMaterialProducto.setLayout(gridaBagLayoutPaginacionMaterialProducto);						
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 0;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMaterialProducto.add(this.jButtonAnterioresMaterialProducto, this.gridBagConstraintsMaterialProducto);
					
						
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMaterialProducto.gridy = 0;
			
			this.jPanelPaginacionMaterialProducto.add(this.jButtonNuevoGuardarCambiosMaterialProducto, this.gridBagConstraintsMaterialProducto);
						
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMaterialProducto.gridy = 0;
			this.jPanelPaginacionMaterialProducto.add(this.jButtonSiguientesMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 1;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMaterialProducto.add(this.jButtonNuevoMaterialProducto, this.gridBagConstraintsMaterialProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMaterialProducto.gridy = 1;
				this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionMaterialProducto.add(this.jButtonNuevoRelacionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
			}
			
			
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMaterialProducto.gridy = 1;
				this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMaterialProducto.add(this.jButtonGuardarCambiosTablaMaterialProducto, this.gridBagConstraintsMaterialProducto);
			}
			
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 1;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMaterialProducto.add(this.jButtonDuplicarMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 1;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMaterialProducto.add(this.jButtonCopiarMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 1;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMaterialProducto.add(this.jButtonVerFormMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 1;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMaterialProducto.add(this.jButtonCerrarMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
		
		
		this.jButtonRecargarInformacionMaterialProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMaterialProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMaterialProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMaterialProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMaterialProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMaterialProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMaterialProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMaterialProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMaterialProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMaterialProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMaterialProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMaterialProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMaterialProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMaterialProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMaterialProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMaterialProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMaterialProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMaterialProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMaterialProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMaterialProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMaterialProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMaterialProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMaterialProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMaterialProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMaterialProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMaterialProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMaterialProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMaterialProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMaterialProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMaterialProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMaterialProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMaterialProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMaterialProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMaterialProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMaterialProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMaterialProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMaterialProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMaterialProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MaterialProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MaterialProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MaterialProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MaterialProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMaterialProducto.setLayout(gridaBagParametrosReportesMaterialProducto);
			this.jPanelParametrosReportesAccionesMaterialProducto.setLayout(gridaBagParametrosReportesAccionesMaterialProducto);
			
			
			this.jPanelParametrosAuxiliar1MaterialProducto.setLayout(gridaBagParametrosAuxiliar1MaterialProducto);
			this.jPanelParametrosAuxiliar2MaterialProducto.setLayout(gridaBagParametrosAuxiliar2MaterialProducto);
			this.jPanelParametrosAuxiliar3MaterialProducto.setLayout(gridaBagParametrosAuxiliar3MaterialProducto);
			this.jPanelParametrosAuxiliar4MaterialProducto.setLayout(gridaBagParametrosAuxiliar4MaterialProducto);
			//this.jPanelParametrosAuxiliar5MaterialProducto.setLayout(gridaBagParametrosAuxiliar2MaterialProducto);			
			
			
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMaterialProducto.add(this.jButtonRecargarInformacionMaterialProducto, this.gridBagConstraintsMaterialProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MaterialProducto.add(this.jComboBoxTiposPaginacionMaterialProducto, this.gridBagConstraintsMaterialProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MaterialProducto.add(this.jCheckBoxConAltoMaximoTablaMaterialProducto, this.gridBagConstraintsMaterialProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MaterialProducto.add(this.jComboBoxTiposArchivosReportesMaterialProducto, this.gridBagConstraintsMaterialProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMaterialProducto.add(this.jPanelParametrosAuxiliar1MaterialProducto, this.gridBagConstraintsMaterialProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MaterialProducto.add(this.jComboBoxTiposReportesMaterialProducto, this.gridBagConstraintsMaterialProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMaterialProducto.add(this.jPanelParametrosAuxiliar4MaterialProducto, this.gridBagConstraintsMaterialProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMaterialProducto.add(this.jComboBoxTiposReportesMaterialProducto, this.gridBagConstraintsMaterialProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMaterialProducto.add(this.jCheckBoxGenerarReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMaterialProducto.add(this.jPanelParametrosAuxiliar2MaterialProducto, this.gridBagConstraintsMaterialProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMaterialProducto.add(this.jLabelAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMaterialProducto.add(this.jButtonAbrirOrderByMaterialProducto, this.gridBagConstraintsMaterialProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMaterialProducto.add(this.jComboBoxTiposSeleccionarMaterialProducto, this.gridBagConstraintsMaterialProducto);			
			
			
			/*
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMaterialProducto.add(this.jCheckBoxSeleccionarTodosMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MaterialProducto.add(this.jCheckBoxSeleccionarTodosMaterialProducto, this.gridBagConstraintsMaterialProducto);															
				
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMaterialProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MaterialProducto.add(this.jCheckBoxSeleccionadosMaterialProducto, this.gridBagConstraintsMaterialProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMaterialProducto.add(this.jPanelParametrosAuxiliar3MaterialProducto, this.gridBagConstraintsMaterialProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMaterialProducto.add(this.jComboBoxTiposRelacionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
				
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMaterialProducto.add(this.jComboBoxTiposAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
	
				
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMaterialProducto.add(this.jTextFieldValorCampoGeneralMaterialProducto, this.gridBagConstraintsMaterialProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMaterialProducto = new GridBagLayout();

			this.jScrollPanelDatosMaterialProducto.setLayout(gridaBagLayoutDatosMaterialProducto);
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = 0;
			this.gridBagConstraintsMaterialProducto.gridx = 0;
			
			this.jScrollPanelDatosMaterialProducto.add(this.jTableDatosMaterialProducto, this.gridBagConstraintsMaterialProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMaterialProducto.setViewportView(this.jTableDatosMaterialProducto);
		this.jTableDatosMaterialProducto.setFillsViewportHeight(true);
		this.jTableDatosMaterialProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMaterialProducto= new GridBagLayout();
		this.jPanelAccionesMaterialProducto.setLayout(gridaBagLayoutAccionesMaterialProducto);
		
		
		/*	
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 0;
			
		this.jPanelAccionesMaterialProducto.add(this.jButtonNuevoMaterialProducto, this.gridBagConstraintsMaterialProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoMaterialProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoMaterialProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoMaterialProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoMaterialProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoMaterialProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoMaterialProducto.setLayout(gridaBagLayoutBusquedaPorCodigoMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 0;
		jPanelBusquedaPorCodigoMaterialProducto.add(jLabelcodigoBusquedaPorCodigoMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 1;
		jPanelBusquedaPorCodigoMaterialProducto.add(jTextFieldcodigoBusquedaPorCodigoMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 1;
		gridBagConstraintsMaterialProducto.gridx =1;
		jPanelBusquedaPorCodigoMaterialProducto.add(jButtonBusquedaPorCodigoMaterialProducto, gridBagConstraintsMaterialProducto);

		jTabbedPaneBusquedasMaterialProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoMaterialProducto);
		jTabbedPaneBusquedasMaterialProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreMaterialProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreMaterialProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMaterialProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMaterialProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreMaterialProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreMaterialProducto.setLayout(gridaBagLayoutBusquedaPorNombreMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 0;
		jPanelBusquedaPorNombreMaterialProducto.add(jLabelnombreBusquedaPorNombreMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 1;
		jPanelBusquedaPorNombreMaterialProducto.add(jTextAreanombreBusquedaPorNombreMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 1;
		gridBagConstraintsMaterialProducto.gridx =1;
		jPanelBusquedaPorNombreMaterialProducto.add(jButtonBusquedaPorNombreMaterialProducto, gridBagConstraintsMaterialProducto);

		jTabbedPaneBusquedasMaterialProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreMaterialProducto);
		jTabbedPaneBusquedasMaterialProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoMaterialProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoMaterialProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoMaterialProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoMaterialProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoMaterialProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoMaterialProducto.setLayout(gridaBagLayoutFK_IdTipoProductoMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 0;
		jPanelFK_IdTipoProductoMaterialProducto.add(jLabelid_tipo_productoFK_IdTipoProductoMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 0;
		gridBagConstraintsMaterialProducto.gridx = 1;
		jPanelFK_IdTipoProductoMaterialProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto, gridBagConstraintsMaterialProducto);

		gridBagConstraintsMaterialProducto = new GridBagConstraints();
		gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMaterialProducto.gridy = 1;
		gridBagConstraintsMaterialProducto.gridx =1;
		jPanelFK_IdTipoProductoMaterialProducto.add(jButtonFK_IdTipoProductoMaterialProducto, gridBagConstraintsMaterialProducto);

		jTabbedPaneBusquedasMaterialProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoMaterialProducto);
		jTabbedPaneBusquedasMaterialProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMaterialProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMaterialProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();						
			this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMaterialProducto.gridx = 0;		
			//this.gridBagConstraintsMaterialProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMaterialProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMaterialProducto, this.gridBagConstraintsMaterialProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMaterialProducto.gridx = 0;		
		//this.gridBagConstraintsMaterialProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMaterialProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMaterialProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMaterialProducto.gridx = 0;		
			this.gridBagConstraintsMaterialProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMaterialProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMaterialProducto, this.gridBagConstraintsMaterialProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMaterialProducto, this.gridBagConstraintsMaterialProducto);								
		
		
		/*
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
		*/		
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMaterialProducto.gridx =0;
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMaterialProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMaterialProducto, this.gridBagConstraintsMaterialProducto);
				
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMaterialProducto, this.gridBagConstraintsMaterialProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMaterialProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMaterialProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosMaterialProducto.setLayout(gridaBagLayoutBusquedasParametrosMaterialProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMaterialProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMaterialProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMaterialProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMaterialProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMaterialProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMaterialProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMaterialProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMaterialProducto.setName("jPanelReporteDinamicoMaterialProducto"); 
		
		this.jPanelReporteDinamicoMaterialProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMaterialProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMaterialProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMaterialProducto.setLayout(gridaBagLayoutReporteDinamicoMaterialProducto);
		
		
		this.jInternalFrameReporteDinamicoMaterialProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMaterialProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMaterialProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMaterialProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMaterialProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMaterialProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMaterialProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMaterialProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMaterialProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoMaterialProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoMaterialProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMaterialProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMaterialProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMaterialProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMaterialProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteMaterialProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMaterialProducto.add(this.jLabelColumnasSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMaterialProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteMaterialProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMaterialProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMaterialProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMaterialProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMaterialProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMaterialProducto=new JScrollPane(this.jListColumnasSelectReporteMaterialProducto);
			
			this.jScrollColumnasSelectReporteMaterialProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMaterialProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMaterialProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMaterialProducto.add(this.jListColumnasSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		this.jPanelReporteDinamicoMaterialProducto.add(this.jScrollColumnasSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMaterialProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteMaterialProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMaterialProducto.add(this.jLabelRelacionesSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMaterialProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteMaterialProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMaterialProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMaterialProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMaterialProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMaterialProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMaterialProducto=new JScrollPane(this.jListRelacionesSelectReporteMaterialProducto);
			
			this.jScrollRelacionesSelectReporteMaterialProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMaterialProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMaterialProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMaterialProducto.add(this.jListRelacionesSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		this.jPanelReporteDinamicoMaterialProducto.add(this.jScrollRelacionesSelectReporteMaterialProducto, this.gridBagConstraintsMaterialProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoMaterialProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMaterialProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoMaterialProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMaterialProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMaterialProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMaterialProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMaterialProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMaterialProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMaterialProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMaterialProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMaterialProducto.add(this.jLabelGenerarExcelReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMaterialProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMaterialProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMaterialProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMaterialProducto.setToolTipText("Generar EXCEL"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMaterialProducto.add(this.jButtonGenerarExcelReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMaterialProducto.add(this.jComboBoxTiposReportesDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMaterialProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMaterialProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMaterialProducto.add(this.jLabelTiposArchivoReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMaterialProducto.add(this.jComboBoxTiposArchivosReportesDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMaterialProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMaterialProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMaterialProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMaterialProducto.setToolTipText("Generar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMaterialProducto.add(this.jButtonGenerarReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMaterialProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMaterialProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMaterialProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMaterialProducto.setToolTipText("Cancelar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMaterialProducto.add(this.jButtonCerrarReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMaterialProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMaterialProducto= new JScrollPane(jPanelReporteDinamicoMaterialProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMaterialProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMaterialProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMaterialProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMaterialProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMaterialProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMaterialProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMaterialProducto);
		this.jInternalFrameReporteDinamicoMaterialProducto.getContentPane().add(this.jScrollPanelReporteDinamicoMaterialProducto, this.gridBagConstraintsMaterialProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMaterialProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMaterialProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMaterialProducto.setName("jPanelImportacionMaterialProducto"); 
		
		this.jPanelImportacionMaterialProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMaterialProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMaterialProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMaterialProducto.setLayout(gridaBagLayoutImportacionMaterialProducto);
		
		
		this.jInternalFrameImportacionMaterialProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMaterialProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMaterialProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMaterialProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMaterialProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMaterialProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMaterialProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMaterialProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMaterialProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMaterialProducto.setResizable(true);
	    this.jInternalFrameImportacionMaterialProducto.setClosable(true);
	    this.jInternalFrameImportacionMaterialProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMaterialProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMaterialProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMaterialProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMaterialProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMaterialProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMaterialProducto.setResizable(true);
	    this.jInternalFrameImportacionMaterialProducto.setClosable(true);
	    this.jInternalFrameImportacionMaterialProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMaterialProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMaterialProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMaterialProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMaterialProducto = new JLabelMe();

		this.jLabelArchivoImportacionMaterialProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMaterialProducto.add(this.jLabelArchivoImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMaterialProducto = new JFileChooser();		
		this.jFileChooserImportacionMaterialProducto.setToolTipText("ESCOGER ARCHIVO"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMaterialProducto = new JButtonMe();
		this.jButtonAbrirImportacionMaterialProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMaterialProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMaterialProducto.setToolTipText("Generar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMaterialProducto.add(this.jButtonAbrirImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMaterialProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionMaterialProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMaterialProducto.add(this.jLabelPathArchivoImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMaterialProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMaterialProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMaterialProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMaterialProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMaterialProducto.add(this.jTextFieldPathArchivoImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMaterialProducto = new JButtonMe();
		this.jButtonGenerarImportacionMaterialProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMaterialProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMaterialProducto.setToolTipText("Generar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMaterialProducto.add(this.jButtonGenerarImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMaterialProducto = new JButtonMe();
		this.jButtonCerrarImportacionMaterialProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMaterialProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMaterialProducto.setToolTipText("Cancelar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMaterialProducto.add(this.jButtonCerrarImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMaterialProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionMaterialProducto= new JScrollPane(jPanelImportacionMaterialProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsMaterialProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMaterialProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMaterialProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMaterialProducto);
		this.jInternalFrameImportacionMaterialProducto.getContentPane().add(this.jScrollPanelImportacionMaterialProducto, this.gridBagConstraintsMaterialProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMaterialProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMaterialProducto = new JButtonMe();
			this.jButtonAbrirOrderByMaterialProducto.setText("Orden");
			this.jButtonAbrirOrderByMaterialProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMaterialProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMaterialProducto";
			inputMap = this.jButtonAbrirOrderByMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMaterialProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByMaterialProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMaterialProducto.setName("jPanelOrderByMaterialProducto"); 
			
			this.jPanelOrderByMaterialProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMaterialProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMaterialProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMaterialProducto.setLayout(gridaBagLayoutOrderByMaterialProducto);
			
			
			this.jTableDatosMaterialProductoOrderBy = new JTableMe();        
			this.jTableDatosMaterialProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMaterialProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMaterialProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMaterialProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMaterialProductoOrderBy.setViewportView(this.jTableDatosMaterialProductoOrderBy);
			this.jTableDatosMaterialProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMaterialProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMaterialProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMaterialProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMaterialProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMaterialProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMaterialProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMaterialProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMaterialProducto.setTitle("Orden");
			this.jInternalFrameOrderByMaterialProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMaterialProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMaterialProducto.setResizable(true);
			this.jInternalFrameOrderByMaterialProducto.setClosable(true);
			this.jInternalFrameOrderByMaterialProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMaterialProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMaterialProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMaterialProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMaterialProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMaterialProducto.ipady =150;
				
			this.jPanelOrderByMaterialProducto.add(jScrollPanelDatosMaterialProductoOrderBy, this.gridBagConstraintsMaterialProducto);//this.jTableDatosMaterialProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMaterialProducto = new JButtonMe();
			this.jButtonCerrarOrderByMaterialProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMaterialProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMaterialProducto.setToolTipText("Cancelar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMaterialProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMaterialProducto.add(this.jButtonCerrarOrderByMaterialProducto, this.gridBagConstraintsMaterialProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMaterialProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByMaterialProducto= new JScrollPane(jPanelOrderByMaterialProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsMaterialProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMaterialProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMaterialProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMaterialProducto);
			
			this.jInternalFrameOrderByMaterialProducto.getContentPane().add(this.jScrollPanelOrderByMaterialProducto, this.gridBagConstraintsMaterialProducto);			
		
		} else {
			this.jButtonAbrirOrderByMaterialProducto = new JButtonMe();
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
			&& this.materialproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMaterialProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMaterialProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMaterialProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMaterialProducto.getRowHeight();//MaterialProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MaterialProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMaterialProducto.isSelected()) {
					iHeightTable=MaterialProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MaterialProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MaterialProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MaterialProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMaterialProducto.isSelected()) {
					iHeightTable=MaterialProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MaterialProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MaterialProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMaterialProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMaterialProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMaterialProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMaterialProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMaterialProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMaterialProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMaterialProducto!=null && this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMaterialProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMaterialProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMaterialProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMaterialProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMaterialProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMaterialProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=materialproductoLogic.getMaterialProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=materialproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MaterialProducto> TraerMaterialProductoBeans(List<MaterialProducto> materialproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(MaterialProducto materialproducto:materialproductos) {
					
				if(!(MaterialProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MaterialProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					materialproducto.setsDetalleGeneralEntityReporte(MaterialProductoConstantesFunciones.getMaterialProductoDescripcion(materialproducto));
										
						
					
					

					if(materialproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{materialproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(materialproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(materialproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{materialproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(materialproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//materialproducto.setsDetalleGeneralEntityReporte(materialproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//materialproductobeans.add(materialproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return materialproductos;
    }
	//PARA REPORTES FIN
}
