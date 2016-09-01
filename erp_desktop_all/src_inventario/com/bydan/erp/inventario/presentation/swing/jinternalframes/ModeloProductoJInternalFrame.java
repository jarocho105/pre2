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
import com.bydan.erp.inventario.util.ModeloProductoConstantesFunciones;

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
public class ModeloProductoJInternalFrame extends ModeloProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarModeloProducto;
	
	protected JMenuBar jmenuBarModeloProducto;
	
	protected JMenu jmenuModeloProducto;
	protected JMenu jmenuDatosModeloProducto;
	protected JMenu jmenuArchivoModeloProducto;
	protected JMenu jmenuAccionesModeloProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModeloProducto;	
	protected GridBagConstraints gridBagConstraintsModeloProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ModeloProductoDetalleFormJInternalFrame jInternalFrameDetalleFormModeloProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoModeloProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionModeloProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public ModeloProductoSessionBean modeloproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ModeloProducto> modeloproductos;		
	public List<ModeloProducto> modeloproductosEliminados;	
	public List<ModeloProducto> modeloproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByModeloProducto;		
	protected JButton jButtonAbrirOrderByModeloProducto;
	
	
	//protected JPanel jPanelOrderByModeloProducto;
	//public JScrollPane jScrollPanelOrderByModeloProducto;	
	//protected JButton jButtonCerrarOrderByModeloProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ModeloProductoLogic modeloproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosModeloProducto;
	public JScrollPane jScrollPanelDatosEdicionModeloProducto;
	public JScrollPane jScrollPanelDatosGeneralModeloProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosModeloProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoModeloProducto;
	//public JScrollPane jScrollPanelImportacionModeloProducto;
	
	
	
	protected JPanel jPanelAccionesModeloProducto;
	
    protected JPanel jPanelPaginacionModeloProducto;
    protected JPanel jPanelParametrosReportesModeloProducto;
	protected JPanel jPanelParametrosReportesAccionesModeloProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ModeloProducto;
	protected JPanel jPanelParametrosAuxiliar2ModeloProducto;
	protected JPanel jPanelParametrosAuxiliar3ModeloProducto;
	protected JPanel jPanelParametrosAuxiliar4ModeloProducto;
	//protected JPanel jPanelParametrosAuxiliar5ModeloProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoModeloProducto;
	//protected JPanel jPanelImportacionModeloProducto;
	
	
	public JTable jTableDatosModeloProducto;
	
	
	
	//public JTable jTableDatosModeloProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoModeloProducto;
	protected JButton jButtonDuplicarModeloProducto;
	protected JButton jButtonCopiarModeloProducto;
	protected JButton jButtonVerFormModeloProducto;
	protected JButton jButtonNuevoRelacionesModeloProducto;
	protected JButton jButtonModificarModeloProducto;
	
    protected JButton jButtonGuardarCambiosTablaModeloProducto;
	protected JButton jButtonCerrarModeloProducto;
	
	
	protected JButton jButtonRecargarInformacionModeloProducto;
	protected JButton jButtonProcesarInformacionModeloProducto;
	
	
	protected JButton jButtonAnterioresModeloProducto;
	protected JButton jButtonSiguientesModeloProducto;
	protected JButton jButtonNuevoGuardarCambiosModeloProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoModeloProducto;
	//protected JButton jButtonCerrarReporteDinamicoModeloProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoModeloProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionModeloProducto;
	//protected JButton jButtonGenerarImportacionModeloProducto;
	//protected JButton jButtonCerrarImportacionModeloProducto;
	//protected JFileChooser jFileChooserImportacionModeloProducto;
	//protected File fileImportacionModeloProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModeloProducto;
	protected JButton jButtonDuplicarToolBarModeloProducto;
	protected JButton jButtonNuevoRelacionesToolBarModeloProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarModeloProducto;
	protected JButton jButtonCopiarToolBarModeloProducto;
	protected JButton jButtonVerFormToolBarModeloProducto;
	public JButton jButtonGuardarCambiosTablaToolBarModeloProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarModeloProducto;
	protected JButton jButtonCerrarToolBarModeloProducto;
	
	protected JButton jButtonRecargarInformacionToolBarModeloProducto;
	protected JButton jButtonProcesarInformacionToolBarModeloProducto;
	protected JButton jButtonAnterioresToolBarModeloProducto;
	protected JButton jButtonSiguientesToolBarModeloProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarModeloProducto;
	protected JButton jButtonAbrirOrderByToolBarModeloProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModeloProducto;
	protected JMenuItem jMenuItemDuplicarModeloProducto;
	protected JMenuItem jMenuItemNuevoRelacionesModeloProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosModeloProducto;
	protected JMenuItem jMenuItemCopiarModeloProducto;
	protected JMenuItem jMenuItemVerFormModeloProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaModeloProducto;
	protected JMenuItem jMenuItemCerrarModeloProducto;
	protected JMenuItem jMenuItemDetalleCerrarModeloProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByModeloProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarModeloProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionModeloProducto;
	protected JMenuItem jMenuItemProcesarInformacionModeloProducto;
	protected JMenuItem jMenuItemAnterioresModeloProducto;
	protected JMenuItem jMenuItemSiguientesModeloProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModeloProducto;
	protected JMenuItem jMenuItemAbrirOrderByModeloProducto;
	protected JMenuItem jMenuItemMostrarOcultarModeloProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModeloProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosModeloProducto;
	protected JCheckBox jCheckBoxSeleccionadosModeloProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaModeloProducto;
	protected JCheckBox jCheckBoxConGraficoReporteModeloProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesModeloProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesModeloProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoModeloProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoModeloProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesModeloProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionModeloProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModeloProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModeloProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarModeloProducto;
	protected JTextField jTextFieldValorCampoGeneralModeloProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteModeloProducto;
	//public JList<Reporte> jListColumnasSelectReporteModeloProducto;
	//public JScrollPane jScrollColumnasSelectReporteModeloProducto;
	
	//public JLabel jLabelRelacionesSelectReporteModeloProducto;
	//public JList<Reporte> jListRelacionesSelectReporteModeloProducto;
	//public JScrollPane jScrollRelacionesSelectReporteModeloProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoModeloProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoModeloProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoModeloProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoModeloProducto;
	
		
	//public JLabel jLabelArchivoImportacionModeloProducto;	
	//public JLabel jLabelPathArchivoImportacionModeloProducto;
	//protected JTextField jTextFieldPathArchivoImportacionModeloProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoModeloProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoModeloProducto;
	
	//public JLabel jLabelColumnaCategoriaValorModeloProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorModeloProducto;
	
	//public JLabel jLabelColumnasValoresGraficoModeloProducto;
	//public JList<Reporte> jListColumnasValoresGraficoModeloProducto;
	//public JScrollPane jScrollColumnasValoresGraficoModeloProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoModeloProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoModeloProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasModeloProducto;
	public JPanel jPanelBusquedaPorCodigoModeloProducto;
	public JButton jButtonBusquedaPorCodigoModeloProducto;
	public JPanel jPanelBusquedaPorNombreModeloProducto;
	public JButton jButtonBusquedaPorNombreModeloProducto;
	public JPanel jPanelFK_IdTipoProductoModeloProducto;
	public JButton jButtonFK_IdTipoProductoModeloProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoModeloProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoModeloProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoModeloProducto;
	public JButton jButtoncodigoBusquedaPorCodigoModeloProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreModeloProducto;
	public JLabel jLabelnombreBusquedaPorNombreModeloProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreModeloProducto;
	public JButton jButtonnombreBusquedaPorNombreModeloProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoModeloProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoModeloProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoModeloProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoModeloProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoModeloProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public ModeloProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionModeloProducto)	{
		this.jButtonRecargarInformacionModeloProducto = jButtonRecargarInformacionModeloProducto;
	}
	
	public JButton getjButtonProcesarInformacionModeloProducto() {
		return this.jButtonProcesarInformacionModeloProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModeloProducto)	{
		this.jButtonProcesarInformacionModeloProducto = jButtonProcesarInformacionModeloProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionModeloProducto() {
		return this.jButtonRecargarInformacionModeloProducto;
	}
	
	
	public List<ModeloProducto> getmodeloproductos() {
		return this.modeloproductos;
	}

	public void setmodeloproductos(List<ModeloProducto> modeloproductos) {
		this.modeloproductos = modeloproductos;
	}
	
	public List<ModeloProducto> getmodeloproductosAux() {
		return this.modeloproductosAux;
	}

	public void setmodeloproductosAux(List<ModeloProducto> modeloproductosAux) {
		this.modeloproductosAux = modeloproductosAux;
	}
	
	public List<ModeloProducto> getmodeloproductosEliminados() {
		return this.modeloproductosEliminados;
	}

	public void setModeloProductosEliminados(List<ModeloProducto> modeloproductosEliminados) {
		this.modeloproductosEliminados = modeloproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarModeloProducto() {
		return jComboBoxTiposSeleccionarModeloProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarModeloProducto(
			JComboBox jComboBoxTiposSeleccionarModeloProducto) {
		this.jComboBoxTiposSeleccionarModeloProducto = jComboBoxTiposSeleccionarModeloProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarModeloProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralModeloProducto() {
		return jTextFieldValorCampoGeneralModeloProducto;
	}

	public void setjTextFieldValorCampoGeneralModeloProducto(
			JTextField jTextFieldValorCampoGeneralModeloProducto) {
		this.jTextFieldValorCampoGeneralModeloProducto = jTextFieldValorCampoGeneralModeloProducto;
	}

	public void setBorderResaltarValorCampoGeneralModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralModeloProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosModeloProducto() {
		return this.jCheckBoxSeleccionarTodosModeloProducto;
	}

	public void setjCheckBoxSeleccionarTodosModeloProducto(
			JCheckBox jCheckBoxSeleccionarTodosModeloProducto) {
		this.jCheckBoxSeleccionarTodosModeloProducto = jCheckBoxSeleccionarTodosModeloProducto;
	}

	public void setBorderResaltarSeleccionarTodosModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosModeloProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosModeloProducto() {
		return this.jCheckBoxSeleccionadosModeloProducto;
	}

	public void setjCheckBoxSeleccionadosModeloProducto(
			JCheckBox jCheckBoxSeleccionadosModeloProducto) {
		this.jCheckBoxSeleccionadosModeloProducto = jCheckBoxSeleccionadosModeloProducto;
	}
	
	public void setBorderResaltarSeleccionadosModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosModeloProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesModeloProducto() {
		return this.jComboBoxTiposArchivosReportesModeloProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesModeloProducto(
			JComboBox jComboBoxTiposArchivosReportesModeloProducto) {
		this.jComboBoxTiposArchivosReportesModeloProducto = jComboBoxTiposArchivosReportesModeloProducto;
	}

	public void setBorderResaltarTiposArchivosReportesModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesModeloProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesModeloProducto() {
		return this.jComboBoxTiposReportesModeloProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesModeloProducto(
			JComboBox jComboBoxTiposReportesModeloProducto) {
		this.jComboBoxTiposReportesModeloProducto = jComboBoxTiposReportesModeloProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoModeloProducto() {
	//	return jComboBoxTiposReportesDinamicoModeloProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoModeloProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoModeloProducto) {
	//	this.jComboBoxTiposReportesDinamicoModeloProducto = jComboBoxTiposReportesDinamicoModeloProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoModeloProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoModeloProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoModeloProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoModeloProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoModeloProducto = jComboBoxTiposArchivosReportesDinamicoModeloProducto;
	//}
	
	public void setBorderResaltarTiposReportesModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesModeloProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesModeloProducto() {
		return this.jComboBoxTiposGraficosReportesModeloProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesModeloProducto(
			JComboBox jComboBoxTiposGraficosReportesModeloProducto) {
		this.jComboBoxTiposGraficosReportesModeloProducto = jComboBoxTiposGraficosReportesModeloProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesModeloProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionModeloProducto() {
		return this.jComboBoxTiposPaginacionModeloProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionModeloProducto(
			JComboBox jComboBoxTiposPaginacionModeloProducto) {
		this.jComboBoxTiposPaginacionModeloProducto = jComboBoxTiposPaginacionModeloProducto;
	}
	
	public void setBorderResaltarTiposPaginacionModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionModeloProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesModeloProducto() {
		return this.jComboBoxTiposRelacionesModeloProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModeloProducto() {
		return this.jComboBoxTiposAccionesModeloProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModeloProducto(
			JComboBox jComboBoxTiposRelacionesModeloProducto) {
		this.jComboBoxTiposRelacionesModeloProducto = jComboBoxTiposRelacionesModeloProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModeloProducto(
			JComboBox jComboBoxTiposAccionesModeloProducto) {
		this.jComboBoxTiposAccionesModeloProducto = jComboBoxTiposAccionesModeloProducto;
	}
	
	public void setBorderResaltarTiposRelacionesModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesModeloProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesModeloProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModeloProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesModeloProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoModeloProducto() {
	//	return jCheckBoxConGraficoDinamicoModeloProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoModeloProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoModeloProducto) {
	//	this.jCheckBoxConGraficoDinamicoModeloProducto = jCheckBoxConGraficoDinamicoModeloProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoModeloProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarModeloProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoModeloProducto .setBorder(borderResaltar);		
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
		this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		
		this.modeloproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modeloproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.modeloproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModeloProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modelo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarModeloProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"nuevo","nuevo","Nuevo"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"duplicar","duplicar","Duplicar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"copiar","copiar","Copiar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"ver_form","ver_form","Ver"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"recargar","recargar","Recargar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarModeloProducto,this.jTtoolBarModeloProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarModeloProducto,this.jTtoolBarModeloProducto,
							"cerrar","cerrar","Salir"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarModeloProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarModeloProducto;
			
				this.jButtonProcesarInformacionToolBarModeloProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarModeloProducto;
				
		//protected JButton jButtonModificarToolBarModeloProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarModeloProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuModeloProducto=new JMenuMe("General");
		this.jmenuArchivoModeloProducto=new JMenuMe("Archivo");
		this.jmenuAccionesModeloProducto=new JMenuMe("Acciones");
		this.jmenuDatosModeloProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModeloProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModeloProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModeloProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarModeloProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarModeloProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarModeloProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesModeloProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesModeloProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesModeloProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosModeloProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModeloProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModeloProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarModeloProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarModeloProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarModeloProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormModeloProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormModeloProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormModeloProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaModeloProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaModeloProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaModeloProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModeloProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModeloProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModeloProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionModeloProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionModeloProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionModeloProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionModeloProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionModeloProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionModeloProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresModeloProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresModeloProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresModeloProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesModeloProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesModeloProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesModeloProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByModeloProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByModeloProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByModeloProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModeloProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModeloProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModeloProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByModeloProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByModeloProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByModeloProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModeloProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModeloProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModeloProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosModeloProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosModeloProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosModeloProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoModeloProducto.add(this.jMenuItemCerrarModeloProducto);
			
			this.jmenuAccionesModeloProducto.add(this.jMenuItemNuevoModeloProducto);
			this.jmenuAccionesModeloProducto.add(this.jMenuItemNuevoGuardarCambiosModeloProducto);
			this.jmenuAccionesModeloProducto.add(this.jMenuItemNuevoRelacionesModeloProducto);
			this.jmenuAccionesModeloProducto.add(this.jMenuItemGuardarCambiosTablaModeloProducto);		
			this.jmenuAccionesModeloProducto.add(this.jMenuItemDuplicarModeloProducto);		
			this.jmenuAccionesModeloProducto.add(this.jMenuItemCopiarModeloProducto);		
			this.jmenuAccionesModeloProducto.add(this.jMenuItemVerFormModeloProducto);		
			
			this.jmenuDatosModeloProducto.add(this.jMenuItemRecargarInformacionModeloProducto);				
			this.jmenuDatosModeloProducto.add(this.jMenuItemAnterioresModeloProducto);				
			this.jmenuDatosModeloProducto.add(this.jMenuItemSiguientesModeloProducto);				
			this.jmenuDatosModeloProducto.add(this.jMenuItemAbrirOrderByModeloProducto);				
			this.jmenuDatosModeloProducto.add(this.jMenuItemMostrarOcultarModeloProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesModeloProducto.add(this.jMenuItemGuardarCambiosModeloProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarModeloProducto.add(this.jmenuArchivoModeloProducto);		
			this.jmenuBarModeloProducto.add(this.jmenuAccionesModeloProducto);		
			this.jmenuBarModeloProducto.add(this.jmenuDatosModeloProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarModeloProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasModeloProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoModeloProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoModeloProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoModeloProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoModeloProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoModeloProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoModeloProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoModeloProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoModeloProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoModeloProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreModeloProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreModeloProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreModeloProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreModeloProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreModeloProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreModeloProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreModeloProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreModeloProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreModeloProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoModeloProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoModeloProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoModeloProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoModeloProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoModeloProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasModeloProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasModeloProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasModeloProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasModeloProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasModeloProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleModeloProducto = new ModeloProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Modelo Producto DATOS");
			this.jInternalFrameDetalleFormModeloProducto = new ModeloProductoDetalleFormJInternalFrame(jDesktopPane,this.modeloproductoSessionBean.getConGuardarRelaciones(),this.modeloproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormModeloProducto = null;//new ModeloProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModeloProducto= new GridBagLayout();
		
		
		this.jTableDatosModeloProducto = new JTableMe();      
		
		String sToolTipModeloProducto="";
		sToolTipModeloProducto=ModeloProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModeloProducto+="(Inventario.ModeloProducto)";
		}
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipModeloProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosModeloProducto.setToolTipText(sToolTipModeloProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosModeloProducto);
		this.jTableDatosModeloProducto.setAutoCreateRowSorter(true);
		this.jTableDatosModeloProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosModeloProducto.setRowSelectionAllowed(true);
		this.jTableDatosModeloProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosModeloProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoModeloProducto = new JButtonMe();
		this.jButtonDuplicarModeloProducto = new JButtonMe();
		this.jButtonCopiarModeloProducto = new JButtonMe();
		this.jButtonVerFormModeloProducto = new JButtonMe();
		this.jButtonNuevoRelacionesModeloProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaModeloProducto = new JButtonMe();
		this.jButtonCerrarModeloProducto = new JButtonMe();
		
		this.jScrollPanelDatosModeloProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralModeloProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Modelo Producto";
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosModeloProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModeloProducto.setToolTipText("Acciones");
        this.jPanelAccionesModeloProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoModeloProducto=new ReporteDinamicoJInternalFrame(ModeloProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoModeloProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionModeloProducto=new ImportacionJInternalFrame(ModeloProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionModeloProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByModeloProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByModeloProducto.setText("Orden");
		this.jButtonAbrirOrderByModeloProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModeloProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModeloProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModeloProducto,false,this);
			
			//this.cargarOrderByModeloProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModeloProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModeloProducto,true,this);
			
			//this.cargarOrderByModeloProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosModeloProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosModeloProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosModeloProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosModeloProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosModeloProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosModeloProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoModeloProducto.setText("Nuevo");
		this.jButtonDuplicarModeloProducto.setText("Duplicar");
		this.jButtonCopiarModeloProducto.setText("Copiar");
		this.jButtonVerFormModeloProducto.setText("Ver");
		this.jButtonNuevoRelacionesModeloProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaModeloProducto.setText("Guardar");
		this.jButtonCerrarModeloProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModeloProducto,"nuevo_button","Nuevo",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarModeloProducto,"duplicar_button","Duplicar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarModeloProducto,"copiar_button","Copiar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormModeloProducto,"ver_form","Ver",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesModeloProducto,"nuevorelaciones_button","Nuevo Rel",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModeloProducto,"guardarcambiostabla_button","Guardar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModeloProducto,"cerrar_button","Salir",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoModeloProducto.setToolTipText("Nuevo"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarModeloProducto.setToolTipText("Duplicar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarModeloProducto.setToolTipText("Copiar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormModeloProducto.setToolTipText("Ver"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesModeloProducto.setToolTipText("Nuevo Rel"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaModeloProducto.setToolTipText("Guardar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModeloProducto.setToolTipText("Salir"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModeloProducto";
		inputMap = this.jButtonNuevoModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModeloProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModeloProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarModeloProducto";
		inputMap = this.jButtonDuplicarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarModeloProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarModeloProducto"));
		
		//COPIAR
		sMapKey = "CopiarModeloProducto";
		inputMap = this.jButtonCopiarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarModeloProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarModeloProducto"));
		
		//VEr FORM
		sMapKey = "VerFormModeloProducto";
		inputMap = this.jButtonVerFormModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormModeloProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormModeloProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesModeloProducto";
		inputMap = this.jButtonNuevoRelacionesModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesModeloProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarModeloProducto";
		inputMap = this.jButtonModificarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarModeloProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarModeloProducto";
		inputMap = this.jButtonCerrarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModeloProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModeloProducto";
		inputMap = this.jButtonGuardarCambiosTablaModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModeloProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesModeloProducto.setName("jPanelParametrosReportesModeloProducto"); 
		
		this.jPanelParametrosReportesAccionesModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesModeloProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesModeloProducto.setName("jPanelParametrosReportesAccionesModeloProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionModeloProducto = new JButtonMe();
		this.jButtonRecargarInformacionModeloProducto.setText("Recargar");
		this.jButtonRecargarInformacionModeloProducto.setToolTipText("Recargar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionModeloProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionModeloProducto = new JButtonMe();
		this.jButtonProcesarInformacionModeloProducto.setText("Procesar");
		this.jButtonProcesarInformacionModeloProducto.setToolTipText("Procesar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionModeloProducto.setVisible(false);
			
		this.jButtonProcesarInformacionModeloProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModeloProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModeloProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModeloProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesModeloProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModeloProducto.setText("TIPO");       
		this.jComboBoxTiposReportesModeloProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModeloProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesModeloProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionModeloProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionModeloProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesModeloProducto.setText("Accion");
		this.jComboBoxTiposRelacionesModeloProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModeloProducto.setText("Accion");
		this.jComboBoxTiposAccionesModeloProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarModeloProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarModeloProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralModeloProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralModeloProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModeloProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModeloProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesModeloProducto = new JLabelMe();
		
		this.jLabelAccionesModeloProducto.setText("Acciones");		
		this.jLabelAccionesModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosModeloProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosModeloProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosModeloProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosModeloProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosModeloProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosModeloProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaModeloProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaModeloProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaModeloProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteModeloProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteModeloProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteModeloProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresModeloProducto = new JButtonMe();
		//this.jButtonAnterioresModeloProducto.setText("<<");
        this.jButtonAnterioresModeloProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresModeloProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesModeloProducto = new JButtonMe();
		//this.jButtonSiguientesModeloProducto.setText(">>");
        this.jButtonSiguientesModeloProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesModeloProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosModeloProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosModeloProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosModeloProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosModeloProducto,"nuevoguardarcambios_button","Nue",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosModeloProducto";
		inputMap = this.jButtonNuevoGuardarCambiosModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosModeloProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionModeloProducto";
		inputMap = this.jButtonRecargarInformacionModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionModeloProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesModeloProducto";
		inputMap = this.jButtonSiguientesModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesModeloProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresModeloProducto";
		inputMap = this.jButtonAnterioresModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresModeloProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasModeloProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesModeloProducto.setMinimumSize(new Dimension(this.getWidth(),ModeloProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModeloProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModeloProducto.setMaximumSize(new Dimension(this.getWidth(),ModeloProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModeloProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModeloProducto.setPreferredSize(new Dimension(this.getWidth(),ModeloProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModeloProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionModeloProducto = new GridBagLayout();

			this.jPanelPaginacionModeloProducto.setLayout(gridaBagLayoutPaginacionModeloProducto);						
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 0;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionModeloProducto.add(this.jButtonAnterioresModeloProducto, this.gridBagConstraintsModeloProducto);
					
						
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModeloProducto.gridy = 0;
			
			this.jPanelPaginacionModeloProducto.add(this.jButtonNuevoGuardarCambiosModeloProducto, this.gridBagConstraintsModeloProducto);
						
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModeloProducto.gridy = 0;
			this.jPanelPaginacionModeloProducto.add(this.jButtonSiguientesModeloProducto, this.gridBagConstraintsModeloProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 1;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModeloProducto.add(this.jButtonNuevoModeloProducto, this.gridBagConstraintsModeloProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsModeloProducto.gridy = 1;
				this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionModeloProducto.add(this.jButtonNuevoRelacionesModeloProducto, this.gridBagConstraintsModeloProducto);
			}
			
			
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsModeloProducto.gridy = 1;
				this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionModeloProducto.add(this.jButtonGuardarCambiosTablaModeloProducto, this.gridBagConstraintsModeloProducto);
			}
			
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 1;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModeloProducto.add(this.jButtonDuplicarModeloProducto, this.gridBagConstraintsModeloProducto);
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 1;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModeloProducto.add(this.jButtonCopiarModeloProducto, this.gridBagConstraintsModeloProducto);
		
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 1;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModeloProducto.add(this.jButtonVerFormModeloProducto, this.gridBagConstraintsModeloProducto);
		
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 1;
			this.gridBagConstraintsModeloProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionModeloProducto.add(this.jButtonCerrarModeloProducto, this.gridBagConstraintsModeloProducto);
		
		
		
		this.jButtonRecargarInformacionModeloProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModeloProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModeloProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesModeloProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModeloProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModeloProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesModeloProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModeloProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModeloProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesModeloProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModeloProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModeloProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionModeloProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModeloProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModeloProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesModeloProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModeloProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModeloProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesModeloProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModeloProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModeloProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarModeloProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModeloProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModeloProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaModeloProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModeloProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModeloProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteModeloProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModeloProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModeloProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosModeloProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModeloProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModeloProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosModeloProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModeloProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModeloProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesModeloProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesModeloProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ModeloProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ModeloProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ModeloProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ModeloProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesModeloProducto.setLayout(gridaBagParametrosReportesModeloProducto);
			this.jPanelParametrosReportesAccionesModeloProducto.setLayout(gridaBagParametrosReportesAccionesModeloProducto);
			
			
			this.jPanelParametrosAuxiliar1ModeloProducto.setLayout(gridaBagParametrosAuxiliar1ModeloProducto);
			this.jPanelParametrosAuxiliar2ModeloProducto.setLayout(gridaBagParametrosAuxiliar2ModeloProducto);
			this.jPanelParametrosAuxiliar3ModeloProducto.setLayout(gridaBagParametrosAuxiliar3ModeloProducto);
			this.jPanelParametrosAuxiliar4ModeloProducto.setLayout(gridaBagParametrosAuxiliar4ModeloProducto);
			//this.jPanelParametrosAuxiliar5ModeloProducto.setLayout(gridaBagParametrosAuxiliar2ModeloProducto);			
			
			
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModeloProducto.add(this.jButtonRecargarInformacionModeloProducto, this.gridBagConstraintsModeloProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModeloProducto.add(this.jComboBoxTiposPaginacionModeloProducto, this.gridBagConstraintsModeloProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModeloProducto.add(this.jCheckBoxConAltoMaximoTablaModeloProducto, this.gridBagConstraintsModeloProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModeloProducto.add(this.jComboBoxTiposArchivosReportesModeloProducto, this.gridBagConstraintsModeloProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModeloProducto.add(this.jPanelParametrosAuxiliar1ModeloProducto, this.gridBagConstraintsModeloProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ModeloProducto.add(this.jComboBoxTiposReportesModeloProducto, this.gridBagConstraintsModeloProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModeloProducto.add(this.jPanelParametrosAuxiliar4ModeloProducto, this.gridBagConstraintsModeloProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModeloProducto.add(this.jComboBoxTiposReportesModeloProducto, this.gridBagConstraintsModeloProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModeloProducto.add(this.jCheckBoxGenerarReporteModeloProducto, this.gridBagConstraintsModeloProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModeloProducto.add(this.jPanelParametrosAuxiliar2ModeloProducto, this.gridBagConstraintsModeloProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModeloProducto.add(this.jLabelAccionesModeloProducto, this.gridBagConstraintsModeloProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesModeloProducto.add(this.jButtonAbrirOrderByModeloProducto, this.gridBagConstraintsModeloProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModeloProducto.add(this.jComboBoxTiposSeleccionarModeloProducto, this.gridBagConstraintsModeloProducto);			
			
			
			/*
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModeloProducto.add(this.jCheckBoxSeleccionarTodosModeloProducto, this.gridBagConstraintsModeloProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ModeloProducto.add(this.jCheckBoxSeleccionarTodosModeloProducto, this.gridBagConstraintsModeloProducto);															
				
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModeloProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ModeloProducto.add(this.jCheckBoxSeleccionadosModeloProducto, this.gridBagConstraintsModeloProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModeloProducto.add(this.jPanelParametrosAuxiliar3ModeloProducto, this.gridBagConstraintsModeloProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModeloProducto.add(this.jComboBoxTiposRelacionesModeloProducto, this.gridBagConstraintsModeloProducto);
				
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModeloProducto.add(this.jComboBoxTiposAccionesModeloProducto, this.gridBagConstraintsModeloProducto);
	
				
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModeloProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModeloProducto.add(this.jTextFieldValorCampoGeneralModeloProducto, this.gridBagConstraintsModeloProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosModeloProducto = new GridBagLayout();

			this.jScrollPanelDatosModeloProducto.setLayout(gridaBagLayoutDatosModeloProducto);
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = 0;
			this.gridBagConstraintsModeloProducto.gridx = 0;
			
			this.jScrollPanelDatosModeloProducto.add(this.jTableDatosModeloProducto, this.gridBagConstraintsModeloProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosModeloProducto.setViewportView(this.jTableDatosModeloProducto);
		this.jTableDatosModeloProducto.setFillsViewportHeight(true);
		this.jTableDatosModeloProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesModeloProducto= new GridBagLayout();
		this.jPanelAccionesModeloProducto.setLayout(gridaBagLayoutAccionesModeloProducto);
		
		
		/*	
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 0;
			
		this.jPanelAccionesModeloProducto.add(this.jButtonNuevoModeloProducto, this.gridBagConstraintsModeloProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoModeloProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoModeloProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoModeloProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoModeloProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoModeloProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoModeloProducto.setLayout(gridaBagLayoutBusquedaPorCodigoModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 0;
		jPanelBusquedaPorCodigoModeloProducto.add(jLabelcodigoBusquedaPorCodigoModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 1;
		jPanelBusquedaPorCodigoModeloProducto.add(jTextFieldcodigoBusquedaPorCodigoModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 1;
		gridBagConstraintsModeloProducto.gridx =1;
		jPanelBusquedaPorCodigoModeloProducto.add(jButtonBusquedaPorCodigoModeloProducto, gridBagConstraintsModeloProducto);

		jTabbedPaneBusquedasModeloProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoModeloProducto);
		jTabbedPaneBusquedasModeloProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreModeloProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreModeloProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreModeloProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreModeloProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreModeloProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreModeloProducto.setLayout(gridaBagLayoutBusquedaPorNombreModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 0;
		jPanelBusquedaPorNombreModeloProducto.add(jLabelnombreBusquedaPorNombreModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 1;
		jPanelBusquedaPorNombreModeloProducto.add(jTextAreanombreBusquedaPorNombreModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 1;
		gridBagConstraintsModeloProducto.gridx =1;
		jPanelBusquedaPorNombreModeloProducto.add(jButtonBusquedaPorNombreModeloProducto, gridBagConstraintsModeloProducto);

		jTabbedPaneBusquedasModeloProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreModeloProducto);
		jTabbedPaneBusquedasModeloProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoModeloProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoModeloProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoModeloProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoModeloProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoModeloProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoModeloProducto.setLayout(gridaBagLayoutFK_IdTipoProductoModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 0;
		jPanelFK_IdTipoProductoModeloProducto.add(jLabelid_tipo_productoFK_IdTipoProductoModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 0;
		gridBagConstraintsModeloProducto.gridx = 1;
		jPanelFK_IdTipoProductoModeloProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto, gridBagConstraintsModeloProducto);

		gridBagConstraintsModeloProducto = new GridBagConstraints();
		gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModeloProducto.gridy = 1;
		gridBagConstraintsModeloProducto.gridx =1;
		jPanelFK_IdTipoProductoModeloProducto.add(jButtonFK_IdTipoProductoModeloProducto, gridBagConstraintsModeloProducto);

		jTabbedPaneBusquedasModeloProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoModeloProducto);
		jTabbedPaneBusquedasModeloProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModeloProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModeloProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();						
			this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModeloProducto.gridx = 0;		
			//this.gridBagConstraintsModeloProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModeloProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarModeloProducto, this.gridBagConstraintsModeloProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsModeloProducto.gridx = 0;		
		//this.gridBagConstraintsModeloProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsModeloProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsModeloProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModeloProducto.gridx = 0;		
			this.gridBagConstraintsModeloProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsModeloProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasModeloProducto, this.gridBagConstraintsModeloProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesModeloProducto, this.gridBagConstraintsModeloProducto);								
		
		
		/*
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesModeloProducto, this.gridBagConstraintsModeloProducto);
		*/		
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModeloProducto.gridx =0;
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModeloProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModeloProducto, this.gridBagConstraintsModeloProducto);
				
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionModeloProducto, this.gridBagConstraintsModeloProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosModeloProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModeloProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosModeloProducto.setLayout(gridaBagLayoutBusquedasParametrosModeloProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralModeloProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModeloProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModeloProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModeloProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModeloProducto, this.gridBagConstraintsModeloProducto);
			
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModeloProducto, this.gridBagConstraintsModeloProducto);
		
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModeloProducto, this.gridBagConstraintsModeloProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralModeloProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoModeloProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoModeloProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoModeloProducto.setName("jPanelReporteDinamicoModeloProducto"); 
		
		this.jPanelReporteDinamicoModeloProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModeloProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModeloProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoModeloProducto.setLayout(gridaBagLayoutReporteDinamicoModeloProducto);
		
		
		this.jInternalFrameReporteDinamicoModeloProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoModeloProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModeloProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoModeloProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoModeloProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoModeloProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoModeloProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoModeloProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoModeloProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoModeloProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoModeloProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoModeloProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModeloProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModeloProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteModeloProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteModeloProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoModeloProducto.add(this.jLabelColumnasSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteModeloProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteModeloProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteModeloProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteModeloProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModeloProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModeloProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteModeloProducto=new JScrollPane(this.jListColumnasSelectReporteModeloProducto);
			
			this.jScrollColumnasSelectReporteModeloProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModeloProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModeloProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoModeloProducto.add(this.jListColumnasSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		this.jPanelReporteDinamicoModeloProducto.add(this.jScrollColumnasSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteModeloProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteModeloProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoModeloProducto.add(this.jLabelRelacionesSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteModeloProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteModeloProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteModeloProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteModeloProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModeloProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModeloProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteModeloProducto=new JScrollPane(this.jListRelacionesSelectReporteModeloProducto);
			
			this.jScrollRelacionesSelectReporteModeloProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModeloProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModeloProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoModeloProducto.add(this.jListRelacionesSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		this.jPanelReporteDinamicoModeloProducto.add(this.jScrollRelacionesSelectReporteModeloProducto, this.gridBagConstraintsModeloProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoModeloProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoModeloProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoModeloProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoModeloProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoModeloProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoModeloProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModeloProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModeloProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoModeloProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoModeloProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoModeloProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModeloProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModeloProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoModeloProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoModeloProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModeloProducto.add(this.jLabelGenerarExcelReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoModeloProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoModeloProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoModeloProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoModeloProducto.setToolTipText("Generar EXCEL"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoModeloProducto.add(this.jButtonGenerarExcelReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModeloProducto.add(this.jComboBoxTiposReportesDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoModeloProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoModeloProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModeloProducto.add(this.jLabelTiposArchivoReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModeloProducto.add(this.jComboBoxTiposArchivosReportesDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoModeloProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoModeloProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoModeloProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoModeloProducto.setToolTipText("Generar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModeloProducto.add(this.jButtonGenerarReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoModeloProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoModeloProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoModeloProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoModeloProducto.setToolTipText("Cancelar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModeloProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModeloProducto.add(this.jButtonCerrarReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalModeloProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoModeloProducto= new JScrollPane(jPanelReporteDinamicoModeloProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoModeloProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModeloProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModeloProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsModeloProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoModeloProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoModeloProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalModeloProducto);
		this.jInternalFrameReporteDinamicoModeloProducto.getContentPane().add(this.jScrollPanelReporteDinamicoModeloProducto, this.gridBagConstraintsModeloProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionModeloProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionModeloProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionModeloProducto.setName("jPanelImportacionModeloProducto"); 
		
		this.jPanelImportacionModeloProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModeloProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModeloProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionModeloProducto.setLayout(gridaBagLayoutImportacionModeloProducto);
		
		
		this.jInternalFrameImportacionModeloProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionModeloProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionModeloProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModeloProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionModeloProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModeloProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModeloProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionModeloProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModeloProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModeloProducto.setResizable(true);
	    this.jInternalFrameImportacionModeloProducto.setClosable(true);
	    this.jInternalFrameImportacionModeloProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionModeloProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModeloProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModeloProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionModeloProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModeloProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModeloProducto.setResizable(true);
	    this.jInternalFrameImportacionModeloProducto.setClosable(true);
	    this.jInternalFrameImportacionModeloProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionModeloProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModeloProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModeloProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionModeloProducto = new JLabelMe();

		this.jLabelArchivoImportacionModeloProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModeloProducto.add(this.jLabelArchivoImportacionModeloProducto, this.gridBagConstraintsModeloProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionModeloProducto = new JFileChooser();		
		this.jFileChooserImportacionModeloProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionModeloProducto = new JButtonMe();
		this.jButtonAbrirImportacionModeloProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionModeloProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionModeloProducto.setToolTipText("Generar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModeloProducto.add(this.jButtonAbrirImportacionModeloProducto, this.gridBagConstraintsModeloProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionModeloProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionModeloProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModeloProducto.add(this.jLabelPathArchivoImportacionModeloProducto, this.gridBagConstraintsModeloProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionModeloProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionModeloProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModeloProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModeloProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModeloProducto.add(this.jTextFieldPathArchivoImportacionModeloProducto, this.gridBagConstraintsModeloProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionModeloProducto = new JButtonMe();
		this.jButtonGenerarImportacionModeloProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionModeloProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionModeloProducto.setToolTipText("Generar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModeloProducto.add(this.jButtonGenerarImportacionModeloProducto, this.gridBagConstraintsModeloProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionModeloProducto = new JButtonMe();
		this.jButtonCerrarImportacionModeloProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionModeloProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionModeloProducto.setToolTipText("Cancelar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsModeloProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModeloProducto.add(this.jButtonCerrarImportacionModeloProducto, this.gridBagConstraintsModeloProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalModeloProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionModeloProducto= new JScrollPane(jPanelImportacionModeloProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsModeloProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionModeloProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionModeloProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalModeloProducto);
		this.jInternalFrameImportacionModeloProducto.getContentPane().add(this.jScrollPanelImportacionModeloProducto, this.gridBagConstraintsModeloProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByModeloProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByModeloProducto = new JButtonMe();
			this.jButtonAbrirOrderByModeloProducto.setText("Orden");
			this.jButtonAbrirOrderByModeloProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModeloProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByModeloProducto";
			inputMap = this.jButtonAbrirOrderByModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByModeloProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByModeloProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByModeloProducto.setName("jPanelOrderByModeloProducto"); 
			
			this.jPanelOrderByModeloProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModeloProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModeloProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByModeloProducto.setLayout(gridaBagLayoutOrderByModeloProducto);
			
			
			this.jTableDatosModeloProductoOrderBy = new JTableMe();        
			this.jTableDatosModeloProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosModeloProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosModeloProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosModeloProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosModeloProductoOrderBy.setViewportView(this.jTableDatosModeloProductoOrderBy);
			this.jTableDatosModeloProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosModeloProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByModeloProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByModeloProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByModeloProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteModeloProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByModeloProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByModeloProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByModeloProducto.setTitle("Orden");
			this.jInternalFrameOrderByModeloProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByModeloProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByModeloProducto.setResizable(true);
			this.jInternalFrameOrderByModeloProducto.setClosable(true);
			this.jInternalFrameOrderByModeloProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByModeloProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModeloProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModeloProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsModeloProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsModeloProducto.ipady =150;
				
			this.jPanelOrderByModeloProducto.add(jScrollPanelDatosModeloProductoOrderBy, this.gridBagConstraintsModeloProducto);//this.jTableDatosModeloProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByModeloProducto = new JButtonMe();
			this.jButtonCerrarOrderByModeloProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByModeloProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByModeloProducto.setToolTipText("Cancelar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsModeloProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByModeloProducto.add(this.jButtonCerrarOrderByModeloProducto, this.gridBagConstraintsModeloProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalModeloProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByModeloProducto= new JScrollPane(jPanelOrderByModeloProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsModeloProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByModeloProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByModeloProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalModeloProducto);
			
			this.jInternalFrameOrderByModeloProducto.getContentPane().add(this.jScrollPanelOrderByModeloProducto, this.gridBagConstraintsModeloProducto);			
		
		} else {
			this.jButtonAbrirOrderByModeloProducto = new JButtonMe();
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
			&& this.modeloproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosModeloProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosModeloProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosModeloProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosModeloProducto.getRowHeight();//ModeloProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ModeloProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModeloProducto.isSelected()) {
					iHeightTable=ModeloProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModeloProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModeloProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ModeloProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModeloProducto.isSelected()) {
					iHeightTable=ModeloProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModeloProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModeloProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosModeloProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModeloProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModeloProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosModeloProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModeloProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModeloProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByModeloProducto!=null && this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByModeloProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByModeloProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByModeloProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosModeloProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModeloProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModeloProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=modeloproductoLogic.getModeloProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modeloproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ModeloProducto> TraerModeloProductoBeans(List<ModeloProducto> modeloproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ModeloProducto modeloproducto:modeloproductos) {
					
				if(!(ModeloProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ModeloProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					modeloproducto.setsDetalleGeneralEntityReporte(ModeloProductoConstantesFunciones.getModeloProductoDescripcion(modeloproducto));
										
						
					
					

					if(modeloproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{modeloproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(modeloproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(modeloproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{modeloproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(modeloproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//modeloproducto.setsDetalleGeneralEntityReporte(modeloproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//modeloproductobeans.add(modeloproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return modeloproductos;
    }
	//PARA REPORTES FIN
}
